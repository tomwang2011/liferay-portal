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
import com.liferay.portal.kernel.model.LayoutBranch;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LayoutBranchModelAccessors {
	public static class LayoutBranchIdAccessor extends ModelPropertyAccessor {
		public LayoutBranchIdAccessor() {
			super(new Function<LayoutBranch, Long>() {
					@Override
					public Long apply(LayoutBranch layoutBranch) {
						return layoutBranch.getLayoutBranchId();
					}
				},
				new BiConsumer<LayoutBranch, Long>() {
					@Override
					public void accept(LayoutBranch layoutBranch,
						Long layoutBranchId) {
						layoutBranch.setLayoutBranchId(layoutBranchId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<LayoutBranch, Long>() {
					@Override
					public Long apply(LayoutBranch layoutBranch) {
						return layoutBranch.getGroupId();
					}
				},
				new BiConsumer<LayoutBranch, Long>() {
					@Override
					public void accept(LayoutBranch layoutBranch, Long groupId) {
						layoutBranch.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<LayoutBranch, Long>() {
					@Override
					public Long apply(LayoutBranch layoutBranch) {
						return layoutBranch.getCompanyId();
					}
				},
				new BiConsumer<LayoutBranch, Long>() {
					@Override
					public void accept(LayoutBranch layoutBranch, Long companyId) {
						layoutBranch.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<LayoutBranch, Long>() {
					@Override
					public Long apply(LayoutBranch layoutBranch) {
						return layoutBranch.getUserId();
					}
				},
				new BiConsumer<LayoutBranch, Long>() {
					@Override
					public void accept(LayoutBranch layoutBranch, Long userId) {
						layoutBranch.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<LayoutBranch, String>() {
					@Override
					public String apply(LayoutBranch layoutBranch) {
						return layoutBranch.getUserName();
					}
				},
				new BiConsumer<LayoutBranch, String>() {
					@Override
					public void accept(LayoutBranch layoutBranch,
						String userName) {
						layoutBranch.setUserName(userName);
					}
				});
		}
	}

	public static class LayoutSetBranchIdAccessor extends ModelPropertyAccessor {
		public LayoutSetBranchIdAccessor() {
			super(new Function<LayoutBranch, Long>() {
					@Override
					public Long apply(LayoutBranch layoutBranch) {
						return layoutBranch.getLayoutSetBranchId();
					}
				},
				new BiConsumer<LayoutBranch, Long>() {
					@Override
					public void accept(LayoutBranch layoutBranch,
						Long layoutSetBranchId) {
						layoutBranch.setLayoutSetBranchId(layoutSetBranchId);
					}
				});
		}
	}

	public static class PlidAccessor extends ModelPropertyAccessor {
		public PlidAccessor() {
			super(new Function<LayoutBranch, Long>() {
					@Override
					public Long apply(LayoutBranch layoutBranch) {
						return layoutBranch.getPlid();
					}
				},
				new BiConsumer<LayoutBranch, Long>() {
					@Override
					public void accept(LayoutBranch layoutBranch, Long plid) {
						layoutBranch.setPlid(plid);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<LayoutBranch, String>() {
					@Override
					public String apply(LayoutBranch layoutBranch) {
						return layoutBranch.getName();
					}
				},
				new BiConsumer<LayoutBranch, String>() {
					@Override
					public void accept(LayoutBranch layoutBranch, String name) {
						layoutBranch.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<LayoutBranch, String>() {
					@Override
					public String apply(LayoutBranch layoutBranch) {
						return layoutBranch.getDescription();
					}
				},
				new BiConsumer<LayoutBranch, String>() {
					@Override
					public void accept(LayoutBranch layoutBranch,
						String description) {
						layoutBranch.setDescription(description);
					}
				});
		}
	}

	public static class MasterAccessor extends ModelPropertyAccessor {
		public MasterAccessor() {
			super(new Function<LayoutBranch, Boolean>() {
					@Override
					public Boolean apply(LayoutBranch layoutBranch) {
						return layoutBranch.getMaster();
					}
				},
				new BiConsumer<LayoutBranch, Boolean>() {
					@Override
					public void accept(LayoutBranch layoutBranch, Boolean master) {
						layoutBranch.setMaster(master);
					}
				});
		}
	}

	private LayoutBranchModelAccessors() {
	}
}