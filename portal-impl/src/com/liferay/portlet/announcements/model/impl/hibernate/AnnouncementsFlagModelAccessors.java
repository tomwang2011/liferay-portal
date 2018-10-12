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

package com.liferay.portlet.announcements.model.impl.hibernate;

import com.liferay.announcements.kernel.model.AnnouncementsFlag;

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
public class AnnouncementsFlagModelAccessors {
	public static class FlagIdAccessor extends ModelPropertyAccessor {
		public FlagIdAccessor() {
			super(new Function<AnnouncementsFlag, Long>() {
					@Override
					public Long apply(AnnouncementsFlag announcementsFlag) {
						return announcementsFlag.getFlagId();
					}
				},
				new BiConsumer<AnnouncementsFlag, Long>() {
					@Override
					public void accept(AnnouncementsFlag announcementsFlag,
						Long flagId) {
						announcementsFlag.setFlagId(flagId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<AnnouncementsFlag, Long>() {
					@Override
					public Long apply(AnnouncementsFlag announcementsFlag) {
						return announcementsFlag.getCompanyId();
					}
				},
				new BiConsumer<AnnouncementsFlag, Long>() {
					@Override
					public void accept(AnnouncementsFlag announcementsFlag,
						Long companyId) {
						announcementsFlag.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<AnnouncementsFlag, Long>() {
					@Override
					public Long apply(AnnouncementsFlag announcementsFlag) {
						return announcementsFlag.getUserId();
					}
				},
				new BiConsumer<AnnouncementsFlag, Long>() {
					@Override
					public void accept(AnnouncementsFlag announcementsFlag,
						Long userId) {
						announcementsFlag.setUserId(userId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<AnnouncementsFlag, Date>() {
					@Override
					public Date apply(AnnouncementsFlag announcementsFlag) {
						return announcementsFlag.getCreateDate();
					}
				},
				new BiConsumer<AnnouncementsFlag, Date>() {
					@Override
					public void accept(AnnouncementsFlag announcementsFlag,
						Date createDate) {
						announcementsFlag.setCreateDate(createDate);
					}
				});
		}
	}

	public static class EntryIdAccessor extends ModelPropertyAccessor {
		public EntryIdAccessor() {
			super(new Function<AnnouncementsFlag, Long>() {
					@Override
					public Long apply(AnnouncementsFlag announcementsFlag) {
						return announcementsFlag.getEntryId();
					}
				},
				new BiConsumer<AnnouncementsFlag, Long>() {
					@Override
					public void accept(AnnouncementsFlag announcementsFlag,
						Long entryId) {
						announcementsFlag.setEntryId(entryId);
					}
				});
		}
	}

	public static class ValueAccessor extends ModelPropertyAccessor {
		public ValueAccessor() {
			super(new Function<AnnouncementsFlag, Integer>() {
					@Override
					public Integer apply(AnnouncementsFlag announcementsFlag) {
						return announcementsFlag.getValue();
					}
				},
				new BiConsumer<AnnouncementsFlag, Integer>() {
					@Override
					public void accept(AnnouncementsFlag announcementsFlag,
						Integer value) {
						announcementsFlag.setValue(value);
					}
				});
		}
	}

	private AnnouncementsFlagModelAccessors() {
	}
}