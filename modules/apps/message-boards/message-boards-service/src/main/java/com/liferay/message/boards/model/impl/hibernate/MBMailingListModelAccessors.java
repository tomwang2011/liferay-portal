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

package com.liferay.message.boards.model.impl.hibernate;

import com.liferay.message.boards.model.MBMailingList;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MBMailingListModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<MBMailingList, String>() {
					@Override
					public String apply(MBMailingList mbMailingList) {
						return mbMailingList.getUuid();
					}
				},
				new BiConsumer<MBMailingList, String>() {
					@Override
					public void accept(MBMailingList mbMailingList, String uuid) {
						mbMailingList.setUuid(uuid);
					}
				});
		}
	}

	public static class MailingListIdAccessor extends ModelPropertyAccessor {
		public MailingListIdAccessor() {
			super(new Function<MBMailingList, Long>() {
					@Override
					public Long apply(MBMailingList mbMailingList) {
						return mbMailingList.getMailingListId();
					}
				},
				new BiConsumer<MBMailingList, Long>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						Long mailingListId) {
						mbMailingList.setMailingListId(mailingListId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<MBMailingList, Long>() {
					@Override
					public Long apply(MBMailingList mbMailingList) {
						return mbMailingList.getGroupId();
					}
				},
				new BiConsumer<MBMailingList, Long>() {
					@Override
					public void accept(MBMailingList mbMailingList, Long groupId) {
						mbMailingList.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<MBMailingList, Long>() {
					@Override
					public Long apply(MBMailingList mbMailingList) {
						return mbMailingList.getCompanyId();
					}
				},
				new BiConsumer<MBMailingList, Long>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						Long companyId) {
						mbMailingList.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<MBMailingList, Long>() {
					@Override
					public Long apply(MBMailingList mbMailingList) {
						return mbMailingList.getUserId();
					}
				},
				new BiConsumer<MBMailingList, Long>() {
					@Override
					public void accept(MBMailingList mbMailingList, Long userId) {
						mbMailingList.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<MBMailingList, String>() {
					@Override
					public String apply(MBMailingList mbMailingList) {
						return mbMailingList.getUserName();
					}
				},
				new BiConsumer<MBMailingList, String>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						String userName) {
						mbMailingList.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<MBMailingList, Date>() {
					@Override
					public Date apply(MBMailingList mbMailingList) {
						return mbMailingList.getCreateDate();
					}
				},
				new BiConsumer<MBMailingList, Date>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						Date createDate) {
						mbMailingList.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<MBMailingList, Date>() {
					@Override
					public Date apply(MBMailingList mbMailingList) {
						return mbMailingList.getModifiedDate();
					}
				},
				new BiConsumer<MBMailingList, Date>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						Date modifiedDate) {
						mbMailingList.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class CategoryIdAccessor extends ModelPropertyAccessor {
		public CategoryIdAccessor() {
			super(new Function<MBMailingList, Long>() {
					@Override
					public Long apply(MBMailingList mbMailingList) {
						return mbMailingList.getCategoryId();
					}
				},
				new BiConsumer<MBMailingList, Long>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						Long categoryId) {
						mbMailingList.setCategoryId(categoryId);
					}
				});
		}
	}

	public static class EmailAddressAccessor extends ModelPropertyAccessor {
		public EmailAddressAccessor() {
			super(new Function<MBMailingList, String>() {
					@Override
					public String apply(MBMailingList mbMailingList) {
						return mbMailingList.getEmailAddress();
					}
				},
				new BiConsumer<MBMailingList, String>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						String emailAddress) {
						mbMailingList.setEmailAddress(emailAddress);
					}
				});
		}
	}

	public static class InProtocolAccessor extends ModelPropertyAccessor {
		public InProtocolAccessor() {
			super(new Function<MBMailingList, String>() {
					@Override
					public String apply(MBMailingList mbMailingList) {
						return mbMailingList.getInProtocol();
					}
				},
				new BiConsumer<MBMailingList, String>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						String inProtocol) {
						mbMailingList.setInProtocol(inProtocol);
					}
				});
		}
	}

	public static class InServerNameAccessor extends ModelPropertyAccessor {
		public InServerNameAccessor() {
			super(new Function<MBMailingList, String>() {
					@Override
					public String apply(MBMailingList mbMailingList) {
						return mbMailingList.getInServerName();
					}
				},
				new BiConsumer<MBMailingList, String>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						String inServerName) {
						mbMailingList.setInServerName(inServerName);
					}
				});
		}
	}

	public static class InServerPortAccessor extends ModelPropertyAccessor {
		public InServerPortAccessor() {
			super(new Function<MBMailingList, Integer>() {
					@Override
					public Integer apply(MBMailingList mbMailingList) {
						return mbMailingList.getInServerPort();
					}
				},
				new BiConsumer<MBMailingList, Integer>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						Integer inServerPort) {
						mbMailingList.setInServerPort(inServerPort);
					}
				});
		}
	}

	public static class InUseSSLAccessor extends ModelPropertyAccessor {
		public InUseSSLAccessor() {
			super(new Function<MBMailingList, Boolean>() {
					@Override
					public Boolean apply(MBMailingList mbMailingList) {
						return mbMailingList.getInUseSSL();
					}
				},
				new BiConsumer<MBMailingList, Boolean>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						Boolean inUseSSL) {
						mbMailingList.setInUseSSL(inUseSSL);
					}
				});
		}
	}

	public static class InUserNameAccessor extends ModelPropertyAccessor {
		public InUserNameAccessor() {
			super(new Function<MBMailingList, String>() {
					@Override
					public String apply(MBMailingList mbMailingList) {
						return mbMailingList.getInUserName();
					}
				},
				new BiConsumer<MBMailingList, String>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						String inUserName) {
						mbMailingList.setInUserName(inUserName);
					}
				});
		}
	}

	public static class InPasswordAccessor extends ModelPropertyAccessor {
		public InPasswordAccessor() {
			super(new Function<MBMailingList, String>() {
					@Override
					public String apply(MBMailingList mbMailingList) {
						return mbMailingList.getInPassword();
					}
				},
				new BiConsumer<MBMailingList, String>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						String inPassword) {
						mbMailingList.setInPassword(inPassword);
					}
				});
		}
	}

	public static class InReadIntervalAccessor extends ModelPropertyAccessor {
		public InReadIntervalAccessor() {
			super(new Function<MBMailingList, Integer>() {
					@Override
					public Integer apply(MBMailingList mbMailingList) {
						return mbMailingList.getInReadInterval();
					}
				},
				new BiConsumer<MBMailingList, Integer>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						Integer inReadInterval) {
						mbMailingList.setInReadInterval(inReadInterval);
					}
				});
		}
	}

	public static class OutEmailAddressAccessor extends ModelPropertyAccessor {
		public OutEmailAddressAccessor() {
			super(new Function<MBMailingList, String>() {
					@Override
					public String apply(MBMailingList mbMailingList) {
						return mbMailingList.getOutEmailAddress();
					}
				},
				new BiConsumer<MBMailingList, String>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						String outEmailAddress) {
						mbMailingList.setOutEmailAddress(outEmailAddress);
					}
				});
		}
	}

	public static class OutCustomAccessor extends ModelPropertyAccessor {
		public OutCustomAccessor() {
			super(new Function<MBMailingList, Boolean>() {
					@Override
					public Boolean apply(MBMailingList mbMailingList) {
						return mbMailingList.getOutCustom();
					}
				},
				new BiConsumer<MBMailingList, Boolean>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						Boolean outCustom) {
						mbMailingList.setOutCustom(outCustom);
					}
				});
		}
	}

	public static class OutServerNameAccessor extends ModelPropertyAccessor {
		public OutServerNameAccessor() {
			super(new Function<MBMailingList, String>() {
					@Override
					public String apply(MBMailingList mbMailingList) {
						return mbMailingList.getOutServerName();
					}
				},
				new BiConsumer<MBMailingList, String>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						String outServerName) {
						mbMailingList.setOutServerName(outServerName);
					}
				});
		}
	}

	public static class OutServerPortAccessor extends ModelPropertyAccessor {
		public OutServerPortAccessor() {
			super(new Function<MBMailingList, Integer>() {
					@Override
					public Integer apply(MBMailingList mbMailingList) {
						return mbMailingList.getOutServerPort();
					}
				},
				new BiConsumer<MBMailingList, Integer>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						Integer outServerPort) {
						mbMailingList.setOutServerPort(outServerPort);
					}
				});
		}
	}

	public static class OutUseSSLAccessor extends ModelPropertyAccessor {
		public OutUseSSLAccessor() {
			super(new Function<MBMailingList, Boolean>() {
					@Override
					public Boolean apply(MBMailingList mbMailingList) {
						return mbMailingList.getOutUseSSL();
					}
				},
				new BiConsumer<MBMailingList, Boolean>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						Boolean outUseSSL) {
						mbMailingList.setOutUseSSL(outUseSSL);
					}
				});
		}
	}

	public static class OutUserNameAccessor extends ModelPropertyAccessor {
		public OutUserNameAccessor() {
			super(new Function<MBMailingList, String>() {
					@Override
					public String apply(MBMailingList mbMailingList) {
						return mbMailingList.getOutUserName();
					}
				},
				new BiConsumer<MBMailingList, String>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						String outUserName) {
						mbMailingList.setOutUserName(outUserName);
					}
				});
		}
	}

	public static class OutPasswordAccessor extends ModelPropertyAccessor {
		public OutPasswordAccessor() {
			super(new Function<MBMailingList, String>() {
					@Override
					public String apply(MBMailingList mbMailingList) {
						return mbMailingList.getOutPassword();
					}
				},
				new BiConsumer<MBMailingList, String>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						String outPassword) {
						mbMailingList.setOutPassword(outPassword);
					}
				});
		}
	}

	public static class AllowAnonymousAccessor extends ModelPropertyAccessor {
		public AllowAnonymousAccessor() {
			super(new Function<MBMailingList, Boolean>() {
					@Override
					public Boolean apply(MBMailingList mbMailingList) {
						return mbMailingList.getAllowAnonymous();
					}
				},
				new BiConsumer<MBMailingList, Boolean>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						Boolean allowAnonymous) {
						mbMailingList.setAllowAnonymous(allowAnonymous);
					}
				});
		}
	}

	public static class ActiveAccessor extends ModelPropertyAccessor {
		public ActiveAccessor() {
			super(new Function<MBMailingList, Boolean>() {
					@Override
					public Boolean apply(MBMailingList mbMailingList) {
						return mbMailingList.getActive();
					}
				},
				new BiConsumer<MBMailingList, Boolean>() {
					@Override
					public void accept(MBMailingList mbMailingList,
						Boolean active) {
						mbMailingList.setActive(active);
					}
				});
		}
	}

	private MBMailingListModelAccessors() {
	}
}