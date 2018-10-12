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

package com.liferay.mobile.device.rules.model.impl.hibernate;

import com.liferay.mobile.device.rules.model.MDRRuleGroup;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Edward C. Han
 * @generated
 */
public class MDRRuleGroupModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<MDRRuleGroup, String>() {
					@Override
					public String apply(MDRRuleGroup mdrRuleGroup) {
						return mdrRuleGroup.getUuid();
					}
				},
				new BiConsumer<MDRRuleGroup, String>() {
					@Override
					public void accept(MDRRuleGroup mdrRuleGroup, String uuid) {
						mdrRuleGroup.setUuid(uuid);
					}
				});
		}
	}

	public static class RuleGroupIdAccessor extends ModelPropertyAccessor {
		public RuleGroupIdAccessor() {
			super(new Function<MDRRuleGroup, Long>() {
					@Override
					public Long apply(MDRRuleGroup mdrRuleGroup) {
						return mdrRuleGroup.getRuleGroupId();
					}
				},
				new BiConsumer<MDRRuleGroup, Long>() {
					@Override
					public void accept(MDRRuleGroup mdrRuleGroup,
						Long ruleGroupId) {
						mdrRuleGroup.setRuleGroupId(ruleGroupId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<MDRRuleGroup, Long>() {
					@Override
					public Long apply(MDRRuleGroup mdrRuleGroup) {
						return mdrRuleGroup.getGroupId();
					}
				},
				new BiConsumer<MDRRuleGroup, Long>() {
					@Override
					public void accept(MDRRuleGroup mdrRuleGroup, Long groupId) {
						mdrRuleGroup.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<MDRRuleGroup, Long>() {
					@Override
					public Long apply(MDRRuleGroup mdrRuleGroup) {
						return mdrRuleGroup.getCompanyId();
					}
				},
				new BiConsumer<MDRRuleGroup, Long>() {
					@Override
					public void accept(MDRRuleGroup mdrRuleGroup, Long companyId) {
						mdrRuleGroup.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<MDRRuleGroup, Long>() {
					@Override
					public Long apply(MDRRuleGroup mdrRuleGroup) {
						return mdrRuleGroup.getUserId();
					}
				},
				new BiConsumer<MDRRuleGroup, Long>() {
					@Override
					public void accept(MDRRuleGroup mdrRuleGroup, Long userId) {
						mdrRuleGroup.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<MDRRuleGroup, String>() {
					@Override
					public String apply(MDRRuleGroup mdrRuleGroup) {
						return mdrRuleGroup.getUserName();
					}
				},
				new BiConsumer<MDRRuleGroup, String>() {
					@Override
					public void accept(MDRRuleGroup mdrRuleGroup,
						String userName) {
						mdrRuleGroup.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<MDRRuleGroup, Date>() {
					@Override
					public Date apply(MDRRuleGroup mdrRuleGroup) {
						return mdrRuleGroup.getCreateDate();
					}
				},
				new BiConsumer<MDRRuleGroup, Date>() {
					@Override
					public void accept(MDRRuleGroup mdrRuleGroup,
						Date createDate) {
						mdrRuleGroup.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<MDRRuleGroup, Date>() {
					@Override
					public Date apply(MDRRuleGroup mdrRuleGroup) {
						return mdrRuleGroup.getModifiedDate();
					}
				},
				new BiConsumer<MDRRuleGroup, Date>() {
					@Override
					public void accept(MDRRuleGroup mdrRuleGroup,
						Date modifiedDate) {
						mdrRuleGroup.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<MDRRuleGroup, String>() {
					@Override
					public String apply(MDRRuleGroup mdrRuleGroup) {
						return mdrRuleGroup.getName();
					}
				},
				new BiConsumer<MDRRuleGroup, String>() {
					@Override
					public void accept(MDRRuleGroup mdrRuleGroup, String name) {
						mdrRuleGroup.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<MDRRuleGroup, String>() {
					@Override
					public String apply(MDRRuleGroup mdrRuleGroup) {
						return mdrRuleGroup.getDescription();
					}
				},
				new BiConsumer<MDRRuleGroup, String>() {
					@Override
					public void accept(MDRRuleGroup mdrRuleGroup,
						String description) {
						mdrRuleGroup.setDescription(description);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<MDRRuleGroup, Date>() {
					@Override
					public Date apply(MDRRuleGroup mdrRuleGroup) {
						return mdrRuleGroup.getLastPublishDate();
					}
				},
				new BiConsumer<MDRRuleGroup, Date>() {
					@Override
					public void accept(MDRRuleGroup mdrRuleGroup,
						Date lastPublishDate) {
						mdrRuleGroup.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private MDRRuleGroupModelAccessors() {
	}
}