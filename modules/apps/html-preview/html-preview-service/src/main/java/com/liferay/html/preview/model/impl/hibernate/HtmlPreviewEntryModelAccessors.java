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

package com.liferay.html.preview.model.impl.hibernate;

import com.liferay.html.preview.model.HtmlPreviewEntry;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HtmlPreviewEntryModelAccessors {
	public static class HtmlPreviewEntryIdAccessor extends ModelPropertyAccessor {
		public HtmlPreviewEntryIdAccessor() {
			super(new Function<HtmlPreviewEntry, Long>() {
					@Override
					public Long apply(HtmlPreviewEntry htmlPreviewEntry) {
						return htmlPreviewEntry.getHtmlPreviewEntryId();
					}
				},
				new BiConsumer<HtmlPreviewEntry, Long>() {
					@Override
					public void accept(HtmlPreviewEntry htmlPreviewEntry,
						Long htmlPreviewEntryId) {
						htmlPreviewEntry.setHtmlPreviewEntryId(htmlPreviewEntryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<HtmlPreviewEntry, Long>() {
					@Override
					public Long apply(HtmlPreviewEntry htmlPreviewEntry) {
						return htmlPreviewEntry.getGroupId();
					}
				},
				new BiConsumer<HtmlPreviewEntry, Long>() {
					@Override
					public void accept(HtmlPreviewEntry htmlPreviewEntry,
						Long groupId) {
						htmlPreviewEntry.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<HtmlPreviewEntry, Long>() {
					@Override
					public Long apply(HtmlPreviewEntry htmlPreviewEntry) {
						return htmlPreviewEntry.getCompanyId();
					}
				},
				new BiConsumer<HtmlPreviewEntry, Long>() {
					@Override
					public void accept(HtmlPreviewEntry htmlPreviewEntry,
						Long companyId) {
						htmlPreviewEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<HtmlPreviewEntry, Long>() {
					@Override
					public Long apply(HtmlPreviewEntry htmlPreviewEntry) {
						return htmlPreviewEntry.getUserId();
					}
				},
				new BiConsumer<HtmlPreviewEntry, Long>() {
					@Override
					public void accept(HtmlPreviewEntry htmlPreviewEntry,
						Long userId) {
						htmlPreviewEntry.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<HtmlPreviewEntry, String>() {
					@Override
					public String apply(HtmlPreviewEntry htmlPreviewEntry) {
						return htmlPreviewEntry.getUserName();
					}
				},
				new BiConsumer<HtmlPreviewEntry, String>() {
					@Override
					public void accept(HtmlPreviewEntry htmlPreviewEntry,
						String userName) {
						htmlPreviewEntry.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<HtmlPreviewEntry, Date>() {
					@Override
					public Date apply(HtmlPreviewEntry htmlPreviewEntry) {
						return htmlPreviewEntry.getCreateDate();
					}
				},
				new BiConsumer<HtmlPreviewEntry, Date>() {
					@Override
					public void accept(HtmlPreviewEntry htmlPreviewEntry,
						Date createDate) {
						htmlPreviewEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<HtmlPreviewEntry, Date>() {
					@Override
					public Date apply(HtmlPreviewEntry htmlPreviewEntry) {
						return htmlPreviewEntry.getModifiedDate();
					}
				},
				new BiConsumer<HtmlPreviewEntry, Date>() {
					@Override
					public void accept(HtmlPreviewEntry htmlPreviewEntry,
						Date modifiedDate) {
						htmlPreviewEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<HtmlPreviewEntry, Long>() {
					@Override
					public Long apply(HtmlPreviewEntry htmlPreviewEntry) {
						return htmlPreviewEntry.getClassNameId();
					}
				},
				new BiConsumer<HtmlPreviewEntry, Long>() {
					@Override
					public void accept(HtmlPreviewEntry htmlPreviewEntry,
						Long classNameId) {
						htmlPreviewEntry.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<HtmlPreviewEntry, Long>() {
					@Override
					public Long apply(HtmlPreviewEntry htmlPreviewEntry) {
						return htmlPreviewEntry.getClassPK();
					}
				},
				new BiConsumer<HtmlPreviewEntry, Long>() {
					@Override
					public void accept(HtmlPreviewEntry htmlPreviewEntry,
						Long classPK) {
						htmlPreviewEntry.setClassPK(classPK);
					}
				});
		}
	}

	public static class FileEntryIdAccessor extends ModelPropertyAccessor {
		public FileEntryIdAccessor() {
			super(new Function<HtmlPreviewEntry, Long>() {
					@Override
					public Long apply(HtmlPreviewEntry htmlPreviewEntry) {
						return htmlPreviewEntry.getFileEntryId();
					}
				},
				new BiConsumer<HtmlPreviewEntry, Long>() {
					@Override
					public void accept(HtmlPreviewEntry htmlPreviewEntry,
						Long fileEntryId) {
						htmlPreviewEntry.setFileEntryId(fileEntryId);
					}
				});
		}
	}

	private HtmlPreviewEntryModelAccessors() {
	}
}