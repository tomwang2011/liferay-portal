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

package com.liferay.portlet.social.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.social.kernel.model.SocialRequest;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SocialRequestModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<SocialRequest, String>() {
					@Override
					public String apply(SocialRequest socialRequest) {
						return socialRequest.getUuid();
					}
				},
				new BiConsumer<SocialRequest, String>() {
					@Override
					public void accept(SocialRequest socialRequest, String uuid) {
						socialRequest.setUuid(uuid);
					}
				});
		}
	}

	public static class RequestIdAccessor extends ModelPropertyAccessor {
		public RequestIdAccessor() {
			super(new Function<SocialRequest, Long>() {
					@Override
					public Long apply(SocialRequest socialRequest) {
						return socialRequest.getRequestId();
					}
				},
				new BiConsumer<SocialRequest, Long>() {
					@Override
					public void accept(SocialRequest socialRequest,
						Long requestId) {
						socialRequest.setRequestId(requestId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<SocialRequest, Long>() {
					@Override
					public Long apply(SocialRequest socialRequest) {
						return socialRequest.getGroupId();
					}
				},
				new BiConsumer<SocialRequest, Long>() {
					@Override
					public void accept(SocialRequest socialRequest, Long groupId) {
						socialRequest.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<SocialRequest, Long>() {
					@Override
					public Long apply(SocialRequest socialRequest) {
						return socialRequest.getCompanyId();
					}
				},
				new BiConsumer<SocialRequest, Long>() {
					@Override
					public void accept(SocialRequest socialRequest,
						Long companyId) {
						socialRequest.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<SocialRequest, Long>() {
					@Override
					public Long apply(SocialRequest socialRequest) {
						return socialRequest.getUserId();
					}
				},
				new BiConsumer<SocialRequest, Long>() {
					@Override
					public void accept(SocialRequest socialRequest, Long userId) {
						socialRequest.setUserId(userId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<SocialRequest, Long>() {
					@Override
					public Long apply(SocialRequest socialRequest) {
						return socialRequest.getCreateDate();
					}
				},
				new BiConsumer<SocialRequest, Long>() {
					@Override
					public void accept(SocialRequest socialRequest,
						Long createDate) {
						socialRequest.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<SocialRequest, Long>() {
					@Override
					public Long apply(SocialRequest socialRequest) {
						return socialRequest.getModifiedDate();
					}
				},
				new BiConsumer<SocialRequest, Long>() {
					@Override
					public void accept(SocialRequest socialRequest,
						Long modifiedDate) {
						socialRequest.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<SocialRequest, Long>() {
					@Override
					public Long apply(SocialRequest socialRequest) {
						return socialRequest.getClassNameId();
					}
				},
				new BiConsumer<SocialRequest, Long>() {
					@Override
					public void accept(SocialRequest socialRequest,
						Long classNameId) {
						socialRequest.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<SocialRequest, Long>() {
					@Override
					public Long apply(SocialRequest socialRequest) {
						return socialRequest.getClassPK();
					}
				},
				new BiConsumer<SocialRequest, Long>() {
					@Override
					public void accept(SocialRequest socialRequest, Long classPK) {
						socialRequest.setClassPK(classPK);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<SocialRequest, Integer>() {
					@Override
					public Integer apply(SocialRequest socialRequest) {
						return socialRequest.getType();
					}
				},
				new BiConsumer<SocialRequest, Integer>() {
					@Override
					public void accept(SocialRequest socialRequest, Integer type) {
						socialRequest.setType(type);
					}
				});
		}
	}

	public static class ExtraDataAccessor extends ModelPropertyAccessor {
		public ExtraDataAccessor() {
			super(new Function<SocialRequest, String>() {
					@Override
					public String apply(SocialRequest socialRequest) {
						return socialRequest.getExtraData();
					}
				},
				new BiConsumer<SocialRequest, String>() {
					@Override
					public void accept(SocialRequest socialRequest,
						String extraData) {
						socialRequest.setExtraData(extraData);
					}
				});
		}
	}

	public static class ReceiverUserIdAccessor extends ModelPropertyAccessor {
		public ReceiverUserIdAccessor() {
			super(new Function<SocialRequest, Long>() {
					@Override
					public Long apply(SocialRequest socialRequest) {
						return socialRequest.getReceiverUserId();
					}
				},
				new BiConsumer<SocialRequest, Long>() {
					@Override
					public void accept(SocialRequest socialRequest,
						Long receiverUserId) {
						socialRequest.setReceiverUserId(receiverUserId);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<SocialRequest, Integer>() {
					@Override
					public Integer apply(SocialRequest socialRequest) {
						return socialRequest.getStatus();
					}
				},
				new BiConsumer<SocialRequest, Integer>() {
					@Override
					public void accept(SocialRequest socialRequest,
						Integer status) {
						socialRequest.setStatus(status);
					}
				});
		}
	}

	private SocialRequestModelAccessors() {
	}
}