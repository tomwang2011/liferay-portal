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

package com.liferay.asset.list.model.impl.hibernate;

import com.liferay.asset.list.model.AssetListEntryAssetEntryRel;

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
public class AssetListEntryAssetEntryRelModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<AssetListEntryAssetEntryRel, String>() {
					@Override
					public String apply(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel) {
						return assetListEntryAssetEntryRel.getUuid();
					}
				},
				new BiConsumer<AssetListEntryAssetEntryRel, String>() {
					@Override
					public void accept(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel,
						String uuid) {
						assetListEntryAssetEntryRel.setUuid(uuid);
					}
				});
		}
	}

	public static class AssetListEntryAssetEntryRelIdAccessor
		extends ModelPropertyAccessor {
		public AssetListEntryAssetEntryRelIdAccessor() {
			super(new Function<AssetListEntryAssetEntryRel, Long>() {
					@Override
					public Long apply(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel) {
						return assetListEntryAssetEntryRel.getAssetListEntryAssetEntryRelId();
					}
				},
				new BiConsumer<AssetListEntryAssetEntryRel, Long>() {
					@Override
					public void accept(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel,
						Long assetListEntryAssetEntryRelId) {
						assetListEntryAssetEntryRel.setAssetListEntryAssetEntryRelId(assetListEntryAssetEntryRelId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<AssetListEntryAssetEntryRel, Long>() {
					@Override
					public Long apply(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel) {
						return assetListEntryAssetEntryRel.getGroupId();
					}
				},
				new BiConsumer<AssetListEntryAssetEntryRel, Long>() {
					@Override
					public void accept(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel,
						Long groupId) {
						assetListEntryAssetEntryRel.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<AssetListEntryAssetEntryRel, Long>() {
					@Override
					public Long apply(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel) {
						return assetListEntryAssetEntryRel.getCompanyId();
					}
				},
				new BiConsumer<AssetListEntryAssetEntryRel, Long>() {
					@Override
					public void accept(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel,
						Long companyId) {
						assetListEntryAssetEntryRel.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<AssetListEntryAssetEntryRel, Long>() {
					@Override
					public Long apply(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel) {
						return assetListEntryAssetEntryRel.getUserId();
					}
				},
				new BiConsumer<AssetListEntryAssetEntryRel, Long>() {
					@Override
					public void accept(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel,
						Long userId) {
						assetListEntryAssetEntryRel.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<AssetListEntryAssetEntryRel, String>() {
					@Override
					public String apply(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel) {
						return assetListEntryAssetEntryRel.getUserName();
					}
				},
				new BiConsumer<AssetListEntryAssetEntryRel, String>() {
					@Override
					public void accept(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel,
						String userName) {
						assetListEntryAssetEntryRel.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<AssetListEntryAssetEntryRel, Date>() {
					@Override
					public Date apply(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel) {
						return assetListEntryAssetEntryRel.getCreateDate();
					}
				},
				new BiConsumer<AssetListEntryAssetEntryRel, Date>() {
					@Override
					public void accept(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel,
						Date createDate) {
						assetListEntryAssetEntryRel.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<AssetListEntryAssetEntryRel, Date>() {
					@Override
					public Date apply(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel) {
						return assetListEntryAssetEntryRel.getModifiedDate();
					}
				},
				new BiConsumer<AssetListEntryAssetEntryRel, Date>() {
					@Override
					public void accept(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel,
						Date modifiedDate) {
						assetListEntryAssetEntryRel.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class AssetListEntryIdAccessor extends ModelPropertyAccessor {
		public AssetListEntryIdAccessor() {
			super(new Function<AssetListEntryAssetEntryRel, Long>() {
					@Override
					public Long apply(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel) {
						return assetListEntryAssetEntryRel.getAssetListEntryId();
					}
				},
				new BiConsumer<AssetListEntryAssetEntryRel, Long>() {
					@Override
					public void accept(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel,
						Long assetListEntryId) {
						assetListEntryAssetEntryRel.setAssetListEntryId(assetListEntryId);
					}
				});
		}
	}

	public static class AssetEntryIdAccessor extends ModelPropertyAccessor {
		public AssetEntryIdAccessor() {
			super(new Function<AssetListEntryAssetEntryRel, Long>() {
					@Override
					public Long apply(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel) {
						return assetListEntryAssetEntryRel.getAssetEntryId();
					}
				},
				new BiConsumer<AssetListEntryAssetEntryRel, Long>() {
					@Override
					public void accept(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel,
						Long assetEntryId) {
						assetListEntryAssetEntryRel.setAssetEntryId(assetEntryId);
					}
				});
		}
	}

	public static class PositionAccessor extends ModelPropertyAccessor {
		public PositionAccessor() {
			super(new Function<AssetListEntryAssetEntryRel, Integer>() {
					@Override
					public Integer apply(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel) {
						return assetListEntryAssetEntryRel.getPosition();
					}
				},
				new BiConsumer<AssetListEntryAssetEntryRel, Integer>() {
					@Override
					public void accept(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel,
						Integer position) {
						assetListEntryAssetEntryRel.setPosition(position);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<AssetListEntryAssetEntryRel, Date>() {
					@Override
					public Date apply(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel) {
						return assetListEntryAssetEntryRel.getLastPublishDate();
					}
				},
				new BiConsumer<AssetListEntryAssetEntryRel, Date>() {
					@Override
					public void accept(
						AssetListEntryAssetEntryRel assetListEntryAssetEntryRel,
						Date lastPublishDate) {
						assetListEntryAssetEntryRel.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private AssetListEntryAssetEntryRelModelAccessors() {
	}
}