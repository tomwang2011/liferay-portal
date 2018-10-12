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
import com.liferay.portal.kernel.model.PortletPreferences;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PortletPreferencesModelAccessors {
	public static class PortletPreferencesIdAccessor
		extends ModelPropertyAccessor {
		public PortletPreferencesIdAccessor() {
			super(new Function<PortletPreferences, Long>() {
					@Override
					public Long apply(PortletPreferences portletPreferences) {
						return portletPreferences.getPortletPreferencesId();
					}
				},
				new BiConsumer<PortletPreferences, Long>() {
					@Override
					public void accept(PortletPreferences portletPreferences,
						Long portletPreferencesId) {
						portletPreferences.setPortletPreferencesId(portletPreferencesId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<PortletPreferences, Long>() {
					@Override
					public Long apply(PortletPreferences portletPreferences) {
						return portletPreferences.getCompanyId();
					}
				},
				new BiConsumer<PortletPreferences, Long>() {
					@Override
					public void accept(PortletPreferences portletPreferences,
						Long companyId) {
						portletPreferences.setCompanyId(companyId);
					}
				});
		}
	}

	public static class OwnerIdAccessor extends ModelPropertyAccessor {
		public OwnerIdAccessor() {
			super(new Function<PortletPreferences, Long>() {
					@Override
					public Long apply(PortletPreferences portletPreferences) {
						return portletPreferences.getOwnerId();
					}
				},
				new BiConsumer<PortletPreferences, Long>() {
					@Override
					public void accept(PortletPreferences portletPreferences,
						Long ownerId) {
						portletPreferences.setOwnerId(ownerId);
					}
				});
		}
	}

	public static class OwnerTypeAccessor extends ModelPropertyAccessor {
		public OwnerTypeAccessor() {
			super(new Function<PortletPreferences, Integer>() {
					@Override
					public Integer apply(PortletPreferences portletPreferences) {
						return portletPreferences.getOwnerType();
					}
				},
				new BiConsumer<PortletPreferences, Integer>() {
					@Override
					public void accept(PortletPreferences portletPreferences,
						Integer ownerType) {
						portletPreferences.setOwnerType(ownerType);
					}
				});
		}
	}

	public static class PlidAccessor extends ModelPropertyAccessor {
		public PlidAccessor() {
			super(new Function<PortletPreferences, Long>() {
					@Override
					public Long apply(PortletPreferences portletPreferences) {
						return portletPreferences.getPlid();
					}
				},
				new BiConsumer<PortletPreferences, Long>() {
					@Override
					public void accept(PortletPreferences portletPreferences,
						Long plid) {
						portletPreferences.setPlid(plid);
					}
				});
		}
	}

	public static class PortletIdAccessor extends ModelPropertyAccessor {
		public PortletIdAccessor() {
			super(new Function<PortletPreferences, String>() {
					@Override
					public String apply(PortletPreferences portletPreferences) {
						return portletPreferences.getPortletId();
					}
				},
				new BiConsumer<PortletPreferences, String>() {
					@Override
					public void accept(PortletPreferences portletPreferences,
						String portletId) {
						portletPreferences.setPortletId(portletId);
					}
				});
		}
	}

	public static class PreferencesAccessor extends ModelPropertyAccessor {
		public PreferencesAccessor() {
			super(new Function<PortletPreferences, String>() {
					@Override
					public String apply(PortletPreferences portletPreferences) {
						return portletPreferences.getPreferences();
					}
				},
				new BiConsumer<PortletPreferences, String>() {
					@Override
					public void accept(PortletPreferences portletPreferences,
						String preferences) {
						portletPreferences.setPreferences(preferences);
					}
				});
		}
	}

	private PortletPreferencesModelAccessors() {
	}
}