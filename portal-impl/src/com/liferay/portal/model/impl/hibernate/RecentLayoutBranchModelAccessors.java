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
import com.liferay.portal.kernel.model.RecentLayoutBranch;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RecentLayoutBranchModelAccessors {
	public static class RecentLayoutBranchIdAccessor
		extends ModelPropertyAccessor {
		public RecentLayoutBranchIdAccessor() {
			super(new Function<RecentLayoutBranch, Long>() {
					@Override
					public Long apply(RecentLayoutBranch recentLayoutBranch) {
						return recentLayoutBranch.getRecentLayoutBranchId();
					}
				},
				new BiConsumer<RecentLayoutBranch, Long>() {
					@Override
					public void accept(RecentLayoutBranch recentLayoutBranch,
						Long recentLayoutBranchId) {
						recentLayoutBranch.setRecentLayoutBranchId(recentLayoutBranchId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<RecentLayoutBranch, Long>() {
					@Override
					public Long apply(RecentLayoutBranch recentLayoutBranch) {
						return recentLayoutBranch.getGroupId();
					}
				},
				new BiConsumer<RecentLayoutBranch, Long>() {
					@Override
					public void accept(RecentLayoutBranch recentLayoutBranch,
						Long groupId) {
						recentLayoutBranch.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<RecentLayoutBranch, Long>() {
					@Override
					public Long apply(RecentLayoutBranch recentLayoutBranch) {
						return recentLayoutBranch.getCompanyId();
					}
				},
				new BiConsumer<RecentLayoutBranch, Long>() {
					@Override
					public void accept(RecentLayoutBranch recentLayoutBranch,
						Long companyId) {
						recentLayoutBranch.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<RecentLayoutBranch, Long>() {
					@Override
					public Long apply(RecentLayoutBranch recentLayoutBranch) {
						return recentLayoutBranch.getUserId();
					}
				},
				new BiConsumer<RecentLayoutBranch, Long>() {
					@Override
					public void accept(RecentLayoutBranch recentLayoutBranch,
						Long userId) {
						recentLayoutBranch.setUserId(userId);
					}
				});
		}
	}

	public static class LayoutBranchIdAccessor extends ModelPropertyAccessor {
		public LayoutBranchIdAccessor() {
			super(new Function<RecentLayoutBranch, Long>() {
					@Override
					public Long apply(RecentLayoutBranch recentLayoutBranch) {
						return recentLayoutBranch.getLayoutBranchId();
					}
				},
				new BiConsumer<RecentLayoutBranch, Long>() {
					@Override
					public void accept(RecentLayoutBranch recentLayoutBranch,
						Long layoutBranchId) {
						recentLayoutBranch.setLayoutBranchId(layoutBranchId);
					}
				});
		}
	}

	public static class LayoutSetBranchIdAccessor extends ModelPropertyAccessor {
		public LayoutSetBranchIdAccessor() {
			super(new Function<RecentLayoutBranch, Long>() {
					@Override
					public Long apply(RecentLayoutBranch recentLayoutBranch) {
						return recentLayoutBranch.getLayoutSetBranchId();
					}
				},
				new BiConsumer<RecentLayoutBranch, Long>() {
					@Override
					public void accept(RecentLayoutBranch recentLayoutBranch,
						Long layoutSetBranchId) {
						recentLayoutBranch.setLayoutSetBranchId(layoutSetBranchId);
					}
				});
		}
	}

	public static class PlidAccessor extends ModelPropertyAccessor {
		public PlidAccessor() {
			super(new Function<RecentLayoutBranch, Long>() {
					@Override
					public Long apply(RecentLayoutBranch recentLayoutBranch) {
						return recentLayoutBranch.getPlid();
					}
				},
				new BiConsumer<RecentLayoutBranch, Long>() {
					@Override
					public void accept(RecentLayoutBranch recentLayoutBranch,
						Long plid) {
						recentLayoutBranch.setPlid(plid);
					}
				});
		}
	}

	private RecentLayoutBranchModelAccessors() {
	}
}