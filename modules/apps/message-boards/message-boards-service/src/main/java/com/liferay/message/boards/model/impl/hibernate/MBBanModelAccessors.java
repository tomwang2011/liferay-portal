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

package com.liferay.message.boards.model.impl.hibernate;

import com.liferay.message.boards.model.MBBan;

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
public class MBBanModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<MBBan, String>() {
					@Override
					public String apply(MBBan mbBan) {
						return mbBan.getUuid();
					}
				},
				new BiConsumer<MBBan, String>() {
					@Override
					public void accept(MBBan mbBan, String uuid) {
						mbBan.setUuid(uuid);
					}
				});
		}
	}

	public static class BanIdAccessor extends ModelPropertyAccessor {
		public BanIdAccessor() {
			super(new Function<MBBan, Long>() {
					@Override
					public Long apply(MBBan mbBan) {
						return mbBan.getBanId();
					}
				},
				new BiConsumer<MBBan, Long>() {
					@Override
					public void accept(MBBan mbBan, Long banId) {
						mbBan.setBanId(banId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<MBBan, Long>() {
					@Override
					public Long apply(MBBan mbBan) {
						return mbBan.getGroupId();
					}
				},
				new BiConsumer<MBBan, Long>() {
					@Override
					public void accept(MBBan mbBan, Long groupId) {
						mbBan.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<MBBan, Long>() {
					@Override
					public Long apply(MBBan mbBan) {
						return mbBan.getCompanyId();
					}
				},
				new BiConsumer<MBBan, Long>() {
					@Override
					public void accept(MBBan mbBan, Long companyId) {
						mbBan.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<MBBan, Long>() {
					@Override
					public Long apply(MBBan mbBan) {
						return mbBan.getUserId();
					}
				},
				new BiConsumer<MBBan, Long>() {
					@Override
					public void accept(MBBan mbBan, Long userId) {
						mbBan.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<MBBan, String>() {
					@Override
					public String apply(MBBan mbBan) {
						return mbBan.getUserName();
					}
				},
				new BiConsumer<MBBan, String>() {
					@Override
					public void accept(MBBan mbBan, String userName) {
						mbBan.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<MBBan, Date>() {
					@Override
					public Date apply(MBBan mbBan) {
						return mbBan.getCreateDate();
					}
				},
				new BiConsumer<MBBan, Date>() {
					@Override
					public void accept(MBBan mbBan, Date createDate) {
						mbBan.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<MBBan, Date>() {
					@Override
					public Date apply(MBBan mbBan) {
						return mbBan.getModifiedDate();
					}
				},
				new BiConsumer<MBBan, Date>() {
					@Override
					public void accept(MBBan mbBan, Date modifiedDate) {
						mbBan.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class BanUserIdAccessor extends ModelPropertyAccessor {
		public BanUserIdAccessor() {
			super(new Function<MBBan, Long>() {
					@Override
					public Long apply(MBBan mbBan) {
						return mbBan.getBanUserId();
					}
				},
				new BiConsumer<MBBan, Long>() {
					@Override
					public void accept(MBBan mbBan, Long banUserId) {
						mbBan.setBanUserId(banUserId);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<MBBan, Date>() {
					@Override
					public Date apply(MBBan mbBan) {
						return mbBan.getLastPublishDate();
					}
				},
				new BiConsumer<MBBan, Date>() {
					@Override
					public void accept(MBBan mbBan, Date lastPublishDate) {
						mbBan.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private MBBanModelAccessors() {
	}
}