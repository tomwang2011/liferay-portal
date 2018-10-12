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

package com.liferay.message.boards.model.impl.hibernate;

import com.liferay.message.boards.model.MBStatsUser;

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
public class MBStatsUserModelAccessors {
	public static class StatsUserIdAccessor extends ModelPropertyAccessor {
		public StatsUserIdAccessor() {
			super(new Function<MBStatsUser, Long>() {
					@Override
					public Long apply(MBStatsUser mbStatsUser) {
						return mbStatsUser.getStatsUserId();
					}
				},
				new BiConsumer<MBStatsUser, Long>() {
					@Override
					public void accept(MBStatsUser mbStatsUser, Long statsUserId) {
						mbStatsUser.setStatsUserId(statsUserId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<MBStatsUser, Long>() {
					@Override
					public Long apply(MBStatsUser mbStatsUser) {
						return mbStatsUser.getGroupId();
					}
				},
				new BiConsumer<MBStatsUser, Long>() {
					@Override
					public void accept(MBStatsUser mbStatsUser, Long groupId) {
						mbStatsUser.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<MBStatsUser, Long>() {
					@Override
					public Long apply(MBStatsUser mbStatsUser) {
						return mbStatsUser.getCompanyId();
					}
				},
				new BiConsumer<MBStatsUser, Long>() {
					@Override
					public void accept(MBStatsUser mbStatsUser, Long companyId) {
						mbStatsUser.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<MBStatsUser, Long>() {
					@Override
					public Long apply(MBStatsUser mbStatsUser) {
						return mbStatsUser.getUserId();
					}
				},
				new BiConsumer<MBStatsUser, Long>() {
					@Override
					public void accept(MBStatsUser mbStatsUser, Long userId) {
						mbStatsUser.setUserId(userId);
					}
				});
		}
	}

	public static class MessageCountAccessor extends ModelPropertyAccessor {
		public MessageCountAccessor() {
			super(new Function<MBStatsUser, Integer>() {
					@Override
					public Integer apply(MBStatsUser mbStatsUser) {
						return mbStatsUser.getMessageCount();
					}
				},
				new BiConsumer<MBStatsUser, Integer>() {
					@Override
					public void accept(MBStatsUser mbStatsUser,
						Integer messageCount) {
						mbStatsUser.setMessageCount(messageCount);
					}
				});
		}
	}

	public static class LastPostDateAccessor extends ModelPropertyAccessor {
		public LastPostDateAccessor() {
			super(new Function<MBStatsUser, Date>() {
					@Override
					public Date apply(MBStatsUser mbStatsUser) {
						return mbStatsUser.getLastPostDate();
					}
				},
				new BiConsumer<MBStatsUser, Date>() {
					@Override
					public void accept(MBStatsUser mbStatsUser,
						Date lastPostDate) {
						mbStatsUser.setLastPostDate(lastPostDate);
					}
				});
		}
	}

	private MBStatsUserModelAccessors() {
	}
}