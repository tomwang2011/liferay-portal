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

import com.liferay.dynamic.data.mapping.model.DDMFormInstanceVersion;

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
public class DDMFormInstanceVersionModelAccessors {
	public static class FormInstanceVersionIdAccessor
		extends ModelPropertyAccessor {
		public FormInstanceVersionIdAccessor() {
			super(new Function<DDMFormInstanceVersion, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceVersion ddmFormInstanceVersion) {
						return ddmFormInstanceVersion.getFormInstanceVersionId();
					}
				},
				new BiConsumer<DDMFormInstanceVersion, Long>() {
					@Override
					public void accept(
						DDMFormInstanceVersion ddmFormInstanceVersion,
						Long formInstanceVersionId) {
						ddmFormInstanceVersion.setFormInstanceVersionId(formInstanceVersionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DDMFormInstanceVersion, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceVersion ddmFormInstanceVersion) {
						return ddmFormInstanceVersion.getGroupId();
					}
				},
				new BiConsumer<DDMFormInstanceVersion, Long>() {
					@Override
					public void accept(
						DDMFormInstanceVersion ddmFormInstanceVersion,
						Long groupId) {
						ddmFormInstanceVersion.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDMFormInstanceVersion, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceVersion ddmFormInstanceVersion) {
						return ddmFormInstanceVersion.getCompanyId();
					}
				},
				new BiConsumer<DDMFormInstanceVersion, Long>() {
					@Override
					public void accept(
						DDMFormInstanceVersion ddmFormInstanceVersion,
						Long companyId) {
						ddmFormInstanceVersion.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DDMFormInstanceVersion, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceVersion ddmFormInstanceVersion) {
						return ddmFormInstanceVersion.getUserId();
					}
				},
				new BiConsumer<DDMFormInstanceVersion, Long>() {
					@Override
					public void accept(
						DDMFormInstanceVersion ddmFormInstanceVersion,
						Long userId) {
						ddmFormInstanceVersion.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DDMFormInstanceVersion, String>() {
					@Override
					public String apply(
						DDMFormInstanceVersion ddmFormInstanceVersion) {
						return ddmFormInstanceVersion.getUserName();
					}
				},
				new BiConsumer<DDMFormInstanceVersion, String>() {
					@Override
					public void accept(
						DDMFormInstanceVersion ddmFormInstanceVersion,
						String userName) {
						ddmFormInstanceVersion.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DDMFormInstanceVersion, Date>() {
					@Override
					public Date apply(
						DDMFormInstanceVersion ddmFormInstanceVersion) {
						return ddmFormInstanceVersion.getCreateDate();
					}
				},
				new BiConsumer<DDMFormInstanceVersion, Date>() {
					@Override
					public void accept(
						DDMFormInstanceVersion ddmFormInstanceVersion,
						Date createDate) {
						ddmFormInstanceVersion.setCreateDate(createDate);
					}
				});
		}
	}

	public static class FormInstanceIdAccessor extends ModelPropertyAccessor {
		public FormInstanceIdAccessor() {
			super(new Function<DDMFormInstanceVersion, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceVersion ddmFormInstanceVersion) {
						return ddmFormInstanceVersion.getFormInstanceId();
					}
				},
				new BiConsumer<DDMFormInstanceVersion, Long>() {
					@Override
					public void accept(
						DDMFormInstanceVersion ddmFormInstanceVersion,
						Long formInstanceId) {
						ddmFormInstanceVersion.setFormInstanceId(formInstanceId);
					}
				});
		}
	}

	public static class StructureVersionIdAccessor extends ModelPropertyAccessor {
		public StructureVersionIdAccessor() {
			super(new Function<DDMFormInstanceVersion, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceVersion ddmFormInstanceVersion) {
						return ddmFormInstanceVersion.getStructureVersionId();
					}
				},
				new BiConsumer<DDMFormInstanceVersion, Long>() {
					@Override
					public void accept(
						DDMFormInstanceVersion ddmFormInstanceVersion,
						Long structureVersionId) {
						ddmFormInstanceVersion.setStructureVersionId(structureVersionId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<DDMFormInstanceVersion, String>() {
					@Override
					public String apply(
						DDMFormInstanceVersion ddmFormInstanceVersion) {
						return ddmFormInstanceVersion.getName();
					}
				},
				new BiConsumer<DDMFormInstanceVersion, String>() {
					@Override
					public void accept(
						DDMFormInstanceVersion ddmFormInstanceVersion,
						String name) {
						ddmFormInstanceVersion.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<DDMFormInstanceVersion, String>() {
					@Override
					public String apply(
						DDMFormInstanceVersion ddmFormInstanceVersion) {
						return ddmFormInstanceVersion.getDescription();
					}
				},
				new BiConsumer<DDMFormInstanceVersion, String>() {
					@Override
					public void accept(
						DDMFormInstanceVersion ddmFormInstanceVersion,
						String description) {
						ddmFormInstanceVersion.setDescription(description);
					}
				});
		}
	}

	public static class SettingsAccessor extends ModelPropertyAccessor {
		public SettingsAccessor() {
			super(new Function<DDMFormInstanceVersion, String>() {
					@Override
					public String apply(
						DDMFormInstanceVersion ddmFormInstanceVersion) {
						return ddmFormInstanceVersion.getSettings();
					}
				},
				new BiConsumer<DDMFormInstanceVersion, String>() {
					@Override
					public void accept(
						DDMFormInstanceVersion ddmFormInstanceVersion,
						String settings) {
						ddmFormInstanceVersion.setSettings(settings);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<DDMFormInstanceVersion, String>() {
					@Override
					public String apply(
						DDMFormInstanceVersion ddmFormInstanceVersion) {
						return ddmFormInstanceVersion.getVersion();
					}
				},
				new BiConsumer<DDMFormInstanceVersion, String>() {
					@Override
					public void accept(
						DDMFormInstanceVersion ddmFormInstanceVersion,
						String version) {
						ddmFormInstanceVersion.setVersion(version);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<DDMFormInstanceVersion, Integer>() {
					@Override
					public Integer apply(
						DDMFormInstanceVersion ddmFormInstanceVersion) {
						return ddmFormInstanceVersion.getStatus();
					}
				},
				new BiConsumer<DDMFormInstanceVersion, Integer>() {
					@Override
					public void accept(
						DDMFormInstanceVersion ddmFormInstanceVersion,
						Integer status) {
						ddmFormInstanceVersion.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<DDMFormInstanceVersion, Long>() {
					@Override
					public Long apply(
						DDMFormInstanceVersion ddmFormInstanceVersion) {
						return ddmFormInstanceVersion.getStatusByUserId();
					}
				},
				new BiConsumer<DDMFormInstanceVersion, Long>() {
					@Override
					public void accept(
						DDMFormInstanceVersion ddmFormInstanceVersion,
						Long statusByUserId) {
						ddmFormInstanceVersion.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<DDMFormInstanceVersion, String>() {
					@Override
					public String apply(
						DDMFormInstanceVersion ddmFormInstanceVersion) {
						return ddmFormInstanceVersion.getStatusByUserName();
					}
				},
				new BiConsumer<DDMFormInstanceVersion, String>() {
					@Override
					public void accept(
						DDMFormInstanceVersion ddmFormInstanceVersion,
						String statusByUserName) {
						ddmFormInstanceVersion.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<DDMFormInstanceVersion, Date>() {
					@Override
					public Date apply(
						DDMFormInstanceVersion ddmFormInstanceVersion) {
						return ddmFormInstanceVersion.getStatusDate();
					}
				},
				new BiConsumer<DDMFormInstanceVersion, Date>() {
					@Override
					public void accept(
						DDMFormInstanceVersion ddmFormInstanceVersion,
						Date statusDate) {
						ddmFormInstanceVersion.setStatusDate(statusDate);
					}
				});
		}
	}

	private DDMFormInstanceVersionModelAccessors() {
	}
}