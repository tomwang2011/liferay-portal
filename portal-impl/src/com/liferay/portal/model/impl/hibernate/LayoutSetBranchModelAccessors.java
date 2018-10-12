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
import com.liferay.portal.kernel.model.LayoutSetBranch;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LayoutSetBranchModelAccessors {
	public static class LayoutSetBranchIdAccessor extends ModelPropertyAccessor {
		public LayoutSetBranchIdAccessor() {
			super(new Function<LayoutSetBranch, Long>() {
					@Override
					public Long apply(LayoutSetBranch layoutSetBranch) {
						return layoutSetBranch.getLayoutSetBranchId();
					}
				},
				new BiConsumer<LayoutSetBranch, Long>() {
					@Override
					public void accept(LayoutSetBranch layoutSetBranch,
						Long layoutSetBranchId) {
						layoutSetBranch.setLayoutSetBranchId(layoutSetBranchId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<LayoutSetBranch, Long>() {
					@Override
					public Long apply(LayoutSetBranch layoutSetBranch) {
						return layoutSetBranch.getGroupId();
					}
				},
				new BiConsumer<LayoutSetBranch, Long>() {
					@Override
					public void accept(LayoutSetBranch layoutSetBranch,
						Long groupId) {
						layoutSetBranch.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<LayoutSetBranch, Long>() {
					@Override
					public Long apply(LayoutSetBranch layoutSetBranch) {
						return layoutSetBranch.getCompanyId();
					}
				},
				new BiConsumer<LayoutSetBranch, Long>() {
					@Override
					public void accept(LayoutSetBranch layoutSetBranch,
						Long companyId) {
						layoutSetBranch.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<LayoutSetBranch, Long>() {
					@Override
					public Long apply(LayoutSetBranch layoutSetBranch) {
						return layoutSetBranch.getUserId();
					}
				},
				new BiConsumer<LayoutSetBranch, Long>() {
					@Override
					public void accept(LayoutSetBranch layoutSetBranch,
						Long userId) {
						layoutSetBranch.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<LayoutSetBranch, String>() {
					@Override
					public String apply(LayoutSetBranch layoutSetBranch) {
						return layoutSetBranch.getUserName();
					}
				},
				new BiConsumer<LayoutSetBranch, String>() {
					@Override
					public void accept(LayoutSetBranch layoutSetBranch,
						String userName) {
						layoutSetBranch.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<LayoutSetBranch, Date>() {
					@Override
					public Date apply(LayoutSetBranch layoutSetBranch) {
						return layoutSetBranch.getCreateDate();
					}
				},
				new BiConsumer<LayoutSetBranch, Date>() {
					@Override
					public void accept(LayoutSetBranch layoutSetBranch,
						Date createDate) {
						layoutSetBranch.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<LayoutSetBranch, Date>() {
					@Override
					public Date apply(LayoutSetBranch layoutSetBranch) {
						return layoutSetBranch.getModifiedDate();
					}
				},
				new BiConsumer<LayoutSetBranch, Date>() {
					@Override
					public void accept(LayoutSetBranch layoutSetBranch,
						Date modifiedDate) {
						layoutSetBranch.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class PrivateLayoutAccessor extends ModelPropertyAccessor {
		public PrivateLayoutAccessor() {
			super(new Function<LayoutSetBranch, Boolean>() {
					@Override
					public Boolean apply(LayoutSetBranch layoutSetBranch) {
						return layoutSetBranch.getPrivateLayout();
					}
				},
				new BiConsumer<LayoutSetBranch, Boolean>() {
					@Override
					public void accept(LayoutSetBranch layoutSetBranch,
						Boolean privateLayout) {
						layoutSetBranch.setPrivateLayout(privateLayout);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<LayoutSetBranch, String>() {
					@Override
					public String apply(LayoutSetBranch layoutSetBranch) {
						return layoutSetBranch.getName();
					}
				},
				new BiConsumer<LayoutSetBranch, String>() {
					@Override
					public void accept(LayoutSetBranch layoutSetBranch,
						String name) {
						layoutSetBranch.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<LayoutSetBranch, String>() {
					@Override
					public String apply(LayoutSetBranch layoutSetBranch) {
						return layoutSetBranch.getDescription();
					}
				},
				new BiConsumer<LayoutSetBranch, String>() {
					@Override
					public void accept(LayoutSetBranch layoutSetBranch,
						String description) {
						layoutSetBranch.setDescription(description);
					}
				});
		}
	}

	public static class MasterAccessor extends ModelPropertyAccessor {
		public MasterAccessor() {
			super(new Function<LayoutSetBranch, Boolean>() {
					@Override
					public Boolean apply(LayoutSetBranch layoutSetBranch) {
						return layoutSetBranch.getMaster();
					}
				},
				new BiConsumer<LayoutSetBranch, Boolean>() {
					@Override
					public void accept(LayoutSetBranch layoutSetBranch,
						Boolean master) {
						layoutSetBranch.setMaster(master);
					}
				});
		}
	}

	public static class LogoIdAccessor extends ModelPropertyAccessor {
		public LogoIdAccessor() {
			super(new Function<LayoutSetBranch, Long>() {
					@Override
					public Long apply(LayoutSetBranch layoutSetBranch) {
						return layoutSetBranch.getLogoId();
					}
				},
				new BiConsumer<LayoutSetBranch, Long>() {
					@Override
					public void accept(LayoutSetBranch layoutSetBranch,
						Long logoId) {
						layoutSetBranch.setLogoId(logoId);
					}
				});
		}
	}

	public static class ThemeIdAccessor extends ModelPropertyAccessor {
		public ThemeIdAccessor() {
			super(new Function<LayoutSetBranch, String>() {
					@Override
					public String apply(LayoutSetBranch layoutSetBranch) {
						return layoutSetBranch.getThemeId();
					}
				},
				new BiConsumer<LayoutSetBranch, String>() {
					@Override
					public void accept(LayoutSetBranch layoutSetBranch,
						String themeId) {
						layoutSetBranch.setThemeId(themeId);
					}
				});
		}
	}

	public static class ColorSchemeIdAccessor extends ModelPropertyAccessor {
		public ColorSchemeIdAccessor() {
			super(new Function<LayoutSetBranch, String>() {
					@Override
					public String apply(LayoutSetBranch layoutSetBranch) {
						return layoutSetBranch.getColorSchemeId();
					}
				},
				new BiConsumer<LayoutSetBranch, String>() {
					@Override
					public void accept(LayoutSetBranch layoutSetBranch,
						String colorSchemeId) {
						layoutSetBranch.setColorSchemeId(colorSchemeId);
					}
				});
		}
	}

	public static class CssAccessor extends ModelPropertyAccessor {
		public CssAccessor() {
			super(new Function<LayoutSetBranch, String>() {
					@Override
					public String apply(LayoutSetBranch layoutSetBranch) {
						return layoutSetBranch.getCss();
					}
				},
				new BiConsumer<LayoutSetBranch, String>() {
					@Override
					public void accept(LayoutSetBranch layoutSetBranch,
						String css) {
						layoutSetBranch.setCss(css);
					}
				});
		}
	}

	public static class SettingsAccessor extends ModelPropertyAccessor {
		public SettingsAccessor() {
			super(new Function<LayoutSetBranch, String>() {
					@Override
					public String apply(LayoutSetBranch layoutSetBranch) {
						return layoutSetBranch.getSettings();
					}
				},
				new BiConsumer<LayoutSetBranch, String>() {
					@Override
					public void accept(LayoutSetBranch layoutSetBranch,
						String settings) {
						layoutSetBranch.setSettings(settings);
					}
				});
		}
	}

	public static class LayoutSetPrototypeUuidAccessor
		extends ModelPropertyAccessor {
		public LayoutSetPrototypeUuidAccessor() {
			super(new Function<LayoutSetBranch, String>() {
					@Override
					public String apply(LayoutSetBranch layoutSetBranch) {
						return layoutSetBranch.getLayoutSetPrototypeUuid();
					}
				},
				new BiConsumer<LayoutSetBranch, String>() {
					@Override
					public void accept(LayoutSetBranch layoutSetBranch,
						String layoutSetPrototypeUuid) {
						layoutSetBranch.setLayoutSetPrototypeUuid(layoutSetPrototypeUuid);
					}
				});
		}
	}

	public static class LayoutSetPrototypeLinkEnabledAccessor
		extends ModelPropertyAccessor {
		public LayoutSetPrototypeLinkEnabledAccessor() {
			super(new Function<LayoutSetBranch, Boolean>() {
					@Override
					public Boolean apply(LayoutSetBranch layoutSetBranch) {
						return layoutSetBranch.getLayoutSetPrototypeLinkEnabled();
					}
				},
				new BiConsumer<LayoutSetBranch, Boolean>() {
					@Override
					public void accept(LayoutSetBranch layoutSetBranch,
						Boolean layoutSetPrototypeLinkEnabled) {
						layoutSetBranch.setLayoutSetPrototypeLinkEnabled(layoutSetPrototypeLinkEnabled);
					}
				});
		}
	}

	private LayoutSetBranchModelAccessors() {
	}
}