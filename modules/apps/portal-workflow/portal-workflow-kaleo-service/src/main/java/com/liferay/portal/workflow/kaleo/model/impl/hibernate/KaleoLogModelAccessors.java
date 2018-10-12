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
import com.liferay.portal.workflow.kaleo.model.KaleoLog;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoLogModelAccessors {
	public static class KaleoLogIdAccessor extends ModelPropertyAccessor {
		public KaleoLogIdAccessor() {
			super(new Function<KaleoLog, Long>() {
					@Override
					public Long apply(KaleoLog kaleoLog) {
						return kaleoLog.getKaleoLogId();
					}
				},
				new BiConsumer<KaleoLog, Long>() {
					@Override
					public void accept(KaleoLog kaleoLog, Long kaleoLogId) {
						kaleoLog.setKaleoLogId(kaleoLogId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoLog, Long>() {
					@Override
					public Long apply(KaleoLog kaleoLog) {
						return kaleoLog.getGroupId();
					}
				},
				new BiConsumer<KaleoLog, Long>() {
					@Override
					public void accept(KaleoLog kaleoLog, Long groupId) {
						kaleoLog.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoLog, Long>() {
					@Override
					public Long apply(KaleoLog kaleoLog) {
						return kaleoLog.getCompanyId();
					}
				},
				new BiConsumer<KaleoLog, Long>() {
					@Override
					public void accept(KaleoLog kaleoLog, Long companyId) {
						kaleoLog.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoLog, Long>() {
					@Override
					public Long apply(KaleoLog kaleoLog) {
						return kaleoLog.getUserId();
					}
				},
				new BiConsumer<KaleoLog, Long>() {
					@Override
					public void accept(KaleoLog kaleoLog, Long userId) {
						kaleoLog.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoLog, String>() {
					@Override
					public String apply(KaleoLog kaleoLog) {
						return kaleoLog.getUserName();
					}
				},
				new BiConsumer<KaleoLog, String>() {
					@Override
					public void accept(KaleoLog kaleoLog, String userName) {
						kaleoLog.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoLog, Date>() {
					@Override
					public Date apply(KaleoLog kaleoLog) {
						return kaleoLog.getCreateDate();
					}
				},
				new BiConsumer<KaleoLog, Date>() {
					@Override
					public void accept(KaleoLog kaleoLog, Date createDate) {
						kaleoLog.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoLog, Date>() {
					@Override
					public Date apply(KaleoLog kaleoLog) {
						return kaleoLog.getModifiedDate();
					}
				},
				new BiConsumer<KaleoLog, Date>() {
					@Override
					public void accept(KaleoLog kaleoLog, Date modifiedDate) {
						kaleoLog.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class KaleoClassNameAccessor extends ModelPropertyAccessor {
		public KaleoClassNameAccessor() {
			super(new Function<KaleoLog, String>() {
					@Override
					public String apply(KaleoLog kaleoLog) {
						return kaleoLog.getKaleoClassName();
					}
				},
				new BiConsumer<KaleoLog, String>() {
					@Override
					public void accept(KaleoLog kaleoLog, String kaleoClassName) {
						kaleoLog.setKaleoClassName(kaleoClassName);
					}
				});
		}
	}

	public static class KaleoClassPKAccessor extends ModelPropertyAccessor {
		public KaleoClassPKAccessor() {
			super(new Function<KaleoLog, Long>() {
					@Override
					public Long apply(KaleoLog kaleoLog) {
						return kaleoLog.getKaleoClassPK();
					}
				},
				new BiConsumer<KaleoLog, Long>() {
					@Override
					public void accept(KaleoLog kaleoLog, Long kaleoClassPK) {
						kaleoLog.setKaleoClassPK(kaleoClassPK);
					}
				});
		}
	}

	public static class KaleoDefinitionVersionIdAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionIdAccessor() {
			super(new Function<KaleoLog, Long>() {
					@Override
					public Long apply(KaleoLog kaleoLog) {
						return kaleoLog.getKaleoDefinitionVersionId();
					}
				},
				new BiConsumer<KaleoLog, Long>() {
					@Override
					public void accept(KaleoLog kaleoLog,
						Long kaleoDefinitionVersionId) {
						kaleoLog.setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
					}
				});
		}
	}

	public static class KaleoInstanceIdAccessor extends ModelPropertyAccessor {
		public KaleoInstanceIdAccessor() {
			super(new Function<KaleoLog, Long>() {
					@Override
					public Long apply(KaleoLog kaleoLog) {
						return kaleoLog.getKaleoInstanceId();
					}
				},
				new BiConsumer<KaleoLog, Long>() {
					@Override
					public void accept(KaleoLog kaleoLog, Long kaleoInstanceId) {
						kaleoLog.setKaleoInstanceId(kaleoInstanceId);
					}
				});
		}
	}

	public static class KaleoInstanceTokenIdAccessor
		extends ModelPropertyAccessor {
		public KaleoInstanceTokenIdAccessor() {
			super(new Function<KaleoLog, Long>() {
					@Override
					public Long apply(KaleoLog kaleoLog) {
						return kaleoLog.getKaleoInstanceTokenId();
					}
				},
				new BiConsumer<KaleoLog, Long>() {
					@Override
					public void accept(KaleoLog kaleoLog,
						Long kaleoInstanceTokenId) {
						kaleoLog.setKaleoInstanceTokenId(kaleoInstanceTokenId);
					}
				});
		}
	}

	public static class KaleoTaskInstanceTokenIdAccessor
		extends ModelPropertyAccessor {
		public KaleoTaskInstanceTokenIdAccessor() {
			super(new Function<KaleoLog, Long>() {
					@Override
					public Long apply(KaleoLog kaleoLog) {
						return kaleoLog.getKaleoTaskInstanceTokenId();
					}
				},
				new BiConsumer<KaleoLog, Long>() {
					@Override
					public void accept(KaleoLog kaleoLog,
						Long kaleoTaskInstanceTokenId) {
						kaleoLog.setKaleoTaskInstanceTokenId(kaleoTaskInstanceTokenId);
					}
				});
		}
	}

	public static class KaleoNodeNameAccessor extends ModelPropertyAccessor {
		public KaleoNodeNameAccessor() {
			super(new Function<KaleoLog, String>() {
					@Override
					public String apply(KaleoLog kaleoLog) {
						return kaleoLog.getKaleoNodeName();
					}
				},
				new BiConsumer<KaleoLog, String>() {
					@Override
					public void accept(KaleoLog kaleoLog, String kaleoNodeName) {
						kaleoLog.setKaleoNodeName(kaleoNodeName);
					}
				});
		}
	}

	public static class TerminalKaleoNodeAccessor extends ModelPropertyAccessor {
		public TerminalKaleoNodeAccessor() {
			super(new Function<KaleoLog, Boolean>() {
					@Override
					public Boolean apply(KaleoLog kaleoLog) {
						return kaleoLog.getTerminalKaleoNode();
					}
				},
				new BiConsumer<KaleoLog, Boolean>() {
					@Override
					public void accept(KaleoLog kaleoLog,
						Boolean terminalKaleoNode) {
						kaleoLog.setTerminalKaleoNode(terminalKaleoNode);
					}
				});
		}
	}

	public static class KaleoActionIdAccessor extends ModelPropertyAccessor {
		public KaleoActionIdAccessor() {
			super(new Function<KaleoLog, Long>() {
					@Override
					public Long apply(KaleoLog kaleoLog) {
						return kaleoLog.getKaleoActionId();
					}
				},
				new BiConsumer<KaleoLog, Long>() {
					@Override
					public void accept(KaleoLog kaleoLog, Long kaleoActionId) {
						kaleoLog.setKaleoActionId(kaleoActionId);
					}
				});
		}
	}

	public static class KaleoActionNameAccessor extends ModelPropertyAccessor {
		public KaleoActionNameAccessor() {
			super(new Function<KaleoLog, String>() {
					@Override
					public String apply(KaleoLog kaleoLog) {
						return kaleoLog.getKaleoActionName();
					}
				},
				new BiConsumer<KaleoLog, String>() {
					@Override
					public void accept(KaleoLog kaleoLog, String kaleoActionName) {
						kaleoLog.setKaleoActionName(kaleoActionName);
					}
				});
		}
	}

	public static class KaleoActionDescriptionAccessor
		extends ModelPropertyAccessor {
		public KaleoActionDescriptionAccessor() {
			super(new Function<KaleoLog, String>() {
					@Override
					public String apply(KaleoLog kaleoLog) {
						return kaleoLog.getKaleoActionDescription();
					}
				},
				new BiConsumer<KaleoLog, String>() {
					@Override
					public void accept(KaleoLog kaleoLog,
						String kaleoActionDescription) {
						kaleoLog.setKaleoActionDescription(kaleoActionDescription);
					}
				});
		}
	}

	public static class PreviousKaleoNodeIdAccessor
		extends ModelPropertyAccessor {
		public PreviousKaleoNodeIdAccessor() {
			super(new Function<KaleoLog, Long>() {
					@Override
					public Long apply(KaleoLog kaleoLog) {
						return kaleoLog.getPreviousKaleoNodeId();
					}
				},
				new BiConsumer<KaleoLog, Long>() {
					@Override
					public void accept(KaleoLog kaleoLog,
						Long previousKaleoNodeId) {
						kaleoLog.setPreviousKaleoNodeId(previousKaleoNodeId);
					}
				});
		}
	}

	public static class PreviousKaleoNodeNameAccessor
		extends ModelPropertyAccessor {
		public PreviousKaleoNodeNameAccessor() {
			super(new Function<KaleoLog, String>() {
					@Override
					public String apply(KaleoLog kaleoLog) {
						return kaleoLog.getPreviousKaleoNodeName();
					}
				},
				new BiConsumer<KaleoLog, String>() {
					@Override
					public void accept(KaleoLog kaleoLog,
						String previousKaleoNodeName) {
						kaleoLog.setPreviousKaleoNodeName(previousKaleoNodeName);
					}
				});
		}
	}

	public static class PreviousAssigneeClassNameAccessor
		extends ModelPropertyAccessor {
		public PreviousAssigneeClassNameAccessor() {
			super(new Function<KaleoLog, String>() {
					@Override
					public String apply(KaleoLog kaleoLog) {
						return kaleoLog.getPreviousAssigneeClassName();
					}
				},
				new BiConsumer<KaleoLog, String>() {
					@Override
					public void accept(KaleoLog kaleoLog,
						String previousAssigneeClassName) {
						kaleoLog.setPreviousAssigneeClassName(previousAssigneeClassName);
					}
				});
		}
	}

	public static class PreviousAssigneeClassPKAccessor
		extends ModelPropertyAccessor {
		public PreviousAssigneeClassPKAccessor() {
			super(new Function<KaleoLog, Long>() {
					@Override
					public Long apply(KaleoLog kaleoLog) {
						return kaleoLog.getPreviousAssigneeClassPK();
					}
				},
				new BiConsumer<KaleoLog, Long>() {
					@Override
					public void accept(KaleoLog kaleoLog,
						Long previousAssigneeClassPK) {
						kaleoLog.setPreviousAssigneeClassPK(previousAssigneeClassPK);
					}
				});
		}
	}

	public static class CurrentAssigneeClassNameAccessor
		extends ModelPropertyAccessor {
		public CurrentAssigneeClassNameAccessor() {
			super(new Function<KaleoLog, String>() {
					@Override
					public String apply(KaleoLog kaleoLog) {
						return kaleoLog.getCurrentAssigneeClassName();
					}
				},
				new BiConsumer<KaleoLog, String>() {
					@Override
					public void accept(KaleoLog kaleoLog,
						String currentAssigneeClassName) {
						kaleoLog.setCurrentAssigneeClassName(currentAssigneeClassName);
					}
				});
		}
	}

	public static class CurrentAssigneeClassPKAccessor
		extends ModelPropertyAccessor {
		public CurrentAssigneeClassPKAccessor() {
			super(new Function<KaleoLog, Long>() {
					@Override
					public Long apply(KaleoLog kaleoLog) {
						return kaleoLog.getCurrentAssigneeClassPK();
					}
				},
				new BiConsumer<KaleoLog, Long>() {
					@Override
					public void accept(KaleoLog kaleoLog,
						Long currentAssigneeClassPK) {
						kaleoLog.setCurrentAssigneeClassPK(currentAssigneeClassPK);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<KaleoLog, String>() {
					@Override
					public String apply(KaleoLog kaleoLog) {
						return kaleoLog.getType();
					}
				},
				new BiConsumer<KaleoLog, String>() {
					@Override
					public void accept(KaleoLog kaleoLog, String type) {
						kaleoLog.setType(type);
					}
				});
		}
	}

	public static class CommentAccessor extends ModelPropertyAccessor {
		public CommentAccessor() {
			super(new Function<KaleoLog, String>() {
					@Override
					public String apply(KaleoLog kaleoLog) {
						return kaleoLog.getComment();
					}
				},
				new BiConsumer<KaleoLog, String>() {
					@Override
					public void accept(KaleoLog kaleoLog, String comment) {
						kaleoLog.setComment(comment);
					}
				});
		}
	}

	public static class StartDateAccessor extends ModelPropertyAccessor {
		public StartDateAccessor() {
			super(new Function<KaleoLog, Date>() {
					@Override
					public Date apply(KaleoLog kaleoLog) {
						return kaleoLog.getStartDate();
					}
				},
				new BiConsumer<KaleoLog, Date>() {
					@Override
					public void accept(KaleoLog kaleoLog, Date startDate) {
						kaleoLog.setStartDate(startDate);
					}
				});
		}
	}

	public static class EndDateAccessor extends ModelPropertyAccessor {
		public EndDateAccessor() {
			super(new Function<KaleoLog, Date>() {
					@Override
					public Date apply(KaleoLog kaleoLog) {
						return kaleoLog.getEndDate();
					}
				},
				new BiConsumer<KaleoLog, Date>() {
					@Override
					public void accept(KaleoLog kaleoLog, Date endDate) {
						kaleoLog.setEndDate(endDate);
					}
				});
		}
	}

	public static class DurationAccessor extends ModelPropertyAccessor {
		public DurationAccessor() {
			super(new Function<KaleoLog, Long>() {
					@Override
					public Long apply(KaleoLog kaleoLog) {
						return kaleoLog.getDuration();
					}
				},
				new BiConsumer<KaleoLog, Long>() {
					@Override
					public void accept(KaleoLog kaleoLog, Long duration) {
						kaleoLog.setDuration(duration);
					}
				});
		}
	}

	public static class WorkflowContextAccessor extends ModelPropertyAccessor {
		public WorkflowContextAccessor() {
			super(new Function<KaleoLog, String>() {
					@Override
					public String apply(KaleoLog kaleoLog) {
						return kaleoLog.getWorkflowContext();
					}
				},
				new BiConsumer<KaleoLog, String>() {
					@Override
					public void accept(KaleoLog kaleoLog, String workflowContext) {
						kaleoLog.setWorkflowContext(workflowContext);
					}
				});
		}
	}

	private KaleoLogModelAccessors() {
	}
}