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

import com.liferay.petra.memory.FinalizeAction;
import com.liferay.petra.memory.FinalizeManager;
import com.liferay.petra.reflect.ReflectionUtil;
import com.liferay.portal.kernel.util.ProxyFactory;
import com.liferay.registry.ServiceTracker;

import java.io.Serializable;

import java.lang.ref.Reference;
import java.lang.reflect.Field;

import java.net.URL;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author Tina Tian
 */
public abstract class DynamicPortalCacheManager<K extends Serializable, V>
	implements PortalCacheManager<K, V> {

	public DynamicPortalCacheManager(
		String portalCacheManagerName, boolean clusterAware) {

		_portalCacheManagerName = portalCacheManagerName;
		_clusterAware = clusterAware;

		_portalCacheManager =
			(PortalCacheManager<K, V>)DUMMY_PORTAL_CACHE_MANAGER;

		ServiceTracker<?, ?> serviceTracker = getServiceTracker();

		serviceTracker.open();

		FinalizeManager.register(
			this, new CloseServiceTrackerFinalizeAction(serviceTracker),
			FinalizeManager.PHANTOM_REFERENCE_FACTORY);
	}

	@Override
	public void clearAll() throws PortalCacheException {
		_portalCacheManager.clearAll();
	}

	@Override
	public void destroy() {
		for (DynamicPortalCache<K, V> dynamicPortalCache :
				_dynamicPortalCaches.values()) {

			dynamicPortalCache.destroy();
		}

		_dynamicPortalCaches.clear();

		_portalCacheManager.destroy();
	}

	@Override
	public PortalCache<K, V> getPortalCache(String portalCacheName)
		throws PortalCacheException {

		return getPortalCache(portalCacheName, false);
	}

	@Override
	public PortalCache<K, V> getPortalCache(
			String portalCacheName, boolean blocking)
		throws PortalCacheException {

		return getPortalCache(portalCacheName, blocking, false);
	}

	@Override
	public PortalCache<K, V> getPortalCache(
			String portalCacheName, boolean blocking, boolean mvcc)
		throws PortalCacheException {

		DynamicPortalCache<K, V> dynamicPortalCache = _dynamicPortalCaches.get(
			portalCacheName);

		if (dynamicPortalCache != null) {
			return dynamicPortalCache;
		}

		dynamicPortalCache = new DynamicPortalCache<>(
			_portalCacheManager, portalCacheName, blocking, mvcc);

		DynamicPortalCache<K, V> previousPortalCache =
			_dynamicPortalCaches.putIfAbsent(
				portalCacheName, dynamicPortalCache);

		if (previousPortalCache != null) {
			return previousPortalCache;
		}

		return dynamicPortalCache;
	}

	@Override
	public Set<PortalCacheManagerListener> getPortalCacheManagerListeners() {
		if (_portalCacheManager == DUMMY_PORTAL_CACHE_MANAGER) {
			return Collections.unmodifiableSet(_portalCacheManagerListeners);
		}

		return _portalCacheManager.getPortalCacheManagerListeners();
	}

	@Override
	public String getPortalCacheManagerName() {
		return _portalCacheManagerName;
	}

	@Override
	public boolean isClusterAware() {
		return _clusterAware;
	}

	@Override
	public void reconfigurePortalCaches(URL configurationURL) {
		if (_portalCacheManager == DUMMY_PORTAL_CACHE_MANAGER) {
			throw new UnsupportedOperationException(
				"A real portal cache manager is missing now, please try later");
		}

		_portalCacheManager.reconfigurePortalCaches(configurationURL);
	}

	@Override
	public boolean registerPortalCacheManagerListener(
		PortalCacheManagerListener portalCacheManagerListener) {

		if ((_portalCacheManager == DUMMY_PORTAL_CACHE_MANAGER) ||
			_portalCacheManager.unregisterPortalCacheManagerListener(
				portalCacheManagerListener)) {

			_portalCacheManagerListeners.add(portalCacheManagerListener);

			return true;
		}

		return false;
	}

	@Override
	public void removePortalCache(String portalCacheName) {
		DynamicPortalCache<K, V> dynamicPortalCache =
			_dynamicPortalCaches.remove(portalCacheName);

		if (dynamicPortalCache != null) {
			dynamicPortalCache.destroy();
		}

		_portalCacheManager.removePortalCache(portalCacheName);
	}

	@Override
	public boolean unregisterPortalCacheManagerListener(
		PortalCacheManagerListener portalCacheManagerListener) {

		if ((_portalCacheManager == DUMMY_PORTAL_CACHE_MANAGER) ||
			_portalCacheManager.unregisterPortalCacheManagerListener(
				portalCacheManagerListener)) {

			_portalCacheManagerListeners.remove(portalCacheManagerListener);

			return true;
		}

		return false;
	}

	@Override
	public void unregisterPortalCacheManagerListeners() {
		_portalCacheManager.unregisterPortalCacheManagerListeners();

		_portalCacheManagerListeners.clear();
	}

	protected abstract ServiceTracker<?, ?> getServiceTracker();

	protected void resetPortalCacheManager(
		PortalCacheManager<K, V> portalCacheManager) {

		for (PortalCacheManagerListener portalCacheManagerListener :
				_portalCacheManagerListeners) {

			portalCacheManager.registerPortalCacheManagerListener(
				portalCacheManagerListener);
		}

		for (DynamicPortalCache<K, V> dynamicPortalCache :
				_dynamicPortalCaches.values()) {

			dynamicPortalCache.resetPortalCache(portalCacheManager);
		}
	}

	protected static final PortalCacheManager<? extends Serializable, ?>
		DUMMY_PORTAL_CACHE_MANAGER = ProxyFactory.newDummyInstance(
			PortalCacheManager.class);

	protected static final Field PORTAL_CACHE_MANAGER_FIELD;

	static {
		try {
			PORTAL_CACHE_MANAGER_FIELD = ReflectionUtil.getDeclaredField(
				DynamicPortalCacheManager.class, "_portalCacheManager");
		}
		catch (Exception e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	private final boolean _clusterAware;
	private final Map<String, DynamicPortalCache<K, V>> _dynamicPortalCaches =
		new ConcurrentHashMap<>();
	private volatile PortalCacheManager<K, V> _portalCacheManager;
	private final Set<PortalCacheManagerListener> _portalCacheManagerListeners =
		new CopyOnWriteArraySet<>();
	private final String _portalCacheManagerName;

	private static class CloseServiceTrackerFinalizeAction
		implements FinalizeAction {

		@Override
		public void doFinalize(Reference<?> reference) {
			_serviceTracker.close();
		}

		private CloseServiceTrackerFinalizeAction(
			ServiceTracker<?, ?> serviceTracker) {

			_serviceTracker = serviceTracker;
		}

		private final ServiceTracker<?, ?> _serviceTracker;

	}

}