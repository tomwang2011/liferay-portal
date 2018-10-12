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

package com.liferay.portlet.expando.model.impl.hibernate;

import com.liferay.expando.kernel.model.ExpandoTable;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ExpandoTableModelAccessors {
	public static class TableIdAccessor extends ModelPropertyAccessor {
		public TableIdAccessor() {
			super(new Function<ExpandoTable, Long>() {
					@Override
					public Long apply(ExpandoTable expandoTable) {
						return expandoTable.getTableId();
					}
				},
				new BiConsumer<ExpandoTable, Long>() {
					@Override
					public void accept(ExpandoTable expandoTable, Long tableId) {
						expandoTable.setTableId(tableId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<ExpandoTable, Long>() {
					@Override
					public Long apply(ExpandoTable expandoTable) {
						return expandoTable.getCompanyId();
					}
				},
				new BiConsumer<ExpandoTable, Long>() {
					@Override
					public void accept(ExpandoTable expandoTable, Long companyId) {
						expandoTable.setCompanyId(companyId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<ExpandoTable, Long>() {
					@Override
					public Long apply(ExpandoTable expandoTable) {
						return expandoTable.getClassNameId();
					}
				},
				new BiConsumer<ExpandoTable, Long>() {
					@Override
					public void accept(ExpandoTable expandoTable,
						Long classNameId) {
						expandoTable.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<ExpandoTable, String>() {
					@Override
					public String apply(ExpandoTable expandoTable) {
						return expandoTable.getName();
					}
				},
				new BiConsumer<ExpandoTable, String>() {
					@Override
					public void accept(ExpandoTable expandoTable, String name) {
						expandoTable.setName(name);
					}
				});
		}
	}

	private ExpandoTableModelAccessors() {
	}
}