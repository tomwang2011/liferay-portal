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

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.lang.reflect.Field;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

/**
 * @author Shuyang Zhou
 * @deprecated As of Judson (7.1.x), with no direct replacement
 */
@Deprecated
public class BeanReferenceRefreshUtil {

	public static void refresh(BeanFactory beanFactory) throws Exception {
		BeanRegistrations beanRegistrations = _registeredRefreshPoints.remove(
			beanFactory);

		if (beanRegistrations == null) {
			return;
		}

		beanRegistrations.refresh();
	}

	public static void registerRefreshPoint(
		BeanFactory beanFactory, Object targetBean, Field field,
		String referencedBeanName) {

		BeanRegistrations beanRegistrations = _registeredRefreshPoints.get(
			beanFactory);

		if (beanRegistrations == null) {
			beanRegistrations = new BeanRegistrations(beanFactory);

			_registeredRefreshPoints.put(beanFactory, beanRegistrations);
		}

		beanRegistrations.addRefreshPoint(
			targetBean, field, referencedBeanName);
	}

	/**
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	public interface PACL {

		public Object getNewReferencedBean(
			String referencedBeanName, BeanFactory beanFactory);

	}

	private static final Log _log = LogFactoryUtil.getLog(
		BeanReferenceRefreshUtil.class);

	private static final Map<BeanFactory, BeanRegistrations>
		_registeredRefreshPoints = new IdentityHashMap<>();

	private static class BeanRegistrations {

		public BeanRegistrations(BeanFactory beanFactory) {
			_beanFactory = beanFactory;
		}

		public void addRefreshPoint(
			Object bean, Field field, String referencedBeanName) {

			List<RefreshPoint> refreshPoints = _beansToRefresh.get(bean);

			if (refreshPoints == null) {
				refreshPoints = new ArrayList<>();

				_beansToRefresh.put(bean, refreshPoints);
			}

			refreshPoints.add(new RefreshPoint(field, referencedBeanName));
		}

		public void refresh() throws Exception {
			for (Map.Entry<Object, List<RefreshPoint>> entry :
					_beansToRefresh.entrySet()) {

				_refresh(entry.getKey(), entry.getValue());
			}
		}

		private void _refresh(
				Object targetBean, List<RefreshPoint> refreshPoints)
			throws Exception {

			for (RefreshPoint refreshPoint : refreshPoints) {
				_refresh(targetBean, refreshPoint);
			}
		}

		private void _refresh(Object targetBean, RefreshPoint refreshPoint)
			throws Exception {

			Field field = refreshPoint._field;

			Object oldReferenceBean = field.get(targetBean);

			String referencedBeanName = refreshPoint._referencedBeanName;

			Object newReferencedBean = null;

			try {
				newReferencedBean = _beanFactory.getBean(referencedBeanName);
			}
			catch (NoSuchBeanDefinitionException nsbde) {
				if (_log.isInfoEnabled()) {
					_log.info(
						StringBundler.concat(
							"Bean ", referencedBeanName, " may be defined in ",
							"the portal"));
				}

				newReferencedBean = PortalBeanLocatorUtil.locate(
					referencedBeanName);
			}

			if (oldReferenceBean == newReferencedBean) {
				return;
			}

			field.set(targetBean, newReferencedBean);

			if (_log.isDebugEnabled()) {
				_log.debug(
					StringBundler.concat(
						"Refreshed field ", String.valueOf(field),
						" with old value ", String.valueOf(oldReferenceBean),
						" with new value ", String.valueOf(newReferencedBean),
						" on bean ", String.valueOf(targetBean)));
			}
		}

		private final BeanFactory _beanFactory;
		private final Map<Object, List<RefreshPoint>> _beansToRefresh =
			new IdentityHashMap<>();

	}

	private static class RefreshPoint {

		public RefreshPoint(Field field, String referencedBeanName) {
			_field = field;
			_referencedBeanName = referencedBeanName;
		}

		private final Field _field;
		private final String _referencedBeanName;

	}

}