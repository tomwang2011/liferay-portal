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

package com.liferay.portlet.asset.model.impl.hibernate;

import com.liferay.asset.kernel.model.AssetEntry;

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
public class AssetEntryModelAccessors {
	public static class EntryIdAccessor extends ModelPropertyAccessor {
		public EntryIdAccessor() {
			super(new Function<AssetEntry, Long>() {
					@Override
					public Long apply(AssetEntry assetEntry) {
						return assetEntry.getEntryId();
					}
				},
				new BiConsumer<AssetEntry, Long>() {
					@Override
					public void accept(AssetEntry assetEntry, Long entryId) {
						assetEntry.setEntryId(entryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<AssetEntry, Long>() {
					@Override
					public Long apply(AssetEntry assetEntry) {
						return assetEntry.getGroupId();
					}
				},
				new BiConsumer<AssetEntry, Long>() {
					@Override
					public void accept(AssetEntry assetEntry, Long groupId) {
						assetEntry.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<AssetEntry, Long>() {
					@Override
					public Long apply(AssetEntry assetEntry) {
						return assetEntry.getCompanyId();
					}
				},
				new BiConsumer<AssetEntry, Long>() {
					@Override
					public void accept(AssetEntry assetEntry, Long companyId) {
						assetEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<AssetEntry, Long>() {
					@Override
					public Long apply(AssetEntry assetEntry) {
						return assetEntry.getUserId();
					}
				},
				new BiConsumer<AssetEntry, Long>() {
					@Override
					public void accept(AssetEntry assetEntry, Long userId) {
						assetEntry.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<AssetEntry, String>() {
					@Override
					public String apply(AssetEntry assetEntry) {
						return assetEntry.getUserName();
					}
				},
				new BiConsumer<AssetEntry, String>() {
					@Override
					public void accept(AssetEntry assetEntry, String userName) {
						assetEntry.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<AssetEntry, Date>() {
					@Override
					public Date apply(AssetEntry assetEntry) {
						return assetEntry.getCreateDate();
					}
				},
				new BiConsumer<AssetEntry, Date>() {
					@Override
					public void accept(AssetEntry assetEntry, Date createDate) {
						assetEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<AssetEntry, Date>() {
					@Override
					public Date apply(AssetEntry assetEntry) {
						return assetEntry.getModifiedDate();
					}
				},
				new BiConsumer<AssetEntry, Date>() {
					@Override
					public void accept(AssetEntry assetEntry, Date modifiedDate) {
						assetEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<AssetEntry, Long>() {
					@Override
					public Long apply(AssetEntry assetEntry) {
						return assetEntry.getClassNameId();
					}
				},
				new BiConsumer<AssetEntry, Long>() {
					@Override
					public void accept(AssetEntry assetEntry, Long classNameId) {
						assetEntry.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<AssetEntry, Long>() {
					@Override
					public Long apply(AssetEntry assetEntry) {
						return assetEntry.getClassPK();
					}
				},
				new BiConsumer<AssetEntry, Long>() {
					@Override
					public void accept(AssetEntry assetEntry, Long classPK) {
						assetEntry.setClassPK(classPK);
					}
				});
		}
	}

	public static class ClassUuidAccessor extends ModelPropertyAccessor {
		public ClassUuidAccessor() {
			super(new Function<AssetEntry, String>() {
					@Override
					public String apply(AssetEntry assetEntry) {
						return assetEntry.getClassUuid();
					}
				},
				new BiConsumer<AssetEntry, String>() {
					@Override
					public void accept(AssetEntry assetEntry, String classUuid) {
						assetEntry.setClassUuid(classUuid);
					}
				});
		}
	}

	public static class ClassTypeIdAccessor extends ModelPropertyAccessor {
		public ClassTypeIdAccessor() {
			super(new Function<AssetEntry, Long>() {
					@Override
					public Long apply(AssetEntry assetEntry) {
						return assetEntry.getClassTypeId();
					}
				},
				new BiConsumer<AssetEntry, Long>() {
					@Override
					public void accept(AssetEntry assetEntry, Long classTypeId) {
						assetEntry.setClassTypeId(classTypeId);
					}
				});
		}
	}

	public static class ListableAccessor extends ModelPropertyAccessor {
		public ListableAccessor() {
			super(new Function<AssetEntry, Boolean>() {
					@Override
					public Boolean apply(AssetEntry assetEntry) {
						return assetEntry.getListable();
					}
				},
				new BiConsumer<AssetEntry, Boolean>() {
					@Override
					public void accept(AssetEntry assetEntry, Boolean listable) {
						assetEntry.setListable(listable);
					}
				});
		}
	}

	public static class VisibleAccessor extends ModelPropertyAccessor {
		public VisibleAccessor() {
			super(new Function<AssetEntry, Boolean>() {
					@Override
					public Boolean apply(AssetEntry assetEntry) {
						return assetEntry.getVisible();
					}
				},
				new BiConsumer<AssetEntry, Boolean>() {
					@Override
					public void accept(AssetEntry assetEntry, Boolean visible) {
						assetEntry.setVisible(visible);
					}
				});
		}
	}

	public static class StartDateAccessor extends ModelPropertyAccessor {
		public StartDateAccessor() {
			super(new Function<AssetEntry, Date>() {
					@Override
					public Date apply(AssetEntry assetEntry) {
						return assetEntry.getStartDate();
					}
				},
				new BiConsumer<AssetEntry, Date>() {
					@Override
					public void accept(AssetEntry assetEntry, Date startDate) {
						assetEntry.setStartDate(startDate);
					}
				});
		}
	}

	public static class EndDateAccessor extends ModelPropertyAccessor {
		public EndDateAccessor() {
			super(new Function<AssetEntry, Date>() {
					@Override
					public Date apply(AssetEntry assetEntry) {
						return assetEntry.getEndDate();
					}
				},
				new BiConsumer<AssetEntry, Date>() {
					@Override
					public void accept(AssetEntry assetEntry, Date endDate) {
						assetEntry.setEndDate(endDate);
					}
				});
		}
	}

	public static class PublishDateAccessor extends ModelPropertyAccessor {
		public PublishDateAccessor() {
			super(new Function<AssetEntry, Date>() {
					@Override
					public Date apply(AssetEntry assetEntry) {
						return assetEntry.getPublishDate();
					}
				},
				new BiConsumer<AssetEntry, Date>() {
					@Override
					public void accept(AssetEntry assetEntry, Date publishDate) {
						assetEntry.setPublishDate(publishDate);
					}
				});
		}
	}

	public static class ExpirationDateAccessor extends ModelPropertyAccessor {
		public ExpirationDateAccessor() {
			super(new Function<AssetEntry, Date>() {
					@Override
					public Date apply(AssetEntry assetEntry) {
						return assetEntry.getExpirationDate();
					}
				},
				new BiConsumer<AssetEntry, Date>() {
					@Override
					public void accept(AssetEntry assetEntry,
						Date expirationDate) {
						assetEntry.setExpirationDate(expirationDate);
					}
				});
		}
	}

	public static class MimeTypeAccessor extends ModelPropertyAccessor {
		public MimeTypeAccessor() {
			super(new Function<AssetEntry, String>() {
					@Override
					public String apply(AssetEntry assetEntry) {
						return assetEntry.getMimeType();
					}
				},
				new BiConsumer<AssetEntry, String>() {
					@Override
					public void accept(AssetEntry assetEntry, String mimeType) {
						assetEntry.setMimeType(mimeType);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<AssetEntry, String>() {
					@Override
					public String apply(AssetEntry assetEntry) {
						return assetEntry.getTitle();
					}
				},
				new BiConsumer<AssetEntry, String>() {
					@Override
					public void accept(AssetEntry assetEntry, String title) {
						assetEntry.setTitle(title);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<AssetEntry, String>() {
					@Override
					public String apply(AssetEntry assetEntry) {
						return assetEntry.getDescription();
					}
				},
				new BiConsumer<AssetEntry, String>() {
					@Override
					public void accept(AssetEntry assetEntry, String description) {
						assetEntry.setDescription(description);
					}
				});
		}
	}

	public static class SummaryAccessor extends ModelPropertyAccessor {
		public SummaryAccessor() {
			super(new Function<AssetEntry, String>() {
					@Override
					public String apply(AssetEntry assetEntry) {
						return assetEntry.getSummary();
					}
				},
				new BiConsumer<AssetEntry, String>() {
					@Override
					public void accept(AssetEntry assetEntry, String summary) {
						assetEntry.setSummary(summary);
					}
				});
		}
	}

	public static class UrlAccessor extends ModelPropertyAccessor {
		public UrlAccessor() {
			super(new Function<AssetEntry, String>() {
					@Override
					public String apply(AssetEntry assetEntry) {
						return assetEntry.getUrl();
					}
				},
				new BiConsumer<AssetEntry, String>() {
					@Override
					public void accept(AssetEntry assetEntry, String url) {
						assetEntry.setUrl(url);
					}
				});
		}
	}

	public static class LayoutUuidAccessor extends ModelPropertyAccessor {
		public LayoutUuidAccessor() {
			super(new Function<AssetEntry, String>() {
					@Override
					public String apply(AssetEntry assetEntry) {
						return assetEntry.getLayoutUuid();
					}
				},
				new BiConsumer<AssetEntry, String>() {
					@Override
					public void accept(AssetEntry assetEntry, String layoutUuid) {
						assetEntry.setLayoutUuid(layoutUuid);
					}
				});
		}
	}

	public static class HeightAccessor extends ModelPropertyAccessor {
		public HeightAccessor() {
			super(new Function<AssetEntry, Integer>() {
					@Override
					public Integer apply(AssetEntry assetEntry) {
						return assetEntry.getHeight();
					}
				},
				new BiConsumer<AssetEntry, Integer>() {
					@Override
					public void accept(AssetEntry assetEntry, Integer height) {
						assetEntry.setHeight(height);
					}
				});
		}
	}

	public static class WidthAccessor extends ModelPropertyAccessor {
		public WidthAccessor() {
			super(new Function<AssetEntry, Integer>() {
					@Override
					public Integer apply(AssetEntry assetEntry) {
						return assetEntry.getWidth();
					}
				},
				new BiConsumer<AssetEntry, Integer>() {
					@Override
					public void accept(AssetEntry assetEntry, Integer width) {
						assetEntry.setWidth(width);
					}
				});
		}
	}

	public static class PriorityAccessor extends ModelPropertyAccessor {
		public PriorityAccessor() {
			super(new Function<AssetEntry, Double>() {
					@Override
					public Double apply(AssetEntry assetEntry) {
						return assetEntry.getPriority();
					}
				},
				new BiConsumer<AssetEntry, Double>() {
					@Override
					public void accept(AssetEntry assetEntry, Double priority) {
						assetEntry.setPriority(priority);
					}
				});
		}
	}

	public static class ViewCountAccessor extends ModelPropertyAccessor {
		public ViewCountAccessor() {
			super(new Function<AssetEntry, Integer>() {
					@Override
					public Integer apply(AssetEntry assetEntry) {
						return assetEntry.getViewCount();
					}
				},
				new BiConsumer<AssetEntry, Integer>() {
					@Override
					public void accept(AssetEntry assetEntry, Integer viewCount) {
						assetEntry.setViewCount(viewCount);
					}
				});
		}
	}

	private AssetEntryModelAccessors() {
	}
}