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
import com.liferay.portal.tools.service.builder.test.model.LocalizedEntry;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LocalizedEntryModelAccessors {
	public static class DefaultLanguageIdAccessor extends ModelPropertyAccessor {
		public DefaultLanguageIdAccessor() {
			super(new Function<LocalizedEntry, String>() {
					@Override
					public String apply(LocalizedEntry localizedEntry) {
						return localizedEntry.getDefaultLanguageId();
					}
				},
				new BiConsumer<LocalizedEntry, String>() {
					@Override
					public void accept(LocalizedEntry localizedEntry,
						String defaultLanguageId) {
						localizedEntry.setDefaultLanguageId(defaultLanguageId);
					}
				});
		}
	}

	public static class LocalizedEntryIdAccessor extends ModelPropertyAccessor {
		public LocalizedEntryIdAccessor() {
			super(new Function<LocalizedEntry, Long>() {
					@Override
					public Long apply(LocalizedEntry localizedEntry) {
						return localizedEntry.getLocalizedEntryId();
					}
				},
				new BiConsumer<LocalizedEntry, Long>() {
					@Override
					public void accept(LocalizedEntry localizedEntry,
						Long localizedEntryId) {
						localizedEntry.setLocalizedEntryId(localizedEntryId);
					}
				});
		}
	}

	private LocalizedEntryModelAccessors() {
	}
}