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

package com.liferay.marketplace.model.impl.hibernate;

import com.liferay.marketplace.model.Module;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Ryan Park
 * @generated
 */
public class ModuleModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<Module, String>() {
					@Override
					public String apply(Module module) {
						return module.getUuid();
					}
				},
				new BiConsumer<Module, String>() {
					@Override
					public void accept(Module module, String uuid) {
						module.setUuid(uuid);
					}
				});
		}
	}

	public static class ModuleIdAccessor extends ModelPropertyAccessor {
		public ModuleIdAccessor() {
			super(new Function<Module, Long>() {
					@Override
					public Long apply(Module module) {
						return module.getModuleId();
					}
				},
				new BiConsumer<Module, Long>() {
					@Override
					public void accept(Module module, Long moduleId) {
						module.setModuleId(moduleId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Module, Long>() {
					@Override
					public Long apply(Module module) {
						return module.getCompanyId();
					}
				},
				new BiConsumer<Module, Long>() {
					@Override
					public void accept(Module module, Long companyId) {
						module.setCompanyId(companyId);
					}
				});
		}
	}

	public static class AppIdAccessor extends ModelPropertyAccessor {
		public AppIdAccessor() {
			super(new Function<Module, Long>() {
					@Override
					public Long apply(Module module) {
						return module.getAppId();
					}
				},
				new BiConsumer<Module, Long>() {
					@Override
					public void accept(Module module, Long appId) {
						module.setAppId(appId);
					}
				});
		}
	}

	public static class BundleSymbolicNameAccessor extends ModelPropertyAccessor {
		public BundleSymbolicNameAccessor() {
			super(new Function<Module, String>() {
					@Override
					public String apply(Module module) {
						return module.getBundleSymbolicName();
					}
				},
				new BiConsumer<Module, String>() {
					@Override
					public void accept(Module module, String bundleSymbolicName) {
						module.setBundleSymbolicName(bundleSymbolicName);
					}
				});
		}
	}

	public static class BundleVersionAccessor extends ModelPropertyAccessor {
		public BundleVersionAccessor() {
			super(new Function<Module, String>() {
					@Override
					public String apply(Module module) {
						return module.getBundleVersion();
					}
				},
				new BiConsumer<Module, String>() {
					@Override
					public void accept(Module module, String bundleVersion) {
						module.setBundleVersion(bundleVersion);
					}
				});
		}
	}

	public static class ContextNameAccessor extends ModelPropertyAccessor {
		public ContextNameAccessor() {
			super(new Function<Module, String>() {
					@Override
					public String apply(Module module) {
						return module.getContextName();
					}
				},
				new BiConsumer<Module, String>() {
					@Override
					public void accept(Module module, String contextName) {
						module.setContextName(contextName);
					}
				});
		}
	}

	private ModuleModelAccessors() {
	}
}