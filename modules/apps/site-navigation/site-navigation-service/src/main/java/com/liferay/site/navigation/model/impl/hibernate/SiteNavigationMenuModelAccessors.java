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

package com.liferay.site.navigation.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.site.navigation.model.SiteNavigationMenu;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SiteNavigationMenuModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<SiteNavigationMenu, String>() {
					@Override
					public String apply(SiteNavigationMenu siteNavigationMenu) {
						return siteNavigationMenu.getUuid();
					}
				},
				new BiConsumer<SiteNavigationMenu, String>() {
					@Override
					public void accept(SiteNavigationMenu siteNavigationMenu,
						String uuid) {
						siteNavigationMenu.setUuid(uuid);
					}
				});
		}
	}

	public static class SiteNavigationMenuIdAccessor
		extends ModelPropertyAccessor {
		public SiteNavigationMenuIdAccessor() {
			super(new Function<SiteNavigationMenu, Long>() {
					@Override
					public Long apply(SiteNavigationMenu siteNavigationMenu) {
						return siteNavigationMenu.getSiteNavigationMenuId();
					}
				},
				new BiConsumer<SiteNavigationMenu, Long>() {
					@Override
					public void accept(SiteNavigationMenu siteNavigationMenu,
						Long siteNavigationMenuId) {
						siteNavigationMenu.setSiteNavigationMenuId(siteNavigationMenuId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<SiteNavigationMenu, Long>() {
					@Override
					public Long apply(SiteNavigationMenu siteNavigationMenu) {
						return siteNavigationMenu.getGroupId();
					}
				},
				new BiConsumer<SiteNavigationMenu, Long>() {
					@Override
					public void accept(SiteNavigationMenu siteNavigationMenu,
						Long groupId) {
						siteNavigationMenu.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<SiteNavigationMenu, Long>() {
					@Override
					public Long apply(SiteNavigationMenu siteNavigationMenu) {
						return siteNavigationMenu.getCompanyId();
					}
				},
				new BiConsumer<SiteNavigationMenu, Long>() {
					@Override
					public void accept(SiteNavigationMenu siteNavigationMenu,
						Long companyId) {
						siteNavigationMenu.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<SiteNavigationMenu, Long>() {
					@Override
					public Long apply(SiteNavigationMenu siteNavigationMenu) {
						return siteNavigationMenu.getUserId();
					}
				},
				new BiConsumer<SiteNavigationMenu, Long>() {
					@Override
					public void accept(SiteNavigationMenu siteNavigationMenu,
						Long userId) {
						siteNavigationMenu.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<SiteNavigationMenu, String>() {
					@Override
					public String apply(SiteNavigationMenu siteNavigationMenu) {
						return siteNavigationMenu.getUserName();
					}
				},
				new BiConsumer<SiteNavigationMenu, String>() {
					@Override
					public void accept(SiteNavigationMenu siteNavigationMenu,
						String userName) {
						siteNavigationMenu.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<SiteNavigationMenu, Date>() {
					@Override
					public Date apply(SiteNavigationMenu siteNavigationMenu) {
						return siteNavigationMenu.getCreateDate();
					}
				},
				new BiConsumer<SiteNavigationMenu, Date>() {
					@Override
					public void accept(SiteNavigationMenu siteNavigationMenu,
						Date createDate) {
						siteNavigationMenu.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<SiteNavigationMenu, Date>() {
					@Override
					public Date apply(SiteNavigationMenu siteNavigationMenu) {
						return siteNavigationMenu.getModifiedDate();
					}
				},
				new BiConsumer<SiteNavigationMenu, Date>() {
					@Override
					public void accept(SiteNavigationMenu siteNavigationMenu,
						Date modifiedDate) {
						siteNavigationMenu.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<SiteNavigationMenu, String>() {
					@Override
					public String apply(SiteNavigationMenu siteNavigationMenu) {
						return siteNavigationMenu.getName();
					}
				},
				new BiConsumer<SiteNavigationMenu, String>() {
					@Override
					public void accept(SiteNavigationMenu siteNavigationMenu,
						String name) {
						siteNavigationMenu.setName(name);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<SiteNavigationMenu, Integer>() {
					@Override
					public Integer apply(SiteNavigationMenu siteNavigationMenu) {
						return siteNavigationMenu.getType();
					}
				},
				new BiConsumer<SiteNavigationMenu, Integer>() {
					@Override
					public void accept(SiteNavigationMenu siteNavigationMenu,
						Integer type) {
						siteNavigationMenu.setType(type);
					}
				});
		}
	}

	public static class AutoAccessor extends ModelPropertyAccessor {
		public AutoAccessor() {
			super(new Function<SiteNavigationMenu, Boolean>() {
					@Override
					public Boolean apply(SiteNavigationMenu siteNavigationMenu) {
						return siteNavigationMenu.getAuto();
					}
				},
				new BiConsumer<SiteNavigationMenu, Boolean>() {
					@Override
					public void accept(SiteNavigationMenu siteNavigationMenu,
						Boolean auto) {
						siteNavigationMenu.setAuto(auto);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<SiteNavigationMenu, Date>() {
					@Override
					public Date apply(SiteNavigationMenu siteNavigationMenu) {
						return siteNavigationMenu.getLastPublishDate();
					}
				},
				new BiConsumer<SiteNavigationMenu, Date>() {
					@Override
					public void accept(SiteNavigationMenu siteNavigationMenu,
						Date lastPublishDate) {
						siteNavigationMenu.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private SiteNavigationMenuModelAccessors() {
	}
}