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

package com.liferay.portal.test.rule;

import com.liferay.petra.log4j.Log4JUtil;
import com.liferay.portal.kernel.process.ClassPathUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.BaseTestRule;
import com.liferay.portal.kernel.test.rule.TimeoutTestRule;
import com.liferay.portal.kernel.test.rule.callback.DeleteAfterTestRunTestCallback;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.SystemProperties;
import com.liferay.portal.spring.hibernate.DialectDetector;
import com.liferay.portal.test.rule.callback.ClearThreadLocalTestCallback;
import com.liferay.portal.test.rule.callback.InjectTestCallback;
import com.liferay.portal.test.rule.callback.LogAssertionTestCallback;
import com.liferay.portal.test.rule.callback.SybaseDumpTransactionLogTestCallback;
import com.liferay.portal.test.rule.callback.UniqueStringRandomizerBumperTestCallback;
import com.liferay.portal.test.rule.callback.UpgradeSchemaTestCallback;
import com.liferay.portal.util.InitUtil;
import com.liferay.portal.util.PortalClassPathUtil;
import com.liferay.portal.util.PropsUtil;
import org.apache.log4j.Level;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.springframework.mock.web.MockServletContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Shuyang Zhou
 */
public class LiferayUpgradeSchemaTestRule extends AggregateTestRule {

	public LiferayUpgradeSchemaTestRule() {
		super(false, _getUpgradeTestRules());
	}

	private static TestRule[] _getUpgradeTestRules() {
		List<TestRule> testRules = new ArrayList<>();

		if (System.getenv("JENKINS_HOME") != null) {
			testRules.add(TimeoutTestRule.INSTANCE);
		}

		testRules.add(LogAssertionTestRule.INSTANCE);
		testRules.add(_upgradeSpringInitializationTestRule);
		testRules.add(_sybaseDumpTransactionLogTestRule);
		testRules.add(_clearThreadLocalTestRule);
		testRules.add(_uniqueStringRandomizerBumperTestRule);
		testRules.add(_deleteAfterTestRunTestRule);
		testRules.add(_injectTestRule);
		testRules.add(_upgradeSchemaTestRule);

		return testRules.toArray(new TestRule[testRules.size()]);
	}

	private static final TestRule _clearThreadLocalTestRule =
		new BaseTestRule<>(ClearThreadLocalTestCallback.INSTANCE);
	private static final TestRule _deleteAfterTestRunTestRule =
		new BaseTestRule<>(DeleteAfterTestRunTestCallback.INSTANCE);
	private static final TestRule _injectTestRule = new BaseTestRule<>(
		InjectTestCallback.INSTANCE);
	private static final TestRule _sybaseDumpTransactionLogTestRule =
		new BaseTestRule<>(SybaseDumpTransactionLogTestCallback.INSTANCE);
	private static final TestRule _uniqueStringRandomizerBumperTestRule =
		new BaseTestRule<>(UniqueStringRandomizerBumperTestCallback.INSTANCE);
	private static final TestRule _upgradeSchemaTestRule = new BaseTestRule<>(
		UpgradeSchemaTestCallback.INSTANCE);

	private static final TestRule _upgradeSpringInitializationTestRule = new TestRule() {

		@Override
		public Statement apply(Statement statement, Description description) {
			return new BaseTestRule.StatementWrapper(statement) {

				@Override
				public void evaluate() throws Throwable {
					if (!InitUtil.isInitialized()) {
						List<String> configLocations = new ArrayList<>();

						boolean configureLog4j = false;

						if (GetterUtil.getBoolean(
							SystemProperties.get("log4j.configure.on.startup"),
							true)) {

							SystemProperties.set(
								"log4j.configure.on.startup", "false");

							configureLog4j = true;
						}

						Log4JUtil.setLevel(
							DialectDetector.class.getName(), Level.INFO.toString(),
							false);

						ClassPathUtil.initializeClassPaths(
							new MockServletContext());
						PortalClassPathUtil.initializeClassPaths(
							new MockServletContext());

						InitUtil.initWithSpring(configLocations, true, true);

						if (configureLog4j) {
							Log4JUtil.configureLog4J(
								InitUtil.class.getClassLoader());

							LogAssertionTestCallback.startAssert(
								Collections.<ExpectedLogs>emptyList());
						}

						if (System.getProperty("external-properties") ==
							null) {

							System.setProperty(
								"external-properties", "portal-test.properties");
						}
					}

					statement.evaluate();
				}

			};
		}

	};

}