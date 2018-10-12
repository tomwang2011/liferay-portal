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

package com.liferay.portlet.social.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.social.kernel.model.SocialActivityAchievement;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SocialActivityAchievementModelAccessors {
	public static class ActivityAchievementIdAccessor
		extends ModelPropertyAccessor {
		public ActivityAchievementIdAccessor() {
			super(new Function<SocialActivityAchievement, Long>() {
					@Override
					public Long apply(
						SocialActivityAchievement socialActivityAchievement) {
						return socialActivityAchievement.getActivityAchievementId();
					}
				},
				new BiConsumer<SocialActivityAchievement, Long>() {
					@Override
					public void accept(
						SocialActivityAchievement socialActivityAchievement,
						Long activityAchievementId) {
						socialActivityAchievement.setActivityAchievementId(activityAchievementId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<SocialActivityAchievement, Long>() {
					@Override
					public Long apply(
						SocialActivityAchievement socialActivityAchievement) {
						return socialActivityAchievement.getGroupId();
					}
				},
				new BiConsumer<SocialActivityAchievement, Long>() {
					@Override
					public void accept(
						SocialActivityAchievement socialActivityAchievement,
						Long groupId) {
						socialActivityAchievement.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<SocialActivityAchievement, Long>() {
					@Override
					public Long apply(
						SocialActivityAchievement socialActivityAchievement) {
						return socialActivityAchievement.getCompanyId();
					}
				},
				new BiConsumer<SocialActivityAchievement, Long>() {
					@Override
					public void accept(
						SocialActivityAchievement socialActivityAchievement,
						Long companyId) {
						socialActivityAchievement.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<SocialActivityAchievement, Long>() {
					@Override
					public Long apply(
						SocialActivityAchievement socialActivityAchievement) {
						return socialActivityAchievement.getUserId();
					}
				},
				new BiConsumer<SocialActivityAchievement, Long>() {
					@Override
					public void accept(
						SocialActivityAchievement socialActivityAchievement,
						Long userId) {
						socialActivityAchievement.setUserId(userId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<SocialActivityAchievement, Long>() {
					@Override
					public Long apply(
						SocialActivityAchievement socialActivityAchievement) {
						return socialActivityAchievement.getCreateDate();
					}
				},
				new BiConsumer<SocialActivityAchievement, Long>() {
					@Override
					public void accept(
						SocialActivityAchievement socialActivityAchievement,
						Long createDate) {
						socialActivityAchievement.setCreateDate(createDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<SocialActivityAchievement, String>() {
					@Override
					public String apply(
						SocialActivityAchievement socialActivityAchievement) {
						return socialActivityAchievement.getName();
					}
				},
				new BiConsumer<SocialActivityAchievement, String>() {
					@Override
					public void accept(
						SocialActivityAchievement socialActivityAchievement,
						String name) {
						socialActivityAchievement.setName(name);
					}
				});
		}
	}

	public static class FirstInGroupAccessor extends ModelPropertyAccessor {
		public FirstInGroupAccessor() {
			super(new Function<SocialActivityAchievement, Boolean>() {
					@Override
					public Boolean apply(
						SocialActivityAchievement socialActivityAchievement) {
						return socialActivityAchievement.getFirstInGroup();
					}
				},
				new BiConsumer<SocialActivityAchievement, Boolean>() {
					@Override
					public void accept(
						SocialActivityAchievement socialActivityAchievement,
						Boolean firstInGroup) {
						socialActivityAchievement.setFirstInGroup(firstInGroup);
					}
				});
		}
	}

	private SocialActivityAchievementModelAccessors() {
	}
}