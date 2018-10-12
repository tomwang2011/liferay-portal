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
import com.liferay.portal.kernel.model.PasswordPolicy;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PasswordPolicyModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<PasswordPolicy, String>() {
					@Override
					public String apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getUuid();
					}
				},
				new BiConsumer<PasswordPolicy, String>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						String uuid) {
						passwordPolicy.setUuid(uuid);
					}
				});
		}
	}

	public static class PasswordPolicyIdAccessor extends ModelPropertyAccessor {
		public PasswordPolicyIdAccessor() {
			super(new Function<PasswordPolicy, Long>() {
					@Override
					public Long apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getPasswordPolicyId();
					}
				},
				new BiConsumer<PasswordPolicy, Long>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Long passwordPolicyId) {
						passwordPolicy.setPasswordPolicyId(passwordPolicyId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<PasswordPolicy, Long>() {
					@Override
					public Long apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getCompanyId();
					}
				},
				new BiConsumer<PasswordPolicy, Long>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Long companyId) {
						passwordPolicy.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<PasswordPolicy, Long>() {
					@Override
					public Long apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getUserId();
					}
				},
				new BiConsumer<PasswordPolicy, Long>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Long userId) {
						passwordPolicy.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<PasswordPolicy, String>() {
					@Override
					public String apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getUserName();
					}
				},
				new BiConsumer<PasswordPolicy, String>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						String userName) {
						passwordPolicy.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<PasswordPolicy, Date>() {
					@Override
					public Date apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getCreateDate();
					}
				},
				new BiConsumer<PasswordPolicy, Date>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Date createDate) {
						passwordPolicy.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<PasswordPolicy, Date>() {
					@Override
					public Date apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getModifiedDate();
					}
				},
				new BiConsumer<PasswordPolicy, Date>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Date modifiedDate) {
						passwordPolicy.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class DefaultPolicyAccessor extends ModelPropertyAccessor {
		public DefaultPolicyAccessor() {
			super(new Function<PasswordPolicy, Boolean>() {
					@Override
					public Boolean apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getDefaultPolicy();
					}
				},
				new BiConsumer<PasswordPolicy, Boolean>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Boolean defaultPolicy) {
						passwordPolicy.setDefaultPolicy(defaultPolicy);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<PasswordPolicy, String>() {
					@Override
					public String apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getName();
					}
				},
				new BiConsumer<PasswordPolicy, String>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						String name) {
						passwordPolicy.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<PasswordPolicy, String>() {
					@Override
					public String apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getDescription();
					}
				},
				new BiConsumer<PasswordPolicy, String>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						String description) {
						passwordPolicy.setDescription(description);
					}
				});
		}
	}

	public static class ChangeableAccessor extends ModelPropertyAccessor {
		public ChangeableAccessor() {
			super(new Function<PasswordPolicy, Boolean>() {
					@Override
					public Boolean apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getChangeable();
					}
				},
				new BiConsumer<PasswordPolicy, Boolean>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Boolean changeable) {
						passwordPolicy.setChangeable(changeable);
					}
				});
		}
	}

	public static class ChangeRequiredAccessor extends ModelPropertyAccessor {
		public ChangeRequiredAccessor() {
			super(new Function<PasswordPolicy, Boolean>() {
					@Override
					public Boolean apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getChangeRequired();
					}
				},
				new BiConsumer<PasswordPolicy, Boolean>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Boolean changeRequired) {
						passwordPolicy.setChangeRequired(changeRequired);
					}
				});
		}
	}

	public static class MinAgeAccessor extends ModelPropertyAccessor {
		public MinAgeAccessor() {
			super(new Function<PasswordPolicy, Long>() {
					@Override
					public Long apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getMinAge();
					}
				},
				new BiConsumer<PasswordPolicy, Long>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Long minAge) {
						passwordPolicy.setMinAge(minAge);
					}
				});
		}
	}

	public static class CheckSyntaxAccessor extends ModelPropertyAccessor {
		public CheckSyntaxAccessor() {
			super(new Function<PasswordPolicy, Boolean>() {
					@Override
					public Boolean apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getCheckSyntax();
					}
				},
				new BiConsumer<PasswordPolicy, Boolean>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Boolean checkSyntax) {
						passwordPolicy.setCheckSyntax(checkSyntax);
					}
				});
		}
	}

	public static class AllowDictionaryWordsAccessor
		extends ModelPropertyAccessor {
		public AllowDictionaryWordsAccessor() {
			super(new Function<PasswordPolicy, Boolean>() {
					@Override
					public Boolean apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getAllowDictionaryWords();
					}
				},
				new BiConsumer<PasswordPolicy, Boolean>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Boolean allowDictionaryWords) {
						passwordPolicy.setAllowDictionaryWords(allowDictionaryWords);
					}
				});
		}
	}

	public static class MinAlphanumericAccessor extends ModelPropertyAccessor {
		public MinAlphanumericAccessor() {
			super(new Function<PasswordPolicy, Integer>() {
					@Override
					public Integer apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getMinAlphanumeric();
					}
				},
				new BiConsumer<PasswordPolicy, Integer>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Integer minAlphanumeric) {
						passwordPolicy.setMinAlphanumeric(minAlphanumeric);
					}
				});
		}
	}

	public static class MinLengthAccessor extends ModelPropertyAccessor {
		public MinLengthAccessor() {
			super(new Function<PasswordPolicy, Integer>() {
					@Override
					public Integer apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getMinLength();
					}
				},
				new BiConsumer<PasswordPolicy, Integer>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Integer minLength) {
						passwordPolicy.setMinLength(minLength);
					}
				});
		}
	}

	public static class MinLowerCaseAccessor extends ModelPropertyAccessor {
		public MinLowerCaseAccessor() {
			super(new Function<PasswordPolicy, Integer>() {
					@Override
					public Integer apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getMinLowerCase();
					}
				},
				new BiConsumer<PasswordPolicy, Integer>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Integer minLowerCase) {
						passwordPolicy.setMinLowerCase(minLowerCase);
					}
				});
		}
	}

	public static class MinNumbersAccessor extends ModelPropertyAccessor {
		public MinNumbersAccessor() {
			super(new Function<PasswordPolicy, Integer>() {
					@Override
					public Integer apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getMinNumbers();
					}
				},
				new BiConsumer<PasswordPolicy, Integer>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Integer minNumbers) {
						passwordPolicy.setMinNumbers(minNumbers);
					}
				});
		}
	}

	public static class MinSymbolsAccessor extends ModelPropertyAccessor {
		public MinSymbolsAccessor() {
			super(new Function<PasswordPolicy, Integer>() {
					@Override
					public Integer apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getMinSymbols();
					}
				},
				new BiConsumer<PasswordPolicy, Integer>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Integer minSymbols) {
						passwordPolicy.setMinSymbols(minSymbols);
					}
				});
		}
	}

	public static class MinUpperCaseAccessor extends ModelPropertyAccessor {
		public MinUpperCaseAccessor() {
			super(new Function<PasswordPolicy, Integer>() {
					@Override
					public Integer apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getMinUpperCase();
					}
				},
				new BiConsumer<PasswordPolicy, Integer>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Integer minUpperCase) {
						passwordPolicy.setMinUpperCase(minUpperCase);
					}
				});
		}
	}

	public static class RegexAccessor extends ModelPropertyAccessor {
		public RegexAccessor() {
			super(new Function<PasswordPolicy, String>() {
					@Override
					public String apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getRegex();
					}
				},
				new BiConsumer<PasswordPolicy, String>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						String regex) {
						passwordPolicy.setRegex(regex);
					}
				});
		}
	}

	public static class HistoryAccessor extends ModelPropertyAccessor {
		public HistoryAccessor() {
			super(new Function<PasswordPolicy, Boolean>() {
					@Override
					public Boolean apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getHistory();
					}
				},
				new BiConsumer<PasswordPolicy, Boolean>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Boolean history) {
						passwordPolicy.setHistory(history);
					}
				});
		}
	}

	public static class HistoryCountAccessor extends ModelPropertyAccessor {
		public HistoryCountAccessor() {
			super(new Function<PasswordPolicy, Integer>() {
					@Override
					public Integer apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getHistoryCount();
					}
				},
				new BiConsumer<PasswordPolicy, Integer>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Integer historyCount) {
						passwordPolicy.setHistoryCount(historyCount);
					}
				});
		}
	}

	public static class ExpireableAccessor extends ModelPropertyAccessor {
		public ExpireableAccessor() {
			super(new Function<PasswordPolicy, Boolean>() {
					@Override
					public Boolean apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getExpireable();
					}
				},
				new BiConsumer<PasswordPolicy, Boolean>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Boolean expireable) {
						passwordPolicy.setExpireable(expireable);
					}
				});
		}
	}

	public static class MaxAgeAccessor extends ModelPropertyAccessor {
		public MaxAgeAccessor() {
			super(new Function<PasswordPolicy, Long>() {
					@Override
					public Long apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getMaxAge();
					}
				},
				new BiConsumer<PasswordPolicy, Long>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Long maxAge) {
						passwordPolicy.setMaxAge(maxAge);
					}
				});
		}
	}

	public static class WarningTimeAccessor extends ModelPropertyAccessor {
		public WarningTimeAccessor() {
			super(new Function<PasswordPolicy, Long>() {
					@Override
					public Long apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getWarningTime();
					}
				},
				new BiConsumer<PasswordPolicy, Long>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Long warningTime) {
						passwordPolicy.setWarningTime(warningTime);
					}
				});
		}
	}

	public static class GraceLimitAccessor extends ModelPropertyAccessor {
		public GraceLimitAccessor() {
			super(new Function<PasswordPolicy, Integer>() {
					@Override
					public Integer apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getGraceLimit();
					}
				},
				new BiConsumer<PasswordPolicy, Integer>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Integer graceLimit) {
						passwordPolicy.setGraceLimit(graceLimit);
					}
				});
		}
	}

	public static class LockoutAccessor extends ModelPropertyAccessor {
		public LockoutAccessor() {
			super(new Function<PasswordPolicy, Boolean>() {
					@Override
					public Boolean apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getLockout();
					}
				},
				new BiConsumer<PasswordPolicy, Boolean>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Boolean lockout) {
						passwordPolicy.setLockout(lockout);
					}
				});
		}
	}

	public static class MaxFailureAccessor extends ModelPropertyAccessor {
		public MaxFailureAccessor() {
			super(new Function<PasswordPolicy, Integer>() {
					@Override
					public Integer apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getMaxFailure();
					}
				},
				new BiConsumer<PasswordPolicy, Integer>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Integer maxFailure) {
						passwordPolicy.setMaxFailure(maxFailure);
					}
				});
		}
	}

	public static class LockoutDurationAccessor extends ModelPropertyAccessor {
		public LockoutDurationAccessor() {
			super(new Function<PasswordPolicy, Long>() {
					@Override
					public Long apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getLockoutDuration();
					}
				},
				new BiConsumer<PasswordPolicy, Long>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Long lockoutDuration) {
						passwordPolicy.setLockoutDuration(lockoutDuration);
					}
				});
		}
	}

	public static class RequireUnlockAccessor extends ModelPropertyAccessor {
		public RequireUnlockAccessor() {
			super(new Function<PasswordPolicy, Boolean>() {
					@Override
					public Boolean apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getRequireUnlock();
					}
				},
				new BiConsumer<PasswordPolicy, Boolean>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Boolean requireUnlock) {
						passwordPolicy.setRequireUnlock(requireUnlock);
					}
				});
		}
	}

	public static class ResetFailureCountAccessor extends ModelPropertyAccessor {
		public ResetFailureCountAccessor() {
			super(new Function<PasswordPolicy, Long>() {
					@Override
					public Long apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getResetFailureCount();
					}
				},
				new BiConsumer<PasswordPolicy, Long>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Long resetFailureCount) {
						passwordPolicy.setResetFailureCount(resetFailureCount);
					}
				});
		}
	}

	public static class ResetTicketMaxAgeAccessor extends ModelPropertyAccessor {
		public ResetTicketMaxAgeAccessor() {
			super(new Function<PasswordPolicy, Long>() {
					@Override
					public Long apply(PasswordPolicy passwordPolicy) {
						return passwordPolicy.getResetTicketMaxAge();
					}
				},
				new BiConsumer<PasswordPolicy, Long>() {
					@Override
					public void accept(PasswordPolicy passwordPolicy,
						Long resetTicketMaxAge) {
						passwordPolicy.setResetTicketMaxAge(resetTicketMaxAge);
					}
				});
		}
	}

	private PasswordPolicyModelAccessors() {
	}
}