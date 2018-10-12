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
import com.liferay.portal.kernel.model.Portlet;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PortletModelAccessors {
	public static class IdAccessor extends ModelPropertyAccessor {
		public IdAccessor() {
			super(new Function<Portlet, Long>() {
					@Override
					public Long apply(Portlet portlet) {
						return portlet.getId();
					}
				},
				new BiConsumer<Portlet, Long>() {
					@Override
					public void accept(Portlet portlet, Long id) {
						portlet.setId(id);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Portlet, Long>() {
					@Override
					public Long apply(Portlet portlet) {
						return portlet.getCompanyId();
					}
				},
				new BiConsumer<Portlet, Long>() {
					@Override
					public void accept(Portlet portlet, Long companyId) {
						portlet.setCompanyId(companyId);
					}
				});
		}
	}

	public static class PortletIdAccessor extends ModelPropertyAccessor {
		public PortletIdAccessor() {
			super(new Function<Portlet, String>() {
					@Override
					public String apply(Portlet portlet) {
						return portlet.getPortletId();
					}
				},
				new BiConsumer<Portlet, String>() {
					@Override
					public void accept(Portlet portlet, String portletId) {
						portlet.setPortletId(portletId);
					}
				});
		}
	}

	public static class RolesAccessor extends ModelPropertyAccessor {
		public RolesAccessor() {
			super(new Function<Portlet, String>() {
					@Override
					public String apply(Portlet portlet) {
						return portlet.getRoles();
					}
				},
				new BiConsumer<Portlet, String>() {
					@Override
					public void accept(Portlet portlet, String roles) {
						portlet.setRoles(roles);
					}
				});
		}
	}

	public static class ActiveAccessor extends ModelPropertyAccessor {
		public ActiveAccessor() {
			super(new Function<Portlet, Boolean>() {
					@Override
					public Boolean apply(Portlet portlet) {
						return portlet.getActive();
					}
				},
				new BiConsumer<Portlet, Boolean>() {
					@Override
					public void accept(Portlet portlet, Boolean active) {
						portlet.setActive(active);
					}
				});
		}
	}

	private PortletModelAccessors() {
	}
}