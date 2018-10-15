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

package com.liferay.portal.search;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.search.IndexWriterHelperUtil;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.spring.aop.AnnotatedMethodInterceptor;
import com.liferay.portal.spring.aop.MethodInterceptorFactory;
import com.liferay.portal.spring.aop.MethodInterceptorFactoryHelper;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author Shuyang Zhou
 * @author Preston Crary
 */
public class IndexableMethodInterceptorFactory
	implements MethodInterceptorFactory {

	@Override
	public MethodInterceptor create(
		MethodInterceptorFactoryHelper methodInterceptorFactoryHelper) {

		return new IndexableMethodInterceptor();
	}

	@Override
	public Class<Indexable> getAnnotationClass() {
		return Indexable.class;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		IndexableMethodInterceptorFactory.class);

	private static class IndexableMethodInterceptor
		extends AnnotatedMethodInterceptor<Indexable> {

		@Override
		public void afterReturning(
				MethodInvocation methodInvocation, Object result)
			throws Throwable {

			if (result == null) {
				return;
			}

			if (CompanyThreadLocal.isDeleteInProcess() ||
				IndexWriterHelperUtil.isIndexReadOnly()) {

				if (_log.isDebugEnabled()) {
					if (CompanyThreadLocal.isDeleteInProcess()) {
						_log.debug(
							"Skip indexing because company delete is in " +
								"process");
					}
					else if (IndexWriterHelperUtil.isIndexReadOnly()) {
						_log.debug(
							"Skip indexing because the index is read only");
					}
				}

				return;
			}

			Indexable indexable = findAnnotation(methodInvocation);

			if (indexable == null) {
				return;
			}

			Method method = methodInvocation.getMethod();

			Class<?> returnType = method.getReturnType();

			if (!BaseModel.class.isAssignableFrom(returnType)) {
				if (_log.isWarnEnabled()) {
					_log.warn(
						methodInvocation +
							" does not have a valid return type");
				}

				return;
			}

			Indexer<Object> indexer = IndexerRegistryUtil.getIndexer(
				returnType.getName());

			if (indexer == null) {
				methodInterceptorCache.removeMethodInterceptor(
					methodInvocation, this);

				return;
			}

			if (IndexWriterHelperUtil.isIndexReadOnly(indexer.getClassName())) {
				if (_log.isDebugEnabled()) {
					_log.debug(
						"Skipping indexing read only index for " +
							indexer.getClassName());
				}

				return;
			}

			Object[] arguments = methodInvocation.getArguments();

			for (int i = arguments.length - 1; i >= 0; i--) {
				if (arguments[i] instanceof ServiceContext) {
					ServiceContext serviceContext =
						(ServiceContext)arguments[i];

					if (serviceContext.isIndexingEnabled()) {
						break;
					}

					return;
				}
			}

			if (indexable.type() == IndexableType.DELETE) {
				indexer.delete(result);
			}
			else {
				indexer.reindex(result);
			}
		}

	}

}