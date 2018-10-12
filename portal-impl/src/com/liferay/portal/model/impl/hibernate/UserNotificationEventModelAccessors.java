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
import com.liferay.portal.kernel.model.UserNotificationEvent;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserNotificationEventModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<UserNotificationEvent, String>() {
					@Override
					public String apply(
						UserNotificationEvent userNotificationEvent) {
						return userNotificationEvent.getUuid();
					}
				},
				new BiConsumer<UserNotificationEvent, String>() {
					@Override
					public void accept(
						UserNotificationEvent userNotificationEvent, String uuid) {
						userNotificationEvent.setUuid(uuid);
					}
				});
		}
	}

	public static class UserNotificationEventIdAccessor
		extends ModelPropertyAccessor {
		public UserNotificationEventIdAccessor() {
			super(new Function<UserNotificationEvent, Long>() {
					@Override
					public Long apply(
						UserNotificationEvent userNotificationEvent) {
						return userNotificationEvent.getUserNotificationEventId();
					}
				},
				new BiConsumer<UserNotificationEvent, Long>() {
					@Override
					public void accept(
						UserNotificationEvent userNotificationEvent,
						Long userNotificationEventId) {
						userNotificationEvent.setUserNotificationEventId(userNotificationEventId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<UserNotificationEvent, Long>() {
					@Override
					public Long apply(
						UserNotificationEvent userNotificationEvent) {
						return userNotificationEvent.getCompanyId();
					}
				},
				new BiConsumer<UserNotificationEvent, Long>() {
					@Override
					public void accept(
						UserNotificationEvent userNotificationEvent,
						Long companyId) {
						userNotificationEvent.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<UserNotificationEvent, Long>() {
					@Override
					public Long apply(
						UserNotificationEvent userNotificationEvent) {
						return userNotificationEvent.getUserId();
					}
				},
				new BiConsumer<UserNotificationEvent, Long>() {
					@Override
					public void accept(
						UserNotificationEvent userNotificationEvent, Long userId) {
						userNotificationEvent.setUserId(userId);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<UserNotificationEvent, String>() {
					@Override
					public String apply(
						UserNotificationEvent userNotificationEvent) {
						return userNotificationEvent.getType();
					}
				},
				new BiConsumer<UserNotificationEvent, String>() {
					@Override
					public void accept(
						UserNotificationEvent userNotificationEvent, String type) {
						userNotificationEvent.setType(type);
					}
				});
		}
	}

	public static class TimestampAccessor extends ModelPropertyAccessor {
		public TimestampAccessor() {
			super(new Function<UserNotificationEvent, Long>() {
					@Override
					public Long apply(
						UserNotificationEvent userNotificationEvent) {
						return userNotificationEvent.getTimestamp();
					}
				},
				new BiConsumer<UserNotificationEvent, Long>() {
					@Override
					public void accept(
						UserNotificationEvent userNotificationEvent,
						Long timestamp) {
						userNotificationEvent.setTimestamp(timestamp);
					}
				});
		}
	}

	public static class DeliveryTypeAccessor extends ModelPropertyAccessor {
		public DeliveryTypeAccessor() {
			super(new Function<UserNotificationEvent, Integer>() {
					@Override
					public Integer apply(
						UserNotificationEvent userNotificationEvent) {
						return userNotificationEvent.getDeliveryType();
					}
				},
				new BiConsumer<UserNotificationEvent, Integer>() {
					@Override
					public void accept(
						UserNotificationEvent userNotificationEvent,
						Integer deliveryType) {
						userNotificationEvent.setDeliveryType(deliveryType);
					}
				});
		}
	}

	public static class DeliverByAccessor extends ModelPropertyAccessor {
		public DeliverByAccessor() {
			super(new Function<UserNotificationEvent, Long>() {
					@Override
					public Long apply(
						UserNotificationEvent userNotificationEvent) {
						return userNotificationEvent.getDeliverBy();
					}
				},
				new BiConsumer<UserNotificationEvent, Long>() {
					@Override
					public void accept(
						UserNotificationEvent userNotificationEvent,
						Long deliverBy) {
						userNotificationEvent.setDeliverBy(deliverBy);
					}
				});
		}
	}

	public static class DeliveredAccessor extends ModelPropertyAccessor {
		public DeliveredAccessor() {
			super(new Function<UserNotificationEvent, Boolean>() {
					@Override
					public Boolean apply(
						UserNotificationEvent userNotificationEvent) {
						return userNotificationEvent.getDelivered();
					}
				},
				new BiConsumer<UserNotificationEvent, Boolean>() {
					@Override
					public void accept(
						UserNotificationEvent userNotificationEvent,
						Boolean delivered) {
						userNotificationEvent.setDelivered(delivered);
					}
				});
		}
	}

	public static class PayloadAccessor extends ModelPropertyAccessor {
		public PayloadAccessor() {
			super(new Function<UserNotificationEvent, String>() {
					@Override
					public String apply(
						UserNotificationEvent userNotificationEvent) {
						return userNotificationEvent.getPayload();
					}
				},
				new BiConsumer<UserNotificationEvent, String>() {
					@Override
					public void accept(
						UserNotificationEvent userNotificationEvent,
						String payload) {
						userNotificationEvent.setPayload(payload);
					}
				});
		}
	}

	public static class ActionRequiredAccessor extends ModelPropertyAccessor {
		public ActionRequiredAccessor() {
			super(new Function<UserNotificationEvent, Boolean>() {
					@Override
					public Boolean apply(
						UserNotificationEvent userNotificationEvent) {
						return userNotificationEvent.getActionRequired();
					}
				},
				new BiConsumer<UserNotificationEvent, Boolean>() {
					@Override
					public void accept(
						UserNotificationEvent userNotificationEvent,
						Boolean actionRequired) {
						userNotificationEvent.setActionRequired(actionRequired);
					}
				});
		}
	}

	public static class ArchivedAccessor extends ModelPropertyAccessor {
		public ArchivedAccessor() {
			super(new Function<UserNotificationEvent, Boolean>() {
					@Override
					public Boolean apply(
						UserNotificationEvent userNotificationEvent) {
						return userNotificationEvent.getArchived();
					}
				},
				new BiConsumer<UserNotificationEvent, Boolean>() {
					@Override
					public void accept(
						UserNotificationEvent userNotificationEvent,
						Boolean archived) {
						userNotificationEvent.setArchived(archived);
					}
				});
		}
	}

	private UserNotificationEventModelAccessors() {
	}
}