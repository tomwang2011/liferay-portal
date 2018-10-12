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

package com.liferay.document.library.file.rank.model.impl.hibernate;

import com.liferay.document.library.file.rank.model.DLFileRank;

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
public class DLFileRankModelAccessors {
	public static class FileRankIdAccessor extends ModelPropertyAccessor {
		public FileRankIdAccessor() {
			super(new Function<DLFileRank, Long>() {
					@Override
					public Long apply(DLFileRank dlFileRank) {
						return dlFileRank.getFileRankId();
					}
				},
				new BiConsumer<DLFileRank, Long>() {
					@Override
					public void accept(DLFileRank dlFileRank, Long fileRankId) {
						dlFileRank.setFileRankId(fileRankId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<DLFileRank, Long>() {
					@Override
					public Long apply(DLFileRank dlFileRank) {
						return dlFileRank.getGroupId();
					}
				},
				new BiConsumer<DLFileRank, Long>() {
					@Override
					public void accept(DLFileRank dlFileRank, Long groupId) {
						dlFileRank.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DLFileRank, Long>() {
					@Override
					public Long apply(DLFileRank dlFileRank) {
						return dlFileRank.getCompanyId();
					}
				},
				new BiConsumer<DLFileRank, Long>() {
					@Override
					public void accept(DLFileRank dlFileRank, Long companyId) {
						dlFileRank.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<DLFileRank, Long>() {
					@Override
					public Long apply(DLFileRank dlFileRank) {
						return dlFileRank.getUserId();
					}
				},
				new BiConsumer<DLFileRank, Long>() {
					@Override
					public void accept(DLFileRank dlFileRank, Long userId) {
						dlFileRank.setUserId(userId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<DLFileRank, Date>() {
					@Override
					public Date apply(DLFileRank dlFileRank) {
						return dlFileRank.getCreateDate();
					}
				},
				new BiConsumer<DLFileRank, Date>() {
					@Override
					public void accept(DLFileRank dlFileRank, Date createDate) {
						dlFileRank.setCreateDate(createDate);
					}
				});
		}
	}

	public static class FileEntryIdAccessor extends ModelPropertyAccessor {
		public FileEntryIdAccessor() {
			super(new Function<DLFileRank, Long>() {
					@Override
					public Long apply(DLFileRank dlFileRank) {
						return dlFileRank.getFileEntryId();
					}
				},
				new BiConsumer<DLFileRank, Long>() {
					@Override
					public void accept(DLFileRank dlFileRank, Long fileEntryId) {
						dlFileRank.setFileEntryId(fileEntryId);
					}
				});
		}
	}

	public static class ActiveAccessor extends ModelPropertyAccessor {
		public ActiveAccessor() {
			super(new Function<DLFileRank, Boolean>() {
					@Override
					public Boolean apply(DLFileRank dlFileRank) {
						return dlFileRank.getActive();
					}
				},
				new BiConsumer<DLFileRank, Boolean>() {
					@Override
					public void accept(DLFileRank dlFileRank, Boolean active) {
						dlFileRank.setActive(active);
					}
				});
		}
	}

	private DLFileRankModelAccessors() {
	}
}