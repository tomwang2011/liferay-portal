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

package com.liferay.portal.test.rule.callback;

import com.liferay.portal.kernel.test.rule.callback.BaseTestCallback;

import org.junit.runner.Description;

/**
 * @author Tom Wang
 */
public class SocketWhiteListTestCallback
	extends BaseTestCallback<Void, Void> {

	public static final SocketWhiteListTestCallback INSTANCE =
		new SocketWhiteListTestCallback();

	@Override
	public void afterMethod(Description description, Void c, Object target)
		throws Throwable {

		System.setProperty("socksProxyHost", _originalHost);
		System.setProperty("socksProxyPort", _originalPort);
	}

	@Override
	public Void beforeMethod(Description description, Object target)
		throws Exception {

		_originalHost = System.getProperty("socksProxyHost");
		_originalPort = System.getProperty("socksProxyPort");

		System.setProperty("socksProxyHost", "");
		System.setProperty("socksProxyPort", "");

		return null;
	}

	private String _originalHost;
	private String _originalPort;

}