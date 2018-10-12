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

import com.liferay.dynamic.data.lists.model.DDLRecordSetVersion;

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
public class DDLRecordSetVersionModelAccessors {
	public static class RecordSetVersionIdAccessor extends ModelPropertyAccessor {
		public RecordSetVersionIdAccessor() {
			super(new Function<DDLRecordSetVersion, Long>() {
					@Override
					public Long apply(DDLRecordSetVersion ddlRecordSetVersion) {
						return ddlRecordSetVersion.getRecordSetVersionId();
					}
				},
				new BiConsumer<DDLRecordSetVersion, Long>() {
					@Override
					public void accept(
						DDLRecordSetVersion ddlRecordSetVersion,
						Long recordSetVersionId) {
						ddlRecordSetVersion.setRecordSetVersionId(recordSetVersionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DDLRecordSetVersion, Long>() {
					@Override
					public Long apply(DDLRecordSetVersion ddlRecordSetVersion) {
						return ddlRecordSetVersion.getGroupId();
					}
				},
				new BiConsumer<DDLRecordSetVersion, Long>() {
					@Override
					public void accept(
						DDLRecordSetVersion ddlRecordSetVersion, Long groupId) {
						ddlRecordSetVersion.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDLRecordSetVersion, Long>() {
					@Override
					public Long apply(DDLRecordSetVersion ddlRecordSetVersion) {
						return ddlRecordSetVersion.getCompanyId();
					}
				},
				new BiConsumer<DDLRecordSetVersion, Long>() {
					@Override
					public void accept(
						DDLRecordSetVersion ddlRecordSetVersion, Long companyId) {
						ddlRecordSetVersion.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DDLRecordSetVersion, Long>() {
					@Override
					public Long apply(DDLRecordSetVersion ddlRecordSetVersion) {
						return ddlRecordSetVersion.getUserId();
					}
				},
				new BiConsumer<DDLRecordSetVersion, Long>() {
					@Override
					public void accept(
						DDLRecordSetVersion ddlRecordSetVersion, Long userId) {
						ddlRecordSetVersion.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DDLRecordSetVersion, String>() {
					@Override
					public String apply(DDLRecordSetVersion ddlRecordSetVersion) {
						return ddlRecordSetVersion.getUserName();
					}
				},
				new BiConsumer<DDLRecordSetVersion, String>() {
					@Override
					public void accept(
						DDLRecordSetVersion ddlRecordSetVersion, String userName) {
						ddlRecordSetVersion.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DDLRecordSetVersion, Date>() {
					@Override
					public Date apply(DDLRecordSetVersion ddlRecordSetVersion) {
						return ddlRecordSetVersion.getCreateDate();
					}
				},
				new BiConsumer<DDLRecordSetVersion, Date>() {
					@Override
					public void accept(
						DDLRecordSetVersion ddlRecordSetVersion, Date createDate) {
						ddlRecordSetVersion.setCreateDate(createDate);
					}
				});
		}
	}

	public static class RecordSetIdAccessor extends ModelPropertyAccessor {
		public RecordSetIdAccessor() {
			super(new Function<DDLRecordSetVersion, Long>() {
					@Override
					public Long apply(DDLRecordSetVersion ddlRecordSetVersion) {
						return ddlRecordSetVersion.getRecordSetId();
					}
				},
				new BiConsumer<DDLRecordSetVersion, Long>() {
					@Override
					public void accept(
						DDLRecordSetVersion ddlRecordSetVersion,
						Long recordSetId) {
						ddlRecordSetVersion.setRecordSetId(recordSetId);
					}
				});
		}
	}

	public static class DDMStructureVersionIdAccessor
		extends ModelPropertyAccessor {
		public DDMStructureVersionIdAccessor() {
			super(new Function<DDLRecordSetVersion, Long>() {
					@Override
					public Long apply(DDLRecordSetVersion ddlRecordSetVersion) {
						return ddlRecordSetVersion.getDDMStructureVersionId();
					}
				},
				new BiConsumer<DDLRecordSetVersion, Long>() {
					@Override
					public void accept(
						DDLRecordSetVersion ddlRecordSetVersion,
						Long DDMStructureVersionId) {
						ddlRecordSetVersion.setDDMStructureVersionId(DDMStructureVersionId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<DDLRecordSetVersion, String>() {
					@Override
					public String apply(DDLRecordSetVersion ddlRecordSetVersion) {
						return ddlRecordSetVersion.getName();
					}
				},
				new BiConsumer<DDLRecordSetVersion, String>() {
					@Override
					public void accept(
						DDLRecordSetVersion ddlRecordSetVersion, String name) {
						ddlRecordSetVersion.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<DDLRecordSetVersion, String>() {
					@Override
					public String apply(DDLRecordSetVersion ddlRecordSetVersion) {
						return ddlRecordSetVersion.getDescription();
					}
				},
				new BiConsumer<DDLRecordSetVersion, String>() {
					@Override
					public void accept(
						DDLRecordSetVersion ddlRecordSetVersion,
						String description) {
						ddlRecordSetVersion.setDescription(description);
					}
				});
		}
	}

	public static class SettingsAccessor extends ModelPropertyAccessor {
		public SettingsAccessor() {
			super(new Function<DDLRecordSetVersion, String>() {
					@Override
					public String apply(DDLRecordSetVersion ddlRecordSetVersion) {
						return ddlRecordSetVersion.getSettings();
					}
				},
				new BiConsumer<DDLRecordSetVersion, String>() {
					@Override
					public void accept(
						DDLRecordSetVersion ddlRecordSetVersion, String settings) {
						ddlRecordSetVersion.setSettings(settings);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<DDLRecordSetVersion, String>() {
					@Override
					public String apply(DDLRecordSetVersion ddlRecordSetVersion) {
						return ddlRecordSetVersion.getVersion();
					}
				},
				new BiConsumer<DDLRecordSetVersion, String>() {
					@Override
					public void accept(
						DDLRecordSetVersion ddlRecordSetVersion, String version) {
						ddlRecordSetVersion.setVersion(version);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<DDLRecordSetVersion, Integer>() {
					@Override
					public Integer apply(
						DDLRecordSetVersion ddlRecordSetVersion) {
						return ddlRecordSetVersion.getStatus();
					}
				},
				new BiConsumer<DDLRecordSetVersion, Integer>() {
					@Override
					public void accept(
						DDLRecordSetVersion ddlRecordSetVersion, Integer status) {
						ddlRecordSetVersion.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<DDLRecordSetVersion, Long>() {
					@Override
					public Long apply(DDLRecordSetVersion ddlRecordSetVersion) {
						return ddlRecordSetVersion.getStatusByUserId();
					}
				},
				new BiConsumer<DDLRecordSetVersion, Long>() {
					@Override
					public void accept(
						DDLRecordSetVersion ddlRecordSetVersion,
						Long statusByUserId) {
						ddlRecordSetVersion.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<DDLRecordSetVersion, String>() {
					@Override
					public String apply(DDLRecordSetVersion ddlRecordSetVersion) {
						return ddlRecordSetVersion.getStatusByUserName();
					}
				},
				new BiConsumer<DDLRecordSetVersion, String>() {
					@Override
					public void accept(
						DDLRecordSetVersion ddlRecordSetVersion,
						String statusByUserName) {
						ddlRecordSetVersion.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<DDLRecordSetVersion, Date>() {
					@Override
					public Date apply(DDLRecordSetVersion ddlRecordSetVersion) {
						return ddlRecordSetVersion.getStatusDate();
					}
				},
				new BiConsumer<DDLRecordSetVersion, Date>() {
					@Override
					public void accept(
						DDLRecordSetVersion ddlRecordSetVersion, Date statusDate) {
						ddlRecordSetVersion.setStatusDate(statusDate);
					}
				});
		}
	}

	private DDLRecordSetVersionModelAccessors() {
	}
}