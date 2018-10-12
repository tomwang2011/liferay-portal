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

import com.liferay.oauth2.provider.model.OAuth2ScopeGrant;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OAuth2ScopeGrantModelAccessors {
	public static class OAuth2ScopeGrantIdAccessor extends ModelPropertyAccessor {
		public OAuth2ScopeGrantIdAccessor() {
			super(new Function<OAuth2ScopeGrant, Long>() {
					@Override
					public Long apply(OAuth2ScopeGrant oAuth2ScopeGrant) {
						return oAuth2ScopeGrant.getOAuth2ScopeGrantId();
					}
				},
				new BiConsumer<OAuth2ScopeGrant, Long>() {
					@Override
					public void accept(OAuth2ScopeGrant oAuth2ScopeGrant,
						Long oAuth2ScopeGrantId) {
						oAuth2ScopeGrant.setOAuth2ScopeGrantId(oAuth2ScopeGrantId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<OAuth2ScopeGrant, Long>() {
					@Override
					public Long apply(OAuth2ScopeGrant oAuth2ScopeGrant) {
						return oAuth2ScopeGrant.getCompanyId();
					}
				},
				new BiConsumer<OAuth2ScopeGrant, Long>() {
					@Override
					public void accept(OAuth2ScopeGrant oAuth2ScopeGrant,
						Long companyId) {
						oAuth2ScopeGrant.setCompanyId(companyId);
					}
				});
		}
	}

	public static class OAuth2ApplicationScopeAliasesIdAccessor
		extends ModelPropertyAccessor {
		public OAuth2ApplicationScopeAliasesIdAccessor() {
			super(new Function<OAuth2ScopeGrant, Long>() {
					@Override
					public Long apply(OAuth2ScopeGrant oAuth2ScopeGrant) {
						return oAuth2ScopeGrant.getOAuth2ApplicationScopeAliasesId();
					}
				},
				new BiConsumer<OAuth2ScopeGrant, Long>() {
					@Override
					public void accept(OAuth2ScopeGrant oAuth2ScopeGrant,
						Long oAuth2ApplicationScopeAliasesId) {
						oAuth2ScopeGrant.setOAuth2ApplicationScopeAliasesId(oAuth2ApplicationScopeAliasesId);
					}
				});
		}
	}

	public static class ApplicationNameAccessor extends ModelPropertyAccessor {
		public ApplicationNameAccessor() {
			super(new Function<OAuth2ScopeGrant, String>() {
					@Override
					public String apply(OAuth2ScopeGrant oAuth2ScopeGrant) {
						return oAuth2ScopeGrant.getApplicationName();
					}
				},
				new BiConsumer<OAuth2ScopeGrant, String>() {
					@Override
					public void accept(OAuth2ScopeGrant oAuth2ScopeGrant,
						String applicationName) {
						oAuth2ScopeGrant.setApplicationName(applicationName);
					}
				});
		}
	}

	public static class BundleSymbolicNameAccessor extends ModelPropertyAccessor {
		public BundleSymbolicNameAccessor() {
			super(new Function<OAuth2ScopeGrant, String>() {
					@Override
					public String apply(OAuth2ScopeGrant oAuth2ScopeGrant) {
						return oAuth2ScopeGrant.getBundleSymbolicName();
					}
				},
				new BiConsumer<OAuth2ScopeGrant, String>() {
					@Override
					public void accept(OAuth2ScopeGrant oAuth2ScopeGrant,
						String bundleSymbolicName) {
						oAuth2ScopeGrant.setBundleSymbolicName(bundleSymbolicName);
					}
				});
		}
	}

	public static class ScopeAccessor extends ModelPropertyAccessor {
		public ScopeAccessor() {
			super(new Function<OAuth2ScopeGrant, String>() {
					@Override
					public String apply(OAuth2ScopeGrant oAuth2ScopeGrant) {
						return oAuth2ScopeGrant.getScope();
					}
				},
				new BiConsumer<OAuth2ScopeGrant, String>() {
					@Override
					public void accept(OAuth2ScopeGrant oAuth2ScopeGrant,
						String scope) {
						oAuth2ScopeGrant.setScope(scope);
					}
				});
		}
	}

	private OAuth2ScopeGrantModelAccessors() {
	}
}