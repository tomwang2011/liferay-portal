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

import com.liferay.dynamic.data.mapping.model.DDMStructureVersion;

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
public class DDMStructureVersionModelAccessors {
	public static class StructureVersionIdAccessor extends ModelPropertyAccessor {
		public StructureVersionIdAccessor() {
			super(new Function<DDMStructureVersion, Long>() {
					@Override
					public Long apply(DDMStructureVersion ddmStructureVersion) {
						return ddmStructureVersion.getStructureVersionId();
					}
				},
				new BiConsumer<DDMStructureVersion, Long>() {
					@Override
					public void accept(
						DDMStructureVersion ddmStructureVersion,
						Long structureVersionId) {
						ddmStructureVersion.setStructureVersionId(structureVersionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DDMStructureVersion, Long>() {
					@Override
					public Long apply(DDMStructureVersion ddmStructureVersion) {
						return ddmStructureVersion.getGroupId();
					}
				},
				new BiConsumer<DDMStructureVersion, Long>() {
					@Override
					public void accept(
						DDMStructureVersion ddmStructureVersion, Long groupId) {
						ddmStructureVersion.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDMStructureVersion, Long>() {
					@Override
					public Long apply(DDMStructureVersion ddmStructureVersion) {
						return ddmStructureVersion.getCompanyId();
					}
				},
				new BiConsumer<DDMStructureVersion, Long>() {
					@Override
					public void accept(
						DDMStructureVersion ddmStructureVersion, Long companyId) {
						ddmStructureVersion.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DDMStructureVersion, Long>() {
					@Override
					public Long apply(DDMStructureVersion ddmStructureVersion) {
						return ddmStructureVersion.getUserId();
					}
				},
				new BiConsumer<DDMStructureVersion, Long>() {
					@Override
					public void accept(
						DDMStructureVersion ddmStructureVersion, Long userId) {
						ddmStructureVersion.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DDMStructureVersion, String>() {
					@Override
					public String apply(DDMStructureVersion ddmStructureVersion) {
						return ddmStructureVersion.getUserName();
					}
				},
				new BiConsumer<DDMStructureVersion, String>() {
					@Override
					public void accept(
						DDMStructureVersion ddmStructureVersion, String userName) {
						ddmStructureVersion.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DDMStructureVersion, Date>() {
					@Override
					public Date apply(DDMStructureVersion ddmStructureVersion) {
						return ddmStructureVersion.getCreateDate();
					}
				},
				new BiConsumer<DDMStructureVersion, Date>() {
					@Override
					public void accept(
						DDMStructureVersion ddmStructureVersion, Date createDate) {
						ddmStructureVersion.setCreateDate(createDate);
					}
				});
		}
	}

	public static class StructureIdAccessor extends ModelPropertyAccessor {
		public StructureIdAccessor() {
			super(new Function<DDMStructureVersion, Long>() {
					@Override
					public Long apply(DDMStructureVersion ddmStructureVersion) {
						return ddmStructureVersion.getStructureId();
					}
				},
				new BiConsumer<DDMStructureVersion, Long>() {
					@Override
					public void accept(
						DDMStructureVersion ddmStructureVersion,
						Long structureId) {
						ddmStructureVersion.setStructureId(structureId);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<DDMStructureVersion, String>() {
					@Override
					public String apply(DDMStructureVersion ddmStructureVersion) {
						return ddmStructureVersion.getVersion();
					}
				},
				new BiConsumer<DDMStructureVersion, String>() {
					@Override
					public void accept(
						DDMStructureVersion ddmStructureVersion, String version) {
						ddmStructureVersion.setVersion(version);
					}
				});
		}
	}

	public static class ParentStructureIdAccessor extends ModelPropertyAccessor {
		public ParentStructureIdAccessor() {
			super(new Function<DDMStructureVersion, Long>() {
					@Override
					public Long apply(DDMStructureVersion ddmStructureVersion) {
						return ddmStructureVersion.getParentStructureId();
					}
				},
				new BiConsumer<DDMStructureVersion, Long>() {
					@Override
					public void accept(
						DDMStructureVersion ddmStructureVersion,
						Long parentStructureId) {
						ddmStructureVersion.setParentStructureId(parentStructureId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<DDMStructureVersion, String>() {
					@Override
					public String apply(DDMStructureVersion ddmStructureVersion) {
						return ddmStructureVersion.getName();
					}
				},
				new BiConsumer<DDMStructureVersion, String>() {
					@Override
					public void accept(
						DDMStructureVersion ddmStructureVersion, String name) {
						ddmStructureVersion.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<DDMStructureVersion, String>() {
					@Override
					public String apply(DDMStructureVersion ddmStructureVersion) {
						return ddmStructureVersion.getDescription();
					}
				},
				new BiConsumer<DDMStructureVersion, String>() {
					@Override
					public void accept(
						DDMStructureVersion ddmStructureVersion,
						String description) {
						ddmStructureVersion.setDescription(description);
					}
				});
		}
	}

	public static class DefinitionAccessor extends ModelPropertyAccessor {
		public DefinitionAccessor() {
			super(new Function<DDMStructureVersion, String>() {
					@Override
					public String apply(DDMStructureVersion ddmStructureVersion) {
						return ddmStructureVersion.getDefinition();
					}
				},
				new BiConsumer<DDMStructureVersion, String>() {
					@Override
					public void accept(
						DDMStructureVersion ddmStructureVersion,
						String definition) {
						ddmStructureVersion.setDefinition(definition);
					}
				});
		}
	}

	public static class StorageTypeAccessor extends ModelPropertyAccessor {
		public StorageTypeAccessor() {
			super(new Function<DDMStructureVersion, String>() {
					@Override
					public String apply(DDMStructureVersion ddmStructureVersion) {
						return ddmStructureVersion.getStorageType();
					}
				},
				new BiConsumer<DDMStructureVersion, String>() {
					@Override
					public void accept(
						DDMStructureVersion ddmStructureVersion,
						String storageType) {
						ddmStructureVersion.setStorageType(storageType);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<DDMStructureVersion, Integer>() {
					@Override
					public Integer apply(
						DDMStructureVersion ddmStructureVersion) {
						return ddmStructureVersion.getType();
					}
				},
				new BiConsumer<DDMStructureVersion, Integer>() {
					@Override
					public void accept(
						DDMStructureVersion ddmStructureVersion, Integer type) {
						ddmStructureVersion.setType(type);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<DDMStructureVersion, Integer>() {
					@Override
					public Integer apply(
						DDMStructureVersion ddmStructureVersion) {
						return ddmStructureVersion.getStatus();
					}
				},
				new BiConsumer<DDMStructureVersion, Integer>() {
					@Override
					public void accept(
						DDMStructureVersion ddmStructureVersion, Integer status) {
						ddmStructureVersion.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<DDMStructureVersion, Long>() {
					@Override
					public Long apply(DDMStructureVersion ddmStructureVersion) {
						return ddmStructureVersion.getStatusByUserId();
					}
				},
				new BiConsumer<DDMStructureVersion, Long>() {
					@Override
					public void accept(
						DDMStructureVersion ddmStructureVersion,
						Long statusByUserId) {
						ddmStructureVersion.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<DDMStructureVersion, String>() {
					@Override
					public String apply(DDMStructureVersion ddmStructureVersion) {
						return ddmStructureVersion.getStatusByUserName();
					}
				},
				new BiConsumer<DDMStructureVersion, String>() {
					@Override
					public void accept(
						DDMStructureVersion ddmStructureVersion,
						String statusByUserName) {
						ddmStructureVersion.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<DDMStructureVersion, Date>() {
					@Override
					public Date apply(DDMStructureVersion ddmStructureVersion) {
						return ddmStructureVersion.getStatusDate();
					}
				},
				new BiConsumer<DDMStructureVersion, Date>() {
					@Override
					public void accept(
						DDMStructureVersion ddmStructureVersion, Date statusDate) {
						ddmStructureVersion.setStatusDate(statusDate);
					}
				});
		}
	}

	private DDMStructureVersionModelAccessors() {
	}
}