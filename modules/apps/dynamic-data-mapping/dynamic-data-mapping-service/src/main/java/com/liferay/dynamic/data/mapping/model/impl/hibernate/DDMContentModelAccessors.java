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

import com.liferay.dynamic.data.mapping.model.DDMContent;

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
public class DDMContentModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<DDMContent, String>() {
					@Override
					public String apply(DDMContent ddmContent) {
						return ddmContent.getUuid();
					}
				},
				new BiConsumer<DDMContent, String>() {
					@Override
					public void accept(DDMContent ddmContent, String uuid) {
						ddmContent.setUuid(uuid);
					}
				});
		}
	}

	public static class ContentIdAccessor extends ModelPropertyAccessor {
		public ContentIdAccessor() {
			super(new Function<DDMContent, Long>() {
					@Override
					public Long apply(DDMContent ddmContent) {
						return ddmContent.getContentId();
					}
				},
				new BiConsumer<DDMContent, Long>() {
					@Override
					public void accept(DDMContent ddmContent, Long contentId) {
						ddmContent.setContentId(contentId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DDMContent, Long>() {
					@Override
					public Long apply(DDMContent ddmContent) {
						return ddmContent.getGroupId();
					}
				},
				new BiConsumer<DDMContent, Long>() {
					@Override
					public void accept(DDMContent ddmContent, Long groupId) {
						ddmContent.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDMContent, Long>() {
					@Override
					public Long apply(DDMContent ddmContent) {
						return ddmContent.getCompanyId();
					}
				},
				new BiConsumer<DDMContent, Long>() {
					@Override
					public void accept(DDMContent ddmContent, Long companyId) {
						ddmContent.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DDMContent, Long>() {
					@Override
					public Long apply(DDMContent ddmContent) {
						return ddmContent.getUserId();
					}
				},
				new BiConsumer<DDMContent, Long>() {
					@Override
					public void accept(DDMContent ddmContent, Long userId) {
						ddmContent.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DDMContent, String>() {
					@Override
					public String apply(DDMContent ddmContent) {
						return ddmContent.getUserName();
					}
				},
				new BiConsumer<DDMContent, String>() {
					@Override
					public void accept(DDMContent ddmContent, String userName) {
						ddmContent.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DDMContent, Date>() {
					@Override
					public Date apply(DDMContent ddmContent) {
						return ddmContent.getCreateDate();
					}
				},
				new BiConsumer<DDMContent, Date>() {
					@Override
					public void accept(DDMContent ddmContent, Date createDate) {
						ddmContent.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<DDMContent, Date>() {
					@Override
					public Date apply(DDMContent ddmContent) {
						return ddmContent.getModifiedDate();
					}
				},
				new BiConsumer<DDMContent, Date>() {
					@Override
					public void accept(DDMContent ddmContent, Date modifiedDate) {
						ddmContent.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<DDMContent, String>() {
					@Override
					public String apply(DDMContent ddmContent) {
						return ddmContent.getName();
					}
				},
				new BiConsumer<DDMContent, String>() {
					@Override
					public void accept(DDMContent ddmContent, String name) {
						ddmContent.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<DDMContent, String>() {
					@Override
					public String apply(DDMContent ddmContent) {
						return ddmContent.getDescription();
					}
				},
				new BiConsumer<DDMContent, String>() {
					@Override
					public void accept(DDMContent ddmContent, String description) {
						ddmContent.setDescription(description);
					}
				});
		}
	}

	public static class DataAccessor extends ModelPropertyAccessor {
		public DataAccessor() {
			super(new Function<DDMContent, String>() {
					@Override
					public String apply(DDMContent ddmContent) {
						return ddmContent.getData();
					}
				},
				new BiConsumer<DDMContent, String>() {
					@Override
					public void accept(DDMContent ddmContent, String data) {
						ddmContent.setData(data);
					}
				});
		}
	}

	private DDMContentModelAccessors() {
	}
}