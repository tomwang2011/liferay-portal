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

package com.liferay.friendly.url.model.impl.hibernate;

import com.liferay.friendly.url.model.FriendlyURLEntryLocalization;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FriendlyURLEntryLocalizationModelAccessors {
	public static class FriendlyURLEntryLocalizationIdAccessor
		extends ModelPropertyAccessor {
		public FriendlyURLEntryLocalizationIdAccessor() {
			super(new Function<FriendlyURLEntryLocalization, Long>() {
					@Override
					public Long apply(
						FriendlyURLEntryLocalization friendlyURLEntryLocalization) {
						return friendlyURLEntryLocalization.getFriendlyURLEntryLocalizationId();
					}
				},
				new BiConsumer<FriendlyURLEntryLocalization, Long>() {
					@Override
					public void accept(
						FriendlyURLEntryLocalization friendlyURLEntryLocalization,
						Long friendlyURLEntryLocalizationId) {
						friendlyURLEntryLocalization.setFriendlyURLEntryLocalizationId(friendlyURLEntryLocalizationId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<FriendlyURLEntryLocalization, Long>() {
					@Override
					public Long apply(
						FriendlyURLEntryLocalization friendlyURLEntryLocalization) {
						return friendlyURLEntryLocalization.getCompanyId();
					}
				},
				new BiConsumer<FriendlyURLEntryLocalization, Long>() {
					@Override
					public void accept(
						FriendlyURLEntryLocalization friendlyURLEntryLocalization,
						Long companyId) {
						friendlyURLEntryLocalization.setCompanyId(companyId);
					}
				});
		}
	}

	public static class FriendlyURLEntryIdAccessor extends ModelPropertyAccessor {
		public FriendlyURLEntryIdAccessor() {
			super(new Function<FriendlyURLEntryLocalization, Long>() {
					@Override
					public Long apply(
						FriendlyURLEntryLocalization friendlyURLEntryLocalization) {
						return friendlyURLEntryLocalization.getFriendlyURLEntryId();
					}
				},
				new BiConsumer<FriendlyURLEntryLocalization, Long>() {
					@Override
					public void accept(
						FriendlyURLEntryLocalization friendlyURLEntryLocalization,
						Long friendlyURLEntryId) {
						friendlyURLEntryLocalization.setFriendlyURLEntryId(friendlyURLEntryId);
					}
				});
		}
	}

	public static class LanguageIdAccessor extends ModelPropertyAccessor {
		public LanguageIdAccessor() {
			super(new Function<FriendlyURLEntryLocalization, String>() {
					@Override
					public String apply(
						FriendlyURLEntryLocalization friendlyURLEntryLocalization) {
						return friendlyURLEntryLocalization.getLanguageId();
					}
				},
				new BiConsumer<FriendlyURLEntryLocalization, String>() {
					@Override
					public void accept(
						FriendlyURLEntryLocalization friendlyURLEntryLocalization,
						String languageId) {
						friendlyURLEntryLocalization.setLanguageId(languageId);
					}
				});
		}
	}

	public static class UrlTitleAccessor extends ModelPropertyAccessor {
		public UrlTitleAccessor() {
			super(new Function<FriendlyURLEntryLocalization, String>() {
					@Override
					public String apply(
						FriendlyURLEntryLocalization friendlyURLEntryLocalization) {
						return friendlyURLEntryLocalization.getUrlTitle();
					}
				},
				new BiConsumer<FriendlyURLEntryLocalization, String>() {
					@Override
					public void accept(
						FriendlyURLEntryLocalization friendlyURLEntryLocalization,
						String urlTitle) {
						friendlyURLEntryLocalization.setUrlTitle(urlTitle);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<FriendlyURLEntryLocalization, Long>() {
					@Override
					public Long apply(
						FriendlyURLEntryLocalization friendlyURLEntryLocalization) {
						return friendlyURLEntryLocalization.getGroupId();
					}
				},
				new BiConsumer<FriendlyURLEntryLocalization, Long>() {
					@Override
					public void accept(
						FriendlyURLEntryLocalization friendlyURLEntryLocalization,
						Long groupId) {
						friendlyURLEntryLocalization.setGroupId(groupId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<FriendlyURLEntryLocalization, Long>() {
					@Override
					public Long apply(
						FriendlyURLEntryLocalization friendlyURLEntryLocalization) {
						return friendlyURLEntryLocalization.getClassNameId();
					}
				},
				new BiConsumer<FriendlyURLEntryLocalization, Long>() {
					@Override
					public void accept(
						FriendlyURLEntryLocalization friendlyURLEntryLocalization,
						Long classNameId) {
						friendlyURLEntryLocalization.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<FriendlyURLEntryLocalization, Long>() {
					@Override
					public Long apply(
						FriendlyURLEntryLocalization friendlyURLEntryLocalization) {
						return friendlyURLEntryLocalization.getClassPK();
					}
				},
				new BiConsumer<FriendlyURLEntryLocalization, Long>() {
					@Override
					public void accept(
						FriendlyURLEntryLocalization friendlyURLEntryLocalization,
						Long classPK) {
						friendlyURLEntryLocalization.setClassPK(classPK);
					}
				});
		}
	}

	private FriendlyURLEntryLocalizationModelAccessors() {
	}
}