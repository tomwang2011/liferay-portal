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

package com.liferay.push.notifications.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.push.notifications.model.PushNotificationsDevice;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Bruno Farache
 * @generated
 */
public class PushNotificationsDeviceModelAccessors {
	public static class PushNotificationsDeviceIdAccessor
		extends ModelPropertyAccessor {
		public PushNotificationsDeviceIdAccessor() {
			super(new Function<PushNotificationsDevice, Long>() {
					@Override
					public Long apply(
						PushNotificationsDevice pushNotificationsDevice) {
						return pushNotificationsDevice.getPushNotificationsDeviceId();
					}
				},
				new BiConsumer<PushNotificationsDevice, Long>() {
					@Override
					public void accept(
						PushNotificationsDevice pushNotificationsDevice,
						Long pushNotificationsDeviceId) {
						pushNotificationsDevice.setPushNotificationsDeviceId(pushNotificationsDeviceId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<PushNotificationsDevice, Long>() {
					@Override
					public Long apply(
						PushNotificationsDevice pushNotificationsDevice) {
						return pushNotificationsDevice.getCompanyId();
					}
				},
				new BiConsumer<PushNotificationsDevice, Long>() {
					@Override
					public void accept(
						PushNotificationsDevice pushNotificationsDevice,
						Long companyId) {
						pushNotificationsDevice.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<PushNotificationsDevice, Long>() {
					@Override
					public Long apply(
						PushNotificationsDevice pushNotificationsDevice) {
						return pushNotificationsDevice.getUserId();
					}
				},
				new BiConsumer<PushNotificationsDevice, Long>() {
					@Override
					public void accept(
						PushNotificationsDevice pushNotificationsDevice,
						Long userId) {
						pushNotificationsDevice.setUserId(userId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<PushNotificationsDevice, Date>() {
					@Override
					public Date apply(
						PushNotificationsDevice pushNotificationsDevice) {
						return pushNotificationsDevice.getCreateDate();
					}
				},
				new BiConsumer<PushNotificationsDevice, Date>() {
					@Override
					public void accept(
						PushNotificationsDevice pushNotificationsDevice,
						Date createDate) {
						pushNotificationsDevice.setCreateDate(createDate);
					}
				});
		}
	}

	public static class PlatformAccessor extends ModelPropertyAccessor {
		public PlatformAccessor() {
			super(new Function<PushNotificationsDevice, String>() {
					@Override
					public String apply(
						PushNotificationsDevice pushNotificationsDevice) {
						return pushNotificationsDevice.getPlatform();
					}
				},
				new BiConsumer<PushNotificationsDevice, String>() {
					@Override
					public void accept(
						PushNotificationsDevice pushNotificationsDevice,
						String platform) {
						pushNotificationsDevice.setPlatform(platform);
					}
				});
		}
	}

	public static class TokenAccessor extends ModelPropertyAccessor {
		public TokenAccessor() {
			super(new Function<PushNotificationsDevice, String>() {
					@Override
					public String apply(
						PushNotificationsDevice pushNotificationsDevice) {
						return pushNotificationsDevice.getToken();
					}
				},
				new BiConsumer<PushNotificationsDevice, String>() {
					@Override
					public void accept(
						PushNotificationsDevice pushNotificationsDevice,
						String token) {
						pushNotificationsDevice.setToken(token);
					}
				});
		}
	}

	private PushNotificationsDeviceModelAccessors() {
	}
}