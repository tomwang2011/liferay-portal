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

package com.liferay.dynamic.data.lists.model.impl.hibernate;

import com.liferay.dynamic.data.lists.model.DDLRecord;

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
public class DDLRecordModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<DDLRecord, String>() {
					@Override
					public String apply(DDLRecord ddlRecord) {
						return ddlRecord.getUuid();
					}
				},
				new BiConsumer<DDLRecord, String>() {
					@Override
					public void accept(DDLRecord ddlRecord, String uuid) {
						ddlRecord.setUuid(uuid);
					}
				});
		}
	}

	public static class RecordIdAccessor extends ModelPropertyAccessor {
		public RecordIdAccessor() {
			super(new Function<DDLRecord, Long>() {
					@Override
					public Long apply(DDLRecord ddlRecord) {
						return ddlRecord.getRecordId();
					}
				},
				new BiConsumer<DDLRecord, Long>() {
					@Override
					public void accept(DDLRecord ddlRecord, Long recordId) {
						ddlRecord.setRecordId(recordId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DDLRecord, Long>() {
					@Override
					public Long apply(DDLRecord ddlRecord) {
						return ddlRecord.getGroupId();
					}
				},
				new BiConsumer<DDLRecord, Long>() {
					@Override
					public void accept(DDLRecord ddlRecord, Long groupId) {
						ddlRecord.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDLRecord, Long>() {
					@Override
					public Long apply(DDLRecord ddlRecord) {
						return ddlRecord.getCompanyId();
					}
				},
				new BiConsumer<DDLRecord, Long>() {
					@Override
					public void accept(DDLRecord ddlRecord, Long companyId) {
						ddlRecord.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DDLRecord, Long>() {
					@Override
					public Long apply(DDLRecord ddlRecord) {
						return ddlRecord.getUserId();
					}
				},
				new BiConsumer<DDLRecord, Long>() {
					@Override
					public void accept(DDLRecord ddlRecord, Long userId) {
						ddlRecord.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DDLRecord, String>() {
					@Override
					public String apply(DDLRecord ddlRecord) {
						return ddlRecord.getUserName();
					}
				},
				new BiConsumer<DDLRecord, String>() {
					@Override
					public void accept(DDLRecord ddlRecord, String userName) {
						ddlRecord.setUserName(userName);
					}
				});
		}
	}

	public static class VersionUserIdAccessor extends ModelPropertyAccessor {
		public VersionUserIdAccessor() {
			super(new Function<DDLRecord, Long>() {
					@Override
					public Long apply(DDLRecord ddlRecord) {
						return ddlRecord.getVersionUserId();
					}
				},
				new BiConsumer<DDLRecord, Long>() {
					@Override
					public void accept(DDLRecord ddlRecord, Long versionUserId) {
						ddlRecord.setVersionUserId(versionUserId);
					}
				});
		}
	}

	public static class VersionUserNameAccessor extends ModelPropertyAccessor {
		public VersionUserNameAccessor() {
			super(new Function<DDLRecord, String>() {
					@Override
					public String apply(DDLRecord ddlRecord) {
						return ddlRecord.getVersionUserName();
					}
				},
				new BiConsumer<DDLRecord, String>() {
					@Override
					public void accept(DDLRecord ddlRecord,
						String versionUserName) {
						ddlRecord.setVersionUserName(versionUserName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DDLRecord, Date>() {
					@Override
					public Date apply(DDLRecord ddlRecord) {
						return ddlRecord.getCreateDate();
					}
				},
				new BiConsumer<DDLRecord, Date>() {
					@Override
					public void accept(DDLRecord ddlRecord, Date createDate) {
						ddlRecord.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<DDLRecord, Date>() {
					@Override
					public Date apply(DDLRecord ddlRecord) {
						return ddlRecord.getModifiedDate();
					}
				},
				new BiConsumer<DDLRecord, Date>() {
					@Override
					public void accept(DDLRecord ddlRecord, Date modifiedDate) {
						ddlRecord.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class DDMStorageIdAccessor extends ModelPropertyAccessor {
		public DDMStorageIdAccessor() {
			super(new Function<DDLRecord, Long>() {
					@Override
					public Long apply(DDLRecord ddlRecord) {
						return ddlRecord.getDDMStorageId();
					}
				},
				new BiConsumer<DDLRecord, Long>() {
					@Override
					public void accept(DDLRecord ddlRecord, Long DDMStorageId) {
						ddlRecord.setDDMStorageId(DDMStorageId);
					}
				});
		}
	}

	public static class RecordSetIdAccessor extends ModelPropertyAccessor {
		public RecordSetIdAccessor() {
			super(new Function<DDLRecord, Long>() {
					@Override
					public Long apply(DDLRecord ddlRecord) {
						return ddlRecord.getRecordSetId();
					}
				},
				new BiConsumer<DDLRecord, Long>() {
					@Override
					public void accept(DDLRecord ddlRecord, Long recordSetId) {
						ddlRecord.setRecordSetId(recordSetId);
					}
				});
		}
	}

	public static class RecordSetVersionAccessor extends ModelPropertyAccessor {
		public RecordSetVersionAccessor() {
			super(new Function<DDLRecord, String>() {
					@Override
					public String apply(DDLRecord ddlRecord) {
						return ddlRecord.getRecordSetVersion();
					}
				},
				new BiConsumer<DDLRecord, String>() {
					@Override
					public void accept(DDLRecord ddlRecord,
						String recordSetVersion) {
						ddlRecord.setRecordSetVersion(recordSetVersion);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<DDLRecord, String>() {
					@Override
					public String apply(DDLRecord ddlRecord) {
						return ddlRecord.getVersion();
					}
				},
				new BiConsumer<DDLRecord, String>() {
					@Override
					public void accept(DDLRecord ddlRecord, String version) {
						ddlRecord.setVersion(version);
					}
				});
		}
	}

	public static class DisplayIndexAccessor extends ModelPropertyAccessor {
		public DisplayIndexAccessor() {
			super(new Function<DDLRecord, Integer>() {
					@Override
					public Integer apply(DDLRecord ddlRecord) {
						return ddlRecord.getDisplayIndex();
					}
				},
				new BiConsumer<DDLRecord, Integer>() {
					@Override
					public void accept(DDLRecord ddlRecord, Integer displayIndex) {
						ddlRecord.setDisplayIndex(displayIndex);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<DDLRecord, Date>() {
					@Override
					public Date apply(DDLRecord ddlRecord) {
						return ddlRecord.getLastPublishDate();
					}
				},
				new BiConsumer<DDLRecord, Date>() {
					@Override
					public void accept(DDLRecord ddlRecord, Date lastPublishDate) {
						ddlRecord.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private DDLRecordModelAccessors() {
	}
}