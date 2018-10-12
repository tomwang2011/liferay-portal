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

package com.liferay.document.library.opener.model.impl.hibernate;

import com.liferay.document.library.opener.model.DLOpenerFileEntryReference;

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
public class DLOpenerFileEntryReferenceModelAccessors {
	public static class DlOpenerFileEntryReferenceIdAccessor
		extends ModelPropertyAccessor {
		public DlOpenerFileEntryReferenceIdAccessor() {
			super(new Function<DLOpenerFileEntryReference, Long>() {
					@Override
					public Long apply(
						DLOpenerFileEntryReference dlOpenerFileEntryReference) {
						return dlOpenerFileEntryReference.getDlOpenerFileEntryReferenceId();
					}
				},
				new BiConsumer<DLOpenerFileEntryReference, Long>() {
					@Override
					public void accept(
						DLOpenerFileEntryReference dlOpenerFileEntryReference,
						Long dlOpenerFileEntryReferenceId) {
						dlOpenerFileEntryReference.setDlOpenerFileEntryReferenceId(dlOpenerFileEntryReferenceId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DLOpenerFileEntryReference, Long>() {
					@Override
					public Long apply(
						DLOpenerFileEntryReference dlOpenerFileEntryReference) {
						return dlOpenerFileEntryReference.getGroupId();
					}
				},
				new BiConsumer<DLOpenerFileEntryReference, Long>() {
					@Override
					public void accept(
						DLOpenerFileEntryReference dlOpenerFileEntryReference,
						Long groupId) {
						dlOpenerFileEntryReference.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DLOpenerFileEntryReference, Long>() {
					@Override
					public Long apply(
						DLOpenerFileEntryReference dlOpenerFileEntryReference) {
						return dlOpenerFileEntryReference.getCompanyId();
					}
				},
				new BiConsumer<DLOpenerFileEntryReference, Long>() {
					@Override
					public void accept(
						DLOpenerFileEntryReference dlOpenerFileEntryReference,
						Long companyId) {
						dlOpenerFileEntryReference.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DLOpenerFileEntryReference, Long>() {
					@Override
					public Long apply(
						DLOpenerFileEntryReference dlOpenerFileEntryReference) {
						return dlOpenerFileEntryReference.getUserId();
					}
				},
				new BiConsumer<DLOpenerFileEntryReference, Long>() {
					@Override
					public void accept(
						DLOpenerFileEntryReference dlOpenerFileEntryReference,
						Long userId) {
						dlOpenerFileEntryReference.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<DLOpenerFileEntryReference, String>() {
					@Override
					public String apply(
						DLOpenerFileEntryReference dlOpenerFileEntryReference) {
						return dlOpenerFileEntryReference.getUserName();
					}
				},
				new BiConsumer<DLOpenerFileEntryReference, String>() {
					@Override
					public void accept(
						DLOpenerFileEntryReference dlOpenerFileEntryReference,
						String userName) {
						dlOpenerFileEntryReference.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DLOpenerFileEntryReference, Date>() {
					@Override
					public Date apply(
						DLOpenerFileEntryReference dlOpenerFileEntryReference) {
						return dlOpenerFileEntryReference.getCreateDate();
					}
				},
				new BiConsumer<DLOpenerFileEntryReference, Date>() {
					@Override
					public void accept(
						DLOpenerFileEntryReference dlOpenerFileEntryReference,
						Date createDate) {
						dlOpenerFileEntryReference.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<DLOpenerFileEntryReference, Date>() {
					@Override
					public Date apply(
						DLOpenerFileEntryReference dlOpenerFileEntryReference) {
						return dlOpenerFileEntryReference.getModifiedDate();
					}
				},
				new BiConsumer<DLOpenerFileEntryReference, Date>() {
					@Override
					public void accept(
						DLOpenerFileEntryReference dlOpenerFileEntryReference,
						Date modifiedDate) {
						dlOpenerFileEntryReference.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ReferenceKeyAccessor extends ModelPropertyAccessor {
		public ReferenceKeyAccessor() {
			super(new Function<DLOpenerFileEntryReference, String>() {
					@Override
					public String apply(
						DLOpenerFileEntryReference dlOpenerFileEntryReference) {
						return dlOpenerFileEntryReference.getReferenceKey();
					}
				},
				new BiConsumer<DLOpenerFileEntryReference, String>() {
					@Override
					public void accept(
						DLOpenerFileEntryReference dlOpenerFileEntryReference,
						String referenceKey) {
						dlOpenerFileEntryReference.setReferenceKey(referenceKey);
					}
				});
		}
	}

	public static class FileEntryIdAccessor extends ModelPropertyAccessor {
		public FileEntryIdAccessor() {
			super(new Function<DLOpenerFileEntryReference, Long>() {
					@Override
					public Long apply(
						DLOpenerFileEntryReference dlOpenerFileEntryReference) {
						return dlOpenerFileEntryReference.getFileEntryId();
					}
				},
				new BiConsumer<DLOpenerFileEntryReference, Long>() {
					@Override
					public void accept(
						DLOpenerFileEntryReference dlOpenerFileEntryReference,
						Long fileEntryId) {
						dlOpenerFileEntryReference.setFileEntryId(fileEntryId);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<DLOpenerFileEntryReference, Integer>() {
					@Override
					public Integer apply(
						DLOpenerFileEntryReference dlOpenerFileEntryReference) {
						return dlOpenerFileEntryReference.getType();
					}
				},
				new BiConsumer<DLOpenerFileEntryReference, Integer>() {
					@Override
					public void accept(
						DLOpenerFileEntryReference dlOpenerFileEntryReference,
						Integer type) {
						dlOpenerFileEntryReference.setType(type);
					}
				});
		}
	}

	private DLOpenerFileEntryReferenceModelAccessors() {
	}
}