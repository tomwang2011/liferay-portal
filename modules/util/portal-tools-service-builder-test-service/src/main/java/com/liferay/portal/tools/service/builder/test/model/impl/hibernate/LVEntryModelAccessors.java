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

package com.liferay.portal.tools.service.builder.test.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;
import com.liferay.portal.tools.service.builder.test.model.LVEntry;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LVEntryModelAccessors {
	public static class HeadIdAccessor extends ModelPropertyAccessor {
		public HeadIdAccessor() {
			super(new Function<LVEntry, Long>() {
					@Override
					public Long apply(LVEntry lvEntry) {
						return lvEntry.getHeadId();
					}
				},
				new BiConsumer<LVEntry, Long>() {
					@Override
					public void accept(LVEntry lvEntry, Long headId) {
						lvEntry.setHeadId(headId);
					}
				});
		}
	}

	public static class DefaultLanguageIdAccessor extends ModelPropertyAccessor {
		public DefaultLanguageIdAccessor() {
			super(new Function<LVEntry, String>() {
					@Override
					public String apply(LVEntry lvEntry) {
						return lvEntry.getDefaultLanguageId();
					}
				},
				new BiConsumer<LVEntry, String>() {
					@Override
					public void accept(LVEntry lvEntry, String defaultLanguageId) {
						lvEntry.setDefaultLanguageId(defaultLanguageId);
					}
				});
		}
	}

	public static class LvEntryIdAccessor extends ModelPropertyAccessor {
		public LvEntryIdAccessor() {
			super(new Function<LVEntry, Long>() {
					@Override
					public Long apply(LVEntry lvEntry) {
						return lvEntry.getLvEntryId();
					}
				},
				new BiConsumer<LVEntry, Long>() {
					@Override
					public void accept(LVEntry lvEntry, Long lvEntryId) {
						lvEntry.setLvEntryId(lvEntryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<LVEntry, Long>() {
					@Override
					public Long apply(LVEntry lvEntry) {
						return lvEntry.getGroupId();
					}
				},
				new BiConsumer<LVEntry, Long>() {
					@Override
					public void accept(LVEntry lvEntry, Long groupId) {
						lvEntry.setGroupId(groupId);
					}
				});
		}
	}

	private LVEntryModelAccessors() {
	}
}