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
import com.liferay.portal.kernel.model.Repository;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RepositoryModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<Repository, String>() {
					@Override
					public String apply(Repository repository) {
						return repository.getUuid();
					}
				},
				new BiConsumer<Repository, String>() {
					@Override
					public void accept(Repository repository, String uuid) {
						repository.setUuid(uuid);
					}
				});
		}
	}

	public static class RepositoryIdAccessor extends ModelPropertyAccessor {
		public RepositoryIdAccessor() {
			super(new Function<Repository, Long>() {
					@Override
					public Long apply(Repository repository) {
						return repository.getRepositoryId();
					}
				},
				new BiConsumer<Repository, Long>() {
					@Override
					public void accept(Repository repository, Long repositoryId) {
						repository.setRepositoryId(repositoryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<Repository, Long>() {
					@Override
					public Long apply(Repository repository) {
						return repository.getGroupId();
					}
				},
				new BiConsumer<Repository, Long>() {
					@Override
					public void accept(Repository repository, Long groupId) {
						repository.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Repository, Long>() {
					@Override
					public Long apply(Repository repository) {
						return repository.getCompanyId();
					}
				},
				new BiConsumer<Repository, Long>() {
					@Override
					public void accept(Repository repository, Long companyId) {
						repository.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<Repository, Long>() {
					@Override
					public Long apply(Repository repository) {
						return repository.getUserId();
					}
				},
				new BiConsumer<Repository, Long>() {
					@Override
					public void accept(Repository repository, Long userId) {
						repository.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<Repository, String>() {
					@Override
					public String apply(Repository repository) {
						return repository.getUserName();
					}
				},
				new BiConsumer<Repository, String>() {
					@Override
					public void accept(Repository repository, String userName) {
						repository.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Repository, Date>() {
					@Override
					public Date apply(Repository repository) {
						return repository.getCreateDate();
					}
				},
				new BiConsumer<Repository, Date>() {
					@Override
					public void accept(Repository repository, Date createDate) {
						repository.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<Repository, Date>() {
					@Override
					public Date apply(Repository repository) {
						return repository.getModifiedDate();
					}
				},
				new BiConsumer<Repository, Date>() {
					@Override
					public void accept(Repository repository, Date modifiedDate) {
						repository.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<Repository, Long>() {
					@Override
					public Long apply(Repository repository) {
						return repository.getClassNameId();
					}
				},
				new BiConsumer<Repository, Long>() {
					@Override
					public void accept(Repository repository, Long classNameId) {
						repository.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<Repository, String>() {
					@Override
					public String apply(Repository repository) {
						return repository.getName();
					}
				},
				new BiConsumer<Repository, String>() {
					@Override
					public void accept(Repository repository, String name) {
						repository.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<Repository, String>() {
					@Override
					public String apply(Repository repository) {
						return repository.getDescription();
					}
				},
				new BiConsumer<Repository, String>() {
					@Override
					public void accept(Repository repository, String description) {
						repository.setDescription(description);
					}
				});
		}
	}

	public static class PortletIdAccessor extends ModelPropertyAccessor {
		public PortletIdAccessor() {
			super(new Function<Repository, String>() {
					@Override
					public String apply(Repository repository) {
						return repository.getPortletId();
					}
				},
				new BiConsumer<Repository, String>() {
					@Override
					public void accept(Repository repository, String portletId) {
						repository.setPortletId(portletId);
					}
				});
		}
	}

	public static class TypeSettingsAccessor extends ModelPropertyAccessor {
		public TypeSettingsAccessor() {
			super(new Function<Repository, String>() {
					@Override
					public String apply(Repository repository) {
						return repository.getTypeSettings();
					}
				},
				new BiConsumer<Repository, String>() {
					@Override
					public void accept(Repository repository,
						String typeSettings) {
						repository.setTypeSettings(typeSettings);
					}
				});
		}
	}

	public static class DlFolderIdAccessor extends ModelPropertyAccessor {
		public DlFolderIdAccessor() {
			super(new Function<Repository, Long>() {
					@Override
					public Long apply(Repository repository) {
						return repository.getDlFolderId();
					}
				},
				new BiConsumer<Repository, Long>() {
					@Override
					public void accept(Repository repository, Long dlFolderId) {
						repository.setDlFolderId(dlFolderId);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<Repository, Date>() {
					@Override
					public Date apply(Repository repository) {
						return repository.getLastPublishDate();
					}
				},
				new BiConsumer<Repository, Date>() {
					@Override
					public void accept(Repository repository,
						Date lastPublishDate) {
						repository.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private RepositoryModelAccessors() {
	}
}