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

import com.liferay.document.library.kernel.model.DLFolder;

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
public class DLFolderModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<DLFolder, String>() {
					@Override
					public String apply(DLFolder dlFolder) {
						return dlFolder.getUuid();
					}
				},
				new BiConsumer<DLFolder, String>() {
					@Override
					public void accept(DLFolder dlFolder, String uuid) {
						dlFolder.setUuid(uuid);
					}
				});
		}
	}

	public static class FolderIdAccessor extends ModelPropertyAccessor {
		public FolderIdAccessor() {
			super(new Function<DLFolder, Long>() {
					@Override
					public Long apply(DLFolder dlFolder) {
						return dlFolder.getFolderId();
					}
				},
				new BiConsumer<DLFolder, Long>() {
					@Override
					public void accept(DLFolder dlFolder, Long folderId) {
						dlFolder.setFolderId(folderId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DLFolder, Long>() {
					@Override
					public Long apply(DLFolder dlFolder) {
						return dlFolder.getGroupId();
					}
				},
				new BiConsumer<DLFolder, Long>() {
					@Override
					public void accept(DLFolder dlFolder, Long groupId) {
						dlFolder.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DLFolder, Long>() {
					@Override
					public Long apply(DLFolder dlFolder) {
						return dlFolder.getCompanyId();
					}
				},
				new BiConsumer<DLFolder, Long>() {
					@Override
					public void accept(DLFolder dlFolder, Long companyId) {
						dlFolder.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DLFolder, Long>() {
					@Override
					public Long apply(DLFolder dlFolder) {
						return dlFolder.getUserId();
					}
				},
				new BiConsumer<DLFolder, Long>() {
					@Override
					public void accept(DLFolder dlFolder, Long userId) {
						dlFolder.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DLFolder, String>() {
					@Override
					public String apply(DLFolder dlFolder) {
						return dlFolder.getUserName();
					}
				},
				new BiConsumer<DLFolder, String>() {
					@Override
					public void accept(DLFolder dlFolder, String userName) {
						dlFolder.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DLFolder, Date>() {
					@Override
					public Date apply(DLFolder dlFolder) {
						return dlFolder.getCreateDate();
					}
				},
				new BiConsumer<DLFolder, Date>() {
					@Override
					public void accept(DLFolder dlFolder, Date createDate) {
						dlFolder.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<DLFolder, Date>() {
					@Override
					public Date apply(DLFolder dlFolder) {
						return dlFolder.getModifiedDate();
					}
				},
				new BiConsumer<DLFolder, Date>() {
					@Override
					public void accept(DLFolder dlFolder, Date modifiedDate) {
						dlFolder.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class RepositoryIdAccessor extends ModelPropertyAccessor {
		public RepositoryIdAccessor() {
			super(new Function<DLFolder, Long>() {
					@Override
					public Long apply(DLFolder dlFolder) {
						return dlFolder.getRepositoryId();
					}
				},
				new BiConsumer<DLFolder, Long>() {
					@Override
					public void accept(DLFolder dlFolder, Long repositoryId) {
						dlFolder.setRepositoryId(repositoryId);
					}
				});
		}
	}

	public static class MountPointAccessor extends ModelPropertyAccessor {
		public MountPointAccessor() {
			super(new Function<DLFolder, Boolean>() {
					@Override
					public Boolean apply(DLFolder dlFolder) {
						return dlFolder.getMountPoint();
					}
				},
				new BiConsumer<DLFolder, Boolean>() {
					@Override
					public void accept(DLFolder dlFolder, Boolean mountPoint) {
						dlFolder.setMountPoint(mountPoint);
					}
				});
		}
	}

	public static class ParentFolderIdAccessor extends ModelPropertyAccessor {
		public ParentFolderIdAccessor() {
			super(new Function<DLFolder, Long>() {
					@Override
					public Long apply(DLFolder dlFolder) {
						return dlFolder.getParentFolderId();
					}
				},
				new BiConsumer<DLFolder, Long>() {
					@Override
					public void accept(DLFolder dlFolder, Long parentFolderId) {
						dlFolder.setParentFolderId(parentFolderId);
					}
				});
		}
	}

	public static class TreePathAccessor extends ModelPropertyAccessor {
		public TreePathAccessor() {
			super(new Function<DLFolder, String>() {
					@Override
					public String apply(DLFolder dlFolder) {
						return dlFolder.getTreePath();
					}
				},
				new BiConsumer<DLFolder, String>() {
					@Override
					public void accept(DLFolder dlFolder, String treePath) {
						dlFolder.setTreePath(treePath);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<DLFolder, String>() {
					@Override
					public String apply(DLFolder dlFolder) {
						return dlFolder.getName();
					}
				},
				new BiConsumer<DLFolder, String>() {
					@Override
					public void accept(DLFolder dlFolder, String name) {
						dlFolder.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<DLFolder, String>() {
					@Override
					public String apply(DLFolder dlFolder) {
						return dlFolder.getDescription();
					}
				},
				new BiConsumer<DLFolder, String>() {
					@Override
					public void accept(DLFolder dlFolder, String description) {
						dlFolder.setDescription(description);
					}
				});
		}
	}

	public static class LastPostDateAccessor extends ModelPropertyAccessor {
		public LastPostDateAccessor() {
			super(new Function<DLFolder, Date>() {
					@Override
					public Date apply(DLFolder dlFolder) {
						return dlFolder.getLastPostDate();
					}
				},
				new BiConsumer<DLFolder, Date>() {
					@Override
					public void accept(DLFolder dlFolder, Date lastPostDate) {
						dlFolder.setLastPostDate(lastPostDate);
					}
				});
		}
	}

	public static class DefaultFileEntryTypeIdAccessor
		extends ModelPropertyAccessor {
		public DefaultFileEntryTypeIdAccessor() {
			super(new Function<DLFolder, Long>() {
					@Override
					public Long apply(DLFolder dlFolder) {
						return dlFolder.getDefaultFileEntryTypeId();
					}
				},
				new BiConsumer<DLFolder, Long>() {
					@Override
					public void accept(DLFolder dlFolder,
						Long defaultFileEntryTypeId) {
						dlFolder.setDefaultFileEntryTypeId(defaultFileEntryTypeId);
					}
				});
		}
	}

	public static class HiddenAccessor extends ModelPropertyAccessor {
		public HiddenAccessor() {
			super(new Function<DLFolder, Boolean>() {
					@Override
					public Boolean apply(DLFolder dlFolder) {
						return dlFolder.getHidden();
					}
				},
				new BiConsumer<DLFolder, Boolean>() {
					@Override
					public void accept(DLFolder dlFolder, Boolean hidden) {
						dlFolder.setHidden(hidden);
					}
				});
		}
	}

	public static class RestrictionTypeAccessor extends ModelPropertyAccessor {
		public RestrictionTypeAccessor() {
			super(new Function<DLFolder, Integer>() {
					@Override
					public Integer apply(DLFolder dlFolder) {
						return dlFolder.getRestrictionType();
					}
				},
				new BiConsumer<DLFolder, Integer>() {
					@Override
					public void accept(DLFolder dlFolder,
						Integer restrictionType) {
						dlFolder.setRestrictionType(restrictionType);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<DLFolder, Date>() {
					@Override
					public Date apply(DLFolder dlFolder) {
						return dlFolder.getLastPublishDate();
					}
				},
				new BiConsumer<DLFolder, Date>() {
					@Override
					public void accept(DLFolder dlFolder, Date lastPublishDate) {
						dlFolder.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<DLFolder, Integer>() {
					@Override
					public Integer apply(DLFolder dlFolder) {
						return dlFolder.getStatus();
					}
				},
				new BiConsumer<DLFolder, Integer>() {
					@Override
					public void accept(DLFolder dlFolder, Integer status) {
						dlFolder.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<DLFolder, Long>() {
					@Override
					public Long apply(DLFolder dlFolder) {
						return dlFolder.getStatusByUserId();
					}
				},
				new BiConsumer<DLFolder, Long>() {
					@Override
					public void accept(DLFolder dlFolder, Long statusByUserId) {
						dlFolder.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<DLFolder, String>() {
					@Override
					public String apply(DLFolder dlFolder) {
						return dlFolder.getStatusByUserName();
					}
				},
				new BiConsumer<DLFolder, String>() {
					@Override
					public void accept(DLFolder dlFolder,
						String statusByUserName) {
						dlFolder.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<DLFolder, Date>() {
					@Override
					public Date apply(DLFolder dlFolder) {
						return dlFolder.getStatusDate();
					}
				},
				new BiConsumer<DLFolder, Date>() {
					@Override
					public void accept(DLFolder dlFolder, Date statusDate) {
						dlFolder.setStatusDate(statusDate);
					}
				});
		}
	}

	private DLFolderModelAccessors() {
	}
}