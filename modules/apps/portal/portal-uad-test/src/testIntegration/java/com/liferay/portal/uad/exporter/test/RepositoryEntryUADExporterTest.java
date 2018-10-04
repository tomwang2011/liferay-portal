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

package com.liferay.portal.uad.exporter.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.model.RepositoryEntry;
import com.liferay.portal.kernel.service.RepositoryEntryLocalService;
import com.liferay.portal.kernel.service.RepositoryLocalService;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.DeleteAfterTestRun;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.uad.test.RepositoryEntryUADTestUtil;
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
public class RepositoryEntryUADExporterTest
	extends BaseUADExporterTestCase<RepositoryEntry> {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new LiferayIntegrationTestRule();

	@After
	public void tearDown() throws Exception {
		RepositoryEntryUADTestUtil.cleanUpDependencies(
			_repositoryLocalService, _repositoryEntries);
	}

	@Override
	protected RepositoryEntry addBaseModel(long userId) throws Exception {
		RepositoryEntry repositoryEntry =
			RepositoryEntryUADTestUtil.addRepositoryEntry(
				_portal, _repositoryEntryLocalService, _repositoryLocalService,
				userId);

		_repositoryEntries.add(repositoryEntry);

		return repositoryEntry;
	}

	@Override
	protected String getPrimaryKeyName() {
		return "repositoryEntryId";
	}

	@Override
	protected UADExporter getUADExporter() {
		return _uadExporter;
	}

	@Inject
	private Portal _portal;

	@DeleteAfterTestRun
	private final List<RepositoryEntry> _repositoryEntries = new ArrayList<>();

	@Inject
	private RepositoryEntryLocalService _repositoryEntryLocalService;

	@Inject
	private RepositoryLocalService _repositoryLocalService;

	@Inject(filter = "component.name=*.RepositoryEntryUADExporter")
	private UADExporter _uadExporter;

}