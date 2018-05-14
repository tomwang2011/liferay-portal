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
LayoutPageTemplateDisplayContext layoutPageTemplateDisplayContext = new LayoutPageTemplateDisplayContext(renderRequest, renderResponse, request);

List<LayoutPageTemplateCollection> layoutPageTemplateCollections = layoutPageTemplateDisplayContext.getLayoutPageTemplateCollections();
%>

<clay:navigation-bar
	inverted="<%= true %>"
	navigationItems="<%= layoutsAdminDisplayContext.getNavigationItems() %>"
/>

<div class="container-fluid container-fluid-max-xl container-view">
	<div class="row">
		<div class="col-lg-3">
			<nav class="menubar menubar-transparent menubar-vertical-expand-lg">
				<ul class="nav nav-nested">
					<li class="nav-item">
						<portlet:renderURL var="editLayoutPageTemplateCollectionURL">
							<portlet:param name="mvcRenderCommandName" value="/layout/edit_layout_page_template_collection" />
							<portlet:param name="redirect" value="<%= currentURL %>" />
						</portlet:renderURL>

						<c:choose>
							<c:when test="<%= ListUtil.isNotEmpty(layoutPageTemplateCollections) %>">
								<div class="align-items-center autofit-row">
									<div class="autofit-col autofit-col-expand">
										<strong class="text-uppercase">
											<liferay-ui:message key="collections" />
										</strong>
									</div>

									<div class="autofit-col autofit-col-end">
										<c:if test="<%= layoutPageTemplateDisplayContext.isShowAddButton(LayoutPageTemplateActionKeys.ADD_LAYOUT_PAGE_TEMPLATE_COLLECTION) %>">
											<liferay-ui:icon
												icon="plus"
												iconCssClass="btn btn-monospaced btn-outline-borderless btn-outline-secondary"
												markupView="lexicon"
												url="<%= editLayoutPageTemplateCollectionURL %>"
											/>
										</c:if>
									</div>
								</div>

								<ul class="nav nav-stacked">

									<%
									for (LayoutPageTemplateCollection layoutPageTemplateCollection : layoutPageTemplateCollections) {
									%>

										<li class="nav-item">

											<%
											PortletURL layoutPageTemplateCollectionURL = renderResponse.createRenderURL();

											layoutPageTemplateCollectionURL.setParameter("layoutPageTemplateCollectionId", String.valueOf(layoutPageTemplateCollection.getLayoutPageTemplateCollectionId()));
											layoutPageTemplateCollectionURL.setParameter("tabs1", "page-templates");
											%>

											<a class="nav-link truncate-text <%= (layoutPageTemplateCollection.getLayoutPageTemplateCollectionId() == layoutPageTemplateDisplayContext.getLayoutPageTemplateCollectionId()) ? "active" : StringPool.BLANK %>" href="<%= layoutPageTemplateCollectionURL.toString() %>">
												<%= HtmlUtil.escape(layoutPageTemplateCollection.getName()) %>
											</a>
										</li>

									<%
									}
									%>

								</ul>
							</c:when>
							<c:otherwise>
								<p class="text-uppercase">
									<strong><liferay-ui:message key="collections" /></strong>
								</p>

								<liferay-frontend:empty-result-message
									actionDropdownItems="<%= layoutPageTemplateDisplayContext.isShowAddButton(LayoutPageTemplateActionKeys.ADD_LAYOUT_PAGE_TEMPLATE_COLLECTION) ? layoutPageTemplateDisplayContext.getActionDropdownItems() : null %>"
									animationType="<%= EmptyResultMessageKeys.AnimationType.NONE %>"
									description='<%= LanguageUtil.get(request, "collections-are-needed-to-create-page-templates") %>'
									elementType='<%= LanguageUtil.get(request, "collections") %>'
								/>
							</c:otherwise>
						</c:choose>
					</li>
				</ul>
			</nav>
		</div>

		<div class="col-lg-9">

			<%
			LayoutPageTemplateCollection layoutPageTemplateCollection = layoutPageTemplateDisplayContext.getLayoutPageTemplateCollection();
			%>

			<c:if test="<%= layoutPageTemplateCollection != null %>">
				<div class="sheet">
					<div class="align-items-center autofit-row h3">
						<div class="autofit-col">
							<%= HtmlUtil.escape(layoutPageTemplateCollection.getName()) %>
						</div>

						<div class="autofit-col autofit-col-end inline-item-after">
							<liferay-util:include page="/layout_page_template_collection_action.jsp" servletContext="<%= application %>" />
						</div>
					</div>

					<liferay-util:include page="/view_layout_page_template_entries.jsp" servletContext="<%= application %>" />
				</div>
			</c:if>
		</div>
	</div>
</div>