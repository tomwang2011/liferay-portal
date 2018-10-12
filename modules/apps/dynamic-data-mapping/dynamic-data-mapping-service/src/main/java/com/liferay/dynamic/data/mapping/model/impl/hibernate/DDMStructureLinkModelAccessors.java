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

import com.liferay.dynamic.data.mapping.model.DDMStructureLink;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DDMStructureLinkModelAccessors {
	public static class StructureLinkIdAccessor extends ModelPropertyAccessor {
		public StructureLinkIdAccessor() {
			super(new Function<DDMStructureLink, Long>() {
					@Override
					public Long apply(DDMStructureLink ddmStructureLink) {
						return ddmStructureLink.getStructureLinkId();
					}
				},
				new BiConsumer<DDMStructureLink, Long>() {
					@Override
					public void accept(DDMStructureLink ddmStructureLink,
						Long structureLinkId) {
						ddmStructureLink.setStructureLinkId(structureLinkId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDMStructureLink, Long>() {
					@Override
					public Long apply(DDMStructureLink ddmStructureLink) {
						return ddmStructureLink.getCompanyId();
					}
				},
				new BiConsumer<DDMStructureLink, Long>() {
					@Override
					public void accept(DDMStructureLink ddmStructureLink,
						Long companyId) {
						ddmStructureLink.setCompanyId(companyId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<DDMStructureLink, Long>() {
					@Override
					public Long apply(DDMStructureLink ddmStructureLink) {
						return ddmStructureLink.getClassNameId();
					}
				},
				new BiConsumer<DDMStructureLink, Long>() {
					@Override
					public void accept(DDMStructureLink ddmStructureLink,
						Long classNameId) {
						ddmStructureLink.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<DDMStructureLink, Long>() {
					@Override
					public Long apply(DDMStructureLink ddmStructureLink) {
						return ddmStructureLink.getClassPK();
					}
				},
				new BiConsumer<DDMStructureLink, Long>() {
					@Override
					public void accept(DDMStructureLink ddmStructureLink,
						Long classPK) {
						ddmStructureLink.setClassPK(classPK);
					}
				});
		}
	}

	public static class StructureIdAccessor extends ModelPropertyAccessor {
		public StructureIdAccessor() {
			super(new Function<DDMStructureLink, Long>() {
					@Override
					public Long apply(DDMStructureLink ddmStructureLink) {
						return ddmStructureLink.getStructureId();
					}
				},
				new BiConsumer<DDMStructureLink, Long>() {
					@Override
					public void accept(DDMStructureLink ddmStructureLink,
						Long structureId) {
						ddmStructureLink.setStructureId(structureId);
					}
				});
		}
	}

	private DDMStructureLinkModelAccessors() {
	}
}