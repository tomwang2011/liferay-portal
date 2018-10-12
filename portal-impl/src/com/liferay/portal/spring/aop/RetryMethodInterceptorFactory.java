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
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.RetryAcceptor;
import com.liferay.portal.kernel.spring.aop.Property;
import com.liferay.portal.kernel.spring.aop.Retry;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.util.PropsValues;

import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author Matthew Tambara
 * @author Preston Crary
 */
public class RetryMethodInterceptorFactory implements MethodInterceptorFactory {

	@Override
	public MethodInterceptor create(
		MethodInterceptorFactoryHelper methodInterceptorFactoryHelper) {

		return new RetryMethodInterceptor();
	}

	@Override
	public Class<Retry> getAnnotationClass() {
		return Retry.class;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		RetryMethodInterceptorFactory.class);

	private static class RetryMethodInterceptor
		extends AnnotatedMethodInterceptor<Retry> {

		@Override
		public Object invoke(MethodInvocation methodInvocation)
			throws Throwable {

			Retry retry = findAnnotation(methodInvocation);

			if (retry == null) {
				return methodInvocation.proceed();
			}

			int retries = retry.retries();

			if (retries < 0) {
				retries = PropsValues.RETRY_ADVICE_MAX_RETRIES;
			}

			int totalRetries = retries;

			if (retries >= 0) {
				retries++;
			}

			Map<String, String> properties = new HashMap<>();

			for (Property property : retry.properties()) {
				properties.put(property.name(), property.value());
			}

			Class<? extends RetryAcceptor> clazz = retry.acceptor();

			RetryAcceptor retryAcceptor = clazz.newInstance();

			MethodInvocationImpl methodInvocationImpl =
				(MethodInvocationImpl)methodInvocation;

			methodInvocationImpl.mark();

			Object returnValue = null;
			Throwable throwable = null;

			while ((retries < 0) || (retries-- > 0)) {
				try {
					returnValue = methodInvocationImpl.proceed();

					if (!retryAcceptor.acceptResult(returnValue, properties)) {
						return returnValue;
					}

					if (_log.isWarnEnabled() && (retries != 0)) {
						String number = String.valueOf(retries);

						if (retries < 0) {
							number = "unlimited";
						}

						_log.warn(
							StringBundler.concat(
								"Retry on ", String.valueOf(methodInvocation),
								" for ", number, " more times due to result ",
								String.valueOf(returnValue)));
					}
				}
				catch (Throwable t) {
					throwable = t;

					if (!retryAcceptor.acceptException(t, properties)) {
						throw t;
					}

					if (_log.isWarnEnabled() && (retries != 0)) {
						String number = String.valueOf(retries);

						if (retries < 0) {
							number = "unlimited";
						}

						_log.warn(
							StringBundler.concat(
								"Retry on ", String.valueOf(methodInvocation),
								" for ", number,
								" more times due to exception ",
								String.valueOf(throwable)),
							throwable);
					}
				}

				methodInvocationImpl.reset();
			}

			if (throwable != null) {
				if (_log.isWarnEnabled()) {
					_log.warn(
						StringBundler.concat(
							"Give up retrying on ",
							String.valueOf(methodInvocation), " after ",
							String.valueOf(totalRetries),
							" retries and rethrow last retry's exception ",
							String.valueOf(throwable)),
						throwable);
				}

				throw throwable;
			}

			if (_log.isWarnEnabled()) {
				_log.warn(
					StringBundler.concat(
						"Give up retrying on ",
						String.valueOf(methodInvocation), " after ",
						String.valueOf(totalRetries),
						" retries and returning the last retry's result ",
						String.valueOf(returnValue)));
			}

			return returnValue;
		}

	}

}