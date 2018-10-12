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
import com.liferay.portal.kernel.model.ServiceComponent;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ServiceComponentModelAccessors {
	public static class ServiceComponentIdAccessor extends ModelPropertyAccessor {
		public ServiceComponentIdAccessor() {
			super(new Function<ServiceComponent, Long>() {
					@Override
					public Long apply(ServiceComponent serviceComponent) {
						return serviceComponent.getServiceComponentId();
					}
				},
				new BiConsumer<ServiceComponent, Long>() {
					@Override
					public void accept(ServiceComponent serviceComponent,
						Long serviceComponentId) {
						serviceComponent.setServiceComponentId(serviceComponentId);
					}
				});
		}
	}

	public static class BuildNamespaceAccessor extends ModelPropertyAccessor {
		public BuildNamespaceAccessor() {
			super(new Function<ServiceComponent, String>() {
					@Override
					public String apply(ServiceComponent serviceComponent) {
						return serviceComponent.getBuildNamespace();
					}
				},
				new BiConsumer<ServiceComponent, String>() {
					@Override
					public void accept(ServiceComponent serviceComponent,
						String buildNamespace) {
						serviceComponent.setBuildNamespace(buildNamespace);
					}
				});
		}
	}

	public static class BuildNumberAccessor extends ModelPropertyAccessor {
		public BuildNumberAccessor() {
			super(new Function<ServiceComponent, Long>() {
					@Override
					public Long apply(ServiceComponent serviceComponent) {
						return serviceComponent.getBuildNumber();
					}
				},
				new BiConsumer<ServiceComponent, Long>() {
					@Override
					public void accept(ServiceComponent serviceComponent,
						Long buildNumber) {
						serviceComponent.setBuildNumber(buildNumber);
					}
				});
		}
	}

	public static class BuildDateAccessor extends ModelPropertyAccessor {
		public BuildDateAccessor() {
			super(new Function<ServiceComponent, Long>() {
					@Override
					public Long apply(ServiceComponent serviceComponent) {
						return serviceComponent.getBuildDate();
					}
				},
				new BiConsumer<ServiceComponent, Long>() {
					@Override
					public void accept(ServiceComponent serviceComponent,
						Long buildDate) {
						serviceComponent.setBuildDate(buildDate);
					}
				});
		}
	}

	public static class DataAccessor extends ModelPropertyAccessor {
		public DataAccessor() {
			super(new Function<ServiceComponent, String>() {
					@Override
					public String apply(ServiceComponent serviceComponent) {
						return serviceComponent.getData();
					}
				},
				new BiConsumer<ServiceComponent, String>() {
					@Override
					public void accept(ServiceComponent serviceComponent,
						String data) {
						serviceComponent.setData(data);
					}
				});
		}
	}

	private ServiceComponentModelAccessors() {
	}
}