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

package com.liferay.message.boards.model.impl.hibernate;

import com.liferay.message.boards.model.MBCategory;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MBCategoryModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<MBCategory, String>() {
					@Override
					public String apply(MBCategory mbCategory) {
						return mbCategory.getUuid();
					}
				},
				new BiConsumer<MBCategory, String>() {
					@Override
					public void accept(MBCategory mbCategory, String uuid) {
						mbCategory.setUuid(uuid);
					}
				});
		}
	}

	public static class CategoryIdAccessor extends ModelPropertyAccessor {
		public CategoryIdAccessor() {
			super(new Function<MBCategory, Long>() {
					@Override
					public Long apply(MBCategory mbCategory) {
						return mbCategory.getCategoryId();
					}
				},
				new BiConsumer<MBCategory, Long>() {
					@Override
					public void accept(MBCategory mbCategory, Long categoryId) {
						mbCategory.setCategoryId(categoryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<MBCategory, Long>() {
					@Override
					public Long apply(MBCategory mbCategory) {
						return mbCategory.getGroupId();
					}
				},
				new BiConsumer<MBCategory, Long>() {
					@Override
					public void accept(MBCategory mbCategory, Long groupId) {
						mbCategory.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<MBCategory, Long>() {
					@Override
					public Long apply(MBCategory mbCategory) {
						return mbCategory.getCompanyId();
					}
				},
				new BiConsumer<MBCategory, Long>() {
					@Override
					public void accept(MBCategory mbCategory, Long companyId) {
						mbCategory.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<MBCategory, Long>() {
					@Override
					public Long apply(MBCategory mbCategory) {
						return mbCategory.getUserId();
					}
				},
				new BiConsumer<MBCategory, Long>() {
					@Override
					public void accept(MBCategory mbCategory, Long userId) {
						mbCategory.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<MBCategory, String>() {
					@Override
					public String apply(MBCategory mbCategory) {
						return mbCategory.getUserName();
					}
				},
				new BiConsumer<MBCategory, String>() {
					@Override
					public void accept(MBCategory mbCategory, String userName) {
						mbCategory.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<MBCategory, Date>() {
					@Override
					public Date apply(MBCategory mbCategory) {
						return mbCategory.getCreateDate();
					}
				},
				new BiConsumer<MBCategory, Date>() {
					@Override
					public void accept(MBCategory mbCategory, Date createDate) {
						mbCategory.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<MBCategory, Date>() {
					@Override
					public Date apply(MBCategory mbCategory) {
						return mbCategory.getModifiedDate();
					}
				},
				new BiConsumer<MBCategory, Date>() {
					@Override
					public void accept(MBCategory mbCategory, Date modifiedDate) {
						mbCategory.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ParentCategoryIdAccessor extends ModelPropertyAccessor {
		public ParentCategoryIdAccessor() {
			super(new Function<MBCategory, Long>() {
					@Override
					public Long apply(MBCategory mbCategory) {
						return mbCategory.getParentCategoryId();
					}
				},
				new BiConsumer<MBCategory, Long>() {
					@Override
					public void accept(MBCategory mbCategory,
						Long parentCategoryId) {
						mbCategory.setParentCategoryId(parentCategoryId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<MBCategory, String>() {
					@Override
					public String apply(MBCategory mbCategory) {
						return mbCategory.getName();
					}
				},
				new BiConsumer<MBCategory, String>() {
					@Override
					public void accept(MBCategory mbCategory, String name) {
						mbCategory.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<MBCategory, String>() {
					@Override
					public String apply(MBCategory mbCategory) {
						return mbCategory.getDescription();
					}
				},
				new BiConsumer<MBCategory, String>() {
					@Override
					public void accept(MBCategory mbCategory, String description) {
						mbCategory.setDescription(description);
					}
				});
		}
	}

	public static class DisplayStyleAccessor extends ModelPropertyAccessor {
		public DisplayStyleAccessor() {
			super(new Function<MBCategory, String>() {
					@Override
					public String apply(MBCategory mbCategory) {
						return mbCategory.getDisplayStyle();
					}
				},
				new BiConsumer<MBCategory, String>() {
					@Override
					public void accept(MBCategory mbCategory,
						String displayStyle) {
						mbCategory.setDisplayStyle(displayStyle);
					}
				});
		}
	}

	public static class ThreadCountAccessor extends ModelPropertyAccessor {
		public ThreadCountAccessor() {
			super(new Function<MBCategory, Integer>() {
					@Override
					public Integer apply(MBCategory mbCategory) {
						return mbCategory.getThreadCount();
					}
				},
				new BiConsumer<MBCategory, Integer>() {
					@Override
					public void accept(MBCategory mbCategory,
						Integer threadCount) {
						mbCategory.setThreadCount(threadCount);
					}
				});
		}
	}

	public static class MessageCountAccessor extends ModelPropertyAccessor {
		public MessageCountAccessor() {
			super(new Function<MBCategory, Integer>() {
					@Override
					public Integer apply(MBCategory mbCategory) {
						return mbCategory.getMessageCount();
					}
				},
				new BiConsumer<MBCategory, Integer>() {
					@Override
					public void accept(MBCategory mbCategory,
						Integer messageCount) {
						mbCategory.setMessageCount(messageCount);
					}
				});
		}
	}

	public static class LastPostDateAccessor extends ModelPropertyAccessor {
		public LastPostDateAccessor() {
			super(new Function<MBCategory, Date>() {
					@Override
					public Date apply(MBCategory mbCategory) {
						return mbCategory.getLastPostDate();
					}
				},
				new BiConsumer<MBCategory, Date>() {
					@Override
					public void accept(MBCategory mbCategory, Date lastPostDate) {
						mbCategory.setLastPostDate(lastPostDate);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<MBCategory, Date>() {
					@Override
					public Date apply(MBCategory mbCategory) {
						return mbCategory.getLastPublishDate();
					}
				},
				new BiConsumer<MBCategory, Date>() {
					@Override
					public void accept(MBCategory mbCategory,
						Date lastPublishDate) {
						mbCategory.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<MBCategory, Integer>() {
					@Override
					public Integer apply(MBCategory mbCategory) {
						return mbCategory.getStatus();
					}
				},
				new BiConsumer<MBCategory, Integer>() {
					@Override
					public void accept(MBCategory mbCategory, Integer status) {
						mbCategory.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<MBCategory, Long>() {
					@Override
					public Long apply(MBCategory mbCategory) {
						return mbCategory.getStatusByUserId();
					}
				},
				new BiConsumer<MBCategory, Long>() {
					@Override
					public void accept(MBCategory mbCategory,
						Long statusByUserId) {
						mbCategory.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<MBCategory, String>() {
					@Override
					public String apply(MBCategory mbCategory) {
						return mbCategory.getStatusByUserName();
					}
				},
				new BiConsumer<MBCategory, String>() {
					@Override
					public void accept(MBCategory mbCategory,
						String statusByUserName) {
						mbCategory.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<MBCategory, Date>() {
					@Override
					public Date apply(MBCategory mbCategory) {
						return mbCategory.getStatusDate();
					}
				},
				new BiConsumer<MBCategory, Date>() {
					@Override
					public void accept(MBCategory mbCategory, Date statusDate) {
						mbCategory.setStatusDate(statusDate);
					}
				});
		}
	}

	private MBCategoryModelAccessors() {
	}
}