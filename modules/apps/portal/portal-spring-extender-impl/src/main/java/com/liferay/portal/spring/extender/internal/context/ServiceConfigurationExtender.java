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

package com.liferay.portal.spring.extender.internal.context;

import com.liferay.osgi.felix.util.AbstractExtender;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.cache.PortalCacheManagerNames;
import com.liferay.portal.kernel.cache.configurator.PortalCacheConfiguratorSettings;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.configuration.ConfigurationFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.security.permission.ResourceActions;
import com.liferay.portal.kernel.service.ServiceComponentLocalService;
import com.liferay.portal.kernel.service.configuration.ServiceComponentConfiguration;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapDictionary;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.spring.extender.internal.loader.ModuleResourceLoader;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.Properties;

import org.apache.felix.utils.extender.Extension;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.framework.wiring.BundleWiring;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Preston Crary
 */
@Component(immediate = true, service = {})
public class ServiceConfigurationExtender extends AbstractExtender {

	@Activate
	protected void activate(BundleContext bundleContext) throws Exception {
		start(bundleContext);
	}

	@Deactivate
	protected void deactivate(BundleContext bundleContext) throws Exception {
		stop(bundleContext);
	}

	@Override
	protected void debug(Bundle bundle, String s) {
		if (_log.isDebugEnabled()) {
			_log.debug(s);
		}
	}

	@Override
	protected Extension doCreateExtension(Bundle bundle) throws Exception {
		Dictionary<String, String> headers = bundle.getHeaders(
			StringPool.BLANK);

		if (headers.get("Liferay-Service") == null) {
			return null;
		}

		BundleWiring bundleWiring = bundle.adapt(BundleWiring.class);

		ClassLoader classLoader = bundleWiring.getClassLoader();

		Configuration portletConfiguration = _getConfiguration(
			classLoader, "portlet");
		Configuration serviceConfiguration = _getConfiguration(
			classLoader, "service");

		if ((portletConfiguration == null) && (serviceConfiguration == null)) {
			return null;
		}

		return new ServiceConfigurationExtension(
			bundle, classLoader, portletConfiguration, serviceConfiguration);
	}

	@Override
	protected void error(String s, Throwable throwable) {
		_log.error(s, throwable);
	}

	@Override
	protected void warn(Bundle bundle, String s, Throwable throwable) {
		if (_log.isWarnEnabled()) {
			_log.warn(s, throwable);
		}
	}

	private Configuration _getConfiguration(
		ClassLoader classLoader, String name) {

		try {
			return ConfigurationFactoryUtil.getConfiguration(classLoader, name);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug("Unable to read " + name + ".properties");
			}
		}

		return null;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		ServiceConfigurationExtender.class);

	@Reference(target = ModuleServiceLifecycle.DATABASE_INITIALIZED)
	private ModuleServiceLifecycle _moduleServiceLifecycle;

	@Reference
	private ResourceActions _resourceActions;

	@Reference
	private ServiceComponentLocalService _serviceComponentLocalService;

	private class ServiceConfigurationExtension implements Extension {

		@Override
		public void destroy() throws Exception {
			_serviceComponentLocalService.destroyServiceComponent(
				_serviceComponentConfiguration, _classLoader);

			for (ServiceRegistration<?> serviceRegistration :
					_serviceRegistrations) {

				serviceRegistration.unregister();
			}

			_serviceRegistrations.clear();
		}

		@Override
		public void start() throws Exception {
			BundleContext bundleContext = _bundle.getBundleContext();

			if (_serviceConfiguration != null) {
				_initServiceComponent();

				_registerConfiguration(
					bundleContext, _serviceConfiguration, "service");
			}

			if (_portletConfiguration != null) {
				_reconfigureCaches();

				_readResourceActions();

				_registerConfiguration(
					bundleContext, _portletConfiguration, "portlet");
			}
		}

		private ServiceConfigurationExtension(
			Bundle bundle, ClassLoader classLoader,
			Configuration portletConfiguration,
			Configuration serviceConfiguration) {

			_bundle = bundle;
			_classLoader = classLoader;
			_portletConfiguration = portletConfiguration;
			_serviceConfiguration = serviceConfiguration;

			_serviceComponentConfiguration = new ModuleResourceLoader(bundle);
		}

		private void _initServiceComponent() {
			Properties properties = _serviceConfiguration.getProperties();

			if (properties.isEmpty()) {
				return;
			}

			String buildNamespace = GetterUtil.getString(
				properties.getProperty("build.namespace"));
			long buildNumber = GetterUtil.getLong(
				properties.getProperty("build.number"));
			long buildDate = GetterUtil.getLong(
				properties.getProperty("build.date"));

			if (_log.isDebugEnabled()) {
				_log.debug("Build namespace " + buildNamespace);
				_log.debug("Build number " + buildNumber);
				_log.debug("Build date " + buildDate);
			}

			if (Validator.isNull(buildNamespace)) {
				return;
			}

			try {
				_serviceComponentLocalService.initServiceComponent(
					_serviceComponentConfiguration, _classLoader,
					buildNamespace, buildNumber, buildDate);
			}
			catch (PortalException pe) {
				_log.error("Unable to initialize service component", pe);
			}
		}

		private void _readResourceActions() {
			try {
				String portlets = _portletConfiguration.get(
					"service.configurator.portlet.ids");

				if (Validator.isNull(portlets)) {
					_resourceActions.readAndCheck(
						null, _classLoader,
						StringUtil.split(
							_portletConfiguration.get(
								PropsKeys.RESOURCE_ACTIONS_CONFIGS)));
				}
				else {
					_resourceActions.read(
						null, _classLoader,
						StringUtil.split(
							_portletConfiguration.get(
								PropsKeys.RESOURCE_ACTIONS_CONFIGS)));

					for (String portletId : StringUtil.split(portlets)) {
						_resourceActions.check(portletId);
					}
				}
			}
			catch (Exception e) {
				_log.error(
					"Unable to read resource actions config in " +
						PropsKeys.RESOURCE_ACTIONS_CONFIGS,
					e);
			}
		}

		private void _reconfigureCaches() throws Exception {
			String singleVMConfigurationLocation = _portletConfiguration.get(
				PropsKeys.EHCACHE_SINGLE_VM_CONFIG_LOCATION);
			String multiVMConfigurationLocation = _portletConfiguration.get(
				PropsKeys.EHCACHE_MULTI_VM_CONFIG_LOCATION);

			if (Validator.isNull(singleVMConfigurationLocation) &&
				Validator.isNull(multiVMConfigurationLocation)) {

				return;
			}

			BundleContext bundleContext = _bundle.getBundleContext();

			if (Validator.isNotNull(singleVMConfigurationLocation)) {
				Dictionary<String, Object> properties =
					new HashMapDictionary<>();

				properties.put(
					"portal.cache.manager.name",
					PortalCacheManagerNames.SINGLE_VM);

				_serviceRegistrations.add(
					bundleContext.registerService(
						PortalCacheConfiguratorSettings.class,
						new PortalCacheConfiguratorSettings(
							_classLoader, singleVMConfigurationLocation),
						properties));
			}

			if (Validator.isNotNull(multiVMConfigurationLocation)) {
				Dictionary<String, Object> properties =
					new HashMapDictionary<>();

				properties.put(
					"portal.cache.manager.name",
					PortalCacheManagerNames.MULTI_VM);

				_serviceRegistrations.add(
					bundleContext.registerService(
						PortalCacheConfiguratorSettings.class,
						new PortalCacheConfiguratorSettings(
							_classLoader, multiVMConfigurationLocation),
						properties));
			}
		}

		private void _registerConfiguration(
			BundleContext bundleContext, Configuration configuration,
			String name) {

			Dictionary<String, Object> properties = new HashMapDictionary<>();

			properties.put(
				"configuration.bundle.symbolic.name",
				_bundle.getSymbolicName());
			properties.put("name", name);

			_serviceRegistrations.add(
				bundleContext.registerService(
					Configuration.class, configuration, properties));
		}

		private final Bundle _bundle;
		private final ClassLoader _classLoader;
		private final Configuration _portletConfiguration;
		private final ServiceComponentConfiguration
			_serviceComponentConfiguration;
		private final Configuration _serviceConfiguration;
		private final List<ServiceRegistration<?>> _serviceRegistrations =
			new ArrayList<>();

	}

}