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

package com.liferay.portal.spring.extender.internal.context;

import com.liferay.osgi.felix.util.AbstractExtender;
import com.liferay.petra.string.CharPool;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.io.unsync.UnsyncBufferedReader;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Release;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.service.configuration.configurator.ServiceConfigurator;
import com.liferay.portal.kernel.util.InfrastructureUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.xml.SAXReaderUtil;
import com.liferay.portal.spring.extender.internal.classloader.BundleResolverClassLoader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import java.net.URL;

import java.util.Dictionary;

import javax.sql.DataSource;

import org.apache.felix.dm.DependencyManager;
import org.apache.felix.dm.ServiceDependency;
import org.apache.felix.utils.extender.Extension;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import org.springframework.context.ApplicationContext;

/**
 * @author Miguel Pastor
 */
@Component(immediate = true, service = {})
public class ModuleApplicationContextExtender extends AbstractExtender {

	@Activate
	protected void activate(BundleContext bundleContext) throws Exception {
		start(bundleContext);
	}

	@Deactivate
	protected void deactivate(BundleContext bundleContext) throws Exception {
		stop(bundleContext);
	}

	@Override
	protected void debug(Bundle bundle, String s) {
		if (_log.isDebugEnabled()) {
			_log.debug(s);
		}
	}

	@Override
	protected Extension doCreateExtension(Bundle bundle) throws Exception {
		Dictionary<String, String> headers = bundle.getHeaders(
			StringPool.BLANK);

		if (headers.get("Liferay-Spring-Context") == null) {
			return null;
		}

		return new ModuleApplicationContextExtension(bundle);
	}

	@Override
	protected void error(String s, Throwable throwable) {
		_log.error(s, throwable);
	}

	@Reference(
		target = "(&(bean.id=liferayDataSource)(original.bean=true))",
		unbind = "-"
	)
	protected void setDataSource(DataSource dataSource) {
	}

	@Reference(target = "(original.bean=true)", unbind = "-")
	protected void setInfrastructureUtil(
		InfrastructureUtil infrastructureUtil) {
	}

	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-")
	protected void setModuleServiceLifecycle(
		ModuleServiceLifecycle moduleServiceLifecycle) {
	}

	@Reference(target = "(original.bean=true)", unbind = "-")
	protected void setSaxReaderUtil(SAXReaderUtil saxReaderUtil) {
	}

	@Reference(target = "(original.bean=true)", unbind = "-")
	protected void setServiceConfigurator(
		ServiceConfigurator serviceConfigurator) {

		_serviceConfigurator = serviceConfigurator;
	}

	@Override
	protected void warn(Bundle bundle, String s, Throwable throwable) {
		if (_log.isWarnEnabled()) {
			_log.warn(s, throwable);
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		ModuleApplicationContextExtender.class);

	private ServiceConfigurator _serviceConfigurator;

	private class ModuleApplicationContextExtension implements Extension {

		public ModuleApplicationContextExtension(Bundle bundle) {
			_bundle = bundle;

			_dependencyManager = new DependencyManager(
				bundle.getBundleContext());
		}

		@Override
		public void destroy() throws Exception {
			if (_component != null) {
				_dependencyManager.remove(_component);
			}
		}

		@Override
		public void start() throws Exception {
			_component = _dependencyManager.createComponent();

			BundleContext bundleContext =
				ModuleApplicationContextExtender.this.getBundleContext();

			Bundle bundle = bundleContext.getBundle();

			_component.setImplementation(
				new ModuleApplicationContextRegistrator(
					_bundle, bundle, _serviceConfigurator));

			ClassLoader classLoader = new BundleResolverClassLoader(
				_bundle, bundle);

			_processServiceReferences(classLoader);

			Dictionary<String, String> headers = _bundle.getHeaders(
				StringPool.BLANK);

			String liferayService = headers.get("Liferay-Service");

			if (liferayService != null) {
				ServiceDependency serviceDependency =
					_dependencyManager.createServiceDependency();

				serviceDependency.setRequired(true);

				serviceDependency.setService(
					ApplicationContext.class,
					StringBundler.concat(
						"(org.springframework.parent.context.service.name=",
						_bundle.getSymbolicName(), ")"));

				_component.add(serviceDependency);
			}

			String requireSchemaVersion = headers.get(
				"Liferay-Require-SchemaVersion");

			if (Validator.isNull(requireSchemaVersion)) {
				_generateReleaseInfo();
			}

			_dependencyManager.add(_component);
		}

		private void _generateReleaseInfo() {
			ServiceDependency serviceDependency =
				_dependencyManager.createServiceDependency();

			serviceDependency.setRequired(true);

			serviceDependency.setService(
				Release.class,
				StringBundler.concat(
					"(&(release.bundle.symbolic.name=",
					_bundle.getSymbolicName(), ")(release.schema.version=",
					_bundle.getVersion(), "))"));

			_component.add(serviceDependency);
		}

		private void _processServiceReferences(ClassLoader classLoader)
			throws Exception {

			URL url = _bundle.getEntry("OSGI-INF/context/context.dependencies");

			if (url == null) {
				return;
			}

			try (InputStream inputStream = url.openStream();
				Reader reader = new InputStreamReader(inputStream);
				UnsyncBufferedReader unsyncBufferedReader =
					new UnsyncBufferedReader(reader)) {

				String line = null;

				while ((line = unsyncBufferedReader.readLine()) != null) {
					line = line.trim();

					int index = line.indexOf(CharPool.SPACE);

					String serviceClassName = line;

					String filterString = null;

					if (index != -1) {
						serviceClassName = line.substring(0, index);
						filterString = line.substring(index + 1);
					}

					ServiceDependency serviceDependency =
						_dependencyManager.createServiceDependency();

					serviceDependency.setRequired(true);

					Class<?> serviceClass = Class.forName(
						serviceClassName, false, classLoader);

					serviceDependency.setService(serviceClass, filterString);

					_component.add(serviceDependency);
				}
			}
		}

		private final Bundle _bundle;
		private org.apache.felix.dm.Component _component;
		private final DependencyManager _dependencyManager;

	}

}