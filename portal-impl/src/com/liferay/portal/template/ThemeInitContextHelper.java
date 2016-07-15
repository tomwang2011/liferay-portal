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

package com.liferay.portal.template;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.ColorScheme;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.LayoutConstants;
import com.liferay.portal.kernel.model.LayoutSet;
import com.liferay.portal.kernel.model.LayoutTypePortlet;
import com.liferay.portal.kernel.model.Theme;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.theme.NavItem;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.DateUtil_IW;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.kernel.util.Validator;

import java.text.DateFormat;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

import javax.portlet.PortletURL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Preston Crary
 */
@ProviderType
public class ThemeInitContextHelper {

	public ThemeInitContextHelper(
		HttpServletRequest request, ThemeDisplay themeDisplay,
		Map<String, Object> contextObjects) {

		_request = request;
		_themeDisplay = themeDisplay;
		_contextObjects = contextObjects;
	}

	public void init() throws PortalException {
		_addCommonContextObjects();
		_addDeprecatedContextObjects();
		_addURLContextObjects();
		_addPageContextObjects();
		_addLogoContextObjects();
		_addNavigationContextObjects();
		_addMySitesContextObjects();
		_addIncludesContextObjects();
		_addDateContextObjects();
		_addCssClassContextObject();
	}

	private void _addCssClassContextObject() {
		StringBundler sb = new StringBundler(10);

		String bodyCssClass = (String)_contextObjects.get("bodyCssClass");

		if (!Validator.isBlank(bodyCssClass)) {
			sb.append(HtmlUtil.escape(bodyCssClass));
			sb.append(StringPool.SPACE);
		}

		ColorScheme colorScheme = _themeDisplay.getColorScheme();

		sb.append(HtmlUtil.escape(colorScheme.getCssClass()));
		sb.append(" yui3-skin-sam");

		LayoutTypePortlet layoutTypePortlet =
			_themeDisplay.getLayoutTypePortlet();

		if (layoutTypePortlet.hasStateMax()) {
			sb.append(" page-maximized");
		}

		Group group = (Group)_contextObjects.get("page_group");

		if (group.isGuest()) {
			sb.append(" guest-site");
		}

		if (_themeDisplay.isSignedIn()) {
			sb.append(" signed-in");
		}
		else {
			sb.append(" signed-out");
		}

		Layout layout = _themeDisplay.getLayout();

		if (layout.isPublicLayout()) {
			sb.append(" public-page ");
		}
		else {
			sb.append(" private-page ");
		}

		if (group.isLayoutPrototype()) {
			sb.append("page-template ");
		}

		if (group.isLayoutSetPrototype()) {
			sb.append("site-template ");
		}

		String siteType = (String)_contextObjects.get("site_type");

		sb.append(siteType);

		_contextObjects.put("css_class", sb.toString());
	}

	private void _addCommonContextObjects() throws PortalException {
		_contextObjects.put("theme_display", _themeDisplay);
		_contextObjects.put(
			"portlet_display", _themeDisplay.getPortletDisplay());

		Theme theme = _themeDisplay.getTheme();

		_contextObjects.put("theme_timestamp", theme.getTimestamp());
		_contextObjects.put("theme_settings", _themeDisplay.getThemeSettings());

		_contextObjects.put(
			"root_css_class",
			LanguageUtil.get(_themeDisplay.getLocale(), "lang.dir"));

		Layout layout = _themeDisplay.getLayout();

		_contextObjects.put("page_group", layout.getGroup());

		_contextObjects.put("css_folder", _themeDisplay.getPathThemeCss());
		_contextObjects.put(
			"images_folder", _themeDisplay.getPathThemeImages());
		_contextObjects.put(
			"javascript_folder", _themeDisplay.getPathThemeJavaScript());
		_contextObjects.put(
			"templates_folder", _themeDisplay.getPathThemeTemplates());

		_contextObjects.put(
			"full_css_path", _contextObjects.get("fullCssPath"));
		_contextObjects.put(
			"full_templates_path", _contextObjects.get("fullTemplatesPath"));

		_contextObjects.put(
			"css_main_file",
			HtmlUtil.escape(
				PortalUtil.getStaticResourceURL(
					_request, _themeDisplay.getPathThemeCss() + "/main.css")));
		_contextObjects.put(
			"js_main_file",
			HtmlUtil.escape(
				PortalUtil.getStaticResourceURL(
					_request,
					_themeDisplay.getPathThemeJavaScript() + "/main.js")));

		Company company = _themeDisplay.getCompany();

		_contextObjects.put("company_id", company.getCompanyId());
		_contextObjects.put("company_name", company.getName());
		_contextObjects.put("company_logo", _themeDisplay.getCompanyLogo());
		_contextObjects.put(
			"company_logo_height", _themeDisplay.getCompanyLogoHeight());
		_contextObjects.put(
			"company_logo_width", _themeDisplay.getCompanyLogoWidth());

		String companyURL = _themeDisplay.getURLHome();

		_contextObjects.put("company_url", companyURL);

		if (!_request.isRequestedSessionIdFromCookie()) {
			HttpSession session = _request.getSession();

			_contextObjects.put(
				"company_url",
				PortalUtil.getURLWithSessionId(companyURL, session.getId()));
		}
	}

	private void _addDateContextObjects() {
		DateUtil_IW dateUtil = (DateUtil_IW)_contextObjects.get("dateUtil");

		_contextObjects.put("date", dateUtil);

		Date currentTime = dateUtil.newDate();

		_contextObjects.put("current_time", currentTime);

		DateFormat dateFormat = DateFormatFactoryUtil.getSimpleDateFormat(
			"yyyy", _themeDisplay.getLocale());

		_contextObjects.put("the_year", dateFormat.format(currentTime));
	}

	private void _addDeprecatedContextObjects() {
		User user = _themeDisplay.getUser();

		_contextObjects.put("time_zone", user.getTimeZoneId());
		_contextObjects.put(
			"is_login_redirect_required",
			PortalUtil.isLoginRedirectRequired(_request));
		_contextObjects.put("is_signed_in", _themeDisplay.isSignedIn());
		_contextObjects.put("group_id", _themeDisplay.getScopeGroupId());
	}

	private void _addIncludesContextObjects() {
		_contextObjects.put("dir_include", "/html");
		_contextObjects.put(
			"body_bottom_include", "/html/common/themes/body_bottom.jsp");
		_contextObjects.put(
			"body_top_include", "/html/common/themes/body_top.jsp");
		_contextObjects.put("bottom_include", "/html/common/themes/bottom.jsp");
		_contextObjects.put(
			"bottom_ext_include", "/html/common/themes/bottom.jsp");

		String tilesContent = _themeDisplay.getTilesContent();

		if (!Validator.isBlank(tilesContent)) {
			_contextObjects.put("content_include", "/html" + tilesContent);
		}

		_contextObjects.put(
			"top_head_include", "/html/common/themes/top_head.jsp");
		_contextObjects.put(
			"top_messages_include", "/html/common/themes/top_messages.jsp");
	}

	private void _addLogoContextObjects() {
		LayoutSet layoutSet = _themeDisplay.getLayoutSet();

		_contextObjects.put("use_company_logo", layoutSet.isLogo());

		Company company = _themeDisplay.getCompany();

		if ((company.getLogoId() == 0) && layoutSet.isLogo()) {
			_contextObjects.put("logo_css_class", "logo default-logo");
		}
		else {
			_contextObjects.put("logo_css_class", "logo custom-logo");
		}

		_contextObjects.put(
			"site_logo_height", _contextObjects.get("company_logo_height"));
		_contextObjects.put(
			"site_logo_width", _contextObjects.get("company_logo_width"));

		Properties themeSettings = _themeDisplay.getThemeSettings();

		boolean showSiteNameSupported = GetterUtil.getBoolean(
			themeSettings.get("show-site-name-supported"), true);

		_contextObjects.put("show_site_name_supported", showSiteNameSupported);

		boolean showSiteNameDefault = GetterUtil.getBoolean(
			themeSettings.get("show-site-name-default"), showSiteNameSupported);

		_contextObjects.put("show_site_name_default", showSiteNameDefault);

		boolean showSiteName = GetterUtil.getBoolean(
			layoutSet.getSettingsProperty("showSiteName"), showSiteNameDefault);

		_contextObjects.put("show_site_name", showSiteName);

		_contextObjects.put("site_logo", _contextObjects.get("company_logo"));

		String logoDescription = StringPool.BLANK;

		if (!showSiteName) {
			logoDescription = (String)_contextObjects.get("site_name");
		}

		_contextObjects.put("logo_description", logoDescription);
	}

	private void _addMySitesContextObjects() throws PortalException {
		User user = _themeDisplay.getUser();

		boolean hasMySites = user.hasMySites();

		_contextObjects.put("show_my_sites", hasMySites);
		_contextObjects.put("show_my_places", hasMySites);

		if (hasMySites) {
			String mySitesText = LanguageUtil.get(
				_themeDisplay.getLocale(), "my-sites");

			_contextObjects.put("show_my_sites", mySitesText);
			_contextObjects.put("my_places_text", mySitesText);
		}
	}

	@SuppressWarnings("unchecked")
	private void _addNavigationContextObjects() {
		List<NavItem> navItems = (List<NavItem>)_contextObjects.get("navItems");

		_contextObjects.put("nav_items", navItems);
		_contextObjects.put("has_navigation", !navItems.isEmpty());

		if (navItems.isEmpty()) {
			_contextObjects.put(
				"nav_css_class", "sort-pages modify-pages hide");
		}
		else {
			_contextObjects.put("nav_css_class", "sort-pages modify-pages");
		}
	}

	private void _addPageContextObjects() throws PortalException {
		Layout layout = _themeDisplay.getLayout();

		Locale locale = _themeDisplay.getLocale();

		_contextObjects.put("selectable", _themeDisplay.isTilesSelectable());

		LayoutTypePortlet layoutTypePortlet =
			_themeDisplay.getLayoutTypePortlet();

		_contextObjects.put("is_maximized", layoutTypePortlet.hasStateMax());
		_contextObjects.put("is_freeform", _themeDisplay.isFreeformLayout());

		_contextObjects.put("page_javascript_1", StringPool.BLANK);
		_contextObjects.put("page_javascript_2", StringPool.BLANK);
		_contextObjects.put("page_javascript_3", StringPool.BLANK);

		_contextObjects.put("page", layout);

		_contextObjects.put("is_first_child", layout.isFirstChild());
		_contextObjects.put("is_first_parent", layout.isFirstParent());

		_contextObjects.put(
			"is_portlet_page",
			LayoutConstants.TYPE_PORTLET.equals(layout.getType()));

		UnicodeProperties typeSettingsProperties =
			layout.getTypeSettingsProperties();

		_contextObjects.put("typeSettingsProperties", typeSettingsProperties);

		String javaScript = typeSettingsProperties.get("javascript");

		if (javaScript != null) {
			_contextObjects.put("page_javascript", javaScript);
		}

		Group pageGroup = (Group)_contextObjects.get("page_group");

		String siteName = HtmlUtil.escape(pageGroup.getDescriptiveName());

		_contextObjects.put("site_name", siteName);

		_contextObjects.put("community_name", siteName);

		_contextObjects.put("is_guest_group", pageGroup.isGuest());

		if (pageGroup.isCompany()) {
			_contextObjects.put("site_type", "company-site");
		}
		else if (pageGroup.isOrganization()) {
			_contextObjects.put("site_type", "organization-site");
		}
		else if (pageGroup.isUser()) {
			_contextObjects.put("site_type", "user-site");
		}
		else {
			_contextObjects.put("site_type", "site");
		}

		String siteDefaultPublicURL = HtmlUtil.escape(
			pageGroup.getDisplayURL(_themeDisplay, false));

		_contextObjects.put("site_default_public_url", siteDefaultPublicURL);
		_contextObjects.put(
			"community_default_public_url", siteDefaultPublicURL);

		String siteDefaultPrivateURL = HtmlUtil.escape(
			pageGroup.getDisplayURL(_themeDisplay, true));

		_contextObjects.put("site_default_private_url", siteDefaultPrivateURL);
		_contextObjects.put(
			"community_default_private_url", siteDefaultPrivateURL);

		if (layout.isPublicLayout()) {
			_contextObjects.put("site_default_url", siteDefaultPublicURL);
			_contextObjects.put("community_default_url", siteDefaultPublicURL);
		}
		else {
			_contextObjects.put("site_default_url", siteDefaultPrivateURL);
			_contextObjects.put("community_default_url", siteDefaultPrivateURL);
		}

		String theTitle = null;

		String pageTitle = (String)_contextObjects.get("pageTitle");

		String pageSubtitle = (String)_contextObjects.get("pageSubtitle");

		String tilesTitle = (String)_contextObjects.get("tilesTitle");

		if (pageGroup.isLayoutPrototype()) {
			theTitle = pageGroup.getDescriptiveName(locale);
		}
		else if (!Validator.isBlank(tilesTitle)) {
			theTitle = LanguageUtil.get(locale, tilesTitle);
		}
		else if (!Validator.isBlank(pageTitle)) {
			theTitle = pageTitle;

			if (pageSubtitle != null) {
				theTitle = pageSubtitle.concat(" - ").concat(theTitle);
			}
		}
		else {
			String htmlTitle = layout.getHTMLTitle(locale);

			if (Validator.isBlank(htmlTitle)) {
				theTitle = layout.getTitle(locale, false);
			}
			else {
				theTitle = htmlTitle;
			}
		}

		if (tilesTitle == null) {
			theTitle = HtmlUtil.escape(theTitle);
		}

		String companyName = (String)_contextObjects.get("company_name");

		if ((theTitle != null) && !companyName.equals(siteName) &&
			!pageGroup.isLayoutPrototype()) {

			theTitle = theTitle.concat(" - ").concat(siteName);
		}

		_contextObjects.put("the_title", theTitle);

		_contextObjects.put("pages", _themeDisplay.getLayouts());
	}

	private void _addURLContextObjects() {
		Locale locale = _themeDisplay.getLocale();

		_contextObjects.put(
			"show_control_panel", _themeDisplay.isShowControlPanelIcon());

		if (_themeDisplay.isShowControlPanelIcon()) {
			_contextObjects.put(
				"control_panel_text",
				LanguageUtil.get(locale, "control-panel"));
			_contextObjects.put(
				"control_panel_url",
				HtmlUtil.escape(_themeDisplay.getURLControlPanel()));
		}

		_contextObjects.put("show_home", _themeDisplay.isShowHomeIcon());

		if (_themeDisplay.isShowHomeIcon()) {
			_contextObjects.put("home_text", LanguageUtil.get(locale, "home"));

			String homeURL = _themeDisplay.getURLHome();

			if (_request.isRequestedSessionIdFromCookie()) {
				_contextObjects.put("home_url", HtmlUtil.escape(homeURL));
			}
			else {
				HttpSession session = _request.getSession();

				homeURL = PortalUtil.getURLWithSessionId(
					homeURL, session.getId());

				_contextObjects.put("home_url", HtmlUtil.escape(homeURL));
			}
		}

		_contextObjects.put(
			"show_my_account", _themeDisplay.isShowMyAccountIcon());

		if (_themeDisplay.isShowMyAccountIcon()) {
			_contextObjects.put(
				"my_account_text", LanguageUtil.get(locale, "my-account"));

			PortletURL urlMyAccount = _themeDisplay.getURLMyAccount();

			_contextObjects.put("my_account_url", urlMyAccount.toString());
		}

		_contextObjects.put("show_sign_in", _themeDisplay.isShowSignInIcon());

		if (_themeDisplay.isShowSignInIcon()) {
			_contextObjects.put(
				"sign_in_text", LanguageUtil.get(locale, "sign-in"));
			_contextObjects.put("sign_in_url", _themeDisplay.getURLSignIn());
		}

		_contextObjects.put("show_sign_out", _themeDisplay.isShowSignOutIcon());

		if (_themeDisplay.isShowSignOutIcon()) {
			_contextObjects.put(
				"sign_out_text", LanguageUtil.get(locale, "sign-out"));
			_contextObjects.put(
				"sign_out_url", HtmlUtil.escape(_themeDisplay.getURLSignOut()));
		}
	}

	private final Map<String, Object> _contextObjects;
	private final HttpServletRequest _request;
	private final ThemeDisplay _themeDisplay;

}