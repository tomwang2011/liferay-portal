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

package com.liferay.mail.reader.model.impl.hibernate;

import com.liferay.mail.reader.model.Folder;

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
public class FolderModelAccessors {
	public static class FolderIdAccessor extends ModelPropertyAccessor {
		public FolderIdAccessor() {
			super(new Function<Folder, Long>() {
					@Override
					public Long apply(Folder folder) {
						return folder.getFolderId();
					}
				},
				new BiConsumer<Folder, Long>() {
					@Override
					public void accept(Folder folder, Long folderId) {
						folder.setFolderId(folderId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Folder, Long>() {
					@Override
					public Long apply(Folder folder) {
						return folder.getCompanyId();
					}
				},
				new BiConsumer<Folder, Long>() {
					@Override
					public void accept(Folder folder, Long companyId) {
						folder.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<Folder, Long>() {
					@Override
					public Long apply(Folder folder) {
						return folder.getUserId();
					}
				},
				new BiConsumer<Folder, Long>() {
					@Override
					public void accept(Folder folder, Long userId) {
						folder.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<Folder, String>() {
					@Override
					public String apply(Folder folder) {
						return folder.getUserName();
					}
				},
				new BiConsumer<Folder, String>() {
					@Override
					public void accept(Folder folder, String userName) {
						folder.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Folder, Date>() {
					@Override
					public Date apply(Folder folder) {
						return folder.getCreateDate();
					}
				},
				new BiConsumer<Folder, Date>() {
					@Override
					public void accept(Folder folder, Date createDate) {
						folder.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<Folder, Date>() {
					@Override
					public Date apply(Folder folder) {
						return folder.getModifiedDate();
					}
				},
				new BiConsumer<Folder, Date>() {
					@Override
					public void accept(Folder folder, Date modifiedDate) {
						folder.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class AccountIdAccessor extends ModelPropertyAccessor {
		public AccountIdAccessor() {
			super(new Function<Folder, Long>() {
					@Override
					public Long apply(Folder folder) {
						return folder.getAccountId();
					}
				},
				new BiConsumer<Folder, Long>() {
					@Override
					public void accept(Folder folder, Long accountId) {
						folder.setAccountId(accountId);
					}
				});
		}
	}

	public static class FullNameAccessor extends ModelPropertyAccessor {
		public FullNameAccessor() {
			super(new Function<Folder, String>() {
					@Override
					public String apply(Folder folder) {
						return folder.getFullName();
					}
				},
				new BiConsumer<Folder, String>() {
					@Override
					public void accept(Folder folder, String fullName) {
						folder.setFullName(fullName);
					}
				});
		}
	}

	public static class DisplayNameAccessor extends ModelPropertyAccessor {
		public DisplayNameAccessor() {
			super(new Function<Folder, String>() {
					@Override
					public String apply(Folder folder) {
						return folder.getDisplayName();
					}
				},
				new BiConsumer<Folder, String>() {
					@Override
					public void accept(Folder folder, String displayName) {
						folder.setDisplayName(displayName);
					}
				});
		}
	}

	public static class RemoteMessageCountAccessor extends ModelPropertyAccessor {
		public RemoteMessageCountAccessor() {
			super(new Function<Folder, Integer>() {
					@Override
					public Integer apply(Folder folder) {
						return folder.getRemoteMessageCount();
					}
				},
				new BiConsumer<Folder, Integer>() {
					@Override
					public void accept(Folder folder, Integer remoteMessageCount) {
						folder.setRemoteMessageCount(remoteMessageCount);
					}
				});
		}
	}

	private FolderModelAccessors() {
	}
}