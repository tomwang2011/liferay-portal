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
import com.liferay.portal.kernel.model.LayoutFriendlyURL;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LayoutFriendlyURLModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<LayoutFriendlyURL, String>() {
					@Override
					public String apply(LayoutFriendlyURL layoutFriendlyURL) {
						return layoutFriendlyURL.getUuid();
					}
				},
				new BiConsumer<LayoutFriendlyURL, String>() {
					@Override
					public void accept(LayoutFriendlyURL layoutFriendlyURL,
						String uuid) {
						layoutFriendlyURL.setUuid(uuid);
					}
				});
		}
	}

	public static class LayoutFriendlyURLIdAccessor
		extends ModelPropertyAccessor {
		public LayoutFriendlyURLIdAccessor() {
			super(new Function<LayoutFriendlyURL, Long>() {
					@Override
					public Long apply(LayoutFriendlyURL layoutFriendlyURL) {
						return layoutFriendlyURL.getLayoutFriendlyURLId();
					}
				},
				new BiConsumer<LayoutFriendlyURL, Long>() {
					@Override
					public void accept(LayoutFriendlyURL layoutFriendlyURL,
						Long layoutFriendlyURLId) {
						layoutFriendlyURL.setLayoutFriendlyURLId(layoutFriendlyURLId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<LayoutFriendlyURL, Long>() {
					@Override
					public Long apply(LayoutFriendlyURL layoutFriendlyURL) {
						return layoutFriendlyURL.getGroupId();
					}
				},
				new BiConsumer<LayoutFriendlyURL, Long>() {
					@Override
					public void accept(LayoutFriendlyURL layoutFriendlyURL,
						Long groupId) {
						layoutFriendlyURL.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<LayoutFriendlyURL, Long>() {
					@Override
					public Long apply(LayoutFriendlyURL layoutFriendlyURL) {
						return layoutFriendlyURL.getCompanyId();
					}
				},
				new BiConsumer<LayoutFriendlyURL, Long>() {
					@Override
					public void accept(LayoutFriendlyURL layoutFriendlyURL,
						Long companyId) {
						layoutFriendlyURL.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<LayoutFriendlyURL, Long>() {
					@Override
					public Long apply(LayoutFriendlyURL layoutFriendlyURL) {
						return layoutFriendlyURL.getUserId();
					}
				},
				new BiConsumer<LayoutFriendlyURL, Long>() {
					@Override
					public void accept(LayoutFriendlyURL layoutFriendlyURL,
						Long userId) {
						layoutFriendlyURL.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<LayoutFriendlyURL, String>() {
					@Override
					public String apply(LayoutFriendlyURL layoutFriendlyURL) {
						return layoutFriendlyURL.getUserName();
					}
				},
				new BiConsumer<LayoutFriendlyURL, String>() {
					@Override
					public void accept(LayoutFriendlyURL layoutFriendlyURL,
						String userName) {
						layoutFriendlyURL.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<LayoutFriendlyURL, Date>() {
					@Override
					public Date apply(LayoutFriendlyURL layoutFriendlyURL) {
						return layoutFriendlyURL.getCreateDate();
					}
				},
				new BiConsumer<LayoutFriendlyURL, Date>() {
					@Override
					public void accept(LayoutFriendlyURL layoutFriendlyURL,
						Date createDate) {
						layoutFriendlyURL.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<LayoutFriendlyURL, Date>() {
					@Override
					public Date apply(LayoutFriendlyURL layoutFriendlyURL) {
						return layoutFriendlyURL.getModifiedDate();
					}
				},
				new BiConsumer<LayoutFriendlyURL, Date>() {
					@Override
					public void accept(LayoutFriendlyURL layoutFriendlyURL,
						Date modifiedDate) {
						layoutFriendlyURL.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class PlidAccessor extends ModelPropertyAccessor {
		public PlidAccessor() {
			super(new Function<LayoutFriendlyURL, Long>() {
					@Override
					public Long apply(LayoutFriendlyURL layoutFriendlyURL) {
						return layoutFriendlyURL.getPlid();
					}
				},
				new BiConsumer<LayoutFriendlyURL, Long>() {
					@Override
					public void accept(LayoutFriendlyURL layoutFriendlyURL,
						Long plid) {
						layoutFriendlyURL.setPlid(plid);
					}
				});
		}
	}

	public static class PrivateLayoutAccessor extends ModelPropertyAccessor {
		public PrivateLayoutAccessor() {
			super(new Function<LayoutFriendlyURL, Boolean>() {
					@Override
					public Boolean apply(LayoutFriendlyURL layoutFriendlyURL) {
						return layoutFriendlyURL.getPrivateLayout();
					}
				},
				new BiConsumer<LayoutFriendlyURL, Boolean>() {
					@Override
					public void accept(LayoutFriendlyURL layoutFriendlyURL,
						Boolean privateLayout) {
						layoutFriendlyURL.setPrivateLayout(privateLayout);
					}
				});
		}
	}

	public static class FriendlyURLAccessor extends ModelPropertyAccessor {
		public FriendlyURLAccessor() {
			super(new Function<LayoutFriendlyURL, String>() {
					@Override
					public String apply(LayoutFriendlyURL layoutFriendlyURL) {
						return layoutFriendlyURL.getFriendlyURL();
					}
				},
				new BiConsumer<LayoutFriendlyURL, String>() {
					@Override
					public void accept(LayoutFriendlyURL layoutFriendlyURL,
						String friendlyURL) {
						layoutFriendlyURL.setFriendlyURL(friendlyURL);
					}
				});
		}
	}

	public static class LanguageIdAccessor extends ModelPropertyAccessor {
		public LanguageIdAccessor() {
			super(new Function<LayoutFriendlyURL, String>() {
					@Override
					public String apply(LayoutFriendlyURL layoutFriendlyURL) {
						return layoutFriendlyURL.getLanguageId();
					}
				},
				new BiConsumer<LayoutFriendlyURL, String>() {
					@Override
					public void accept(LayoutFriendlyURL layoutFriendlyURL,
						String languageId) {
						layoutFriendlyURL.setLanguageId(languageId);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<LayoutFriendlyURL, Date>() {
					@Override
					public Date apply(LayoutFriendlyURL layoutFriendlyURL) {
						return layoutFriendlyURL.getLastPublishDate();
					}
				},
				new BiConsumer<LayoutFriendlyURL, Date>() {
					@Override
					public void accept(LayoutFriendlyURL layoutFriendlyURL,
						Date lastPublishDate) {
						layoutFriendlyURL.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private LayoutFriendlyURLModelAccessors() {
	}
}