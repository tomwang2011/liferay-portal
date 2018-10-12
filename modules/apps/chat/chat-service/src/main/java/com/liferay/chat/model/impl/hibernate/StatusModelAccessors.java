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

package com.liferay.chat.model.impl.hibernate;

import com.liferay.chat.model.Status;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StatusModelAccessors {
	public static class StatusIdAccessor extends ModelPropertyAccessor {
		public StatusIdAccessor() {
			super(new Function<Status, Long>() {
					@Override
					public Long apply(Status status) {
						return status.getStatusId();
					}
				},
				new BiConsumer<Status, Long>() {
					@Override
					public void accept(Status status, Long statusId) {
						status.setStatusId(statusId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<Status, Long>() {
					@Override
					public Long apply(Status status) {
						return status.getUserId();
					}
				},
				new BiConsumer<Status, Long>() {
					@Override
					public void accept(Status status, Long userId) {
						status.setUserId(userId);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<Status, Long>() {
					@Override
					public Long apply(Status status) {
						return status.getModifiedDate();
					}
				},
				new BiConsumer<Status, Long>() {
					@Override
					public void accept(Status status, Long modifiedDate) {
						status.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class OnlineAccessor extends ModelPropertyAccessor {
		public OnlineAccessor() {
			super(new Function<Status, Boolean>() {
					@Override
					public Boolean apply(Status status) {
						return status.getOnline();
					}
				},
				new BiConsumer<Status, Boolean>() {
					@Override
					public void accept(Status status, Boolean online) {
						status.setOnline(online);
					}
				});
		}
	}

	public static class AwakeAccessor extends ModelPropertyAccessor {
		public AwakeAccessor() {
			super(new Function<Status, Boolean>() {
					@Override
					public Boolean apply(Status status) {
						return status.getAwake();
					}
				},
				new BiConsumer<Status, Boolean>() {
					@Override
					public void accept(Status status, Boolean awake) {
						status.setAwake(awake);
					}
				});
		}
	}

	public static class ActivePanelIdsAccessor extends ModelPropertyAccessor {
		public ActivePanelIdsAccessor() {
			super(new Function<Status, String>() {
					@Override
					public String apply(Status status) {
						return status.getActivePanelIds();
					}
				},
				new BiConsumer<Status, String>() {
					@Override
					public void accept(Status status, String activePanelIds) {
						status.setActivePanelIds(activePanelIds);
					}
				});
		}
	}

	public static class MessageAccessor extends ModelPropertyAccessor {
		public MessageAccessor() {
			super(new Function<Status, String>() {
					@Override
					public String apply(Status status) {
						return status.getMessage();
					}
				},
				new BiConsumer<Status, String>() {
					@Override
					public void accept(Status status, String message) {
						status.setMessage(message);
					}
				});
		}
	}

	public static class PlaySoundAccessor extends ModelPropertyAccessor {
		public PlaySoundAccessor() {
			super(new Function<Status, Boolean>() {
					@Override
					public Boolean apply(Status status) {
						return status.getPlaySound();
					}
				},
				new BiConsumer<Status, Boolean>() {
					@Override
					public void accept(Status status, Boolean playSound) {
						status.setPlaySound(playSound);
					}
				});
		}
	}

	private StatusModelAccessors() {
	}
}