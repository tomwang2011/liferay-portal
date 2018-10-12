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

package com.liferay.portal.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;
import com.liferay.portal.kernel.model.Group;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class GroupModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<Group, String>() {
					@Override
					public String apply(Group group) {
						return group.getUuid();
					}
				},
				new BiConsumer<Group, String>() {
					@Override
					public void accept(Group group, String uuid) {
						group.setUuid(uuid);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<Group, Long>() {
					@Override
					public Long apply(Group group) {
						return group.getGroupId();
					}
				},
				new BiConsumer<Group, Long>() {
					@Override
					public void accept(Group group, Long groupId) {
						group.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Group, Long>() {
					@Override
					public Long apply(Group group) {
						return group.getCompanyId();
					}
				},
				new BiConsumer<Group, Long>() {
					@Override
					public void accept(Group group, Long companyId) {
						group.setCompanyId(companyId);
					}
				});
		}
	}

	public static class CreatorUserIdAccessor extends ModelPropertyAccessor {
		public CreatorUserIdAccessor() {
			super(new Function<Group, Long>() {
					@Override
					public Long apply(Group group) {
						return group.getCreatorUserId();
					}
				},
				new BiConsumer<Group, Long>() {
					@Override
					public void accept(Group group, Long creatorUserId) {
						group.setCreatorUserId(creatorUserId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<Group, Long>() {
					@Override
					public Long apply(Group group) {
						return group.getClassNameId();
					}
				},
				new BiConsumer<Group, Long>() {
					@Override
					public void accept(Group group, Long classNameId) {
						group.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<Group, Long>() {
					@Override
					public Long apply(Group group) {
						return group.getClassPK();
					}
				},
				new BiConsumer<Group, Long>() {
					@Override
					public void accept(Group group, Long classPK) {
						group.setClassPK(classPK);
					}
				});
		}
	}

	public static class ParentGroupIdAccessor extends ModelPropertyAccessor {
		public ParentGroupIdAccessor() {
			super(new Function<Group, Long>() {
					@Override
					public Long apply(Group group) {
						return group.getParentGroupId();
					}
				},
				new BiConsumer<Group, Long>() {
					@Override
					public void accept(Group group, Long parentGroupId) {
						group.setParentGroupId(parentGroupId);
					}
				});
		}
	}

	public static class LiveGroupIdAccessor extends ModelPropertyAccessor {
		public LiveGroupIdAccessor() {
			super(new Function<Group, Long>() {
					@Override
					public Long apply(Group group) {
						return group.getLiveGroupId();
					}
				},
				new BiConsumer<Group, Long>() {
					@Override
					public void accept(Group group, Long liveGroupId) {
						group.setLiveGroupId(liveGroupId);
					}
				});
		}
	}

	public static class TreePathAccessor extends ModelPropertyAccessor {
		public TreePathAccessor() {
			super(new Function<Group, String>() {
					@Override
					public String apply(Group group) {
						return group.getTreePath();
					}
				},
				new BiConsumer<Group, String>() {
					@Override
					public void accept(Group group, String treePath) {
						group.setTreePath(treePath);
					}
				});
		}
	}

	public static class GroupKeyAccessor extends ModelPropertyAccessor {
		public GroupKeyAccessor() {
			super(new Function<Group, String>() {
					@Override
					public String apply(Group group) {
						return group.getGroupKey();
					}
				},
				new BiConsumer<Group, String>() {
					@Override
					public void accept(Group group, String groupKey) {
						group.setGroupKey(groupKey);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<Group, String>() {
					@Override
					public String apply(Group group) {
						return group.getName();
					}
				},
				new BiConsumer<Group, String>() {
					@Override
					public void accept(Group group, String name) {
						group.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<Group, String>() {
					@Override
					public String apply(Group group) {
						return group.getDescription();
					}
				},
				new BiConsumer<Group, String>() {
					@Override
					public void accept(Group group, String description) {
						group.setDescription(description);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<Group, Integer>() {
					@Override
					public Integer apply(Group group) {
						return group.getType();
					}
				},
				new BiConsumer<Group, Integer>() {
					@Override
					public void accept(Group group, Integer type) {
						group.setType(type);
					}
				});
		}
	}

	public static class TypeSettingsAccessor extends ModelPropertyAccessor {
		public TypeSettingsAccessor() {
			super(new Function<Group, String>() {
					@Override
					public String apply(Group group) {
						return group.getTypeSettings();
					}
				},
				new BiConsumer<Group, String>() {
					@Override
					public void accept(Group group, String typeSettings) {
						group.setTypeSettings(typeSettings);
					}
				});
		}
	}

	public static class ManualMembershipAccessor extends ModelPropertyAccessor {
		public ManualMembershipAccessor() {
			super(new Function<Group, Boolean>() {
					@Override
					public Boolean apply(Group group) {
						return group.getManualMembership();
					}
				},
				new BiConsumer<Group, Boolean>() {
					@Override
					public void accept(Group group, Boolean manualMembership) {
						group.setManualMembership(manualMembership);
					}
				});
		}
	}

	public static class MembershipRestrictionAccessor
		extends ModelPropertyAccessor {
		public MembershipRestrictionAccessor() {
			super(new Function<Group, Integer>() {
					@Override
					public Integer apply(Group group) {
						return group.getMembershipRestriction();
					}
				},
				new BiConsumer<Group, Integer>() {
					@Override
					public void accept(Group group,
						Integer membershipRestriction) {
						group.setMembershipRestriction(membershipRestriction);
					}
				});
		}
	}

	public static class FriendlyURLAccessor extends ModelPropertyAccessor {
		public FriendlyURLAccessor() {
			super(new Function<Group, String>() {
					@Override
					public String apply(Group group) {
						return group.getFriendlyURL();
					}
				},
				new BiConsumer<Group, String>() {
					@Override
					public void accept(Group group, String friendlyURL) {
						group.setFriendlyURL(friendlyURL);
					}
				});
		}
	}

	public static class SiteAccessor extends ModelPropertyAccessor {
		public SiteAccessor() {
			super(new Function<Group, Boolean>() {
					@Override
					public Boolean apply(Group group) {
						return group.getSite();
					}
				},
				new BiConsumer<Group, Boolean>() {
					@Override
					public void accept(Group group, Boolean site) {
						group.setSite(site);
					}
				});
		}
	}

	public static class RemoteStagingGroupCountAccessor
		extends ModelPropertyAccessor {
		public RemoteStagingGroupCountAccessor() {
			super(new Function<Group, Integer>() {
					@Override
					public Integer apply(Group group) {
						return group.getRemoteStagingGroupCount();
					}
				},
				new BiConsumer<Group, Integer>() {
					@Override
					public void accept(Group group,
						Integer remoteStagingGroupCount) {
						group.setRemoteStagingGroupCount(remoteStagingGroupCount);
					}
				});
		}
	}

	public static class InheritContentAccessor extends ModelPropertyAccessor {
		public InheritContentAccessor() {
			super(new Function<Group, Boolean>() {
					@Override
					public Boolean apply(Group group) {
						return group.getInheritContent();
					}
				},
				new BiConsumer<Group, Boolean>() {
					@Override
					public void accept(Group group, Boolean inheritContent) {
						group.setInheritContent(inheritContent);
					}
				});
		}
	}

	public static class ActiveAccessor extends ModelPropertyAccessor {
		public ActiveAccessor() {
			super(new Function<Group, Boolean>() {
					@Override
					public Boolean apply(Group group) {
						return group.getActive();
					}
				},
				new BiConsumer<Group, Boolean>() {
					@Override
					public void accept(Group group, Boolean active) {
						group.setActive(active);
					}
				});
		}
	}

	private GroupModelAccessors() {
	}
}