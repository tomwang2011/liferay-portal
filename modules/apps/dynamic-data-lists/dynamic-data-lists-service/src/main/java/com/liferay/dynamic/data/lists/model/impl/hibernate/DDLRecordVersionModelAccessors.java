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

import com.liferay.dynamic.data.lists.model.DDLRecordVersion;

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
public class DDLRecordVersionModelAccessors {
	public static class RecordVersionIdAccessor extends ModelPropertyAccessor {
		public RecordVersionIdAccessor() {
			super(new Function<DDLRecordVersion, Long>() {
					@Override
					public Long apply(DDLRecordVersion ddlRecordVersion) {
						return ddlRecordVersion.getRecordVersionId();
					}
				},
				new BiConsumer<DDLRecordVersion, Long>() {
					@Override
					public void accept(DDLRecordVersion ddlRecordVersion,
						Long recordVersionId) {
						ddlRecordVersion.setRecordVersionId(recordVersionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DDLRecordVersion, Long>() {
					@Override
					public Long apply(DDLRecordVersion ddlRecordVersion) {
						return ddlRecordVersion.getGroupId();
					}
				},
				new BiConsumer<DDLRecordVersion, Long>() {
					@Override
					public void accept(DDLRecordVersion ddlRecordVersion,
						Long groupId) {
						ddlRecordVersion.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDLRecordVersion, Long>() {
					@Override
					public Long apply(DDLRecordVersion ddlRecordVersion) {
						return ddlRecordVersion.getCompanyId();
					}
				},
				new BiConsumer<DDLRecordVersion, Long>() {
					@Override
					public void accept(DDLRecordVersion ddlRecordVersion,
						Long companyId) {
						ddlRecordVersion.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DDLRecordVersion, Long>() {
					@Override
					public Long apply(DDLRecordVersion ddlRecordVersion) {
						return ddlRecordVersion.getUserId();
					}
				},
				new BiConsumer<DDLRecordVersion, Long>() {
					@Override
					public void accept(DDLRecordVersion ddlRecordVersion,
						Long userId) {
						ddlRecordVersion.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DDLRecordVersion, String>() {
					@Override
					public String apply(DDLRecordVersion ddlRecordVersion) {
						return ddlRecordVersion.getUserName();
					}
				},
				new BiConsumer<DDLRecordVersion, String>() {
					@Override
					public void accept(DDLRecordVersion ddlRecordVersion,
						String userName) {
						ddlRecordVersion.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DDLRecordVersion, Date>() {
					@Override
					public Date apply(DDLRecordVersion ddlRecordVersion) {
						return ddlRecordVersion.getCreateDate();
					}
				},
				new BiConsumer<DDLRecordVersion, Date>() {
					@Override
					public void accept(DDLRecordVersion ddlRecordVersion,
						Date createDate) {
						ddlRecordVersion.setCreateDate(createDate);
					}
				});
		}
	}

	public static class DDMStorageIdAccessor extends ModelPropertyAccessor {
		public DDMStorageIdAccessor() {
			super(new Function<DDLRecordVersion, Long>() {
					@Override
					public Long apply(DDLRecordVersion ddlRecordVersion) {
						return ddlRecordVersion.getDDMStorageId();
					}
				},
				new BiConsumer<DDLRecordVersion, Long>() {
					@Override
					public void accept(DDLRecordVersion ddlRecordVersion,
						Long DDMStorageId) {
						ddlRecordVersion.setDDMStorageId(DDMStorageId);
					}
				});
		}
	}

	public static class RecordSetIdAccessor extends ModelPropertyAccessor {
		public RecordSetIdAccessor() {
			super(new Function<DDLRecordVersion, Long>() {
					@Override
					public Long apply(DDLRecordVersion ddlRecordVersion) {
						return ddlRecordVersion.getRecordSetId();
					}
				},
				new BiConsumer<DDLRecordVersion, Long>() {
					@Override
					public void accept(DDLRecordVersion ddlRecordVersion,
						Long recordSetId) {
						ddlRecordVersion.setRecordSetId(recordSetId);
					}
				});
		}
	}

	public static class RecordSetVersionAccessor extends ModelPropertyAccessor {
		public RecordSetVersionAccessor() {
			super(new Function<DDLRecordVersion, String>() {
					@Override
					public String apply(DDLRecordVersion ddlRecordVersion) {
						return ddlRecordVersion.getRecordSetVersion();
					}
				},
				new BiConsumer<DDLRecordVersion, String>() {
					@Override
					public void accept(DDLRecordVersion ddlRecordVersion,
						String recordSetVersion) {
						ddlRecordVersion.setRecordSetVersion(recordSetVersion);
					}
				});
		}
	}

	public static class RecordIdAccessor extends ModelPropertyAccessor {
		public RecordIdAccessor() {
			super(new Function<DDLRecordVersion, Long>() {
					@Override
					public Long apply(DDLRecordVersion ddlRecordVersion) {
						return ddlRecordVersion.getRecordId();
					}
				},
				new BiConsumer<DDLRecordVersion, Long>() {
					@Override
					public void accept(DDLRecordVersion ddlRecordVersion,
						Long recordId) {
						ddlRecordVersion.setRecordId(recordId);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<DDLRecordVersion, String>() {
					@Override
					public String apply(DDLRecordVersion ddlRecordVersion) {
						return ddlRecordVersion.getVersion();
					}
				},
				new BiConsumer<DDLRecordVersion, String>() {
					@Override
					public void accept(DDLRecordVersion ddlRecordVersion,
						String version) {
						ddlRecordVersion.setVersion(version);
					}
				});
		}
	}

	public static class DisplayIndexAccessor extends ModelPropertyAccessor {
		public DisplayIndexAccessor() {
			super(new Function<DDLRecordVersion, Integer>() {
					@Override
					public Integer apply(DDLRecordVersion ddlRecordVersion) {
						return ddlRecordVersion.getDisplayIndex();
					}
				},
				new BiConsumer<DDLRecordVersion, Integer>() {
					@Override
					public void accept(DDLRecordVersion ddlRecordVersion,
						Integer displayIndex) {
						ddlRecordVersion.setDisplayIndex(displayIndex);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<DDLRecordVersion, Integer>() {
					@Override
					public Integer apply(DDLRecordVersion ddlRecordVersion) {
						return ddlRecordVersion.getStatus();
					}
				},
				new BiConsumer<DDLRecordVersion, Integer>() {
					@Override
					public void accept(DDLRecordVersion ddlRecordVersion,
						Integer status) {
						ddlRecordVersion.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<DDLRecordVersion, Long>() {
					@Override
					public Long apply(DDLRecordVersion ddlRecordVersion) {
						return ddlRecordVersion.getStatusByUserId();
					}
				},
				new BiConsumer<DDLRecordVersion, Long>() {
					@Override
					public void accept(DDLRecordVersion ddlRecordVersion,
						Long statusByUserId) {
						ddlRecordVersion.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<DDLRecordVersion, String>() {
					@Override
					public String apply(DDLRecordVersion ddlRecordVersion) {
						return ddlRecordVersion.getStatusByUserName();
					}
				},
				new BiConsumer<DDLRecordVersion, String>() {
					@Override
					public void accept(DDLRecordVersion ddlRecordVersion,
						String statusByUserName) {
						ddlRecordVersion.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<DDLRecordVersion, Date>() {
					@Override
					public Date apply(DDLRecordVersion ddlRecordVersion) {
						return ddlRecordVersion.getStatusDate();
					}
				},
				new BiConsumer<DDLRecordVersion, Date>() {
					@Override
					public void accept(DDLRecordVersion ddlRecordVersion,
						Date statusDate) {
						ddlRecordVersion.setStatusDate(statusDate);
					}
				});
		}
	}

	private DDLRecordVersionModelAccessors() {
	}
}