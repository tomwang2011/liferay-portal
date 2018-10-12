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
import com.liferay.portal.security.wedeploy.auth.model.WeDeployAuthToken;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Supritha Sundaram
 * @generated
 */
public class WeDeployAuthTokenModelAccessors {
	public static class WeDeployAuthTokenIdAccessor
		extends ModelPropertyAccessor {
		public WeDeployAuthTokenIdAccessor() {
			super(new Function<WeDeployAuthToken, Long>() {
					@Override
					public Long apply(WeDeployAuthToken weDeployAuthToken) {
						return weDeployAuthToken.getWeDeployAuthTokenId();
					}
				},
				new BiConsumer<WeDeployAuthToken, Long>() {
					@Override
					public void accept(WeDeployAuthToken weDeployAuthToken,
						Long weDeployAuthTokenId) {
						weDeployAuthToken.setWeDeployAuthTokenId(weDeployAuthTokenId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<WeDeployAuthToken, Long>() {
					@Override
					public Long apply(WeDeployAuthToken weDeployAuthToken) {
						return weDeployAuthToken.getCompanyId();
					}
				},
				new BiConsumer<WeDeployAuthToken, Long>() {
					@Override
					public void accept(WeDeployAuthToken weDeployAuthToken,
						Long companyId) {
						weDeployAuthToken.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<WeDeployAuthToken, Long>() {
					@Override
					public Long apply(WeDeployAuthToken weDeployAuthToken) {
						return weDeployAuthToken.getUserId();
					}
				},
				new BiConsumer<WeDeployAuthToken, Long>() {
					@Override
					public void accept(WeDeployAuthToken weDeployAuthToken,
						Long userId) {
						weDeployAuthToken.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<WeDeployAuthToken, String>() {
					@Override
					public String apply(WeDeployAuthToken weDeployAuthToken) {
						return weDeployAuthToken.getUserName();
					}
				},
				new BiConsumer<WeDeployAuthToken, String>() {
					@Override
					public void accept(WeDeployAuthToken weDeployAuthToken,
						String userName) {
						weDeployAuthToken.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<WeDeployAuthToken, Date>() {
					@Override
					public Date apply(WeDeployAuthToken weDeployAuthToken) {
						return weDeployAuthToken.getCreateDate();
					}
				},
				new BiConsumer<WeDeployAuthToken, Date>() {
					@Override
					public void accept(WeDeployAuthToken weDeployAuthToken,
						Date createDate) {
						weDeployAuthToken.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<WeDeployAuthToken, Date>() {
					@Override
					public Date apply(WeDeployAuthToken weDeployAuthToken) {
						return weDeployAuthToken.getModifiedDate();
					}
				},
				new BiConsumer<WeDeployAuthToken, Date>() {
					@Override
					public void accept(WeDeployAuthToken weDeployAuthToken,
						Date modifiedDate) {
						weDeployAuthToken.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClientIdAccessor extends ModelPropertyAccessor {
		public ClientIdAccessor() {
			super(new Function<WeDeployAuthToken, String>() {
					@Override
					public String apply(WeDeployAuthToken weDeployAuthToken) {
						return weDeployAuthToken.getClientId();
					}
				},
				new BiConsumer<WeDeployAuthToken, String>() {
					@Override
					public void accept(WeDeployAuthToken weDeployAuthToken,
						String clientId) {
						weDeployAuthToken.setClientId(clientId);
					}
				});
		}
	}

	public static class TokenAccessor extends ModelPropertyAccessor {
		public TokenAccessor() {
			super(new Function<WeDeployAuthToken, String>() {
					@Override
					public String apply(WeDeployAuthToken weDeployAuthToken) {
						return weDeployAuthToken.getToken();
					}
				},
				new BiConsumer<WeDeployAuthToken, String>() {
					@Override
					public void accept(WeDeployAuthToken weDeployAuthToken,
						String token) {
						weDeployAuthToken.setToken(token);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<WeDeployAuthToken, Integer>() {
					@Override
					public Integer apply(WeDeployAuthToken weDeployAuthToken) {
						return weDeployAuthToken.getType();
					}
				},
				new BiConsumer<WeDeployAuthToken, Integer>() {
					@Override
					public void accept(WeDeployAuthToken weDeployAuthToken,
						Integer type) {
						weDeployAuthToken.setType(type);
					}
				});
		}
	}

	private WeDeployAuthTokenModelAccessors() {
	}
}