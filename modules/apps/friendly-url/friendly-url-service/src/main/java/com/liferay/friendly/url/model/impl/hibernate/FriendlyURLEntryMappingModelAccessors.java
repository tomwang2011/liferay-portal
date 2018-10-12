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

package com.liferay.friendly.url.model.impl.hibernate;

import com.liferay.friendly.url.model.FriendlyURLEntryMapping;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FriendlyURLEntryMappingModelAccessors {
	public static class FriendlyURLEntryMappingIdAccessor
		extends ModelPropertyAccessor {
		public FriendlyURLEntryMappingIdAccessor() {
			super(new Function<FriendlyURLEntryMapping, Long>() {
					@Override
					public Long apply(
						FriendlyURLEntryMapping friendlyURLEntryMapping) {
						return friendlyURLEntryMapping.getFriendlyURLEntryMappingId();
					}
				},
				new BiConsumer<FriendlyURLEntryMapping, Long>() {
					@Override
					public void accept(
						FriendlyURLEntryMapping friendlyURLEntryMapping,
						Long friendlyURLEntryMappingId) {
						friendlyURLEntryMapping.setFriendlyURLEntryMappingId(friendlyURLEntryMappingId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<FriendlyURLEntryMapping, Long>() {
					@Override
					public Long apply(
						FriendlyURLEntryMapping friendlyURLEntryMapping) {
						return friendlyURLEntryMapping.getClassNameId();
					}
				},
				new BiConsumer<FriendlyURLEntryMapping, Long>() {
					@Override
					public void accept(
						FriendlyURLEntryMapping friendlyURLEntryMapping,
						Long classNameId) {
						friendlyURLEntryMapping.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<FriendlyURLEntryMapping, Long>() {
					@Override
					public Long apply(
						FriendlyURLEntryMapping friendlyURLEntryMapping) {
						return friendlyURLEntryMapping.getClassPK();
					}
				},
				new BiConsumer<FriendlyURLEntryMapping, Long>() {
					@Override
					public void accept(
						FriendlyURLEntryMapping friendlyURLEntryMapping,
						Long classPK) {
						friendlyURLEntryMapping.setClassPK(classPK);
					}
				});
		}
	}

	public static class FriendlyURLEntryIdAccessor extends ModelPropertyAccessor {
		public FriendlyURLEntryIdAccessor() {
			super(new Function<FriendlyURLEntryMapping, Long>() {
					@Override
					public Long apply(
						FriendlyURLEntryMapping friendlyURLEntryMapping) {
						return friendlyURLEntryMapping.getFriendlyURLEntryId();
					}
				},
				new BiConsumer<FriendlyURLEntryMapping, Long>() {
					@Override
					public void accept(
						FriendlyURLEntryMapping friendlyURLEntryMapping,
						Long friendlyURLEntryId) {
						friendlyURLEntryMapping.setFriendlyURLEntryId(friendlyURLEntryId);
					}
				});
		}
	}

	private FriendlyURLEntryMappingModelAccessors() {
	}
}