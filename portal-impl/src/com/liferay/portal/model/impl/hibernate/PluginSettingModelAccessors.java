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

package com.liferay.portal.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;
import com.liferay.portal.kernel.model.PluginSetting;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PluginSettingModelAccessors {
	public static class PluginSettingIdAccessor extends ModelPropertyAccessor {
		public PluginSettingIdAccessor() {
			super(new Function<PluginSetting, Long>() {
					@Override
					public Long apply(PluginSetting pluginSetting) {
						return pluginSetting.getPluginSettingId();
					}
				},
				new BiConsumer<PluginSetting, Long>() {
					@Override
					public void accept(PluginSetting pluginSetting,
						Long pluginSettingId) {
						pluginSetting.setPluginSettingId(pluginSettingId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<PluginSetting, Long>() {
					@Override
					public Long apply(PluginSetting pluginSetting) {
						return pluginSetting.getCompanyId();
					}
				},
				new BiConsumer<PluginSetting, Long>() {
					@Override
					public void accept(PluginSetting pluginSetting,
						Long companyId) {
						pluginSetting.setCompanyId(companyId);
					}
				});
		}
	}

	public static class PluginIdAccessor extends ModelPropertyAccessor {
		public PluginIdAccessor() {
			super(new Function<PluginSetting, String>() {
					@Override
					public String apply(PluginSetting pluginSetting) {
						return pluginSetting.getPluginId();
					}
				},
				new BiConsumer<PluginSetting, String>() {
					@Override
					public void accept(PluginSetting pluginSetting,
						String pluginId) {
						pluginSetting.setPluginId(pluginId);
					}
				});
		}
	}

	public static class PluginTypeAccessor extends ModelPropertyAccessor {
		public PluginTypeAccessor() {
			super(new Function<PluginSetting, String>() {
					@Override
					public String apply(PluginSetting pluginSetting) {
						return pluginSetting.getPluginType();
					}
				},
				new BiConsumer<PluginSetting, String>() {
					@Override
					public void accept(PluginSetting pluginSetting,
						String pluginType) {
						pluginSetting.setPluginType(pluginType);
					}
				});
		}
	}

	public static class RolesAccessor extends ModelPropertyAccessor {
		public RolesAccessor() {
			super(new Function<PluginSetting, String>() {
					@Override
					public String apply(PluginSetting pluginSetting) {
						return pluginSetting.getRoles();
					}
				},
				new BiConsumer<PluginSetting, String>() {
					@Override
					public void accept(PluginSetting pluginSetting, String roles) {
						pluginSetting.setRoles(roles);
					}
				});
		}
	}

	public static class ActiveAccessor extends ModelPropertyAccessor {
		public ActiveAccessor() {
			super(new Function<PluginSetting, Boolean>() {
					@Override
					public Boolean apply(PluginSetting pluginSetting) {
						return pluginSetting.getActive();
					}
				},
				new BiConsumer<PluginSetting, Boolean>() {
					@Override
					public void accept(PluginSetting pluginSetting,
						Boolean active) {
						pluginSetting.setActive(active);
					}
				});
		}
	}

	private PluginSettingModelAccessors() {
	}
}