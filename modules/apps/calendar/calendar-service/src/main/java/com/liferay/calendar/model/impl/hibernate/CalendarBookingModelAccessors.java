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

import com.liferay.calendar.model.CalendarBooking;

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
public class CalendarBookingModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<CalendarBooking, String>() {
					@Override
					public String apply(CalendarBooking calendarBooking) {
						return calendarBooking.getUuid();
					}
				},
				new BiConsumer<CalendarBooking, String>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						String uuid) {
						calendarBooking.setUuid(uuid);
					}
				});
		}
	}

	public static class CalendarBookingIdAccessor extends ModelPropertyAccessor {
		public CalendarBookingIdAccessor() {
			super(new Function<CalendarBooking, Long>() {
					@Override
					public Long apply(CalendarBooking calendarBooking) {
						return calendarBooking.getCalendarBookingId();
					}
				},
				new BiConsumer<CalendarBooking, Long>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Long calendarBookingId) {
						calendarBooking.setCalendarBookingId(calendarBookingId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<CalendarBooking, Long>() {
					@Override
					public Long apply(CalendarBooking calendarBooking) {
						return calendarBooking.getGroupId();
					}
				},
				new BiConsumer<CalendarBooking, Long>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Long groupId) {
						calendarBooking.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<CalendarBooking, Long>() {
					@Override
					public Long apply(CalendarBooking calendarBooking) {
						return calendarBooking.getCompanyId();
					}
				},
				new BiConsumer<CalendarBooking, Long>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Long companyId) {
						calendarBooking.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<CalendarBooking, Long>() {
					@Override
					public Long apply(CalendarBooking calendarBooking) {
						return calendarBooking.getUserId();
					}
				},
				new BiConsumer<CalendarBooking, Long>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Long userId) {
						calendarBooking.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<CalendarBooking, String>() {
					@Override
					public String apply(CalendarBooking calendarBooking) {
						return calendarBooking.getUserName();
					}
				},
				new BiConsumer<CalendarBooking, String>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						String userName) {
						calendarBooking.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<CalendarBooking, Date>() {
					@Override
					public Date apply(CalendarBooking calendarBooking) {
						return calendarBooking.getCreateDate();
					}
				},
				new BiConsumer<CalendarBooking, Date>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Date createDate) {
						calendarBooking.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<CalendarBooking, Date>() {
					@Override
					public Date apply(CalendarBooking calendarBooking) {
						return calendarBooking.getModifiedDate();
					}
				},
				new BiConsumer<CalendarBooking, Date>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Date modifiedDate) {
						calendarBooking.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class CalendarIdAccessor extends ModelPropertyAccessor {
		public CalendarIdAccessor() {
			super(new Function<CalendarBooking, Long>() {
					@Override
					public Long apply(CalendarBooking calendarBooking) {
						return calendarBooking.getCalendarId();
					}
				},
				new BiConsumer<CalendarBooking, Long>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Long calendarId) {
						calendarBooking.setCalendarId(calendarId);
					}
				});
		}
	}

	public static class CalendarResourceIdAccessor extends ModelPropertyAccessor {
		public CalendarResourceIdAccessor() {
			super(new Function<CalendarBooking, Long>() {
					@Override
					public Long apply(CalendarBooking calendarBooking) {
						return calendarBooking.getCalendarResourceId();
					}
				},
				new BiConsumer<CalendarBooking, Long>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Long calendarResourceId) {
						calendarBooking.setCalendarResourceId(calendarResourceId);
					}
				});
		}
	}

	public static class ParentCalendarBookingIdAccessor
		extends ModelPropertyAccessor {
		public ParentCalendarBookingIdAccessor() {
			super(new Function<CalendarBooking, Long>() {
					@Override
					public Long apply(CalendarBooking calendarBooking) {
						return calendarBooking.getParentCalendarBookingId();
					}
				},
				new BiConsumer<CalendarBooking, Long>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Long parentCalendarBookingId) {
						calendarBooking.setParentCalendarBookingId(parentCalendarBookingId);
					}
				});
		}
	}

	public static class RecurringCalendarBookingIdAccessor
		extends ModelPropertyAccessor {
		public RecurringCalendarBookingIdAccessor() {
			super(new Function<CalendarBooking, Long>() {
					@Override
					public Long apply(CalendarBooking calendarBooking) {
						return calendarBooking.getRecurringCalendarBookingId();
					}
				},
				new BiConsumer<CalendarBooking, Long>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Long recurringCalendarBookingId) {
						calendarBooking.setRecurringCalendarBookingId(recurringCalendarBookingId);
					}
				});
		}
	}

	public static class VEventUidAccessor extends ModelPropertyAccessor {
		public VEventUidAccessor() {
			super(new Function<CalendarBooking, String>() {
					@Override
					public String apply(CalendarBooking calendarBooking) {
						return calendarBooking.getVEventUid();
					}
				},
				new BiConsumer<CalendarBooking, String>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						String vEventUid) {
						calendarBooking.setVEventUid(vEventUid);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<CalendarBooking, String>() {
					@Override
					public String apply(CalendarBooking calendarBooking) {
						return calendarBooking.getTitle();
					}
				},
				new BiConsumer<CalendarBooking, String>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						String title) {
						calendarBooking.setTitle(title);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<CalendarBooking, String>() {
					@Override
					public String apply(CalendarBooking calendarBooking) {
						return calendarBooking.getDescription();
					}
				},
				new BiConsumer<CalendarBooking, String>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						String description) {
						calendarBooking.setDescription(description);
					}
				});
		}
	}

	public static class LocationAccessor extends ModelPropertyAccessor {
		public LocationAccessor() {
			super(new Function<CalendarBooking, String>() {
					@Override
					public String apply(CalendarBooking calendarBooking) {
						return calendarBooking.getLocation();
					}
				},
				new BiConsumer<CalendarBooking, String>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						String location) {
						calendarBooking.setLocation(location);
					}
				});
		}
	}

	public static class StartTimeAccessor extends ModelPropertyAccessor {
		public StartTimeAccessor() {
			super(new Function<CalendarBooking, Long>() {
					@Override
					public Long apply(CalendarBooking calendarBooking) {
						return calendarBooking.getStartTime();
					}
				},
				new BiConsumer<CalendarBooking, Long>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Long startTime) {
						calendarBooking.setStartTime(startTime);
					}
				});
		}
	}

	public static class EndTimeAccessor extends ModelPropertyAccessor {
		public EndTimeAccessor() {
			super(new Function<CalendarBooking, Long>() {
					@Override
					public Long apply(CalendarBooking calendarBooking) {
						return calendarBooking.getEndTime();
					}
				},
				new BiConsumer<CalendarBooking, Long>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Long endTime) {
						calendarBooking.setEndTime(endTime);
					}
				});
		}
	}

	public static class AllDayAccessor extends ModelPropertyAccessor {
		public AllDayAccessor() {
			super(new Function<CalendarBooking, Boolean>() {
					@Override
					public Boolean apply(CalendarBooking calendarBooking) {
						return calendarBooking.getAllDay();
					}
				},
				new BiConsumer<CalendarBooking, Boolean>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Boolean allDay) {
						calendarBooking.setAllDay(allDay);
					}
				});
		}
	}

	public static class RecurrenceAccessor extends ModelPropertyAccessor {
		public RecurrenceAccessor() {
			super(new Function<CalendarBooking, String>() {
					@Override
					public String apply(CalendarBooking calendarBooking) {
						return calendarBooking.getRecurrence();
					}
				},
				new BiConsumer<CalendarBooking, String>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						String recurrence) {
						calendarBooking.setRecurrence(recurrence);
					}
				});
		}
	}

	public static class FirstReminderAccessor extends ModelPropertyAccessor {
		public FirstReminderAccessor() {
			super(new Function<CalendarBooking, Long>() {
					@Override
					public Long apply(CalendarBooking calendarBooking) {
						return calendarBooking.getFirstReminder();
					}
				},
				new BiConsumer<CalendarBooking, Long>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Long firstReminder) {
						calendarBooking.setFirstReminder(firstReminder);
					}
				});
		}
	}

	public static class FirstReminderTypeAccessor extends ModelPropertyAccessor {
		public FirstReminderTypeAccessor() {
			super(new Function<CalendarBooking, String>() {
					@Override
					public String apply(CalendarBooking calendarBooking) {
						return calendarBooking.getFirstReminderType();
					}
				},
				new BiConsumer<CalendarBooking, String>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						String firstReminderType) {
						calendarBooking.setFirstReminderType(firstReminderType);
					}
				});
		}
	}

	public static class SecondReminderAccessor extends ModelPropertyAccessor {
		public SecondReminderAccessor() {
			super(new Function<CalendarBooking, Long>() {
					@Override
					public Long apply(CalendarBooking calendarBooking) {
						return calendarBooking.getSecondReminder();
					}
				},
				new BiConsumer<CalendarBooking, Long>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Long secondReminder) {
						calendarBooking.setSecondReminder(secondReminder);
					}
				});
		}
	}

	public static class SecondReminderTypeAccessor extends ModelPropertyAccessor {
		public SecondReminderTypeAccessor() {
			super(new Function<CalendarBooking, String>() {
					@Override
					public String apply(CalendarBooking calendarBooking) {
						return calendarBooking.getSecondReminderType();
					}
				},
				new BiConsumer<CalendarBooking, String>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						String secondReminderType) {
						calendarBooking.setSecondReminderType(secondReminderType);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<CalendarBooking, Date>() {
					@Override
					public Date apply(CalendarBooking calendarBooking) {
						return calendarBooking.getLastPublishDate();
					}
				},
				new BiConsumer<CalendarBooking, Date>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Date lastPublishDate) {
						calendarBooking.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<CalendarBooking, Integer>() {
					@Override
					public Integer apply(CalendarBooking calendarBooking) {
						return calendarBooking.getStatus();
					}
				},
				new BiConsumer<CalendarBooking, Integer>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Integer status) {
						calendarBooking.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<CalendarBooking, Long>() {
					@Override
					public Long apply(CalendarBooking calendarBooking) {
						return calendarBooking.getStatusByUserId();
					}
				},
				new BiConsumer<CalendarBooking, Long>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Long statusByUserId) {
						calendarBooking.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<CalendarBooking, String>() {
					@Override
					public String apply(CalendarBooking calendarBooking) {
						return calendarBooking.getStatusByUserName();
					}
				},
				new BiConsumer<CalendarBooking, String>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						String statusByUserName) {
						calendarBooking.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<CalendarBooking, Date>() {
					@Override
					public Date apply(CalendarBooking calendarBooking) {
						return calendarBooking.getStatusDate();
					}
				},
				new BiConsumer<CalendarBooking, Date>() {
					@Override
					public void accept(CalendarBooking calendarBooking,
						Date statusDate) {
						calendarBooking.setStatusDate(statusDate);
					}
				});
		}
	}

	private CalendarBookingModelAccessors() {
	}
}