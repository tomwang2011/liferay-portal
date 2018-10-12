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
import com.liferay.portal.kernel.model.OrgGroupRole;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OrgGroupRoleModelAccessors {
	public static class OrganizationIdAccessor extends ModelPropertyAccessor {
		public OrganizationIdAccessor() {
			super(new Function<OrgGroupRole, Long>() {
					@Override
					public Long apply(OrgGroupRole orgGroupRole) {
						return orgGroupRole.getOrganizationId();
					}
				},
				new BiConsumer<OrgGroupRole, Long>() {
					@Override
					public void accept(OrgGroupRole orgGroupRole,
						Long organizationId) {
						orgGroupRole.setOrganizationId(organizationId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<OrgGroupRole, Long>() {
					@Override
					public Long apply(OrgGroupRole orgGroupRole) {
						return orgGroupRole.getGroupId();
					}
				},
				new BiConsumer<OrgGroupRole, Long>() {
					@Override
					public void accept(OrgGroupRole orgGroupRole, Long groupId) {
						orgGroupRole.setGroupId(groupId);
					}
				});
		}
	}

	public static class RoleIdAccessor extends ModelPropertyAccessor {
		public RoleIdAccessor() {
			super(new Function<OrgGroupRole, Long>() {
					@Override
					public Long apply(OrgGroupRole orgGroupRole) {
						return orgGroupRole.getRoleId();
					}
				},
				new BiConsumer<OrgGroupRole, Long>() {
					@Override
					public void accept(OrgGroupRole orgGroupRole, Long roleId) {
						orgGroupRole.setRoleId(roleId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<OrgGroupRole, Long>() {
					@Override
					public Long apply(OrgGroupRole orgGroupRole) {
						return orgGroupRole.getCompanyId();
					}
				},
				new BiConsumer<OrgGroupRole, Long>() {
					@Override
					public void accept(OrgGroupRole orgGroupRole, Long companyId) {
						orgGroupRole.setCompanyId(companyId);
					}
				});
		}
	}

	private OrgGroupRoleModelAccessors() {
	}
}