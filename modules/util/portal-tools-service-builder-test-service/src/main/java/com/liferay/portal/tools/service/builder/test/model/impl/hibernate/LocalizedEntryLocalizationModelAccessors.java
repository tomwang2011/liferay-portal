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
import com.liferay.portal.tools.service.builder.test.model.LocalizedEntryLocalization;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LocalizedEntryLocalizationModelAccessors {
	public static class LocalizedEntryLocalizationIdAccessor
		extends ModelPropertyAccessor {
		public LocalizedEntryLocalizationIdAccessor() {
			super(new Function<LocalizedEntryLocalization, Long>() {
					@Override
					public Long apply(
						LocalizedEntryLocalization localizedEntryLocalization) {
						return localizedEntryLocalization.getLocalizedEntryLocalizationId();
					}
				},
				new BiConsumer<LocalizedEntryLocalization, Long>() {
					@Override
					public void accept(
						LocalizedEntryLocalization localizedEntryLocalization,
						Long localizedEntryLocalizationId) {
						localizedEntryLocalization.setLocalizedEntryLocalizationId(localizedEntryLocalizationId);
					}
				});
		}
	}

	public static class LocalizedEntryIdAccessor extends ModelPropertyAccessor {
		public LocalizedEntryIdAccessor() {
			super(new Function<LocalizedEntryLocalization, Long>() {
					@Override
					public Long apply(
						LocalizedEntryLocalization localizedEntryLocalization) {
						return localizedEntryLocalization.getLocalizedEntryId();
					}
				},
				new BiConsumer<LocalizedEntryLocalization, Long>() {
					@Override
					public void accept(
						LocalizedEntryLocalization localizedEntryLocalization,
						Long localizedEntryId) {
						localizedEntryLocalization.setLocalizedEntryId(localizedEntryId);
					}
				});
		}
	}

	public static class LanguageIdAccessor extends ModelPropertyAccessor {
		public LanguageIdAccessor() {
			super(new Function<LocalizedEntryLocalization, String>() {
					@Override
					public String apply(
						LocalizedEntryLocalization localizedEntryLocalization) {
						return localizedEntryLocalization.getLanguageId();
					}
				},
				new BiConsumer<LocalizedEntryLocalization, String>() {
					@Override
					public void accept(
						LocalizedEntryLocalization localizedEntryLocalization,
						String languageId) {
						localizedEntryLocalization.setLanguageId(languageId);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<LocalizedEntryLocalization, String>() {
					@Override
					public String apply(
						LocalizedEntryLocalization localizedEntryLocalization) {
						return localizedEntryLocalization.getTitle();
					}
				},
				new BiConsumer<LocalizedEntryLocalization, String>() {
					@Override
					public void accept(
						LocalizedEntryLocalization localizedEntryLocalization,
						String title) {
						localizedEntryLocalization.setTitle(title);
					}
				});
		}
	}

	public static class ContentAccessor extends ModelPropertyAccessor {
		public ContentAccessor() {
			super(new Function<LocalizedEntryLocalization, String>() {
					@Override
					public String apply(
						LocalizedEntryLocalization localizedEntryLocalization) {
						return localizedEntryLocalization.getContent();
					}
				},
				new BiConsumer<LocalizedEntryLocalization, String>() {
					@Override
					public void accept(
						LocalizedEntryLocalization localizedEntryLocalization,
						String content) {
						localizedEntryLocalization.setContent(content);
					}
				});
		}
	}

	private LocalizedEntryLocalizationModelAccessors() {
	}
}