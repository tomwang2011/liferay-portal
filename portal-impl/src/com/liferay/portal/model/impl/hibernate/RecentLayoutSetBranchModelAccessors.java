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
import com.liferay.portal.kernel.model.RecentLayoutSetBranch;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RecentLayoutSetBranchModelAccessors {
	public static class RecentLayoutSetBranchIdAccessor
		extends ModelPropertyAccessor {
		public RecentLayoutSetBranchIdAccessor() {
			super(new Function<RecentLayoutSetBranch, Long>() {
					@Override
					public Long apply(
						RecentLayoutSetBranch recentLayoutSetBranch) {
						return recentLayoutSetBranch.getRecentLayoutSetBranchId();
					}
				},
				new BiConsumer<RecentLayoutSetBranch, Long>() {
					@Override
					public void accept(
						RecentLayoutSetBranch recentLayoutSetBranch,
						Long recentLayoutSetBranchId) {
						recentLayoutSetBranch.setRecentLayoutSetBranchId(recentLayoutSetBranchId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<RecentLayoutSetBranch, Long>() {
					@Override
					public Long apply(
						RecentLayoutSetBranch recentLayoutSetBranch) {
						return recentLayoutSetBranch.getGroupId();
					}
				},
				new BiConsumer<RecentLayoutSetBranch, Long>() {
					@Override
					public void accept(
						RecentLayoutSetBranch recentLayoutSetBranch,
						Long groupId) {
						recentLayoutSetBranch.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<RecentLayoutSetBranch, Long>() {
					@Override
					public Long apply(
						RecentLayoutSetBranch recentLayoutSetBranch) {
						return recentLayoutSetBranch.getCompanyId();
					}
				},
				new BiConsumer<RecentLayoutSetBranch, Long>() {
					@Override
					public void accept(
						RecentLayoutSetBranch recentLayoutSetBranch,
						Long companyId) {
						recentLayoutSetBranch.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<RecentLayoutSetBranch, Long>() {
					@Override
					public Long apply(
						RecentLayoutSetBranch recentLayoutSetBranch) {
						return recentLayoutSetBranch.getUserId();
					}
				},
				new BiConsumer<RecentLayoutSetBranch, Long>() {
					@Override
					public void accept(
						RecentLayoutSetBranch recentLayoutSetBranch, Long userId) {
						recentLayoutSetBranch.setUserId(userId);
					}
				});
		}
	}

	public static class LayoutSetBranchIdAccessor extends ModelPropertyAccessor {
		public LayoutSetBranchIdAccessor() {
			super(new Function<RecentLayoutSetBranch, Long>() {
					@Override
					public Long apply(
						RecentLayoutSetBranch recentLayoutSetBranch) {
						return recentLayoutSetBranch.getLayoutSetBranchId();
					}
				},
				new BiConsumer<RecentLayoutSetBranch, Long>() {
					@Override
					public void accept(
						RecentLayoutSetBranch recentLayoutSetBranch,
						Long layoutSetBranchId) {
						recentLayoutSetBranch.setLayoutSetBranchId(layoutSetBranchId);
					}
				});
		}
	}

	public static class LayoutSetIdAccessor extends ModelPropertyAccessor {
		public LayoutSetIdAccessor() {
			super(new Function<RecentLayoutSetBranch, Long>() {
					@Override
					public Long apply(
						RecentLayoutSetBranch recentLayoutSetBranch) {
						return recentLayoutSetBranch.getLayoutSetId();
					}
				},
				new BiConsumer<RecentLayoutSetBranch, Long>() {
					@Override
					public void accept(
						RecentLayoutSetBranch recentLayoutSetBranch,
						Long layoutSetId) {
						recentLayoutSetBranch.setLayoutSetId(layoutSetId);
					}
				});
		}
	}

	private RecentLayoutSetBranchModelAccessors() {
	}
}