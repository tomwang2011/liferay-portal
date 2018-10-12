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

package com.liferay.portlet.announcements.model.impl.hibernate;

import com.liferay.announcements.kernel.model.AnnouncementsEntry;

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
public class AnnouncementsEntryModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<AnnouncementsEntry, String>() {
					@Override
					public String apply(AnnouncementsEntry announcementsEntry) {
						return announcementsEntry.getUuid();
					}
				},
				new BiConsumer<AnnouncementsEntry, String>() {
					@Override
					public void accept(AnnouncementsEntry announcementsEntry,
						String uuid) {
						announcementsEntry.setUuid(uuid);
					}
				});
		}
	}

	public static class EntryIdAccessor extends ModelPropertyAccessor {
		public EntryIdAccessor() {
			super(new Function<AnnouncementsEntry, Long>() {
					@Override
					public Long apply(AnnouncementsEntry announcementsEntry) {
						return announcementsEntry.getEntryId();
					}
				},
				new BiConsumer<AnnouncementsEntry, Long>() {
					@Override
					public void accept(AnnouncementsEntry announcementsEntry,
						Long entryId) {
						announcementsEntry.setEntryId(entryId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<AnnouncementsEntry, Long>() {
					@Override
					public Long apply(AnnouncementsEntry announcementsEntry) {
						return announcementsEntry.getCompanyId();
					}
				},
				new BiConsumer<AnnouncementsEntry, Long>() {
					@Override
					public void accept(AnnouncementsEntry announcementsEntry,
						Long companyId) {
						announcementsEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<AnnouncementsEntry, Long>() {
					@Override
					public Long apply(AnnouncementsEntry announcementsEntry) {
						return announcementsEntry.getUserId();
					}
				},
				new BiConsumer<AnnouncementsEntry, Long>() {
					@Override
					public void accept(AnnouncementsEntry announcementsEntry,
						Long userId) {
						announcementsEntry.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<AnnouncementsEntry, String>() {
					@Override
					public String apply(AnnouncementsEntry announcementsEntry) {
						return announcementsEntry.getUserName();
					}
				},
				new BiConsumer<AnnouncementsEntry, String>() {
					@Override
					public void accept(AnnouncementsEntry announcementsEntry,
						String userName) {
						announcementsEntry.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<AnnouncementsEntry, Date>() {
					@Override
					public Date apply(AnnouncementsEntry announcementsEntry) {
						return announcementsEntry.getCreateDate();
					}
				},
				new BiConsumer<AnnouncementsEntry, Date>() {
					@Override
					public void accept(AnnouncementsEntry announcementsEntry,
						Date createDate) {
						announcementsEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<AnnouncementsEntry, Date>() {
					@Override
					public Date apply(AnnouncementsEntry announcementsEntry) {
						return announcementsEntry.getModifiedDate();
					}
				},
				new BiConsumer<AnnouncementsEntry, Date>() {
					@Override
					public void accept(AnnouncementsEntry announcementsEntry,
						Date modifiedDate) {
						announcementsEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<AnnouncementsEntry, Long>() {
					@Override
					public Long apply(AnnouncementsEntry announcementsEntry) {
						return announcementsEntry.getClassNameId();
					}
				},
				new BiConsumer<AnnouncementsEntry, Long>() {
					@Override
					public void accept(AnnouncementsEntry announcementsEntry,
						Long classNameId) {
						announcementsEntry.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<AnnouncementsEntry, Long>() {
					@Override
					public Long apply(AnnouncementsEntry announcementsEntry) {
						return announcementsEntry.getClassPK();
					}
				},
				new BiConsumer<AnnouncementsEntry, Long>() {
					@Override
					public void accept(AnnouncementsEntry announcementsEntry,
						Long classPK) {
						announcementsEntry.setClassPK(classPK);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<AnnouncementsEntry, String>() {
					@Override
					public String apply(AnnouncementsEntry announcementsEntry) {
						return announcementsEntry.getTitle();
					}
				},
				new BiConsumer<AnnouncementsEntry, String>() {
					@Override
					public void accept(AnnouncementsEntry announcementsEntry,
						String title) {
						announcementsEntry.setTitle(title);
					}
				});
		}
	}

	public static class ContentAccessor extends ModelPropertyAccessor {
		public ContentAccessor() {
			super(new Function<AnnouncementsEntry, String>() {
					@Override
					public String apply(AnnouncementsEntry announcementsEntry) {
						return announcementsEntry.getContent();
					}
				},
				new BiConsumer<AnnouncementsEntry, String>() {
					@Override
					public void accept(AnnouncementsEntry announcementsEntry,
						String content) {
						announcementsEntry.setContent(content);
					}
				});
		}
	}

	public static class UrlAccessor extends ModelPropertyAccessor {
		public UrlAccessor() {
			super(new Function<AnnouncementsEntry, String>() {
					@Override
					public String apply(AnnouncementsEntry announcementsEntry) {
						return announcementsEntry.getUrl();
					}
				},
				new BiConsumer<AnnouncementsEntry, String>() {
					@Override
					public void accept(AnnouncementsEntry announcementsEntry,
						String url) {
						announcementsEntry.setUrl(url);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<AnnouncementsEntry, String>() {
					@Override
					public String apply(AnnouncementsEntry announcementsEntry) {
						return announcementsEntry.getType();
					}
				},
				new BiConsumer<AnnouncementsEntry, String>() {
					@Override
					public void accept(AnnouncementsEntry announcementsEntry,
						String type) {
						announcementsEntry.setType(type);
					}
				});
		}
	}

	public static class DisplayDateAccessor extends ModelPropertyAccessor {
		public DisplayDateAccessor() {
			super(new Function<AnnouncementsEntry, Date>() {
					@Override
					public Date apply(AnnouncementsEntry announcementsEntry) {
						return announcementsEntry.getDisplayDate();
					}
				},
				new BiConsumer<AnnouncementsEntry, Date>() {
					@Override
					public void accept(AnnouncementsEntry announcementsEntry,
						Date displayDate) {
						announcementsEntry.setDisplayDate(displayDate);
					}
				});
		}
	}

	public static class ExpirationDateAccessor extends ModelPropertyAccessor {
		public ExpirationDateAccessor() {
			super(new Function<AnnouncementsEntry, Date>() {
					@Override
					public Date apply(AnnouncementsEntry announcementsEntry) {
						return announcementsEntry.getExpirationDate();
					}
				},
				new BiConsumer<AnnouncementsEntry, Date>() {
					@Override
					public void accept(AnnouncementsEntry announcementsEntry,
						Date expirationDate) {
						announcementsEntry.setExpirationDate(expirationDate);
					}
				});
		}
	}

	public static class PriorityAccessor extends ModelPropertyAccessor {
		public PriorityAccessor() {
			super(new Function<AnnouncementsEntry, Integer>() {
					@Override
					public Integer apply(AnnouncementsEntry announcementsEntry) {
						return announcementsEntry.getPriority();
					}
				},
				new BiConsumer<AnnouncementsEntry, Integer>() {
					@Override
					public void accept(AnnouncementsEntry announcementsEntry,
						Integer priority) {
						announcementsEntry.setPriority(priority);
					}
				});
		}
	}

	public static class AlertAccessor extends ModelPropertyAccessor {
		public AlertAccessor() {
			super(new Function<AnnouncementsEntry, Boolean>() {
					@Override
					public Boolean apply(AnnouncementsEntry announcementsEntry) {
						return announcementsEntry.getAlert();
					}
				},
				new BiConsumer<AnnouncementsEntry, Boolean>() {
					@Override
					public void accept(AnnouncementsEntry announcementsEntry,
						Boolean alert) {
						announcementsEntry.setAlert(alert);
					}
				});
		}
	}

	private AnnouncementsEntryModelAccessors() {
	}
}