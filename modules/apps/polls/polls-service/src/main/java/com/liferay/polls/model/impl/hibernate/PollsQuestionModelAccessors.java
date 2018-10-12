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

import com.liferay.polls.model.PollsQuestion;

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
public class PollsQuestionModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<PollsQuestion, String>() {
					@Override
					public String apply(PollsQuestion pollsQuestion) {
						return pollsQuestion.getUuid();
					}
				},
				new BiConsumer<PollsQuestion, String>() {
					@Override
					public void accept(PollsQuestion pollsQuestion, String uuid) {
						pollsQuestion.setUuid(uuid);
					}
				});
		}
	}

	public static class QuestionIdAccessor extends ModelPropertyAccessor {
		public QuestionIdAccessor() {
			super(new Function<PollsQuestion, Long>() {
					@Override
					public Long apply(PollsQuestion pollsQuestion) {
						return pollsQuestion.getQuestionId();
					}
				},
				new BiConsumer<PollsQuestion, Long>() {
					@Override
					public void accept(PollsQuestion pollsQuestion,
						Long questionId) {
						pollsQuestion.setQuestionId(questionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<PollsQuestion, Long>() {
					@Override
					public Long apply(PollsQuestion pollsQuestion) {
						return pollsQuestion.getGroupId();
					}
				},
				new BiConsumer<PollsQuestion, Long>() {
					@Override
					public void accept(PollsQuestion pollsQuestion, Long groupId) {
						pollsQuestion.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<PollsQuestion, Long>() {
					@Override
					public Long apply(PollsQuestion pollsQuestion) {
						return pollsQuestion.getCompanyId();
					}
				},
				new BiConsumer<PollsQuestion, Long>() {
					@Override
					public void accept(PollsQuestion pollsQuestion,
						Long companyId) {
						pollsQuestion.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<PollsQuestion, Long>() {
					@Override
					public Long apply(PollsQuestion pollsQuestion) {
						return pollsQuestion.getUserId();
					}
				},
				new BiConsumer<PollsQuestion, Long>() {
					@Override
					public void accept(PollsQuestion pollsQuestion, Long userId) {
						pollsQuestion.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<PollsQuestion, String>() {
					@Override
					public String apply(PollsQuestion pollsQuestion) {
						return pollsQuestion.getUserName();
					}
				},
				new BiConsumer<PollsQuestion, String>() {
					@Override
					public void accept(PollsQuestion pollsQuestion,
						String userName) {
						pollsQuestion.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<PollsQuestion, Date>() {
					@Override
					public Date apply(PollsQuestion pollsQuestion) {
						return pollsQuestion.getCreateDate();
					}
				},
				new BiConsumer<PollsQuestion, Date>() {
					@Override
					public void accept(PollsQuestion pollsQuestion,
						Date createDate) {
						pollsQuestion.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<PollsQuestion, Date>() {
					@Override
					public Date apply(PollsQuestion pollsQuestion) {
						return pollsQuestion.getModifiedDate();
					}
				},
				new BiConsumer<PollsQuestion, Date>() {
					@Override
					public void accept(PollsQuestion pollsQuestion,
						Date modifiedDate) {
						pollsQuestion.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<PollsQuestion, String>() {
					@Override
					public String apply(PollsQuestion pollsQuestion) {
						return pollsQuestion.getTitle();
					}
				},
				new BiConsumer<PollsQuestion, String>() {
					@Override
					public void accept(PollsQuestion pollsQuestion, String title) {
						pollsQuestion.setTitle(title);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<PollsQuestion, String>() {
					@Override
					public String apply(PollsQuestion pollsQuestion) {
						return pollsQuestion.getDescription();
					}
				},
				new BiConsumer<PollsQuestion, String>() {
					@Override
					public void accept(PollsQuestion pollsQuestion,
						String description) {
						pollsQuestion.setDescription(description);
					}
				});
		}
	}

	public static class ExpirationDateAccessor extends ModelPropertyAccessor {
		public ExpirationDateAccessor() {
			super(new Function<PollsQuestion, Date>() {
					@Override
					public Date apply(PollsQuestion pollsQuestion) {
						return pollsQuestion.getExpirationDate();
					}
				},
				new BiConsumer<PollsQuestion, Date>() {
					@Override
					public void accept(PollsQuestion pollsQuestion,
						Date expirationDate) {
						pollsQuestion.setExpirationDate(expirationDate);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<PollsQuestion, Date>() {
					@Override
					public Date apply(PollsQuestion pollsQuestion) {
						return pollsQuestion.getLastPublishDate();
					}
				},
				new BiConsumer<PollsQuestion, Date>() {
					@Override
					public void accept(PollsQuestion pollsQuestion,
						Date lastPublishDate) {
						pollsQuestion.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class LastVoteDateAccessor extends ModelPropertyAccessor {
		public LastVoteDateAccessor() {
			super(new Function<PollsQuestion, Date>() {
					@Override
					public Date apply(PollsQuestion pollsQuestion) {
						return pollsQuestion.getLastVoteDate();
					}
				},
				new BiConsumer<PollsQuestion, Date>() {
					@Override
					public void accept(PollsQuestion pollsQuestion,
						Date lastVoteDate) {
						pollsQuestion.setLastVoteDate(lastVoteDate);
					}
				});
		}
	}

	private PollsQuestionModelAccessors() {
	}
}