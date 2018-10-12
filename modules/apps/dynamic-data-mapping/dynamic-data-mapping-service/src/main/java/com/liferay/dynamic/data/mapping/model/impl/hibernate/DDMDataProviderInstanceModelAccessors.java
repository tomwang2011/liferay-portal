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

import com.liferay.dynamic.data.mapping.model.DDMDataProviderInstance;

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
public class DDMDataProviderInstanceModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<DDMDataProviderInstance, String>() {
					@Override
					public String apply(
						DDMDataProviderInstance ddmDataProviderInstance) {
						return ddmDataProviderInstance.getUuid();
					}
				},
				new BiConsumer<DDMDataProviderInstance, String>() {
					@Override
					public void accept(
						DDMDataProviderInstance ddmDataProviderInstance,
						String uuid) {
						ddmDataProviderInstance.setUuid(uuid);
					}
				});
		}
	}

	public static class DataProviderInstanceIdAccessor
		extends ModelPropertyAccessor {
		public DataProviderInstanceIdAccessor() {
			super(new Function<DDMDataProviderInstance, Long>() {
					@Override
					public Long apply(
						DDMDataProviderInstance ddmDataProviderInstance) {
						return ddmDataProviderInstance.getDataProviderInstanceId();
					}
				},
				new BiConsumer<DDMDataProviderInstance, Long>() {
					@Override
					public void accept(
						DDMDataProviderInstance ddmDataProviderInstance,
						Long dataProviderInstanceId) {
						ddmDataProviderInstance.setDataProviderInstanceId(dataProviderInstanceId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DDMDataProviderInstance, Long>() {
					@Override
					public Long apply(
						DDMDataProviderInstance ddmDataProviderInstance) {
						return ddmDataProviderInstance.getGroupId();
					}
				},
				new BiConsumer<DDMDataProviderInstance, Long>() {
					@Override
					public void accept(
						DDMDataProviderInstance ddmDataProviderInstance,
						Long groupId) {
						ddmDataProviderInstance.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDMDataProviderInstance, Long>() {
					@Override
					public Long apply(
						DDMDataProviderInstance ddmDataProviderInstance) {
						return ddmDataProviderInstance.getCompanyId();
					}
				},
				new BiConsumer<DDMDataProviderInstance, Long>() {
					@Override
					public void accept(
						DDMDataProviderInstance ddmDataProviderInstance,
						Long companyId) {
						ddmDataProviderInstance.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DDMDataProviderInstance, Long>() {
					@Override
					public Long apply(
						DDMDataProviderInstance ddmDataProviderInstance) {
						return ddmDataProviderInstance.getUserId();
					}
				},
				new BiConsumer<DDMDataProviderInstance, Long>() {
					@Override
					public void accept(
						DDMDataProviderInstance ddmDataProviderInstance,
						Long userId) {
						ddmDataProviderInstance.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DDMDataProviderInstance, String>() {
					@Override
					public String apply(
						DDMDataProviderInstance ddmDataProviderInstance) {
						return ddmDataProviderInstance.getUserName();
					}
				},
				new BiConsumer<DDMDataProviderInstance, String>() {
					@Override
					public void accept(
						DDMDataProviderInstance ddmDataProviderInstance,
						String userName) {
						ddmDataProviderInstance.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DDMDataProviderInstance, Date>() {
					@Override
					public Date apply(
						DDMDataProviderInstance ddmDataProviderInstance) {
						return ddmDataProviderInstance.getCreateDate();
					}
				},
				new BiConsumer<DDMDataProviderInstance, Date>() {
					@Override
					public void accept(
						DDMDataProviderInstance ddmDataProviderInstance,
						Date createDate) {
						ddmDataProviderInstance.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<DDMDataProviderInstance, Date>() {
					@Override
					public Date apply(
						DDMDataProviderInstance ddmDataProviderInstance) {
						return ddmDataProviderInstance.getModifiedDate();
					}
				},
				new BiConsumer<DDMDataProviderInstance, Date>() {
					@Override
					public void accept(
						DDMDataProviderInstance ddmDataProviderInstance,
						Date modifiedDate) {
						ddmDataProviderInstance.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<DDMDataProviderInstance, String>() {
					@Override
					public String apply(
						DDMDataProviderInstance ddmDataProviderInstance) {
						return ddmDataProviderInstance.getName();
					}
				},
				new BiConsumer<DDMDataProviderInstance, String>() {
					@Override
					public void accept(
						DDMDataProviderInstance ddmDataProviderInstance,
						String name) {
						ddmDataProviderInstance.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<DDMDataProviderInstance, String>() {
					@Override
					public String apply(
						DDMDataProviderInstance ddmDataProviderInstance) {
						return ddmDataProviderInstance.getDescription();
					}
				},
				new BiConsumer<DDMDataProviderInstance, String>() {
					@Override
					public void accept(
						DDMDataProviderInstance ddmDataProviderInstance,
						String description) {
						ddmDataProviderInstance.setDescription(description);
					}
				});
		}
	}

	public static class DefinitionAccessor extends ModelPropertyAccessor {
		public DefinitionAccessor() {
			super(new Function<DDMDataProviderInstance, String>() {
					@Override
					public String apply(
						DDMDataProviderInstance ddmDataProviderInstance) {
						return ddmDataProviderInstance.getDefinition();
					}
				},
				new BiConsumer<DDMDataProviderInstance, String>() {
					@Override
					public void accept(
						DDMDataProviderInstance ddmDataProviderInstance,
						String definition) {
						ddmDataProviderInstance.setDefinition(definition);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<DDMDataProviderInstance, String>() {
					@Override
					public String apply(
						DDMDataProviderInstance ddmDataProviderInstance) {
						return ddmDataProviderInstance.getType();
					}
				},
				new BiConsumer<DDMDataProviderInstance, String>() {
					@Override
					public void accept(
						DDMDataProviderInstance ddmDataProviderInstance,
						String type) {
						ddmDataProviderInstance.setType(type);
					}
				});
		}
	}

	private DDMDataProviderInstanceModelAccessors() {
	}
}