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

import com.liferay.changeset.model.ChangesetCollection;

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
public class ChangesetCollectionModelAccessors {
	public static class ChangesetCollectionIdAccessor
		extends ModelPropertyAccessor {
		public ChangesetCollectionIdAccessor() {
			super(new Function<ChangesetCollection, Long>() {
					@Override
					public Long apply(ChangesetCollection changesetCollection) {
						return changesetCollection.getChangesetCollectionId();
					}
				},
				new BiConsumer<ChangesetCollection, Long>() {
					@Override
					public void accept(
						ChangesetCollection changesetCollection,
						Long changesetCollectionId) {
						changesetCollection.setChangesetCollectionId(changesetCollectionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<ChangesetCollection, Long>() {
					@Override
					public Long apply(ChangesetCollection changesetCollection) {
						return changesetCollection.getGroupId();
					}
				},
				new BiConsumer<ChangesetCollection, Long>() {
					@Override
					public void accept(
						ChangesetCollection changesetCollection, Long groupId) {
						changesetCollection.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<ChangesetCollection, Long>() {
					@Override
					public Long apply(ChangesetCollection changesetCollection) {
						return changesetCollection.getCompanyId();
					}
				},
				new BiConsumer<ChangesetCollection, Long>() {
					@Override
					public void accept(
						ChangesetCollection changesetCollection, Long companyId) {
						changesetCollection.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<ChangesetCollection, Long>() {
					@Override
					public Long apply(ChangesetCollection changesetCollection) {
						return changesetCollection.getUserId();
					}
				},
				new BiConsumer<ChangesetCollection, Long>() {
					@Override
					public void accept(
						ChangesetCollection changesetCollection, Long userId) {
						changesetCollection.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<ChangesetCollection, String>() {
					@Override
					public String apply(ChangesetCollection changesetCollection) {
						return changesetCollection.getUserName();
					}
				},
				new BiConsumer<ChangesetCollection, String>() {
					@Override
					public void accept(
						ChangesetCollection changesetCollection, String userName) {
						changesetCollection.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<ChangesetCollection, Date>() {
					@Override
					public Date apply(ChangesetCollection changesetCollection) {
						return changesetCollection.getCreateDate();
					}
				},
				new BiConsumer<ChangesetCollection, Date>() {
					@Override
					public void accept(
						ChangesetCollection changesetCollection, Date createDate) {
						changesetCollection.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<ChangesetCollection, Date>() {
					@Override
					public Date apply(ChangesetCollection changesetCollection) {
						return changesetCollection.getModifiedDate();
					}
				},
				new BiConsumer<ChangesetCollection, Date>() {
					@Override
					public void accept(
						ChangesetCollection changesetCollection,
						Date modifiedDate) {
						changesetCollection.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<ChangesetCollection, String>() {
					@Override
					public String apply(ChangesetCollection changesetCollection) {
						return changesetCollection.getName();
					}
				},
				new BiConsumer<ChangesetCollection, String>() {
					@Override
					public void accept(
						ChangesetCollection changesetCollection, String name) {
						changesetCollection.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<ChangesetCollection, String>() {
					@Override
					public String apply(ChangesetCollection changesetCollection) {
						return changesetCollection.getDescription();
					}
				},
				new BiConsumer<ChangesetCollection, String>() {
					@Override
					public void accept(
						ChangesetCollection changesetCollection,
						String description) {
						changesetCollection.setDescription(description);
					}
				});
		}
	}

	private ChangesetCollectionModelAccessors() {
	}
}