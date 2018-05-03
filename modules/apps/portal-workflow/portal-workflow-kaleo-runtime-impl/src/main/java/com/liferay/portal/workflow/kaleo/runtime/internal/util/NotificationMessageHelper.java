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

package com.liferay.portal.workflow.kaleo.runtime.internal.util;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.workflow.kaleo.model.KaleoInstanceToken;
import com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken;
import com.liferay.portal.workflow.kaleo.runtime.ExecutionContext;

import java.io.Serializable;

import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Marcellus Tavares
 */
@Component(immediate = true, service = NotificationMessageHelper.class)
public class NotificationMessageHelper {

	public JSONObject createMessageJSONObject(
		String notificationMessage, ExecutionContext executionContext) {

		JSONObject jsonObject = jsonFactory.createJSONObject();

		Map<String, Serializable> workflowContext =
			executionContext.getWorkflowContext();

		jsonObject.put(
			WorkflowConstants.CONTEXT_COMPANY_ID,
			String.valueOf(
				workflowContext.get(WorkflowConstants.CONTEXT_COMPANY_ID)));
		jsonObject.put(
			WorkflowConstants.CONTEXT_ENTRY_CLASS_NAME,
			(String)workflowContext.get(
				WorkflowConstants.CONTEXT_ENTRY_CLASS_NAME));
		jsonObject.put(
			WorkflowConstants.CONTEXT_ENTRY_CLASS_PK,
			String.valueOf(
				workflowContext.get(WorkflowConstants.CONTEXT_ENTRY_CLASS_PK)));
		jsonObject.put(
			WorkflowConstants.CONTEXT_ENTRY_TYPE,
			(String)workflowContext.get(WorkflowConstants.CONTEXT_ENTRY_TYPE));
		jsonObject.put(
			WorkflowConstants.CONTEXT_GROUP_ID,
			String.valueOf(
				workflowContext.get(WorkflowConstants.CONTEXT_GROUP_ID)));

		KaleoInstanceToken kaleoInstanceToken =
			executionContext.getKaleoInstanceToken();

		long userId = getUserId(executionContext, kaleoInstanceToken);

		jsonObject.put(
			WorkflowConstants.CONTEXT_USER_ID, String.valueOf(userId));

		jsonObject.put("notificationMessage", notificationMessage);

		jsonObject.put(
			"workflowInstanceId", kaleoInstanceToken.getKaleoInstanceId());

		KaleoTaskInstanceToken kaleoTaskInstanceToken =
			executionContext.getKaleoTaskInstanceToken();

		if (kaleoTaskInstanceToken != null) {
			jsonObject.put(
				"workflowTaskId",
				kaleoTaskInstanceToken.getKaleoTaskInstanceTokenId());
		}

		return jsonObject;
	}

	protected long getUserId(
		ExecutionContext executionContext,
		KaleoInstanceToken kaleoInstanceToken) {

		try {
			ServiceContext serviceContext =
				executionContext.getServiceContext();

			return serviceContext.getGuestOrUserId();
		}
		catch (PortalException pe) {
			if (_log.isWarnEnabled()) {
				_log.warn(
					"Unable to get user from context, using userId from " +
						"kaleoInstanceToken instead",
					pe);
			}

			return kaleoInstanceToken.getUserId();
		}
	}

	@Reference
	protected JSONFactory jsonFactory;

	private static final Log _log = LogFactoryUtil.getLog(
		NotificationMessageHelper.class);

}