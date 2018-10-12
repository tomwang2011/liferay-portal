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
import com.liferay.portal.kernel.model.EmailAddress;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmailAddressModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<EmailAddress, String>() {
					@Override
					public String apply(EmailAddress emailAddress) {
						return emailAddress.getUuid();
					}
				},
				new BiConsumer<EmailAddress, String>() {
					@Override
					public void accept(EmailAddress emailAddress, String uuid) {
						emailAddress.setUuid(uuid);
					}
				});
		}
	}

	public static class EmailAddressIdAccessor extends ModelPropertyAccessor {
		public EmailAddressIdAccessor() {
			super(new Function<EmailAddress, Long>() {
					@Override
					public Long apply(EmailAddress emailAddress) {
						return emailAddress.getEmailAddressId();
					}
				},
				new BiConsumer<EmailAddress, Long>() {
					@Override
					public void accept(EmailAddress emailAddress,
						Long emailAddressId) {
						emailAddress.setEmailAddressId(emailAddressId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<EmailAddress, Long>() {
					@Override
					public Long apply(EmailAddress emailAddress) {
						return emailAddress.getCompanyId();
					}
				},
				new BiConsumer<EmailAddress, Long>() {
					@Override
					public void accept(EmailAddress emailAddress, Long companyId) {
						emailAddress.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<EmailAddress, Long>() {
					@Override
					public Long apply(EmailAddress emailAddress) {
						return emailAddress.getUserId();
					}
				},
				new BiConsumer<EmailAddress, Long>() {
					@Override
					public void accept(EmailAddress emailAddress, Long userId) {
						emailAddress.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<EmailAddress, String>() {
					@Override
					public String apply(EmailAddress emailAddress) {
						return emailAddress.getUserName();
					}
				},
				new BiConsumer<EmailAddress, String>() {
					@Override
					public void accept(EmailAddress emailAddress,
						String userName) {
						emailAddress.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<EmailAddress, Date>() {
					@Override
					public Date apply(EmailAddress emailAddress) {
						return emailAddress.getCreateDate();
					}
				},
				new BiConsumer<EmailAddress, Date>() {
					@Override
					public void accept(EmailAddress emailAddress,
						Date createDate) {
						emailAddress.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<EmailAddress, Date>() {
					@Override
					public Date apply(EmailAddress emailAddress) {
						return emailAddress.getModifiedDate();
					}
				},
				new BiConsumer<EmailAddress, Date>() {
					@Override
					public void accept(EmailAddress emailAddress,
						Date modifiedDate) {
						emailAddress.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<EmailAddress, Long>() {
					@Override
					public Long apply(EmailAddress emailAddress) {
						return emailAddress.getClassNameId();
					}
				},
				new BiConsumer<EmailAddress, Long>() {
					@Override
					public void accept(EmailAddress emailAddress,
						Long classNameId) {
						emailAddress.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<EmailAddress, Long>() {
					@Override
					public Long apply(EmailAddress emailAddress) {
						return emailAddress.getClassPK();
					}
				},
				new BiConsumer<EmailAddress, Long>() {
					@Override
					public void accept(EmailAddress emailAddress, Long classPK) {
						emailAddress.setClassPK(classPK);
					}
				});
		}
	}

	public static class AddressAccessor extends ModelPropertyAccessor {
		public AddressAccessor() {
			super(new Function<EmailAddress, String>() {
					@Override
					public String apply(EmailAddress emailAddress) {
						return emailAddress.getAddress();
					}
				},
				new BiConsumer<EmailAddress, String>() {
					@Override
					public void accept(EmailAddress emailAddress, String address) {
						emailAddress.setAddress(address);
					}
				});
		}
	}

	public static class TypeIdAccessor extends ModelPropertyAccessor {
		public TypeIdAccessor() {
			super(new Function<EmailAddress, Long>() {
					@Override
					public Long apply(EmailAddress emailAddress) {
						return emailAddress.getTypeId();
					}
				},
				new BiConsumer<EmailAddress, Long>() {
					@Override
					public void accept(EmailAddress emailAddress, Long typeId) {
						emailAddress.setTypeId(typeId);
					}
				});
		}
	}

	public static class PrimaryAccessor extends ModelPropertyAccessor {
		public PrimaryAccessor() {
			super(new Function<EmailAddress, Boolean>() {
					@Override
					public Boolean apply(EmailAddress emailAddress) {
						return emailAddress.getPrimary();
					}
				},
				new BiConsumer<EmailAddress, Boolean>() {
					@Override
					public void accept(EmailAddress emailAddress,
						Boolean primary) {
						emailAddress.setPrimary(primary);
					}
				});
		}
	}

	private EmailAddressModelAccessors() {
	}
}