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

package com.liferay.frontend.js.loader.modules.extender.npm.builtin;

import com.liferay.frontend.js.loader.modules.extender.npm.JSPackage;
import com.liferay.frontend.js.loader.modules.extender.npm.model.JSModuleAdapter;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;

import java.util.Collection;

/**
 * Provides an incomplete implementation of {@link JSModule} that lets its
 * contents be retrieved with an HTTP request to the portal.
 *
 * <p>
 * This class assumes that the {@link BuiltInJSModuleServlet} and {@link
 * BuiltInJSResolvedModuleServlet} are installed and running in the portal.
 * These servlets are responsible for exporting the contents returned by the
 * {@link JSModule#getInputStream()} method implemented by subclasses inheriting
 * from this class.
 * </p>
 *
 * @author Iván Zaera
 */
public abstract class BuiltInJSModule extends JSModuleAdapter {

	/**
	 * Constructs a <code>BuiltInJSModule</code> with the module's JS package,
	 * name, and dependencies.
	 *
	 * @param jsPackage the package containing the module
	 * @param name the module's name
	 * @param dependencies the module's dependencies
	 */
	public BuiltInJSModule(
		JSPackage jsPackage, String name, Collection<String> dependencies) {

		this(new BootstrapFactory(jsPackage, name), dependencies);
	}

	private BuiltInJSModule(
		BootstrapFactory bootstrapFactory, Collection<String> dependencies) {

		super(
			bootstrapFactory._jsPackage, bootstrapFactory._name,
			bootstrapFactory._url, bootstrapFactory._resolvedURL,
			bootstrapFactory._resolvedId, dependencies);
	}

	private static class BootstrapFactory {

		private BootstrapFactory(JSPackage jsPackage, String name) {
			_jsPackage = jsPackage;
			_name = name;

			StringBundler sb = new StringBundler(5);

			sb.append("/o/js/module/");
			sb.append(jsPackage.getId());
			sb.append(StringPool.SLASH);
			sb.append(name);

			_url = sb.toString();

			sb.setIndex(0);

			sb.append(jsPackage.getName());
			sb.append(StringPool.AT);
			sb.append(jsPackage.getVersion());
			sb.append(StringPool.SLASH);
			sb.append(name);

			_resolvedId = sb.toString();

			sb.setIndex(0);

			sb.append("/o/js/resolved-module/");
			sb.append(_resolvedId);

			_resolvedURL = sb.toString();
		}

		private final JSPackage _jsPackage;
		private final String _name;
		private final String _url;
		private final String _resolvedURL;
		private final String _resolvedId;

	}

}