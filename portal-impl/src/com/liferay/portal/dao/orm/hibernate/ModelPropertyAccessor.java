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

package com.liferay.portal.dao.orm.hibernate;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

import org.hibernate.engine.SessionFactoryImplementor;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.property.Getter;
import org.hibernate.property.PropertyAccessor;
import org.hibernate.property.Setter;

/**
 * @author Preston Crary
 */
public class ModelPropertyAccessor implements PropertyAccessor {

	@Override
	public Getter getGetter(Class clazz, String propertyName) {
		return _modelPropertyGetterSetter;
	}

	@Override
	public Setter getSetter(Class clazz, String propertyName) {
		return _modelPropertyGetterSetter;
	}

	protected <M, T> ModelPropertyAccessor(
		Function<M, T> getterFunction, BiConsumer<M, T> setterBiConsumer) {

		_modelPropertyGetterSetter = new ModelPropertyGetterSetter(
			getterFunction, setterBiConsumer);
	}

	private final ModelPropertyGetterSetter _modelPropertyGetterSetter;

	private static class ModelPropertyGetterSetter implements Getter, Setter {

		@Override
		public Object get(Object target) {
			return _getterFunction.apply(target);
		}

		@Override
		public Object getForInsert(
			Object target, Map mergeMap,
			SessionImplementor sessionImplementor) {

			return get(target);
		}

		@Override
		public Member getMember() {
			return null;
		}

		@Override
		public Method getMethod() {
			return null;
		}

		@Override
		public String getMethodName() {
			return null;
		}

		@Override
		public Class getReturnType() {
			return null;
		}

		@Override
		public void set(
			Object target, Object value,
			SessionFactoryImplementor sessionFactoryImplementor) {

			_setterBiConsumer.accept(target, value);
		}

		@SuppressWarnings("unchecked")
		private <M, T> ModelPropertyGetterSetter(
			Function<M, T> getterFunction, BiConsumer<M, T> setterBiConsumer) {

			_getterFunction = (Function<Object, Object>)getterFunction;
			_setterBiConsumer = (BiConsumer<Object, Object>)setterBiConsumer;
		}

		private final Function<Object, Object> _getterFunction;
		private final BiConsumer<Object, Object> _setterBiConsumer;

	}

}