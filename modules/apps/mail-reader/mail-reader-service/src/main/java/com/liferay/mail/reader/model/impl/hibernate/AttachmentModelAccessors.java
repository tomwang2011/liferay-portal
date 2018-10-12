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

import com.liferay.mail.reader.model.Attachment;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttachmentModelAccessors {
	public static class AttachmentIdAccessor extends ModelPropertyAccessor {
		public AttachmentIdAccessor() {
			super(new Function<Attachment, Long>() {
					@Override
					public Long apply(Attachment attachment) {
						return attachment.getAttachmentId();
					}
				},
				new BiConsumer<Attachment, Long>() {
					@Override
					public void accept(Attachment attachment, Long attachmentId) {
						attachment.setAttachmentId(attachmentId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Attachment, Long>() {
					@Override
					public Long apply(Attachment attachment) {
						return attachment.getCompanyId();
					}
				},
				new BiConsumer<Attachment, Long>() {
					@Override
					public void accept(Attachment attachment, Long companyId) {
						attachment.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<Attachment, Long>() {
					@Override
					public Long apply(Attachment attachment) {
						return attachment.getUserId();
					}
				},
				new BiConsumer<Attachment, Long>() {
					@Override
					public void accept(Attachment attachment, Long userId) {
						attachment.setUserId(userId);
					}
				});
		}
	}

	public static class AccountIdAccessor extends ModelPropertyAccessor {
		public AccountIdAccessor() {
			super(new Function<Attachment, Long>() {
					@Override
					public Long apply(Attachment attachment) {
						return attachment.getAccountId();
					}
				},
				new BiConsumer<Attachment, Long>() {
					@Override
					public void accept(Attachment attachment, Long accountId) {
						attachment.setAccountId(accountId);
					}
				});
		}
	}

	public static class FolderIdAccessor extends ModelPropertyAccessor {
		public FolderIdAccessor() {
			super(new Function<Attachment, Long>() {
					@Override
					public Long apply(Attachment attachment) {
						return attachment.getFolderId();
					}
				},
				new BiConsumer<Attachment, Long>() {
					@Override
					public void accept(Attachment attachment, Long folderId) {
						attachment.setFolderId(folderId);
					}
				});
		}
	}

	public static class MessageIdAccessor extends ModelPropertyAccessor {
		public MessageIdAccessor() {
			super(new Function<Attachment, Long>() {
					@Override
					public Long apply(Attachment attachment) {
						return attachment.getMessageId();
					}
				},
				new BiConsumer<Attachment, Long>() {
					@Override
					public void accept(Attachment attachment, Long messageId) {
						attachment.setMessageId(messageId);
					}
				});
		}
	}

	public static class ContentPathAccessor extends ModelPropertyAccessor {
		public ContentPathAccessor() {
			super(new Function<Attachment, String>() {
					@Override
					public String apply(Attachment attachment) {
						return attachment.getContentPath();
					}
				},
				new BiConsumer<Attachment, String>() {
					@Override
					public void accept(Attachment attachment, String contentPath) {
						attachment.setContentPath(contentPath);
					}
				});
		}
	}

	public static class FileNameAccessor extends ModelPropertyAccessor {
		public FileNameAccessor() {
			super(new Function<Attachment, String>() {
					@Override
					public String apply(Attachment attachment) {
						return attachment.getFileName();
					}
				},
				new BiConsumer<Attachment, String>() {
					@Override
					public void accept(Attachment attachment, String fileName) {
						attachment.setFileName(fileName);
					}
				});
		}
	}

	public static class SizeAccessor extends ModelPropertyAccessor {
		public SizeAccessor() {
			super(new Function<Attachment, Long>() {
					@Override
					public Long apply(Attachment attachment) {
						return attachment.getSize();
					}
				},
				new BiConsumer<Attachment, Long>() {
					@Override
					public void accept(Attachment attachment, Long size) {
						attachment.setSize(size);
					}
				});
		}
	}

	private AttachmentModelAccessors() {
	}
}