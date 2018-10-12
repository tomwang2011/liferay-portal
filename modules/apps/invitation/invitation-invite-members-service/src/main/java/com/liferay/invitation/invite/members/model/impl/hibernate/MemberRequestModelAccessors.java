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

package com.liferay.invitation.invite.members.model.impl.hibernate;

import com.liferay.invitation.invite.members.model.MemberRequest;

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
public class MemberRequestModelAccessors {
	public static class MemberRequestIdAccessor extends ModelPropertyAccessor {
		public MemberRequestIdAccessor() {
			super(new Function<MemberRequest, Long>() {
					@Override
					public Long apply(MemberRequest memberRequest) {
						return memberRequest.getMemberRequestId();
					}
				},
				new BiConsumer<MemberRequest, Long>() {
					@Override
					public void accept(MemberRequest memberRequest,
						Long memberRequestId) {
						memberRequest.setMemberRequestId(memberRequestId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<MemberRequest, Long>() {
					@Override
					public Long apply(MemberRequest memberRequest) {
						return memberRequest.getGroupId();
					}
				},
				new BiConsumer<MemberRequest, Long>() {
					@Override
					public void accept(MemberRequest memberRequest, Long groupId) {
						memberRequest.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<MemberRequest, Long>() {
					@Override
					public Long apply(MemberRequest memberRequest) {
						return memberRequest.getCompanyId();
					}
				},
				new BiConsumer<MemberRequest, Long>() {
					@Override
					public void accept(MemberRequest memberRequest,
						Long companyId) {
						memberRequest.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<MemberRequest, Long>() {
					@Override
					public Long apply(MemberRequest memberRequest) {
						return memberRequest.getUserId();
					}
				},
				new BiConsumer<MemberRequest, Long>() {
					@Override
					public void accept(MemberRequest memberRequest, Long userId) {
						memberRequest.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<MemberRequest, String>() {
					@Override
					public String apply(MemberRequest memberRequest) {
						return memberRequest.getUserName();
					}
				},
				new BiConsumer<MemberRequest, String>() {
					@Override
					public void accept(MemberRequest memberRequest,
						String userName) {
						memberRequest.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<MemberRequest, Date>() {
					@Override
					public Date apply(MemberRequest memberRequest) {
						return memberRequest.getCreateDate();
					}
				},
				new BiConsumer<MemberRequest, Date>() {
					@Override
					public void accept(MemberRequest memberRequest,
						Date createDate) {
						memberRequest.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<MemberRequest, Date>() {
					@Override
					public Date apply(MemberRequest memberRequest) {
						return memberRequest.getModifiedDate();
					}
				},
				new BiConsumer<MemberRequest, Date>() {
					@Override
					public void accept(MemberRequest memberRequest,
						Date modifiedDate) {
						memberRequest.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class KeyAccessor extends ModelPropertyAccessor {
		public KeyAccessor() {
			super(new Function<MemberRequest, String>() {
					@Override
					public String apply(MemberRequest memberRequest) {
						return memberRequest.getKey();
					}
				},
				new BiConsumer<MemberRequest, String>() {
					@Override
					public void accept(MemberRequest memberRequest, String key) {
						memberRequest.setKey(key);
					}
				});
		}
	}

	public static class ReceiverUserIdAccessor extends ModelPropertyAccessor {
		public ReceiverUserIdAccessor() {
			super(new Function<MemberRequest, Long>() {
					@Override
					public Long apply(MemberRequest memberRequest) {
						return memberRequest.getReceiverUserId();
					}
				},
				new BiConsumer<MemberRequest, Long>() {
					@Override
					public void accept(MemberRequest memberRequest,
						Long receiverUserId) {
						memberRequest.setReceiverUserId(receiverUserId);
					}
				});
		}
	}

	public static class InvitedRoleIdAccessor extends ModelPropertyAccessor {
		public InvitedRoleIdAccessor() {
			super(new Function<MemberRequest, Long>() {
					@Override
					public Long apply(MemberRequest memberRequest) {
						return memberRequest.getInvitedRoleId();
					}
				},
				new BiConsumer<MemberRequest, Long>() {
					@Override
					public void accept(MemberRequest memberRequest,
						Long invitedRoleId) {
						memberRequest.setInvitedRoleId(invitedRoleId);
					}
				});
		}
	}

	public static class InvitedTeamIdAccessor extends ModelPropertyAccessor {
		public InvitedTeamIdAccessor() {
			super(new Function<MemberRequest, Long>() {
					@Override
					public Long apply(MemberRequest memberRequest) {
						return memberRequest.getInvitedTeamId();
					}
				},
				new BiConsumer<MemberRequest, Long>() {
					@Override
					public void accept(MemberRequest memberRequest,
						Long invitedTeamId) {
						memberRequest.setInvitedTeamId(invitedTeamId);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<MemberRequest, Integer>() {
					@Override
					public Integer apply(MemberRequest memberRequest) {
						return memberRequest.getStatus();
					}
				},
				new BiConsumer<MemberRequest, Integer>() {
					@Override
					public void accept(MemberRequest memberRequest,
						Integer status) {
						memberRequest.setStatus(status);
					}
				});
		}
	}

	private MemberRequestModelAccessors() {
	}
}