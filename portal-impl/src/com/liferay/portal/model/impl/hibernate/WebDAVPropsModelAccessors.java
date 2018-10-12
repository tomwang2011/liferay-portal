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
import com.liferay.portal.kernel.model.WebDAVProps;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WebDAVPropsModelAccessors {
	public static class WebDavPropsIdAccessor extends ModelPropertyAccessor {
		public WebDavPropsIdAccessor() {
			super(new Function<WebDAVProps, Long>() {
					@Override
					public Long apply(WebDAVProps webDAVProps) {
						return webDAVProps.getWebDavPropsId();
					}
				},
				new BiConsumer<WebDAVProps, Long>() {
					@Override
					public void accept(WebDAVProps webDAVProps,
						Long webDavPropsId) {
						webDAVProps.setWebDavPropsId(webDavPropsId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<WebDAVProps, Long>() {
					@Override
					public Long apply(WebDAVProps webDAVProps) {
						return webDAVProps.getCompanyId();
					}
				},
				new BiConsumer<WebDAVProps, Long>() {
					@Override
					public void accept(WebDAVProps webDAVProps, Long companyId) {
						webDAVProps.setCompanyId(companyId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<WebDAVProps, Date>() {
					@Override
					public Date apply(WebDAVProps webDAVProps) {
						return webDAVProps.getCreateDate();
					}
				},
				new BiConsumer<WebDAVProps, Date>() {
					@Override
					public void accept(WebDAVProps webDAVProps, Date createDate) {
						webDAVProps.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<WebDAVProps, Date>() {
					@Override
					public Date apply(WebDAVProps webDAVProps) {
						return webDAVProps.getModifiedDate();
					}
				},
				new BiConsumer<WebDAVProps, Date>() {
					@Override
					public void accept(WebDAVProps webDAVProps,
						Date modifiedDate) {
						webDAVProps.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<WebDAVProps, Long>() {
					@Override
					public Long apply(WebDAVProps webDAVProps) {
						return webDAVProps.getClassNameId();
					}
				},
				new BiConsumer<WebDAVProps, Long>() {
					@Override
					public void accept(WebDAVProps webDAVProps, Long classNameId) {
						webDAVProps.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<WebDAVProps, Long>() {
					@Override
					public Long apply(WebDAVProps webDAVProps) {
						return webDAVProps.getClassPK();
					}
				},
				new BiConsumer<WebDAVProps, Long>() {
					@Override
					public void accept(WebDAVProps webDAVProps, Long classPK) {
						webDAVProps.setClassPK(classPK);
					}
				});
		}
	}

	public static class PropsAccessor extends ModelPropertyAccessor {
		public PropsAccessor() {
			super(new Function<WebDAVProps, String>() {
					@Override
					public String apply(WebDAVProps webDAVProps) {
						return webDAVProps.getProps();
					}
				},
				new BiConsumer<WebDAVProps, String>() {
					@Override
					public void accept(WebDAVProps webDAVProps, String props) {
						webDAVProps.setProps(props);
					}
				});
		}
	}

	private WebDAVPropsModelAccessors() {
	}
}