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

import com.liferay.polls.model.PollsChoice;

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
public class PollsChoiceModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<PollsChoice, String>() {
					@Override
					public String apply(PollsChoice pollsChoice) {
						return pollsChoice.getUuid();
					}
				},
				new BiConsumer<PollsChoice, String>() {
					@Override
					public void accept(PollsChoice pollsChoice, String uuid) {
						pollsChoice.setUuid(uuid);
					}
				});
		}
	}

	public static class ChoiceIdAccessor extends ModelPropertyAccessor {
		public ChoiceIdAccessor() {
			super(new Function<PollsChoice, Long>() {
					@Override
					public Long apply(PollsChoice pollsChoice) {
						return pollsChoice.getChoiceId();
					}
				},
				new BiConsumer<PollsChoice, Long>() {
					@Override
					public void accept(PollsChoice pollsChoice, Long choiceId) {
						pollsChoice.setChoiceId(choiceId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<PollsChoice, Long>() {
					@Override
					public Long apply(PollsChoice pollsChoice) {
						return pollsChoice.getGroupId();
					}
				},
				new BiConsumer<PollsChoice, Long>() {
					@Override
					public void accept(PollsChoice pollsChoice, Long groupId) {
						pollsChoice.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<PollsChoice, Long>() {
					@Override
					public Long apply(PollsChoice pollsChoice) {
						return pollsChoice.getCompanyId();
					}
				},
				new BiConsumer<PollsChoice, Long>() {
					@Override
					public void accept(PollsChoice pollsChoice, Long companyId) {
						pollsChoice.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<PollsChoice, Long>() {
					@Override
					public Long apply(PollsChoice pollsChoice) {
						return pollsChoice.getUserId();
					}
				},
				new BiConsumer<PollsChoice, Long>() {
					@Override
					public void accept(PollsChoice pollsChoice, Long userId) {
						pollsChoice.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<PollsChoice, String>() {
					@Override
					public String apply(PollsChoice pollsChoice) {
						return pollsChoice.getUserName();
					}
				},
				new BiConsumer<PollsChoice, String>() {
					@Override
					public void accept(PollsChoice pollsChoice, String userName) {
						pollsChoice.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<PollsChoice, Date>() {
					@Override
					public Date apply(PollsChoice pollsChoice) {
						return pollsChoice.getCreateDate();
					}
				},
				new BiConsumer<PollsChoice, Date>() {
					@Override
					public void accept(PollsChoice pollsChoice, Date createDate) {
						pollsChoice.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<PollsChoice, Date>() {
					@Override
					public Date apply(PollsChoice pollsChoice) {
						return pollsChoice.getModifiedDate();
					}
				},
				new BiConsumer<PollsChoice, Date>() {
					@Override
					public void accept(PollsChoice pollsChoice,
						Date modifiedDate) {
						pollsChoice.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class QuestionIdAccessor extends ModelPropertyAccessor {
		public QuestionIdAccessor() {
			super(new Function<PollsChoice, Long>() {
					@Override
					public Long apply(PollsChoice pollsChoice) {
						return pollsChoice.getQuestionId();
					}
				},
				new BiConsumer<PollsChoice, Long>() {
					@Override
					public void accept(PollsChoice pollsChoice, Long questionId) {
						pollsChoice.setQuestionId(questionId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<PollsChoice, String>() {
					@Override
					public String apply(PollsChoice pollsChoice) {
						return pollsChoice.getName();
					}
				},
				new BiConsumer<PollsChoice, String>() {
					@Override
					public void accept(PollsChoice pollsChoice, String name) {
						pollsChoice.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<PollsChoice, String>() {
					@Override
					public String apply(PollsChoice pollsChoice) {
						return pollsChoice.getDescription();
					}
				},
				new BiConsumer<PollsChoice, String>() {
					@Override
					public void accept(PollsChoice pollsChoice,
						String description) {
						pollsChoice.setDescription(description);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<PollsChoice, Date>() {
					@Override
					public Date apply(PollsChoice pollsChoice) {
						return pollsChoice.getLastPublishDate();
					}
				},
				new BiConsumer<PollsChoice, Date>() {
					@Override
					public void accept(PollsChoice pollsChoice,
						Date lastPublishDate) {
						pollsChoice.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private PollsChoiceModelAccessors() {
	}
}