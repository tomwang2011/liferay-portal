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

package com.liferay.wiki.uad.test;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.test.util.ServiceContextTestUtil;
import com.liferay.portal.kernel.test.util.TestPropsValues;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.wiki.model.WikiNode;
import com.liferay.wiki.model.WikiPage;
import com.liferay.wiki.service.WikiNodeLocalService;
import com.liferay.wiki.service.WikiPageLocalService;

import java.io.Serializable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author William Newbury
 */
public class WikiPageUADTestHelper {

	public static WikiPage addWikiPage(
			WikiNodeLocalService wikiNodeLocalService,
			WikiPageLocalService wikiPageLocalService, long userId)
		throws Exception {

		ServiceContext serviceContext =
			ServiceContextTestUtil.getServiceContext(
				TestPropsValues.getGroupId());

		WikiNode wikiNode = wikiNodeLocalService.addNode(
			userId, RandomTestUtil.randomString(),
			RandomTestUtil.randomString(), serviceContext);

		return wikiPageLocalService.addPage(
			userId, wikiNode.getNodeId(), RandomTestUtil.randomString(),
			RandomTestUtil.randomString(), RandomTestUtil.randomString(), false,
			serviceContext);
	}

	public static WikiPage addWikiPageWithStatusByUserId(
			WikiNodeLocalService wikiNodeLocalService,
			WikiPageLocalService wikiPageLocalService, long userId,
			long statusByUserId)
		throws Exception {

		WikiPage wikiPage = addWikiPage(
			wikiNodeLocalService, wikiPageLocalService, userId);

		ServiceContext serviceContext =
			ServiceContextTestUtil.getServiceContext(
				TestPropsValues.getGroupId());

		Map<String, Serializable> workflowContext = new HashMap<>();

		workflowContext.put(WorkflowConstants.CONTEXT_URL, "http://localhost");

		wikiPageLocalService.updateStatus(
			statusByUserId, wikiPage, WorkflowConstants.STATUS_APPROVED,
			serviceContext, workflowContext);

		return wikiPage;
	}

	public static void cleanUpDependencies(
			WikiNodeLocalService wikiNodeLocalService, List<WikiPage> wikiPages)
		throws Exception {

		for (WikiPage wikiPage : wikiPages) {
			wikiNodeLocalService.deleteNode(wikiPage.getNodeId());
		}
	}

}