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

package com.liferay.portlet.social.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.social.kernel.model.SocialRelation;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SocialRelationModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<SocialRelation, String>() {
					@Override
					public String apply(SocialRelation socialRelation) {
						return socialRelation.getUuid();
					}
				},
				new BiConsumer<SocialRelation, String>() {
					@Override
					public void accept(SocialRelation socialRelation,
						String uuid) {
						socialRelation.setUuid(uuid);
					}
				});
		}
	}

	public static class RelationIdAccessor extends ModelPropertyAccessor {
		public RelationIdAccessor() {
			super(new Function<SocialRelation, Long>() {
					@Override
					public Long apply(SocialRelation socialRelation) {
						return socialRelation.getRelationId();
					}
				},
				new BiConsumer<SocialRelation, Long>() {
					@Override
					public void accept(SocialRelation socialRelation,
						Long relationId) {
						socialRelation.setRelationId(relationId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<SocialRelation, Long>() {
					@Override
					public Long apply(SocialRelation socialRelation) {
						return socialRelation.getCompanyId();
					}
				},
				new BiConsumer<SocialRelation, Long>() {
					@Override
					public void accept(SocialRelation socialRelation,
						Long companyId) {
						socialRelation.setCompanyId(companyId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<SocialRelation, Long>() {
					@Override
					public Long apply(SocialRelation socialRelation) {
						return socialRelation.getCreateDate();
					}
				},
				new BiConsumer<SocialRelation, Long>() {
					@Override
					public void accept(SocialRelation socialRelation,
						Long createDate) {
						socialRelation.setCreateDate(createDate);
					}
				});
		}
	}

	public static class UserId1Accessor extends ModelPropertyAccessor {
		public UserId1Accessor() {
			super(new Function<SocialRelation, Long>() {
					@Override
					public Long apply(SocialRelation socialRelation) {
						return socialRelation.getUserId1();
					}
				},
				new BiConsumer<SocialRelation, Long>() {
					@Override
					public void accept(SocialRelation socialRelation,
						Long userId1) {
						socialRelation.setUserId1(userId1);
					}
				});
		}
	}

	public static class UserId2Accessor extends ModelPropertyAccessor {
		public UserId2Accessor() {
			super(new Function<SocialRelation, Long>() {
					@Override
					public Long apply(SocialRelation socialRelation) {
						return socialRelation.getUserId2();
					}
				},
				new BiConsumer<SocialRelation, Long>() {
					@Override
					public void accept(SocialRelation socialRelation,
						Long userId2) {
						socialRelation.setUserId2(userId2);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<SocialRelation, Integer>() {
					@Override
					public Integer apply(SocialRelation socialRelation) {
						return socialRelation.getType();
					}
				},
				new BiConsumer<SocialRelation, Integer>() {
					@Override
					public void accept(SocialRelation socialRelation,
						Integer type) {
						socialRelation.setType(type);
					}
				});
		}
	}

	private SocialRelationModelAccessors() {
	}
}