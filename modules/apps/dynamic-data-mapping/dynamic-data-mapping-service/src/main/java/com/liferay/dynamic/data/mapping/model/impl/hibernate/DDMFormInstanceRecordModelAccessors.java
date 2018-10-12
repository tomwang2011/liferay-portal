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

import com.liferay.dynamic.data.mapping.model.DDMFormInstanceRecord;

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
public class DDMFormInstanceRecordModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<DDMFormInstanceRecord, String>() {
					@Override
					public String apply(
						DDMFormInstanceRecord ddmFormInstanceRecord) {
						return ddmFormInstanceRecord.getUuid();
					}
				},
				new BiConsumer<DDMFormInstanceRecord, String>() {
					@Override
					public void accept(
						DDMFormInstanceRecord ddmFormInstanceRecord, String uuid) {
						ddmFormInstanceRecord.setUuid(uuid);
					}
				});
		}
	}

	public static class FormInstanceRecordIdAccessor
		extends ModelPropertyAccessor {
		public FormInstanceRecordIdAccessor() {
			super(new Function<DDMFormInstanceRecord, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceRecord ddmFormInstanceRecord) {
						return ddmFormInstanceRecord.getFormInstanceRecordId();
					}
				},
				new BiConsumer<DDMFormInstanceRecord, Long>() {
					@Override
					public void accept(
						DDMFormInstanceRecord ddmFormInstanceRecord,
						Long formInstanceRecordId) {
						ddmFormInstanceRecord.setFormInstanceRecordId(formInstanceRecordId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DDMFormInstanceRecord, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceRecord ddmFormInstanceRecord) {
						return ddmFormInstanceRecord.getGroupId();
					}
				},
				new BiConsumer<DDMFormInstanceRecord, Long>() {
					@Override
					public void accept(
						DDMFormInstanceRecord ddmFormInstanceRecord,
						Long groupId) {
						ddmFormInstanceRecord.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDMFormInstanceRecord, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceRecord ddmFormInstanceRecord) {
						return ddmFormInstanceRecord.getCompanyId();
					}
				},
				new BiConsumer<DDMFormInstanceRecord, Long>() {
					@Override
					public void accept(
						DDMFormInstanceRecord ddmFormInstanceRecord,
						Long companyId) {
						ddmFormInstanceRecord.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DDMFormInstanceRecord, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceRecord ddmFormInstanceRecord) {
						return ddmFormInstanceRecord.getUserId();
					}
				},
				new BiConsumer<DDMFormInstanceRecord, Long>() {
					@Override
					public void accept(
						DDMFormInstanceRecord ddmFormInstanceRecord, Long userId) {
						ddmFormInstanceRecord.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DDMFormInstanceRecord, String>() {
					@Override
					public String apply(
						DDMFormInstanceRecord ddmFormInstanceRecord) {
						return ddmFormInstanceRecord.getUserName();
					}
				},
				new BiConsumer<DDMFormInstanceRecord, String>() {
					@Override
					public void accept(
						DDMFormInstanceRecord ddmFormInstanceRecord,
						String userName) {
						ddmFormInstanceRecord.setUserName(userName);
					}
				});
		}
	}

	public static class VersionUserIdAccessor extends ModelPropertyAccessor {
		public VersionUserIdAccessor() {
			super(new Function<DDMFormInstanceRecord, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceRecord ddmFormInstanceRecord) {
						return ddmFormInstanceRecord.getVersionUserId();
					}
				},
				new BiConsumer<DDMFormInstanceRecord, Long>() {
					@Override
					public void accept(
						DDMFormInstanceRecord ddmFormInstanceRecord,
						Long versionUserId) {
						ddmFormInstanceRecord.setVersionUserId(versionUserId);
					}
				});
		}
	}

	public static class VersionUserNameAccessor extends ModelPropertyAccessor {
		public VersionUserNameAccessor() {
			super(new Function<DDMFormInstanceRecord, String>() {
					@Override
					public String apply(
						DDMFormInstanceRecord ddmFormInstanceRecord) {
						return ddmFormInstanceRecord.getVersionUserName();
					}
				},
				new BiConsumer<DDMFormInstanceRecord, String>() {
					@Override
					public void accept(
						DDMFormInstanceRecord ddmFormInstanceRecord,
						String versionUserName) {
						ddmFormInstanceRecord.setVersionUserName(versionUserName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DDMFormInstanceRecord, Date>() {
					@Override
					public Date apply(
						DDMFormInstanceRecord ddmFormInstanceRecord) {
						return ddmFormInstanceRecord.getCreateDate();
					}
				},
				new BiConsumer<DDMFormInstanceRecord, Date>() {
					@Override
					public void accept(
						DDMFormInstanceRecord ddmFormInstanceRecord,
						Date createDate) {
						ddmFormInstanceRecord.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<DDMFormInstanceRecord, Date>() {
					@Override
					public Date apply(
						DDMFormInstanceRecord ddmFormInstanceRecord) {
						return ddmFormInstanceRecord.getModifiedDate();
					}
				},
				new BiConsumer<DDMFormInstanceRecord, Date>() {
					@Override
					public void accept(
						DDMFormInstanceRecord ddmFormInstanceRecord,
						Date modifiedDate) {
						ddmFormInstanceRecord.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class FormInstanceIdAccessor extends ModelPropertyAccessor {
		public FormInstanceIdAccessor() {
			super(new Function<DDMFormInstanceRecord, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceRecord ddmFormInstanceRecord) {
						return ddmFormInstanceRecord.getFormInstanceId();
					}
				},
				new BiConsumer<DDMFormInstanceRecord, Long>() {
					@Override
					public void accept(
						DDMFormInstanceRecord ddmFormInstanceRecord,
						Long formInstanceId) {
						ddmFormInstanceRecord.setFormInstanceId(formInstanceId);
					}
				});
		}
	}

	public static class FormInstanceVersionAccessor
		extends ModelPropertyAccessor {
		public FormInstanceVersionAccessor() {
			super(new Function<DDMFormInstanceRecord, String>() {
					@Override
					public String apply(
						DDMFormInstanceRecord ddmFormInstanceRecord) {
						return ddmFormInstanceRecord.getFormInstanceVersion();
					}
				},
				new BiConsumer<DDMFormInstanceRecord, String>() {
					@Override
					public void accept(
						DDMFormInstanceRecord ddmFormInstanceRecord,
						String formInstanceVersion) {
						ddmFormInstanceRecord.setFormInstanceVersion(formInstanceVersion);
					}
				});
		}
	}

	public static class StorageIdAccessor extends ModelPropertyAccessor {
		public StorageIdAccessor() {
			super(new Function<DDMFormInstanceRecord, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceRecord ddmFormInstanceRecord) {
						return ddmFormInstanceRecord.getStorageId();
					}
				},
				new BiConsumer<DDMFormInstanceRecord, Long>() {
					@Override
					public void accept(
						DDMFormInstanceRecord ddmFormInstanceRecord,
						Long storageId) {
						ddmFormInstanceRecord.setStorageId(storageId);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<DDMFormInstanceRecord, String>() {
					@Override
					public String apply(
						DDMFormInstanceRecord ddmFormInstanceRecord) {
						return ddmFormInstanceRecord.getVersion();
					}
				},
				new BiConsumer<DDMFormInstanceRecord, String>() {
					@Override
					public void accept(
						DDMFormInstanceRecord ddmFormInstanceRecord,
						String version) {
						ddmFormInstanceRecord.setVersion(version);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<DDMFormInstanceRecord, Date>() {
					@Override
					public Date apply(
						DDMFormInstanceRecord ddmFormInstanceRecord) {
						return ddmFormInstanceRecord.getLastPublishDate();
					}
				},
				new BiConsumer<DDMFormInstanceRecord, Date>() {
					@Override
					public void accept(
						DDMFormInstanceRecord ddmFormInstanceRecord,
						Date lastPublishDate) {
						ddmFormInstanceRecord.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private DDMFormInstanceRecordModelAccessors() {
	}
}