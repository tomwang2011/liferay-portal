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

import com.liferay.knowledge.base.model.KBArticle;

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
public class KBArticleModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<KBArticle, String>() {
					@Override
					public String apply(KBArticle kbArticle) {
						return kbArticle.getUuid();
					}
				},
				new BiConsumer<KBArticle, String>() {
					@Override
					public void accept(KBArticle kbArticle, String uuid) {
						kbArticle.setUuid(uuid);
					}
				});
		}
	}

	public static class KbArticleIdAccessor extends ModelPropertyAccessor {
		public KbArticleIdAccessor() {
			super(new Function<KBArticle, Long>() {
					@Override
					public Long apply(KBArticle kbArticle) {
						return kbArticle.getKbArticleId();
					}
				},
				new BiConsumer<KBArticle, Long>() {
					@Override
					public void accept(KBArticle kbArticle, Long kbArticleId) {
						kbArticle.setKbArticleId(kbArticleId);
					}
				});
		}
	}

	public static class ResourcePrimKeyAccessor extends ModelPropertyAccessor {
		public ResourcePrimKeyAccessor() {
			super(new Function<KBArticle, Long>() {
					@Override
					public Long apply(KBArticle kbArticle) {
						return kbArticle.getResourcePrimKey();
					}
				},
				new BiConsumer<KBArticle, Long>() {
					@Override
					public void accept(KBArticle kbArticle, Long resourcePrimKey) {
						kbArticle.setResourcePrimKey(resourcePrimKey);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KBArticle, Long>() {
					@Override
					public Long apply(KBArticle kbArticle) {
						return kbArticle.getGroupId();
					}
				},
				new BiConsumer<KBArticle, Long>() {
					@Override
					public void accept(KBArticle kbArticle, Long groupId) {
						kbArticle.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KBArticle, Long>() {
					@Override
					public Long apply(KBArticle kbArticle) {
						return kbArticle.getCompanyId();
					}
				},
				new BiConsumer<KBArticle, Long>() {
					@Override
					public void accept(KBArticle kbArticle, Long companyId) {
						kbArticle.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KBArticle, Long>() {
					@Override
					public Long apply(KBArticle kbArticle) {
						return kbArticle.getUserId();
					}
				},
				new BiConsumer<KBArticle, Long>() {
					@Override
					public void accept(KBArticle kbArticle, Long userId) {
						kbArticle.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KBArticle, String>() {
					@Override
					public String apply(KBArticle kbArticle) {
						return kbArticle.getUserName();
					}
				},
				new BiConsumer<KBArticle, String>() {
					@Override
					public void accept(KBArticle kbArticle, String userName) {
						kbArticle.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KBArticle, Date>() {
					@Override
					public Date apply(KBArticle kbArticle) {
						return kbArticle.getCreateDate();
					}
				},
				new BiConsumer<KBArticle, Date>() {
					@Override
					public void accept(KBArticle kbArticle, Date createDate) {
						kbArticle.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KBArticle, Date>() {
					@Override
					public Date apply(KBArticle kbArticle) {
						return kbArticle.getModifiedDate();
					}
				},
				new BiConsumer<KBArticle, Date>() {
					@Override
					public void accept(KBArticle kbArticle, Date modifiedDate) {
						kbArticle.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class RootResourcePrimKeyAccessor
		extends ModelPropertyAccessor {
		public RootResourcePrimKeyAccessor() {
			super(new Function<KBArticle, Long>() {
					@Override
					public Long apply(KBArticle kbArticle) {
						return kbArticle.getRootResourcePrimKey();
					}
				},
				new BiConsumer<KBArticle, Long>() {
					@Override
					public void accept(KBArticle kbArticle,
						Long rootResourcePrimKey) {
						kbArticle.setRootResourcePrimKey(rootResourcePrimKey);
					}
				});
		}
	}

	public static class ParentResourceClassNameIdAccessor
		extends ModelPropertyAccessor {
		public ParentResourceClassNameIdAccessor() {
			super(new Function<KBArticle, Long>() {
					@Override
					public Long apply(KBArticle kbArticle) {
						return kbArticle.getParentResourceClassNameId();
					}
				},
				new BiConsumer<KBArticle, Long>() {
					@Override
					public void accept(KBArticle kbArticle,
						Long parentResourceClassNameId) {
						kbArticle.setParentResourceClassNameId(parentResourceClassNameId);
					}
				});
		}
	}

	public static class ParentResourcePrimKeyAccessor
		extends ModelPropertyAccessor {
		public ParentResourcePrimKeyAccessor() {
			super(new Function<KBArticle, Long>() {
					@Override
					public Long apply(KBArticle kbArticle) {
						return kbArticle.getParentResourcePrimKey();
					}
				},
				new BiConsumer<KBArticle, Long>() {
					@Override
					public void accept(KBArticle kbArticle,
						Long parentResourcePrimKey) {
						kbArticle.setParentResourcePrimKey(parentResourcePrimKey);
					}
				});
		}
	}

	public static class KbFolderIdAccessor extends ModelPropertyAccessor {
		public KbFolderIdAccessor() {
			super(new Function<KBArticle, Long>() {
					@Override
					public Long apply(KBArticle kbArticle) {
						return kbArticle.getKbFolderId();
					}
				},
				new BiConsumer<KBArticle, Long>() {
					@Override
					public void accept(KBArticle kbArticle, Long kbFolderId) {
						kbArticle.setKbFolderId(kbFolderId);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<KBArticle, Integer>() {
					@Override
					public Integer apply(KBArticle kbArticle) {
						return kbArticle.getVersion();
					}
				},
				new BiConsumer<KBArticle, Integer>() {
					@Override
					public void accept(KBArticle kbArticle, Integer version) {
						kbArticle.setVersion(version);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<KBArticle, String>() {
					@Override
					public String apply(KBArticle kbArticle) {
						return kbArticle.getTitle();
					}
				},
				new BiConsumer<KBArticle, String>() {
					@Override
					public void accept(KBArticle kbArticle, String title) {
						kbArticle.setTitle(title);
					}
				});
		}
	}

	public static class UrlTitleAccessor extends ModelPropertyAccessor {
		public UrlTitleAccessor() {
			super(new Function<KBArticle, String>() {
					@Override
					public String apply(KBArticle kbArticle) {
						return kbArticle.getUrlTitle();
					}
				},
				new BiConsumer<KBArticle, String>() {
					@Override
					public void accept(KBArticle kbArticle, String urlTitle) {
						kbArticle.setUrlTitle(urlTitle);
					}
				});
		}
	}

	public static class ContentAccessor extends ModelPropertyAccessor {
		public ContentAccessor() {
			super(new Function<KBArticle, String>() {
					@Override
					public String apply(KBArticle kbArticle) {
						return kbArticle.getContent();
					}
				},
				new BiConsumer<KBArticle, String>() {
					@Override
					public void accept(KBArticle kbArticle, String content) {
						kbArticle.setContent(content);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<KBArticle, String>() {
					@Override
					public String apply(KBArticle kbArticle) {
						return kbArticle.getDescription();
					}
				},
				new BiConsumer<KBArticle, String>() {
					@Override
					public void accept(KBArticle kbArticle, String description) {
						kbArticle.setDescription(description);
					}
				});
		}
	}

	public static class PriorityAccessor extends ModelPropertyAccessor {
		public PriorityAccessor() {
			super(new Function<KBArticle, Double>() {
					@Override
					public Double apply(KBArticle kbArticle) {
						return kbArticle.getPriority();
					}
				},
				new BiConsumer<KBArticle, Double>() {
					@Override
					public void accept(KBArticle kbArticle, Double priority) {
						kbArticle.setPriority(priority);
					}
				});
		}
	}

	public static class SectionsAccessor extends ModelPropertyAccessor {
		public SectionsAccessor() {
			super(new Function<KBArticle, String>() {
					@Override
					public String apply(KBArticle kbArticle) {
						return kbArticle.getSections();
					}
				},
				new BiConsumer<KBArticle, String>() {
					@Override
					public void accept(KBArticle kbArticle, String sections) {
						kbArticle.setSections(sections);
					}
				});
		}
	}

	public static class ViewCountAccessor extends ModelPropertyAccessor {
		public ViewCountAccessor() {
			super(new Function<KBArticle, Integer>() {
					@Override
					public Integer apply(KBArticle kbArticle) {
						return kbArticle.getViewCount();
					}
				},
				new BiConsumer<KBArticle, Integer>() {
					@Override
					public void accept(KBArticle kbArticle, Integer viewCount) {
						kbArticle.setViewCount(viewCount);
					}
				});
		}
	}

	public static class LatestAccessor extends ModelPropertyAccessor {
		public LatestAccessor() {
			super(new Function<KBArticle, Boolean>() {
					@Override
					public Boolean apply(KBArticle kbArticle) {
						return kbArticle.getLatest();
					}
				},
				new BiConsumer<KBArticle, Boolean>() {
					@Override
					public void accept(KBArticle kbArticle, Boolean latest) {
						kbArticle.setLatest(latest);
					}
				});
		}
	}

	public static class MainAccessor extends ModelPropertyAccessor {
		public MainAccessor() {
			super(new Function<KBArticle, Boolean>() {
					@Override
					public Boolean apply(KBArticle kbArticle) {
						return kbArticle.getMain();
					}
				},
				new BiConsumer<KBArticle, Boolean>() {
					@Override
					public void accept(KBArticle kbArticle, Boolean main) {
						kbArticle.setMain(main);
					}
				});
		}
	}

	public static class SourceURLAccessor extends ModelPropertyAccessor {
		public SourceURLAccessor() {
			super(new Function<KBArticle, String>() {
					@Override
					public String apply(KBArticle kbArticle) {
						return kbArticle.getSourceURL();
					}
				},
				new BiConsumer<KBArticle, String>() {
					@Override
					public void accept(KBArticle kbArticle, String sourceURL) {
						kbArticle.setSourceURL(sourceURL);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<KBArticle, Date>() {
					@Override
					public Date apply(KBArticle kbArticle) {
						return kbArticle.getLastPublishDate();
					}
				},
				new BiConsumer<KBArticle, Date>() {
					@Override
					public void accept(KBArticle kbArticle, Date lastPublishDate) {
						kbArticle.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<KBArticle, Integer>() {
					@Override
					public Integer apply(KBArticle kbArticle) {
						return kbArticle.getStatus();
					}
				},
				new BiConsumer<KBArticle, Integer>() {
					@Override
					public void accept(KBArticle kbArticle, Integer status) {
						kbArticle.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<KBArticle, Long>() {
					@Override
					public Long apply(KBArticle kbArticle) {
						return kbArticle.getStatusByUserId();
					}
				},
				new BiConsumer<KBArticle, Long>() {
					@Override
					public void accept(KBArticle kbArticle, Long statusByUserId) {
						kbArticle.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<KBArticle, String>() {
					@Override
					public String apply(KBArticle kbArticle) {
						return kbArticle.getStatusByUserName();
					}
				},
				new BiConsumer<KBArticle, String>() {
					@Override
					public void accept(KBArticle kbArticle,
						String statusByUserName) {
						kbArticle.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<KBArticle, Date>() {
					@Override
					public Date apply(KBArticle kbArticle) {
						return kbArticle.getStatusDate();
					}
				},
				new BiConsumer<KBArticle, Date>() {
					@Override
					public void accept(KBArticle kbArticle, Date statusDate) {
						kbArticle.setStatusDate(statusDate);
					}
				});
		}
	}

	private KBArticleModelAccessors() {
	}
}