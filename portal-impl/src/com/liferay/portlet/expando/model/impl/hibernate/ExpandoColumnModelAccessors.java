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

import com.liferay.expando.kernel.model.ExpandoColumn;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ExpandoColumnModelAccessors {
	public static class ColumnIdAccessor extends ModelPropertyAccessor {
		public ColumnIdAccessor() {
			super(new Function<ExpandoColumn, Long>() {
					@Override
					public Long apply(ExpandoColumn expandoColumn) {
						return expandoColumn.getColumnId();
					}
				},
				new BiConsumer<ExpandoColumn, Long>() {
					@Override
					public void accept(ExpandoColumn expandoColumn,
						Long columnId) {
						expandoColumn.setColumnId(columnId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<ExpandoColumn, Long>() {
					@Override
					public Long apply(ExpandoColumn expandoColumn) {
						return expandoColumn.getCompanyId();
					}
				},
				new BiConsumer<ExpandoColumn, Long>() {
					@Override
					public void accept(ExpandoColumn expandoColumn,
						Long companyId) {
						expandoColumn.setCompanyId(companyId);
					}
				});
		}
	}

	public static class TableIdAccessor extends ModelPropertyAccessor {
		public TableIdAccessor() {
			super(new Function<ExpandoColumn, Long>() {
					@Override
					public Long apply(ExpandoColumn expandoColumn) {
						return expandoColumn.getTableId();
					}
				},
				new BiConsumer<ExpandoColumn, Long>() {
					@Override
					public void accept(ExpandoColumn expandoColumn, Long tableId) {
						expandoColumn.setTableId(tableId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<ExpandoColumn, String>() {
					@Override
					public String apply(ExpandoColumn expandoColumn) {
						return expandoColumn.getName();
					}
				},
				new BiConsumer<ExpandoColumn, String>() {
					@Override
					public void accept(ExpandoColumn expandoColumn, String name) {
						expandoColumn.setName(name);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<ExpandoColumn, Integer>() {
					@Override
					public Integer apply(ExpandoColumn expandoColumn) {
						return expandoColumn.getType();
					}
				},
				new BiConsumer<ExpandoColumn, Integer>() {
					@Override
					public void accept(ExpandoColumn expandoColumn, Integer type) {
						expandoColumn.setType(type);
					}
				});
		}
	}

	public static class DefaultDataAccessor extends ModelPropertyAccessor {
		public DefaultDataAccessor() {
			super(new Function<ExpandoColumn, String>() {
					@Override
					public String apply(ExpandoColumn expandoColumn) {
						return expandoColumn.getDefaultData();
					}
				},
				new BiConsumer<ExpandoColumn, String>() {
					@Override
					public void accept(ExpandoColumn expandoColumn,
						String defaultData) {
						expandoColumn.setDefaultData(defaultData);
					}
				});
		}
	}

	public static class TypeSettingsAccessor extends ModelPropertyAccessor {
		public TypeSettingsAccessor() {
			super(new Function<ExpandoColumn, String>() {
					@Override
					public String apply(ExpandoColumn expandoColumn) {
						return expandoColumn.getTypeSettings();
					}
				},
				new BiConsumer<ExpandoColumn, String>() {
					@Override
					public void accept(ExpandoColumn expandoColumn,
						String typeSettings) {
						expandoColumn.setTypeSettings(typeSettings);
					}
				});
		}
	}

	private ExpandoColumnModelAccessors() {
	}
}