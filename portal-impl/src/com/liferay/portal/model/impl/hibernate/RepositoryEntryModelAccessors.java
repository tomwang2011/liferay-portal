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
import com.liferay.portal.kernel.model.RepositoryEntry;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RepositoryEntryModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<RepositoryEntry, String>() {
					@Override
					public String apply(RepositoryEntry repositoryEntry) {
						return repositoryEntry.getUuid();
					}
				},
				new BiConsumer<RepositoryEntry, String>() {
					@Override
					public void accept(RepositoryEntry repositoryEntry,
						String uuid) {
						repositoryEntry.setUuid(uuid);
					}
				});
		}
	}

	public static class RepositoryEntryIdAccessor extends ModelPropertyAccessor {
		public RepositoryEntryIdAccessor() {
			super(new Function<RepositoryEntry, Long>() {
					@Override
					public Long apply(RepositoryEntry repositoryEntry) {
						return repositoryEntry.getRepositoryEntryId();
					}
				},
				new BiConsumer<RepositoryEntry, Long>() {
					@Override
					public void accept(RepositoryEntry repositoryEntry,
						Long repositoryEntryId) {
						repositoryEntry.setRepositoryEntryId(repositoryEntryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<RepositoryEntry, Long>() {
					@Override
					public Long apply(RepositoryEntry repositoryEntry) {
						return repositoryEntry.getGroupId();
					}
				},
				new BiConsumer<RepositoryEntry, Long>() {
					@Override
					public void accept(RepositoryEntry repositoryEntry,
						Long groupId) {
						repositoryEntry.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<RepositoryEntry, Long>() {
					@Override
					public Long apply(RepositoryEntry repositoryEntry) {
						return repositoryEntry.getCompanyId();
					}
				},
				new BiConsumer<RepositoryEntry, Long>() {
					@Override
					public void accept(RepositoryEntry repositoryEntry,
						Long companyId) {
						repositoryEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<RepositoryEntry, Long>() {
					@Override
					public Long apply(RepositoryEntry repositoryEntry) {
						return repositoryEntry.getUserId();
					}
				},
				new BiConsumer<RepositoryEntry, Long>() {
					@Override
					public void accept(RepositoryEntry repositoryEntry,
						Long userId) {
						repositoryEntry.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<RepositoryEntry, String>() {
					@Override
					public String apply(RepositoryEntry repositoryEntry) {
						return repositoryEntry.getUserName();
					}
				},
				new BiConsumer<RepositoryEntry, String>() {
					@Override
					public void accept(RepositoryEntry repositoryEntry,
						String userName) {
						repositoryEntry.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<RepositoryEntry, Date>() {
					@Override
					public Date apply(RepositoryEntry repositoryEntry) {
						return repositoryEntry.getCreateDate();
					}
				},
				new BiConsumer<RepositoryEntry, Date>() {
					@Override
					public void accept(RepositoryEntry repositoryEntry,
						Date createDate) {
						repositoryEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<RepositoryEntry, Date>() {
					@Override
					public Date apply(RepositoryEntry repositoryEntry) {
						return repositoryEntry.getModifiedDate();
					}
				},
				new BiConsumer<RepositoryEntry, Date>() {
					@Override
					public void accept(RepositoryEntry repositoryEntry,
						Date modifiedDate) {
						repositoryEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class RepositoryIdAccessor extends ModelPropertyAccessor {
		public RepositoryIdAccessor() {
			super(new Function<RepositoryEntry, Long>() {
					@Override
					public Long apply(RepositoryEntry repositoryEntry) {
						return repositoryEntry.getRepositoryId();
					}
				},
				new BiConsumer<RepositoryEntry, Long>() {
					@Override
					public void accept(RepositoryEntry repositoryEntry,
						Long repositoryId) {
						repositoryEntry.setRepositoryId(repositoryId);
					}
				});
		}
	}

	public static class MappedIdAccessor extends ModelPropertyAccessor {
		public MappedIdAccessor() {
			super(new Function<RepositoryEntry, String>() {
					@Override
					public String apply(RepositoryEntry repositoryEntry) {
						return repositoryEntry.getMappedId();
					}
				},
				new BiConsumer<RepositoryEntry, String>() {
					@Override
					public void accept(RepositoryEntry repositoryEntry,
						String mappedId) {
						repositoryEntry.setMappedId(mappedId);
					}
				});
		}
	}

	public static class ManualCheckInRequiredAccessor
		extends ModelPropertyAccessor {
		public ManualCheckInRequiredAccessor() {
			super(new Function<RepositoryEntry, Boolean>() {
					@Override
					public Boolean apply(RepositoryEntry repositoryEntry) {
						return repositoryEntry.getManualCheckInRequired();
					}
				},
				new BiConsumer<RepositoryEntry, Boolean>() {
					@Override
					public void accept(RepositoryEntry repositoryEntry,
						Boolean manualCheckInRequired) {
						repositoryEntry.setManualCheckInRequired(manualCheckInRequired);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<RepositoryEntry, Date>() {
					@Override
					public Date apply(RepositoryEntry repositoryEntry) {
						return repositoryEntry.getLastPublishDate();
					}
				},
				new BiConsumer<RepositoryEntry, Date>() {
					@Override
					public void accept(RepositoryEntry repositoryEntry,
						Date lastPublishDate) {
						repositoryEntry.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private RepositoryEntryModelAccessors() {
	}
}