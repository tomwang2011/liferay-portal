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

package com.liferay.wiki.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.wiki.model.WikiPageResource;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WikiPageResourceModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<WikiPageResource, String>() {
					@Override
					public String apply(WikiPageResource wikiPageResource) {
						return wikiPageResource.getUuid();
					}
				},
				new BiConsumer<WikiPageResource, String>() {
					@Override
					public void accept(WikiPageResource wikiPageResource,
						String uuid) {
						wikiPageResource.setUuid(uuid);
					}
				});
		}
	}

	public static class ResourcePrimKeyAccessor extends ModelPropertyAccessor {
		public ResourcePrimKeyAccessor() {
			super(new Function<WikiPageResource, Long>() {
					@Override
					public Long apply(WikiPageResource wikiPageResource) {
						return wikiPageResource.getResourcePrimKey();
					}
				},
				new BiConsumer<WikiPageResource, Long>() {
					@Override
					public void accept(WikiPageResource wikiPageResource,
						Long resourcePrimKey) {
						wikiPageResource.setResourcePrimKey(resourcePrimKey);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<WikiPageResource, Long>() {
					@Override
					public Long apply(WikiPageResource wikiPageResource) {
						return wikiPageResource.getGroupId();
					}
				},
				new BiConsumer<WikiPageResource, Long>() {
					@Override
					public void accept(WikiPageResource wikiPageResource,
						Long groupId) {
						wikiPageResource.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<WikiPageResource, Long>() {
					@Override
					public Long apply(WikiPageResource wikiPageResource) {
						return wikiPageResource.getCompanyId();
					}
				},
				new BiConsumer<WikiPageResource, Long>() {
					@Override
					public void accept(WikiPageResource wikiPageResource,
						Long companyId) {
						wikiPageResource.setCompanyId(companyId);
					}
				});
		}
	}

	public static class NodeIdAccessor extends ModelPropertyAccessor {
		public NodeIdAccessor() {
			super(new Function<WikiPageResource, Long>() {
					@Override
					public Long apply(WikiPageResource wikiPageResource) {
						return wikiPageResource.getNodeId();
					}
				},
				new BiConsumer<WikiPageResource, Long>() {
					@Override
					public void accept(WikiPageResource wikiPageResource,
						Long nodeId) {
						wikiPageResource.setNodeId(nodeId);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<WikiPageResource, String>() {
					@Override
					public String apply(WikiPageResource wikiPageResource) {
						return wikiPageResource.getTitle();
					}
				},
				new BiConsumer<WikiPageResource, String>() {
					@Override
					public void accept(WikiPageResource wikiPageResource,
						String title) {
						wikiPageResource.setTitle(title);
					}
				});
		}
	}

	private WikiPageResourceModelAccessors() {
	}
}