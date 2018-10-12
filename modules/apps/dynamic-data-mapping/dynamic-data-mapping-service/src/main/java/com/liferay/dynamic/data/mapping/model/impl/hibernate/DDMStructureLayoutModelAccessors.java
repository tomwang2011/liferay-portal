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

package com.liferay.dynamic.data.mapping.model.impl.hibernate;

import com.liferay.dynamic.data.mapping.model.DDMStructureLayout;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DDMStructureLayoutModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<DDMStructureLayout, String>() {
					@Override
					public String apply(DDMStructureLayout ddmStructureLayout) {
						return ddmStructureLayout.getUuid();
					}
				},
				new BiConsumer<DDMStructureLayout, String>() {
					@Override
					public void accept(DDMStructureLayout ddmStructureLayout,
						String uuid) {
						ddmStructureLayout.setUuid(uuid);
					}
				});
		}
	}

	public static class StructureLayoutIdAccessor extends ModelPropertyAccessor {
		public StructureLayoutIdAccessor() {
			super(new Function<DDMStructureLayout, Long>() {
					@Override
					public Long apply(DDMStructureLayout ddmStructureLayout) {
						return ddmStructureLayout.getStructureLayoutId();
					}
				},
				new BiConsumer<DDMStructureLayout, Long>() {
					@Override
					public void accept(DDMStructureLayout ddmStructureLayout,
						Long structureLayoutId) {
						ddmStructureLayout.setStructureLayoutId(structureLayoutId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DDMStructureLayout, Long>() {
					@Override
					public Long apply(DDMStructureLayout ddmStructureLayout) {
						return ddmStructureLayout.getGroupId();
					}
				},
				new BiConsumer<DDMStructureLayout, Long>() {
					@Override
					public void accept(DDMStructureLayout ddmStructureLayout,
						Long groupId) {
						ddmStructureLayout.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDMStructureLayout, Long>() {
					@Override
					public Long apply(DDMStructureLayout ddmStructureLayout) {
						return ddmStructureLayout.getCompanyId();
					}
				},
				new BiConsumer<DDMStructureLayout, Long>() {
					@Override
					public void accept(DDMStructureLayout ddmStructureLayout,
						Long companyId) {
						ddmStructureLayout.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DDMStructureLayout, Long>() {
					@Override
					public Long apply(DDMStructureLayout ddmStructureLayout) {
						return ddmStructureLayout.getUserId();
					}
				},
				new BiConsumer<DDMStructureLayout, Long>() {
					@Override
					public void accept(DDMStructureLayout ddmStructureLayout,
						Long userId) {
						ddmStructureLayout.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DDMStructureLayout, String>() {
					@Override
					public String apply(DDMStructureLayout ddmStructureLayout) {
						return ddmStructureLayout.getUserName();
					}
				},
				new BiConsumer<DDMStructureLayout, String>() {
					@Override
					public void accept(DDMStructureLayout ddmStructureLayout,
						String userName) {
						ddmStructureLayout.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DDMStructureLayout, Date>() {
					@Override
					public Date apply(DDMStructureLayout ddmStructureLayout) {
						return ddmStructureLayout.getCreateDate();
					}
				},
				new BiConsumer<DDMStructureLayout, Date>() {
					@Override
					public void accept(DDMStructureLayout ddmStructureLayout,
						Date createDate) {
						ddmStructureLayout.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<DDMStructureLayout, Date>() {
					@Override
					public Date apply(DDMStructureLayout ddmStructureLayout) {
						return ddmStructureLayout.getModifiedDate();
					}
				},
				new BiConsumer<DDMStructureLayout, Date>() {
					@Override
					public void accept(DDMStructureLayout ddmStructureLayout,
						Date modifiedDate) {
						ddmStructureLayout.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class StructureVersionIdAccessor extends ModelPropertyAccessor {
		public StructureVersionIdAccessor() {
			super(new Function<DDMStructureLayout, Long>() {
					@Override
					public Long apply(DDMStructureLayout ddmStructureLayout) {
						return ddmStructureLayout.getStructureVersionId();
					}
				},
				new BiConsumer<DDMStructureLayout, Long>() {
					@Override
					public void accept(DDMStructureLayout ddmStructureLayout,
						Long structureVersionId) {
						ddmStructureLayout.setStructureVersionId(structureVersionId);
					}
				});
		}
	}

	public static class DefinitionAccessor extends ModelPropertyAccessor {
		public DefinitionAccessor() {
			super(new Function<DDMStructureLayout, String>() {
					@Override
					public String apply(DDMStructureLayout ddmStructureLayout) {
						return ddmStructureLayout.getDefinition();
					}
				},
				new BiConsumer<DDMStructureLayout, String>() {
					@Override
					public void accept(DDMStructureLayout ddmStructureLayout,
						String definition) {
						ddmStructureLayout.setDefinition(definition);
					}
				});
		}
	}

	private DDMStructureLayoutModelAccessors() {
	}
}