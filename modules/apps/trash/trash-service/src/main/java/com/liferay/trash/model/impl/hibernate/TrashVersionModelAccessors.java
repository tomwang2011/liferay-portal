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

package com.liferay.trash.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.trash.model.TrashVersion;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TrashVersionModelAccessors {
	public static class VersionIdAccessor extends ModelPropertyAccessor {
		public VersionIdAccessor() {
			super(new Function<TrashVersion, Long>() {
					@Override
					public Long apply(TrashVersion trashVersion) {
						return trashVersion.getVersionId();
					}
				},
				new BiConsumer<TrashVersion, Long>() {
					@Override
					public void accept(TrashVersion trashVersion, Long versionId) {
						trashVersion.setVersionId(versionId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<TrashVersion, Long>() {
					@Override
					public Long apply(TrashVersion trashVersion) {
						return trashVersion.getCompanyId();
					}
				},
				new BiConsumer<TrashVersion, Long>() {
					@Override
					public void accept(TrashVersion trashVersion, Long companyId) {
						trashVersion.setCompanyId(companyId);
					}
				});
		}
	}

	public static class EntryIdAccessor extends ModelPropertyAccessor {
		public EntryIdAccessor() {
			super(new Function<TrashVersion, Long>() {
					@Override
					public Long apply(TrashVersion trashVersion) {
						return trashVersion.getEntryId();
					}
				},
				new BiConsumer<TrashVersion, Long>() {
					@Override
					public void accept(TrashVersion trashVersion, Long entryId) {
						trashVersion.setEntryId(entryId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<TrashVersion, Long>() {
					@Override
					public Long apply(TrashVersion trashVersion) {
						return trashVersion.getClassNameId();
					}
				},
				new BiConsumer<TrashVersion, Long>() {
					@Override
					public void accept(TrashVersion trashVersion,
						Long classNameId) {
						trashVersion.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<TrashVersion, Long>() {
					@Override
					public Long apply(TrashVersion trashVersion) {
						return trashVersion.getClassPK();
					}
				},
				new BiConsumer<TrashVersion, Long>() {
					@Override
					public void accept(TrashVersion trashVersion, Long classPK) {
						trashVersion.setClassPK(classPK);
					}
				});
		}
	}

	public static class TypeSettingsAccessor extends ModelPropertyAccessor {
		public TypeSettingsAccessor() {
			super(new Function<TrashVersion, String>() {
					@Override
					public String apply(TrashVersion trashVersion) {
						return trashVersion.getTypeSettings();
					}
				},
				new BiConsumer<TrashVersion, String>() {
					@Override
					public void accept(TrashVersion trashVersion,
						String typeSettings) {
						trashVersion.setTypeSettings(typeSettings);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<TrashVersion, Integer>() {
					@Override
					public Integer apply(TrashVersion trashVersion) {
						return trashVersion.getStatus();
					}
				},
				new BiConsumer<TrashVersion, Integer>() {
					@Override
					public void accept(TrashVersion trashVersion, Integer status) {
						trashVersion.setStatus(status);
					}
				});
		}
	}

	private TrashVersionModelAccessors() {
	}
}