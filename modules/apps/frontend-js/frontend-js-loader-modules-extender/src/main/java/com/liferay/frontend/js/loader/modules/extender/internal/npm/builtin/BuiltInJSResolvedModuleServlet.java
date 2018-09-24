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

package com.liferay.frontend.js.loader.modules.extender.internal.npm.builtin;

import com.liferay.frontend.js.loader.modules.extender.npm.JSPackage;
import com.liferay.frontend.js.loader.modules.extender.npm.ModuleNameUtil;
import com.liferay.frontend.js.loader.modules.extender.npm.NPMRegistry;
import com.liferay.portal.kernel.util.MimeTypes;

import java.net.URL;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.Servlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Iván Zaera
 */
@Component(
	immediate = true,
	property = {
		"osgi.http.whiteboard.servlet.name=Serve Package Servlet",
		"osgi.http.whiteboard.servlet.pattern=/js/resolved-module/*",
		"service.ranking:Integer=" + (Integer.MAX_VALUE - 1000)
	},
	service = Servlet.class
)
public class BuiltInJSResolvedModuleServlet extends BaseBuiltInJSModuleServlet {

	@Override
	protected MimeTypes getMimeTypes() {
		return _mimeTypes;
	}

	@Override
	protected URL getURL(String pathInfo) {
		String identifier = pathInfo.substring(1);

		String packageName = ModuleNameUtil.getPackageName(identifier);

		JSPackage jsPackage = _getJSPackage(packageName);

		if (jsPackage == null) {
			return null;
		}

		String packagePath = ModuleNameUtil.getPackagePath(identifier);

		return jsPackage.getResourceURL(packagePath);
	}

	private JSPackage _getJSPackage(String packageName) {
		String jsPackageId = _jsPackageIdsCache.get(packageName);

		if (jsPackageId != null) {
			JSPackage jsPackage = _npmRegistry.getJSPackage(jsPackageId);

			if (jsPackage != null) {
				return jsPackage;
			}

			_jsPackageIdsCache.remove(packageName);
		}

		Collection<JSPackage> jsPackages = _npmRegistry.getResolvedJSPackages();

		for (JSPackage jsPackage : jsPackages) {
			if (packageName.equals(jsPackage.getResolvedId())) {
				_jsPackageIdsCache.put(packageName, jsPackage.getId());

				return jsPackage;
			}
		}

		return null;
	}

	private static final long serialVersionUID = 2647715401054034600L;

	private LinkedHashMap<String, String> _jsPackageIdsCache =
		new LinkedHashMap<String, String>() {

			@Override
			protected boolean removeEldestEntry(Map.Entry eldest) {
				Collection<JSPackage> jsPackages =
					_npmRegistry.getResolvedJSPackages();

				if (size() > jsPackages.size()) {
					return true;
				}

				return false;
			}

		};

	@Reference
	private MimeTypes _mimeTypes;

	@Reference
	private NPMRegistry _npmRegistry;

}