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
import com.liferay.portal.workflow.kaleo.model.KaleoTaskForm;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoTaskFormModelAccessors {
	public static class KaleoTaskFormIdAccessor extends ModelPropertyAccessor {
		public KaleoTaskFormIdAccessor() {
			super(new Function<KaleoTaskForm, Long>() {
					@Override
					public Long apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getKaleoTaskFormId();
					}
				},
				new BiConsumer<KaleoTaskForm, Long>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm,
						Long kaleoTaskFormId) {
						kaleoTaskForm.setKaleoTaskFormId(kaleoTaskFormId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoTaskForm, Long>() {
					@Override
					public Long apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getGroupId();
					}
				},
				new BiConsumer<KaleoTaskForm, Long>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm, Long groupId) {
						kaleoTaskForm.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoTaskForm, Long>() {
					@Override
					public Long apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getCompanyId();
					}
				},
				new BiConsumer<KaleoTaskForm, Long>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm,
						Long companyId) {
						kaleoTaskForm.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoTaskForm, Long>() {
					@Override
					public Long apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getUserId();
					}
				},
				new BiConsumer<KaleoTaskForm, Long>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm, Long userId) {
						kaleoTaskForm.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoTaskForm, String>() {
					@Override
					public String apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getUserName();
					}
				},
				new BiConsumer<KaleoTaskForm, String>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm,
						String userName) {
						kaleoTaskForm.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoTaskForm, Date>() {
					@Override
					public Date apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getCreateDate();
					}
				},
				new BiConsumer<KaleoTaskForm, Date>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm,
						Date createDate) {
						kaleoTaskForm.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoTaskForm, Date>() {
					@Override
					public Date apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getModifiedDate();
					}
				},
				new BiConsumer<KaleoTaskForm, Date>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm,
						Date modifiedDate) {
						kaleoTaskForm.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class KaleoDefinitionVersionIdAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionIdAccessor() {
			super(new Function<KaleoTaskForm, Long>() {
					@Override
					public Long apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getKaleoDefinitionVersionId();
					}
				},
				new BiConsumer<KaleoTaskForm, Long>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm,
						Long kaleoDefinitionVersionId) {
						kaleoTaskForm.setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
					}
				});
		}
	}

	public static class KaleoNodeIdAccessor extends ModelPropertyAccessor {
		public KaleoNodeIdAccessor() {
			super(new Function<KaleoTaskForm, Long>() {
					@Override
					public Long apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getKaleoNodeId();
					}
				},
				new BiConsumer<KaleoTaskForm, Long>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm,
						Long kaleoNodeId) {
						kaleoTaskForm.setKaleoNodeId(kaleoNodeId);
					}
				});
		}
	}

	public static class KaleoTaskIdAccessor extends ModelPropertyAccessor {
		public KaleoTaskIdAccessor() {
			super(new Function<KaleoTaskForm, Long>() {
					@Override
					public Long apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getKaleoTaskId();
					}
				},
				new BiConsumer<KaleoTaskForm, Long>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm,
						Long kaleoTaskId) {
						kaleoTaskForm.setKaleoTaskId(kaleoTaskId);
					}
				});
		}
	}

	public static class KaleoTaskNameAccessor extends ModelPropertyAccessor {
		public KaleoTaskNameAccessor() {
			super(new Function<KaleoTaskForm, String>() {
					@Override
					public String apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getKaleoTaskName();
					}
				},
				new BiConsumer<KaleoTaskForm, String>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm,
						String kaleoTaskName) {
						kaleoTaskForm.setKaleoTaskName(kaleoTaskName);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<KaleoTaskForm, String>() {
					@Override
					public String apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getName();
					}
				},
				new BiConsumer<KaleoTaskForm, String>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm, String name) {
						kaleoTaskForm.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<KaleoTaskForm, String>() {
					@Override
					public String apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getDescription();
					}
				},
				new BiConsumer<KaleoTaskForm, String>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm,
						String description) {
						kaleoTaskForm.setDescription(description);
					}
				});
		}
	}

	public static class FormCompanyIdAccessor extends ModelPropertyAccessor {
		public FormCompanyIdAccessor() {
			super(new Function<KaleoTaskForm, Long>() {
					@Override
					public Long apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getFormCompanyId();
					}
				},
				new BiConsumer<KaleoTaskForm, Long>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm,
						Long formCompanyId) {
						kaleoTaskForm.setFormCompanyId(formCompanyId);
					}
				});
		}
	}

	public static class FormDefinitionAccessor extends ModelPropertyAccessor {
		public FormDefinitionAccessor() {
			super(new Function<KaleoTaskForm, String>() {
					@Override
					public String apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getFormDefinition();
					}
				},
				new BiConsumer<KaleoTaskForm, String>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm,
						String formDefinition) {
						kaleoTaskForm.setFormDefinition(formDefinition);
					}
				});
		}
	}

	public static class FormGroupIdAccessor extends ModelPropertyAccessor {
		public FormGroupIdAccessor() {
			super(new Function<KaleoTaskForm, Long>() {
					@Override
					public Long apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getFormGroupId();
					}
				},
				new BiConsumer<KaleoTaskForm, Long>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm,
						Long formGroupId) {
						kaleoTaskForm.setFormGroupId(formGroupId);
					}
				});
		}
	}

	public static class FormIdAccessor extends ModelPropertyAccessor {
		public FormIdAccessor() {
			super(new Function<KaleoTaskForm, Long>() {
					@Override
					public Long apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getFormId();
					}
				},
				new BiConsumer<KaleoTaskForm, Long>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm, Long formId) {
						kaleoTaskForm.setFormId(formId);
					}
				});
		}
	}

	public static class FormUuidAccessor extends ModelPropertyAccessor {
		public FormUuidAccessor() {
			super(new Function<KaleoTaskForm, String>() {
					@Override
					public String apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getFormUuid();
					}
				},
				new BiConsumer<KaleoTaskForm, String>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm,
						String formUuid) {
						kaleoTaskForm.setFormUuid(formUuid);
					}
				});
		}
	}

	public static class MetadataAccessor extends ModelPropertyAccessor {
		public MetadataAccessor() {
			super(new Function<KaleoTaskForm, String>() {
					@Override
					public String apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getMetadata();
					}
				},
				new BiConsumer<KaleoTaskForm, String>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm,
						String metadata) {
						kaleoTaskForm.setMetadata(metadata);
					}
				});
		}
	}

	public static class PriorityAccessor extends ModelPropertyAccessor {
		public PriorityAccessor() {
			super(new Function<KaleoTaskForm, Integer>() {
					@Override
					public Integer apply(KaleoTaskForm kaleoTaskForm) {
						return kaleoTaskForm.getPriority();
					}
				},
				new BiConsumer<KaleoTaskForm, Integer>() {
					@Override
					public void accept(KaleoTaskForm kaleoTaskForm,
						Integer priority) {
						kaleoTaskForm.setPriority(priority);
					}
				});
		}
	}

	private KaleoTaskFormModelAccessors() {
	}
}