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

import com.liferay.asset.kernel.model.AssetCategory;

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
public class AssetCategoryModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<AssetCategory, String>() {
					@Override
					public String apply(AssetCategory assetCategory) {
						return assetCategory.getUuid();
					}
				},
				new BiConsumer<AssetCategory, String>() {
					@Override
					public void accept(AssetCategory assetCategory, String uuid) {
						assetCategory.setUuid(uuid);
					}
				});
		}
	}

	public static class ExternalReferenceCodeAccessor
		extends ModelPropertyAccessor {
		public ExternalReferenceCodeAccessor() {
			super(new Function<AssetCategory, String>() {
					@Override
					public String apply(AssetCategory assetCategory) {
						return assetCategory.getExternalReferenceCode();
					}
				},
				new BiConsumer<AssetCategory, String>() {
					@Override
					public void accept(AssetCategory assetCategory,
						String externalReferenceCode) {
						assetCategory.setExternalReferenceCode(externalReferenceCode);
					}
				});
		}
	}

	public static class CategoryIdAccessor extends ModelPropertyAccessor {
		public CategoryIdAccessor() {
			super(new Function<AssetCategory, Long>() {
					@Override
					public Long apply(AssetCategory assetCategory) {
						return assetCategory.getCategoryId();
					}
				},
				new BiConsumer<AssetCategory, Long>() {
					@Override
					public void accept(AssetCategory assetCategory,
						Long categoryId) {
						assetCategory.setCategoryId(categoryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<AssetCategory, Long>() {
					@Override
					public Long apply(AssetCategory assetCategory) {
						return assetCategory.getGroupId();
					}
				},
				new BiConsumer<AssetCategory, Long>() {
					@Override
					public void accept(AssetCategory assetCategory, Long groupId) {
						assetCategory.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<AssetCategory, Long>() {
					@Override
					public Long apply(AssetCategory assetCategory) {
						return assetCategory.getCompanyId();
					}
				},
				new BiConsumer<AssetCategory, Long>() {
					@Override
					public void accept(AssetCategory assetCategory,
						Long companyId) {
						assetCategory.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<AssetCategory, Long>() {
					@Override
					public Long apply(AssetCategory assetCategory) {
						return assetCategory.getUserId();
					}
				},
				new BiConsumer<AssetCategory, Long>() {
					@Override
					public void accept(AssetCategory assetCategory, Long userId) {
						assetCategory.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<AssetCategory, String>() {
					@Override
					public String apply(AssetCategory assetCategory) {
						return assetCategory.getUserName();
					}
				},
				new BiConsumer<AssetCategory, String>() {
					@Override
					public void accept(AssetCategory assetCategory,
						String userName) {
						assetCategory.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<AssetCategory, Date>() {
					@Override
					public Date apply(AssetCategory assetCategory) {
						return assetCategory.getCreateDate();
					}
				},
				new BiConsumer<AssetCategory, Date>() {
					@Override
					public void accept(AssetCategory assetCategory,
						Date createDate) {
						assetCategory.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<AssetCategory, Date>() {
					@Override
					public Date apply(AssetCategory assetCategory) {
						return assetCategory.getModifiedDate();
					}
				},
				new BiConsumer<AssetCategory, Date>() {
					@Override
					public void accept(AssetCategory assetCategory,
						Date modifiedDate) {
						assetCategory.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ParentCategoryIdAccessor extends ModelPropertyAccessor {
		public ParentCategoryIdAccessor() {
			super(new Function<AssetCategory, Long>() {
					@Override
					public Long apply(AssetCategory assetCategory) {
						return assetCategory.getParentCategoryId();
					}
				},
				new BiConsumer<AssetCategory, Long>() {
					@Override
					public void accept(AssetCategory assetCategory,
						Long parentCategoryId) {
						assetCategory.setParentCategoryId(parentCategoryId);
					}
				});
		}
	}

	public static class LeftCategoryIdAccessor extends ModelPropertyAccessor {
		public LeftCategoryIdAccessor() {
			super(new Function<AssetCategory, Long>() {
					@Override
					public Long apply(AssetCategory assetCategory) {
						return assetCategory.getLeftCategoryId();
					}
				},
				new BiConsumer<AssetCategory, Long>() {
					@Override
					public void accept(AssetCategory assetCategory,
						Long leftCategoryId) {
						assetCategory.setLeftCategoryId(leftCategoryId);
					}
				});
		}
	}

	public static class RightCategoryIdAccessor extends ModelPropertyAccessor {
		public RightCategoryIdAccessor() {
			super(new Function<AssetCategory, Long>() {
					@Override
					public Long apply(AssetCategory assetCategory) {
						return assetCategory.getRightCategoryId();
					}
				},
				new BiConsumer<AssetCategory, Long>() {
					@Override
					public void accept(AssetCategory assetCategory,
						Long rightCategoryId) {
						assetCategory.setRightCategoryId(rightCategoryId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<AssetCategory, String>() {
					@Override
					public String apply(AssetCategory assetCategory) {
						return assetCategory.getName();
					}
				},
				new BiConsumer<AssetCategory, String>() {
					@Override
					public void accept(AssetCategory assetCategory, String name) {
						assetCategory.setName(name);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<AssetCategory, String>() {
					@Override
					public String apply(AssetCategory assetCategory) {
						return assetCategory.getTitle();
					}
				},
				new BiConsumer<AssetCategory, String>() {
					@Override
					public void accept(AssetCategory assetCategory, String title) {
						assetCategory.setTitle(title);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<AssetCategory, String>() {
					@Override
					public String apply(AssetCategory assetCategory) {
						return assetCategory.getDescription();
					}
				},
				new BiConsumer<AssetCategory, String>() {
					@Override
					public void accept(AssetCategory assetCategory,
						String description) {
						assetCategory.setDescription(description);
					}
				});
		}
	}

	public static class VocabularyIdAccessor extends ModelPropertyAccessor {
		public VocabularyIdAccessor() {
			super(new Function<AssetCategory, Long>() {
					@Override
					public Long apply(AssetCategory assetCategory) {
						return assetCategory.getVocabularyId();
					}
				},
				new BiConsumer<AssetCategory, Long>() {
					@Override
					public void accept(AssetCategory assetCategory,
						Long vocabularyId) {
						assetCategory.setVocabularyId(vocabularyId);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<AssetCategory, Date>() {
					@Override
					public Date apply(AssetCategory assetCategory) {
						return assetCategory.getLastPublishDate();
					}
				},
				new BiConsumer<AssetCategory, Date>() {
					@Override
					public void accept(AssetCategory assetCategory,
						Date lastPublishDate) {
						assetCategory.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private AssetCategoryModelAccessors() {
	}
}