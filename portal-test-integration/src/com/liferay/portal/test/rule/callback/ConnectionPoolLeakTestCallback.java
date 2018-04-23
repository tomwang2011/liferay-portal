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

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.jdbc.pool.metrics.ConnectionPoolMetrics;
import com.liferay.portal.kernel.test.rule.callback.BaseTestCallback;
import com.liferay.registry.Registry;
import com.liferay.registry.RegistryUtil;
import com.liferay.registry.ServiceReference;

import javax.sql.DataSource;
import org.junit.runner.Description;
import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;

/**
 * @author Shuyang Zhou
 */
public class ConnectionPoolLeakTestCallback
	extends BaseTestCallback<Void, Void> {

	public static final ConnectionPoolLeakTestCallback INSTANCE =
		new ConnectionPoolLeakTestCallback();

	@Override
	public Void beforeClass(Description description) {
		LazyConnectionDataSourceProxy lazyConnectionDataSourceProxy = (LazyConnectionDataSourceProxy) PortalBeanLocatorUtil.locate("liferayDataSource");

		DataSource liferayDataSource = lazyConnectionDataSourceProxy.getTargetDataSource();

		Registry registry = RegistryUtil.getRegistry();

		ServiceReference<ConnectionPoolMetrics> connectionPoolMetricsServiceReference = registry.getServiceReference(ConnectionPoolMetrics.class);

		DataSource counterDataSource = (DataSource) PortalBeanLocatorUtil.locate("counterDataSourceImpl");

		return null;
	}

	private int _initialConnectionCount;

}