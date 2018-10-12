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

import com.liferay.dynamic.data.mapping.model.DDMTemplateVersion;

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
public class DDMTemplateVersionModelAccessors {
	public static class TemplateVersionIdAccessor extends ModelPropertyAccessor {
		public TemplateVersionIdAccessor() {
			super(new Function<DDMTemplateVersion, Long>() {
					@Override
					public Long apply(DDMTemplateVersion ddmTemplateVersion) {
						return ddmTemplateVersion.getTemplateVersionId();
					}
				},
				new BiConsumer<DDMTemplateVersion, Long>() {
					@Override
					public void accept(DDMTemplateVersion ddmTemplateVersion,
						Long templateVersionId) {
						ddmTemplateVersion.setTemplateVersionId(templateVersionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DDMTemplateVersion, Long>() {
					@Override
					public Long apply(DDMTemplateVersion ddmTemplateVersion) {
						return ddmTemplateVersion.getGroupId();
					}
				},
				new BiConsumer<DDMTemplateVersion, Long>() {
					@Override
					public void accept(DDMTemplateVersion ddmTemplateVersion,
						Long groupId) {
						ddmTemplateVersion.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDMTemplateVersion, Long>() {
					@Override
					public Long apply(DDMTemplateVersion ddmTemplateVersion) {
						return ddmTemplateVersion.getCompanyId();
					}
				},
				new BiConsumer<DDMTemplateVersion, Long>() {
					@Override
					public void accept(DDMTemplateVersion ddmTemplateVersion,
						Long companyId) {
						ddmTemplateVersion.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DDMTemplateVersion, Long>() {
					@Override
					public Long apply(DDMTemplateVersion ddmTemplateVersion) {
						return ddmTemplateVersion.getUserId();
					}
				},
				new BiConsumer<DDMTemplateVersion, Long>() {
					@Override
					public void accept(DDMTemplateVersion ddmTemplateVersion,
						Long userId) {
						ddmTemplateVersion.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DDMTemplateVersion, String>() {
					@Override
					public String apply(DDMTemplateVersion ddmTemplateVersion) {
						return ddmTemplateVersion.getUserName();
					}
				},
				new BiConsumer<DDMTemplateVersion, String>() {
					@Override
					public void accept(DDMTemplateVersion ddmTemplateVersion,
						String userName) {
						ddmTemplateVersion.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DDMTemplateVersion, Date>() {
					@Override
					public Date apply(DDMTemplateVersion ddmTemplateVersion) {
						return ddmTemplateVersion.getCreateDate();
					}
				},
				new BiConsumer<DDMTemplateVersion, Date>() {
					@Override
					public void accept(DDMTemplateVersion ddmTemplateVersion,
						Date createDate) {
						ddmTemplateVersion.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<DDMTemplateVersion, Long>() {
					@Override
					public Long apply(DDMTemplateVersion ddmTemplateVersion) {
						return ddmTemplateVersion.getClassNameId();
					}
				},
				new BiConsumer<DDMTemplateVersion, Long>() {
					@Override
					public void accept(DDMTemplateVersion ddmTemplateVersion,
						Long classNameId) {
						ddmTemplateVersion.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<DDMTemplateVersion, Long>() {
					@Override
					public Long apply(DDMTemplateVersion ddmTemplateVersion) {
						return ddmTemplateVersion.getClassPK();
					}
				},
				new BiConsumer<DDMTemplateVersion, Long>() {
					@Override
					public void accept(DDMTemplateVersion ddmTemplateVersion,
						Long classPK) {
						ddmTemplateVersion.setClassPK(classPK);
					}
				});
		}
	}

	public static class TemplateIdAccessor extends ModelPropertyAccessor {
		public TemplateIdAccessor() {
			super(new Function<DDMTemplateVersion, Long>() {
					@Override
					public Long apply(DDMTemplateVersion ddmTemplateVersion) {
						return ddmTemplateVersion.getTemplateId();
					}
				},
				new BiConsumer<DDMTemplateVersion, Long>() {
					@Override
					public void accept(DDMTemplateVersion ddmTemplateVersion,
						Long templateId) {
						ddmTemplateVersion.setTemplateId(templateId);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<DDMTemplateVersion, String>() {
					@Override
					public String apply(DDMTemplateVersion ddmTemplateVersion) {
						return ddmTemplateVersion.getVersion();
					}
				},
				new BiConsumer<DDMTemplateVersion, String>() {
					@Override
					public void accept(DDMTemplateVersion ddmTemplateVersion,
						String version) {
						ddmTemplateVersion.setVersion(version);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<DDMTemplateVersion, String>() {
					@Override
					public String apply(DDMTemplateVersion ddmTemplateVersion) {
						return ddmTemplateVersion.getName();
					}
				},
				new BiConsumer<DDMTemplateVersion, String>() {
					@Override
					public void accept(DDMTemplateVersion ddmTemplateVersion,
						String name) {
						ddmTemplateVersion.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<DDMTemplateVersion, String>() {
					@Override
					public String apply(DDMTemplateVersion ddmTemplateVersion) {
						return ddmTemplateVersion.getDescription();
					}
				},
				new BiConsumer<DDMTemplateVersion, String>() {
					@Override
					public void accept(DDMTemplateVersion ddmTemplateVersion,
						String description) {
						ddmTemplateVersion.setDescription(description);
					}
				});
		}
	}

	public static class LanguageAccessor extends ModelPropertyAccessor {
		public LanguageAccessor() {
			super(new Function<DDMTemplateVersion, String>() {
					@Override
					public String apply(DDMTemplateVersion ddmTemplateVersion) {
						return ddmTemplateVersion.getLanguage();
					}
				},
				new BiConsumer<DDMTemplateVersion, String>() {
					@Override
					public void accept(DDMTemplateVersion ddmTemplateVersion,
						String language) {
						ddmTemplateVersion.setLanguage(language);
					}
				});
		}
	}

	public static class ScriptAccessor extends ModelPropertyAccessor {
		public ScriptAccessor() {
			super(new Function<DDMTemplateVersion, String>() {
					@Override
					public String apply(DDMTemplateVersion ddmTemplateVersion) {
						return ddmTemplateVersion.getScript();
					}
				},
				new BiConsumer<DDMTemplateVersion, String>() {
					@Override
					public void accept(DDMTemplateVersion ddmTemplateVersion,
						String script) {
						ddmTemplateVersion.setScript(script);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<DDMTemplateVersion, Integer>() {
					@Override
					public Integer apply(DDMTemplateVersion ddmTemplateVersion) {
						return ddmTemplateVersion.getStatus();
					}
				},
				new BiConsumer<DDMTemplateVersion, Integer>() {
					@Override
					public void accept(DDMTemplateVersion ddmTemplateVersion,
						Integer status) {
						ddmTemplateVersion.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<DDMTemplateVersion, Long>() {
					@Override
					public Long apply(DDMTemplateVersion ddmTemplateVersion) {
						return ddmTemplateVersion.getStatusByUserId();
					}
				},
				new BiConsumer<DDMTemplateVersion, Long>() {
					@Override
					public void accept(DDMTemplateVersion ddmTemplateVersion,
						Long statusByUserId) {
						ddmTemplateVersion.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<DDMTemplateVersion, String>() {
					@Override
					public String apply(DDMTemplateVersion ddmTemplateVersion) {
						return ddmTemplateVersion.getStatusByUserName();
					}
				},
				new BiConsumer<DDMTemplateVersion, String>() {
					@Override
					public void accept(DDMTemplateVersion ddmTemplateVersion,
						String statusByUserName) {
						ddmTemplateVersion.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<DDMTemplateVersion, Date>() {
					@Override
					public Date apply(DDMTemplateVersion ddmTemplateVersion) {
						return ddmTemplateVersion.getStatusDate();
					}
				},
				new BiConsumer<DDMTemplateVersion, Date>() {
					@Override
					public void accept(DDMTemplateVersion ddmTemplateVersion,
						Date statusDate) {
						ddmTemplateVersion.setStatusDate(statusDate);
					}
				});
		}
	}

	private DDMTemplateVersionModelAccessors() {
	}
}