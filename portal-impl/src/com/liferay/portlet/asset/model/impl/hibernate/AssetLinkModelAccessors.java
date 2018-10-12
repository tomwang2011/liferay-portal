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

import com.liferay.asset.kernel.model.AssetLink;

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
public class AssetLinkModelAccessors {
	public static class LinkIdAccessor extends ModelPropertyAccessor {
		public LinkIdAccessor() {
			super(new Function<AssetLink, Long>() {
					@Override
					public Long apply(AssetLink assetLink) {
						return assetLink.getLinkId();
					}
				},
				new BiConsumer<AssetLink, Long>() {
					@Override
					public void accept(AssetLink assetLink, Long linkId) {
						assetLink.setLinkId(linkId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<AssetLink, Long>() {
					@Override
					public Long apply(AssetLink assetLink) {
						return assetLink.getCompanyId();
					}
				},
				new BiConsumer<AssetLink, Long>() {
					@Override
					public void accept(AssetLink assetLink, Long companyId) {
						assetLink.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<AssetLink, Long>() {
					@Override
					public Long apply(AssetLink assetLink) {
						return assetLink.getUserId();
					}
				},
				new BiConsumer<AssetLink, Long>() {
					@Override
					public void accept(AssetLink assetLink, Long userId) {
						assetLink.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<AssetLink, String>() {
					@Override
					public String apply(AssetLink assetLink) {
						return assetLink.getUserName();
					}
				},
				new BiConsumer<AssetLink, String>() {
					@Override
					public void accept(AssetLink assetLink, String userName) {
						assetLink.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<AssetLink, Date>() {
					@Override
					public Date apply(AssetLink assetLink) {
						return assetLink.getCreateDate();
					}
				},
				new BiConsumer<AssetLink, Date>() {
					@Override
					public void accept(AssetLink assetLink, Date createDate) {
						assetLink.setCreateDate(createDate);
					}
				});
		}
	}

	public static class EntryId1Accessor extends ModelPropertyAccessor {
		public EntryId1Accessor() {
			super(new Function<AssetLink, Long>() {
					@Override
					public Long apply(AssetLink assetLink) {
						return assetLink.getEntryId1();
					}
				},
				new BiConsumer<AssetLink, Long>() {
					@Override
					public void accept(AssetLink assetLink, Long entryId1) {
						assetLink.setEntryId1(entryId1);
					}
				});
		}
	}

	public static class EntryId2Accessor extends ModelPropertyAccessor {
		public EntryId2Accessor() {
			super(new Function<AssetLink, Long>() {
					@Override
					public Long apply(AssetLink assetLink) {
						return assetLink.getEntryId2();
					}
				},
				new BiConsumer<AssetLink, Long>() {
					@Override
					public void accept(AssetLink assetLink, Long entryId2) {
						assetLink.setEntryId2(entryId2);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<AssetLink, Integer>() {
					@Override
					public Integer apply(AssetLink assetLink) {
						return assetLink.getType();
					}
				},
				new BiConsumer<AssetLink, Integer>() {
					@Override
					public void accept(AssetLink assetLink, Integer type) {
						assetLink.setType(type);
					}
				});
		}
	}

	public static class WeightAccessor extends ModelPropertyAccessor {
		public WeightAccessor() {
			super(new Function<AssetLink, Integer>() {
					@Override
					public Integer apply(AssetLink assetLink) {
						return assetLink.getWeight();
					}
				},
				new BiConsumer<AssetLink, Integer>() {
					@Override
					public void accept(AssetLink assetLink, Integer weight) {
						assetLink.setWeight(weight);
					}
				});
		}
	}

	private AssetLinkModelAccessors() {
	}
}