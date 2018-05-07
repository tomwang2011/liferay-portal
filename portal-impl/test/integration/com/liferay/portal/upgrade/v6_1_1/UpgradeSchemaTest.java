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

package com.liferay.portal.upgrade.v6_1_1;

import com.liferay.portal.test.rule.UpgradeTestRule;
import com.liferay.portal.upgrade.UpgradeTestUtil;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author Tom Wang
 */
public class UpgradeSchemaTest {

	@ClassRule
	@Rule
	public static final UpgradeTestRule UPGRADE_TEST_RULE =
		new UpgradeTestRule();

	@BeforeClass
	public static void setUpClass() throws Exception {
		UpgradeTestUtil.populateDB(UpgradeSchemaTest.class);
	}

	@Test
	public void testUpgradeSchema() throws Exception {
		Assert.assertFalse(UpgradeTestUtil.hasColumn("DLFileVersion", "uuid_"));
		Assert.assertFalse(UpgradeTestUtil.hasColumn("DLSync", "description"));
		Assert.assertFalse(
			UpgradeTestUtil.hasColumn("LayoutSetBranch", "logo"));

		UpgradeSchema upgradeSchema = new UpgradeSchema();

		upgradeSchema.upgrade();

		Assert.assertTrue(UpgradeTestUtil.hasColumn("DLFileVersion", "uuid_"));
		Assert.assertTrue(UpgradeTestUtil.hasColumn("DLSync", "description"));
		Assert.assertTrue(UpgradeTestUtil.hasColumn("LayoutSetBranch", "logo"));
	}

}