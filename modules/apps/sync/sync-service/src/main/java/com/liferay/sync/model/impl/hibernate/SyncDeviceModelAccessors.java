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

package com.liferay.sync.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.sync.model.SyncDevice;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SyncDeviceModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<SyncDevice, String>() {
					@Override
					public String apply(SyncDevice syncDevice) {
						return syncDevice.getUuid();
					}
				},
				new BiConsumer<SyncDevice, String>() {
					@Override
					public void accept(SyncDevice syncDevice, String uuid) {
						syncDevice.setUuid(uuid);
					}
				});
		}
	}

	public static class SyncDeviceIdAccessor extends ModelPropertyAccessor {
		public SyncDeviceIdAccessor() {
			super(new Function<SyncDevice, Long>() {
					@Override
					public Long apply(SyncDevice syncDevice) {
						return syncDevice.getSyncDeviceId();
					}
				},
				new BiConsumer<SyncDevice, Long>() {
					@Override
					public void accept(SyncDevice syncDevice, Long syncDeviceId) {
						syncDevice.setSyncDeviceId(syncDeviceId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<SyncDevice, Long>() {
					@Override
					public Long apply(SyncDevice syncDevice) {
						return syncDevice.getCompanyId();
					}
				},
				new BiConsumer<SyncDevice, Long>() {
					@Override
					public void accept(SyncDevice syncDevice, Long companyId) {
						syncDevice.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<SyncDevice, Long>() {
					@Override
					public Long apply(SyncDevice syncDevice) {
						return syncDevice.getUserId();
					}
				},
				new BiConsumer<SyncDevice, Long>() {
					@Override
					public void accept(SyncDevice syncDevice, Long userId) {
						syncDevice.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<SyncDevice, String>() {
					@Override
					public String apply(SyncDevice syncDevice) {
						return syncDevice.getUserName();
					}
				},
				new BiConsumer<SyncDevice, String>() {
					@Override
					public void accept(SyncDevice syncDevice, String userName) {
						syncDevice.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<SyncDevice, Date>() {
					@Override
					public Date apply(SyncDevice syncDevice) {
						return syncDevice.getCreateDate();
					}
				},
				new BiConsumer<SyncDevice, Date>() {
					@Override
					public void accept(SyncDevice syncDevice, Date createDate) {
						syncDevice.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<SyncDevice, Date>() {
					@Override
					public Date apply(SyncDevice syncDevice) {
						return syncDevice.getModifiedDate();
					}
				},
				new BiConsumer<SyncDevice, Date>() {
					@Override
					public void accept(SyncDevice syncDevice, Date modifiedDate) {
						syncDevice.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<SyncDevice, String>() {
					@Override
					public String apply(SyncDevice syncDevice) {
						return syncDevice.getType();
					}
				},
				new BiConsumer<SyncDevice, String>() {
					@Override
					public void accept(SyncDevice syncDevice, String type) {
						syncDevice.setType(type);
					}
				});
		}
	}

	public static class BuildNumberAccessor extends ModelPropertyAccessor {
		public BuildNumberAccessor() {
			super(new Function<SyncDevice, Long>() {
					@Override
					public Long apply(SyncDevice syncDevice) {
						return syncDevice.getBuildNumber();
					}
				},
				new BiConsumer<SyncDevice, Long>() {
					@Override
					public void accept(SyncDevice syncDevice, Long buildNumber) {
						syncDevice.setBuildNumber(buildNumber);
					}
				});
		}
	}

	public static class FeatureSetAccessor extends ModelPropertyAccessor {
		public FeatureSetAccessor() {
			super(new Function<SyncDevice, Integer>() {
					@Override
					public Integer apply(SyncDevice syncDevice) {
						return syncDevice.getFeatureSet();
					}
				},
				new BiConsumer<SyncDevice, Integer>() {
					@Override
					public void accept(SyncDevice syncDevice, Integer featureSet) {
						syncDevice.setFeatureSet(featureSet);
					}
				});
		}
	}

	public static class HostnameAccessor extends ModelPropertyAccessor {
		public HostnameAccessor() {
			super(new Function<SyncDevice, String>() {
					@Override
					public String apply(SyncDevice syncDevice) {
						return syncDevice.getHostname();
					}
				},
				new BiConsumer<SyncDevice, String>() {
					@Override
					public void accept(SyncDevice syncDevice, String hostname) {
						syncDevice.setHostname(hostname);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<SyncDevice, Integer>() {
					@Override
					public Integer apply(SyncDevice syncDevice) {
						return syncDevice.getStatus();
					}
				},
				new BiConsumer<SyncDevice, Integer>() {
					@Override
					public void accept(SyncDevice syncDevice, Integer status) {
						syncDevice.setStatus(status);
					}
				});
		}
	}

	private SyncDeviceModelAccessors() {
	}
}