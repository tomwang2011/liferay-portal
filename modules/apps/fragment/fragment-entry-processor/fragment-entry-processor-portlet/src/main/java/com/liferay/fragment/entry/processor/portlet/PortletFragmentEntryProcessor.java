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

package com.liferay.fragment.entry.processor.portlet;

import com.liferay.fragment.constants.FragmentEntryLinkConstants;
import com.liferay.fragment.exception.FragmentEntryContentException;
import com.liferay.fragment.model.FragmentEntryLink;
import com.liferay.fragment.processor.FragmentEntryProcessor;
import com.liferay.fragment.processor.PortletRegistry;
import com.liferay.fragment.service.FragmentEntryLinkLocalService;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.PortletIdCodec;
import com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletProvider;
import com.liferay.portal.kernel.portlet.PortletProviderUtil;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.LayoutLocalService;
import com.liferay.portal.kernel.service.PortletLocalService;
import com.liferay.portal.kernel.service.PortletPreferencesLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.permission.PortletPermissionUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.LocaleThreadLocal;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.PortletKeys;
import com.liferay.portal.kernel.util.ResourceBundleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portlet.configuration.kernel.util.PortletConfigurationApplicationType;

import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

import javax.portlet.PortletPreferences;
import javax.portlet.PortletURL;

import javax.servlet.http.HttpServletRequest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Pavel Savinov
 */
@Component(
	immediate = true, property = "fragment.entry.processor.priority:Integer=3",
	service = FragmentEntryProcessor.class
)
public class PortletFragmentEntryProcessor implements FragmentEntryProcessor {

	@Override
	public String processFragmentEntryLinkHTML(
			FragmentEntryLink fragmentEntryLink, String html, String mode)
		throws PortalException {

		validateFragmentEntryHTML(html);

		Document document = _getDocument(html);

		for (Element element : document.select("*")) {
			String tagName = element.tagName();

			if (!StringUtil.startsWith(tagName, "lfr-widget-")) {
				continue;
			}

			String alias = StringUtil.replace(
				tagName, "lfr-widget-", StringPool.BLANK);

			String portletName = _portletRegistry.getPortletName(alias);

			if (Validator.isNull(portletName)) {
				throw new FragmentEntryContentException(
					LanguageUtil.format(
						_resourceBundle,
						"there-is-no-widget-available-for-alias-x", alias));
			}

			Element runtimeTagElement = new Element(
				"@liferay_portlet.runtime", true);

			FragmentEntryLink originalFragmentEntryLink =
				_fragmentEntryLinkLocalService.fetchFragmentEntryLink(
					fragmentEntryLink.getOriginalFragmentEntryLinkId());

			String portletPreferences = StringPool.BLANK;

			String instanceId = _getInstanceId(
				fragmentEntryLink.getNamespace(), element.attr("id"));

			if (originalFragmentEntryLink != null) {
				String originalInstanceId = _getInstanceId(
					originalFragmentEntryLink.getNamespace(),
					element.attr("id"));

				String defaultPreferences = _getPreferences(
					portletName, originalFragmentEntryLink, originalInstanceId,
					StringPool.BLANK);

				portletPreferences = _getPreferences(
					portletName, fragmentEntryLink, instanceId,
					defaultPreferences);
			}
			else {
				Portlet portlet = _portletLocalService.getPortletById(
					portletName);

				portletPreferences = _getPreferences(
					portletName, fragmentEntryLink, instanceId,
					portlet.getDefaultPreferences());
			}

			runtimeTagElement.attr("defaultPreferences", portletPreferences);

			runtimeTagElement.attr("instanceId", instanceId);
			runtimeTagElement.attr("persistSettings=false", true);
			runtimeTagElement.attr("portletName", portletName);

			Element portletElement = new Element("div");

			portletElement.attr("class", "portlet");

			ServiceContext serviceContext =
				ServiceContextThreadLocal.getServiceContext();

			ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();

			Layout layout = themeDisplay.getLayout();

			if (PortletPermissionUtil.contains(
					themeDisplay.getPermissionChecker(),
					fragmentEntryLink.getGroupId(), portletName,
					ActionKeys.CONFIGURATION) &&
				layout.isTypeControlPanel() &&
				Objects.equals(mode, FragmentEntryLinkConstants.EDIT)) {

				portletElement.appendChild(
					_getPortletTopperElement(portletName, instanceId));
			}

			portletElement.appendChild(runtimeTagElement);

			element.replaceWith(portletElement);
		}

		Element bodyElement = document.body();

		return bodyElement.html();
	}

	@Override
	public void validateFragmentEntryHTML(String html) throws PortalException {
		Document document = _getDocument(html);

		for (Element element : document.select("*")) {
			String htmlTagName = element.tagName();

			if (!StringUtil.startsWith(htmlTagName, "lfr-widget-")) {
				continue;
			}

			String alias = StringUtil.replace(
				htmlTagName, "lfr-widget-", StringPool.BLANK);

			if (Validator.isNull(_portletRegistry.getPortletName(alias))) {
				throw new FragmentEntryContentException(
					LanguageUtil.format(
						_resourceBundle,
						"there-is-no-widget-available-for-alias-x", alias));
			}

			if (Validator.isNotNull(element.id()) &&
				!Validator.isAlphanumericName(element.id())) {

				throw new FragmentEntryContentException(
					LanguageUtil.format(
						_resourceBundle,
						"widget-id-must-contain-only-alphanumeric-characters",
						alias));
			}
		}
	}

	private String _getConfigurationURL(String portletId) throws Exception {
		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		HttpServletRequest request = serviceContext.getRequest();

		PortletURL configurationURL = PortletProviderUtil.getPortletURL(
			request,
			PortletConfigurationApplicationType.PortletConfiguration.CLASS_NAME,
			PortletProvider.Action.VIEW);

		configurationURL.setParameter("mvcPath", "/edit_configuration.jsp");
		configurationURL.setParameter("settingsScope", "portletInstance");
		configurationURL.setParameter(
			"redirect", _portal.getCurrentURL(request));
		configurationURL.setParameter(
			"returnToFullPageURL", _portal.getCurrentURL(request));
		configurationURL.setParameter(
			"portletConfiguration", Boolean.TRUE.toString());
		configurationURL.setParameter("portletResource", portletId);
		configurationURL.setParameter(
			"resourcePrimKey",
			PortletPermissionUtil.getPrimaryKey(
				serviceContext.getPlid(), portletId));

		configurationURL.setWindowState(LiferayWindowState.POP_UP);

		StringBundler jsConfigurationURLSB = new StringBundler(11);

		jsConfigurationURLSB.append("Liferay.Portlet.openWindow({");
		jsConfigurationURLSB.append("bodyCssClass:'dialog-with-footer', ");
		jsConfigurationURLSB.append("destroyOnHide: true, portlet: '#p_p_id_");
		jsConfigurationURLSB.append(portletId);
		jsConfigurationURLSB.append("_', portletId: '");
		jsConfigurationURLSB.append(portletId);
		jsConfigurationURLSB.append("', title: '");
		jsConfigurationURLSB.append(LanguageUtil.get(request, "configuration"));
		jsConfigurationURLSB.append("', uri: '");
		jsConfigurationURLSB.append(configurationURL.toString());
		jsConfigurationURLSB.append("'}); return false;");

		return jsConfigurationURLSB.toString();
	}

	private Document _getDocument(String html) {
		Document document = Jsoup.parseBodyFragment(html);

		Document.OutputSettings outputSettings = new Document.OutputSettings();

		outputSettings.prettyPrint(false);

		document.outputSettings(outputSettings);

		return document;
	}

	private String _getInstanceId(String namespace, String id) {
		if (Validator.isNull(namespace)) {
			namespace = StringUtil.randomId();
		}

		return namespace + id;
	}

	private Element _getPortletMenuElement(
			String portletName, String instanceId)
		throws PortalException {

		String portletId = PortletIdCodec.encode(
			PortletIdCodec.decodePortletName(portletName),
			PortletIdCodec.decodeUserId(portletName), instanceId);

		Element menuElement = new Element("menu");

		menuElement.attr("class", "portlet-topper-toolbar");
		menuElement.attr("id", "portlet-topper-toolbar_" + portletId);
		menuElement.attr("type", "toolbar");

		Element buttonElement = new Element("button");

		buttonElement.attr("class", "btn btn-primary btn-sm");

		try {
			buttonElement.attr("onClick", _getConfigurationURL(portletId));
		}
		catch (Exception e) {
			throw new PortalException(e);
		}

		buttonElement.attr("url", "javascript:;");

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		buttonElement.text(
			LanguageUtil.get(serviceContext.getRequest(), "configure"));

		menuElement.appendChild(buttonElement);

		return menuElement;
	}

	private Element _getPortletTopperElement(
			String portletName, String instanceId)
		throws PortalException {

		Element portletTopperElement = new Element("header");

		portletTopperElement.attr("class", "portlet-topper");

		Element portletTitleElement = new Element("div");

		portletTitleElement.attr("class", "portlet-title-default");

		Element portletNameElement = new Element("span");

		portletNameElement.attr("class", "portlet-name-text");

		String portletTitle = _portal.getPortletTitle(
			portletName, LocaleThreadLocal.getThemeDisplayLocale());

		portletNameElement.text(portletTitle);

		portletTitleElement.appendChild(portletNameElement);

		portletTopperElement.appendChild(portletTitleElement);

		portletTopperElement.appendChild(
			_getPortletMenuElement(portletName, instanceId));

		return portletTopperElement;
	}

	private String _getPreferences(
			String portletName, FragmentEntryLink fragmentEntryLink,
			String instanceId, String defaultPreferences)
		throws PortalException {

		long groupId = fragmentEntryLink.getGroupId();

		if (groupId == 0) {
			ServiceContext serviceContext =
				ServiceContextThreadLocal.getServiceContext();

			if (serviceContext != null) {
				groupId = serviceContext.getScopeGroupId();
			}
		}

		Group group = _groupLocalService.getGroup(groupId);

		long defaultPlid = _portal.getControlPanelPlid(group.getCompanyId());

		String portletId = PortletIdCodec.encode(
			PortletIdCodec.decodePortletName(portletName),
			PortletIdCodec.decodeUserId(portletName), instanceId);

		PortletPreferences jxPortletPreferences =
			PortletPreferencesFactoryUtil.fromDefaultXML(defaultPreferences);

		List<com.liferay.portal.kernel.model.PortletPreferences>
			portletPreferencesList =
				_portletPreferencesLocalService.getPortletPreferences(
					group.getCompanyId(), PortletKeys.PREFS_OWNER_ID_DEFAULT,
					PortletKeys.PREFS_OWNER_TYPE_LAYOUT, portletId);

		if (ListUtil.isNotEmpty(portletPreferencesList)) {
			jxPortletPreferences =
				PortletPreferencesFactoryUtil.getLayoutPortletSetup(
					group.getCompanyId(), PortletKeys.PREFS_OWNER_ID_DEFAULT,
					PortletKeys.PREFS_OWNER_TYPE_LAYOUT, defaultPlid, portletId,
					defaultPreferences);

			_updateLayoutPortletSetup(
				portletPreferencesList, jxPortletPreferences);
		}

		Document preferencesDocument = _getDocument(
			PortletPreferencesFactoryUtil.toXML(jxPortletPreferences));

		Element preferencesBody = preferencesDocument.body();

		return preferencesBody.html();
	}

	private void _updateLayoutPortletSetup(
		List<com.liferay.portal.kernel.model.PortletPreferences>
			portletPreferencesList, PortletPreferences jxPortletPreferences) {

		String portletPreferencesXml = PortletPreferencesFactoryUtil.toXML(
			jxPortletPreferences);

		for (com.liferay.portal.kernel.model.PortletPreferences
				portletPreferences : portletPreferencesList) {

			if (Objects.equals(
					portletPreferences.getPreferences(),
					portletPreferencesXml)) {

				continue;
			}

			portletPreferences.setPreferences(portletPreferencesXml);

			_portletPreferencesLocalService.updatePortletPreferences(
				portletPreferences);
		}
	}

	@Reference
	private FragmentEntryLinkLocalService _fragmentEntryLinkLocalService;

	@Reference
	private GroupLocalService _groupLocalService;

	@Reference
	private LayoutLocalService _layoutLocalService;

	@Reference
	private Portal _portal;

	@Reference
	private PortletLocalService _portletLocalService;

	@Reference
	private PortletPreferencesLocalService _portletPreferencesLocalService;

	@Reference
	private PortletRegistry _portletRegistry;

	private final ResourceBundle _resourceBundle = ResourceBundleUtil.getBundle(
		"content.Language", getClass());

}