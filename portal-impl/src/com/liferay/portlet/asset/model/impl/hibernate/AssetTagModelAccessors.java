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

import com.liferay.asset.kernel.model.AssetTag;

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
public class AssetTagModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<AssetTag, String>() {
					@Override
					public String apply(AssetTag assetTag) {
						return assetTag.getUuid();
					}
				},
				new BiConsumer<AssetTag, String>() {
					@Override
					public void accept(AssetTag assetTag, String uuid) {
						assetTag.setUuid(uuid);
					}
				});
		}
	}

	public static class TagIdAccessor extends ModelPropertyAccessor {
		public TagIdAccessor() {
			super(new Function<AssetTag, Long>() {
					@Override
					public Long apply(AssetTag assetTag) {
						return assetTag.getTagId();
					}
				},
				new BiConsumer<AssetTag, Long>() {
					@Override
					public void accept(AssetTag assetTag, Long tagId) {
						assetTag.setTagId(tagId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<AssetTag, Long>() {
					@Override
					public Long apply(AssetTag assetTag) {
						return assetTag.getGroupId();
					}
				},
				new BiConsumer<AssetTag, Long>() {
					@Override
					public void accept(AssetTag assetTag, Long groupId) {
						assetTag.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<AssetTag, Long>() {
					@Override
					public Long apply(AssetTag assetTag) {
						return assetTag.getCompanyId();
					}
				},
				new BiConsumer<AssetTag, Long>() {
					@Override
					public void accept(AssetTag assetTag, Long companyId) {
						assetTag.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<AssetTag, Long>() {
					@Override
					public Long apply(AssetTag assetTag) {
						return assetTag.getUserId();
					}
				},
				new BiConsumer<AssetTag, Long>() {
					@Override
					public void accept(AssetTag assetTag, Long userId) {
						assetTag.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<AssetTag, String>() {
					@Override
					public String apply(AssetTag assetTag) {
						return assetTag.getUserName();
					}
				},
				new BiConsumer<AssetTag, String>() {
					@Override
					public void accept(AssetTag assetTag, String userName) {
						assetTag.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<AssetTag, Date>() {
					@Override
					public Date apply(AssetTag assetTag) {
						return assetTag.getCreateDate();
					}
				},
				new BiConsumer<AssetTag, Date>() {
					@Override
					public void accept(AssetTag assetTag, Date createDate) {
						assetTag.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<AssetTag, Date>() {
					@Override
					public Date apply(AssetTag assetTag) {
						return assetTag.getModifiedDate();
					}
				},
				new BiConsumer<AssetTag, Date>() {
					@Override
					public void accept(AssetTag assetTag, Date modifiedDate) {
						assetTag.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<AssetTag, String>() {
					@Override
					public String apply(AssetTag assetTag) {
						return assetTag.getName();
					}
				},
				new BiConsumer<AssetTag, String>() {
					@Override
					public void accept(AssetTag assetTag, String name) {
						assetTag.setName(name);
					}
				});
		}
	}

	public static class AssetCountAccessor extends ModelPropertyAccessor {
		public AssetCountAccessor() {
			super(new Function<AssetTag, Integer>() {
					@Override
					public Integer apply(AssetTag assetTag) {
						return assetTag.getAssetCount();
					}
				},
				new BiConsumer<AssetTag, Integer>() {
					@Override
					public void accept(AssetTag assetTag, Integer assetCount) {
						assetTag.setAssetCount(assetCount);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<AssetTag, Date>() {
					@Override
					public Date apply(AssetTag assetTag) {
						return assetTag.getLastPublishDate();
					}
				},
				new BiConsumer<AssetTag, Date>() {
					@Override
					public void accept(AssetTag assetTag, Date lastPublishDate) {
						assetTag.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private AssetTagModelAccessors() {
	}
}