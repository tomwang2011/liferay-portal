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
import com.liferay.portal.kernel.model.UserTrackerPath;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserTrackerPathModelAccessors {
	public static class UserTrackerPathIdAccessor extends ModelPropertyAccessor {
		public UserTrackerPathIdAccessor() {
			super(new Function<UserTrackerPath, Long>() {
					@Override
					public Long apply(UserTrackerPath userTrackerPath) {
						return userTrackerPath.getUserTrackerPathId();
					}
				},
				new BiConsumer<UserTrackerPath, Long>() {
					@Override
					public void accept(UserTrackerPath userTrackerPath,
						Long userTrackerPathId) {
						userTrackerPath.setUserTrackerPathId(userTrackerPathId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<UserTrackerPath, Long>() {
					@Override
					public Long apply(UserTrackerPath userTrackerPath) {
						return userTrackerPath.getCompanyId();
					}
				},
				new BiConsumer<UserTrackerPath, Long>() {
					@Override
					public void accept(UserTrackerPath userTrackerPath,
						Long companyId) {
						userTrackerPath.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserTrackerIdAccessor extends ModelPropertyAccessor {
		public UserTrackerIdAccessor() {
			super(new Function<UserTrackerPath, Long>() {
					@Override
					public Long apply(UserTrackerPath userTrackerPath) {
						return userTrackerPath.getUserTrackerId();
					}
				},
				new BiConsumer<UserTrackerPath, Long>() {
					@Override
					public void accept(UserTrackerPath userTrackerPath,
						Long userTrackerId) {
						userTrackerPath.setUserTrackerId(userTrackerId);
					}
				});
		}
	}

	public static class PathAccessor extends ModelPropertyAccessor {
		public PathAccessor() {
			super(new Function<UserTrackerPath, String>() {
					@Override
					public String apply(UserTrackerPath userTrackerPath) {
						return userTrackerPath.getPath();
					}
				},
				new BiConsumer<UserTrackerPath, String>() {
					@Override
					public void accept(UserTrackerPath userTrackerPath,
						String path) {
						userTrackerPath.setPath(path);
					}
				});
		}
	}

	public static class PathDateAccessor extends ModelPropertyAccessor {
		public PathDateAccessor() {
			super(new Function<UserTrackerPath, Date>() {
					@Override
					public Date apply(UserTrackerPath userTrackerPath) {
						return userTrackerPath.getPathDate();
					}
				},
				new BiConsumer<UserTrackerPath, Date>() {
					@Override
					public void accept(UserTrackerPath userTrackerPath,
						Date pathDate) {
						userTrackerPath.setPathDate(pathDate);
					}
				});
		}
	}

	private UserTrackerPathModelAccessors() {
	}
}