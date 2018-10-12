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
import com.liferay.portal.workflow.kaleo.model.KaleoTask;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoTaskModelAccessors {
	public static class KaleoTaskIdAccessor extends ModelPropertyAccessor {
		public KaleoTaskIdAccessor() {
			super(new Function<KaleoTask, Long>() {
					@Override
					public Long apply(KaleoTask kaleoTask) {
						return kaleoTask.getKaleoTaskId();
					}
				},
				new BiConsumer<KaleoTask, Long>() {
					@Override
					public void accept(KaleoTask kaleoTask, Long kaleoTaskId) {
						kaleoTask.setKaleoTaskId(kaleoTaskId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoTask, Long>() {
					@Override
					public Long apply(KaleoTask kaleoTask) {
						return kaleoTask.getGroupId();
					}
				},
				new BiConsumer<KaleoTask, Long>() {
					@Override
					public void accept(KaleoTask kaleoTask, Long groupId) {
						kaleoTask.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoTask, Long>() {
					@Override
					public Long apply(KaleoTask kaleoTask) {
						return kaleoTask.getCompanyId();
					}
				},
				new BiConsumer<KaleoTask, Long>() {
					@Override
					public void accept(KaleoTask kaleoTask, Long companyId) {
						kaleoTask.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoTask, Long>() {
					@Override
					public Long apply(KaleoTask kaleoTask) {
						return kaleoTask.getUserId();
					}
				},
				new BiConsumer<KaleoTask, Long>() {
					@Override
					public void accept(KaleoTask kaleoTask, Long userId) {
						kaleoTask.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoTask, String>() {
					@Override
					public String apply(KaleoTask kaleoTask) {
						return kaleoTask.getUserName();
					}
				},
				new BiConsumer<KaleoTask, String>() {
					@Override
					public void accept(KaleoTask kaleoTask, String userName) {
						kaleoTask.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoTask, Date>() {
					@Override
					public Date apply(KaleoTask kaleoTask) {
						return kaleoTask.getCreateDate();
					}
				},
				new BiConsumer<KaleoTask, Date>() {
					@Override
					public void accept(KaleoTask kaleoTask, Date createDate) {
						kaleoTask.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoTask, Date>() {
					@Override
					public Date apply(KaleoTask kaleoTask) {
						return kaleoTask.getModifiedDate();
					}
				},
				new BiConsumer<KaleoTask, Date>() {
					@Override
					public void accept(KaleoTask kaleoTask, Date modifiedDate) {
						kaleoTask.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class KaleoDefinitionVersionIdAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionIdAccessor() {
			super(new Function<KaleoTask, Long>() {
					@Override
					public Long apply(KaleoTask kaleoTask) {
						return kaleoTask.getKaleoDefinitionVersionId();
					}
				},
				new BiConsumer<KaleoTask, Long>() {
					@Override
					public void accept(KaleoTask kaleoTask,
						Long kaleoDefinitionVersionId) {
						kaleoTask.setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
					}
				});
		}
	}

	public static class KaleoNodeIdAccessor extends ModelPropertyAccessor {
		public KaleoNodeIdAccessor() {
			super(new Function<KaleoTask, Long>() {
					@Override
					public Long apply(KaleoTask kaleoTask) {
						return kaleoTask.getKaleoNodeId();
					}
				},
				new BiConsumer<KaleoTask, Long>() {
					@Override
					public void accept(KaleoTask kaleoTask, Long kaleoNodeId) {
						kaleoTask.setKaleoNodeId(kaleoNodeId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<KaleoTask, String>() {
					@Override
					public String apply(KaleoTask kaleoTask) {
						return kaleoTask.getName();
					}
				},
				new BiConsumer<KaleoTask, String>() {
					@Override
					public void accept(KaleoTask kaleoTask, String name) {
						kaleoTask.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<KaleoTask, String>() {
					@Override
					public String apply(KaleoTask kaleoTask) {
						return kaleoTask.getDescription();
					}
				},
				new BiConsumer<KaleoTask, String>() {
					@Override
					public void accept(KaleoTask kaleoTask, String description) {
						kaleoTask.setDescription(description);
					}
				});
		}
	}

	private KaleoTaskModelAccessors() {
	}
}