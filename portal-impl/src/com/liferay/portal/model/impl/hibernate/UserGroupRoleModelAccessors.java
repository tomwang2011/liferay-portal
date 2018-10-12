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
import com.liferay.portal.kernel.model.UserGroupRole;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserGroupRoleModelAccessors {
	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<UserGroupRole, Long>() {
					@Override
					public Long apply(UserGroupRole userGroupRole) {
						return userGroupRole.getUserId();
					}
				},
				new BiConsumer<UserGroupRole, Long>() {
					@Override
					public void accept(UserGroupRole userGroupRole, Long userId) {
						userGroupRole.setUserId(userId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<UserGroupRole, Long>() {
					@Override
					public Long apply(UserGroupRole userGroupRole) {
						return userGroupRole.getGroupId();
					}
				},
				new BiConsumer<UserGroupRole, Long>() {
					@Override
					public void accept(UserGroupRole userGroupRole, Long groupId) {
						userGroupRole.setGroupId(groupId);
					}
				});
		}
	}

	public static class RoleIdAccessor extends ModelPropertyAccessor {
		public RoleIdAccessor() {
			super(new Function<UserGroupRole, Long>() {
					@Override
					public Long apply(UserGroupRole userGroupRole) {
						return userGroupRole.getRoleId();
					}
				},
				new BiConsumer<UserGroupRole, Long>() {
					@Override
					public void accept(UserGroupRole userGroupRole, Long roleId) {
						userGroupRole.setRoleId(roleId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<UserGroupRole, Long>() {
					@Override
					public Long apply(UserGroupRole userGroupRole) {
						return userGroupRole.getCompanyId();
					}
				},
				new BiConsumer<UserGroupRole, Long>() {
					@Override
					public void accept(UserGroupRole userGroupRole,
						Long companyId) {
						userGroupRole.setCompanyId(companyId);
					}
				});
		}
	}

	private UserGroupRoleModelAccessors() {
	}
}