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

package com.liferay.polls.model.impl.hibernate;

import com.liferay.polls.model.PollsVote;

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
public class PollsVoteModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<PollsVote, String>() {
					@Override
					public String apply(PollsVote pollsVote) {
						return pollsVote.getUuid();
					}
				},
				new BiConsumer<PollsVote, String>() {
					@Override
					public void accept(PollsVote pollsVote, String uuid) {
						pollsVote.setUuid(uuid);
					}
				});
		}
	}

	public static class VoteIdAccessor extends ModelPropertyAccessor {
		public VoteIdAccessor() {
			super(new Function<PollsVote, Long>() {
					@Override
					public Long apply(PollsVote pollsVote) {
						return pollsVote.getVoteId();
					}
				},
				new BiConsumer<PollsVote, Long>() {
					@Override
					public void accept(PollsVote pollsVote, Long voteId) {
						pollsVote.setVoteId(voteId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<PollsVote, Long>() {
					@Override
					public Long apply(PollsVote pollsVote) {
						return pollsVote.getGroupId();
					}
				},
				new BiConsumer<PollsVote, Long>() {
					@Override
					public void accept(PollsVote pollsVote, Long groupId) {
						pollsVote.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<PollsVote, Long>() {
					@Override
					public Long apply(PollsVote pollsVote) {
						return pollsVote.getCompanyId();
					}
				},
				new BiConsumer<PollsVote, Long>() {
					@Override
					public void accept(PollsVote pollsVote, Long companyId) {
						pollsVote.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<PollsVote, Long>() {
					@Override
					public Long apply(PollsVote pollsVote) {
						return pollsVote.getUserId();
					}
				},
				new BiConsumer<PollsVote, Long>() {
					@Override
					public void accept(PollsVote pollsVote, Long userId) {
						pollsVote.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<PollsVote, String>() {
					@Override
					public String apply(PollsVote pollsVote) {
						return pollsVote.getUserName();
					}
				},
				new BiConsumer<PollsVote, String>() {
					@Override
					public void accept(PollsVote pollsVote, String userName) {
						pollsVote.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<PollsVote, Date>() {
					@Override
					public Date apply(PollsVote pollsVote) {
						return pollsVote.getCreateDate();
					}
				},
				new BiConsumer<PollsVote, Date>() {
					@Override
					public void accept(PollsVote pollsVote, Date createDate) {
						pollsVote.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<PollsVote, Date>() {
					@Override
					public Date apply(PollsVote pollsVote) {
						return pollsVote.getModifiedDate();
					}
				},
				new BiConsumer<PollsVote, Date>() {
					@Override
					public void accept(PollsVote pollsVote, Date modifiedDate) {
						pollsVote.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class QuestionIdAccessor extends ModelPropertyAccessor {
		public QuestionIdAccessor() {
			super(new Function<PollsVote, Long>() {
					@Override
					public Long apply(PollsVote pollsVote) {
						return pollsVote.getQuestionId();
					}
				},
				new BiConsumer<PollsVote, Long>() {
					@Override
					public void accept(PollsVote pollsVote, Long questionId) {
						pollsVote.setQuestionId(questionId);
					}
				});
		}
	}

	public static class ChoiceIdAccessor extends ModelPropertyAccessor {
		public ChoiceIdAccessor() {
			super(new Function<PollsVote, Long>() {
					@Override
					public Long apply(PollsVote pollsVote) {
						return pollsVote.getChoiceId();
					}
				},
				new BiConsumer<PollsVote, Long>() {
					@Override
					public void accept(PollsVote pollsVote, Long choiceId) {
						pollsVote.setChoiceId(choiceId);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<PollsVote, Date>() {
					@Override
					public Date apply(PollsVote pollsVote) {
						return pollsVote.getLastPublishDate();
					}
				},
				new BiConsumer<PollsVote, Date>() {
					@Override
					public void accept(PollsVote pollsVote, Date lastPublishDate) {
						pollsVote.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class VoteDateAccessor extends ModelPropertyAccessor {
		public VoteDateAccessor() {
			super(new Function<PollsVote, Date>() {
					@Override
					public Date apply(PollsVote pollsVote) {
						return pollsVote.getVoteDate();
					}
				},
				new BiConsumer<PollsVote, Date>() {
					@Override
					public void accept(PollsVote pollsVote, Date voteDate) {
						pollsVote.setVoteDate(voteDate);
					}
				});
		}
	}

	private PollsVoteModelAccessors() {
	}
}