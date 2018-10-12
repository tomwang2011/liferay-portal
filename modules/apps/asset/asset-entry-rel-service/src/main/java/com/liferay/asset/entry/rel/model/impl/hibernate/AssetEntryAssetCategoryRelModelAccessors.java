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

package com.liferay.asset.entry.rel.model.impl.hibernate;

import com.liferay.asset.entry.rel.model.AssetEntryAssetCategoryRel;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AssetEntryAssetCategoryRelModelAccessors {
	public static class AssetEntryAssetCategoryRelIdAccessor
		extends ModelPropertyAccessor {
		public AssetEntryAssetCategoryRelIdAccessor() {
			super(new Function<AssetEntryAssetCategoryRel, Long>() {
					@Override
					public Long apply(
						AssetEntryAssetCategoryRel assetEntryAssetCategoryRel) {
						return assetEntryAssetCategoryRel.getAssetEntryAssetCategoryRelId();
					}
				},
				new BiConsumer<AssetEntryAssetCategoryRel, Long>() {
					@Override
					public void accept(
						AssetEntryAssetCategoryRel assetEntryAssetCategoryRel,
						Long assetEntryAssetCategoryRelId) {
						assetEntryAssetCategoryRel.setAssetEntryAssetCategoryRelId(assetEntryAssetCategoryRelId);
					}
				});
		}
	}

	public static class AssetEntryIdAccessor extends ModelPropertyAccessor {
		public AssetEntryIdAccessor() {
			super(new Function<AssetEntryAssetCategoryRel, Long>() {
					@Override
					public Long apply(
						AssetEntryAssetCategoryRel assetEntryAssetCategoryRel) {
						return assetEntryAssetCategoryRel.getAssetEntryId();
					}
				},
				new BiConsumer<AssetEntryAssetCategoryRel, Long>() {
					@Override
					public void accept(
						AssetEntryAssetCategoryRel assetEntryAssetCategoryRel,
						Long assetEntryId) {
						assetEntryAssetCategoryRel.setAssetEntryId(assetEntryId);
					}
				});
		}
	}

	public static class AssetCategoryIdAccessor extends ModelPropertyAccessor {
		public AssetCategoryIdAccessor() {
			super(new Function<AssetEntryAssetCategoryRel, Long>() {
					@Override
					public Long apply(
						AssetEntryAssetCategoryRel assetEntryAssetCategoryRel) {
						return assetEntryAssetCategoryRel.getAssetCategoryId();
					}
				},
				new BiConsumer<AssetEntryAssetCategoryRel, Long>() {
					@Override
					public void accept(
						AssetEntryAssetCategoryRel assetEntryAssetCategoryRel,
						Long assetCategoryId) {
						assetEntryAssetCategoryRel.setAssetCategoryId(assetCategoryId);
					}
				});
		}
	}

	public static class PriorityAccessor extends ModelPropertyAccessor {
		public PriorityAccessor() {
			super(new Function<AssetEntryAssetCategoryRel, Integer>() {
					@Override
					public Integer apply(
						AssetEntryAssetCategoryRel assetEntryAssetCategoryRel) {
						return assetEntryAssetCategoryRel.getPriority();
					}
				},
				new BiConsumer<AssetEntryAssetCategoryRel, Integer>() {
					@Override
					public void accept(
						AssetEntryAssetCategoryRel assetEntryAssetCategoryRel,
						Integer priority) {
						assetEntryAssetCategoryRel.setPriority(priority);
					}
				});
		}
	}

	private AssetEntryAssetCategoryRelModelAccessors() {
	}
}