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

package com.liferay.dynamic.data.mapping.model.impl.hibernate;

import com.liferay.dynamic.data.mapping.model.DDMTemplateLink;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DDMTemplateLinkModelAccessors {
	public static class TemplateLinkIdAccessor extends ModelPropertyAccessor {
		public TemplateLinkIdAccessor() {
			super(new Function<DDMTemplateLink, Long>() {
					@Override
					public Long apply(DDMTemplateLink ddmTemplateLink) {
						return ddmTemplateLink.getTemplateLinkId();
					}
				},
				new BiConsumer<DDMTemplateLink, Long>() {
					@Override
					public void accept(DDMTemplateLink ddmTemplateLink,
						Long templateLinkId) {
						ddmTemplateLink.setTemplateLinkId(templateLinkId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<DDMTemplateLink, Long>() {
					@Override
					public Long apply(DDMTemplateLink ddmTemplateLink) {
						return ddmTemplateLink.getCompanyId();
					}
				},
				new BiConsumer<DDMTemplateLink, Long>() {
					@Override
					public void accept(DDMTemplateLink ddmTemplateLink,
						Long companyId) {
						ddmTemplateLink.setCompanyId(companyId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<DDMTemplateLink, Long>() {
					@Override
					public Long apply(DDMTemplateLink ddmTemplateLink) {
						return ddmTemplateLink.getClassNameId();
					}
				},
				new BiConsumer<DDMTemplateLink, Long>() {
					@Override
					public void accept(DDMTemplateLink ddmTemplateLink,
						Long classNameId) {
						ddmTemplateLink.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<DDMTemplateLink, Long>() {
					@Override
					public Long apply(DDMTemplateLink ddmTemplateLink) {
						return ddmTemplateLink.getClassPK();
					}
				},
				new BiConsumer<DDMTemplateLink, Long>() {
					@Override
					public void accept(DDMTemplateLink ddmTemplateLink,
						Long classPK) {
						ddmTemplateLink.setClassPK(classPK);
					}
				});
		}
	}

	public static class TemplateIdAccessor extends ModelPropertyAccessor {
		public TemplateIdAccessor() {
			super(new Function<DDMTemplateLink, Long>() {
					@Override
					public Long apply(DDMTemplateLink ddmTemplateLink) {
						return ddmTemplateLink.getTemplateId();
					}
				},
				new BiConsumer<DDMTemplateLink, Long>() {
					@Override
					public void accept(DDMTemplateLink ddmTemplateLink,
						Long templateId) {
						ddmTemplateLink.setTemplateId(templateId);
					}
				});
		}
	}

	private DDMTemplateLinkModelAccessors() {
	}
}