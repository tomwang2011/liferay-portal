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
import com.liferay.portal.tools.service.builder.test.model.LVEntryLocalizationVersion;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LVEntryLocalizationVersionModelAccessors {
	public static class LvEntryLocalizationVersionIdAccessor
		extends ModelPropertyAccessor {
		public LvEntryLocalizationVersionIdAccessor() {
			super(new Function<LVEntryLocalizationVersion, Long>() {
					@Override
					public Long apply(
						LVEntryLocalizationVersion lvEntryLocalizationVersion) {
						return lvEntryLocalizationVersion.getLvEntryLocalizationVersionId();
					}
				},
				new BiConsumer<LVEntryLocalizationVersion, Long>() {
					@Override
					public void accept(
						LVEntryLocalizationVersion lvEntryLocalizationVersion,
						Long lvEntryLocalizationVersionId) {
						lvEntryLocalizationVersion.setLvEntryLocalizationVersionId(lvEntryLocalizationVersionId);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<LVEntryLocalizationVersion, Integer>() {
					@Override
					public Integer apply(
						LVEntryLocalizationVersion lvEntryLocalizationVersion) {
						return lvEntryLocalizationVersion.getVersion();
					}
				},
				new BiConsumer<LVEntryLocalizationVersion, Integer>() {
					@Override
					public void accept(
						LVEntryLocalizationVersion lvEntryLocalizationVersion,
						Integer version) {
						lvEntryLocalizationVersion.setVersion(version);
					}
				});
		}
	}

	public static class LvEntryLocalizationIdAccessor
		extends ModelPropertyAccessor {
		public LvEntryLocalizationIdAccessor() {
			super(new Function<LVEntryLocalizationVersion, Long>() {
					@Override
					public Long apply(
						LVEntryLocalizationVersion lvEntryLocalizationVersion) {
						return lvEntryLocalizationVersion.getLvEntryLocalizationId();
					}
				},
				new BiConsumer<LVEntryLocalizationVersion, Long>() {
					@Override
					public void accept(
						LVEntryLocalizationVersion lvEntryLocalizationVersion,
						Long lvEntryLocalizationId) {
						lvEntryLocalizationVersion.setLvEntryLocalizationId(lvEntryLocalizationId);
					}
				});
		}
	}

	public static class LvEntryIdAccessor extends ModelPropertyAccessor {
		public LvEntryIdAccessor() {
			super(new Function<LVEntryLocalizationVersion, Long>() {
					@Override
					public Long apply(
						LVEntryLocalizationVersion lvEntryLocalizationVersion) {
						return lvEntryLocalizationVersion.getLvEntryId();
					}
				},
				new BiConsumer<LVEntryLocalizationVersion, Long>() {
					@Override
					public void accept(
						LVEntryLocalizationVersion lvEntryLocalizationVersion,
						Long lvEntryId) {
						lvEntryLocalizationVersion.setLvEntryId(lvEntryId);
					}
				});
		}
	}

	public static class LanguageIdAccessor extends ModelPropertyAccessor {
		public LanguageIdAccessor() {
			super(new Function<LVEntryLocalizationVersion, String>() {
					@Override
					public String apply(
						LVEntryLocalizationVersion lvEntryLocalizationVersion) {
						return lvEntryLocalizationVersion.getLanguageId();
					}
				},
				new BiConsumer<LVEntryLocalizationVersion, String>() {
					@Override
					public void accept(
						LVEntryLocalizationVersion lvEntryLocalizationVersion,
						String languageId) {
						lvEntryLocalizationVersion.setLanguageId(languageId);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<LVEntryLocalizationVersion, String>() {
					@Override
					public String apply(
						LVEntryLocalizationVersion lvEntryLocalizationVersion) {
						return lvEntryLocalizationVersion.getTitle();
					}
				},
				new BiConsumer<LVEntryLocalizationVersion, String>() {
					@Override
					public void accept(
						LVEntryLocalizationVersion lvEntryLocalizationVersion,
						String title) {
						lvEntryLocalizationVersion.setTitle(title);
					}
				});
		}
	}

	public static class ContentAccessor extends ModelPropertyAccessor {
		public ContentAccessor() {
			super(new Function<LVEntryLocalizationVersion, String>() {
					@Override
					public String apply(
						LVEntryLocalizationVersion lvEntryLocalizationVersion) {
						return lvEntryLocalizationVersion.getContent();
					}
				},
				new BiConsumer<LVEntryLocalizationVersion, String>() {
					@Override
					public void accept(
						LVEntryLocalizationVersion lvEntryLocalizationVersion,
						String content) {
						lvEntryLocalizationVersion.setContent(content);
					}
				});
		}
	}

	private LVEntryLocalizationVersionModelAccessors() {
	}
}