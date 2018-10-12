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

import com.liferay.asset.kernel.model.AssetTagStats;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AssetTagStatsModelAccessors {
	public static class TagStatsIdAccessor extends ModelPropertyAccessor {
		public TagStatsIdAccessor() {
			super(new Function<AssetTagStats, Long>() {
					@Override
					public Long apply(AssetTagStats assetTagStats) {
						return assetTagStats.getTagStatsId();
					}
				},
				new BiConsumer<AssetTagStats, Long>() {
					@Override
					public void accept(AssetTagStats assetTagStats,
						Long tagStatsId) {
						assetTagStats.setTagStatsId(tagStatsId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<AssetTagStats, Long>() {
					@Override
					public Long apply(AssetTagStats assetTagStats) {
						return assetTagStats.getCompanyId();
					}
				},
				new BiConsumer<AssetTagStats, Long>() {
					@Override
					public void accept(AssetTagStats assetTagStats,
						Long companyId) {
						assetTagStats.setCompanyId(companyId);
					}
				});
		}
	}

	public static class TagIdAccessor extends ModelPropertyAccessor {
		public TagIdAccessor() {
			super(new Function<AssetTagStats, Long>() {
					@Override
					public Long apply(AssetTagStats assetTagStats) {
						return assetTagStats.getTagId();
					}
				},
				new BiConsumer<AssetTagStats, Long>() {
					@Override
					public void accept(AssetTagStats assetTagStats, Long tagId) {
						assetTagStats.setTagId(tagId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<AssetTagStats, Long>() {
					@Override
					public Long apply(AssetTagStats assetTagStats) {
						return assetTagStats.getClassNameId();
					}
				},
				new BiConsumer<AssetTagStats, Long>() {
					@Override
					public void accept(AssetTagStats assetTagStats,
						Long classNameId) {
						assetTagStats.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class AssetCountAccessor extends ModelPropertyAccessor {
		public AssetCountAccessor() {
			super(new Function<AssetTagStats, Integer>() {
					@Override
					public Integer apply(AssetTagStats assetTagStats) {
						return assetTagStats.getAssetCount();
					}
				},
				new BiConsumer<AssetTagStats, Integer>() {
					@Override
					public void accept(AssetTagStats assetTagStats,
						Integer assetCount) {
						assetTagStats.setAssetCount(assetCount);
					}
				});
		}
	}

	private AssetTagStatsModelAccessors() {
	}
}