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

import com.liferay.portal.internal.spring.aop.MethodInvocationImpl;
import com.liferay.portal.kernel.spring.aop.AdvisedSupport;
import com.liferay.portal.kernel.spring.aop.AopProxy;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.transaction.TransactionsUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;

/**
 * @author Shuyang Zhou
 * @deprecated As of Judson (7.1.x), replaced by {@link MethodInterceptorProxyImpl}
 */
@Deprecated
public class ServiceBeanAopProxy
	implements AdvisedSupportProxy, AopProxy, InvocationHandler {

	/**
	 * @deprecated As of Judson (7.1.x), replaced by {@link AdvisedSupportUtil#
	 *             getAdvisedSupport(Object)}
	 */
	@Deprecated
	public static AdvisedSupport getAdvisedSupport(Object proxy)
		throws Exception {

		return AdvisedSupportUtil.getAdvisedSupport(proxy);
	}

	/**
	 * @deprecated As of Judson (7.1.x), replaced by {@link #ServiceBeanAopProxy(
	 *             AdvisedSupport, ServiceBeanAopCacheManager)}
	 */
	@Deprecated
	public ServiceBeanAopProxy(
		AdvisedSupport advisedSupport, MethodInterceptor methodInterceptor,
		ServiceBeanAopCacheManager serviceBeanAopCacheManager) {

		this(advisedSupport, new ServiceBeanAopCacheManager(methodInterceptor));
	}

	public ServiceBeanAopProxy(
		AdvisedSupport advisedSupport,
		ServiceBeanAopCacheManager serviceBeanAopCacheManager) {

		_advisedSupport = advisedSupport;
		_serviceBeanAopCacheManager = serviceBeanAopCacheManager;
	}

	@Override
	public AdvisedSupport getAdvisedSupport() {
		return new AdvisedSupport() {

			@Override
			public Class<?>[] getProxiedInterfaces() {
				return _advisedSupport.getProxiedInterfaces();
			}

			@Override
			public Object getTarget() {
				return _advisedSupport.getTarget();
			}

			@Override
			public void setTarget(Object target) {
				_advisedSupport.setTarget(target);

				_serviceBeanAopCacheManager.reset();
			}

			/**
			 * @deprecated As of Judson (7.1.x), with no direct replacement
			 */
			@Deprecated
			@Override
			public void setTarget(Object target, Class<?> targetClass) {
				setTarget(target);
			}

		};
	}

	@Override
	public Object getProxy(ClassLoader classLoader) {
		return ProxyUtil.newProxyInstance(
			classLoader, _advisedSupport.getProxiedInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] arguments)
		throws Throwable {

		MethodInvocationImpl methodInvocation = new MethodInvocationImpl(
			_advisedSupport.getTarget(), method, arguments);

		if (TransactionsUtil.isEnabled()) {
			methodInvocation.setMethodInterceptors(
				_serviceBeanAopCacheManager.getMethodInterceptors(
					methodInvocation));
		}
		else {
			methodInvocation.setMethodInterceptors(_emptyMethodInterceptors);
		}

		return methodInvocation.proceed();
	}

	public void setServiceBeanAopCacheManager(
		ServiceBeanAopCacheManager serviceBeanAopCacheManager) {

		_serviceBeanAopCacheManager = serviceBeanAopCacheManager;
	}

	/**
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	public interface PACL {

		public InvocationHandler getInvocationHandler(
			InvocationHandler invocationHandler, AdvisedSupport advisedSupport);

	}

	private static final MethodInterceptor[] _emptyMethodInterceptors =
		new MethodInterceptor[0];

	private final AdvisedSupport _advisedSupport;
	private volatile ServiceBeanAopCacheManager _serviceBeanAopCacheManager;

}