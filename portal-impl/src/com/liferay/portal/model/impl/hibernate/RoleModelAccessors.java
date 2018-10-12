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
import com.liferay.portal.kernel.model.Role;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RoleModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<Role, String>() {
					@Override
					public String apply(Role role) {
						return role.getUuid();
					}
				},
				new BiConsumer<Role, String>() {
					@Override
					public void accept(Role role, String uuid) {
						role.setUuid(uuid);
					}
				});
		}
	}

	public static class RoleIdAccessor extends ModelPropertyAccessor {
		public RoleIdAccessor() {
			super(new Function<Role, Long>() {
					@Override
					public Long apply(Role role) {
						return role.getRoleId();
					}
				},
				new BiConsumer<Role, Long>() {
					@Override
					public void accept(Role role, Long roleId) {
						role.setRoleId(roleId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Role, Long>() {
					@Override
					public Long apply(Role role) {
						return role.getCompanyId();
					}
				},
				new BiConsumer<Role, Long>() {
					@Override
					public void accept(Role role, Long companyId) {
						role.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<Role, Long>() {
					@Override
					public Long apply(Role role) {
						return role.getUserId();
					}
				},
				new BiConsumer<Role, Long>() {
					@Override
					public void accept(Role role, Long userId) {
						role.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<Role, String>() {
					@Override
					public String apply(Role role) {
						return role.getUserName();
					}
				},
				new BiConsumer<Role, String>() {
					@Override
					public void accept(Role role, String userName) {
						role.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Role, Date>() {
					@Override
					public Date apply(Role role) {
						return role.getCreateDate();
					}
				},
				new BiConsumer<Role, Date>() {
					@Override
					public void accept(Role role, Date createDate) {
						role.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<Role, Date>() {
					@Override
					public Date apply(Role role) {
						return role.getModifiedDate();
					}
				},
				new BiConsumer<Role, Date>() {
					@Override
					public void accept(Role role, Date modifiedDate) {
						role.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<Role, Long>() {
					@Override
					public Long apply(Role role) {
						return role.getClassNameId();
					}
				},
				new BiConsumer<Role, Long>() {
					@Override
					public void accept(Role role, Long classNameId) {
						role.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<Role, Long>() {
					@Override
					public Long apply(Role role) {
						return role.getClassPK();
					}
				},
				new BiConsumer<Role, Long>() {
					@Override
					public void accept(Role role, Long classPK) {
						role.setClassPK(classPK);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<Role, String>() {
					@Override
					public String apply(Role role) {
						return role.getName();
					}
				},
				new BiConsumer<Role, String>() {
					@Override
					public void accept(Role role, String name) {
						role.setName(name);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<Role, String>() {
					@Override
					public String apply(Role role) {
						return role.getTitle();
					}
				},
				new BiConsumer<Role, String>() {
					@Override
					public void accept(Role role, String title) {
						role.setTitle(title);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<Role, String>() {
					@Override
					public String apply(Role role) {
						return role.getDescription();
					}
				},
				new BiConsumer<Role, String>() {
					@Override
					public void accept(Role role, String description) {
						role.setDescription(description);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<Role, Integer>() {
					@Override
					public Integer apply(Role role) {
						return role.getType();
					}
				},
				new BiConsumer<Role, Integer>() {
					@Override
					public void accept(Role role, Integer type) {
						role.setType(type);
					}
				});
		}
	}

	public static class SubtypeAccessor extends ModelPropertyAccessor {
		public SubtypeAccessor() {
			super(new Function<Role, String>() {
					@Override
					public String apply(Role role) {
						return role.getSubtype();
					}
				},
				new BiConsumer<Role, String>() {
					@Override
					public void accept(Role role, String subtype) {
						role.setSubtype(subtype);
					}
				});
		}
	}

	private RoleModelAccessors() {
	}
}