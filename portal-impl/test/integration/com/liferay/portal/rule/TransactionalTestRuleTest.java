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

package com.liferay.portal.rule;


import com.liferay.portal.kernel.dao.jdbc.DataAccess;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import java.sql.Connection;
import java.sql.SQLException;

import junit.framework.AssertionFailedError;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author Tom Wang
 */
public class TransactionalTestRuleTest {
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), TransactionalTestRule.INSTANCE);

	@Before
	public void setUp() throws SQLException {
		_connection = DataAccess.getConnection();
	}

	@After
	public void tearDown() throws SQLException {
		_connection.close();
	}

	@Test
	public void testWithoutAnnotation() throws SQLException {
		try {
			Connection connection = DataAccess.getConnection();
		}
		catch (Error e) {
			Assert.assertEquals(AssertionFailedError.class, e.getClass());
		}
	}

	@Test
	@Transactional
	public void testWithAnnotation() throws SQLException {
		Connection connection = DataAccess.getConnection();
	}

	private Connection _connection;
}
