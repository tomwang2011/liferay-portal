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
import com.liferay.portal.kernel.model.Layout;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LayoutModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<Layout, String>() {
					@Override
					public String apply(Layout layout) {
						return layout.getUuid();
					}
				},
				new BiConsumer<Layout, String>() {
					@Override
					public void accept(Layout layout, String uuid) {
						layout.setUuid(uuid);
					}
				});
		}
	}

	public static class PlidAccessor extends ModelPropertyAccessor {
		public PlidAccessor() {
			super(new Function<Layout, Long>() {
					@Override
					public Long apply(Layout layout) {
						return layout.getPlid();
					}
				},
				new BiConsumer<Layout, Long>() {
					@Override
					public void accept(Layout layout, Long plid) {
						layout.setPlid(plid);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<Layout, Long>() {
					@Override
					public Long apply(Layout layout) {
						return layout.getGroupId();
					}
				},
				new BiConsumer<Layout, Long>() {
					@Override
					public void accept(Layout layout, Long groupId) {
						layout.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Layout, Long>() {
					@Override
					public Long apply(Layout layout) {
						return layout.getCompanyId();
					}
				},
				new BiConsumer<Layout, Long>() {
					@Override
					public void accept(Layout layout, Long companyId) {
						layout.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<Layout, Long>() {
					@Override
					public Long apply(Layout layout) {
						return layout.getUserId();
					}
				},
				new BiConsumer<Layout, Long>() {
					@Override
					public void accept(Layout layout, Long userId) {
						layout.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<Layout, String>() {
					@Override
					public String apply(Layout layout) {
						return layout.getUserName();
					}
				},
				new BiConsumer<Layout, String>() {
					@Override
					public void accept(Layout layout, String userName) {
						layout.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Layout, Date>() {
					@Override
					public Date apply(Layout layout) {
						return layout.getCreateDate();
					}
				},
				new BiConsumer<Layout, Date>() {
					@Override
					public void accept(Layout layout, Date createDate) {
						layout.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<Layout, Date>() {
					@Override
					public Date apply(Layout layout) {
						return layout.getModifiedDate();
					}
				},
				new BiConsumer<Layout, Date>() {
					@Override
					public void accept(Layout layout, Date modifiedDate) {
						layout.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class PrivateLayoutAccessor extends ModelPropertyAccessor {
		public PrivateLayoutAccessor() {
			super(new Function<Layout, Boolean>() {
					@Override
					public Boolean apply(Layout layout) {
						return layout.getPrivateLayout();
					}
				},
				new BiConsumer<Layout, Boolean>() {
					@Override
					public void accept(Layout layout, Boolean privateLayout) {
						layout.setPrivateLayout(privateLayout);
					}
				});
		}
	}

	public static class LayoutIdAccessor extends ModelPropertyAccessor {
		public LayoutIdAccessor() {
			super(new Function<Layout, Long>() {
					@Override
					public Long apply(Layout layout) {
						return layout.getLayoutId();
					}
				},
				new BiConsumer<Layout, Long>() {
					@Override
					public void accept(Layout layout, Long layoutId) {
						layout.setLayoutId(layoutId);
					}
				});
		}
	}

	public static class ParentLayoutIdAccessor extends ModelPropertyAccessor {
		public ParentLayoutIdAccessor() {
			super(new Function<Layout, Long>() {
					@Override
					public Long apply(Layout layout) {
						return layout.getParentLayoutId();
					}
				},
				new BiConsumer<Layout, Long>() {
					@Override
					public void accept(Layout layout, Long parentLayoutId) {
						layout.setParentLayoutId(parentLayoutId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<Layout, String>() {
					@Override
					public String apply(Layout layout) {
						return layout.getName();
					}
				},
				new BiConsumer<Layout, String>() {
					@Override
					public void accept(Layout layout, String name) {
						layout.setName(name);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<Layout, String>() {
					@Override
					public String apply(Layout layout) {
						return layout.getTitle();
					}
				},
				new BiConsumer<Layout, String>() {
					@Override
					public void accept(Layout layout, String title) {
						layout.setTitle(title);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<Layout, String>() {
					@Override
					public String apply(Layout layout) {
						return layout.getDescription();
					}
				},
				new BiConsumer<Layout, String>() {
					@Override
					public void accept(Layout layout, String description) {
						layout.setDescription(description);
					}
				});
		}
	}

	public static class KeywordsAccessor extends ModelPropertyAccessor {
		public KeywordsAccessor() {
			super(new Function<Layout, String>() {
					@Override
					public String apply(Layout layout) {
						return layout.getKeywords();
					}
				},
				new BiConsumer<Layout, String>() {
					@Override
					public void accept(Layout layout, String keywords) {
						layout.setKeywords(keywords);
					}
				});
		}
	}

	public static class RobotsAccessor extends ModelPropertyAccessor {
		public RobotsAccessor() {
			super(new Function<Layout, String>() {
					@Override
					public String apply(Layout layout) {
						return layout.getRobots();
					}
				},
				new BiConsumer<Layout, String>() {
					@Override
					public void accept(Layout layout, String robots) {
						layout.setRobots(robots);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<Layout, String>() {
					@Override
					public String apply(Layout layout) {
						return layout.getType();
					}
				},
				new BiConsumer<Layout, String>() {
					@Override
					public void accept(Layout layout, String type) {
						layout.setType(type);
					}
				});
		}
	}

	public static class TypeSettingsAccessor extends ModelPropertyAccessor {
		public TypeSettingsAccessor() {
			super(new Function<Layout, String>() {
					@Override
					public String apply(Layout layout) {
						return layout.getTypeSettings();
					}
				},
				new BiConsumer<Layout, String>() {
					@Override
					public void accept(Layout layout, String typeSettings) {
						layout.setTypeSettings(typeSettings);
					}
				});
		}
	}

	public static class HiddenAccessor extends ModelPropertyAccessor {
		public HiddenAccessor() {
			super(new Function<Layout, Boolean>() {
					@Override
					public Boolean apply(Layout layout) {
						return layout.getHidden();
					}
				},
				new BiConsumer<Layout, Boolean>() {
					@Override
					public void accept(Layout layout, Boolean hidden) {
						layout.setHidden(hidden);
					}
				});
		}
	}

	public static class FriendlyURLAccessor extends ModelPropertyAccessor {
		public FriendlyURLAccessor() {
			super(new Function<Layout, String>() {
					@Override
					public String apply(Layout layout) {
						return layout.getFriendlyURL();
					}
				},
				new BiConsumer<Layout, String>() {
					@Override
					public void accept(Layout layout, String friendlyURL) {
						layout.setFriendlyURL(friendlyURL);
					}
				});
		}
	}

	public static class IconImageIdAccessor extends ModelPropertyAccessor {
		public IconImageIdAccessor() {
			super(new Function<Layout, Long>() {
					@Override
					public Long apply(Layout layout) {
						return layout.getIconImageId();
					}
				},
				new BiConsumer<Layout, Long>() {
					@Override
					public void accept(Layout layout, Long iconImageId) {
						layout.setIconImageId(iconImageId);
					}
				});
		}
	}

	public static class ThemeIdAccessor extends ModelPropertyAccessor {
		public ThemeIdAccessor() {
			super(new Function<Layout, String>() {
					@Override
					public String apply(Layout layout) {
						return layout.getThemeId();
					}
				},
				new BiConsumer<Layout, String>() {
					@Override
					public void accept(Layout layout, String themeId) {
						layout.setThemeId(themeId);
					}
				});
		}
	}

	public static class ColorSchemeIdAccessor extends ModelPropertyAccessor {
		public ColorSchemeIdAccessor() {
			super(new Function<Layout, String>() {
					@Override
					public String apply(Layout layout) {
						return layout.getColorSchemeId();
					}
				},
				new BiConsumer<Layout, String>() {
					@Override
					public void accept(Layout layout, String colorSchemeId) {
						layout.setColorSchemeId(colorSchemeId);
					}
				});
		}
	}

	public static class CssAccessor extends ModelPropertyAccessor {
		public CssAccessor() {
			super(new Function<Layout, String>() {
					@Override
					public String apply(Layout layout) {
						return layout.getCss();
					}
				},
				new BiConsumer<Layout, String>() {
					@Override
					public void accept(Layout layout, String css) {
						layout.setCss(css);
					}
				});
		}
	}

	public static class PriorityAccessor extends ModelPropertyAccessor {
		public PriorityAccessor() {
			super(new Function<Layout, Integer>() {
					@Override
					public Integer apply(Layout layout) {
						return layout.getPriority();
					}
				},
				new BiConsumer<Layout, Integer>() {
					@Override
					public void accept(Layout layout, Integer priority) {
						layout.setPriority(priority);
					}
				});
		}
	}

	public static class LayoutPrototypeUuidAccessor
		extends ModelPropertyAccessor {
		public LayoutPrototypeUuidAccessor() {
			super(new Function<Layout, String>() {
					@Override
					public String apply(Layout layout) {
						return layout.getLayoutPrototypeUuid();
					}
				},
				new BiConsumer<Layout, String>() {
					@Override
					public void accept(Layout layout, String layoutPrototypeUuid) {
						layout.setLayoutPrototypeUuid(layoutPrototypeUuid);
					}
				});
		}
	}

	public static class LayoutPrototypeLinkEnabledAccessor
		extends ModelPropertyAccessor {
		public LayoutPrototypeLinkEnabledAccessor() {
			super(new Function<Layout, Boolean>() {
					@Override
					public Boolean apply(Layout layout) {
						return layout.getLayoutPrototypeLinkEnabled();
					}
				},
				new BiConsumer<Layout, Boolean>() {
					@Override
					public void accept(Layout layout,
						Boolean layoutPrototypeLinkEnabled) {
						layout.setLayoutPrototypeLinkEnabled(layoutPrototypeLinkEnabled);
					}
				});
		}
	}

	public static class SourcePrototypeLayoutUuidAccessor
		extends ModelPropertyAccessor {
		public SourcePrototypeLayoutUuidAccessor() {
			super(new Function<Layout, String>() {
					@Override
					public String apply(Layout layout) {
						return layout.getSourcePrototypeLayoutUuid();
					}
				},
				new BiConsumer<Layout, String>() {
					@Override
					public void accept(Layout layout,
						String sourcePrototypeLayoutUuid) {
						layout.setSourcePrototypeLayoutUuid(sourcePrototypeLayoutUuid);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<Layout, Date>() {
					@Override
					public Date apply(Layout layout) {
						return layout.getLastPublishDate();
					}
				},
				new BiConsumer<Layout, Date>() {
					@Override
					public void accept(Layout layout, Date lastPublishDate) {
						layout.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private LayoutModelAccessors() {
	}
}