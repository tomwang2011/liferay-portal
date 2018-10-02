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

package com.liferay.portal.service.user;

import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.DeleteAfterTestRun;
import com.liferay.portal.kernel.test.util.OrganizationTestUtil;
import com.liferay.portal.kernel.test.util.UserTestUtil;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;

import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author Brian Wing Shun Chan
 * @author José Manuel Navarro
 * @author Drew Brokke
 */
public class UserServiceOrganizationOwnerUnsetsUsersForNonSiteOrganizationTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new LiferayIntegrationTestRule();

	@Before
	public void setUp() throws Exception {
		_organization = OrganizationTestUtil.addOrganization();

		_organizationOwnerUser = UserTestUtil.addOrganizationOwnerUser(
			_organization);
	}

	@Test
	public void shouldUnsetOrganizationAdmin() throws Exception {
		User organizationAdminUser = UserTestUtil.addOrganizationAdminUser(
			_organization);

		try {
			UserServiceTestUtil.unsetOrganizationUsers(
				_organization.getOrganizationId(), _organizationOwnerUser,
				organizationAdminUser);

			Assert.assertFalse(
				UserLocalServiceUtil.hasOrganizationUser(
					_organization.getOrganizationId(),
					organizationAdminUser.getUserId()));
		}
		finally {
			UserLocalServiceUtil.deleteUser(organizationAdminUser);
		}
	}

	@Test
	public void shouldUnsetOrganizationOwner() throws Exception {
		User otherOrganizationOwnerUser = UserTestUtil.addOrganizationOwnerUser(
			_organization);

		try {
			UserServiceTestUtil.unsetOrganizationUsers(
				_organization.getOrganizationId(), _organizationOwnerUser,
				otherOrganizationOwnerUser);

			Assert.assertFalse(
				UserLocalServiceUtil.hasOrganizationUser(
					_organization.getOrganizationId(),
					otherOrganizationOwnerUser.getUserId()));
		}
		finally {
			UserLocalServiceUtil.deleteUser(otherOrganizationOwnerUser);
		}
	}

	@DeleteAfterTestRun
	private Organization _organization;

	@DeleteAfterTestRun
	private User _organizationOwnerUser;

}