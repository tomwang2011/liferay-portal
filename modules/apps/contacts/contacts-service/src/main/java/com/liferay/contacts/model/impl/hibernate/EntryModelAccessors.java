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

package com.liferay.contacts.model.impl.hibernate;

import com.liferay.contacts.model.Entry;

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
public class EntryModelAccessors {
	public static class EntryIdAccessor extends ModelPropertyAccessor {
		public EntryIdAccessor() {
			super(new Function<Entry, Long>() {
					@Override
					public Long apply(Entry entry) {
						return entry.getEntryId();
					}
				},
				new BiConsumer<Entry, Long>() {
					@Override
					public void accept(Entry entry, Long entryId) {
						entry.setEntryId(entryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<Entry, Long>() {
					@Override
					public Long apply(Entry entry) {
						return entry.getGroupId();
					}
				},
				new BiConsumer<Entry, Long>() {
					@Override
					public void accept(Entry entry, Long groupId) {
						entry.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Entry, Long>() {
					@Override
					public Long apply(Entry entry) {
						return entry.getCompanyId();
					}
				},
				new BiConsumer<Entry, Long>() {
					@Override
					public void accept(Entry entry, Long companyId) {
						entry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<Entry, Long>() {
					@Override
					public Long apply(Entry entry) {
						return entry.getUserId();
					}
				},
				new BiConsumer<Entry, Long>() {
					@Override
					public void accept(Entry entry, Long userId) {
						entry.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<Entry, String>() {
					@Override
					public String apply(Entry entry) {
						return entry.getUserName();
					}
				},
				new BiConsumer<Entry, String>() {
					@Override
					public void accept(Entry entry, String userName) {
						entry.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Entry, Date>() {
					@Override
					public Date apply(Entry entry) {
						return entry.getCreateDate();
					}
				},
				new BiConsumer<Entry, Date>() {
					@Override
					public void accept(Entry entry, Date createDate) {
						entry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<Entry, Date>() {
					@Override
					public Date apply(Entry entry) {
						return entry.getModifiedDate();
					}
				},
				new BiConsumer<Entry, Date>() {
					@Override
					public void accept(Entry entry, Date modifiedDate) {
						entry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class FullNameAccessor extends ModelPropertyAccessor {
		public FullNameAccessor() {
			super(new Function<Entry, String>() {
					@Override
					public String apply(Entry entry) {
						return entry.getFullName();
					}
				},
				new BiConsumer<Entry, String>() {
					@Override
					public void accept(Entry entry, String fullName) {
						entry.setFullName(fullName);
					}
				});
		}
	}

	public static class EmailAddressAccessor extends ModelPropertyAccessor {
		public EmailAddressAccessor() {
			super(new Function<Entry, String>() {
					@Override
					public String apply(Entry entry) {
						return entry.getEmailAddress();
					}
				},
				new BiConsumer<Entry, String>() {
					@Override
					public void accept(Entry entry, String emailAddress) {
						entry.setEmailAddress(emailAddress);
					}
				});
		}
	}

	public static class CommentsAccessor extends ModelPropertyAccessor {
		public CommentsAccessor() {
			super(new Function<Entry, String>() {
					@Override
					public String apply(Entry entry) {
						return entry.getComments();
					}
				},
				new BiConsumer<Entry, String>() {
					@Override
					public void accept(Entry entry, String comments) {
						entry.setComments(comments);
					}
				});
		}
	}

	private EntryModelAccessors() {
	}
}