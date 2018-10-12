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

import com.liferay.marketplace.model.App;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Ryan Park
 * @generated
 */
public class AppModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<App, String>() {
					@Override
					public String apply(App app) {
						return app.getUuid();
					}
				},
				new BiConsumer<App, String>() {
					@Override
					public void accept(App app, String uuid) {
						app.setUuid(uuid);
					}
				});
		}
	}

	public static class AppIdAccessor extends ModelPropertyAccessor {
		public AppIdAccessor() {
			super(new Function<App, Long>() {
					@Override
					public Long apply(App app) {
						return app.getAppId();
					}
				},
				new BiConsumer<App, Long>() {
					@Override
					public void accept(App app, Long appId) {
						app.setAppId(appId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<App, Long>() {
					@Override
					public Long apply(App app) {
						return app.getCompanyId();
					}
				},
				new BiConsumer<App, Long>() {
					@Override
					public void accept(App app, Long companyId) {
						app.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<App, Long>() {
					@Override
					public Long apply(App app) {
						return app.getUserId();
					}
				},
				new BiConsumer<App, Long>() {
					@Override
					public void accept(App app, Long userId) {
						app.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<App, String>() {
					@Override
					public String apply(App app) {
						return app.getUserName();
					}
				},
				new BiConsumer<App, String>() {
					@Override
					public void accept(App app, String userName) {
						app.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<App, Date>() {
					@Override
					public Date apply(App app) {
						return app.getCreateDate();
					}
				},
				new BiConsumer<App, Date>() {
					@Override
					public void accept(App app, Date createDate) {
						app.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<App, Date>() {
					@Override
					public Date apply(App app) {
						return app.getModifiedDate();
					}
				},
				new BiConsumer<App, Date>() {
					@Override
					public void accept(App app, Date modifiedDate) {
						app.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class RemoteAppIdAccessor extends ModelPropertyAccessor {
		public RemoteAppIdAccessor() {
			super(new Function<App, Long>() {
					@Override
					public Long apply(App app) {
						return app.getRemoteAppId();
					}
				},
				new BiConsumer<App, Long>() {
					@Override
					public void accept(App app, Long remoteAppId) {
						app.setRemoteAppId(remoteAppId);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<App, String>() {
					@Override
					public String apply(App app) {
						return app.getTitle();
					}
				},
				new BiConsumer<App, String>() {
					@Override
					public void accept(App app, String title) {
						app.setTitle(title);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<App, String>() {
					@Override
					public String apply(App app) {
						return app.getDescription();
					}
				},
				new BiConsumer<App, String>() {
					@Override
					public void accept(App app, String description) {
						app.setDescription(description);
					}
				});
		}
	}

	public static class CategoryAccessor extends ModelPropertyAccessor {
		public CategoryAccessor() {
			super(new Function<App, String>() {
					@Override
					public String apply(App app) {
						return app.getCategory();
					}
				},
				new BiConsumer<App, String>() {
					@Override
					public void accept(App app, String category) {
						app.setCategory(category);
					}
				});
		}
	}

	public static class IconURLAccessor extends ModelPropertyAccessor {
		public IconURLAccessor() {
			super(new Function<App, String>() {
					@Override
					public String apply(App app) {
						return app.getIconURL();
					}
				},
				new BiConsumer<App, String>() {
					@Override
					public void accept(App app, String iconURL) {
						app.setIconURL(iconURL);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<App, String>() {
					@Override
					public String apply(App app) {
						return app.getVersion();
					}
				},
				new BiConsumer<App, String>() {
					@Override
					public void accept(App app, String version) {
						app.setVersion(version);
					}
				});
		}
	}

	public static class RequiredAccessor extends ModelPropertyAccessor {
		public RequiredAccessor() {
			super(new Function<App, Boolean>() {
					@Override
					public Boolean apply(App app) {
						return app.getRequired();
					}
				},
				new BiConsumer<App, Boolean>() {
					@Override
					public void accept(App app, Boolean required) {
						app.setRequired(required);
					}
				});
		}
	}

	private AppModelAccessors() {
	}
}