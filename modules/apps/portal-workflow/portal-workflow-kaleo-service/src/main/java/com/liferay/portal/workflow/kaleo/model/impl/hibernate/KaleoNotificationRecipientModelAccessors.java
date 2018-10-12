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

package com.liferay.portal.workflow.kaleo.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;
import com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoNotificationRecipientModelAccessors {
	public static class KaleoNotificationRecipientIdAccessor
		extends ModelPropertyAccessor {
		public KaleoNotificationRecipientIdAccessor() {
			super(new Function<KaleoNotificationRecipient, Long>() {
					@Override
					public Long apply(
						KaleoNotificationRecipient kaleoNotificationRecipient) {
						return kaleoNotificationRecipient.getKaleoNotificationRecipientId();
					}
				},
				new BiConsumer<KaleoNotificationRecipient, Long>() {
					@Override
					public void accept(
						KaleoNotificationRecipient kaleoNotificationRecipient,
						Long kaleoNotificationRecipientId) {
						kaleoNotificationRecipient.setKaleoNotificationRecipientId(kaleoNotificationRecipientId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoNotificationRecipient, Long>() {
					@Override
					public Long apply(
						KaleoNotificationRecipient kaleoNotificationRecipient) {
						return kaleoNotificationRecipient.getGroupId();
					}
				},
				new BiConsumer<KaleoNotificationRecipient, Long>() {
					@Override
					public void accept(
						KaleoNotificationRecipient kaleoNotificationRecipient,
						Long groupId) {
						kaleoNotificationRecipient.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoNotificationRecipient, Long>() {
					@Override
					public Long apply(
						KaleoNotificationRecipient kaleoNotificationRecipient) {
						return kaleoNotificationRecipient.getCompanyId();
					}
				},
				new BiConsumer<KaleoNotificationRecipient, Long>() {
					@Override
					public void accept(
						KaleoNotificationRecipient kaleoNotificationRecipient,
						Long companyId) {
						kaleoNotificationRecipient.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoNotificationRecipient, Long>() {
					@Override
					public Long apply(
						KaleoNotificationRecipient kaleoNotificationRecipient) {
						return kaleoNotificationRecipient.getUserId();
					}
				},
				new BiConsumer<KaleoNotificationRecipient, Long>() {
					@Override
					public void accept(
						KaleoNotificationRecipient kaleoNotificationRecipient,
						Long userId) {
						kaleoNotificationRecipient.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoNotificationRecipient, String>() {
					@Override
					public String apply(
						KaleoNotificationRecipient kaleoNotificationRecipient) {
						return kaleoNotificationRecipient.getUserName();
					}
				},
				new BiConsumer<KaleoNotificationRecipient, String>() {
					@Override
					public void accept(
						KaleoNotificationRecipient kaleoNotificationRecipient,
						String userName) {
						kaleoNotificationRecipient.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoNotificationRecipient, Date>() {
					@Override
					public Date apply(
						KaleoNotificationRecipient kaleoNotificationRecipient) {
						return kaleoNotificationRecipient.getCreateDate();
					}
				},
				new BiConsumer<KaleoNotificationRecipient, Date>() {
					@Override
					public void accept(
						KaleoNotificationRecipient kaleoNotificationRecipient,
						Date createDate) {
						kaleoNotificationRecipient.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoNotificationRecipient, Date>() {
					@Override
					public Date apply(
						KaleoNotificationRecipient kaleoNotificationRecipient) {
						return kaleoNotificationRecipient.getModifiedDate();
					}
				},
				new BiConsumer<KaleoNotificationRecipient, Date>() {
					@Override
					public void accept(
						KaleoNotificationRecipient kaleoNotificationRecipient,
						Date modifiedDate) {
						kaleoNotificationRecipient.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class KaleoDefinitionVersionIdAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionIdAccessor() {
			super(new Function<KaleoNotificationRecipient, Long>() {
					@Override
					public Long apply(
						KaleoNotificationRecipient kaleoNotificationRecipient) {
						return kaleoNotificationRecipient.getKaleoDefinitionVersionId();
					}
				},
				new BiConsumer<KaleoNotificationRecipient, Long>() {
					@Override
					public void accept(
						KaleoNotificationRecipient kaleoNotificationRecipient,
						Long kaleoDefinitionVersionId) {
						kaleoNotificationRecipient.setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
					}
				});
		}
	}

	public static class KaleoNotificationIdAccessor
		extends ModelPropertyAccessor {
		public KaleoNotificationIdAccessor() {
			super(new Function<KaleoNotificationRecipient, Long>() {
					@Override
					public Long apply(
						KaleoNotificationRecipient kaleoNotificationRecipient) {
						return kaleoNotificationRecipient.getKaleoNotificationId();
					}
				},
				new BiConsumer<KaleoNotificationRecipient, Long>() {
					@Override
					public void accept(
						KaleoNotificationRecipient kaleoNotificationRecipient,
						Long kaleoNotificationId) {
						kaleoNotificationRecipient.setKaleoNotificationId(kaleoNotificationId);
					}
				});
		}
	}

	public static class RecipientClassNameAccessor extends ModelPropertyAccessor {
		public RecipientClassNameAccessor() {
			super(new Function<KaleoNotificationRecipient, String>() {
					@Override
					public String apply(
						KaleoNotificationRecipient kaleoNotificationRecipient) {
						return kaleoNotificationRecipient.getRecipientClassName();
					}
				},
				new BiConsumer<KaleoNotificationRecipient, String>() {
					@Override
					public void accept(
						KaleoNotificationRecipient kaleoNotificationRecipient,
						String recipientClassName) {
						kaleoNotificationRecipient.setRecipientClassName(recipientClassName);
					}
				});
		}
	}

	public static class RecipientClassPKAccessor extends ModelPropertyAccessor {
		public RecipientClassPKAccessor() {
			super(new Function<KaleoNotificationRecipient, Long>() {
					@Override
					public Long apply(
						KaleoNotificationRecipient kaleoNotificationRecipient) {
						return kaleoNotificationRecipient.getRecipientClassPK();
					}
				},
				new BiConsumer<KaleoNotificationRecipient, Long>() {
					@Override
					public void accept(
						KaleoNotificationRecipient kaleoNotificationRecipient,
						Long recipientClassPK) {
						kaleoNotificationRecipient.setRecipientClassPK(recipientClassPK);
					}
				});
		}
	}

	public static class RecipientRoleTypeAccessor extends ModelPropertyAccessor {
		public RecipientRoleTypeAccessor() {
			super(new Function<KaleoNotificationRecipient, Integer>() {
					@Override
					public Integer apply(
						KaleoNotificationRecipient kaleoNotificationRecipient) {
						return kaleoNotificationRecipient.getRecipientRoleType();
					}
				},
				new BiConsumer<KaleoNotificationRecipient, Integer>() {
					@Override
					public void accept(
						KaleoNotificationRecipient kaleoNotificationRecipient,
						Integer recipientRoleType) {
						kaleoNotificationRecipient.setRecipientRoleType(recipientRoleType);
					}
				});
		}
	}

	public static class RecipientScriptAccessor extends ModelPropertyAccessor {
		public RecipientScriptAccessor() {
			super(new Function<KaleoNotificationRecipient, String>() {
					@Override
					public String apply(
						KaleoNotificationRecipient kaleoNotificationRecipient) {
						return kaleoNotificationRecipient.getRecipientScript();
					}
				},
				new BiConsumer<KaleoNotificationRecipient, String>() {
					@Override
					public void accept(
						KaleoNotificationRecipient kaleoNotificationRecipient,
						String recipientScript) {
						kaleoNotificationRecipient.setRecipientScript(recipientScript);
					}
				});
		}
	}

	public static class RecipientScriptLanguageAccessor
		extends ModelPropertyAccessor {
		public RecipientScriptLanguageAccessor() {
			super(new Function<KaleoNotificationRecipient, String>() {
					@Override
					public String apply(
						KaleoNotificationRecipient kaleoNotificationRecipient) {
						return kaleoNotificationRecipient.getRecipientScriptLanguage();
					}
				},
				new BiConsumer<KaleoNotificationRecipient, String>() {
					@Override
					public void accept(
						KaleoNotificationRecipient kaleoNotificationRecipient,
						String recipientScriptLanguage) {
						kaleoNotificationRecipient.setRecipientScriptLanguage(recipientScriptLanguage);
					}
				});
		}
	}

	public static class RecipientScriptContextsAccessor
		extends ModelPropertyAccessor {
		public RecipientScriptContextsAccessor() {
			super(new Function<KaleoNotificationRecipient, String>() {
					@Override
					public String apply(
						KaleoNotificationRecipient kaleoNotificationRecipient) {
						return kaleoNotificationRecipient.getRecipientScriptContexts();
					}
				},
				new BiConsumer<KaleoNotificationRecipient, String>() {
					@Override
					public void accept(
						KaleoNotificationRecipient kaleoNotificationRecipient,
						String recipientScriptContexts) {
						kaleoNotificationRecipient.setRecipientScriptContexts(recipientScriptContexts);
					}
				});
		}
	}

	public static class AddressAccessor extends ModelPropertyAccessor {
		public AddressAccessor() {
			super(new Function<KaleoNotificationRecipient, String>() {
					@Override
					public String apply(
						KaleoNotificationRecipient kaleoNotificationRecipient) {
						return kaleoNotificationRecipient.getAddress();
					}
				},
				new BiConsumer<KaleoNotificationRecipient, String>() {
					@Override
					public void accept(
						KaleoNotificationRecipient kaleoNotificationRecipient,
						String address) {
						kaleoNotificationRecipient.setAddress(address);
					}
				});
		}
	}

	public static class NotificationReceptionTypeAccessor
		extends ModelPropertyAccessor {
		public NotificationReceptionTypeAccessor() {
			super(new Function<KaleoNotificationRecipient, String>() {
					@Override
					public String apply(
						KaleoNotificationRecipient kaleoNotificationRecipient) {
						return kaleoNotificationRecipient.getNotificationReceptionType();
					}
				},
				new BiConsumer<KaleoNotificationRecipient, String>() {
					@Override
					public void accept(
						KaleoNotificationRecipient kaleoNotificationRecipient,
						String notificationReceptionType) {
						kaleoNotificationRecipient.setNotificationReceptionType(notificationReceptionType);
					}
				});
		}
	}

	private KaleoNotificationRecipientModelAccessors() {
	}
}