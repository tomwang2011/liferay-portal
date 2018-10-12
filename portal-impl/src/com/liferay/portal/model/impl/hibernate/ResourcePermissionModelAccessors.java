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
import com.liferay.portal.kernel.model.ResourcePermission;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ResourcePermissionModelAccessors {
	public static class ResourcePermissionIdAccessor
		extends ModelPropertyAccessor {
		public ResourcePermissionIdAccessor() {
			super(new Function<ResourcePermission, Long>() {
					@Override
					public Long apply(ResourcePermission resourcePermission) {
						return resourcePermission.getResourcePermissionId();
					}
				},
				new BiConsumer<ResourcePermission, Long>() {
					@Override
					public void accept(ResourcePermission resourcePermission,
						Long resourcePermissionId) {
						resourcePermission.setResourcePermissionId(resourcePermissionId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<ResourcePermission, Long>() {
					@Override
					public Long apply(ResourcePermission resourcePermission) {
						return resourcePermission.getCompanyId();
					}
				},
				new BiConsumer<ResourcePermission, Long>() {
					@Override
					public void accept(ResourcePermission resourcePermission,
						Long companyId) {
						resourcePermission.setCompanyId(companyId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<ResourcePermission, String>() {
					@Override
					public String apply(ResourcePermission resourcePermission) {
						return resourcePermission.getName();
					}
				},
				new BiConsumer<ResourcePermission, String>() {
					@Override
					public void accept(ResourcePermission resourcePermission,
						String name) {
						resourcePermission.setName(name);
					}
				});
		}
	}

	public static class ScopeAccessor extends ModelPropertyAccessor {
		public ScopeAccessor() {
			super(new Function<ResourcePermission, Integer>() {
					@Override
					public Integer apply(ResourcePermission resourcePermission) {
						return resourcePermission.getScope();
					}
				},
				new BiConsumer<ResourcePermission, Integer>() {
					@Override
					public void accept(ResourcePermission resourcePermission,
						Integer scope) {
						resourcePermission.setScope(scope);
					}
				});
		}
	}

	public static class PrimKeyAccessor extends ModelPropertyAccessor {
		public PrimKeyAccessor() {
			super(new Function<ResourcePermission, String>() {
					@Override
					public String apply(ResourcePermission resourcePermission) {
						return resourcePermission.getPrimKey();
					}
				},
				new BiConsumer<ResourcePermission, String>() {
					@Override
					public void accept(ResourcePermission resourcePermission,
						String primKey) {
						resourcePermission.setPrimKey(primKey);
					}
				});
		}
	}

	public static class PrimKeyIdAccessor extends ModelPropertyAccessor {
		public PrimKeyIdAccessor() {
			super(new Function<ResourcePermission, Long>() {
					@Override
					public Long apply(ResourcePermission resourcePermission) {
						return resourcePermission.getPrimKeyId();
					}
				},
				new BiConsumer<ResourcePermission, Long>() {
					@Override
					public void accept(ResourcePermission resourcePermission,
						Long primKeyId) {
						resourcePermission.setPrimKeyId(primKeyId);
					}
				});
		}
	}

	public static class RoleIdAccessor extends ModelPropertyAccessor {
		public RoleIdAccessor() {
			super(new Function<ResourcePermission, Long>() {
					@Override
					public Long apply(ResourcePermission resourcePermission) {
						return resourcePermission.getRoleId();
					}
				},
				new BiConsumer<ResourcePermission, Long>() {
					@Override
					public void accept(ResourcePermission resourcePermission,
						Long roleId) {
						resourcePermission.setRoleId(roleId);
					}
				});
		}
	}

	public static class OwnerIdAccessor extends ModelPropertyAccessor {
		public OwnerIdAccessor() {
			super(new Function<ResourcePermission, Long>() {
					@Override
					public Long apply(ResourcePermission resourcePermission) {
						return resourcePermission.getOwnerId();
					}
				},
				new BiConsumer<ResourcePermission, Long>() {
					@Override
					public void accept(ResourcePermission resourcePermission,
						Long ownerId) {
						resourcePermission.setOwnerId(ownerId);
					}
				});
		}
	}

	public static class ActionIdsAccessor extends ModelPropertyAccessor {
		public ActionIdsAccessor() {
			super(new Function<ResourcePermission, Long>() {
					@Override
					public Long apply(ResourcePermission resourcePermission) {
						return resourcePermission.getActionIds();
					}
				},
				new BiConsumer<ResourcePermission, Long>() {
					@Override
					public void accept(ResourcePermission resourcePermission,
						Long actionIds) {
						resourcePermission.setActionIds(actionIds);
					}
				});
		}
	}

	public static class ViewActionIdAccessor extends ModelPropertyAccessor {
		public ViewActionIdAccessor() {
			super(new Function<ResourcePermission, Boolean>() {
					@Override
					public Boolean apply(ResourcePermission resourcePermission) {
						return resourcePermission.getViewActionId();
					}
				},
				new BiConsumer<ResourcePermission, Boolean>() {
					@Override
					public void accept(ResourcePermission resourcePermission,
						Boolean viewActionId) {
						resourcePermission.setViewActionId(viewActionId);
					}
				});
		}
	}

	private ResourcePermissionModelAccessors() {
	}
}