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

import com.liferay.dynamic.data.mapping.model.DDMDataProviderInstanceLink;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DDMDataProviderInstanceLinkModelAccessors {
	public static class DataProviderInstanceLinkIdAccessor
		extends ModelPropertyAccessor {
		public DataProviderInstanceLinkIdAccessor() {
			super(new Function<DDMDataProviderInstanceLink, Long>() {
					@Override
					public Long apply(
						DDMDataProviderInstanceLink ddmDataProviderInstanceLink) {
						return ddmDataProviderInstanceLink.getDataProviderInstanceLinkId();
					}
				},
				new BiConsumer<DDMDataProviderInstanceLink, Long>() {
					@Override
					public void accept(
						DDMDataProviderInstanceLink ddmDataProviderInstanceLink,
						Long dataProviderInstanceLinkId) {
						ddmDataProviderInstanceLink.setDataProviderInstanceLinkId(dataProviderInstanceLinkId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDMDataProviderInstanceLink, Long>() {
					@Override
					public Long apply(
						DDMDataProviderInstanceLink ddmDataProviderInstanceLink) {
						return ddmDataProviderInstanceLink.getCompanyId();
					}
				},
				new BiConsumer<DDMDataProviderInstanceLink, Long>() {
					@Override
					public void accept(
						DDMDataProviderInstanceLink ddmDataProviderInstanceLink,
						Long companyId) {
						ddmDataProviderInstanceLink.setCompanyId(companyId);
					}
				});
		}
	}

	public static class DataProviderInstanceIdAccessor
		extends ModelPropertyAccessor {
		public DataProviderInstanceIdAccessor() {
			super(new Function<DDMDataProviderInstanceLink, Long>() {
					@Override
					public Long apply(
						DDMDataProviderInstanceLink ddmDataProviderInstanceLink) {
						return ddmDataProviderInstanceLink.getDataProviderInstanceId();
					}
				},
				new BiConsumer<DDMDataProviderInstanceLink, Long>() {
					@Override
					public void accept(
						DDMDataProviderInstanceLink ddmDataProviderInstanceLink,
						Long dataProviderInstanceId) {
						ddmDataProviderInstanceLink.setDataProviderInstanceId(dataProviderInstanceId);
					}
				});
		}
	}

	public static class StructureIdAccessor extends ModelPropertyAccessor {
		public StructureIdAccessor() {
			super(new Function<DDMDataProviderInstanceLink, Long>() {
					@Override
					public Long apply(
						DDMDataProviderInstanceLink ddmDataProviderInstanceLink) {
						return ddmDataProviderInstanceLink.getStructureId();
					}
				},
				new BiConsumer<DDMDataProviderInstanceLink, Long>() {
					@Override
					public void accept(
						DDMDataProviderInstanceLink ddmDataProviderInstanceLink,
						Long structureId) {
						ddmDataProviderInstanceLink.setStructureId(structureId);
					}
				});
		}
	}

	private DDMDataProviderInstanceLinkModelAccessors() {
	}
}