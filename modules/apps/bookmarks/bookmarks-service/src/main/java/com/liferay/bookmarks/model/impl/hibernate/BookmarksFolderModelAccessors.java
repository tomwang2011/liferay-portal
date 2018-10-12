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

package com.liferay.bookmarks.model.impl.hibernate;

import com.liferay.bookmarks.model.BookmarksFolder;

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
public class BookmarksFolderModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<BookmarksFolder, String>() {
					@Override
					public String apply(BookmarksFolder bookmarksFolder) {
						return bookmarksFolder.getUuid();
					}
				},
				new BiConsumer<BookmarksFolder, String>() {
					@Override
					public void accept(BookmarksFolder bookmarksFolder,
						String uuid) {
						bookmarksFolder.setUuid(uuid);
					}
				});
		}
	}

	public static class FolderIdAccessor extends ModelPropertyAccessor {
		public FolderIdAccessor() {
			super(new Function<BookmarksFolder, Long>() {
					@Override
					public Long apply(BookmarksFolder bookmarksFolder) {
						return bookmarksFolder.getFolderId();
					}
				},
				new BiConsumer<BookmarksFolder, Long>() {
					@Override
					public void accept(BookmarksFolder bookmarksFolder,
						Long folderId) {
						bookmarksFolder.setFolderId(folderId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<BookmarksFolder, Long>() {
					@Override
					public Long apply(BookmarksFolder bookmarksFolder) {
						return bookmarksFolder.getGroupId();
					}
				},
				new BiConsumer<BookmarksFolder, Long>() {
					@Override
					public void accept(BookmarksFolder bookmarksFolder,
						Long groupId) {
						bookmarksFolder.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<BookmarksFolder, Long>() {
					@Override
					public Long apply(BookmarksFolder bookmarksFolder) {
						return bookmarksFolder.getCompanyId();
					}
				},
				new BiConsumer<BookmarksFolder, Long>() {
					@Override
					public void accept(BookmarksFolder bookmarksFolder,
						Long companyId) {
						bookmarksFolder.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<BookmarksFolder, Long>() {
					@Override
					public Long apply(BookmarksFolder bookmarksFolder) {
						return bookmarksFolder.getUserId();
					}
				},
				new BiConsumer<BookmarksFolder, Long>() {
					@Override
					public void accept(BookmarksFolder bookmarksFolder,
						Long userId) {
						bookmarksFolder.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<BookmarksFolder, String>() {
					@Override
					public String apply(BookmarksFolder bookmarksFolder) {
						return bookmarksFolder.getUserName();
					}
				},
				new BiConsumer<BookmarksFolder, String>() {
					@Override
					public void accept(BookmarksFolder bookmarksFolder,
						String userName) {
						bookmarksFolder.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<BookmarksFolder, Date>() {
					@Override
					public Date apply(BookmarksFolder bookmarksFolder) {
						return bookmarksFolder.getCreateDate();
					}
				},
				new BiConsumer<BookmarksFolder, Date>() {
					@Override
					public void accept(BookmarksFolder bookmarksFolder,
						Date createDate) {
						bookmarksFolder.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<BookmarksFolder, Date>() {
					@Override
					public Date apply(BookmarksFolder bookmarksFolder) {
						return bookmarksFolder.getModifiedDate();
					}
				},
				new BiConsumer<BookmarksFolder, Date>() {
					@Override
					public void accept(BookmarksFolder bookmarksFolder,
						Date modifiedDate) {
						bookmarksFolder.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ParentFolderIdAccessor extends ModelPropertyAccessor {
		public ParentFolderIdAccessor() {
			super(new Function<BookmarksFolder, Long>() {
					@Override
					public Long apply(BookmarksFolder bookmarksFolder) {
						return bookmarksFolder.getParentFolderId();
					}
				},
				new BiConsumer<BookmarksFolder, Long>() {
					@Override
					public void accept(BookmarksFolder bookmarksFolder,
						Long parentFolderId) {
						bookmarksFolder.setParentFolderId(parentFolderId);
					}
				});
		}
	}

	public static class TreePathAccessor extends ModelPropertyAccessor {
		public TreePathAccessor() {
			super(new Function<BookmarksFolder, String>() {
					@Override
					public String apply(BookmarksFolder bookmarksFolder) {
						return bookmarksFolder.getTreePath();
					}
				},
				new BiConsumer<BookmarksFolder, String>() {
					@Override
					public void accept(BookmarksFolder bookmarksFolder,
						String treePath) {
						bookmarksFolder.setTreePath(treePath);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<BookmarksFolder, String>() {
					@Override
					public String apply(BookmarksFolder bookmarksFolder) {
						return bookmarksFolder.getName();
					}
				},
				new BiConsumer<BookmarksFolder, String>() {
					@Override
					public void accept(BookmarksFolder bookmarksFolder,
						String name) {
						bookmarksFolder.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<BookmarksFolder, String>() {
					@Override
					public String apply(BookmarksFolder bookmarksFolder) {
						return bookmarksFolder.getDescription();
					}
				},
				new BiConsumer<BookmarksFolder, String>() {
					@Override
					public void accept(BookmarksFolder bookmarksFolder,
						String description) {
						bookmarksFolder.setDescription(description);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<BookmarksFolder, Date>() {
					@Override
					public Date apply(BookmarksFolder bookmarksFolder) {
						return bookmarksFolder.getLastPublishDate();
					}
				},
				new BiConsumer<BookmarksFolder, Date>() {
					@Override
					public void accept(BookmarksFolder bookmarksFolder,
						Date lastPublishDate) {
						bookmarksFolder.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<BookmarksFolder, Integer>() {
					@Override
					public Integer apply(BookmarksFolder bookmarksFolder) {
						return bookmarksFolder.getStatus();
					}
				},
				new BiConsumer<BookmarksFolder, Integer>() {
					@Override
					public void accept(BookmarksFolder bookmarksFolder,
						Integer status) {
						bookmarksFolder.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<BookmarksFolder, Long>() {
					@Override
					public Long apply(BookmarksFolder bookmarksFolder) {
						return bookmarksFolder.getStatusByUserId();
					}
				},
				new BiConsumer<BookmarksFolder, Long>() {
					@Override
					public void accept(BookmarksFolder bookmarksFolder,
						Long statusByUserId) {
						bookmarksFolder.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<BookmarksFolder, String>() {
					@Override
					public String apply(BookmarksFolder bookmarksFolder) {
						return bookmarksFolder.getStatusByUserName();
					}
				},
				new BiConsumer<BookmarksFolder, String>() {
					@Override
					public void accept(BookmarksFolder bookmarksFolder,
						String statusByUserName) {
						bookmarksFolder.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<BookmarksFolder, Date>() {
					@Override
					public Date apply(BookmarksFolder bookmarksFolder) {
						return bookmarksFolder.getStatusDate();
					}
				},
				new BiConsumer<BookmarksFolder, Date>() {
					@Override
					public void accept(BookmarksFolder bookmarksFolder,
						Date statusDate) {
						bookmarksFolder.setStatusDate(statusDate);
					}
				});
		}
	}

	private BookmarksFolderModelAccessors() {
	}
}