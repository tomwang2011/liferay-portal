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

package com.liferay.portlet;

import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.expando.kernel.model.CustomAttributesDisplay;
import com.liferay.exportimport.kernel.lar.PortletDataHandler;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.atom.AtomCollectionAdapter;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.configuration.ConfigurationFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.notifications.UserNotificationDefinition;
import com.liferay.portal.kernel.notifications.UserNotificationDeliveryType;
import com.liferay.portal.kernel.notifications.UserNotificationHandler;
import com.liferay.portal.kernel.poller.PollerProcessor;
import com.liferay.portal.kernel.pop.MessageListener;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.ControlPanelEntry;
import com.liferay.portal.kernel.portlet.FriendlyURLMapper;
import com.liferay.portal.kernel.portlet.FriendlyURLMapperTracker;
import com.liferay.portal.kernel.portlet.PortletBag;
import com.liferay.portal.kernel.portlet.PortletBagPool;
import com.liferay.portal.kernel.portlet.PortletInstanceFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletLayoutListener;
import com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil;
import com.liferay.portal.kernel.scheduler.SchedulerEntry;
import com.liferay.portal.kernel.scheduler.messaging.SchedulerEventMessageListener;
import com.liferay.portal.kernel.scheduler.messaging.SchedulerEventMessageListenerWrapper;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.OpenSearch;
import com.liferay.portal.kernel.security.permission.PermissionPropagator;
import com.liferay.portal.kernel.service.PortletLocalServiceUtil;
import com.liferay.portal.kernel.servlet.URLEncoder;
import com.liferay.portal.kernel.template.TemplateHandler;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyFactory;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.webdav.WebDAVStorage;
import com.liferay.portal.kernel.workflow.WorkflowHandler;
import com.liferay.portal.kernel.xml.Document;
import com.liferay.portal.kernel.xml.Element;
import com.liferay.portal.kernel.xml.UnsecureSAXReaderUtil;
import com.liferay.portal.kernel.xmlrpc.Method;
import com.liferay.portal.notifications.UserNotificationHandlerImpl;
import com.liferay.portal.util.JavaFieldsParser;
import com.liferay.portal.util.PropsValues;
import com.liferay.registry.Filter;
import com.liferay.registry.Registry;
import com.liferay.registry.RegistryUtil;
import com.liferay.registry.ServiceReference;
import com.liferay.registry.ServiceTracker;
import com.liferay.registry.ServiceTrackerCustomizer;
import com.liferay.social.kernel.model.SocialActivityInterpreter;
import com.liferay.social.kernel.model.SocialRequestInterpreter;
import com.liferay.social.kernel.model.impl.SocialActivityInterpreterImpl;
import com.liferay.social.kernel.model.impl.SocialRequestInterpreterImpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.portlet.PreferencesValidator;

import javax.servlet.ServletContext;

/**
 * @author Brian Wing Shun Chan
 * @author Brian Myunghun Kim
 * @author Ivica Cardic
 * @author Raymond Augé
 * @author Preston Crary
 */
public class PortletBagFactory {

	public PortletBag create(Portlet portlet) throws Exception {
		return create(portlet, false);
	}

	public PortletBag create(Portlet portlet, boolean destroyPrevious)
		throws Exception {

		validate();

		javax.portlet.Portlet portletInstance = getPortletInstance(portlet);

		Map<String, Object> properties = new HashMap<>();

		properties.put("javax.portlet.name", portlet.getPortletId());

		List<ConfigurationAction> configurationActionInstances =
			newConfigurationActions(portlet, null, properties);

		List<Indexer<?>> indexerInstances = newIndexers(
			portlet, null, properties);

		List<OpenSearch> openSearchInstances = newOpenSearches(
			portlet, null, properties);

		List<SchedulerEventMessageListener> schedulerEventMessageListeners =
			newSchedulerEventMessageListeners(portlet, null, properties);

		FriendlyURLMapperTracker friendlyURLMapperTracker =
			newFriendlyURLMappers(portlet);

		List<URLEncoder> urlEncoderInstances = newURLEncoders(
			portlet, null, properties);

		List<PortletDataHandler> portletDataHandlerInstances =
			newPortletDataHandlers(portlet, null, properties);

		List<StagedModelDataHandler<?>> stagedModelDataHandlerInstances =
			newStagedModelDataHandler(portlet, null, properties);

		List<TemplateHandler> templateHandlerInstances = newTemplateHandlers(
			portlet, null, properties);

		List<PortletLayoutListener> portletLayoutListenerInstances =
			newPortletLayoutListeners(portlet, null, properties);

		List<PollerProcessor> pollerProcessorInstances = newPollerProcessors(
			portlet, null, properties);

		List<MessageListener> popMessageListenerInstances =
			newPOPMessageListeners(portlet, null, properties);

		List<SocialActivityInterpreter> socialActivityInterpreterInstances =
			newSocialActivityInterpreterInstances(portlet, null, properties);

		List<SocialRequestInterpreter> socialRequestInterpreterInstances =
			newSocialRequestInterpreterInstances(portlet, null, properties);

		List<UserNotificationDefinition> userNotificationDefinitionInstances =
			newUserNotificationDefinitionInstances(portlet, null, properties);

		List<UserNotificationHandler> userNotificationHandlerInstances =
			newUserNotificationHandlerInstances(portlet, null, properties);

		List<WebDAVStorage> webDAVStorageInstances = newWebDAVStorageInstances(
			portlet, null, properties);

		List<Method> xmlRpcMethodInstances = newXmlRpcMethodInstances(
			portlet, null, properties);

		List<ControlPanelEntry> controlPanelEntryInstances =
			newControlPanelEntryInstances(portlet, null, properties);

		List<AssetRendererFactory<?>> assetRendererFactoryInstances =
			newAssetRendererFactoryInstances(portlet, null, properties);

		List<AtomCollectionAdapter<?>> atomCollectionAdapterInstances =
			newAtomCollectionAdapterInstances(portlet, null, properties);

		List<CustomAttributesDisplay> customAttributesDisplayInstances =
			newCustomAttributesDisplayInstances(portlet, null, properties);

		List<PermissionPropagator> permissionPropagatorInstances =
			newPermissionPropagators(portlet, null, properties);

		List<TrashHandler> trashHandlerInstances = newTrashHandlerInstances(
			portlet, null, properties);

		List<WorkflowHandler<?>> workflowHandlerInstances =
			newWorkflowHandlerInstances(portlet, null, properties);

		List<PreferencesValidator> preferencesValidatorInstances =
			newPreferencesValidatorInstances(portlet, null, properties);

		PortletBag portletBag = new PortletBagImpl(
			portlet.getPortletId(), _servletContext, portletInstance,
			portlet.getResourceBundle(), configurationActionInstances,
			indexerInstances, openSearchInstances,
			schedulerEventMessageListeners, friendlyURLMapperTracker,
			urlEncoderInstances, portletDataHandlerInstances,
			stagedModelDataHandlerInstances, templateHandlerInstances,
			portletLayoutListenerInstances, pollerProcessorInstances,
			popMessageListenerInstances, socialActivityInterpreterInstances,
			socialRequestInterpreterInstances,
			userNotificationDefinitionInstances,
			userNotificationHandlerInstances, webDAVStorageInstances,
			xmlRpcMethodInstances, controlPanelEntryInstances,
			assetRendererFactoryInstances, atomCollectionAdapterInstances,
			customAttributesDisplayInstances, permissionPropagatorInstances,
			trashHandlerInstances, workflowHandlerInstances,
			preferencesValidatorInstances);

		PortletBagPool.put(portlet.getRootPortletId(), portletBag);

		try {
			PortletInstanceFactoryUtil.create(
				portlet, _servletContext, destroyPrevious);
		}
		catch (Exception e) {
			_log.error(e, e);
		}

		return portletBag;
	}

	public void setClassLoader(ClassLoader classLoader) {
		_classLoader = classLoader;
	}

	public void setServletContext(ServletContext servletContext) {
		_servletContext = servletContext;
	}

	public void setWARFile(boolean warFile) {
		_warFile = warFile;
	}

	/**
	 * @see FriendlyURLMapperTrackerImpl#getContent(ClassLoader, String)
	 */
	protected String getContent(String fileName) throws Exception {
		String queryString = HttpUtil.getQueryString(fileName);

		if (Validator.isNull(queryString)) {
			return StringUtil.read(_classLoader, fileName);
		}

		int pos = fileName.indexOf(StringPool.QUESTION);

		String xml = StringUtil.read(_classLoader, fileName.substring(0, pos));

		Map<String, String[]> parameterMap = HttpUtil.getParameterMap(
			queryString);

		if (parameterMap == null) {
			return xml;
		}

		for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
			String[] values = entry.getValue();

			if (values.length == 0) {
				continue;
			}

			String value = values[0];

			xml = StringUtil.replace(xml, "@" + entry.getKey() + "@", value);
		}

		return xml;
	}

	protected String getPluginPropertyValue(String propertyKey)
		throws Exception {

		if (_configuration == null) {
			_configuration = ConfigurationFactoryUtil.getConfiguration(
				_classLoader, "portlet");
		}

		return _configuration.get(propertyKey);
	}

	protected javax.portlet.Portlet getPortletInstance(Portlet portlet)
		throws IllegalAccessException, InstantiationException {

		Class<?> portletClass = null;

		try {
			portletClass = _classLoader.loadClass(portlet.getPortletClass());
		}
		catch (Throwable t) {
			_log.error(t, t);

			PortletLocalServiceUtil.destroyPortlet(portlet);

			return null;
		}

		return (javax.portlet.Portlet)portletClass.newInstance();
	}

	@SuppressWarnings("unchecked")
	protected List<AssetRendererFactory<?>> newAssetRendererFactoryInstances(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<AssetRendererFactory<?>> assetRendererFactoryInstances =
			_assetRendererFactories.get(portlet.getPortletId());

		for (String assetRendererFactoryClass :
				portlet.getAssetRendererFactoryClasses()) {

			String assetRendererEnabledPropertyKey =
				PropsKeys.ASSET_RENDERER_ENABLED + assetRendererFactoryClass;

			String assetRendererEnabledPropertyValue = null;

			if (_warFile) {
				assetRendererEnabledPropertyValue = getPluginPropertyValue(
					assetRendererEnabledPropertyKey);
			}
			else {
				assetRendererEnabledPropertyValue = PropsUtil.get(
					assetRendererEnabledPropertyKey);
			}

			boolean assetRendererEnabledValue = GetterUtil.getBoolean(
				assetRendererEnabledPropertyValue, true);

			if (assetRendererEnabledValue) {
				AssetRendererFactory<?> assetRendererFactoryInstance =
					(AssetRendererFactory<?>)newInstance(
						AssetRendererFactory.class, assetRendererFactoryClass);

				assetRendererFactoryInstance.setClassName(
					assetRendererFactoryInstance.getClassName());
				assetRendererFactoryInstance.setPortletId(
					portlet.getPortletId());

				Registry registry = RegistryUtil.getRegistry();

				registry.registerService(
					AssetRendererFactory.class, assetRendererFactoryInstance,
					properties);
			}
		}

		return assetRendererFactoryInstances;
	}

	@SuppressWarnings("unchecked")
	protected List<AtomCollectionAdapter<?>> newAtomCollectionAdapterInstances(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<AtomCollectionAdapter<?>> atomCollectionAdapterInstances =
			_atomCollectionAdapters.get(portlet.getPortletId());

		Registry registry = RegistryUtil.getRegistry();

		for (String atomCollectionAdapterClass :
				portlet.getAtomCollectionAdapterClasses()) {

			AtomCollectionAdapter<?> atomCollectionAdapterInstance =
				(AtomCollectionAdapter<?>)newInstance(
					AtomCollectionAdapter.class, atomCollectionAdapterClass);

			registry.registerService(
				AtomCollectionAdapter.class, atomCollectionAdapterInstance,
				properties);
		}

		return atomCollectionAdapterInstances;
	}

	protected List<ConfigurationAction> newConfigurationActions(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<ConfigurationAction> configurationActionInstances =
			_configurationActions.get(portlet.getPortletId());

		if (Validator.isNotNull(portlet.getConfigurationActionClass())) {
			ConfigurationAction configurationAction =
				(ConfigurationAction)newInstance(
					ConfigurationAction.class,
					portlet.getConfigurationActionClass());

			Registry registry = RegistryUtil.getRegistry();

			registry.registerService(
				ConfigurationAction.class, configurationAction, properties);
		}

		return configurationActionInstances;
	}

	protected List<ControlPanelEntry> newControlPanelEntryInstances(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<ControlPanelEntry> controlPanelEntryInstances =
			_controlPanelEntries.get(portlet.getPortletId());

		if (Validator.isNotNull(portlet.getControlPanelEntryClass())) {
			ControlPanelEntry controlPanelEntryInstance =
				(ControlPanelEntry)newInstance(
					ControlPanelEntry.class,
					portlet.getControlPanelEntryClass());

			Registry registry = RegistryUtil.getRegistry();

			registry.registerService(
				ControlPanelEntry.class, controlPanelEntryInstance, properties);
		}

		return controlPanelEntryInstances;
	}

	protected List<CustomAttributesDisplay> newCustomAttributesDisplayInstances(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<CustomAttributesDisplay> customAttributesDisplayInstances =
			_customAttributesDisplay.get(portlet.getPortletId());

		Registry registry = RegistryUtil.getRegistry();

		for (String customAttributesDisplayClass :
				portlet.getCustomAttributesDisplayClasses()) {

			CustomAttributesDisplay customAttributesDisplayInstance =
				(CustomAttributesDisplay)newInstance(
					CustomAttributesDisplay.class,
					customAttributesDisplayClass);

			customAttributesDisplayInstance.setClassNameId(
				PortalUtil.getClassNameId(
					customAttributesDisplayInstance.getClassName()));
			customAttributesDisplayInstance.setPortletId(
				portlet.getPortletId());

			registry.registerService(
				CustomAttributesDisplay.class, customAttributesDisplayInstance,
				properties);
		}

		return customAttributesDisplayInstances;
	}

	protected FriendlyURLMapperTracker newFriendlyURLMappers(Portlet portlet)
		throws Exception {

		FriendlyURLMapperTracker friendlyURLMapperTracker =
			new FriendlyURLMapperTrackerImpl(portlet);

		if (Validator.isNotNull(portlet.getFriendlyURLMapperClass())) {
			FriendlyURLMapper friendlyURLMapper =
				(FriendlyURLMapper)newInstance(
					FriendlyURLMapper.class,
					portlet.getFriendlyURLMapperClass());

			friendlyURLMapperTracker.register(friendlyURLMapper);
		}

		return friendlyURLMapperTracker;
	}

	@SuppressWarnings("unchecked")
	protected List<Indexer<?>> newIndexers(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<Indexer<?>> indexerInstances = _indexers.get(
			portlet.getPortletId());

		Registry registry = RegistryUtil.getRegistry();

		for (String indexerClass : portlet.getIndexerClasses()) {
			Indexer<?> indexerInstance = (Indexer<?>)newInstance(
				Indexer.class, indexerClass);

			registry.registerService(
				Indexer.class, indexerInstance, properties);
		}

		return indexerInstances;
	}

	protected Object newInstance(Class<?> interfaceClass, String implClassName)
		throws Exception {

		return newInstance(new Class<?>[] {interfaceClass}, implClassName);
	}

	protected Object newInstance(
			Class<?>[] interfaceClasses, String implClassName)
		throws Exception {

		if (_warFile) {
			return ProxyFactory.newInstance(
				_classLoader, interfaceClasses, implClassName);
		}
		else {
			Class<?> clazz = _classLoader.loadClass(implClassName);

			return clazz.newInstance();
		}
	}

	protected List<OpenSearch> newOpenSearches(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<OpenSearch> openSearchInstances = _openSearches.get(
			portlet.getPortletId());

		if (Validator.isNotNull(portlet.getOpenSearchClass())) {
			OpenSearch openSearch = (OpenSearch)newInstance(
				OpenSearch.class, portlet.getOpenSearchClass());

			Registry registry = RegistryUtil.getRegistry();

			registry.registerService(OpenSearch.class, openSearch, properties);
		}

		return openSearchInstances;
	}

	protected List<PermissionPropagator> newPermissionPropagators(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<PermissionPropagator> permissionPropagatorInstances =
			_permissionPropagator.get(portlet.getPortletId());

		if (Validator.isNotNull(portlet.getPermissionPropagatorClass())) {
			PermissionPropagator permissionPropagatorInstance =
				(PermissionPropagator)newInstance(
					PermissionPropagator.class,
					portlet.getPermissionPropagatorClass());

			Registry registry = RegistryUtil.getRegistry();

			registry.registerService(
				PermissionPropagator.class, permissionPropagatorInstance,
				properties);
		}

		return permissionPropagatorInstances;
	}

	protected List<PollerProcessor> newPollerProcessors(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<PollerProcessor> pollerProcessorInstances = _pollerProcessors.get(
			portlet.getPortletId());

		if (Validator.isNotNull(portlet.getPollerProcessorClass())) {
			PollerProcessor pollerProcessorInstance =
				(PollerProcessor)newInstance(
					PollerProcessor.class, portlet.getPollerProcessorClass());

			Registry registry = RegistryUtil.getRegistry();

			registry.registerService(
				PollerProcessor.class, pollerProcessorInstance, properties);
		}

		return pollerProcessorInstances;
	}

	protected List<MessageListener> newPOPMessageListeners(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<MessageListener> messageListenerInstances = _messageListeners.get(
			portlet.getPortletId());

		if (Validator.isNotNull(portlet.getPopMessageListenerClass())) {
			MessageListener popMessageListenerInstance =
				(MessageListener)newInstance(
					MessageListener.class,
					portlet.getPopMessageListenerClass());

			Registry registry = RegistryUtil.getRegistry();

			registry.registerService(
				MessageListener.class, popMessageListenerInstance, properties);
		}

		return messageListenerInstances;
	}

	protected List<PortletDataHandler> newPortletDataHandlers(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<PortletDataHandler> portletDataHandlerInstances =
			_portletDataHandlers.get(portlet.getPortletId());

		if (Validator.isNotNull(portlet.getPortletDataHandlerClass())) {
			PortletDataHandler portletDataHandlerInstance =
				(PortletDataHandler)newInstance(
					PortletDataHandler.class,
					portlet.getPortletDataHandlerClass());

			portletDataHandlerInstance.setPortletId(portlet.getPortletId());

			Registry registry = RegistryUtil.getRegistry();

			registry.registerService(
				PortletDataHandler.class, portletDataHandlerInstance,
				properties);
		}

		return portletDataHandlerInstances;
	}

	protected List<PortletLayoutListener> newPortletLayoutListeners(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<PortletLayoutListener> portletLayoutListenerInstances =
			_portletLayoutListeners.get(portlet.getPortletId());

		if (Validator.isNotNull(portlet.getPortletLayoutListenerClass())) {
			PortletLayoutListener portletLayoutListener =
				(PortletLayoutListener)newInstance(
					PortletLayoutListener.class,
					portlet.getPortletLayoutListenerClass());

			Registry registry = RegistryUtil.getRegistry();

			registry.registerService(
				PortletLayoutListener.class, portletLayoutListener, properties);
		}

		return portletLayoutListenerInstances;
	}

	protected List<PreferencesValidator> newPreferencesValidatorInstances(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<PreferencesValidator> preferencesValidatorInstances =
			_preferencesValidators.get(portlet.getPortletId());

		if (Validator.isNotNull(portlet.getPreferencesValidator())) {
			PreferencesValidator preferencesValidatorInstance =
				(PreferencesValidator)newInstance(
					PreferencesValidator.class,
					portlet.getPreferencesValidator());

			try {
				if (PropsValues.PREFERENCE_VALIDATE_ON_STARTUP) {
					preferencesValidatorInstance.validate(
						PortletPreferencesFactoryUtil.fromDefaultXML(
							portlet.getDefaultPreferences()));
				}
			}
			catch (Exception e) {
				if (_log.isWarnEnabled()) {
					_log.warn(
						"Portlet with the name " + portlet.getPortletId() +
							" does not have valid default preferences");
				}
			}

			Registry registry = RegistryUtil.getRegistry();

			registry.registerService(
				PreferencesValidator.class, preferencesValidatorInstance,
				properties);
		}

		return preferencesValidatorInstances;
	}

	protected List<SchedulerEventMessageListener>
			newSchedulerEventMessageListeners(
				Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<SchedulerEventMessageListener> schedulerEventMessageListeners =
			_schedulerEventMessageListeners.get(portlet.getPortletId());

		Registry registry = RegistryUtil.getRegistry();

		for (SchedulerEntry schedulerEntry : portlet.getSchedulerEntries()) {
			SchedulerEventMessageListenerWrapper
				schedulerEventMessageListenerWrapper =
					new SchedulerEventMessageListenerWrapper();

			com.liferay.portal.kernel.messaging.MessageListener
				messageListener =
					(com.liferay.portal.kernel.messaging.MessageListener)
						InstanceFactory.newInstance(
							_classLoader,
							schedulerEntry.getEventListenerClass());

			schedulerEventMessageListenerWrapper.setMessageListener(
				messageListener);

			schedulerEventMessageListenerWrapper.setSchedulerEntry(
				schedulerEntry);

			registry.registerService(
				SchedulerEventMessageListener.class,
				schedulerEventMessageListenerWrapper, properties);
		}

		return schedulerEventMessageListeners;
	}

	protected List<SocialActivityInterpreter>
			newSocialActivityInterpreterInstances(
				Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<SocialActivityInterpreter> socialActivityInterpreterInstances =
			_socialActivityInterpreters.get(portlet.getPortletId());

		Registry registry = RegistryUtil.getRegistry();

		for (String socialActivityInterpreterClass :
				portlet.getSocialActivityInterpreterClasses()) {

			SocialActivityInterpreter socialActivityInterpreterInstance =
				(SocialActivityInterpreter)newInstance(
					SocialActivityInterpreter.class,
					socialActivityInterpreterClass);

			socialActivityInterpreterInstance =
				new SocialActivityInterpreterImpl(
					portlet.getPortletId(), socialActivityInterpreterInstance);

			registry.registerService(
				SocialActivityInterpreter.class,
				socialActivityInterpreterInstance, properties);
		}

		return socialActivityInterpreterInstances;
	}

	protected List<SocialRequestInterpreter>
			newSocialRequestInterpreterInstances(
				Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<SocialRequestInterpreter> socialRequestInterpreterInstances =
			_socialRequestInterpreters.get(portlet.getPortletId());

		if (Validator.isNotNull(portlet.getSocialRequestInterpreterClass())) {
			SocialRequestInterpreter socialRequestInterpreterInstance =
				(SocialRequestInterpreter)newInstance(
					SocialRequestInterpreter.class,
					portlet.getSocialRequestInterpreterClass());

			socialRequestInterpreterInstance = new SocialRequestInterpreterImpl(
				portlet.getPortletId(), socialRequestInterpreterInstance);

			Registry registry = RegistryUtil.getRegistry();

			registry.registerService(
				SocialRequestInterpreter.class,
				socialRequestInterpreterInstance, properties);
		}

		return socialRequestInterpreterInstances;
	}

	@SuppressWarnings("unchecked")
	protected List<StagedModelDataHandler<?>> newStagedModelDataHandler(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<StagedModelDataHandler<?>> stagedModelDataHandlerInstances =
			_stagedModelDataHandlers.get(portlet.getPortletId());

		Registry registry = RegistryUtil.getRegistry();

		for (String stagedModelDataHandlerClass :
				portlet.getStagedModelDataHandlerClasses()) {

			StagedModelDataHandler<?> stagedModelDataHandler =
				(StagedModelDataHandler<?>)newInstance(
					StagedModelDataHandler.class, stagedModelDataHandlerClass);

			registry.registerService(
				StagedModelDataHandler.class, stagedModelDataHandler,
				properties);
		}

		return stagedModelDataHandlerInstances;
	}

	protected List<TemplateHandler> newTemplateHandlers(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<TemplateHandler> templateHandlerInstances = _templateHandlers.get(
			portlet.getPortletId());

		if (Validator.isNotNull(portlet.getTemplateHandlerClass())) {
			TemplateHandler templateHandler = (TemplateHandler)newInstance(
				TemplateHandler.class, portlet.getTemplateHandlerClass());

			Registry registry = RegistryUtil.getRegistry();

			registry.registerService(
				TemplateHandler.class, templateHandler, properties);
		}

		return templateHandlerInstances;
	}

	protected List<TrashHandler> newTrashHandlerInstances(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<TrashHandler> trashHandlerInstances = _trashHandlers.get(
			portlet.getPortletId());

		Registry registry = RegistryUtil.getRegistry();

		for (String trashHandlerClass : portlet.getTrashHandlerClasses()) {
			TrashHandler trashHandlerInstance = (TrashHandler)newInstance(
				TrashHandler.class, trashHandlerClass);

			registry.registerService(
				TrashHandler.class, trashHandlerInstance, properties);
		}

		return trashHandlerInstances;
	}

	protected List<URLEncoder> newURLEncoders(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<URLEncoder> urlEncoderInstances = _urlEncoders.get(
			portlet.getPortletId());

		if (Validator.isNotNull(portlet.getURLEncoderClass())) {
			URLEncoder urlEncoder = (URLEncoder)newInstance(
				URLEncoder.class, portlet.getURLEncoderClass());

			Registry registry = RegistryUtil.getRegistry();

			registry.registerService(URLEncoder.class, urlEncoder, properties);
		}

		return urlEncoderInstances;
	}

	protected List<UserNotificationDefinition>
			newUserNotificationDefinitionInstances(
				Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<UserNotificationDefinition> userNotificationDefinitionInstances =
			_userNotificationDefinitions.get(portlet.getPortletId());

		if (Validator.isNull(portlet.getUserNotificationDefinitions())) {
			return userNotificationDefinitionInstances;
		}

		String xml = getContent(portlet.getUserNotificationDefinitions());

		xml = JavaFieldsParser.parse(_classLoader, xml);

		Document document = UnsecureSAXReaderUtil.read(xml);

		Element rootElement = document.getRootElement();

		Registry registry = RegistryUtil.getRegistry();

		for (Element definitionElement : rootElement.elements("definition")) {
			String modelName = definitionElement.elementText("model-name");

			long classNameId = 0;

			if (Validator.isNotNull(modelName)) {
				classNameId = PortalUtil.getClassNameId(modelName);
			}

			int notificationType = GetterUtil.getInteger(
				definitionElement.elementText("notification-type"));

			String description = GetterUtil.getString(
				definitionElement.elementText("description"));

			UserNotificationDefinition userNotificationDefinition =
				new UserNotificationDefinition(
					portlet.getPortletId(), classNameId, notificationType,
					description);

			for (Element deliveryTypeElement :
					definitionElement.elements("delivery-type")) {

				String name = deliveryTypeElement.elementText("name");
				int type = GetterUtil.getInteger(
					deliveryTypeElement.elementText("type"));
				boolean defaultValue = GetterUtil.getBoolean(
					deliveryTypeElement.elementText("default"));
				boolean modifiable = GetterUtil.getBoolean(
					deliveryTypeElement.elementText("modifiable"));

				userNotificationDefinition.addUserNotificationDeliveryType(
					new UserNotificationDeliveryType(
						name, type, defaultValue, modifiable));
			}

			registry.registerService(
				UserNotificationDefinition.class, userNotificationDefinition,
				properties);
		}

		return userNotificationDefinitionInstances;
	}

	protected List<UserNotificationHandler> newUserNotificationHandlerInstances(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<UserNotificationHandler> userNotificationHandlerInstances =
			_userNotificationHandlers.get(portlet.getPortletId());

		Registry registry = RegistryUtil.getRegistry();

		for (String userNotificationHandlerClass :
				portlet.getUserNotificationHandlerClasses()) {

			UserNotificationHandler userNotificationHandlerInstance =
				(UserNotificationHandler)newInstance(
					UserNotificationHandler.class,
					userNotificationHandlerClass);

			userNotificationHandlerInstance = new UserNotificationHandlerImpl(
				userNotificationHandlerInstance);

			registry.registerService(
				UserNotificationHandler.class, userNotificationHandlerInstance,
				properties);
		}

		return userNotificationHandlerInstances;
	}

	protected List<WebDAVStorage> newWebDAVStorageInstances(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<WebDAVStorage> webDAVStorageInstances = _webDAVStorage.get(
			portlet.getPortletId());

		if (Validator.isNotNull(portlet.getWebDAVStorageClass())) {
			WebDAVStorage webDAVStorageInstance = (WebDAVStorage)newInstance(
				WebDAVStorage.class, portlet.getWebDAVStorageClass());

			Map<String, Object> webDAVProperties = new HashMap<>();

			webDAVProperties.put("javax.portlet.name", portlet.getPortletId());
			webDAVProperties.put(
				"webdav.storage.token", portlet.getWebDAVStorageToken());

			Registry registry = RegistryUtil.getRegistry();

			registry.registerService(
				WebDAVStorage.class, webDAVStorageInstance, webDAVProperties);
		}

		return webDAVStorageInstances;
	}

	@SuppressWarnings("unchecked")
	protected List<WorkflowHandler<?>> newWorkflowHandlerInstances(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<WorkflowHandler<?>> workflowHandlerInstances =
			_workflowHandlers.get(portlet.getPortletId());

		Registry registry = RegistryUtil.getRegistry();

		for (String workflowHandlerClass :
				portlet.getWorkflowHandlerClasses()) {

			WorkflowHandler<?> workflowHandlerInstance =
				(WorkflowHandler<?>)newInstance(
					WorkflowHandler.class, workflowHandlerClass);

			registry.registerService(
				WorkflowHandler.class, workflowHandlerInstance, properties);
		}

		return workflowHandlerInstances;
	}

	protected List<Method> newXmlRpcMethodInstances(
			Portlet portlet, Filter filter, Map<String, Object> properties)
		throws Exception {

		List<Method> xmlRpcMethodInstances = _methods.get(
			portlet.getPortletId());

		if (Validator.isNotNull(portlet.getXmlRpcMethodClass())) {
			Method xmlRpcMethodInstance = (Method)newInstance(
				Method.class, portlet.getXmlRpcMethodClass());

			Registry registry = RegistryUtil.getRegistry();

			registry.registerService(
				Method.class, xmlRpcMethodInstance, properties);
		}

		return xmlRpcMethodInstances;
	}

	protected void validate() {
		if (_classLoader == null) {
			throw new IllegalStateException("Class loader is null");
		}

		if (_servletContext == null) {
			throw new IllegalStateException("Servlet context is null");
		}

		if (_warFile == null) {
			throw new IllegalStateException("WAR file is null");
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		PortletBagFactory.class);

	private static final PortletServiceTrackerMap _assetRendererFactories =
		PortletServiceTrackerMap.create(AssetRendererFactory.class);
	private static final PortletServiceTrackerMap _atomCollectionAdapters =
		PortletServiceTrackerMap.create(AtomCollectionAdapter.class);
	private static final PortletServiceTrackerMap<ConfigurationAction>
		_configurationActions = PortletServiceTrackerMap.create(
			ConfigurationAction.class);
	private static final PortletServiceTrackerMap<ControlPanelEntry>
		_controlPanelEntries = PortletServiceTrackerMap.create(
			ControlPanelEntry.class);
	private static final PortletServiceTrackerMap<CustomAttributesDisplay>
		_customAttributesDisplay = PortletServiceTrackerMap.create(
			CustomAttributesDisplay.class);
	private static final PortletServiceTrackerMap _indexers =
		PortletServiceTrackerMap.create(Indexer.class);
	private static final PortletServiceTrackerMap<MessageListener>
		_messageListeners = PortletServiceTrackerMap.create(
			MessageListener.class);
	private static final PortletServiceTrackerMap<Method> _methods =
		PortletServiceTrackerMap.create(Method.class);
	private static final PortletServiceTrackerMap<OpenSearch> _openSearches =
		PortletServiceTrackerMap.create(OpenSearch.class);
	private static final PortletServiceTrackerMap<PermissionPropagator>
		_permissionPropagator = PortletServiceTrackerMap.create(
			PermissionPropagator.class);
	private static final PortletServiceTrackerMap<PollerProcessor>
		_pollerProcessors = PortletServiceTrackerMap.create(
			PollerProcessor.class);
	private static final PortletServiceTrackerMap<PortletDataHandler>
		_portletDataHandlers = PortletServiceTrackerMap.create(
			PortletDataHandler.class);
	private static final PortletServiceTrackerMap<PortletLayoutListener>
		_portletLayoutListeners = PortletServiceTrackerMap.create(
			PortletLayoutListener.class);
	private static final PortletServiceTrackerMap<PreferencesValidator>
		_preferencesValidators = PortletServiceTrackerMap.create(
			PreferencesValidator.class);
	private static final PortletServiceTrackerMap<SchedulerEventMessageListener>
		_schedulerEventMessageListeners = PortletServiceTrackerMap.create(
			SchedulerEventMessageListener.class);
	private static final PortletServiceTrackerMap<SocialActivityInterpreter>
		_socialActivityInterpreters = PortletServiceTrackerMap.create(
			SocialActivityInterpreter.class);
	private static final PortletServiceTrackerMap<SocialRequestInterpreter>
		_socialRequestInterpreters = PortletServiceTrackerMap.create(
			SocialRequestInterpreter.class);
	private static final PortletServiceTrackerMap _stagedModelDataHandlers =
		PortletServiceTrackerMap.create(StagedModelDataHandler.class);
	private static final PortletServiceTrackerMap<TemplateHandler>
		_templateHandlers = PortletServiceTrackerMap.create(
			TemplateHandler.class);
	private static final PortletServiceTrackerMap<TrashHandler> _trashHandlers =
		PortletServiceTrackerMap.create(TrashHandler.class);
	private static final PortletServiceTrackerMap<URLEncoder> _urlEncoders =
		PortletServiceTrackerMap.create(URLEncoder.class);
	private static final PortletServiceTrackerMap<UserNotificationDefinition>
		_userNotificationDefinitions = PortletServiceTrackerMap.create(
			UserNotificationDefinition.class);
	private static final PortletServiceTrackerMap<UserNotificationHandler>
		_userNotificationHandlers = PortletServiceTrackerMap.create(
			UserNotificationHandler.class);
	private static final PortletServiceTrackerMap<WebDAVStorage>
		_webDAVStorage = PortletServiceTrackerMap.create(WebDAVStorage.class);
	private static final PortletServiceTrackerMap _workflowHandlers =
		PortletServiceTrackerMap.create(WorkflowHandler.class);

	private ClassLoader _classLoader;
	private Configuration _configuration;
	private ServletContext _servletContext;
	private Boolean _warFile;

	private static class PortletServiceTrackerMap<T> {

		public static <T> PortletServiceTrackerMap<T> create(
			Class<T> serviceClass) {

			PortletServiceTrackerMap<T> portletServiceTrackerMap =
				new PortletServiceTrackerMap<>();

			portletServiceTrackerMap._open(serviceClass);

			return portletServiceTrackerMap;
		}

		public void close() {
			_serviceTracker.close();
		}

		public List<T> get(Object portletName) {
			List<T> services = _portletServices.get(portletName);

			if (services == null) {
				if (_SHARED_PORTLET_SERVICE_KEY.equals(portletName)) {
					return _sharedPortletServices;
				}

				services = new CopyOnWriteArrayList<>(_sharedPortletServices);

				List<T> oldServices = _portletServices.putIfAbsent(
					portletName, services);

				if (oldServices != null) {
					services = oldServices;
				}
			}

			return services;
		}

		private PortletServiceTrackerMap() {
		}

		private void _open(Class<T> serviceClass) {
			Registry registry = RegistryUtil.getRegistry();

			_serviceTracker = registry.trackServices(
				serviceClass,
				new ServiceTrackerCustomizer<T, ServiceAndProperty<T>>() {

					@Override
					public ServiceAndProperty<T> addingService(
						ServiceReference<T> serviceReference) {

						Object property = serviceReference.getProperty(
							"javax.portlet.name");

						if (property == null) {
							return null;
						}

						T service = registry.getService(serviceReference);

						List<T> services = get(property);

						services.add(service);

						if (_SHARED_PORTLET_SERVICE_KEY.equals(property)) {
							Collection<List<T>> allPortletServices =
								_portletServices.values();

							for (List<T> portletServices : allPortletServices) {
								portletServices.add(service);
							}
						}

						return new ServiceAndProperty<>(service, property);
					}

					@Override
					public void modifiedService(
						ServiceReference<T> serviceReference,
						ServiceAndProperty<T> serviceAndProperty) {
					}

					@Override
					public void removedService(
						ServiceReference<T> serviceReference,
						ServiceAndProperty<T> serviceAndProperty) {

						T service = serviceAndProperty._service;
						Object property = serviceAndProperty._property;

						List<T> services = get(property);

						services.remove(service);

						if (_SHARED_PORTLET_SERVICE_KEY.equals(property)) {
							Collection<List<T>> allPortletServices =
								_portletServices.values();

							for (List<T> portletServices : allPortletServices) {
								portletServices.add(service);
							}
						}

						registry.ungetService(serviceReference);
					}

				});

			_serviceTracker.open();
		}

		private static final Object _SHARED_PORTLET_SERVICE_KEY = "ALL";

		private ConcurrentMap<Object, List<T>> _portletServices =
			new ConcurrentHashMap<>();
		private ServiceTracker<T, ServiceAndProperty<T>> _serviceTracker;
		private List<T> _sharedPortletServices = new CopyOnWriteArrayList<>();

	}

	private static class ServiceAndProperty<T> {

		private ServiceAndProperty(T service, Object property) {
			_service = service;
			_property = property;
		}

		private final Object _property;
		private final T _service;

	}

}