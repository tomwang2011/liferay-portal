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

package com.liferay.segments.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.segments.model.SegmentsEntryRel;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Eduardo Garcia
 * @generated
 */
public class SegmentsEntryRelModelAccessors {
	public static class SegmentsEntryRelIdAccessor extends ModelPropertyAccessor {
		public SegmentsEntryRelIdAccessor() {
			super(new Function<SegmentsEntryRel, Long>() {
					@Override
					public Long apply(SegmentsEntryRel segmentsEntryRel) {
						return segmentsEntryRel.getSegmentsEntryRelId();
					}
				},
				new BiConsumer<SegmentsEntryRel, Long>() {
					@Override
					public void accept(SegmentsEntryRel segmentsEntryRel,
						Long segmentsEntryRelId) {
						segmentsEntryRel.setSegmentsEntryRelId(segmentsEntryRelId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<SegmentsEntryRel, Long>() {
					@Override
					public Long apply(SegmentsEntryRel segmentsEntryRel) {
						return segmentsEntryRel.getGroupId();
					}
				},
				new BiConsumer<SegmentsEntryRel, Long>() {
					@Override
					public void accept(SegmentsEntryRel segmentsEntryRel,
						Long groupId) {
						segmentsEntryRel.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<SegmentsEntryRel, Long>() {
					@Override
					public Long apply(SegmentsEntryRel segmentsEntryRel) {
						return segmentsEntryRel.getCompanyId();
					}
				},
				new BiConsumer<SegmentsEntryRel, Long>() {
					@Override
					public void accept(SegmentsEntryRel segmentsEntryRel,
						Long companyId) {
						segmentsEntryRel.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<SegmentsEntryRel, Long>() {
					@Override
					public Long apply(SegmentsEntryRel segmentsEntryRel) {
						return segmentsEntryRel.getUserId();
					}
				},
				new BiConsumer<SegmentsEntryRel, Long>() {
					@Override
					public void accept(SegmentsEntryRel segmentsEntryRel,
						Long userId) {
						segmentsEntryRel.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<SegmentsEntryRel, String>() {
					@Override
					public String apply(SegmentsEntryRel segmentsEntryRel) {
						return segmentsEntryRel.getUserName();
					}
				},
				new BiConsumer<SegmentsEntryRel, String>() {
					@Override
					public void accept(SegmentsEntryRel segmentsEntryRel,
						String userName) {
						segmentsEntryRel.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<SegmentsEntryRel, Date>() {
					@Override
					public Date apply(SegmentsEntryRel segmentsEntryRel) {
						return segmentsEntryRel.getCreateDate();
					}
				},
				new BiConsumer<SegmentsEntryRel, Date>() {
					@Override
					public void accept(SegmentsEntryRel segmentsEntryRel,
						Date createDate) {
						segmentsEntryRel.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<SegmentsEntryRel, Date>() {
					@Override
					public Date apply(SegmentsEntryRel segmentsEntryRel) {
						return segmentsEntryRel.getModifiedDate();
					}
				},
				new BiConsumer<SegmentsEntryRel, Date>() {
					@Override
					public void accept(SegmentsEntryRel segmentsEntryRel,
						Date modifiedDate) {
						segmentsEntryRel.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class SegmentsEntryIdAccessor extends ModelPropertyAccessor {
		public SegmentsEntryIdAccessor() {
			super(new Function<SegmentsEntryRel, Long>() {
					@Override
					public Long apply(SegmentsEntryRel segmentsEntryRel) {
						return segmentsEntryRel.getSegmentsEntryId();
					}
				},
				new BiConsumer<SegmentsEntryRel, Long>() {
					@Override
					public void accept(SegmentsEntryRel segmentsEntryRel,
						Long segmentsEntryId) {
						segmentsEntryRel.setSegmentsEntryId(segmentsEntryId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<SegmentsEntryRel, Long>() {
					@Override
					public Long apply(SegmentsEntryRel segmentsEntryRel) {
						return segmentsEntryRel.getClassNameId();
					}
				},
				new BiConsumer<SegmentsEntryRel, Long>() {
					@Override
					public void accept(SegmentsEntryRel segmentsEntryRel,
						Long classNameId) {
						segmentsEntryRel.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<SegmentsEntryRel, Long>() {
					@Override
					public Long apply(SegmentsEntryRel segmentsEntryRel) {
						return segmentsEntryRel.getClassPK();
					}
				},
				new BiConsumer<SegmentsEntryRel, Long>() {
					@Override
					public void accept(SegmentsEntryRel segmentsEntryRel,
						Long classPK) {
						segmentsEntryRel.setClassPK(classPK);
					}
				});
		}
	}

	private SegmentsEntryRelModelAccessors() {
	}
}