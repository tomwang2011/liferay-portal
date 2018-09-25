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

package com.liferay.document.library.uad.exporter.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.document.library.kernel.model.DLFileEntryType;
import com.liferay.document.library.kernel.service.DLFileEntryTypeLocalService;
import com.liferay.document.library.uad.test.DLFileEntryTypeUADTestHelper;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.DeleteAfterTestRun;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.user.associated.data.exporter.UADExporter;
import com.liferay.user.associated.data.test.util.BaseUADExporterTestCase;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.runner.RunWith;

/**
 * @author Brian Wing Shun Chan
 */
@RunWith(Arquillian.class)
public class DLFileEntryTypeUADExporterTest
	extends BaseUADExporterTestCase<DLFileEntryType> {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new LiferayIntegrationTestRule();

	@After
	public void tearDown() throws Exception {
		DLFileEntryTypeUADTestHelper.cleanUpDependencies(
			_dlFileEntryTypeLocalService, _portal, _dlFileEntryTypes);
	}

	@Override
	protected DLFileEntryType addBaseModel(long userId) throws Exception {
		DLFileEntryType dlFileEntryType =
			DLFileEntryTypeUADTestHelper.addDLFileEntryType(
				_dlFileEntryTypeLocalService, _portal, userId);

		_dlFileEntryTypes.add(dlFileEntryType);

		return dlFileEntryType;
	}

	@Override
	protected String getPrimaryKeyName() {
		return "fileEntryTypeId";
	}

	@Override
	protected UADExporter getUADExporter() {
		return _uadExporter;
	}

	@Inject
	private DLFileEntryTypeLocalService _dlFileEntryTypeLocalService;

	@DeleteAfterTestRun
	private final List<DLFileEntryType> _dlFileEntryTypes = new ArrayList<>();

	@Inject
	private Portal _portal;

	@Inject(filter = "component.name=*.DLFileEntryTypeUADExporter")
	private UADExporter _uadExporter;

}