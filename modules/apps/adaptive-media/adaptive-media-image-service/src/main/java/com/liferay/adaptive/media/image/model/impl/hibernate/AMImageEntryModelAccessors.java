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

package com.liferay.adaptive.media.image.model.impl.hibernate;

import com.liferay.adaptive.media.image.model.AMImageEntry;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AMImageEntryModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<AMImageEntry, String>() {
					@Override
					public String apply(AMImageEntry amImageEntry) {
						return amImageEntry.getUuid();
					}
				},
				new BiConsumer<AMImageEntry, String>() {
					@Override
					public void accept(AMImageEntry amImageEntry, String uuid) {
						amImageEntry.setUuid(uuid);
					}
				});
		}
	}

	public static class AmImageEntryIdAccessor extends ModelPropertyAccessor {
		public AmImageEntryIdAccessor() {
			super(new Function<AMImageEntry, Long>() {
					@Override
					public Long apply(AMImageEntry amImageEntry) {
						return amImageEntry.getAmImageEntryId();
					}
				},
				new BiConsumer<AMImageEntry, Long>() {
					@Override
					public void accept(AMImageEntry amImageEntry,
						Long amImageEntryId) {
						amImageEntry.setAmImageEntryId(amImageEntryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<AMImageEntry, Long>() {
					@Override
					public Long apply(AMImageEntry amImageEntry) {
						return amImageEntry.getGroupId();
					}
				},
				new BiConsumer<AMImageEntry, Long>() {
					@Override
					public void accept(AMImageEntry amImageEntry, Long groupId) {
						amImageEntry.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<AMImageEntry, Long>() {
					@Override
					public Long apply(AMImageEntry amImageEntry) {
						return amImageEntry.getCompanyId();
					}
				},
				new BiConsumer<AMImageEntry, Long>() {
					@Override
					public void accept(AMImageEntry amImageEntry, Long companyId) {
						amImageEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<AMImageEntry, Date>() {
					@Override
					public Date apply(AMImageEntry amImageEntry) {
						return amImageEntry.getCreateDate();
					}
				},
				new BiConsumer<AMImageEntry, Date>() {
					@Override
					public void accept(AMImageEntry amImageEntry,
						Date createDate) {
						amImageEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ConfigurationUuidAccessor extends ModelPropertyAccessor {
		public ConfigurationUuidAccessor() {
			super(new Function<AMImageEntry, String>() {
					@Override
					public String apply(AMImageEntry amImageEntry) {
						return amImageEntry.getConfigurationUuid();
					}
				},
				new BiConsumer<AMImageEntry, String>() {
					@Override
					public void accept(AMImageEntry amImageEntry,
						String configurationUuid) {
						amImageEntry.setConfigurationUuid(configurationUuid);
					}
				});
		}
	}

	public static class FileVersionIdAccessor extends ModelPropertyAccessor {
		public FileVersionIdAccessor() {
			super(new Function<AMImageEntry, Long>() {
					@Override
					public Long apply(AMImageEntry amImageEntry) {
						return amImageEntry.getFileVersionId();
					}
				},
				new BiConsumer<AMImageEntry, Long>() {
					@Override
					public void accept(AMImageEntry amImageEntry,
						Long fileVersionId) {
						amImageEntry.setFileVersionId(fileVersionId);
					}
				});
		}
	}

	public static class MimeTypeAccessor extends ModelPropertyAccessor {
		public MimeTypeAccessor() {
			super(new Function<AMImageEntry, String>() {
					@Override
					public String apply(AMImageEntry amImageEntry) {
						return amImageEntry.getMimeType();
					}
				},
				new BiConsumer<AMImageEntry, String>() {
					@Override
					public void accept(AMImageEntry amImageEntry,
						String mimeType) {
						amImageEntry.setMimeType(mimeType);
					}
				});
		}
	}

	public static class HeightAccessor extends ModelPropertyAccessor {
		public HeightAccessor() {
			super(new Function<AMImageEntry, Integer>() {
					@Override
					public Integer apply(AMImageEntry amImageEntry) {
						return amImageEntry.getHeight();
					}
				},
				new BiConsumer<AMImageEntry, Integer>() {
					@Override
					public void accept(AMImageEntry amImageEntry, Integer height) {
						amImageEntry.setHeight(height);
					}
				});
		}
	}

	public static class WidthAccessor extends ModelPropertyAccessor {
		public WidthAccessor() {
			super(new Function<AMImageEntry, Integer>() {
					@Override
					public Integer apply(AMImageEntry amImageEntry) {
						return amImageEntry.getWidth();
					}
				},
				new BiConsumer<AMImageEntry, Integer>() {
					@Override
					public void accept(AMImageEntry amImageEntry, Integer width) {
						amImageEntry.setWidth(width);
					}
				});
		}
	}

	public static class SizeAccessor extends ModelPropertyAccessor {
		public SizeAccessor() {
			super(new Function<AMImageEntry, Long>() {
					@Override
					public Long apply(AMImageEntry amImageEntry) {
						return amImageEntry.getSize();
					}
				},
				new BiConsumer<AMImageEntry, Long>() {
					@Override
					public void accept(AMImageEntry amImageEntry, Long size) {
						amImageEntry.setSize(size);
					}
				});
		}
	}

	private AMImageEntryModelAccessors() {
	}
}