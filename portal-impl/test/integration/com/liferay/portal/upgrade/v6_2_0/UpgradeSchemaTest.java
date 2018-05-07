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

package com.liferay.portal.upgrade.v6_2_0;

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
		Assert.assertTrue(UpgradeTestUtil.hasColumn("Address", "uuid_"));
		Assert.assertTrue(
			UpgradeTestUtil.hasColumn("BookmarksEntry", "treePath"));
		Assert.assertTrue(
			UpgradeTestUtil.hasColumn("BookmarksFolder", "treePath"));
		Assert.assertTrue(UpgradeTestUtil.hasTable("BackgroundTask"));
		Assert.assertFalse(
			UpgradeTestUtil.hasColumn("MBMessage", "attachments"));
		Assert.assertTrue(UpgradeTestUtil.hasTable("SocialActivitySet"));

		Assert.assertFalse(
			UpgradeTestUtil.hasColumn("DLFileEntry", "versionUserId"));
		Assert.assertTrue(
			UpgradeTestUtil.hasColumn("DLFileEntry", "classNameId"));
		Assert.assertTrue(UpgradeTestUtil.hasColumn("DLFileRank", "active_"));
		Assert.assertTrue(
			UpgradeTestUtil.hasColumn("DLFileShortcut", "treePath"));
		Assert.assertTrue(
			UpgradeTestUtil.hasColumn("DLFileVersion", "checksum"));
		Assert.assertTrue(UpgradeTestUtil.hasColumn("DLFolder", "hidden_"));
		Assert.assertFalse(UpgradeTestUtil.hasTable("DLSync"));
		Assert.assertTrue(UpgradeTestUtil.hasTable("DLSyncEvent"));

		Assert.assertTrue(
			UpgradeTestUtil.hasColumn("ExpandoRow", "modifiedDate"));

		Assert.assertTrue(UpgradeTestUtil.hasColumn("Group_", "uuid_"));

		Assert.assertTrue(
			UpgradeTestUtil.hasColumn("JournalArticle", "folderId"));
		Assert.assertTrue(UpgradeTestUtil.hasTable("JournalFolder"));

		Assert.assertTrue(UpgradeTestUtil.hasColumn("User_", "ldapServerId"));

		Assert.assertTrue(UpgradeTestUtil.hasColumn("WikiNode", "status"));
	}

	private void _preUpgradeAssert() throws Exception {
		Assert.assertFalse(UpgradeTestUtil.hasColumn("Address", "uuid_"));
		Assert.assertFalse(
			UpgradeTestUtil.hasColumn("BookmarksEntry", "treePath"));
		Assert.assertFalse(
			UpgradeTestUtil.hasColumn("BookmarksFolder", "treePath"));
		Assert.assertFalse(UpgradeTestUtil.hasTable("BackgroundTask"));
		Assert.assertTrue(
			UpgradeTestUtil.hasColumn("MBMessage", "attachments"));
		Assert.assertFalse(UpgradeTestUtil.hasTable("SocialActivitySet"));

		Assert.assertTrue(
			UpgradeTestUtil.hasColumn("DLFileEntry", "versionUserId"));
		Assert.assertFalse(
			UpgradeTestUtil.hasColumn("DLFileEntry", "classNameId"));
		Assert.assertFalse(UpgradeTestUtil.hasColumn("DLFileRank", "active_"));
		Assert.assertFalse(
			UpgradeTestUtil.hasColumn("DLFileShortcut", "treePath"));
		Assert.assertFalse(
			UpgradeTestUtil.hasColumn("DLFileVersion", "checksum"));
		Assert.assertFalse(UpgradeTestUtil.hasColumn("DLFolder", "hidden_"));
		Assert.assertTrue(UpgradeTestUtil.hasTable("DLSync"));
		Assert.assertFalse(UpgradeTestUtil.hasTable("DLSyncEvent"));

		Assert.assertFalse(
			UpgradeTestUtil.hasColumn("ExpandoRow", "modifiedDate"));

		Assert.assertFalse(UpgradeTestUtil.hasColumn("Group_", "uuid_"));

		Assert.assertFalse(
			UpgradeTestUtil.hasColumn("JournalArticle", "folderId"));
		Assert.assertFalse(UpgradeTestUtil.hasTable("JournalFolder"));

		Assert.assertFalse(UpgradeTestUtil.hasColumn("User_", "ldapServerId"));

		Assert.assertFalse(UpgradeTestUtil.hasColumn("WikiNode", "status"));
	}

}