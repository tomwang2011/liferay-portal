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

package com.liferay.changeset.model.impl.hibernate;

import com.liferay.changeset.model.ChangesetEntry;

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
public class ChangesetEntryModelAccessors {
	public static class ChangesetEntryIdAccessor extends ModelPropertyAccessor {
		public ChangesetEntryIdAccessor() {
			super(new Function<ChangesetEntry, Long>() {
					@Override
					public Long apply(ChangesetEntry changesetEntry) {
						return changesetEntry.getChangesetEntryId();
					}
				},
				new BiConsumer<ChangesetEntry, Long>() {
					@Override
					public void accept(ChangesetEntry changesetEntry,
						Long changesetEntryId) {
						changesetEntry.setChangesetEntryId(changesetEntryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<ChangesetEntry, Long>() {
					@Override
					public Long apply(ChangesetEntry changesetEntry) {
						return changesetEntry.getGroupId();
					}
				},
				new BiConsumer<ChangesetEntry, Long>() {
					@Override
					public void accept(ChangesetEntry changesetEntry,
						Long groupId) {
						changesetEntry.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<ChangesetEntry, Long>() {
					@Override
					public Long apply(ChangesetEntry changesetEntry) {
						return changesetEntry.getCompanyId();
					}
				},
				new BiConsumer<ChangesetEntry, Long>() {
					@Override
					public void accept(ChangesetEntry changesetEntry,
						Long companyId) {
						changesetEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<ChangesetEntry, Long>() {
					@Override
					public Long apply(ChangesetEntry changesetEntry) {
						return changesetEntry.getUserId();
					}
				},
				new BiConsumer<ChangesetEntry, Long>() {
					@Override
					public void accept(ChangesetEntry changesetEntry,
						Long userId) {
						changesetEntry.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<ChangesetEntry, String>() {
					@Override
					public String apply(ChangesetEntry changesetEntry) {
						return changesetEntry.getUserName();
					}
				},
				new BiConsumer<ChangesetEntry, String>() {
					@Override
					public void accept(ChangesetEntry changesetEntry,
						String userName) {
						changesetEntry.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<ChangesetEntry, Date>() {
					@Override
					public Date apply(ChangesetEntry changesetEntry) {
						return changesetEntry.getCreateDate();
					}
				},
				new BiConsumer<ChangesetEntry, Date>() {
					@Override
					public void accept(ChangesetEntry changesetEntry,
						Date createDate) {
						changesetEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<ChangesetEntry, Date>() {
					@Override
					public Date apply(ChangesetEntry changesetEntry) {
						return changesetEntry.getModifiedDate();
					}
				},
				new BiConsumer<ChangesetEntry, Date>() {
					@Override
					public void accept(ChangesetEntry changesetEntry,
						Date modifiedDate) {
						changesetEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ChangesetCollectionIdAccessor
		extends ModelPropertyAccessor {
		public ChangesetCollectionIdAccessor() {
			super(new Function<ChangesetEntry, Long>() {
					@Override
					public Long apply(ChangesetEntry changesetEntry) {
						return changesetEntry.getChangesetCollectionId();
					}
				},
				new BiConsumer<ChangesetEntry, Long>() {
					@Override
					public void accept(ChangesetEntry changesetEntry,
						Long changesetCollectionId) {
						changesetEntry.setChangesetCollectionId(changesetCollectionId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<ChangesetEntry, Long>() {
					@Override
					public Long apply(ChangesetEntry changesetEntry) {
						return changesetEntry.getClassNameId();
					}
				},
				new BiConsumer<ChangesetEntry, Long>() {
					@Override
					public void accept(ChangesetEntry changesetEntry,
						Long classNameId) {
						changesetEntry.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<ChangesetEntry, Long>() {
					@Override
					public Long apply(ChangesetEntry changesetEntry) {
						return changesetEntry.getClassPK();
					}
				},
				new BiConsumer<ChangesetEntry, Long>() {
					@Override
					public void accept(ChangesetEntry changesetEntry,
						Long classPK) {
						changesetEntry.setClassPK(classPK);
					}
				});
		}
	}

	private ChangesetEntryModelAccessors() {
	}
}