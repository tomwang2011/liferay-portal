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
import com.liferay.portal.kernel.model.PortletItem;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PortletItemModelAccessors {
	public static class PortletItemIdAccessor extends ModelPropertyAccessor {
		public PortletItemIdAccessor() {
			super(new Function<PortletItem, Long>() {
					@Override
					public Long apply(PortletItem portletItem) {
						return portletItem.getPortletItemId();
					}
				},
				new BiConsumer<PortletItem, Long>() {
					@Override
					public void accept(PortletItem portletItem,
						Long portletItemId) {
						portletItem.setPortletItemId(portletItemId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<PortletItem, Long>() {
					@Override
					public Long apply(PortletItem portletItem) {
						return portletItem.getGroupId();
					}
				},
				new BiConsumer<PortletItem, Long>() {
					@Override
					public void accept(PortletItem portletItem, Long groupId) {
						portletItem.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<PortletItem, Long>() {
					@Override
					public Long apply(PortletItem portletItem) {
						return portletItem.getCompanyId();
					}
				},
				new BiConsumer<PortletItem, Long>() {
					@Override
					public void accept(PortletItem portletItem, Long companyId) {
						portletItem.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<PortletItem, Long>() {
					@Override
					public Long apply(PortletItem portletItem) {
						return portletItem.getUserId();
					}
				},
				new BiConsumer<PortletItem, Long>() {
					@Override
					public void accept(PortletItem portletItem, Long userId) {
						portletItem.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<PortletItem, String>() {
					@Override
					public String apply(PortletItem portletItem) {
						return portletItem.getUserName();
					}
				},
				new BiConsumer<PortletItem, String>() {
					@Override
					public void accept(PortletItem portletItem, String userName) {
						portletItem.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<PortletItem, Date>() {
					@Override
					public Date apply(PortletItem portletItem) {
						return portletItem.getCreateDate();
					}
				},
				new BiConsumer<PortletItem, Date>() {
					@Override
					public void accept(PortletItem portletItem, Date createDate) {
						portletItem.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<PortletItem, Date>() {
					@Override
					public Date apply(PortletItem portletItem) {
						return portletItem.getModifiedDate();
					}
				},
				new BiConsumer<PortletItem, Date>() {
					@Override
					public void accept(PortletItem portletItem,
						Date modifiedDate) {
						portletItem.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<PortletItem, String>() {
					@Override
					public String apply(PortletItem portletItem) {
						return portletItem.getName();
					}
				},
				new BiConsumer<PortletItem, String>() {
					@Override
					public void accept(PortletItem portletItem, String name) {
						portletItem.setName(name);
					}
				});
		}
	}

	public static class PortletIdAccessor extends ModelPropertyAccessor {
		public PortletIdAccessor() {
			super(new Function<PortletItem, String>() {
					@Override
					public String apply(PortletItem portletItem) {
						return portletItem.getPortletId();
					}
				},
				new BiConsumer<PortletItem, String>() {
					@Override
					public void accept(PortletItem portletItem, String portletId) {
						portletItem.setPortletId(portletId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<PortletItem, Long>() {
					@Override
					public Long apply(PortletItem portletItem) {
						return portletItem.getClassNameId();
					}
				},
				new BiConsumer<PortletItem, Long>() {
					@Override
					public void accept(PortletItem portletItem, Long classNameId) {
						portletItem.setClassNameId(classNameId);
					}
				});
		}
	}

	private PortletItemModelAccessors() {
	}
}