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

import com.liferay.site.navigation.model.SiteNavigationMenuItem;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SiteNavigationMenuItemModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<SiteNavigationMenuItem, String>() {
					@Override
					public String apply(
						SiteNavigationMenuItem siteNavigationMenuItem) {
						return siteNavigationMenuItem.getUuid();
					}
				},
				new BiConsumer<SiteNavigationMenuItem, String>() {
					@Override
					public void accept(
						SiteNavigationMenuItem siteNavigationMenuItem,
						String uuid) {
						siteNavigationMenuItem.setUuid(uuid);
					}
				});
		}
	}

	public static class SiteNavigationMenuItemIdAccessor
		extends ModelPropertyAccessor {
		public SiteNavigationMenuItemIdAccessor() {
			super(new Function<SiteNavigationMenuItem, Long>() {
					@Override
					public Long apply(
						SiteNavigationMenuItem siteNavigationMenuItem) {
						return siteNavigationMenuItem.getSiteNavigationMenuItemId();
					}
				},
				new BiConsumer<SiteNavigationMenuItem, Long>() {
					@Override
					public void accept(
						SiteNavigationMenuItem siteNavigationMenuItem,
						Long siteNavigationMenuItemId) {
						siteNavigationMenuItem.setSiteNavigationMenuItemId(siteNavigationMenuItemId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<SiteNavigationMenuItem, Long>() {
					@Override
					public Long apply(
						SiteNavigationMenuItem siteNavigationMenuItem) {
						return siteNavigationMenuItem.getGroupId();
					}
				},
				new BiConsumer<SiteNavigationMenuItem, Long>() {
					@Override
					public void accept(
						SiteNavigationMenuItem siteNavigationMenuItem,
						Long groupId) {
						siteNavigationMenuItem.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<SiteNavigationMenuItem, Long>() {
					@Override
					public Long apply(
						SiteNavigationMenuItem siteNavigationMenuItem) {
						return siteNavigationMenuItem.getCompanyId();
					}
				},
				new BiConsumer<SiteNavigationMenuItem, Long>() {
					@Override
					public void accept(
						SiteNavigationMenuItem siteNavigationMenuItem,
						Long companyId) {
						siteNavigationMenuItem.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<SiteNavigationMenuItem, Long>() {
					@Override
					public Long apply(
						SiteNavigationMenuItem siteNavigationMenuItem) {
						return siteNavigationMenuItem.getUserId();
					}
				},
				new BiConsumer<SiteNavigationMenuItem, Long>() {
					@Override
					public void accept(
						SiteNavigationMenuItem siteNavigationMenuItem,
						Long userId) {
						siteNavigationMenuItem.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<SiteNavigationMenuItem, String>() {
					@Override
					public String apply(
						SiteNavigationMenuItem siteNavigationMenuItem) {
						return siteNavigationMenuItem.getUserName();
					}
				},
				new BiConsumer<SiteNavigationMenuItem, String>() {
					@Override
					public void accept(
						SiteNavigationMenuItem siteNavigationMenuItem,
						String userName) {
						siteNavigationMenuItem.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<SiteNavigationMenuItem, Date>() {
					@Override
					public Date apply(
						SiteNavigationMenuItem siteNavigationMenuItem) {
						return siteNavigationMenuItem.getCreateDate();
					}
				},
				new BiConsumer<SiteNavigationMenuItem, Date>() {
					@Override
					public void accept(
						SiteNavigationMenuItem siteNavigationMenuItem,
						Date createDate) {
						siteNavigationMenuItem.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<SiteNavigationMenuItem, Date>() {
					@Override
					public Date apply(
						SiteNavigationMenuItem siteNavigationMenuItem) {
						return siteNavigationMenuItem.getModifiedDate();
					}
				},
				new BiConsumer<SiteNavigationMenuItem, Date>() {
					@Override
					public void accept(
						SiteNavigationMenuItem siteNavigationMenuItem,
						Date modifiedDate) {
						siteNavigationMenuItem.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class SiteNavigationMenuIdAccessor
		extends ModelPropertyAccessor {
		public SiteNavigationMenuIdAccessor() {
			super(new Function<SiteNavigationMenuItem, Long>() {
					@Override
					public Long apply(
						SiteNavigationMenuItem siteNavigationMenuItem) {
						return siteNavigationMenuItem.getSiteNavigationMenuId();
					}
				},
				new BiConsumer<SiteNavigationMenuItem, Long>() {
					@Override
					public void accept(
						SiteNavigationMenuItem siteNavigationMenuItem,
						Long siteNavigationMenuId) {
						siteNavigationMenuItem.setSiteNavigationMenuId(siteNavigationMenuId);
					}
				});
		}
	}

	public static class ParentSiteNavigationMenuItemIdAccessor
		extends ModelPropertyAccessor {
		public ParentSiteNavigationMenuItemIdAccessor() {
			super(new Function<SiteNavigationMenuItem, Long>() {
					@Override
					public Long apply(
						SiteNavigationMenuItem siteNavigationMenuItem) {
						return siteNavigationMenuItem.getParentSiteNavigationMenuItemId();
					}
				},
				new BiConsumer<SiteNavigationMenuItem, Long>() {
					@Override
					public void accept(
						SiteNavigationMenuItem siteNavigationMenuItem,
						Long parentSiteNavigationMenuItemId) {
						siteNavigationMenuItem.setParentSiteNavigationMenuItemId(parentSiteNavigationMenuItemId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<SiteNavigationMenuItem, String>() {
					@Override
					public String apply(
						SiteNavigationMenuItem siteNavigationMenuItem) {
						return siteNavigationMenuItem.getName();
					}
				},
				new BiConsumer<SiteNavigationMenuItem, String>() {
					@Override
					public void accept(
						SiteNavigationMenuItem siteNavigationMenuItem,
						String name) {
						siteNavigationMenuItem.setName(name);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<SiteNavigationMenuItem, String>() {
					@Override
					public String apply(
						SiteNavigationMenuItem siteNavigationMenuItem) {
						return siteNavigationMenuItem.getType();
					}
				},
				new BiConsumer<SiteNavigationMenuItem, String>() {
					@Override
					public void accept(
						SiteNavigationMenuItem siteNavigationMenuItem,
						String type) {
						siteNavigationMenuItem.setType(type);
					}
				});
		}
	}

	public static class TypeSettingsAccessor extends ModelPropertyAccessor {
		public TypeSettingsAccessor() {
			super(new Function<SiteNavigationMenuItem, String>() {
					@Override
					public String apply(
						SiteNavigationMenuItem siteNavigationMenuItem) {
						return siteNavigationMenuItem.getTypeSettings();
					}
				},
				new BiConsumer<SiteNavigationMenuItem, String>() {
					@Override
					public void accept(
						SiteNavigationMenuItem siteNavigationMenuItem,
						String typeSettings) {
						siteNavigationMenuItem.setTypeSettings(typeSettings);
					}
				});
		}
	}

	public static class OrderAccessor extends ModelPropertyAccessor {
		public OrderAccessor() {
			super(new Function<SiteNavigationMenuItem, Integer>() {
					@Override
					public Integer apply(
						SiteNavigationMenuItem siteNavigationMenuItem) {
						return siteNavigationMenuItem.getOrder();
					}
				},
				new BiConsumer<SiteNavigationMenuItem, Integer>() {
					@Override
					public void accept(
						SiteNavigationMenuItem siteNavigationMenuItem,
						Integer order) {
						siteNavigationMenuItem.setOrder(order);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<SiteNavigationMenuItem, Date>() {
					@Override
					public Date apply(
						SiteNavigationMenuItem siteNavigationMenuItem) {
						return siteNavigationMenuItem.getLastPublishDate();
					}
				},
				new BiConsumer<SiteNavigationMenuItem, Date>() {
					@Override
					public void accept(
						SiteNavigationMenuItem siteNavigationMenuItem,
						Date lastPublishDate) {
						siteNavigationMenuItem.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private SiteNavigationMenuItemModelAccessors() {
	}
}