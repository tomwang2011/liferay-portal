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

package com.liferay.frontend.theme.favicon.servlet.internal;

import com.liferay.portal.kernel.model.LayoutSet;
import com.liferay.portal.kernel.model.Theme;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Bruno Basto
 */
@Component(
	immediate = true,
	property = {
		"osgi.http.whiteboard.context.path=/favicon",
		"osgi.http.whiteboard.servlet.name=com.liferay.frontend.theme.favicon.servlet.internal.FaviconServlet",
		"osgi.http.whiteboard.servlet.pattern=/favicon/*"
	},
	service = Servlet.class
)
public class FaviconServlet extends HttpServlet {

	@Override
	protected void doGet(
			HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {

		ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(
			WebKeys.THEME_DISPLAY);

		if (themeDisplay != null) {
			response.sendRedirect(themeDisplay.getPathImage() + "/favicon.ico");

			return;
		}

		LayoutSet layoutSet = (LayoutSet)request.getAttribute(
			WebKeys.VIRTUAL_HOST_LAYOUT_SET);

		if (layoutSet != null) {
			Theme theme = layoutSet.getTheme();

			response.sendRedirect(
				theme.getContextPath() + theme.getImagesPath() +
					"/favicon.ico");
		}
	}

	private static final long serialVersionUID = 1L;

}