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

import com.liferay.social.kernel.model.SocialActivity;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SocialActivityModelAccessors {
	public static class ActivityIdAccessor extends ModelPropertyAccessor {
		public ActivityIdAccessor() {
			super(new Function<SocialActivity, Long>() {
					@Override
					public Long apply(SocialActivity socialActivity) {
						return socialActivity.getActivityId();
					}
				},
				new BiConsumer<SocialActivity, Long>() {
					@Override
					public void accept(SocialActivity socialActivity,
						Long activityId) {
						socialActivity.setActivityId(activityId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<SocialActivity, Long>() {
					@Override
					public Long apply(SocialActivity socialActivity) {
						return socialActivity.getGroupId();
					}
				},
				new BiConsumer<SocialActivity, Long>() {
					@Override
					public void accept(SocialActivity socialActivity,
						Long groupId) {
						socialActivity.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<SocialActivity, Long>() {
					@Override
					public Long apply(SocialActivity socialActivity) {
						return socialActivity.getCompanyId();
					}
				},
				new BiConsumer<SocialActivity, Long>() {
					@Override
					public void accept(SocialActivity socialActivity,
						Long companyId) {
						socialActivity.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<SocialActivity, Long>() {
					@Override
					public Long apply(SocialActivity socialActivity) {
						return socialActivity.getUserId();
					}
				},
				new BiConsumer<SocialActivity, Long>() {
					@Override
					public void accept(SocialActivity socialActivity,
						Long userId) {
						socialActivity.setUserId(userId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<SocialActivity, Long>() {
					@Override
					public Long apply(SocialActivity socialActivity) {
						return socialActivity.getCreateDate();
					}
				},
				new BiConsumer<SocialActivity, Long>() {
					@Override
					public void accept(SocialActivity socialActivity,
						Long createDate) {
						socialActivity.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ActivitySetIdAccessor extends ModelPropertyAccessor {
		public ActivitySetIdAccessor() {
			super(new Function<SocialActivity, Long>() {
					@Override
					public Long apply(SocialActivity socialActivity) {
						return socialActivity.getActivitySetId();
					}
				},
				new BiConsumer<SocialActivity, Long>() {
					@Override
					public void accept(SocialActivity socialActivity,
						Long activitySetId) {
						socialActivity.setActivitySetId(activitySetId);
					}
				});
		}
	}

	public static class MirrorActivityIdAccessor extends ModelPropertyAccessor {
		public MirrorActivityIdAccessor() {
			super(new Function<SocialActivity, Long>() {
					@Override
					public Long apply(SocialActivity socialActivity) {
						return socialActivity.getMirrorActivityId();
					}
				},
				new BiConsumer<SocialActivity, Long>() {
					@Override
					public void accept(SocialActivity socialActivity,
						Long mirrorActivityId) {
						socialActivity.setMirrorActivityId(mirrorActivityId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<SocialActivity, Long>() {
					@Override
					public Long apply(SocialActivity socialActivity) {
						return socialActivity.getClassNameId();
					}
				},
				new BiConsumer<SocialActivity, Long>() {
					@Override
					public void accept(SocialActivity socialActivity,
						Long classNameId) {
						socialActivity.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<SocialActivity, Long>() {
					@Override
					public Long apply(SocialActivity socialActivity) {
						return socialActivity.getClassPK();
					}
				},
				new BiConsumer<SocialActivity, Long>() {
					@Override
					public void accept(SocialActivity socialActivity,
						Long classPK) {
						socialActivity.setClassPK(classPK);
					}
				});
		}
	}

	public static class ParentClassNameIdAccessor extends ModelPropertyAccessor {
		public ParentClassNameIdAccessor() {
			super(new Function<SocialActivity, Long>() {
					@Override
					public Long apply(SocialActivity socialActivity) {
						return socialActivity.getParentClassNameId();
					}
				},
				new BiConsumer<SocialActivity, Long>() {
					@Override
					public void accept(SocialActivity socialActivity,
						Long parentClassNameId) {
						socialActivity.setParentClassNameId(parentClassNameId);
					}
				});
		}
	}

	public static class ParentClassPKAccessor extends ModelPropertyAccessor {
		public ParentClassPKAccessor() {
			super(new Function<SocialActivity, Long>() {
					@Override
					public Long apply(SocialActivity socialActivity) {
						return socialActivity.getParentClassPK();
					}
				},
				new BiConsumer<SocialActivity, Long>() {
					@Override
					public void accept(SocialActivity socialActivity,
						Long parentClassPK) {
						socialActivity.setParentClassPK(parentClassPK);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<SocialActivity, Integer>() {
					@Override
					public Integer apply(SocialActivity socialActivity) {
						return socialActivity.getType();
					}
				},
				new BiConsumer<SocialActivity, Integer>() {
					@Override
					public void accept(SocialActivity socialActivity,
						Integer type) {
						socialActivity.setType(type);
					}
				});
		}
	}

	public static class ExtraDataAccessor extends ModelPropertyAccessor {
		public ExtraDataAccessor() {
			super(new Function<SocialActivity, String>() {
					@Override
					public String apply(SocialActivity socialActivity) {
						return socialActivity.getExtraData();
					}
				},
				new BiConsumer<SocialActivity, String>() {
					@Override
					public void accept(SocialActivity socialActivity,
						String extraData) {
						socialActivity.setExtraData(extraData);
					}
				});
		}
	}

	public static class ReceiverUserIdAccessor extends ModelPropertyAccessor {
		public ReceiverUserIdAccessor() {
			super(new Function<SocialActivity, Long>() {
					@Override
					public Long apply(SocialActivity socialActivity) {
						return socialActivity.getReceiverUserId();
					}
				},
				new BiConsumer<SocialActivity, Long>() {
					@Override
					public void accept(SocialActivity socialActivity,
						Long receiverUserId) {
						socialActivity.setReceiverUserId(receiverUserId);
					}
				});
		}
	}

	private SocialActivityModelAccessors() {
	}
}