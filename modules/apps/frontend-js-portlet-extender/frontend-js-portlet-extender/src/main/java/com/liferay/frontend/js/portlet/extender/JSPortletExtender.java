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

package com.liferay.frontend.js.portlet.extender;

import com.liferay.frontend.js.portlet.extender.internal.portlet.JSPortlet;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.InputStream;

import java.net.URL;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.portlet.Portlet;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.ServiceRegistration;
import org.osgi.framework.wiring.BundleCapability;
import org.osgi.framework.wiring.BundleWire;
import org.osgi.framework.wiring.BundleWiring;
import org.osgi.namespace.extender.ExtenderNamespace;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.tracker.BundleTracker;
import org.osgi.util.tracker.BundleTrackerCustomizer;

/**
 * @author Ray Augé
 * @author Iván Zaera Avellón
 */
@Component(immediate = true, service = {})
public class JSPortletExtender {

	@Activate
	public void activate(BundleContext context) {
		_bundleTracker = new BundleTracker<>(
			context, Bundle.ACTIVE, _bundleTrackerCustomizer);

		_bundleTracker.open();
	}

	@Deactivate
	public void deactivate() {
		_bundleTracker.close();

		_bundleTracker = null;
	}

	private void _addServiceProperties(
		Dictionary<String, Object> properties, JSONObject jsonObject) {

		if (jsonObject == null) {
			return;
		}

		Iterator<String> keys = jsonObject.keys();

		while (keys.hasNext()) {
			String key = keys.next();

			Object value = jsonObject.get(key);

			if (value instanceof JSONObject) {
				String stringValue = value.toString();

				properties.put(key, stringValue);
			}
			else if (value instanceof JSONArray) {
				JSONArray jsonArray = (JSONArray)value;

				List<String> values = new ArrayList<>();

				for (int i = 0; i < jsonArray.length(); i++) {
					Object object = jsonArray.get(i);

					values.add(object.toString());
				}

				properties.put(key, values.toArray(new String[0]));
			}
			else {
				properties.put(key, value);
			}
		}
	}

	private boolean _optIn(Bundle bundle) {
		BundleWiring bundleWiring = bundle.adapt(BundleWiring.class);

		List<BundleWire> bundleWires = bundleWiring.getRequiredWires(
			ExtenderNamespace.EXTENDER_NAMESPACE);

		for (BundleWire bundleWire : bundleWires) {
			BundleCapability bundleCapability = bundleWire.getCapability();

			Map<String, Object> attributes = bundleCapability.getAttributes();

			Object value = attributes.get(ExtenderNamespace.EXTENDER_NAMESPACE);

			if ((value != null) &&
				value.equals("liferay.frontend.js.portlet")) {

				return true;
			}
		}

		return false;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		JSPortletExtender.class);

	private BundleTracker<ServiceRegistration<?>> _bundleTracker;

	private BundleTrackerCustomizer<ServiceRegistration<?>>
		_bundleTrackerCustomizer =
			new BundleTrackerCustomizer<ServiceRegistration<?>>() {

				@Override
				public ServiceRegistration<?> addingBundle(
					Bundle bundle, BundleEvent bundleEvent) {

					if (!_optIn(bundle)) {
						return null;
					}

					URL jsonURL = bundle.getEntry(
						"META-INF/resources/package.json");

					if (jsonURL == null) {
						return null;
					}

					try (InputStream inputStream = jsonURL.openStream()) {
						BundleContext bundleContext = bundle.getBundleContext();

						String jsonString = StringUtil.read(inputStream);

						JSONObject jsonObject = _jsonFactory.createJSONObject(
							jsonString);

						String name = jsonObject.getString("name");
						String version = jsonObject.getString("version");

						Dictionary<String, Object> properties =
							new Hashtable<>();

						properties.put("javax.portlet.name", name);

						_addServiceProperties(
							properties, jsonObject.getJSONObject("portlet"));

						ServiceRegistration<?> serviceRegistration =
							bundleContext.registerService(
								new String[] {Portlet.class.getName()},
								new JSPortlet(name, version), properties);

						return serviceRegistration;
					}
					catch (Exception e) {
						_log.error(
							"Unable to process package.json of " +
								bundle.getSymbolicName(),
							e);
					}

					return null;
				}

				@Override
				public void modifiedBundle(
					Bundle bundle, BundleEvent bundleEvent,
					ServiceRegistration<?> serviceRegistration) {
				}

				@Override
				public void removedBundle(
					Bundle bundle, BundleEvent bundleEvent,
					ServiceRegistration<?> serviceRegistration) {

					serviceRegistration.unregister();
				}

			};

	@Reference
	private JSONFactory _jsonFactory;

}