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
import com.liferay.portal.kernel.model.UserIdMapper;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserIdMapperModelAccessors {
	public static class UserIdMapperIdAccessor extends ModelPropertyAccessor {
		public UserIdMapperIdAccessor() {
			super(new Function<UserIdMapper, Long>() {
					@Override
					public Long apply(UserIdMapper userIdMapper) {
						return userIdMapper.getUserIdMapperId();
					}
				},
				new BiConsumer<UserIdMapper, Long>() {
					@Override
					public void accept(UserIdMapper userIdMapper,
						Long userIdMapperId) {
						userIdMapper.setUserIdMapperId(userIdMapperId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<UserIdMapper, Long>() {
					@Override
					public Long apply(UserIdMapper userIdMapper) {
						return userIdMapper.getCompanyId();
					}
				},
				new BiConsumer<UserIdMapper, Long>() {
					@Override
					public void accept(UserIdMapper userIdMapper, Long companyId) {
						userIdMapper.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<UserIdMapper, Long>() {
					@Override
					public Long apply(UserIdMapper userIdMapper) {
						return userIdMapper.getUserId();
					}
				},
				new BiConsumer<UserIdMapper, Long>() {
					@Override
					public void accept(UserIdMapper userIdMapper, Long userId) {
						userIdMapper.setUserId(userId);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<UserIdMapper, String>() {
					@Override
					public String apply(UserIdMapper userIdMapper) {
						return userIdMapper.getType();
					}
				},
				new BiConsumer<UserIdMapper, String>() {
					@Override
					public void accept(UserIdMapper userIdMapper, String type) {
						userIdMapper.setType(type);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<UserIdMapper, String>() {
					@Override
					public String apply(UserIdMapper userIdMapper) {
						return userIdMapper.getDescription();
					}
				},
				new BiConsumer<UserIdMapper, String>() {
					@Override
					public void accept(UserIdMapper userIdMapper,
						String description) {
						userIdMapper.setDescription(description);
					}
				});
		}
	}

	public static class ExternalUserIdAccessor extends ModelPropertyAccessor {
		public ExternalUserIdAccessor() {
			super(new Function<UserIdMapper, String>() {
					@Override
					public String apply(UserIdMapper userIdMapper) {
						return userIdMapper.getExternalUserId();
					}
				},
				new BiConsumer<UserIdMapper, String>() {
					@Override
					public void accept(UserIdMapper userIdMapper,
						String externalUserId) {
						userIdMapper.setExternalUserId(externalUserId);
					}
				});
		}
	}

	private UserIdMapperModelAccessors() {
	}
}