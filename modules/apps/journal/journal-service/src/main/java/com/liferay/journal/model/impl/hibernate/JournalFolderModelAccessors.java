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

import com.liferay.journal.model.JournalFolder;

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
public class JournalFolderModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<JournalFolder, String>() {
					@Override
					public String apply(JournalFolder journalFolder) {
						return journalFolder.getUuid();
					}
				},
				new BiConsumer<JournalFolder, String>() {
					@Override
					public void accept(JournalFolder journalFolder, String uuid) {
						journalFolder.setUuid(uuid);
					}
				});
		}
	}

	public static class FolderIdAccessor extends ModelPropertyAccessor {
		public FolderIdAccessor() {
			super(new Function<JournalFolder, Long>() {
					@Override
					public Long apply(JournalFolder journalFolder) {
						return journalFolder.getFolderId();
					}
				},
				new BiConsumer<JournalFolder, Long>() {
					@Override
					public void accept(JournalFolder journalFolder,
						Long folderId) {
						journalFolder.setFolderId(folderId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<JournalFolder, Long>() {
					@Override
					public Long apply(JournalFolder journalFolder) {
						return journalFolder.getGroupId();
					}
				},
				new BiConsumer<JournalFolder, Long>() {
					@Override
					public void accept(JournalFolder journalFolder, Long groupId) {
						journalFolder.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<JournalFolder, Long>() {
					@Override
					public Long apply(JournalFolder journalFolder) {
						return journalFolder.getCompanyId();
					}
				},
				new BiConsumer<JournalFolder, Long>() {
					@Override
					public void accept(JournalFolder journalFolder,
						Long companyId) {
						journalFolder.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<JournalFolder, Long>() {
					@Override
					public Long apply(JournalFolder journalFolder) {
						return journalFolder.getUserId();
					}
				},
				new BiConsumer<JournalFolder, Long>() {
					@Override
					public void accept(JournalFolder journalFolder, Long userId) {
						journalFolder.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<JournalFolder, String>() {
					@Override
					public String apply(JournalFolder journalFolder) {
						return journalFolder.getUserName();
					}
				},
				new BiConsumer<JournalFolder, String>() {
					@Override
					public void accept(JournalFolder journalFolder,
						String userName) {
						journalFolder.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<JournalFolder, Date>() {
					@Override
					public Date apply(JournalFolder journalFolder) {
						return journalFolder.getCreateDate();
					}
				},
				new BiConsumer<JournalFolder, Date>() {
					@Override
					public void accept(JournalFolder journalFolder,
						Date createDate) {
						journalFolder.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<JournalFolder, Date>() {
					@Override
					public Date apply(JournalFolder journalFolder) {
						return journalFolder.getModifiedDate();
					}
				},
				new BiConsumer<JournalFolder, Date>() {
					@Override
					public void accept(JournalFolder journalFolder,
						Date modifiedDate) {
						journalFolder.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ParentFolderIdAccessor extends ModelPropertyAccessor {
		public ParentFolderIdAccessor() {
			super(new Function<JournalFolder, Long>() {
					@Override
					public Long apply(JournalFolder journalFolder) {
						return journalFolder.getParentFolderId();
					}
				},
				new BiConsumer<JournalFolder, Long>() {
					@Override
					public void accept(JournalFolder journalFolder,
						Long parentFolderId) {
						journalFolder.setParentFolderId(parentFolderId);
					}
				});
		}
	}

	public static class TreePathAccessor extends ModelPropertyAccessor {
		public TreePathAccessor() {
			super(new Function<JournalFolder, String>() {
					@Override
					public String apply(JournalFolder journalFolder) {
						return journalFolder.getTreePath();
					}
				},
				new BiConsumer<JournalFolder, String>() {
					@Override
					public void accept(JournalFolder journalFolder,
						String treePath) {
						journalFolder.setTreePath(treePath);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<JournalFolder, String>() {
					@Override
					public String apply(JournalFolder journalFolder) {
						return journalFolder.getName();
					}
				},
				new BiConsumer<JournalFolder, String>() {
					@Override
					public void accept(JournalFolder journalFolder, String name) {
						journalFolder.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<JournalFolder, String>() {
					@Override
					public String apply(JournalFolder journalFolder) {
						return journalFolder.getDescription();
					}
				},
				new BiConsumer<JournalFolder, String>() {
					@Override
					public void accept(JournalFolder journalFolder,
						String description) {
						journalFolder.setDescription(description);
					}
				});
		}
	}

	public static class RestrictionTypeAccessor extends ModelPropertyAccessor {
		public RestrictionTypeAccessor() {
			super(new Function<JournalFolder, Integer>() {
					@Override
					public Integer apply(JournalFolder journalFolder) {
						return journalFolder.getRestrictionType();
					}
				},
				new BiConsumer<JournalFolder, Integer>() {
					@Override
					public void accept(JournalFolder journalFolder,
						Integer restrictionType) {
						journalFolder.setRestrictionType(restrictionType);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<JournalFolder, Date>() {
					@Override
					public Date apply(JournalFolder journalFolder) {
						return journalFolder.getLastPublishDate();
					}
				},
				new BiConsumer<JournalFolder, Date>() {
					@Override
					public void accept(JournalFolder journalFolder,
						Date lastPublishDate) {
						journalFolder.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<JournalFolder, Integer>() {
					@Override
					public Integer apply(JournalFolder journalFolder) {
						return journalFolder.getStatus();
					}
				},
				new BiConsumer<JournalFolder, Integer>() {
					@Override
					public void accept(JournalFolder journalFolder,
						Integer status) {
						journalFolder.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<JournalFolder, Long>() {
					@Override
					public Long apply(JournalFolder journalFolder) {
						return journalFolder.getStatusByUserId();
					}
				},
				new BiConsumer<JournalFolder, Long>() {
					@Override
					public void accept(JournalFolder journalFolder,
						Long statusByUserId) {
						journalFolder.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<JournalFolder, String>() {
					@Override
					public String apply(JournalFolder journalFolder) {
						return journalFolder.getStatusByUserName();
					}
				},
				new BiConsumer<JournalFolder, String>() {
					@Override
					public void accept(JournalFolder journalFolder,
						String statusByUserName) {
						journalFolder.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<JournalFolder, Date>() {
					@Override
					public Date apply(JournalFolder journalFolder) {
						return journalFolder.getStatusDate();
					}
				},
				new BiConsumer<JournalFolder, Date>() {
					@Override
					public void accept(JournalFolder journalFolder,
						Date statusDate) {
						journalFolder.setStatusDate(statusDate);
					}
				});
		}
	}

	private JournalFolderModelAccessors() {
	}
}