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
import com.liferay.portal.tools.service.builder.test.model.LVEntryLocalization;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LVEntryLocalizationModelAccessors {
	public static class HeadIdAccessor extends ModelPropertyAccessor {
		public HeadIdAccessor() {
			super(new Function<LVEntryLocalization, Long>() {
					@Override
					public Long apply(LVEntryLocalization lvEntryLocalization) {
						return lvEntryLocalization.getHeadId();
					}
				},
				new BiConsumer<LVEntryLocalization, Long>() {
					@Override
					public void accept(
						LVEntryLocalization lvEntryLocalization, Long headId) {
						lvEntryLocalization.setHeadId(headId);
					}
				});
		}
	}

	public static class LvEntryLocalizationIdAccessor
		extends ModelPropertyAccessor {
		public LvEntryLocalizationIdAccessor() {
			super(new Function<LVEntryLocalization, Long>() {
					@Override
					public Long apply(LVEntryLocalization lvEntryLocalization) {
						return lvEntryLocalization.getLvEntryLocalizationId();
					}
				},
				new BiConsumer<LVEntryLocalization, Long>() {
					@Override
					public void accept(
						LVEntryLocalization lvEntryLocalization,
						Long lvEntryLocalizationId) {
						lvEntryLocalization.setLvEntryLocalizationId(lvEntryLocalizationId);
					}
				});
		}
	}

	public static class LvEntryIdAccessor extends ModelPropertyAccessor {
		public LvEntryIdAccessor() {
			super(new Function<LVEntryLocalization, Long>() {
					@Override
					public Long apply(LVEntryLocalization lvEntryLocalization) {
						return lvEntryLocalization.getLvEntryId();
					}
				},
				new BiConsumer<LVEntryLocalization, Long>() {
					@Override
					public void accept(
						LVEntryLocalization lvEntryLocalization, Long lvEntryId) {
						lvEntryLocalization.setLvEntryId(lvEntryId);
					}
				});
		}
	}

	public static class LanguageIdAccessor extends ModelPropertyAccessor {
		public LanguageIdAccessor() {
			super(new Function<LVEntryLocalization, String>() {
					@Override
					public String apply(LVEntryLocalization lvEntryLocalization) {
						return lvEntryLocalization.getLanguageId();
					}
				},
				new BiConsumer<LVEntryLocalization, String>() {
					@Override
					public void accept(
						LVEntryLocalization lvEntryLocalization,
						String languageId) {
						lvEntryLocalization.setLanguageId(languageId);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<LVEntryLocalization, String>() {
					@Override
					public String apply(LVEntryLocalization lvEntryLocalization) {
						return lvEntryLocalization.getTitle();
					}
				},
				new BiConsumer<LVEntryLocalization, String>() {
					@Override
					public void accept(
						LVEntryLocalization lvEntryLocalization, String title) {
						lvEntryLocalization.setTitle(title);
					}
				});
		}
	}

	public static class ContentAccessor extends ModelPropertyAccessor {
		public ContentAccessor() {
			super(new Function<LVEntryLocalization, String>() {
					@Override
					public String apply(LVEntryLocalization lvEntryLocalization) {
						return lvEntryLocalization.getContent();
					}
				},
				new BiConsumer<LVEntryLocalization, String>() {
					@Override
					public void accept(
						LVEntryLocalization lvEntryLocalization, String content) {
						lvEntryLocalization.setContent(content);
					}
				});
		}
	}

	private LVEntryLocalizationModelAccessors() {
	}
}