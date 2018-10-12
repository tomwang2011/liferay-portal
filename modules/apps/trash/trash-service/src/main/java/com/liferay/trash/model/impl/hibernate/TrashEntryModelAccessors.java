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

package com.liferay.trash.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.trash.model.TrashEntry;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TrashEntryModelAccessors {
	public static class EntryIdAccessor extends ModelPropertyAccessor {
		public EntryIdAccessor() {
			super(new Function<TrashEntry, Long>() {
					@Override
					public Long apply(TrashEntry trashEntry) {
						return trashEntry.getEntryId();
					}
				},
				new BiConsumer<TrashEntry, Long>() {
					@Override
					public void accept(TrashEntry trashEntry, Long entryId) {
						trashEntry.setEntryId(entryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<TrashEntry, Long>() {
					@Override
					public Long apply(TrashEntry trashEntry) {
						return trashEntry.getGroupId();
					}
				},
				new BiConsumer<TrashEntry, Long>() {
					@Override
					public void accept(TrashEntry trashEntry, Long groupId) {
						trashEntry.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<TrashEntry, Long>() {
					@Override
					public Long apply(TrashEntry trashEntry) {
						return trashEntry.getCompanyId();
					}
				},
				new BiConsumer<TrashEntry, Long>() {
					@Override
					public void accept(TrashEntry trashEntry, Long companyId) {
						trashEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<TrashEntry, Long>() {
					@Override
					public Long apply(TrashEntry trashEntry) {
						return trashEntry.getUserId();
					}
				},
				new BiConsumer<TrashEntry, Long>() {
					@Override
					public void accept(TrashEntry trashEntry, Long userId) {
						trashEntry.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<TrashEntry, String>() {
					@Override
					public String apply(TrashEntry trashEntry) {
						return trashEntry.getUserName();
					}
				},
				new BiConsumer<TrashEntry, String>() {
					@Override
					public void accept(TrashEntry trashEntry, String userName) {
						trashEntry.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<TrashEntry, Date>() {
					@Override
					public Date apply(TrashEntry trashEntry) {
						return trashEntry.getCreateDate();
					}
				},
				new BiConsumer<TrashEntry, Date>() {
					@Override
					public void accept(TrashEntry trashEntry, Date createDate) {
						trashEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<TrashEntry, Long>() {
					@Override
					public Long apply(TrashEntry trashEntry) {
						return trashEntry.getClassNameId();
					}
				},
				new BiConsumer<TrashEntry, Long>() {
					@Override
					public void accept(TrashEntry trashEntry, Long classNameId) {
						trashEntry.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<TrashEntry, Long>() {
					@Override
					public Long apply(TrashEntry trashEntry) {
						return trashEntry.getClassPK();
					}
				},
				new BiConsumer<TrashEntry, Long>() {
					@Override
					public void accept(TrashEntry trashEntry, Long classPK) {
						trashEntry.setClassPK(classPK);
					}
				});
		}
	}

	public static class SystemEventSetKeyAccessor extends ModelPropertyAccessor {
		public SystemEventSetKeyAccessor() {
			super(new Function<TrashEntry, Long>() {
					@Override
					public Long apply(TrashEntry trashEntry) {
						return trashEntry.getSystemEventSetKey();
					}
				},
				new BiConsumer<TrashEntry, Long>() {
					@Override
					public void accept(TrashEntry trashEntry,
						Long systemEventSetKey) {
						trashEntry.setSystemEventSetKey(systemEventSetKey);
					}
				});
		}
	}

	public static class TypeSettingsAccessor extends ModelPropertyAccessor {
		public TypeSettingsAccessor() {
			super(new Function<TrashEntry, String>() {
					@Override
					public String apply(TrashEntry trashEntry) {
						return trashEntry.getTypeSettings();
					}
				},
				new BiConsumer<TrashEntry, String>() {
					@Override
					public void accept(TrashEntry trashEntry,
						String typeSettings) {
						trashEntry.setTypeSettings(typeSettings);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<TrashEntry, Integer>() {
					@Override
					public Integer apply(TrashEntry trashEntry) {
						return trashEntry.getStatus();
					}
				},
				new BiConsumer<TrashEntry, Integer>() {
					@Override
					public void accept(TrashEntry trashEntry, Integer status) {
						trashEntry.setStatus(status);
					}
				});
		}
	}

	private TrashEntryModelAccessors() {
	}
}