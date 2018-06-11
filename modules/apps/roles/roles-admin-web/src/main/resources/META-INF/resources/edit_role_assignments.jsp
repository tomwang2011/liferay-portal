<%--
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
--%>

<%@ include file="/init.jsp" %>

<%
String tabs2 = ParamUtil.getString(request, "tabs2", "users");

String redirect = ParamUtil.getString(request, "redirect");

long roleId = ParamUtil.getLong(request, "roleId");

Role role = RoleServiceUtil.fetchRole(roleId);

String displayStyle = ParamUtil.getString(request, "displayStyle");

if (Validator.isNull(displayStyle)) {
	displayStyle = portalPreferences.getValue(RolesAdminPortletKeys.ROLES_ADMIN, "assignees-display-style", "list");
}
else {
	portalPreferences.setValue(RolesAdminPortletKeys.ROLES_ADMIN, "assignees-display-style", displayStyle);

	request.setAttribute(WebKeys.SINGLE_PAGE_APPLICATION_CLEAR_CACHE, Boolean.TRUE);
}

EditRoleAssignmentsManagementToolbarDisplayContext editRoleAssignmentsManagementToolbarDisplayContext = new EditRoleAssignmentsManagementToolbarDisplayContext(request, renderRequest, renderResponse, displayStyle, "current");

SearchContainer searchContainer = editRoleAssignmentsManagementToolbarDisplayContext.getSearchContainer();

PortletURL portletURL = editRoleAssignmentsManagementToolbarDisplayContext.getPortletURL();

portletDisplay.setShowBackIcon(true);
portletDisplay.setURLBack(redirect);

renderResponse.setTitle(role.getTitle(locale));
%>

<liferay-util:include page="/edit_role_tabs.jsp" servletContext="<%= application %>" />

<clay:navigation-bar
	navigationItems="<%= roleDisplayContext.getRoleAssignmentsNavigationItems(portletURL) %>"
/>

<clay:management-toolbar
	actionDropdownItems="<%= editRoleAssignmentsManagementToolbarDisplayContext.getActionDropdownItems() %>"
	clearResultsURL="<%= editRoleAssignmentsManagementToolbarDisplayContext.getClearResultsURL() %>"
	componentId="editRoleAssignmentsManagementToolbar"
	filterDropdownItems="<%= editRoleAssignmentsManagementToolbarDisplayContext.getFilterDropdownItems() %>"
	itemsTotal="<%= searchContainer.getTotal() %>"
	searchActionURL="<%= editRoleAssignmentsManagementToolbarDisplayContext.getSearchActionURL() %>"
	searchContainerId="assigneesSearch"
	searchFormName="searchFm"
	selectable="<%= true %>"
	showCreationMenu="<%= true %>"
	showSearch="<%= true %>"
	sortingOrder="<%= searchContainer.getOrderByType() %>"
	sortingURL="<%= editRoleAssignmentsManagementToolbarDisplayContext.getSortingURL() %>"
	viewTypeItems="<%= editRoleAssignmentsManagementToolbarDisplayContext.getViewTypeItems() %>"
/>

<aui:form action="<%= portletURL.toString() %>" cssClass="container-fluid container-fluid-max-xl container-form-lg" method="post" name="fm">
	<aui:input name="tabs2" type="hidden" value="<%= tabs2 %>" />
	<aui:input name="tabs3" type="hidden" value="current" />
	<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
	<aui:input name="roleId" type="hidden" value="<%= role.getRoleId() %>" />
	<aui:input name="addUserIds" type="hidden" />
	<aui:input name="removeUserIds" type="hidden" />
	<aui:input name="addGroupIds" type="hidden" />
	<aui:input name="removeGroupIds" type="hidden" />

	<%
	request.setAttribute("edit_role_assignments.jsp-displayStyle", displayStyle);
	request.setAttribute("edit_role_assignments.jsp-searchContainer", searchContainer);
	%>

	<c:choose>
		<c:when test='<%= tabs2.equals("users") %>'>
			<liferay-util:include page="/edit_role_assignments_users.jsp" servletContext="<%= application %>" />
		</c:when>
		<c:when test='<%= tabs2.equals("sites") %>'>
			<liferay-util:include page="/edit_role_assignments_sites.jsp" servletContext="<%= application %>" />
		</c:when>
		<c:when test='<%= tabs2.equals("organizations") %>'>
			<liferay-util:include page="/edit_role_assignments_organizations.jsp" servletContext="<%= application %>" />
		</c:when>
		<c:when test='<%= tabs2.equals("user-groups") %>'>
			<liferay-util:include page="/edit_role_assignments_user_groups.jsp" servletContext="<%= application %>" />
		</c:when>
	</c:choose>
</aui:form>

<portlet:actionURL name="editRoleAssignments" var="editRoleAssignmentsURL">
	<portlet:param name="mvcPath" value="/edit_role_assignments.jsp" />
	<portlet:param name="tabs1" value="assignees" />
</portlet:actionURL>

<aui:script use="liferay-item-selector-dialog,liferay-portlet-url">
	var form = AUI.$(document.<portlet:namespace />fm);

	<portlet:renderURL var="selectAssigneesURL" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
		<portlet:param name="mvcPath" value="/select_assignees.jsp" />
		<portlet:param name="roleId" value="<%= String.valueOf(roleId) %>" />
		<portlet:param name="displayStyle" value="<%= displayStyle %>" />
		<portlet:param name="tabs2" value="<%= tabs2 %>" />
	</portlet:renderURL>

	var addAssignees = function(event) {
		var itemSelectorDialog = new A.LiferayItemSelectorDialog(
			{
				eventName: '<portlet:namespace />selectAssignees',
				on: {
					selectedItemChange: function(event) {
						var selectedItem = event.newVal;

						if (selectedItem) {
							var assignmentsRedirect = Liferay.PortletURL.createURL('<%= portletURL.toString() %>');

							if (selectedItem.type === 'users') {
								form.fm('addUserIds').val(selectedItem.value);
							}
							else {
								form.fm('addGroupIds').val(selectedItem.value);
							}

							assignmentsRedirect.setParameter('tabs2', selectedItem.type);

							form.fm('redirect').val(assignmentsRedirect.toString());

							submitForm(form, '<%= editRoleAssignmentsURL %>');
						}
					}
				},
				title: '<liferay-ui:message arguments="<%= HtmlUtil.escape(role.getName()) %>" key="add-assignees-to-x" />',
				url: '<%= selectAssigneesURL %>'
			}
		);

		itemSelectorDialog.open();
	}

	<portlet:namespace />unsetRoleAssignments = function() {
		var assigneeType = '<%= HtmlUtil.escapeJS(tabs2) %>';
		var ids = Liferay.Util.listCheckedExcept(form, '<portlet:namespace />allRowIds');

		form.fm('assignmentsRedirect').val('<%= portletURL.toString() %>');

		if (assigneeType === 'users') {
			form.fm('removeUserIds').val(ids);
		}
		else {
			form.fm('removeGroupIds').val(ids);
		}

		submitForm(form, '<%= editRoleAssignmentsURL %>');
	}

	Liferay.componentReady('editRoleAssignmentsManagementToolbar').then(
		function(managementToolbar) {
			managementToolbar.on('creationButtonClicked', addAssignees);
		}
	);
</aui:script>