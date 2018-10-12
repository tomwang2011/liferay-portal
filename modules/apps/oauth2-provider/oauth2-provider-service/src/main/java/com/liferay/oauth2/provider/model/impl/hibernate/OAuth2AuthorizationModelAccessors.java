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

import com.liferay.oauth2.provider.model.OAuth2Authorization;

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
public class OAuth2AuthorizationModelAccessors {
	public static class OAuth2AuthorizationIdAccessor
		extends ModelPropertyAccessor {
		public OAuth2AuthorizationIdAccessor() {
			super(new Function<OAuth2Authorization, Long>() {
					@Override
					public Long apply(OAuth2Authorization oAuth2Authorization) {
						return oAuth2Authorization.getOAuth2AuthorizationId();
					}
				},
				new BiConsumer<OAuth2Authorization, Long>() {
					@Override
					public void accept(
						OAuth2Authorization oAuth2Authorization,
						Long oAuth2AuthorizationId) {
						oAuth2Authorization.setOAuth2AuthorizationId(oAuth2AuthorizationId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<OAuth2Authorization, Long>() {
					@Override
					public Long apply(OAuth2Authorization oAuth2Authorization) {
						return oAuth2Authorization.getCompanyId();
					}
				},
				new BiConsumer<OAuth2Authorization, Long>() {
					@Override
					public void accept(
						OAuth2Authorization oAuth2Authorization, Long companyId) {
						oAuth2Authorization.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<OAuth2Authorization, Long>() {
					@Override
					public Long apply(OAuth2Authorization oAuth2Authorization) {
						return oAuth2Authorization.getUserId();
					}
				},
				new BiConsumer<OAuth2Authorization, Long>() {
					@Override
					public void accept(
						OAuth2Authorization oAuth2Authorization, Long userId) {
						oAuth2Authorization.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<OAuth2Authorization, String>() {
					@Override
					public String apply(OAuth2Authorization oAuth2Authorization) {
						return oAuth2Authorization.getUserName();
					}
				},
				new BiConsumer<OAuth2Authorization, String>() {
					@Override
					public void accept(
						OAuth2Authorization oAuth2Authorization, String userName) {
						oAuth2Authorization.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<OAuth2Authorization, Date>() {
					@Override
					public Date apply(OAuth2Authorization oAuth2Authorization) {
						return oAuth2Authorization.getCreateDate();
					}
				},
				new BiConsumer<OAuth2Authorization, Date>() {
					@Override
					public void accept(
						OAuth2Authorization oAuth2Authorization, Date createDate) {
						oAuth2Authorization.setCreateDate(createDate);
					}
				});
		}
	}

	public static class OAuth2ApplicationIdAccessor
		extends ModelPropertyAccessor {
		public OAuth2ApplicationIdAccessor() {
			super(new Function<OAuth2Authorization, Long>() {
					@Override
					public Long apply(OAuth2Authorization oAuth2Authorization) {
						return oAuth2Authorization.getOAuth2ApplicationId();
					}
				},
				new BiConsumer<OAuth2Authorization, Long>() {
					@Override
					public void accept(
						OAuth2Authorization oAuth2Authorization,
						Long oAuth2ApplicationId) {
						oAuth2Authorization.setOAuth2ApplicationId(oAuth2ApplicationId);
					}
				});
		}
	}

	public static class OAuth2ApplicationScopeAliasesIdAccessor
		extends ModelPropertyAccessor {
		public OAuth2ApplicationScopeAliasesIdAccessor() {
			super(new Function<OAuth2Authorization, Long>() {
					@Override
					public Long apply(OAuth2Authorization oAuth2Authorization) {
						return oAuth2Authorization.getOAuth2ApplicationScopeAliasesId();
					}
				},
				new BiConsumer<OAuth2Authorization, Long>() {
					@Override
					public void accept(
						OAuth2Authorization oAuth2Authorization,
						Long oAuth2ApplicationScopeAliasesId) {
						oAuth2Authorization.setOAuth2ApplicationScopeAliasesId(oAuth2ApplicationScopeAliasesId);
					}
				});
		}
	}

	public static class AccessTokenContentAccessor extends ModelPropertyAccessor {
		public AccessTokenContentAccessor() {
			super(new Function<OAuth2Authorization, String>() {
					@Override
					public String apply(OAuth2Authorization oAuth2Authorization) {
						return oAuth2Authorization.getAccessTokenContent();
					}
				},
				new BiConsumer<OAuth2Authorization, String>() {
					@Override
					public void accept(
						OAuth2Authorization oAuth2Authorization,
						String accessTokenContent) {
						oAuth2Authorization.setAccessTokenContent(accessTokenContent);
					}
				});
		}
	}

	public static class AccessTokenContentHashAccessor
		extends ModelPropertyAccessor {
		public AccessTokenContentHashAccessor() {
			super(new Function<OAuth2Authorization, Long>() {
					@Override
					public Long apply(OAuth2Authorization oAuth2Authorization) {
						return oAuth2Authorization.getAccessTokenContentHash();
					}
				},
				new BiConsumer<OAuth2Authorization, Long>() {
					@Override
					public void accept(
						OAuth2Authorization oAuth2Authorization,
						Long accessTokenContentHash) {
						oAuth2Authorization.setAccessTokenContentHash(accessTokenContentHash);
					}
				});
		}
	}

	public static class AccessTokenCreateDateAccessor
		extends ModelPropertyAccessor {
		public AccessTokenCreateDateAccessor() {
			super(new Function<OAuth2Authorization, Date>() {
					@Override
					public Date apply(OAuth2Authorization oAuth2Authorization) {
						return oAuth2Authorization.getAccessTokenCreateDate();
					}
				},
				new BiConsumer<OAuth2Authorization, Date>() {
					@Override
					public void accept(
						OAuth2Authorization oAuth2Authorization,
						Date accessTokenCreateDate) {
						oAuth2Authorization.setAccessTokenCreateDate(accessTokenCreateDate);
					}
				});
		}
	}

	public static class AccessTokenExpirationDateAccessor
		extends ModelPropertyAccessor {
		public AccessTokenExpirationDateAccessor() {
			super(new Function<OAuth2Authorization, Date>() {
					@Override
					public Date apply(OAuth2Authorization oAuth2Authorization) {
						return oAuth2Authorization.getAccessTokenExpirationDate();
					}
				},
				new BiConsumer<OAuth2Authorization, Date>() {
					@Override
					public void accept(
						OAuth2Authorization oAuth2Authorization,
						Date accessTokenExpirationDate) {
						oAuth2Authorization.setAccessTokenExpirationDate(accessTokenExpirationDate);
					}
				});
		}
	}

	public static class RemoteIPInfoAccessor extends ModelPropertyAccessor {
		public RemoteIPInfoAccessor() {
			super(new Function<OAuth2Authorization, String>() {
					@Override
					public String apply(OAuth2Authorization oAuth2Authorization) {
						return oAuth2Authorization.getRemoteIPInfo();
					}
				},
				new BiConsumer<OAuth2Authorization, String>() {
					@Override
					public void accept(
						OAuth2Authorization oAuth2Authorization,
						String remoteIPInfo) {
						oAuth2Authorization.setRemoteIPInfo(remoteIPInfo);
					}
				});
		}
	}

	public static class RefreshTokenContentAccessor
		extends ModelPropertyAccessor {
		public RefreshTokenContentAccessor() {
			super(new Function<OAuth2Authorization, String>() {
					@Override
					public String apply(OAuth2Authorization oAuth2Authorization) {
						return oAuth2Authorization.getRefreshTokenContent();
					}
				},
				new BiConsumer<OAuth2Authorization, String>() {
					@Override
					public void accept(
						OAuth2Authorization oAuth2Authorization,
						String refreshTokenContent) {
						oAuth2Authorization.setRefreshTokenContent(refreshTokenContent);
					}
				});
		}
	}

	public static class RefreshTokenContentHashAccessor
		extends ModelPropertyAccessor {
		public RefreshTokenContentHashAccessor() {
			super(new Function<OAuth2Authorization, Long>() {
					@Override
					public Long apply(OAuth2Authorization oAuth2Authorization) {
						return oAuth2Authorization.getRefreshTokenContentHash();
					}
				},
				new BiConsumer<OAuth2Authorization, Long>() {
					@Override
					public void accept(
						OAuth2Authorization oAuth2Authorization,
						Long refreshTokenContentHash) {
						oAuth2Authorization.setRefreshTokenContentHash(refreshTokenContentHash);
					}
				});
		}
	}

	public static class RefreshTokenCreateDateAccessor
		extends ModelPropertyAccessor {
		public RefreshTokenCreateDateAccessor() {
			super(new Function<OAuth2Authorization, Date>() {
					@Override
					public Date apply(OAuth2Authorization oAuth2Authorization) {
						return oAuth2Authorization.getRefreshTokenCreateDate();
					}
				},
				new BiConsumer<OAuth2Authorization, Date>() {
					@Override
					public void accept(
						OAuth2Authorization oAuth2Authorization,
						Date refreshTokenCreateDate) {
						oAuth2Authorization.setRefreshTokenCreateDate(refreshTokenCreateDate);
					}
				});
		}
	}

	public static class RefreshTokenExpirationDateAccessor
		extends ModelPropertyAccessor {
		public RefreshTokenExpirationDateAccessor() {
			super(new Function<OAuth2Authorization, Date>() {
					@Override
					public Date apply(OAuth2Authorization oAuth2Authorization) {
						return oAuth2Authorization.getRefreshTokenExpirationDate();
					}
				},
				new BiConsumer<OAuth2Authorization, Date>() {
					@Override
					public void accept(
						OAuth2Authorization oAuth2Authorization,
						Date refreshTokenExpirationDate) {
						oAuth2Authorization.setRefreshTokenExpirationDate(refreshTokenExpirationDate);
					}
				});
		}
	}

	private OAuth2AuthorizationModelAccessors() {
	}
}