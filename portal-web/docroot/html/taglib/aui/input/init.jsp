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

@generated
--%>

<%@ include file="/html/taglib/taglib-init.jsp" %>

<%@ page import="com.liferay.taglib.aui.InputTag" %>

<%
Object[] attributes = (Object[])request.getAttribute("aui:input:attributes");

boolean autoFocus = InputTag.getAutoFocus(attributes);
boolean autoSize = InputTag.getAutoSize(attributes);
java.lang.Object bean = InputTag.getBean(attributes);
boolean changesContext = InputTag.getChangesContext(attributes);
boolean checked = InputTag.getChecked(attributes);
long classPK = InputTag.getClassPK(attributes);
long classTypePK = InputTag.getClassTypePK(attributes);
java.lang.String cssClass = InputTag.getCssClass(attributes);
java.util.Map data = (java.util.Map)InputTag.getData(attributes);
java.lang.String dateTogglerCheckboxLabel = InputTag.getDateTogglerCheckBoxLabel(attributes);
java.lang.String defaultLanguageId = InputTag.getDefaultLanguageId(attributes);
boolean disabled = InputTag.getDisabled(attributes);
java.lang.String field = InputTag.getField(attributes);
java.lang.String fieldParam = InputTag.getFieldParam(attributes);
boolean first = InputTag.getFirst(attributes);
java.lang.String formName = InputTag.getFormName(attributes);
java.lang.String helpMessage = InputTag.getHelpMessage(attributes);
java.lang.String helpTextCssClass = InputTag.getHelpTextCssClass(attributes);
java.lang.String id = InputTag.getId(attributes);
boolean ignoreRequestValue = InputTag.getIgnoreRequestValue(attributes);
boolean inlineField = InputTag.getInlineField(attributes);
java.lang.String inlineLabel = InputTag.getInlineLabel(attributes);
java.lang.String label = InputTag.getLabel(attributes);
java.lang.String languageId = InputTag.getLanguageId(attributes);
boolean last = InputTag.getLast(attributes);
boolean localized = InputTag.getLocalized(attributes);
boolean localizeLabel = InputTag.getLocalizeLabel(attributes);
java.lang.Number max = GetterUtil.getNumber(InputTag.getMax(attributes), null);
java.lang.Number min = GetterUtil.getNumber(InputTag.getMin(attributes), null);
java.lang.Class<?> model = InputTag.getModel(attributes);
boolean multiple = InputTag.getMultiple(attributes);
java.lang.String name = InputTag.getName(attributes);
java.lang.String onChange = InputTag.getOnChange(attributes);
java.lang.String onClick = InputTag.getOnClick(attributes);
java.lang.String placeholder = InputTag.getPlaceholder(attributes);
java.lang.String prefix = InputTag.getPrefix(attributes);
boolean required = InputTag.getRequired(attributes);
boolean resizable = InputTag.getResizable(attributes);
boolean showRequiredLabel = InputTag.getShowRequiredLabel(attributes);
java.lang.String suffix = InputTag.getSuffix(attributes);
java.lang.String title = InputTag.getTitle(attributes);
java.lang.String type = InputTag.getType(attributes);
boolean useNamespace = InputTag.getUseNamespace(attributes);
java.lang.Object value = InputTag.getValue(attributes);
boolean wrappedField = InputTag.getWrappedField(attributes);
java.lang.String wrapperCssClass = InputTag.getWrapperCssClass(attributes);
Map<String, Object> dynamicAttributes = (Map<String, Object>)request.getAttribute("aui:input:dynamicAttributes");
%>

<%@ include file="/html/taglib/aui/input/init-ext.jspf" %>