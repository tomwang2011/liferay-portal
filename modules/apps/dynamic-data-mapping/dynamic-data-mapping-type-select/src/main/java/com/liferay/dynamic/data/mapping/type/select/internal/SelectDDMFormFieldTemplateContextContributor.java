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

package com.liferay.dynamic.data.mapping.type.select.internal;

import com.liferay.dynamic.data.mapping.form.evaluator.DDMFormFieldEvaluationResult;
import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldOptionsFactory;
import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldTemplateContextContributor;
import com.liferay.dynamic.data.mapping.model.DDMFormField;
import com.liferay.dynamic.data.mapping.model.DDMFormFieldOptions;
import com.liferay.dynamic.data.mapping.model.LocalizedValue;
import com.liferay.dynamic.data.mapping.render.DDMFormFieldRenderingContext;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.AggregateResourceBundle;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ResourceBundleLoader;
import com.liferay.portal.kernel.util.ResourceBundleLoaderUtil;
import com.liferay.portal.kernel.util.ResourceBundleUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Marcellus Tavares
 */
@Component(
	immediate = true, property = "ddm.form.field.type.name=select",
	service = {
		DDMFormFieldTemplateContextContributor.class,
		SelectDDMFormFieldTemplateContextContributor.class
	}
)
public class SelectDDMFormFieldTemplateContextContributor
	implements DDMFormFieldTemplateContextContributor {

	@Override
	public Map<String, Object> getParameters(
		DDMFormField ddmFormField,
		DDMFormFieldRenderingContext ddmFormFieldRenderingContext) {

		Map<String, Object> parameters = new HashMap<>();

		parameters.put(
			"dataSourceType",
			GetterUtil.getString(
				ddmFormField.getProperty("dataSourceType"), "manual"));
		parameters.put(
			"multiple",
			getMultiple(ddmFormField, ddmFormFieldRenderingContext));

		DDMFormFieldOptions ddmFormFieldOptions =
			ddmFormFieldOptionsFactory.create(
				ddmFormField, ddmFormFieldRenderingContext);

		parameters.put(
			"options",
			getOptions(
				ddmFormFieldOptions, ddmFormFieldRenderingContext.getLocale(),
				ddmFormFieldRenderingContext));

		Map<String, String> stringsMap = new HashMap<>();

		ResourceBundle resourceBundle = getResourceBundle(
			ddmFormFieldRenderingContext.getLocale());

		stringsMap.put(
			"chooseAnOption",
			LanguageUtil.get(resourceBundle, "choose-an-option"));
		stringsMap.put(
			"chooseOptions",
			LanguageUtil.get(resourceBundle, "choose-options"));
		stringsMap.put(
			"dynamicallyLoadedData",
			LanguageUtil.get(resourceBundle, "dynamically-loaded-data"));
		stringsMap.put(
			"emptyList", LanguageUtil.get(resourceBundle, "empty-list"));
		stringsMap.put("search", LanguageUtil.get(resourceBundle, "search"));

		parameters.put("strings", stringsMap);

		List<String> predefinedValue = getValue(
			getPredefinedValue(ddmFormField, ddmFormFieldRenderingContext));

		if (predefinedValue != null) {
			parameters.put("predefinedValue", predefinedValue);
		}

		parameters.put(
			"value",
			getValue(
				GetterUtil.getString(
					ddmFormFieldRenderingContext.getValue(), "[]")));

		return parameters;
	}

	protected boolean getMultiple(
		DDMFormField ddmFormField,
		DDMFormFieldRenderingContext ddmFormFieldRenderingContext) {

		DDMFormFieldEvaluationResult ddmFormFieldEvaluationResult =
			(DDMFormFieldEvaluationResult)ddmFormFieldRenderingContext.
				getProperty("ddmFormFieldEvaluationResult");

		if (ddmFormFieldEvaluationResult != null) {
			Boolean multiple = ddmFormFieldEvaluationResult.getProperty(
				"multiple");

			if (multiple != null) {
				return multiple;
			}
		}

		return ddmFormField.isMultiple();
	}

	protected List<Object> getOptions(
		DDMFormFieldOptions ddmFormFieldOptions, Locale locale,
		DDMFormFieldRenderingContext ddmFormFieldRenderingContext) {

		List<Object> options = new ArrayList<>();

		for (String optionValue : ddmFormFieldOptions.getOptionsValues()) {
			Map<String, String> optionMap = new HashMap<>();

			LocalizedValue optionLabel = ddmFormFieldOptions.getOptionLabels(
				optionValue);

			String optionLabelString = optionLabel.getString(locale);

			if (ddmFormFieldRenderingContext.isViewMode()) {
				optionLabelString = HtmlUtil.extractText(optionLabelString);
			}

			optionMap.put("label", optionLabelString);

			optionMap.put("value", optionValue);

			options.add(optionMap);
		}

		return options;
	}

	protected String getPredefinedValue(
		DDMFormField ddmFormField,
		DDMFormFieldRenderingContext ddmFormFieldRenderingContext) {

		LocalizedValue predefinedValue = ddmFormField.getPredefinedValue();

		if (predefinedValue == null) {
			return null;
		}

		String predefinedValueString = predefinedValue.getString(
			ddmFormFieldRenderingContext.getLocale());

		return predefinedValueString;
	}

	protected ResourceBundle getResourceBundle(Locale locale) {
		Class<?> clazz = getClass();

		ResourceBundleLoader portalResourceBundleLoader =
			ResourceBundleLoaderUtil.getPortalResourceBundleLoader();

		ResourceBundle portalResourceBundle =
			portalResourceBundleLoader.loadResourceBundle(locale);

		ResourceBundle resourceBundle = ResourceBundleUtil.getBundle(
			"content.Language", locale, clazz.getClassLoader());

		return new AggregateResourceBundle(
			resourceBundle, portalResourceBundle);
	}

	protected List<String> getValue(String valueString) {
		JSONArray jsonArray = null;

		try {
			jsonArray = jsonFactory.createJSONArray(valueString);
		}
		catch (JSONException jsone) {
			if (_log.isDebugEnabled()) {
				_log.debug(jsone, jsone);
			}

			jsonArray = jsonFactory.createJSONArray();
		}

		List<String> values = new ArrayList<>(jsonArray.length());

		for (int i = 0; i < jsonArray.length(); i++) {
			values.add(String.valueOf(jsonArray.get(i)));
		}

		return values;
	}

	@Reference
	protected DDMFormFieldOptionsFactory ddmFormFieldOptionsFactory;

	@Reference
	protected JSONFactory jsonFactory;

	private static final Log _log = LogFactoryUtil.getLog(
		SelectDDMFormFieldTemplateContextContributor.class);

}