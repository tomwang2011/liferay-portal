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

package com.liferay.oauth2.provider.model.impl.hibernate;

import com.liferay.oauth2.provider.model.OAuth2ApplicationScopeAliases;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OAuth2ApplicationScopeAliasesModelAccessors {
	public static class OAuth2ApplicationScopeAliasesIdAccessor
		extends ModelPropertyAccessor {
		public OAuth2ApplicationScopeAliasesIdAccessor() {
			super(new Function<OAuth2ApplicationScopeAliases, Long>() {
					@Override
					public Long apply(
						OAuth2ApplicationScopeAliases oAuth2ApplicationScopeAliases) {
						return oAuth2ApplicationScopeAliases.getOAuth2ApplicationScopeAliasesId();
					}
				},
				new BiConsumer<OAuth2ApplicationScopeAliases, Long>() {
					@Override
					public void accept(
						OAuth2ApplicationScopeAliases oAuth2ApplicationScopeAliases,
						Long oAuth2ApplicationScopeAliasesId) {
						oAuth2ApplicationScopeAliases.setOAuth2ApplicationScopeAliasesId(oAuth2ApplicationScopeAliasesId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<OAuth2ApplicationScopeAliases, Long>() {
					@Override
					public Long apply(
						OAuth2ApplicationScopeAliases oAuth2ApplicationScopeAliases) {
						return oAuth2ApplicationScopeAliases.getCompanyId();
					}
				},
				new BiConsumer<OAuth2ApplicationScopeAliases, Long>() {
					@Override
					public void accept(
						OAuth2ApplicationScopeAliases oAuth2ApplicationScopeAliases,
						Long companyId) {
						oAuth2ApplicationScopeAliases.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<OAuth2ApplicationScopeAliases, Long>() {
					@Override
					public Long apply(
						OAuth2ApplicationScopeAliases oAuth2ApplicationScopeAliases) {
						return oAuth2ApplicationScopeAliases.getUserId();
					}
				},
				new BiConsumer<OAuth2ApplicationScopeAliases, Long>() {
					@Override
					public void accept(
						OAuth2ApplicationScopeAliases oAuth2ApplicationScopeAliases,
						Long userId) {
						oAuth2ApplicationScopeAliases.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<OAuth2ApplicationScopeAliases, String>() {
					@Override
					public String apply(
						OAuth2ApplicationScopeAliases oAuth2ApplicationScopeAliases) {
						return oAuth2ApplicationScopeAliases.getUserName();
					}
				},
				new BiConsumer<OAuth2ApplicationScopeAliases, String>() {
					@Override
					public void accept(
						OAuth2ApplicationScopeAliases oAuth2ApplicationScopeAliases,
						String userName) {
						oAuth2ApplicationScopeAliases.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<OAuth2ApplicationScopeAliases, Date>() {
					@Override
					public Date apply(
						OAuth2ApplicationScopeAliases oAuth2ApplicationScopeAliases) {
						return oAuth2ApplicationScopeAliases.getCreateDate();
					}
				},
				new BiConsumer<OAuth2ApplicationScopeAliases, Date>() {
					@Override
					public void accept(
						OAuth2ApplicationScopeAliases oAuth2ApplicationScopeAliases,
						Date createDate) {
						oAuth2ApplicationScopeAliases.setCreateDate(createDate);
					}
				});
		}
	}

	public static class OAuth2ApplicationIdAccessor
		extends ModelPropertyAccessor {
		public OAuth2ApplicationIdAccessor() {
			super(new Function<OAuth2ApplicationScopeAliases, Long>() {
					@Override
					public Long apply(
						OAuth2ApplicationScopeAliases oAuth2ApplicationScopeAliases) {
						return oAuth2ApplicationScopeAliases.getOAuth2ApplicationId();
					}
				},
				new BiConsumer<OAuth2ApplicationScopeAliases, Long>() {
					@Override
					public void accept(
						OAuth2ApplicationScopeAliases oAuth2ApplicationScopeAliases,
						Long oAuth2ApplicationId) {
						oAuth2ApplicationScopeAliases.setOAuth2ApplicationId(oAuth2ApplicationId);
					}
				});
		}
	}

	public static class ScopeAliasesAccessor extends ModelPropertyAccessor {
		public ScopeAliasesAccessor() {
			super(new Function<OAuth2ApplicationScopeAliases, String>() {
					@Override
					public String apply(
						OAuth2ApplicationScopeAliases oAuth2ApplicationScopeAliases) {
						return oAuth2ApplicationScopeAliases.getScopeAliases();
					}
				},
				new BiConsumer<OAuth2ApplicationScopeAliases, String>() {
					@Override
					public void accept(
						OAuth2ApplicationScopeAliases oAuth2ApplicationScopeAliases,
						String scopeAliases) {
						oAuth2ApplicationScopeAliases.setScopeAliases(scopeAliases);
					}
				});
		}
	}

	public static class ScopeAliasesHashAccessor extends ModelPropertyAccessor {
		public ScopeAliasesHashAccessor() {
			super(new Function<OAuth2ApplicationScopeAliases, Long>() {
					@Override
					public Long apply(
						OAuth2ApplicationScopeAliases oAuth2ApplicationScopeAliases) {
						return oAuth2ApplicationScopeAliases.getScopeAliasesHash();
					}
				},
				new BiConsumer<OAuth2ApplicationScopeAliases, Long>() {
					@Override
					public void accept(
						OAuth2ApplicationScopeAliases oAuth2ApplicationScopeAliases,
						Long scopeAliasesHash) {
						oAuth2ApplicationScopeAliases.setScopeAliasesHash(scopeAliasesHash);
					}
				});
		}
	}

	private OAuth2ApplicationScopeAliasesModelAccessors() {
	}
}