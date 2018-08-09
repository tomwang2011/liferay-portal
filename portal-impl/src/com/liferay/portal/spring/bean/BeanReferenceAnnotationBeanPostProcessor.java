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

package com.liferay.portal.spring.bean;

import com.liferay.portal.internal.cluster.ClusterableAdvice;
import com.liferay.portal.kernel.bean.BeanLocatorException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.util.AggregateClassLoader;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.PrintWriter;
import java.io.StringWriter;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

/**
 * @author Michael Young
 * @author Shuyang Zhou
 */
public class BeanReferenceAnnotationBeanPostProcessor
	implements BeanFactoryAware, BeanPostProcessor {

	public BeanReferenceAnnotationBeanPostProcessor() {
		if (_log.isDebugEnabled()) {
			_log.debug("Creating instance " + hashCode());
		}
	}

	public BeanReferenceAnnotationBeanPostProcessor(BeanFactory beanFactory) {
		this();

		_beanFactory = beanFactory;
	}

	public void destroy() {
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
		throws BeansException {

		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
		throws BeansException {

		if (!(bean instanceof IdentifiableOSGiService) &&
			beanName.endsWith("Service") && _log.isWarnEnabled()) {

			_log.warn(
				StringBundler.concat(
					beanName, " should implement ",
					IdentifiableOSGiService.class.getName(), " for ",
					ClusterableAdvice.class.getName()));
		}

		_autoInject(bean, beanName, bean.getClass());

		return bean;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		_beanFactory = beanFactory;
	}

	private void _autoInject(
		Object targetBean, String targetBeanName, Class<?> beanClass) {

		if ((beanClass == null) || beanClass.isInterface()) {
			return;
		}

		String className = beanClass.getName();

		if (className.equals(_JAVA_LANG_OBJECT) ||
			className.startsWith(_ORG_SPRINGFRAMEWORK)) {

			return;
		}

		Field[] fields = beanClass.getDeclaredFields();

		for (Field field : fields) {
			BeanReference beanReference = field.getAnnotation(
				BeanReference.class);

			if (beanReference == null) {
				continue;
			}

			final String referencedBeanName;
			Class<?> referencedBeanType = beanReference.type();

			if (Object.class.equals(referencedBeanType)) {
				referencedBeanName = beanReference.name();
			}
			else {
				referencedBeanName = referencedBeanType.getName();
			}

			try {
				ReflectionUtils.makeAccessible(field);

				Class<?> clazz = field.getType();

				if (clazz.isInterface()) {
					AggregateClassLoader aggregateClassLoader =
						new AggregateClassLoader(
							PortalClassLoaderUtil.getClassLoader());

					aggregateClassLoader.addClassLoader(clazz.getClassLoader());

					Queue<Class<?>> queue = new LinkedList<>();

					queue.add(clazz);

					Class<?> currentClass = null;

					while (null != (currentClass = queue.poll())) {
						aggregateClassLoader.addClassLoader(
							currentClass.getClassLoader());

						Collections.addAll(queue, currentClass.getInterfaces());
					}

					try {
						Object proxyInstance = ProxyUtil.newProxyInstance(
							aggregateClassLoader, new Class<?>[] {clazz},
							(proxy, method, args) -> {
								Object referencedBean = _getReferencedBean(
									referencedBeanName);

								field.set(targetBean, referencedBean);

								try {
									return method.invoke(referencedBean, args);
								}
								catch (InvocationTargetException ite) {
									throw ite.getCause();
								}
							});

						field.set(targetBean, proxyInstance);
					}
					catch (NoClassDefFoundError noClassDefFoundError) {
						throw new BeanCreationException(
							targetBeanName,
							"Could not inject BeanReference fields",
							noClassDefFoundError);
					}
				}
				else {
					field.set(
						targetBean, _getReferencedBean(referencedBeanName));
				}
			}
			catch (Throwable t) {
				throw new BeanCreationException(
					targetBeanName, "Could not inject BeanReference fields", t);
			}
		}

		_autoInject(targetBean, targetBeanName, beanClass.getSuperclass());
	}

	private Object _getReferencedBean(String referencedBeanName) {
		try {
			return _beanFactory.getBean(referencedBeanName);
		}
		catch (NoSuchBeanDefinitionException nsbde) {
			try {
				return PortalBeanLocatorUtil.locate(referencedBeanName);
			}
			catch (BeanLocatorException ble) {
				StringWriter stringWriter = new StringWriter();

				try (PrintWriter printWriter = new PrintWriter(stringWriter)) {
					printWriter.print("BeanFactory could not find bean: ");

					nsbde.printStackTrace(printWriter);

					printWriter.print(" and PortalBeanLocator failed with: ");

					printWriter.append(ble.getMessage());
				}

				throw new BeanLocatorException(stringWriter.toString(), ble);
			}
		}
	}

	private static final String _JAVA_LANG_OBJECT = "java.lang.Object";

	private static final String _ORG_SPRINGFRAMEWORK = "org.springframework";

	private static final Log _log = LogFactoryUtil.getLog(
		BeanReferenceAnnotationBeanPostProcessor.class);

	private BeanFactory _beanFactory;

}