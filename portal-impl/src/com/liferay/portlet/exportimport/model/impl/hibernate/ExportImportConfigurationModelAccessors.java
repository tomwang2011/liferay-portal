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

package com.liferay.portlet.exportimport.model.impl.hibernate;

import com.liferay.exportimport.kernel.model.ExportImportConfiguration;

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
public class ExportImportConfigurationModelAccessors {
	public static class ExportImportConfigurationIdAccessor
		extends ModelPropertyAccessor {
		public ExportImportConfigurationIdAccessor() {
			super(new Function<ExportImportConfiguration, Long>() {
					@Override
					public Long apply(
						ExportImportConfiguration exportImportConfiguration) {
						return exportImportConfiguration.getExportImportConfigurationId();
					}
				},
				new BiConsumer<ExportImportConfiguration, Long>() {
					@Override
					public void accept(
						ExportImportConfiguration exportImportConfiguration,
						Long exportImportConfigurationId) {
						exportImportConfiguration.setExportImportConfigurationId(exportImportConfigurationId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<ExportImportConfiguration, Long>() {
					@Override
					public Long apply(
						ExportImportConfiguration exportImportConfiguration) {
						return exportImportConfiguration.getGroupId();
					}
				},
				new BiConsumer<ExportImportConfiguration, Long>() {
					@Override
					public void accept(
						ExportImportConfiguration exportImportConfiguration,
						Long groupId) {
						exportImportConfiguration.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<ExportImportConfiguration, Long>() {
					@Override
					public Long apply(
						ExportImportConfiguration exportImportConfiguration) {
						return exportImportConfiguration.getCompanyId();
					}
				},
				new BiConsumer<ExportImportConfiguration, Long>() {
					@Override
					public void accept(
						ExportImportConfiguration exportImportConfiguration,
						Long companyId) {
						exportImportConfiguration.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<ExportImportConfiguration, Long>() {
					@Override
					public Long apply(
						ExportImportConfiguration exportImportConfiguration) {
						return exportImportConfiguration.getUserId();
					}
				},
				new BiConsumer<ExportImportConfiguration, Long>() {
					@Override
					public void accept(
						ExportImportConfiguration exportImportConfiguration,
						Long userId) {
						exportImportConfiguration.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<ExportImportConfiguration, String>() {
					@Override
					public String apply(
						ExportImportConfiguration exportImportConfiguration) {
						return exportImportConfiguration.getUserName();
					}
				},
				new BiConsumer<ExportImportConfiguration, String>() {
					@Override
					public void accept(
						ExportImportConfiguration exportImportConfiguration,
						String userName) {
						exportImportConfiguration.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<ExportImportConfiguration, Date>() {
					@Override
					public Date apply(
						ExportImportConfiguration exportImportConfiguration) {
						return exportImportConfiguration.getCreateDate();
					}
				},
				new BiConsumer<ExportImportConfiguration, Date>() {
					@Override
					public void accept(
						ExportImportConfiguration exportImportConfiguration,
						Date createDate) {
						exportImportConfiguration.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<ExportImportConfiguration, Date>() {
					@Override
					public Date apply(
						ExportImportConfiguration exportImportConfiguration) {
						return exportImportConfiguration.getModifiedDate();
					}
				},
				new BiConsumer<ExportImportConfiguration, Date>() {
					@Override
					public void accept(
						ExportImportConfiguration exportImportConfiguration,
						Date modifiedDate) {
						exportImportConfiguration.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<ExportImportConfiguration, String>() {
					@Override
					public String apply(
						ExportImportConfiguration exportImportConfiguration) {
						return exportImportConfiguration.getName();
					}
				},
				new BiConsumer<ExportImportConfiguration, String>() {
					@Override
					public void accept(
						ExportImportConfiguration exportImportConfiguration,
						String name) {
						exportImportConfiguration.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<ExportImportConfiguration, String>() {
					@Override
					public String apply(
						ExportImportConfiguration exportImportConfiguration) {
						return exportImportConfiguration.getDescription();
					}
				},
				new BiConsumer<ExportImportConfiguration, String>() {
					@Override
					public void accept(
						ExportImportConfiguration exportImportConfiguration,
						String description) {
						exportImportConfiguration.setDescription(description);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<ExportImportConfiguration, Integer>() {
					@Override
					public Integer apply(
						ExportImportConfiguration exportImportConfiguration) {
						return exportImportConfiguration.getType();
					}
				},
				new BiConsumer<ExportImportConfiguration, Integer>() {
					@Override
					public void accept(
						ExportImportConfiguration exportImportConfiguration,
						Integer type) {
						exportImportConfiguration.setType(type);
					}
				});
		}
	}

	public static class SettingsAccessor extends ModelPropertyAccessor {
		public SettingsAccessor() {
			super(new Function<ExportImportConfiguration, String>() {
					@Override
					public String apply(
						ExportImportConfiguration exportImportConfiguration) {
						return exportImportConfiguration.getSettings();
					}
				},
				new BiConsumer<ExportImportConfiguration, String>() {
					@Override
					public void accept(
						ExportImportConfiguration exportImportConfiguration,
						String settings) {
						exportImportConfiguration.setSettings(settings);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<ExportImportConfiguration, Integer>() {
					@Override
					public Integer apply(
						ExportImportConfiguration exportImportConfiguration) {
						return exportImportConfiguration.getStatus();
					}
				},
				new BiConsumer<ExportImportConfiguration, Integer>() {
					@Override
					public void accept(
						ExportImportConfiguration exportImportConfiguration,
						Integer status) {
						exportImportConfiguration.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<ExportImportConfiguration, Long>() {
					@Override
					public Long apply(
						ExportImportConfiguration exportImportConfiguration) {
						return exportImportConfiguration.getStatusByUserId();
					}
				},
				new BiConsumer<ExportImportConfiguration, Long>() {
					@Override
					public void accept(
						ExportImportConfiguration exportImportConfiguration,
						Long statusByUserId) {
						exportImportConfiguration.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<ExportImportConfiguration, String>() {
					@Override
					public String apply(
						ExportImportConfiguration exportImportConfiguration) {
						return exportImportConfiguration.getStatusByUserName();
					}
				},
				new BiConsumer<ExportImportConfiguration, String>() {
					@Override
					public void accept(
						ExportImportConfiguration exportImportConfiguration,
						String statusByUserName) {
						exportImportConfiguration.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<ExportImportConfiguration, Date>() {
					@Override
					public Date apply(
						ExportImportConfiguration exportImportConfiguration) {
						return exportImportConfiguration.getStatusDate();
					}
				},
				new BiConsumer<ExportImportConfiguration, Date>() {
					@Override
					public void accept(
						ExportImportConfiguration exportImportConfiguration,
						Date statusDate) {
						exportImportConfiguration.setStatusDate(statusDate);
					}
				});
		}
	}

	private ExportImportConfigurationModelAccessors() {
	}
}