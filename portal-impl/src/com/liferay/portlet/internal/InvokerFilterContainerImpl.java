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

package com.liferay.portlet.internal;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.portlet.InvokerFilterContainer;
import com.liferay.portal.kernel.util.ClassLoaderUtil;
import com.liferay.portal.kernel.util.ClassUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.PortletFilterImpl;
import com.liferay.portal.util.PropsValues;
import com.liferay.portlet.PortletFilterFactory;
import com.liferay.registry.Filter;
import com.liferay.registry.Registry;
import com.liferay.registry.RegistryUtil;
import com.liferay.registry.ServiceReference;
import com.liferay.registry.ServiceRegistration;
import com.liferay.registry.ServiceTracker;
import com.liferay.registry.ServiceTrackerCustomizer;

import java.io.Closeable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.portlet.PortletContext;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.filter.ActionFilter;
import javax.portlet.filter.EventFilter;
import javax.portlet.filter.FilterConfig;
import javax.portlet.filter.HeaderFilter;
import javax.portlet.filter.PortletFilter;
import javax.portlet.filter.RenderFilter;
import javax.portlet.filter.ResourceFilter;

/**
 * @author Raymond Augé
 * @author Neil Griffin
 */
public class InvokerFilterContainerImpl
	implements Closeable, InvokerFilterContainer {

	public static final InvokerFilterContainer EMPTY_INVOKER_FILTER_CONTAINER =
		new EmptyInvokerFilterContainer();

	public InvokerFilterContainerImpl(
			Portlet portlet, PortletContext portletContext)
		throws PortletException {

		_rootPortletId = portlet.getRootPortletId();

		_portletContext = portletContext;

		Registry registry = RegistryUtil.getRegistry();

		Map<String, Object> properties = new HashMap<>();

		properties.put("javax.portlet.name", _rootPortletId);
		properties.put("preinitialized.filter", Boolean.TRUE);

		Map<String, com.liferay.portal.kernel.model.PortletFilter>
			portletFilters = portlet.getPortletFilters();

		for (Map.Entry<String, com.liferay.portal.kernel.model.PortletFilter>
				entry : portletFilters.entrySet()) {

			com.liferay.portal.kernel.model.PortletFilter portletFilterModel =
				entry.getValue();

			PortletFilter portletFilter = PortletFilterFactory.create(
				portletFilterModel, _portletContext);

			Map<String, Object> portletFilterProperties = new HashMap<>();

			portletFilterProperties.putAll(properties);

			portletFilterProperties.put(
				"filter.lifecycles", portletFilterModel.getLifecycles());

			ServiceRegistration<PortletFilter> serviceRegistration =
				registry.registerService(
					PortletFilter.class, portletFilter,
					portletFilterProperties);

			ServiceRegistrationTuple serviceRegistrationTuple =
				new ServiceRegistrationTuple(
					portletFilterModel, serviceRegistration);

			_serviceRegistrationTuples.add(serviceRegistrationTuple);
		}

		ClassLoader classLoader = ClassLoaderUtil.getContextClassLoader();

		try {
			ClassLoaderUtil.setContextClassLoader(
				ClassLoaderUtil.getPortalClassLoader());

			for (String portletFilterClassName :
					PropsValues.PORTLET_FILTERS_SYSTEM) {

				com.liferay.portal.kernel.model.PortletFilter
					portletFilterModel = new PortletFilterImpl(
						portletFilterClassName, portletFilterClassName,
						Collections.<String>emptySet(),
						Collections.<String, String>emptyMap(),
						portlet.getPortletApp());

				PortletFilter portletFilter = PortletFilterFactory.create(
					portletFilterModel, _portletContext);

				ServiceRegistration<PortletFilter> serviceRegistration =
					registry.registerService(
						PortletFilter.class, portletFilter, properties);

				_serviceRegistrationTuples.add(
					new ServiceRegistrationTuple(
						portletFilterModel, serviceRegistration));
			}
		}
		finally {
			ClassLoaderUtil.setContextClassLoader(classLoader);
		}
	}

	@Override
	public void close() {
		for (ServiceRegistrationTuple serviceRegistrationTuple :
				_serviceRegistrationTuples) {

			PortletFilterFactory.destroy(
				serviceRegistrationTuple.getPortletFilterModel());

			ServiceRegistration<PortletFilter> serviceRegistration =
				serviceRegistrationTuple.getServiceRegistration();

			serviceRegistration.unregister();
		}

		_serviceRegistrationTuples.clear();

		if (_serviceTracker != null) {
			_serviceTracker.close();
		}

		_actionFilters.clear();
		_eventFilters.clear();
		_headerFilters.clear();
		_renderFilters.clear();
		_resourceFilters.clear();
	}

	@Override
	public List<ActionFilter> getActionFilters() {
		_initFilters();

		return _actionFilters;
	}

	@Override
	public List<EventFilter> getEventFilters() {
		_initFilters();

		return _eventFilters;
	}

	@Override
	public List<HeaderFilter> getHeaderFilters() {
		_initFilters();

		return _headerFilters;
	}

	@Override
	public List<RenderFilter> getRenderFilters() {
		_initFilters();

		return _renderFilters;
	}

	@Override
	public List<ResourceFilter> getResourceFilters() {
		_initFilters();

		return _resourceFilters;
	}

	private void _initFilters() {
		if (_serviceTracker == null) {
			synchronized (this) {
				if (_serviceTracker != null) {
					return;
				}

				Registry registry = RegistryUtil.getRegistry();

				Filter filter = registry.getFilter(
					StringBundler.concat(
						"(&(javax.portlet.name=", _rootPortletId,
						")(objectClass=", PortletFilter.class.getName(), "))"));

				_serviceTracker = registry.trackServices(
					filter,
					new PortletFilterServiceTrackerCustomizer(_portletContext));

				_serviceTracker.open();
			}
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		InvokerFilterContainerImpl.class);

	private final List<ActionFilter> _actionFilters =
		new CopyOnWriteArrayList<>();
	private final List<EventFilter> _eventFilters =
		new CopyOnWriteArrayList<>();
	private final List<HeaderFilter> _headerFilters =
		new CopyOnWriteArrayList<>();
	private final PortletContext _portletContext;
	private final List<RenderFilter> _renderFilters =
		new CopyOnWriteArrayList<>();
	private final List<ResourceFilter> _resourceFilters =
		new CopyOnWriteArrayList<>();
	private final String _rootPortletId;
	private final List<ServiceRegistrationTuple> _serviceRegistrationTuples =
		new CopyOnWriteArrayList<>();
	private volatile ServiceTracker<PortletFilter, PortletFilter>
		_serviceTracker;

	private static class EmptyInvokerFilterContainer
		implements Closeable, InvokerFilterContainer {

		@Override
		public void close() {
		}

		@Override
		public List<ActionFilter> getActionFilters() {
			return Collections.emptyList();
		}

		@Override
		public List<EventFilter> getEventFilters() {
			return Collections.emptyList();
		}

		@Override
		public List<HeaderFilter> getHeaderFilters() {
			return Collections.emptyList();
		}

		@Override
		public List<RenderFilter> getRenderFilters() {
			return Collections.emptyList();
		}

		@Override
		public List<ResourceFilter> getResourceFilters() {
			return Collections.emptyList();
		}

	}

	private static class ServiceRegistrationTuple {

		public ServiceRegistrationTuple(
			com.liferay.portal.kernel.model.PortletFilter portletFilterModel,
			ServiceRegistration<PortletFilter> serviceRegistration) {

			_portletFilterModel = portletFilterModel;
			_serviceRegistration = serviceRegistration;
		}

		public com.liferay.portal.kernel.model.PortletFilter
			getPortletFilterModel() {

			return _portletFilterModel;
		}

		public ServiceRegistration<PortletFilter> getServiceRegistration() {
			return _serviceRegistration;
		}

		private final com.liferay.portal.kernel.model.PortletFilter
			_portletFilterModel;
		private final ServiceRegistration<PortletFilter> _serviceRegistration;

	}

	private class PortletFilterServiceTrackerCustomizer
		implements ServiceTrackerCustomizer<PortletFilter, PortletFilter> {

		public PortletFilterServiceTrackerCustomizer(
			PortletContext portletContext) {

			_portletContext = portletContext;
		}

		@Override
		public PortletFilter addingService(
			ServiceReference<PortletFilter> serviceReference) {

			Registry registry = RegistryUtil.getRegistry();

			PortletFilter portletFilter = registry.getService(serviceReference);

			boolean preinitializedFilter = GetterUtil.getBoolean(
				serviceReference.getProperty("preinitialized.filter"));

			if (!preinitializedFilter) {
				String filterName = GetterUtil.getString(
					serviceReference.getProperty("service.id"),
					ClassUtil.getClassName(portletFilter));

				Map<String, String> params = new HashMap<>();

				for (String key : serviceReference.getPropertyKeys()) {
					if (!key.startsWith("javax.portlet.init-param.")) {
						continue;
					}

					params.put(
						key.substring("javax.portlet.init-param.".length()),
						GetterUtil.getString(
							serviceReference.getProperty(key)));
				}

				FilterConfig filterConfig = new FilterConfigImpl(
					filterName, _portletContext, params);

				try {
					portletFilter.init(filterConfig);
				}
				catch (PortletException pe) {
					_log.error(pe, pe);

					registry.ungetService(serviceReference);

					return null;
				}
			}

			Set<String> lifecycles = (Set<String>)serviceReference.getProperty(
				"filter.lifecycles");

			if ((portletFilter instanceof ActionFilter) &&
				_isDeclaredLifecycle(PortletRequest.ACTION_PHASE, lifecycles)) {

				_actionFilters.add((ActionFilter)portletFilter);
			}

			if ((portletFilter instanceof EventFilter) &&
				_isDeclaredLifecycle(PortletRequest.EVENT_PHASE, lifecycles)) {

				_eventFilters.add((EventFilter)portletFilter);
			}

			if ((portletFilter instanceof HeaderFilter) &&
				_isDeclaredLifecycle(PortletRequest.HEADER_PHASE, lifecycles)) {

				_headerFilters.add((HeaderFilter)portletFilter);
			}

			if ((portletFilter instanceof RenderFilter) &&
				_isDeclaredLifecycle(PortletRequest.RENDER_PHASE, lifecycles)) {

				_renderFilters.add((RenderFilter)portletFilter);
			}

			if ((portletFilter instanceof ResourceFilter) &&
				_isDeclaredLifecycle(
					PortletRequest.RESOURCE_PHASE, lifecycles)) {

				_resourceFilters.add((ResourceFilter)portletFilter);
			}

			return portletFilter;
		}

		@Override
		public void modifiedService(
			ServiceReference<PortletFilter> serviceReference,
			PortletFilter portletFilter) {
		}

		@Override
		public void removedService(
			ServiceReference<PortletFilter> serviceReference,
			PortletFilter portletFilter) {

			Registry registry = RegistryUtil.getRegistry();

			registry.ungetService(serviceReference);

			_actionFilters.remove(portletFilter);
			_eventFilters.remove(portletFilter);
			_headerFilters.remove(portletFilter);
			_renderFilters.remove(portletFilter);
			_resourceFilters.remove(portletFilter);

			boolean preinitializedFilter = GetterUtil.getBoolean(
				serviceReference.getProperty("preinitialized.filter"));

			if (preinitializedFilter) {
				return;
			}

			portletFilter.destroy();
		}

		private boolean _isDeclaredLifecycle(
			String lifecycle, Set<String> lifecycles) {

			if ((lifecycles == null) || lifecycles.isEmpty()) {
				return true;
			}

			return lifecycles.contains(lifecycle);
		}

		private final PortletContext _portletContext;

	}

}