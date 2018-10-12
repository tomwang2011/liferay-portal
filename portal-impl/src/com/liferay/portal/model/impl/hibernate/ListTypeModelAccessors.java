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

package com.liferay.portal.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;
import com.liferay.portal.kernel.model.ListType;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ListTypeModelAccessors {
	public static class ListTypeIdAccessor extends ModelPropertyAccessor {
		public ListTypeIdAccessor() {
			super(new Function<ListType, Long>() {
					@Override
					public Long apply(ListType listType) {
						return listType.getListTypeId();
					}
				},
				new BiConsumer<ListType, Long>() {
					@Override
					public void accept(ListType listType, Long listTypeId) {
						listType.setListTypeId(listTypeId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<ListType, String>() {
					@Override
					public String apply(ListType listType) {
						return listType.getName();
					}
				},
				new BiConsumer<ListType, String>() {
					@Override
					public void accept(ListType listType, String name) {
						listType.setName(name);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<ListType, String>() {
					@Override
					public String apply(ListType listType) {
						return listType.getType();
					}
				},
				new BiConsumer<ListType, String>() {
					@Override
					public void accept(ListType listType, String type) {
						listType.setType(type);
					}
				});
		}
	}

	private ListTypeModelAccessors() {
	}
}