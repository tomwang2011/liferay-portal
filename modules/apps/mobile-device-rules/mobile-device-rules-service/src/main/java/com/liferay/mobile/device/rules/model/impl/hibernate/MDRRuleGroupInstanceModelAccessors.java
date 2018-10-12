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

import com.liferay.mobile.device.rules.model.MDRRuleGroupInstance;

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
public class MDRRuleGroupInstanceModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<MDRRuleGroupInstance, String>() {
					@Override
					public String apply(
						MDRRuleGroupInstance mdrRuleGroupInstance) {
						return mdrRuleGroupInstance.getUuid();
					}
				},
				new BiConsumer<MDRRuleGroupInstance, String>() {
					@Override
					public void accept(
						MDRRuleGroupInstance mdrRuleGroupInstance, String uuid) {
						mdrRuleGroupInstance.setUuid(uuid);
					}
				});
		}
	}

	public static class RuleGroupInstanceIdAccessor
		extends ModelPropertyAccessor {
		public RuleGroupInstanceIdAccessor() {
			super(new Function<MDRRuleGroupInstance, Long>() {
					@Override
					public Long apply(MDRRuleGroupInstance mdrRuleGroupInstance) {
						return mdrRuleGroupInstance.getRuleGroupInstanceId();
					}
				},
				new BiConsumer<MDRRuleGroupInstance, Long>() {
					@Override
					public void accept(
						MDRRuleGroupInstance mdrRuleGroupInstance,
						Long ruleGroupInstanceId) {
						mdrRuleGroupInstance.setRuleGroupInstanceId(ruleGroupInstanceId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<MDRRuleGroupInstance, Long>() {
					@Override
					public Long apply(MDRRuleGroupInstance mdrRuleGroupInstance) {
						return mdrRuleGroupInstance.getGroupId();
					}
				},
				new BiConsumer<MDRRuleGroupInstance, Long>() {
					@Override
					public void accept(
						MDRRuleGroupInstance mdrRuleGroupInstance, Long groupId) {
						mdrRuleGroupInstance.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<MDRRuleGroupInstance, Long>() {
					@Override
					public Long apply(MDRRuleGroupInstance mdrRuleGroupInstance) {
						return mdrRuleGroupInstance.getCompanyId();
					}
				},
				new BiConsumer<MDRRuleGroupInstance, Long>() {
					@Override
					public void accept(
						MDRRuleGroupInstance mdrRuleGroupInstance,
						Long companyId) {
						mdrRuleGroupInstance.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<MDRRuleGroupInstance, Long>() {
					@Override
					public Long apply(MDRRuleGroupInstance mdrRuleGroupInstance) {
						return mdrRuleGroupInstance.getUserId();
					}
				},
				new BiConsumer<MDRRuleGroupInstance, Long>() {
					@Override
					public void accept(
						MDRRuleGroupInstance mdrRuleGroupInstance, Long userId) {
						mdrRuleGroupInstance.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<MDRRuleGroupInstance, String>() {
					@Override
					public String apply(
						MDRRuleGroupInstance mdrRuleGroupInstance) {
						return mdrRuleGroupInstance.getUserName();
					}
				},
				new BiConsumer<MDRRuleGroupInstance, String>() {
					@Override
					public void accept(
						MDRRuleGroupInstance mdrRuleGroupInstance,
						String userName) {
						mdrRuleGroupInstance.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<MDRRuleGroupInstance, Date>() {
					@Override
					public Date apply(MDRRuleGroupInstance mdrRuleGroupInstance) {
						return mdrRuleGroupInstance.getCreateDate();
					}
				},
				new BiConsumer<MDRRuleGroupInstance, Date>() {
					@Override
					public void accept(
						MDRRuleGroupInstance mdrRuleGroupInstance,
						Date createDate) {
						mdrRuleGroupInstance.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<MDRRuleGroupInstance, Date>() {
					@Override
					public Date apply(MDRRuleGroupInstance mdrRuleGroupInstance) {
						return mdrRuleGroupInstance.getModifiedDate();
					}
				},
				new BiConsumer<MDRRuleGroupInstance, Date>() {
					@Override
					public void accept(
						MDRRuleGroupInstance mdrRuleGroupInstance,
						Date modifiedDate) {
						mdrRuleGroupInstance.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<MDRRuleGroupInstance, Long>() {
					@Override
					public Long apply(MDRRuleGroupInstance mdrRuleGroupInstance) {
						return mdrRuleGroupInstance.getClassNameId();
					}
				},
				new BiConsumer<MDRRuleGroupInstance, Long>() {
					@Override
					public void accept(
						MDRRuleGroupInstance mdrRuleGroupInstance,
						Long classNameId) {
						mdrRuleGroupInstance.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<MDRRuleGroupInstance, Long>() {
					@Override
					public Long apply(MDRRuleGroupInstance mdrRuleGroupInstance) {
						return mdrRuleGroupInstance.getClassPK();
					}
				},
				new BiConsumer<MDRRuleGroupInstance, Long>() {
					@Override
					public void accept(
						MDRRuleGroupInstance mdrRuleGroupInstance, Long classPK) {
						mdrRuleGroupInstance.setClassPK(classPK);
					}
				});
		}
	}

	public static class RuleGroupIdAccessor extends ModelPropertyAccessor {
		public RuleGroupIdAccessor() {
			super(new Function<MDRRuleGroupInstance, Long>() {
					@Override
					public Long apply(MDRRuleGroupInstance mdrRuleGroupInstance) {
						return mdrRuleGroupInstance.getRuleGroupId();
					}
				},
				new BiConsumer<MDRRuleGroupInstance, Long>() {
					@Override
					public void accept(
						MDRRuleGroupInstance mdrRuleGroupInstance,
						Long ruleGroupId) {
						mdrRuleGroupInstance.setRuleGroupId(ruleGroupId);
					}
				});
		}
	}

	public static class PriorityAccessor extends ModelPropertyAccessor {
		public PriorityAccessor() {
			super(new Function<MDRRuleGroupInstance, Integer>() {
					@Override
					public Integer apply(
						MDRRuleGroupInstance mdrRuleGroupInstance) {
						return mdrRuleGroupInstance.getPriority();
					}
				},
				new BiConsumer<MDRRuleGroupInstance, Integer>() {
					@Override
					public void accept(
						MDRRuleGroupInstance mdrRuleGroupInstance,
						Integer priority) {
						mdrRuleGroupInstance.setPriority(priority);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<MDRRuleGroupInstance, Date>() {
					@Override
					public Date apply(MDRRuleGroupInstance mdrRuleGroupInstance) {
						return mdrRuleGroupInstance.getLastPublishDate();
					}
				},
				new BiConsumer<MDRRuleGroupInstance, Date>() {
					@Override
					public void accept(
						MDRRuleGroupInstance mdrRuleGroupInstance,
						Date lastPublishDate) {
						mdrRuleGroupInstance.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private MDRRuleGroupInstanceModelAccessors() {
	}
}