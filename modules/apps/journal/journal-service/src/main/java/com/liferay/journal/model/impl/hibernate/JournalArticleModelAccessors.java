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

package com.liferay.journal.model.impl.hibernate;

import com.liferay.journal.model.JournalArticle;

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
public class JournalArticleModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<JournalArticle, String>() {
					@Override
					public String apply(JournalArticle journalArticle) {
						return journalArticle.getUuid();
					}
				},
				new BiConsumer<JournalArticle, String>() {
					@Override
					public void accept(JournalArticle journalArticle,
						String uuid) {
						journalArticle.setUuid(uuid);
					}
				});
		}
	}

	public static class IdAccessor extends ModelPropertyAccessor {
		public IdAccessor() {
			super(new Function<JournalArticle, Long>() {
					@Override
					public Long apply(JournalArticle journalArticle) {
						return journalArticle.getId();
					}
				},
				new BiConsumer<JournalArticle, Long>() {
					@Override
					public void accept(JournalArticle journalArticle, Long id) {
						journalArticle.setId(id);
					}
				});
		}
	}

	public static class ResourcePrimKeyAccessor extends ModelPropertyAccessor {
		public ResourcePrimKeyAccessor() {
			super(new Function<JournalArticle, Long>() {
					@Override
					public Long apply(JournalArticle journalArticle) {
						return journalArticle.getResourcePrimKey();
					}
				},
				new BiConsumer<JournalArticle, Long>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Long resourcePrimKey) {
						journalArticle.setResourcePrimKey(resourcePrimKey);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<JournalArticle, Long>() {
					@Override
					public Long apply(JournalArticle journalArticle) {
						return journalArticle.getGroupId();
					}
				},
				new BiConsumer<JournalArticle, Long>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Long groupId) {
						journalArticle.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<JournalArticle, Long>() {
					@Override
					public Long apply(JournalArticle journalArticle) {
						return journalArticle.getCompanyId();
					}
				},
				new BiConsumer<JournalArticle, Long>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Long companyId) {
						journalArticle.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<JournalArticle, Long>() {
					@Override
					public Long apply(JournalArticle journalArticle) {
						return journalArticle.getUserId();
					}
				},
				new BiConsumer<JournalArticle, Long>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Long userId) {
						journalArticle.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<JournalArticle, String>() {
					@Override
					public String apply(JournalArticle journalArticle) {
						return journalArticle.getUserName();
					}
				},
				new BiConsumer<JournalArticle, String>() {
					@Override
					public void accept(JournalArticle journalArticle,
						String userName) {
						journalArticle.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<JournalArticle, Date>() {
					@Override
					public Date apply(JournalArticle journalArticle) {
						return journalArticle.getCreateDate();
					}
				},
				new BiConsumer<JournalArticle, Date>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Date createDate) {
						journalArticle.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<JournalArticle, Date>() {
					@Override
					public Date apply(JournalArticle journalArticle) {
						return journalArticle.getModifiedDate();
					}
				},
				new BiConsumer<JournalArticle, Date>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Date modifiedDate) {
						journalArticle.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class FolderIdAccessor extends ModelPropertyAccessor {
		public FolderIdAccessor() {
			super(new Function<JournalArticle, Long>() {
					@Override
					public Long apply(JournalArticle journalArticle) {
						return journalArticle.getFolderId();
					}
				},
				new BiConsumer<JournalArticle, Long>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Long folderId) {
						journalArticle.setFolderId(folderId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<JournalArticle, Long>() {
					@Override
					public Long apply(JournalArticle journalArticle) {
						return journalArticle.getClassNameId();
					}
				},
				new BiConsumer<JournalArticle, Long>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Long classNameId) {
						journalArticle.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<JournalArticle, Long>() {
					@Override
					public Long apply(JournalArticle journalArticle) {
						return journalArticle.getClassPK();
					}
				},
				new BiConsumer<JournalArticle, Long>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Long classPK) {
						journalArticle.setClassPK(classPK);
					}
				});
		}
	}

	public static class TreePathAccessor extends ModelPropertyAccessor {
		public TreePathAccessor() {
			super(new Function<JournalArticle, String>() {
					@Override
					public String apply(JournalArticle journalArticle) {
						return journalArticle.getTreePath();
					}
				},
				new BiConsumer<JournalArticle, String>() {
					@Override
					public void accept(JournalArticle journalArticle,
						String treePath) {
						journalArticle.setTreePath(treePath);
					}
				});
		}
	}

	public static class ArticleIdAccessor extends ModelPropertyAccessor {
		public ArticleIdAccessor() {
			super(new Function<JournalArticle, String>() {
					@Override
					public String apply(JournalArticle journalArticle) {
						return journalArticle.getArticleId();
					}
				},
				new BiConsumer<JournalArticle, String>() {
					@Override
					public void accept(JournalArticle journalArticle,
						String articleId) {
						journalArticle.setArticleId(articleId);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<JournalArticle, Double>() {
					@Override
					public Double apply(JournalArticle journalArticle) {
						return journalArticle.getVersion();
					}
				},
				new BiConsumer<JournalArticle, Double>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Double version) {
						journalArticle.setVersion(version);
					}
				});
		}
	}

	public static class UrlTitleAccessor extends ModelPropertyAccessor {
		public UrlTitleAccessor() {
			super(new Function<JournalArticle, String>() {
					@Override
					public String apply(JournalArticle journalArticle) {
						return journalArticle.getUrlTitle();
					}
				},
				new BiConsumer<JournalArticle, String>() {
					@Override
					public void accept(JournalArticle journalArticle,
						String urlTitle) {
						journalArticle.setUrlTitle(urlTitle);
					}
				});
		}
	}

	public static class ContentAccessor extends ModelPropertyAccessor {
		public ContentAccessor() {
			super(new Function<JournalArticle, String>() {
					@Override
					public String apply(JournalArticle journalArticle) {
						return journalArticle.getContent();
					}
				},
				new BiConsumer<JournalArticle, String>() {
					@Override
					public void accept(JournalArticle journalArticle,
						String content) {
						journalArticle.setContent(content);
					}
				});
		}
	}

	public static class DDMStructureKeyAccessor extends ModelPropertyAccessor {
		public DDMStructureKeyAccessor() {
			super(new Function<JournalArticle, String>() {
					@Override
					public String apply(JournalArticle journalArticle) {
						return journalArticle.getDDMStructureKey();
					}
				},
				new BiConsumer<JournalArticle, String>() {
					@Override
					public void accept(JournalArticle journalArticle,
						String DDMStructureKey) {
						journalArticle.setDDMStructureKey(DDMStructureKey);
					}
				});
		}
	}

	public static class DDMTemplateKeyAccessor extends ModelPropertyAccessor {
		public DDMTemplateKeyAccessor() {
			super(new Function<JournalArticle, String>() {
					@Override
					public String apply(JournalArticle journalArticle) {
						return journalArticle.getDDMTemplateKey();
					}
				},
				new BiConsumer<JournalArticle, String>() {
					@Override
					public void accept(JournalArticle journalArticle,
						String DDMTemplateKey) {
						journalArticle.setDDMTemplateKey(DDMTemplateKey);
					}
				});
		}
	}

	public static class DefaultLanguageIdAccessor extends ModelPropertyAccessor {
		public DefaultLanguageIdAccessor() {
			super(new Function<JournalArticle, String>() {
					@Override
					public String apply(JournalArticle journalArticle) {
						return journalArticle.getDefaultLanguageId();
					}
				},
				new BiConsumer<JournalArticle, String>() {
					@Override
					public void accept(JournalArticle journalArticle,
						String defaultLanguageId) {
						journalArticle.setDefaultLanguageId(defaultLanguageId);
					}
				});
		}
	}

	public static class LayoutUuidAccessor extends ModelPropertyAccessor {
		public LayoutUuidAccessor() {
			super(new Function<JournalArticle, String>() {
					@Override
					public String apply(JournalArticle journalArticle) {
						return journalArticle.getLayoutUuid();
					}
				},
				new BiConsumer<JournalArticle, String>() {
					@Override
					public void accept(JournalArticle journalArticle,
						String layoutUuid) {
						journalArticle.setLayoutUuid(layoutUuid);
					}
				});
		}
	}

	public static class DisplayDateAccessor extends ModelPropertyAccessor {
		public DisplayDateAccessor() {
			super(new Function<JournalArticle, Date>() {
					@Override
					public Date apply(JournalArticle journalArticle) {
						return journalArticle.getDisplayDate();
					}
				},
				new BiConsumer<JournalArticle, Date>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Date displayDate) {
						journalArticle.setDisplayDate(displayDate);
					}
				});
		}
	}

	public static class ExpirationDateAccessor extends ModelPropertyAccessor {
		public ExpirationDateAccessor() {
			super(new Function<JournalArticle, Date>() {
					@Override
					public Date apply(JournalArticle journalArticle) {
						return journalArticle.getExpirationDate();
					}
				},
				new BiConsumer<JournalArticle, Date>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Date expirationDate) {
						journalArticle.setExpirationDate(expirationDate);
					}
				});
		}
	}

	public static class ReviewDateAccessor extends ModelPropertyAccessor {
		public ReviewDateAccessor() {
			super(new Function<JournalArticle, Date>() {
					@Override
					public Date apply(JournalArticle journalArticle) {
						return journalArticle.getReviewDate();
					}
				},
				new BiConsumer<JournalArticle, Date>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Date reviewDate) {
						journalArticle.setReviewDate(reviewDate);
					}
				});
		}
	}

	public static class IndexableAccessor extends ModelPropertyAccessor {
		public IndexableAccessor() {
			super(new Function<JournalArticle, Boolean>() {
					@Override
					public Boolean apply(JournalArticle journalArticle) {
						return journalArticle.getIndexable();
					}
				},
				new BiConsumer<JournalArticle, Boolean>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Boolean indexable) {
						journalArticle.setIndexable(indexable);
					}
				});
		}
	}

	public static class SmallImageAccessor extends ModelPropertyAccessor {
		public SmallImageAccessor() {
			super(new Function<JournalArticle, Boolean>() {
					@Override
					public Boolean apply(JournalArticle journalArticle) {
						return journalArticle.getSmallImage();
					}
				},
				new BiConsumer<JournalArticle, Boolean>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Boolean smallImage) {
						journalArticle.setSmallImage(smallImage);
					}
				});
		}
	}

	public static class SmallImageIdAccessor extends ModelPropertyAccessor {
		public SmallImageIdAccessor() {
			super(new Function<JournalArticle, Long>() {
					@Override
					public Long apply(JournalArticle journalArticle) {
						return journalArticle.getSmallImageId();
					}
				},
				new BiConsumer<JournalArticle, Long>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Long smallImageId) {
						journalArticle.setSmallImageId(smallImageId);
					}
				});
		}
	}

	public static class SmallImageURLAccessor extends ModelPropertyAccessor {
		public SmallImageURLAccessor() {
			super(new Function<JournalArticle, String>() {
					@Override
					public String apply(JournalArticle journalArticle) {
						return journalArticle.getSmallImageURL();
					}
				},
				new BiConsumer<JournalArticle, String>() {
					@Override
					public void accept(JournalArticle journalArticle,
						String smallImageURL) {
						journalArticle.setSmallImageURL(smallImageURL);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<JournalArticle, Date>() {
					@Override
					public Date apply(JournalArticle journalArticle) {
						return journalArticle.getLastPublishDate();
					}
				},
				new BiConsumer<JournalArticle, Date>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Date lastPublishDate) {
						journalArticle.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<JournalArticle, Integer>() {
					@Override
					public Integer apply(JournalArticle journalArticle) {
						return journalArticle.getStatus();
					}
				},
				new BiConsumer<JournalArticle, Integer>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Integer status) {
						journalArticle.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<JournalArticle, Long>() {
					@Override
					public Long apply(JournalArticle journalArticle) {
						return journalArticle.getStatusByUserId();
					}
				},
				new BiConsumer<JournalArticle, Long>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Long statusByUserId) {
						journalArticle.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<JournalArticle, String>() {
					@Override
					public String apply(JournalArticle journalArticle) {
						return journalArticle.getStatusByUserName();
					}
				},
				new BiConsumer<JournalArticle, String>() {
					@Override
					public void accept(JournalArticle journalArticle,
						String statusByUserName) {
						journalArticle.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<JournalArticle, Date>() {
					@Override
					public Date apply(JournalArticle journalArticle) {
						return journalArticle.getStatusDate();
					}
				},
				new BiConsumer<JournalArticle, Date>() {
					@Override
					public void accept(JournalArticle journalArticle,
						Date statusDate) {
						journalArticle.setStatusDate(statusDate);
					}
				});
		}
	}

	private JournalArticleModelAccessors() {
	}
}