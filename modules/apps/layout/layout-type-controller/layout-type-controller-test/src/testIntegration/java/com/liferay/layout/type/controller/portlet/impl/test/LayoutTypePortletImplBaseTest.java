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

package com.liferay.layout.type.controller.portlet.impl.test;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.LayoutTypePortlet;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.model.PortletPreferences;
import com.liferay.portal.kernel.service.PortletPreferencesLocalServiceUtil;
import com.liferay.portal.kernel.test.rule.DeleteAfterTestRun;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.TestPropsValues;
import com.liferay.portal.kernel.util.PortletKeys;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.util.PropsUtil;
import com.liferay.portal.util.PropsValues;
import com.liferay.portal.util.test.LayoutTestUtil;

import org.junit.After;
import org.junit.Before;

/**
 * @author Manuel de la Peña
 */
public class LayoutTypePortletImplBaseTest {

	@DeleteAfterTestRun
	public static Group group;

	public static Layout layout;
	public static String[] layoutStaticPortletsAll;
	public static LayoutTypePortlet layoutTypePortlet;

	public static PortletPreferences addLayoutPortletPreferences(
			Layout layout, Portlet portlet)
		throws Exception {

		return PortletPreferencesLocalServiceUtil.addPortletPreferences(
			TestPropsValues.getCompanyId(), PortletKeys.PREFS_OWNER_ID_DEFAULT,
			PortletKeys.PREFS_OWNER_TYPE_LAYOUT, layout.getPlid(),
			portlet.getPortletId(), portlet, null);
	}

	@Before
	public void setUp() throws Exception {
		group = GroupTestUtil.addGroup();

		layout = LayoutTestUtil.addLayout(group, false);

		layoutTypePortlet = (LayoutTypePortlet)layout.getLayoutType();

		layoutStaticPortletsAll = PropsValues.LAYOUT_STATIC_PORTLETS_ALL;
	}

	@After
	public void tearDown() {
		StringBundler sb = new StringBundler(layoutStaticPortletsAll.length);

		for (String layoutStaticPortlet : layoutStaticPortletsAll) {
			sb.append(layoutStaticPortlet);
		}

		PropsUtil.set(PropsKeys.LAYOUT_STATIC_PORTLETS_ALL, sb.toString());
	}

}