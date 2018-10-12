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
import com.liferay.portal.kernel.model.Company;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CompanyModelAccessors {
	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Company, Long>() {
					@Override
					public Long apply(Company company) {
						return company.getCompanyId();
					}
				},
				new BiConsumer<Company, Long>() {
					@Override
					public void accept(Company company, Long companyId) {
						company.setCompanyId(companyId);
					}
				});
		}
	}

	public static class AccountIdAccessor extends ModelPropertyAccessor {
		public AccountIdAccessor() {
			super(new Function<Company, Long>() {
					@Override
					public Long apply(Company company) {
						return company.getAccountId();
					}
				},
				new BiConsumer<Company, Long>() {
					@Override
					public void accept(Company company, Long accountId) {
						company.setAccountId(accountId);
					}
				});
		}
	}

	public static class WebIdAccessor extends ModelPropertyAccessor {
		public WebIdAccessor() {
			super(new Function<Company, String>() {
					@Override
					public String apply(Company company) {
						return company.getWebId();
					}
				},
				new BiConsumer<Company, String>() {
					@Override
					public void accept(Company company, String webId) {
						company.setWebId(webId);
					}
				});
		}
	}

	public static class KeyAccessor extends ModelPropertyAccessor {
		public KeyAccessor() {
			super(new Function<Company, String>() {
					@Override
					public String apply(Company company) {
						return company.getKey();
					}
				},
				new BiConsumer<Company, String>() {
					@Override
					public void accept(Company company, String key) {
						company.setKey(key);
					}
				});
		}
	}

	public static class MxAccessor extends ModelPropertyAccessor {
		public MxAccessor() {
			super(new Function<Company, String>() {
					@Override
					public String apply(Company company) {
						return company.getMx();
					}
				},
				new BiConsumer<Company, String>() {
					@Override
					public void accept(Company company, String mx) {
						company.setMx(mx);
					}
				});
		}
	}

	public static class HomeURLAccessor extends ModelPropertyAccessor {
		public HomeURLAccessor() {
			super(new Function<Company, String>() {
					@Override
					public String apply(Company company) {
						return company.getHomeURL();
					}
				},
				new BiConsumer<Company, String>() {
					@Override
					public void accept(Company company, String homeURL) {
						company.setHomeURL(homeURL);
					}
				});
		}
	}

	public static class LogoIdAccessor extends ModelPropertyAccessor {
		public LogoIdAccessor() {
			super(new Function<Company, Long>() {
					@Override
					public Long apply(Company company) {
						return company.getLogoId();
					}
				},
				new BiConsumer<Company, Long>() {
					@Override
					public void accept(Company company, Long logoId) {
						company.setLogoId(logoId);
					}
				});
		}
	}

	public static class SystemAccessor extends ModelPropertyAccessor {
		public SystemAccessor() {
			super(new Function<Company, Boolean>() {
					@Override
					public Boolean apply(Company company) {
						return company.getSystem();
					}
				},
				new BiConsumer<Company, Boolean>() {
					@Override
					public void accept(Company company, Boolean system) {
						company.setSystem(system);
					}
				});
		}
	}

	public static class MaxUsersAccessor extends ModelPropertyAccessor {
		public MaxUsersAccessor() {
			super(new Function<Company, Integer>() {
					@Override
					public Integer apply(Company company) {
						return company.getMaxUsers();
					}
				},
				new BiConsumer<Company, Integer>() {
					@Override
					public void accept(Company company, Integer maxUsers) {
						company.setMaxUsers(maxUsers);
					}
				});
		}
	}

	public static class ActiveAccessor extends ModelPropertyAccessor {
		public ActiveAccessor() {
			super(new Function<Company, Boolean>() {
					@Override
					public Boolean apply(Company company) {
						return company.getActive();
					}
				},
				new BiConsumer<Company, Boolean>() {
					@Override
					public void accept(Company company, Boolean active) {
						company.setActive(active);
					}
				});
		}
	}

	private CompanyModelAccessors() {
	}
}