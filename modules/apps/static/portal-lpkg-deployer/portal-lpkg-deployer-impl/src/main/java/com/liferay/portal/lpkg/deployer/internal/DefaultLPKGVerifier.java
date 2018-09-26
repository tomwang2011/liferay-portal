/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.lpkg.deployer.internal;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.lpkg.deployer.LPKGVerifier;
import com.liferay.portal.lpkg.deployer.LPKGVerifyException;

import java.io.File;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.Version;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.tracker.BundleTracker;

/**
 * @author Shuyang Zhou
 */
@Component(immediate = true, service = LPKGVerifier.class)
public class DefaultLPKGVerifier implements LPKGVerifier {

	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleTracker = new BundleTracker<String>(
			bundleContext, ~Bundle.UNINSTALLED, null) {

			@Override
			public String addingBundle(Bundle bundle, BundleEvent event) {
				String symbolicName = bundle.getSymbolicName();

				List<Bundle> bundles = _bundles.computeIfAbsent(
					symbolicName, key -> new ArrayList<>());

				bundles.add(bundle);

				return symbolicName;
			}

			@Override
			public void removedBundle(
				Bundle bundle, BundleEvent event, String symbolicName) {

				List<Bundle> bundles = _bundles.get(symbolicName);

				bundles.remove(bundle);
			}

		};

		_bundleTracker.open();
	}

	@Deactivate
	public void deactivate() {
		_bundleTracker.close();

		_bundles.clear();
	}

	@Override
	public List<Bundle> verify(File lpkgFile) {
		try (ZipFile zipFile = new ZipFile(lpkgFile)) {
			ZipEntry zipEntry = zipFile.getEntry(
				"liferay-marketplace.properties");

			if (zipEntry == null) {
				throw new LPKGVerifyException(
					lpkgFile + " does not have liferay-marketplace.properties");
			}

			Properties properties = new Properties();

			try (InputStream inputStream = zipFile.getInputStream(zipEntry)) {
				properties.load(inputStream);
			}

			String symbolicName = lpkgFile.getName();

			symbolicName = symbolicName.substring(0, symbolicName.length() - 5);

			if (Validator.isNull(symbolicName)) {
				throw new LPKGVerifyException(
					lpkgFile + " does not have a valid symbolic name");
			}

			Version version = null;

			String versionString = properties.getProperty("version");

			try {
				version = new Version(versionString);
			}
			catch (IllegalArgumentException iae) {
				throw new LPKGVerifyException(
					lpkgFile + " does not have a valid version: " +
						versionString,
					iae);
			}

			if (LPKGIndexValidatorThreadLocal.isEnabled()) {
				_lpkgIndexValidator.validate(
					Collections.singletonList(lpkgFile));
			}

			List<Bundle> oldBundles = new ArrayList<>();

			for (Bundle bundle :
					_bundles.computeIfAbsent(
						symbolicName, key -> new ArrayList<>())) {

				if (!symbolicName.equals(bundle.getSymbolicName())) {
					continue;
				}

				int value = version.compareTo(bundle.getVersion());

				if (value != 0) {
					oldBundles.add(bundle);
				}
				else {
					String path = lpkgFile.getCanonicalPath();

					if (path.equals(bundle.getLocation())) {
						continue;
					}

					throw new LPKGVerifyException(
						StringBundler.concat(
							"Existing LPKG bundle ", String.valueOf(bundle),
							" has the same symbolic name and version as LPKG ",
							"file ", String.valueOf(lpkgFile)));
				}
			}

			return oldBundles;
		}
		catch (Exception e) {
			throw new LPKGVerifyException(e);
		}
	}

	private final Map<String, List<Bundle>> _bundles =
		new ConcurrentHashMap<>();
	private BundleTracker<String> _bundleTracker;

	@Reference
	private LPKGIndexValidator _lpkgIndexValidator;

}