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
import com.liferay.portal.workflow.kaleo.model.KaleoAction;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoActionModelAccessors {
	public static class KaleoActionIdAccessor extends ModelPropertyAccessor {
		public KaleoActionIdAccessor() {
			super(new Function<KaleoAction, Long>() {
					@Override
					public Long apply(KaleoAction kaleoAction) {
						return kaleoAction.getKaleoActionId();
					}
				},
				new BiConsumer<KaleoAction, Long>() {
					@Override
					public void accept(KaleoAction kaleoAction,
						Long kaleoActionId) {
						kaleoAction.setKaleoActionId(kaleoActionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoAction, Long>() {
					@Override
					public Long apply(KaleoAction kaleoAction) {
						return kaleoAction.getGroupId();
					}
				},
				new BiConsumer<KaleoAction, Long>() {
					@Override
					public void accept(KaleoAction kaleoAction, Long groupId) {
						kaleoAction.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoAction, Long>() {
					@Override
					public Long apply(KaleoAction kaleoAction) {
						return kaleoAction.getCompanyId();
					}
				},
				new BiConsumer<KaleoAction, Long>() {
					@Override
					public void accept(KaleoAction kaleoAction, Long companyId) {
						kaleoAction.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoAction, Long>() {
					@Override
					public Long apply(KaleoAction kaleoAction) {
						return kaleoAction.getUserId();
					}
				},
				new BiConsumer<KaleoAction, Long>() {
					@Override
					public void accept(KaleoAction kaleoAction, Long userId) {
						kaleoAction.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoAction, String>() {
					@Override
					public String apply(KaleoAction kaleoAction) {
						return kaleoAction.getUserName();
					}
				},
				new BiConsumer<KaleoAction, String>() {
					@Override
					public void accept(KaleoAction kaleoAction, String userName) {
						kaleoAction.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoAction, Date>() {
					@Override
					public Date apply(KaleoAction kaleoAction) {
						return kaleoAction.getCreateDate();
					}
				},
				new BiConsumer<KaleoAction, Date>() {
					@Override
					public void accept(KaleoAction kaleoAction, Date createDate) {
						kaleoAction.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoAction, Date>() {
					@Override
					public Date apply(KaleoAction kaleoAction) {
						return kaleoAction.getModifiedDate();
					}
				},
				new BiConsumer<KaleoAction, Date>() {
					@Override
					public void accept(KaleoAction kaleoAction,
						Date modifiedDate) {
						kaleoAction.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class KaleoClassNameAccessor extends ModelPropertyAccessor {
		public KaleoClassNameAccessor() {
			super(new Function<KaleoAction, String>() {
					@Override
					public String apply(KaleoAction kaleoAction) {
						return kaleoAction.getKaleoClassName();
					}
				},
				new BiConsumer<KaleoAction, String>() {
					@Override
					public void accept(KaleoAction kaleoAction,
						String kaleoClassName) {
						kaleoAction.setKaleoClassName(kaleoClassName);
					}
				});
		}
	}

	public static class KaleoClassPKAccessor extends ModelPropertyAccessor {
		public KaleoClassPKAccessor() {
			super(new Function<KaleoAction, Long>() {
					@Override
					public Long apply(KaleoAction kaleoAction) {
						return kaleoAction.getKaleoClassPK();
					}
				},
				new BiConsumer<KaleoAction, Long>() {
					@Override
					public void accept(KaleoAction kaleoAction,
						Long kaleoClassPK) {
						kaleoAction.setKaleoClassPK(kaleoClassPK);
					}
				});
		}
	}

	public static class KaleoDefinitionVersionIdAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionIdAccessor() {
			super(new Function<KaleoAction, Long>() {
					@Override
					public Long apply(KaleoAction kaleoAction) {
						return kaleoAction.getKaleoDefinitionVersionId();
					}
				},
				new BiConsumer<KaleoAction, Long>() {
					@Override
					public void accept(KaleoAction kaleoAction,
						Long kaleoDefinitionVersionId) {
						kaleoAction.setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
					}
				});
		}
	}

	public static class KaleoNodeNameAccessor extends ModelPropertyAccessor {
		public KaleoNodeNameAccessor() {
			super(new Function<KaleoAction, String>() {
					@Override
					public String apply(KaleoAction kaleoAction) {
						return kaleoAction.getKaleoNodeName();
					}
				},
				new BiConsumer<KaleoAction, String>() {
					@Override
					public void accept(KaleoAction kaleoAction,
						String kaleoNodeName) {
						kaleoAction.setKaleoNodeName(kaleoNodeName);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<KaleoAction, String>() {
					@Override
					public String apply(KaleoAction kaleoAction) {
						return kaleoAction.getName();
					}
				},
				new BiConsumer<KaleoAction, String>() {
					@Override
					public void accept(KaleoAction kaleoAction, String name) {
						kaleoAction.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<KaleoAction, String>() {
					@Override
					public String apply(KaleoAction kaleoAction) {
						return kaleoAction.getDescription();
					}
				},
				new BiConsumer<KaleoAction, String>() {
					@Override
					public void accept(KaleoAction kaleoAction,
						String description) {
						kaleoAction.setDescription(description);
					}
				});
		}
	}

	public static class ExecutionTypeAccessor extends ModelPropertyAccessor {
		public ExecutionTypeAccessor() {
			super(new Function<KaleoAction, String>() {
					@Override
					public String apply(KaleoAction kaleoAction) {
						return kaleoAction.getExecutionType();
					}
				},
				new BiConsumer<KaleoAction, String>() {
					@Override
					public void accept(KaleoAction kaleoAction,
						String executionType) {
						kaleoAction.setExecutionType(executionType);
					}
				});
		}
	}

	public static class ScriptAccessor extends ModelPropertyAccessor {
		public ScriptAccessor() {
			super(new Function<KaleoAction, String>() {
					@Override
					public String apply(KaleoAction kaleoAction) {
						return kaleoAction.getScript();
					}
				},
				new BiConsumer<KaleoAction, String>() {
					@Override
					public void accept(KaleoAction kaleoAction, String script) {
						kaleoAction.setScript(script);
					}
				});
		}
	}

	public static class ScriptLanguageAccessor extends ModelPropertyAccessor {
		public ScriptLanguageAccessor() {
			super(new Function<KaleoAction, String>() {
					@Override
					public String apply(KaleoAction kaleoAction) {
						return kaleoAction.getScriptLanguage();
					}
				},
				new BiConsumer<KaleoAction, String>() {
					@Override
					public void accept(KaleoAction kaleoAction,
						String scriptLanguage) {
						kaleoAction.setScriptLanguage(scriptLanguage);
					}
				});
		}
	}

	public static class ScriptRequiredContextsAccessor
		extends ModelPropertyAccessor {
		public ScriptRequiredContextsAccessor() {
			super(new Function<KaleoAction, String>() {
					@Override
					public String apply(KaleoAction kaleoAction) {
						return kaleoAction.getScriptRequiredContexts();
					}
				},
				new BiConsumer<KaleoAction, String>() {
					@Override
					public void accept(KaleoAction kaleoAction,
						String scriptRequiredContexts) {
						kaleoAction.setScriptRequiredContexts(scriptRequiredContexts);
					}
				});
		}
	}

	public static class PriorityAccessor extends ModelPropertyAccessor {
		public PriorityAccessor() {
			super(new Function<KaleoAction, Integer>() {
					@Override
					public Integer apply(KaleoAction kaleoAction) {
						return kaleoAction.getPriority();
					}
				},
				new BiConsumer<KaleoAction, Integer>() {
					@Override
					public void accept(KaleoAction kaleoAction, Integer priority) {
						kaleoAction.setPriority(priority);
					}
				});
		}
	}

	private KaleoActionModelAccessors() {
	}
}