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

package com.liferay.mail.reader.model.impl.hibernate;

import com.liferay.mail.reader.model.Account;

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

	public static class AddressAccessor extends ModelPropertyAccessor {
		public AddressAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getAddress();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String address) {
						account.setAddress(address);
					}
				});
		}
	}

	public static class PersonalNameAccessor extends ModelPropertyAccessor {
		public PersonalNameAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getPersonalName();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String personalName) {
						account.setPersonalName(personalName);
					}
				});
		}
	}

	public static class ProtocolAccessor extends ModelPropertyAccessor {
		public ProtocolAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getProtocol();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String protocol) {
						account.setProtocol(protocol);
					}
				});
		}
	}

	public static class IncomingHostNameAccessor extends ModelPropertyAccessor {
		public IncomingHostNameAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getIncomingHostName();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String incomingHostName) {
						account.setIncomingHostName(incomingHostName);
					}
				});
		}
	}

	public static class IncomingPortAccessor extends ModelPropertyAccessor {
		public IncomingPortAccessor() {
			super(new Function<Account, Integer>() {
					@Override
					public Integer apply(Account account) {
						return account.getIncomingPort();
					}
				},
				new BiConsumer<Account, Integer>() {
					@Override
					public void accept(Account account, Integer incomingPort) {
						account.setIncomingPort(incomingPort);
					}
				});
		}
	}

	public static class IncomingSecureAccessor extends ModelPropertyAccessor {
		public IncomingSecureAccessor() {
			super(new Function<Account, Boolean>() {
					@Override
					public Boolean apply(Account account) {
						return account.getIncomingSecure();
					}
				},
				new BiConsumer<Account, Boolean>() {
					@Override
					public void accept(Account account, Boolean incomingSecure) {
						account.setIncomingSecure(incomingSecure);
					}
				});
		}
	}

	public static class OutgoingHostNameAccessor extends ModelPropertyAccessor {
		public OutgoingHostNameAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getOutgoingHostName();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String outgoingHostName) {
						account.setOutgoingHostName(outgoingHostName);
					}
				});
		}
	}

	public static class OutgoingPortAccessor extends ModelPropertyAccessor {
		public OutgoingPortAccessor() {
			super(new Function<Account, Integer>() {
					@Override
					public Integer apply(Account account) {
						return account.getOutgoingPort();
					}
				},
				new BiConsumer<Account, Integer>() {
					@Override
					public void accept(Account account, Integer outgoingPort) {
						account.setOutgoingPort(outgoingPort);
					}
				});
		}
	}

	public static class OutgoingSecureAccessor extends ModelPropertyAccessor {
		public OutgoingSecureAccessor() {
			super(new Function<Account, Boolean>() {
					@Override
					public Boolean apply(Account account) {
						return account.getOutgoingSecure();
					}
				},
				new BiConsumer<Account, Boolean>() {
					@Override
					public void accept(Account account, Boolean outgoingSecure) {
						account.setOutgoingSecure(outgoingSecure);
					}
				});
		}
	}

	public static class LoginAccessor extends ModelPropertyAccessor {
		public LoginAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getLogin();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String login) {
						account.setLogin(login);
					}
				});
		}
	}

	public static class PasswordAccessor extends ModelPropertyAccessor {
		public PasswordAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getPassword();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String password) {
						account.setPassword(password);
					}
				});
		}
	}

	public static class SavePasswordAccessor extends ModelPropertyAccessor {
		public SavePasswordAccessor() {
			super(new Function<Account, Boolean>() {
					@Override
					public Boolean apply(Account account) {
						return account.getSavePassword();
					}
				},
				new BiConsumer<Account, Boolean>() {
					@Override
					public void accept(Account account, Boolean savePassword) {
						account.setSavePassword(savePassword);
					}
				});
		}
	}

	public static class SignatureAccessor extends ModelPropertyAccessor {
		public SignatureAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getSignature();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String signature) {
						account.setSignature(signature);
					}
				});
		}
	}

	public static class UseSignatureAccessor extends ModelPropertyAccessor {
		public UseSignatureAccessor() {
			super(new Function<Account, Boolean>() {
					@Override
					public Boolean apply(Account account) {
						return account.getUseSignature();
					}
				},
				new BiConsumer<Account, Boolean>() {
					@Override
					public void accept(Account account, Boolean useSignature) {
						account.setUseSignature(useSignature);
					}
				});
		}
	}

	public static class FolderPrefixAccessor extends ModelPropertyAccessor {
		public FolderPrefixAccessor() {
			super(new Function<Account, String>() {
					@Override
					public String apply(Account account) {
						return account.getFolderPrefix();
					}
				},
				new BiConsumer<Account, String>() {
					@Override
					public void accept(Account account, String folderPrefix) {
						account.setFolderPrefix(folderPrefix);
					}
				});
		}
	}

	public static class InboxFolderIdAccessor extends ModelPropertyAccessor {
		public InboxFolderIdAccessor() {
			super(new Function<Account, Long>() {
					@Override
					public Long apply(Account account) {
						return account.getInboxFolderId();
					}
				},
				new BiConsumer<Account, Long>() {
					@Override
					public void accept(Account account, Long inboxFolderId) {
						account.setInboxFolderId(inboxFolderId);
					}
				});
		}
	}

	public static class DraftFolderIdAccessor extends ModelPropertyAccessor {
		public DraftFolderIdAccessor() {
			super(new Function<Account, Long>() {
					@Override
					public Long apply(Account account) {
						return account.getDraftFolderId();
					}
				},
				new BiConsumer<Account, Long>() {
					@Override
					public void accept(Account account, Long draftFolderId) {
						account.setDraftFolderId(draftFolderId);
					}
				});
		}
	}

	public static class SentFolderIdAccessor extends ModelPropertyAccessor {
		public SentFolderIdAccessor() {
			super(new Function<Account, Long>() {
					@Override
					public Long apply(Account account) {
						return account.getSentFolderId();
					}
				},
				new BiConsumer<Account, Long>() {
					@Override
					public void accept(Account account, Long sentFolderId) {
						account.setSentFolderId(sentFolderId);
					}
				});
		}
	}

	public static class TrashFolderIdAccessor extends ModelPropertyAccessor {
		public TrashFolderIdAccessor() {
			super(new Function<Account, Long>() {
					@Override
					public Long apply(Account account) {
						return account.getTrashFolderId();
					}
				},
				new BiConsumer<Account, Long>() {
					@Override
					public void accept(Account account, Long trashFolderId) {
						account.setTrashFolderId(trashFolderId);
					}
				});
		}
	}

	public static class DefaultSenderAccessor extends ModelPropertyAccessor {
		public DefaultSenderAccessor() {
			super(new Function<Account, Boolean>() {
					@Override
					public Boolean apply(Account account) {
						return account.getDefaultSender();
					}
				},
				new BiConsumer<Account, Boolean>() {
					@Override
					public void accept(Account account, Boolean defaultSender) {
						account.setDefaultSender(defaultSender);
					}
				});
		}
	}

	private AccountModelAccessors() {
	}
}