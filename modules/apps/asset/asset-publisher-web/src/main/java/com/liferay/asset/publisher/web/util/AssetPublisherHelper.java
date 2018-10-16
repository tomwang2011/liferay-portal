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

package com.liferay.asset.publisher.web.util;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;

/**
 * Provides utility methods to be used from Asset Publisher display templates.
 * This class is injected in the context of Asset Publisher display templates.
 *
 * @author     Juan Fernández
 * @deprecated As of Judson (7.1.x), replaced by {@link
 *             com.liferay.asset.publisher.util.AssetPublisherHelper}
 */
@Deprecated
public class AssetPublisherHelper {

	public static String getAssetViewURL(
		LiferayPortletRequest liferayPortletRequest,
		LiferayPortletResponse liferayPortletResponse, AssetEntry assetEntry) {

		return _assetPublisherHelper.getAssetViewURL(
			liferayPortletRequest, liferayPortletResponse, assetEntry, false);
	}

	public static String getAssetViewURL(
		LiferayPortletRequest liferayPortletRequest,
		LiferayPortletResponse liferayPortletResponse, AssetEntry assetEntry,
		boolean viewInContext) {

		return _assetPublisherHelper.getAssetViewURL(
			liferayPortletRequest, liferayPortletResponse, assetEntry,
			viewInContext);
	}

	public static String getAssetViewURL(
		LiferayPortletRequest liferayPortletRequest,
		LiferayPortletResponse liferayPortletResponse,
		AssetRenderer<?> assetRenderer, AssetEntry assetEntry,
		boolean viewInContext) {

		return _assetPublisherHelper.getAssetViewURL(
			liferayPortletRequest, liferayPortletResponse, assetRenderer,
			assetEntry, viewInContext);
	}

	private static final com.liferay.asset.publisher.util.AssetPublisherHelper
		_assetPublisherHelper =
			AssetPublisherHelperUtil.getAssetPublisherHelper();

}