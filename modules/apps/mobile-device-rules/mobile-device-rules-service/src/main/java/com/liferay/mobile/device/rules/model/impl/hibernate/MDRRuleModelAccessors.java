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

import com.liferay.mobile.device.rules.model.MDRRule;

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
public class MDRRuleModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<MDRRule, String>() {
					@Override
					public String apply(MDRRule mdrRule) {
						return mdrRule.getUuid();
					}
				},
				new BiConsumer<MDRRule, String>() {
					@Override
					public void accept(MDRRule mdrRule, String uuid) {
						mdrRule.setUuid(uuid);
					}
				});
		}
	}

	public static class RuleIdAccessor extends ModelPropertyAccessor {
		public RuleIdAccessor() {
			super(new Function<MDRRule, Long>() {
					@Override
					public Long apply(MDRRule mdrRule) {
						return mdrRule.getRuleId();
					}
				},
				new BiConsumer<MDRRule, Long>() {
					@Override
					public void accept(MDRRule mdrRule, Long ruleId) {
						mdrRule.setRuleId(ruleId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<MDRRule, Long>() {
					@Override
					public Long apply(MDRRule mdrRule) {
						return mdrRule.getGroupId();
					}
				},
				new BiConsumer<MDRRule, Long>() {
					@Override
					public void accept(MDRRule mdrRule, Long groupId) {
						mdrRule.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<MDRRule, Long>() {
					@Override
					public Long apply(MDRRule mdrRule) {
						return mdrRule.getCompanyId();
					}
				},
				new BiConsumer<MDRRule, Long>() {
					@Override
					public void accept(MDRRule mdrRule, Long companyId) {
						mdrRule.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<MDRRule, Long>() {
					@Override
					public Long apply(MDRRule mdrRule) {
						return mdrRule.getUserId();
					}
				},
				new BiConsumer<MDRRule, Long>() {
					@Override
					public void accept(MDRRule mdrRule, Long userId) {
						mdrRule.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<MDRRule, String>() {
					@Override
					public String apply(MDRRule mdrRule) {
						return mdrRule.getUserName();
					}
				},
				new BiConsumer<MDRRule, String>() {
					@Override
					public void accept(MDRRule mdrRule, String userName) {
						mdrRule.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<MDRRule, Date>() {
					@Override
					public Date apply(MDRRule mdrRule) {
						return mdrRule.getCreateDate();
					}
				},
				new BiConsumer<MDRRule, Date>() {
					@Override
					public void accept(MDRRule mdrRule, Date createDate) {
						mdrRule.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<MDRRule, Date>() {
					@Override
					public Date apply(MDRRule mdrRule) {
						return mdrRule.getModifiedDate();
					}
				},
				new BiConsumer<MDRRule, Date>() {
					@Override
					public void accept(MDRRule mdrRule, Date modifiedDate) {
						mdrRule.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class RuleGroupIdAccessor extends ModelPropertyAccessor {
		public RuleGroupIdAccessor() {
			super(new Function<MDRRule, Long>() {
					@Override
					public Long apply(MDRRule mdrRule) {
						return mdrRule.getRuleGroupId();
					}
				},
				new BiConsumer<MDRRule, Long>() {
					@Override
					public void accept(MDRRule mdrRule, Long ruleGroupId) {
						mdrRule.setRuleGroupId(ruleGroupId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<MDRRule, String>() {
					@Override
					public String apply(MDRRule mdrRule) {
						return mdrRule.getName();
					}
				},
				new BiConsumer<MDRRule, String>() {
					@Override
					public void accept(MDRRule mdrRule, String name) {
						mdrRule.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<MDRRule, String>() {
					@Override
					public String apply(MDRRule mdrRule) {
						return mdrRule.getDescription();
					}
				},
				new BiConsumer<MDRRule, String>() {
					@Override
					public void accept(MDRRule mdrRule, String description) {
						mdrRule.setDescription(description);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<MDRRule, String>() {
					@Override
					public String apply(MDRRule mdrRule) {
						return mdrRule.getType();
					}
				},
				new BiConsumer<MDRRule, String>() {
					@Override
					public void accept(MDRRule mdrRule, String type) {
						mdrRule.setType(type);
					}
				});
		}
	}

	public static class TypeSettingsAccessor extends ModelPropertyAccessor {
		public TypeSettingsAccessor() {
			super(new Function<MDRRule, String>() {
					@Override
					public String apply(MDRRule mdrRule) {
						return mdrRule.getTypeSettings();
					}
				},
				new BiConsumer<MDRRule, String>() {
					@Override
					public void accept(MDRRule mdrRule, String typeSettings) {
						mdrRule.setTypeSettings(typeSettings);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<MDRRule, Date>() {
					@Override
					public Date apply(MDRRule mdrRule) {
						return mdrRule.getLastPublishDate();
					}
				},
				new BiConsumer<MDRRule, Date>() {
					@Override
					public void accept(MDRRule mdrRule, Date lastPublishDate) {
						mdrRule.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private MDRRuleModelAccessors() {
	}
}