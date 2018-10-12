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

import com.liferay.expando.kernel.model.ExpandoValue;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ExpandoValueModelAccessors {
	public static class ValueIdAccessor extends ModelPropertyAccessor {
		public ValueIdAccessor() {
			super(new Function<ExpandoValue, Long>() {
					@Override
					public Long apply(ExpandoValue expandoValue) {
						return expandoValue.getValueId();
					}
				},
				new BiConsumer<ExpandoValue, Long>() {
					@Override
					public void accept(ExpandoValue expandoValue, Long valueId) {
						expandoValue.setValueId(valueId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<ExpandoValue, Long>() {
					@Override
					public Long apply(ExpandoValue expandoValue) {
						return expandoValue.getCompanyId();
					}
				},
				new BiConsumer<ExpandoValue, Long>() {
					@Override
					public void accept(ExpandoValue expandoValue, Long companyId) {
						expandoValue.setCompanyId(companyId);
					}
				});
		}
	}

	public static class TableIdAccessor extends ModelPropertyAccessor {
		public TableIdAccessor() {
			super(new Function<ExpandoValue, Long>() {
					@Override
					public Long apply(ExpandoValue expandoValue) {
						return expandoValue.getTableId();
					}
				},
				new BiConsumer<ExpandoValue, Long>() {
					@Override
					public void accept(ExpandoValue expandoValue, Long tableId) {
						expandoValue.setTableId(tableId);
					}
				});
		}
	}

	public static class ColumnIdAccessor extends ModelPropertyAccessor {
		public ColumnIdAccessor() {
			super(new Function<ExpandoValue, Long>() {
					@Override
					public Long apply(ExpandoValue expandoValue) {
						return expandoValue.getColumnId();
					}
				},
				new BiConsumer<ExpandoValue, Long>() {
					@Override
					public void accept(ExpandoValue expandoValue, Long columnId) {
						expandoValue.setColumnId(columnId);
					}
				});
		}
	}

	public static class RowIdAccessor extends ModelPropertyAccessor {
		public RowIdAccessor() {
			super(new Function<ExpandoValue, Long>() {
					@Override
					public Long apply(ExpandoValue expandoValue) {
						return expandoValue.getRowId();
					}
				},
				new BiConsumer<ExpandoValue, Long>() {
					@Override
					public void accept(ExpandoValue expandoValue, Long rowId) {
						expandoValue.setRowId(rowId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<ExpandoValue, Long>() {
					@Override
					public Long apply(ExpandoValue expandoValue) {
						return expandoValue.getClassNameId();
					}
				},
				new BiConsumer<ExpandoValue, Long>() {
					@Override
					public void accept(ExpandoValue expandoValue,
						Long classNameId) {
						expandoValue.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<ExpandoValue, Long>() {
					@Override
					public Long apply(ExpandoValue expandoValue) {
						return expandoValue.getClassPK();
					}
				},
				new BiConsumer<ExpandoValue, Long>() {
					@Override
					public void accept(ExpandoValue expandoValue, Long classPK) {
						expandoValue.setClassPK(classPK);
					}
				});
		}
	}

	public static class DataAccessor extends ModelPropertyAccessor {
		public DataAccessor() {
			super(new Function<ExpandoValue, String>() {
					@Override
					public String apply(ExpandoValue expandoValue) {
						return expandoValue.getData();
					}
				},
				new BiConsumer<ExpandoValue, String>() {
					@Override
					public void accept(ExpandoValue expandoValue, String data) {
						expandoValue.setData(data);
					}
				});
		}
	}

	private ExpandoValueModelAccessors() {
	}
}