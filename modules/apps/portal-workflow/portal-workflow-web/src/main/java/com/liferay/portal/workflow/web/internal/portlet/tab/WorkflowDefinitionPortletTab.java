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

package com.liferay.portal.workflow.web.internal.portlet.tab;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.ResourceBundleLoader;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowDefinition;
import com.liferay.portal.kernel.workflow.WorkflowDefinitionManagerUtil;
import com.liferay.portal.workflow.constants.WorkflowWebKeys;
import com.liferay.portal.workflow.portlet.tab.BaseWorkflowPortletTab;
import com.liferay.portal.workflow.portlet.tab.WorkflowPortletTab;
import com.liferay.portal.workflow.web.internal.display.context.WorkflowDefinitionDisplayContext;
import com.liferay.portal.workflow.web.internal.request.prepocessor.WorkflowPreprocessorHelper;

import java.util.Objects;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Adam Brandizzi
 */
@Component(
	immediate = true,
	property = "portal.workflow.tabs.name=" + WorkflowWebKeys.WORKFLOW_TAB_DEFINITION,
	service = WorkflowPortletTab.class
)
public class WorkflowDefinitionPortletTab extends BaseWorkflowPortletTab {

	@Override
	public String getName() {
		return WorkflowWebKeys.WORKFLOW_TAB_DEFINITION;
	}

	@Override
	public String getSearchJspPath() {
		return "/definition/workflow_definition_search.jsp";
	}

	@Override
	public void prepareRender(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException {

		try {
			String path = workflowPreprocessorHelper.getPath(
				renderRequest, renderResponse);

			WorkflowDefinitionDisplayContext displayContext =
				new WorkflowDefinitionDisplayContext(
					renderRequest, resourceBundleLoader, userLocalService);

			renderRequest.setAttribute(
				WorkflowWebKeys.WORKFLOW_DEFINITION_DISPLAY_CONTEXT,
				displayContext);

			if (Objects.equals(
					path, "/definition/edit_workflow_definition.jsp") ||
				Objects.equals(
					path, "/definition/view_workflow_definition.jsp")) {

				setWorkflowDefinitionRenderRequestAttribute(renderRequest);
			}
		}
		catch (Exception e) {
			if (workflowPreprocessorHelper.isSessionErrorException(e)) {
				workflowPreprocessorHelper.hideDefaultErrorMessage(
					renderRequest);

				SessionErrors.add(renderRequest, e.getClass());
			}
			else {
				throw new PortletException(e);
			}
		}
	}

	@Override
	protected String getJspPath() {
		return "/definition/view.jsp";
	}

	@Reference(
		target = "(bundle.symbolic.name=com.liferay.portal.workflow.web)",
		unbind = "-"
	)
	protected void setResourceBundleLoader(
		ResourceBundleLoader resourceBundleLoader) {

		this.resourceBundleLoader = resourceBundleLoader;
	}

	@Override
	@Reference(
		target = "(osgi.web.symbolicname=com.liferay.portal.workflow.web)",
		unbind = "-"
	)
	protected void setServletContext(ServletContext servletContext) {
		super.setServletContext(servletContext);
	}

	protected void setWorkflowDefinitionRenderRequestAttribute(
			RenderRequest renderRequest)
		throws PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		String name = ParamUtil.getString(renderRequest, "name");
		int version = ParamUtil.getInteger(renderRequest, "version");

		if (Validator.isNull(name)) {
			return;
		}

		WorkflowDefinition workflowDefinition =
			WorkflowDefinitionManagerUtil.getWorkflowDefinition(
				themeDisplay.getCompanyId(), name, version);

		renderRequest.setAttribute(
			WebKeys.WORKFLOW_DEFINITION, workflowDefinition);
	}

	protected ResourceBundleLoader resourceBundleLoader;

	@Reference
	protected UserLocalService userLocalService;

	@Reference
	protected WorkflowPreprocessorHelper workflowPreprocessorHelper;

}