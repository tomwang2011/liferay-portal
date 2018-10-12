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

package com.liferay.calendar.model.impl.hibernate;

import com.liferay.calendar.model.CalendarNotificationTemplate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Eduardo Lundgren
 * @generated
 */
public class CalendarNotificationTemplateModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<CalendarNotificationTemplate, String>() {
					@Override
					public String apply(
						CalendarNotificationTemplate calendarNotificationTemplate) {
						return calendarNotificationTemplate.getUuid();
					}
				},
				new BiConsumer<CalendarNotificationTemplate, String>() {
					@Override
					public void accept(
						CalendarNotificationTemplate calendarNotificationTemplate,
						String uuid) {
						calendarNotificationTemplate.setUuid(uuid);
					}
				});
		}
	}

	public static class CalendarNotificationTemplateIdAccessor
		extends ModelPropertyAccessor {
		public CalendarNotificationTemplateIdAccessor() {
			super(new Function<CalendarNotificationTemplate, Long>() {
					@Override
					public Long apply(
						CalendarNotificationTemplate calendarNotificationTemplate) {
						return calendarNotificationTemplate.getCalendarNotificationTemplateId();
					}
				},
				new BiConsumer<CalendarNotificationTemplate, Long>() {
					@Override
					public void accept(
						CalendarNotificationTemplate calendarNotificationTemplate,
						Long calendarNotificationTemplateId) {
						calendarNotificationTemplate.setCalendarNotificationTemplateId(calendarNotificationTemplateId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<CalendarNotificationTemplate, Long>() {
					@Override
					public Long apply(
						CalendarNotificationTemplate calendarNotificationTemplate) {
						return calendarNotificationTemplate.getGroupId();
					}
				},
				new BiConsumer<CalendarNotificationTemplate, Long>() {
					@Override
					public void accept(
						CalendarNotificationTemplate calendarNotificationTemplate,
						Long groupId) {
						calendarNotificationTemplate.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<CalendarNotificationTemplate, Long>() {
					@Override
					public Long apply(
						CalendarNotificationTemplate calendarNotificationTemplate) {
						return calendarNotificationTemplate.getCompanyId();
					}
				},
				new BiConsumer<CalendarNotificationTemplate, Long>() {
					@Override
					public void accept(
						CalendarNotificationTemplate calendarNotificationTemplate,
						Long companyId) {
						calendarNotificationTemplate.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<CalendarNotificationTemplate, Long>() {
					@Override
					public Long apply(
						CalendarNotificationTemplate calendarNotificationTemplate) {
						return calendarNotificationTemplate.getUserId();
					}
				},
				new BiConsumer<CalendarNotificationTemplate, Long>() {
					@Override
					public void accept(
						CalendarNotificationTemplate calendarNotificationTemplate,
						Long userId) {
						calendarNotificationTemplate.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<CalendarNotificationTemplate, String>() {
					@Override
					public String apply(
						CalendarNotificationTemplate calendarNotificationTemplate) {
						return calendarNotificationTemplate.getUserName();
					}
				},
				new BiConsumer<CalendarNotificationTemplate, String>() {
					@Override
					public void accept(
						CalendarNotificationTemplate calendarNotificationTemplate,
						String userName) {
						calendarNotificationTemplate.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<CalendarNotificationTemplate, Date>() {
					@Override
					public Date apply(
						CalendarNotificationTemplate calendarNotificationTemplate) {
						return calendarNotificationTemplate.getCreateDate();
					}
				},
				new BiConsumer<CalendarNotificationTemplate, Date>() {
					@Override
					public void accept(
						CalendarNotificationTemplate calendarNotificationTemplate,
						Date createDate) {
						calendarNotificationTemplate.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<CalendarNotificationTemplate, Date>() {
					@Override
					public Date apply(
						CalendarNotificationTemplate calendarNotificationTemplate) {
						return calendarNotificationTemplate.getModifiedDate();
					}
				},
				new BiConsumer<CalendarNotificationTemplate, Date>() {
					@Override
					public void accept(
						CalendarNotificationTemplate calendarNotificationTemplate,
						Date modifiedDate) {
						calendarNotificationTemplate.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class CalendarIdAccessor extends ModelPropertyAccessor {
		public CalendarIdAccessor() {
			super(new Function<CalendarNotificationTemplate, Long>() {
					@Override
					public Long apply(
						CalendarNotificationTemplate calendarNotificationTemplate) {
						return calendarNotificationTemplate.getCalendarId();
					}
				},
				new BiConsumer<CalendarNotificationTemplate, Long>() {
					@Override
					public void accept(
						CalendarNotificationTemplate calendarNotificationTemplate,
						Long calendarId) {
						calendarNotificationTemplate.setCalendarId(calendarId);
					}
				});
		}
	}

	public static class NotificationTypeAccessor extends ModelPropertyAccessor {
		public NotificationTypeAccessor() {
			super(new Function<CalendarNotificationTemplate, String>() {
					@Override
					public String apply(
						CalendarNotificationTemplate calendarNotificationTemplate) {
						return calendarNotificationTemplate.getNotificationType();
					}
				},
				new BiConsumer<CalendarNotificationTemplate, String>() {
					@Override
					public void accept(
						CalendarNotificationTemplate calendarNotificationTemplate,
						String notificationType) {
						calendarNotificationTemplate.setNotificationType(notificationType);
					}
				});
		}
	}

	public static class NotificationTypeSettingsAccessor
		extends ModelPropertyAccessor {
		public NotificationTypeSettingsAccessor() {
			super(new Function<CalendarNotificationTemplate, String>() {
					@Override
					public String apply(
						CalendarNotificationTemplate calendarNotificationTemplate) {
						return calendarNotificationTemplate.getNotificationTypeSettings();
					}
				},
				new BiConsumer<CalendarNotificationTemplate, String>() {
					@Override
					public void accept(
						CalendarNotificationTemplate calendarNotificationTemplate,
						String notificationTypeSettings) {
						calendarNotificationTemplate.setNotificationTypeSettings(notificationTypeSettings);
					}
				});
		}
	}

	public static class NotificationTemplateTypeAccessor
		extends ModelPropertyAccessor {
		public NotificationTemplateTypeAccessor() {
			super(new Function<CalendarNotificationTemplate, String>() {
					@Override
					public String apply(
						CalendarNotificationTemplate calendarNotificationTemplate) {
						return calendarNotificationTemplate.getNotificationTemplateType();
					}
				},
				new BiConsumer<CalendarNotificationTemplate, String>() {
					@Override
					public void accept(
						CalendarNotificationTemplate calendarNotificationTemplate,
						String notificationTemplateType) {
						calendarNotificationTemplate.setNotificationTemplateType(notificationTemplateType);
					}
				});
		}
	}

	public static class SubjectAccessor extends ModelPropertyAccessor {
		public SubjectAccessor() {
			super(new Function<CalendarNotificationTemplate, String>() {
					@Override
					public String apply(
						CalendarNotificationTemplate calendarNotificationTemplate) {
						return calendarNotificationTemplate.getSubject();
					}
				},
				new BiConsumer<CalendarNotificationTemplate, String>() {
					@Override
					public void accept(
						CalendarNotificationTemplate calendarNotificationTemplate,
						String subject) {
						calendarNotificationTemplate.setSubject(subject);
					}
				});
		}
	}

	public static class BodyAccessor extends ModelPropertyAccessor {
		public BodyAccessor() {
			super(new Function<CalendarNotificationTemplate, String>() {
					@Override
					public String apply(
						CalendarNotificationTemplate calendarNotificationTemplate) {
						return calendarNotificationTemplate.getBody();
					}
				},
				new BiConsumer<CalendarNotificationTemplate, String>() {
					@Override
					public void accept(
						CalendarNotificationTemplate calendarNotificationTemplate,
						String body) {
						calendarNotificationTemplate.setBody(body);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<CalendarNotificationTemplate, Date>() {
					@Override
					public Date apply(
						CalendarNotificationTemplate calendarNotificationTemplate) {
						return calendarNotificationTemplate.getLastPublishDate();
					}
				},
				new BiConsumer<CalendarNotificationTemplate, Date>() {
					@Override
					public void accept(
						CalendarNotificationTemplate calendarNotificationTemplate,
						Date lastPublishDate) {
						calendarNotificationTemplate.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private CalendarNotificationTemplateModelAccessors() {
	}
}