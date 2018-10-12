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

import com.liferay.layout.page.template.model.LayoutPageTemplateEntry;

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
public class LayoutPageTemplateEntryModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<LayoutPageTemplateEntry, String>() {
					@Override
					public String apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getUuid();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, String>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						String uuid) {
						layoutPageTemplateEntry.setUuid(uuid);
					}
				});
		}
	}

	public static class LayoutPageTemplateEntryIdAccessor
		extends ModelPropertyAccessor {
		public LayoutPageTemplateEntryIdAccessor() {
			super(new Function<LayoutPageTemplateEntry, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getLayoutPageTemplateEntryId();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						Long layoutPageTemplateEntryId) {
						layoutPageTemplateEntry.setLayoutPageTemplateEntryId(layoutPageTemplateEntryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<LayoutPageTemplateEntry, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getGroupId();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						Long groupId) {
						layoutPageTemplateEntry.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<LayoutPageTemplateEntry, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getCompanyId();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						Long companyId) {
						layoutPageTemplateEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<LayoutPageTemplateEntry, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getUserId();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						Long userId) {
						layoutPageTemplateEntry.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<LayoutPageTemplateEntry, String>() {
					@Override
					public String apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getUserName();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, String>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						String userName) {
						layoutPageTemplateEntry.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<LayoutPageTemplateEntry, Date>() {
					@Override
					public Date apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getCreateDate();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, Date>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						Date createDate) {
						layoutPageTemplateEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<LayoutPageTemplateEntry, Date>() {
					@Override
					public Date apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getModifiedDate();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, Date>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						Date modifiedDate) {
						layoutPageTemplateEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class LayoutPageTemplateCollectionIdAccessor
		extends ModelPropertyAccessor {
		public LayoutPageTemplateCollectionIdAccessor() {
			super(new Function<LayoutPageTemplateEntry, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getLayoutPageTemplateCollectionId();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						Long layoutPageTemplateCollectionId) {
						layoutPageTemplateEntry.setLayoutPageTemplateCollectionId(layoutPageTemplateCollectionId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<LayoutPageTemplateEntry, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getClassNameId();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						Long classNameId) {
						layoutPageTemplateEntry.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassTypeIdAccessor extends ModelPropertyAccessor {
		public ClassTypeIdAccessor() {
			super(new Function<LayoutPageTemplateEntry, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getClassTypeId();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						Long classTypeId) {
						layoutPageTemplateEntry.setClassTypeId(classTypeId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<LayoutPageTemplateEntry, String>() {
					@Override
					public String apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getName();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, String>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						String name) {
						layoutPageTemplateEntry.setName(name);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<LayoutPageTemplateEntry, Integer>() {
					@Override
					public Integer apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getType();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, Integer>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						Integer type) {
						layoutPageTemplateEntry.setType(type);
					}
				});
		}
	}

	public static class PreviewFileEntryIdAccessor extends ModelPropertyAccessor {
		public PreviewFileEntryIdAccessor() {
			super(new Function<LayoutPageTemplateEntry, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getPreviewFileEntryId();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						Long previewFileEntryId) {
						layoutPageTemplateEntry.setPreviewFileEntryId(previewFileEntryId);
					}
				});
		}
	}

	public static class DefaultTemplateAccessor extends ModelPropertyAccessor {
		public DefaultTemplateAccessor() {
			super(new Function<LayoutPageTemplateEntry, Boolean>() {
					@Override
					public Boolean apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getDefaultTemplate();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, Boolean>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						Boolean defaultTemplate) {
						layoutPageTemplateEntry.setDefaultTemplate(defaultTemplate);
					}
				});
		}
	}

	public static class LayoutPrototypeIdAccessor extends ModelPropertyAccessor {
		public LayoutPrototypeIdAccessor() {
			super(new Function<LayoutPageTemplateEntry, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getLayoutPrototypeId();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						Long layoutPrototypeId) {
						layoutPageTemplateEntry.setLayoutPrototypeId(layoutPrototypeId);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<LayoutPageTemplateEntry, Date>() {
					@Override
					public Date apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getLastPublishDate();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, Date>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						Date lastPublishDate) {
						layoutPageTemplateEntry.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<LayoutPageTemplateEntry, Integer>() {
					@Override
					public Integer apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getStatus();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, Integer>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						Integer status) {
						layoutPageTemplateEntry.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<LayoutPageTemplateEntry, Long>() {
					@Override
					public Long apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getStatusByUserId();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, Long>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						Long statusByUserId) {
						layoutPageTemplateEntry.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<LayoutPageTemplateEntry, String>() {
					@Override
					public String apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getStatusByUserName();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, String>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						String statusByUserName) {
						layoutPageTemplateEntry.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<LayoutPageTemplateEntry, Date>() {
					@Override
					public Date apply(
						LayoutPageTemplateEntry layoutPageTemplateEntry) {
						return layoutPageTemplateEntry.getStatusDate();
					}
				},
				new BiConsumer<LayoutPageTemplateEntry, Date>() {
					@Override
					public void accept(
						LayoutPageTemplateEntry layoutPageTemplateEntry,
						Date statusDate) {
						layoutPageTemplateEntry.setStatusDate(statusDate);
					}
				});
		}
	}

	private LayoutPageTemplateEntryModelAccessors() {
	}
}