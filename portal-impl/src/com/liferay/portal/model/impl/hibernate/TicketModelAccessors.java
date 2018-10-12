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
import com.liferay.portal.kernel.model.Ticket;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TicketModelAccessors {
	public static class TicketIdAccessor extends ModelPropertyAccessor {
		public TicketIdAccessor() {
			super(new Function<Ticket, Long>() {
					@Override
					public Long apply(Ticket ticket) {
						return ticket.getTicketId();
					}
				},
				new BiConsumer<Ticket, Long>() {
					@Override
					public void accept(Ticket ticket, Long ticketId) {
						ticket.setTicketId(ticketId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Ticket, Long>() {
					@Override
					public Long apply(Ticket ticket) {
						return ticket.getCompanyId();
					}
				},
				new BiConsumer<Ticket, Long>() {
					@Override
					public void accept(Ticket ticket, Long companyId) {
						ticket.setCompanyId(companyId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Ticket, Date>() {
					@Override
					public Date apply(Ticket ticket) {
						return ticket.getCreateDate();
					}
				},
				new BiConsumer<Ticket, Date>() {
					@Override
					public void accept(Ticket ticket, Date createDate) {
						ticket.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<Ticket, Long>() {
					@Override
					public Long apply(Ticket ticket) {
						return ticket.getClassNameId();
					}
				},
				new BiConsumer<Ticket, Long>() {
					@Override
					public void accept(Ticket ticket, Long classNameId) {
						ticket.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<Ticket, Long>() {
					@Override
					public Long apply(Ticket ticket) {
						return ticket.getClassPK();
					}
				},
				new BiConsumer<Ticket, Long>() {
					@Override
					public void accept(Ticket ticket, Long classPK) {
						ticket.setClassPK(classPK);
					}
				});
		}
	}

	public static class KeyAccessor extends ModelPropertyAccessor {
		public KeyAccessor() {
			super(new Function<Ticket, String>() {
					@Override
					public String apply(Ticket ticket) {
						return ticket.getKey();
					}
				},
				new BiConsumer<Ticket, String>() {
					@Override
					public void accept(Ticket ticket, String key) {
						ticket.setKey(key);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<Ticket, Integer>() {
					@Override
					public Integer apply(Ticket ticket) {
						return ticket.getType();
					}
				},
				new BiConsumer<Ticket, Integer>() {
					@Override
					public void accept(Ticket ticket, Integer type) {
						ticket.setType(type);
					}
				});
		}
	}

	public static class ExtraInfoAccessor extends ModelPropertyAccessor {
		public ExtraInfoAccessor() {
			super(new Function<Ticket, String>() {
					@Override
					public String apply(Ticket ticket) {
						return ticket.getExtraInfo();
					}
				},
				new BiConsumer<Ticket, String>() {
					@Override
					public void accept(Ticket ticket, String extraInfo) {
						ticket.setExtraInfo(extraInfo);
					}
				});
		}
	}

	public static class ExpirationDateAccessor extends ModelPropertyAccessor {
		public ExpirationDateAccessor() {
			super(new Function<Ticket, Date>() {
					@Override
					public Date apply(Ticket ticket) {
						return ticket.getExpirationDate();
					}
				},
				new BiConsumer<Ticket, Date>() {
					@Override
					public void accept(Ticket ticket, Date expirationDate) {
						ticket.setExpirationDate(expirationDate);
					}
				});
		}
	}

	private TicketModelAccessors() {
	}
}