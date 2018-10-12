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

import com.liferay.dynamic.data.mapping.model.DDMTemplate;

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
public class DDMTemplateModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<DDMTemplate, String>() {
					@Override
					public String apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getUuid();
					}
				},
				new BiConsumer<DDMTemplate, String>() {
					@Override
					public void accept(DDMTemplate ddmTemplate, String uuid) {
						ddmTemplate.setUuid(uuid);
					}
				});
		}
	}

	public static class TemplateIdAccessor extends ModelPropertyAccessor {
		public TemplateIdAccessor() {
			super(new Function<DDMTemplate, Long>() {
					@Override
					public Long apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getTemplateId();
					}
				},
				new BiConsumer<DDMTemplate, Long>() {
					@Override
					public void accept(DDMTemplate ddmTemplate, Long templateId) {
						ddmTemplate.setTemplateId(templateId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DDMTemplate, Long>() {
					@Override
					public Long apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getGroupId();
					}
				},
				new BiConsumer<DDMTemplate, Long>() {
					@Override
					public void accept(DDMTemplate ddmTemplate, Long groupId) {
						ddmTemplate.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDMTemplate, Long>() {
					@Override
					public Long apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getCompanyId();
					}
				},
				new BiConsumer<DDMTemplate, Long>() {
					@Override
					public void accept(DDMTemplate ddmTemplate, Long companyId) {
						ddmTemplate.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DDMTemplate, Long>() {
					@Override
					public Long apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getUserId();
					}
				},
				new BiConsumer<DDMTemplate, Long>() {
					@Override
					public void accept(DDMTemplate ddmTemplate, Long userId) {
						ddmTemplate.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DDMTemplate, String>() {
					@Override
					public String apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getUserName();
					}
				},
				new BiConsumer<DDMTemplate, String>() {
					@Override
					public void accept(DDMTemplate ddmTemplate, String userName) {
						ddmTemplate.setUserName(userName);
					}
				});
		}
	}

	public static class VersionUserIdAccessor extends ModelPropertyAccessor {
		public VersionUserIdAccessor() {
			super(new Function<DDMTemplate, Long>() {
					@Override
					public Long apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getVersionUserId();
					}
				},
				new BiConsumer<DDMTemplate, Long>() {
					@Override
					public void accept(DDMTemplate ddmTemplate,
						Long versionUserId) {
						ddmTemplate.setVersionUserId(versionUserId);
					}
				});
		}
	}

	public static class VersionUserNameAccessor extends ModelPropertyAccessor {
		public VersionUserNameAccessor() {
			super(new Function<DDMTemplate, String>() {
					@Override
					public String apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getVersionUserName();
					}
				},
				new BiConsumer<DDMTemplate, String>() {
					@Override
					public void accept(DDMTemplate ddmTemplate,
						String versionUserName) {
						ddmTemplate.setVersionUserName(versionUserName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DDMTemplate, Date>() {
					@Override
					public Date apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getCreateDate();
					}
				},
				new BiConsumer<DDMTemplate, Date>() {
					@Override
					public void accept(DDMTemplate ddmTemplate, Date createDate) {
						ddmTemplate.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<DDMTemplate, Date>() {
					@Override
					public Date apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getModifiedDate();
					}
				},
				new BiConsumer<DDMTemplate, Date>() {
					@Override
					public void accept(DDMTemplate ddmTemplate,
						Date modifiedDate) {
						ddmTemplate.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<DDMTemplate, Long>() {
					@Override
					public Long apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getClassNameId();
					}
				},
				new BiConsumer<DDMTemplate, Long>() {
					@Override
					public void accept(DDMTemplate ddmTemplate, Long classNameId) {
						ddmTemplate.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<DDMTemplate, Long>() {
					@Override
					public Long apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getClassPK();
					}
				},
				new BiConsumer<DDMTemplate, Long>() {
					@Override
					public void accept(DDMTemplate ddmTemplate, Long classPK) {
						ddmTemplate.setClassPK(classPK);
					}
				});
		}
	}

	public static class ResourceClassNameIdAccessor
		extends ModelPropertyAccessor {
		public ResourceClassNameIdAccessor() {
			super(new Function<DDMTemplate, Long>() {
					@Override
					public Long apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getResourceClassNameId();
					}
				},
				new BiConsumer<DDMTemplate, Long>() {
					@Override
					public void accept(DDMTemplate ddmTemplate,
						Long resourceClassNameId) {
						ddmTemplate.setResourceClassNameId(resourceClassNameId);
					}
				});
		}
	}

	public static class TemplateKeyAccessor extends ModelPropertyAccessor {
		public TemplateKeyAccessor() {
			super(new Function<DDMTemplate, String>() {
					@Override
					public String apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getTemplateKey();
					}
				},
				new BiConsumer<DDMTemplate, String>() {
					@Override
					public void accept(DDMTemplate ddmTemplate,
						String templateKey) {
						ddmTemplate.setTemplateKey(templateKey);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<DDMTemplate, String>() {
					@Override
					public String apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getVersion();
					}
				},
				new BiConsumer<DDMTemplate, String>() {
					@Override
					public void accept(DDMTemplate ddmTemplate, String version) {
						ddmTemplate.setVersion(version);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<DDMTemplate, String>() {
					@Override
					public String apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getName();
					}
				},
				new BiConsumer<DDMTemplate, String>() {
					@Override
					public void accept(DDMTemplate ddmTemplate, String name) {
						ddmTemplate.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<DDMTemplate, String>() {
					@Override
					public String apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getDescription();
					}
				},
				new BiConsumer<DDMTemplate, String>() {
					@Override
					public void accept(DDMTemplate ddmTemplate,
						String description) {
						ddmTemplate.setDescription(description);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<DDMTemplate, String>() {
					@Override
					public String apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getType();
					}
				},
				new BiConsumer<DDMTemplate, String>() {
					@Override
					public void accept(DDMTemplate ddmTemplate, String type) {
						ddmTemplate.setType(type);
					}
				});
		}
	}

	public static class ModeAccessor extends ModelPropertyAccessor {
		public ModeAccessor() {
			super(new Function<DDMTemplate, String>() {
					@Override
					public String apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getMode();
					}
				},
				new BiConsumer<DDMTemplate, String>() {
					@Override
					public void accept(DDMTemplate ddmTemplate, String mode) {
						ddmTemplate.setMode(mode);
					}
				});
		}
	}

	public static class LanguageAccessor extends ModelPropertyAccessor {
		public LanguageAccessor() {
			super(new Function<DDMTemplate, String>() {
					@Override
					public String apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getLanguage();
					}
				},
				new BiConsumer<DDMTemplate, String>() {
					@Override
					public void accept(DDMTemplate ddmTemplate, String language) {
						ddmTemplate.setLanguage(language);
					}
				});
		}
	}

	public static class ScriptAccessor extends ModelPropertyAccessor {
		public ScriptAccessor() {
			super(new Function<DDMTemplate, String>() {
					@Override
					public String apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getScript();
					}
				},
				new BiConsumer<DDMTemplate, String>() {
					@Override
					public void accept(DDMTemplate ddmTemplate, String script) {
						ddmTemplate.setScript(script);
					}
				});
		}
	}

	public static class CacheableAccessor extends ModelPropertyAccessor {
		public CacheableAccessor() {
			super(new Function<DDMTemplate, Boolean>() {
					@Override
					public Boolean apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getCacheable();
					}
				},
				new BiConsumer<DDMTemplate, Boolean>() {
					@Override
					public void accept(DDMTemplate ddmTemplate,
						Boolean cacheable) {
						ddmTemplate.setCacheable(cacheable);
					}
				});
		}
	}

	public static class SmallImageAccessor extends ModelPropertyAccessor {
		public SmallImageAccessor() {
			super(new Function<DDMTemplate, Boolean>() {
					@Override
					public Boolean apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getSmallImage();
					}
				},
				new BiConsumer<DDMTemplate, Boolean>() {
					@Override
					public void accept(DDMTemplate ddmTemplate,
						Boolean smallImage) {
						ddmTemplate.setSmallImage(smallImage);
					}
				});
		}
	}

	public static class SmallImageIdAccessor extends ModelPropertyAccessor {
		public SmallImageIdAccessor() {
			super(new Function<DDMTemplate, Long>() {
					@Override
					public Long apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getSmallImageId();
					}
				},
				new BiConsumer<DDMTemplate, Long>() {
					@Override
					public void accept(DDMTemplate ddmTemplate,
						Long smallImageId) {
						ddmTemplate.setSmallImageId(smallImageId);
					}
				});
		}
	}

	public static class SmallImageURLAccessor extends ModelPropertyAccessor {
		public SmallImageURLAccessor() {
			super(new Function<DDMTemplate, String>() {
					@Override
					public String apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getSmallImageURL();
					}
				},
				new BiConsumer<DDMTemplate, String>() {
					@Override
					public void accept(DDMTemplate ddmTemplate,
						String smallImageURL) {
						ddmTemplate.setSmallImageURL(smallImageURL);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<DDMTemplate, Date>() {
					@Override
					public Date apply(DDMTemplate ddmTemplate) {
						return ddmTemplate.getLastPublishDate();
					}
				},
				new BiConsumer<DDMTemplate, Date>() {
					@Override
					public void accept(DDMTemplate ddmTemplate,
						Date lastPublishDate) {
						ddmTemplate.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private DDMTemplateModelAccessors() {
	}
}