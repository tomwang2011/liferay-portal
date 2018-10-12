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

package com.liferay.microblogs.model.impl.hibernate;

import com.liferay.microblogs.model.MicroblogsEntry;

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
public class MicroblogsEntryModelAccessors {
	public static class MicroblogsEntryIdAccessor extends ModelPropertyAccessor {
		public MicroblogsEntryIdAccessor() {
			super(new Function<MicroblogsEntry, Long>() {
					@Override
					public Long apply(MicroblogsEntry microblogsEntry) {
						return microblogsEntry.getMicroblogsEntryId();
					}
				},
				new BiConsumer<MicroblogsEntry, Long>() {
					@Override
					public void accept(MicroblogsEntry microblogsEntry,
						Long microblogsEntryId) {
						microblogsEntry.setMicroblogsEntryId(microblogsEntryId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<MicroblogsEntry, Long>() {
					@Override
					public Long apply(MicroblogsEntry microblogsEntry) {
						return microblogsEntry.getCompanyId();
					}
				},
				new BiConsumer<MicroblogsEntry, Long>() {
					@Override
					public void accept(MicroblogsEntry microblogsEntry,
						Long companyId) {
						microblogsEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<MicroblogsEntry, Long>() {
					@Override
					public Long apply(MicroblogsEntry microblogsEntry) {
						return microblogsEntry.getUserId();
					}
				},
				new BiConsumer<MicroblogsEntry, Long>() {
					@Override
					public void accept(MicroblogsEntry microblogsEntry,
						Long userId) {
						microblogsEntry.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<MicroblogsEntry, String>() {
					@Override
					public String apply(MicroblogsEntry microblogsEntry) {
						return microblogsEntry.getUserName();
					}
				},
				new BiConsumer<MicroblogsEntry, String>() {
					@Override
					public void accept(MicroblogsEntry microblogsEntry,
						String userName) {
						microblogsEntry.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<MicroblogsEntry, Date>() {
					@Override
					public Date apply(MicroblogsEntry microblogsEntry) {
						return microblogsEntry.getCreateDate();
					}
				},
				new BiConsumer<MicroblogsEntry, Date>() {
					@Override
					public void accept(MicroblogsEntry microblogsEntry,
						Date createDate) {
						microblogsEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<MicroblogsEntry, Date>() {
					@Override
					public Date apply(MicroblogsEntry microblogsEntry) {
						return microblogsEntry.getModifiedDate();
					}
				},
				new BiConsumer<MicroblogsEntry, Date>() {
					@Override
					public void accept(MicroblogsEntry microblogsEntry,
						Date modifiedDate) {
						microblogsEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class CreatorClassNameIdAccessor extends ModelPropertyAccessor {
		public CreatorClassNameIdAccessor() {
			super(new Function<MicroblogsEntry, Long>() {
					@Override
					public Long apply(MicroblogsEntry microblogsEntry) {
						return microblogsEntry.getCreatorClassNameId();
					}
				},
				new BiConsumer<MicroblogsEntry, Long>() {
					@Override
					public void accept(MicroblogsEntry microblogsEntry,
						Long creatorClassNameId) {
						microblogsEntry.setCreatorClassNameId(creatorClassNameId);
					}
				});
		}
	}

	public static class CreatorClassPKAccessor extends ModelPropertyAccessor {
		public CreatorClassPKAccessor() {
			super(new Function<MicroblogsEntry, Long>() {
					@Override
					public Long apply(MicroblogsEntry microblogsEntry) {
						return microblogsEntry.getCreatorClassPK();
					}
				},
				new BiConsumer<MicroblogsEntry, Long>() {
					@Override
					public void accept(MicroblogsEntry microblogsEntry,
						Long creatorClassPK) {
						microblogsEntry.setCreatorClassPK(creatorClassPK);
					}
				});
		}
	}

	public static class ContentAccessor extends ModelPropertyAccessor {
		public ContentAccessor() {
			super(new Function<MicroblogsEntry, String>() {
					@Override
					public String apply(MicroblogsEntry microblogsEntry) {
						return microblogsEntry.getContent();
					}
				},
				new BiConsumer<MicroblogsEntry, String>() {
					@Override
					public void accept(MicroblogsEntry microblogsEntry,
						String content) {
						microblogsEntry.setContent(content);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<MicroblogsEntry, Integer>() {
					@Override
					public Integer apply(MicroblogsEntry microblogsEntry) {
						return microblogsEntry.getType();
					}
				},
				new BiConsumer<MicroblogsEntry, Integer>() {
					@Override
					public void accept(MicroblogsEntry microblogsEntry,
						Integer type) {
						microblogsEntry.setType(type);
					}
				});
		}
	}

	public static class ParentMicroblogsEntryIdAccessor
		extends ModelPropertyAccessor {
		public ParentMicroblogsEntryIdAccessor() {
			super(new Function<MicroblogsEntry, Long>() {
					@Override
					public Long apply(MicroblogsEntry microblogsEntry) {
						return microblogsEntry.getParentMicroblogsEntryId();
					}
				},
				new BiConsumer<MicroblogsEntry, Long>() {
					@Override
					public void accept(MicroblogsEntry microblogsEntry,
						Long parentMicroblogsEntryId) {
						microblogsEntry.setParentMicroblogsEntryId(parentMicroblogsEntryId);
					}
				});
		}
	}

	public static class SocialRelationTypeAccessor extends ModelPropertyAccessor {
		public SocialRelationTypeAccessor() {
			super(new Function<MicroblogsEntry, Integer>() {
					@Override
					public Integer apply(MicroblogsEntry microblogsEntry) {
						return microblogsEntry.getSocialRelationType();
					}
				},
				new BiConsumer<MicroblogsEntry, Integer>() {
					@Override
					public void accept(MicroblogsEntry microblogsEntry,
						Integer socialRelationType) {
						microblogsEntry.setSocialRelationType(socialRelationType);
					}
				});
		}
	}

	private MicroblogsEntryModelAccessors() {
	}
}