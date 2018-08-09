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
public class MultiVMDynamicPortalCacheManager
	<K extends Serializable, V extends Serializable>
		extends DynamicPortalCacheManager<K, V> {

	public MultiVMDynamicPortalCacheManager() {
		super(PortalCacheManagerNames.MULTI_VM, true);
	}

	@Override
	protected ServiceTracker<?, ?> getServiceTracker() {
		Registry registry = RegistryUtil.getRegistry();

		return registry.trackServices(
			MultiVMPool.class, new MultiVMPoolServiceTrackerCustomizer());
	}

	protected class MultiVMPoolServiceTrackerCustomizer extends
		ServiceTrackerFieldUpdaterCustomizer
			<MultiVMPool, PortalCacheManager<K, V>> {

		@Override
		protected void beforeServiceUpdate(
			PortalCacheManager<K, V> oldPortalCacheManager,
			PortalCacheManager<K, V> newPortalCacheManager) {

			resetPortalCacheManager(newPortalCacheManager);
		}

		@Override
		protected PortalCacheManager<K, V> doAddingService(
			ServiceReference<MultiVMPool> serviceReference) {

			Registry registry = RegistryUtil.getRegistry();

			MultiVMPool multiVMPool = registry.getService(serviceReference);

			return (PortalCacheManager<K, V>)
				multiVMPool.getPortalCacheManager();
		}

		private MultiVMPoolServiceTrackerCustomizer() {
			super(
				PORTAL_CACHE_MANAGER_FIELD,
				MultiVMDynamicPortalCacheManager.this,
				(PortalCacheManager<K, V>)DUMMY_PORTAL_CACHE_MANAGER);
		}

	}

}