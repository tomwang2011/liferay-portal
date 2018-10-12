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
import com.liferay.portal.kernel.model.PasswordPolicyRel;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PasswordPolicyRelModelAccessors {
	public static class PasswordPolicyRelIdAccessor
		extends ModelPropertyAccessor {
		public PasswordPolicyRelIdAccessor() {
			super(new Function<PasswordPolicyRel, Long>() {
					@Override
					public Long apply(PasswordPolicyRel passwordPolicyRel) {
						return passwordPolicyRel.getPasswordPolicyRelId();
					}
				},
				new BiConsumer<PasswordPolicyRel, Long>() {
					@Override
					public void accept(PasswordPolicyRel passwordPolicyRel,
						Long passwordPolicyRelId) {
						passwordPolicyRel.setPasswordPolicyRelId(passwordPolicyRelId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<PasswordPolicyRel, Long>() {
					@Override
					public Long apply(PasswordPolicyRel passwordPolicyRel) {
						return passwordPolicyRel.getCompanyId();
					}
				},
				new BiConsumer<PasswordPolicyRel, Long>() {
					@Override
					public void accept(PasswordPolicyRel passwordPolicyRel,
						Long companyId) {
						passwordPolicyRel.setCompanyId(companyId);
					}
				});
		}
	}

	public static class PasswordPolicyIdAccessor extends ModelPropertyAccessor {
		public PasswordPolicyIdAccessor() {
			super(new Function<PasswordPolicyRel, Long>() {
					@Override
					public Long apply(PasswordPolicyRel passwordPolicyRel) {
						return passwordPolicyRel.getPasswordPolicyId();
					}
				},
				new BiConsumer<PasswordPolicyRel, Long>() {
					@Override
					public void accept(PasswordPolicyRel passwordPolicyRel,
						Long passwordPolicyId) {
						passwordPolicyRel.setPasswordPolicyId(passwordPolicyId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<PasswordPolicyRel, Long>() {
					@Override
					public Long apply(PasswordPolicyRel passwordPolicyRel) {
						return passwordPolicyRel.getClassNameId();
					}
				},
				new BiConsumer<PasswordPolicyRel, Long>() {
					@Override
					public void accept(PasswordPolicyRel passwordPolicyRel,
						Long classNameId) {
						passwordPolicyRel.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<PasswordPolicyRel, Long>() {
					@Override
					public Long apply(PasswordPolicyRel passwordPolicyRel) {
						return passwordPolicyRel.getClassPK();
					}
				},
				new BiConsumer<PasswordPolicyRel, Long>() {
					@Override
					public void accept(PasswordPolicyRel passwordPolicyRel,
						Long classPK) {
						passwordPolicyRel.setClassPK(classPK);
					}
				});
		}
	}

	private PasswordPolicyRelModelAccessors() {
	}
}