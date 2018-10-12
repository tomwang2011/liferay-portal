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

package com.liferay.portal.workflow.kaleo.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;
import com.liferay.portal.workflow.kaleo.model.KaleoCondition;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoConditionModelAccessors {
	public static class KaleoConditionIdAccessor extends ModelPropertyAccessor {
		public KaleoConditionIdAccessor() {
			super(new Function<KaleoCondition, Long>() {
					@Override
					public Long apply(KaleoCondition kaleoCondition) {
						return kaleoCondition.getKaleoConditionId();
					}
				},
				new BiConsumer<KaleoCondition, Long>() {
					@Override
					public void accept(KaleoCondition kaleoCondition,
						Long kaleoConditionId) {
						kaleoCondition.setKaleoConditionId(kaleoConditionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoCondition, Long>() {
					@Override
					public Long apply(KaleoCondition kaleoCondition) {
						return kaleoCondition.getGroupId();
					}
				},
				new BiConsumer<KaleoCondition, Long>() {
					@Override
					public void accept(KaleoCondition kaleoCondition,
						Long groupId) {
						kaleoCondition.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoCondition, Long>() {
					@Override
					public Long apply(KaleoCondition kaleoCondition) {
						return kaleoCondition.getCompanyId();
					}
				},
				new BiConsumer<KaleoCondition, Long>() {
					@Override
					public void accept(KaleoCondition kaleoCondition,
						Long companyId) {
						kaleoCondition.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoCondition, Long>() {
					@Override
					public Long apply(KaleoCondition kaleoCondition) {
						return kaleoCondition.getUserId();
					}
				},
				new BiConsumer<KaleoCondition, Long>() {
					@Override
					public void accept(KaleoCondition kaleoCondition,
						Long userId) {
						kaleoCondition.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoCondition, String>() {
					@Override
					public String apply(KaleoCondition kaleoCondition) {
						return kaleoCondition.getUserName();
					}
				},
				new BiConsumer<KaleoCondition, String>() {
					@Override
					public void accept(KaleoCondition kaleoCondition,
						String userName) {
						kaleoCondition.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoCondition, Date>() {
					@Override
					public Date apply(KaleoCondition kaleoCondition) {
						return kaleoCondition.getCreateDate();
					}
				},
				new BiConsumer<KaleoCondition, Date>() {
					@Override
					public void accept(KaleoCondition kaleoCondition,
						Date createDate) {
						kaleoCondition.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoCondition, Date>() {
					@Override
					public Date apply(KaleoCondition kaleoCondition) {
						return kaleoCondition.getModifiedDate();
					}
				},
				new BiConsumer<KaleoCondition, Date>() {
					@Override
					public void accept(KaleoCondition kaleoCondition,
						Date modifiedDate) {
						kaleoCondition.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class KaleoDefinitionVersionIdAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionIdAccessor() {
			super(new Function<KaleoCondition, Long>() {
					@Override
					public Long apply(KaleoCondition kaleoCondition) {
						return kaleoCondition.getKaleoDefinitionVersionId();
					}
				},
				new BiConsumer<KaleoCondition, Long>() {
					@Override
					public void accept(KaleoCondition kaleoCondition,
						Long kaleoDefinitionVersionId) {
						kaleoCondition.setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
					}
				});
		}
	}

	public static class KaleoNodeIdAccessor extends ModelPropertyAccessor {
		public KaleoNodeIdAccessor() {
			super(new Function<KaleoCondition, Long>() {
					@Override
					public Long apply(KaleoCondition kaleoCondition) {
						return kaleoCondition.getKaleoNodeId();
					}
				},
				new BiConsumer<KaleoCondition, Long>() {
					@Override
					public void accept(KaleoCondition kaleoCondition,
						Long kaleoNodeId) {
						kaleoCondition.setKaleoNodeId(kaleoNodeId);
					}
				});
		}
	}

	public static class ScriptAccessor extends ModelPropertyAccessor {
		public ScriptAccessor() {
			super(new Function<KaleoCondition, String>() {
					@Override
					public String apply(KaleoCondition kaleoCondition) {
						return kaleoCondition.getScript();
					}
				},
				new BiConsumer<KaleoCondition, String>() {
					@Override
					public void accept(KaleoCondition kaleoCondition,
						String script) {
						kaleoCondition.setScript(script);
					}
				});
		}
	}

	public static class ScriptLanguageAccessor extends ModelPropertyAccessor {
		public ScriptLanguageAccessor() {
			super(new Function<KaleoCondition, String>() {
					@Override
					public String apply(KaleoCondition kaleoCondition) {
						return kaleoCondition.getScriptLanguage();
					}
				},
				new BiConsumer<KaleoCondition, String>() {
					@Override
					public void accept(KaleoCondition kaleoCondition,
						String scriptLanguage) {
						kaleoCondition.setScriptLanguage(scriptLanguage);
					}
				});
		}
	}

	public static class ScriptRequiredContextsAccessor
		extends ModelPropertyAccessor {
		public ScriptRequiredContextsAccessor() {
			super(new Function<KaleoCondition, String>() {
					@Override
					public String apply(KaleoCondition kaleoCondition) {
						return kaleoCondition.getScriptRequiredContexts();
					}
				},
				new BiConsumer<KaleoCondition, String>() {
					@Override
					public void accept(KaleoCondition kaleoCondition,
						String scriptRequiredContexts) {
						kaleoCondition.setScriptRequiredContexts(scriptRequiredContexts);
					}
				});
		}
	}

	private KaleoConditionModelAccessors() {
	}
}