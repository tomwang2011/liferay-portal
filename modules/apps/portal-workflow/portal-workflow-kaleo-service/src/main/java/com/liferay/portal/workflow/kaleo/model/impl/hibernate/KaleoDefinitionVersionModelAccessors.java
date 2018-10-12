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
import com.liferay.portal.workflow.kaleo.model.KaleoDefinitionVersion;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoDefinitionVersionModelAccessors {
	public static class KaleoDefinitionVersionIdAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionIdAccessor() {
			super(new Function<KaleoDefinitionVersion, Long>() {
					@Override
					public Long apply(
						KaleoDefinitionVersion kaleoDefinitionVersion) {
						return kaleoDefinitionVersion.getKaleoDefinitionVersionId();
					}
				},
				new BiConsumer<KaleoDefinitionVersion, Long>() {
					@Override
					public void accept(
						KaleoDefinitionVersion kaleoDefinitionVersion,
						Long kaleoDefinitionVersionId) {
						kaleoDefinitionVersion.setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoDefinitionVersion, Long>() {
					@Override
					public Long apply(
						KaleoDefinitionVersion kaleoDefinitionVersion) {
						return kaleoDefinitionVersion.getGroupId();
					}
				},
				new BiConsumer<KaleoDefinitionVersion, Long>() {
					@Override
					public void accept(
						KaleoDefinitionVersion kaleoDefinitionVersion,
						Long groupId) {
						kaleoDefinitionVersion.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoDefinitionVersion, Long>() {
					@Override
					public Long apply(
						KaleoDefinitionVersion kaleoDefinitionVersion) {
						return kaleoDefinitionVersion.getCompanyId();
					}
				},
				new BiConsumer<KaleoDefinitionVersion, Long>() {
					@Override
					public void accept(
						KaleoDefinitionVersion kaleoDefinitionVersion,
						Long companyId) {
						kaleoDefinitionVersion.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoDefinitionVersion, Long>() {
					@Override
					public Long apply(
						KaleoDefinitionVersion kaleoDefinitionVersion) {
						return kaleoDefinitionVersion.getUserId();
					}
				},
				new BiConsumer<KaleoDefinitionVersion, Long>() {
					@Override
					public void accept(
						KaleoDefinitionVersion kaleoDefinitionVersion,
						Long userId) {
						kaleoDefinitionVersion.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoDefinitionVersion, String>() {
					@Override
					public String apply(
						KaleoDefinitionVersion kaleoDefinitionVersion) {
						return kaleoDefinitionVersion.getUserName();
					}
				},
				new BiConsumer<KaleoDefinitionVersion, String>() {
					@Override
					public void accept(
						KaleoDefinitionVersion kaleoDefinitionVersion,
						String userName) {
						kaleoDefinitionVersion.setUserName(userName);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<KaleoDefinitionVersion, Long>() {
					@Override
					public Long apply(
						KaleoDefinitionVersion kaleoDefinitionVersion) {
						return kaleoDefinitionVersion.getStatusByUserId();
					}
				},
				new BiConsumer<KaleoDefinitionVersion, Long>() {
					@Override
					public void accept(
						KaleoDefinitionVersion kaleoDefinitionVersion,
						Long statusByUserId) {
						kaleoDefinitionVersion.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<KaleoDefinitionVersion, String>() {
					@Override
					public String apply(
						KaleoDefinitionVersion kaleoDefinitionVersion) {
						return kaleoDefinitionVersion.getStatusByUserName();
					}
				},
				new BiConsumer<KaleoDefinitionVersion, String>() {
					@Override
					public void accept(
						KaleoDefinitionVersion kaleoDefinitionVersion,
						String statusByUserName) {
						kaleoDefinitionVersion.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<KaleoDefinitionVersion, Date>() {
					@Override
					public Date apply(
						KaleoDefinitionVersion kaleoDefinitionVersion) {
						return kaleoDefinitionVersion.getStatusDate();
					}
				},
				new BiConsumer<KaleoDefinitionVersion, Date>() {
					@Override
					public void accept(
						KaleoDefinitionVersion kaleoDefinitionVersion,
						Date statusDate) {
						kaleoDefinitionVersion.setStatusDate(statusDate);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoDefinitionVersion, Date>() {
					@Override
					public Date apply(
						KaleoDefinitionVersion kaleoDefinitionVersion) {
						return kaleoDefinitionVersion.getCreateDate();
					}
				},
				new BiConsumer<KaleoDefinitionVersion, Date>() {
					@Override
					public void accept(
						KaleoDefinitionVersion kaleoDefinitionVersion,
						Date createDate) {
						kaleoDefinitionVersion.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoDefinitionVersion, Date>() {
					@Override
					public Date apply(
						KaleoDefinitionVersion kaleoDefinitionVersion) {
						return kaleoDefinitionVersion.getModifiedDate();
					}
				},
				new BiConsumer<KaleoDefinitionVersion, Date>() {
					@Override
					public void accept(
						KaleoDefinitionVersion kaleoDefinitionVersion,
						Date modifiedDate) {
						kaleoDefinitionVersion.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<KaleoDefinitionVersion, String>() {
					@Override
					public String apply(
						KaleoDefinitionVersion kaleoDefinitionVersion) {
						return kaleoDefinitionVersion.getName();
					}
				},
				new BiConsumer<KaleoDefinitionVersion, String>() {
					@Override
					public void accept(
						KaleoDefinitionVersion kaleoDefinitionVersion,
						String name) {
						kaleoDefinitionVersion.setName(name);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<KaleoDefinitionVersion, String>() {
					@Override
					public String apply(
						KaleoDefinitionVersion kaleoDefinitionVersion) {
						return kaleoDefinitionVersion.getTitle();
					}
				},
				new BiConsumer<KaleoDefinitionVersion, String>() {
					@Override
					public void accept(
						KaleoDefinitionVersion kaleoDefinitionVersion,
						String title) {
						kaleoDefinitionVersion.setTitle(title);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<KaleoDefinitionVersion, String>() {
					@Override
					public String apply(
						KaleoDefinitionVersion kaleoDefinitionVersion) {
						return kaleoDefinitionVersion.getDescription();
					}
				},
				new BiConsumer<KaleoDefinitionVersion, String>() {
					@Override
					public void accept(
						KaleoDefinitionVersion kaleoDefinitionVersion,
						String description) {
						kaleoDefinitionVersion.setDescription(description);
					}
				});
		}
	}

	public static class ContentAccessor extends ModelPropertyAccessor {
		public ContentAccessor() {
			super(new Function<KaleoDefinitionVersion, String>() {
					@Override
					public String apply(
						KaleoDefinitionVersion kaleoDefinitionVersion) {
						return kaleoDefinitionVersion.getContent();
					}
				},
				new BiConsumer<KaleoDefinitionVersion, String>() {
					@Override
					public void accept(
						KaleoDefinitionVersion kaleoDefinitionVersion,
						String content) {
						kaleoDefinitionVersion.setContent(content);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<KaleoDefinitionVersion, String>() {
					@Override
					public String apply(
						KaleoDefinitionVersion kaleoDefinitionVersion) {
						return kaleoDefinitionVersion.getVersion();
					}
				},
				new BiConsumer<KaleoDefinitionVersion, String>() {
					@Override
					public void accept(
						KaleoDefinitionVersion kaleoDefinitionVersion,
						String version) {
						kaleoDefinitionVersion.setVersion(version);
					}
				});
		}
	}

	public static class StartKaleoNodeIdAccessor extends ModelPropertyAccessor {
		public StartKaleoNodeIdAccessor() {
			super(new Function<KaleoDefinitionVersion, Long>() {
					@Override
					public Long apply(
						KaleoDefinitionVersion kaleoDefinitionVersion) {
						return kaleoDefinitionVersion.getStartKaleoNodeId();
					}
				},
				new BiConsumer<KaleoDefinitionVersion, Long>() {
					@Override
					public void accept(
						KaleoDefinitionVersion kaleoDefinitionVersion,
						Long startKaleoNodeId) {
						kaleoDefinitionVersion.setStartKaleoNodeId(startKaleoNodeId);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<KaleoDefinitionVersion, Integer>() {
					@Override
					public Integer apply(
						KaleoDefinitionVersion kaleoDefinitionVersion) {
						return kaleoDefinitionVersion.getStatus();
					}
				},
				new BiConsumer<KaleoDefinitionVersion, Integer>() {
					@Override
					public void accept(
						KaleoDefinitionVersion kaleoDefinitionVersion,
						Integer status) {
						kaleoDefinitionVersion.setStatus(status);
					}
				});
		}
	}

	private KaleoDefinitionVersionModelAccessors() {
	}
}