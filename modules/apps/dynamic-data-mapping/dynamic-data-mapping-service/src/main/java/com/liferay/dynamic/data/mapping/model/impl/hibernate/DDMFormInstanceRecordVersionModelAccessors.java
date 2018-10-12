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

import com.liferay.dynamic.data.mapping.model.DDMFormInstanceRecordVersion;

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
public class DDMFormInstanceRecordVersionModelAccessors {
	public static class FormInstanceRecordVersionIdAccessor
		extends ModelPropertyAccessor {
		public FormInstanceRecordVersionIdAccessor() {
			super(new Function<DDMFormInstanceRecordVersion, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion) {
						return ddmFormInstanceRecordVersion.getFormInstanceRecordVersionId();
					}
				},
				new BiConsumer<DDMFormInstanceRecordVersion, Long>() {
					@Override
					public void accept(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion,
						Long formInstanceRecordVersionId) {
						ddmFormInstanceRecordVersion.setFormInstanceRecordVersionId(formInstanceRecordVersionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DDMFormInstanceRecordVersion, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion) {
						return ddmFormInstanceRecordVersion.getGroupId();
					}
				},
				new BiConsumer<DDMFormInstanceRecordVersion, Long>() {
					@Override
					public void accept(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion,
						Long groupId) {
						ddmFormInstanceRecordVersion.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDMFormInstanceRecordVersion, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion) {
						return ddmFormInstanceRecordVersion.getCompanyId();
					}
				},
				new BiConsumer<DDMFormInstanceRecordVersion, Long>() {
					@Override
					public void accept(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion,
						Long companyId) {
						ddmFormInstanceRecordVersion.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DDMFormInstanceRecordVersion, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion) {
						return ddmFormInstanceRecordVersion.getUserId();
					}
				},
				new BiConsumer<DDMFormInstanceRecordVersion, Long>() {
					@Override
					public void accept(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion,
						Long userId) {
						ddmFormInstanceRecordVersion.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DDMFormInstanceRecordVersion, String>() {
					@Override
					public String apply(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion) {
						return ddmFormInstanceRecordVersion.getUserName();
					}
				},
				new BiConsumer<DDMFormInstanceRecordVersion, String>() {
					@Override
					public void accept(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion,
						String userName) {
						ddmFormInstanceRecordVersion.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DDMFormInstanceRecordVersion, Date>() {
					@Override
					public Date apply(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion) {
						return ddmFormInstanceRecordVersion.getCreateDate();
					}
				},
				new BiConsumer<DDMFormInstanceRecordVersion, Date>() {
					@Override
					public void accept(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion,
						Date createDate) {
						ddmFormInstanceRecordVersion.setCreateDate(createDate);
					}
				});
		}
	}

	public static class FormInstanceIdAccessor extends ModelPropertyAccessor {
		public FormInstanceIdAccessor() {
			super(new Function<DDMFormInstanceRecordVersion, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion) {
						return ddmFormInstanceRecordVersion.getFormInstanceId();
					}
				},
				new BiConsumer<DDMFormInstanceRecordVersion, Long>() {
					@Override
					public void accept(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion,
						Long formInstanceId) {
						ddmFormInstanceRecordVersion.setFormInstanceId(formInstanceId);
					}
				});
		}
	}

	public static class FormInstanceVersionAccessor
		extends ModelPropertyAccessor {
		public FormInstanceVersionAccessor() {
			super(new Function<DDMFormInstanceRecordVersion, String>() {
					@Override
					public String apply(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion) {
						return ddmFormInstanceRecordVersion.getFormInstanceVersion();
					}
				},
				new BiConsumer<DDMFormInstanceRecordVersion, String>() {
					@Override
					public void accept(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion,
						String formInstanceVersion) {
						ddmFormInstanceRecordVersion.setFormInstanceVersion(formInstanceVersion);
					}
				});
		}
	}

	public static class FormInstanceRecordIdAccessor
		extends ModelPropertyAccessor {
		public FormInstanceRecordIdAccessor() {
			super(new Function<DDMFormInstanceRecordVersion, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion) {
						return ddmFormInstanceRecordVersion.getFormInstanceRecordId();
					}
				},
				new BiConsumer<DDMFormInstanceRecordVersion, Long>() {
					@Override
					public void accept(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion,
						Long formInstanceRecordId) {
						ddmFormInstanceRecordVersion.setFormInstanceRecordId(formInstanceRecordId);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<DDMFormInstanceRecordVersion, String>() {
					@Override
					public String apply(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion) {
						return ddmFormInstanceRecordVersion.getVersion();
					}
				},
				new BiConsumer<DDMFormInstanceRecordVersion, String>() {
					@Override
					public void accept(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion,
						String version) {
						ddmFormInstanceRecordVersion.setVersion(version);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<DDMFormInstanceRecordVersion, Integer>() {
					@Override
					public Integer apply(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion) {
						return ddmFormInstanceRecordVersion.getStatus();
					}
				},
				new BiConsumer<DDMFormInstanceRecordVersion, Integer>() {
					@Override
					public void accept(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion,
						Integer status) {
						ddmFormInstanceRecordVersion.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<DDMFormInstanceRecordVersion, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion) {
						return ddmFormInstanceRecordVersion.getStatusByUserId();
					}
				},
				new BiConsumer<DDMFormInstanceRecordVersion, Long>() {
					@Override
					public void accept(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion,
						Long statusByUserId) {
						ddmFormInstanceRecordVersion.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<DDMFormInstanceRecordVersion, String>() {
					@Override
					public String apply(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion) {
						return ddmFormInstanceRecordVersion.getStatusByUserName();
					}
				},
				new BiConsumer<DDMFormInstanceRecordVersion, String>() {
					@Override
					public void accept(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion,
						String statusByUserName) {
						ddmFormInstanceRecordVersion.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<DDMFormInstanceRecordVersion, Date>() {
					@Override
					public Date apply(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion) {
						return ddmFormInstanceRecordVersion.getStatusDate();
					}
				},
				new BiConsumer<DDMFormInstanceRecordVersion, Date>() {
					@Override
					public void accept(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion,
						Date statusDate) {
						ddmFormInstanceRecordVersion.setStatusDate(statusDate);
					}
				});
		}
	}

	public static class StorageIdAccessor extends ModelPropertyAccessor {
		public StorageIdAccessor() {
			super(new Function<DDMFormInstanceRecordVersion, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion) {
						return ddmFormInstanceRecordVersion.getStorageId();
					}
				},
				new BiConsumer<DDMFormInstanceRecordVersion, Long>() {
					@Override
					public void accept(
						DDMFormInstanceRecordVersion ddmFormInstanceRecordVersion,
						Long storageId) {
						ddmFormInstanceRecordVersion.setStorageId(storageId);
					}
				});
		}
	}

	private DDMFormInstanceRecordVersionModelAccessors() {
	}
}