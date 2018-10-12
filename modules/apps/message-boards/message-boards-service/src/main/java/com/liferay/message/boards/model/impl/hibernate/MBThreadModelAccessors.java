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

import com.liferay.message.boards.model.MBThread;

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
public class MBThreadModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<MBThread, String>() {
					@Override
					public String apply(MBThread mbThread) {
						return mbThread.getUuid();
					}
				},
				new BiConsumer<MBThread, String>() {
					@Override
					public void accept(MBThread mbThread, String uuid) {
						mbThread.setUuid(uuid);
					}
				});
		}
	}

	public static class ThreadIdAccessor extends ModelPropertyAccessor {
		public ThreadIdAccessor() {
			super(new Function<MBThread, Long>() {
					@Override
					public Long apply(MBThread mbThread) {
						return mbThread.getThreadId();
					}
				},
				new BiConsumer<MBThread, Long>() {
					@Override
					public void accept(MBThread mbThread, Long threadId) {
						mbThread.setThreadId(threadId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<MBThread, Long>() {
					@Override
					public Long apply(MBThread mbThread) {
						return mbThread.getGroupId();
					}
				},
				new BiConsumer<MBThread, Long>() {
					@Override
					public void accept(MBThread mbThread, Long groupId) {
						mbThread.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<MBThread, Long>() {
					@Override
					public Long apply(MBThread mbThread) {
						return mbThread.getCompanyId();
					}
				},
				new BiConsumer<MBThread, Long>() {
					@Override
					public void accept(MBThread mbThread, Long companyId) {
						mbThread.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<MBThread, Long>() {
					@Override
					public Long apply(MBThread mbThread) {
						return mbThread.getUserId();
					}
				},
				new BiConsumer<MBThread, Long>() {
					@Override
					public void accept(MBThread mbThread, Long userId) {
						mbThread.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<MBThread, String>() {
					@Override
					public String apply(MBThread mbThread) {
						return mbThread.getUserName();
					}
				},
				new BiConsumer<MBThread, String>() {
					@Override
					public void accept(MBThread mbThread, String userName) {
						mbThread.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<MBThread, Date>() {
					@Override
					public Date apply(MBThread mbThread) {
						return mbThread.getCreateDate();
					}
				},
				new BiConsumer<MBThread, Date>() {
					@Override
					public void accept(MBThread mbThread, Date createDate) {
						mbThread.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<MBThread, Date>() {
					@Override
					public Date apply(MBThread mbThread) {
						return mbThread.getModifiedDate();
					}
				},
				new BiConsumer<MBThread, Date>() {
					@Override
					public void accept(MBThread mbThread, Date modifiedDate) {
						mbThread.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class CategoryIdAccessor extends ModelPropertyAccessor {
		public CategoryIdAccessor() {
			super(new Function<MBThread, Long>() {
					@Override
					public Long apply(MBThread mbThread) {
						return mbThread.getCategoryId();
					}
				},
				new BiConsumer<MBThread, Long>() {
					@Override
					public void accept(MBThread mbThread, Long categoryId) {
						mbThread.setCategoryId(categoryId);
					}
				});
		}
	}

	public static class RootMessageIdAccessor extends ModelPropertyAccessor {
		public RootMessageIdAccessor() {
			super(new Function<MBThread, Long>() {
					@Override
					public Long apply(MBThread mbThread) {
						return mbThread.getRootMessageId();
					}
				},
				new BiConsumer<MBThread, Long>() {
					@Override
					public void accept(MBThread mbThread, Long rootMessageId) {
						mbThread.setRootMessageId(rootMessageId);
					}
				});
		}
	}

	public static class RootMessageUserIdAccessor extends ModelPropertyAccessor {
		public RootMessageUserIdAccessor() {
			super(new Function<MBThread, Long>() {
					@Override
					public Long apply(MBThread mbThread) {
						return mbThread.getRootMessageUserId();
					}
				},
				new BiConsumer<MBThread, Long>() {
					@Override
					public void accept(MBThread mbThread, Long rootMessageUserId) {
						mbThread.setRootMessageUserId(rootMessageUserId);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<MBThread, String>() {
					@Override
					public String apply(MBThread mbThread) {
						return mbThread.getTitle();
					}
				},
				new BiConsumer<MBThread, String>() {
					@Override
					public void accept(MBThread mbThread, String title) {
						mbThread.setTitle(title);
					}
				});
		}
	}

	public static class MessageCountAccessor extends ModelPropertyAccessor {
		public MessageCountAccessor() {
			super(new Function<MBThread, Integer>() {
					@Override
					public Integer apply(MBThread mbThread) {
						return mbThread.getMessageCount();
					}
				},
				new BiConsumer<MBThread, Integer>() {
					@Override
					public void accept(MBThread mbThread, Integer messageCount) {
						mbThread.setMessageCount(messageCount);
					}
				});
		}
	}

	public static class ViewCountAccessor extends ModelPropertyAccessor {
		public ViewCountAccessor() {
			super(new Function<MBThread, Integer>() {
					@Override
					public Integer apply(MBThread mbThread) {
						return mbThread.getViewCount();
					}
				},
				new BiConsumer<MBThread, Integer>() {
					@Override
					public void accept(MBThread mbThread, Integer viewCount) {
						mbThread.setViewCount(viewCount);
					}
				});
		}
	}

	public static class LastPostByUserIdAccessor extends ModelPropertyAccessor {
		public LastPostByUserIdAccessor() {
			super(new Function<MBThread, Long>() {
					@Override
					public Long apply(MBThread mbThread) {
						return mbThread.getLastPostByUserId();
					}
				},
				new BiConsumer<MBThread, Long>() {
					@Override
					public void accept(MBThread mbThread, Long lastPostByUserId) {
						mbThread.setLastPostByUserId(lastPostByUserId);
					}
				});
		}
	}

	public static class LastPostDateAccessor extends ModelPropertyAccessor {
		public LastPostDateAccessor() {
			super(new Function<MBThread, Date>() {
					@Override
					public Date apply(MBThread mbThread) {
						return mbThread.getLastPostDate();
					}
				},
				new BiConsumer<MBThread, Date>() {
					@Override
					public void accept(MBThread mbThread, Date lastPostDate) {
						mbThread.setLastPostDate(lastPostDate);
					}
				});
		}
	}

	public static class PriorityAccessor extends ModelPropertyAccessor {
		public PriorityAccessor() {
			super(new Function<MBThread, Double>() {
					@Override
					public Double apply(MBThread mbThread) {
						return mbThread.getPriority();
					}
				},
				new BiConsumer<MBThread, Double>() {
					@Override
					public void accept(MBThread mbThread, Double priority) {
						mbThread.setPriority(priority);
					}
				});
		}
	}

	public static class QuestionAccessor extends ModelPropertyAccessor {
		public QuestionAccessor() {
			super(new Function<MBThread, Boolean>() {
					@Override
					public Boolean apply(MBThread mbThread) {
						return mbThread.getQuestion();
					}
				},
				new BiConsumer<MBThread, Boolean>() {
					@Override
					public void accept(MBThread mbThread, Boolean question) {
						mbThread.setQuestion(question);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<MBThread, Date>() {
					@Override
					public Date apply(MBThread mbThread) {
						return mbThread.getLastPublishDate();
					}
				},
				new BiConsumer<MBThread, Date>() {
					@Override
					public void accept(MBThread mbThread, Date lastPublishDate) {
						mbThread.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<MBThread, Integer>() {
					@Override
					public Integer apply(MBThread mbThread) {
						return mbThread.getStatus();
					}
				},
				new BiConsumer<MBThread, Integer>() {
					@Override
					public void accept(MBThread mbThread, Integer status) {
						mbThread.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<MBThread, Long>() {
					@Override
					public Long apply(MBThread mbThread) {
						return mbThread.getStatusByUserId();
					}
				},
				new BiConsumer<MBThread, Long>() {
					@Override
					public void accept(MBThread mbThread, Long statusByUserId) {
						mbThread.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<MBThread, String>() {
					@Override
					public String apply(MBThread mbThread) {
						return mbThread.getStatusByUserName();
					}
				},
				new BiConsumer<MBThread, String>() {
					@Override
					public void accept(MBThread mbThread,
						String statusByUserName) {
						mbThread.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<MBThread, Date>() {
					@Override
					public Date apply(MBThread mbThread) {
						return mbThread.getStatusDate();
					}
				},
				new BiConsumer<MBThread, Date>() {
					@Override
					public void accept(MBThread mbThread, Date statusDate) {
						mbThread.setStatusDate(statusDate);
					}
				});
		}
	}

	private MBThreadModelAccessors() {
	}
}