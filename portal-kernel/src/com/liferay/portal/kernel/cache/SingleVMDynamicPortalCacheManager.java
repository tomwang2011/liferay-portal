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

package com.liferay.portal.kernel.cache;

import com.liferay.registry.Registry;
import com.liferay.registry.RegistryUtil;
import com.liferay.registry.ServiceReference;
import com.liferay.registry.ServiceTracker;
import com.liferay.registry.ServiceTrackerFieldUpdaterCustomizer;

import java.io.Serializable;

/**
 * @author Tina Tian
 */
public class SingleVMDynamicPortalCacheManager
	<K extends Serializable, V extends Serializable>
		extends DynamicPortalCacheManager<K, V> {

	public SingleVMDynamicPortalCacheManager() {
		super(PortalCacheManagerNames.SINGLE_VM, false);
	}

	@Override
	protected ServiceTracker<?, ?> getServiceTracker() {
		Registry registry = RegistryUtil.getRegistry();

		return registry.trackServices(
			SingleVMPool.class, new SingleVMPoolServiceTrackerCustomizer());
	}

	protected class SingleVMPoolServiceTrackerCustomizer extends
		ServiceTrackerFieldUpdaterCustomizer
			<SingleVMPool, PortalCacheManager<K, V>> {

		@Override
		protected void beforeServiceUpdate(
			PortalCacheManager<K, V> oldPortalCacheManager,
			PortalCacheManager<K, V> newPortalCacheManager) {

			resetPortalCacheManager(newPortalCacheManager);
		}

		@Override
		protected PortalCacheManager<K, V> doAddingService(
			ServiceReference<SingleVMPool> serviceReference) {

			Registry registry = RegistryUtil.getRegistry();

			SingleVMPool singleVMPool = registry.getService(serviceReference);

			return (PortalCacheManager<K, V>)
				singleVMPool.getPortalCacheManager();
		}

		private SingleVMPoolServiceTrackerCustomizer() {
			super(
				PORTAL_CACHE_MANAGER_FIELD,
				SingleVMDynamicPortalCacheManager.this,
				(PortalCacheManager<K, V>)DUMMY_PORTAL_CACHE_MANAGER);
		}

	}

}