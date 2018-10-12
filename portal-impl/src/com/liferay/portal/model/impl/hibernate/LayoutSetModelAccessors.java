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
import com.liferay.portal.kernel.model.LayoutSet;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LayoutSetModelAccessors {
	public static class LayoutSetIdAccessor extends ModelPropertyAccessor {
		public LayoutSetIdAccessor() {
			super(new Function<LayoutSet, Long>() {
					@Override
					public Long apply(LayoutSet layoutSet) {
						return layoutSet.getLayoutSetId();
					}
				},
				new BiConsumer<LayoutSet, Long>() {
					@Override
					public void accept(LayoutSet layoutSet, Long layoutSetId) {
						layoutSet.setLayoutSetId(layoutSetId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<LayoutSet, Long>() {
					@Override
					public Long apply(LayoutSet layoutSet) {
						return layoutSet.getGroupId();
					}
				},
				new BiConsumer<LayoutSet, Long>() {
					@Override
					public void accept(LayoutSet layoutSet, Long groupId) {
						layoutSet.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<LayoutSet, Long>() {
					@Override
					public Long apply(LayoutSet layoutSet) {
						return layoutSet.getCompanyId();
					}
				},
				new BiConsumer<LayoutSet, Long>() {
					@Override
					public void accept(LayoutSet layoutSet, Long companyId) {
						layoutSet.setCompanyId(companyId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<LayoutSet, Date>() {
					@Override
					public Date apply(LayoutSet layoutSet) {
						return layoutSet.getCreateDate();
					}
				},
				new BiConsumer<LayoutSet, Date>() {
					@Override
					public void accept(LayoutSet layoutSet, Date createDate) {
						layoutSet.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<LayoutSet, Date>() {
					@Override
					public Date apply(LayoutSet layoutSet) {
						return layoutSet.getModifiedDate();
					}
				},
				new BiConsumer<LayoutSet, Date>() {
					@Override
					public void accept(LayoutSet layoutSet, Date modifiedDate) {
						layoutSet.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class PrivateLayoutAccessor extends ModelPropertyAccessor {
		public PrivateLayoutAccessor() {
			super(new Function<LayoutSet, Boolean>() {
					@Override
					public Boolean apply(LayoutSet layoutSet) {
						return layoutSet.getPrivateLayout();
					}
				},
				new BiConsumer<LayoutSet, Boolean>() {
					@Override
					public void accept(LayoutSet layoutSet,
						Boolean privateLayout) {
						layoutSet.setPrivateLayout(privateLayout);
					}
				});
		}
	}

	public static class LogoIdAccessor extends ModelPropertyAccessor {
		public LogoIdAccessor() {
			super(new Function<LayoutSet, Long>() {
					@Override
					public Long apply(LayoutSet layoutSet) {
						return layoutSet.getLogoId();
					}
				},
				new BiConsumer<LayoutSet, Long>() {
					@Override
					public void accept(LayoutSet layoutSet, Long logoId) {
						layoutSet.setLogoId(logoId);
					}
				});
		}
	}

	public static class ThemeIdAccessor extends ModelPropertyAccessor {
		public ThemeIdAccessor() {
			super(new Function<LayoutSet, String>() {
					@Override
					public String apply(LayoutSet layoutSet) {
						return layoutSet.getThemeId();
					}
				},
				new BiConsumer<LayoutSet, String>() {
					@Override
					public void accept(LayoutSet layoutSet, String themeId) {
						layoutSet.setThemeId(themeId);
					}
				});
		}
	}

	public static class ColorSchemeIdAccessor extends ModelPropertyAccessor {
		public ColorSchemeIdAccessor() {
			super(new Function<LayoutSet, String>() {
					@Override
					public String apply(LayoutSet layoutSet) {
						return layoutSet.getColorSchemeId();
					}
				},
				new BiConsumer<LayoutSet, String>() {
					@Override
					public void accept(LayoutSet layoutSet, String colorSchemeId) {
						layoutSet.setColorSchemeId(colorSchemeId);
					}
				});
		}
	}

	public static class CssAccessor extends ModelPropertyAccessor {
		public CssAccessor() {
			super(new Function<LayoutSet, String>() {
					@Override
					public String apply(LayoutSet layoutSet) {
						return layoutSet.getCss();
					}
				},
				new BiConsumer<LayoutSet, String>() {
					@Override
					public void accept(LayoutSet layoutSet, String css) {
						layoutSet.setCss(css);
					}
				});
		}
	}

	public static class PageCountAccessor extends ModelPropertyAccessor {
		public PageCountAccessor() {
			super(new Function<LayoutSet, Integer>() {
					@Override
					public Integer apply(LayoutSet layoutSet) {
						return layoutSet.getPageCount();
					}
				},
				new BiConsumer<LayoutSet, Integer>() {
					@Override
					public void accept(LayoutSet layoutSet, Integer pageCount) {
						layoutSet.setPageCount(pageCount);
					}
				});
		}
	}

	public static class SettingsAccessor extends ModelPropertyAccessor {
		public SettingsAccessor() {
			super(new Function<LayoutSet, String>() {
					@Override
					public String apply(LayoutSet layoutSet) {
						return layoutSet.getSettings();
					}
				},
				new BiConsumer<LayoutSet, String>() {
					@Override
					public void accept(LayoutSet layoutSet, String settings) {
						layoutSet.setSettings(settings);
					}
				});
		}
	}

	public static class LayoutSetPrototypeUuidAccessor
		extends ModelPropertyAccessor {
		public LayoutSetPrototypeUuidAccessor() {
			super(new Function<LayoutSet, String>() {
					@Override
					public String apply(LayoutSet layoutSet) {
						return layoutSet.getLayoutSetPrototypeUuid();
					}
				},
				new BiConsumer<LayoutSet, String>() {
					@Override
					public void accept(LayoutSet layoutSet,
						String layoutSetPrototypeUuid) {
						layoutSet.setLayoutSetPrototypeUuid(layoutSetPrototypeUuid);
					}
				});
		}
	}

	public static class LayoutSetPrototypeLinkEnabledAccessor
		extends ModelPropertyAccessor {
		public LayoutSetPrototypeLinkEnabledAccessor() {
			super(new Function<LayoutSet, Boolean>() {
					@Override
					public Boolean apply(LayoutSet layoutSet) {
						return layoutSet.getLayoutSetPrototypeLinkEnabled();
					}
				},
				new BiConsumer<LayoutSet, Boolean>() {
					@Override
					public void accept(LayoutSet layoutSet,
						Boolean layoutSetPrototypeLinkEnabled) {
						layoutSet.setLayoutSetPrototypeLinkEnabled(layoutSetPrototypeLinkEnabled);
					}
				});
		}
	}

	private LayoutSetModelAccessors() {
	}
}