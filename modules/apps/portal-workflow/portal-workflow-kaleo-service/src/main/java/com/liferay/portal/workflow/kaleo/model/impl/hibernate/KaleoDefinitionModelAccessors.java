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
import com.liferay.portal.workflow.kaleo.model.KaleoDefinition;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoDefinitionModelAccessors {
	public static class KaleoDefinitionIdAccessor extends ModelPropertyAccessor {
		public KaleoDefinitionIdAccessor() {
			super(new Function<KaleoDefinition, Long>() {
					@Override
					public Long apply(KaleoDefinition kaleoDefinition) {
						return kaleoDefinition.getKaleoDefinitionId();
					}
				},
				new BiConsumer<KaleoDefinition, Long>() {
					@Override
					public void accept(KaleoDefinition kaleoDefinition,
						Long kaleoDefinitionId) {
						kaleoDefinition.setKaleoDefinitionId(kaleoDefinitionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoDefinition, Long>() {
					@Override
					public Long apply(KaleoDefinition kaleoDefinition) {
						return kaleoDefinition.getGroupId();
					}
				},
				new BiConsumer<KaleoDefinition, Long>() {
					@Override
					public void accept(KaleoDefinition kaleoDefinition,
						Long groupId) {
						kaleoDefinition.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoDefinition, Long>() {
					@Override
					public Long apply(KaleoDefinition kaleoDefinition) {
						return kaleoDefinition.getCompanyId();
					}
				},
				new BiConsumer<KaleoDefinition, Long>() {
					@Override
					public void accept(KaleoDefinition kaleoDefinition,
						Long companyId) {
						kaleoDefinition.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoDefinition, Long>() {
					@Override
					public Long apply(KaleoDefinition kaleoDefinition) {
						return kaleoDefinition.getUserId();
					}
				},
				new BiConsumer<KaleoDefinition, Long>() {
					@Override
					public void accept(KaleoDefinition kaleoDefinition,
						Long userId) {
						kaleoDefinition.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoDefinition, String>() {
					@Override
					public String apply(KaleoDefinition kaleoDefinition) {
						return kaleoDefinition.getUserName();
					}
				},
				new BiConsumer<KaleoDefinition, String>() {
					@Override
					public void accept(KaleoDefinition kaleoDefinition,
						String userName) {
						kaleoDefinition.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoDefinition, Date>() {
					@Override
					public Date apply(KaleoDefinition kaleoDefinition) {
						return kaleoDefinition.getCreateDate();
					}
				},
				new BiConsumer<KaleoDefinition, Date>() {
					@Override
					public void accept(KaleoDefinition kaleoDefinition,
						Date createDate) {
						kaleoDefinition.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoDefinition, Date>() {
					@Override
					public Date apply(KaleoDefinition kaleoDefinition) {
						return kaleoDefinition.getModifiedDate();
					}
				},
				new BiConsumer<KaleoDefinition, Date>() {
					@Override
					public void accept(KaleoDefinition kaleoDefinition,
						Date modifiedDate) {
						kaleoDefinition.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<KaleoDefinition, String>() {
					@Override
					public String apply(KaleoDefinition kaleoDefinition) {
						return kaleoDefinition.getName();
					}
				},
				new BiConsumer<KaleoDefinition, String>() {
					@Override
					public void accept(KaleoDefinition kaleoDefinition,
						String name) {
						kaleoDefinition.setName(name);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<KaleoDefinition, String>() {
					@Override
					public String apply(KaleoDefinition kaleoDefinition) {
						return kaleoDefinition.getTitle();
					}
				},
				new BiConsumer<KaleoDefinition, String>() {
					@Override
					public void accept(KaleoDefinition kaleoDefinition,
						String title) {
						kaleoDefinition.setTitle(title);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<KaleoDefinition, String>() {
					@Override
					public String apply(KaleoDefinition kaleoDefinition) {
						return kaleoDefinition.getDescription();
					}
				},
				new BiConsumer<KaleoDefinition, String>() {
					@Override
					public void accept(KaleoDefinition kaleoDefinition,
						String description) {
						kaleoDefinition.setDescription(description);
					}
				});
		}
	}

	public static class ContentAccessor extends ModelPropertyAccessor {
		public ContentAccessor() {
			super(new Function<KaleoDefinition, String>() {
					@Override
					public String apply(KaleoDefinition kaleoDefinition) {
						return kaleoDefinition.getContent();
					}
				},
				new BiConsumer<KaleoDefinition, String>() {
					@Override
					public void accept(KaleoDefinition kaleoDefinition,
						String content) {
						kaleoDefinition.setContent(content);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<KaleoDefinition, Integer>() {
					@Override
					public Integer apply(KaleoDefinition kaleoDefinition) {
						return kaleoDefinition.getVersion();
					}
				},
				new BiConsumer<KaleoDefinition, Integer>() {
					@Override
					public void accept(KaleoDefinition kaleoDefinition,
						Integer version) {
						kaleoDefinition.setVersion(version);
					}
				});
		}
	}

	public static class ActiveAccessor extends ModelPropertyAccessor {
		public ActiveAccessor() {
			super(new Function<KaleoDefinition, Boolean>() {
					@Override
					public Boolean apply(KaleoDefinition kaleoDefinition) {
						return kaleoDefinition.getActive();
					}
				},
				new BiConsumer<KaleoDefinition, Boolean>() {
					@Override
					public void accept(KaleoDefinition kaleoDefinition,
						Boolean active) {
						kaleoDefinition.setActive(active);
					}
				});
		}
	}

	private KaleoDefinitionModelAccessors() {
	}
}