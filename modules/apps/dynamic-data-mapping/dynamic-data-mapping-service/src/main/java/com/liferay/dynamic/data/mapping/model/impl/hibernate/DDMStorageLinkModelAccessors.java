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

package com.liferay.dynamic.data.mapping.model.impl.hibernate;

import com.liferay.dynamic.data.mapping.model.DDMStorageLink;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DDMStorageLinkModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<DDMStorageLink, String>() {
					@Override
					public String apply(DDMStorageLink ddmStorageLink) {
						return ddmStorageLink.getUuid();
					}
				},
				new BiConsumer<DDMStorageLink, String>() {
					@Override
					public void accept(DDMStorageLink ddmStorageLink,
						String uuid) {
						ddmStorageLink.setUuid(uuid);
					}
				});
		}
	}

	public static class StorageLinkIdAccessor extends ModelPropertyAccessor {
		public StorageLinkIdAccessor() {
			super(new Function<DDMStorageLink, Long>() {
					@Override
					public Long apply(DDMStorageLink ddmStorageLink) {
						return ddmStorageLink.getStorageLinkId();
					}
				},
				new BiConsumer<DDMStorageLink, Long>() {
					@Override
					public void accept(DDMStorageLink ddmStorageLink,
						Long storageLinkId) {
						ddmStorageLink.setStorageLinkId(storageLinkId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDMStorageLink, Long>() {
					@Override
					public Long apply(DDMStorageLink ddmStorageLink) {
						return ddmStorageLink.getCompanyId();
					}
				},
				new BiConsumer<DDMStorageLink, Long>() {
					@Override
					public void accept(DDMStorageLink ddmStorageLink,
						Long companyId) {
						ddmStorageLink.setCompanyId(companyId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<DDMStorageLink, Long>() {
					@Override
					public Long apply(DDMStorageLink ddmStorageLink) {
						return ddmStorageLink.getClassNameId();
					}
				},
				new BiConsumer<DDMStorageLink, Long>() {
					@Override
					public void accept(DDMStorageLink ddmStorageLink,
						Long classNameId) {
						ddmStorageLink.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<DDMStorageLink, Long>() {
					@Override
					public Long apply(DDMStorageLink ddmStorageLink) {
						return ddmStorageLink.getClassPK();
					}
				},
				new BiConsumer<DDMStorageLink, Long>() {
					@Override
					public void accept(DDMStorageLink ddmStorageLink,
						Long classPK) {
						ddmStorageLink.setClassPK(classPK);
					}
				});
		}
	}

	public static class StructureIdAccessor extends ModelPropertyAccessor {
		public StructureIdAccessor() {
			super(new Function<DDMStorageLink, Long>() {
					@Override
					public Long apply(DDMStorageLink ddmStorageLink) {
						return ddmStorageLink.getStructureId();
					}
				},
				new BiConsumer<DDMStorageLink, Long>() {
					@Override
					public void accept(DDMStorageLink ddmStorageLink,
						Long structureId) {
						ddmStorageLink.setStructureId(structureId);
					}
				});
		}
	}

	public static class StructureVersionIdAccessor extends ModelPropertyAccessor {
		public StructureVersionIdAccessor() {
			super(new Function<DDMStorageLink, Long>() {
					@Override
					public Long apply(DDMStorageLink ddmStorageLink) {
						return ddmStorageLink.getStructureVersionId();
					}
				},
				new BiConsumer<DDMStorageLink, Long>() {
					@Override
					public void accept(DDMStorageLink ddmStorageLink,
						Long structureVersionId) {
						ddmStorageLink.setStructureVersionId(structureVersionId);
					}
				});
		}
	}

	private DDMStorageLinkModelAccessors() {
	}
}