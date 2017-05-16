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

package com.liferay.taglib.aui.base;

import com.liferay.portal.kernel.util.StringPool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @author Julio Camarero
 * @generated
 */
public abstract class BaseInputTag extends com.liferay.taglib.BaseValidatorTagSupport {

	public static boolean getAutoFocus(Object[] attributes) {
		return (boolean)attributes[_AUTO_FOCUS];
	}

	public static boolean getAutoSize(Object[] attributes) {
		return (boolean)attributes[_AUTO_SIZE];
	}

	public static Object getBean(Object[] attributes) {
		return attributes[_BEAN];
	}

	public static boolean getChangesContext(Object[] attributes) {
		return (boolean)attributes[_CHANGES_CONTEXT];
	}

	public static boolean getChecked(Object[] attributes) {
		return (boolean)attributes[_CHECKED];
	}

	public static long getClassPK(Object[] attributes) {
		return (long)attributes[_CLASS_PK];
	}

	public static long getClassTypePK(Object[] attributes) {
		return (long)attributes[_CLASS_TYPE_PK];
	}

	public static String getCssClass(Object[] attributes) {
		return (String)attributes[_CSS_CLASS];
	}

	public static Object getData(Object[] attributes) {
		return attributes[_DATA];
	}

	public static String getDateTogglerCheckBoxLabel(Object[] attributes) {
		return (String)attributes[_DATE_TOGGLER_CHECK_BOX_LABEL];
	}

	public static String getDefaultLanguageId(Object[] attributes) {
		return (String)attributes[_DEFAULT_LANGUAGE_ID];
	}

	public static boolean getDisabled(Object[] attributes) {
		return (boolean)attributes[_DISABLED];
	}

	public static String getField(Object[] attributes) {
		return (String)attributes[_FIELD];
	}

	public static String getFieldParam(Object[] attributes) {
		return (String)attributes[_FIELD_PARAM];
	}

	public static boolean getFirst(Object[] attributes) {
		return (boolean)attributes[_FIRST];
	}

	public static String getFormName(Object[] attributes) {
		return (String)attributes[_FORM_NAME];
	}

	public static String getHelpMessage(Object[] attributes) {
		return (String)attributes[_HELP_MESSAGE];
	}

	public static String getHelpTextCssClass(Object[] attributes) {
		return (String)attributes[_HELP_TEXT_CSS_CLASS];
	}

	public static String getId(Object[] attributes) {
		return (String)attributes[_ID];
	}

	public static boolean getIgnoreRequestValue(Object[] attributes) {
		return (boolean)attributes[_IGNORE_REQUEST_VALUE];
	}

	public static boolean getInlineField(Object[] attributes) {
		return (boolean)attributes[_INLINE_FIELD];
	}

	public static String getInlineLabel(Object[] attributes) {
		return (String)attributes[_INLINE_LABEL];
	}

	public static String getLabel(Object[] attributes) {
		return (String)attributes[_LABEL];
	}

	public static String getLanguageId(Object[] attributes) {
		return (String)attributes[_LANGUAGE_ID];
	}

	public static boolean getLast(Object[] attributes) {
		return (boolean)attributes[_LAST];
	}

	public static boolean getLocalized(Object[] attributes) {
		return (boolean)attributes[_LOCALIZED];
	}

	public static boolean getLocalizeLabel(Object[] attributes) {
		return (boolean)attributes[_LOCALIZE_LABEL];
	}

	public static Object getMax(Object[] attributes) {
		return attributes[_MAX];
	}

	public static Object getMin(Object[] attributes) {
		return attributes[_MIN];
	}

	public static Class<?> getModel(Object[] attributes) {
		return (Class<?>)attributes[_MODEL];
	}

	public static boolean getMultiple(Object[] attributes) {
		return (boolean)attributes[_MULTIPLE];
	}

	public static String getName(Object[] attributes) {
		return (String)attributes[_NAME];
	}

	public static String getOnChange(Object[] attributes) {
		return (String)attributes[_ON_CHANGE];
	}

	public static String getOnClick(Object[] attributes) {
		return (String)attributes[_ON_CLICK];
	}

	public static String getPlaceholder(Object[] attributes) {
		return (String)attributes[_PLACEHOLDER];
	}

	public static String getPrefix(Object[] attributes) {
		return (String)attributes[_PREFIX];
	}

	public static boolean getRequired(Object[] attributes) {
		return (boolean)attributes[_REQUIRED];
	}

	public static boolean getResizable(Object[] attributes) {
		return (boolean)attributes[_RESIZABLE];
	}

	public static boolean getShowRequiredLabel(Object[] attributes) {
		return (boolean)attributes[_SHOW_REQUIRED_LABEL];
	}

	public static String getSuffix(Object[] attributes) {
		return (String)attributes[_SUFFIX];
	}

	public static String getTitle(Object[] attributes) {
		return (String)attributes[_TITLE];
	}

	public static String getType(Object[] attributes) {
		return (String)attributes[_TYPE];
	}

	public static boolean getUseNamespace(Object[] attributes) {
		return (boolean)attributes[_USE_NAMESPACE];
	}

	public static Object getValue(Object[] attributes) {
		return attributes[_VALUE];
	}

	public static boolean getWrappedField(Object[] attributes) {
		return (boolean)attributes[_WRAPPED_FIELD];
	}

	public static String getWrapperCssClass(Object[] attributes) {
		return (String)attributes[_WRAPPER_CSS_CLASS];
	}

	@Override
	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	public boolean getAutoFocus() {
		return _autoFocus;
	}

	public boolean getAutoSize() {
		return _autoSize;
	}

	public java.lang.Object getBean() {
		return _bean;
	}

	public boolean getChangesContext() {
		return _changesContext;
	}

	public boolean getChecked() {
		return _checked;
	}

	public long getClassPK() {
		return _classPK;
	}

	public long getClassTypePK() {
		return _classTypePK;
	}

	public java.lang.String getCssClass() {
		return _cssClass;
	}

	public java.lang.Object getData() {
		return _data;
	}

	public java.lang.String getDateTogglerCheckboxLabel() {
		return _dateTogglerCheckboxLabel;
	}

	public java.lang.String getDefaultLanguageId() {
		return _defaultLanguageId;
	}

	public boolean getDisabled() {
		return _disabled;
	}

	public java.lang.String getField() {
		return _field;
	}

	public java.lang.String getFieldParam() {
		return _fieldParam;
	}

	public boolean getFirst() {
		return _first;
	}

	public java.lang.String getFormName() {
		return _formName;
	}

	public java.lang.String getHelpMessage() {
		return _helpMessage;
	}

	public java.lang.String getHelpTextCssClass() {
		return _helpTextCssClass;
	}

	public java.lang.String getId() {
		return _id;
	}

	public boolean getIgnoreRequestValue() {
		return _ignoreRequestValue;
	}

	public boolean getInlineField() {
		return _inlineField;
	}

	public java.lang.String getInlineLabel() {
		return _inlineLabel;
	}

	public java.lang.String getLabel() {
		return _label;
	}

	public java.lang.String getLanguageId() {
		return _languageId;
	}

	public boolean getLast() {
		return _last;
	}

	public boolean getLocalized() {
		return _localized;
	}

	public boolean getLocalizeLabel() {
		return _localizeLabel;
	}

	public java.lang.Object getMax() {
		return _max;
	}

	public java.lang.Object getMin() {
		return _min;
	}

	public java.lang.Class<?> getModel() {
		return _model;
	}

	public boolean getMultiple() {
		return _multiple;
	}

	public java.lang.String getName() {
		return _name;
	}

	public java.lang.String getOnChange() {
		return _onChange;
	}

	public java.lang.String getOnClick() {
		return _onClick;
	}

	public java.lang.String getPlaceholder() {
		return _placeholder;
	}

	public java.lang.String getPrefix() {
		return _prefix;
	}

	public boolean getRequired() {
		return _required;
	}

	public boolean getResizable() {
		return _resizable;
	}

	public boolean getShowRequiredLabel() {
		return _showRequiredLabel;
	}

	public java.lang.String getSuffix() {
		return _suffix;
	}

	public java.lang.String getTitle() {
		return _title;
	}

	public java.lang.String getType() {
		return _type;
	}

	public boolean getUseNamespace() {
		return _useNamespace;
	}

	public java.lang.Object getValue() {
		return _value;
	}

	public boolean getWrappedField() {
		return _wrappedField;
	}

	public java.lang.String getWrapperCssClass() {
		return _wrapperCssClass;
	}

	public void setAutoFocus(boolean autoFocus) {
		_autoFocus = autoFocus;
	}

	public void setAutoSize(boolean autoSize) {
		_autoSize = autoSize;
	}

	public void setBean(java.lang.Object bean) {
		_bean = bean;
	}

	public void setChangesContext(boolean changesContext) {
		_changesContext = changesContext;
	}

	public void setChecked(boolean checked) {
		_checked = checked;
	}

	public void setClassPK(long classPK) {
		_classPK = classPK;
	}

	public void setClassTypePK(long classTypePK) {
		_classTypePK = classTypePK;
	}

	public void setCssClass(java.lang.String cssClass) {
		_cssClass = cssClass;
	}

	public void setData(java.lang.Object data) {
		_data = data;
	}

	public void setDateTogglerCheckboxLabel(java.lang.String dateTogglerCheckboxLabel) {
		_dateTogglerCheckboxLabel = dateTogglerCheckboxLabel;
	}

	public void setDefaultLanguageId(java.lang.String defaultLanguageId) {
		_defaultLanguageId = defaultLanguageId;
	}

	public void setDisabled(boolean disabled) {
		_disabled = disabled;
	}

	public void setField(java.lang.String field) {
		_field = field;
	}

	public void setFieldParam(java.lang.String fieldParam) {
		_fieldParam = fieldParam;
	}

	public void setFirst(boolean first) {
		_first = first;
	}

	public void setFormName(java.lang.String formName) {
		_formName = formName;
	}

	public void setHelpMessage(java.lang.String helpMessage) {
		_helpMessage = helpMessage;
	}

	public void setHelpTextCssClass(java.lang.String helpTextCssClass) {
		_helpTextCssClass = helpTextCssClass;
	}

	public void setId(java.lang.String id) {
		_id = id;
	}

	public void setIgnoreRequestValue(boolean ignoreRequestValue) {
		_ignoreRequestValue = ignoreRequestValue;
	}

	public void setInlineField(boolean inlineField) {
		_inlineField = inlineField;
	}

	public void setInlineLabel(java.lang.String inlineLabel) {
		_inlineLabel = inlineLabel;
	}

	public void setLabel(java.lang.String label) {
		_label = label;
	}

	public void setLanguageId(java.lang.String languageId) {
		_languageId = languageId;
	}

	public void setLast(boolean last) {
		_last = last;
	}

	public void setLocalized(boolean localized) {
		_localized = localized;
	}

	public void setLocalizeLabel(boolean localizeLabel) {
		_localizeLabel = localizeLabel;
	}

	public void setMax(java.lang.Object max) {
		_max = max;
	}

	public void setMin(java.lang.Object min) {
		_min = min;
	}

	public void setModel(java.lang.Class<?> model) {
		_model = model;
	}

	public void setMultiple(boolean multiple) {
		_multiple = multiple;
	}

	public void setName(java.lang.String name) {
		_name = name;
	}

	public void setOnChange(java.lang.String onChange) {
		_onChange = onChange;
	}

	public void setOnClick(java.lang.String onClick) {
		_onClick = onClick;
	}

	public void setPlaceholder(java.lang.String placeholder) {
		_placeholder = placeholder;
	}

	public void setPrefix(java.lang.String prefix) {
		_prefix = prefix;
	}

	public void setRequired(boolean required) {
		_required = required;
	}

	public void setResizable(boolean resizable) {
		_resizable = resizable;
	}

	public void setShowRequiredLabel(boolean showRequiredLabel) {
		_showRequiredLabel = showRequiredLabel;
	}

	public void setSuffix(java.lang.String suffix) {
		_suffix = suffix;
	}

	public void setTitle(java.lang.String title) {
		_title = title;
	}

	public void setType(java.lang.String type) {
		_type = type;
	}

	public void setUseNamespace(boolean useNamespace) {
		_useNamespace = useNamespace;
	}

	public void setValue(java.lang.Object value) {
		_value = value;
	}

	public void setWrappedField(boolean wrappedField) {
		_wrappedField = wrappedField;
	}

	public void setWrapperCssClass(java.lang.String wrapperCssClass) {
		_wrapperCssClass = wrapperCssClass;
	}

	@Override
	protected void cleanUp() {
		super.cleanUp();

		_autoFocus = false;
		_autoSize = false;
		_bean = null;
		_changesContext = false;
		_checked = false;
		_classPK = 0;
		_classTypePK = -1;
		_cssClass = StringPool.BLANK;
		_data = null;
		_dateTogglerCheckboxLabel = StringPool.BLANK;
		_defaultLanguageId = StringPool.BLANK;
		_disabled = false;
		_field = StringPool.BLANK;
		_fieldParam = StringPool.BLANK;
		_first = false;
		_formName = StringPool.BLANK;
		_helpMessage = StringPool.BLANK;
		_helpTextCssClass = "input-group-addon";
		_id = null;
		_ignoreRequestValue = false;
		_inlineField = false;
		_inlineLabel = StringPool.BLANK;
		_label = StringPool.BLANK;
		_languageId = StringPool.BLANK;
		_last = false;
		_localized = false;
		_localizeLabel = true;
		_max = null;
		_min = null;
		_model = null;
		_multiple = false;
		_name = StringPool.BLANK;
		_onChange = StringPool.BLANK;
		_onClick = StringPool.BLANK;
		_placeholder = StringPool.BLANK;
		_prefix = StringPool.BLANK;
		_required = false;
		_resizable = false;
		_showRequiredLabel = true;
		_suffix = StringPool.BLANK;
		_title = StringPool.BLANK;
		_type = StringPool.BLANK;
		_useNamespace = true;
		_value = null;
		_wrappedField = false;
		_wrapperCssClass = StringPool.BLANK;
	}

	@Override
	protected String getPage() {
		return _PAGE;
	}

	@Override
	protected void setAttributes(HttpServletRequest request) {
		request.setAttribute("aui:input:autoFocus", String.valueOf(_autoFocus));
		request.setAttribute("aui:input:autoSize", String.valueOf(_autoSize));
		request.setAttribute("aui:input:bean", _bean);
		request.setAttribute("aui:input:changesContext", String.valueOf(_changesContext));
		request.setAttribute("aui:input:checked", String.valueOf(_checked));
		request.setAttribute("aui:input:classPK", String.valueOf(_classPK));
		request.setAttribute("aui:input:classTypePK", String.valueOf(_classTypePK));
		request.setAttribute("aui:input:cssClass", _cssClass);
		request.setAttribute("aui:input:data", _data);
		request.setAttribute("aui:input:dateTogglerCheckboxLabel", _dateTogglerCheckboxLabel);
		request.setAttribute("aui:input:defaultLanguageId", _defaultLanguageId);
		request.setAttribute("aui:input:disabled", String.valueOf(_disabled));
		request.setAttribute("aui:input:field", _field);
		request.setAttribute("aui:input:fieldParam", _fieldParam);
		request.setAttribute("aui:input:first", String.valueOf(_first));
		request.setAttribute("aui:input:formName", _formName);
		request.setAttribute("aui:input:helpMessage", _helpMessage);
		request.setAttribute("aui:input:helpTextCssClass", _helpTextCssClass);
		request.setAttribute("aui:input:id", _id);
		request.setAttribute("aui:input:ignoreRequestValue", String.valueOf(_ignoreRequestValue));
		request.setAttribute("aui:input:inlineField", String.valueOf(_inlineField));
		request.setAttribute("aui:input:inlineLabel", _inlineLabel);
		request.setAttribute("aui:input:label", _label);
		request.setAttribute("aui:input:languageId", _languageId);
		request.setAttribute("aui:input:last", String.valueOf(_last));
		request.setAttribute("aui:input:localized", String.valueOf(_localized));
		request.setAttribute("aui:input:localizeLabel", String.valueOf(_localizeLabel));
		request.setAttribute("aui:input:max", _max);
		request.setAttribute("aui:input:min", _min);
		request.setAttribute("aui:input:model", _model);
		request.setAttribute("aui:input:multiple", String.valueOf(_multiple));
		request.setAttribute("aui:input:name", _name);
		request.setAttribute("aui:input:onChange", _onChange);
		request.setAttribute("aui:input:onClick", _onClick);
		request.setAttribute("aui:input:placeholder", _placeholder);
		request.setAttribute("aui:input:prefix", _prefix);
		request.setAttribute("aui:input:required", String.valueOf(_required));
		request.setAttribute("aui:input:resizable", String.valueOf(_resizable));
		request.setAttribute("aui:input:showRequiredLabel", String.valueOf(_showRequiredLabel));
		request.setAttribute("aui:input:suffix", _suffix);
		request.setAttribute("aui:input:title", _title);
		request.setAttribute("aui:input:type", _type);
		request.setAttribute("aui:input:useNamespace", String.valueOf(_useNamespace));
		request.setAttribute("aui:input:value", _value);
		request.setAttribute("aui:input:wrappedField", String.valueOf(_wrappedField));
		request.setAttribute("aui:input:wrapperCssClass", _wrapperCssClass);
	}

	protected static final String _ATTRIBUTE_NAMESPACE = "aui:input:";

	private static final String _PAGE =
		"/html/taglib/aui/input/page.jsp";

	protected static final int ATTRIBUTES_COUNT = 46;

	private static final int _AUTO_FOCUS = 0;
	private static final int _AUTO_SIZE = 1;
	private static final int _BEAN = 2;
	private static final int _CHANGES_CONTEXT = 3;
	private static final int _CHECKED = 4;
	private static final int _CLASS_PK = 5;
	private static final int _CLASS_TYPE_PK = 6;
	private static final int _CSS_CLASS = 7;
	private static final int _DATA = 8;
	private static final int _DATE_TOGGLER_CHECK_BOX_LABEL = 9;
	private static final int _DEFAULT_LANGUAGE_ID = 10;
	private static final int _DISABLED = 11;
	private static final int _FIELD = 12;
	private static final int _FIELD_PARAM = 13;
	private static final int _FIRST = 14;
	private static final int _FORM_NAME = 15;
	private static final int _HELP_MESSAGE = 16;
	private static final int _HELP_TEXT_CSS_CLASS = 17;
	private static final int _ID = 18;
	private static final int _IGNORE_REQUEST_VALUE = 19;
	private static final int _INLINE_FIELD = 20;
	private static final int _INLINE_LABEL = 21;
	private static final int _LABEL = 22;
	private static final int _LANGUAGE_ID = 23;
	private static final int _LAST = 24;
	private static final int _LOCALIZED = 25;
	private static final int _LOCALIZE_LABEL = 26;
	private static final int _MAX = 27;
	private static final int _MIN = 28;
	private static final int _MODEL = 29;
	private static final int _MULTIPLE = 30;
	private static final int _NAME = 31;
	private static final int _ON_CHANGE = 32;
	private static final int _ON_CLICK = 33;
	private static final int _PLACEHOLDER = 34;
	private static final int _PREFIX = 35;
	private static final int _REQUIRED = 36;
	private static final int _RESIZABLE = 37;
	private static final int _SHOW_REQUIRED_LABEL = 38;
	private static final int _SUFFIX = 39;
	private static final int _TITLE = 40;
	private static final int _TYPE = 41;
	private static final int _USE_NAMESPACE = 42;
	private static final int _VALUE = 43;
	private static final int _WRAPPED_FIELD = 44;
	private static final int _WRAPPER_CSS_CLASS = 45;

	private boolean _autoFocus = false;
	private boolean _autoSize = false;
	private java.lang.Object _bean = null;
	private boolean _changesContext = false;
	private boolean _checked = false;
	private long _classPK = 0;
	private long _classTypePK = -1;
	private java.lang.String _cssClass = StringPool.BLANK;
	private java.lang.Object _data = null;
	private java.lang.String _dateTogglerCheckboxLabel = StringPool.BLANK;
	private java.lang.String _defaultLanguageId = StringPool.BLANK;
	private boolean _disabled = false;
	private java.lang.String _field = StringPool.BLANK;
	private java.lang.String _fieldParam = StringPool.BLANK;
	private boolean _first = false;
	private java.lang.String _formName = StringPool.BLANK;
	private java.lang.String _helpMessage = StringPool.BLANK;
	private java.lang.String _helpTextCssClass = "input-group-addon";
	private java.lang.String _id = StringPool.BLANK;
	private boolean _ignoreRequestValue = false;
	private boolean _inlineField = false;
	private java.lang.String _inlineLabel = StringPool.BLANK;
	private java.lang.String _label = StringPool.BLANK;
	private java.lang.String _languageId = StringPool.BLANK;
	private boolean _last = false;
	private boolean _localized = false;
	private boolean _localizeLabel = true;
	private java.lang.Object _max = null;
	private java.lang.Object _min = null;
	private java.lang.Class<?> _model = null;
	private boolean _multiple = false;
	private java.lang.String _name = StringPool.BLANK;
	private java.lang.String _onChange = StringPool.BLANK;
	private java.lang.String _onClick = StringPool.BLANK;
	private java.lang.String _placeholder = StringPool.BLANK;
	private java.lang.String _prefix = StringPool.BLANK;
	private boolean _required = false;
	private boolean _resizable = false;
	private boolean _showRequiredLabel = true;
	private java.lang.String _suffix = StringPool.BLANK;
	private java.lang.String _title = StringPool.BLANK;
	private java.lang.String _type = StringPool.BLANK;
	private boolean _useNamespace = true;
	private java.lang.Object _value = null;
	private boolean _wrappedField = false;
	private java.lang.String _wrapperCssClass = StringPool.BLANK;

	protected void toAttributes(Object[] attributes) {
		attributes[_AUTO_FOCUS] = _autoFocus;
		attributes[_AUTO_SIZE] = _autoSize;
		attributes[_BEAN] = _bean;
		attributes[_CHANGES_CONTEXT] = _changesContext;
		attributes[_CHECKED] = _checked;
		attributes[_CLASS_PK] = _classPK;
		attributes[_CLASS_TYPE_PK] = _classTypePK;
		attributes[_CSS_CLASS] = _cssClass;
		attributes[_DATA] = _data;
		attributes[_DATE_TOGGLER_CHECK_BOX_LABEL] = _dateTogglerCheckboxLabel;
		attributes[_DEFAULT_LANGUAGE_ID] = _defaultLanguageId;
		attributes[_DISABLED] = _disabled;
		attributes[_FIELD] = _field;
		attributes[_FIELD_PARAM] = _fieldParam;
		attributes[_FIRST] = _first;
		attributes[_FORM_NAME] = _formName;
		attributes[_HELP_MESSAGE] = _helpMessage;
		attributes[_HELP_TEXT_CSS_CLASS] = _helpTextCssClass;
		attributes[_ID] = _id;
		attributes[_IGNORE_REQUEST_VALUE] = _ignoreRequestValue;
		attributes[_INLINE_FIELD] = _inlineField;
		attributes[_INLINE_LABEL] = _inlineLabel;
		attributes[_LABEL] = _label;
		attributes[_LANGUAGE_ID] = _languageId;
		attributes[_LAST] = _last;
		attributes[_LOCALIZED] = _localized;
		attributes[_LOCALIZE_LABEL] = _localizeLabel;
		attributes[_MAX] = _max;
		attributes[_MIN] = _min;
		attributes[_MODEL] = _model;
		attributes[_MULTIPLE] = _multiple;
		attributes[_NAME] = _name;
		attributes[_ON_CHANGE] = _onChange;
		attributes[_ON_CLICK] = _onClick;
		attributes[_PLACEHOLDER] = _placeholder;
		attributes[_PREFIX] = _prefix;
		attributes[_REQUIRED] = _required;
		attributes[_RESIZABLE] = _resizable;
		attributes[_SHOW_REQUIRED_LABEL] = _showRequiredLabel;
		attributes[_SUFFIX] = _suffix;
		attributes[_TITLE] = _title;
		attributes[_TYPE] = _type;
		attributes[_USE_NAMESPACE] = _useNamespace;
		attributes[_VALUE] = _value;
		attributes[_WRAPPED_FIELD] = _wrappedField;
		attributes[_WRAPPER_CSS_CLASS] = _wrapperCssClass;
	}

}