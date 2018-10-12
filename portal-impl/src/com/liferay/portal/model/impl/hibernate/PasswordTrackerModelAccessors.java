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
import com.liferay.portal.kernel.model.PasswordTracker;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PasswordTrackerModelAccessors {
	public static class PasswordTrackerIdAccessor extends ModelPropertyAccessor {
		public PasswordTrackerIdAccessor() {
			super(new Function<PasswordTracker, Long>() {
					@Override
					public Long apply(PasswordTracker passwordTracker) {
						return passwordTracker.getPasswordTrackerId();
					}
				},
				new BiConsumer<PasswordTracker, Long>() {
					@Override
					public void accept(PasswordTracker passwordTracker,
						Long passwordTrackerId) {
						passwordTracker.setPasswordTrackerId(passwordTrackerId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<PasswordTracker, Long>() {
					@Override
					public Long apply(PasswordTracker passwordTracker) {
						return passwordTracker.getCompanyId();
					}
				},
				new BiConsumer<PasswordTracker, Long>() {
					@Override
					public void accept(PasswordTracker passwordTracker,
						Long companyId) {
						passwordTracker.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<PasswordTracker, Long>() {
					@Override
					public Long apply(PasswordTracker passwordTracker) {
						return passwordTracker.getUserId();
					}
				},
				new BiConsumer<PasswordTracker, Long>() {
					@Override
					public void accept(PasswordTracker passwordTracker,
						Long userId) {
						passwordTracker.setUserId(userId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<PasswordTracker, Date>() {
					@Override
					public Date apply(PasswordTracker passwordTracker) {
						return passwordTracker.getCreateDate();
					}
				},
				new BiConsumer<PasswordTracker, Date>() {
					@Override
					public void accept(PasswordTracker passwordTracker,
						Date createDate) {
						passwordTracker.setCreateDate(createDate);
					}
				});
		}
	}

	public static class PasswordAccessor extends ModelPropertyAccessor {
		public PasswordAccessor() {
			super(new Function<PasswordTracker, String>() {
					@Override
					public String apply(PasswordTracker passwordTracker) {
						return passwordTracker.getPassword();
					}
				},
				new BiConsumer<PasswordTracker, String>() {
					@Override
					public void accept(PasswordTracker passwordTracker,
						String password) {
						passwordTracker.setPassword(password);
					}
				});
		}
	}

	private PasswordTrackerModelAccessors() {
	}
}