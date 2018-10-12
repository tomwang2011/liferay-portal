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
import com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoTaskInstanceTokenModelAccessors {
	public static class KaleoTaskInstanceTokenIdAccessor
		extends ModelPropertyAccessor {
		public KaleoTaskInstanceTokenIdAccessor() {
			super(new Function<KaleoTaskInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getKaleoTaskInstanceTokenId();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						Long kaleoTaskInstanceTokenId) {
						kaleoTaskInstanceToken.setKaleoTaskInstanceTokenId(kaleoTaskInstanceTokenId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoTaskInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getGroupId();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						Long groupId) {
						kaleoTaskInstanceToken.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoTaskInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getCompanyId();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						Long companyId) {
						kaleoTaskInstanceToken.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoTaskInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getUserId();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						Long userId) {
						kaleoTaskInstanceToken.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoTaskInstanceToken, String>() {
					@Override
					public String apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getUserName();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, String>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						String userName) {
						kaleoTaskInstanceToken.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoTaskInstanceToken, Date>() {
					@Override
					public Date apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getCreateDate();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, Date>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						Date createDate) {
						kaleoTaskInstanceToken.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoTaskInstanceToken, Date>() {
					@Override
					public Date apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getModifiedDate();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, Date>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						Date modifiedDate) {
						kaleoTaskInstanceToken.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class KaleoDefinitionVersionIdAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionIdAccessor() {
			super(new Function<KaleoTaskInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getKaleoDefinitionVersionId();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						Long kaleoDefinitionVersionId) {
						kaleoTaskInstanceToken.setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
					}
				});
		}
	}

	public static class KaleoInstanceIdAccessor extends ModelPropertyAccessor {
		public KaleoInstanceIdAccessor() {
			super(new Function<KaleoTaskInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getKaleoInstanceId();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						Long kaleoInstanceId) {
						kaleoTaskInstanceToken.setKaleoInstanceId(kaleoInstanceId);
					}
				});
		}
	}

	public static class KaleoInstanceTokenIdAccessor
		extends ModelPropertyAccessor {
		public KaleoInstanceTokenIdAccessor() {
			super(new Function<KaleoTaskInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getKaleoInstanceTokenId();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						Long kaleoInstanceTokenId) {
						kaleoTaskInstanceToken.setKaleoInstanceTokenId(kaleoInstanceTokenId);
					}
				});
		}
	}

	public static class KaleoTaskIdAccessor extends ModelPropertyAccessor {
		public KaleoTaskIdAccessor() {
			super(new Function<KaleoTaskInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getKaleoTaskId();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						Long kaleoTaskId) {
						kaleoTaskInstanceToken.setKaleoTaskId(kaleoTaskId);
					}
				});
		}
	}

	public static class KaleoTaskNameAccessor extends ModelPropertyAccessor {
		public KaleoTaskNameAccessor() {
			super(new Function<KaleoTaskInstanceToken, String>() {
					@Override
					public String apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getKaleoTaskName();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, String>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						String kaleoTaskName) {
						kaleoTaskInstanceToken.setKaleoTaskName(kaleoTaskName);
					}
				});
		}
	}

	public static class ClassNameAccessor extends ModelPropertyAccessor {
		public ClassNameAccessor() {
			super(new Function<KaleoTaskInstanceToken, String>() {
					@Override
					public String apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getClassName();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, String>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						String className) {
						kaleoTaskInstanceToken.setClassName(className);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<KaleoTaskInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getClassPK();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						Long classPK) {
						kaleoTaskInstanceToken.setClassPK(classPK);
					}
				});
		}
	}

	public static class CompletionUserIdAccessor extends ModelPropertyAccessor {
		public CompletionUserIdAccessor() {
			super(new Function<KaleoTaskInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getCompletionUserId();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						Long completionUserId) {
						kaleoTaskInstanceToken.setCompletionUserId(completionUserId);
					}
				});
		}
	}

	public static class CompletedAccessor extends ModelPropertyAccessor {
		public CompletedAccessor() {
			super(new Function<KaleoTaskInstanceToken, Boolean>() {
					@Override
					public Boolean apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getCompleted();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, Boolean>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						Boolean completed) {
						kaleoTaskInstanceToken.setCompleted(completed);
					}
				});
		}
	}

	public static class CompletionDateAccessor extends ModelPropertyAccessor {
		public CompletionDateAccessor() {
			super(new Function<KaleoTaskInstanceToken, Date>() {
					@Override
					public Date apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getCompletionDate();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, Date>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						Date completionDate) {
						kaleoTaskInstanceToken.setCompletionDate(completionDate);
					}
				});
		}
	}

	public static class DueDateAccessor extends ModelPropertyAccessor {
		public DueDateAccessor() {
			super(new Function<KaleoTaskInstanceToken, Date>() {
					@Override
					public Date apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getDueDate();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, Date>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						Date dueDate) {
						kaleoTaskInstanceToken.setDueDate(dueDate);
					}
				});
		}
	}

	public static class WorkflowContextAccessor extends ModelPropertyAccessor {
		public WorkflowContextAccessor() {
			super(new Function<KaleoTaskInstanceToken, String>() {
					@Override
					public String apply(
						KaleoTaskInstanceToken kaleoTaskInstanceToken) {
						return kaleoTaskInstanceToken.getWorkflowContext();
					}
				},
				new BiConsumer<KaleoTaskInstanceToken, String>() {
					@Override
					public void accept(
						KaleoTaskInstanceToken kaleoTaskInstanceToken,
						String workflowContext) {
						kaleoTaskInstanceToken.setWorkflowContext(workflowContext);
					}
				});
		}
	}

	private KaleoTaskInstanceTokenModelAccessors() {
	}
}