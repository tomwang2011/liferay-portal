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
import com.liferay.portal.kernel.model.LayoutRevision;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LayoutRevisionModelAccessors {
	public static class LayoutRevisionIdAccessor extends ModelPropertyAccessor {
		public LayoutRevisionIdAccessor() {
			super(new Function<LayoutRevision, Long>() {
					@Override
					public Long apply(LayoutRevision layoutRevision) {
						return layoutRevision.getLayoutRevisionId();
					}
				},
				new BiConsumer<LayoutRevision, Long>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						Long layoutRevisionId) {
						layoutRevision.setLayoutRevisionId(layoutRevisionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<LayoutRevision, Long>() {
					@Override
					public Long apply(LayoutRevision layoutRevision) {
						return layoutRevision.getGroupId();
					}
				},
				new BiConsumer<LayoutRevision, Long>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						Long groupId) {
						layoutRevision.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<LayoutRevision, Long>() {
					@Override
					public Long apply(LayoutRevision layoutRevision) {
						return layoutRevision.getCompanyId();
					}
				},
				new BiConsumer<LayoutRevision, Long>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						Long companyId) {
						layoutRevision.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<LayoutRevision, Long>() {
					@Override
					public Long apply(LayoutRevision layoutRevision) {
						return layoutRevision.getUserId();
					}
				},
				new BiConsumer<LayoutRevision, Long>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						Long userId) {
						layoutRevision.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<LayoutRevision, String>() {
					@Override
					public String apply(LayoutRevision layoutRevision) {
						return layoutRevision.getUserName();
					}
				},
				new BiConsumer<LayoutRevision, String>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						String userName) {
						layoutRevision.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<LayoutRevision, Date>() {
					@Override
					public Date apply(LayoutRevision layoutRevision) {
						return layoutRevision.getCreateDate();
					}
				},
				new BiConsumer<LayoutRevision, Date>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						Date createDate) {
						layoutRevision.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<LayoutRevision, Date>() {
					@Override
					public Date apply(LayoutRevision layoutRevision) {
						return layoutRevision.getModifiedDate();
					}
				},
				new BiConsumer<LayoutRevision, Date>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						Date modifiedDate) {
						layoutRevision.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class LayoutSetBranchIdAccessor extends ModelPropertyAccessor {
		public LayoutSetBranchIdAccessor() {
			super(new Function<LayoutRevision, Long>() {
					@Override
					public Long apply(LayoutRevision layoutRevision) {
						return layoutRevision.getLayoutSetBranchId();
					}
				},
				new BiConsumer<LayoutRevision, Long>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						Long layoutSetBranchId) {
						layoutRevision.setLayoutSetBranchId(layoutSetBranchId);
					}
				});
		}
	}

	public static class LayoutBranchIdAccessor extends ModelPropertyAccessor {
		public LayoutBranchIdAccessor() {
			super(new Function<LayoutRevision, Long>() {
					@Override
					public Long apply(LayoutRevision layoutRevision) {
						return layoutRevision.getLayoutBranchId();
					}
				},
				new BiConsumer<LayoutRevision, Long>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						Long layoutBranchId) {
						layoutRevision.setLayoutBranchId(layoutBranchId);
					}
				});
		}
	}

	public static class ParentLayoutRevisionIdAccessor
		extends ModelPropertyAccessor {
		public ParentLayoutRevisionIdAccessor() {
			super(new Function<LayoutRevision, Long>() {
					@Override
					public Long apply(LayoutRevision layoutRevision) {
						return layoutRevision.getParentLayoutRevisionId();
					}
				},
				new BiConsumer<LayoutRevision, Long>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						Long parentLayoutRevisionId) {
						layoutRevision.setParentLayoutRevisionId(parentLayoutRevisionId);
					}
				});
		}
	}

	public static class HeadAccessor extends ModelPropertyAccessor {
		public HeadAccessor() {
			super(new Function<LayoutRevision, Boolean>() {
					@Override
					public Boolean apply(LayoutRevision layoutRevision) {
						return layoutRevision.getHead();
					}
				},
				new BiConsumer<LayoutRevision, Boolean>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						Boolean head) {
						layoutRevision.setHead(head);
					}
				});
		}
	}

	public static class MajorAccessor extends ModelPropertyAccessor {
		public MajorAccessor() {
			super(new Function<LayoutRevision, Boolean>() {
					@Override
					public Boolean apply(LayoutRevision layoutRevision) {
						return layoutRevision.getMajor();
					}
				},
				new BiConsumer<LayoutRevision, Boolean>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						Boolean major) {
						layoutRevision.setMajor(major);
					}
				});
		}
	}

	public static class PlidAccessor extends ModelPropertyAccessor {
		public PlidAccessor() {
			super(new Function<LayoutRevision, Long>() {
					@Override
					public Long apply(LayoutRevision layoutRevision) {
						return layoutRevision.getPlid();
					}
				},
				new BiConsumer<LayoutRevision, Long>() {
					@Override
					public void accept(LayoutRevision layoutRevision, Long plid) {
						layoutRevision.setPlid(plid);
					}
				});
		}
	}

	public static class PrivateLayoutAccessor extends ModelPropertyAccessor {
		public PrivateLayoutAccessor() {
			super(new Function<LayoutRevision, Boolean>() {
					@Override
					public Boolean apply(LayoutRevision layoutRevision) {
						return layoutRevision.getPrivateLayout();
					}
				},
				new BiConsumer<LayoutRevision, Boolean>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						Boolean privateLayout) {
						layoutRevision.setPrivateLayout(privateLayout);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<LayoutRevision, String>() {
					@Override
					public String apply(LayoutRevision layoutRevision) {
						return layoutRevision.getName();
					}
				},
				new BiConsumer<LayoutRevision, String>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						String name) {
						layoutRevision.setName(name);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<LayoutRevision, String>() {
					@Override
					public String apply(LayoutRevision layoutRevision) {
						return layoutRevision.getTitle();
					}
				},
				new BiConsumer<LayoutRevision, String>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						String title) {
						layoutRevision.setTitle(title);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<LayoutRevision, String>() {
					@Override
					public String apply(LayoutRevision layoutRevision) {
						return layoutRevision.getDescription();
					}
				},
				new BiConsumer<LayoutRevision, String>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						String description) {
						layoutRevision.setDescription(description);
					}
				});
		}
	}

	public static class KeywordsAccessor extends ModelPropertyAccessor {
		public KeywordsAccessor() {
			super(new Function<LayoutRevision, String>() {
					@Override
					public String apply(LayoutRevision layoutRevision) {
						return layoutRevision.getKeywords();
					}
				},
				new BiConsumer<LayoutRevision, String>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						String keywords) {
						layoutRevision.setKeywords(keywords);
					}
				});
		}
	}

	public static class RobotsAccessor extends ModelPropertyAccessor {
		public RobotsAccessor() {
			super(new Function<LayoutRevision, String>() {
					@Override
					public String apply(LayoutRevision layoutRevision) {
						return layoutRevision.getRobots();
					}
				},
				new BiConsumer<LayoutRevision, String>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						String robots) {
						layoutRevision.setRobots(robots);
					}
				});
		}
	}

	public static class TypeSettingsAccessor extends ModelPropertyAccessor {
		public TypeSettingsAccessor() {
			super(new Function<LayoutRevision, String>() {
					@Override
					public String apply(LayoutRevision layoutRevision) {
						return layoutRevision.getTypeSettings();
					}
				},
				new BiConsumer<LayoutRevision, String>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						String typeSettings) {
						layoutRevision.setTypeSettings(typeSettings);
					}
				});
		}
	}

	public static class IconImageIdAccessor extends ModelPropertyAccessor {
		public IconImageIdAccessor() {
			super(new Function<LayoutRevision, Long>() {
					@Override
					public Long apply(LayoutRevision layoutRevision) {
						return layoutRevision.getIconImageId();
					}
				},
				new BiConsumer<LayoutRevision, Long>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						Long iconImageId) {
						layoutRevision.setIconImageId(iconImageId);
					}
				});
		}
	}

	public static class ThemeIdAccessor extends ModelPropertyAccessor {
		public ThemeIdAccessor() {
			super(new Function<LayoutRevision, String>() {
					@Override
					public String apply(LayoutRevision layoutRevision) {
						return layoutRevision.getThemeId();
					}
				},
				new BiConsumer<LayoutRevision, String>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						String themeId) {
						layoutRevision.setThemeId(themeId);
					}
				});
		}
	}

	public static class ColorSchemeIdAccessor extends ModelPropertyAccessor {
		public ColorSchemeIdAccessor() {
			super(new Function<LayoutRevision, String>() {
					@Override
					public String apply(LayoutRevision layoutRevision) {
						return layoutRevision.getColorSchemeId();
					}
				},
				new BiConsumer<LayoutRevision, String>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						String colorSchemeId) {
						layoutRevision.setColorSchemeId(colorSchemeId);
					}
				});
		}
	}

	public static class CssAccessor extends ModelPropertyAccessor {
		public CssAccessor() {
			super(new Function<LayoutRevision, String>() {
					@Override
					public String apply(LayoutRevision layoutRevision) {
						return layoutRevision.getCss();
					}
				},
				new BiConsumer<LayoutRevision, String>() {
					@Override
					public void accept(LayoutRevision layoutRevision, String css) {
						layoutRevision.setCss(css);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<LayoutRevision, Integer>() {
					@Override
					public Integer apply(LayoutRevision layoutRevision) {
						return layoutRevision.getStatus();
					}
				},
				new BiConsumer<LayoutRevision, Integer>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						Integer status) {
						layoutRevision.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<LayoutRevision, Long>() {
					@Override
					public Long apply(LayoutRevision layoutRevision) {
						return layoutRevision.getStatusByUserId();
					}
				},
				new BiConsumer<LayoutRevision, Long>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						Long statusByUserId) {
						layoutRevision.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<LayoutRevision, String>() {
					@Override
					public String apply(LayoutRevision layoutRevision) {
						return layoutRevision.getStatusByUserName();
					}
				},
				new BiConsumer<LayoutRevision, String>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						String statusByUserName) {
						layoutRevision.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<LayoutRevision, Date>() {
					@Override
					public Date apply(LayoutRevision layoutRevision) {
						return layoutRevision.getStatusDate();
					}
				},
				new BiConsumer<LayoutRevision, Date>() {
					@Override
					public void accept(LayoutRevision layoutRevision,
						Date statusDate) {
						layoutRevision.setStatusDate(statusDate);
					}
				});
		}
	}

	private LayoutRevisionModelAccessors() {
	}
}