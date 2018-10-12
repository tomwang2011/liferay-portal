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

package com.liferay.portal.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;
import com.liferay.portal.kernel.model.UserGroupGroupRole;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserGroupGroupRoleModelAccessors {
	public static class UserGroupIdAccessor extends ModelPropertyAccessor {
		public UserGroupIdAccessor() {
			super(new Function<UserGroupGroupRole, Long>() {
					@Override
					public Long apply(UserGroupGroupRole userGroupGroupRole) {
						return userGroupGroupRole.getUserGroupId();
					}
				},
				new BiConsumer<UserGroupGroupRole, Long>() {
					@Override
					public void accept(UserGroupGroupRole userGroupGroupRole,
						Long userGroupId) {
						userGroupGroupRole.setUserGroupId(userGroupId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<UserGroupGroupRole, Long>() {
					@Override
					public Long apply(UserGroupGroupRole userGroupGroupRole) {
						return userGroupGroupRole.getGroupId();
					}
				},
				new BiConsumer<UserGroupGroupRole, Long>() {
					@Override
					public void accept(UserGroupGroupRole userGroupGroupRole,
						Long groupId) {
						userGroupGroupRole.setGroupId(groupId);
					}
				});
		}
	}

	public static class RoleIdAccessor extends ModelPropertyAccessor {
		public RoleIdAccessor() {
			super(new Function<UserGroupGroupRole, Long>() {
					@Override
					public Long apply(UserGroupGroupRole userGroupGroupRole) {
						return userGroupGroupRole.getRoleId();
					}
				},
				new BiConsumer<UserGroupGroupRole, Long>() {
					@Override
					public void accept(UserGroupGroupRole userGroupGroupRole,
						Long roleId) {
						userGroupGroupRole.setRoleId(roleId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<UserGroupGroupRole, Long>() {
					@Override
					public Long apply(UserGroupGroupRole userGroupGroupRole) {
						return userGroupGroupRole.getCompanyId();
					}
				},
				new BiConsumer<UserGroupGroupRole, Long>() {
					@Override
					public void accept(UserGroupGroupRole userGroupGroupRole,
						Long companyId) {
						userGroupGroupRole.setCompanyId(companyId);
					}
				});
		}
	}

	private UserGroupGroupRoleModelAccessors() {
	}
}