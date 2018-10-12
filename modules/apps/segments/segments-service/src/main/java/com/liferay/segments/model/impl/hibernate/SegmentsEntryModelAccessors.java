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

import com.liferay.segments.model.SegmentsEntry;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Eduardo Garcia
 * @generated
 */
public class SegmentsEntryModelAccessors {
	public static class SegmentsEntryIdAccessor extends ModelPropertyAccessor {
		public SegmentsEntryIdAccessor() {
			super(new Function<SegmentsEntry, Long>() {
					@Override
					public Long apply(SegmentsEntry segmentsEntry) {
						return segmentsEntry.getSegmentsEntryId();
					}
				},
				new BiConsumer<SegmentsEntry, Long>() {
					@Override
					public void accept(SegmentsEntry segmentsEntry,
						Long segmentsEntryId) {
						segmentsEntry.setSegmentsEntryId(segmentsEntryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<SegmentsEntry, Long>() {
					@Override
					public Long apply(SegmentsEntry segmentsEntry) {
						return segmentsEntry.getGroupId();
					}
				},
				new BiConsumer<SegmentsEntry, Long>() {
					@Override
					public void accept(SegmentsEntry segmentsEntry, Long groupId) {
						segmentsEntry.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<SegmentsEntry, Long>() {
					@Override
					public Long apply(SegmentsEntry segmentsEntry) {
						return segmentsEntry.getCompanyId();
					}
				},
				new BiConsumer<SegmentsEntry, Long>() {
					@Override
					public void accept(SegmentsEntry segmentsEntry,
						Long companyId) {
						segmentsEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<SegmentsEntry, Long>() {
					@Override
					public Long apply(SegmentsEntry segmentsEntry) {
						return segmentsEntry.getUserId();
					}
				},
				new BiConsumer<SegmentsEntry, Long>() {
					@Override
					public void accept(SegmentsEntry segmentsEntry, Long userId) {
						segmentsEntry.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<SegmentsEntry, String>() {
					@Override
					public String apply(SegmentsEntry segmentsEntry) {
						return segmentsEntry.getUserName();
					}
				},
				new BiConsumer<SegmentsEntry, String>() {
					@Override
					public void accept(SegmentsEntry segmentsEntry,
						String userName) {
						segmentsEntry.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<SegmentsEntry, Date>() {
					@Override
					public Date apply(SegmentsEntry segmentsEntry) {
						return segmentsEntry.getCreateDate();
					}
				},
				new BiConsumer<SegmentsEntry, Date>() {
					@Override
					public void accept(SegmentsEntry segmentsEntry,
						Date createDate) {
						segmentsEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<SegmentsEntry, Date>() {
					@Override
					public Date apply(SegmentsEntry segmentsEntry) {
						return segmentsEntry.getModifiedDate();
					}
				},
				new BiConsumer<SegmentsEntry, Date>() {
					@Override
					public void accept(SegmentsEntry segmentsEntry,
						Date modifiedDate) {
						segmentsEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<SegmentsEntry, String>() {
					@Override
					public String apply(SegmentsEntry segmentsEntry) {
						return segmentsEntry.getName();
					}
				},
				new BiConsumer<SegmentsEntry, String>() {
					@Override
					public void accept(SegmentsEntry segmentsEntry, String name) {
						segmentsEntry.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<SegmentsEntry, String>() {
					@Override
					public String apply(SegmentsEntry segmentsEntry) {
						return segmentsEntry.getDescription();
					}
				},
				new BiConsumer<SegmentsEntry, String>() {
					@Override
					public void accept(SegmentsEntry segmentsEntry,
						String description) {
						segmentsEntry.setDescription(description);
					}
				});
		}
	}

	public static class ActiveAccessor extends ModelPropertyAccessor {
		public ActiveAccessor() {
			super(new Function<SegmentsEntry, Boolean>() {
					@Override
					public Boolean apply(SegmentsEntry segmentsEntry) {
						return segmentsEntry.getActive();
					}
				},
				new BiConsumer<SegmentsEntry, Boolean>() {
					@Override
					public void accept(SegmentsEntry segmentsEntry,
						Boolean active) {
						segmentsEntry.setActive(active);
					}
				});
		}
	}

	public static class CriteriaAccessor extends ModelPropertyAccessor {
		public CriteriaAccessor() {
			super(new Function<SegmentsEntry, String>() {
					@Override
					public String apply(SegmentsEntry segmentsEntry) {
						return segmentsEntry.getCriteria();
					}
				},
				new BiConsumer<SegmentsEntry, String>() {
					@Override
					public void accept(SegmentsEntry segmentsEntry,
						String criteria) {
						segmentsEntry.setCriteria(criteria);
					}
				});
		}
	}

	public static class KeyAccessor extends ModelPropertyAccessor {
		public KeyAccessor() {
			super(new Function<SegmentsEntry, String>() {
					@Override
					public String apply(SegmentsEntry segmentsEntry) {
						return segmentsEntry.getKey();
					}
				},
				new BiConsumer<SegmentsEntry, String>() {
					@Override
					public void accept(SegmentsEntry segmentsEntry, String key) {
						segmentsEntry.setKey(key);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<SegmentsEntry, String>() {
					@Override
					public String apply(SegmentsEntry segmentsEntry) {
						return segmentsEntry.getType();
					}
				},
				new BiConsumer<SegmentsEntry, String>() {
					@Override
					public void accept(SegmentsEntry segmentsEntry, String type) {
						segmentsEntry.setType(type);
					}
				});
		}
	}

	private SegmentsEntryModelAccessors() {
	}
}