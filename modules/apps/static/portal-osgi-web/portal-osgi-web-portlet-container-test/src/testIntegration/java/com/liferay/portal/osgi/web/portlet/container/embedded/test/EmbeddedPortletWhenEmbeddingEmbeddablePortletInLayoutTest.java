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

package com.liferay.portal.osgi.web.portlet.container.embedded.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.LayoutTypePortlet;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.model.PortletPreferences;
import com.liferay.portal.kernel.service.PortletLocalServiceUtil;
import com.liferay.portal.kernel.service.PortletPreferencesLocalServiceUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.DeleteAfterTestRun;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.test.util.TestPropsValues;
import com.liferay.portal.kernel.util.PortletKeys;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.util.PropsUtil;
import com.liferay.portal.util.PropsValues;
import com.liferay.portal.util.test.LayoutTestUtil;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Manuel de la Peña
 */
@RunWith(Arquillian.class)
public class EmbeddedPortletWhenEmbeddingEmbeddablePortletInLayoutTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new LiferayIntegrationTestRule();

	@Before
	public void setUp() throws Exception {
		_group = GroupTestUtil.addGroup();

		_layout = LayoutTestUtil.addLayout(_group);

		_layoutTypePortlet = (LayoutTypePortlet)_layout.getLayoutType();

		_layoutStaticPortletsAll = PropsValues.LAYOUT_STATIC_PORTLETS_ALL;
	}

	@Test
	public void shouldNotReturnItFromExplicitlyAddedPortlets()
		throws Exception {

		Portlet portlet = PortletLocalServiceUtil.getPortletById(
			PortletKeys.LOGIN);

		PortletPreferencesLocalServiceUtil.addPortletPreferences(
			TestPropsValues.getCompanyId(), PortletKeys.PREFS_OWNER_ID_DEFAULT,
			PortletKeys.PREFS_OWNER_TYPE_LAYOUT, _layout.getPlid(),
			portlet.getPortletId(), portlet, null);

		List<Portlet> explicitlyAddedPortlets =
			_layoutTypePortlet.getExplicitlyAddedPortlets();

		Assert.assertFalse(
			explicitlyAddedPortlets.toString(),
			explicitlyAddedPortlets.contains(portlet));
	}

	@Test
	public void shouldReturnItFromAllPortlets() throws Exception {
		Portlet portlet = PortletLocalServiceUtil.getPortletById(
			PortletKeys.LOGIN);

		PortletPreferencesLocalServiceUtil.addPortletPreferences(
			TestPropsValues.getCompanyId(), PortletKeys.PREFS_OWNER_ID_DEFAULT,
			PortletKeys.PREFS_OWNER_TYPE_LAYOUT, _layout.getPlid(),
			portlet.getPortletId(), portlet, null);

		PortletPreferencesLocalServiceUtil.addPortletPreferences(
			TestPropsValues.getCompanyId(), _layout.getGroupId(),
			PortletKeys.PREFS_OWNER_TYPE_LAYOUT, PortletKeys.PREFS_PLID_SHARED,
			portlet.getPortletId(), portlet, null);

		List<Portlet> allPortlets = _layoutTypePortlet.getAllPortlets();

		Assert.assertTrue(
			allPortlets.toString(), allPortlets.contains(portlet));
	}

	@Test
	public void shouldReturnItFromEmbeddedPortlets() throws Exception {
		Portlet portlet = PortletLocalServiceUtil.getPortletById(
			PortletKeys.LOGIN);

		PortletPreferencesLocalServiceUtil.addPortletPreferences(
			TestPropsValues.getCompanyId(), PortletKeys.PREFS_OWNER_ID_DEFAULT,
			PortletKeys.PREFS_OWNER_TYPE_LAYOUT, _layout.getPlid(),
			portlet.getPortletId(), portlet, null);

		PortletPreferencesLocalServiceUtil.addPortletPreferences(
			TestPropsValues.getCompanyId(), _layout.getGroupId(),
			PortletKeys.PREFS_OWNER_TYPE_LAYOUT, PortletKeys.PREFS_PLID_SHARED,
			portlet.getPortletId(), portlet, null);

		List<Portlet> embeddedPortlets =
			_layoutTypePortlet.getEmbeddedPortlets();

		Assert.assertTrue(
			embeddedPortlets.toString(), embeddedPortlets.contains(portlet));
	}

	@Test
	public void shouldReturnItsConfiguration() throws Exception {
		Portlet portlet = PortletLocalServiceUtil.getPortletById(
			PortletKeys.LOGIN);

		String defaultPreferences = RandomTestUtil.randomString();

		PortletPreferencesLocalServiceUtil.addPortletPreferences(
			TestPropsValues.getCompanyId(), PortletKeys.PREFS_OWNER_ID_DEFAULT,
			PortletKeys.PREFS_OWNER_TYPE_LAYOUT, _layout.getPlid(),
			portlet.getPortletId(), portlet, defaultPreferences);

		List<PortletPreferences> portletPreferences =
			PortletPreferencesLocalServiceUtil.getPortletPreferences(
				_layout.getPlid(), portlet.getPortletId());

		Assert.assertEquals(
			portletPreferences.toString(), 1, portletPreferences.size());

		PortletPreferences embeddedPortletPreference = portletPreferences.get(
			0);

		Assert.assertEquals(
			defaultPreferences, embeddedPortletPreference.getPreferences());
	}

	@After
	public void tearDown() {
		StringBundler sb = new StringBundler(_layoutStaticPortletsAll.length);

		for (String portletId : _layoutStaticPortletsAll) {
			sb.append(portletId);
		}

		PropsUtil.set(PropsKeys.LAYOUT_STATIC_PORTLETS_ALL, sb.toString());
	}

	@DeleteAfterTestRun
	private static Group _group;

	private static Layout _layout;
	private static String[] _layoutStaticPortletsAll;
	private static LayoutTypePortlet _layoutTypePortlet;

}