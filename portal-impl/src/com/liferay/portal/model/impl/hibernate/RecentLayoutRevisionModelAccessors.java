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
import com.liferay.portal.kernel.model.RecentLayoutRevision;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RecentLayoutRevisionModelAccessors {
	public static class RecentLayoutRevisionIdAccessor
		extends ModelPropertyAccessor {
		public RecentLayoutRevisionIdAccessor() {
			super(new Function<RecentLayoutRevision, Long>() {
					@Override
					public Long apply(RecentLayoutRevision recentLayoutRevision) {
						return recentLayoutRevision.getRecentLayoutRevisionId();
					}
				},
				new BiConsumer<RecentLayoutRevision, Long>() {
					@Override
					public void accept(
						RecentLayoutRevision recentLayoutRevision,
						Long recentLayoutRevisionId) {
						recentLayoutRevision.setRecentLayoutRevisionId(recentLayoutRevisionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<RecentLayoutRevision, Long>() {
					@Override
					public Long apply(RecentLayoutRevision recentLayoutRevision) {
						return recentLayoutRevision.getGroupId();
					}
				},
				new BiConsumer<RecentLayoutRevision, Long>() {
					@Override
					public void accept(
						RecentLayoutRevision recentLayoutRevision, Long groupId) {
						recentLayoutRevision.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<RecentLayoutRevision, Long>() {
					@Override
					public Long apply(RecentLayoutRevision recentLayoutRevision) {
						return recentLayoutRevision.getCompanyId();
					}
				},
				new BiConsumer<RecentLayoutRevision, Long>() {
					@Override
					public void accept(
						RecentLayoutRevision recentLayoutRevision,
						Long companyId) {
						recentLayoutRevision.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<RecentLayoutRevision, Long>() {
					@Override
					public Long apply(RecentLayoutRevision recentLayoutRevision) {
						return recentLayoutRevision.getUserId();
					}
				},
				new BiConsumer<RecentLayoutRevision, Long>() {
					@Override
					public void accept(
						RecentLayoutRevision recentLayoutRevision, Long userId) {
						recentLayoutRevision.setUserId(userId);
					}
				});
		}
	}

	public static class LayoutRevisionIdAccessor extends ModelPropertyAccessor {
		public LayoutRevisionIdAccessor() {
			super(new Function<RecentLayoutRevision, Long>() {
					@Override
					public Long apply(RecentLayoutRevision recentLayoutRevision) {
						return recentLayoutRevision.getLayoutRevisionId();
					}
				},
				new BiConsumer<RecentLayoutRevision, Long>() {
					@Override
					public void accept(
						RecentLayoutRevision recentLayoutRevision,
						Long layoutRevisionId) {
						recentLayoutRevision.setLayoutRevisionId(layoutRevisionId);
					}
				});
		}
	}

	public static class LayoutSetBranchIdAccessor extends ModelPropertyAccessor {
		public LayoutSetBranchIdAccessor() {
			super(new Function<RecentLayoutRevision, Long>() {
					@Override
					public Long apply(RecentLayoutRevision recentLayoutRevision) {
						return recentLayoutRevision.getLayoutSetBranchId();
					}
				},
				new BiConsumer<RecentLayoutRevision, Long>() {
					@Override
					public void accept(
						RecentLayoutRevision recentLayoutRevision,
						Long layoutSetBranchId) {
						recentLayoutRevision.setLayoutSetBranchId(layoutSetBranchId);
					}
				});
		}
	}

	public static class PlidAccessor extends ModelPropertyAccessor {
		public PlidAccessor() {
			super(new Function<RecentLayoutRevision, Long>() {
					@Override
					public Long apply(RecentLayoutRevision recentLayoutRevision) {
						return recentLayoutRevision.getPlid();
					}
				},
				new BiConsumer<RecentLayoutRevision, Long>() {
					@Override
					public void accept(
						RecentLayoutRevision recentLayoutRevision, Long plid) {
						recentLayoutRevision.setPlid(plid);
					}
				});
		}
	}

	private RecentLayoutRevisionModelAccessors() {
	}
}