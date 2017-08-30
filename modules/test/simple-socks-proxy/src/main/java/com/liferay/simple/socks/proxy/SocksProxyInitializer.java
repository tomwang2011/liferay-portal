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

package com.liferay.simple.socks.proxy;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.process.ClassPathUtil;
import com.liferay.portal.kernel.process.ProcessChannel;
import com.liferay.portal.kernel.process.ProcessConfig;
import com.liferay.portal.kernel.process.ProcessConfig.Builder;
import com.liferay.portal.kernel.process.ProcessException;
import com.liferay.portal.kernel.process.local.LocalProcessExecutor;
import com.liferay.simple.socks.proxy.callables.SocksProxyServerCloseProcessCallable;
import com.liferay.simple.socks.proxy.callables.SocksProxyServerProcessCallable;

import java.io.Serializable;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author Tom Wang
 */
public class SocksProxyInitializer {

	public SocksProxyInitializer(
		LocalProcessExecutor localProcessExecutor,
		List<String> allowedIPAddress, long shutdownWaitTime,
		int serverSocketPort) {

		_localProcessExecutor = localProcessExecutor;
		_allowedIPAddress = allowedIPAddress;
		_shutdownWaitTime = shutdownWaitTime;
		_serverSocketPort = serverSocketPort;
	}

	public void start() throws ProcessException {
		_processChannel = _localProcessExecutor.execute(
			_processConfig,
			new SocksProxyServerProcessCallable(
				_allowedIPAddress, _shutdownWaitTime, _serverSocketPort));
	}

	public void stop() throws ExecutionException, InterruptedException {
		Future<Serializable> future = _processChannel.write(
			new SocksProxyServerCloseProcessCallable());

		future.get();
	}

	private static final ProcessConfig _processConfig;

	static {
		Builder builder = new Builder();

		builder.setBootstrapClassPath(
			ClassPathUtil.buildClassPath(
				SocksProxyInitializer.class, PortalException.class));

		_processConfig = builder.build();
	}

	private final List<String> _allowedIPAddress;
	private final LocalProcessExecutor _localProcessExecutor;
	private ProcessChannel<Serializable> _processChannel;
	private final int _serverSocketPort;
	private final long _shutdownWaitTime;

}