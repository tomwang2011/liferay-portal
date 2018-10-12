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

package com.liferay.portlet.ratings.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.ratings.kernel.model.RatingsEntry;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RatingsEntryModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<RatingsEntry, String>() {
					@Override
					public String apply(RatingsEntry ratingsEntry) {
						return ratingsEntry.getUuid();
					}
				},
				new BiConsumer<RatingsEntry, String>() {
					@Override
					public void accept(RatingsEntry ratingsEntry, String uuid) {
						ratingsEntry.setUuid(uuid);
					}
				});
		}
	}

	public static class EntryIdAccessor extends ModelPropertyAccessor {
		public EntryIdAccessor() {
			super(new Function<RatingsEntry, Long>() {
					@Override
					public Long apply(RatingsEntry ratingsEntry) {
						return ratingsEntry.getEntryId();
					}
				},
				new BiConsumer<RatingsEntry, Long>() {
					@Override
					public void accept(RatingsEntry ratingsEntry, Long entryId) {
						ratingsEntry.setEntryId(entryId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<RatingsEntry, Long>() {
					@Override
					public Long apply(RatingsEntry ratingsEntry) {
						return ratingsEntry.getCompanyId();
					}
				},
				new BiConsumer<RatingsEntry, Long>() {
					@Override
					public void accept(RatingsEntry ratingsEntry, Long companyId) {
						ratingsEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<RatingsEntry, Long>() {
					@Override
					public Long apply(RatingsEntry ratingsEntry) {
						return ratingsEntry.getUserId();
					}
				},
				new BiConsumer<RatingsEntry, Long>() {
					@Override
					public void accept(RatingsEntry ratingsEntry, Long userId) {
						ratingsEntry.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<RatingsEntry, String>() {
					@Override
					public String apply(RatingsEntry ratingsEntry) {
						return ratingsEntry.getUserName();
					}
				},
				new BiConsumer<RatingsEntry, String>() {
					@Override
					public void accept(RatingsEntry ratingsEntry,
						String userName) {
						ratingsEntry.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<RatingsEntry, Date>() {
					@Override
					public Date apply(RatingsEntry ratingsEntry) {
						return ratingsEntry.getCreateDate();
					}
				},
				new BiConsumer<RatingsEntry, Date>() {
					@Override
					public void accept(RatingsEntry ratingsEntry,
						Date createDate) {
						ratingsEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<RatingsEntry, Date>() {
					@Override
					public Date apply(RatingsEntry ratingsEntry) {
						return ratingsEntry.getModifiedDate();
					}
				},
				new BiConsumer<RatingsEntry, Date>() {
					@Override
					public void accept(RatingsEntry ratingsEntry,
						Date modifiedDate) {
						ratingsEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<RatingsEntry, Long>() {
					@Override
					public Long apply(RatingsEntry ratingsEntry) {
						return ratingsEntry.getClassNameId();
					}
				},
				new BiConsumer<RatingsEntry, Long>() {
					@Override
					public void accept(RatingsEntry ratingsEntry,
						Long classNameId) {
						ratingsEntry.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<RatingsEntry, Long>() {
					@Override
					public Long apply(RatingsEntry ratingsEntry) {
						return ratingsEntry.getClassPK();
					}
				},
				new BiConsumer<RatingsEntry, Long>() {
					@Override
					public void accept(RatingsEntry ratingsEntry, Long classPK) {
						ratingsEntry.setClassPK(classPK);
					}
				});
		}
	}

	public static class ScoreAccessor extends ModelPropertyAccessor {
		public ScoreAccessor() {
			super(new Function<RatingsEntry, Double>() {
					@Override
					public Double apply(RatingsEntry ratingsEntry) {
						return ratingsEntry.getScore();
					}
				},
				new BiConsumer<RatingsEntry, Double>() {
					@Override
					public void accept(RatingsEntry ratingsEntry, Double score) {
						ratingsEntry.setScore(score);
					}
				});
		}
	}

	private RatingsEntryModelAccessors() {
	}
}