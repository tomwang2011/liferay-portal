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

<%@ include file="/authorize/init.jsp" %>

<%
AssignableScopes assignableScopes = oAuth2AuthorizePortletDisplayContext.getAssignableScopes();

OAuth2Application oAuth2Application = oAuth2AuthorizePortletDisplayContext.getOAuth2Application();

Map<String, String> oAuth2Parameters = oAuth2AuthorizePortletDisplayContext.getOAuth2Parameters();

String replyTo = PortalUtil.escapeRedirect(oAuth2Parameters.get("reply_to"));
%>

<div class="closed consent container-fluid-1280">
	<aui:form action="<%= replyTo %>" method="post" name="fm">
		<aui:fieldset-group markupView="lexicon">
			<div class="panel-body">
				<div class="app-icon aspect-ratio-bg-cover" style="background-image:url('<%= HtmlUtil.escapeAttribute(oAuth2AuthorizePortletDisplayContext.getThumbnailURL()) %>')"></div>

				<liferay-ui:user-portrait
					imageCssClass="user-icon-lg"
					user="<%= user %>"
				/>

				<c:choose>
					<c:when test="<%= oAuth2Application == null %>">
						<h1>
							<liferay-ui:message key="authorize-oauth2-application" />
						</h1>
					</c:when>
					<c:when test="<%= !oAuth2AuthorizePortletDisplayContext.hasCreateTokenApplicationPermission(oAuth2Application) %>">
						<h1>
							<liferay-ui:message key="you-dont-have-permissions-to-authorize-the-application" />
						</h1>
					</c:when>
					<c:otherwise>
						<h1>
							<%= LanguageUtil.format(request, "authorize-x", new String[] {oAuth2Application.getName()}) %>
						</h1>

						<p class="application-wants-permissions text-truncate">
							<liferay-ui:message key="application-wants-permissions-to-access" />
						</p>

						<ul class="list-group">

							<%
							for (String applicationName : assignableScopes.getApplicationNames()) {
								String applicationScopeDescription = StringUtil.merge(assignableScopes.getApplicationScopeDescription(applicationName), ", ");
							%>

								<li class="list-group-item list-group-item-flex">
									<div class="autofit-col">
										<clay:icon
											symbol="check"
										/>
									</div>

									<div class="autofit-col autofit-col-expand">
										<h4 class="list-group-title text-truncate"><%= HtmlUtil.escape(assignableScopes.getApplicationDescription(applicationName)) %></h4>
										<p class="list-group-subtitle text-truncate"><%= applicationScopeDescription %></p>
									</div>
								</li>

							<%
							}
							%>

						</ul>

						<c:if test="<%= !Validator.isBlank(oAuth2Application.getPrivacyPolicyURL()) %>">
							<p class="privacy-policy text-truncate">
								<liferay-ui:message key="application" />

								<aui:a href="<%= HtmlUtil.escapeJSLink(oAuth2Application.getPrivacyPolicyURL()) %>" target="_blank">
									<liferay-ui:message key="privacy-policy" />
								</aui:a>
							</p>
						</c:if>

						<div class="buttons">

							<%
							for (String paramName : oAuth2Parameters.keySet()) {
								if (paramName.equals("reply_to")) {
									continue;
								}
							%>

								<aui:input name="<%= HtmlUtil.escapeAttribute(paramName) %>" type="hidden" useNamespace="<%= false %>" value="<%= oAuth2Parameters.get(paramName) %>" />

							<%
							}
							%>

							<aui:input name="oauthDecision" type="hidden" useNamespace="<%= false %>" value="deny" />

							<aui:button id="allow" value="authorize" />

							<aui:button id="cancel" type="submit" value="cancel" />

							<aui:script>
								$('#<portlet:namespace />allow').on(
									'click',
									function() {
										document.<portlet:namespace/>fm.oauthDecision.value='allow';
										document.<portlet:namespace/>fm.submit();
									}
								);
								$('#<portlet:namespace />cancel').on(
									'click',
									function() {
										document.<portlet:namespace/>fm.oauthDecision.value='deny';
										document.<portlet:namespace/>fm.submit();
									}
								);
							</aui:script>
						</div>
					</c:otherwise>
				</c:choose>
			</div>
		</aui:fieldset-group>
	</aui:form>
</div>