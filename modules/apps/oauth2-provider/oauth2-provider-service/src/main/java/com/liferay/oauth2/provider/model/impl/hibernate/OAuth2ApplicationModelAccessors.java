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

import com.liferay.oauth2.provider.model.OAuth2Application;

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
public class OAuth2ApplicationModelAccessors {
	public static class OAuth2ApplicationIdAccessor
		extends ModelPropertyAccessor {
		public OAuth2ApplicationIdAccessor() {
			super(new Function<OAuth2Application, Long>() {
					@Override
					public Long apply(OAuth2Application oAuth2Application) {
						return oAuth2Application.getOAuth2ApplicationId();
					}
				},
				new BiConsumer<OAuth2Application, Long>() {
					@Override
					public void accept(OAuth2Application oAuth2Application,
						Long oAuth2ApplicationId) {
						oAuth2Application.setOAuth2ApplicationId(oAuth2ApplicationId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<OAuth2Application, Long>() {
					@Override
					public Long apply(OAuth2Application oAuth2Application) {
						return oAuth2Application.getCompanyId();
					}
				},
				new BiConsumer<OAuth2Application, Long>() {
					@Override
					public void accept(OAuth2Application oAuth2Application,
						Long companyId) {
						oAuth2Application.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<OAuth2Application, Long>() {
					@Override
					public Long apply(OAuth2Application oAuth2Application) {
						return oAuth2Application.getUserId();
					}
				},
				new BiConsumer<OAuth2Application, Long>() {
					@Override
					public void accept(OAuth2Application oAuth2Application,
						Long userId) {
						oAuth2Application.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<OAuth2Application, String>() {
					@Override
					public String apply(OAuth2Application oAuth2Application) {
						return oAuth2Application.getUserName();
					}
				},
				new BiConsumer<OAuth2Application, String>() {
					@Override
					public void accept(OAuth2Application oAuth2Application,
						String userName) {
						oAuth2Application.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<OAuth2Application, Date>() {
					@Override
					public Date apply(OAuth2Application oAuth2Application) {
						return oAuth2Application.getCreateDate();
					}
				},
				new BiConsumer<OAuth2Application, Date>() {
					@Override
					public void accept(OAuth2Application oAuth2Application,
						Date createDate) {
						oAuth2Application.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<OAuth2Application, Date>() {
					@Override
					public Date apply(OAuth2Application oAuth2Application) {
						return oAuth2Application.getModifiedDate();
					}
				},
				new BiConsumer<OAuth2Application, Date>() {
					@Override
					public void accept(OAuth2Application oAuth2Application,
						Date modifiedDate) {
						oAuth2Application.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class OAuth2ApplicationScopeAliasesIdAccessor
		extends ModelPropertyAccessor {
		public OAuth2ApplicationScopeAliasesIdAccessor() {
			super(new Function<OAuth2Application, Long>() {
					@Override
					public Long apply(OAuth2Application oAuth2Application) {
						return oAuth2Application.getOAuth2ApplicationScopeAliasesId();
					}
				},
				new BiConsumer<OAuth2Application, Long>() {
					@Override
					public void accept(OAuth2Application oAuth2Application,
						Long oAuth2ApplicationScopeAliasesId) {
						oAuth2Application.setOAuth2ApplicationScopeAliasesId(oAuth2ApplicationScopeAliasesId);
					}
				});
		}
	}

	public static class AllowedGrantTypesAccessor extends ModelPropertyAccessor {
		public AllowedGrantTypesAccessor() {
			super(new Function<OAuth2Application, String>() {
					@Override
					public String apply(OAuth2Application oAuth2Application) {
						return oAuth2Application.getAllowedGrantTypes();
					}
				},
				new BiConsumer<OAuth2Application, String>() {
					@Override
					public void accept(OAuth2Application oAuth2Application,
						String allowedGrantTypes) {
						oAuth2Application.setAllowedGrantTypes(allowedGrantTypes);
					}
				});
		}
	}

	public static class ClientIdAccessor extends ModelPropertyAccessor {
		public ClientIdAccessor() {
			super(new Function<OAuth2Application, String>() {
					@Override
					public String apply(OAuth2Application oAuth2Application) {
						return oAuth2Application.getClientId();
					}
				},
				new BiConsumer<OAuth2Application, String>() {
					@Override
					public void accept(OAuth2Application oAuth2Application,
						String clientId) {
						oAuth2Application.setClientId(clientId);
					}
				});
		}
	}

	public static class ClientProfileAccessor extends ModelPropertyAccessor {
		public ClientProfileAccessor() {
			super(new Function<OAuth2Application, Integer>() {
					@Override
					public Integer apply(OAuth2Application oAuth2Application) {
						return oAuth2Application.getClientProfile();
					}
				},
				new BiConsumer<OAuth2Application, Integer>() {
					@Override
					public void accept(OAuth2Application oAuth2Application,
						Integer clientProfile) {
						oAuth2Application.setClientProfile(clientProfile);
					}
				});
		}
	}

	public static class ClientSecretAccessor extends ModelPropertyAccessor {
		public ClientSecretAccessor() {
			super(new Function<OAuth2Application, String>() {
					@Override
					public String apply(OAuth2Application oAuth2Application) {
						return oAuth2Application.getClientSecret();
					}
				},
				new BiConsumer<OAuth2Application, String>() {
					@Override
					public void accept(OAuth2Application oAuth2Application,
						String clientSecret) {
						oAuth2Application.setClientSecret(clientSecret);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<OAuth2Application, String>() {
					@Override
					public String apply(OAuth2Application oAuth2Application) {
						return oAuth2Application.getDescription();
					}
				},
				new BiConsumer<OAuth2Application, String>() {
					@Override
					public void accept(OAuth2Application oAuth2Application,
						String description) {
						oAuth2Application.setDescription(description);
					}
				});
		}
	}

	public static class FeaturesAccessor extends ModelPropertyAccessor {
		public FeaturesAccessor() {
			super(new Function<OAuth2Application, String>() {
					@Override
					public String apply(OAuth2Application oAuth2Application) {
						return oAuth2Application.getFeatures();
					}
				},
				new BiConsumer<OAuth2Application, String>() {
					@Override
					public void accept(OAuth2Application oAuth2Application,
						String features) {
						oAuth2Application.setFeatures(features);
					}
				});
		}
	}

	public static class HomePageURLAccessor extends ModelPropertyAccessor {
		public HomePageURLAccessor() {
			super(new Function<OAuth2Application, String>() {
					@Override
					public String apply(OAuth2Application oAuth2Application) {
						return oAuth2Application.getHomePageURL();
					}
				},
				new BiConsumer<OAuth2Application, String>() {
					@Override
					public void accept(OAuth2Application oAuth2Application,
						String homePageURL) {
						oAuth2Application.setHomePageURL(homePageURL);
					}
				});
		}
	}

	public static class IconFileEntryIdAccessor extends ModelPropertyAccessor {
		public IconFileEntryIdAccessor() {
			super(new Function<OAuth2Application, Long>() {
					@Override
					public Long apply(OAuth2Application oAuth2Application) {
						return oAuth2Application.getIconFileEntryId();
					}
				},
				new BiConsumer<OAuth2Application, Long>() {
					@Override
					public void accept(OAuth2Application oAuth2Application,
						Long iconFileEntryId) {
						oAuth2Application.setIconFileEntryId(iconFileEntryId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<OAuth2Application, String>() {
					@Override
					public String apply(OAuth2Application oAuth2Application) {
						return oAuth2Application.getName();
					}
				},
				new BiConsumer<OAuth2Application, String>() {
					@Override
					public void accept(OAuth2Application oAuth2Application,
						String name) {
						oAuth2Application.setName(name);
					}
				});
		}
	}

	public static class PrivacyPolicyURLAccessor extends ModelPropertyAccessor {
		public PrivacyPolicyURLAccessor() {
			super(new Function<OAuth2Application, String>() {
					@Override
					public String apply(OAuth2Application oAuth2Application) {
						return oAuth2Application.getPrivacyPolicyURL();
					}
				},
				new BiConsumer<OAuth2Application, String>() {
					@Override
					public void accept(OAuth2Application oAuth2Application,
						String privacyPolicyURL) {
						oAuth2Application.setPrivacyPolicyURL(privacyPolicyURL);
					}
				});
		}
	}

	public static class RedirectURIsAccessor extends ModelPropertyAccessor {
		public RedirectURIsAccessor() {
			super(new Function<OAuth2Application, String>() {
					@Override
					public String apply(OAuth2Application oAuth2Application) {
						return oAuth2Application.getRedirectURIs();
					}
				},
				new BiConsumer<OAuth2Application, String>() {
					@Override
					public void accept(OAuth2Application oAuth2Application,
						String redirectURIs) {
						oAuth2Application.setRedirectURIs(redirectURIs);
					}
				});
		}
	}

	private OAuth2ApplicationModelAccessors() {
	}
}