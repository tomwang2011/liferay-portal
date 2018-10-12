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
import com.liferay.portal.kernel.model.ResourceAction;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ResourceActionModelAccessors {
	public static class ResourceActionIdAccessor extends ModelPropertyAccessor {
		public ResourceActionIdAccessor() {
			super(new Function<ResourceAction, Long>() {
					@Override
					public Long apply(ResourceAction resourceAction) {
						return resourceAction.getResourceActionId();
					}
				},
				new BiConsumer<ResourceAction, Long>() {
					@Override
					public void accept(ResourceAction resourceAction,
						Long resourceActionId) {
						resourceAction.setResourceActionId(resourceActionId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<ResourceAction, String>() {
					@Override
					public String apply(ResourceAction resourceAction) {
						return resourceAction.getName();
					}
				},
				new BiConsumer<ResourceAction, String>() {
					@Override
					public void accept(ResourceAction resourceAction,
						String name) {
						resourceAction.setName(name);
					}
				});
		}
	}

	public static class ActionIdAccessor extends ModelPropertyAccessor {
		public ActionIdAccessor() {
			super(new Function<ResourceAction, String>() {
					@Override
					public String apply(ResourceAction resourceAction) {
						return resourceAction.getActionId();
					}
				},
				new BiConsumer<ResourceAction, String>() {
					@Override
					public void accept(ResourceAction resourceAction,
						String actionId) {
						resourceAction.setActionId(actionId);
					}
				});
		}
	}

	public static class BitwiseValueAccessor extends ModelPropertyAccessor {
		public BitwiseValueAccessor() {
			super(new Function<ResourceAction, Long>() {
					@Override
					public Long apply(ResourceAction resourceAction) {
						return resourceAction.getBitwiseValue();
					}
				},
				new BiConsumer<ResourceAction, Long>() {
					@Override
					public void accept(ResourceAction resourceAction,
						Long bitwiseValue) {
						resourceAction.setBitwiseValue(bitwiseValue);
					}
				});
		}
	}

	private ResourceActionModelAccessors() {
	}
}