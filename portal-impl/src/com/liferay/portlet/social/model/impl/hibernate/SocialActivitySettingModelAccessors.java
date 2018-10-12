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

import com.liferay.social.kernel.model.SocialActivitySetting;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SocialActivitySettingModelAccessors {
	public static class ActivitySettingIdAccessor extends ModelPropertyAccessor {
		public ActivitySettingIdAccessor() {
			super(new Function<SocialActivitySetting, Long>() {
					@Override
					public Long apply(
						SocialActivitySetting socialActivitySetting) {
						return socialActivitySetting.getActivitySettingId();
					}
				},
				new BiConsumer<SocialActivitySetting, Long>() {
					@Override
					public void accept(
						SocialActivitySetting socialActivitySetting,
						Long activitySettingId) {
						socialActivitySetting.setActivitySettingId(activitySettingId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<SocialActivitySetting, Long>() {
					@Override
					public Long apply(
						SocialActivitySetting socialActivitySetting) {
						return socialActivitySetting.getGroupId();
					}
				},
				new BiConsumer<SocialActivitySetting, Long>() {
					@Override
					public void accept(
						SocialActivitySetting socialActivitySetting,
						Long groupId) {
						socialActivitySetting.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<SocialActivitySetting, Long>() {
					@Override
					public Long apply(
						SocialActivitySetting socialActivitySetting) {
						return socialActivitySetting.getCompanyId();
					}
				},
				new BiConsumer<SocialActivitySetting, Long>() {
					@Override
					public void accept(
						SocialActivitySetting socialActivitySetting,
						Long companyId) {
						socialActivitySetting.setCompanyId(companyId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<SocialActivitySetting, Long>() {
					@Override
					public Long apply(
						SocialActivitySetting socialActivitySetting) {
						return socialActivitySetting.getClassNameId();
					}
				},
				new BiConsumer<SocialActivitySetting, Long>() {
					@Override
					public void accept(
						SocialActivitySetting socialActivitySetting,
						Long classNameId) {
						socialActivitySetting.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ActivityTypeAccessor extends ModelPropertyAccessor {
		public ActivityTypeAccessor() {
			super(new Function<SocialActivitySetting, Integer>() {
					@Override
					public Integer apply(
						SocialActivitySetting socialActivitySetting) {
						return socialActivitySetting.getActivityType();
					}
				},
				new BiConsumer<SocialActivitySetting, Integer>() {
					@Override
					public void accept(
						SocialActivitySetting socialActivitySetting,
						Integer activityType) {
						socialActivitySetting.setActivityType(activityType);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<SocialActivitySetting, String>() {
					@Override
					public String apply(
						SocialActivitySetting socialActivitySetting) {
						return socialActivitySetting.getName();
					}
				},
				new BiConsumer<SocialActivitySetting, String>() {
					@Override
					public void accept(
						SocialActivitySetting socialActivitySetting, String name) {
						socialActivitySetting.setName(name);
					}
				});
		}
	}

	public static class ValueAccessor extends ModelPropertyAccessor {
		public ValueAccessor() {
			super(new Function<SocialActivitySetting, String>() {
					@Override
					public String apply(
						SocialActivitySetting socialActivitySetting) {
						return socialActivitySetting.getValue();
					}
				},
				new BiConsumer<SocialActivitySetting, String>() {
					@Override
					public void accept(
						SocialActivitySetting socialActivitySetting,
						String value) {
						socialActivitySetting.setValue(value);
					}
				});
		}
	}

	private SocialActivitySettingModelAccessors() {
	}
}