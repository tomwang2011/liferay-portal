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

package com.liferay.chat.model.impl.hibernate;

import com.liferay.chat.model.Entry;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EntryModelAccessors {
	public static class EntryIdAccessor extends ModelPropertyAccessor {
		public EntryIdAccessor() {
			super(new Function<Entry, Long>() {
					@Override
					public Long apply(Entry entry) {
						return entry.getEntryId();
					}
				},
				new BiConsumer<Entry, Long>() {
					@Override
					public void accept(Entry entry, Long entryId) {
						entry.setEntryId(entryId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Entry, Long>() {
					@Override
					public Long apply(Entry entry) {
						return entry.getCreateDate();
					}
				},
				new BiConsumer<Entry, Long>() {
					@Override
					public void accept(Entry entry, Long createDate) {
						entry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class FromUserIdAccessor extends ModelPropertyAccessor {
		public FromUserIdAccessor() {
			super(new Function<Entry, Long>() {
					@Override
					public Long apply(Entry entry) {
						return entry.getFromUserId();
					}
				},
				new BiConsumer<Entry, Long>() {
					@Override
					public void accept(Entry entry, Long fromUserId) {
						entry.setFromUserId(fromUserId);
					}
				});
		}
	}

	public static class ToUserIdAccessor extends ModelPropertyAccessor {
		public ToUserIdAccessor() {
			super(new Function<Entry, Long>() {
					@Override
					public Long apply(Entry entry) {
						return entry.getToUserId();
					}
				},
				new BiConsumer<Entry, Long>() {
					@Override
					public void accept(Entry entry, Long toUserId) {
						entry.setToUserId(toUserId);
					}
				});
		}
	}

	public static class ContentAccessor extends ModelPropertyAccessor {
		public ContentAccessor() {
			super(new Function<Entry, String>() {
					@Override
					public String apply(Entry entry) {
						return entry.getContent();
					}
				},
				new BiConsumer<Entry, String>() {
					@Override
					public void accept(Entry entry, String content) {
						entry.setContent(content);
					}
				});
		}
	}

	public static class FlagAccessor extends ModelPropertyAccessor {
		public FlagAccessor() {
			super(new Function<Entry, Integer>() {
					@Override
					public Integer apply(Entry entry) {
						return entry.getFlag();
					}
				},
				new BiConsumer<Entry, Integer>() {
					@Override
					public void accept(Entry entry, Integer flag) {
						entry.setFlag(flag);
					}
				});
		}
	}

	private EntryModelAccessors() {
	}
}