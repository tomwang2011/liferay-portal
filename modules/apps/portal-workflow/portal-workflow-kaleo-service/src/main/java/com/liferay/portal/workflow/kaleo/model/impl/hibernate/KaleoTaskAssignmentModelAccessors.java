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
import com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoTaskAssignmentModelAccessors {
	public static class KaleoTaskAssignmentIdAccessor
		extends ModelPropertyAccessor {
		public KaleoTaskAssignmentIdAccessor() {
			super(new Function<KaleoTaskAssignment, Long>() {
					@Override
					public Long apply(KaleoTaskAssignment kaleoTaskAssignment) {
						return kaleoTaskAssignment.getKaleoTaskAssignmentId();
					}
				},
				new BiConsumer<KaleoTaskAssignment, Long>() {
					@Override
					public void accept(
						KaleoTaskAssignment kaleoTaskAssignment,
						Long kaleoTaskAssignmentId) {
						kaleoTaskAssignment.setKaleoTaskAssignmentId(kaleoTaskAssignmentId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoTaskAssignment, Long>() {
					@Override
					public Long apply(KaleoTaskAssignment kaleoTaskAssignment) {
						return kaleoTaskAssignment.getGroupId();
					}
				},
				new BiConsumer<KaleoTaskAssignment, Long>() {
					@Override
					public void accept(
						KaleoTaskAssignment kaleoTaskAssignment, Long groupId) {
						kaleoTaskAssignment.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoTaskAssignment, Long>() {
					@Override
					public Long apply(KaleoTaskAssignment kaleoTaskAssignment) {
						return kaleoTaskAssignment.getCompanyId();
					}
				},
				new BiConsumer<KaleoTaskAssignment, Long>() {
					@Override
					public void accept(
						KaleoTaskAssignment kaleoTaskAssignment, Long companyId) {
						kaleoTaskAssignment.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoTaskAssignment, Long>() {
					@Override
					public Long apply(KaleoTaskAssignment kaleoTaskAssignment) {
						return kaleoTaskAssignment.getUserId();
					}
				},
				new BiConsumer<KaleoTaskAssignment, Long>() {
					@Override
					public void accept(
						KaleoTaskAssignment kaleoTaskAssignment, Long userId) {
						kaleoTaskAssignment.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoTaskAssignment, String>() {
					@Override
					public String apply(KaleoTaskAssignment kaleoTaskAssignment) {
						return kaleoTaskAssignment.getUserName();
					}
				},
				new BiConsumer<KaleoTaskAssignment, String>() {
					@Override
					public void accept(
						KaleoTaskAssignment kaleoTaskAssignment, String userName) {
						kaleoTaskAssignment.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoTaskAssignment, Date>() {
					@Override
					public Date apply(KaleoTaskAssignment kaleoTaskAssignment) {
						return kaleoTaskAssignment.getCreateDate();
					}
				},
				new BiConsumer<KaleoTaskAssignment, Date>() {
					@Override
					public void accept(
						KaleoTaskAssignment kaleoTaskAssignment, Date createDate) {
						kaleoTaskAssignment.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoTaskAssignment, Date>() {
					@Override
					public Date apply(KaleoTaskAssignment kaleoTaskAssignment) {
						return kaleoTaskAssignment.getModifiedDate();
					}
				},
				new BiConsumer<KaleoTaskAssignment, Date>() {
					@Override
					public void accept(
						KaleoTaskAssignment kaleoTaskAssignment,
						Date modifiedDate) {
						kaleoTaskAssignment.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class KaleoClassNameAccessor extends ModelPropertyAccessor {
		public KaleoClassNameAccessor() {
			super(new Function<KaleoTaskAssignment, String>() {
					@Override
					public String apply(KaleoTaskAssignment kaleoTaskAssignment) {
						return kaleoTaskAssignment.getKaleoClassName();
					}
				},
				new BiConsumer<KaleoTaskAssignment, String>() {
					@Override
					public void accept(
						KaleoTaskAssignment kaleoTaskAssignment,
						String kaleoClassName) {
						kaleoTaskAssignment.setKaleoClassName(kaleoClassName);
					}
				});
		}
	}

	public static class KaleoClassPKAccessor extends ModelPropertyAccessor {
		public KaleoClassPKAccessor() {
			super(new Function<KaleoTaskAssignment, Long>() {
					@Override
					public Long apply(KaleoTaskAssignment kaleoTaskAssignment) {
						return kaleoTaskAssignment.getKaleoClassPK();
					}
				},
				new BiConsumer<KaleoTaskAssignment, Long>() {
					@Override
					public void accept(
						KaleoTaskAssignment kaleoTaskAssignment,
						Long kaleoClassPK) {
						kaleoTaskAssignment.setKaleoClassPK(kaleoClassPK);
					}
				});
		}
	}

	public static class KaleoDefinitionVersionIdAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionIdAccessor() {
			super(new Function<KaleoTaskAssignment, Long>() {
					@Override
					public Long apply(KaleoTaskAssignment kaleoTaskAssignment) {
						return kaleoTaskAssignment.getKaleoDefinitionVersionId();
					}
				},
				new BiConsumer<KaleoTaskAssignment, Long>() {
					@Override
					public void accept(
						KaleoTaskAssignment kaleoTaskAssignment,
						Long kaleoDefinitionVersionId) {
						kaleoTaskAssignment.setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
					}
				});
		}
	}

	public static class KaleoNodeIdAccessor extends ModelPropertyAccessor {
		public KaleoNodeIdAccessor() {
			super(new Function<KaleoTaskAssignment, Long>() {
					@Override
					public Long apply(KaleoTaskAssignment kaleoTaskAssignment) {
						return kaleoTaskAssignment.getKaleoNodeId();
					}
				},
				new BiConsumer<KaleoTaskAssignment, Long>() {
					@Override
					public void accept(
						KaleoTaskAssignment kaleoTaskAssignment,
						Long kaleoNodeId) {
						kaleoTaskAssignment.setKaleoNodeId(kaleoNodeId);
					}
				});
		}
	}

	public static class AssigneeClassNameAccessor extends ModelPropertyAccessor {
		public AssigneeClassNameAccessor() {
			super(new Function<KaleoTaskAssignment, String>() {
					@Override
					public String apply(KaleoTaskAssignment kaleoTaskAssignment) {
						return kaleoTaskAssignment.getAssigneeClassName();
					}
				},
				new BiConsumer<KaleoTaskAssignment, String>() {
					@Override
					public void accept(
						KaleoTaskAssignment kaleoTaskAssignment,
						String assigneeClassName) {
						kaleoTaskAssignment.setAssigneeClassName(assigneeClassName);
					}
				});
		}
	}

	public static class AssigneeClassPKAccessor extends ModelPropertyAccessor {
		public AssigneeClassPKAccessor() {
			super(new Function<KaleoTaskAssignment, Long>() {
					@Override
					public Long apply(KaleoTaskAssignment kaleoTaskAssignment) {
						return kaleoTaskAssignment.getAssigneeClassPK();
					}
				},
				new BiConsumer<KaleoTaskAssignment, Long>() {
					@Override
					public void accept(
						KaleoTaskAssignment kaleoTaskAssignment,
						Long assigneeClassPK) {
						kaleoTaskAssignment.setAssigneeClassPK(assigneeClassPK);
					}
				});
		}
	}

	public static class AssigneeActionIdAccessor extends ModelPropertyAccessor {
		public AssigneeActionIdAccessor() {
			super(new Function<KaleoTaskAssignment, String>() {
					@Override
					public String apply(KaleoTaskAssignment kaleoTaskAssignment) {
						return kaleoTaskAssignment.getAssigneeActionId();
					}
				},
				new BiConsumer<KaleoTaskAssignment, String>() {
					@Override
					public void accept(
						KaleoTaskAssignment kaleoTaskAssignment,
						String assigneeActionId) {
						kaleoTaskAssignment.setAssigneeActionId(assigneeActionId);
					}
				});
		}
	}

	public static class AssigneeScriptAccessor extends ModelPropertyAccessor {
		public AssigneeScriptAccessor() {
			super(new Function<KaleoTaskAssignment, String>() {
					@Override
					public String apply(KaleoTaskAssignment kaleoTaskAssignment) {
						return kaleoTaskAssignment.getAssigneeScript();
					}
				},
				new BiConsumer<KaleoTaskAssignment, String>() {
					@Override
					public void accept(
						KaleoTaskAssignment kaleoTaskAssignment,
						String assigneeScript) {
						kaleoTaskAssignment.setAssigneeScript(assigneeScript);
					}
				});
		}
	}

	public static class AssigneeScriptLanguageAccessor
		extends ModelPropertyAccessor {
		public AssigneeScriptLanguageAccessor() {
			super(new Function<KaleoTaskAssignment, String>() {
					@Override
					public String apply(KaleoTaskAssignment kaleoTaskAssignment) {
						return kaleoTaskAssignment.getAssigneeScriptLanguage();
					}
				},
				new BiConsumer<KaleoTaskAssignment, String>() {
					@Override
					public void accept(
						KaleoTaskAssignment kaleoTaskAssignment,
						String assigneeScriptLanguage) {
						kaleoTaskAssignment.setAssigneeScriptLanguage(assigneeScriptLanguage);
					}
				});
		}
	}

	public static class AssigneeScriptRequiredContextsAccessor
		extends ModelPropertyAccessor {
		public AssigneeScriptRequiredContextsAccessor() {
			super(new Function<KaleoTaskAssignment, String>() {
					@Override
					public String apply(KaleoTaskAssignment kaleoTaskAssignment) {
						return kaleoTaskAssignment.getAssigneeScriptRequiredContexts();
					}
				},
				new BiConsumer<KaleoTaskAssignment, String>() {
					@Override
					public void accept(
						KaleoTaskAssignment kaleoTaskAssignment,
						String assigneeScriptRequiredContexts) {
						kaleoTaskAssignment.setAssigneeScriptRequiredContexts(assigneeScriptRequiredContexts);
					}
				});
		}
	}

	private KaleoTaskAssignmentModelAccessors() {
	}
}