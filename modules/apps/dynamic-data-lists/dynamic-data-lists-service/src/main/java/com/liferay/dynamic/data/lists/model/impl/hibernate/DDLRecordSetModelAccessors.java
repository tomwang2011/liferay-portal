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

import com.liferay.dynamic.data.lists.model.DDLRecordSet;

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
public class DDLRecordSetModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<DDLRecordSet, String>() {
					@Override
					public String apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getUuid();
					}
				},
				new BiConsumer<DDLRecordSet, String>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet, String uuid) {
						ddlRecordSet.setUuid(uuid);
					}
				});
		}
	}

	public static class RecordSetIdAccessor extends ModelPropertyAccessor {
		public RecordSetIdAccessor() {
			super(new Function<DDLRecordSet, Long>() {
					@Override
					public Long apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getRecordSetId();
					}
				},
				new BiConsumer<DDLRecordSet, Long>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet,
						Long recordSetId) {
						ddlRecordSet.setRecordSetId(recordSetId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DDLRecordSet, Long>() {
					@Override
					public Long apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getGroupId();
					}
				},
				new BiConsumer<DDLRecordSet, Long>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet, Long groupId) {
						ddlRecordSet.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDLRecordSet, Long>() {
					@Override
					public Long apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getCompanyId();
					}
				},
				new BiConsumer<DDLRecordSet, Long>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet, Long companyId) {
						ddlRecordSet.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DDLRecordSet, Long>() {
					@Override
					public Long apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getUserId();
					}
				},
				new BiConsumer<DDLRecordSet, Long>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet, Long userId) {
						ddlRecordSet.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DDLRecordSet, String>() {
					@Override
					public String apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getUserName();
					}
				},
				new BiConsumer<DDLRecordSet, String>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet,
						String userName) {
						ddlRecordSet.setUserName(userName);
					}
				});
		}
	}

	public static class VersionUserIdAccessor extends ModelPropertyAccessor {
		public VersionUserIdAccessor() {
			super(new Function<DDLRecordSet, Long>() {
					@Override
					public Long apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getVersionUserId();
					}
				},
				new BiConsumer<DDLRecordSet, Long>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet,
						Long versionUserId) {
						ddlRecordSet.setVersionUserId(versionUserId);
					}
				});
		}
	}

	public static class VersionUserNameAccessor extends ModelPropertyAccessor {
		public VersionUserNameAccessor() {
			super(new Function<DDLRecordSet, String>() {
					@Override
					public String apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getVersionUserName();
					}
				},
				new BiConsumer<DDLRecordSet, String>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet,
						String versionUserName) {
						ddlRecordSet.setVersionUserName(versionUserName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DDLRecordSet, Date>() {
					@Override
					public Date apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getCreateDate();
					}
				},
				new BiConsumer<DDLRecordSet, Date>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet,
						Date createDate) {
						ddlRecordSet.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<DDLRecordSet, Date>() {
					@Override
					public Date apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getModifiedDate();
					}
				},
				new BiConsumer<DDLRecordSet, Date>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet,
						Date modifiedDate) {
						ddlRecordSet.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class DDMStructureIdAccessor extends ModelPropertyAccessor {
		public DDMStructureIdAccessor() {
			super(new Function<DDLRecordSet, Long>() {
					@Override
					public Long apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getDDMStructureId();
					}
				},
				new BiConsumer<DDLRecordSet, Long>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet,
						Long DDMStructureId) {
						ddlRecordSet.setDDMStructureId(DDMStructureId);
					}
				});
		}
	}

	public static class RecordSetKeyAccessor extends ModelPropertyAccessor {
		public RecordSetKeyAccessor() {
			super(new Function<DDLRecordSet, String>() {
					@Override
					public String apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getRecordSetKey();
					}
				},
				new BiConsumer<DDLRecordSet, String>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet,
						String recordSetKey) {
						ddlRecordSet.setRecordSetKey(recordSetKey);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<DDLRecordSet, String>() {
					@Override
					public String apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getVersion();
					}
				},
				new BiConsumer<DDLRecordSet, String>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet, String version) {
						ddlRecordSet.setVersion(version);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<DDLRecordSet, String>() {
					@Override
					public String apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getName();
					}
				},
				new BiConsumer<DDLRecordSet, String>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet, String name) {
						ddlRecordSet.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<DDLRecordSet, String>() {
					@Override
					public String apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getDescription();
					}
				},
				new BiConsumer<DDLRecordSet, String>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet,
						String description) {
						ddlRecordSet.setDescription(description);
					}
				});
		}
	}

	public static class MinDisplayRowsAccessor extends ModelPropertyAccessor {
		public MinDisplayRowsAccessor() {
			super(new Function<DDLRecordSet, Integer>() {
					@Override
					public Integer apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getMinDisplayRows();
					}
				},
				new BiConsumer<DDLRecordSet, Integer>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet,
						Integer minDisplayRows) {
						ddlRecordSet.setMinDisplayRows(minDisplayRows);
					}
				});
		}
	}

	public static class ScopeAccessor extends ModelPropertyAccessor {
		public ScopeAccessor() {
			super(new Function<DDLRecordSet, Integer>() {
					@Override
					public Integer apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getScope();
					}
				},
				new BiConsumer<DDLRecordSet, Integer>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet, Integer scope) {
						ddlRecordSet.setScope(scope);
					}
				});
		}
	}

	public static class SettingsAccessor extends ModelPropertyAccessor {
		public SettingsAccessor() {
			super(new Function<DDLRecordSet, String>() {
					@Override
					public String apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getSettings();
					}
				},
				new BiConsumer<DDLRecordSet, String>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet,
						String settings) {
						ddlRecordSet.setSettings(settings);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<DDLRecordSet, Date>() {
					@Override
					public Date apply(DDLRecordSet ddlRecordSet) {
						return ddlRecordSet.getLastPublishDate();
					}
				},
				new BiConsumer<DDLRecordSet, Date>() {
					@Override
					public void accept(DDLRecordSet ddlRecordSet,
						Date lastPublishDate) {
						ddlRecordSet.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private DDLRecordSetModelAccessors() {
	}
}