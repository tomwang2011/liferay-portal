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

package com.liferay.sharing.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.sharing.model.SharingEntry;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SharingEntryModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<SharingEntry, String>() {
					@Override
					public String apply(SharingEntry sharingEntry) {
						return sharingEntry.getUuid();
					}
				},
				new BiConsumer<SharingEntry, String>() {
					@Override
					public void accept(SharingEntry sharingEntry, String uuid) {
						sharingEntry.setUuid(uuid);
					}
				});
		}
	}

	public static class SharingEntryIdAccessor extends ModelPropertyAccessor {
		public SharingEntryIdAccessor() {
			super(new Function<SharingEntry, Long>() {
					@Override
					public Long apply(SharingEntry sharingEntry) {
						return sharingEntry.getSharingEntryId();
					}
				},
				new BiConsumer<SharingEntry, Long>() {
					@Override
					public void accept(SharingEntry sharingEntry,
						Long sharingEntryId) {
						sharingEntry.setSharingEntryId(sharingEntryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<SharingEntry, Long>() {
					@Override
					public Long apply(SharingEntry sharingEntry) {
						return sharingEntry.getGroupId();
					}
				},
				new BiConsumer<SharingEntry, Long>() {
					@Override
					public void accept(SharingEntry sharingEntry, Long groupId) {
						sharingEntry.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<SharingEntry, Long>() {
					@Override
					public Long apply(SharingEntry sharingEntry) {
						return sharingEntry.getCompanyId();
					}
				},
				new BiConsumer<SharingEntry, Long>() {
					@Override
					public void accept(SharingEntry sharingEntry, Long companyId) {
						sharingEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<SharingEntry, Date>() {
					@Override
					public Date apply(SharingEntry sharingEntry) {
						return sharingEntry.getCreateDate();
					}
				},
				new BiConsumer<SharingEntry, Date>() {
					@Override
					public void accept(SharingEntry sharingEntry,
						Date createDate) {
						sharingEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<SharingEntry, Date>() {
					@Override
					public Date apply(SharingEntry sharingEntry) {
						return sharingEntry.getModifiedDate();
					}
				},
				new BiConsumer<SharingEntry, Date>() {
					@Override
					public void accept(SharingEntry sharingEntry,
						Date modifiedDate) {
						sharingEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class FromUserIdAccessor extends ModelPropertyAccessor {
		public FromUserIdAccessor() {
			super(new Function<SharingEntry, Long>() {
					@Override
					public Long apply(SharingEntry sharingEntry) {
						return sharingEntry.getFromUserId();
					}
				},
				new BiConsumer<SharingEntry, Long>() {
					@Override
					public void accept(SharingEntry sharingEntry,
						Long fromUserId) {
						sharingEntry.setFromUserId(fromUserId);
					}
				});
		}
	}

	public static class ToUserIdAccessor extends ModelPropertyAccessor {
		public ToUserIdAccessor() {
			super(new Function<SharingEntry, Long>() {
					@Override
					public Long apply(SharingEntry sharingEntry) {
						return sharingEntry.getToUserId();
					}
				},
				new BiConsumer<SharingEntry, Long>() {
					@Override
					public void accept(SharingEntry sharingEntry, Long toUserId) {
						sharingEntry.setToUserId(toUserId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<SharingEntry, Long>() {
					@Override
					public Long apply(SharingEntry sharingEntry) {
						return sharingEntry.getClassNameId();
					}
				},
				new BiConsumer<SharingEntry, Long>() {
					@Override
					public void accept(SharingEntry sharingEntry,
						Long classNameId) {
						sharingEntry.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<SharingEntry, Long>() {
					@Override
					public Long apply(SharingEntry sharingEntry) {
						return sharingEntry.getClassPK();
					}
				},
				new BiConsumer<SharingEntry, Long>() {
					@Override
					public void accept(SharingEntry sharingEntry, Long classPK) {
						sharingEntry.setClassPK(classPK);
					}
				});
		}
	}

	public static class ShareableAccessor extends ModelPropertyAccessor {
		public ShareableAccessor() {
			super(new Function<SharingEntry, Boolean>() {
					@Override
					public Boolean apply(SharingEntry sharingEntry) {
						return sharingEntry.getShareable();
					}
				},
				new BiConsumer<SharingEntry, Boolean>() {
					@Override
					public void accept(SharingEntry sharingEntry,
						Boolean shareable) {
						sharingEntry.setShareable(shareable);
					}
				});
		}
	}

	public static class ActionIdsAccessor extends ModelPropertyAccessor {
		public ActionIdsAccessor() {
			super(new Function<SharingEntry, Long>() {
					@Override
					public Long apply(SharingEntry sharingEntry) {
						return sharingEntry.getActionIds();
					}
				},
				new BiConsumer<SharingEntry, Long>() {
					@Override
					public void accept(SharingEntry sharingEntry, Long actionIds) {
						sharingEntry.setActionIds(actionIds);
					}
				});
		}
	}

	public static class ExpirationDateAccessor extends ModelPropertyAccessor {
		public ExpirationDateAccessor() {
			super(new Function<SharingEntry, Date>() {
					@Override
					public Date apply(SharingEntry sharingEntry) {
						return sharingEntry.getExpirationDate();
					}
				},
				new BiConsumer<SharingEntry, Date>() {
					@Override
					public void accept(SharingEntry sharingEntry,
						Date expirationDate) {
						sharingEntry.setExpirationDate(expirationDate);
					}
				});
		}
	}

	private SharingEntryModelAccessors() {
	}
}