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

package com.liferay.portal.lock.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;
import com.liferay.portal.lock.model.Lock;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LockModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<Lock, String>() {
					@Override
					public String apply(Lock lock) {
						return lock.getUuid();
					}
				},
				new BiConsumer<Lock, String>() {
					@Override
					public void accept(Lock lock, String uuid) {
						lock.setUuid(uuid);
					}
				});
		}
	}

	public static class LockIdAccessor extends ModelPropertyAccessor {
		public LockIdAccessor() {
			super(new Function<Lock, Long>() {
					@Override
					public Long apply(Lock lock) {
						return lock.getLockId();
					}
				},
				new BiConsumer<Lock, Long>() {
					@Override
					public void accept(Lock lock, Long lockId) {
						lock.setLockId(lockId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Lock, Long>() {
					@Override
					public Long apply(Lock lock) {
						return lock.getCompanyId();
					}
				},
				new BiConsumer<Lock, Long>() {
					@Override
					public void accept(Lock lock, Long companyId) {
						lock.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<Lock, Long>() {
					@Override
					public Long apply(Lock lock) {
						return lock.getUserId();
					}
				},
				new BiConsumer<Lock, Long>() {
					@Override
					public void accept(Lock lock, Long userId) {
						lock.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<Lock, String>() {
					@Override
					public String apply(Lock lock) {
						return lock.getUserName();
					}
				},
				new BiConsumer<Lock, String>() {
					@Override
					public void accept(Lock lock, String userName) {
						lock.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Lock, Date>() {
					@Override
					public Date apply(Lock lock) {
						return lock.getCreateDate();
					}
				},
				new BiConsumer<Lock, Date>() {
					@Override
					public void accept(Lock lock, Date createDate) {
						lock.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ClassNameAccessor extends ModelPropertyAccessor {
		public ClassNameAccessor() {
			super(new Function<Lock, String>() {
					@Override
					public String apply(Lock lock) {
						return lock.getClassName();
					}
				},
				new BiConsumer<Lock, String>() {
					@Override
					public void accept(Lock lock, String className) {
						lock.setClassName(className);
					}
				});
		}
	}

	public static class KeyAccessor extends ModelPropertyAccessor {
		public KeyAccessor() {
			super(new Function<Lock, String>() {
					@Override
					public String apply(Lock lock) {
						return lock.getKey();
					}
				},
				new BiConsumer<Lock, String>() {
					@Override
					public void accept(Lock lock, String key) {
						lock.setKey(key);
					}
				});
		}
	}

	public static class OwnerAccessor extends ModelPropertyAccessor {
		public OwnerAccessor() {
			super(new Function<Lock, String>() {
					@Override
					public String apply(Lock lock) {
						return lock.getOwner();
					}
				},
				new BiConsumer<Lock, String>() {
					@Override
					public void accept(Lock lock, String owner) {
						lock.setOwner(owner);
					}
				});
		}
	}

	public static class InheritableAccessor extends ModelPropertyAccessor {
		public InheritableAccessor() {
			super(new Function<Lock, Boolean>() {
					@Override
					public Boolean apply(Lock lock) {
						return lock.getInheritable();
					}
				},
				new BiConsumer<Lock, Boolean>() {
					@Override
					public void accept(Lock lock, Boolean inheritable) {
						lock.setInheritable(inheritable);
					}
				});
		}
	}

	public static class ExpirationDateAccessor extends ModelPropertyAccessor {
		public ExpirationDateAccessor() {
			super(new Function<Lock, Date>() {
					@Override
					public Date apply(Lock lock) {
						return lock.getExpirationDate();
					}
				},
				new BiConsumer<Lock, Date>() {
					@Override
					public void accept(Lock lock, Date expirationDate) {
						lock.setExpirationDate(expirationDate);
					}
				});
		}
	}

	private LockModelAccessors() {
	}
}