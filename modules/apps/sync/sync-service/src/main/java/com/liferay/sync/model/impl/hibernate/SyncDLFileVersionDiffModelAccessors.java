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

package com.liferay.sync.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.sync.model.SyncDLFileVersionDiff;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SyncDLFileVersionDiffModelAccessors {
	public static class SyncDLFileVersionDiffIdAccessor
		extends ModelPropertyAccessor {
		public SyncDLFileVersionDiffIdAccessor() {
			super(new Function<SyncDLFileVersionDiff, Long>() {
					@Override
					public Long apply(
						SyncDLFileVersionDiff syncDLFileVersionDiff) {
						return syncDLFileVersionDiff.getSyncDLFileVersionDiffId();
					}
				},
				new BiConsumer<SyncDLFileVersionDiff, Long>() {
					@Override
					public void accept(
						SyncDLFileVersionDiff syncDLFileVersionDiff,
						Long syncDLFileVersionDiffId) {
						syncDLFileVersionDiff.setSyncDLFileVersionDiffId(syncDLFileVersionDiffId);
					}
				});
		}
	}

	public static class FileEntryIdAccessor extends ModelPropertyAccessor {
		public FileEntryIdAccessor() {
			super(new Function<SyncDLFileVersionDiff, Long>() {
					@Override
					public Long apply(
						SyncDLFileVersionDiff syncDLFileVersionDiff) {
						return syncDLFileVersionDiff.getFileEntryId();
					}
				},
				new BiConsumer<SyncDLFileVersionDiff, Long>() {
					@Override
					public void accept(
						SyncDLFileVersionDiff syncDLFileVersionDiff,
						Long fileEntryId) {
						syncDLFileVersionDiff.setFileEntryId(fileEntryId);
					}
				});
		}
	}

	public static class SourceFileVersionIdAccessor
		extends ModelPropertyAccessor {
		public SourceFileVersionIdAccessor() {
			super(new Function<SyncDLFileVersionDiff, Long>() {
					@Override
					public Long apply(
						SyncDLFileVersionDiff syncDLFileVersionDiff) {
						return syncDLFileVersionDiff.getSourceFileVersionId();
					}
				},
				new BiConsumer<SyncDLFileVersionDiff, Long>() {
					@Override
					public void accept(
						SyncDLFileVersionDiff syncDLFileVersionDiff,
						Long sourceFileVersionId) {
						syncDLFileVersionDiff.setSourceFileVersionId(sourceFileVersionId);
					}
				});
		}
	}

	public static class TargetFileVersionIdAccessor
		extends ModelPropertyAccessor {
		public TargetFileVersionIdAccessor() {
			super(new Function<SyncDLFileVersionDiff, Long>() {
					@Override
					public Long apply(
						SyncDLFileVersionDiff syncDLFileVersionDiff) {
						return syncDLFileVersionDiff.getTargetFileVersionId();
					}
				},
				new BiConsumer<SyncDLFileVersionDiff, Long>() {
					@Override
					public void accept(
						SyncDLFileVersionDiff syncDLFileVersionDiff,
						Long targetFileVersionId) {
						syncDLFileVersionDiff.setTargetFileVersionId(targetFileVersionId);
					}
				});
		}
	}

	public static class DataFileEntryIdAccessor extends ModelPropertyAccessor {
		public DataFileEntryIdAccessor() {
			super(new Function<SyncDLFileVersionDiff, Long>() {
					@Override
					public Long apply(
						SyncDLFileVersionDiff syncDLFileVersionDiff) {
						return syncDLFileVersionDiff.getDataFileEntryId();
					}
				},
				new BiConsumer<SyncDLFileVersionDiff, Long>() {
					@Override
					public void accept(
						SyncDLFileVersionDiff syncDLFileVersionDiff,
						Long dataFileEntryId) {
						syncDLFileVersionDiff.setDataFileEntryId(dataFileEntryId);
					}
				});
		}
	}

	public static class SizeAccessor extends ModelPropertyAccessor {
		public SizeAccessor() {
			super(new Function<SyncDLFileVersionDiff, Long>() {
					@Override
					public Long apply(
						SyncDLFileVersionDiff syncDLFileVersionDiff) {
						return syncDLFileVersionDiff.getSize();
					}
				},
				new BiConsumer<SyncDLFileVersionDiff, Long>() {
					@Override
					public void accept(
						SyncDLFileVersionDiff syncDLFileVersionDiff, Long size) {
						syncDLFileVersionDiff.setSize(size);
					}
				});
		}
	}

	public static class ExpirationDateAccessor extends ModelPropertyAccessor {
		public ExpirationDateAccessor() {
			super(new Function<SyncDLFileVersionDiff, Date>() {
					@Override
					public Date apply(
						SyncDLFileVersionDiff syncDLFileVersionDiff) {
						return syncDLFileVersionDiff.getExpirationDate();
					}
				},
				new BiConsumer<SyncDLFileVersionDiff, Date>() {
					@Override
					public void accept(
						SyncDLFileVersionDiff syncDLFileVersionDiff,
						Date expirationDate) {
						syncDLFileVersionDiff.setExpirationDate(expirationDate);
					}
				});
		}
	}

	private SyncDLFileVersionDiffModelAccessors() {
	}
}