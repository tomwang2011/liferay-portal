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

package com.liferay.site.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.site.model.SiteFriendlyURL;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SiteFriendlyURLModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<SiteFriendlyURL, String>() {
					@Override
					public String apply(SiteFriendlyURL siteFriendlyURL) {
						return siteFriendlyURL.getUuid();
					}
				},
				new BiConsumer<SiteFriendlyURL, String>() {
					@Override
					public void accept(SiteFriendlyURL siteFriendlyURL,
						String uuid) {
						siteFriendlyURL.setUuid(uuid);
					}
				});
		}
	}

	public static class SiteFriendlyURLIdAccessor extends ModelPropertyAccessor {
		public SiteFriendlyURLIdAccessor() {
			super(new Function<SiteFriendlyURL, Long>() {
					@Override
					public Long apply(SiteFriendlyURL siteFriendlyURL) {
						return siteFriendlyURL.getSiteFriendlyURLId();
					}
				},
				new BiConsumer<SiteFriendlyURL, Long>() {
					@Override
					public void accept(SiteFriendlyURL siteFriendlyURL,
						Long siteFriendlyURLId) {
						siteFriendlyURL.setSiteFriendlyURLId(siteFriendlyURLId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<SiteFriendlyURL, Long>() {
					@Override
					public Long apply(SiteFriendlyURL siteFriendlyURL) {
						return siteFriendlyURL.getCompanyId();
					}
				},
				new BiConsumer<SiteFriendlyURL, Long>() {
					@Override
					public void accept(SiteFriendlyURL siteFriendlyURL,
						Long companyId) {
						siteFriendlyURL.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<SiteFriendlyURL, Long>() {
					@Override
					public Long apply(SiteFriendlyURL siteFriendlyURL) {
						return siteFriendlyURL.getUserId();
					}
				},
				new BiConsumer<SiteFriendlyURL, Long>() {
					@Override
					public void accept(SiteFriendlyURL siteFriendlyURL,
						Long userId) {
						siteFriendlyURL.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<SiteFriendlyURL, String>() {
					@Override
					public String apply(SiteFriendlyURL siteFriendlyURL) {
						return siteFriendlyURL.getUserName();
					}
				},
				new BiConsumer<SiteFriendlyURL, String>() {
					@Override
					public void accept(SiteFriendlyURL siteFriendlyURL,
						String userName) {
						siteFriendlyURL.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<SiteFriendlyURL, Date>() {
					@Override
					public Date apply(SiteFriendlyURL siteFriendlyURL) {
						return siteFriendlyURL.getCreateDate();
					}
				},
				new BiConsumer<SiteFriendlyURL, Date>() {
					@Override
					public void accept(SiteFriendlyURL siteFriendlyURL,
						Date createDate) {
						siteFriendlyURL.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<SiteFriendlyURL, Date>() {
					@Override
					public Date apply(SiteFriendlyURL siteFriendlyURL) {
						return siteFriendlyURL.getModifiedDate();
					}
				},
				new BiConsumer<SiteFriendlyURL, Date>() {
					@Override
					public void accept(SiteFriendlyURL siteFriendlyURL,
						Date modifiedDate) {
						siteFriendlyURL.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<SiteFriendlyURL, Long>() {
					@Override
					public Long apply(SiteFriendlyURL siteFriendlyURL) {
						return siteFriendlyURL.getGroupId();
					}
				},
				new BiConsumer<SiteFriendlyURL, Long>() {
					@Override
					public void accept(SiteFriendlyURL siteFriendlyURL,
						Long groupId) {
						siteFriendlyURL.setGroupId(groupId);
					}
				});
		}
	}

	public static class FriendlyURLAccessor extends ModelPropertyAccessor {
		public FriendlyURLAccessor() {
			super(new Function<SiteFriendlyURL, String>() {
					@Override
					public String apply(SiteFriendlyURL siteFriendlyURL) {
						return siteFriendlyURL.getFriendlyURL();
					}
				},
				new BiConsumer<SiteFriendlyURL, String>() {
					@Override
					public void accept(SiteFriendlyURL siteFriendlyURL,
						String friendlyURL) {
						siteFriendlyURL.setFriendlyURL(friendlyURL);
					}
				});
		}
	}

	public static class LanguageIdAccessor extends ModelPropertyAccessor {
		public LanguageIdAccessor() {
			super(new Function<SiteFriendlyURL, String>() {
					@Override
					public String apply(SiteFriendlyURL siteFriendlyURL) {
						return siteFriendlyURL.getLanguageId();
					}
				},
				new BiConsumer<SiteFriendlyURL, String>() {
					@Override
					public void accept(SiteFriendlyURL siteFriendlyURL,
						String languageId) {
						siteFriendlyURL.setLanguageId(languageId);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<SiteFriendlyURL, Date>() {
					@Override
					public Date apply(SiteFriendlyURL siteFriendlyURL) {
						return siteFriendlyURL.getLastPublishDate();
					}
				},
				new BiConsumer<SiteFriendlyURL, Date>() {
					@Override
					public void accept(SiteFriendlyURL siteFriendlyURL,
						Date lastPublishDate) {
						siteFriendlyURL.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private SiteFriendlyURLModelAccessors() {
	}
}