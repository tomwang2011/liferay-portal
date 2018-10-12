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

import com.liferay.asset.kernel.model.AssetVocabulary;

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
public class AssetVocabularyModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<AssetVocabulary, String>() {
					@Override
					public String apply(AssetVocabulary assetVocabulary) {
						return assetVocabulary.getUuid();
					}
				},
				new BiConsumer<AssetVocabulary, String>() {
					@Override
					public void accept(AssetVocabulary assetVocabulary,
						String uuid) {
						assetVocabulary.setUuid(uuid);
					}
				});
		}
	}

	public static class ExternalReferenceCodeAccessor
		extends ModelPropertyAccessor {
		public ExternalReferenceCodeAccessor() {
			super(new Function<AssetVocabulary, String>() {
					@Override
					public String apply(AssetVocabulary assetVocabulary) {
						return assetVocabulary.getExternalReferenceCode();
					}
				},
				new BiConsumer<AssetVocabulary, String>() {
					@Override
					public void accept(AssetVocabulary assetVocabulary,
						String externalReferenceCode) {
						assetVocabulary.setExternalReferenceCode(externalReferenceCode);
					}
				});
		}
	}

	public static class VocabularyIdAccessor extends ModelPropertyAccessor {
		public VocabularyIdAccessor() {
			super(new Function<AssetVocabulary, Long>() {
					@Override
					public Long apply(AssetVocabulary assetVocabulary) {
						return assetVocabulary.getVocabularyId();
					}
				},
				new BiConsumer<AssetVocabulary, Long>() {
					@Override
					public void accept(AssetVocabulary assetVocabulary,
						Long vocabularyId) {
						assetVocabulary.setVocabularyId(vocabularyId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<AssetVocabulary, Long>() {
					@Override
					public Long apply(AssetVocabulary assetVocabulary) {
						return assetVocabulary.getGroupId();
					}
				},
				new BiConsumer<AssetVocabulary, Long>() {
					@Override
					public void accept(AssetVocabulary assetVocabulary,
						Long groupId) {
						assetVocabulary.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<AssetVocabulary, Long>() {
					@Override
					public Long apply(AssetVocabulary assetVocabulary) {
						return assetVocabulary.getCompanyId();
					}
				},
				new BiConsumer<AssetVocabulary, Long>() {
					@Override
					public void accept(AssetVocabulary assetVocabulary,
						Long companyId) {
						assetVocabulary.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<AssetVocabulary, Long>() {
					@Override
					public Long apply(AssetVocabulary assetVocabulary) {
						return assetVocabulary.getUserId();
					}
				},
				new BiConsumer<AssetVocabulary, Long>() {
					@Override
					public void accept(AssetVocabulary assetVocabulary,
						Long userId) {
						assetVocabulary.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<AssetVocabulary, String>() {
					@Override
					public String apply(AssetVocabulary assetVocabulary) {
						return assetVocabulary.getUserName();
					}
				},
				new BiConsumer<AssetVocabulary, String>() {
					@Override
					public void accept(AssetVocabulary assetVocabulary,
						String userName) {
						assetVocabulary.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<AssetVocabulary, Date>() {
					@Override
					public Date apply(AssetVocabulary assetVocabulary) {
						return assetVocabulary.getCreateDate();
					}
				},
				new BiConsumer<AssetVocabulary, Date>() {
					@Override
					public void accept(AssetVocabulary assetVocabulary,
						Date createDate) {
						assetVocabulary.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<AssetVocabulary, Date>() {
					@Override
					public Date apply(AssetVocabulary assetVocabulary) {
						return assetVocabulary.getModifiedDate();
					}
				},
				new BiConsumer<AssetVocabulary, Date>() {
					@Override
					public void accept(AssetVocabulary assetVocabulary,
						Date modifiedDate) {
						assetVocabulary.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<AssetVocabulary, String>() {
					@Override
					public String apply(AssetVocabulary assetVocabulary) {
						return assetVocabulary.getName();
					}
				},
				new BiConsumer<AssetVocabulary, String>() {
					@Override
					public void accept(AssetVocabulary assetVocabulary,
						String name) {
						assetVocabulary.setName(name);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<AssetVocabulary, String>() {
					@Override
					public String apply(AssetVocabulary assetVocabulary) {
						return assetVocabulary.getTitle();
					}
				},
				new BiConsumer<AssetVocabulary, String>() {
					@Override
					public void accept(AssetVocabulary assetVocabulary,
						String title) {
						assetVocabulary.setTitle(title);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<AssetVocabulary, String>() {
					@Override
					public String apply(AssetVocabulary assetVocabulary) {
						return assetVocabulary.getDescription();
					}
				},
				new BiConsumer<AssetVocabulary, String>() {
					@Override
					public void accept(AssetVocabulary assetVocabulary,
						String description) {
						assetVocabulary.setDescription(description);
					}
				});
		}
	}

	public static class SettingsAccessor extends ModelPropertyAccessor {
		public SettingsAccessor() {
			super(new Function<AssetVocabulary, String>() {
					@Override
					public String apply(AssetVocabulary assetVocabulary) {
						return assetVocabulary.getSettings();
					}
				},
				new BiConsumer<AssetVocabulary, String>() {
					@Override
					public void accept(AssetVocabulary assetVocabulary,
						String settings) {
						assetVocabulary.setSettings(settings);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<AssetVocabulary, Date>() {
					@Override
					public Date apply(AssetVocabulary assetVocabulary) {
						return assetVocabulary.getLastPublishDate();
					}
				},
				new BiConsumer<AssetVocabulary, Date>() {
					@Override
					public void accept(AssetVocabulary assetVocabulary,
						Date lastPublishDate) {
						assetVocabulary.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private AssetVocabularyModelAccessors() {
	}
}