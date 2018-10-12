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

import com.liferay.journal.model.JournalContentSearch;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JournalContentSearchModelAccessors {
	public static class ContentSearchIdAccessor extends ModelPropertyAccessor {
		public ContentSearchIdAccessor() {
			super(new Function<JournalContentSearch, Long>() {
					@Override
					public Long apply(JournalContentSearch journalContentSearch) {
						return journalContentSearch.getContentSearchId();
					}
				},
				new BiConsumer<JournalContentSearch, Long>() {
					@Override
					public void accept(
						JournalContentSearch journalContentSearch,
						Long contentSearchId) {
						journalContentSearch.setContentSearchId(contentSearchId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<JournalContentSearch, Long>() {
					@Override
					public Long apply(JournalContentSearch journalContentSearch) {
						return journalContentSearch.getGroupId();
					}
				},
				new BiConsumer<JournalContentSearch, Long>() {
					@Override
					public void accept(
						JournalContentSearch journalContentSearch, Long groupId) {
						journalContentSearch.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<JournalContentSearch, Long>() {
					@Override
					public Long apply(JournalContentSearch journalContentSearch) {
						return journalContentSearch.getCompanyId();
					}
				},
				new BiConsumer<JournalContentSearch, Long>() {
					@Override
					public void accept(
						JournalContentSearch journalContentSearch,
						Long companyId) {
						journalContentSearch.setCompanyId(companyId);
					}
				});
		}
	}

	public static class PrivateLayoutAccessor extends ModelPropertyAccessor {
		public PrivateLayoutAccessor() {
			super(new Function<JournalContentSearch, Boolean>() {
					@Override
					public Boolean apply(
						JournalContentSearch journalContentSearch) {
						return journalContentSearch.getPrivateLayout();
					}
				},
				new BiConsumer<JournalContentSearch, Boolean>() {
					@Override
					public void accept(
						JournalContentSearch journalContentSearch,
						Boolean privateLayout) {
						journalContentSearch.setPrivateLayout(privateLayout);
					}
				});
		}
	}

	public static class LayoutIdAccessor extends ModelPropertyAccessor {
		public LayoutIdAccessor() {
			super(new Function<JournalContentSearch, Long>() {
					@Override
					public Long apply(JournalContentSearch journalContentSearch) {
						return journalContentSearch.getLayoutId();
					}
				},
				new BiConsumer<JournalContentSearch, Long>() {
					@Override
					public void accept(
						JournalContentSearch journalContentSearch, Long layoutId) {
						journalContentSearch.setLayoutId(layoutId);
					}
				});
		}
	}

	public static class PortletIdAccessor extends ModelPropertyAccessor {
		public PortletIdAccessor() {
			super(new Function<JournalContentSearch, String>() {
					@Override
					public String apply(
						JournalContentSearch journalContentSearch) {
						return journalContentSearch.getPortletId();
					}
				},
				new BiConsumer<JournalContentSearch, String>() {
					@Override
					public void accept(
						JournalContentSearch journalContentSearch,
						String portletId) {
						journalContentSearch.setPortletId(portletId);
					}
				});
		}
	}

	public static class ArticleIdAccessor extends ModelPropertyAccessor {
		public ArticleIdAccessor() {
			super(new Function<JournalContentSearch, String>() {
					@Override
					public String apply(
						JournalContentSearch journalContentSearch) {
						return journalContentSearch.getArticleId();
					}
				},
				new BiConsumer<JournalContentSearch, String>() {
					@Override
					public void accept(
						JournalContentSearch journalContentSearch,
						String articleId) {
						journalContentSearch.setArticleId(articleId);
					}
				});
		}
	}

	private JournalContentSearchModelAccessors() {
	}
}