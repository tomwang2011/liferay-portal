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

package com.liferay.external.data.source.test.model.impl.hibernate;

import com.liferay.external.data.source.test.model.TestEntity;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TestEntityModelAccessors {
	public static class IdAccessor extends ModelPropertyAccessor {
		public IdAccessor() {
			super(new Function<TestEntity, Long>() {
					@Override
					public Long apply(TestEntity testEntity) {
						return testEntity.getId();
					}
				},
				new BiConsumer<TestEntity, Long>() {
					@Override
					public void accept(TestEntity testEntity, Long id) {
						testEntity.setId(id);
					}
				});
		}
	}

	public static class DataAccessor extends ModelPropertyAccessor {
		public DataAccessor() {
			super(new Function<TestEntity, String>() {
					@Override
					public String apply(TestEntity testEntity) {
						return testEntity.getData();
					}
				},
				new BiConsumer<TestEntity, String>() {
					@Override
					public void accept(TestEntity testEntity, String data) {
						testEntity.setData(data);
					}
				});
		}
	}

	private TestEntityModelAccessors() {
	}
}