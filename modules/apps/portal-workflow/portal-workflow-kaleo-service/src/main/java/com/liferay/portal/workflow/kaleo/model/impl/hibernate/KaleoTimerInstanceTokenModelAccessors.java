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
import com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoTimerInstanceTokenModelAccessors {
	public static class KaleoTimerInstanceTokenIdAccessor
		extends ModelPropertyAccessor {
		public KaleoTimerInstanceTokenIdAccessor() {
			super(new Function<KaleoTimerInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getKaleoTimerInstanceTokenId();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						Long kaleoTimerInstanceTokenId) {
						kaleoTimerInstanceToken.setKaleoTimerInstanceTokenId(kaleoTimerInstanceTokenId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoTimerInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getGroupId();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						Long groupId) {
						kaleoTimerInstanceToken.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoTimerInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getCompanyId();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						Long companyId) {
						kaleoTimerInstanceToken.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoTimerInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getUserId();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						Long userId) {
						kaleoTimerInstanceToken.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoTimerInstanceToken, String>() {
					@Override
					public String apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getUserName();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, String>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						String userName) {
						kaleoTimerInstanceToken.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoTimerInstanceToken, Date>() {
					@Override
					public Date apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getCreateDate();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, Date>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						Date createDate) {
						kaleoTimerInstanceToken.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoTimerInstanceToken, Date>() {
					@Override
					public Date apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getModifiedDate();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, Date>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						Date modifiedDate) {
						kaleoTimerInstanceToken.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class KaleoClassNameAccessor extends ModelPropertyAccessor {
		public KaleoClassNameAccessor() {
			super(new Function<KaleoTimerInstanceToken, String>() {
					@Override
					public String apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getKaleoClassName();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, String>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						String kaleoClassName) {
						kaleoTimerInstanceToken.setKaleoClassName(kaleoClassName);
					}
				});
		}
	}

	public static class KaleoClassPKAccessor extends ModelPropertyAccessor {
		public KaleoClassPKAccessor() {
			super(new Function<KaleoTimerInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getKaleoClassPK();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						Long kaleoClassPK) {
						kaleoTimerInstanceToken.setKaleoClassPK(kaleoClassPK);
					}
				});
		}
	}

	public static class KaleoDefinitionVersionIdAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionIdAccessor() {
			super(new Function<KaleoTimerInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getKaleoDefinitionVersionId();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						Long kaleoDefinitionVersionId) {
						kaleoTimerInstanceToken.setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
					}
				});
		}
	}

	public static class KaleoInstanceIdAccessor extends ModelPropertyAccessor {
		public KaleoInstanceIdAccessor() {
			super(new Function<KaleoTimerInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getKaleoInstanceId();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						Long kaleoInstanceId) {
						kaleoTimerInstanceToken.setKaleoInstanceId(kaleoInstanceId);
					}
				});
		}
	}

	public static class KaleoInstanceTokenIdAccessor
		extends ModelPropertyAccessor {
		public KaleoInstanceTokenIdAccessor() {
			super(new Function<KaleoTimerInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getKaleoInstanceTokenId();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						Long kaleoInstanceTokenId) {
						kaleoTimerInstanceToken.setKaleoInstanceTokenId(kaleoInstanceTokenId);
					}
				});
		}
	}

	public static class KaleoTaskInstanceTokenIdAccessor
		extends ModelPropertyAccessor {
		public KaleoTaskInstanceTokenIdAccessor() {
			super(new Function<KaleoTimerInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getKaleoTaskInstanceTokenId();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						Long kaleoTaskInstanceTokenId) {
						kaleoTimerInstanceToken.setKaleoTaskInstanceTokenId(kaleoTaskInstanceTokenId);
					}
				});
		}
	}

	public static class KaleoTimerIdAccessor extends ModelPropertyAccessor {
		public KaleoTimerIdAccessor() {
			super(new Function<KaleoTimerInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getKaleoTimerId();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						Long kaleoTimerId) {
						kaleoTimerInstanceToken.setKaleoTimerId(kaleoTimerId);
					}
				});
		}
	}

	public static class KaleoTimerNameAccessor extends ModelPropertyAccessor {
		public KaleoTimerNameAccessor() {
			super(new Function<KaleoTimerInstanceToken, String>() {
					@Override
					public String apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getKaleoTimerName();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, String>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						String kaleoTimerName) {
						kaleoTimerInstanceToken.setKaleoTimerName(kaleoTimerName);
					}
				});
		}
	}

	public static class BlockingAccessor extends ModelPropertyAccessor {
		public BlockingAccessor() {
			super(new Function<KaleoTimerInstanceToken, Boolean>() {
					@Override
					public Boolean apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getBlocking();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, Boolean>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						Boolean blocking) {
						kaleoTimerInstanceToken.setBlocking(blocking);
					}
				});
		}
	}

	public static class CompletionUserIdAccessor extends ModelPropertyAccessor {
		public CompletionUserIdAccessor() {
			super(new Function<KaleoTimerInstanceToken, Long>() {
					@Override
					public Long apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getCompletionUserId();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, Long>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						Long completionUserId) {
						kaleoTimerInstanceToken.setCompletionUserId(completionUserId);
					}
				});
		}
	}

	public static class CompletedAccessor extends ModelPropertyAccessor {
		public CompletedAccessor() {
			super(new Function<KaleoTimerInstanceToken, Boolean>() {
					@Override
					public Boolean apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getCompleted();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, Boolean>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						Boolean completed) {
						kaleoTimerInstanceToken.setCompleted(completed);
					}
				});
		}
	}

	public static class CompletionDateAccessor extends ModelPropertyAccessor {
		public CompletionDateAccessor() {
			super(new Function<KaleoTimerInstanceToken, Date>() {
					@Override
					public Date apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getCompletionDate();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, Date>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						Date completionDate) {
						kaleoTimerInstanceToken.setCompletionDate(completionDate);
					}
				});
		}
	}

	public static class WorkflowContextAccessor extends ModelPropertyAccessor {
		public WorkflowContextAccessor() {
			super(new Function<KaleoTimerInstanceToken, String>() {
					@Override
					public String apply(
						KaleoTimerInstanceToken kaleoTimerInstanceToken) {
						return kaleoTimerInstanceToken.getWorkflowContext();
					}
				},
				new BiConsumer<KaleoTimerInstanceToken, String>() {
					@Override
					public void accept(
						KaleoTimerInstanceToken kaleoTimerInstanceToken,
						String workflowContext) {
						kaleoTimerInstanceToken.setWorkflowContext(workflowContext);
					}
				});
		}
	}

	private KaleoTimerInstanceTokenModelAccessors() {
	}
}