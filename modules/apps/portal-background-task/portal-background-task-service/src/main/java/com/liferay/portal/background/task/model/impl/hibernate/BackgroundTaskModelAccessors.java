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

package com.liferay.portal.background.task.model.impl.hibernate;

import com.liferay.portal.background.task.model.BackgroundTask;
import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.Date;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BackgroundTaskModelAccessors {
	public static class BackgroundTaskIdAccessor extends ModelPropertyAccessor {
		public BackgroundTaskIdAccessor() {
			super(new Function<BackgroundTask, Long>() {
					@Override
					public Long apply(BackgroundTask backgroundTask) {
						return backgroundTask.getBackgroundTaskId();
					}
				},
				new BiConsumer<BackgroundTask, Long>() {
					@Override
					public void accept(BackgroundTask backgroundTask,
						Long backgroundTaskId) {
						backgroundTask.setBackgroundTaskId(backgroundTaskId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<BackgroundTask, Long>() {
					@Override
					public Long apply(BackgroundTask backgroundTask) {
						return backgroundTask.getGroupId();
					}
				},
				new BiConsumer<BackgroundTask, Long>() {
					@Override
					public void accept(BackgroundTask backgroundTask,
						Long groupId) {
						backgroundTask.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<BackgroundTask, Long>() {
					@Override
					public Long apply(BackgroundTask backgroundTask) {
						return backgroundTask.getCompanyId();
					}
				},
				new BiConsumer<BackgroundTask, Long>() {
					@Override
					public void accept(BackgroundTask backgroundTask,
						Long companyId) {
						backgroundTask.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<BackgroundTask, Long>() {
					@Override
					public Long apply(BackgroundTask backgroundTask) {
						return backgroundTask.getUserId();
					}
				},
				new BiConsumer<BackgroundTask, Long>() {
					@Override
					public void accept(BackgroundTask backgroundTask,
						Long userId) {
						backgroundTask.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<BackgroundTask, String>() {
					@Override
					public String apply(BackgroundTask backgroundTask) {
						return backgroundTask.getUserName();
					}
				},
				new BiConsumer<BackgroundTask, String>() {
					@Override
					public void accept(BackgroundTask backgroundTask,
						String userName) {
						backgroundTask.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<BackgroundTask, Date>() {
					@Override
					public Date apply(BackgroundTask backgroundTask) {
						return backgroundTask.getCreateDate();
					}
				},
				new BiConsumer<BackgroundTask, Date>() {
					@Override
					public void accept(BackgroundTask backgroundTask,
						Date createDate) {
						backgroundTask.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<BackgroundTask, Date>() {
					@Override
					public Date apply(BackgroundTask backgroundTask) {
						return backgroundTask.getModifiedDate();
					}
				},
				new BiConsumer<BackgroundTask, Date>() {
					@Override
					public void accept(BackgroundTask backgroundTask,
						Date modifiedDate) {
						backgroundTask.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<BackgroundTask, String>() {
					@Override
					public String apply(BackgroundTask backgroundTask) {
						return backgroundTask.getName();
					}
				},
				new BiConsumer<BackgroundTask, String>() {
					@Override
					public void accept(BackgroundTask backgroundTask,
						String name) {
						backgroundTask.setName(name);
					}
				});
		}
	}

	public static class ServletContextNamesAccessor
		extends ModelPropertyAccessor {
		public ServletContextNamesAccessor() {
			super(new Function<BackgroundTask, String>() {
					@Override
					public String apply(BackgroundTask backgroundTask) {
						return backgroundTask.getServletContextNames();
					}
				},
				new BiConsumer<BackgroundTask, String>() {
					@Override
					public void accept(BackgroundTask backgroundTask,
						String servletContextNames) {
						backgroundTask.setServletContextNames(servletContextNames);
					}
				});
		}
	}

	public static class TaskExecutorClassNameAccessor
		extends ModelPropertyAccessor {
		public TaskExecutorClassNameAccessor() {
			super(new Function<BackgroundTask, String>() {
					@Override
					public String apply(BackgroundTask backgroundTask) {
						return backgroundTask.getTaskExecutorClassName();
					}
				},
				new BiConsumer<BackgroundTask, String>() {
					@Override
					public void accept(BackgroundTask backgroundTask,
						String taskExecutorClassName) {
						backgroundTask.setTaskExecutorClassName(taskExecutorClassName);
					}
				});
		}
	}

	public static class TaskContextMapAccessor extends ModelPropertyAccessor {
		public TaskContextMapAccessor() {
			super(new Function<BackgroundTask, Map>() {
					@Override
					public Map apply(BackgroundTask backgroundTask) {
						return backgroundTask.getTaskContextMap();
					}
				},
				new BiConsumer<BackgroundTask, Map>() {
					@Override
					public void accept(BackgroundTask backgroundTask,
						Map taskContextMap) {
						backgroundTask.setTaskContextMap(taskContextMap);
					}
				});
		}
	}

	public static class CompletedAccessor extends ModelPropertyAccessor {
		public CompletedAccessor() {
			super(new Function<BackgroundTask, Boolean>() {
					@Override
					public Boolean apply(BackgroundTask backgroundTask) {
						return backgroundTask.getCompleted();
					}
				},
				new BiConsumer<BackgroundTask, Boolean>() {
					@Override
					public void accept(BackgroundTask backgroundTask,
						Boolean completed) {
						backgroundTask.setCompleted(completed);
					}
				});
		}
	}

	public static class CompletionDateAccessor extends ModelPropertyAccessor {
		public CompletionDateAccessor() {
			super(new Function<BackgroundTask, Date>() {
					@Override
					public Date apply(BackgroundTask backgroundTask) {
						return backgroundTask.getCompletionDate();
					}
				},
				new BiConsumer<BackgroundTask, Date>() {
					@Override
					public void accept(BackgroundTask backgroundTask,
						Date completionDate) {
						backgroundTask.setCompletionDate(completionDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<BackgroundTask, Integer>() {
					@Override
					public Integer apply(BackgroundTask backgroundTask) {
						return backgroundTask.getStatus();
					}
				},
				new BiConsumer<BackgroundTask, Integer>() {
					@Override
					public void accept(BackgroundTask backgroundTask,
						Integer status) {
						backgroundTask.setStatus(status);
					}
				});
		}
	}

	public static class StatusMessageAccessor extends ModelPropertyAccessor {
		public StatusMessageAccessor() {
			super(new Function<BackgroundTask, String>() {
					@Override
					public String apply(BackgroundTask backgroundTask) {
						return backgroundTask.getStatusMessage();
					}
				},
				new BiConsumer<BackgroundTask, String>() {
					@Override
					public void accept(BackgroundTask backgroundTask,
						String statusMessage) {
						backgroundTask.setStatusMessage(statusMessage);
					}
				});
		}
	}

	private BackgroundTaskModelAccessors() {
	}
}