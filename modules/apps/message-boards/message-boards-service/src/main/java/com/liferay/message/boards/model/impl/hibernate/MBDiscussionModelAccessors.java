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

import com.liferay.message.boards.model.MBDiscussion;

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
public class MBDiscussionModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<MBDiscussion, String>() {
					@Override
					public String apply(MBDiscussion mbDiscussion) {
						return mbDiscussion.getUuid();
					}
				},
				new BiConsumer<MBDiscussion, String>() {
					@Override
					public void accept(MBDiscussion mbDiscussion, String uuid) {
						mbDiscussion.setUuid(uuid);
					}
				});
		}
	}

	public static class DiscussionIdAccessor extends ModelPropertyAccessor {
		public DiscussionIdAccessor() {
			super(new Function<MBDiscussion, Long>() {
					@Override
					public Long apply(MBDiscussion mbDiscussion) {
						return mbDiscussion.getDiscussionId();
					}
				},
				new BiConsumer<MBDiscussion, Long>() {
					@Override
					public void accept(MBDiscussion mbDiscussion,
						Long discussionId) {
						mbDiscussion.setDiscussionId(discussionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<MBDiscussion, Long>() {
					@Override
					public Long apply(MBDiscussion mbDiscussion) {
						return mbDiscussion.getGroupId();
					}
				},
				new BiConsumer<MBDiscussion, Long>() {
					@Override
					public void accept(MBDiscussion mbDiscussion, Long groupId) {
						mbDiscussion.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<MBDiscussion, Long>() {
					@Override
					public Long apply(MBDiscussion mbDiscussion) {
						return mbDiscussion.getCompanyId();
					}
				},
				new BiConsumer<MBDiscussion, Long>() {
					@Override
					public void accept(MBDiscussion mbDiscussion, Long companyId) {
						mbDiscussion.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<MBDiscussion, Long>() {
					@Override
					public Long apply(MBDiscussion mbDiscussion) {
						return mbDiscussion.getUserId();
					}
				},
				new BiConsumer<MBDiscussion, Long>() {
					@Override
					public void accept(MBDiscussion mbDiscussion, Long userId) {
						mbDiscussion.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<MBDiscussion, String>() {
					@Override
					public String apply(MBDiscussion mbDiscussion) {
						return mbDiscussion.getUserName();
					}
				},
				new BiConsumer<MBDiscussion, String>() {
					@Override
					public void accept(MBDiscussion mbDiscussion,
						String userName) {
						mbDiscussion.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<MBDiscussion, Date>() {
					@Override
					public Date apply(MBDiscussion mbDiscussion) {
						return mbDiscussion.getCreateDate();
					}
				},
				new BiConsumer<MBDiscussion, Date>() {
					@Override
					public void accept(MBDiscussion mbDiscussion,
						Date createDate) {
						mbDiscussion.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<MBDiscussion, Date>() {
					@Override
					public Date apply(MBDiscussion mbDiscussion) {
						return mbDiscussion.getModifiedDate();
					}
				},
				new BiConsumer<MBDiscussion, Date>() {
					@Override
					public void accept(MBDiscussion mbDiscussion,
						Date modifiedDate) {
						mbDiscussion.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<MBDiscussion, Long>() {
					@Override
					public Long apply(MBDiscussion mbDiscussion) {
						return mbDiscussion.getClassNameId();
					}
				},
				new BiConsumer<MBDiscussion, Long>() {
					@Override
					public void accept(MBDiscussion mbDiscussion,
						Long classNameId) {
						mbDiscussion.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<MBDiscussion, Long>() {
					@Override
					public Long apply(MBDiscussion mbDiscussion) {
						return mbDiscussion.getClassPK();
					}
				},
				new BiConsumer<MBDiscussion, Long>() {
					@Override
					public void accept(MBDiscussion mbDiscussion, Long classPK) {
						mbDiscussion.setClassPK(classPK);
					}
				});
		}
	}

	public static class ThreadIdAccessor extends ModelPropertyAccessor {
		public ThreadIdAccessor() {
			super(new Function<MBDiscussion, Long>() {
					@Override
					public Long apply(MBDiscussion mbDiscussion) {
						return mbDiscussion.getThreadId();
					}
				},
				new BiConsumer<MBDiscussion, Long>() {
					@Override
					public void accept(MBDiscussion mbDiscussion, Long threadId) {
						mbDiscussion.setThreadId(threadId);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<MBDiscussion, Date>() {
					@Override
					public Date apply(MBDiscussion mbDiscussion) {
						return mbDiscussion.getLastPublishDate();
					}
				},
				new BiConsumer<MBDiscussion, Date>() {
					@Override
					public void accept(MBDiscussion mbDiscussion,
						Date lastPublishDate) {
						mbDiscussion.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private MBDiscussionModelAccessors() {
	}
}