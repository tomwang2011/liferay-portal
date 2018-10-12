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

package com.liferay.portal.security.service.access.policy.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;
import com.liferay.portal.security.service.access.policy.model.SAPEntry;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SAPEntryModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<SAPEntry, String>() {
					@Override
					public String apply(SAPEntry sapEntry) {
						return sapEntry.getUuid();
					}
				},
				new BiConsumer<SAPEntry, String>() {
					@Override
					public void accept(SAPEntry sapEntry, String uuid) {
						sapEntry.setUuid(uuid);
					}
				});
		}
	}

	public static class SapEntryIdAccessor extends ModelPropertyAccessor {
		public SapEntryIdAccessor() {
			super(new Function<SAPEntry, Long>() {
					@Override
					public Long apply(SAPEntry sapEntry) {
						return sapEntry.getSapEntryId();
					}
				},
				new BiConsumer<SAPEntry, Long>() {
					@Override
					public void accept(SAPEntry sapEntry, Long sapEntryId) {
						sapEntry.setSapEntryId(sapEntryId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<SAPEntry, Long>() {
					@Override
					public Long apply(SAPEntry sapEntry) {
						return sapEntry.getCompanyId();
					}
				},
				new BiConsumer<SAPEntry, Long>() {
					@Override
					public void accept(SAPEntry sapEntry, Long companyId) {
						sapEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<SAPEntry, Long>() {
					@Override
					public Long apply(SAPEntry sapEntry) {
						return sapEntry.getUserId();
					}
				},
				new BiConsumer<SAPEntry, Long>() {
					@Override
					public void accept(SAPEntry sapEntry, Long userId) {
						sapEntry.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<SAPEntry, String>() {
					@Override
					public String apply(SAPEntry sapEntry) {
						return sapEntry.getUserName();
					}
				},
				new BiConsumer<SAPEntry, String>() {
					@Override
					public void accept(SAPEntry sapEntry, String userName) {
						sapEntry.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<SAPEntry, Date>() {
					@Override
					public Date apply(SAPEntry sapEntry) {
						return sapEntry.getCreateDate();
					}
				},
				new BiConsumer<SAPEntry, Date>() {
					@Override
					public void accept(SAPEntry sapEntry, Date createDate) {
						sapEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<SAPEntry, Date>() {
					@Override
					public Date apply(SAPEntry sapEntry) {
						return sapEntry.getModifiedDate();
					}
				},
				new BiConsumer<SAPEntry, Date>() {
					@Override
					public void accept(SAPEntry sapEntry, Date modifiedDate) {
						sapEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class AllowedServiceSignaturesAccessor
		extends ModelPropertyAccessor {
		public AllowedServiceSignaturesAccessor() {
			super(new Function<SAPEntry, String>() {
					@Override
					public String apply(SAPEntry sapEntry) {
						return sapEntry.getAllowedServiceSignatures();
					}
				},
				new BiConsumer<SAPEntry, String>() {
					@Override
					public void accept(SAPEntry sapEntry,
						String allowedServiceSignatures) {
						sapEntry.setAllowedServiceSignatures(allowedServiceSignatures);
					}
				});
		}
	}

	public static class DefaultSAPEntryAccessor extends ModelPropertyAccessor {
		public DefaultSAPEntryAccessor() {
			super(new Function<SAPEntry, Boolean>() {
					@Override
					public Boolean apply(SAPEntry sapEntry) {
						return sapEntry.getDefaultSAPEntry();
					}
				},
				new BiConsumer<SAPEntry, Boolean>() {
					@Override
					public void accept(SAPEntry sapEntry,
						Boolean defaultSAPEntry) {
						sapEntry.setDefaultSAPEntry(defaultSAPEntry);
					}
				});
		}
	}

	public static class EnabledAccessor extends ModelPropertyAccessor {
		public EnabledAccessor() {
			super(new Function<SAPEntry, Boolean>() {
					@Override
					public Boolean apply(SAPEntry sapEntry) {
						return sapEntry.getEnabled();
					}
				},
				new BiConsumer<SAPEntry, Boolean>() {
					@Override
					public void accept(SAPEntry sapEntry, Boolean enabled) {
						sapEntry.setEnabled(enabled);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<SAPEntry, String>() {
					@Override
					public String apply(SAPEntry sapEntry) {
						return sapEntry.getName();
					}
				},
				new BiConsumer<SAPEntry, String>() {
					@Override
					public void accept(SAPEntry sapEntry, String name) {
						sapEntry.setName(name);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<SAPEntry, String>() {
					@Override
					public String apply(SAPEntry sapEntry) {
						return sapEntry.getTitle();
					}
				},
				new BiConsumer<SAPEntry, String>() {
					@Override
					public void accept(SAPEntry sapEntry, String title) {
						sapEntry.setTitle(title);
					}
				});
		}
	}

	private SAPEntryModelAccessors() {
	}
}