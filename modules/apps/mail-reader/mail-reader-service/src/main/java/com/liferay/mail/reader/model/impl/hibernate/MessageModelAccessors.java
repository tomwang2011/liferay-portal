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

import com.liferay.mail.reader.model.Message;

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
public class MessageModelAccessors {
	public static class MessageIdAccessor extends ModelPropertyAccessor {
		public MessageIdAccessor() {
			super(new Function<Message, Long>() {
					@Override
					public Long apply(Message message) {
						return message.getMessageId();
					}
				},
				new BiConsumer<Message, Long>() {
					@Override
					public void accept(Message message, Long messageId) {
						message.setMessageId(messageId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Message, Long>() {
					@Override
					public Long apply(Message message) {
						return message.getCompanyId();
					}
				},
				new BiConsumer<Message, Long>() {
					@Override
					public void accept(Message message, Long companyId) {
						message.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<Message, Long>() {
					@Override
					public Long apply(Message message) {
						return message.getUserId();
					}
				},
				new BiConsumer<Message, Long>() {
					@Override
					public void accept(Message message, Long userId) {
						message.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<Message, String>() {
					@Override
					public String apply(Message message) {
						return message.getUserName();
					}
				},
				new BiConsumer<Message, String>() {
					@Override
					public void accept(Message message, String userName) {
						message.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Message, Date>() {
					@Override
					public Date apply(Message message) {
						return message.getCreateDate();
					}
				},
				new BiConsumer<Message, Date>() {
					@Override
					public void accept(Message message, Date createDate) {
						message.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<Message, Date>() {
					@Override
					public Date apply(Message message) {
						return message.getModifiedDate();
					}
				},
				new BiConsumer<Message, Date>() {
					@Override
					public void accept(Message message, Date modifiedDate) {
						message.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class AccountIdAccessor extends ModelPropertyAccessor {
		public AccountIdAccessor() {
			super(new Function<Message, Long>() {
					@Override
					public Long apply(Message message) {
						return message.getAccountId();
					}
				},
				new BiConsumer<Message, Long>() {
					@Override
					public void accept(Message message, Long accountId) {
						message.setAccountId(accountId);
					}
				});
		}
	}

	public static class FolderIdAccessor extends ModelPropertyAccessor {
		public FolderIdAccessor() {
			super(new Function<Message, Long>() {
					@Override
					public Long apply(Message message) {
						return message.getFolderId();
					}
				},
				new BiConsumer<Message, Long>() {
					@Override
					public void accept(Message message, Long folderId) {
						message.setFolderId(folderId);
					}
				});
		}
	}

	public static class SenderAccessor extends ModelPropertyAccessor {
		public SenderAccessor() {
			super(new Function<Message, String>() {
					@Override
					public String apply(Message message) {
						return message.getSender();
					}
				},
				new BiConsumer<Message, String>() {
					@Override
					public void accept(Message message, String sender) {
						message.setSender(sender);
					}
				});
		}
	}

	public static class ToAccessor extends ModelPropertyAccessor {
		public ToAccessor() {
			super(new Function<Message, String>() {
					@Override
					public String apply(Message message) {
						return message.getTo();
					}
				},
				new BiConsumer<Message, String>() {
					@Override
					public void accept(Message message, String to) {
						message.setTo(to);
					}
				});
		}
	}

	public static class CcAccessor extends ModelPropertyAccessor {
		public CcAccessor() {
			super(new Function<Message, String>() {
					@Override
					public String apply(Message message) {
						return message.getCc();
					}
				},
				new BiConsumer<Message, String>() {
					@Override
					public void accept(Message message, String cc) {
						message.setCc(cc);
					}
				});
		}
	}

	public static class BccAccessor extends ModelPropertyAccessor {
		public BccAccessor() {
			super(new Function<Message, String>() {
					@Override
					public String apply(Message message) {
						return message.getBcc();
					}
				},
				new BiConsumer<Message, String>() {
					@Override
					public void accept(Message message, String bcc) {
						message.setBcc(bcc);
					}
				});
		}
	}

	public static class SentDateAccessor extends ModelPropertyAccessor {
		public SentDateAccessor() {
			super(new Function<Message, Date>() {
					@Override
					public Date apply(Message message) {
						return message.getSentDate();
					}
				},
				new BiConsumer<Message, Date>() {
					@Override
					public void accept(Message message, Date sentDate) {
						message.setSentDate(sentDate);
					}
				});
		}
	}

	public static class SubjectAccessor extends ModelPropertyAccessor {
		public SubjectAccessor() {
			super(new Function<Message, String>() {
					@Override
					public String apply(Message message) {
						return message.getSubject();
					}
				},
				new BiConsumer<Message, String>() {
					@Override
					public void accept(Message message, String subject) {
						message.setSubject(subject);
					}
				});
		}
	}

	public static class PreviewAccessor extends ModelPropertyAccessor {
		public PreviewAccessor() {
			super(new Function<Message, String>() {
					@Override
					public String apply(Message message) {
						return message.getPreview();
					}
				},
				new BiConsumer<Message, String>() {
					@Override
					public void accept(Message message, String preview) {
						message.setPreview(preview);
					}
				});
		}
	}

	public static class BodyAccessor extends ModelPropertyAccessor {
		public BodyAccessor() {
			super(new Function<Message, String>() {
					@Override
					public String apply(Message message) {
						return message.getBody();
					}
				},
				new BiConsumer<Message, String>() {
					@Override
					public void accept(Message message, String body) {
						message.setBody(body);
					}
				});
		}
	}

	public static class FlagsAccessor extends ModelPropertyAccessor {
		public FlagsAccessor() {
			super(new Function<Message, String>() {
					@Override
					public String apply(Message message) {
						return message.getFlags();
					}
				},
				new BiConsumer<Message, String>() {
					@Override
					public void accept(Message message, String flags) {
						message.setFlags(flags);
					}
				});
		}
	}

	public static class SizeAccessor extends ModelPropertyAccessor {
		public SizeAccessor() {
			super(new Function<Message, Long>() {
					@Override
					public Long apply(Message message) {
						return message.getSize();
					}
				},
				new BiConsumer<Message, Long>() {
					@Override
					public void accept(Message message, Long size) {
						message.setSize(size);
					}
				});
		}
	}

	public static class RemoteMessageIdAccessor extends ModelPropertyAccessor {
		public RemoteMessageIdAccessor() {
			super(new Function<Message, Long>() {
					@Override
					public Long apply(Message message) {
						return message.getRemoteMessageId();
					}
				},
				new BiConsumer<Message, Long>() {
					@Override
					public void accept(Message message, Long remoteMessageId) {
						message.setRemoteMessageId(remoteMessageId);
					}
				});
		}
	}

	public static class ContentTypeAccessor extends ModelPropertyAccessor {
		public ContentTypeAccessor() {
			super(new Function<Message, String>() {
					@Override
					public String apply(Message message) {
						return message.getContentType();
					}
				},
				new BiConsumer<Message, String>() {
					@Override
					public void accept(Message message, String contentType) {
						message.setContentType(contentType);
					}
				});
		}
	}

	private MessageModelAccessors() {
	}
}