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
import com.liferay.portal.kernel.model.ResourceBlockPermission;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ResourceBlockPermissionModelAccessors {
	public static class ResourceBlockPermissionIdAccessor
		extends ModelPropertyAccessor {
		public ResourceBlockPermissionIdAccessor() {
			super(new Function<ResourceBlockPermission, Long>() {
					@Override
					public Long apply(
						ResourceBlockPermission resourceBlockPermission) {
						return resourceBlockPermission.getResourceBlockPermissionId();
					}
				},
				new BiConsumer<ResourceBlockPermission, Long>() {
					@Override
					public void accept(
						ResourceBlockPermission resourceBlockPermission,
						Long resourceBlockPermissionId) {
						resourceBlockPermission.setResourceBlockPermissionId(resourceBlockPermissionId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<ResourceBlockPermission, Long>() {
					@Override
					public Long apply(
						ResourceBlockPermission resourceBlockPermission) {
						return resourceBlockPermission.getCompanyId();
					}
				},
				new BiConsumer<ResourceBlockPermission, Long>() {
					@Override
					public void accept(
						ResourceBlockPermission resourceBlockPermission,
						Long companyId) {
						resourceBlockPermission.setCompanyId(companyId);
					}
				});
		}
	}

	public static class ResourceBlockIdAccessor extends ModelPropertyAccessor {
		public ResourceBlockIdAccessor() {
			super(new Function<ResourceBlockPermission, Long>() {
					@Override
					public Long apply(
						ResourceBlockPermission resourceBlockPermission) {
						return resourceBlockPermission.getResourceBlockId();
					}
				},
				new BiConsumer<ResourceBlockPermission, Long>() {
					@Override
					public void accept(
						ResourceBlockPermission resourceBlockPermission,
						Long resourceBlockId) {
						resourceBlockPermission.setResourceBlockId(resourceBlockId);
					}
				});
		}
	}

	public static class RoleIdAccessor extends ModelPropertyAccessor {
		public RoleIdAccessor() {
			super(new Function<ResourceBlockPermission, Long>() {
					@Override
					public Long apply(
						ResourceBlockPermission resourceBlockPermission) {
						return resourceBlockPermission.getRoleId();
					}
				},
				new BiConsumer<ResourceBlockPermission, Long>() {
					@Override
					public void accept(
						ResourceBlockPermission resourceBlockPermission,
						Long roleId) {
						resourceBlockPermission.setRoleId(roleId);
					}
				});
		}
	}

	public static class ActionIdsAccessor extends ModelPropertyAccessor {
		public ActionIdsAccessor() {
			super(new Function<ResourceBlockPermission, Long>() {
					@Override
					public Long apply(
						ResourceBlockPermission resourceBlockPermission) {
						return resourceBlockPermission.getActionIds();
					}
				},
				new BiConsumer<ResourceBlockPermission, Long>() {
					@Override
					public void accept(
						ResourceBlockPermission resourceBlockPermission,
						Long actionIds) {
						resourceBlockPermission.setActionIds(actionIds);
					}
				});
		}
	}

	private ResourceBlockPermissionModelAccessors() {
	}
}