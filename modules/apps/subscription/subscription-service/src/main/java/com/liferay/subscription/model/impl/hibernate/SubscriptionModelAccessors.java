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

package com.liferay.subscription.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.subscription.model.Subscription;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SubscriptionModelAccessors {
	public static class SubscriptionIdAccessor extends ModelPropertyAccessor {
		public SubscriptionIdAccessor() {
			super(new Function<Subscription, Long>() {
					@Override
					public Long apply(Subscription subscription) {
						return subscription.getSubscriptionId();
					}
				},
				new BiConsumer<Subscription, Long>() {
					@Override
					public void accept(Subscription subscription,
						Long subscriptionId) {
						subscription.setSubscriptionId(subscriptionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<Subscription, Long>() {
					@Override
					public Long apply(Subscription subscription) {
						return subscription.getGroupId();
					}
				},
				new BiConsumer<Subscription, Long>() {
					@Override
					public void accept(Subscription subscription, Long groupId) {
						subscription.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Subscription, Long>() {
					@Override
					public Long apply(Subscription subscription) {
						return subscription.getCompanyId();
					}
				},
				new BiConsumer<Subscription, Long>() {
					@Override
					public void accept(Subscription subscription, Long companyId) {
						subscription.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<Subscription, Long>() {
					@Override
					public Long apply(Subscription subscription) {
						return subscription.getUserId();
					}
				},
				new BiConsumer<Subscription, Long>() {
					@Override
					public void accept(Subscription subscription, Long userId) {
						subscription.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<Subscription, String>() {
					@Override
					public String apply(Subscription subscription) {
						return subscription.getUserName();
					}
				},
				new BiConsumer<Subscription, String>() {
					@Override
					public void accept(Subscription subscription,
						String userName) {
						subscription.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Subscription, Date>() {
					@Override
					public Date apply(Subscription subscription) {
						return subscription.getCreateDate();
					}
				},
				new BiConsumer<Subscription, Date>() {
					@Override
					public void accept(Subscription subscription,
						Date createDate) {
						subscription.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<Subscription, Date>() {
					@Override
					public Date apply(Subscription subscription) {
						return subscription.getModifiedDate();
					}
				},
				new BiConsumer<Subscription, Date>() {
					@Override
					public void accept(Subscription subscription,
						Date modifiedDate) {
						subscription.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<Subscription, Long>() {
					@Override
					public Long apply(Subscription subscription) {
						return subscription.getClassNameId();
					}
				},
				new BiConsumer<Subscription, Long>() {
					@Override
					public void accept(Subscription subscription,
						Long classNameId) {
						subscription.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<Subscription, Long>() {
					@Override
					public Long apply(Subscription subscription) {
						return subscription.getClassPK();
					}
				},
				new BiConsumer<Subscription, Long>() {
					@Override
					public void accept(Subscription subscription, Long classPK) {
						subscription.setClassPK(classPK);
					}
				});
		}
	}

	public static class FrequencyAccessor extends ModelPropertyAccessor {
		public FrequencyAccessor() {
			super(new Function<Subscription, String>() {
					@Override
					public String apply(Subscription subscription) {
						return subscription.getFrequency();
					}
				},
				new BiConsumer<Subscription, String>() {
					@Override
					public void accept(Subscription subscription,
						String frequency) {
						subscription.setFrequency(frequency);
					}
				});
		}
	}

	private SubscriptionModelAccessors() {
	}
}