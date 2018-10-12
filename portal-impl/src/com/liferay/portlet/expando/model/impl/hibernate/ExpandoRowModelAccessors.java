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

import com.liferay.expando.kernel.model.ExpandoRow;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ExpandoRowModelAccessors {
	public static class RowIdAccessor extends ModelPropertyAccessor {
		public RowIdAccessor() {
			super(new Function<ExpandoRow, Long>() {
					@Override
					public Long apply(ExpandoRow expandoRow) {
						return expandoRow.getRowId();
					}
				},
				new BiConsumer<ExpandoRow, Long>() {
					@Override
					public void accept(ExpandoRow expandoRow, Long rowId) {
						expandoRow.setRowId(rowId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<ExpandoRow, Long>() {
					@Override
					public Long apply(ExpandoRow expandoRow) {
						return expandoRow.getCompanyId();
					}
				},
				new BiConsumer<ExpandoRow, Long>() {
					@Override
					public void accept(ExpandoRow expandoRow, Long companyId) {
						expandoRow.setCompanyId(companyId);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<ExpandoRow, Date>() {
					@Override
					public Date apply(ExpandoRow expandoRow) {
						return expandoRow.getModifiedDate();
					}
				},
				new BiConsumer<ExpandoRow, Date>() {
					@Override
					public void accept(ExpandoRow expandoRow, Date modifiedDate) {
						expandoRow.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class TableIdAccessor extends ModelPropertyAccessor {
		public TableIdAccessor() {
			super(new Function<ExpandoRow, Long>() {
					@Override
					public Long apply(ExpandoRow expandoRow) {
						return expandoRow.getTableId();
					}
				},
				new BiConsumer<ExpandoRow, Long>() {
					@Override
					public void accept(ExpandoRow expandoRow, Long tableId) {
						expandoRow.setTableId(tableId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<ExpandoRow, Long>() {
					@Override
					public Long apply(ExpandoRow expandoRow) {
						return expandoRow.getClassPK();
					}
				},
				new BiConsumer<ExpandoRow, Long>() {
					@Override
					public void accept(ExpandoRow expandoRow, Long classPK) {
						expandoRow.setClassPK(classPK);
					}
				});
		}
	}

	private ExpandoRowModelAccessors() {
	}
}