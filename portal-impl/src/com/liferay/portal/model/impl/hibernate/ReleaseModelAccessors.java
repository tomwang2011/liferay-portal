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
import com.liferay.portal.kernel.model.Release;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ReleaseModelAccessors {
	public static class ReleaseIdAccessor extends ModelPropertyAccessor {
		public ReleaseIdAccessor() {
			super(new Function<Release, Long>() {
					@Override
					public Long apply(Release release) {
						return release.getReleaseId();
					}
				},
				new BiConsumer<Release, Long>() {
					@Override
					public void accept(Release release, Long releaseId) {
						release.setReleaseId(releaseId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Release, Date>() {
					@Override
					public Date apply(Release release) {
						return release.getCreateDate();
					}
				},
				new BiConsumer<Release, Date>() {
					@Override
					public void accept(Release release, Date createDate) {
						release.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<Release, Date>() {
					@Override
					public Date apply(Release release) {
						return release.getModifiedDate();
					}
				},
				new BiConsumer<Release, Date>() {
					@Override
					public void accept(Release release, Date modifiedDate) {
						release.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ServletContextNameAccessor extends ModelPropertyAccessor {
		public ServletContextNameAccessor() {
			super(new Function<Release, String>() {
					@Override
					public String apply(Release release) {
						return release.getServletContextName();
					}
				},
				new BiConsumer<Release, String>() {
					@Override
					public void accept(Release release,
						String servletContextName) {
						release.setServletContextName(servletContextName);
					}
				});
		}
	}

	public static class SchemaVersionAccessor extends ModelPropertyAccessor {
		public SchemaVersionAccessor() {
			super(new Function<Release, String>() {
					@Override
					public String apply(Release release) {
						return release.getSchemaVersion();
					}
				},
				new BiConsumer<Release, String>() {
					@Override
					public void accept(Release release, String schemaVersion) {
						release.setSchemaVersion(schemaVersion);
					}
				});
		}
	}

	public static class BuildNumberAccessor extends ModelPropertyAccessor {
		public BuildNumberAccessor() {
			super(new Function<Release, Integer>() {
					@Override
					public Integer apply(Release release) {
						return release.getBuildNumber();
					}
				},
				new BiConsumer<Release, Integer>() {
					@Override
					public void accept(Release release, Integer buildNumber) {
						release.setBuildNumber(buildNumber);
					}
				});
		}
	}

	public static class BuildDateAccessor extends ModelPropertyAccessor {
		public BuildDateAccessor() {
			super(new Function<Release, Date>() {
					@Override
					public Date apply(Release release) {
						return release.getBuildDate();
					}
				},
				new BiConsumer<Release, Date>() {
					@Override
					public void accept(Release release, Date buildDate) {
						release.setBuildDate(buildDate);
					}
				});
		}
	}

	public static class VerifiedAccessor extends ModelPropertyAccessor {
		public VerifiedAccessor() {
			super(new Function<Release, Boolean>() {
					@Override
					public Boolean apply(Release release) {
						return release.getVerified();
					}
				},
				new BiConsumer<Release, Boolean>() {
					@Override
					public void accept(Release release, Boolean verified) {
						release.setVerified(verified);
					}
				});
		}
	}

	public static class StateAccessor extends ModelPropertyAccessor {
		public StateAccessor() {
			super(new Function<Release, Integer>() {
					@Override
					public Integer apply(Release release) {
						return release.getState();
					}
				},
				new BiConsumer<Release, Integer>() {
					@Override
					public void accept(Release release, Integer state) {
						release.setState(state);
					}
				});
		}
	}

	public static class TestStringAccessor extends ModelPropertyAccessor {
		public TestStringAccessor() {
			super(new Function<Release, String>() {
					@Override
					public String apply(Release release) {
						return release.getTestString();
					}
				},
				new BiConsumer<Release, String>() {
					@Override
					public void accept(Release release, String testString) {
						release.setTestString(testString);
					}
				});
		}
	}

	private ReleaseModelAccessors() {
	}
}