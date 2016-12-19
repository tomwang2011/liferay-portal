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

<%@ include file="/html/taglib/init.jsp" %>

<%
IntegerWrapper iconListIconCount = (IntegerWrapper)request.getAttribute("liferay-ui:icon-list:icon-count");

if (iconListIconCount != null) {
	iconListIconCount.increment();
}

boolean iconListShowWhenSingleIcon = GetterUtil.getBoolean((String)request.getAttribute("liferay-ui:icon-list:showWhenSingleIcon"));
Boolean iconListSingleIcon = (Boolean)request.getAttribute("liferay-ui:icon-list:single-icon");

IntegerWrapper iconMenuIconCount = (IntegerWrapper)request.getAttribute("liferay-ui:icon-menu:icon-count");

if (iconMenuIconCount != null) {
	iconMenuIconCount.increment();
}

boolean iconMenuShowWhenSingleIcon = GetterUtil.getBoolean((String)request.getAttribute("liferay-ui:icon-menu:showWhenSingleIcon"));
Boolean iconMenuSingleIcon = (Boolean)request.getAttribute("liferay-ui:icon-menu:single-icon");

Map<String, Object> attributes = (Map<String, Object>)request.getAttribute("liferay-ui:icon:attributes");

String ariaRole = (String)attributes.get("liferay-ui:icon:ariaRole");
boolean auiImage = (boolean)attributes.get("liferay-ui:icon:auiImage");
String cssClass = (String)attributes.get("liferay-ui:icon:cssClass");
Map<String, Object> data = (Map<String, Object>)attributes.get("liferay-ui:icon:data");
String details = (String)attributes.get("liferay-ui:icon:details");
String icon = (String)attributes.get("liferay-ui:icon:icon");
String iconCssClass = (String)attributes.get("liferay-ui:icon:iconCssClass");
String id = (String)attributes.get("liferay-ui:icon:id");
String image = (String)attributes.get("liferay-ui:icon:image");
boolean forcePost = (boolean)attributes.get("liferay-ui:icon:forcePost");
String markupView = (String)attributes.get("liferay-ui:icon:markupView");
String message = (String)attributes.get("liferay-ui:icon:message");
boolean label = (boolean)attributes.get("liferay-ui:icon:label");
String lang = (String)attributes.get("liferay-ui:icon:lang");
String linkCssClass = (String)attributes.get("liferay-ui:icon:linkCssClass");
boolean localizeMessage = (boolean)attributes.get("liferay-ui:icon:localizeMessage");
String onClick = (String)attributes.get("liferay-ui:icon:onClick");
String src = (String)attributes.get("liferay-ui:icon:src");
String srcHover = (String)attributes.get("liferay-ui:icon:srcHover");
String target = (String)attributes.get("liferay-ui:icon:target");
boolean toolTip = (boolean)attributes.get("liferay-ui:icon:toolTip");
String url = (String)attributes.get("liferay-ui:icon:url");
boolean useDialog = (boolean)attributes.get("liferay-ui:icon:useDialog");

if (forcePost || useDialog) {
	if (data == null) {
		data = new HashMap<String, Object>();
	}

	data.put("senna-off", "true");
}

if (toolTip) {
	cssClass += " lfr-portal-tooltip";
}

linkCssClass += " lfr-icon-item";
%>

<%!
private static final String _AUI_PATH = "../aui/";
%>