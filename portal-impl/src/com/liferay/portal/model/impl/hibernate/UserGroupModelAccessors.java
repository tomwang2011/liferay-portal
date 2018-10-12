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
import com.liferay.portal.kernel.model.UserGroup;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserGroupModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<UserGroup, String>() {
					@Override
					public String apply(UserGroup userGroup) {
						return userGroup.getUuid();
					}
				},
				new BiConsumer<UserGroup, String>() {
					@Override
					public void accept(UserGroup userGroup, String uuid) {
						userGroup.setUuid(uuid);
					}
				});
		}
	}

	public static class ExternalReferenceCodeAccessor
		extends ModelPropertyAccessor {
		public ExternalReferenceCodeAccessor() {
			super(new Function<UserGroup, String>() {
					@Override
					public String apply(UserGroup userGroup) {
						return userGroup.getExternalReferenceCode();
					}
				},
				new BiConsumer<UserGroup, String>() {
					@Override
					public void accept(UserGroup userGroup,
						String externalReferenceCode) {
						userGroup.setExternalReferenceCode(externalReferenceCode);
					}
				});
		}
	}

	public static class UserGroupIdAccessor extends ModelPropertyAccessor {
		public UserGroupIdAccessor() {
			super(new Function<UserGroup, Long>() {
					@Override
					public Long apply(UserGroup userGroup) {
						return userGroup.getUserGroupId();
					}
				},
				new BiConsumer<UserGroup, Long>() {
					@Override
					public void accept(UserGroup userGroup, Long userGroupId) {
						userGroup.setUserGroupId(userGroupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<UserGroup, Long>() {
					@Override
					public Long apply(UserGroup userGroup) {
						return userGroup.getCompanyId();
					}
				},
				new BiConsumer<UserGroup, Long>() {
					@Override
					public void accept(UserGroup userGroup, Long companyId) {
						userGroup.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<UserGroup, Long>() {
					@Override
					public Long apply(UserGroup userGroup) {
						return userGroup.getUserId();
					}
				},
				new BiConsumer<UserGroup, Long>() {
					@Override
					public void accept(UserGroup userGroup, Long userId) {
						userGroup.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<UserGroup, String>() {
					@Override
					public String apply(UserGroup userGroup) {
						return userGroup.getUserName();
					}
				},
				new BiConsumer<UserGroup, String>() {
					@Override
					public void accept(UserGroup userGroup, String userName) {
						userGroup.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<UserGroup, Date>() {
					@Override
					public Date apply(UserGroup userGroup) {
						return userGroup.getCreateDate();
					}
				},
				new BiConsumer<UserGroup, Date>() {
					@Override
					public void accept(UserGroup userGroup, Date createDate) {
						userGroup.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<UserGroup, Date>() {
					@Override
					public Date apply(UserGroup userGroup) {
						return userGroup.getModifiedDate();
					}
				},
				new BiConsumer<UserGroup, Date>() {
					@Override
					public void accept(UserGroup userGroup, Date modifiedDate) {
						userGroup.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ParentUserGroupIdAccessor extends ModelPropertyAccessor {
		public ParentUserGroupIdAccessor() {
			super(new Function<UserGroup, Long>() {
					@Override
					public Long apply(UserGroup userGroup) {
						return userGroup.getParentUserGroupId();
					}
				},
				new BiConsumer<UserGroup, Long>() {
					@Override
					public void accept(UserGroup userGroup,
						Long parentUserGroupId) {
						userGroup.setParentUserGroupId(parentUserGroupId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<UserGroup, String>() {
					@Override
					public String apply(UserGroup userGroup) {
						return userGroup.getName();
					}
				},
				new BiConsumer<UserGroup, String>() {
					@Override
					public void accept(UserGroup userGroup, String name) {
						userGroup.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<UserGroup, String>() {
					@Override
					public String apply(UserGroup userGroup) {
						return userGroup.getDescription();
					}
				},
				new BiConsumer<UserGroup, String>() {
					@Override
					public void accept(UserGroup userGroup, String description) {
						userGroup.setDescription(description);
					}
				});
		}
	}

	public static class AddedByLDAPImportAccessor extends ModelPropertyAccessor {
		public AddedByLDAPImportAccessor() {
			super(new Function<UserGroup, Boolean>() {
					@Override
					public Boolean apply(UserGroup userGroup) {
						return userGroup.getAddedByLDAPImport();
					}
				},
				new BiConsumer<UserGroup, Boolean>() {
					@Override
					public void accept(UserGroup userGroup,
						Boolean addedByLDAPImport) {
						userGroup.setAddedByLDAPImport(addedByLDAPImport);
					}
				});
		}
	}

	private UserGroupModelAccessors() {
	}
}