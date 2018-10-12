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

package com.liferay.document.library.content.model.impl.hibernate;

import com.liferay.document.library.content.model.DLContent;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DLContentModelAccessors {
	public static class ContentIdAccessor extends ModelPropertyAccessor {
		public ContentIdAccessor() {
			super(new Function<DLContent, Long>() {
					@Override
					public Long apply(DLContent dlContent) {
						return dlContent.getContentId();
					}
				},
				new BiConsumer<DLContent, Long>() {
					@Override
					public void accept(DLContent dlContent, Long contentId) {
						dlContent.setContentId(contentId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DLContent, Long>() {
					@Override
					public Long apply(DLContent dlContent) {
						return dlContent.getGroupId();
					}
				},
				new BiConsumer<DLContent, Long>() {
					@Override
					public void accept(DLContent dlContent, Long groupId) {
						dlContent.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DLContent, Long>() {
					@Override
					public Long apply(DLContent dlContent) {
						return dlContent.getCompanyId();
					}
				},
				new BiConsumer<DLContent, Long>() {
					@Override
					public void accept(DLContent dlContent, Long companyId) {
						dlContent.setCompanyId(companyId);
					}
				});
		}
	}

	public static class RepositoryIdAccessor extends ModelPropertyAccessor {
		public RepositoryIdAccessor() {
			super(new Function<DLContent, Long>() {
					@Override
					public Long apply(DLContent dlContent) {
						return dlContent.getRepositoryId();
					}
				},
				new BiConsumer<DLContent, Long>() {
					@Override
					public void accept(DLContent dlContent, Long repositoryId) {
						dlContent.setRepositoryId(repositoryId);
					}
				});
		}
	}

	public static class PathAccessor extends ModelPropertyAccessor {
		public PathAccessor() {
			super(new Function<DLContent, String>() {
					@Override
					public String apply(DLContent dlContent) {
						return dlContent.getPath();
					}
				},
				new BiConsumer<DLContent, String>() {
					@Override
					public void accept(DLContent dlContent, String path) {
						dlContent.setPath(path);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<DLContent, String>() {
					@Override
					public String apply(DLContent dlContent) {
						return dlContent.getVersion();
					}
				},
				new BiConsumer<DLContent, String>() {
					@Override
					public void accept(DLContent dlContent, String version) {
						dlContent.setVersion(version);
					}
				});
		}
	}

	public static class SizeAccessor extends ModelPropertyAccessor {
		public SizeAccessor() {
			super(new Function<DLContent, Long>() {
					@Override
					public Long apply(DLContent dlContent) {
						return dlContent.getSize();
					}
				},
				new BiConsumer<DLContent, Long>() {
					@Override
					public void accept(DLContent dlContent, Long size) {
						dlContent.setSize(size);
					}
				});
		}
	}

	private DLContentModelAccessors() {
	}
}