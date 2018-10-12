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
import com.liferay.portal.workflow.kaleo.model.KaleoInstanceToken;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoInstanceTokenModelAccessors {
	public static class KaleoInstanceTokenIdAccessor
		extends ModelPropertyAccessor {
		public KaleoInstanceTokenIdAccessor() {
			super(new Function<KaleoInstanceToken, Long>() {
					@Override
					public Long apply(KaleoInstanceToken kaleoInstanceToken) {
						return kaleoInstanceToken.getKaleoInstanceTokenId();
					}
				},
				new BiConsumer<KaleoInstanceToken, Long>() {
					@Override
					public void accept(KaleoInstanceToken kaleoInstanceToken,
						Long kaleoInstanceTokenId) {
						kaleoInstanceToken.setKaleoInstanceTokenId(kaleoInstanceTokenId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoInstanceToken, Long>() {
					@Override
					public Long apply(KaleoInstanceToken kaleoInstanceToken) {
						return kaleoInstanceToken.getGroupId();
					}
				},
				new BiConsumer<KaleoInstanceToken, Long>() {
					@Override
					public void accept(KaleoInstanceToken kaleoInstanceToken,
						Long groupId) {
						kaleoInstanceToken.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoInstanceToken, Long>() {
					@Override
					public Long apply(KaleoInstanceToken kaleoInstanceToken) {
						return kaleoInstanceToken.getCompanyId();
					}
				},
				new BiConsumer<KaleoInstanceToken, Long>() {
					@Override
					public void accept(KaleoInstanceToken kaleoInstanceToken,
						Long companyId) {
						kaleoInstanceToken.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoInstanceToken, Long>() {
					@Override
					public Long apply(KaleoInstanceToken kaleoInstanceToken) {
						return kaleoInstanceToken.getUserId();
					}
				},
				new BiConsumer<KaleoInstanceToken, Long>() {
					@Override
					public void accept(KaleoInstanceToken kaleoInstanceToken,
						Long userId) {
						kaleoInstanceToken.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoInstanceToken, String>() {
					@Override
					public String apply(KaleoInstanceToken kaleoInstanceToken) {
						return kaleoInstanceToken.getUserName();
					}
				},
				new BiConsumer<KaleoInstanceToken, String>() {
					@Override
					public void accept(KaleoInstanceToken kaleoInstanceToken,
						String userName) {
						kaleoInstanceToken.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoInstanceToken, Date>() {
					@Override
					public Date apply(KaleoInstanceToken kaleoInstanceToken) {
						return kaleoInstanceToken.getCreateDate();
					}
				},
				new BiConsumer<KaleoInstanceToken, Date>() {
					@Override
					public void accept(KaleoInstanceToken kaleoInstanceToken,
						Date createDate) {
						kaleoInstanceToken.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoInstanceToken, Date>() {
					@Override
					public Date apply(KaleoInstanceToken kaleoInstanceToken) {
						return kaleoInstanceToken.getModifiedDate();
					}
				},
				new BiConsumer<KaleoInstanceToken, Date>() {
					@Override
					public void accept(KaleoInstanceToken kaleoInstanceToken,
						Date modifiedDate) {
						kaleoInstanceToken.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class KaleoDefinitionVersionIdAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionIdAccessor() {
			super(new Function<KaleoInstanceToken, Long>() {
					@Override
					public Long apply(KaleoInstanceToken kaleoInstanceToken) {
						return kaleoInstanceToken.getKaleoDefinitionVersionId();
					}
				},
				new BiConsumer<KaleoInstanceToken, Long>() {
					@Override
					public void accept(KaleoInstanceToken kaleoInstanceToken,
						Long kaleoDefinitionVersionId) {
						kaleoInstanceToken.setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
					}
				});
		}
	}

	public static class KaleoInstanceIdAccessor extends ModelPropertyAccessor {
		public KaleoInstanceIdAccessor() {
			super(new Function<KaleoInstanceToken, Long>() {
					@Override
					public Long apply(KaleoInstanceToken kaleoInstanceToken) {
						return kaleoInstanceToken.getKaleoInstanceId();
					}
				},
				new BiConsumer<KaleoInstanceToken, Long>() {
					@Override
					public void accept(KaleoInstanceToken kaleoInstanceToken,
						Long kaleoInstanceId) {
						kaleoInstanceToken.setKaleoInstanceId(kaleoInstanceId);
					}
				});
		}
	}

	public static class ParentKaleoInstanceTokenIdAccessor
		extends ModelPropertyAccessor {
		public ParentKaleoInstanceTokenIdAccessor() {
			super(new Function<KaleoInstanceToken, Long>() {
					@Override
					public Long apply(KaleoInstanceToken kaleoInstanceToken) {
						return kaleoInstanceToken.getParentKaleoInstanceTokenId();
					}
				},
				new BiConsumer<KaleoInstanceToken, Long>() {
					@Override
					public void accept(KaleoInstanceToken kaleoInstanceToken,
						Long parentKaleoInstanceTokenId) {
						kaleoInstanceToken.setParentKaleoInstanceTokenId(parentKaleoInstanceTokenId);
					}
				});
		}
	}

	public static class CurrentKaleoNodeIdAccessor extends ModelPropertyAccessor {
		public CurrentKaleoNodeIdAccessor() {
			super(new Function<KaleoInstanceToken, Long>() {
					@Override
					public Long apply(KaleoInstanceToken kaleoInstanceToken) {
						return kaleoInstanceToken.getCurrentKaleoNodeId();
					}
				},
				new BiConsumer<KaleoInstanceToken, Long>() {
					@Override
					public void accept(KaleoInstanceToken kaleoInstanceToken,
						Long currentKaleoNodeId) {
						kaleoInstanceToken.setCurrentKaleoNodeId(currentKaleoNodeId);
					}
				});
		}
	}

	public static class CurrentKaleoNodeNameAccessor
		extends ModelPropertyAccessor {
		public CurrentKaleoNodeNameAccessor() {
			super(new Function<KaleoInstanceToken, String>() {
					@Override
					public String apply(KaleoInstanceToken kaleoInstanceToken) {
						return kaleoInstanceToken.getCurrentKaleoNodeName();
					}
				},
				new BiConsumer<KaleoInstanceToken, String>() {
					@Override
					public void accept(KaleoInstanceToken kaleoInstanceToken,
						String currentKaleoNodeName) {
						kaleoInstanceToken.setCurrentKaleoNodeName(currentKaleoNodeName);
					}
				});
		}
	}

	public static class ClassNameAccessor extends ModelPropertyAccessor {
		public ClassNameAccessor() {
			super(new Function<KaleoInstanceToken, String>() {
					@Override
					public String apply(KaleoInstanceToken kaleoInstanceToken) {
						return kaleoInstanceToken.getClassName();
					}
				},
				new BiConsumer<KaleoInstanceToken, String>() {
					@Override
					public void accept(KaleoInstanceToken kaleoInstanceToken,
						String className) {
						kaleoInstanceToken.setClassName(className);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<KaleoInstanceToken, Long>() {
					@Override
					public Long apply(KaleoInstanceToken kaleoInstanceToken) {
						return kaleoInstanceToken.getClassPK();
					}
				},
				new BiConsumer<KaleoInstanceToken, Long>() {
					@Override
					public void accept(KaleoInstanceToken kaleoInstanceToken,
						Long classPK) {
						kaleoInstanceToken.setClassPK(classPK);
					}
				});
		}
	}

	public static class CompletedAccessor extends ModelPropertyAccessor {
		public CompletedAccessor() {
			super(new Function<KaleoInstanceToken, Boolean>() {
					@Override
					public Boolean apply(KaleoInstanceToken kaleoInstanceToken) {
						return kaleoInstanceToken.getCompleted();
					}
				},
				new BiConsumer<KaleoInstanceToken, Boolean>() {
					@Override
					public void accept(KaleoInstanceToken kaleoInstanceToken,
						Boolean completed) {
						kaleoInstanceToken.setCompleted(completed);
					}
				});
		}
	}

	public static class CompletionDateAccessor extends ModelPropertyAccessor {
		public CompletionDateAccessor() {
			super(new Function<KaleoInstanceToken, Date>() {
					@Override
					public Date apply(KaleoInstanceToken kaleoInstanceToken) {
						return kaleoInstanceToken.getCompletionDate();
					}
				},
				new BiConsumer<KaleoInstanceToken, Date>() {
					@Override
					public void accept(KaleoInstanceToken kaleoInstanceToken,
						Date completionDate) {
						kaleoInstanceToken.setCompletionDate(completionDate);
					}
				});
		}
	}

	private KaleoInstanceTokenModelAccessors() {
	}
}