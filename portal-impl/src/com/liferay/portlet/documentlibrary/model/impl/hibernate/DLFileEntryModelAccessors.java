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

import com.liferay.document.library.kernel.model.DLFileEntry;

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
public class DLFileEntryModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<DLFileEntry, String>() {
					@Override
					public String apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getUuid();
					}
				},
				new BiConsumer<DLFileEntry, String>() {
					@Override
					public void accept(DLFileEntry dlFileEntry, String uuid) {
						dlFileEntry.setUuid(uuid);
					}
				});
		}
	}

	public static class FileEntryIdAccessor extends ModelPropertyAccessor {
		public FileEntryIdAccessor() {
			super(new Function<DLFileEntry, Long>() {
					@Override
					public Long apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getFileEntryId();
					}
				},
				new BiConsumer<DLFileEntry, Long>() {
					@Override
					public void accept(DLFileEntry dlFileEntry, Long fileEntryId) {
						dlFileEntry.setFileEntryId(fileEntryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DLFileEntry, Long>() {
					@Override
					public Long apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getGroupId();
					}
				},
				new BiConsumer<DLFileEntry, Long>() {
					@Override
					public void accept(DLFileEntry dlFileEntry, Long groupId) {
						dlFileEntry.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DLFileEntry, Long>() {
					@Override
					public Long apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getCompanyId();
					}
				},
				new BiConsumer<DLFileEntry, Long>() {
					@Override
					public void accept(DLFileEntry dlFileEntry, Long companyId) {
						dlFileEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DLFileEntry, Long>() {
					@Override
					public Long apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getUserId();
					}
				},
				new BiConsumer<DLFileEntry, Long>() {
					@Override
					public void accept(DLFileEntry dlFileEntry, Long userId) {
						dlFileEntry.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DLFileEntry, String>() {
					@Override
					public String apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getUserName();
					}
				},
				new BiConsumer<DLFileEntry, String>() {
					@Override
					public void accept(DLFileEntry dlFileEntry, String userName) {
						dlFileEntry.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DLFileEntry, Date>() {
					@Override
					public Date apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getCreateDate();
					}
				},
				new BiConsumer<DLFileEntry, Date>() {
					@Override
					public void accept(DLFileEntry dlFileEntry, Date createDate) {
						dlFileEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<DLFileEntry, Date>() {
					@Override
					public Date apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getModifiedDate();
					}
				},
				new BiConsumer<DLFileEntry, Date>() {
					@Override
					public void accept(DLFileEntry dlFileEntry,
						Date modifiedDate) {
						dlFileEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<DLFileEntry, Long>() {
					@Override
					public Long apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getClassNameId();
					}
				},
				new BiConsumer<DLFileEntry, Long>() {
					@Override
					public void accept(DLFileEntry dlFileEntry, Long classNameId) {
						dlFileEntry.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<DLFileEntry, Long>() {
					@Override
					public Long apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getClassPK();
					}
				},
				new BiConsumer<DLFileEntry, Long>() {
					@Override
					public void accept(DLFileEntry dlFileEntry, Long classPK) {
						dlFileEntry.setClassPK(classPK);
					}
				});
		}
	}

	public static class RepositoryIdAccessor extends ModelPropertyAccessor {
		public RepositoryIdAccessor() {
			super(new Function<DLFileEntry, Long>() {
					@Override
					public Long apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getRepositoryId();
					}
				},
				new BiConsumer<DLFileEntry, Long>() {
					@Override
					public void accept(DLFileEntry dlFileEntry,
						Long repositoryId) {
						dlFileEntry.setRepositoryId(repositoryId);
					}
				});
		}
	}

	public static class FolderIdAccessor extends ModelPropertyAccessor {
		public FolderIdAccessor() {
			super(new Function<DLFileEntry, Long>() {
					@Override
					public Long apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getFolderId();
					}
				},
				new BiConsumer<DLFileEntry, Long>() {
					@Override
					public void accept(DLFileEntry dlFileEntry, Long folderId) {
						dlFileEntry.setFolderId(folderId);
					}
				});
		}
	}

	public static class TreePathAccessor extends ModelPropertyAccessor {
		public TreePathAccessor() {
			super(new Function<DLFileEntry, String>() {
					@Override
					public String apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getTreePath();
					}
				},
				new BiConsumer<DLFileEntry, String>() {
					@Override
					public void accept(DLFileEntry dlFileEntry, String treePath) {
						dlFileEntry.setTreePath(treePath);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<DLFileEntry, String>() {
					@Override
					public String apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getName();
					}
				},
				new BiConsumer<DLFileEntry, String>() {
					@Override
					public void accept(DLFileEntry dlFileEntry, String name) {
						dlFileEntry.setName(name);
					}
				});
		}
	}

	public static class FileNameAccessor extends ModelPropertyAccessor {
		public FileNameAccessor() {
			super(new Function<DLFileEntry, String>() {
					@Override
					public String apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getFileName();
					}
				},
				new BiConsumer<DLFileEntry, String>() {
					@Override
					public void accept(DLFileEntry dlFileEntry, String fileName) {
						dlFileEntry.setFileName(fileName);
					}
				});
		}
	}

	public static class ExtensionAccessor extends ModelPropertyAccessor {
		public ExtensionAccessor() {
			super(new Function<DLFileEntry, String>() {
					@Override
					public String apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getExtension();
					}
				},
				new BiConsumer<DLFileEntry, String>() {
					@Override
					public void accept(DLFileEntry dlFileEntry, String extension) {
						dlFileEntry.setExtension(extension);
					}
				});
		}
	}

	public static class MimeTypeAccessor extends ModelPropertyAccessor {
		public MimeTypeAccessor() {
			super(new Function<DLFileEntry, String>() {
					@Override
					public String apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getMimeType();
					}
				},
				new BiConsumer<DLFileEntry, String>() {
					@Override
					public void accept(DLFileEntry dlFileEntry, String mimeType) {
						dlFileEntry.setMimeType(mimeType);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<DLFileEntry, String>() {
					@Override
					public String apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getTitle();
					}
				},
				new BiConsumer<DLFileEntry, String>() {
					@Override
					public void accept(DLFileEntry dlFileEntry, String title) {
						dlFileEntry.setTitle(title);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<DLFileEntry, String>() {
					@Override
					public String apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getDescription();
					}
				},
				new BiConsumer<DLFileEntry, String>() {
					@Override
					public void accept(DLFileEntry dlFileEntry,
						String description) {
						dlFileEntry.setDescription(description);
					}
				});
		}
	}

	public static class ExtraSettingsAccessor extends ModelPropertyAccessor {
		public ExtraSettingsAccessor() {
			super(new Function<DLFileEntry, String>() {
					@Override
					public String apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getExtraSettings();
					}
				},
				new BiConsumer<DLFileEntry, String>() {
					@Override
					public void accept(DLFileEntry dlFileEntry,
						String extraSettings) {
						dlFileEntry.setExtraSettings(extraSettings);
					}
				});
		}
	}

	public static class FileEntryTypeIdAccessor extends ModelPropertyAccessor {
		public FileEntryTypeIdAccessor() {
			super(new Function<DLFileEntry, Long>() {
					@Override
					public Long apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getFileEntryTypeId();
					}
				},
				new BiConsumer<DLFileEntry, Long>() {
					@Override
					public void accept(DLFileEntry dlFileEntry,
						Long fileEntryTypeId) {
						dlFileEntry.setFileEntryTypeId(fileEntryTypeId);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<DLFileEntry, String>() {
					@Override
					public String apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getVersion();
					}
				},
				new BiConsumer<DLFileEntry, String>() {
					@Override
					public void accept(DLFileEntry dlFileEntry, String version) {
						dlFileEntry.setVersion(version);
					}
				});
		}
	}

	public static class SizeAccessor extends ModelPropertyAccessor {
		public SizeAccessor() {
			super(new Function<DLFileEntry, Long>() {
					@Override
					public Long apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getSize();
					}
				},
				new BiConsumer<DLFileEntry, Long>() {
					@Override
					public void accept(DLFileEntry dlFileEntry, Long size) {
						dlFileEntry.setSize(size);
					}
				});
		}
	}

	public static class ReadCountAccessor extends ModelPropertyAccessor {
		public ReadCountAccessor() {
			super(new Function<DLFileEntry, Integer>() {
					@Override
					public Integer apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getReadCount();
					}
				},
				new BiConsumer<DLFileEntry, Integer>() {
					@Override
					public void accept(DLFileEntry dlFileEntry,
						Integer readCount) {
						dlFileEntry.setReadCount(readCount);
					}
				});
		}
	}

	public static class SmallImageIdAccessor extends ModelPropertyAccessor {
		public SmallImageIdAccessor() {
			super(new Function<DLFileEntry, Long>() {
					@Override
					public Long apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getSmallImageId();
					}
				},
				new BiConsumer<DLFileEntry, Long>() {
					@Override
					public void accept(DLFileEntry dlFileEntry,
						Long smallImageId) {
						dlFileEntry.setSmallImageId(smallImageId);
					}
				});
		}
	}

	public static class LargeImageIdAccessor extends ModelPropertyAccessor {
		public LargeImageIdAccessor() {
			super(new Function<DLFileEntry, Long>() {
					@Override
					public Long apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getLargeImageId();
					}
				},
				new BiConsumer<DLFileEntry, Long>() {
					@Override
					public void accept(DLFileEntry dlFileEntry,
						Long largeImageId) {
						dlFileEntry.setLargeImageId(largeImageId);
					}
				});
		}
	}

	public static class Custom1ImageIdAccessor extends ModelPropertyAccessor {
		public Custom1ImageIdAccessor() {
			super(new Function<DLFileEntry, Long>() {
					@Override
					public Long apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getCustom1ImageId();
					}
				},
				new BiConsumer<DLFileEntry, Long>() {
					@Override
					public void accept(DLFileEntry dlFileEntry,
						Long custom1ImageId) {
						dlFileEntry.setCustom1ImageId(custom1ImageId);
					}
				});
		}
	}

	public static class Custom2ImageIdAccessor extends ModelPropertyAccessor {
		public Custom2ImageIdAccessor() {
			super(new Function<DLFileEntry, Long>() {
					@Override
					public Long apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getCustom2ImageId();
					}
				},
				new BiConsumer<DLFileEntry, Long>() {
					@Override
					public void accept(DLFileEntry dlFileEntry,
						Long custom2ImageId) {
						dlFileEntry.setCustom2ImageId(custom2ImageId);
					}
				});
		}
	}

	public static class ManualCheckInRequiredAccessor
		extends ModelPropertyAccessor {
		public ManualCheckInRequiredAccessor() {
			super(new Function<DLFileEntry, Boolean>() {
					@Override
					public Boolean apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getManualCheckInRequired();
					}
				},
				new BiConsumer<DLFileEntry, Boolean>() {
					@Override
					public void accept(DLFileEntry dlFileEntry,
						Boolean manualCheckInRequired) {
						dlFileEntry.setManualCheckInRequired(manualCheckInRequired);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<DLFileEntry, Date>() {
					@Override
					public Date apply(DLFileEntry dlFileEntry) {
						return dlFileEntry.getLastPublishDate();
					}
				},
				new BiConsumer<DLFileEntry, Date>() {
					@Override
					public void accept(DLFileEntry dlFileEntry,
						Date lastPublishDate) {
						dlFileEntry.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private DLFileEntryModelAccessors() {
	}
}