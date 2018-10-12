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
import com.liferay.portal.workflow.kaleo.model.KaleoTimer;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoTimerModelAccessors {
	public static class KaleoTimerIdAccessor extends ModelPropertyAccessor {
		public KaleoTimerIdAccessor() {
			super(new Function<KaleoTimer, Long>() {
					@Override
					public Long apply(KaleoTimer kaleoTimer) {
						return kaleoTimer.getKaleoTimerId();
					}
				},
				new BiConsumer<KaleoTimer, Long>() {
					@Override
					public void accept(KaleoTimer kaleoTimer, Long kaleoTimerId) {
						kaleoTimer.setKaleoTimerId(kaleoTimerId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoTimer, Long>() {
					@Override
					public Long apply(KaleoTimer kaleoTimer) {
						return kaleoTimer.getGroupId();
					}
				},
				new BiConsumer<KaleoTimer, Long>() {
					@Override
					public void accept(KaleoTimer kaleoTimer, Long groupId) {
						kaleoTimer.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoTimer, Long>() {
					@Override
					public Long apply(KaleoTimer kaleoTimer) {
						return kaleoTimer.getCompanyId();
					}
				},
				new BiConsumer<KaleoTimer, Long>() {
					@Override
					public void accept(KaleoTimer kaleoTimer, Long companyId) {
						kaleoTimer.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoTimer, Long>() {
					@Override
					public Long apply(KaleoTimer kaleoTimer) {
						return kaleoTimer.getUserId();
					}
				},
				new BiConsumer<KaleoTimer, Long>() {
					@Override
					public void accept(KaleoTimer kaleoTimer, Long userId) {
						kaleoTimer.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoTimer, String>() {
					@Override
					public String apply(KaleoTimer kaleoTimer) {
						return kaleoTimer.getUserName();
					}
				},
				new BiConsumer<KaleoTimer, String>() {
					@Override
					public void accept(KaleoTimer kaleoTimer, String userName) {
						kaleoTimer.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoTimer, Date>() {
					@Override
					public Date apply(KaleoTimer kaleoTimer) {
						return kaleoTimer.getCreateDate();
					}
				},
				new BiConsumer<KaleoTimer, Date>() {
					@Override
					public void accept(KaleoTimer kaleoTimer, Date createDate) {
						kaleoTimer.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoTimer, Date>() {
					@Override
					public Date apply(KaleoTimer kaleoTimer) {
						return kaleoTimer.getModifiedDate();
					}
				},
				new BiConsumer<KaleoTimer, Date>() {
					@Override
					public void accept(KaleoTimer kaleoTimer, Date modifiedDate) {
						kaleoTimer.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class KaleoClassNameAccessor extends ModelPropertyAccessor {
		public KaleoClassNameAccessor() {
			super(new Function<KaleoTimer, String>() {
					@Override
					public String apply(KaleoTimer kaleoTimer) {
						return kaleoTimer.getKaleoClassName();
					}
				},
				new BiConsumer<KaleoTimer, String>() {
					@Override
					public void accept(KaleoTimer kaleoTimer,
						String kaleoClassName) {
						kaleoTimer.setKaleoClassName(kaleoClassName);
					}
				});
		}
	}

	public static class KaleoClassPKAccessor extends ModelPropertyAccessor {
		public KaleoClassPKAccessor() {
			super(new Function<KaleoTimer, Long>() {
					@Override
					public Long apply(KaleoTimer kaleoTimer) {
						return kaleoTimer.getKaleoClassPK();
					}
				},
				new BiConsumer<KaleoTimer, Long>() {
					@Override
					public void accept(KaleoTimer kaleoTimer, Long kaleoClassPK) {
						kaleoTimer.setKaleoClassPK(kaleoClassPK);
					}
				});
		}
	}

	public static class KaleoDefinitionVersionIdAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionIdAccessor() {
			super(new Function<KaleoTimer, Long>() {
					@Override
					public Long apply(KaleoTimer kaleoTimer) {
						return kaleoTimer.getKaleoDefinitionVersionId();
					}
				},
				new BiConsumer<KaleoTimer, Long>() {
					@Override
					public void accept(KaleoTimer kaleoTimer,
						Long kaleoDefinitionVersionId) {
						kaleoTimer.setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<KaleoTimer, String>() {
					@Override
					public String apply(KaleoTimer kaleoTimer) {
						return kaleoTimer.getName();
					}
				},
				new BiConsumer<KaleoTimer, String>() {
					@Override
					public void accept(KaleoTimer kaleoTimer, String name) {
						kaleoTimer.setName(name);
					}
				});
		}
	}

	public static class BlockingAccessor extends ModelPropertyAccessor {
		public BlockingAccessor() {
			super(new Function<KaleoTimer, Boolean>() {
					@Override
					public Boolean apply(KaleoTimer kaleoTimer) {
						return kaleoTimer.getBlocking();
					}
				},
				new BiConsumer<KaleoTimer, Boolean>() {
					@Override
					public void accept(KaleoTimer kaleoTimer, Boolean blocking) {
						kaleoTimer.setBlocking(blocking);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<KaleoTimer, String>() {
					@Override
					public String apply(KaleoTimer kaleoTimer) {
						return kaleoTimer.getDescription();
					}
				},
				new BiConsumer<KaleoTimer, String>() {
					@Override
					public void accept(KaleoTimer kaleoTimer, String description) {
						kaleoTimer.setDescription(description);
					}
				});
		}
	}

	public static class DurationAccessor extends ModelPropertyAccessor {
		public DurationAccessor() {
			super(new Function<KaleoTimer, Double>() {
					@Override
					public Double apply(KaleoTimer kaleoTimer) {
						return kaleoTimer.getDuration();
					}
				},
				new BiConsumer<KaleoTimer, Double>() {
					@Override
					public void accept(KaleoTimer kaleoTimer, Double duration) {
						kaleoTimer.setDuration(duration);
					}
				});
		}
	}

	public static class ScaleAccessor extends ModelPropertyAccessor {
		public ScaleAccessor() {
			super(new Function<KaleoTimer, String>() {
					@Override
					public String apply(KaleoTimer kaleoTimer) {
						return kaleoTimer.getScale();
					}
				},
				new BiConsumer<KaleoTimer, String>() {
					@Override
					public void accept(KaleoTimer kaleoTimer, String scale) {
						kaleoTimer.setScale(scale);
					}
				});
		}
	}

	public static class RecurrenceDurationAccessor extends ModelPropertyAccessor {
		public RecurrenceDurationAccessor() {
			super(new Function<KaleoTimer, Double>() {
					@Override
					public Double apply(KaleoTimer kaleoTimer) {
						return kaleoTimer.getRecurrenceDuration();
					}
				},
				new BiConsumer<KaleoTimer, Double>() {
					@Override
					public void accept(KaleoTimer kaleoTimer,
						Double recurrenceDuration) {
						kaleoTimer.setRecurrenceDuration(recurrenceDuration);
					}
				});
		}
	}

	public static class RecurrenceScaleAccessor extends ModelPropertyAccessor {
		public RecurrenceScaleAccessor() {
			super(new Function<KaleoTimer, String>() {
					@Override
					public String apply(KaleoTimer kaleoTimer) {
						return kaleoTimer.getRecurrenceScale();
					}
				},
				new BiConsumer<KaleoTimer, String>() {
					@Override
					public void accept(KaleoTimer kaleoTimer,
						String recurrenceScale) {
						kaleoTimer.setRecurrenceScale(recurrenceScale);
					}
				});
		}
	}

	private KaleoTimerModelAccessors() {
	}
}