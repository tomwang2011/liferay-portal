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

package com.liferay.portal.workflow.kaleo.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;
import com.liferay.portal.workflow.kaleo.model.KaleoNotification;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoNotificationModelAccessors {
	public static class KaleoNotificationIdAccessor
		extends ModelPropertyAccessor {
		public KaleoNotificationIdAccessor() {
			super(new Function<KaleoNotification, Long>() {
					@Override
					public Long apply(KaleoNotification kaleoNotification) {
						return kaleoNotification.getKaleoNotificationId();
					}
				},
				new BiConsumer<KaleoNotification, Long>() {
					@Override
					public void accept(KaleoNotification kaleoNotification,
						Long kaleoNotificationId) {
						kaleoNotification.setKaleoNotificationId(kaleoNotificationId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoNotification, Long>() {
					@Override
					public Long apply(KaleoNotification kaleoNotification) {
						return kaleoNotification.getGroupId();
					}
				},
				new BiConsumer<KaleoNotification, Long>() {
					@Override
					public void accept(KaleoNotification kaleoNotification,
						Long groupId) {
						kaleoNotification.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoNotification, Long>() {
					@Override
					public Long apply(KaleoNotification kaleoNotification) {
						return kaleoNotification.getCompanyId();
					}
				},
				new BiConsumer<KaleoNotification, Long>() {
					@Override
					public void accept(KaleoNotification kaleoNotification,
						Long companyId) {
						kaleoNotification.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoNotification, Long>() {
					@Override
					public Long apply(KaleoNotification kaleoNotification) {
						return kaleoNotification.getUserId();
					}
				},
				new BiConsumer<KaleoNotification, Long>() {
					@Override
					public void accept(KaleoNotification kaleoNotification,
						Long userId) {
						kaleoNotification.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoNotification, String>() {
					@Override
					public String apply(KaleoNotification kaleoNotification) {
						return kaleoNotification.getUserName();
					}
				},
				new BiConsumer<KaleoNotification, String>() {
					@Override
					public void accept(KaleoNotification kaleoNotification,
						String userName) {
						kaleoNotification.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoNotification, Date>() {
					@Override
					public Date apply(KaleoNotification kaleoNotification) {
						return kaleoNotification.getCreateDate();
					}
				},
				new BiConsumer<KaleoNotification, Date>() {
					@Override
					public void accept(KaleoNotification kaleoNotification,
						Date createDate) {
						kaleoNotification.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoNotification, Date>() {
					@Override
					public Date apply(KaleoNotification kaleoNotification) {
						return kaleoNotification.getModifiedDate();
					}
				},
				new BiConsumer<KaleoNotification, Date>() {
					@Override
					public void accept(KaleoNotification kaleoNotification,
						Date modifiedDate) {
						kaleoNotification.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class KaleoClassNameAccessor extends ModelPropertyAccessor {
		public KaleoClassNameAccessor() {
			super(new Function<KaleoNotification, String>() {
					@Override
					public String apply(KaleoNotification kaleoNotification) {
						return kaleoNotification.getKaleoClassName();
					}
				},
				new BiConsumer<KaleoNotification, String>() {
					@Override
					public void accept(KaleoNotification kaleoNotification,
						String kaleoClassName) {
						kaleoNotification.setKaleoClassName(kaleoClassName);
					}
				});
		}
	}

	public static class KaleoClassPKAccessor extends ModelPropertyAccessor {
		public KaleoClassPKAccessor() {
			super(new Function<KaleoNotification, Long>() {
					@Override
					public Long apply(KaleoNotification kaleoNotification) {
						return kaleoNotification.getKaleoClassPK();
					}
				},
				new BiConsumer<KaleoNotification, Long>() {
					@Override
					public void accept(KaleoNotification kaleoNotification,
						Long kaleoClassPK) {
						kaleoNotification.setKaleoClassPK(kaleoClassPK);
					}
				});
		}
	}

	public static class KaleoDefinitionVersionIdAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionIdAccessor() {
			super(new Function<KaleoNotification, Long>() {
					@Override
					public Long apply(KaleoNotification kaleoNotification) {
						return kaleoNotification.getKaleoDefinitionVersionId();
					}
				},
				new BiConsumer<KaleoNotification, Long>() {
					@Override
					public void accept(KaleoNotification kaleoNotification,
						Long kaleoDefinitionVersionId) {
						kaleoNotification.setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
					}
				});
		}
	}

	public static class KaleoNodeNameAccessor extends ModelPropertyAccessor {
		public KaleoNodeNameAccessor() {
			super(new Function<KaleoNotification, String>() {
					@Override
					public String apply(KaleoNotification kaleoNotification) {
						return kaleoNotification.getKaleoNodeName();
					}
				},
				new BiConsumer<KaleoNotification, String>() {
					@Override
					public void accept(KaleoNotification kaleoNotification,
						String kaleoNodeName) {
						kaleoNotification.setKaleoNodeName(kaleoNodeName);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<KaleoNotification, String>() {
					@Override
					public String apply(KaleoNotification kaleoNotification) {
						return kaleoNotification.getName();
					}
				},
				new BiConsumer<KaleoNotification, String>() {
					@Override
					public void accept(KaleoNotification kaleoNotification,
						String name) {
						kaleoNotification.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<KaleoNotification, String>() {
					@Override
					public String apply(KaleoNotification kaleoNotification) {
						return kaleoNotification.getDescription();
					}
				},
				new BiConsumer<KaleoNotification, String>() {
					@Override
					public void accept(KaleoNotification kaleoNotification,
						String description) {
						kaleoNotification.setDescription(description);
					}
				});
		}
	}

	public static class ExecutionTypeAccessor extends ModelPropertyAccessor {
		public ExecutionTypeAccessor() {
			super(new Function<KaleoNotification, String>() {
					@Override
					public String apply(KaleoNotification kaleoNotification) {
						return kaleoNotification.getExecutionType();
					}
				},
				new BiConsumer<KaleoNotification, String>() {
					@Override
					public void accept(KaleoNotification kaleoNotification,
						String executionType) {
						kaleoNotification.setExecutionType(executionType);
					}
				});
		}
	}

	public static class TemplateAccessor extends ModelPropertyAccessor {
		public TemplateAccessor() {
			super(new Function<KaleoNotification, String>() {
					@Override
					public String apply(KaleoNotification kaleoNotification) {
						return kaleoNotification.getTemplate();
					}
				},
				new BiConsumer<KaleoNotification, String>() {
					@Override
					public void accept(KaleoNotification kaleoNotification,
						String template) {
						kaleoNotification.setTemplate(template);
					}
				});
		}
	}

	public static class TemplateLanguageAccessor extends ModelPropertyAccessor {
		public TemplateLanguageAccessor() {
			super(new Function<KaleoNotification, String>() {
					@Override
					public String apply(KaleoNotification kaleoNotification) {
						return kaleoNotification.getTemplateLanguage();
					}
				},
				new BiConsumer<KaleoNotification, String>() {
					@Override
					public void accept(KaleoNotification kaleoNotification,
						String templateLanguage) {
						kaleoNotification.setTemplateLanguage(templateLanguage);
					}
				});
		}
	}

	public static class NotificationTypesAccessor extends ModelPropertyAccessor {
		public NotificationTypesAccessor() {
			super(new Function<KaleoNotification, String>() {
					@Override
					public String apply(KaleoNotification kaleoNotification) {
						return kaleoNotification.getNotificationTypes();
					}
				},
				new BiConsumer<KaleoNotification, String>() {
					@Override
					public void accept(KaleoNotification kaleoNotification,
						String notificationTypes) {
						kaleoNotification.setNotificationTypes(notificationTypes);
					}
				});
		}
	}

	private KaleoNotificationModelAccessors() {
	}
}