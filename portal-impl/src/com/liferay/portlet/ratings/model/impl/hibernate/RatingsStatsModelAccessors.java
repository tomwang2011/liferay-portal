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

package com.liferay.portlet.ratings.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.ratings.kernel.model.RatingsStats;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RatingsStatsModelAccessors {
	public static class StatsIdAccessor extends ModelPropertyAccessor {
		public StatsIdAccessor() {
			super(new Function<RatingsStats, Long>() {
					@Override
					public Long apply(RatingsStats ratingsStats) {
						return ratingsStats.getStatsId();
					}
				},
				new BiConsumer<RatingsStats, Long>() {
					@Override
					public void accept(RatingsStats ratingsStats, Long statsId) {
						ratingsStats.setStatsId(statsId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<RatingsStats, Long>() {
					@Override
					public Long apply(RatingsStats ratingsStats) {
						return ratingsStats.getCompanyId();
					}
				},
				new BiConsumer<RatingsStats, Long>() {
					@Override
					public void accept(RatingsStats ratingsStats, Long companyId) {
						ratingsStats.setCompanyId(companyId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<RatingsStats, Long>() {
					@Override
					public Long apply(RatingsStats ratingsStats) {
						return ratingsStats.getClassNameId();
					}
				},
				new BiConsumer<RatingsStats, Long>() {
					@Override
					public void accept(RatingsStats ratingsStats,
						Long classNameId) {
						ratingsStats.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<RatingsStats, Long>() {
					@Override
					public Long apply(RatingsStats ratingsStats) {
						return ratingsStats.getClassPK();
					}
				},
				new BiConsumer<RatingsStats, Long>() {
					@Override
					public void accept(RatingsStats ratingsStats, Long classPK) {
						ratingsStats.setClassPK(classPK);
					}
				});
		}
	}

	public static class TotalEntriesAccessor extends ModelPropertyAccessor {
		public TotalEntriesAccessor() {
			super(new Function<RatingsStats, Integer>() {
					@Override
					public Integer apply(RatingsStats ratingsStats) {
						return ratingsStats.getTotalEntries();
					}
				},
				new BiConsumer<RatingsStats, Integer>() {
					@Override
					public void accept(RatingsStats ratingsStats,
						Integer totalEntries) {
						ratingsStats.setTotalEntries(totalEntries);
					}
				});
		}
	}

	public static class TotalScoreAccessor extends ModelPropertyAccessor {
		public TotalScoreAccessor() {
			super(new Function<RatingsStats, Double>() {
					@Override
					public Double apply(RatingsStats ratingsStats) {
						return ratingsStats.getTotalScore();
					}
				},
				new BiConsumer<RatingsStats, Double>() {
					@Override
					public void accept(RatingsStats ratingsStats,
						Double totalScore) {
						ratingsStats.setTotalScore(totalScore);
					}
				});
		}
	}

	public static class AverageScoreAccessor extends ModelPropertyAccessor {
		public AverageScoreAccessor() {
			super(new Function<RatingsStats, Double>() {
					@Override
					public Double apply(RatingsStats ratingsStats) {
						return ratingsStats.getAverageScore();
					}
				},
				new BiConsumer<RatingsStats, Double>() {
					@Override
					public void accept(RatingsStats ratingsStats,
						Double averageScore) {
						ratingsStats.setAverageScore(averageScore);
					}
				});
		}
	}

	private RatingsStatsModelAccessors() {
	}
}