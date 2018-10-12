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

package com.liferay.portal.workflow.kaleo.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;
import com.liferay.portal.workflow.kaleo.model.KaleoTaskFormInstance;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoTaskFormInstanceModelAccessors {
	public static class KaleoTaskFormInstanceIdAccessor
		extends ModelPropertyAccessor {
		public KaleoTaskFormInstanceIdAccessor() {
			super(new Function<KaleoTaskFormInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskFormInstance kaleoTaskFormInstance) {
						return kaleoTaskFormInstance.getKaleoTaskFormInstanceId();
					}
				},
				new BiConsumer<KaleoTaskFormInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskFormInstance kaleoTaskFormInstance,
						Long kaleoTaskFormInstanceId) {
						kaleoTaskFormInstance.setKaleoTaskFormInstanceId(kaleoTaskFormInstanceId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoTaskFormInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskFormInstance kaleoTaskFormInstance) {
						return kaleoTaskFormInstance.getGroupId();
					}
				},
				new BiConsumer<KaleoTaskFormInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskFormInstance kaleoTaskFormInstance,
						Long groupId) {
						kaleoTaskFormInstance.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoTaskFormInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskFormInstance kaleoTaskFormInstance) {
						return kaleoTaskFormInstance.getCompanyId();
					}
				},
				new BiConsumer<KaleoTaskFormInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskFormInstance kaleoTaskFormInstance,
						Long companyId) {
						kaleoTaskFormInstance.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoTaskFormInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskFormInstance kaleoTaskFormInstance) {
						return kaleoTaskFormInstance.getUserId();
					}
				},
				new BiConsumer<KaleoTaskFormInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskFormInstance kaleoTaskFormInstance, Long userId) {
						kaleoTaskFormInstance.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoTaskFormInstance, String>() {
					@Override
					public String apply(
						KaleoTaskFormInstance kaleoTaskFormInstance) {
						return kaleoTaskFormInstance.getUserName();
					}
				},
				new BiConsumer<KaleoTaskFormInstance, String>() {
					@Override
					public void accept(
						KaleoTaskFormInstance kaleoTaskFormInstance,
						String userName) {
						kaleoTaskFormInstance.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoTaskFormInstance, Date>() {
					@Override
					public Date apply(
						KaleoTaskFormInstance kaleoTaskFormInstance) {
						return kaleoTaskFormInstance.getCreateDate();
					}
				},
				new BiConsumer<KaleoTaskFormInstance, Date>() {
					@Override
					public void accept(
						KaleoTaskFormInstance kaleoTaskFormInstance,
						Date createDate) {
						kaleoTaskFormInstance.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoTaskFormInstance, Date>() {
					@Override
					public Date apply(
						KaleoTaskFormInstance kaleoTaskFormInstance) {
						return kaleoTaskFormInstance.getModifiedDate();
					}
				},
				new BiConsumer<KaleoTaskFormInstance, Date>() {
					@Override
					public void accept(
						KaleoTaskFormInstance kaleoTaskFormInstance,
						Date modifiedDate) {
						kaleoTaskFormInstance.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class KaleoDefinitionVersionIdAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionIdAccessor() {
			super(new Function<KaleoTaskFormInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskFormInstance kaleoTaskFormInstance) {
						return kaleoTaskFormInstance.getKaleoDefinitionVersionId();
					}
				},
				new BiConsumer<KaleoTaskFormInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskFormInstance kaleoTaskFormInstance,
						Long kaleoDefinitionVersionId) {
						kaleoTaskFormInstance.setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
					}
				});
		}
	}

	public static class KaleoInstanceIdAccessor extends ModelPropertyAccessor {
		public KaleoInstanceIdAccessor() {
			super(new Function<KaleoTaskFormInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskFormInstance kaleoTaskFormInstance) {
						return kaleoTaskFormInstance.getKaleoInstanceId();
					}
				},
				new BiConsumer<KaleoTaskFormInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskFormInstance kaleoTaskFormInstance,
						Long kaleoInstanceId) {
						kaleoTaskFormInstance.setKaleoInstanceId(kaleoInstanceId);
					}
				});
		}
	}

	public static class KaleoTaskIdAccessor extends ModelPropertyAccessor {
		public KaleoTaskIdAccessor() {
			super(new Function<KaleoTaskFormInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskFormInstance kaleoTaskFormInstance) {
						return kaleoTaskFormInstance.getKaleoTaskId();
					}
				},
				new BiConsumer<KaleoTaskFormInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskFormInstance kaleoTaskFormInstance,
						Long kaleoTaskId) {
						kaleoTaskFormInstance.setKaleoTaskId(kaleoTaskId);
					}
				});
		}
	}

	public static class KaleoTaskInstanceTokenIdAccessor
		extends ModelPropertyAccessor {
		public KaleoTaskInstanceTokenIdAccessor() {
			super(new Function<KaleoTaskFormInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskFormInstance kaleoTaskFormInstance) {
						return kaleoTaskFormInstance.getKaleoTaskInstanceTokenId();
					}
				},
				new BiConsumer<KaleoTaskFormInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskFormInstance kaleoTaskFormInstance,
						Long kaleoTaskInstanceTokenId) {
						kaleoTaskFormInstance.setKaleoTaskInstanceTokenId(kaleoTaskInstanceTokenId);
					}
				});
		}
	}

	public static class KaleoTaskFormIdAccessor extends ModelPropertyAccessor {
		public KaleoTaskFormIdAccessor() {
			super(new Function<KaleoTaskFormInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskFormInstance kaleoTaskFormInstance) {
						return kaleoTaskFormInstance.getKaleoTaskFormId();
					}
				},
				new BiConsumer<KaleoTaskFormInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskFormInstance kaleoTaskFormInstance,
						Long kaleoTaskFormId) {
						kaleoTaskFormInstance.setKaleoTaskFormId(kaleoTaskFormId);
					}
				});
		}
	}

	public static class FormValuesAccessor extends ModelPropertyAccessor {
		public FormValuesAccessor() {
			super(new Function<KaleoTaskFormInstance, String>() {
					@Override
					public String apply(
						KaleoTaskFormInstance kaleoTaskFormInstance) {
						return kaleoTaskFormInstance.getFormValues();
					}
				},
				new BiConsumer<KaleoTaskFormInstance, String>() {
					@Override
					public void accept(
						KaleoTaskFormInstance kaleoTaskFormInstance,
						String formValues) {
						kaleoTaskFormInstance.setFormValues(formValues);
					}
				});
		}
	}

	public static class FormValueEntryGroupIdAccessor
		extends ModelPropertyAccessor {
		public FormValueEntryGroupIdAccessor() {
			super(new Function<KaleoTaskFormInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskFormInstance kaleoTaskFormInstance) {
						return kaleoTaskFormInstance.getFormValueEntryGroupId();
					}
				},
				new BiConsumer<KaleoTaskFormInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskFormInstance kaleoTaskFormInstance,
						Long formValueEntryGroupId) {
						kaleoTaskFormInstance.setFormValueEntryGroupId(formValueEntryGroupId);
					}
				});
		}
	}

	public static class FormValueEntryIdAccessor extends ModelPropertyAccessor {
		public FormValueEntryIdAccessor() {
			super(new Function<KaleoTaskFormInstance, Long>() {
					@Override
					public Long apply(
						KaleoTaskFormInstance kaleoTaskFormInstance) {
						return kaleoTaskFormInstance.getFormValueEntryId();
					}
				},
				new BiConsumer<KaleoTaskFormInstance, Long>() {
					@Override
					public void accept(
						KaleoTaskFormInstance kaleoTaskFormInstance,
						Long formValueEntryId) {
						kaleoTaskFormInstance.setFormValueEntryId(formValueEntryId);
					}
				});
		}
	}

	public static class FormValueEntryUuidAccessor extends ModelPropertyAccessor {
		public FormValueEntryUuidAccessor() {
			super(new Function<KaleoTaskFormInstance, String>() {
					@Override
					public String apply(
						KaleoTaskFormInstance kaleoTaskFormInstance) {
						return kaleoTaskFormInstance.getFormValueEntryUuid();
					}
				},
				new BiConsumer<KaleoTaskFormInstance, String>() {
					@Override
					public void accept(
						KaleoTaskFormInstance kaleoTaskFormInstance,
						String formValueEntryUuid) {
						kaleoTaskFormInstance.setFormValueEntryUuid(formValueEntryUuid);
					}
				});
		}
	}

	public static class MetadataAccessor extends ModelPropertyAccessor {
		public MetadataAccessor() {
			super(new Function<KaleoTaskFormInstance, String>() {
					@Override
					public String apply(
						KaleoTaskFormInstance kaleoTaskFormInstance) {
						return kaleoTaskFormInstance.getMetadata();
					}
				},
				new BiConsumer<KaleoTaskFormInstance, String>() {
					@Override
					public void accept(
						KaleoTaskFormInstance kaleoTaskFormInstance,
						String metadata) {
						kaleoTaskFormInstance.setMetadata(metadata);
					}
				});
		}
	}

	private KaleoTaskFormInstanceModelAccessors() {
	}
}