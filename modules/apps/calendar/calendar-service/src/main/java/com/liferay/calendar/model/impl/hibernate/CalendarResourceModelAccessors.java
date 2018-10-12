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

import com.liferay.calendar.model.CalendarResource;

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
public class CalendarResourceModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<CalendarResource, String>() {
					@Override
					public String apply(CalendarResource calendarResource) {
						return calendarResource.getUuid();
					}
				},
				new BiConsumer<CalendarResource, String>() {
					@Override
					public void accept(CalendarResource calendarResource,
						String uuid) {
						calendarResource.setUuid(uuid);
					}
				});
		}
	}

	public static class CalendarResourceIdAccessor extends ModelPropertyAccessor {
		public CalendarResourceIdAccessor() {
			super(new Function<CalendarResource, Long>() {
					@Override
					public Long apply(CalendarResource calendarResource) {
						return calendarResource.getCalendarResourceId();
					}
				},
				new BiConsumer<CalendarResource, Long>() {
					@Override
					public void accept(CalendarResource calendarResource,
						Long calendarResourceId) {
						calendarResource.setCalendarResourceId(calendarResourceId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<CalendarResource, Long>() {
					@Override
					public Long apply(CalendarResource calendarResource) {
						return calendarResource.getGroupId();
					}
				},
				new BiConsumer<CalendarResource, Long>() {
					@Override
					public void accept(CalendarResource calendarResource,
						Long groupId) {
						calendarResource.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<CalendarResource, Long>() {
					@Override
					public Long apply(CalendarResource calendarResource) {
						return calendarResource.getCompanyId();
					}
				},
				new BiConsumer<CalendarResource, Long>() {
					@Override
					public void accept(CalendarResource calendarResource,
						Long companyId) {
						calendarResource.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<CalendarResource, Long>() {
					@Override
					public Long apply(CalendarResource calendarResource) {
						return calendarResource.getUserId();
					}
				},
				new BiConsumer<CalendarResource, Long>() {
					@Override
					public void accept(CalendarResource calendarResource,
						Long userId) {
						calendarResource.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<CalendarResource, String>() {
					@Override
					public String apply(CalendarResource calendarResource) {
						return calendarResource.getUserName();
					}
				},
				new BiConsumer<CalendarResource, String>() {
					@Override
					public void accept(CalendarResource calendarResource,
						String userName) {
						calendarResource.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<CalendarResource, Date>() {
					@Override
					public Date apply(CalendarResource calendarResource) {
						return calendarResource.getCreateDate();
					}
				},
				new BiConsumer<CalendarResource, Date>() {
					@Override
					public void accept(CalendarResource calendarResource,
						Date createDate) {
						calendarResource.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<CalendarResource, Date>() {
					@Override
					public Date apply(CalendarResource calendarResource) {
						return calendarResource.getModifiedDate();
					}
				},
				new BiConsumer<CalendarResource, Date>() {
					@Override
					public void accept(CalendarResource calendarResource,
						Date modifiedDate) {
						calendarResource.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<CalendarResource, Long>() {
					@Override
					public Long apply(CalendarResource calendarResource) {
						return calendarResource.getClassNameId();
					}
				},
				new BiConsumer<CalendarResource, Long>() {
					@Override
					public void accept(CalendarResource calendarResource,
						Long classNameId) {
						calendarResource.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<CalendarResource, Long>() {
					@Override
					public Long apply(CalendarResource calendarResource) {
						return calendarResource.getClassPK();
					}
				},
				new BiConsumer<CalendarResource, Long>() {
					@Override
					public void accept(CalendarResource calendarResource,
						Long classPK) {
						calendarResource.setClassPK(classPK);
					}
				});
		}
	}

	public static class ClassUuidAccessor extends ModelPropertyAccessor {
		public ClassUuidAccessor() {
			super(new Function<CalendarResource, String>() {
					@Override
					public String apply(CalendarResource calendarResource) {
						return calendarResource.getClassUuid();
					}
				},
				new BiConsumer<CalendarResource, String>() {
					@Override
					public void accept(CalendarResource calendarResource,
						String classUuid) {
						calendarResource.setClassUuid(classUuid);
					}
				});
		}
	}

	public static class CodeAccessor extends ModelPropertyAccessor {
		public CodeAccessor() {
			super(new Function<CalendarResource, String>() {
					@Override
					public String apply(CalendarResource calendarResource) {
						return calendarResource.getCode();
					}
				},
				new BiConsumer<CalendarResource, String>() {
					@Override
					public void accept(CalendarResource calendarResource,
						String code) {
						calendarResource.setCode(code);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<CalendarResource, String>() {
					@Override
					public String apply(CalendarResource calendarResource) {
						return calendarResource.getName();
					}
				},
				new BiConsumer<CalendarResource, String>() {
					@Override
					public void accept(CalendarResource calendarResource,
						String name) {
						calendarResource.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<CalendarResource, String>() {
					@Override
					public String apply(CalendarResource calendarResource) {
						return calendarResource.getDescription();
					}
				},
				new BiConsumer<CalendarResource, String>() {
					@Override
					public void accept(CalendarResource calendarResource,
						String description) {
						calendarResource.setDescription(description);
					}
				});
		}
	}

	public static class ActiveAccessor extends ModelPropertyAccessor {
		public ActiveAccessor() {
			super(new Function<CalendarResource, Boolean>() {
					@Override
					public Boolean apply(CalendarResource calendarResource) {
						return calendarResource.getActive();
					}
				},
				new BiConsumer<CalendarResource, Boolean>() {
					@Override
					public void accept(CalendarResource calendarResource,
						Boolean active) {
						calendarResource.setActive(active);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<CalendarResource, Date>() {
					@Override
					public Date apply(CalendarResource calendarResource) {
						return calendarResource.getLastPublishDate();
					}
				},
				new BiConsumer<CalendarResource, Date>() {
					@Override
					public void accept(CalendarResource calendarResource,
						Date lastPublishDate) {
						calendarResource.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private CalendarResourceModelAccessors() {
	}
}