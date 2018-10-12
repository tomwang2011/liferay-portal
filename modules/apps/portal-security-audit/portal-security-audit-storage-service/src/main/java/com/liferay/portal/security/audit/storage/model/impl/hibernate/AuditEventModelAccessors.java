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

package com.liferay.portal.security.audit.storage.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;
import com.liferay.portal.security.audit.storage.model.AuditEvent;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AuditEventModelAccessors {
	public static class AuditEventIdAccessor extends ModelPropertyAccessor {
		public AuditEventIdAccessor() {
			super(new Function<AuditEvent, Long>() {
					@Override
					public Long apply(AuditEvent auditEvent) {
						return auditEvent.getAuditEventId();
					}
				},
				new BiConsumer<AuditEvent, Long>() {
					@Override
					public void accept(AuditEvent auditEvent, Long auditEventId) {
						auditEvent.setAuditEventId(auditEventId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<AuditEvent, Long>() {
					@Override
					public Long apply(AuditEvent auditEvent) {
						return auditEvent.getCompanyId();
					}
				},
				new BiConsumer<AuditEvent, Long>() {
					@Override
					public void accept(AuditEvent auditEvent, Long companyId) {
						auditEvent.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<AuditEvent, Long>() {
					@Override
					public Long apply(AuditEvent auditEvent) {
						return auditEvent.getUserId();
					}
				},
				new BiConsumer<AuditEvent, Long>() {
					@Override
					public void accept(AuditEvent auditEvent, Long userId) {
						auditEvent.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<AuditEvent, String>() {
					@Override
					public String apply(AuditEvent auditEvent) {
						return auditEvent.getUserName();
					}
				},
				new BiConsumer<AuditEvent, String>() {
					@Override
					public void accept(AuditEvent auditEvent, String userName) {
						auditEvent.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<AuditEvent, Date>() {
					@Override
					public Date apply(AuditEvent auditEvent) {
						return auditEvent.getCreateDate();
					}
				},
				new BiConsumer<AuditEvent, Date>() {
					@Override
					public void accept(AuditEvent auditEvent, Date createDate) {
						auditEvent.setCreateDate(createDate);
					}
				});
		}
	}

	public static class EventTypeAccessor extends ModelPropertyAccessor {
		public EventTypeAccessor() {
			super(new Function<AuditEvent, String>() {
					@Override
					public String apply(AuditEvent auditEvent) {
						return auditEvent.getEventType();
					}
				},
				new BiConsumer<AuditEvent, String>() {
					@Override
					public void accept(AuditEvent auditEvent, String eventType) {
						auditEvent.setEventType(eventType);
					}
				});
		}
	}

	public static class ClassNameAccessor extends ModelPropertyAccessor {
		public ClassNameAccessor() {
			super(new Function<AuditEvent, String>() {
					@Override
					public String apply(AuditEvent auditEvent) {
						return auditEvent.getClassName();
					}
				},
				new BiConsumer<AuditEvent, String>() {
					@Override
					public void accept(AuditEvent auditEvent, String className) {
						auditEvent.setClassName(className);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<AuditEvent, String>() {
					@Override
					public String apply(AuditEvent auditEvent) {
						return auditEvent.getClassPK();
					}
				},
				new BiConsumer<AuditEvent, String>() {
					@Override
					public void accept(AuditEvent auditEvent, String classPK) {
						auditEvent.setClassPK(classPK);
					}
				});
		}
	}

	public static class MessageAccessor extends ModelPropertyAccessor {
		public MessageAccessor() {
			super(new Function<AuditEvent, String>() {
					@Override
					public String apply(AuditEvent auditEvent) {
						return auditEvent.getMessage();
					}
				},
				new BiConsumer<AuditEvent, String>() {
					@Override
					public void accept(AuditEvent auditEvent, String message) {
						auditEvent.setMessage(message);
					}
				});
		}
	}

	public static class ClientHostAccessor extends ModelPropertyAccessor {
		public ClientHostAccessor() {
			super(new Function<AuditEvent, String>() {
					@Override
					public String apply(AuditEvent auditEvent) {
						return auditEvent.getClientHost();
					}
				},
				new BiConsumer<AuditEvent, String>() {
					@Override
					public void accept(AuditEvent auditEvent, String clientHost) {
						auditEvent.setClientHost(clientHost);
					}
				});
		}
	}

	public static class ClientIPAccessor extends ModelPropertyAccessor {
		public ClientIPAccessor() {
			super(new Function<AuditEvent, String>() {
					@Override
					public String apply(AuditEvent auditEvent) {
						return auditEvent.getClientIP();
					}
				},
				new BiConsumer<AuditEvent, String>() {
					@Override
					public void accept(AuditEvent auditEvent, String clientIP) {
						auditEvent.setClientIP(clientIP);
					}
				});
		}
	}

	public static class ServerNameAccessor extends ModelPropertyAccessor {
		public ServerNameAccessor() {
			super(new Function<AuditEvent, String>() {
					@Override
					public String apply(AuditEvent auditEvent) {
						return auditEvent.getServerName();
					}
				},
				new BiConsumer<AuditEvent, String>() {
					@Override
					public void accept(AuditEvent auditEvent, String serverName) {
						auditEvent.setServerName(serverName);
					}
				});
		}
	}

	public static class ServerPortAccessor extends ModelPropertyAccessor {
		public ServerPortAccessor() {
			super(new Function<AuditEvent, Integer>() {
					@Override
					public Integer apply(AuditEvent auditEvent) {
						return auditEvent.getServerPort();
					}
				},
				new BiConsumer<AuditEvent, Integer>() {
					@Override
					public void accept(AuditEvent auditEvent, Integer serverPort) {
						auditEvent.setServerPort(serverPort);
					}
				});
		}
	}

	public static class SessionIDAccessor extends ModelPropertyAccessor {
		public SessionIDAccessor() {
			super(new Function<AuditEvent, String>() {
					@Override
					public String apply(AuditEvent auditEvent) {
						return auditEvent.getSessionID();
					}
				},
				new BiConsumer<AuditEvent, String>() {
					@Override
					public void accept(AuditEvent auditEvent, String sessionID) {
						auditEvent.setSessionID(sessionID);
					}
				});
		}
	}

	public static class AdditionalInfoAccessor extends ModelPropertyAccessor {
		public AdditionalInfoAccessor() {
			super(new Function<AuditEvent, String>() {
					@Override
					public String apply(AuditEvent auditEvent) {
						return auditEvent.getAdditionalInfo();
					}
				},
				new BiConsumer<AuditEvent, String>() {
					@Override
					public void accept(AuditEvent auditEvent,
						String additionalInfo) {
						auditEvent.setAdditionalInfo(additionalInfo);
					}
				});
		}
	}

	private AuditEventModelAccessors() {
	}
}