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

import com.liferay.social.kernel.model.SocialActivityLimit;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SocialActivityLimitModelAccessors {
	public static class ActivityLimitIdAccessor extends ModelPropertyAccessor {
		public ActivityLimitIdAccessor() {
			super(new Function<SocialActivityLimit, Long>() {
					@Override
					public Long apply(SocialActivityLimit socialActivityLimit) {
						return socialActivityLimit.getActivityLimitId();
					}
				},
				new BiConsumer<SocialActivityLimit, Long>() {
					@Override
					public void accept(
						SocialActivityLimit socialActivityLimit,
						Long activityLimitId) {
						socialActivityLimit.setActivityLimitId(activityLimitId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<SocialActivityLimit, Long>() {
					@Override
					public Long apply(SocialActivityLimit socialActivityLimit) {
						return socialActivityLimit.getGroupId();
					}
				},
				new BiConsumer<SocialActivityLimit, Long>() {
					@Override
					public void accept(
						SocialActivityLimit socialActivityLimit, Long groupId) {
						socialActivityLimit.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<SocialActivityLimit, Long>() {
					@Override
					public Long apply(SocialActivityLimit socialActivityLimit) {
						return socialActivityLimit.getCompanyId();
					}
				},
				new BiConsumer<SocialActivityLimit, Long>() {
					@Override
					public void accept(
						SocialActivityLimit socialActivityLimit, Long companyId) {
						socialActivityLimit.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<SocialActivityLimit, Long>() {
					@Override
					public Long apply(SocialActivityLimit socialActivityLimit) {
						return socialActivityLimit.getUserId();
					}
				},
				new BiConsumer<SocialActivityLimit, Long>() {
					@Override
					public void accept(
						SocialActivityLimit socialActivityLimit, Long userId) {
						socialActivityLimit.setUserId(userId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<SocialActivityLimit, Long>() {
					@Override
					public Long apply(SocialActivityLimit socialActivityLimit) {
						return socialActivityLimit.getClassNameId();
					}
				},
				new BiConsumer<SocialActivityLimit, Long>() {
					@Override
					public void accept(
						SocialActivityLimit socialActivityLimit,
						Long classNameId) {
						socialActivityLimit.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<SocialActivityLimit, Long>() {
					@Override
					public Long apply(SocialActivityLimit socialActivityLimit) {
						return socialActivityLimit.getClassPK();
					}
				},
				new BiConsumer<SocialActivityLimit, Long>() {
					@Override
					public void accept(
						SocialActivityLimit socialActivityLimit, Long classPK) {
						socialActivityLimit.setClassPK(classPK);
					}
				});
		}
	}

	public static class ActivityTypeAccessor extends ModelPropertyAccessor {
		public ActivityTypeAccessor() {
			super(new Function<SocialActivityLimit, Integer>() {
					@Override
					public Integer apply(
						SocialActivityLimit socialActivityLimit) {
						return socialActivityLimit.getActivityType();
					}
				},
				new BiConsumer<SocialActivityLimit, Integer>() {
					@Override
					public void accept(
						SocialActivityLimit socialActivityLimit,
						Integer activityType) {
						socialActivityLimit.setActivityType(activityType);
					}
				});
		}
	}

	public static class ActivityCounterNameAccessor
		extends ModelPropertyAccessor {
		public ActivityCounterNameAccessor() {
			super(new Function<SocialActivityLimit, String>() {
					@Override
					public String apply(SocialActivityLimit socialActivityLimit) {
						return socialActivityLimit.getActivityCounterName();
					}
				},
				new BiConsumer<SocialActivityLimit, String>() {
					@Override
					public void accept(
						SocialActivityLimit socialActivityLimit,
						String activityCounterName) {
						socialActivityLimit.setActivityCounterName(activityCounterName);
					}
				});
		}
	}

	public static class ValueAccessor extends ModelPropertyAccessor {
		public ValueAccessor() {
			super(new Function<SocialActivityLimit, String>() {
					@Override
					public String apply(SocialActivityLimit socialActivityLimit) {
						return socialActivityLimit.getValue();
					}
				},
				new BiConsumer<SocialActivityLimit, String>() {
					@Override
					public void accept(
						SocialActivityLimit socialActivityLimit, String value) {
						socialActivityLimit.setValue(value);
					}
				});
		}
	}

	private SocialActivityLimitModelAccessors() {
	}
}