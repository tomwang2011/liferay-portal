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
import com.liferay.portal.workflow.kaleo.model.KaleoInstance;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoInstanceModelAccessors {
	public static class KaleoInstanceIdAccessor extends ModelPropertyAccessor {
		public KaleoInstanceIdAccessor() {
			super(new Function<KaleoInstance, Long>() {
					@Override
					public Long apply(KaleoInstance kaleoInstance) {
						return kaleoInstance.getKaleoInstanceId();
					}
				},
				new BiConsumer<KaleoInstance, Long>() {
					@Override
					public void accept(KaleoInstance kaleoInstance,
						Long kaleoInstanceId) {
						kaleoInstance.setKaleoInstanceId(kaleoInstanceId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoInstance, Long>() {
					@Override
					public Long apply(KaleoInstance kaleoInstance) {
						return kaleoInstance.getGroupId();
					}
				},
				new BiConsumer<KaleoInstance, Long>() {
					@Override
					public void accept(KaleoInstance kaleoInstance, Long groupId) {
						kaleoInstance.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoInstance, Long>() {
					@Override
					public Long apply(KaleoInstance kaleoInstance) {
						return kaleoInstance.getCompanyId();
					}
				},
				new BiConsumer<KaleoInstance, Long>() {
					@Override
					public void accept(KaleoInstance kaleoInstance,
						Long companyId) {
						kaleoInstance.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoInstance, Long>() {
					@Override
					public Long apply(KaleoInstance kaleoInstance) {
						return kaleoInstance.getUserId();
					}
				},
				new BiConsumer<KaleoInstance, Long>() {
					@Override
					public void accept(KaleoInstance kaleoInstance, Long userId) {
						kaleoInstance.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoInstance, String>() {
					@Override
					public String apply(KaleoInstance kaleoInstance) {
						return kaleoInstance.getUserName();
					}
				},
				new BiConsumer<KaleoInstance, String>() {
					@Override
					public void accept(KaleoInstance kaleoInstance,
						String userName) {
						kaleoInstance.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoInstance, Date>() {
					@Override
					public Date apply(KaleoInstance kaleoInstance) {
						return kaleoInstance.getCreateDate();
					}
				},
				new BiConsumer<KaleoInstance, Date>() {
					@Override
					public void accept(KaleoInstance kaleoInstance,
						Date createDate) {
						kaleoInstance.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoInstance, Date>() {
					@Override
					public Date apply(KaleoInstance kaleoInstance) {
						return kaleoInstance.getModifiedDate();
					}
				},
				new BiConsumer<KaleoInstance, Date>() {
					@Override
					public void accept(KaleoInstance kaleoInstance,
						Date modifiedDate) {
						kaleoInstance.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class KaleoDefinitionVersionIdAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionIdAccessor() {
			super(new Function<KaleoInstance, Long>() {
					@Override
					public Long apply(KaleoInstance kaleoInstance) {
						return kaleoInstance.getKaleoDefinitionVersionId();
					}
				},
				new BiConsumer<KaleoInstance, Long>() {
					@Override
					public void accept(KaleoInstance kaleoInstance,
						Long kaleoDefinitionVersionId) {
						kaleoInstance.setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
					}
				});
		}
	}

	public static class KaleoDefinitionNameAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionNameAccessor() {
			super(new Function<KaleoInstance, String>() {
					@Override
					public String apply(KaleoInstance kaleoInstance) {
						return kaleoInstance.getKaleoDefinitionName();
					}
				},
				new BiConsumer<KaleoInstance, String>() {
					@Override
					public void accept(KaleoInstance kaleoInstance,
						String kaleoDefinitionName) {
						kaleoInstance.setKaleoDefinitionName(kaleoDefinitionName);
					}
				});
		}
	}

	public static class KaleoDefinitionVersionAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionAccessor() {
			super(new Function<KaleoInstance, Integer>() {
					@Override
					public Integer apply(KaleoInstance kaleoInstance) {
						return kaleoInstance.getKaleoDefinitionVersion();
					}
				},
				new BiConsumer<KaleoInstance, Integer>() {
					@Override
					public void accept(KaleoInstance kaleoInstance,
						Integer kaleoDefinitionVersion) {
						kaleoInstance.setKaleoDefinitionVersion(kaleoDefinitionVersion);
					}
				});
		}
	}

	public static class RootKaleoInstanceTokenIdAccessor
		extends ModelPropertyAccessor {
		public RootKaleoInstanceTokenIdAccessor() {
			super(new Function<KaleoInstance, Long>() {
					@Override
					public Long apply(KaleoInstance kaleoInstance) {
						return kaleoInstance.getRootKaleoInstanceTokenId();
					}
				},
				new BiConsumer<KaleoInstance, Long>() {
					@Override
					public void accept(KaleoInstance kaleoInstance,
						Long rootKaleoInstanceTokenId) {
						kaleoInstance.setRootKaleoInstanceTokenId(rootKaleoInstanceTokenId);
					}
				});
		}
	}

	public static class ClassNameAccessor extends ModelPropertyAccessor {
		public ClassNameAccessor() {
			super(new Function<KaleoInstance, String>() {
					@Override
					public String apply(KaleoInstance kaleoInstance) {
						return kaleoInstance.getClassName();
					}
				},
				new BiConsumer<KaleoInstance, String>() {
					@Override
					public void accept(KaleoInstance kaleoInstance,
						String className) {
						kaleoInstance.setClassName(className);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<KaleoInstance, Long>() {
					@Override
					public Long apply(KaleoInstance kaleoInstance) {
						return kaleoInstance.getClassPK();
					}
				},
				new BiConsumer<KaleoInstance, Long>() {
					@Override
					public void accept(KaleoInstance kaleoInstance, Long classPK) {
						kaleoInstance.setClassPK(classPK);
					}
				});
		}
	}

	public static class CompletedAccessor extends ModelPropertyAccessor {
		public CompletedAccessor() {
			super(new Function<KaleoInstance, Boolean>() {
					@Override
					public Boolean apply(KaleoInstance kaleoInstance) {
						return kaleoInstance.getCompleted();
					}
				},
				new BiConsumer<KaleoInstance, Boolean>() {
					@Override
					public void accept(KaleoInstance kaleoInstance,
						Boolean completed) {
						kaleoInstance.setCompleted(completed);
					}
				});
		}
	}

	public static class CompletionDateAccessor extends ModelPropertyAccessor {
		public CompletionDateAccessor() {
			super(new Function<KaleoInstance, Date>() {
					@Override
					public Date apply(KaleoInstance kaleoInstance) {
						return kaleoInstance.getCompletionDate();
					}
				},
				new BiConsumer<KaleoInstance, Date>() {
					@Override
					public void accept(KaleoInstance kaleoInstance,
						Date completionDate) {
						kaleoInstance.setCompletionDate(completionDate);
					}
				});
		}
	}

	public static class WorkflowContextAccessor extends ModelPropertyAccessor {
		public WorkflowContextAccessor() {
			super(new Function<KaleoInstance, String>() {
					@Override
					public String apply(KaleoInstance kaleoInstance) {
						return kaleoInstance.getWorkflowContext();
					}
				},
				new BiConsumer<KaleoInstance, String>() {
					@Override
					public void accept(KaleoInstance kaleoInstance,
						String workflowContext) {
						kaleoInstance.setWorkflowContext(workflowContext);
					}
				});
		}
	}

	private KaleoInstanceModelAccessors() {
	}
}