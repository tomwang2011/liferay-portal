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

import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.BaseTestRule;
import com.liferay.portal.kernel.test.rule.TimeoutTestRule;
import com.liferay.portal.kernel.test.rule.callback.DeleteAfterTestRunTestCallback;
import com.liferay.portal.test.rule.callback.ClearThreadLocalTestCallback;
import com.liferay.portal.test.rule.callback.InjectTestCallback;
import com.liferay.portal.test.rule.callback.SybaseDumpTransactionLogTestCallback;
import com.liferay.portal.test.rule.callback.UniqueStringRandomizerBumperTestCallback;
import com.liferay.portal.test.rule.callback.UpgradeSchemaTestCallback;

import java.util.ArrayList;
import java.util.List;

import org.junit.rules.TestRule;

/**
 * @author Shuyang Zhou
 */
public class UpgradeTestRule extends AggregateTestRule {

	public UpgradeTestRule() {
		super(false, _getUpgradeTestRules());
	}

	private static TestRule[] _getUpgradeTestRules() {
		List<TestRule> testRules = new ArrayList<>();

		if (System.getenv("JENKINS_HOME") != null) {
			testRules.add(TimeoutTestRule.INSTANCE);
		}

		testRules.add(LogAssertionTestRule.INSTANCE);
		testRules.add(new SpringInitializationTestRule());
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

}