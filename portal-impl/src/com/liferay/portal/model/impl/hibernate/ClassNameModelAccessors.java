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
import com.liferay.portal.kernel.model.ClassName;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ClassNameModelAccessors {
	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<ClassName, Long>() {
					@Override
					public Long apply(ClassName className) {
						return className.getClassNameId();
					}
				},
				new BiConsumer<ClassName, Long>() {
					@Override
					public void accept(ClassName className, Long classNameId) {
						className.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ValueAccessor extends ModelPropertyAccessor {
		public ValueAccessor() {
			super(new Function<ClassName, String>() {
					@Override
					public String apply(ClassName className) {
						return className.getValue();
					}
				},
				new BiConsumer<ClassName, String>() {
					@Override
					public void accept(ClassName className, String value) {
						className.setValue(value);
					}
				});
		}
	}

	private ClassNameModelAccessors() {
	}
}