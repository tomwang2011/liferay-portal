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

import com.liferay.message.boards.model.MBThreadFlag;

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
public class MBThreadFlagModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<MBThreadFlag, String>() {
					@Override
					public String apply(MBThreadFlag mbThreadFlag) {
						return mbThreadFlag.getUuid();
					}
				},
				new BiConsumer<MBThreadFlag, String>() {
					@Override
					public void accept(MBThreadFlag mbThreadFlag, String uuid) {
						mbThreadFlag.setUuid(uuid);
					}
				});
		}
	}

	public static class ThreadFlagIdAccessor extends ModelPropertyAccessor {
		public ThreadFlagIdAccessor() {
			super(new Function<MBThreadFlag, Long>() {
					@Override
					public Long apply(MBThreadFlag mbThreadFlag) {
						return mbThreadFlag.getThreadFlagId();
					}
				},
				new BiConsumer<MBThreadFlag, Long>() {
					@Override
					public void accept(MBThreadFlag mbThreadFlag,
						Long threadFlagId) {
						mbThreadFlag.setThreadFlagId(threadFlagId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<MBThreadFlag, Long>() {
					@Override
					public Long apply(MBThreadFlag mbThreadFlag) {
						return mbThreadFlag.getGroupId();
					}
				},
				new BiConsumer<MBThreadFlag, Long>() {
					@Override
					public void accept(MBThreadFlag mbThreadFlag, Long groupId) {
						mbThreadFlag.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<MBThreadFlag, Long>() {
					@Override
					public Long apply(MBThreadFlag mbThreadFlag) {
						return mbThreadFlag.getCompanyId();
					}
				},
				new BiConsumer<MBThreadFlag, Long>() {
					@Override
					public void accept(MBThreadFlag mbThreadFlag, Long companyId) {
						mbThreadFlag.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<MBThreadFlag, Long>() {
					@Override
					public Long apply(MBThreadFlag mbThreadFlag) {
						return mbThreadFlag.getUserId();
					}
				},
				new BiConsumer<MBThreadFlag, Long>() {
					@Override
					public void accept(MBThreadFlag mbThreadFlag, Long userId) {
						mbThreadFlag.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<MBThreadFlag, String>() {
					@Override
					public String apply(MBThreadFlag mbThreadFlag) {
						return mbThreadFlag.getUserName();
					}
				},
				new BiConsumer<MBThreadFlag, String>() {
					@Override
					public void accept(MBThreadFlag mbThreadFlag,
						String userName) {
						mbThreadFlag.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<MBThreadFlag, Date>() {
					@Override
					public Date apply(MBThreadFlag mbThreadFlag) {
						return mbThreadFlag.getCreateDate();
					}
				},
				new BiConsumer<MBThreadFlag, Date>() {
					@Override
					public void accept(MBThreadFlag mbThreadFlag,
						Date createDate) {
						mbThreadFlag.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<MBThreadFlag, Date>() {
					@Override
					public Date apply(MBThreadFlag mbThreadFlag) {
						return mbThreadFlag.getModifiedDate();
					}
				},
				new BiConsumer<MBThreadFlag, Date>() {
					@Override
					public void accept(MBThreadFlag mbThreadFlag,
						Date modifiedDate) {
						mbThreadFlag.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ThreadIdAccessor extends ModelPropertyAccessor {
		public ThreadIdAccessor() {
			super(new Function<MBThreadFlag, Long>() {
					@Override
					public Long apply(MBThreadFlag mbThreadFlag) {
						return mbThreadFlag.getThreadId();
					}
				},
				new BiConsumer<MBThreadFlag, Long>() {
					@Override
					public void accept(MBThreadFlag mbThreadFlag, Long threadId) {
						mbThreadFlag.setThreadId(threadId);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<MBThreadFlag, Date>() {
					@Override
					public Date apply(MBThreadFlag mbThreadFlag) {
						return mbThreadFlag.getLastPublishDate();
					}
				},
				new BiConsumer<MBThreadFlag, Date>() {
					@Override
					public void accept(MBThreadFlag mbThreadFlag,
						Date lastPublishDate) {
						mbThreadFlag.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private MBThreadFlagModelAccessors() {
	}
}