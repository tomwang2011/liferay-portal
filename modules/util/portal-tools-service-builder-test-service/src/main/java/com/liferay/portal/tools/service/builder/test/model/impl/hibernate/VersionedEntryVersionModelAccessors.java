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
import com.liferay.portal.tools.service.builder.test.model.VersionedEntryVersion;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VersionedEntryVersionModelAccessors {
	public static class VersionedEntryVersionIdAccessor
		extends ModelPropertyAccessor {
		public VersionedEntryVersionIdAccessor() {
			super(new Function<VersionedEntryVersion, Long>() {
					@Override
					public Long apply(
						VersionedEntryVersion versionedEntryVersion) {
						return versionedEntryVersion.getVersionedEntryVersionId();
					}
				},
				new BiConsumer<VersionedEntryVersion, Long>() {
					@Override
					public void accept(
						VersionedEntryVersion versionedEntryVersion,
						Long versionedEntryVersionId) {
						versionedEntryVersion.setVersionedEntryVersionId(versionedEntryVersionId);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<VersionedEntryVersion, Integer>() {
					@Override
					public Integer apply(
						VersionedEntryVersion versionedEntryVersion) {
						return versionedEntryVersion.getVersion();
					}
				},
				new BiConsumer<VersionedEntryVersion, Integer>() {
					@Override
					public void accept(
						VersionedEntryVersion versionedEntryVersion,
						Integer version) {
						versionedEntryVersion.setVersion(version);
					}
				});
		}
	}

	public static class VersionedEntryIdAccessor extends ModelPropertyAccessor {
		public VersionedEntryIdAccessor() {
			super(new Function<VersionedEntryVersion, Long>() {
					@Override
					public Long apply(
						VersionedEntryVersion versionedEntryVersion) {
						return versionedEntryVersion.getVersionedEntryId();
					}
				},
				new BiConsumer<VersionedEntryVersion, Long>() {
					@Override
					public void accept(
						VersionedEntryVersion versionedEntryVersion,
						Long versionedEntryId) {
						versionedEntryVersion.setVersionedEntryId(versionedEntryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<VersionedEntryVersion, Long>() {
					@Override
					public Long apply(
						VersionedEntryVersion versionedEntryVersion) {
						return versionedEntryVersion.getGroupId();
					}
				},
				new BiConsumer<VersionedEntryVersion, Long>() {
					@Override
					public void accept(
						VersionedEntryVersion versionedEntryVersion,
						Long groupId) {
						versionedEntryVersion.setGroupId(groupId);
					}
				});
		}
	}

	private VersionedEntryVersionModelAccessors() {
	}
}