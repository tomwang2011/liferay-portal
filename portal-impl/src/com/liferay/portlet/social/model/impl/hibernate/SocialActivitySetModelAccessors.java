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

import com.liferay.social.kernel.model.SocialActivitySet;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SocialActivitySetModelAccessors {
	public static class ActivitySetIdAccessor extends ModelPropertyAccessor {
		public ActivitySetIdAccessor() {
			super(new Function<SocialActivitySet, Long>() {
					@Override
					public Long apply(SocialActivitySet socialActivitySet) {
						return socialActivitySet.getActivitySetId();
					}
				},
				new BiConsumer<SocialActivitySet, Long>() {
					@Override
					public void accept(SocialActivitySet socialActivitySet,
						Long activitySetId) {
						socialActivitySet.setActivitySetId(activitySetId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<SocialActivitySet, Long>() {
					@Override
					public Long apply(SocialActivitySet socialActivitySet) {
						return socialActivitySet.getGroupId();
					}
				},
				new BiConsumer<SocialActivitySet, Long>() {
					@Override
					public void accept(SocialActivitySet socialActivitySet,
						Long groupId) {
						socialActivitySet.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<SocialActivitySet, Long>() {
					@Override
					public Long apply(SocialActivitySet socialActivitySet) {
						return socialActivitySet.getCompanyId();
					}
				},
				new BiConsumer<SocialActivitySet, Long>() {
					@Override
					public void accept(SocialActivitySet socialActivitySet,
						Long companyId) {
						socialActivitySet.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<SocialActivitySet, Long>() {
					@Override
					public Long apply(SocialActivitySet socialActivitySet) {
						return socialActivitySet.getUserId();
					}
				},
				new BiConsumer<SocialActivitySet, Long>() {
					@Override
					public void accept(SocialActivitySet socialActivitySet,
						Long userId) {
						socialActivitySet.setUserId(userId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<SocialActivitySet, Long>() {
					@Override
					public Long apply(SocialActivitySet socialActivitySet) {
						return socialActivitySet.getCreateDate();
					}
				},
				new BiConsumer<SocialActivitySet, Long>() {
					@Override
					public void accept(SocialActivitySet socialActivitySet,
						Long createDate) {
						socialActivitySet.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<SocialActivitySet, Long>() {
					@Override
					public Long apply(SocialActivitySet socialActivitySet) {
						return socialActivitySet.getModifiedDate();
					}
				},
				new BiConsumer<SocialActivitySet, Long>() {
					@Override
					public void accept(SocialActivitySet socialActivitySet,
						Long modifiedDate) {
						socialActivitySet.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<SocialActivitySet, Long>() {
					@Override
					public Long apply(SocialActivitySet socialActivitySet) {
						return socialActivitySet.getClassNameId();
					}
				},
				new BiConsumer<SocialActivitySet, Long>() {
					@Override
					public void accept(SocialActivitySet socialActivitySet,
						Long classNameId) {
						socialActivitySet.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<SocialActivitySet, Long>() {
					@Override
					public Long apply(SocialActivitySet socialActivitySet) {
						return socialActivitySet.getClassPK();
					}
				},
				new BiConsumer<SocialActivitySet, Long>() {
					@Override
					public void accept(SocialActivitySet socialActivitySet,
						Long classPK) {
						socialActivitySet.setClassPK(classPK);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<SocialActivitySet, Integer>() {
					@Override
					public Integer apply(SocialActivitySet socialActivitySet) {
						return socialActivitySet.getType();
					}
				},
				new BiConsumer<SocialActivitySet, Integer>() {
					@Override
					public void accept(SocialActivitySet socialActivitySet,
						Integer type) {
						socialActivitySet.setType(type);
					}
				});
		}
	}

	public static class ExtraDataAccessor extends ModelPropertyAccessor {
		public ExtraDataAccessor() {
			super(new Function<SocialActivitySet, String>() {
					@Override
					public String apply(SocialActivitySet socialActivitySet) {
						return socialActivitySet.getExtraData();
					}
				},
				new BiConsumer<SocialActivitySet, String>() {
					@Override
					public void accept(SocialActivitySet socialActivitySet,
						String extraData) {
						socialActivitySet.setExtraData(extraData);
					}
				});
		}
	}

	public static class ActivityCountAccessor extends ModelPropertyAccessor {
		public ActivityCountAccessor() {
			super(new Function<SocialActivitySet, Integer>() {
					@Override
					public Integer apply(SocialActivitySet socialActivitySet) {
						return socialActivitySet.getActivityCount();
					}
				},
				new BiConsumer<SocialActivitySet, Integer>() {
					@Override
					public void accept(SocialActivitySet socialActivitySet,
						Integer activityCount) {
						socialActivitySet.setActivityCount(activityCount);
					}
				});
		}
	}

	private SocialActivitySetModelAccessors() {
	}
}