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

<%@ include file="/definition_link/init.jsp" %>

<%
WorkflowDefinitionLinkSearch workflowDefinitionLinkSearchContainer = workflowDefinitionLinkDisplayContext.getSearchContainer();

Map<String, String> resourceTooltips = workflowDefinitionLinkDisplayContext.getResourceTooltips();

boolean showStripeMessage = workflowDefinitionLinkDisplayContext.showStripeMessage(request);
%>

<liferay-util:include page="/definition_link/management_bar.jsp" servletContext="<%= application %>" />

<c:if test="<%= showStripeMessage %>">
	<div class="container-fluid-1280">
		<clay:stripe
			destroyOnHide="true"
			message='<%= LanguageUtil.get(resourceBundle, "the-assets-from-documents-and-media-and-forms-are-assigned-within-their-respective-portlets") %>'
			title="Info"
		/>
	</div>
</c:if>

<div class="container-fluid-1280 workflow-definition-link-container" id="<portlet:namespace />Container">
	<liferay-ui:search-container
		id="searchContainer"
		searchContainer="<%= workflowDefinitionLinkSearchContainer %>"
	>
		<liferay-ui:search-container-row
			className="com.liferay.portal.workflow.web.internal.search.WorkflowDefinitionLinkSearchEntry"
			modelVar="workflowDefinitionLinkSearchEntry"
		>

			<%
			String randomNamespace = StringUtil.randomString(8) + StringPool.UNDERLINE;
			%>

			<liferay-ui:search-container-row-parameter
				name="randomNamespace"
				value="<%= randomNamespace %>"
			/>

			<liferay-ui:search-container-row-parameter
				name="workflowDefinitionLinkSearchEntry"
				value="<%= workflowDefinitionLinkSearchEntry %>"
			/>

			<liferay-ui:search-container-row-parameter
				name="resourceTooltips"
				value="<%= resourceTooltips %>"
			/>

			<liferay-ui:search-container-column-jsp
				cssClass="table-cell-content"
				name="workflow-assigned"
				path="/definition_link/workflow_definition_link_resource.jsp"
			/>

			<liferay-ui:search-container-column-jsp
				cssClass="table-cell-content"
				name="workflow-assigned"
				path="/definition_link/edit_workflow_definition_link.jsp"
			/>

			<liferay-ui:search-container-column-jsp
				cssClass="table-cell-content text-right"
				path="/definition_link/workflow_definition_link_action.jsp"
			/>
		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator
			displayStyle="list"
			markupView="lexicon"
		/>
	</liferay-ui:search-container>
</div>