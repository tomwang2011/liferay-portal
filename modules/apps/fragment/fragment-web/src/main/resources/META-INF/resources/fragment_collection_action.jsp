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
FragmentCollection fragmentCollection = fragmentDisplayContext.getFragmentCollection();
%>

<liferay-ui:icon-menu
	direction="down"
	icon="<%= StringPool.BLANK %>"
	markupView="lexicon"
	message="<%= StringPool.BLANK %>"
	showWhenSingleIcon="<%= true %>"
	triggerCssClass="btn btn-unstyled text-secondary"
>
	<c:if test="<%= FragmentPermission.contains(permissionChecker, scopeGroupId, FragmentActionKeys.MANAGE_FRAGMENT_ENTRIES) %>">
		<portlet:renderURL var="editFragmentCollectionURL">
			<portlet:param name="mvcRenderCommandName" value="/fragment/edit_fragment_collection" />
			<portlet:param name="redirect" value="<%= fragmentDisplayContext.getRedirect() %>" />
			<portlet:param name="fragmentCollectionId" value="<%= String.valueOf(fragmentCollection.getFragmentCollectionId()) %>" />
		</portlet:renderURL>

		<liferay-ui:icon
			message="edit"
			url="<%= editFragmentCollectionURL %>"
		/>
	</c:if>

	<portlet:resourceURL id="/fragment/export_fragment_collections" var="exportFragmentCollectionsURL">
		<portlet:param name="fragmentCollectionId" value="<%= String.valueOf(fragmentCollection.getFragmentCollectionId()) %>" />
	</portlet:resourceURL>

	<liferay-ui:icon
		message="export"
		url="<%= exportFragmentCollectionsURL %>"
	/>

	<c:if test="<%= FragmentPermission.contains(permissionChecker, scopeGroupId, FragmentActionKeys.MANAGE_FRAGMENT_ENTRIES) %>">
		<liferay-ui:icon
			message="import"
			onClick='<%= "openImportCollectionView();" %>'
			url="javascript:;"
		/>

		<portlet:renderURL var="redirectURL">
			<portlet:param name="mvcRenderCommandName" value="/fragment/view" />
		</portlet:renderURL>

		<portlet:actionURL name="/fragment/delete_fragment_collection" var="deleteFragmentCollectionURL">
			<portlet:param name="redirect" value="<%= redirectURL.toString() %>" />
			<portlet:param name="fragmentCollectionId" value="<%= String.valueOf(fragmentCollection.getFragmentCollectionId()) %>" />
		</portlet:actionURL>

		<liferay-ui:icon-delete
			url="<%= deleteFragmentCollectionURL %>"
		/>
	</c:if>
</liferay-ui:icon-menu>

<c:if test="<%= FragmentPermission.contains(permissionChecker, scopeGroupId, FragmentActionKeys.MANAGE_FRAGMENT_ENTRIES) %>">
	<aui:script>
		var openImportCollectionView = function() {
			Liferay.Util.openWindow(
				{
					dialog: {
						after: {
							destroy: function(event) {
								window.location.reload();
							}
						},
						destroyOnHide: true
					},
					dialogIframe: {
						bodyCssClass: 'dialog-with-footer'
					},
					id: '<portlet:namespace />openImportCollectionView',
					title: '<liferay-ui:message key="import" />',
					uri: '<portlet:renderURL windowState="<%= LiferayWindowState.POP_UP.toString() %>"><portlet:param name="mvcRenderCommandName" value="/fragment/view_import" /><portlet:param name="fragmentCollectionId" value="<%= String.valueOf(fragmentCollection.getFragmentCollectionId()) %>" /></portlet:renderURL>'
				}
			);
		}
	</aui:script>
</c:if>