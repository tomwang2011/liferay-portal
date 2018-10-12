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
import com.liferay.portal.kernel.model.LayoutPrototype;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LayoutPrototypeModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<LayoutPrototype, String>() {
					@Override
					public String apply(LayoutPrototype layoutPrototype) {
						return layoutPrototype.getUuid();
					}
				},
				new BiConsumer<LayoutPrototype, String>() {
					@Override
					public void accept(LayoutPrototype layoutPrototype,
						String uuid) {
						layoutPrototype.setUuid(uuid);
					}
				});
		}
	}

	public static class LayoutPrototypeIdAccessor extends ModelPropertyAccessor {
		public LayoutPrototypeIdAccessor() {
			super(new Function<LayoutPrototype, Long>() {
					@Override
					public Long apply(LayoutPrototype layoutPrototype) {
						return layoutPrototype.getLayoutPrototypeId();
					}
				},
				new BiConsumer<LayoutPrototype, Long>() {
					@Override
					public void accept(LayoutPrototype layoutPrototype,
						Long layoutPrototypeId) {
						layoutPrototype.setLayoutPrototypeId(layoutPrototypeId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<LayoutPrototype, Long>() {
					@Override
					public Long apply(LayoutPrototype layoutPrototype) {
						return layoutPrototype.getCompanyId();
					}
				},
				new BiConsumer<LayoutPrototype, Long>() {
					@Override
					public void accept(LayoutPrototype layoutPrototype,
						Long companyId) {
						layoutPrototype.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<LayoutPrototype, Long>() {
					@Override
					public Long apply(LayoutPrototype layoutPrototype) {
						return layoutPrototype.getUserId();
					}
				},
				new BiConsumer<LayoutPrototype, Long>() {
					@Override
					public void accept(LayoutPrototype layoutPrototype,
						Long userId) {
						layoutPrototype.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<LayoutPrototype, String>() {
					@Override
					public String apply(LayoutPrototype layoutPrototype) {
						return layoutPrototype.getUserName();
					}
				},
				new BiConsumer<LayoutPrototype, String>() {
					@Override
					public void accept(LayoutPrototype layoutPrototype,
						String userName) {
						layoutPrototype.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<LayoutPrototype, Date>() {
					@Override
					public Date apply(LayoutPrototype layoutPrototype) {
						return layoutPrototype.getCreateDate();
					}
				},
				new BiConsumer<LayoutPrototype, Date>() {
					@Override
					public void accept(LayoutPrototype layoutPrototype,
						Date createDate) {
						layoutPrototype.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<LayoutPrototype, Date>() {
					@Override
					public Date apply(LayoutPrototype layoutPrototype) {
						return layoutPrototype.getModifiedDate();
					}
				},
				new BiConsumer<LayoutPrototype, Date>() {
					@Override
					public void accept(LayoutPrototype layoutPrototype,
						Date modifiedDate) {
						layoutPrototype.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<LayoutPrototype, String>() {
					@Override
					public String apply(LayoutPrototype layoutPrototype) {
						return layoutPrototype.getName();
					}
				},
				new BiConsumer<LayoutPrototype, String>() {
					@Override
					public void accept(LayoutPrototype layoutPrototype,
						String name) {
						layoutPrototype.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<LayoutPrototype, String>() {
					@Override
					public String apply(LayoutPrototype layoutPrototype) {
						return layoutPrototype.getDescription();
					}
				},
				new BiConsumer<LayoutPrototype, String>() {
					@Override
					public void accept(LayoutPrototype layoutPrototype,
						String description) {
						layoutPrototype.setDescription(description);
					}
				});
		}
	}

	public static class SettingsAccessor extends ModelPropertyAccessor {
		public SettingsAccessor() {
			super(new Function<LayoutPrototype, String>() {
					@Override
					public String apply(LayoutPrototype layoutPrototype) {
						return layoutPrototype.getSettings();
					}
				},
				new BiConsumer<LayoutPrototype, String>() {
					@Override
					public void accept(LayoutPrototype layoutPrototype,
						String settings) {
						layoutPrototype.setSettings(settings);
					}
				});
		}
	}

	public static class ActiveAccessor extends ModelPropertyAccessor {
		public ActiveAccessor() {
			super(new Function<LayoutPrototype, Boolean>() {
					@Override
					public Boolean apply(LayoutPrototype layoutPrototype) {
						return layoutPrototype.getActive();
					}
				},
				new BiConsumer<LayoutPrototype, Boolean>() {
					@Override
					public void accept(LayoutPrototype layoutPrototype,
						Boolean active) {
						layoutPrototype.setActive(active);
					}
				});
		}
	}

	private LayoutPrototypeModelAccessors() {
	}
}