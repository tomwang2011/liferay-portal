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
import com.liferay.portal.kernel.model.WorkflowInstanceLink;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WorkflowInstanceLinkModelAccessors {
	public static class WorkflowInstanceLinkIdAccessor
		extends ModelPropertyAccessor {
		public WorkflowInstanceLinkIdAccessor() {
			super(new Function<WorkflowInstanceLink, Long>() {
					@Override
					public Long apply(WorkflowInstanceLink workflowInstanceLink) {
						return workflowInstanceLink.getWorkflowInstanceLinkId();
					}
				},
				new BiConsumer<WorkflowInstanceLink, Long>() {
					@Override
					public void accept(
						WorkflowInstanceLink workflowInstanceLink,
						Long workflowInstanceLinkId) {
						workflowInstanceLink.setWorkflowInstanceLinkId(workflowInstanceLinkId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<WorkflowInstanceLink, Long>() {
					@Override
					public Long apply(WorkflowInstanceLink workflowInstanceLink) {
						return workflowInstanceLink.getGroupId();
					}
				},
				new BiConsumer<WorkflowInstanceLink, Long>() {
					@Override
					public void accept(
						WorkflowInstanceLink workflowInstanceLink, Long groupId) {
						workflowInstanceLink.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<WorkflowInstanceLink, Long>() {
					@Override
					public Long apply(WorkflowInstanceLink workflowInstanceLink) {
						return workflowInstanceLink.getCompanyId();
					}
				},
				new BiConsumer<WorkflowInstanceLink, Long>() {
					@Override
					public void accept(
						WorkflowInstanceLink workflowInstanceLink,
						Long companyId) {
						workflowInstanceLink.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<WorkflowInstanceLink, Long>() {
					@Override
					public Long apply(WorkflowInstanceLink workflowInstanceLink) {
						return workflowInstanceLink.getUserId();
					}
				},
				new BiConsumer<WorkflowInstanceLink, Long>() {
					@Override
					public void accept(
						WorkflowInstanceLink workflowInstanceLink, Long userId) {
						workflowInstanceLink.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<WorkflowInstanceLink, String>() {
					@Override
					public String apply(
						WorkflowInstanceLink workflowInstanceLink) {
						return workflowInstanceLink.getUserName();
					}
				},
				new BiConsumer<WorkflowInstanceLink, String>() {
					@Override
					public void accept(
						WorkflowInstanceLink workflowInstanceLink,
						String userName) {
						workflowInstanceLink.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<WorkflowInstanceLink, Date>() {
					@Override
					public Date apply(WorkflowInstanceLink workflowInstanceLink) {
						return workflowInstanceLink.getCreateDate();
					}
				},
				new BiConsumer<WorkflowInstanceLink, Date>() {
					@Override
					public void accept(
						WorkflowInstanceLink workflowInstanceLink,
						Date createDate) {
						workflowInstanceLink.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<WorkflowInstanceLink, Date>() {
					@Override
					public Date apply(WorkflowInstanceLink workflowInstanceLink) {
						return workflowInstanceLink.getModifiedDate();
					}
				},
				new BiConsumer<WorkflowInstanceLink, Date>() {
					@Override
					public void accept(
						WorkflowInstanceLink workflowInstanceLink,
						Date modifiedDate) {
						workflowInstanceLink.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<WorkflowInstanceLink, Long>() {
					@Override
					public Long apply(WorkflowInstanceLink workflowInstanceLink) {
						return workflowInstanceLink.getClassNameId();
					}
				},
				new BiConsumer<WorkflowInstanceLink, Long>() {
					@Override
					public void accept(
						WorkflowInstanceLink workflowInstanceLink,
						Long classNameId) {
						workflowInstanceLink.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<WorkflowInstanceLink, Long>() {
					@Override
					public Long apply(WorkflowInstanceLink workflowInstanceLink) {
						return workflowInstanceLink.getClassPK();
					}
				},
				new BiConsumer<WorkflowInstanceLink, Long>() {
					@Override
					public void accept(
						WorkflowInstanceLink workflowInstanceLink, Long classPK) {
						workflowInstanceLink.setClassPK(classPK);
					}
				});
		}
	}

	public static class WorkflowInstanceIdAccessor extends ModelPropertyAccessor {
		public WorkflowInstanceIdAccessor() {
			super(new Function<WorkflowInstanceLink, Long>() {
					@Override
					public Long apply(WorkflowInstanceLink workflowInstanceLink) {
						return workflowInstanceLink.getWorkflowInstanceId();
					}
				},
				new BiConsumer<WorkflowInstanceLink, Long>() {
					@Override
					public void accept(
						WorkflowInstanceLink workflowInstanceLink,
						Long workflowInstanceId) {
						workflowInstanceLink.setWorkflowInstanceId(workflowInstanceId);
					}
				});
		}
	}

	private WorkflowInstanceLinkModelAccessors() {
	}
}