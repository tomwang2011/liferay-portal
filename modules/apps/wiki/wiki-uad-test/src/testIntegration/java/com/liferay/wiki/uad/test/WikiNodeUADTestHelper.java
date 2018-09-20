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
import com.liferay.wiki.service.WikiNodeLocalService;

/**
 * @author William Newbury
 */
public class WikiNodeUADTestHelper {

	public static WikiNode addWikiNode(
			WikiNodeLocalService wikiNodeLocalService, long userId)
		throws Exception {

		ServiceContext serviceContext =
			ServiceContextTestUtil.getServiceContext(
				TestPropsValues.getGroupId());

		return wikiNodeLocalService.addNode(
			userId, RandomTestUtil.randomString(),
			RandomTestUtil.randomString(), serviceContext);
	}

	public static WikiNode addWikiNodeWithStatusByUserId(
			WikiNodeLocalService wikiNodeLocalService, long userId,
			long statusByUserId)
		throws Exception {

		WikiNode wikiNode = addWikiNode(wikiNodeLocalService, userId);

		ServiceContext serviceContext =
			ServiceContextTestUtil.getServiceContext(
				TestPropsValues.getGroupId());

		wikiNodeLocalService.updateStatus(
			statusByUserId, wikiNode, WorkflowConstants.STATUS_APPROVED,
			serviceContext);

		return wikiNode;
	}

}