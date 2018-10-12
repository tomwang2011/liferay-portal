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

import com.liferay.dynamic.data.mapping.model.DDMStructure;

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
public class DDMStructureModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<DDMStructure, String>() {
					@Override
					public String apply(DDMStructure ddmStructure) {
						return ddmStructure.getUuid();
					}
				},
				new BiConsumer<DDMStructure, String>() {
					@Override
					public void accept(DDMStructure ddmStructure, String uuid) {
						ddmStructure.setUuid(uuid);
					}
				});
		}
	}

	public static class StructureIdAccessor extends ModelPropertyAccessor {
		public StructureIdAccessor() {
			super(new Function<DDMStructure, Long>() {
					@Override
					public Long apply(DDMStructure ddmStructure) {
						return ddmStructure.getStructureId();
					}
				},
				new BiConsumer<DDMStructure, Long>() {
					@Override
					public void accept(DDMStructure ddmStructure,
						Long structureId) {
						ddmStructure.setStructureId(structureId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DDMStructure, Long>() {
					@Override
					public Long apply(DDMStructure ddmStructure) {
						return ddmStructure.getGroupId();
					}
				},
				new BiConsumer<DDMStructure, Long>() {
					@Override
					public void accept(DDMStructure ddmStructure, Long groupId) {
						ddmStructure.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDMStructure, Long>() {
					@Override
					public Long apply(DDMStructure ddmStructure) {
						return ddmStructure.getCompanyId();
					}
				},
				new BiConsumer<DDMStructure, Long>() {
					@Override
					public void accept(DDMStructure ddmStructure, Long companyId) {
						ddmStructure.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DDMStructure, Long>() {
					@Override
					public Long apply(DDMStructure ddmStructure) {
						return ddmStructure.getUserId();
					}
				},
				new BiConsumer<DDMStructure, Long>() {
					@Override
					public void accept(DDMStructure ddmStructure, Long userId) {
						ddmStructure.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DDMStructure, String>() {
					@Override
					public String apply(DDMStructure ddmStructure) {
						return ddmStructure.getUserName();
					}
				},
				new BiConsumer<DDMStructure, String>() {
					@Override
					public void accept(DDMStructure ddmStructure,
						String userName) {
						ddmStructure.setUserName(userName);
					}
				});
		}
	}

	public static class VersionUserIdAccessor extends ModelPropertyAccessor {
		public VersionUserIdAccessor() {
			super(new Function<DDMStructure, Long>() {
					@Override
					public Long apply(DDMStructure ddmStructure) {
						return ddmStructure.getVersionUserId();
					}
				},
				new BiConsumer<DDMStructure, Long>() {
					@Override
					public void accept(DDMStructure ddmStructure,
						Long versionUserId) {
						ddmStructure.setVersionUserId(versionUserId);
					}
				});
		}
	}

	public static class VersionUserNameAccessor extends ModelPropertyAccessor {
		public VersionUserNameAccessor() {
			super(new Function<DDMStructure, String>() {
					@Override
					public String apply(DDMStructure ddmStructure) {
						return ddmStructure.getVersionUserName();
					}
				},
				new BiConsumer<DDMStructure, String>() {
					@Override
					public void accept(DDMStructure ddmStructure,
						String versionUserName) {
						ddmStructure.setVersionUserName(versionUserName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DDMStructure, Date>() {
					@Override
					public Date apply(DDMStructure ddmStructure) {
						return ddmStructure.getCreateDate();
					}
				},
				new BiConsumer<DDMStructure, Date>() {
					@Override
					public void accept(DDMStructure ddmStructure,
						Date createDate) {
						ddmStructure.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<DDMStructure, Date>() {
					@Override
					public Date apply(DDMStructure ddmStructure) {
						return ddmStructure.getModifiedDate();
					}
				},
				new BiConsumer<DDMStructure, Date>() {
					@Override
					public void accept(DDMStructure ddmStructure,
						Date modifiedDate) {
						ddmStructure.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ParentStructureIdAccessor extends ModelPropertyAccessor {
		public ParentStructureIdAccessor() {
			super(new Function<DDMStructure, Long>() {
					@Override
					public Long apply(DDMStructure ddmStructure) {
						return ddmStructure.getParentStructureId();
					}
				},
				new BiConsumer<DDMStructure, Long>() {
					@Override
					public void accept(DDMStructure ddmStructure,
						Long parentStructureId) {
						ddmStructure.setParentStructureId(parentStructureId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<DDMStructure, Long>() {
					@Override
					public Long apply(DDMStructure ddmStructure) {
						return ddmStructure.getClassNameId();
					}
				},
				new BiConsumer<DDMStructure, Long>() {
					@Override
					public void accept(DDMStructure ddmStructure,
						Long classNameId) {
						ddmStructure.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class StructureKeyAccessor extends ModelPropertyAccessor {
		public StructureKeyAccessor() {
			super(new Function<DDMStructure, String>() {
					@Override
					public String apply(DDMStructure ddmStructure) {
						return ddmStructure.getStructureKey();
					}
				},
				new BiConsumer<DDMStructure, String>() {
					@Override
					public void accept(DDMStructure ddmStructure,
						String structureKey) {
						ddmStructure.setStructureKey(structureKey);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<DDMStructure, String>() {
					@Override
					public String apply(DDMStructure ddmStructure) {
						return ddmStructure.getVersion();
					}
				},
				new BiConsumer<DDMStructure, String>() {
					@Override
					public void accept(DDMStructure ddmStructure, String version) {
						ddmStructure.setVersion(version);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<DDMStructure, String>() {
					@Override
					public String apply(DDMStructure ddmStructure) {
						return ddmStructure.getName();
					}
				},
				new BiConsumer<DDMStructure, String>() {
					@Override
					public void accept(DDMStructure ddmStructure, String name) {
						ddmStructure.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<DDMStructure, String>() {
					@Override
					public String apply(DDMStructure ddmStructure) {
						return ddmStructure.getDescription();
					}
				},
				new BiConsumer<DDMStructure, String>() {
					@Override
					public void accept(DDMStructure ddmStructure,
						String description) {
						ddmStructure.setDescription(description);
					}
				});
		}
	}

	public static class DefinitionAccessor extends ModelPropertyAccessor {
		public DefinitionAccessor() {
			super(new Function<DDMStructure, String>() {
					@Override
					public String apply(DDMStructure ddmStructure) {
						return ddmStructure.getDefinition();
					}
				},
				new BiConsumer<DDMStructure, String>() {
					@Override
					public void accept(DDMStructure ddmStructure,
						String definition) {
						ddmStructure.setDefinition(definition);
					}
				});
		}
	}

	public static class StorageTypeAccessor extends ModelPropertyAccessor {
		public StorageTypeAccessor() {
			super(new Function<DDMStructure, String>() {
					@Override
					public String apply(DDMStructure ddmStructure) {
						return ddmStructure.getStorageType();
					}
				},
				new BiConsumer<DDMStructure, String>() {
					@Override
					public void accept(DDMStructure ddmStructure,
						String storageType) {
						ddmStructure.setStorageType(storageType);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<DDMStructure, Integer>() {
					@Override
					public Integer apply(DDMStructure ddmStructure) {
						return ddmStructure.getType();
					}
				},
				new BiConsumer<DDMStructure, Integer>() {
					@Override
					public void accept(DDMStructure ddmStructure, Integer type) {
						ddmStructure.setType(type);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<DDMStructure, Date>() {
					@Override
					public Date apply(DDMStructure ddmStructure) {
						return ddmStructure.getLastPublishDate();
					}
				},
				new BiConsumer<DDMStructure, Date>() {
					@Override
					public void accept(DDMStructure ddmStructure,
						Date lastPublishDate) {
						ddmStructure.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private DDMStructureModelAccessors() {
	}
}