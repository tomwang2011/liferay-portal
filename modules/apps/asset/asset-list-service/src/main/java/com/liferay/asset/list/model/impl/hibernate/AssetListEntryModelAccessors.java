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

import com.liferay.asset.list.model.AssetListEntry;

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
public class AssetListEntryModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<AssetListEntry, String>() {
					@Override
					public String apply(AssetListEntry assetListEntry) {
						return assetListEntry.getUuid();
					}
				},
				new BiConsumer<AssetListEntry, String>() {
					@Override
					public void accept(AssetListEntry assetListEntry,
						String uuid) {
						assetListEntry.setUuid(uuid);
					}
				});
		}
	}

	public static class AssetListEntryIdAccessor extends ModelPropertyAccessor {
		public AssetListEntryIdAccessor() {
			super(new Function<AssetListEntry, Long>() {
					@Override
					public Long apply(AssetListEntry assetListEntry) {
						return assetListEntry.getAssetListEntryId();
					}
				},
				new BiConsumer<AssetListEntry, Long>() {
					@Override
					public void accept(AssetListEntry assetListEntry,
						Long assetListEntryId) {
						assetListEntry.setAssetListEntryId(assetListEntryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<AssetListEntry, Long>() {
					@Override
					public Long apply(AssetListEntry assetListEntry) {
						return assetListEntry.getGroupId();
					}
				},
				new BiConsumer<AssetListEntry, Long>() {
					@Override
					public void accept(AssetListEntry assetListEntry,
						Long groupId) {
						assetListEntry.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<AssetListEntry, Long>() {
					@Override
					public Long apply(AssetListEntry assetListEntry) {
						return assetListEntry.getCompanyId();
					}
				},
				new BiConsumer<AssetListEntry, Long>() {
					@Override
					public void accept(AssetListEntry assetListEntry,
						Long companyId) {
						assetListEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<AssetListEntry, Long>() {
					@Override
					public Long apply(AssetListEntry assetListEntry) {
						return assetListEntry.getUserId();
					}
				},
				new BiConsumer<AssetListEntry, Long>() {
					@Override
					public void accept(AssetListEntry assetListEntry,
						Long userId) {
						assetListEntry.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<AssetListEntry, String>() {
					@Override
					public String apply(AssetListEntry assetListEntry) {
						return assetListEntry.getUserName();
					}
				},
				new BiConsumer<AssetListEntry, String>() {
					@Override
					public void accept(AssetListEntry assetListEntry,
						String userName) {
						assetListEntry.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<AssetListEntry, Date>() {
					@Override
					public Date apply(AssetListEntry assetListEntry) {
						return assetListEntry.getCreateDate();
					}
				},
				new BiConsumer<AssetListEntry, Date>() {
					@Override
					public void accept(AssetListEntry assetListEntry,
						Date createDate) {
						assetListEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<AssetListEntry, Date>() {
					@Override
					public Date apply(AssetListEntry assetListEntry) {
						return assetListEntry.getModifiedDate();
					}
				},
				new BiConsumer<AssetListEntry, Date>() {
					@Override
					public void accept(AssetListEntry assetListEntry,
						Date modifiedDate) {
						assetListEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<AssetListEntry, String>() {
					@Override
					public String apply(AssetListEntry assetListEntry) {
						return assetListEntry.getTitle();
					}
				},
				new BiConsumer<AssetListEntry, String>() {
					@Override
					public void accept(AssetListEntry assetListEntry,
						String title) {
						assetListEntry.setTitle(title);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<AssetListEntry, Integer>() {
					@Override
					public Integer apply(AssetListEntry assetListEntry) {
						return assetListEntry.getType();
					}
				},
				new BiConsumer<AssetListEntry, Integer>() {
					@Override
					public void accept(AssetListEntry assetListEntry,
						Integer type) {
						assetListEntry.setType(type);
					}
				});
		}
	}

	public static class TypeSettingsAccessor extends ModelPropertyAccessor {
		public TypeSettingsAccessor() {
			super(new Function<AssetListEntry, String>() {
					@Override
					public String apply(AssetListEntry assetListEntry) {
						return assetListEntry.getTypeSettings();
					}
				},
				new BiConsumer<AssetListEntry, String>() {
					@Override
					public void accept(AssetListEntry assetListEntry,
						String typeSettings) {
						assetListEntry.setTypeSettings(typeSettings);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<AssetListEntry, Date>() {
					@Override
					public Date apply(AssetListEntry assetListEntry) {
						return assetListEntry.getLastPublishDate();
					}
				},
				new BiConsumer<AssetListEntry, Date>() {
					@Override
					public void accept(AssetListEntry assetListEntry,
						Date lastPublishDate) {
						assetListEntry.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private AssetListEntryModelAccessors() {
	}
}