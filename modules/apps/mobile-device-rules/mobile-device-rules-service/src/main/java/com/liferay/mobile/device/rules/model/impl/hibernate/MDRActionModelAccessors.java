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

import com.liferay.mobile.device.rules.model.MDRAction;

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
public class MDRActionModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<MDRAction, String>() {
					@Override
					public String apply(MDRAction mdrAction) {
						return mdrAction.getUuid();
					}
				},
				new BiConsumer<MDRAction, String>() {
					@Override
					public void accept(MDRAction mdrAction, String uuid) {
						mdrAction.setUuid(uuid);
					}
				});
		}
	}

	public static class ActionIdAccessor extends ModelPropertyAccessor {
		public ActionIdAccessor() {
			super(new Function<MDRAction, Long>() {
					@Override
					public Long apply(MDRAction mdrAction) {
						return mdrAction.getActionId();
					}
				},
				new BiConsumer<MDRAction, Long>() {
					@Override
					public void accept(MDRAction mdrAction, Long actionId) {
						mdrAction.setActionId(actionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<MDRAction, Long>() {
					@Override
					public Long apply(MDRAction mdrAction) {
						return mdrAction.getGroupId();
					}
				},
				new BiConsumer<MDRAction, Long>() {
					@Override
					public void accept(MDRAction mdrAction, Long groupId) {
						mdrAction.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<MDRAction, Long>() {
					@Override
					public Long apply(MDRAction mdrAction) {
						return mdrAction.getCompanyId();
					}
				},
				new BiConsumer<MDRAction, Long>() {
					@Override
					public void accept(MDRAction mdrAction, Long companyId) {
						mdrAction.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<MDRAction, Long>() {
					@Override
					public Long apply(MDRAction mdrAction) {
						return mdrAction.getUserId();
					}
				},
				new BiConsumer<MDRAction, Long>() {
					@Override
					public void accept(MDRAction mdrAction, Long userId) {
						mdrAction.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<MDRAction, String>() {
					@Override
					public String apply(MDRAction mdrAction) {
						return mdrAction.getUserName();
					}
				},
				new BiConsumer<MDRAction, String>() {
					@Override
					public void accept(MDRAction mdrAction, String userName) {
						mdrAction.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<MDRAction, Date>() {
					@Override
					public Date apply(MDRAction mdrAction) {
						return mdrAction.getCreateDate();
					}
				},
				new BiConsumer<MDRAction, Date>() {
					@Override
					public void accept(MDRAction mdrAction, Date createDate) {
						mdrAction.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<MDRAction, Date>() {
					@Override
					public Date apply(MDRAction mdrAction) {
						return mdrAction.getModifiedDate();
					}
				},
				new BiConsumer<MDRAction, Date>() {
					@Override
					public void accept(MDRAction mdrAction, Date modifiedDate) {
						mdrAction.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<MDRAction, Long>() {
					@Override
					public Long apply(MDRAction mdrAction) {
						return mdrAction.getClassNameId();
					}
				},
				new BiConsumer<MDRAction, Long>() {
					@Override
					public void accept(MDRAction mdrAction, Long classNameId) {
						mdrAction.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<MDRAction, Long>() {
					@Override
					public Long apply(MDRAction mdrAction) {
						return mdrAction.getClassPK();
					}
				},
				new BiConsumer<MDRAction, Long>() {
					@Override
					public void accept(MDRAction mdrAction, Long classPK) {
						mdrAction.setClassPK(classPK);
					}
				});
		}
	}

	public static class RuleGroupInstanceIdAccessor
		extends ModelPropertyAccessor {
		public RuleGroupInstanceIdAccessor() {
			super(new Function<MDRAction, Long>() {
					@Override
					public Long apply(MDRAction mdrAction) {
						return mdrAction.getRuleGroupInstanceId();
					}
				},
				new BiConsumer<MDRAction, Long>() {
					@Override
					public void accept(MDRAction mdrAction,
						Long ruleGroupInstanceId) {
						mdrAction.setRuleGroupInstanceId(ruleGroupInstanceId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<MDRAction, String>() {
					@Override
					public String apply(MDRAction mdrAction) {
						return mdrAction.getName();
					}
				},
				new BiConsumer<MDRAction, String>() {
					@Override
					public void accept(MDRAction mdrAction, String name) {
						mdrAction.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<MDRAction, String>() {
					@Override
					public String apply(MDRAction mdrAction) {
						return mdrAction.getDescription();
					}
				},
				new BiConsumer<MDRAction, String>() {
					@Override
					public void accept(MDRAction mdrAction, String description) {
						mdrAction.setDescription(description);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<MDRAction, String>() {
					@Override
					public String apply(MDRAction mdrAction) {
						return mdrAction.getType();
					}
				},
				new BiConsumer<MDRAction, String>() {
					@Override
					public void accept(MDRAction mdrAction, String type) {
						mdrAction.setType(type);
					}
				});
		}
	}

	public static class TypeSettingsAccessor extends ModelPropertyAccessor {
		public TypeSettingsAccessor() {
			super(new Function<MDRAction, String>() {
					@Override
					public String apply(MDRAction mdrAction) {
						return mdrAction.getTypeSettings();
					}
				},
				new BiConsumer<MDRAction, String>() {
					@Override
					public void accept(MDRAction mdrAction, String typeSettings) {
						mdrAction.setTypeSettings(typeSettings);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<MDRAction, Date>() {
					@Override
					public Date apply(MDRAction mdrAction) {
						return mdrAction.getLastPublishDate();
					}
				},
				new BiConsumer<MDRAction, Date>() {
					@Override
					public void accept(MDRAction mdrAction, Date lastPublishDate) {
						mdrAction.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private MDRActionModelAccessors() {
	}
}