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

package com.liferay.portlet.announcements.model.impl.hibernate;

import com.liferay.announcements.kernel.model.AnnouncementsDelivery;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AnnouncementsDeliveryModelAccessors {
	public static class DeliveryIdAccessor extends ModelPropertyAccessor {
		public DeliveryIdAccessor() {
			super(new Function<AnnouncementsDelivery, Long>() {
					@Override
					public Long apply(
						AnnouncementsDelivery announcementsDelivery) {
						return announcementsDelivery.getDeliveryId();
					}
				},
				new BiConsumer<AnnouncementsDelivery, Long>() {
					@Override
					public void accept(
						AnnouncementsDelivery announcementsDelivery,
						Long deliveryId) {
						announcementsDelivery.setDeliveryId(deliveryId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<AnnouncementsDelivery, Long>() {
					@Override
					public Long apply(
						AnnouncementsDelivery announcementsDelivery) {
						return announcementsDelivery.getCompanyId();
					}
				},
				new BiConsumer<AnnouncementsDelivery, Long>() {
					@Override
					public void accept(
						AnnouncementsDelivery announcementsDelivery,
						Long companyId) {
						announcementsDelivery.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<AnnouncementsDelivery, Long>() {
					@Override
					public Long apply(
						AnnouncementsDelivery announcementsDelivery) {
						return announcementsDelivery.getUserId();
					}
				},
				new BiConsumer<AnnouncementsDelivery, Long>() {
					@Override
					public void accept(
						AnnouncementsDelivery announcementsDelivery, Long userId) {
						announcementsDelivery.setUserId(userId);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<AnnouncementsDelivery, String>() {
					@Override
					public String apply(
						AnnouncementsDelivery announcementsDelivery) {
						return announcementsDelivery.getType();
					}
				},
				new BiConsumer<AnnouncementsDelivery, String>() {
					@Override
					public void accept(
						AnnouncementsDelivery announcementsDelivery, String type) {
						announcementsDelivery.setType(type);
					}
				});
		}
	}

	public static class EmailAccessor extends ModelPropertyAccessor {
		public EmailAccessor() {
			super(new Function<AnnouncementsDelivery, Boolean>() {
					@Override
					public Boolean apply(
						AnnouncementsDelivery announcementsDelivery) {
						return announcementsDelivery.getEmail();
					}
				},
				new BiConsumer<AnnouncementsDelivery, Boolean>() {
					@Override
					public void accept(
						AnnouncementsDelivery announcementsDelivery,
						Boolean email) {
						announcementsDelivery.setEmail(email);
					}
				});
		}
	}

	public static class SmsAccessor extends ModelPropertyAccessor {
		public SmsAccessor() {
			super(new Function<AnnouncementsDelivery, Boolean>() {
					@Override
					public Boolean apply(
						AnnouncementsDelivery announcementsDelivery) {
						return announcementsDelivery.getSms();
					}
				},
				new BiConsumer<AnnouncementsDelivery, Boolean>() {
					@Override
					public void accept(
						AnnouncementsDelivery announcementsDelivery, Boolean sms) {
						announcementsDelivery.setSms(sms);
					}
				});
		}
	}

	public static class WebsiteAccessor extends ModelPropertyAccessor {
		public WebsiteAccessor() {
			super(new Function<AnnouncementsDelivery, Boolean>() {
					@Override
					public Boolean apply(
						AnnouncementsDelivery announcementsDelivery) {
						return announcementsDelivery.getWebsite();
					}
				},
				new BiConsumer<AnnouncementsDelivery, Boolean>() {
					@Override
					public void accept(
						AnnouncementsDelivery announcementsDelivery,
						Boolean website) {
						announcementsDelivery.setWebsite(website);
					}
				});
		}
	}

	private AnnouncementsDeliveryModelAccessors() {
	}
}