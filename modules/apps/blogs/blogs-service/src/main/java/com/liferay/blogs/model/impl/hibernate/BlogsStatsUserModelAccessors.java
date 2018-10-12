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

package com.liferay.blogs.model.impl.hibernate;

import com.liferay.blogs.model.BlogsStatsUser;

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
public class BlogsStatsUserModelAccessors {
	public static class StatsUserIdAccessor extends ModelPropertyAccessor {
		public StatsUserIdAccessor() {
			super(new Function<BlogsStatsUser, Long>() {
					@Override
					public Long apply(BlogsStatsUser blogsStatsUser) {
						return blogsStatsUser.getStatsUserId();
					}
				},
				new BiConsumer<BlogsStatsUser, Long>() {
					@Override
					public void accept(BlogsStatsUser blogsStatsUser,
						Long statsUserId) {
						blogsStatsUser.setStatsUserId(statsUserId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<BlogsStatsUser, Long>() {
					@Override
					public Long apply(BlogsStatsUser blogsStatsUser) {
						return blogsStatsUser.getGroupId();
					}
				},
				new BiConsumer<BlogsStatsUser, Long>() {
					@Override
					public void accept(BlogsStatsUser blogsStatsUser,
						Long groupId) {
						blogsStatsUser.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<BlogsStatsUser, Long>() {
					@Override
					public Long apply(BlogsStatsUser blogsStatsUser) {
						return blogsStatsUser.getCompanyId();
					}
				},
				new BiConsumer<BlogsStatsUser, Long>() {
					@Override
					public void accept(BlogsStatsUser blogsStatsUser,
						Long companyId) {
						blogsStatsUser.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<BlogsStatsUser, Long>() {
					@Override
					public Long apply(BlogsStatsUser blogsStatsUser) {
						return blogsStatsUser.getUserId();
					}
				},
				new BiConsumer<BlogsStatsUser, Long>() {
					@Override
					public void accept(BlogsStatsUser blogsStatsUser,
						Long userId) {
						blogsStatsUser.setUserId(userId);
					}
				});
		}
	}

	public static class EntryCountAccessor extends ModelPropertyAccessor {
		public EntryCountAccessor() {
			super(new Function<BlogsStatsUser, Integer>() {
					@Override
					public Integer apply(BlogsStatsUser blogsStatsUser) {
						return blogsStatsUser.getEntryCount();
					}
				},
				new BiConsumer<BlogsStatsUser, Integer>() {
					@Override
					public void accept(BlogsStatsUser blogsStatsUser,
						Integer entryCount) {
						blogsStatsUser.setEntryCount(entryCount);
					}
				});
		}
	}

	public static class LastPostDateAccessor extends ModelPropertyAccessor {
		public LastPostDateAccessor() {
			super(new Function<BlogsStatsUser, Date>() {
					@Override
					public Date apply(BlogsStatsUser blogsStatsUser) {
						return blogsStatsUser.getLastPostDate();
					}
				},
				new BiConsumer<BlogsStatsUser, Date>() {
					@Override
					public void accept(BlogsStatsUser blogsStatsUser,
						Date lastPostDate) {
						blogsStatsUser.setLastPostDate(lastPostDate);
					}
				});
		}
	}

	public static class RatingsTotalEntriesAccessor
		extends ModelPropertyAccessor {
		public RatingsTotalEntriesAccessor() {
			super(new Function<BlogsStatsUser, Integer>() {
					@Override
					public Integer apply(BlogsStatsUser blogsStatsUser) {
						return blogsStatsUser.getRatingsTotalEntries();
					}
				},
				new BiConsumer<BlogsStatsUser, Integer>() {
					@Override
					public void accept(BlogsStatsUser blogsStatsUser,
						Integer ratingsTotalEntries) {
						blogsStatsUser.setRatingsTotalEntries(ratingsTotalEntries);
					}
				});
		}
	}

	public static class RatingsTotalScoreAccessor extends ModelPropertyAccessor {
		public RatingsTotalScoreAccessor() {
			super(new Function<BlogsStatsUser, Double>() {
					@Override
					public Double apply(BlogsStatsUser blogsStatsUser) {
						return blogsStatsUser.getRatingsTotalScore();
					}
				},
				new BiConsumer<BlogsStatsUser, Double>() {
					@Override
					public void accept(BlogsStatsUser blogsStatsUser,
						Double ratingsTotalScore) {
						blogsStatsUser.setRatingsTotalScore(ratingsTotalScore);
					}
				});
		}
	}

	public static class RatingsAverageScoreAccessor
		extends ModelPropertyAccessor {
		public RatingsAverageScoreAccessor() {
			super(new Function<BlogsStatsUser, Double>() {
					@Override
					public Double apply(BlogsStatsUser blogsStatsUser) {
						return blogsStatsUser.getRatingsAverageScore();
					}
				},
				new BiConsumer<BlogsStatsUser, Double>() {
					@Override
					public void accept(BlogsStatsUser blogsStatsUser,
						Double ratingsAverageScore) {
						blogsStatsUser.setRatingsAverageScore(ratingsAverageScore);
					}
				});
		}
	}

	private BlogsStatsUserModelAccessors() {
	}
}