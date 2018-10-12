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
import com.liferay.portal.kernel.model.Account;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccountModelAccessors {
	public static class AccountIdAccessor extends ModelPropertyAccessor {
		public AccountIdAccessor() {
			super(new Function<Account, Long>() {
					@Override
					public Long apply(Account account) {
						return account.getAccountId();
					}
				},
				new BiConsumer<Account, Long>() {
					@Override
					public void accept(Account account, Long accountId) {
						account.setAccountId(accountId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Account, Long>() {
					@Override
					public Long apply(Account account) {
						return account.getCompanyId();
					}
				},
				new BiConsumer<Account, Long>() {
					@Override
					public void accept(Account account, Long companyId) {
						account.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<Account, Long>() {
					@Override
					public Long apply(Account account) {
						return account.getUserId();
					}
				},
				new BiConsumer<Account, Long>() {
					@Override
					public void accept(Account account, Long userId) {
						account.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getUserName();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String userName) {
						account.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Account, Date>() {
					@Override
					public Date apply(Account account) {
						return account.getCreateDate();
					}
				},
				new BiConsumer<Account, Date>() {
					@Override
					public void accept(Account account, Date createDate) {
						account.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<Account, Date>() {
					@Override
					public Date apply(Account account) {
						return account.getModifiedDate();
					}
				},
				new BiConsumer<Account, Date>() {
					@Override
					public void accept(Account account, Date modifiedDate) {
						account.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ParentAccountIdAccessor extends ModelPropertyAccessor {
		public ParentAccountIdAccessor() {
			super(new Function<Account, Long>() {
					@Override
					public Long apply(Account account) {
						return account.getParentAccountId();
					}
				},
				new BiConsumer<Account, Long>() {
					@Override
					public void accept(Account account, Long parentAccountId) {
						account.setParentAccountId(parentAccountId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getName();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String name) {
						account.setName(name);
					}
				});
		}
	}

	public static class LegalNameAccessor extends ModelPropertyAccessor {
		public LegalNameAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getLegalName();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String legalName) {
						account.setLegalName(legalName);
					}
				});
		}
	}

	public static class LegalIdAccessor extends ModelPropertyAccessor {
		public LegalIdAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getLegalId();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String legalId) {
						account.setLegalId(legalId);
					}
				});
		}
	}

	public static class LegalTypeAccessor extends ModelPropertyAccessor {
		public LegalTypeAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getLegalType();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String legalType) {
						account.setLegalType(legalType);
					}
				});
		}
	}

	public static class SicCodeAccessor extends ModelPropertyAccessor {
		public SicCodeAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getSicCode();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String sicCode) {
						account.setSicCode(sicCode);
					}
				});
		}
	}

	public static class TickerSymbolAccessor extends ModelPropertyAccessor {
		public TickerSymbolAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getTickerSymbol();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String tickerSymbol) {
						account.setTickerSymbol(tickerSymbol);
					}
				});
		}
	}

	public static class IndustryAccessor extends ModelPropertyAccessor {
		public IndustryAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getIndustry();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String industry) {
						account.setIndustry(industry);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getType();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String type) {
						account.setType(type);
					}
				});
		}
	}

	public static class SizeAccessor extends ModelPropertyAccessor {
		public SizeAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getSize();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String size) {
						account.setSize(size);
					}
				});
		}
	}

	private AccountModelAccessors() {
	}
}