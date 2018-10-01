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

package com.liferay.document.library.uad.anonymizer.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.service.DLFolderLocalService;
import com.liferay.document.library.uad.test.DLFolderUADTestUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.DeleteAfterTestRun;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.user.associated.data.anonymizer.UADAnonymizer;
import com.liferay.user.associated.data.test.util.BaseUADAnonymizerTestCase;
import com.liferay.user.associated.data.test.util.WhenHasStatusByUserIdField;

import java.util.ArrayList;
import java.util.List;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Brian Wing Shun Chan
 */
@RunWith(Arquillian.class)
public class DLFolderUADAnonymizerTest
	extends BaseUADAnonymizerTestCase<DLFolder>
	implements WhenHasStatusByUserIdField {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new LiferayIntegrationTestRule();

	@Override
	public DLFolder addBaseModelWithStatusByUserId(
			long userId, long statusByUserId)
		throws Exception {

		DLFolder dlFolder = DLFolderUADTestUtil.addDLFolderWithStatusByUserId(
			_dlFolderLocalService, userId, statusByUserId);

		_dlFolders.add(dlFolder);

		return dlFolder;
	}

	@Test
	public void testDeleteDependentFolders() throws Exception {
		DLFolder parentDLFolder = DLFolderUADTestUtil.addDLFolder(
			_dlFolderLocalService, user.getUserId());

		_dlFolders.add(parentDLFolder);

		DLFolder childDLFolder = DLFolderUADTestUtil.addDLFolder(
			_dlFolderLocalService, user.getUserId(),
			parentDLFolder.getFolderId());

		_dlFolders.add(childDLFolder);

		_uadAnonymizer.delete(parentDLFolder);

		_uadAnonymizer.delete(childDLFolder);
	}

	@Override
	protected DLFolder addBaseModel(long userId) throws Exception {
		return addBaseModel(userId, true);
	}

	@Override
	protected DLFolder addBaseModel(long userId, boolean deleteAfterTestRun)
		throws Exception {

		DLFolder dlFolder = DLFolderUADTestUtil.addDLFolder(
			_dlFolderLocalService, userId);

		if (deleteAfterTestRun) {
			_dlFolders.add(dlFolder);
		}

		return dlFolder;
	}

	@Override
	protected UADAnonymizer getUADAnonymizer() {
		return _uadAnonymizer;
	}

	@Override
	protected boolean isBaseModelAutoAnonymized(long baseModelPK, User user)
		throws Exception {

		DLFolder dlFolder = _dlFolderLocalService.getDLFolder(baseModelPK);

		String userName = dlFolder.getUserName();
		String statusByUserName = dlFolder.getStatusByUserName();

		if ((dlFolder.getUserId() != user.getUserId()) &&
			!userName.equals(user.getFullName()) &&
			(dlFolder.getStatusByUserId() != user.getUserId()) &&
			!statusByUserName.equals(user.getFullName())) {

			return true;
		}

		return false;
	}

	@Override
	protected boolean isBaseModelDeleted(long baseModelPK) {
		if (_dlFolderLocalService.fetchDLFolder(baseModelPK) == null) {
			return true;
		}

		return false;
	}

	@Inject
	private DLFolderLocalService _dlFolderLocalService;

	@DeleteAfterTestRun
	private final List<DLFolder> _dlFolders = new ArrayList<>();

	@Inject(filter = "component.name=*.DLFolderUADAnonymizer")
	private UADAnonymizer _uadAnonymizer;

}