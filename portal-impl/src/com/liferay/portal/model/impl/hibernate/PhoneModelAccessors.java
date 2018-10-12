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
import com.liferay.portal.kernel.model.Phone;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PhoneModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<Phone, String>() {
					@Override
					public String apply(Phone phone) {
						return phone.getUuid();
					}
				},
				new BiConsumer<Phone, String>() {
					@Override
					public void accept(Phone phone, String uuid) {
						phone.setUuid(uuid);
					}
				});
		}
	}

	public static class PhoneIdAccessor extends ModelPropertyAccessor {
		public PhoneIdAccessor() {
			super(new Function<Phone, Long>() {
					@Override
					public Long apply(Phone phone) {
						return phone.getPhoneId();
					}
				},
				new BiConsumer<Phone, Long>() {
					@Override
					public void accept(Phone phone, Long phoneId) {
						phone.setPhoneId(phoneId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Phone, Long>() {
					@Override
					public Long apply(Phone phone) {
						return phone.getCompanyId();
					}
				},
				new BiConsumer<Phone, Long>() {
					@Override
					public void accept(Phone phone, Long companyId) {
						phone.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<Phone, Long>() {
					@Override
					public Long apply(Phone phone) {
						return phone.getUserId();
					}
				},
				new BiConsumer<Phone, Long>() {
					@Override
					public void accept(Phone phone, Long userId) {
						phone.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<Phone, String>() {
					@Override
					public String apply(Phone phone) {
						return phone.getUserName();
					}
				},
				new BiConsumer<Phone, String>() {
					@Override
					public void accept(Phone phone, String userName) {
						phone.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Phone, Date>() {
					@Override
					public Date apply(Phone phone) {
						return phone.getCreateDate();
					}
				},
				new BiConsumer<Phone, Date>() {
					@Override
					public void accept(Phone phone, Date createDate) {
						phone.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<Phone, Date>() {
					@Override
					public Date apply(Phone phone) {
						return phone.getModifiedDate();
					}
				},
				new BiConsumer<Phone, Date>() {
					@Override
					public void accept(Phone phone, Date modifiedDate) {
						phone.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<Phone, Long>() {
					@Override
					public Long apply(Phone phone) {
						return phone.getClassNameId();
					}
				},
				new BiConsumer<Phone, Long>() {
					@Override
					public void accept(Phone phone, Long classNameId) {
						phone.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<Phone, Long>() {
					@Override
					public Long apply(Phone phone) {
						return phone.getClassPK();
					}
				},
				new BiConsumer<Phone, Long>() {
					@Override
					public void accept(Phone phone, Long classPK) {
						phone.setClassPK(classPK);
					}
				});
		}
	}

	public static class NumberAccessor extends ModelPropertyAccessor {
		public NumberAccessor() {
			super(new Function<Phone, String>() {
					@Override
					public String apply(Phone phone) {
						return phone.getNumber();
					}
				},
				new BiConsumer<Phone, String>() {
					@Override
					public void accept(Phone phone, String number) {
						phone.setNumber(number);
					}
				});
		}
	}

	public static class ExtensionAccessor extends ModelPropertyAccessor {
		public ExtensionAccessor() {
			super(new Function<Phone, String>() {
					@Override
					public String apply(Phone phone) {
						return phone.getExtension();
					}
				},
				new BiConsumer<Phone, String>() {
					@Override
					public void accept(Phone phone, String extension) {
						phone.setExtension(extension);
					}
				});
		}
	}

	public static class TypeIdAccessor extends ModelPropertyAccessor {
		public TypeIdAccessor() {
			super(new Function<Phone, Long>() {
					@Override
					public Long apply(Phone phone) {
						return phone.getTypeId();
					}
				},
				new BiConsumer<Phone, Long>() {
					@Override
					public void accept(Phone phone, Long typeId) {
						phone.setTypeId(typeId);
					}
				});
		}
	}

	public static class PrimaryAccessor extends ModelPropertyAccessor {
		public PrimaryAccessor() {
			super(new Function<Phone, Boolean>() {
					@Override
					public Boolean apply(Phone phone) {
						return phone.getPrimary();
					}
				},
				new BiConsumer<Phone, Boolean>() {
					@Override
					public void accept(Phone phone, Boolean primary) {
						phone.setPrimary(primary);
					}
				});
		}
	}

	private PhoneModelAccessors() {
	}
}