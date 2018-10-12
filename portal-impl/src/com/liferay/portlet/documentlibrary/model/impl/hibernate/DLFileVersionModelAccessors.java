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

import com.liferay.document.library.kernel.model.DLFileVersion;

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
public class DLFileVersionModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<DLFileVersion, String>() {
					@Override
					public String apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getUuid();
					}
				},
				new BiConsumer<DLFileVersion, String>() {
					@Override
					public void accept(DLFileVersion dlFileVersion, String uuid) {
						dlFileVersion.setUuid(uuid);
					}
				});
		}
	}

	public static class FileVersionIdAccessor extends ModelPropertyAccessor {
		public FileVersionIdAccessor() {
			super(new Function<DLFileVersion, Long>() {
					@Override
					public Long apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getFileVersionId();
					}
				},
				new BiConsumer<DLFileVersion, Long>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						Long fileVersionId) {
						dlFileVersion.setFileVersionId(fileVersionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DLFileVersion, Long>() {
					@Override
					public Long apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getGroupId();
					}
				},
				new BiConsumer<DLFileVersion, Long>() {
					@Override
					public void accept(DLFileVersion dlFileVersion, Long groupId) {
						dlFileVersion.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DLFileVersion, Long>() {
					@Override
					public Long apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getCompanyId();
					}
				},
				new BiConsumer<DLFileVersion, Long>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						Long companyId) {
						dlFileVersion.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DLFileVersion, Long>() {
					@Override
					public Long apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getUserId();
					}
				},
				new BiConsumer<DLFileVersion, Long>() {
					@Override
					public void accept(DLFileVersion dlFileVersion, Long userId) {
						dlFileVersion.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DLFileVersion, String>() {
					@Override
					public String apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getUserName();
					}
				},
				new BiConsumer<DLFileVersion, String>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						String userName) {
						dlFileVersion.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DLFileVersion, Date>() {
					@Override
					public Date apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getCreateDate();
					}
				},
				new BiConsumer<DLFileVersion, Date>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						Date createDate) {
						dlFileVersion.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<DLFileVersion, Date>() {
					@Override
					public Date apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getModifiedDate();
					}
				},
				new BiConsumer<DLFileVersion, Date>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						Date modifiedDate) {
						dlFileVersion.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class RepositoryIdAccessor extends ModelPropertyAccessor {
		public RepositoryIdAccessor() {
			super(new Function<DLFileVersion, Long>() {
					@Override
					public Long apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getRepositoryId();
					}
				},
				new BiConsumer<DLFileVersion, Long>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						Long repositoryId) {
						dlFileVersion.setRepositoryId(repositoryId);
					}
				});
		}
	}

	public static class FolderIdAccessor extends ModelPropertyAccessor {
		public FolderIdAccessor() {
			super(new Function<DLFileVersion, Long>() {
					@Override
					public Long apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getFolderId();
					}
				},
				new BiConsumer<DLFileVersion, Long>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						Long folderId) {
						dlFileVersion.setFolderId(folderId);
					}
				});
		}
	}

	public static class FileEntryIdAccessor extends ModelPropertyAccessor {
		public FileEntryIdAccessor() {
			super(new Function<DLFileVersion, Long>() {
					@Override
					public Long apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getFileEntryId();
					}
				},
				new BiConsumer<DLFileVersion, Long>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						Long fileEntryId) {
						dlFileVersion.setFileEntryId(fileEntryId);
					}
				});
		}
	}

	public static class TreePathAccessor extends ModelPropertyAccessor {
		public TreePathAccessor() {
			super(new Function<DLFileVersion, String>() {
					@Override
					public String apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getTreePath();
					}
				},
				new BiConsumer<DLFileVersion, String>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						String treePath) {
						dlFileVersion.setTreePath(treePath);
					}
				});
		}
	}

	public static class FileNameAccessor extends ModelPropertyAccessor {
		public FileNameAccessor() {
			super(new Function<DLFileVersion, String>() {
					@Override
					public String apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getFileName();
					}
				},
				new BiConsumer<DLFileVersion, String>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						String fileName) {
						dlFileVersion.setFileName(fileName);
					}
				});
		}
	}

	public static class ExtensionAccessor extends ModelPropertyAccessor {
		public ExtensionAccessor() {
			super(new Function<DLFileVersion, String>() {
					@Override
					public String apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getExtension();
					}
				},
				new BiConsumer<DLFileVersion, String>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						String extension) {
						dlFileVersion.setExtension(extension);
					}
				});
		}
	}

	public static class MimeTypeAccessor extends ModelPropertyAccessor {
		public MimeTypeAccessor() {
			super(new Function<DLFileVersion, String>() {
					@Override
					public String apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getMimeType();
					}
				},
				new BiConsumer<DLFileVersion, String>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						String mimeType) {
						dlFileVersion.setMimeType(mimeType);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<DLFileVersion, String>() {
					@Override
					public String apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getTitle();
					}
				},
				new BiConsumer<DLFileVersion, String>() {
					@Override
					public void accept(DLFileVersion dlFileVersion, String title) {
						dlFileVersion.setTitle(title);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<DLFileVersion, String>() {
					@Override
					public String apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getDescription();
					}
				},
				new BiConsumer<DLFileVersion, String>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						String description) {
						dlFileVersion.setDescription(description);
					}
				});
		}
	}

	public static class ChangeLogAccessor extends ModelPropertyAccessor {
		public ChangeLogAccessor() {
			super(new Function<DLFileVersion, String>() {
					@Override
					public String apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getChangeLog();
					}
				},
				new BiConsumer<DLFileVersion, String>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						String changeLog) {
						dlFileVersion.setChangeLog(changeLog);
					}
				});
		}
	}

	public static class ExtraSettingsAccessor extends ModelPropertyAccessor {
		public ExtraSettingsAccessor() {
			super(new Function<DLFileVersion, String>() {
					@Override
					public String apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getExtraSettings();
					}
				},
				new BiConsumer<DLFileVersion, String>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						String extraSettings) {
						dlFileVersion.setExtraSettings(extraSettings);
					}
				});
		}
	}

	public static class FileEntryTypeIdAccessor extends ModelPropertyAccessor {
		public FileEntryTypeIdAccessor() {
			super(new Function<DLFileVersion, Long>() {
					@Override
					public Long apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getFileEntryTypeId();
					}
				},
				new BiConsumer<DLFileVersion, Long>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						Long fileEntryTypeId) {
						dlFileVersion.setFileEntryTypeId(fileEntryTypeId);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<DLFileVersion, String>() {
					@Override
					public String apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getVersion();
					}
				},
				new BiConsumer<DLFileVersion, String>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						String version) {
						dlFileVersion.setVersion(version);
					}
				});
		}
	}

	public static class SizeAccessor extends ModelPropertyAccessor {
		public SizeAccessor() {
			super(new Function<DLFileVersion, Long>() {
					@Override
					public Long apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getSize();
					}
				},
				new BiConsumer<DLFileVersion, Long>() {
					@Override
					public void accept(DLFileVersion dlFileVersion, Long size) {
						dlFileVersion.setSize(size);
					}
				});
		}
	}

	public static class ChecksumAccessor extends ModelPropertyAccessor {
		public ChecksumAccessor() {
			super(new Function<DLFileVersion, String>() {
					@Override
					public String apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getChecksum();
					}
				},
				new BiConsumer<DLFileVersion, String>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						String checksum) {
						dlFileVersion.setChecksum(checksum);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<DLFileVersion, Date>() {
					@Override
					public Date apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getLastPublishDate();
					}
				},
				new BiConsumer<DLFileVersion, Date>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						Date lastPublishDate) {
						dlFileVersion.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<DLFileVersion, Integer>() {
					@Override
					public Integer apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getStatus();
					}
				},
				new BiConsumer<DLFileVersion, Integer>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						Integer status) {
						dlFileVersion.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<DLFileVersion, Long>() {
					@Override
					public Long apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getStatusByUserId();
					}
				},
				new BiConsumer<DLFileVersion, Long>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						Long statusByUserId) {
						dlFileVersion.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<DLFileVersion, String>() {
					@Override
					public String apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getStatusByUserName();
					}
				},
				new BiConsumer<DLFileVersion, String>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						String statusByUserName) {
						dlFileVersion.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<DLFileVersion, Date>() {
					@Override
					public Date apply(DLFileVersion dlFileVersion) {
						return dlFileVersion.getStatusDate();
					}
				},
				new BiConsumer<DLFileVersion, Date>() {
					@Override
					public void accept(DLFileVersion dlFileVersion,
						Date statusDate) {
						dlFileVersion.setStatusDate(statusDate);
					}
				});
		}
	}

	private DLFileVersionModelAccessors() {
	}
}