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

import com.liferay.layout.page.template.model.LayoutPageTemplateCollection;

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
public class LayoutPageTemplateCollectionModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<LayoutPageTemplateCollection, String>() {
					@Override
					public String apply(
						LayoutPageTemplateCollection layoutPageTemplateCollection) {
						return layoutPageTemplateCollection.getUuid();
					}
				},
				new BiConsumer<LayoutPageTemplateCollection, String>() {
					@Override
					public void accept(
						LayoutPageTemplateCollection layoutPageTemplateCollection,
						String uuid) {
						layoutPageTemplateCollection.setUuid(uuid);
					}
				});
		}
	}

	public static class LayoutPageTemplateCollectionIdAccessor
		extends ModelPropertyAccessor {
		public LayoutPageTemplateCollectionIdAccessor() {
			super(new Function<LayoutPageTemplateCollection, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateCollection layoutPageTemplateCollection) {
						return layoutPageTemplateCollection.getLayoutPageTemplateCollectionId();
					}
				},
				new BiConsumer<LayoutPageTemplateCollection, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateCollection layoutPageTemplateCollection,
						Long layoutPageTemplateCollectionId) {
						layoutPageTemplateCollection.setLayoutPageTemplateCollectionId(layoutPageTemplateCollectionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<LayoutPageTemplateCollection, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateCollection layoutPageTemplateCollection) {
						return layoutPageTemplateCollection.getGroupId();
					}
				},
				new BiConsumer<LayoutPageTemplateCollection, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateCollection layoutPageTemplateCollection,
						Long groupId) {
						layoutPageTemplateCollection.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<LayoutPageTemplateCollection, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateCollection layoutPageTemplateCollection) {
						return layoutPageTemplateCollection.getCompanyId();
					}
				},
				new BiConsumer<LayoutPageTemplateCollection, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateCollection layoutPageTemplateCollection,
						Long companyId) {
						layoutPageTemplateCollection.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<LayoutPageTemplateCollection, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateCollection layoutPageTemplateCollection) {
						return layoutPageTemplateCollection.getUserId();
					}
				},
				new BiConsumer<LayoutPageTemplateCollection, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateCollection layoutPageTemplateCollection,
						Long userId) {
						layoutPageTemplateCollection.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<LayoutPageTemplateCollection, String>() {
					@Override
					public String apply(
						LayoutPageTemplateCollection layoutPageTemplateCollection) {
						return layoutPageTemplateCollection.getUserName();
					}
				},
				new BiConsumer<LayoutPageTemplateCollection, String>() {
					@Override
					public void accept(
						LayoutPageTemplateCollection layoutPageTemplateCollection,
						String userName) {
						layoutPageTemplateCollection.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<LayoutPageTemplateCollection, Date>() {
					@Override
					public Date apply(
						LayoutPageTemplateCollection layoutPageTemplateCollection) {
						return layoutPageTemplateCollection.getCreateDate();
					}
				},
				new BiConsumer<LayoutPageTemplateCollection, Date>() {
					@Override
					public void accept(
						LayoutPageTemplateCollection layoutPageTemplateCollection,
						Date createDate) {
						layoutPageTemplateCollection.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<LayoutPageTemplateCollection, Date>() {
					@Override
					public Date apply(
						LayoutPageTemplateCollection layoutPageTemplateCollection) {
						return layoutPageTemplateCollection.getModifiedDate();
					}
				},
				new BiConsumer<LayoutPageTemplateCollection, Date>() {
					@Override
					public void accept(
						LayoutPageTemplateCollection layoutPageTemplateCollection,
						Date modifiedDate) {
						layoutPageTemplateCollection.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<LayoutPageTemplateCollection, String>() {
					@Override
					public String apply(
						LayoutPageTemplateCollection layoutPageTemplateCollection) {
						return layoutPageTemplateCollection.getName();
					}
				},
				new BiConsumer<LayoutPageTemplateCollection, String>() {
					@Override
					public void accept(
						LayoutPageTemplateCollection layoutPageTemplateCollection,
						String name) {
						layoutPageTemplateCollection.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<LayoutPageTemplateCollection, String>() {
					@Override
					public String apply(
						LayoutPageTemplateCollection layoutPageTemplateCollection) {
						return layoutPageTemplateCollection.getDescription();
					}
				},
				new BiConsumer<LayoutPageTemplateCollection, String>() {
					@Override
					public void accept(
						LayoutPageTemplateCollection layoutPageTemplateCollection,
						String description) {
						layoutPageTemplateCollection.setDescription(description);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<LayoutPageTemplateCollection, Date>() {
					@Override
					public Date apply(
						LayoutPageTemplateCollection layoutPageTemplateCollection) {
						return layoutPageTemplateCollection.getLastPublishDate();
					}
				},
				new BiConsumer<LayoutPageTemplateCollection, Date>() {
					@Override
					public void accept(
						LayoutPageTemplateCollection layoutPageTemplateCollection,
						Date lastPublishDate) {
						layoutPageTemplateCollection.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private LayoutPageTemplateCollectionModelAccessors() {
	}
}