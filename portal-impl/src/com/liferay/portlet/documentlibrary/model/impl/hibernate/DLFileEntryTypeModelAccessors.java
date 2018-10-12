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

package com.liferay.portlet.documentlibrary.model.impl.hibernate;

import com.liferay.document.library.kernel.model.DLFileEntryType;

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
public class DLFileEntryTypeModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<DLFileEntryType, String>() {
					@Override
					public String apply(DLFileEntryType dlFileEntryType) {
						return dlFileEntryType.getUuid();
					}
				},
				new BiConsumer<DLFileEntryType, String>() {
					@Override
					public void accept(DLFileEntryType dlFileEntryType,
						String uuid) {
						dlFileEntryType.setUuid(uuid);
					}
				});
		}
	}

	public static class FileEntryTypeIdAccessor extends ModelPropertyAccessor {
		public FileEntryTypeIdAccessor() {
			super(new Function<DLFileEntryType, Long>() {
					@Override
					public Long apply(DLFileEntryType dlFileEntryType) {
						return dlFileEntryType.getFileEntryTypeId();
					}
				},
				new BiConsumer<DLFileEntryType, Long>() {
					@Override
					public void accept(DLFileEntryType dlFileEntryType,
						Long fileEntryTypeId) {
						dlFileEntryType.setFileEntryTypeId(fileEntryTypeId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DLFileEntryType, Long>() {
					@Override
					public Long apply(DLFileEntryType dlFileEntryType) {
						return dlFileEntryType.getGroupId();
					}
				},
				new BiConsumer<DLFileEntryType, Long>() {
					@Override
					public void accept(DLFileEntryType dlFileEntryType,
						Long groupId) {
						dlFileEntryType.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DLFileEntryType, Long>() {
					@Override
					public Long apply(DLFileEntryType dlFileEntryType) {
						return dlFileEntryType.getCompanyId();
					}
				},
				new BiConsumer<DLFileEntryType, Long>() {
					@Override
					public void accept(DLFileEntryType dlFileEntryType,
						Long companyId) {
						dlFileEntryType.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DLFileEntryType, Long>() {
					@Override
					public Long apply(DLFileEntryType dlFileEntryType) {
						return dlFileEntryType.getUserId();
					}
				},
				new BiConsumer<DLFileEntryType, Long>() {
					@Override
					public void accept(DLFileEntryType dlFileEntryType,
						Long userId) {
						dlFileEntryType.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DLFileEntryType, String>() {
					@Override
					public String apply(DLFileEntryType dlFileEntryType) {
						return dlFileEntryType.getUserName();
					}
				},
				new BiConsumer<DLFileEntryType, String>() {
					@Override
					public void accept(DLFileEntryType dlFileEntryType,
						String userName) {
						dlFileEntryType.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DLFileEntryType, Date>() {
					@Override
					public Date apply(DLFileEntryType dlFileEntryType) {
						return dlFileEntryType.getCreateDate();
					}
				},
				new BiConsumer<DLFileEntryType, Date>() {
					@Override
					public void accept(DLFileEntryType dlFileEntryType,
						Date createDate) {
						dlFileEntryType.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<DLFileEntryType, Date>() {
					@Override
					public Date apply(DLFileEntryType dlFileEntryType) {
						return dlFileEntryType.getModifiedDate();
					}
				},
				new BiConsumer<DLFileEntryType, Date>() {
					@Override
					public void accept(DLFileEntryType dlFileEntryType,
						Date modifiedDate) {
						dlFileEntryType.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class FileEntryTypeKeyAccessor extends ModelPropertyAccessor {
		public FileEntryTypeKeyAccessor() {
			super(new Function<DLFileEntryType, String>() {
					@Override
					public String apply(DLFileEntryType dlFileEntryType) {
						return dlFileEntryType.getFileEntryTypeKey();
					}
				},
				new BiConsumer<DLFileEntryType, String>() {
					@Override
					public void accept(DLFileEntryType dlFileEntryType,
						String fileEntryTypeKey) {
						dlFileEntryType.setFileEntryTypeKey(fileEntryTypeKey);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<DLFileEntryType, String>() {
					@Override
					public String apply(DLFileEntryType dlFileEntryType) {
						return dlFileEntryType.getName();
					}
				},
				new BiConsumer<DLFileEntryType, String>() {
					@Override
					public void accept(DLFileEntryType dlFileEntryType,
						String name) {
						dlFileEntryType.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<DLFileEntryType, String>() {
					@Override
					public String apply(DLFileEntryType dlFileEntryType) {
						return dlFileEntryType.getDescription();
					}
				},
				new BiConsumer<DLFileEntryType, String>() {
					@Override
					public void accept(DLFileEntryType dlFileEntryType,
						String description) {
						dlFileEntryType.setDescription(description);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<DLFileEntryType, Date>() {
					@Override
					public Date apply(DLFileEntryType dlFileEntryType) {
						return dlFileEntryType.getLastPublishDate();
					}
				},
				new BiConsumer<DLFileEntryType, Date>() {
					@Override
					public void accept(DLFileEntryType dlFileEntryType,
						Date lastPublishDate) {
						dlFileEntryType.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private DLFileEntryTypeModelAccessors() {
	}
}