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
import com.liferay.portal.kernel.model.PortalPreferences;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PortalPreferencesModelAccessors {
	public static class PortalPreferencesIdAccessor
		extends ModelPropertyAccessor {
		public PortalPreferencesIdAccessor() {
			super(new Function<PortalPreferences, Long>() {
					@Override
					public Long apply(PortalPreferences portalPreferences) {
						return portalPreferences.getPortalPreferencesId();
					}
				},
				new BiConsumer<PortalPreferences, Long>() {
					@Override
					public void accept(PortalPreferences portalPreferences,
						Long portalPreferencesId) {
						portalPreferences.setPortalPreferencesId(portalPreferencesId);
					}
				});
		}
	}

	public static class OwnerIdAccessor extends ModelPropertyAccessor {
		public OwnerIdAccessor() {
			super(new Function<PortalPreferences, Long>() {
					@Override
					public Long apply(PortalPreferences portalPreferences) {
						return portalPreferences.getOwnerId();
					}
				},
				new BiConsumer<PortalPreferences, Long>() {
					@Override
					public void accept(PortalPreferences portalPreferences,
						Long ownerId) {
						portalPreferences.setOwnerId(ownerId);
					}
				});
		}
	}

	public static class OwnerTypeAccessor extends ModelPropertyAccessor {
		public OwnerTypeAccessor() {
			super(new Function<PortalPreferences, Integer>() {
					@Override
					public Integer apply(PortalPreferences portalPreferences) {
						return portalPreferences.getOwnerType();
					}
				},
				new BiConsumer<PortalPreferences, Integer>() {
					@Override
					public void accept(PortalPreferences portalPreferences,
						Integer ownerType) {
						portalPreferences.setOwnerType(ownerType);
					}
				});
		}
	}

	public static class PreferencesAccessor extends ModelPropertyAccessor {
		public PreferencesAccessor() {
			super(new Function<PortalPreferences, String>() {
					@Override
					public String apply(PortalPreferences portalPreferences) {
						return portalPreferences.getPreferences();
					}
				},
				new BiConsumer<PortalPreferences, String>() {
					@Override
					public void accept(PortalPreferences portalPreferences,
						String preferences) {
						portalPreferences.setPreferences(preferences);
					}
				});
		}
	}

	private PortalPreferencesModelAccessors() {
	}
}