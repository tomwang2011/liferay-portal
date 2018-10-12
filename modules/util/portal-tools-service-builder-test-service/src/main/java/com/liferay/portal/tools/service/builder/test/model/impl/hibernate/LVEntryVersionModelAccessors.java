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
import com.liferay.portal.tools.service.builder.test.model.LVEntryVersion;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LVEntryVersionModelAccessors {
	public static class LvEntryVersionIdAccessor extends ModelPropertyAccessor {
		public LvEntryVersionIdAccessor() {
			super(new Function<LVEntryVersion, Long>() {
					@Override
					public Long apply(LVEntryVersion lvEntryVersion) {
						return lvEntryVersion.getLvEntryVersionId();
					}
				},
				new BiConsumer<LVEntryVersion, Long>() {
					@Override
					public void accept(LVEntryVersion lvEntryVersion,
						Long lvEntryVersionId) {
						lvEntryVersion.setLvEntryVersionId(lvEntryVersionId);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<LVEntryVersion, Integer>() {
					@Override
					public Integer apply(LVEntryVersion lvEntryVersion) {
						return lvEntryVersion.getVersion();
					}
				},
				new BiConsumer<LVEntryVersion, Integer>() {
					@Override
					public void accept(LVEntryVersion lvEntryVersion,
						Integer version) {
						lvEntryVersion.setVersion(version);
					}
				});
		}
	}

	public static class DefaultLanguageIdAccessor extends ModelPropertyAccessor {
		public DefaultLanguageIdAccessor() {
			super(new Function<LVEntryVersion, String>() {
					@Override
					public String apply(LVEntryVersion lvEntryVersion) {
						return lvEntryVersion.getDefaultLanguageId();
					}
				},
				new BiConsumer<LVEntryVersion, String>() {
					@Override
					public void accept(LVEntryVersion lvEntryVersion,
						String defaultLanguageId) {
						lvEntryVersion.setDefaultLanguageId(defaultLanguageId);
					}
				});
		}
	}

	public static class LvEntryIdAccessor extends ModelPropertyAccessor {
		public LvEntryIdAccessor() {
			super(new Function<LVEntryVersion, Long>() {
					@Override
					public Long apply(LVEntryVersion lvEntryVersion) {
						return lvEntryVersion.getLvEntryId();
					}
				},
				new BiConsumer<LVEntryVersion, Long>() {
					@Override
					public void accept(LVEntryVersion lvEntryVersion,
						Long lvEntryId) {
						lvEntryVersion.setLvEntryId(lvEntryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<LVEntryVersion, Long>() {
					@Override
					public Long apply(LVEntryVersion lvEntryVersion) {
						return lvEntryVersion.getGroupId();
					}
				},
				new BiConsumer<LVEntryVersion, Long>() {
					@Override
					public void accept(LVEntryVersion lvEntryVersion,
						Long groupId) {
						lvEntryVersion.setGroupId(groupId);
					}
				});
		}
	}

	private LVEntryVersionModelAccessors() {
	}
}