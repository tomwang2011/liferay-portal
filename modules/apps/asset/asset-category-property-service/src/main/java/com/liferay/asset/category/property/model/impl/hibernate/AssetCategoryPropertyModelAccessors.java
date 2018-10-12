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

package com.liferay.asset.category.property.model.impl.hibernate;

import com.liferay.asset.category.property.model.AssetCategoryProperty;

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
public class AssetCategoryPropertyModelAccessors {
	public static class CategoryPropertyIdAccessor extends ModelPropertyAccessor {
		public CategoryPropertyIdAccessor() {
			super(new Function<AssetCategoryProperty, Long>() {
					@Override
					public Long apply(
						AssetCategoryProperty assetCategoryProperty) {
						return assetCategoryProperty.getCategoryPropertyId();
					}
				},
				new BiConsumer<AssetCategoryProperty, Long>() {
					@Override
					public void accept(
						AssetCategoryProperty assetCategoryProperty,
						Long categoryPropertyId) {
						assetCategoryProperty.setCategoryPropertyId(categoryPropertyId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<AssetCategoryProperty, Long>() {
					@Override
					public Long apply(
						AssetCategoryProperty assetCategoryProperty) {
						return assetCategoryProperty.getCompanyId();
					}
				},
				new BiConsumer<AssetCategoryProperty, Long>() {
					@Override
					public void accept(
						AssetCategoryProperty assetCategoryProperty,
						Long companyId) {
						assetCategoryProperty.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<AssetCategoryProperty, Long>() {
					@Override
					public Long apply(
						AssetCategoryProperty assetCategoryProperty) {
						return assetCategoryProperty.getUserId();
					}
				},
				new BiConsumer<AssetCategoryProperty, Long>() {
					@Override
					public void accept(
						AssetCategoryProperty assetCategoryProperty, Long userId) {
						assetCategoryProperty.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<AssetCategoryProperty, String>() {
					@Override
					public String apply(
						AssetCategoryProperty assetCategoryProperty) {
						return assetCategoryProperty.getUserName();
					}
				},
				new BiConsumer<AssetCategoryProperty, String>() {
					@Override
					public void accept(
						AssetCategoryProperty assetCategoryProperty,
						String userName) {
						assetCategoryProperty.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<AssetCategoryProperty, Date>() {
					@Override
					public Date apply(
						AssetCategoryProperty assetCategoryProperty) {
						return assetCategoryProperty.getCreateDate();
					}
				},
				new BiConsumer<AssetCategoryProperty, Date>() {
					@Override
					public void accept(
						AssetCategoryProperty assetCategoryProperty,
						Date createDate) {
						assetCategoryProperty.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<AssetCategoryProperty, Date>() {
					@Override
					public Date apply(
						AssetCategoryProperty assetCategoryProperty) {
						return assetCategoryProperty.getModifiedDate();
					}
				},
				new BiConsumer<AssetCategoryProperty, Date>() {
					@Override
					public void accept(
						AssetCategoryProperty assetCategoryProperty,
						Date modifiedDate) {
						assetCategoryProperty.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class CategoryIdAccessor extends ModelPropertyAccessor {
		public CategoryIdAccessor() {
			super(new Function<AssetCategoryProperty, Long>() {
					@Override
					public Long apply(
						AssetCategoryProperty assetCategoryProperty) {
						return assetCategoryProperty.getCategoryId();
					}
				},
				new BiConsumer<AssetCategoryProperty, Long>() {
					@Override
					public void accept(
						AssetCategoryProperty assetCategoryProperty,
						Long categoryId) {
						assetCategoryProperty.setCategoryId(categoryId);
					}
				});
		}
	}

	public static class KeyAccessor extends ModelPropertyAccessor {
		public KeyAccessor() {
			super(new Function<AssetCategoryProperty, String>() {
					@Override
					public String apply(
						AssetCategoryProperty assetCategoryProperty) {
						return assetCategoryProperty.getKey();
					}
				},
				new BiConsumer<AssetCategoryProperty, String>() {
					@Override
					public void accept(
						AssetCategoryProperty assetCategoryProperty, String key) {
						assetCategoryProperty.setKey(key);
					}
				});
		}
	}

	public static class ValueAccessor extends ModelPropertyAccessor {
		public ValueAccessor() {
			super(new Function<AssetCategoryProperty, String>() {
					@Override
					public String apply(
						AssetCategoryProperty assetCategoryProperty) {
						return assetCategoryProperty.getValue();
					}
				},
				new BiConsumer<AssetCategoryProperty, String>() {
					@Override
					public void accept(
						AssetCategoryProperty assetCategoryProperty,
						String value) {
						assetCategoryProperty.setValue(value);
					}
				});
		}
	}

	private AssetCategoryPropertyModelAccessors() {
	}
}