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

package com.liferay.portal.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;
import com.liferay.portal.kernel.model.SystemEvent;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SystemEventModelAccessors {
	public static class SystemEventIdAccessor extends ModelPropertyAccessor {
		public SystemEventIdAccessor() {
			super(new Function<SystemEvent, Long>() {
					@Override
					public Long apply(SystemEvent systemEvent) {
						return systemEvent.getSystemEventId();
					}
				},
				new BiConsumer<SystemEvent, Long>() {
					@Override
					public void accept(SystemEvent systemEvent,
						Long systemEventId) {
						systemEvent.setSystemEventId(systemEventId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<SystemEvent, Long>() {
					@Override
					public Long apply(SystemEvent systemEvent) {
						return systemEvent.getGroupId();
					}
				},
				new BiConsumer<SystemEvent, Long>() {
					@Override
					public void accept(SystemEvent systemEvent, Long groupId) {
						systemEvent.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<SystemEvent, Long>() {
					@Override
					public Long apply(SystemEvent systemEvent) {
						return systemEvent.getCompanyId();
					}
				},
				new BiConsumer<SystemEvent, Long>() {
					@Override
					public void accept(SystemEvent systemEvent, Long companyId) {
						systemEvent.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<SystemEvent, Long>() {
					@Override
					public Long apply(SystemEvent systemEvent) {
						return systemEvent.getUserId();
					}
				},
				new BiConsumer<SystemEvent, Long>() {
					@Override
					public void accept(SystemEvent systemEvent, Long userId) {
						systemEvent.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<SystemEvent, String>() {
					@Override
					public String apply(SystemEvent systemEvent) {
						return systemEvent.getUserName();
					}
				},
				new BiConsumer<SystemEvent, String>() {
					@Override
					public void accept(SystemEvent systemEvent, String userName) {
						systemEvent.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<SystemEvent, Date>() {
					@Override
					public Date apply(SystemEvent systemEvent) {
						return systemEvent.getCreateDate();
					}
				},
				new BiConsumer<SystemEvent, Date>() {
					@Override
					public void accept(SystemEvent systemEvent, Date createDate) {
						systemEvent.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<SystemEvent, Long>() {
					@Override
					public Long apply(SystemEvent systemEvent) {
						return systemEvent.getClassNameId();
					}
				},
				new BiConsumer<SystemEvent, Long>() {
					@Override
					public void accept(SystemEvent systemEvent, Long classNameId) {
						systemEvent.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<SystemEvent, Long>() {
					@Override
					public Long apply(SystemEvent systemEvent) {
						return systemEvent.getClassPK();
					}
				},
				new BiConsumer<SystemEvent, Long>() {
					@Override
					public void accept(SystemEvent systemEvent, Long classPK) {
						systemEvent.setClassPK(classPK);
					}
				});
		}
	}

	public static class ClassUuidAccessor extends ModelPropertyAccessor {
		public ClassUuidAccessor() {
			super(new Function<SystemEvent, String>() {
					@Override
					public String apply(SystemEvent systemEvent) {
						return systemEvent.getClassUuid();
					}
				},
				new BiConsumer<SystemEvent, String>() {
					@Override
					public void accept(SystemEvent systemEvent, String classUuid) {
						systemEvent.setClassUuid(classUuid);
					}
				});
		}
	}

	public static class ReferrerClassNameIdAccessor
		extends ModelPropertyAccessor {
		public ReferrerClassNameIdAccessor() {
			super(new Function<SystemEvent, Long>() {
					@Override
					public Long apply(SystemEvent systemEvent) {
						return systemEvent.getReferrerClassNameId();
					}
				},
				new BiConsumer<SystemEvent, Long>() {
					@Override
					public void accept(SystemEvent systemEvent,
						Long referrerClassNameId) {
						systemEvent.setReferrerClassNameId(referrerClassNameId);
					}
				});
		}
	}

	public static class ParentSystemEventIdAccessor
		extends ModelPropertyAccessor {
		public ParentSystemEventIdAccessor() {
			super(new Function<SystemEvent, Long>() {
					@Override
					public Long apply(SystemEvent systemEvent) {
						return systemEvent.getParentSystemEventId();
					}
				},
				new BiConsumer<SystemEvent, Long>() {
					@Override
					public void accept(SystemEvent systemEvent,
						Long parentSystemEventId) {
						systemEvent.setParentSystemEventId(parentSystemEventId);
					}
				});
		}
	}

	public static class SystemEventSetKeyAccessor extends ModelPropertyAccessor {
		public SystemEventSetKeyAccessor() {
			super(new Function<SystemEvent, Long>() {
					@Override
					public Long apply(SystemEvent systemEvent) {
						return systemEvent.getSystemEventSetKey();
					}
				},
				new BiConsumer<SystemEvent, Long>() {
					@Override
					public void accept(SystemEvent systemEvent,
						Long systemEventSetKey) {
						systemEvent.setSystemEventSetKey(systemEventSetKey);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<SystemEvent, Integer>() {
					@Override
					public Integer apply(SystemEvent systemEvent) {
						return systemEvent.getType();
					}
				},
				new BiConsumer<SystemEvent, Integer>() {
					@Override
					public void accept(SystemEvent systemEvent, Integer type) {
						systemEvent.setType(type);
					}
				});
		}
	}

	public static class ExtraDataAccessor extends ModelPropertyAccessor {
		public ExtraDataAccessor() {
			super(new Function<SystemEvent, String>() {
					@Override
					public String apply(SystemEvent systemEvent) {
						return systemEvent.getExtraData();
					}
				},
				new BiConsumer<SystemEvent, String>() {
					@Override
					public void accept(SystemEvent systemEvent, String extraData) {
						systemEvent.setExtraData(extraData);
					}
				});
		}
	}

	private SystemEventModelAccessors() {
	}
}