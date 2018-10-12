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

import com.liferay.message.boards.model.MBMessage;

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
public class MBMessageModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<MBMessage, String>() {
					@Override
					public String apply(MBMessage mbMessage) {
						return mbMessage.getUuid();
					}
				},
				new BiConsumer<MBMessage, String>() {
					@Override
					public void accept(MBMessage mbMessage, String uuid) {
						mbMessage.setUuid(uuid);
					}
				});
		}
	}

	public static class MessageIdAccessor extends ModelPropertyAccessor {
		public MessageIdAccessor() {
			super(new Function<MBMessage, Long>() {
					@Override
					public Long apply(MBMessage mbMessage) {
						return mbMessage.getMessageId();
					}
				},
				new BiConsumer<MBMessage, Long>() {
					@Override
					public void accept(MBMessage mbMessage, Long messageId) {
						mbMessage.setMessageId(messageId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<MBMessage, Long>() {
					@Override
					public Long apply(MBMessage mbMessage) {
						return mbMessage.getGroupId();
					}
				},
				new BiConsumer<MBMessage, Long>() {
					@Override
					public void accept(MBMessage mbMessage, Long groupId) {
						mbMessage.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<MBMessage, Long>() {
					@Override
					public Long apply(MBMessage mbMessage) {
						return mbMessage.getCompanyId();
					}
				},
				new BiConsumer<MBMessage, Long>() {
					@Override
					public void accept(MBMessage mbMessage, Long companyId) {
						mbMessage.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<MBMessage, Long>() {
					@Override
					public Long apply(MBMessage mbMessage) {
						return mbMessage.getUserId();
					}
				},
				new BiConsumer<MBMessage, Long>() {
					@Override
					public void accept(MBMessage mbMessage, Long userId) {
						mbMessage.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<MBMessage, String>() {
					@Override
					public String apply(MBMessage mbMessage) {
						return mbMessage.getUserName();
					}
				},
				new BiConsumer<MBMessage, String>() {
					@Override
					public void accept(MBMessage mbMessage, String userName) {
						mbMessage.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<MBMessage, Date>() {
					@Override
					public Date apply(MBMessage mbMessage) {
						return mbMessage.getCreateDate();
					}
				},
				new BiConsumer<MBMessage, Date>() {
					@Override
					public void accept(MBMessage mbMessage, Date createDate) {
						mbMessage.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<MBMessage, Date>() {
					@Override
					public Date apply(MBMessage mbMessage) {
						return mbMessage.getModifiedDate();
					}
				},
				new BiConsumer<MBMessage, Date>() {
					@Override
					public void accept(MBMessage mbMessage, Date modifiedDate) {
						mbMessage.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<MBMessage, Long>() {
					@Override
					public Long apply(MBMessage mbMessage) {
						return mbMessage.getClassNameId();
					}
				},
				new BiConsumer<MBMessage, Long>() {
					@Override
					public void accept(MBMessage mbMessage, Long classNameId) {
						mbMessage.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<MBMessage, Long>() {
					@Override
					public Long apply(MBMessage mbMessage) {
						return mbMessage.getClassPK();
					}
				},
				new BiConsumer<MBMessage, Long>() {
					@Override
					public void accept(MBMessage mbMessage, Long classPK) {
						mbMessage.setClassPK(classPK);
					}
				});
		}
	}

	public static class CategoryIdAccessor extends ModelPropertyAccessor {
		public CategoryIdAccessor() {
			super(new Function<MBMessage, Long>() {
					@Override
					public Long apply(MBMessage mbMessage) {
						return mbMessage.getCategoryId();
					}
				},
				new BiConsumer<MBMessage, Long>() {
					@Override
					public void accept(MBMessage mbMessage, Long categoryId) {
						mbMessage.setCategoryId(categoryId);
					}
				});
		}
	}

	public static class ThreadIdAccessor extends ModelPropertyAccessor {
		public ThreadIdAccessor() {
			super(new Function<MBMessage, Long>() {
					@Override
					public Long apply(MBMessage mbMessage) {
						return mbMessage.getThreadId();
					}
				},
				new BiConsumer<MBMessage, Long>() {
					@Override
					public void accept(MBMessage mbMessage, Long threadId) {
						mbMessage.setThreadId(threadId);
					}
				});
		}
	}

	public static class RootMessageIdAccessor extends ModelPropertyAccessor {
		public RootMessageIdAccessor() {
			super(new Function<MBMessage, Long>() {
					@Override
					public Long apply(MBMessage mbMessage) {
						return mbMessage.getRootMessageId();
					}
				},
				new BiConsumer<MBMessage, Long>() {
					@Override
					public void accept(MBMessage mbMessage, Long rootMessageId) {
						mbMessage.setRootMessageId(rootMessageId);
					}
				});
		}
	}

	public static class ParentMessageIdAccessor extends ModelPropertyAccessor {
		public ParentMessageIdAccessor() {
			super(new Function<MBMessage, Long>() {
					@Override
					public Long apply(MBMessage mbMessage) {
						return mbMessage.getParentMessageId();
					}
				},
				new BiConsumer<MBMessage, Long>() {
					@Override
					public void accept(MBMessage mbMessage, Long parentMessageId) {
						mbMessage.setParentMessageId(parentMessageId);
					}
				});
		}
	}

	public static class SubjectAccessor extends ModelPropertyAccessor {
		public SubjectAccessor() {
			super(new Function<MBMessage, String>() {
					@Override
					public String apply(MBMessage mbMessage) {
						return mbMessage.getSubject();
					}
				},
				new BiConsumer<MBMessage, String>() {
					@Override
					public void accept(MBMessage mbMessage, String subject) {
						mbMessage.setSubject(subject);
					}
				});
		}
	}

	public static class BodyAccessor extends ModelPropertyAccessor {
		public BodyAccessor() {
			super(new Function<MBMessage, String>() {
					@Override
					public String apply(MBMessage mbMessage) {
						return mbMessage.getBody();
					}
				},
				new BiConsumer<MBMessage, String>() {
					@Override
					public void accept(MBMessage mbMessage, String body) {
						mbMessage.setBody(body);
					}
				});
		}
	}

	public static class FormatAccessor extends ModelPropertyAccessor {
		public FormatAccessor() {
			super(new Function<MBMessage, String>() {
					@Override
					public String apply(MBMessage mbMessage) {
						return mbMessage.getFormat();
					}
				},
				new BiConsumer<MBMessage, String>() {
					@Override
					public void accept(MBMessage mbMessage, String format) {
						mbMessage.setFormat(format);
					}
				});
		}
	}

	public static class AnonymousAccessor extends ModelPropertyAccessor {
		public AnonymousAccessor() {
			super(new Function<MBMessage, Boolean>() {
					@Override
					public Boolean apply(MBMessage mbMessage) {
						return mbMessage.getAnonymous();
					}
				},
				new BiConsumer<MBMessage, Boolean>() {
					@Override
					public void accept(MBMessage mbMessage, Boolean anonymous) {
						mbMessage.setAnonymous(anonymous);
					}
				});
		}
	}

	public static class PriorityAccessor extends ModelPropertyAccessor {
		public PriorityAccessor() {
			super(new Function<MBMessage, Double>() {
					@Override
					public Double apply(MBMessage mbMessage) {
						return mbMessage.getPriority();
					}
				},
				new BiConsumer<MBMessage, Double>() {
					@Override
					public void accept(MBMessage mbMessage, Double priority) {
						mbMessage.setPriority(priority);
					}
				});
		}
	}

	public static class AllowPingbacksAccessor extends ModelPropertyAccessor {
		public AllowPingbacksAccessor() {
			super(new Function<MBMessage, Boolean>() {
					@Override
					public Boolean apply(MBMessage mbMessage) {
						return mbMessage.getAllowPingbacks();
					}
				},
				new BiConsumer<MBMessage, Boolean>() {
					@Override
					public void accept(MBMessage mbMessage,
						Boolean allowPingbacks) {
						mbMessage.setAllowPingbacks(allowPingbacks);
					}
				});
		}
	}

	public static class AnswerAccessor extends ModelPropertyAccessor {
		public AnswerAccessor() {
			super(new Function<MBMessage, Boolean>() {
					@Override
					public Boolean apply(MBMessage mbMessage) {
						return mbMessage.getAnswer();
					}
				},
				new BiConsumer<MBMessage, Boolean>() {
					@Override
					public void accept(MBMessage mbMessage, Boolean answer) {
						mbMessage.setAnswer(answer);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<MBMessage, Date>() {
					@Override
					public Date apply(MBMessage mbMessage) {
						return mbMessage.getLastPublishDate();
					}
				},
				new BiConsumer<MBMessage, Date>() {
					@Override
					public void accept(MBMessage mbMessage, Date lastPublishDate) {
						mbMessage.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<MBMessage, Integer>() {
					@Override
					public Integer apply(MBMessage mbMessage) {
						return mbMessage.getStatus();
					}
				},
				new BiConsumer<MBMessage, Integer>() {
					@Override
					public void accept(MBMessage mbMessage, Integer status) {
						mbMessage.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<MBMessage, Long>() {
					@Override
					public Long apply(MBMessage mbMessage) {
						return mbMessage.getStatusByUserId();
					}
				},
				new BiConsumer<MBMessage, Long>() {
					@Override
					public void accept(MBMessage mbMessage, Long statusByUserId) {
						mbMessage.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<MBMessage, String>() {
					@Override
					public String apply(MBMessage mbMessage) {
						return mbMessage.getStatusByUserName();
					}
				},
				new BiConsumer<MBMessage, String>() {
					@Override
					public void accept(MBMessage mbMessage,
						String statusByUserName) {
						mbMessage.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<MBMessage, Date>() {
					@Override
					public Date apply(MBMessage mbMessage) {
						return mbMessage.getStatusDate();
					}
				},
				new BiConsumer<MBMessage, Date>() {
					@Override
					public void accept(MBMessage mbMessage, Date statusDate) {
						mbMessage.setStatusDate(statusDate);
					}
				});
		}
	}

	private MBMessageModelAccessors() {
	}
}