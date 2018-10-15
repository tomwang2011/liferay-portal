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

package com.liferay.portal.spring.aop;

import com.liferay.portal.kernel.test.ReflectionTestUtil;
import com.liferay.portal.kernel.test.rule.CodeCoverageAssertor;
import com.liferay.registry.BasicRegistryImpl;
import com.liferay.registry.RegistryUtil;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import java.util.Arrays;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;

/**
 * @author Preston Crary
 */
public class MethodInterceptorCacheManagerTest {

	@ClassRule
	public static final CodeCoverageAssertor codeCoverageAssertor =
		new CodeCoverageAssertor();

	@Before
	public void setUp() {
		RegistryUtil.setRegistry(new BasicRegistryImpl());
	}

	@Test
	public void testConstructor() throws Exception {
		Constructor<?> constructor =
			MethodInterceptorCacheManager.class.getDeclaredConstructor();

		constructor.setAccessible(true);

		constructor.newInstance();
	}

	@Test
	public void testCreate() throws Exception {
		MethodInterceptorFactoryHelper methodInterceptorFactoryHelper =
			new MethodInterceptorFactoryHelper() {

				@Override
				public <T> T getService(Class<T> serviceClass) {
					return null;
				}

			};

		MethodInterceptorCache methodInterceptorCache =
			MethodInterceptorCacheManager.create(
				methodInterceptorFactoryHelper);

		MethodInterceptor[] methodInterceptors =
			methodInterceptorCache.getMethodInterceptors(
				new TestMethodInvocation(
					MethodInterceptorCacheManagerTest.class.getMethod(
						"testCreate")));

		Assert.assertEquals(
			Arrays.toString(methodInterceptors), 12, methodInterceptors.length);

		Map<MethodInterceptorCache, MethodInterceptorFactoryHelper> map =
			ReflectionTestUtil.getFieldValue(
				MethodInterceptorCacheManager.class,
				"_methodInterceptorCaches");

		Assert.assertEquals(
			methodInterceptorFactoryHelper, map.get(methodInterceptorCache));
	}

	@Test
	public void testDestroy() throws Exception {
		MethodInterceptorCache methodInterceptorCache =
			MethodInterceptorCacheManager.create(
				new MethodInterceptorFactoryHelper() {

					@Override
					public <T> T getService(Class<T> serviceClass) {
						return null;
					}

				});

		MethodInterceptorCacheManager.destroy(methodInterceptorCache);
	}

	private static final class TestMethodInvocation
		implements MethodInvocation {

		@Override
		public Object[] getArguments() {
			return new Object[0];
		}

		@Override
		public Method getMethod() {
			return _method;
		}

		@Override
		public Method getStaticPart() {
			return _method;
		}

		@Override
		public Object getThis() {
			return null;
		}

		@Override
		public Object proceed() throws Throwable {
			return null;
		}

		private TestMethodInvocation(Method method) {
			_method = method;
		}

		private final Method _method;

	}

}