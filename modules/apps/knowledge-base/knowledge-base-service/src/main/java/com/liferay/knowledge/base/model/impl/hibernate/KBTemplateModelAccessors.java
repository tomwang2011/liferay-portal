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

package com.liferay.knowledge.base.model.impl.hibernate;

import com.liferay.knowledge.base.model.KBTemplate;

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
public class KBTemplateModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<KBTemplate, String>() {
					@Override
					public String apply(KBTemplate kbTemplate) {
						return kbTemplate.getUuid();
					}
				},
				new BiConsumer<KBTemplate, String>() {
					@Override
					public void accept(KBTemplate kbTemplate, String uuid) {
						kbTemplate.setUuid(uuid);
					}
				});
		}
	}

	public static class KbTemplateIdAccessor extends ModelPropertyAccessor {
		public KbTemplateIdAccessor() {
			super(new Function<KBTemplate, Long>() {
					@Override
					public Long apply(KBTemplate kbTemplate) {
						return kbTemplate.getKbTemplateId();
					}
				},
				new BiConsumer<KBTemplate, Long>() {
					@Override
					public void accept(KBTemplate kbTemplate, Long kbTemplateId) {
						kbTemplate.setKbTemplateId(kbTemplateId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KBTemplate, Long>() {
					@Override
					public Long apply(KBTemplate kbTemplate) {
						return kbTemplate.getGroupId();
					}
				},
				new BiConsumer<KBTemplate, Long>() {
					@Override
					public void accept(KBTemplate kbTemplate, Long groupId) {
						kbTemplate.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KBTemplate, Long>() {
					@Override
					public Long apply(KBTemplate kbTemplate) {
						return kbTemplate.getCompanyId();
					}
				},
				new BiConsumer<KBTemplate, Long>() {
					@Override
					public void accept(KBTemplate kbTemplate, Long companyId) {
						kbTemplate.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KBTemplate, Long>() {
					@Override
					public Long apply(KBTemplate kbTemplate) {
						return kbTemplate.getUserId();
					}
				},
				new BiConsumer<KBTemplate, Long>() {
					@Override
					public void accept(KBTemplate kbTemplate, Long userId) {
						kbTemplate.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KBTemplate, String>() {
					@Override
					public String apply(KBTemplate kbTemplate) {
						return kbTemplate.getUserName();
					}
				},
				new BiConsumer<KBTemplate, String>() {
					@Override
					public void accept(KBTemplate kbTemplate, String userName) {
						kbTemplate.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KBTemplate, Date>() {
					@Override
					public Date apply(KBTemplate kbTemplate) {
						return kbTemplate.getCreateDate();
					}
				},
				new BiConsumer<KBTemplate, Date>() {
					@Override
					public void accept(KBTemplate kbTemplate, Date createDate) {
						kbTemplate.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KBTemplate, Date>() {
					@Override
					public Date apply(KBTemplate kbTemplate) {
						return kbTemplate.getModifiedDate();
					}
				},
				new BiConsumer<KBTemplate, Date>() {
					@Override
					public void accept(KBTemplate kbTemplate, Date modifiedDate) {
						kbTemplate.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<KBTemplate, String>() {
					@Override
					public String apply(KBTemplate kbTemplate) {
						return kbTemplate.getTitle();
					}
				},
				new BiConsumer<KBTemplate, String>() {
					@Override
					public void accept(KBTemplate kbTemplate, String title) {
						kbTemplate.setTitle(title);
					}
				});
		}
	}

	public static class ContentAccessor extends ModelPropertyAccessor {
		public ContentAccessor() {
			super(new Function<KBTemplate, String>() {
					@Override
					public String apply(KBTemplate kbTemplate) {
						return kbTemplate.getContent();
					}
				},
				new BiConsumer<KBTemplate, String>() {
					@Override
					public void accept(KBTemplate kbTemplate, String content) {
						kbTemplate.setContent(content);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<KBTemplate, Date>() {
					@Override
					public Date apply(KBTemplate kbTemplate) {
						return kbTemplate.getLastPublishDate();
					}
				},
				new BiConsumer<KBTemplate, Date>() {
					@Override
					public void accept(KBTemplate kbTemplate,
						Date lastPublishDate) {
						kbTemplate.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private KBTemplateModelAccessors() {
	}
}