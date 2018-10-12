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

package com.liferay.journal.model.impl.hibernate;

import com.liferay.journal.model.JournalArticleLocalization;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JournalArticleLocalizationModelAccessors {
	public static class ArticleLocalizationIdAccessor
		extends ModelPropertyAccessor {
		public ArticleLocalizationIdAccessor() {
			super(new Function<JournalArticleLocalization, Long>() {
					@Override
					public Long apply(
						JournalArticleLocalization journalArticleLocalization) {
						return journalArticleLocalization.getArticleLocalizationId();
					}
				},
				new BiConsumer<JournalArticleLocalization, Long>() {
					@Override
					public void accept(
						JournalArticleLocalization journalArticleLocalization,
						Long articleLocalizationId) {
						journalArticleLocalization.setArticleLocalizationId(articleLocalizationId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<JournalArticleLocalization, Long>() {
					@Override
					public Long apply(
						JournalArticleLocalization journalArticleLocalization) {
						return journalArticleLocalization.getCompanyId();
					}
				},
				new BiConsumer<JournalArticleLocalization, Long>() {
					@Override
					public void accept(
						JournalArticleLocalization journalArticleLocalization,
						Long companyId) {
						journalArticleLocalization.setCompanyId(companyId);
					}
				});
		}
	}

	public static class ArticlePKAccessor extends ModelPropertyAccessor {
		public ArticlePKAccessor() {
			super(new Function<JournalArticleLocalization, Long>() {
					@Override
					public Long apply(
						JournalArticleLocalization journalArticleLocalization) {
						return journalArticleLocalization.getArticlePK();
					}
				},
				new BiConsumer<JournalArticleLocalization, Long>() {
					@Override
					public void accept(
						JournalArticleLocalization journalArticleLocalization,
						Long articlePK) {
						journalArticleLocalization.setArticlePK(articlePK);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<JournalArticleLocalization, String>() {
					@Override
					public String apply(
						JournalArticleLocalization journalArticleLocalization) {
						return journalArticleLocalization.getTitle();
					}
				},
				new BiConsumer<JournalArticleLocalization, String>() {
					@Override
					public void accept(
						JournalArticleLocalization journalArticleLocalization,
						String title) {
						journalArticleLocalization.setTitle(title);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<JournalArticleLocalization, String>() {
					@Override
					public String apply(
						JournalArticleLocalization journalArticleLocalization) {
						return journalArticleLocalization.getDescription();
					}
				},
				new BiConsumer<JournalArticleLocalization, String>() {
					@Override
					public void accept(
						JournalArticleLocalization journalArticleLocalization,
						String description) {
						journalArticleLocalization.setDescription(description);
					}
				});
		}
	}

	public static class LanguageIdAccessor extends ModelPropertyAccessor {
		public LanguageIdAccessor() {
			super(new Function<JournalArticleLocalization, String>() {
					@Override
					public String apply(
						JournalArticleLocalization journalArticleLocalization) {
						return journalArticleLocalization.getLanguageId();
					}
				},
				new BiConsumer<JournalArticleLocalization, String>() {
					@Override
					public void accept(
						JournalArticleLocalization journalArticleLocalization,
						String languageId) {
						journalArticleLocalization.setLanguageId(languageId);
					}
				});
		}
	}

	private JournalArticleLocalizationModelAccessors() {
	}
}