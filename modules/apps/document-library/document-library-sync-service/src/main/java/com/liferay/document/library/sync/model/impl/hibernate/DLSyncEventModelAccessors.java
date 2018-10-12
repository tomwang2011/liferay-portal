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

package com.liferay.document.library.sync.model.impl.hibernate;

import com.liferay.document.library.sync.model.DLSyncEvent;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DLSyncEventModelAccessors {
	public static class SyncEventIdAccessor extends ModelPropertyAccessor {
		public SyncEventIdAccessor() {
			super(new Function<DLSyncEvent, Long>() {
					@Override
					public Long apply(DLSyncEvent dlSyncEvent) {
						return dlSyncEvent.getSyncEventId();
					}
				},
				new BiConsumer<DLSyncEvent, Long>() {
					@Override
					public void accept(DLSyncEvent dlSyncEvent, Long syncEventId) {
						dlSyncEvent.setSyncEventId(syncEventId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DLSyncEvent, Long>() {
					@Override
					public Long apply(DLSyncEvent dlSyncEvent) {
						return dlSyncEvent.getCompanyId();
					}
				},
				new BiConsumer<DLSyncEvent, Long>() {
					@Override
					public void accept(DLSyncEvent dlSyncEvent, Long companyId) {
						dlSyncEvent.setCompanyId(companyId);
					}
				});
		}
	}

	public static class ModifiedTimeAccessor extends ModelPropertyAccessor {
		public ModifiedTimeAccessor() {
			super(new Function<DLSyncEvent, Long>() {
					@Override
					public Long apply(DLSyncEvent dlSyncEvent) {
						return dlSyncEvent.getModifiedTime();
					}
				},
				new BiConsumer<DLSyncEvent, Long>() {
					@Override
					public void accept(DLSyncEvent dlSyncEvent,
						Long modifiedTime) {
						dlSyncEvent.setModifiedTime(modifiedTime);
					}
				});
		}
	}

	public static class EventAccessor extends ModelPropertyAccessor {
		public EventAccessor() {
			super(new Function<DLSyncEvent, String>() {
					@Override
					public String apply(DLSyncEvent dlSyncEvent) {
						return dlSyncEvent.getEvent();
					}
				},
				new BiConsumer<DLSyncEvent, String>() {
					@Override
					public void accept(DLSyncEvent dlSyncEvent, String event) {
						dlSyncEvent.setEvent(event);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<DLSyncEvent, String>() {
					@Override
					public String apply(DLSyncEvent dlSyncEvent) {
						return dlSyncEvent.getType();
					}
				},
				new BiConsumer<DLSyncEvent, String>() {
					@Override
					public void accept(DLSyncEvent dlSyncEvent, String type) {
						dlSyncEvent.setType(type);
					}
				});
		}
	}

	public static class TypePKAccessor extends ModelPropertyAccessor {
		public TypePKAccessor() {
			super(new Function<DLSyncEvent, Long>() {
					@Override
					public Long apply(DLSyncEvent dlSyncEvent) {
						return dlSyncEvent.getTypePK();
					}
				},
				new BiConsumer<DLSyncEvent, Long>() {
					@Override
					public void accept(DLSyncEvent dlSyncEvent, Long typePK) {
						dlSyncEvent.setTypePK(typePK);
					}
				});
		}
	}

	private DLSyncEventModelAccessors() {
	}
}