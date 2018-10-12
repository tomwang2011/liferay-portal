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

package com.liferay.blogs.model.impl.hibernate;

import com.liferay.blogs.model.BlogsEntry;

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
public class BlogsEntryModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<BlogsEntry, String>() {
					@Override
					public String apply(BlogsEntry blogsEntry) {
						return blogsEntry.getUuid();
					}
				},
				new BiConsumer<BlogsEntry, String>() {
					@Override
					public void accept(BlogsEntry blogsEntry, String uuid) {
						blogsEntry.setUuid(uuid);
					}
				});
		}
	}

	public static class EntryIdAccessor extends ModelPropertyAccessor {
		public EntryIdAccessor() {
			super(new Function<BlogsEntry, Long>() {
					@Override
					public Long apply(BlogsEntry blogsEntry) {
						return blogsEntry.getEntryId();
					}
				},
				new BiConsumer<BlogsEntry, Long>() {
					@Override
					public void accept(BlogsEntry blogsEntry, Long entryId) {
						blogsEntry.setEntryId(entryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<BlogsEntry, Long>() {
					@Override
					public Long apply(BlogsEntry blogsEntry) {
						return blogsEntry.getGroupId();
					}
				},
				new BiConsumer<BlogsEntry, Long>() {
					@Override
					public void accept(BlogsEntry blogsEntry, Long groupId) {
						blogsEntry.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<BlogsEntry, Long>() {
					@Override
					public Long apply(BlogsEntry blogsEntry) {
						return blogsEntry.getCompanyId();
					}
				},
				new BiConsumer<BlogsEntry, Long>() {
					@Override
					public void accept(BlogsEntry blogsEntry, Long companyId) {
						blogsEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<BlogsEntry, Long>() {
					@Override
					public Long apply(BlogsEntry blogsEntry) {
						return blogsEntry.getUserId();
					}
				},
				new BiConsumer<BlogsEntry, Long>() {
					@Override
					public void accept(BlogsEntry blogsEntry, Long userId) {
						blogsEntry.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<BlogsEntry, String>() {
					@Override
					public String apply(BlogsEntry blogsEntry) {
						return blogsEntry.getUserName();
					}
				},
				new BiConsumer<BlogsEntry, String>() {
					@Override
					public void accept(BlogsEntry blogsEntry, String userName) {
						blogsEntry.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<BlogsEntry, Date>() {
					@Override
					public Date apply(BlogsEntry blogsEntry) {
						return blogsEntry.getCreateDate();
					}
				},
				new BiConsumer<BlogsEntry, Date>() {
					@Override
					public void accept(BlogsEntry blogsEntry, Date createDate) {
						blogsEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<BlogsEntry, Date>() {
					@Override
					public Date apply(BlogsEntry blogsEntry) {
						return blogsEntry.getModifiedDate();
					}
				},
				new BiConsumer<BlogsEntry, Date>() {
					@Override
					public void accept(BlogsEntry blogsEntry, Date modifiedDate) {
						blogsEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<BlogsEntry, String>() {
					@Override
					public String apply(BlogsEntry blogsEntry) {
						return blogsEntry.getTitle();
					}
				},
				new BiConsumer<BlogsEntry, String>() {
					@Override
					public void accept(BlogsEntry blogsEntry, String title) {
						blogsEntry.setTitle(title);
					}
				});
		}
	}

	public static class SubtitleAccessor extends ModelPropertyAccessor {
		public SubtitleAccessor() {
			super(new Function<BlogsEntry, String>() {
					@Override
					public String apply(BlogsEntry blogsEntry) {
						return blogsEntry.getSubtitle();
					}
				},
				new BiConsumer<BlogsEntry, String>() {
					@Override
					public void accept(BlogsEntry blogsEntry, String subtitle) {
						blogsEntry.setSubtitle(subtitle);
					}
				});
		}
	}

	public static class UrlTitleAccessor extends ModelPropertyAccessor {
		public UrlTitleAccessor() {
			super(new Function<BlogsEntry, String>() {
					@Override
					public String apply(BlogsEntry blogsEntry) {
						return blogsEntry.getUrlTitle();
					}
				},
				new BiConsumer<BlogsEntry, String>() {
					@Override
					public void accept(BlogsEntry blogsEntry, String urlTitle) {
						blogsEntry.setUrlTitle(urlTitle);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<BlogsEntry, String>() {
					@Override
					public String apply(BlogsEntry blogsEntry) {
						return blogsEntry.getDescription();
					}
				},
				new BiConsumer<BlogsEntry, String>() {
					@Override
					public void accept(BlogsEntry blogsEntry, String description) {
						blogsEntry.setDescription(description);
					}
				});
		}
	}

	public static class ContentAccessor extends ModelPropertyAccessor {
		public ContentAccessor() {
			super(new Function<BlogsEntry, String>() {
					@Override
					public String apply(BlogsEntry blogsEntry) {
						return blogsEntry.getContent();
					}
				},
				new BiConsumer<BlogsEntry, String>() {
					@Override
					public void accept(BlogsEntry blogsEntry, String content) {
						blogsEntry.setContent(content);
					}
				});
		}
	}

	public static class DisplayDateAccessor extends ModelPropertyAccessor {
		public DisplayDateAccessor() {
			super(new Function<BlogsEntry, Date>() {
					@Override
					public Date apply(BlogsEntry blogsEntry) {
						return blogsEntry.getDisplayDate();
					}
				},
				new BiConsumer<BlogsEntry, Date>() {
					@Override
					public void accept(BlogsEntry blogsEntry, Date displayDate) {
						blogsEntry.setDisplayDate(displayDate);
					}
				});
		}
	}

	public static class AllowPingbacksAccessor extends ModelPropertyAccessor {
		public AllowPingbacksAccessor() {
			super(new Function<BlogsEntry, Boolean>() {
					@Override
					public Boolean apply(BlogsEntry blogsEntry) {
						return blogsEntry.getAllowPingbacks();
					}
				},
				new BiConsumer<BlogsEntry, Boolean>() {
					@Override
					public void accept(BlogsEntry blogsEntry,
						Boolean allowPingbacks) {
						blogsEntry.setAllowPingbacks(allowPingbacks);
					}
				});
		}
	}

	public static class AllowTrackbacksAccessor extends ModelPropertyAccessor {
		public AllowTrackbacksAccessor() {
			super(new Function<BlogsEntry, Boolean>() {
					@Override
					public Boolean apply(BlogsEntry blogsEntry) {
						return blogsEntry.getAllowTrackbacks();
					}
				},
				new BiConsumer<BlogsEntry, Boolean>() {
					@Override
					public void accept(BlogsEntry blogsEntry,
						Boolean allowTrackbacks) {
						blogsEntry.setAllowTrackbacks(allowTrackbacks);
					}
				});
		}
	}

	public static class TrackbacksAccessor extends ModelPropertyAccessor {
		public TrackbacksAccessor() {
			super(new Function<BlogsEntry, String>() {
					@Override
					public String apply(BlogsEntry blogsEntry) {
						return blogsEntry.getTrackbacks();
					}
				},
				new BiConsumer<BlogsEntry, String>() {
					@Override
					public void accept(BlogsEntry blogsEntry, String trackbacks) {
						blogsEntry.setTrackbacks(trackbacks);
					}
				});
		}
	}

	public static class CoverImageCaptionAccessor extends ModelPropertyAccessor {
		public CoverImageCaptionAccessor() {
			super(new Function<BlogsEntry, String>() {
					@Override
					public String apply(BlogsEntry blogsEntry) {
						return blogsEntry.getCoverImageCaption();
					}
				},
				new BiConsumer<BlogsEntry, String>() {
					@Override
					public void accept(BlogsEntry blogsEntry,
						String coverImageCaption) {
						blogsEntry.setCoverImageCaption(coverImageCaption);
					}
				});
		}
	}

	public static class CoverImageFileEntryIdAccessor
		extends ModelPropertyAccessor {
		public CoverImageFileEntryIdAccessor() {
			super(new Function<BlogsEntry, Long>() {
					@Override
					public Long apply(BlogsEntry blogsEntry) {
						return blogsEntry.getCoverImageFileEntryId();
					}
				},
				new BiConsumer<BlogsEntry, Long>() {
					@Override
					public void accept(BlogsEntry blogsEntry,
						Long coverImageFileEntryId) {
						blogsEntry.setCoverImageFileEntryId(coverImageFileEntryId);
					}
				});
		}
	}

	public static class CoverImageURLAccessor extends ModelPropertyAccessor {
		public CoverImageURLAccessor() {
			super(new Function<BlogsEntry, String>() {
					@Override
					public String apply(BlogsEntry blogsEntry) {
						return blogsEntry.getCoverImageURL();
					}
				},
				new BiConsumer<BlogsEntry, String>() {
					@Override
					public void accept(BlogsEntry blogsEntry,
						String coverImageURL) {
						blogsEntry.setCoverImageURL(coverImageURL);
					}
				});
		}
	}

	public static class SmallImageAccessor extends ModelPropertyAccessor {
		public SmallImageAccessor() {
			super(new Function<BlogsEntry, Boolean>() {
					@Override
					public Boolean apply(BlogsEntry blogsEntry) {
						return blogsEntry.getSmallImage();
					}
				},
				new BiConsumer<BlogsEntry, Boolean>() {
					@Override
					public void accept(BlogsEntry blogsEntry, Boolean smallImage) {
						blogsEntry.setSmallImage(smallImage);
					}
				});
		}
	}

	public static class SmallImageFileEntryIdAccessor
		extends ModelPropertyAccessor {
		public SmallImageFileEntryIdAccessor() {
			super(new Function<BlogsEntry, Long>() {
					@Override
					public Long apply(BlogsEntry blogsEntry) {
						return blogsEntry.getSmallImageFileEntryId();
					}
				},
				new BiConsumer<BlogsEntry, Long>() {
					@Override
					public void accept(BlogsEntry blogsEntry,
						Long smallImageFileEntryId) {
						blogsEntry.setSmallImageFileEntryId(smallImageFileEntryId);
					}
				});
		}
	}

	public static class SmallImageIdAccessor extends ModelPropertyAccessor {
		public SmallImageIdAccessor() {
			super(new Function<BlogsEntry, Long>() {
					@Override
					public Long apply(BlogsEntry blogsEntry) {
						return blogsEntry.getSmallImageId();
					}
				},
				new BiConsumer<BlogsEntry, Long>() {
					@Override
					public void accept(BlogsEntry blogsEntry, Long smallImageId) {
						blogsEntry.setSmallImageId(smallImageId);
					}
				});
		}
	}

	public static class SmallImageURLAccessor extends ModelPropertyAccessor {
		public SmallImageURLAccessor() {
			super(new Function<BlogsEntry, String>() {
					@Override
					public String apply(BlogsEntry blogsEntry) {
						return blogsEntry.getSmallImageURL();
					}
				},
				new BiConsumer<BlogsEntry, String>() {
					@Override
					public void accept(BlogsEntry blogsEntry,
						String smallImageURL) {
						blogsEntry.setSmallImageURL(smallImageURL);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<BlogsEntry, Date>() {
					@Override
					public Date apply(BlogsEntry blogsEntry) {
						return blogsEntry.getLastPublishDate();
					}
				},
				new BiConsumer<BlogsEntry, Date>() {
					@Override
					public void accept(BlogsEntry blogsEntry,
						Date lastPublishDate) {
						blogsEntry.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<BlogsEntry, Integer>() {
					@Override
					public Integer apply(BlogsEntry blogsEntry) {
						return blogsEntry.getStatus();
					}
				},
				new BiConsumer<BlogsEntry, Integer>() {
					@Override
					public void accept(BlogsEntry blogsEntry, Integer status) {
						blogsEntry.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<BlogsEntry, Long>() {
					@Override
					public Long apply(BlogsEntry blogsEntry) {
						return blogsEntry.getStatusByUserId();
					}
				},
				new BiConsumer<BlogsEntry, Long>() {
					@Override
					public void accept(BlogsEntry blogsEntry,
						Long statusByUserId) {
						blogsEntry.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<BlogsEntry, String>() {
					@Override
					public String apply(BlogsEntry blogsEntry) {
						return blogsEntry.getStatusByUserName();
					}
				},
				new BiConsumer<BlogsEntry, String>() {
					@Override
					public void accept(BlogsEntry blogsEntry,
						String statusByUserName) {
						blogsEntry.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<BlogsEntry, Date>() {
					@Override
					public Date apply(BlogsEntry blogsEntry) {
						return blogsEntry.getStatusDate();
					}
				},
				new BiConsumer<BlogsEntry, Date>() {
					@Override
					public void accept(BlogsEntry blogsEntry, Date statusDate) {
						blogsEntry.setStatusDate(statusDate);
					}
				});
		}
	}

	private BlogsEntryModelAccessors() {
	}
}