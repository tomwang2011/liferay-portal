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

package com.liferay.sync.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.sync.model.SyncDLObject;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SyncDLObjectModelAccessors {
	public static class SyncDLObjectIdAccessor extends ModelPropertyAccessor {
		public SyncDLObjectIdAccessor() {
			super(new Function<SyncDLObject, Long>() {
					@Override
					public Long apply(SyncDLObject syncDLObject) {
						return syncDLObject.getSyncDLObjectId();
					}
				},
				new BiConsumer<SyncDLObject, Long>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						Long syncDLObjectId) {
						syncDLObject.setSyncDLObjectId(syncDLObjectId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<SyncDLObject, Long>() {
					@Override
					public Long apply(SyncDLObject syncDLObject) {
						return syncDLObject.getCompanyId();
					}
				},
				new BiConsumer<SyncDLObject, Long>() {
					@Override
					public void accept(SyncDLObject syncDLObject, Long companyId) {
						syncDLObject.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<SyncDLObject, Long>() {
					@Override
					public Long apply(SyncDLObject syncDLObject) {
						return syncDLObject.getUserId();
					}
				},
				new BiConsumer<SyncDLObject, Long>() {
					@Override
					public void accept(SyncDLObject syncDLObject, Long userId) {
						syncDLObject.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<SyncDLObject, String>() {
					@Override
					public String apply(SyncDLObject syncDLObject) {
						return syncDLObject.getUserName();
					}
				},
				new BiConsumer<SyncDLObject, String>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						String userName) {
						syncDLObject.setUserName(userName);
					}
				});
		}
	}

	public static class CreateTimeAccessor extends ModelPropertyAccessor {
		public CreateTimeAccessor() {
			super(new Function<SyncDLObject, Long>() {
					@Override
					public Long apply(SyncDLObject syncDLObject) {
						return syncDLObject.getCreateTime();
					}
				},
				new BiConsumer<SyncDLObject, Long>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						Long createTime) {
						syncDLObject.setCreateTime(createTime);
					}
				});
		}
	}

	public static class ModifiedTimeAccessor extends ModelPropertyAccessor {
		public ModifiedTimeAccessor() {
			super(new Function<SyncDLObject, Long>() {
					@Override
					public Long apply(SyncDLObject syncDLObject) {
						return syncDLObject.getModifiedTime();
					}
				},
				new BiConsumer<SyncDLObject, Long>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						Long modifiedTime) {
						syncDLObject.setModifiedTime(modifiedTime);
					}
				});
		}
	}

	public static class RepositoryIdAccessor extends ModelPropertyAccessor {
		public RepositoryIdAccessor() {
			super(new Function<SyncDLObject, Long>() {
					@Override
					public Long apply(SyncDLObject syncDLObject) {
						return syncDLObject.getRepositoryId();
					}
				},
				new BiConsumer<SyncDLObject, Long>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						Long repositoryId) {
						syncDLObject.setRepositoryId(repositoryId);
					}
				});
		}
	}

	public static class ParentFolderIdAccessor extends ModelPropertyAccessor {
		public ParentFolderIdAccessor() {
			super(new Function<SyncDLObject, Long>() {
					@Override
					public Long apply(SyncDLObject syncDLObject) {
						return syncDLObject.getParentFolderId();
					}
				},
				new BiConsumer<SyncDLObject, Long>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						Long parentFolderId) {
						syncDLObject.setParentFolderId(parentFolderId);
					}
				});
		}
	}

	public static class TreePathAccessor extends ModelPropertyAccessor {
		public TreePathAccessor() {
			super(new Function<SyncDLObject, String>() {
					@Override
					public String apply(SyncDLObject syncDLObject) {
						return syncDLObject.getTreePath();
					}
				},
				new BiConsumer<SyncDLObject, String>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						String treePath) {
						syncDLObject.setTreePath(treePath);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<SyncDLObject, String>() {
					@Override
					public String apply(SyncDLObject syncDLObject) {
						return syncDLObject.getName();
					}
				},
				new BiConsumer<SyncDLObject, String>() {
					@Override
					public void accept(SyncDLObject syncDLObject, String name) {
						syncDLObject.setName(name);
					}
				});
		}
	}

	public static class ExtensionAccessor extends ModelPropertyAccessor {
		public ExtensionAccessor() {
			super(new Function<SyncDLObject, String>() {
					@Override
					public String apply(SyncDLObject syncDLObject) {
						return syncDLObject.getExtension();
					}
				},
				new BiConsumer<SyncDLObject, String>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						String extension) {
						syncDLObject.setExtension(extension);
					}
				});
		}
	}

	public static class MimeTypeAccessor extends ModelPropertyAccessor {
		public MimeTypeAccessor() {
			super(new Function<SyncDLObject, String>() {
					@Override
					public String apply(SyncDLObject syncDLObject) {
						return syncDLObject.getMimeType();
					}
				},
				new BiConsumer<SyncDLObject, String>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						String mimeType) {
						syncDLObject.setMimeType(mimeType);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<SyncDLObject, String>() {
					@Override
					public String apply(SyncDLObject syncDLObject) {
						return syncDLObject.getDescription();
					}
				},
				new BiConsumer<SyncDLObject, String>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						String description) {
						syncDLObject.setDescription(description);
					}
				});
		}
	}

	public static class ChangeLogAccessor extends ModelPropertyAccessor {
		public ChangeLogAccessor() {
			super(new Function<SyncDLObject, String>() {
					@Override
					public String apply(SyncDLObject syncDLObject) {
						return syncDLObject.getChangeLog();
					}
				},
				new BiConsumer<SyncDLObject, String>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						String changeLog) {
						syncDLObject.setChangeLog(changeLog);
					}
				});
		}
	}

	public static class ExtraSettingsAccessor extends ModelPropertyAccessor {
		public ExtraSettingsAccessor() {
			super(new Function<SyncDLObject, String>() {
					@Override
					public String apply(SyncDLObject syncDLObject) {
						return syncDLObject.getExtraSettings();
					}
				},
				new BiConsumer<SyncDLObject, String>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						String extraSettings) {
						syncDLObject.setExtraSettings(extraSettings);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<SyncDLObject, String>() {
					@Override
					public String apply(SyncDLObject syncDLObject) {
						return syncDLObject.getVersion();
					}
				},
				new BiConsumer<SyncDLObject, String>() {
					@Override
					public void accept(SyncDLObject syncDLObject, String version) {
						syncDLObject.setVersion(version);
					}
				});
		}
	}

	public static class VersionIdAccessor extends ModelPropertyAccessor {
		public VersionIdAccessor() {
			super(new Function<SyncDLObject, Long>() {
					@Override
					public Long apply(SyncDLObject syncDLObject) {
						return syncDLObject.getVersionId();
					}
				},
				new BiConsumer<SyncDLObject, Long>() {
					@Override
					public void accept(SyncDLObject syncDLObject, Long versionId) {
						syncDLObject.setVersionId(versionId);
					}
				});
		}
	}

	public static class SizeAccessor extends ModelPropertyAccessor {
		public SizeAccessor() {
			super(new Function<SyncDLObject, Long>() {
					@Override
					public Long apply(SyncDLObject syncDLObject) {
						return syncDLObject.getSize();
					}
				},
				new BiConsumer<SyncDLObject, Long>() {
					@Override
					public void accept(SyncDLObject syncDLObject, Long size) {
						syncDLObject.setSize(size);
					}
				});
		}
	}

	public static class ChecksumAccessor extends ModelPropertyAccessor {
		public ChecksumAccessor() {
			super(new Function<SyncDLObject, String>() {
					@Override
					public String apply(SyncDLObject syncDLObject) {
						return syncDLObject.getChecksum();
					}
				},
				new BiConsumer<SyncDLObject, String>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						String checksum) {
						syncDLObject.setChecksum(checksum);
					}
				});
		}
	}

	public static class EventAccessor extends ModelPropertyAccessor {
		public EventAccessor() {
			super(new Function<SyncDLObject, String>() {
					@Override
					public String apply(SyncDLObject syncDLObject) {
						return syncDLObject.getEvent();
					}
				},
				new BiConsumer<SyncDLObject, String>() {
					@Override
					public void accept(SyncDLObject syncDLObject, String event) {
						syncDLObject.setEvent(event);
					}
				});
		}
	}

	public static class LanTokenKeyAccessor extends ModelPropertyAccessor {
		public LanTokenKeyAccessor() {
			super(new Function<SyncDLObject, String>() {
					@Override
					public String apply(SyncDLObject syncDLObject) {
						return syncDLObject.getLanTokenKey();
					}
				},
				new BiConsumer<SyncDLObject, String>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						String lanTokenKey) {
						syncDLObject.setLanTokenKey(lanTokenKey);
					}
				});
		}
	}

	public static class LastPermissionChangeDateAccessor
		extends ModelPropertyAccessor {
		public LastPermissionChangeDateAccessor() {
			super(new Function<SyncDLObject, Date>() {
					@Override
					public Date apply(SyncDLObject syncDLObject) {
						return syncDLObject.getLastPermissionChangeDate();
					}
				},
				new BiConsumer<SyncDLObject, Date>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						Date lastPermissionChangeDate) {
						syncDLObject.setLastPermissionChangeDate(lastPermissionChangeDate);
					}
				});
		}
	}

	public static class LockExpirationDateAccessor extends ModelPropertyAccessor {
		public LockExpirationDateAccessor() {
			super(new Function<SyncDLObject, Date>() {
					@Override
					public Date apply(SyncDLObject syncDLObject) {
						return syncDLObject.getLockExpirationDate();
					}
				},
				new BiConsumer<SyncDLObject, Date>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						Date lockExpirationDate) {
						syncDLObject.setLockExpirationDate(lockExpirationDate);
					}
				});
		}
	}

	public static class LockUserIdAccessor extends ModelPropertyAccessor {
		public LockUserIdAccessor() {
			super(new Function<SyncDLObject, Long>() {
					@Override
					public Long apply(SyncDLObject syncDLObject) {
						return syncDLObject.getLockUserId();
					}
				},
				new BiConsumer<SyncDLObject, Long>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						Long lockUserId) {
						syncDLObject.setLockUserId(lockUserId);
					}
				});
		}
	}

	public static class LockUserNameAccessor extends ModelPropertyAccessor {
		public LockUserNameAccessor() {
			super(new Function<SyncDLObject, String>() {
					@Override
					public String apply(SyncDLObject syncDLObject) {
						return syncDLObject.getLockUserName();
					}
				},
				new BiConsumer<SyncDLObject, String>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						String lockUserName) {
						syncDLObject.setLockUserName(lockUserName);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<SyncDLObject, String>() {
					@Override
					public String apply(SyncDLObject syncDLObject) {
						return syncDLObject.getType();
					}
				},
				new BiConsumer<SyncDLObject, String>() {
					@Override
					public void accept(SyncDLObject syncDLObject, String type) {
						syncDLObject.setType(type);
					}
				});
		}
	}

	public static class TypePKAccessor extends ModelPropertyAccessor {
		public TypePKAccessor() {
			super(new Function<SyncDLObject, Long>() {
					@Override
					public Long apply(SyncDLObject syncDLObject) {
						return syncDLObject.getTypePK();
					}
				},
				new BiConsumer<SyncDLObject, Long>() {
					@Override
					public void accept(SyncDLObject syncDLObject, Long typePK) {
						syncDLObject.setTypePK(typePK);
					}
				});
		}
	}

	public static class TypeUuidAccessor extends ModelPropertyAccessor {
		public TypeUuidAccessor() {
			super(new Function<SyncDLObject, String>() {
					@Override
					public String apply(SyncDLObject syncDLObject) {
						return syncDLObject.getTypeUuid();
					}
				},
				new BiConsumer<SyncDLObject, String>() {
					@Override
					public void accept(SyncDLObject syncDLObject,
						String typeUuid) {
						syncDLObject.setTypeUuid(typeUuid);
					}
				});
		}
	}

	private SyncDLObjectModelAccessors() {
	}
}