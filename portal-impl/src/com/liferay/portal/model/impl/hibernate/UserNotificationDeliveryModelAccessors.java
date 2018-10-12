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
import com.liferay.portal.kernel.model.UserNotificationDelivery;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserNotificationDeliveryModelAccessors {
	public static class UserNotificationDeliveryIdAccessor
		extends ModelPropertyAccessor {
		public UserNotificationDeliveryIdAccessor() {
			super(new Function<UserNotificationDelivery, Long>() {
					@Override
					public Long apply(
						UserNotificationDelivery userNotificationDelivery) {
						return userNotificationDelivery.getUserNotificationDeliveryId();
					}
				},
				new BiConsumer<UserNotificationDelivery, Long>() {
					@Override
					public void accept(
						UserNotificationDelivery userNotificationDelivery,
						Long userNotificationDeliveryId) {
						userNotificationDelivery.setUserNotificationDeliveryId(userNotificationDeliveryId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<UserNotificationDelivery, Long>() {
					@Override
					public Long apply(
						UserNotificationDelivery userNotificationDelivery) {
						return userNotificationDelivery.getCompanyId();
					}
				},
				new BiConsumer<UserNotificationDelivery, Long>() {
					@Override
					public void accept(
						UserNotificationDelivery userNotificationDelivery,
						Long companyId) {
						userNotificationDelivery.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<UserNotificationDelivery, Long>() {
					@Override
					public Long apply(
						UserNotificationDelivery userNotificationDelivery) {
						return userNotificationDelivery.getUserId();
					}
				},
				new BiConsumer<UserNotificationDelivery, Long>() {
					@Override
					public void accept(
						UserNotificationDelivery userNotificationDelivery,
						Long userId) {
						userNotificationDelivery.setUserId(userId);
					}
				});
		}
	}

	public static class PortletIdAccessor extends ModelPropertyAccessor {
		public PortletIdAccessor() {
			super(new Function<UserNotificationDelivery, String>() {
					@Override
					public String apply(
						UserNotificationDelivery userNotificationDelivery) {
						return userNotificationDelivery.getPortletId();
					}
				},
				new BiConsumer<UserNotificationDelivery, String>() {
					@Override
					public void accept(
						UserNotificationDelivery userNotificationDelivery,
						String portletId) {
						userNotificationDelivery.setPortletId(portletId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<UserNotificationDelivery, Long>() {
					@Override
					public Long apply(
						UserNotificationDelivery userNotificationDelivery) {
						return userNotificationDelivery.getClassNameId();
					}
				},
				new BiConsumer<UserNotificationDelivery, Long>() {
					@Override
					public void accept(
						UserNotificationDelivery userNotificationDelivery,
						Long classNameId) {
						userNotificationDelivery.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class NotificationTypeAccessor extends ModelPropertyAccessor {
		public NotificationTypeAccessor() {
			super(new Function<UserNotificationDelivery, Integer>() {
					@Override
					public Integer apply(
						UserNotificationDelivery userNotificationDelivery) {
						return userNotificationDelivery.getNotificationType();
					}
				},
				new BiConsumer<UserNotificationDelivery, Integer>() {
					@Override
					public void accept(
						UserNotificationDelivery userNotificationDelivery,
						Integer notificationType) {
						userNotificationDelivery.setNotificationType(notificationType);
					}
				});
		}
	}

	public static class DeliveryTypeAccessor extends ModelPropertyAccessor {
		public DeliveryTypeAccessor() {
			super(new Function<UserNotificationDelivery, Integer>() {
					@Override
					public Integer apply(
						UserNotificationDelivery userNotificationDelivery) {
						return userNotificationDelivery.getDeliveryType();
					}
				},
				new BiConsumer<UserNotificationDelivery, Integer>() {
					@Override
					public void accept(
						UserNotificationDelivery userNotificationDelivery,
						Integer deliveryType) {
						userNotificationDelivery.setDeliveryType(deliveryType);
					}
				});
		}
	}

	public static class DeliverAccessor extends ModelPropertyAccessor {
		public DeliverAccessor() {
			super(new Function<UserNotificationDelivery, Boolean>() {
					@Override
					public Boolean apply(
						UserNotificationDelivery userNotificationDelivery) {
						return userNotificationDelivery.getDeliver();
					}
				},
				new BiConsumer<UserNotificationDelivery, Boolean>() {
					@Override
					public void accept(
						UserNotificationDelivery userNotificationDelivery,
						Boolean deliver) {
						userNotificationDelivery.setDeliver(deliver);
					}
				});
		}
	}

	private UserNotificationDeliveryModelAccessors() {
	}
}