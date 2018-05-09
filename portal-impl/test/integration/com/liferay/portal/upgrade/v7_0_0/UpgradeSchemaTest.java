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

package com.liferay.portal.upgrade.v7_0_0;

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
		_preUpgradeAssert();

		UpgradeSchema upgradeSchema = new UpgradeSchema();

		upgradeSchema.upgrade();

		_postUpgradeAssert();
	}

	private void _postUpgradeAssert() throws Exception {
		Assert.assertTrue(UpgradeTestUtil.hasColumn("BlogsEntry", "subtitle"));
		Assert.assertFalse(UpgradeTestUtil.hasTable("CyrusUser"));
		Assert.assertTrue(UpgradeTestUtil.hasTable("RecentLayoutSetBranch"));

		Assert.assertTrue(UpgradeTestUtil.hasColumn("AssetEntry", "listable"));
		Assert.assertFalse(UpgradeTestUtil.hasTable("AssetTagProperty"));

		Assert.assertTrue(UpgradeTestUtil.hasColumn("Group_", "groupKey"));

		Assert.assertFalse(UpgradeTestUtil.hasColumn("LayoutSet", "logo"));

		Assert.assertFalse(
			UpgradeTestUtil.hasColumn("LayoutSetBranch", "logo"));
	}

	private void _preUpgradeAssert() throws Exception {
		Assert.assertFalse(UpgradeTestUtil.hasColumn("BlogsEntry", "subtitle"));
		Assert.assertTrue(UpgradeTestUtil.hasTable("CyrusUser"));
		Assert.assertFalse(UpgradeTestUtil.hasTable("RecentLayoutSetBranch"));

		Assert.assertFalse(UpgradeTestUtil.hasColumn("AssetEntry", "listable"));
		Assert.assertTrue(UpgradeTestUtil.hasTable("AssetTagProperty"));

		Assert.assertFalse(UpgradeTestUtil.hasColumn("Group_", "groupKey"));

		Assert.assertTrue(UpgradeTestUtil.hasColumn("LayoutSet", "logo"));

		Assert.assertTrue(UpgradeTestUtil.hasColumn("LayoutSetBranch", "logo"));
	}

}