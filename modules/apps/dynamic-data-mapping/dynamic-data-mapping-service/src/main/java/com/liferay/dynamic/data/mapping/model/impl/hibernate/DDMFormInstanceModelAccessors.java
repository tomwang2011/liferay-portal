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

import com.liferay.dynamic.data.mapping.model.DDMFormInstance;

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
public class DDMFormInstanceModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<DDMFormInstance, String>() {
					@Override
					public String apply(DDMFormInstance ddmFormInstance) {
						return ddmFormInstance.getUuid();
					}
				},
				new BiConsumer<DDMFormInstance, String>() {
					@Override
					public void accept(DDMFormInstance ddmFormInstance,
						String uuid) {
						ddmFormInstance.setUuid(uuid);
					}
				});
		}
	}

	public static class FormInstanceIdAccessor extends ModelPropertyAccessor {
		public FormInstanceIdAccessor() {
			super(new Function<DDMFormInstance, Long>() {
					@Override
					public Long apply(DDMFormInstance ddmFormInstance) {
						return ddmFormInstance.getFormInstanceId();
					}
				},
				new BiConsumer<DDMFormInstance, Long>() {
					@Override
					public void accept(DDMFormInstance ddmFormInstance,
						Long formInstanceId) {
						ddmFormInstance.setFormInstanceId(formInstanceId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DDMFormInstance, Long>() {
					@Override
					public Long apply(DDMFormInstance ddmFormInstance) {
						return ddmFormInstance.getGroupId();
					}
				},
				new BiConsumer<DDMFormInstance, Long>() {
					@Override
					public void accept(DDMFormInstance ddmFormInstance,
						Long groupId) {
						ddmFormInstance.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDMFormInstance, Long>() {
					@Override
					public Long apply(DDMFormInstance ddmFormInstance) {
						return ddmFormInstance.getCompanyId();
					}
				},
				new BiConsumer<DDMFormInstance, Long>() {
					@Override
					public void accept(DDMFormInstance ddmFormInstance,
						Long companyId) {
						ddmFormInstance.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DDMFormInstance, Long>() {
					@Override
					public Long apply(DDMFormInstance ddmFormInstance) {
						return ddmFormInstance.getUserId();
					}
				},
				new BiConsumer<DDMFormInstance, Long>() {
					@Override
					public void accept(DDMFormInstance ddmFormInstance,
						Long userId) {
						ddmFormInstance.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DDMFormInstance, String>() {
					@Override
					public String apply(DDMFormInstance ddmFormInstance) {
						return ddmFormInstance.getUserName();
					}
				},
				new BiConsumer<DDMFormInstance, String>() {
					@Override
					public void accept(DDMFormInstance ddmFormInstance,
						String userName) {
						ddmFormInstance.setUserName(userName);
					}
				});
		}
	}

	public static class VersionUserIdAccessor extends ModelPropertyAccessor {
		public VersionUserIdAccessor() {
			super(new Function<DDMFormInstance, Long>() {
					@Override
					public Long apply(DDMFormInstance ddmFormInstance) {
						return ddmFormInstance.getVersionUserId();
					}
				},
				new BiConsumer<DDMFormInstance, Long>() {
					@Override
					public void accept(DDMFormInstance ddmFormInstance,
						Long versionUserId) {
						ddmFormInstance.setVersionUserId(versionUserId);
					}
				});
		}
	}

	public static class VersionUserNameAccessor extends ModelPropertyAccessor {
		public VersionUserNameAccessor() {
			super(new Function<DDMFormInstance, String>() {
					@Override
					public String apply(DDMFormInstance ddmFormInstance) {
						return ddmFormInstance.getVersionUserName();
					}
				},
				new BiConsumer<DDMFormInstance, String>() {
					@Override
					public void accept(DDMFormInstance ddmFormInstance,
						String versionUserName) {
						ddmFormInstance.setVersionUserName(versionUserName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DDMFormInstance, Date>() {
					@Override
					public Date apply(DDMFormInstance ddmFormInstance) {
						return ddmFormInstance.getCreateDate();
					}
				},
				new BiConsumer<DDMFormInstance, Date>() {
					@Override
					public void accept(DDMFormInstance ddmFormInstance,
						Date createDate) {
						ddmFormInstance.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<DDMFormInstance, Date>() {
					@Override
					public Date apply(DDMFormInstance ddmFormInstance) {
						return ddmFormInstance.getModifiedDate();
					}
				},
				new BiConsumer<DDMFormInstance, Date>() {
					@Override
					public void accept(DDMFormInstance ddmFormInstance,
						Date modifiedDate) {
						ddmFormInstance.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class StructureIdAccessor extends ModelPropertyAccessor {
		public StructureIdAccessor() {
			super(new Function<DDMFormInstance, Long>() {
					@Override
					public Long apply(DDMFormInstance ddmFormInstance) {
						return ddmFormInstance.getStructureId();
					}
				},
				new BiConsumer<DDMFormInstance, Long>() {
					@Override
					public void accept(DDMFormInstance ddmFormInstance,
						Long structureId) {
						ddmFormInstance.setStructureId(structureId);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<DDMFormInstance, String>() {
					@Override
					public String apply(DDMFormInstance ddmFormInstance) {
						return ddmFormInstance.getVersion();
					}
				},
				new BiConsumer<DDMFormInstance, String>() {
					@Override
					public void accept(DDMFormInstance ddmFormInstance,
						String version) {
						ddmFormInstance.setVersion(version);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<DDMFormInstance, String>() {
					@Override
					public String apply(DDMFormInstance ddmFormInstance) {
						return ddmFormInstance.getName();
					}
				},
				new BiConsumer<DDMFormInstance, String>() {
					@Override
					public void accept(DDMFormInstance ddmFormInstance,
						String name) {
						ddmFormInstance.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<DDMFormInstance, String>() {
					@Override
					public String apply(DDMFormInstance ddmFormInstance) {
						return ddmFormInstance.getDescription();
					}
				},
				new BiConsumer<DDMFormInstance, String>() {
					@Override
					public void accept(DDMFormInstance ddmFormInstance,
						String description) {
						ddmFormInstance.setDescription(description);
					}
				});
		}
	}

	public static class SettingsAccessor extends ModelPropertyAccessor {
		public SettingsAccessor() {
			super(new Function<DDMFormInstance, String>() {
					@Override
					public String apply(DDMFormInstance ddmFormInstance) {
						return ddmFormInstance.getSettings();
					}
				},
				new BiConsumer<DDMFormInstance, String>() {
					@Override
					public void accept(DDMFormInstance ddmFormInstance,
						String settings) {
						ddmFormInstance.setSettings(settings);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<DDMFormInstance, Date>() {
					@Override
					public Date apply(DDMFormInstance ddmFormInstance) {
						return ddmFormInstance.getLastPublishDate();
					}
				},
				new BiConsumer<DDMFormInstance, Date>() {
					@Override
					public void accept(DDMFormInstance ddmFormInstance,
						Date lastPublishDate) {
						ddmFormInstance.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private DDMFormInstanceModelAccessors() {
	}
}