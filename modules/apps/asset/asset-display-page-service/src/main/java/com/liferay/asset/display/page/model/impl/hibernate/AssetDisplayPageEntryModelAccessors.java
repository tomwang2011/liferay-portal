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

package com.liferay.asset.display.page.model.impl.hibernate;

import com.liferay.asset.display.page.model.AssetDisplayPageEntry;

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
public class AssetDisplayPageEntryModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<AssetDisplayPageEntry, String>() {
					@Override
					public String apply(
						AssetDisplayPageEntry assetDisplayPageEntry) {
						return assetDisplayPageEntry.getUuid();
					}
				},
				new BiConsumer<AssetDisplayPageEntry, String>() {
					@Override
					public void accept(
						AssetDisplayPageEntry assetDisplayPageEntry, String uuid) {
						assetDisplayPageEntry.setUuid(uuid);
					}
				});
		}
	}

	public static class AssetDisplayPageEntryIdAccessor
		extends ModelPropertyAccessor {
		public AssetDisplayPageEntryIdAccessor() {
			super(new Function<AssetDisplayPageEntry, Long>() {
					@Override
					public Long apply(
						AssetDisplayPageEntry assetDisplayPageEntry) {
						return assetDisplayPageEntry.getAssetDisplayPageEntryId();
					}
				},
				new BiConsumer<AssetDisplayPageEntry, Long>() {
					@Override
					public void accept(
						AssetDisplayPageEntry assetDisplayPageEntry,
						Long assetDisplayPageEntryId) {
						assetDisplayPageEntry.setAssetDisplayPageEntryId(assetDisplayPageEntryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<AssetDisplayPageEntry, Long>() {
					@Override
					public Long apply(
						AssetDisplayPageEntry assetDisplayPageEntry) {
						return assetDisplayPageEntry.getGroupId();
					}
				},
				new BiConsumer<AssetDisplayPageEntry, Long>() {
					@Override
					public void accept(
						AssetDisplayPageEntry assetDisplayPageEntry,
						Long groupId) {
						assetDisplayPageEntry.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<AssetDisplayPageEntry, Long>() {
					@Override
					public Long apply(
						AssetDisplayPageEntry assetDisplayPageEntry) {
						return assetDisplayPageEntry.getCompanyId();
					}
				},
				new BiConsumer<AssetDisplayPageEntry, Long>() {
					@Override
					public void accept(
						AssetDisplayPageEntry assetDisplayPageEntry,
						Long companyId) {
						assetDisplayPageEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<AssetDisplayPageEntry, Long>() {
					@Override
					public Long apply(
						AssetDisplayPageEntry assetDisplayPageEntry) {
						return assetDisplayPageEntry.getUserId();
					}
				},
				new BiConsumer<AssetDisplayPageEntry, Long>() {
					@Override
					public void accept(
						AssetDisplayPageEntry assetDisplayPageEntry, Long userId) {
						assetDisplayPageEntry.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<AssetDisplayPageEntry, String>() {
					@Override
					public String apply(
						AssetDisplayPageEntry assetDisplayPageEntry) {
						return assetDisplayPageEntry.getUserName();
					}
				},
				new BiConsumer<AssetDisplayPageEntry, String>() {
					@Override
					public void accept(
						AssetDisplayPageEntry assetDisplayPageEntry,
						String userName) {
						assetDisplayPageEntry.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<AssetDisplayPageEntry, Date>() {
					@Override
					public Date apply(
						AssetDisplayPageEntry assetDisplayPageEntry) {
						return assetDisplayPageEntry.getCreateDate();
					}
				},
				new BiConsumer<AssetDisplayPageEntry, Date>() {
					@Override
					public void accept(
						AssetDisplayPageEntry assetDisplayPageEntry,
						Date createDate) {
						assetDisplayPageEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<AssetDisplayPageEntry, Date>() {
					@Override
					public Date apply(
						AssetDisplayPageEntry assetDisplayPageEntry) {
						return assetDisplayPageEntry.getModifiedDate();
					}
				},
				new BiConsumer<AssetDisplayPageEntry, Date>() {
					@Override
					public void accept(
						AssetDisplayPageEntry assetDisplayPageEntry,
						Date modifiedDate) {
						assetDisplayPageEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<AssetDisplayPageEntry, Long>() {
					@Override
					public Long apply(
						AssetDisplayPageEntry assetDisplayPageEntry) {
						return assetDisplayPageEntry.getClassNameId();
					}
				},
				new BiConsumer<AssetDisplayPageEntry, Long>() {
					@Override
					public void accept(
						AssetDisplayPageEntry assetDisplayPageEntry,
						Long classNameId) {
						assetDisplayPageEntry.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<AssetDisplayPageEntry, Long>() {
					@Override
					public Long apply(
						AssetDisplayPageEntry assetDisplayPageEntry) {
						return assetDisplayPageEntry.getClassPK();
					}
				},
				new BiConsumer<AssetDisplayPageEntry, Long>() {
					@Override
					public void accept(
						AssetDisplayPageEntry assetDisplayPageEntry,
						Long classPK) {
						assetDisplayPageEntry.setClassPK(classPK);
					}
				});
		}
	}

	public static class LayoutPageTemplateEntryIdAccessor
		extends ModelPropertyAccessor {
		public LayoutPageTemplateEntryIdAccessor() {
			super(new Function<AssetDisplayPageEntry, Long>() {
					@Override
					public Long apply(
						AssetDisplayPageEntry assetDisplayPageEntry) {
						return assetDisplayPageEntry.getLayoutPageTemplateEntryId();
					}
				},
				new BiConsumer<AssetDisplayPageEntry, Long>() {
					@Override
					public void accept(
						AssetDisplayPageEntry assetDisplayPageEntry,
						Long layoutPageTemplateEntryId) {
						assetDisplayPageEntry.setLayoutPageTemplateEntryId(layoutPageTemplateEntryId);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<AssetDisplayPageEntry, Integer>() {
					@Override
					public Integer apply(
						AssetDisplayPageEntry assetDisplayPageEntry) {
						return assetDisplayPageEntry.getType();
					}
				},
				new BiConsumer<AssetDisplayPageEntry, Integer>() {
					@Override
					public void accept(
						AssetDisplayPageEntry assetDisplayPageEntry,
						Integer type) {
						assetDisplayPageEntry.setType(type);
					}
				});
		}
	}

	private AssetDisplayPageEntryModelAccessors() {
	}
}