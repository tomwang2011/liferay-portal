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

package com.liferay.counter.model.impl.hibernate;

import com.liferay.counter.kernel.model.Counter;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CounterModelAccessors {
	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<Counter, String>() {
					@Override
					public String apply(Counter counter) {
						return counter.getName();
					}
				},
				new BiConsumer<Counter, String>() {
					@Override
					public void accept(Counter counter, String name) {
						counter.setName(name);
					}
				});
		}
	}

	public static class CurrentIdAccessor extends ModelPropertyAccessor {
		public CurrentIdAccessor() {
			super(new Function<Counter, Long>() {
					@Override
					public Long apply(Counter counter) {
						return counter.getCurrentId();
					}
				},
				new BiConsumer<Counter, Long>() {
					@Override
					public void accept(Counter counter, Long currentId) {
						counter.setCurrentId(currentId);
					}
				});
		}
	}

	private CounterModelAccessors() {
	}
}