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

package com.liferay.knowledge.base.model.impl.hibernate;

import com.liferay.knowledge.base.model.KBComment;

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
public class KBCommentModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<KBComment, String>() {
					@Override
					public String apply(KBComment kbComment) {
						return kbComment.getUuid();
					}
				},
				new BiConsumer<KBComment, String>() {
					@Override
					public void accept(KBComment kbComment, String uuid) {
						kbComment.setUuid(uuid);
					}
				});
		}
	}

	public static class KbCommentIdAccessor extends ModelPropertyAccessor {
		public KbCommentIdAccessor() {
			super(new Function<KBComment, Long>() {
					@Override
					public Long apply(KBComment kbComment) {
						return kbComment.getKbCommentId();
					}
				},
				new BiConsumer<KBComment, Long>() {
					@Override
					public void accept(KBComment kbComment, Long kbCommentId) {
						kbComment.setKbCommentId(kbCommentId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KBComment, Long>() {
					@Override
					public Long apply(KBComment kbComment) {
						return kbComment.getGroupId();
					}
				},
				new BiConsumer<KBComment, Long>() {
					@Override
					public void accept(KBComment kbComment, Long groupId) {
						kbComment.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KBComment, Long>() {
					@Override
					public Long apply(KBComment kbComment) {
						return kbComment.getCompanyId();
					}
				},
				new BiConsumer<KBComment, Long>() {
					@Override
					public void accept(KBComment kbComment, Long companyId) {
						kbComment.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KBComment, Long>() {
					@Override
					public Long apply(KBComment kbComment) {
						return kbComment.getUserId();
					}
				},
				new BiConsumer<KBComment, Long>() {
					@Override
					public void accept(KBComment kbComment, Long userId) {
						kbComment.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KBComment, String>() {
					@Override
					public String apply(KBComment kbComment) {
						return kbComment.getUserName();
					}
				},
				new BiConsumer<KBComment, String>() {
					@Override
					public void accept(KBComment kbComment, String userName) {
						kbComment.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KBComment, Date>() {
					@Override
					public Date apply(KBComment kbComment) {
						return kbComment.getCreateDate();
					}
				},
				new BiConsumer<KBComment, Date>() {
					@Override
					public void accept(KBComment kbComment, Date createDate) {
						kbComment.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KBComment, Date>() {
					@Override
					public Date apply(KBComment kbComment) {
						return kbComment.getModifiedDate();
					}
				},
				new BiConsumer<KBComment, Date>() {
					@Override
					public void accept(KBComment kbComment, Date modifiedDate) {
						kbComment.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<KBComment, Long>() {
					@Override
					public Long apply(KBComment kbComment) {
						return kbComment.getClassNameId();
					}
				},
				new BiConsumer<KBComment, Long>() {
					@Override
					public void accept(KBComment kbComment, Long classNameId) {
						kbComment.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<KBComment, Long>() {
					@Override
					public Long apply(KBComment kbComment) {
						return kbComment.getClassPK();
					}
				},
				new BiConsumer<KBComment, Long>() {
					@Override
					public void accept(KBComment kbComment, Long classPK) {
						kbComment.setClassPK(classPK);
					}
				});
		}
	}

	public static class ContentAccessor extends ModelPropertyAccessor {
		public ContentAccessor() {
			super(new Function<KBComment, String>() {
					@Override
					public String apply(KBComment kbComment) {
						return kbComment.getContent();
					}
				},
				new BiConsumer<KBComment, String>() {
					@Override
					public void accept(KBComment kbComment, String content) {
						kbComment.setContent(content);
					}
				});
		}
	}

	public static class UserRatingAccessor extends ModelPropertyAccessor {
		public UserRatingAccessor() {
			super(new Function<KBComment, Integer>() {
					@Override
					public Integer apply(KBComment kbComment) {
						return kbComment.getUserRating();
					}
				},
				new BiConsumer<KBComment, Integer>() {
					@Override
					public void accept(KBComment kbComment, Integer userRating) {
						kbComment.setUserRating(userRating);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<KBComment, Date>() {
					@Override
					public Date apply(KBComment kbComment) {
						return kbComment.getLastPublishDate();
					}
				},
				new BiConsumer<KBComment, Date>() {
					@Override
					public void accept(KBComment kbComment, Date lastPublishDate) {
						kbComment.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<KBComment, Integer>() {
					@Override
					public Integer apply(KBComment kbComment) {
						return kbComment.getStatus();
					}
				},
				new BiConsumer<KBComment, Integer>() {
					@Override
					public void accept(KBComment kbComment, Integer status) {
						kbComment.setStatus(status);
					}
				});
		}
	}

	private KBCommentModelAccessors() {
	}
}