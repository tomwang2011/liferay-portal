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
import com.liferay.portal.kernel.model.LayoutSetPrototype;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LayoutSetPrototypeModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<LayoutSetPrototype, String>() {
					@Override
					public String apply(LayoutSetPrototype layoutSetPrototype) {
						return layoutSetPrototype.getUuid();
					}
				},
				new BiConsumer<LayoutSetPrototype, String>() {
					@Override
					public void accept(LayoutSetPrototype layoutSetPrototype,
						String uuid) {
						layoutSetPrototype.setUuid(uuid);
					}
				});
		}
	}

	public static class LayoutSetPrototypeIdAccessor
		extends ModelPropertyAccessor {
		public LayoutSetPrototypeIdAccessor() {
			super(new Function<LayoutSetPrototype, Long>() {
					@Override
					public Long apply(LayoutSetPrototype layoutSetPrototype) {
						return layoutSetPrototype.getLayoutSetPrototypeId();
					}
				},
				new BiConsumer<LayoutSetPrototype, Long>() {
					@Override
					public void accept(LayoutSetPrototype layoutSetPrototype,
						Long layoutSetPrototypeId) {
						layoutSetPrototype.setLayoutSetPrototypeId(layoutSetPrototypeId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<LayoutSetPrototype, Long>() {
					@Override
					public Long apply(LayoutSetPrototype layoutSetPrototype) {
						return layoutSetPrototype.getCompanyId();
					}
				},
				new BiConsumer<LayoutSetPrototype, Long>() {
					@Override
					public void accept(LayoutSetPrototype layoutSetPrototype,
						Long companyId) {
						layoutSetPrototype.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<LayoutSetPrototype, Long>() {
					@Override
					public Long apply(LayoutSetPrototype layoutSetPrototype) {
						return layoutSetPrototype.getUserId();
					}
				},
				new BiConsumer<LayoutSetPrototype, Long>() {
					@Override
					public void accept(LayoutSetPrototype layoutSetPrototype,
						Long userId) {
						layoutSetPrototype.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<LayoutSetPrototype, String>() {
					@Override
					public String apply(LayoutSetPrototype layoutSetPrototype) {
						return layoutSetPrototype.getUserName();
					}
				},
				new BiConsumer<LayoutSetPrototype, String>() {
					@Override
					public void accept(LayoutSetPrototype layoutSetPrototype,
						String userName) {
						layoutSetPrototype.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<LayoutSetPrototype, Date>() {
					@Override
					public Date apply(LayoutSetPrototype layoutSetPrototype) {
						return layoutSetPrototype.getCreateDate();
					}
				},
				new BiConsumer<LayoutSetPrototype, Date>() {
					@Override
					public void accept(LayoutSetPrototype layoutSetPrototype,
						Date createDate) {
						layoutSetPrototype.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<LayoutSetPrototype, Date>() {
					@Override
					public Date apply(LayoutSetPrototype layoutSetPrototype) {
						return layoutSetPrototype.getModifiedDate();
					}
				},
				new BiConsumer<LayoutSetPrototype, Date>() {
					@Override
					public void accept(LayoutSetPrototype layoutSetPrototype,
						Date modifiedDate) {
						layoutSetPrototype.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<LayoutSetPrototype, String>() {
					@Override
					public String apply(LayoutSetPrototype layoutSetPrototype) {
						return layoutSetPrototype.getName();
					}
				},
				new BiConsumer<LayoutSetPrototype, String>() {
					@Override
					public void accept(LayoutSetPrototype layoutSetPrototype,
						String name) {
						layoutSetPrototype.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<LayoutSetPrototype, String>() {
					@Override
					public String apply(LayoutSetPrototype layoutSetPrototype) {
						return layoutSetPrototype.getDescription();
					}
				},
				new BiConsumer<LayoutSetPrototype, String>() {
					@Override
					public void accept(LayoutSetPrototype layoutSetPrototype,
						String description) {
						layoutSetPrototype.setDescription(description);
					}
				});
		}
	}

	public static class SettingsAccessor extends ModelPropertyAccessor {
		public SettingsAccessor() {
			super(new Function<LayoutSetPrototype, String>() {
					@Override
					public String apply(LayoutSetPrototype layoutSetPrototype) {
						return layoutSetPrototype.getSettings();
					}
				},
				new BiConsumer<LayoutSetPrototype, String>() {
					@Override
					public void accept(LayoutSetPrototype layoutSetPrototype,
						String settings) {
						layoutSetPrototype.setSettings(settings);
					}
				});
		}
	}

	public static class ActiveAccessor extends ModelPropertyAccessor {
		public ActiveAccessor() {
			super(new Function<LayoutSetPrototype, Boolean>() {
					@Override
					public Boolean apply(LayoutSetPrototype layoutSetPrototype) {
						return layoutSetPrototype.getActive();
					}
				},
				new BiConsumer<LayoutSetPrototype, Boolean>() {
					@Override
					public void accept(LayoutSetPrototype layoutSetPrototype,
						Boolean active) {
						layoutSetPrototype.setActive(active);
					}
				});
		}
	}

	private LayoutSetPrototypeModelAccessors() {
	}
}