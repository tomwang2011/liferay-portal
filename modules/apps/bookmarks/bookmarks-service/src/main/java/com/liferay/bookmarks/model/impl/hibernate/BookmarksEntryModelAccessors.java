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

import com.liferay.bookmarks.model.BookmarksEntry;

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
public class BookmarksEntryModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<BookmarksEntry, String>() {
					@Override
					public String apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getUuid();
					}
				},
				new BiConsumer<BookmarksEntry, String>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						String uuid) {
						bookmarksEntry.setUuid(uuid);
					}
				});
		}
	}

	public static class EntryIdAccessor extends ModelPropertyAccessor {
		public EntryIdAccessor() {
			super(new Function<BookmarksEntry, Long>() {
					@Override
					public Long apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getEntryId();
					}
				},
				new BiConsumer<BookmarksEntry, Long>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						Long entryId) {
						bookmarksEntry.setEntryId(entryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<BookmarksEntry, Long>() {
					@Override
					public Long apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getGroupId();
					}
				},
				new BiConsumer<BookmarksEntry, Long>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						Long groupId) {
						bookmarksEntry.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<BookmarksEntry, Long>() {
					@Override
					public Long apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getCompanyId();
					}
				},
				new BiConsumer<BookmarksEntry, Long>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						Long companyId) {
						bookmarksEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<BookmarksEntry, Long>() {
					@Override
					public Long apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getUserId();
					}
				},
				new BiConsumer<BookmarksEntry, Long>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						Long userId) {
						bookmarksEntry.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<BookmarksEntry, String>() {
					@Override
					public String apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getUserName();
					}
				},
				new BiConsumer<BookmarksEntry, String>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						String userName) {
						bookmarksEntry.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<BookmarksEntry, Date>() {
					@Override
					public Date apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getCreateDate();
					}
				},
				new BiConsumer<BookmarksEntry, Date>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						Date createDate) {
						bookmarksEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<BookmarksEntry, Date>() {
					@Override
					public Date apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getModifiedDate();
					}
				},
				new BiConsumer<BookmarksEntry, Date>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						Date modifiedDate) {
						bookmarksEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class FolderIdAccessor extends ModelPropertyAccessor {
		public FolderIdAccessor() {
			super(new Function<BookmarksEntry, Long>() {
					@Override
					public Long apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getFolderId();
					}
				},
				new BiConsumer<BookmarksEntry, Long>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						Long folderId) {
						bookmarksEntry.setFolderId(folderId);
					}
				});
		}
	}

	public static class TreePathAccessor extends ModelPropertyAccessor {
		public TreePathAccessor() {
			super(new Function<BookmarksEntry, String>() {
					@Override
					public String apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getTreePath();
					}
				},
				new BiConsumer<BookmarksEntry, String>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						String treePath) {
						bookmarksEntry.setTreePath(treePath);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<BookmarksEntry, String>() {
					@Override
					public String apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getName();
					}
				},
				new BiConsumer<BookmarksEntry, String>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						String name) {
						bookmarksEntry.setName(name);
					}
				});
		}
	}

	public static class UrlAccessor extends ModelPropertyAccessor {
		public UrlAccessor() {
			super(new Function<BookmarksEntry, String>() {
					@Override
					public String apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getUrl();
					}
				},
				new BiConsumer<BookmarksEntry, String>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry, String url) {
						bookmarksEntry.setUrl(url);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<BookmarksEntry, String>() {
					@Override
					public String apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getDescription();
					}
				},
				new BiConsumer<BookmarksEntry, String>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						String description) {
						bookmarksEntry.setDescription(description);
					}
				});
		}
	}

	public static class VisitsAccessor extends ModelPropertyAccessor {
		public VisitsAccessor() {
			super(new Function<BookmarksEntry, Integer>() {
					@Override
					public Integer apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getVisits();
					}
				},
				new BiConsumer<BookmarksEntry, Integer>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						Integer visits) {
						bookmarksEntry.setVisits(visits);
					}
				});
		}
	}

	public static class PriorityAccessor extends ModelPropertyAccessor {
		public PriorityAccessor() {
			super(new Function<BookmarksEntry, Integer>() {
					@Override
					public Integer apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getPriority();
					}
				},
				new BiConsumer<BookmarksEntry, Integer>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						Integer priority) {
						bookmarksEntry.setPriority(priority);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<BookmarksEntry, Date>() {
					@Override
					public Date apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getLastPublishDate();
					}
				},
				new BiConsumer<BookmarksEntry, Date>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						Date lastPublishDate) {
						bookmarksEntry.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<BookmarksEntry, Integer>() {
					@Override
					public Integer apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getStatus();
					}
				},
				new BiConsumer<BookmarksEntry, Integer>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						Integer status) {
						bookmarksEntry.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<BookmarksEntry, Long>() {
					@Override
					public Long apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getStatusByUserId();
					}
				},
				new BiConsumer<BookmarksEntry, Long>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						Long statusByUserId) {
						bookmarksEntry.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<BookmarksEntry, String>() {
					@Override
					public String apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getStatusByUserName();
					}
				},
				new BiConsumer<BookmarksEntry, String>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						String statusByUserName) {
						bookmarksEntry.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<BookmarksEntry, Date>() {
					@Override
					public Date apply(BookmarksEntry bookmarksEntry) {
						return bookmarksEntry.getStatusDate();
					}
				},
				new BiConsumer<BookmarksEntry, Date>() {
					@Override
					public void accept(BookmarksEntry bookmarksEntry,
						Date statusDate) {
						bookmarksEntry.setStatusDate(statusDate);
					}
				});
		}
	}

	private BookmarksEntryModelAccessors() {
	}
}