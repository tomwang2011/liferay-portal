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
import com.liferay.portal.kernel.model.ResourceTypePermission;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ResourceTypePermissionModelAccessors {
	public static class ResourceTypePermissionIdAccessor
		extends ModelPropertyAccessor {
		public ResourceTypePermissionIdAccessor() {
			super(new Function<ResourceTypePermission, Long>() {
					@Override
					public Long apply(
						ResourceTypePermission resourceTypePermission) {
						return resourceTypePermission.getResourceTypePermissionId();
					}
				},
				new BiConsumer<ResourceTypePermission, Long>() {
					@Override
					public void accept(
						ResourceTypePermission resourceTypePermission,
						Long resourceTypePermissionId) {
						resourceTypePermission.setResourceTypePermissionId(resourceTypePermissionId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<ResourceTypePermission, Long>() {
					@Override
					public Long apply(
						ResourceTypePermission resourceTypePermission) {
						return resourceTypePermission.getCompanyId();
					}
				},
				new BiConsumer<ResourceTypePermission, Long>() {
					@Override
					public void accept(
						ResourceTypePermission resourceTypePermission,
						Long companyId) {
						resourceTypePermission.setCompanyId(companyId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<ResourceTypePermission, Long>() {
					@Override
					public Long apply(
						ResourceTypePermission resourceTypePermission) {
						return resourceTypePermission.getGroupId();
					}
				},
				new BiConsumer<ResourceTypePermission, Long>() {
					@Override
					public void accept(
						ResourceTypePermission resourceTypePermission,
						Long groupId) {
						resourceTypePermission.setGroupId(groupId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<ResourceTypePermission, String>() {
					@Override
					public String apply(
						ResourceTypePermission resourceTypePermission) {
						return resourceTypePermission.getName();
					}
				},
				new BiConsumer<ResourceTypePermission, String>() {
					@Override
					public void accept(
						ResourceTypePermission resourceTypePermission,
						String name) {
						resourceTypePermission.setName(name);
					}
				});
		}
	}

	public static class RoleIdAccessor extends ModelPropertyAccessor {
		public RoleIdAccessor() {
			super(new Function<ResourceTypePermission, Long>() {
					@Override
					public Long apply(
						ResourceTypePermission resourceTypePermission) {
						return resourceTypePermission.getRoleId();
					}
				},
				new BiConsumer<ResourceTypePermission, Long>() {
					@Override
					public void accept(
						ResourceTypePermission resourceTypePermission,
						Long roleId) {
						resourceTypePermission.setRoleId(roleId);
					}
				});
		}
	}

	public static class ActionIdsAccessor extends ModelPropertyAccessor {
		public ActionIdsAccessor() {
			super(new Function<ResourceTypePermission, Long>() {
					@Override
					public Long apply(
						ResourceTypePermission resourceTypePermission) {
						return resourceTypePermission.getActionIds();
					}
				},
				new BiConsumer<ResourceTypePermission, Long>() {
					@Override
					public void accept(
						ResourceTypePermission resourceTypePermission,
						Long actionIds) {
						resourceTypePermission.setActionIds(actionIds);
					}
				});
		}
	}

	private ResourceTypePermissionModelAccessors() {
	}
}