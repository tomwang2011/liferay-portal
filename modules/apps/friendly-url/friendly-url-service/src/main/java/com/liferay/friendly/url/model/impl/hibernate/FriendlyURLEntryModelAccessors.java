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

package com.liferay.friendly.url.model.impl.hibernate;

import com.liferay.friendly.url.model.FriendlyURLEntry;

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
public class FriendlyURLEntryModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<FriendlyURLEntry, String>() {
					@Override
					public String apply(FriendlyURLEntry friendlyURLEntry) {
						return friendlyURLEntry.getUuid();
					}
				},
				new BiConsumer<FriendlyURLEntry, String>() {
					@Override
					public void accept(FriendlyURLEntry friendlyURLEntry,
						String uuid) {
						friendlyURLEntry.setUuid(uuid);
					}
				});
		}
	}

	public static class DefaultLanguageIdAccessor extends ModelPropertyAccessor {
		public DefaultLanguageIdAccessor() {
			super(new Function<FriendlyURLEntry, String>() {
					@Override
					public String apply(FriendlyURLEntry friendlyURLEntry) {
						return friendlyURLEntry.getDefaultLanguageId();
					}
				},
				new BiConsumer<FriendlyURLEntry, String>() {
					@Override
					public void accept(FriendlyURLEntry friendlyURLEntry,
						String defaultLanguageId) {
						friendlyURLEntry.setDefaultLanguageId(defaultLanguageId);
					}
				});
		}
	}

	public static class FriendlyURLEntryIdAccessor extends ModelPropertyAccessor {
		public FriendlyURLEntryIdAccessor() {
			super(new Function<FriendlyURLEntry, Long>() {
					@Override
					public Long apply(FriendlyURLEntry friendlyURLEntry) {
						return friendlyURLEntry.getFriendlyURLEntryId();
					}
				},
				new BiConsumer<FriendlyURLEntry, Long>() {
					@Override
					public void accept(FriendlyURLEntry friendlyURLEntry,
						Long friendlyURLEntryId) {
						friendlyURLEntry.setFriendlyURLEntryId(friendlyURLEntryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<FriendlyURLEntry, Long>() {
					@Override
					public Long apply(FriendlyURLEntry friendlyURLEntry) {
						return friendlyURLEntry.getGroupId();
					}
				},
				new BiConsumer<FriendlyURLEntry, Long>() {
					@Override
					public void accept(FriendlyURLEntry friendlyURLEntry,
						Long groupId) {
						friendlyURLEntry.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<FriendlyURLEntry, Long>() {
					@Override
					public Long apply(FriendlyURLEntry friendlyURLEntry) {
						return friendlyURLEntry.getCompanyId();
					}
				},
				new BiConsumer<FriendlyURLEntry, Long>() {
					@Override
					public void accept(FriendlyURLEntry friendlyURLEntry,
						Long companyId) {
						friendlyURLEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<FriendlyURLEntry, Date>() {
					@Override
					public Date apply(FriendlyURLEntry friendlyURLEntry) {
						return friendlyURLEntry.getCreateDate();
					}
				},
				new BiConsumer<FriendlyURLEntry, Date>() {
					@Override
					public void accept(FriendlyURLEntry friendlyURLEntry,
						Date createDate) {
						friendlyURLEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<FriendlyURLEntry, Date>() {
					@Override
					public Date apply(FriendlyURLEntry friendlyURLEntry) {
						return friendlyURLEntry.getModifiedDate();
					}
				},
				new BiConsumer<FriendlyURLEntry, Date>() {
					@Override
					public void accept(FriendlyURLEntry friendlyURLEntry,
						Date modifiedDate) {
						friendlyURLEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<FriendlyURLEntry, Long>() {
					@Override
					public Long apply(FriendlyURLEntry friendlyURLEntry) {
						return friendlyURLEntry.getClassNameId();
					}
				},
				new BiConsumer<FriendlyURLEntry, Long>() {
					@Override
					public void accept(FriendlyURLEntry friendlyURLEntry,
						Long classNameId) {
						friendlyURLEntry.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<FriendlyURLEntry, Long>() {
					@Override
					public Long apply(FriendlyURLEntry friendlyURLEntry) {
						return friendlyURLEntry.getClassPK();
					}
				},
				new BiConsumer<FriendlyURLEntry, Long>() {
					@Override
					public void accept(FriendlyURLEntry friendlyURLEntry,
						Long classPK) {
						friendlyURLEntry.setClassPK(classPK);
					}
				});
		}
	}

	private FriendlyURLEntryModelAccessors() {
	}
}