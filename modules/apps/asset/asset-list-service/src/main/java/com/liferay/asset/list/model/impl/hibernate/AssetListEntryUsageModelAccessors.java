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

import com.liferay.asset.list.model.AssetListEntryUsage;

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
public class AssetListEntryUsageModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<AssetListEntryUsage, String>() {
					@Override
					public String apply(AssetListEntryUsage assetListEntryUsage) {
						return assetListEntryUsage.getUuid();
					}
				},
				new BiConsumer<AssetListEntryUsage, String>() {
					@Override
					public void accept(
						AssetListEntryUsage assetListEntryUsage, String uuid) {
						assetListEntryUsage.setUuid(uuid);
					}
				});
		}
	}

	public static class AssetListEntryUsageIdAccessor
		extends ModelPropertyAccessor {
		public AssetListEntryUsageIdAccessor() {
			super(new Function<AssetListEntryUsage, Long>() {
					@Override
					public Long apply(AssetListEntryUsage assetListEntryUsage) {
						return assetListEntryUsage.getAssetListEntryUsageId();
					}
				},
				new BiConsumer<AssetListEntryUsage, Long>() {
					@Override
					public void accept(
						AssetListEntryUsage assetListEntryUsage,
						Long assetListEntryUsageId) {
						assetListEntryUsage.setAssetListEntryUsageId(assetListEntryUsageId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<AssetListEntryUsage, Long>() {
					@Override
					public Long apply(AssetListEntryUsage assetListEntryUsage) {
						return assetListEntryUsage.getGroupId();
					}
				},
				new BiConsumer<AssetListEntryUsage, Long>() {
					@Override
					public void accept(
						AssetListEntryUsage assetListEntryUsage, Long groupId) {
						assetListEntryUsage.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<AssetListEntryUsage, Long>() {
					@Override
					public Long apply(AssetListEntryUsage assetListEntryUsage) {
						return assetListEntryUsage.getCompanyId();
					}
				},
				new BiConsumer<AssetListEntryUsage, Long>() {
					@Override
					public void accept(
						AssetListEntryUsage assetListEntryUsage, Long companyId) {
						assetListEntryUsage.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<AssetListEntryUsage, Long>() {
					@Override
					public Long apply(AssetListEntryUsage assetListEntryUsage) {
						return assetListEntryUsage.getUserId();
					}
				},
				new BiConsumer<AssetListEntryUsage, Long>() {
					@Override
					public void accept(
						AssetListEntryUsage assetListEntryUsage, Long userId) {
						assetListEntryUsage.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<AssetListEntryUsage, String>() {
					@Override
					public String apply(AssetListEntryUsage assetListEntryUsage) {
						return assetListEntryUsage.getUserName();
					}
				},
				new BiConsumer<AssetListEntryUsage, String>() {
					@Override
					public void accept(
						AssetListEntryUsage assetListEntryUsage, String userName) {
						assetListEntryUsage.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<AssetListEntryUsage, Date>() {
					@Override
					public Date apply(AssetListEntryUsage assetListEntryUsage) {
						return assetListEntryUsage.getCreateDate();
					}
				},
				new BiConsumer<AssetListEntryUsage, Date>() {
					@Override
					public void accept(
						AssetListEntryUsage assetListEntryUsage, Date createDate) {
						assetListEntryUsage.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<AssetListEntryUsage, Date>() {
					@Override
					public Date apply(AssetListEntryUsage assetListEntryUsage) {
						return assetListEntryUsage.getModifiedDate();
					}
				},
				new BiConsumer<AssetListEntryUsage, Date>() {
					@Override
					public void accept(
						AssetListEntryUsage assetListEntryUsage,
						Date modifiedDate) {
						assetListEntryUsage.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class AssetListEntryIdAccessor extends ModelPropertyAccessor {
		public AssetListEntryIdAccessor() {
			super(new Function<AssetListEntryUsage, Long>() {
					@Override
					public Long apply(AssetListEntryUsage assetListEntryUsage) {
						return assetListEntryUsage.getAssetListEntryId();
					}
				},
				new BiConsumer<AssetListEntryUsage, Long>() {
					@Override
					public void accept(
						AssetListEntryUsage assetListEntryUsage,
						Long assetListEntryId) {
						assetListEntryUsage.setAssetListEntryId(assetListEntryId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<AssetListEntryUsage, Long>() {
					@Override
					public Long apply(AssetListEntryUsage assetListEntryUsage) {
						return assetListEntryUsage.getClassNameId();
					}
				},
				new BiConsumer<AssetListEntryUsage, Long>() {
					@Override
					public void accept(
						AssetListEntryUsage assetListEntryUsage,
						Long classNameId) {
						assetListEntryUsage.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<AssetListEntryUsage, Long>() {
					@Override
					public Long apply(AssetListEntryUsage assetListEntryUsage) {
						return assetListEntryUsage.getClassPK();
					}
				},
				new BiConsumer<AssetListEntryUsage, Long>() {
					@Override
					public void accept(
						AssetListEntryUsage assetListEntryUsage, Long classPK) {
						assetListEntryUsage.setClassPK(classPK);
					}
				});
		}
	}

	public static class PortletIdAccessor extends ModelPropertyAccessor {
		public PortletIdAccessor() {
			super(new Function<AssetListEntryUsage, String>() {
					@Override
					public String apply(AssetListEntryUsage assetListEntryUsage) {
						return assetListEntryUsage.getPortletId();
					}
				},
				new BiConsumer<AssetListEntryUsage, String>() {
					@Override
					public void accept(
						AssetListEntryUsage assetListEntryUsage,
						String portletId) {
						assetListEntryUsage.setPortletId(portletId);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<AssetListEntryUsage, Date>() {
					@Override
					public Date apply(AssetListEntryUsage assetListEntryUsage) {
						return assetListEntryUsage.getLastPublishDate();
					}
				},
				new BiConsumer<AssetListEntryUsage, Date>() {
					@Override
					public void accept(
						AssetListEntryUsage assetListEntryUsage,
						Date lastPublishDate) {
						assetListEntryUsage.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private AssetListEntryUsageModelAccessors() {
	}
}