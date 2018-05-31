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

package com.liferay.portal.workflow.uad.exporter;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.model.WorkflowDefinitionLink;
import com.liferay.portal.kernel.service.WorkflowDefinitionLinkLocalService;
import com.liferay.portal.workflow.uad.constants.PortalWorkflowUADConstants;

import com.liferay.user.associated.data.exporter.DynamicQueryUADExporter;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the workflow definition link UAD exporter.
 *
 * <p>
 * This implementation exists only as a container for the default methods
 * generated by ServiceBuilder. All custom service methods should be put in
 * {@link WorkflowDefinitionLinkUADExporter}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BaseWorkflowDefinitionLinkUADExporter
	extends DynamicQueryUADExporter<WorkflowDefinitionLink> {
	@Override
	public Class<WorkflowDefinitionLink> getTypeClass() {
		return WorkflowDefinitionLink.class;
	}

	@Override
	protected ActionableDynamicQuery doGetActionableDynamicQuery() {
		return workflowDefinitionLinkLocalService.getActionableDynamicQuery();
	}

	@Override
	protected String[] doGetUserIdFieldNames() {
		return PortalWorkflowUADConstants.USER_ID_FIELD_NAMES_WORKFLOW_DEFINITION_LINK;
	}

	@Override
	protected String toXmlString(WorkflowDefinitionLink workflowDefinitionLink) {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.kernel.model.WorkflowDefinitionLink");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>workflowDefinitionLinkId</column-name><column-value><![CDATA[");
		sb.append(workflowDefinitionLink.getWorkflowDefinitionLinkId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(workflowDefinitionLink.getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(workflowDefinitionLink.getUserName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	@Reference
	protected WorkflowDefinitionLinkLocalService workflowDefinitionLinkLocalService;
}