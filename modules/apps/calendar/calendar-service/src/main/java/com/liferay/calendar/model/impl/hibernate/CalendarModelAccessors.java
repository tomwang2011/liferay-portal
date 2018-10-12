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

import com.liferay.calendar.model.Calendar;

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
public class CalendarModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<Calendar, String>() {
					@Override
					public String apply(Calendar calendar) {
						return calendar.getUuid();
					}
				},
				new BiConsumer<Calendar, String>() {
					@Override
					public void accept(Calendar calendar, String uuid) {
						calendar.setUuid(uuid);
					}
				});
		}
	}

	public static class CalendarIdAccessor extends ModelPropertyAccessor {
		public CalendarIdAccessor() {
			super(new Function<Calendar, Long>() {
					@Override
					public Long apply(Calendar calendar) {
						return calendar.getCalendarId();
					}
				},
				new BiConsumer<Calendar, Long>() {
					@Override
					public void accept(Calendar calendar, Long calendarId) {
						calendar.setCalendarId(calendarId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<Calendar, Long>() {
					@Override
					public Long apply(Calendar calendar) {
						return calendar.getGroupId();
					}
				},
				new BiConsumer<Calendar, Long>() {
					@Override
					public void accept(Calendar calendar, Long groupId) {
						calendar.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Calendar, Long>() {
					@Override
					public Long apply(Calendar calendar) {
						return calendar.getCompanyId();
					}
				},
				new BiConsumer<Calendar, Long>() {
					@Override
					public void accept(Calendar calendar, Long companyId) {
						calendar.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<Calendar, Long>() {
					@Override
					public Long apply(Calendar calendar) {
						return calendar.getUserId();
					}
				},
				new BiConsumer<Calendar, Long>() {
					@Override
					public void accept(Calendar calendar, Long userId) {
						calendar.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<Calendar, String>() {
					@Override
					public String apply(Calendar calendar) {
						return calendar.getUserName();
					}
				},
				new BiConsumer<Calendar, String>() {
					@Override
					public void accept(Calendar calendar, String userName) {
						calendar.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Calendar, Date>() {
					@Override
					public Date apply(Calendar calendar) {
						return calendar.getCreateDate();
					}
				},
				new BiConsumer<Calendar, Date>() {
					@Override
					public void accept(Calendar calendar, Date createDate) {
						calendar.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<Calendar, Date>() {
					@Override
					public Date apply(Calendar calendar) {
						return calendar.getModifiedDate();
					}
				},
				new BiConsumer<Calendar, Date>() {
					@Override
					public void accept(Calendar calendar, Date modifiedDate) {
						calendar.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class CalendarResourceIdAccessor extends ModelPropertyAccessor {
		public CalendarResourceIdAccessor() {
			super(new Function<Calendar, Long>() {
					@Override
					public Long apply(Calendar calendar) {
						return calendar.getCalendarResourceId();
					}
				},
				new BiConsumer<Calendar, Long>() {
					@Override
					public void accept(Calendar calendar,
						Long calendarResourceId) {
						calendar.setCalendarResourceId(calendarResourceId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<Calendar, String>() {
					@Override
					public String apply(Calendar calendar) {
						return calendar.getName();
					}
				},
				new BiConsumer<Calendar, String>() {
					@Override
					public void accept(Calendar calendar, String name) {
						calendar.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<Calendar, String>() {
					@Override
					public String apply(Calendar calendar) {
						return calendar.getDescription();
					}
				},
				new BiConsumer<Calendar, String>() {
					@Override
					public void accept(Calendar calendar, String description) {
						calendar.setDescription(description);
					}
				});
		}
	}

	public static class TimeZoneIdAccessor extends ModelPropertyAccessor {
		public TimeZoneIdAccessor() {
			super(new Function<Calendar, String>() {
					@Override
					public String apply(Calendar calendar) {
						return calendar.getTimeZoneId();
					}
				},
				new BiConsumer<Calendar, String>() {
					@Override
					public void accept(Calendar calendar, String timeZoneId) {
						calendar.setTimeZoneId(timeZoneId);
					}
				});
		}
	}

	public static class ColorAccessor extends ModelPropertyAccessor {
		public ColorAccessor() {
			super(new Function<Calendar, Integer>() {
					@Override
					public Integer apply(Calendar calendar) {
						return calendar.getColor();
					}
				},
				new BiConsumer<Calendar, Integer>() {
					@Override
					public void accept(Calendar calendar, Integer color) {
						calendar.setColor(color);
					}
				});
		}
	}

	public static class DefaultCalendarAccessor extends ModelPropertyAccessor {
		public DefaultCalendarAccessor() {
			super(new Function<Calendar, Boolean>() {
					@Override
					public Boolean apply(Calendar calendar) {
						return calendar.getDefaultCalendar();
					}
				},
				new BiConsumer<Calendar, Boolean>() {
					@Override
					public void accept(Calendar calendar,
						Boolean defaultCalendar) {
						calendar.setDefaultCalendar(defaultCalendar);
					}
				});
		}
	}

	public static class EnableCommentsAccessor extends ModelPropertyAccessor {
		public EnableCommentsAccessor() {
			super(new Function<Calendar, Boolean>() {
					@Override
					public Boolean apply(Calendar calendar) {
						return calendar.getEnableComments();
					}
				},
				new BiConsumer<Calendar, Boolean>() {
					@Override
					public void accept(Calendar calendar, Boolean enableComments) {
						calendar.setEnableComments(enableComments);
					}
				});
		}
	}

	public static class EnableRatingsAccessor extends ModelPropertyAccessor {
		public EnableRatingsAccessor() {
			super(new Function<Calendar, Boolean>() {
					@Override
					public Boolean apply(Calendar calendar) {
						return calendar.getEnableRatings();
					}
				},
				new BiConsumer<Calendar, Boolean>() {
					@Override
					public void accept(Calendar calendar, Boolean enableRatings) {
						calendar.setEnableRatings(enableRatings);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<Calendar, Date>() {
					@Override
					public Date apply(Calendar calendar) {
						return calendar.getLastPublishDate();
					}
				},
				new BiConsumer<Calendar, Date>() {
					@Override
					public void accept(Calendar calendar, Date lastPublishDate) {
						calendar.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private CalendarModelAccessors() {
	}
}