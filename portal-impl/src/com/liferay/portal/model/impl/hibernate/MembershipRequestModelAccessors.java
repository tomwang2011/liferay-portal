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
import com.liferay.portal.kernel.model.MembershipRequest;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MembershipRequestModelAccessors {
	public static class MembershipRequestIdAccessor
		extends ModelPropertyAccessor {
		public MembershipRequestIdAccessor() {
			super(new Function<MembershipRequest, Long>() {
					@Override
					public Long apply(MembershipRequest membershipRequest) {
						return membershipRequest.getMembershipRequestId();
					}
				},
				new BiConsumer<MembershipRequest, Long>() {
					@Override
					public void accept(MembershipRequest membershipRequest,
						Long membershipRequestId) {
						membershipRequest.setMembershipRequestId(membershipRequestId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<MembershipRequest, Long>() {
					@Override
					public Long apply(MembershipRequest membershipRequest) {
						return membershipRequest.getGroupId();
					}
				},
				new BiConsumer<MembershipRequest, Long>() {
					@Override
					public void accept(MembershipRequest membershipRequest,
						Long groupId) {
						membershipRequest.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<MembershipRequest, Long>() {
					@Override
					public Long apply(MembershipRequest membershipRequest) {
						return membershipRequest.getCompanyId();
					}
				},
				new BiConsumer<MembershipRequest, Long>() {
					@Override
					public void accept(MembershipRequest membershipRequest,
						Long companyId) {
						membershipRequest.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<MembershipRequest, Long>() {
					@Override
					public Long apply(MembershipRequest membershipRequest) {
						return membershipRequest.getUserId();
					}
				},
				new BiConsumer<MembershipRequest, Long>() {
					@Override
					public void accept(MembershipRequest membershipRequest,
						Long userId) {
						membershipRequest.setUserId(userId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<MembershipRequest, Date>() {
					@Override
					public Date apply(MembershipRequest membershipRequest) {
						return membershipRequest.getCreateDate();
					}
				},
				new BiConsumer<MembershipRequest, Date>() {
					@Override
					public void accept(MembershipRequest membershipRequest,
						Date createDate) {
						membershipRequest.setCreateDate(createDate);
					}
				});
		}
	}

	public static class CommentsAccessor extends ModelPropertyAccessor {
		public CommentsAccessor() {
			super(new Function<MembershipRequest, String>() {
					@Override
					public String apply(MembershipRequest membershipRequest) {
						return membershipRequest.getComments();
					}
				},
				new BiConsumer<MembershipRequest, String>() {
					@Override
					public void accept(MembershipRequest membershipRequest,
						String comments) {
						membershipRequest.setComments(comments);
					}
				});
		}
	}

	public static class ReplyCommentsAccessor extends ModelPropertyAccessor {
		public ReplyCommentsAccessor() {
			super(new Function<MembershipRequest, String>() {
					@Override
					public String apply(MembershipRequest membershipRequest) {
						return membershipRequest.getReplyComments();
					}
				},
				new BiConsumer<MembershipRequest, String>() {
					@Override
					public void accept(MembershipRequest membershipRequest,
						String replyComments) {
						membershipRequest.setReplyComments(replyComments);
					}
				});
		}
	}

	public static class ReplyDateAccessor extends ModelPropertyAccessor {
		public ReplyDateAccessor() {
			super(new Function<MembershipRequest, Date>() {
					@Override
					public Date apply(MembershipRequest membershipRequest) {
						return membershipRequest.getReplyDate();
					}
				},
				new BiConsumer<MembershipRequest, Date>() {
					@Override
					public void accept(MembershipRequest membershipRequest,
						Date replyDate) {
						membershipRequest.setReplyDate(replyDate);
					}
				});
		}
	}

	public static class ReplierUserIdAccessor extends ModelPropertyAccessor {
		public ReplierUserIdAccessor() {
			super(new Function<MembershipRequest, Long>() {
					@Override
					public Long apply(MembershipRequest membershipRequest) {
						return membershipRequest.getReplierUserId();
					}
				},
				new BiConsumer<MembershipRequest, Long>() {
					@Override
					public void accept(MembershipRequest membershipRequest,
						Long replierUserId) {
						membershipRequest.setReplierUserId(replierUserId);
					}
				});
		}
	}

	public static class StatusIdAccessor extends ModelPropertyAccessor {
		public StatusIdAccessor() {
			super(new Function<MembershipRequest, Long>() {
					@Override
					public Long apply(MembershipRequest membershipRequest) {
						return membershipRequest.getStatusId();
					}
				},
				new BiConsumer<MembershipRequest, Long>() {
					@Override
					public void accept(MembershipRequest membershipRequest,
						Long statusId) {
						membershipRequest.setStatusId(statusId);
					}
				});
		}
	}

	private MembershipRequestModelAccessors() {
	}
}