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
import com.liferay.portal.kernel.model.WorkflowDefinitionLink;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WorkflowDefinitionLinkModelAccessors {
	public static class WorkflowDefinitionLinkIdAccessor
		extends ModelPropertyAccessor {
		public WorkflowDefinitionLinkIdAccessor() {
			super(new Function<WorkflowDefinitionLink, Long>() {
					@Override
					public Long apply(
						WorkflowDefinitionLink workflowDefinitionLink) {
						return workflowDefinitionLink.getWorkflowDefinitionLinkId();
					}
				},
				new BiConsumer<WorkflowDefinitionLink, Long>() {
					@Override
					public void accept(
						WorkflowDefinitionLink workflowDefinitionLink,
						Long workflowDefinitionLinkId) {
						workflowDefinitionLink.setWorkflowDefinitionLinkId(workflowDefinitionLinkId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<WorkflowDefinitionLink, Long>() {
					@Override
					public Long apply(
						WorkflowDefinitionLink workflowDefinitionLink) {
						return workflowDefinitionLink.getGroupId();
					}
				},
				new BiConsumer<WorkflowDefinitionLink, Long>() {
					@Override
					public void accept(
						WorkflowDefinitionLink workflowDefinitionLink,
						Long groupId) {
						workflowDefinitionLink.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<WorkflowDefinitionLink, Long>() {
					@Override
					public Long apply(
						WorkflowDefinitionLink workflowDefinitionLink) {
						return workflowDefinitionLink.getCompanyId();
					}
				},
				new BiConsumer<WorkflowDefinitionLink, Long>() {
					@Override
					public void accept(
						WorkflowDefinitionLink workflowDefinitionLink,
						Long companyId) {
						workflowDefinitionLink.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<WorkflowDefinitionLink, Long>() {
					@Override
					public Long apply(
						WorkflowDefinitionLink workflowDefinitionLink) {
						return workflowDefinitionLink.getUserId();
					}
				},
				new BiConsumer<WorkflowDefinitionLink, Long>() {
					@Override
					public void accept(
						WorkflowDefinitionLink workflowDefinitionLink,
						Long userId) {
						workflowDefinitionLink.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<WorkflowDefinitionLink, String>() {
					@Override
					public String apply(
						WorkflowDefinitionLink workflowDefinitionLink) {
						return workflowDefinitionLink.getUserName();
					}
				},
				new BiConsumer<WorkflowDefinitionLink, String>() {
					@Override
					public void accept(
						WorkflowDefinitionLink workflowDefinitionLink,
						String userName) {
						workflowDefinitionLink.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<WorkflowDefinitionLink, Date>() {
					@Override
					public Date apply(
						WorkflowDefinitionLink workflowDefinitionLink) {
						return workflowDefinitionLink.getCreateDate();
					}
				},
				new BiConsumer<WorkflowDefinitionLink, Date>() {
					@Override
					public void accept(
						WorkflowDefinitionLink workflowDefinitionLink,
						Date createDate) {
						workflowDefinitionLink.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<WorkflowDefinitionLink, Date>() {
					@Override
					public Date apply(
						WorkflowDefinitionLink workflowDefinitionLink) {
						return workflowDefinitionLink.getModifiedDate();
					}
				},
				new BiConsumer<WorkflowDefinitionLink, Date>() {
					@Override
					public void accept(
						WorkflowDefinitionLink workflowDefinitionLink,
						Date modifiedDate) {
						workflowDefinitionLink.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<WorkflowDefinitionLink, Long>() {
					@Override
					public Long apply(
						WorkflowDefinitionLink workflowDefinitionLink) {
						return workflowDefinitionLink.getClassNameId();
					}
				},
				new BiConsumer<WorkflowDefinitionLink, Long>() {
					@Override
					public void accept(
						WorkflowDefinitionLink workflowDefinitionLink,
						Long classNameId) {
						workflowDefinitionLink.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<WorkflowDefinitionLink, Long>() {
					@Override
					public Long apply(
						WorkflowDefinitionLink workflowDefinitionLink) {
						return workflowDefinitionLink.getClassPK();
					}
				},
				new BiConsumer<WorkflowDefinitionLink, Long>() {
					@Override
					public void accept(
						WorkflowDefinitionLink workflowDefinitionLink,
						Long classPK) {
						workflowDefinitionLink.setClassPK(classPK);
					}
				});
		}
	}

	public static class TypePKAccessor extends ModelPropertyAccessor {
		public TypePKAccessor() {
			super(new Function<WorkflowDefinitionLink, Long>() {
					@Override
					public Long apply(
						WorkflowDefinitionLink workflowDefinitionLink) {
						return workflowDefinitionLink.getTypePK();
					}
				},
				new BiConsumer<WorkflowDefinitionLink, Long>() {
					@Override
					public void accept(
						WorkflowDefinitionLink workflowDefinitionLink,
						Long typePK) {
						workflowDefinitionLink.setTypePK(typePK);
					}
				});
		}
	}

	public static class WorkflowDefinitionNameAccessor
		extends ModelPropertyAccessor {
		public WorkflowDefinitionNameAccessor() {
			super(new Function<WorkflowDefinitionLink, String>() {
					@Override
					public String apply(
						WorkflowDefinitionLink workflowDefinitionLink) {
						return workflowDefinitionLink.getWorkflowDefinitionName();
					}
				},
				new BiConsumer<WorkflowDefinitionLink, String>() {
					@Override
					public void accept(
						WorkflowDefinitionLink workflowDefinitionLink,
						String workflowDefinitionName) {
						workflowDefinitionLink.setWorkflowDefinitionName(workflowDefinitionName);
					}
				});
		}
	}

	public static class WorkflowDefinitionVersionAccessor
		extends ModelPropertyAccessor {
		public WorkflowDefinitionVersionAccessor() {
			super(new Function<WorkflowDefinitionLink, Integer>() {
					@Override
					public Integer apply(
						WorkflowDefinitionLink workflowDefinitionLink) {
						return workflowDefinitionLink.getWorkflowDefinitionVersion();
					}
				},
				new BiConsumer<WorkflowDefinitionLink, Integer>() {
					@Override
					public void accept(
						WorkflowDefinitionLink workflowDefinitionLink,
						Integer workflowDefinitionVersion) {
						workflowDefinitionLink.setWorkflowDefinitionVersion(workflowDefinitionVersion);
					}
				});
		}
	}

	private WorkflowDefinitionLinkModelAccessors() {
	}
}