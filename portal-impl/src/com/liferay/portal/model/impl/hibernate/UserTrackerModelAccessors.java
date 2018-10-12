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
import com.liferay.portal.kernel.model.UserTracker;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserTrackerModelAccessors {
	public static class UserTrackerIdAccessor extends ModelPropertyAccessor {
		public UserTrackerIdAccessor() {
			super(new Function<UserTracker, Long>() {
					@Override
					public Long apply(UserTracker userTracker) {
						return userTracker.getUserTrackerId();
					}
				},
				new BiConsumer<UserTracker, Long>() {
					@Override
					public void accept(UserTracker userTracker,
						Long userTrackerId) {
						userTracker.setUserTrackerId(userTrackerId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<UserTracker, Long>() {
					@Override
					public Long apply(UserTracker userTracker) {
						return userTracker.getCompanyId();
					}
				},
				new BiConsumer<UserTracker, Long>() {
					@Override
					public void accept(UserTracker userTracker, Long companyId) {
						userTracker.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<UserTracker, Long>() {
					@Override
					public Long apply(UserTracker userTracker) {
						return userTracker.getUserId();
					}
				},
				new BiConsumer<UserTracker, Long>() {
					@Override
					public void accept(UserTracker userTracker, Long userId) {
						userTracker.setUserId(userId);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<UserTracker, Date>() {
					@Override
					public Date apply(UserTracker userTracker) {
						return userTracker.getModifiedDate();
					}
				},
				new BiConsumer<UserTracker, Date>() {
					@Override
					public void accept(UserTracker userTracker,
						Date modifiedDate) {
						userTracker.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class SessionIdAccessor extends ModelPropertyAccessor {
		public SessionIdAccessor() {
			super(new Function<UserTracker, String>() {
					@Override
					public String apply(UserTracker userTracker) {
						return userTracker.getSessionId();
					}
				},
				new BiConsumer<UserTracker, String>() {
					@Override
					public void accept(UserTracker userTracker, String sessionId) {
						userTracker.setSessionId(sessionId);
					}
				});
		}
	}

	public static class RemoteAddrAccessor extends ModelPropertyAccessor {
		public RemoteAddrAccessor() {
			super(new Function<UserTracker, String>() {
					@Override
					public String apply(UserTracker userTracker) {
						return userTracker.getRemoteAddr();
					}
				},
				new BiConsumer<UserTracker, String>() {
					@Override
					public void accept(UserTracker userTracker,
						String remoteAddr) {
						userTracker.setRemoteAddr(remoteAddr);
					}
				});
		}
	}

	public static class RemoteHostAccessor extends ModelPropertyAccessor {
		public RemoteHostAccessor() {
			super(new Function<UserTracker, String>() {
					@Override
					public String apply(UserTracker userTracker) {
						return userTracker.getRemoteHost();
					}
				},
				new BiConsumer<UserTracker, String>() {
					@Override
					public void accept(UserTracker userTracker,
						String remoteHost) {
						userTracker.setRemoteHost(remoteHost);
					}
				});
		}
	}

	public static class UserAgentAccessor extends ModelPropertyAccessor {
		public UserAgentAccessor() {
			super(new Function<UserTracker, String>() {
					@Override
					public String apply(UserTracker userTracker) {
						return userTracker.getUserAgent();
					}
				},
				new BiConsumer<UserTracker, String>() {
					@Override
					public void accept(UserTracker userTracker, String userAgent) {
						userTracker.setUserAgent(userAgent);
					}
				});
		}
	}

	private UserTrackerModelAccessors() {
	}
}