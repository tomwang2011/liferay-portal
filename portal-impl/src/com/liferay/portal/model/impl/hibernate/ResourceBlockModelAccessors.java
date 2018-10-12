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
import com.liferay.portal.kernel.model.ResourceBlock;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ResourceBlockModelAccessors {
	public static class ResourceBlockIdAccessor extends ModelPropertyAccessor {
		public ResourceBlockIdAccessor() {
			super(new Function<ResourceBlock, Long>() {
					@Override
					public Long apply(ResourceBlock resourceBlock) {
						return resourceBlock.getResourceBlockId();
					}
				},
				new BiConsumer<ResourceBlock, Long>() {
					@Override
					public void accept(ResourceBlock resourceBlock,
						Long resourceBlockId) {
						resourceBlock.setResourceBlockId(resourceBlockId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<ResourceBlock, Long>() {
					@Override
					public Long apply(ResourceBlock resourceBlock) {
						return resourceBlock.getCompanyId();
					}
				},
				new BiConsumer<ResourceBlock, Long>() {
					@Override
					public void accept(ResourceBlock resourceBlock,
						Long companyId) {
						resourceBlock.setCompanyId(companyId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<ResourceBlock, Long>() {
					@Override
					public Long apply(ResourceBlock resourceBlock) {
						return resourceBlock.getGroupId();
					}
				},
				new BiConsumer<ResourceBlock, Long>() {
					@Override
					public void accept(ResourceBlock resourceBlock, Long groupId) {
						resourceBlock.setGroupId(groupId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<ResourceBlock, String>() {
					@Override
					public String apply(ResourceBlock resourceBlock) {
						return resourceBlock.getName();
					}
				},
				new BiConsumer<ResourceBlock, String>() {
					@Override
					public void accept(ResourceBlock resourceBlock, String name) {
						resourceBlock.setName(name);
					}
				});
		}
	}

	public static class PermissionsHashAccessor extends ModelPropertyAccessor {
		public PermissionsHashAccessor() {
			super(new Function<ResourceBlock, String>() {
					@Override
					public String apply(ResourceBlock resourceBlock) {
						return resourceBlock.getPermissionsHash();
					}
				},
				new BiConsumer<ResourceBlock, String>() {
					@Override
					public void accept(ResourceBlock resourceBlock,
						String permissionsHash) {
						resourceBlock.setPermissionsHash(permissionsHash);
					}
				});
		}
	}

	public static class ReferenceCountAccessor extends ModelPropertyAccessor {
		public ReferenceCountAccessor() {
			super(new Function<ResourceBlock, Long>() {
					@Override
					public Long apply(ResourceBlock resourceBlock) {
						return resourceBlock.getReferenceCount();
					}
				},
				new BiConsumer<ResourceBlock, Long>() {
					@Override
					public void accept(ResourceBlock resourceBlock,
						Long referenceCount) {
						resourceBlock.setReferenceCount(referenceCount);
					}
				});
		}
	}

	private ResourceBlockModelAccessors() {
	}
}