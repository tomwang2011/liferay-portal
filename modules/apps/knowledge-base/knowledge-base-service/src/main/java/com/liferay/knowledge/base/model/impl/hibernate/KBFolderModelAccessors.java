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

package com.liferay.knowledge.base.model.impl.hibernate;

import com.liferay.knowledge.base.model.KBFolder;

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
public class KBFolderModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<KBFolder, String>() {
					@Override
					public String apply(KBFolder kbFolder) {
						return kbFolder.getUuid();
					}
				},
				new BiConsumer<KBFolder, String>() {
					@Override
					public void accept(KBFolder kbFolder, String uuid) {
						kbFolder.setUuid(uuid);
					}
				});
		}
	}

	public static class KbFolderIdAccessor extends ModelPropertyAccessor {
		public KbFolderIdAccessor() {
			super(new Function<KBFolder, Long>() {
					@Override
					public Long apply(KBFolder kbFolder) {
						return kbFolder.getKbFolderId();
					}
				},
				new BiConsumer<KBFolder, Long>() {
					@Override
					public void accept(KBFolder kbFolder, Long kbFolderId) {
						kbFolder.setKbFolderId(kbFolderId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KBFolder, Long>() {
					@Override
					public Long apply(KBFolder kbFolder) {
						return kbFolder.getGroupId();
					}
				},
				new BiConsumer<KBFolder, Long>() {
					@Override
					public void accept(KBFolder kbFolder, Long groupId) {
						kbFolder.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KBFolder, Long>() {
					@Override
					public Long apply(KBFolder kbFolder) {
						return kbFolder.getCompanyId();
					}
				},
				new BiConsumer<KBFolder, Long>() {
					@Override
					public void accept(KBFolder kbFolder, Long companyId) {
						kbFolder.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KBFolder, Long>() {
					@Override
					public Long apply(KBFolder kbFolder) {
						return kbFolder.getUserId();
					}
				},
				new BiConsumer<KBFolder, Long>() {
					@Override
					public void accept(KBFolder kbFolder, Long userId) {
						kbFolder.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KBFolder, String>() {
					@Override
					public String apply(KBFolder kbFolder) {
						return kbFolder.getUserName();
					}
				},
				new BiConsumer<KBFolder, String>() {
					@Override
					public void accept(KBFolder kbFolder, String userName) {
						kbFolder.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KBFolder, Date>() {
					@Override
					public Date apply(KBFolder kbFolder) {
						return kbFolder.getCreateDate();
					}
				},
				new BiConsumer<KBFolder, Date>() {
					@Override
					public void accept(KBFolder kbFolder, Date createDate) {
						kbFolder.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KBFolder, Date>() {
					@Override
					public Date apply(KBFolder kbFolder) {
						return kbFolder.getModifiedDate();
					}
				},
				new BiConsumer<KBFolder, Date>() {
					@Override
					public void accept(KBFolder kbFolder, Date modifiedDate) {
						kbFolder.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ParentKBFolderIdAccessor extends ModelPropertyAccessor {
		public ParentKBFolderIdAccessor() {
			super(new Function<KBFolder, Long>() {
					@Override
					public Long apply(KBFolder kbFolder) {
						return kbFolder.getParentKBFolderId();
					}
				},
				new BiConsumer<KBFolder, Long>() {
					@Override
					public void accept(KBFolder kbFolder, Long parentKBFolderId) {
						kbFolder.setParentKBFolderId(parentKBFolderId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<KBFolder, String>() {
					@Override
					public String apply(KBFolder kbFolder) {
						return kbFolder.getName();
					}
				},
				new BiConsumer<KBFolder, String>() {
					@Override
					public void accept(KBFolder kbFolder, String name) {
						kbFolder.setName(name);
					}
				});
		}
	}

	public static class UrlTitleAccessor extends ModelPropertyAccessor {
		public UrlTitleAccessor() {
			super(new Function<KBFolder, String>() {
					@Override
					public String apply(KBFolder kbFolder) {
						return kbFolder.getUrlTitle();
					}
				},
				new BiConsumer<KBFolder, String>() {
					@Override
					public void accept(KBFolder kbFolder, String urlTitle) {
						kbFolder.setUrlTitle(urlTitle);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<KBFolder, String>() {
					@Override
					public String apply(KBFolder kbFolder) {
						return kbFolder.getDescription();
					}
				},
				new BiConsumer<KBFolder, String>() {
					@Override
					public void accept(KBFolder kbFolder, String description) {
						kbFolder.setDescription(description);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<KBFolder, Date>() {
					@Override
					public Date apply(KBFolder kbFolder) {
						return kbFolder.getLastPublishDate();
					}
				},
				new BiConsumer<KBFolder, Date>() {
					@Override
					public void accept(KBFolder kbFolder, Date lastPublishDate) {
						kbFolder.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private KBFolderModelAccessors() {
	}
}