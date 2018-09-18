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

package com.liferay.portal.aop.proxy.internal;

import java.util.Collection;
import java.util.Map;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.hooks.service.EventListenerHook;
import org.osgi.framework.hooks.service.FindHook;
import org.osgi.framework.hooks.service.ListenerHook;
import org.osgi.service.component.annotations.Component;

/**
 * @author Tina Tian
 */
@Component(
	immediate = true, service = {EventListenerHook.class, FindHook.class}
)
public class AopProxyHook implements EventListenerHook, FindHook {

	@Override
	public void event(
		ServiceEvent serviceEvent,
		Map<BundleContext, Collection<ListenerHook.ListenerInfo>> listeners) {
	}

	@Override
	public void find(
		BundleContext bundleContext, String name, String filter,
		boolean allServices,
		Collection<ServiceReference<?>> serviceReferences) {
	}

}