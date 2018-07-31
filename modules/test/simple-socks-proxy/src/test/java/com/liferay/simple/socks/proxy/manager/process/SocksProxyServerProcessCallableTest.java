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

package com.liferay.simple.socks.proxy.manager.process;

import com.liferay.petra.process.ProcessException;
import com.liferay.petra.process.local.LocalProcessLauncher;
import com.liferay.portal.kernel.test.rule.CodeCoverageAssertor;
import com.liferay.simple.socks.proxy.manager.process.server.SocksProxyServer;
import com.liferay.simple.socks.proxy.manager.test.util.SocksProxyTestUtil;

import java.io.IOException;

import java.net.ConnectException;
import java.net.Socket;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Test;

/**
 * @author Tom Wang
 */
public class SocksProxyServerProcessCallableTest {

	@ClassRule
	public static final CodeCoverageAssertor codeCoverageAssertor =
		new CodeCoverageAssertor() {

			@Override
			public void appendAssertClasses(List<Class<?>> assertClasses) {
				assertClasses.add(SocksProxyServerCloseProcessCallable.class);
			}

		};

	@Test
	public void testExceptionDuringClose() {
		ConcurrentMap<String, Object> attributes =
			LocalProcessLauncher.ProcessContext.getAttributes();

		SocksProxyServer socksProxyServer =
			new SocksProxyServer(Collections.emptyList(), 0, 0) {

				@Override
				public void close() throws IOException {
					super.close();

					throw new IOException();
				}

			};

		attributes.put(SocksProxyServer.class.getName(), socksProxyServer);

		SocksProxyServerCloseProcessCallable
			socksProxyServerCloseProcessCallable =
				new SocksProxyServerCloseProcessCallable();

		try {
			socksProxyServerCloseProcessCallable.call();

			Assert.fail();
		}
		catch (ProcessException pe) {
			return;
		}
	}

	@Test
	public void testNullSocksProxyServer() throws ProcessException {
		SocksProxyServerCloseProcessCallable
			socksProxyServerCloseProcessCallable =
				new SocksProxyServerCloseProcessCallable();

		socksProxyServerCloseProcessCallable.call();
	}

	@Test
	public void testSocksProxyServerNormalStartAndStop() throws Exception {
		ConcurrentMap<String, Object> attributes =
			LocalProcessLauncher.ProcessContext.getAttributes();

		int port = SocksProxyTestUtil.findOpenPort(8888);

		try {
			SocksProxyServerProcessCallable socksProxyServerProcessCallable =
				new SocksProxyServerProcessCallable(
					Collections.emptyList(), 10000, port);

			socksProxyServerProcessCallable.call();

			Object object = attributes.get(SocksProxyServer.class.getName());

			Assert.assertSame(SocksProxyServer.class, object.getClass());

			int maxRetry = 5;

			while (true) {
				try (Socket socket = new Socket("localhost", port)) {
					Assert.assertTrue(socket.isConnected());

					break;
				}
				catch (ConnectException ce) {
					if (maxRetry < 0) {
						break;
					}

					maxRetry--;
				}
			}
		}
		finally {
			SocksProxyServerCloseProcessCallable
				socksProxyServerCloseProcessCallable =
					new SocksProxyServerCloseProcessCallable();

			socksProxyServerCloseProcessCallable.call();
		}

		Assert.assertNull(attributes.get(SocksProxyServer.class.getName()));
	}

}