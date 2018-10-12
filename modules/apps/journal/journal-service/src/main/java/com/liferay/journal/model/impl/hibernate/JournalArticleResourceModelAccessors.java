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

import com.liferay.journal.model.JournalArticleResource;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JournalArticleResourceModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<JournalArticleResource, String>() {
					@Override
					public String apply(
						JournalArticleResource journalArticleResource) {
						return journalArticleResource.getUuid();
					}
				},
				new BiConsumer<JournalArticleResource, String>() {
					@Override
					public void accept(
						JournalArticleResource journalArticleResource,
						String uuid) {
						journalArticleResource.setUuid(uuid);
					}
				});
		}
	}

	public static class ResourcePrimKeyAccessor extends ModelPropertyAccessor {
		public ResourcePrimKeyAccessor() {
			super(new Function<JournalArticleResource, Long>() {
					@Override
					public Long apply(
						JournalArticleResource journalArticleResource) {
						return journalArticleResource.getResourcePrimKey();
					}
				},
				new BiConsumer<JournalArticleResource, Long>() {
					@Override
					public void accept(
						JournalArticleResource journalArticleResource,
						Long resourcePrimKey) {
						journalArticleResource.setResourcePrimKey(resourcePrimKey);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<JournalArticleResource, Long>() {
					@Override
					public Long apply(
						JournalArticleResource journalArticleResource) {
						return journalArticleResource.getGroupId();
					}
				},
				new BiConsumer<JournalArticleResource, Long>() {
					@Override
					public void accept(
						JournalArticleResource journalArticleResource,
						Long groupId) {
						journalArticleResource.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<JournalArticleResource, Long>() {
					@Override
					public Long apply(
						JournalArticleResource journalArticleResource) {
						return journalArticleResource.getCompanyId();
					}
				},
				new BiConsumer<JournalArticleResource, Long>() {
					@Override
					public void accept(
						JournalArticleResource journalArticleResource,
						Long companyId) {
						journalArticleResource.setCompanyId(companyId);
					}
				});
		}
	}

	public static class ArticleIdAccessor extends ModelPropertyAccessor {
		public ArticleIdAccessor() {
			super(new Function<JournalArticleResource, String>() {
					@Override
					public String apply(
						JournalArticleResource journalArticleResource) {
						return journalArticleResource.getArticleId();
					}
				},
				new BiConsumer<JournalArticleResource, String>() {
					@Override
					public void accept(
						JournalArticleResource journalArticleResource,
						String articleId) {
						journalArticleResource.setArticleId(articleId);
					}
				});
		}
	}

	private JournalArticleResourceModelAccessors() {
	}
}