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

package com.liferay.item.selector.editor.configuration.internal;

import com.liferay.item.selector.ItemSelector;
import com.liferay.item.selector.ItemSelectorCriterion;
import com.liferay.item.selector.criteria.audio.criterion.AudioItemSelectorCriterion;
import com.liferay.item.selector.criteria.url.criterion.URLItemSelectorCriterion;
import com.liferay.portal.kernel.editor.configuration.EditorConfigContributor;
import com.liferay.portal.kernel.editor.configuration.EditorConfigElementContributorCollector;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.CachedSupplier;
import com.liferay.portal.kernel.util.GetterUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletURL;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Lancha
 */
@Component(service = EditorConfigContributor.class)
public class AudioEditorConfigContributor extends BaseEditorConfigContributor {

	@Override
	public void collectEditorConfigElementContributors(
		EditorConfigElementContributorCollector collector,
		Map<String, Object> inputEditorTaglibAttributes,
		ThemeDisplay themeDisplay,
		RequestBackedPortletURLFactory requestBackedPortletURLFactory) {

		CachedSupplier<String> cachedSupplier = new CachedSupplier<String>() {

			@Override
			protected String doGet() {
				List<ItemSelectorCriterion> itemSelectorCriteria =
					new ArrayList<>(2);

				boolean allowBrowseDocuments = GetterUtil.getBoolean(
					inputEditorTaglibAttributes.get(
						"liferay-ui:input-editor:allowBrowseDocuments"));

				if (allowBrowseDocuments) {
					itemSelectorCriteria.add(new AudioItemSelectorCriterion());
				}

				itemSelectorCriteria.add(new URLItemSelectorCriterion());

				PortletURL itemSelectorURL = getItemSelectorPortletURL(
					inputEditorTaglibAttributes, requestBackedPortletURLFactory,
					itemSelectorCriteria.toArray(
						new ItemSelectorCriterion[
							itemSelectorCriteria.size()]));

				return itemSelectorURL.toString();
			}

		};

		collector.collect("filebrowserAudioBrowseLinkUrl", cachedSupplier);
		collector.collect("filebrowserAudioBrowseUrl", cachedSupplier);
	}

	@Reference(unbind = "-")
	public void setItemSelector(ItemSelector itemSelector) {
		_itemSelector = itemSelector;
	}

	@Override
	protected ItemSelector getItemSelector() {
		return _itemSelector;
	}

	private ItemSelector _itemSelector;

}