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
import com.liferay.portal.kernel.model.BrowserTracker;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BrowserTrackerModelAccessors {
	public static class BrowserTrackerIdAccessor extends ModelPropertyAccessor {
		public BrowserTrackerIdAccessor() {
			super(new Function<BrowserTracker, Long>() {
					@Override
					public Long apply(BrowserTracker browserTracker) {
						return browserTracker.getBrowserTrackerId();
					}
				},
				new BiConsumer<BrowserTracker, Long>() {
					@Override
					public void accept(BrowserTracker browserTracker,
						Long browserTrackerId) {
						browserTracker.setBrowserTrackerId(browserTrackerId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<BrowserTracker, Long>() {
					@Override
					public Long apply(BrowserTracker browserTracker) {
						return browserTracker.getCompanyId();
					}
				},
				new BiConsumer<BrowserTracker, Long>() {
					@Override
					public void accept(BrowserTracker browserTracker,
						Long companyId) {
						browserTracker.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<BrowserTracker, Long>() {
					@Override
					public Long apply(BrowserTracker browserTracker) {
						return browserTracker.getUserId();
					}
				},
				new BiConsumer<BrowserTracker, Long>() {
					@Override
					public void accept(BrowserTracker browserTracker,
						Long userId) {
						browserTracker.setUserId(userId);
					}
				});
		}
	}

	public static class BrowserKeyAccessor extends ModelPropertyAccessor {
		public BrowserKeyAccessor() {
			super(new Function<BrowserTracker, Long>() {
					@Override
					public Long apply(BrowserTracker browserTracker) {
						return browserTracker.getBrowserKey();
					}
				},
				new BiConsumer<BrowserTracker, Long>() {
					@Override
					public void accept(BrowserTracker browserTracker,
						Long browserKey) {
						browserTracker.setBrowserKey(browserKey);
					}
				});
		}
	}

	private BrowserTrackerModelAccessors() {
	}
}