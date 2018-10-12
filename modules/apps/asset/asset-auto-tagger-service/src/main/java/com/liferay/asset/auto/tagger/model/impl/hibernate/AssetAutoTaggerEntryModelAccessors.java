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

package com.liferay.asset.auto.tagger.model.impl.hibernate;

import com.liferay.asset.auto.tagger.model.AssetAutoTaggerEntry;

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
public class AssetAutoTaggerEntryModelAccessors {
	public static class AssetAutoTaggerEntryIdAccessor
		extends ModelPropertyAccessor {
		public AssetAutoTaggerEntryIdAccessor() {
			super(new Function<AssetAutoTaggerEntry, Long>() {
					@Override
					public Long apply(AssetAutoTaggerEntry assetAutoTaggerEntry) {
						return assetAutoTaggerEntry.getAssetAutoTaggerEntryId();
					}
				},
				new BiConsumer<AssetAutoTaggerEntry, Long>() {
					@Override
					public void accept(
						AssetAutoTaggerEntry assetAutoTaggerEntry,
						Long assetAutoTaggerEntryId) {
						assetAutoTaggerEntry.setAssetAutoTaggerEntryId(assetAutoTaggerEntryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<AssetAutoTaggerEntry, Long>() {
					@Override
					public Long apply(AssetAutoTaggerEntry assetAutoTaggerEntry) {
						return assetAutoTaggerEntry.getGroupId();
					}
				},
				new BiConsumer<AssetAutoTaggerEntry, Long>() {
					@Override
					public void accept(
						AssetAutoTaggerEntry assetAutoTaggerEntry, Long groupId) {
						assetAutoTaggerEntry.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<AssetAutoTaggerEntry, Long>() {
					@Override
					public Long apply(AssetAutoTaggerEntry assetAutoTaggerEntry) {
						return assetAutoTaggerEntry.getCompanyId();
					}
				},
				new BiConsumer<AssetAutoTaggerEntry, Long>() {
					@Override
					public void accept(
						AssetAutoTaggerEntry assetAutoTaggerEntry,
						Long companyId) {
						assetAutoTaggerEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<AssetAutoTaggerEntry, Date>() {
					@Override
					public Date apply(AssetAutoTaggerEntry assetAutoTaggerEntry) {
						return assetAutoTaggerEntry.getCreateDate();
					}
				},
				new BiConsumer<AssetAutoTaggerEntry, Date>() {
					@Override
					public void accept(
						AssetAutoTaggerEntry assetAutoTaggerEntry,
						Date createDate) {
						assetAutoTaggerEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<AssetAutoTaggerEntry, Date>() {
					@Override
					public Date apply(AssetAutoTaggerEntry assetAutoTaggerEntry) {
						return assetAutoTaggerEntry.getModifiedDate();
					}
				},
				new BiConsumer<AssetAutoTaggerEntry, Date>() {
					@Override
					public void accept(
						AssetAutoTaggerEntry assetAutoTaggerEntry,
						Date modifiedDate) {
						assetAutoTaggerEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class AssetEntryIdAccessor extends ModelPropertyAccessor {
		public AssetEntryIdAccessor() {
			super(new Function<AssetAutoTaggerEntry, Long>() {
					@Override
					public Long apply(AssetAutoTaggerEntry assetAutoTaggerEntry) {
						return assetAutoTaggerEntry.getAssetEntryId();
					}
				},
				new BiConsumer<AssetAutoTaggerEntry, Long>() {
					@Override
					public void accept(
						AssetAutoTaggerEntry assetAutoTaggerEntry,
						Long assetEntryId) {
						assetAutoTaggerEntry.setAssetEntryId(assetEntryId);
					}
				});
		}
	}

	public static class AssetTagIdAccessor extends ModelPropertyAccessor {
		public AssetTagIdAccessor() {
			super(new Function<AssetAutoTaggerEntry, Long>() {
					@Override
					public Long apply(AssetAutoTaggerEntry assetAutoTaggerEntry) {
						return assetAutoTaggerEntry.getAssetTagId();
					}
				},
				new BiConsumer<AssetAutoTaggerEntry, Long>() {
					@Override
					public void accept(
						AssetAutoTaggerEntry assetAutoTaggerEntry,
						Long assetTagId) {
						assetAutoTaggerEntry.setAssetTagId(assetTagId);
					}
				});
		}
	}

	private AssetAutoTaggerEntryModelAccessors() {
	}
}