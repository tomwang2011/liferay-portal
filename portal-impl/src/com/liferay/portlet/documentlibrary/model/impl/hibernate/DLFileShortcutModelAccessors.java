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

package com.liferay.portlet.documentlibrary.model.impl.hibernate;

import com.liferay.document.library.kernel.model.DLFileShortcut;

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
public class DLFileShortcutModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<DLFileShortcut, String>() {
					@Override
					public String apply(DLFileShortcut dlFileShortcut) {
						return dlFileShortcut.getUuid();
					}
				},
				new BiConsumer<DLFileShortcut, String>() {
					@Override
					public void accept(DLFileShortcut dlFileShortcut,
						String uuid) {
						dlFileShortcut.setUuid(uuid);
					}
				});
		}
	}

	public static class FileShortcutIdAccessor extends ModelPropertyAccessor {
		public FileShortcutIdAccessor() {
			super(new Function<DLFileShortcut, Long>() {
					@Override
					public Long apply(DLFileShortcut dlFileShortcut) {
						return dlFileShortcut.getFileShortcutId();
					}
				},
				new BiConsumer<DLFileShortcut, Long>() {
					@Override
					public void accept(DLFileShortcut dlFileShortcut,
						Long fileShortcutId) {
						dlFileShortcut.setFileShortcutId(fileShortcutId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DLFileShortcut, Long>() {
					@Override
					public Long apply(DLFileShortcut dlFileShortcut) {
						return dlFileShortcut.getGroupId();
					}
				},
				new BiConsumer<DLFileShortcut, Long>() {
					@Override
					public void accept(DLFileShortcut dlFileShortcut,
						Long groupId) {
						dlFileShortcut.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DLFileShortcut, Long>() {
					@Override
					public Long apply(DLFileShortcut dlFileShortcut) {
						return dlFileShortcut.getCompanyId();
					}
				},
				new BiConsumer<DLFileShortcut, Long>() {
					@Override
					public void accept(DLFileShortcut dlFileShortcut,
						Long companyId) {
						dlFileShortcut.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DLFileShortcut, Long>() {
					@Override
					public Long apply(DLFileShortcut dlFileShortcut) {
						return dlFileShortcut.getUserId();
					}
				},
				new BiConsumer<DLFileShortcut, Long>() {
					@Override
					public void accept(DLFileShortcut dlFileShortcut,
						Long userId) {
						dlFileShortcut.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DLFileShortcut, String>() {
					@Override
					public String apply(DLFileShortcut dlFileShortcut) {
						return dlFileShortcut.getUserName();
					}
				},
				new BiConsumer<DLFileShortcut, String>() {
					@Override
					public void accept(DLFileShortcut dlFileShortcut,
						String userName) {
						dlFileShortcut.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DLFileShortcut, Date>() {
					@Override
					public Date apply(DLFileShortcut dlFileShortcut) {
						return dlFileShortcut.getCreateDate();
					}
				},
				new BiConsumer<DLFileShortcut, Date>() {
					@Override
					public void accept(DLFileShortcut dlFileShortcut,
						Date createDate) {
						dlFileShortcut.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<DLFileShortcut, Date>() {
					@Override
					public Date apply(DLFileShortcut dlFileShortcut) {
						return dlFileShortcut.getModifiedDate();
					}
				},
				new BiConsumer<DLFileShortcut, Date>() {
					@Override
					public void accept(DLFileShortcut dlFileShortcut,
						Date modifiedDate) {
						dlFileShortcut.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class RepositoryIdAccessor extends ModelPropertyAccessor {
		public RepositoryIdAccessor() {
			super(new Function<DLFileShortcut, Long>() {
					@Override
					public Long apply(DLFileShortcut dlFileShortcut) {
						return dlFileShortcut.getRepositoryId();
					}
				},
				new BiConsumer<DLFileShortcut, Long>() {
					@Override
					public void accept(DLFileShortcut dlFileShortcut,
						Long repositoryId) {
						dlFileShortcut.setRepositoryId(repositoryId);
					}
				});
		}
	}

	public static class FolderIdAccessor extends ModelPropertyAccessor {
		public FolderIdAccessor() {
			super(new Function<DLFileShortcut, Long>() {
					@Override
					public Long apply(DLFileShortcut dlFileShortcut) {
						return dlFileShortcut.getFolderId();
					}
				},
				new BiConsumer<DLFileShortcut, Long>() {
					@Override
					public void accept(DLFileShortcut dlFileShortcut,
						Long folderId) {
						dlFileShortcut.setFolderId(folderId);
					}
				});
		}
	}

	public static class ToFileEntryIdAccessor extends ModelPropertyAccessor {
		public ToFileEntryIdAccessor() {
			super(new Function<DLFileShortcut, Long>() {
					@Override
					public Long apply(DLFileShortcut dlFileShortcut) {
						return dlFileShortcut.getToFileEntryId();
					}
				},
				new BiConsumer<DLFileShortcut, Long>() {
					@Override
					public void accept(DLFileShortcut dlFileShortcut,
						Long toFileEntryId) {
						dlFileShortcut.setToFileEntryId(toFileEntryId);
					}
				});
		}
	}

	public static class TreePathAccessor extends ModelPropertyAccessor {
		public TreePathAccessor() {
			super(new Function<DLFileShortcut, String>() {
					@Override
					public String apply(DLFileShortcut dlFileShortcut) {
						return dlFileShortcut.getTreePath();
					}
				},
				new BiConsumer<DLFileShortcut, String>() {
					@Override
					public void accept(DLFileShortcut dlFileShortcut,
						String treePath) {
						dlFileShortcut.setTreePath(treePath);
					}
				});
		}
	}

	public static class ActiveAccessor extends ModelPropertyAccessor {
		public ActiveAccessor() {
			super(new Function<DLFileShortcut, Boolean>() {
					@Override
					public Boolean apply(DLFileShortcut dlFileShortcut) {
						return dlFileShortcut.getActive();
					}
				},
				new BiConsumer<DLFileShortcut, Boolean>() {
					@Override
					public void accept(DLFileShortcut dlFileShortcut,
						Boolean active) {
						dlFileShortcut.setActive(active);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<DLFileShortcut, Date>() {
					@Override
					public Date apply(DLFileShortcut dlFileShortcut) {
						return dlFileShortcut.getLastPublishDate();
					}
				},
				new BiConsumer<DLFileShortcut, Date>() {
					@Override
					public void accept(DLFileShortcut dlFileShortcut,
						Date lastPublishDate) {
						dlFileShortcut.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<DLFileShortcut, Integer>() {
					@Override
					public Integer apply(DLFileShortcut dlFileShortcut) {
						return dlFileShortcut.getStatus();
					}
				},
				new BiConsumer<DLFileShortcut, Integer>() {
					@Override
					public void accept(DLFileShortcut dlFileShortcut,
						Integer status) {
						dlFileShortcut.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<DLFileShortcut, Long>() {
					@Override
					public Long apply(DLFileShortcut dlFileShortcut) {
						return dlFileShortcut.getStatusByUserId();
					}
				},
				new BiConsumer<DLFileShortcut, Long>() {
					@Override
					public void accept(DLFileShortcut dlFileShortcut,
						Long statusByUserId) {
						dlFileShortcut.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<DLFileShortcut, String>() {
					@Override
					public String apply(DLFileShortcut dlFileShortcut) {
						return dlFileShortcut.getStatusByUserName();
					}
				},
				new BiConsumer<DLFileShortcut, String>() {
					@Override
					public void accept(DLFileShortcut dlFileShortcut,
						String statusByUserName) {
						dlFileShortcut.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<DLFileShortcut, Date>() {
					@Override
					public Date apply(DLFileShortcut dlFileShortcut) {
						return dlFileShortcut.getStatusDate();
					}
				},
				new BiConsumer<DLFileShortcut, Date>() {
					@Override
					public void accept(DLFileShortcut dlFileShortcut,
						Date statusDate) {
						dlFileShortcut.setStatusDate(statusDate);
					}
				});
		}
	}

	private DLFileShortcutModelAccessors() {
	}
}