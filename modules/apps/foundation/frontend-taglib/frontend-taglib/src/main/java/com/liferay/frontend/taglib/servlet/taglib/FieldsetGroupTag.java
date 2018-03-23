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

package com.liferay.frontend.taglib.servlet.taglib;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

/**
 * @author Eudaldo Alonso
 */
public class FieldsetGroupTag extends IncludeTag {

	@Override
	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	public String getMarkupView() {
		return _markupView;
	}

	public void setMarkupView(String markupView) {
		_markupView = markupView;
	}

	@Override
	protected void cleanUp() {
		super.cleanUp();

		_markupView = null;
	}

	@Override
	protected String getEndPage() {
		if (Validator.isNotNull(getMarkupView())) {
			return "/fieldset_group/" + getMarkupView() + "/end.jsp";
		}

		return _END_PAGE;
	}

	@Override
	protected String getStartPage() {
		if (Validator.isNotNull(getMarkupView())) {
			return "/fieldset_group/" + getMarkupView() + "/start.jsp";
		}

		return _START_PAGE;
	}

	@Override
	protected int processEndTag() throws Exception {
		JspWriter jspWriter = pageContext.getOut();

		jspWriter.write("</div></div>");

		return EVAL_PAGE;
	}

	@Override
	protected void setAttributes(HttpServletRequest request) {
		request.setAttribute(
			"liferay-frontend:fieldset-group:markupView", _markupView);
	}

	private static final String _ATTRIBUTE_NAMESPACE =
		"liferay-frontend:fieldset-group:";

	private static final String _END_PAGE = "/fieldset_group/end.jsp";

	private static final String _START_PAGE = "/fieldset_group/start.jsp";

	private String _markupView;

}