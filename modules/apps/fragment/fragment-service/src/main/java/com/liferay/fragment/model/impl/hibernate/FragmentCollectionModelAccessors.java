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

package com.liferay.fragment.model.impl.hibernate;

import com.liferay.fragment.model.FragmentCollection;

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
public class FragmentCollectionModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<FragmentCollection, String>() {
					@Override
					public String apply(FragmentCollection fragmentCollection) {
						return fragmentCollection.getUuid();
					}
				},
				new BiConsumer<FragmentCollection, String>() {
					@Override
					public void accept(FragmentCollection fragmentCollection,
						String uuid) {
						fragmentCollection.setUuid(uuid);
					}
				});
		}
	}

	public static class FragmentCollectionIdAccessor
		extends ModelPropertyAccessor {
		public FragmentCollectionIdAccessor() {
			super(new Function<FragmentCollection, Long>() {
					@Override
					public Long apply(FragmentCollection fragmentCollection) {
						return fragmentCollection.getFragmentCollectionId();
					}
				},
				new BiConsumer<FragmentCollection, Long>() {
					@Override
					public void accept(FragmentCollection fragmentCollection,
						Long fragmentCollectionId) {
						fragmentCollection.setFragmentCollectionId(fragmentCollectionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<FragmentCollection, Long>() {
					@Override
					public Long apply(FragmentCollection fragmentCollection) {
						return fragmentCollection.getGroupId();
					}
				},
				new BiConsumer<FragmentCollection, Long>() {
					@Override
					public void accept(FragmentCollection fragmentCollection,
						Long groupId) {
						fragmentCollection.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<FragmentCollection, Long>() {
					@Override
					public Long apply(FragmentCollection fragmentCollection) {
						return fragmentCollection.getCompanyId();
					}
				},
				new BiConsumer<FragmentCollection, Long>() {
					@Override
					public void accept(FragmentCollection fragmentCollection,
						Long companyId) {
						fragmentCollection.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<FragmentCollection, Long>() {
					@Override
					public Long apply(FragmentCollection fragmentCollection) {
						return fragmentCollection.getUserId();
					}
				},
				new BiConsumer<FragmentCollection, Long>() {
					@Override
					public void accept(FragmentCollection fragmentCollection,
						Long userId) {
						fragmentCollection.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<FragmentCollection, String>() {
					@Override
					public String apply(FragmentCollection fragmentCollection) {
						return fragmentCollection.getUserName();
					}
				},
				new BiConsumer<FragmentCollection, String>() {
					@Override
					public void accept(FragmentCollection fragmentCollection,
						String userName) {
						fragmentCollection.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<FragmentCollection, Date>() {
					@Override
					public Date apply(FragmentCollection fragmentCollection) {
						return fragmentCollection.getCreateDate();
					}
				},
				new BiConsumer<FragmentCollection, Date>() {
					@Override
					public void accept(FragmentCollection fragmentCollection,
						Date createDate) {
						fragmentCollection.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<FragmentCollection, Date>() {
					@Override
					public Date apply(FragmentCollection fragmentCollection) {
						return fragmentCollection.getModifiedDate();
					}
				},
				new BiConsumer<FragmentCollection, Date>() {
					@Override
					public void accept(FragmentCollection fragmentCollection,
						Date modifiedDate) {
						fragmentCollection.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class FragmentCollectionKeyAccessor
		extends ModelPropertyAccessor {
		public FragmentCollectionKeyAccessor() {
			super(new Function<FragmentCollection, String>() {
					@Override
					public String apply(FragmentCollection fragmentCollection) {
						return fragmentCollection.getFragmentCollectionKey();
					}
				},
				new BiConsumer<FragmentCollection, String>() {
					@Override
					public void accept(FragmentCollection fragmentCollection,
						String fragmentCollectionKey) {
						fragmentCollection.setFragmentCollectionKey(fragmentCollectionKey);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<FragmentCollection, String>() {
					@Override
					public String apply(FragmentCollection fragmentCollection) {
						return fragmentCollection.getName();
					}
				},
				new BiConsumer<FragmentCollection, String>() {
					@Override
					public void accept(FragmentCollection fragmentCollection,
						String name) {
						fragmentCollection.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<FragmentCollection, String>() {
					@Override
					public String apply(FragmentCollection fragmentCollection) {
						return fragmentCollection.getDescription();
					}
				},
				new BiConsumer<FragmentCollection, String>() {
					@Override
					public void accept(FragmentCollection fragmentCollection,
						String description) {
						fragmentCollection.setDescription(description);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<FragmentCollection, Date>() {
					@Override
					public Date apply(FragmentCollection fragmentCollection) {
						return fragmentCollection.getLastPublishDate();
					}
				},
				new BiConsumer<FragmentCollection, Date>() {
					@Override
					public void accept(FragmentCollection fragmentCollection,
						Date lastPublishDate) {
						fragmentCollection.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private FragmentCollectionModelAccessors() {
	}
}