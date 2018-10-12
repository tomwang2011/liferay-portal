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
import com.liferay.portal.kernel.model.User;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getUuid();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String uuid) {
						user.setUuid(uuid);
					}
				});
		}
	}

	public static class ExternalReferenceCodeAccessor
		extends ModelPropertyAccessor {
		public ExternalReferenceCodeAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getExternalReferenceCode();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String externalReferenceCode) {
						user.setExternalReferenceCode(externalReferenceCode);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<User, Long>() {
					@Override
					public Long apply(User user) {
						return user.getUserId();
					}
				},
				new BiConsumer<User, Long>() {
					@Override
					public void accept(User user, Long userId) {
						user.setUserId(userId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<User, Long>() {
					@Override
					public Long apply(User user) {
						return user.getCompanyId();
					}
				},
				new BiConsumer<User, Long>() {
					@Override
					public void accept(User user, Long companyId) {
						user.setCompanyId(companyId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<User, Date>() {
					@Override
					public Date apply(User user) {
						return user.getCreateDate();
					}
				},
				new BiConsumer<User, Date>() {
					@Override
					public void accept(User user, Date createDate) {
						user.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<User, Date>() {
					@Override
					public Date apply(User user) {
						return user.getModifiedDate();
					}
				},
				new BiConsumer<User, Date>() {
					@Override
					public void accept(User user, Date modifiedDate) {
						user.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class DefaultUserAccessor extends ModelPropertyAccessor {
		public DefaultUserAccessor() {
			super(new Function<User, Boolean>() {
					@Override
					public Boolean apply(User user) {
						return user.getDefaultUser();
					}
				},
				new BiConsumer<User, Boolean>() {
					@Override
					public void accept(User user, Boolean defaultUser) {
						user.setDefaultUser(defaultUser);
					}
				});
		}
	}

	public static class ContactIdAccessor extends ModelPropertyAccessor {
		public ContactIdAccessor() {
			super(new Function<User, Long>() {
					@Override
					public Long apply(User user) {
						return user.getContactId();
					}
				},
				new BiConsumer<User, Long>() {
					@Override
					public void accept(User user, Long contactId) {
						user.setContactId(contactId);
					}
				});
		}
	}

	public static class PasswordAccessor extends ModelPropertyAccessor {
		public PasswordAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getPassword();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String password) {
						user.setPassword(password);
					}
				});
		}
	}

	public static class PasswordEncryptedAccessor extends ModelPropertyAccessor {
		public PasswordEncryptedAccessor() {
			super(new Function<User, Boolean>() {
					@Override
					public Boolean apply(User user) {
						return user.getPasswordEncrypted();
					}
				},
				new BiConsumer<User, Boolean>() {
					@Override
					public void accept(User user, Boolean passwordEncrypted) {
						user.setPasswordEncrypted(passwordEncrypted);
					}
				});
		}
	}

	public static class PasswordResetAccessor extends ModelPropertyAccessor {
		public PasswordResetAccessor() {
			super(new Function<User, Boolean>() {
					@Override
					public Boolean apply(User user) {
						return user.getPasswordReset();
					}
				},
				new BiConsumer<User, Boolean>() {
					@Override
					public void accept(User user, Boolean passwordReset) {
						user.setPasswordReset(passwordReset);
					}
				});
		}
	}

	public static class PasswordModifiedDateAccessor
		extends ModelPropertyAccessor {
		public PasswordModifiedDateAccessor() {
			super(new Function<User, Date>() {
					@Override
					public Date apply(User user) {
						return user.getPasswordModifiedDate();
					}
				},
				new BiConsumer<User, Date>() {
					@Override
					public void accept(User user, Date passwordModifiedDate) {
						user.setPasswordModifiedDate(passwordModifiedDate);
					}
				});
		}
	}

	public static class DigestAccessor extends ModelPropertyAccessor {
		public DigestAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getDigest();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String digest) {
						user.setDigest(digest);
					}
				});
		}
	}

	public static class ReminderQueryQuestionAccessor
		extends ModelPropertyAccessor {
		public ReminderQueryQuestionAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getReminderQueryQuestion();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String reminderQueryQuestion) {
						user.setReminderQueryQuestion(reminderQueryQuestion);
					}
				});
		}
	}

	public static class ReminderQueryAnswerAccessor
		extends ModelPropertyAccessor {
		public ReminderQueryAnswerAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getReminderQueryAnswer();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String reminderQueryAnswer) {
						user.setReminderQueryAnswer(reminderQueryAnswer);
					}
				});
		}
	}

	public static class GraceLoginCountAccessor extends ModelPropertyAccessor {
		public GraceLoginCountAccessor() {
			super(new Function<User, Integer>() {
					@Override
					public Integer apply(User user) {
						return user.getGraceLoginCount();
					}
				},
				new BiConsumer<User, Integer>() {
					@Override
					public void accept(User user, Integer graceLoginCount) {
						user.setGraceLoginCount(graceLoginCount);
					}
				});
		}
	}

	public static class ScreenNameAccessor extends ModelPropertyAccessor {
		public ScreenNameAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getScreenName();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String screenName) {
						user.setScreenName(screenName);
					}
				});
		}
	}

	public static class EmailAddressAccessor extends ModelPropertyAccessor {
		public EmailAddressAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getEmailAddress();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String emailAddress) {
						user.setEmailAddress(emailAddress);
					}
				});
		}
	}

	public static class FacebookIdAccessor extends ModelPropertyAccessor {
		public FacebookIdAccessor() {
			super(new Function<User, Long>() {
					@Override
					public Long apply(User user) {
						return user.getFacebookId();
					}
				},
				new BiConsumer<User, Long>() {
					@Override
					public void accept(User user, Long facebookId) {
						user.setFacebookId(facebookId);
					}
				});
		}
	}

	public static class GoogleUserIdAccessor extends ModelPropertyAccessor {
		public GoogleUserIdAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getGoogleUserId();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String googleUserId) {
						user.setGoogleUserId(googleUserId);
					}
				});
		}
	}

	public static class LdapServerIdAccessor extends ModelPropertyAccessor {
		public LdapServerIdAccessor() {
			super(new Function<User, Long>() {
					@Override
					public Long apply(User user) {
						return user.getLdapServerId();
					}
				},
				new BiConsumer<User, Long>() {
					@Override
					public void accept(User user, Long ldapServerId) {
						user.setLdapServerId(ldapServerId);
					}
				});
		}
	}

	public static class OpenIdAccessor extends ModelPropertyAccessor {
		public OpenIdAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getOpenId();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String openId) {
						user.setOpenId(openId);
					}
				});
		}
	}

	public static class PortraitIdAccessor extends ModelPropertyAccessor {
		public PortraitIdAccessor() {
			super(new Function<User, Long>() {
					@Override
					public Long apply(User user) {
						return user.getPortraitId();
					}
				},
				new BiConsumer<User, Long>() {
					@Override
					public void accept(User user, Long portraitId) {
						user.setPortraitId(portraitId);
					}
				});
		}
	}

	public static class LanguageIdAccessor extends ModelPropertyAccessor {
		public LanguageIdAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getLanguageId();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String languageId) {
						user.setLanguageId(languageId);
					}
				});
		}
	}

	public static class TimeZoneIdAccessor extends ModelPropertyAccessor {
		public TimeZoneIdAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getTimeZoneId();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String timeZoneId) {
						user.setTimeZoneId(timeZoneId);
					}
				});
		}
	}

	public static class GreetingAccessor extends ModelPropertyAccessor {
		public GreetingAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getGreeting();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String greeting) {
						user.setGreeting(greeting);
					}
				});
		}
	}

	public static class CommentsAccessor extends ModelPropertyAccessor {
		public CommentsAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getComments();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String comments) {
						user.setComments(comments);
					}
				});
		}
	}

	public static class FirstNameAccessor extends ModelPropertyAccessor {
		public FirstNameAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getFirstName();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String firstName) {
						user.setFirstName(firstName);
					}
				});
		}
	}

	public static class MiddleNameAccessor extends ModelPropertyAccessor {
		public MiddleNameAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getMiddleName();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String middleName) {
						user.setMiddleName(middleName);
					}
				});
		}
	}

	public static class LastNameAccessor extends ModelPropertyAccessor {
		public LastNameAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getLastName();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String lastName) {
						user.setLastName(lastName);
					}
				});
		}
	}

	public static class JobTitleAccessor extends ModelPropertyAccessor {
		public JobTitleAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getJobTitle();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String jobTitle) {
						user.setJobTitle(jobTitle);
					}
				});
		}
	}

	public static class LoginDateAccessor extends ModelPropertyAccessor {
		public LoginDateAccessor() {
			super(new Function<User, Date>() {
					@Override
					public Date apply(User user) {
						return user.getLoginDate();
					}
				},
				new BiConsumer<User, Date>() {
					@Override
					public void accept(User user, Date loginDate) {
						user.setLoginDate(loginDate);
					}
				});
		}
	}

	public static class LoginIPAccessor extends ModelPropertyAccessor {
		public LoginIPAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getLoginIP();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String loginIP) {
						user.setLoginIP(loginIP);
					}
				});
		}
	}

	public static class LastLoginDateAccessor extends ModelPropertyAccessor {
		public LastLoginDateAccessor() {
			super(new Function<User, Date>() {
					@Override
					public Date apply(User user) {
						return user.getLastLoginDate();
					}
				},
				new BiConsumer<User, Date>() {
					@Override
					public void accept(User user, Date lastLoginDate) {
						user.setLastLoginDate(lastLoginDate);
					}
				});
		}
	}

	public static class LastLoginIPAccessor extends ModelPropertyAccessor {
		public LastLoginIPAccessor() {
			super(new Function<User, String>() {
					@Override
					public String apply(User user) {
						return user.getLastLoginIP();
					}
				},
				new BiConsumer<User, String>() {
					@Override
					public void accept(User user, String lastLoginIP) {
						user.setLastLoginIP(lastLoginIP);
					}
				});
		}
	}

	public static class LastFailedLoginDateAccessor
		extends ModelPropertyAccessor {
		public LastFailedLoginDateAccessor() {
			super(new Function<User, Date>() {
					@Override
					public Date apply(User user) {
						return user.getLastFailedLoginDate();
					}
				},
				new BiConsumer<User, Date>() {
					@Override
					public void accept(User user, Date lastFailedLoginDate) {
						user.setLastFailedLoginDate(lastFailedLoginDate);
					}
				});
		}
	}

	public static class FailedLoginAttemptsAccessor
		extends ModelPropertyAccessor {
		public FailedLoginAttemptsAccessor() {
			super(new Function<User, Integer>() {
					@Override
					public Integer apply(User user) {
						return user.getFailedLoginAttempts();
					}
				},
				new BiConsumer<User, Integer>() {
					@Override
					public void accept(User user, Integer failedLoginAttempts) {
						user.setFailedLoginAttempts(failedLoginAttempts);
					}
				});
		}
	}

	public static class LockoutAccessor extends ModelPropertyAccessor {
		public LockoutAccessor() {
			super(new Function<User, Boolean>() {
					@Override
					public Boolean apply(User user) {
						return user.getLockout();
					}
				},
				new BiConsumer<User, Boolean>() {
					@Override
					public void accept(User user, Boolean lockout) {
						user.setLockout(lockout);
					}
				});
		}
	}

	public static class LockoutDateAccessor extends ModelPropertyAccessor {
		public LockoutDateAccessor() {
			super(new Function<User, Date>() {
					@Override
					public Date apply(User user) {
						return user.getLockoutDate();
					}
				},
				new BiConsumer<User, Date>() {
					@Override
					public void accept(User user, Date lockoutDate) {
						user.setLockoutDate(lockoutDate);
					}
				});
		}
	}

	public static class AgreedToTermsOfUseAccessor extends ModelPropertyAccessor {
		public AgreedToTermsOfUseAccessor() {
			super(new Function<User, Boolean>() {
					@Override
					public Boolean apply(User user) {
						return user.getAgreedToTermsOfUse();
					}
				},
				new BiConsumer<User, Boolean>() {
					@Override
					public void accept(User user, Boolean agreedToTermsOfUse) {
						user.setAgreedToTermsOfUse(agreedToTermsOfUse);
					}
				});
		}
	}

	public static class EmailAddressVerifiedAccessor
		extends ModelPropertyAccessor {
		public EmailAddressVerifiedAccessor() {
			super(new Function<User, Boolean>() {
					@Override
					public Boolean apply(User user) {
						return user.getEmailAddressVerified();
					}
				},
				new BiConsumer<User, Boolean>() {
					@Override
					public void accept(User user, Boolean emailAddressVerified) {
						user.setEmailAddressVerified(emailAddressVerified);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<User, Integer>() {
					@Override
					public Integer apply(User user) {
						return user.getStatus();
					}
				},
				new BiConsumer<User, Integer>() {
					@Override
					public void accept(User user, Integer status) {
						user.setStatus(status);
					}
				});
		}
	}

	private UserModelAccessors() {
	}
}