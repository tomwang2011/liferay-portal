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
import com.liferay.portal.kernel.model.Website;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WebsiteModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<Website, String>() {
					@Override
					public String apply(Website website) {
						return website.getUuid();
					}
				},
				new BiConsumer<Website, String>() {
					@Override
					public void accept(Website website, String uuid) {
						website.setUuid(uuid);
					}
				});
		}
	}

	public static class WebsiteIdAccessor extends ModelPropertyAccessor {
		public WebsiteIdAccessor() {
			super(new Function<Website, Long>() {
					@Override
					public Long apply(Website website) {
						return website.getWebsiteId();
					}
				},
				new BiConsumer<Website, Long>() {
					@Override
					public void accept(Website website, Long websiteId) {
						website.setWebsiteId(websiteId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Website, Long>() {
					@Override
					public Long apply(Website website) {
						return website.getCompanyId();
					}
				},
				new BiConsumer<Website, Long>() {
					@Override
					public void accept(Website website, Long companyId) {
						website.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<Website, Long>() {
					@Override
					public Long apply(Website website) {
						return website.getUserId();
					}
				},
				new BiConsumer<Website, Long>() {
					@Override
					public void accept(Website website, Long userId) {
						website.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<Website, String>() {
					@Override
					public String apply(Website website) {
						return website.getUserName();
					}
				},
				new BiConsumer<Website, String>() {
					@Override
					public void accept(Website website, String userName) {
						website.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Website, Date>() {
					@Override
					public Date apply(Website website) {
						return website.getCreateDate();
					}
				},
				new BiConsumer<Website, Date>() {
					@Override
					public void accept(Website website, Date createDate) {
						website.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<Website, Date>() {
					@Override
					public Date apply(Website website) {
						return website.getModifiedDate();
					}
				},
				new BiConsumer<Website, Date>() {
					@Override
					public void accept(Website website, Date modifiedDate) {
						website.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<Website, Long>() {
					@Override
					public Long apply(Website website) {
						return website.getClassNameId();
					}
				},
				new BiConsumer<Website, Long>() {
					@Override
					public void accept(Website website, Long classNameId) {
						website.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<Website, Long>() {
					@Override
					public Long apply(Website website) {
						return website.getClassPK();
					}
				},
				new BiConsumer<Website, Long>() {
					@Override
					public void accept(Website website, Long classPK) {
						website.setClassPK(classPK);
					}
				});
		}
	}

	public static class UrlAccessor extends ModelPropertyAccessor {
		public UrlAccessor() {
			super(new Function<Website, String>() {
					@Override
					public String apply(Website website) {
						return website.getUrl();
					}
				},
				new BiConsumer<Website, String>() {
					@Override
					public void accept(Website website, String url) {
						website.setUrl(url);
					}
				});
		}
	}

	public static class TypeIdAccessor extends ModelPropertyAccessor {
		public TypeIdAccessor() {
			super(new Function<Website, Long>() {
					@Override
					public Long apply(Website website) {
						return website.getTypeId();
					}
				},
				new BiConsumer<Website, Long>() {
					@Override
					public void accept(Website website, Long typeId) {
						website.setTypeId(typeId);
					}
				});
		}
	}

	public static class PrimaryAccessor extends ModelPropertyAccessor {
		public PrimaryAccessor() {
			super(new Function<Website, Boolean>() {
					@Override
					public Boolean apply(Website website) {
						return website.getPrimary();
					}
				},
				new BiConsumer<Website, Boolean>() {
					@Override
					public void accept(Website website, Boolean primary) {
						website.setPrimary(primary);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<Website, Date>() {
					@Override
					public Date apply(Website website) {
						return website.getLastPublishDate();
					}
				},
				new BiConsumer<Website, Date>() {
					@Override
					public void accept(Website website, Date lastPublishDate) {
						website.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private WebsiteModelAccessors() {
	}
}