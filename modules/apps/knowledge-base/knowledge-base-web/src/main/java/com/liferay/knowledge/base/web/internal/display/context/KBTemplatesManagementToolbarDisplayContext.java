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

package com.liferay.knowledge.base.web.internal.display.context;

import com.liferay.frontend.taglib.clay.servlet.taglib.util.CreationMenu;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItem;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItemList;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.SafeConsumer;
import com.liferay.knowledge.base.constants.KBActionKeys;
import com.liferay.knowledge.base.model.KBTemplateSearchDisplay;
import com.liferay.knowledge.base.service.KBTemplateServiceUtil;
import com.liferay.knowledge.base.web.internal.search.KBTemplateSearch;
import com.liferay.knowledge.base.web.internal.security.permission.resource.AdminPermission;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.PortletURLUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.portlet.PortletException;
import javax.portlet.PortletURL;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Alejandro Tardín
 */
public class KBTemplatesManagementToolbarDisplayContext {

	public KBTemplatesManagementToolbarDisplayContext(
			LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse, String templatePath)
		throws PortalException {

		_liferayPortletRequest = liferayPortletRequest;
		_liferayPortletResponse = liferayPortletResponse;
		_templatePath = templatePath;

		_currentURLObj = PortletURLUtil.getCurrent(
			_liferayPortletRequest, _liferayPortletResponse);

		_request = liferayPortletRequest.getHttpServletRequest();

		_themeDisplay = (ThemeDisplay)_request.getAttribute(
			WebKeys.THEME_DISPLAY);

		_createSearchContainer();
	}

	public List<DropdownItem> getActionDropdownItems() {
		return new DropdownItemList() {
			{
				add(
					dropdownItem -> {
						dropdownItem.setHref(
							StringBundler.concat(
								"javascript:",
								_liferayPortletResponse.getNamespace(),
								"deleteKBTemplates();"));
						dropdownItem.setIcon("times");
						dropdownItem.setLabel(
							LanguageUtil.get(_request, "delete"));
						dropdownItem.setQuickAction(true);
					});
			}
		};
	}

	public CreationMenu getCreationMenu() {
		return new CreationMenu() {
			{
				if (Validator.isNull(_getKeywords()) &&
					AdminPermission.contains(
						_themeDisplay.getPermissionChecker(),
						_themeDisplay.getScopeGroupId(),
						KBActionKeys.ADD_KB_TEMPLATE)) {

					addDropdownItem(
						dropdownItem -> {
							PortletURL addKBTemplateURL =
								_liferayPortletResponse.createRenderURL();

							addKBTemplateURL.setParameter(
								"mvcPath", _templatePath + "edit_template.jsp");
							addKBTemplateURL.setParameter(
								"redirect", PortalUtil.getCurrentURL(_request));

							dropdownItem.setHref(addKBTemplateURL);

							dropdownItem.setLabel(
								LanguageUtil.get(_request, "add-template"));
						});
				}
			}
		};
	}

	public List<DropdownItem> getFilterDropdownItems() {
		return new DropdownItemList() {
			{
				addGroup(
					dropdownGroupItem -> {
						dropdownGroupItem.setDropdownItems(
							_getOrderByDropdownItems());
						dropdownGroupItem.setLabel(
							LanguageUtil.get(_request, "order-by"));
					});
			}
		};
	}

	public String getOrderByType() {
		return _searchContainer.getOrderByType();
	}

	public SearchContainer getSearchContainer() {
		return _searchContainer;
	}

	public PortletURL getSearchURL() {
		PortletURL searchURL = _liferayPortletResponse.createRenderURL();

		searchURL.setParameter("mvcPath", "/admin/view_templates.jsp");

		return searchURL;
	}

	public PortletURL getSortingURL() throws PortletException {
		PortletURL currentSortingURL = _getCurrentSortingURL();

		currentSortingURL.setParameter(
			"orderByType",
			Objects.equals(getOrderByType(), "asc") ? "desc" : "asc");

		return currentSortingURL;
	}

	public int getTotal() {
		return _searchContainer.getTotal();
	}

	public boolean isDisabled() {
		return !_searchContainer.hasResults();
	}

	private void _createSearchContainer() throws PortalException {
		PortletURL iteratorURL = _liferayPortletResponse.createRenderURL();

		iteratorURL.setParameter("mvcPath", "/admin/view_templates.jsp");

		_searchContainer = new KBTemplateSearch(
			_liferayPortletRequest, iteratorURL);

		String keywords = _getKeywords();

		if (Validator.isNull(keywords)) {
			_searchContainer.setTotal(
				KBTemplateServiceUtil.getGroupKBTemplatesCount(
					_themeDisplay.getScopeGroupId()));
			_searchContainer.setResults(
				KBTemplateServiceUtil.getGroupKBTemplates(
					_themeDisplay.getScopeGroupId(),
					_searchContainer.getStart(), _searchContainer.getEnd(),
					_searchContainer.getOrderByComparator()));
		}
		else {
			KBTemplateSearchDisplay kbTemplateSearchDisplay =
				KBTemplateServiceUtil.getKBTemplateSearchDisplay(
					_themeDisplay.getScopeGroupId(), keywords, keywords, null,
					null, false, new int[0], _searchContainer.getCur(),
					_searchContainer.getDelta(),
					_searchContainer.getOrderByComparator());

			_searchContainer.setResults(kbTemplateSearchDisplay.getResults());
			_searchContainer.setTotal(kbTemplateSearchDisplay.getTotal());
		}
	}

	private PortletURL _getCurrentSortingURL() throws PortletException {
		PortletURL sortingURL = PortletURLUtil.clone(
			_currentURLObj, _liferayPortletResponse);

		sortingURL.setParameter("mvcPath", "/admin/view_templates.jsp");

		return sortingURL;
	}

	private String _getKeywords() {
		return ParamUtil.getString(_request, "keywords");
	}

	private String _getOrderByCol() {
		return _searchContainer.getOrderByCol();
	}

	private List<DropdownItem> _getOrderByDropdownItems() {
		return new DropdownItemList() {
			{
				final Map<String, String> orderColumnsMap = new HashMap<>();

				orderColumnsMap.put("create-date", "create-date");
				orderColumnsMap.put("modified-date", "modified-date");
				orderColumnsMap.put("title", "title");
				orderColumnsMap.put("user-name", "user-name");

				for (Map.Entry<String, String> orderByColEntry :
						orderColumnsMap.entrySet()) {

					add(
						SafeConsumer.ignore(
							dropdownItem -> {
								String orderByCol = orderByColEntry.getKey();

								dropdownItem.setActive(
									orderByCol.equals(_getOrderByCol()));

								dropdownItem.setHref(
									_getCurrentSortingURL(), "orderByCol",
									orderByColEntry.getValue());
								dropdownItem.setLabel(
									LanguageUtil.get(_request, orderByCol));
							}));
				}
			}
		};
	}

	private final PortletURL _currentURLObj;
	private final LiferayPortletRequest _liferayPortletRequest;
	private final LiferayPortletResponse _liferayPortletResponse;
	private final HttpServletRequest _request;
	private SearchContainer _searchContainer;
	private final String _templatePath;
	private final ThemeDisplay _themeDisplay;

}