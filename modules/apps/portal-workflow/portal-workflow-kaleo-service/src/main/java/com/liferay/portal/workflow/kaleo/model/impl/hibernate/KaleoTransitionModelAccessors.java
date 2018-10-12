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
import com.liferay.portal.workflow.kaleo.model.KaleoTransition;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoTransitionModelAccessors {
	public static class KaleoTransitionIdAccessor extends ModelPropertyAccessor {
		public KaleoTransitionIdAccessor() {
			super(new Function<KaleoTransition, Long>() {
					@Override
					public Long apply(KaleoTransition kaleoTransition) {
						return kaleoTransition.getKaleoTransitionId();
					}
				},
				new BiConsumer<KaleoTransition, Long>() {
					@Override
					public void accept(KaleoTransition kaleoTransition,
						Long kaleoTransitionId) {
						kaleoTransition.setKaleoTransitionId(kaleoTransitionId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoTransition, Long>() {
					@Override
					public Long apply(KaleoTransition kaleoTransition) {
						return kaleoTransition.getGroupId();
					}
				},
				new BiConsumer<KaleoTransition, Long>() {
					@Override
					public void accept(KaleoTransition kaleoTransition,
						Long groupId) {
						kaleoTransition.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoTransition, Long>() {
					@Override
					public Long apply(KaleoTransition kaleoTransition) {
						return kaleoTransition.getCompanyId();
					}
				},
				new BiConsumer<KaleoTransition, Long>() {
					@Override
					public void accept(KaleoTransition kaleoTransition,
						Long companyId) {
						kaleoTransition.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoTransition, Long>() {
					@Override
					public Long apply(KaleoTransition kaleoTransition) {
						return kaleoTransition.getUserId();
					}
				},
				new BiConsumer<KaleoTransition, Long>() {
					@Override
					public void accept(KaleoTransition kaleoTransition,
						Long userId) {
						kaleoTransition.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoTransition, String>() {
					@Override
					public String apply(KaleoTransition kaleoTransition) {
						return kaleoTransition.getUserName();
					}
				},
				new BiConsumer<KaleoTransition, String>() {
					@Override
					public void accept(KaleoTransition kaleoTransition,
						String userName) {
						kaleoTransition.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoTransition, Date>() {
					@Override
					public Date apply(KaleoTransition kaleoTransition) {
						return kaleoTransition.getCreateDate();
					}
				},
				new BiConsumer<KaleoTransition, Date>() {
					@Override
					public void accept(KaleoTransition kaleoTransition,
						Date createDate) {
						kaleoTransition.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoTransition, Date>() {
					@Override
					public Date apply(KaleoTransition kaleoTransition) {
						return kaleoTransition.getModifiedDate();
					}
				},
				new BiConsumer<KaleoTransition, Date>() {
					@Override
					public void accept(KaleoTransition kaleoTransition,
						Date modifiedDate) {
						kaleoTransition.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class KaleoDefinitionVersionIdAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionIdAccessor() {
			super(new Function<KaleoTransition, Long>() {
					@Override
					public Long apply(KaleoTransition kaleoTransition) {
						return kaleoTransition.getKaleoDefinitionVersionId();
					}
				},
				new BiConsumer<KaleoTransition, Long>() {
					@Override
					public void accept(KaleoTransition kaleoTransition,
						Long kaleoDefinitionVersionId) {
						kaleoTransition.setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
					}
				});
		}
	}

	public static class KaleoNodeIdAccessor extends ModelPropertyAccessor {
		public KaleoNodeIdAccessor() {
			super(new Function<KaleoTransition, Long>() {
					@Override
					public Long apply(KaleoTransition kaleoTransition) {
						return kaleoTransition.getKaleoNodeId();
					}
				},
				new BiConsumer<KaleoTransition, Long>() {
					@Override
					public void accept(KaleoTransition kaleoTransition,
						Long kaleoNodeId) {
						kaleoTransition.setKaleoNodeId(kaleoNodeId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<KaleoTransition, String>() {
					@Override
					public String apply(KaleoTransition kaleoTransition) {
						return kaleoTransition.getName();
					}
				},
				new BiConsumer<KaleoTransition, String>() {
					@Override
					public void accept(KaleoTransition kaleoTransition,
						String name) {
						kaleoTransition.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<KaleoTransition, String>() {
					@Override
					public String apply(KaleoTransition kaleoTransition) {
						return kaleoTransition.getDescription();
					}
				},
				new BiConsumer<KaleoTransition, String>() {
					@Override
					public void accept(KaleoTransition kaleoTransition,
						String description) {
						kaleoTransition.setDescription(description);
					}
				});
		}
	}

	public static class SourceKaleoNodeIdAccessor extends ModelPropertyAccessor {
		public SourceKaleoNodeIdAccessor() {
			super(new Function<KaleoTransition, Long>() {
					@Override
					public Long apply(KaleoTransition kaleoTransition) {
						return kaleoTransition.getSourceKaleoNodeId();
					}
				},
				new BiConsumer<KaleoTransition, Long>() {
					@Override
					public void accept(KaleoTransition kaleoTransition,
						Long sourceKaleoNodeId) {
						kaleoTransition.setSourceKaleoNodeId(sourceKaleoNodeId);
					}
				});
		}
	}

	public static class SourceKaleoNodeNameAccessor
		extends ModelPropertyAccessor {
		public SourceKaleoNodeNameAccessor() {
			super(new Function<KaleoTransition, String>() {
					@Override
					public String apply(KaleoTransition kaleoTransition) {
						return kaleoTransition.getSourceKaleoNodeName();
					}
				},
				new BiConsumer<KaleoTransition, String>() {
					@Override
					public void accept(KaleoTransition kaleoTransition,
						String sourceKaleoNodeName) {
						kaleoTransition.setSourceKaleoNodeName(sourceKaleoNodeName);
					}
				});
		}
	}

	public static class TargetKaleoNodeIdAccessor extends ModelPropertyAccessor {
		public TargetKaleoNodeIdAccessor() {
			super(new Function<KaleoTransition, Long>() {
					@Override
					public Long apply(KaleoTransition kaleoTransition) {
						return kaleoTransition.getTargetKaleoNodeId();
					}
				},
				new BiConsumer<KaleoTransition, Long>() {
					@Override
					public void accept(KaleoTransition kaleoTransition,
						Long targetKaleoNodeId) {
						kaleoTransition.setTargetKaleoNodeId(targetKaleoNodeId);
					}
				});
		}
	}

	public static class TargetKaleoNodeNameAccessor
		extends ModelPropertyAccessor {
		public TargetKaleoNodeNameAccessor() {
			super(new Function<KaleoTransition, String>() {
					@Override
					public String apply(KaleoTransition kaleoTransition) {
						return kaleoTransition.getTargetKaleoNodeName();
					}
				},
				new BiConsumer<KaleoTransition, String>() {
					@Override
					public void accept(KaleoTransition kaleoTransition,
						String targetKaleoNodeName) {
						kaleoTransition.setTargetKaleoNodeName(targetKaleoNodeName);
					}
				});
		}
	}

	public static class DefaultTransitionAccessor extends ModelPropertyAccessor {
		public DefaultTransitionAccessor() {
			super(new Function<KaleoTransition, Boolean>() {
					@Override
					public Boolean apply(KaleoTransition kaleoTransition) {
						return kaleoTransition.getDefaultTransition();
					}
				},
				new BiConsumer<KaleoTransition, Boolean>() {
					@Override
					public void accept(KaleoTransition kaleoTransition,
						Boolean defaultTransition) {
						kaleoTransition.setDefaultTransition(defaultTransition);
					}
				});
		}
	}

	private KaleoTransitionModelAccessors() {
	}
}