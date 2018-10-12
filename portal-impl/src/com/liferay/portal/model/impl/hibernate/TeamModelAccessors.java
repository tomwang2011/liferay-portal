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
import com.liferay.portal.kernel.model.Team;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TeamModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<Team, String>() {
					@Override
					public String apply(Team team) {
						return team.getUuid();
					}
				},
				new BiConsumer<Team, String>() {
					@Override
					public void accept(Team team, String uuid) {
						team.setUuid(uuid);
					}
				});
		}
	}

	public static class TeamIdAccessor extends ModelPropertyAccessor {
		public TeamIdAccessor() {
			super(new Function<Team, Long>() {
					@Override
					public Long apply(Team team) {
						return team.getTeamId();
					}
				},
				new BiConsumer<Team, Long>() {
					@Override
					public void accept(Team team, Long teamId) {
						team.setTeamId(teamId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Team, Long>() {
					@Override
					public Long apply(Team team) {
						return team.getCompanyId();
					}
				},
				new BiConsumer<Team, Long>() {
					@Override
					public void accept(Team team, Long companyId) {
						team.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<Team, Long>() {
					@Override
					public Long apply(Team team) {
						return team.getUserId();
					}
				},
				new BiConsumer<Team, Long>() {
					@Override
					public void accept(Team team, Long userId) {
						team.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<Team, String>() {
					@Override
					public String apply(Team team) {
						return team.getUserName();
					}
				},
				new BiConsumer<Team, String>() {
					@Override
					public void accept(Team team, String userName) {
						team.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Team, Date>() {
					@Override
					public Date apply(Team team) {
						return team.getCreateDate();
					}
				},
				new BiConsumer<Team, Date>() {
					@Override
					public void accept(Team team, Date createDate) {
						team.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<Team, Date>() {
					@Override
					public Date apply(Team team) {
						return team.getModifiedDate();
					}
				},
				new BiConsumer<Team, Date>() {
					@Override
					public void accept(Team team, Date modifiedDate) {
						team.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<Team, Long>() {
					@Override
					public Long apply(Team team) {
						return team.getGroupId();
					}
				},
				new BiConsumer<Team, Long>() {
					@Override
					public void accept(Team team, Long groupId) {
						team.setGroupId(groupId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<Team, String>() {
					@Override
					public String apply(Team team) {
						return team.getName();
					}
				},
				new BiConsumer<Team, String>() {
					@Override
					public void accept(Team team, String name) {
						team.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<Team, String>() {
					@Override
					public String apply(Team team) {
						return team.getDescription();
					}
				},
				new BiConsumer<Team, String>() {
					@Override
					public void accept(Team team, String description) {
						team.setDescription(description);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<Team, Date>() {
					@Override
					public Date apply(Team team) {
						return team.getLastPublishDate();
					}
				},
				new BiConsumer<Team, Date>() {
					@Override
					public void accept(Team team, Date lastPublishDate) {
						team.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private TeamModelAccessors() {
	}
}