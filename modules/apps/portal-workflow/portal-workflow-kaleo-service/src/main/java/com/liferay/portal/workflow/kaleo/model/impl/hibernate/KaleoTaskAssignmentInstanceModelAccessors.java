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
import com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentInstance;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoTaskAssignmentInstanceModelAccessors {
	public static class KaleoTaskAssignmentInstanceIdAccessor
		extends ModelPropertyAccessor {
		public KaleoTaskAssignmentInstanceIdAccessor() {
			super(new Function<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance) {
						return kaleoTaskAssignmentInstance.getKaleoTaskAssignmentInstanceId();
					}
				},
				new BiConsumer<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance,
						Long kaleoTaskAssignmentInstanceId) {
						kaleoTaskAssignmentInstance.setKaleoTaskAssignmentInstanceId(kaleoTaskAssignmentInstanceId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance) {
						return kaleoTaskAssignmentInstance.getGroupId();
					}
				},
				new BiConsumer<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance,
						Long groupId) {
						kaleoTaskAssignmentInstance.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance) {
						return kaleoTaskAssignmentInstance.getCompanyId();
					}
				},
				new BiConsumer<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance,
						Long companyId) {
						kaleoTaskAssignmentInstance.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance) {
						return kaleoTaskAssignmentInstance.getUserId();
					}
				},
				new BiConsumer<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance,
						Long userId) {
						kaleoTaskAssignmentInstance.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoTaskAssignmentInstance, String>() {
					@Override
					public String apply(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance) {
						return kaleoTaskAssignmentInstance.getUserName();
					}
				},
				new BiConsumer<KaleoTaskAssignmentInstance, String>() {
					@Override
					public void accept(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance,
						String userName) {
						kaleoTaskAssignmentInstance.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoTaskAssignmentInstance, Date>() {
					@Override
					public Date apply(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance) {
						return kaleoTaskAssignmentInstance.getCreateDate();
					}
				},
				new BiConsumer<KaleoTaskAssignmentInstance, Date>() {
					@Override
					public void accept(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance,
						Date createDate) {
						kaleoTaskAssignmentInstance.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoTaskAssignmentInstance, Date>() {
					@Override
					public Date apply(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance) {
						return kaleoTaskAssignmentInstance.getModifiedDate();
					}
				},
				new BiConsumer<KaleoTaskAssignmentInstance, Date>() {
					@Override
					public void accept(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance,
						Date modifiedDate) {
						kaleoTaskAssignmentInstance.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class KaleoDefinitionVersionIdAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionIdAccessor() {
			super(new Function<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance) {
						return kaleoTaskAssignmentInstance.getKaleoDefinitionVersionId();
					}
				},
				new BiConsumer<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance,
						Long kaleoDefinitionVersionId) {
						kaleoTaskAssignmentInstance.setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
					}
				});
		}
	}

	public static class KaleoInstanceIdAccessor extends ModelPropertyAccessor {
		public KaleoInstanceIdAccessor() {
			super(new Function<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance) {
						return kaleoTaskAssignmentInstance.getKaleoInstanceId();
					}
				},
				new BiConsumer<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance,
						Long kaleoInstanceId) {
						kaleoTaskAssignmentInstance.setKaleoInstanceId(kaleoInstanceId);
					}
				});
		}
	}

	public static class KaleoInstanceTokenIdAccessor
		extends ModelPropertyAccessor {
		public KaleoInstanceTokenIdAccessor() {
			super(new Function<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance) {
						return kaleoTaskAssignmentInstance.getKaleoInstanceTokenId();
					}
				},
				new BiConsumer<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance,
						Long kaleoInstanceTokenId) {
						kaleoTaskAssignmentInstance.setKaleoInstanceTokenId(kaleoInstanceTokenId);
					}
				});
		}
	}

	public static class KaleoTaskInstanceTokenIdAccessor
		extends ModelPropertyAccessor {
		public KaleoTaskInstanceTokenIdAccessor() {
			super(new Function<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance) {
						return kaleoTaskAssignmentInstance.getKaleoTaskInstanceTokenId();
					}
				},
				new BiConsumer<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance,
						Long kaleoTaskInstanceTokenId) {
						kaleoTaskAssignmentInstance.setKaleoTaskInstanceTokenId(kaleoTaskInstanceTokenId);
					}
				});
		}
	}

	public static class KaleoTaskIdAccessor extends ModelPropertyAccessor {
		public KaleoTaskIdAccessor() {
			super(new Function<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance) {
						return kaleoTaskAssignmentInstance.getKaleoTaskId();
					}
				},
				new BiConsumer<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance,
						Long kaleoTaskId) {
						kaleoTaskAssignmentInstance.setKaleoTaskId(kaleoTaskId);
					}
				});
		}
	}

	public static class KaleoTaskNameAccessor extends ModelPropertyAccessor {
		public KaleoTaskNameAccessor() {
			super(new Function<KaleoTaskAssignmentInstance, String>() {
					@Override
					public String apply(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance) {
						return kaleoTaskAssignmentInstance.getKaleoTaskName();
					}
				},
				new BiConsumer<KaleoTaskAssignmentInstance, String>() {
					@Override
					public void accept(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance,
						String kaleoTaskName) {
						kaleoTaskAssignmentInstance.setKaleoTaskName(kaleoTaskName);
					}
				});
		}
	}

	public static class AssigneeClassNameAccessor extends ModelPropertyAccessor {
		public AssigneeClassNameAccessor() {
			super(new Function<KaleoTaskAssignmentInstance, String>() {
					@Override
					public String apply(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance) {
						return kaleoTaskAssignmentInstance.getAssigneeClassName();
					}
				},
				new BiConsumer<KaleoTaskAssignmentInstance, String>() {
					@Override
					public void accept(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance,
						String assigneeClassName) {
						kaleoTaskAssignmentInstance.setAssigneeClassName(assigneeClassName);
					}
				});
		}
	}

	public static class AssigneeClassPKAccessor extends ModelPropertyAccessor {
		public AssigneeClassPKAccessor() {
			super(new Function<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance) {
						return kaleoTaskAssignmentInstance.getAssigneeClassPK();
					}
				},
				new BiConsumer<KaleoTaskAssignmentInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance,
						Long assigneeClassPK) {
						kaleoTaskAssignmentInstance.setAssigneeClassPK(assigneeClassPK);
					}
				});
		}
	}

	public static class CompletedAccessor extends ModelPropertyAccessor {
		public CompletedAccessor() {
			super(new Function<KaleoTaskAssignmentInstance, Boolean>() {
					@Override
					public Boolean apply(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance) {
						return kaleoTaskAssignmentInstance.getCompleted();
					}
				},
				new BiConsumer<KaleoTaskAssignmentInstance, Boolean>() {
					@Override
					public void accept(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance,
						Boolean completed) {
						kaleoTaskAssignmentInstance.setCompleted(completed);
					}
				});
		}
	}

	public static class CompletionDateAccessor extends ModelPropertyAccessor {
		public CompletionDateAccessor() {
			super(new Function<KaleoTaskAssignmentInstance, Date>() {
					@Override
					public Date apply(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance) {
						return kaleoTaskAssignmentInstance.getCompletionDate();
					}
				},
				new BiConsumer<KaleoTaskAssignmentInstance, Date>() {
					@Override
					public void accept(
						KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance,
						Date completionDate) {
						kaleoTaskAssignmentInstance.setCompletionDate(completionDate);
					}
				});
		}
	}

	private KaleoTaskAssignmentInstanceModelAccessors() {
	}
}