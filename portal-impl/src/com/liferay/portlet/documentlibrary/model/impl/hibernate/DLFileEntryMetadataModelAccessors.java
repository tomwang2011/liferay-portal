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

package com.liferay.portlet.documentlibrary.model.impl.hibernate;

import com.liferay.document.library.kernel.model.DLFileEntryMetadata;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DLFileEntryMetadataModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<DLFileEntryMetadata, String>() {
					@Override
					public String apply(DLFileEntryMetadata dlFileEntryMetadata) {
						return dlFileEntryMetadata.getUuid();
					}
				},
				new BiConsumer<DLFileEntryMetadata, String>() {
					@Override
					public void accept(
						DLFileEntryMetadata dlFileEntryMetadata, String uuid) {
						dlFileEntryMetadata.setUuid(uuid);
					}
				});
		}
	}

	public static class FileEntryMetadataIdAccessor
		extends ModelPropertyAccessor {
		public FileEntryMetadataIdAccessor() {
			super(new Function<DLFileEntryMetadata, Long>() {
					@Override
					public Long apply(DLFileEntryMetadata dlFileEntryMetadata) {
						return dlFileEntryMetadata.getFileEntryMetadataId();
					}
				},
				new BiConsumer<DLFileEntryMetadata, Long>() {
					@Override
					public void accept(
						DLFileEntryMetadata dlFileEntryMetadata,
						Long fileEntryMetadataId) {
						dlFileEntryMetadata.setFileEntryMetadataId(fileEntryMetadataId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DLFileEntryMetadata, Long>() {
					@Override
					public Long apply(DLFileEntryMetadata dlFileEntryMetadata) {
						return dlFileEntryMetadata.getCompanyId();
					}
				},
				new BiConsumer<DLFileEntryMetadata, Long>() {
					@Override
					public void accept(
						DLFileEntryMetadata dlFileEntryMetadata, Long companyId) {
						dlFileEntryMetadata.setCompanyId(companyId);
					}
				});
		}
	}

	public static class DDMStorageIdAccessor extends ModelPropertyAccessor {
		public DDMStorageIdAccessor() {
			super(new Function<DLFileEntryMetadata, Long>() {
					@Override
					public Long apply(DLFileEntryMetadata dlFileEntryMetadata) {
						return dlFileEntryMetadata.getDDMStorageId();
					}
				},
				new BiConsumer<DLFileEntryMetadata, Long>() {
					@Override
					public void accept(
						DLFileEntryMetadata dlFileEntryMetadata,
						Long DDMStorageId) {
						dlFileEntryMetadata.setDDMStorageId(DDMStorageId);
					}
				});
		}
	}

	public static class DDMStructureIdAccessor extends ModelPropertyAccessor {
		public DDMStructureIdAccessor() {
			super(new Function<DLFileEntryMetadata, Long>() {
					@Override
					public Long apply(DLFileEntryMetadata dlFileEntryMetadata) {
						return dlFileEntryMetadata.getDDMStructureId();
					}
				},
				new BiConsumer<DLFileEntryMetadata, Long>() {
					@Override
					public void accept(
						DLFileEntryMetadata dlFileEntryMetadata,
						Long DDMStructureId) {
						dlFileEntryMetadata.setDDMStructureId(DDMStructureId);
					}
				});
		}
	}

	public static class FileEntryIdAccessor extends ModelPropertyAccessor {
		public FileEntryIdAccessor() {
			super(new Function<DLFileEntryMetadata, Long>() {
					@Override
					public Long apply(DLFileEntryMetadata dlFileEntryMetadata) {
						return dlFileEntryMetadata.getFileEntryId();
					}
				},
				new BiConsumer<DLFileEntryMetadata, Long>() {
					@Override
					public void accept(
						DLFileEntryMetadata dlFileEntryMetadata,
						Long fileEntryId) {
						dlFileEntryMetadata.setFileEntryId(fileEntryId);
					}
				});
		}
	}

	public static class FileVersionIdAccessor extends ModelPropertyAccessor {
		public FileVersionIdAccessor() {
			super(new Function<DLFileEntryMetadata, Long>() {
					@Override
					public Long apply(DLFileEntryMetadata dlFileEntryMetadata) {
						return dlFileEntryMetadata.getFileVersionId();
					}
				},
				new BiConsumer<DLFileEntryMetadata, Long>() {
					@Override
					public void accept(
						DLFileEntryMetadata dlFileEntryMetadata,
						Long fileVersionId) {
						dlFileEntryMetadata.setFileVersionId(fileVersionId);
					}
				});
		}
	}

	private DLFileEntryMetadataModelAccessors() {
	}
}