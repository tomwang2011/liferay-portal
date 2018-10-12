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

package com.liferay.portal.security.wedeploy.auth.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;
import com.liferay.portal.security.wedeploy.auth.model.WeDeployAuthApp;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Supritha Sundaram
 * @generated
 */
public class WeDeployAuthAppModelAccessors {
	public static class WeDeployAuthAppIdAccessor extends ModelPropertyAccessor {
		public WeDeployAuthAppIdAccessor() {
			super(new Function<WeDeployAuthApp, Long>() {
					@Override
					public Long apply(WeDeployAuthApp weDeployAuthApp) {
						return weDeployAuthApp.getWeDeployAuthAppId();
					}
				},
				new BiConsumer<WeDeployAuthApp, Long>() {
					@Override
					public void accept(WeDeployAuthApp weDeployAuthApp,
						Long weDeployAuthAppId) {
						weDeployAuthApp.setWeDeployAuthAppId(weDeployAuthAppId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<WeDeployAuthApp, Long>() {
					@Override
					public Long apply(WeDeployAuthApp weDeployAuthApp) {
						return weDeployAuthApp.getCompanyId();
					}
				},
				new BiConsumer<WeDeployAuthApp, Long>() {
					@Override
					public void accept(WeDeployAuthApp weDeployAuthApp,
						Long companyId) {
						weDeployAuthApp.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<WeDeployAuthApp, Long>() {
					@Override
					public Long apply(WeDeployAuthApp weDeployAuthApp) {
						return weDeployAuthApp.getUserId();
					}
				},
				new BiConsumer<WeDeployAuthApp, Long>() {
					@Override
					public void accept(WeDeployAuthApp weDeployAuthApp,
						Long userId) {
						weDeployAuthApp.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<WeDeployAuthApp, String>() {
					@Override
					public String apply(WeDeployAuthApp weDeployAuthApp) {
						return weDeployAuthApp.getUserName();
					}
				},
				new BiConsumer<WeDeployAuthApp, String>() {
					@Override
					public void accept(WeDeployAuthApp weDeployAuthApp,
						String userName) {
						weDeployAuthApp.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<WeDeployAuthApp, Date>() {
					@Override
					public Date apply(WeDeployAuthApp weDeployAuthApp) {
						return weDeployAuthApp.getCreateDate();
					}
				},
				new BiConsumer<WeDeployAuthApp, Date>() {
					@Override
					public void accept(WeDeployAuthApp weDeployAuthApp,
						Date createDate) {
						weDeployAuthApp.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<WeDeployAuthApp, Date>() {
					@Override
					public Date apply(WeDeployAuthApp weDeployAuthApp) {
						return weDeployAuthApp.getModifiedDate();
					}
				},
				new BiConsumer<WeDeployAuthApp, Date>() {
					@Override
					public void accept(WeDeployAuthApp weDeployAuthApp,
						Date modifiedDate) {
						weDeployAuthApp.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<WeDeployAuthApp, String>() {
					@Override
					public String apply(WeDeployAuthApp weDeployAuthApp) {
						return weDeployAuthApp.getName();
					}
				},
				new BiConsumer<WeDeployAuthApp, String>() {
					@Override
					public void accept(WeDeployAuthApp weDeployAuthApp,
						String name) {
						weDeployAuthApp.setName(name);
					}
				});
		}
	}

	public static class RedirectURIAccessor extends ModelPropertyAccessor {
		public RedirectURIAccessor() {
			super(new Function<WeDeployAuthApp, String>() {
					@Override
					public String apply(WeDeployAuthApp weDeployAuthApp) {
						return weDeployAuthApp.getRedirectURI();
					}
				},
				new BiConsumer<WeDeployAuthApp, String>() {
					@Override
					public void accept(WeDeployAuthApp weDeployAuthApp,
						String redirectURI) {
						weDeployAuthApp.setRedirectURI(redirectURI);
					}
				});
		}
	}

	public static class ClientIdAccessor extends ModelPropertyAccessor {
		public ClientIdAccessor() {
			super(new Function<WeDeployAuthApp, String>() {
					@Override
					public String apply(WeDeployAuthApp weDeployAuthApp) {
						return weDeployAuthApp.getClientId();
					}
				},
				new BiConsumer<WeDeployAuthApp, String>() {
					@Override
					public void accept(WeDeployAuthApp weDeployAuthApp,
						String clientId) {
						weDeployAuthApp.setClientId(clientId);
					}
				});
		}
	}

	public static class ClientSecretAccessor extends ModelPropertyAccessor {
		public ClientSecretAccessor() {
			super(new Function<WeDeployAuthApp, String>() {
					@Override
					public String apply(WeDeployAuthApp weDeployAuthApp) {
						return weDeployAuthApp.getClientSecret();
					}
				},
				new BiConsumer<WeDeployAuthApp, String>() {
					@Override
					public void accept(WeDeployAuthApp weDeployAuthApp,
						String clientSecret) {
						weDeployAuthApp.setClientSecret(clientSecret);
					}
				});
		}
	}

	private WeDeployAuthAppModelAccessors() {
	}
}