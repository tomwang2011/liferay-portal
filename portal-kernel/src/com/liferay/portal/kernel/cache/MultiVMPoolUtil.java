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

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @author Michael Young
 */
@OSGiBeanProperties(service = MultiVMPoolUtil.class)
@ProviderType
public class MultiVMPoolUtil {

	public static void clear() {
		_dynamicPortalCacheManager.clearAll();
	}

	/**
	 * @deprecated As of Wilberforce (7.0.x), replaced by {@link
	 *             #getPortalCache(String)}
	 */
	@Deprecated
	public static <K extends Serializable, V extends Serializable>
		PortalCache<K, V> getCache(String portalCacheName) {

		return getPortalCache(portalCacheName);
	}

	/**
	 * @deprecated As of Wilberforce (7.0.x), replaced by {@link
	 *             #getPortalCache(String, boolean)}
	 */
	@Deprecated
	public static <K extends Serializable, V extends Serializable>
		PortalCache<K, V> getCache(String portalCacheName, boolean blocking) {

		return getPortalCache(portalCacheName, blocking);
	}

	/**
	 * @deprecated As of Wilberforce (7.0.x), replaced by {@link
	 *             #getPortalCacheManager()}
	 */
	@Deprecated
	public static <K extends Serializable, V extends Serializable>
		PortalCacheManager<K, V> getCacheManager() {

		return getPortalCacheManager();
	}

	public static <K extends Serializable, V extends Serializable>
		PortalCache<K, V> getPortalCache(String portalCacheName) {

		return (PortalCache<K, V>)_dynamicPortalCacheManager.getPortalCache(
			portalCacheName);
	}

	public static <K extends Serializable, V extends Serializable>
		PortalCache<K, V> getPortalCache(
			String portalCacheName, boolean blocking) {

		return (PortalCache<K, V>)_dynamicPortalCacheManager.getPortalCache(
			portalCacheName, blocking);
	}

	public static <K extends Serializable, V extends Serializable>
		PortalCache<K, V> getPortalCache(
			String portalCacheName, boolean blocking, boolean mvcc) {

		return (PortalCache<K, V>)_dynamicPortalCacheManager.getPortalCache(
			portalCacheName, blocking, mvcc);
	}

	public static <K extends Serializable, V extends Serializable>
		PortalCacheManager<K, V> getPortalCacheManager() {

		return (PortalCacheManager<K, V>)_dynamicPortalCacheManager;
	}

	/**
	 * @deprecated As of Wilberforce (7.0.x), replaced by {@link
	 *             #removePortalCache(String)}
	 */
	@Deprecated
	public static void removeCache(String portalCacheName) {
		removePortalCache(portalCacheName);
	}

	public static void removePortalCache(String portalCacheName) {
		_dynamicPortalCacheManager.removePortalCache(portalCacheName);
	}

	private static final DynamicPortalCacheManager
		<? extends Serializable, ? extends Serializable>
			_dynamicPortalCacheManager =
				new MultiVMDynamicPortalCacheManager<>();

}