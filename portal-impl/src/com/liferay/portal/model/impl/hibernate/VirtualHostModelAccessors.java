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
import com.liferay.portal.kernel.model.VirtualHost;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VirtualHostModelAccessors {
	public static class VirtualHostIdAccessor extends ModelPropertyAccessor {
		public VirtualHostIdAccessor() {
			super(new Function<VirtualHost, Long>() {
					@Override
					public Long apply(VirtualHost virtualHost) {
						return virtualHost.getVirtualHostId();
					}
				},
				new BiConsumer<VirtualHost, Long>() {
					@Override
					public void accept(VirtualHost virtualHost,
						Long virtualHostId) {
						virtualHost.setVirtualHostId(virtualHostId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<VirtualHost, Long>() {
					@Override
					public Long apply(VirtualHost virtualHost) {
						return virtualHost.getCompanyId();
					}
				},
				new BiConsumer<VirtualHost, Long>() {
					@Override
					public void accept(VirtualHost virtualHost, Long companyId) {
						virtualHost.setCompanyId(companyId);
					}
				});
		}
	}

	public static class LayoutSetIdAccessor extends ModelPropertyAccessor {
		public LayoutSetIdAccessor() {
			super(new Function<VirtualHost, Long>() {
					@Override
					public Long apply(VirtualHost virtualHost) {
						return virtualHost.getLayoutSetId();
					}
				},
				new BiConsumer<VirtualHost, Long>() {
					@Override
					public void accept(VirtualHost virtualHost, Long layoutSetId) {
						virtualHost.setLayoutSetId(layoutSetId);
					}
				});
		}
	}

	public static class HostnameAccessor extends ModelPropertyAccessor {
		public HostnameAccessor() {
			super(new Function<VirtualHost, String>() {
					@Override
					public String apply(VirtualHost virtualHost) {
						return virtualHost.getHostname();
					}
				},
				new BiConsumer<VirtualHost, String>() {
					@Override
					public void accept(VirtualHost virtualHost, String hostname) {
						virtualHost.setHostname(hostname);
					}
				});
		}
	}

	private VirtualHostModelAccessors() {
	}
}