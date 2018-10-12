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

package com.liferay.layout.page.template.model.impl.hibernate;

import com.liferay.layout.page.template.model.LayoutPageTemplateStructure;

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
public class LayoutPageTemplateStructureModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<LayoutPageTemplateStructure, String>() {
					@Override
					public String apply(
						LayoutPageTemplateStructure layoutPageTemplateStructure) {
						return layoutPageTemplateStructure.getUuid();
					}
				},
				new BiConsumer<LayoutPageTemplateStructure, String>() {
					@Override
					public void accept(
						LayoutPageTemplateStructure layoutPageTemplateStructure,
						String uuid) {
						layoutPageTemplateStructure.setUuid(uuid);
					}
				});
		}
	}

	public static class LayoutPageTemplateStructureIdAccessor
		extends ModelPropertyAccessor {
		public LayoutPageTemplateStructureIdAccessor() {
			super(new Function<LayoutPageTemplateStructure, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateStructure layoutPageTemplateStructure) {
						return layoutPageTemplateStructure.getLayoutPageTemplateStructureId();
					}
				},
				new BiConsumer<LayoutPageTemplateStructure, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateStructure layoutPageTemplateStructure,
						Long layoutPageTemplateStructureId) {
						layoutPageTemplateStructure.setLayoutPageTemplateStructureId(layoutPageTemplateStructureId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<LayoutPageTemplateStructure, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateStructure layoutPageTemplateStructure) {
						return layoutPageTemplateStructure.getGroupId();
					}
				},
				new BiConsumer<LayoutPageTemplateStructure, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateStructure layoutPageTemplateStructure,
						Long groupId) {
						layoutPageTemplateStructure.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<LayoutPageTemplateStructure, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateStructure layoutPageTemplateStructure) {
						return layoutPageTemplateStructure.getCompanyId();
					}
				},
				new BiConsumer<LayoutPageTemplateStructure, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateStructure layoutPageTemplateStructure,
						Long companyId) {
						layoutPageTemplateStructure.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<LayoutPageTemplateStructure, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateStructure layoutPageTemplateStructure) {
						return layoutPageTemplateStructure.getUserId();
					}
				},
				new BiConsumer<LayoutPageTemplateStructure, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateStructure layoutPageTemplateStructure,
						Long userId) {
						layoutPageTemplateStructure.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<LayoutPageTemplateStructure, String>() {
					@Override
					public String apply(
						LayoutPageTemplateStructure layoutPageTemplateStructure) {
						return layoutPageTemplateStructure.getUserName();
					}
				},
				new BiConsumer<LayoutPageTemplateStructure, String>() {
					@Override
					public void accept(
						LayoutPageTemplateStructure layoutPageTemplateStructure,
						String userName) {
						layoutPageTemplateStructure.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<LayoutPageTemplateStructure, Date>() {
					@Override
					public Date apply(
						LayoutPageTemplateStructure layoutPageTemplateStructure) {
						return layoutPageTemplateStructure.getCreateDate();
					}
				},
				new BiConsumer<LayoutPageTemplateStructure, Date>() {
					@Override
					public void accept(
						LayoutPageTemplateStructure layoutPageTemplateStructure,
						Date createDate) {
						layoutPageTemplateStructure.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<LayoutPageTemplateStructure, Date>() {
					@Override
					public Date apply(
						LayoutPageTemplateStructure layoutPageTemplateStructure) {
						return layoutPageTemplateStructure.getModifiedDate();
					}
				},
				new BiConsumer<LayoutPageTemplateStructure, Date>() {
					@Override
					public void accept(
						LayoutPageTemplateStructure layoutPageTemplateStructure,
						Date modifiedDate) {
						layoutPageTemplateStructure.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<LayoutPageTemplateStructure, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateStructure layoutPageTemplateStructure) {
						return layoutPageTemplateStructure.getClassNameId();
					}
				},
				new BiConsumer<LayoutPageTemplateStructure, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateStructure layoutPageTemplateStructure,
						Long classNameId) {
						layoutPageTemplateStructure.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<LayoutPageTemplateStructure, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateStructure layoutPageTemplateStructure) {
						return layoutPageTemplateStructure.getClassPK();
					}
				},
				new BiConsumer<LayoutPageTemplateStructure, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateStructure layoutPageTemplateStructure,
						Long classPK) {
						layoutPageTemplateStructure.setClassPK(classPK);
					}
				});
		}
	}

	public static class DataAccessor extends ModelPropertyAccessor {
		public DataAccessor() {
			super(new Function<LayoutPageTemplateStructure, String>() {
					@Override
					public String apply(
						LayoutPageTemplateStructure layoutPageTemplateStructure) {
						return layoutPageTemplateStructure.getData();
					}
				},
				new BiConsumer<LayoutPageTemplateStructure, String>() {
					@Override
					public void accept(
						LayoutPageTemplateStructure layoutPageTemplateStructure,
						String data) {
						layoutPageTemplateStructure.setData(data);
					}
				});
		}
	}

	private LayoutPageTemplateStructureModelAccessors() {
	}
}