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

package com.liferay.portal.tools.service.builder.test.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;
import com.liferay.portal.tools.service.builder.test.model.VersionedEntry;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VersionedEntryModelAccessors {
	public static class HeadIdAccessor extends ModelPropertyAccessor {
		public HeadIdAccessor() {
			super(new Function<VersionedEntry, Long>() {
					@Override
					public Long apply(VersionedEntry versionedEntry) {
						return versionedEntry.getHeadId();
					}
				},
				new BiConsumer<VersionedEntry, Long>() {
					@Override
					public void accept(VersionedEntry versionedEntry,
						Long headId) {
						versionedEntry.setHeadId(headId);
					}
				});
		}
	}

	public static class VersionedEntryIdAccessor extends ModelPropertyAccessor {
		public VersionedEntryIdAccessor() {
			super(new Function<VersionedEntry, Long>() {
					@Override
					public Long apply(VersionedEntry versionedEntry) {
						return versionedEntry.getVersionedEntryId();
					}
				},
				new BiConsumer<VersionedEntry, Long>() {
					@Override
					public void accept(VersionedEntry versionedEntry,
						Long versionedEntryId) {
						versionedEntry.setVersionedEntryId(versionedEntryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<VersionedEntry, Long>() {
					@Override
					public Long apply(VersionedEntry versionedEntry) {
						return versionedEntry.getGroupId();
					}
				},
				new BiConsumer<VersionedEntry, Long>() {
					@Override
					public void accept(VersionedEntry versionedEntry,
						Long groupId) {
						versionedEntry.setGroupId(groupId);
					}
				});
		}
	}

	private VersionedEntryModelAccessors() {
	}
}