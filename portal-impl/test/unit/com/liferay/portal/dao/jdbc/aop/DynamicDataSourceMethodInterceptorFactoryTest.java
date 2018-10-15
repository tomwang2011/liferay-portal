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

package com.liferay.portal.dao.jdbc.aop;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.internal.spring.aop.MethodInterceptorCacheImpl;
import com.liferay.portal.internal.spring.aop.MethodInvocationImpl;
import com.liferay.portal.kernel.dao.jdbc.aop.DynamicDataSourceTargetSource;
import com.liferay.portal.kernel.dao.jdbc.aop.MasterDataSource;
import com.liferay.portal.kernel.dao.jdbc.aop.Operation;
import com.liferay.portal.kernel.test.rule.CodeCoverageAssertor;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.InfrastructureUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.spring.aop.AnnotatedMethodInterceptor;
import com.liferay.portal.spring.aop.MethodInterceptorFactoryHelper;
import com.liferay.portal.spring.transaction.TransactionExecutor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import java.util.Collections;
import java.util.Stack;

import javax.sql.DataSource;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;

/**
 * @author Shuyang Zhou
 */
public class DynamicDataSourceMethodInterceptorFactoryTest {

	@ClassRule
	public static final CodeCoverageAssertor codeCoverageAssertor =
		CodeCoverageAssertor.INSTANCE;

	@Before
	public void setUp() {
		ClassLoader classLoader =
			DynamicDataSourceMethodInterceptorFactoryTest.class.
				getClassLoader();

		InvocationHandler invocationHandler = (proxy, method, args) -> {
			throw new UnsupportedOperationException();
		};

		_dynamicDataSourceTargetSource =
			new DefaultDynamicDataSourceTargetSource();

		_readDataSource = (DataSource)ProxyUtil.newProxyInstance(
			classLoader, new Class<?>[] {DataSource.class}, invocationHandler);

		_dynamicDataSourceTargetSource.setReadDataSource(_readDataSource);

		_writeDataSource = (DataSource)ProxyUtil.newProxyInstance(
			classLoader, new Class<?>[] {DataSource.class}, invocationHandler);

		_dynamicDataSourceTargetSource.setWriteDataSource(_writeDataSource);

		InfrastructureUtil infrastructureUtil = new InfrastructureUtil();

		infrastructureUtil.setDynamicDataSourceTargetSource(
			_dynamicDataSourceTargetSource);

		DynamicDataSourceMethodInterceptorFactory
			dynamicDataSourceMethodInterceptorFactory =
				new DynamicDataSourceMethodInterceptorFactory();

		_annotatedMethodInterceptor =
			(AnnotatedMethodInterceptor<?>)
				dynamicDataSourceMethodInterceptorFactory.create(
					new MethodInterceptorFactoryHelper() {

						@Override
						public <T> T getService(Class<T> serviceClass) {
							Assert.assertSame(
								TransactionExecutor.class, serviceClass);

							return null;
						}

					});

		MethodInterceptorCacheImpl methodInterceptorCache =
			new MethodInterceptorCacheImpl();

		MethodInterceptor[] methodInterceptors = new MethodInterceptor[1];

		methodInterceptors[0] = _annotatedMethodInterceptor;

		methodInterceptorCache.setMethodInterceptorsAndAnnotationTypes(
			methodInterceptors, methodInterceptors,
			Collections.singleton(
				dynamicDataSourceMethodInterceptorFactory.
					getAnnotationClass()));

		_annotatedMethodInterceptor.setMethodInterceptorCache(
			methodInterceptorCache);
	}

	@Test
	public void testDynamicDataSourceAdvice() throws Throwable {
		TestClass testClass = new TestClass();

		for (int i = 1; i <= 6; i++) {
			MethodInvocation methodInvocation = createMethodInvocation(
				testClass, "method" + i);

			methodInvocation.proceed();
		}

		testClass.assertExecutions();
	}

	protected MethodInvocation createMethodInvocation(
			TestClass testClass, String methodName)
		throws Exception {

		Method method = TestClass.class.getMethod(methodName);

		MethodInvocationImpl methodInvocation = new MethodInvocationImpl(
			testClass, method, new Object[0]);

		methodInvocation.setMethodInterceptors(
			new MethodInterceptor[] {_annotatedMethodInterceptor});

		return methodInvocation;
	}

	private AnnotatedMethodInterceptor<?> _annotatedMethodInterceptor;
	private DynamicDataSourceTargetSource _dynamicDataSourceTargetSource;
	private DataSource _readDataSource;
	private DataSource _writeDataSource;

	private class TestClass {

		public void assertExecutions() {
			Assert.assertTrue(_testMethod1);
			Assert.assertTrue(_testMethod2);
			Assert.assertTrue(_testMethod3);
			Assert.assertTrue(_testMethod4);
			Assert.assertTrue(_testMethod5);
			Assert.assertTrue(_testMethod6);
		}

		@SuppressWarnings("unused")
		public void method1() throws Exception {
			Assert.assertEquals(
				Operation.WRITE, _dynamicDataSourceTargetSource.getOperation());
			Assert.assertSame(
				_writeDataSource, _dynamicDataSourceTargetSource.getTarget());
			Assert.assertEquals(
				TestClass.class.getName() + StringPool.PERIOD + "method1",
				_getCurrentMethod());

			_testMethod1 = true;
		}

		@Transactional
		public void method2() throws Exception {
			Assert.assertEquals(
				Operation.WRITE, _dynamicDataSourceTargetSource.getOperation());
			Assert.assertSame(
				_writeDataSource, _dynamicDataSourceTargetSource.getTarget());
			Assert.assertEquals(
				TestClass.class.getName() + StringPool.PERIOD + "method2",
				_getCurrentMethod());

			_testMethod2 = true;
		}

		@Transactional(readOnly = true)
		public void method3() throws Exception {
			Assert.assertEquals(
				Operation.READ, _dynamicDataSourceTargetSource.getOperation());
			Assert.assertSame(
				_readDataSource, _dynamicDataSourceTargetSource.getTarget());
			Assert.assertEquals(
				TestClass.class.getName() + StringPool.PERIOD + "method3",
				_getCurrentMethod());

			_testMethod3 = true;
		}

		@MasterDataSource
		@Transactional
		public void method4() throws Exception {
			Assert.assertEquals(
				Operation.WRITE, _dynamicDataSourceTargetSource.getOperation());
			Assert.assertSame(
				_writeDataSource, _dynamicDataSourceTargetSource.getTarget());
			Assert.assertEquals(
				TestClass.class.getName() + StringPool.PERIOD + "method4",
				_getCurrentMethod());

			_testMethod4 = true;
		}

		@MasterDataSource
		@Transactional(readOnly = true)
		public void method5() throws Exception {
			Assert.assertEquals(
				Operation.WRITE, _dynamicDataSourceTargetSource.getOperation());
			Assert.assertSame(
				_writeDataSource, _dynamicDataSourceTargetSource.getTarget());
			Assert.assertEquals(
				TestClass.class.getName() + StringPool.PERIOD + "method5",
				_getCurrentMethod());

			_testMethod5 = true;
		}

		@Transactional(readOnly = true)
		public void method6() throws Throwable {
			MethodInvocation methodInvocation = createMethodInvocation(
				this, "method3");

			methodInvocation.proceed();

			Assert.assertEquals(
				Operation.READ, _dynamicDataSourceTargetSource.getOperation());
			Assert.assertSame(
				_readDataSource, _dynamicDataSourceTargetSource.getTarget());
			Assert.assertEquals(
				TestClass.class.getName() + StringPool.PERIOD + "method6",
				_getCurrentMethod());

			methodInvocation = createMethodInvocation(this, "method1");

			methodInvocation.proceed();

			Assert.assertEquals(
				Operation.WRITE, _dynamicDataSourceTargetSource.getOperation());
			Assert.assertSame(
				_writeDataSource, _dynamicDataSourceTargetSource.getTarget());
			Assert.assertEquals(
				TestClass.class.getName() + StringPool.PERIOD + "method6",
				_getCurrentMethod());

			_testMethod6 = true;
		}

		private String _getCurrentMethod() {
			Stack<String> stack =
				_dynamicDataSourceTargetSource.getMethodStack();

			return stack.peek();
		}

		private boolean _testMethod1;
		private boolean _testMethod2;
		private boolean _testMethod3;
		private boolean _testMethod4;
		private boolean _testMethod5;
		private boolean _testMethod6;

	}

}