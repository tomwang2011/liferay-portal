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
import com.liferay.portal.kernel.model.Contact;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ContactModelAccessors {
	public static class ContactIdAccessor extends ModelPropertyAccessor {
		public ContactIdAccessor() {
			super(new Function<Contact, Long>() {
					@Override
					public Long apply(Contact contact) {
						return contact.getContactId();
					}
				},
				new BiConsumer<Contact, Long>() {
					@Override
					public void accept(Contact contact, Long contactId) {
						contact.setContactId(contactId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Contact, Long>() {
					@Override
					public Long apply(Contact contact) {
						return contact.getCompanyId();
					}
				},
				new BiConsumer<Contact, Long>() {
					@Override
					public void accept(Contact contact, Long companyId) {
						contact.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<Contact, Long>() {
					@Override
					public Long apply(Contact contact) {
						return contact.getUserId();
					}
				},
				new BiConsumer<Contact, Long>() {
					@Override
					public void accept(Contact contact, Long userId) {
						contact.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<Contact, String>() {
					@Override
					public String apply(Contact contact) {
						return contact.getUserName();
					}
				},
				new BiConsumer<Contact, String>() {
					@Override
					public void accept(Contact contact, String userName) {
						contact.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Contact, Date>() {
					@Override
					public Date apply(Contact contact) {
						return contact.getCreateDate();
					}
				},
				new BiConsumer<Contact, Date>() {
					@Override
					public void accept(Contact contact, Date createDate) {
						contact.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<Contact, Date>() {
					@Override
					public Date apply(Contact contact) {
						return contact.getModifiedDate();
					}
				},
				new BiConsumer<Contact, Date>() {
					@Override
					public void accept(Contact contact, Date modifiedDate) {
						contact.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<Contact, Long>() {
					@Override
					public Long apply(Contact contact) {
						return contact.getClassNameId();
					}
				},
				new BiConsumer<Contact, Long>() {
					@Override
					public void accept(Contact contact, Long classNameId) {
						contact.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<Contact, Long>() {
					@Override
					public Long apply(Contact contact) {
						return contact.getClassPK();
					}
				},
				new BiConsumer<Contact, Long>() {
					@Override
					public void accept(Contact contact, Long classPK) {
						contact.setClassPK(classPK);
					}
				});
		}
	}

	public static class AccountIdAccessor extends ModelPropertyAccessor {
		public AccountIdAccessor() {
			super(new Function<Contact, Long>() {
					@Override
					public Long apply(Contact contact) {
						return contact.getAccountId();
					}
				},
				new BiConsumer<Contact, Long>() {
					@Override
					public void accept(Contact contact, Long accountId) {
						contact.setAccountId(accountId);
					}
				});
		}
	}

	public static class ParentContactIdAccessor extends ModelPropertyAccessor {
		public ParentContactIdAccessor() {
			super(new Function<Contact, Long>() {
					@Override
					public Long apply(Contact contact) {
						return contact.getParentContactId();
					}
				},
				new BiConsumer<Contact, Long>() {
					@Override
					public void accept(Contact contact, Long parentContactId) {
						contact.setParentContactId(parentContactId);
					}
				});
		}
	}

	public static class EmailAddressAccessor extends ModelPropertyAccessor {
		public EmailAddressAccessor() {
			super(new Function<Contact, String>() {
					@Override
					public String apply(Contact contact) {
						return contact.getEmailAddress();
					}
				},
				new BiConsumer<Contact, String>() {
					@Override
					public void accept(Contact contact, String emailAddress) {
						contact.setEmailAddress(emailAddress);
					}
				});
		}
	}

	public static class FirstNameAccessor extends ModelPropertyAccessor {
		public FirstNameAccessor() {
			super(new Function<Contact, String>() {
					@Override
					public String apply(Contact contact) {
						return contact.getFirstName();
					}
				},
				new BiConsumer<Contact, String>() {
					@Override
					public void accept(Contact contact, String firstName) {
						contact.setFirstName(firstName);
					}
				});
		}
	}

	public static class MiddleNameAccessor extends ModelPropertyAccessor {
		public MiddleNameAccessor() {
			super(new Function<Contact, String>() {
					@Override
					public String apply(Contact contact) {
						return contact.getMiddleName();
					}
				},
				new BiConsumer<Contact, String>() {
					@Override
					public void accept(Contact contact, String middleName) {
						contact.setMiddleName(middleName);
					}
				});
		}
	}

	public static class LastNameAccessor extends ModelPropertyAccessor {
		public LastNameAccessor() {
			super(new Function<Contact, String>() {
					@Override
					public String apply(Contact contact) {
						return contact.getLastName();
					}
				},
				new BiConsumer<Contact, String>() {
					@Override
					public void accept(Contact contact, String lastName) {
						contact.setLastName(lastName);
					}
				});
		}
	}

	public static class PrefixIdAccessor extends ModelPropertyAccessor {
		public PrefixIdAccessor() {
			super(new Function<Contact, Long>() {
					@Override
					public Long apply(Contact contact) {
						return contact.getPrefixId();
					}
				},
				new BiConsumer<Contact, Long>() {
					@Override
					public void accept(Contact contact, Long prefixId) {
						contact.setPrefixId(prefixId);
					}
				});
		}
	}

	public static class SuffixIdAccessor extends ModelPropertyAccessor {
		public SuffixIdAccessor() {
			super(new Function<Contact, Long>() {
					@Override
					public Long apply(Contact contact) {
						return contact.getSuffixId();
					}
				},
				new BiConsumer<Contact, Long>() {
					@Override
					public void accept(Contact contact, Long suffixId) {
						contact.setSuffixId(suffixId);
					}
				});
		}
	}

	public static class MaleAccessor extends ModelPropertyAccessor {
		public MaleAccessor() {
			super(new Function<Contact, Boolean>() {
					@Override
					public Boolean apply(Contact contact) {
						return contact.getMale();
					}
				},
				new BiConsumer<Contact, Boolean>() {
					@Override
					public void accept(Contact contact, Boolean male) {
						contact.setMale(male);
					}
				});
		}
	}

	public static class BirthdayAccessor extends ModelPropertyAccessor {
		public BirthdayAccessor() {
			super(new Function<Contact, Date>() {
					@Override
					public Date apply(Contact contact) {
						return contact.getBirthday();
					}
				},
				new BiConsumer<Contact, Date>() {
					@Override
					public void accept(Contact contact, Date birthday) {
						contact.setBirthday(birthday);
					}
				});
		}
	}

	public static class SmsSnAccessor extends ModelPropertyAccessor {
		public SmsSnAccessor() {
			super(new Function<Contact, String>() {
					@Override
					public String apply(Contact contact) {
						return contact.getSmsSn();
					}
				},
				new BiConsumer<Contact, String>() {
					@Override
					public void accept(Contact contact, String smsSn) {
						contact.setSmsSn(smsSn);
					}
				});
		}
	}

	public static class FacebookSnAccessor extends ModelPropertyAccessor {
		public FacebookSnAccessor() {
			super(new Function<Contact, String>() {
					@Override
					public String apply(Contact contact) {
						return contact.getFacebookSn();
					}
				},
				new BiConsumer<Contact, String>() {
					@Override
					public void accept(Contact contact, String facebookSn) {
						contact.setFacebookSn(facebookSn);
					}
				});
		}
	}

	public static class JabberSnAccessor extends ModelPropertyAccessor {
		public JabberSnAccessor() {
			super(new Function<Contact, String>() {
					@Override
					public String apply(Contact contact) {
						return contact.getJabberSn();
					}
				},
				new BiConsumer<Contact, String>() {
					@Override
					public void accept(Contact contact, String jabberSn) {
						contact.setJabberSn(jabberSn);
					}
				});
		}
	}

	public static class SkypeSnAccessor extends ModelPropertyAccessor {
		public SkypeSnAccessor() {
			super(new Function<Contact, String>() {
					@Override
					public String apply(Contact contact) {
						return contact.getSkypeSn();
					}
				},
				new BiConsumer<Contact, String>() {
					@Override
					public void accept(Contact contact, String skypeSn) {
						contact.setSkypeSn(skypeSn);
					}
				});
		}
	}

	public static class TwitterSnAccessor extends ModelPropertyAccessor {
		public TwitterSnAccessor() {
			super(new Function<Contact, String>() {
					@Override
					public String apply(Contact contact) {
						return contact.getTwitterSn();
					}
				},
				new BiConsumer<Contact, String>() {
					@Override
					public void accept(Contact contact, String twitterSn) {
						contact.setTwitterSn(twitterSn);
					}
				});
		}
	}

	public static class EmployeeStatusIdAccessor extends ModelPropertyAccessor {
		public EmployeeStatusIdAccessor() {
			super(new Function<Contact, String>() {
					@Override
					public String apply(Contact contact) {
						return contact.getEmployeeStatusId();
					}
				},
				new BiConsumer<Contact, String>() {
					@Override
					public void accept(Contact contact, String employeeStatusId) {
						contact.setEmployeeStatusId(employeeStatusId);
					}
				});
		}
	}

	public static class EmployeeNumberAccessor extends ModelPropertyAccessor {
		public EmployeeNumberAccessor() {
			super(new Function<Contact, String>() {
					@Override
					public String apply(Contact contact) {
						return contact.getEmployeeNumber();
					}
				},
				new BiConsumer<Contact, String>() {
					@Override
					public void accept(Contact contact, String employeeNumber) {
						contact.setEmployeeNumber(employeeNumber);
					}
				});
		}
	}

	public static class JobTitleAccessor extends ModelPropertyAccessor {
		public JobTitleAccessor() {
			super(new Function<Contact, String>() {
					@Override
					public String apply(Contact contact) {
						return contact.getJobTitle();
					}
				},
				new BiConsumer<Contact, String>() {
					@Override
					public void accept(Contact contact, String jobTitle) {
						contact.setJobTitle(jobTitle);
					}
				});
		}
	}

	public static class JobClassAccessor extends ModelPropertyAccessor {
		public JobClassAccessor() {
			super(new Function<Contact, String>() {
					@Override
					public String apply(Contact contact) {
						return contact.getJobClass();
					}
				},
				new BiConsumer<Contact, String>() {
					@Override
					public void accept(Contact contact, String jobClass) {
						contact.setJobClass(jobClass);
					}
				});
		}
	}

	public static class HoursOfOperationAccessor extends ModelPropertyAccessor {
		public HoursOfOperationAccessor() {
			super(new Function<Contact, String>() {
					@Override
					public String apply(Contact contact) {
						return contact.getHoursOfOperation();
					}
				},
				new BiConsumer<Contact, String>() {
					@Override
					public void accept(Contact contact, String hoursOfOperation) {
						contact.setHoursOfOperation(hoursOfOperation);
					}
				});
		}
	}

	private ContactModelAccessors() {
	}
}