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

package com.liferay.portlet.social.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.social.kernel.model.SocialActivityCounter;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SocialActivityCounterModelAccessors {
	public static class ActivityCounterIdAccessor extends ModelPropertyAccessor {
		public ActivityCounterIdAccessor() {
			super(new Function<SocialActivityCounter, Long>() {
					@Override
					public Long apply(
						SocialActivityCounter socialActivityCounter) {
						return socialActivityCounter.getActivityCounterId();
					}
				},
				new BiConsumer<SocialActivityCounter, Long>() {
					@Override
					public void accept(
						SocialActivityCounter socialActivityCounter,
						Long activityCounterId) {
						socialActivityCounter.setActivityCounterId(activityCounterId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<SocialActivityCounter, Long>() {
					@Override
					public Long apply(
						SocialActivityCounter socialActivityCounter) {
						return socialActivityCounter.getGroupId();
					}
				},
				new BiConsumer<SocialActivityCounter, Long>() {
					@Override
					public void accept(
						SocialActivityCounter socialActivityCounter,
						Long groupId) {
						socialActivityCounter.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<SocialActivityCounter, Long>() {
					@Override
					public Long apply(
						SocialActivityCounter socialActivityCounter) {
						return socialActivityCounter.getCompanyId();
					}
				},
				new BiConsumer<SocialActivityCounter, Long>() {
					@Override
					public void accept(
						SocialActivityCounter socialActivityCounter,
						Long companyId) {
						socialActivityCounter.setCompanyId(companyId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<SocialActivityCounter, Long>() {
					@Override
					public Long apply(
						SocialActivityCounter socialActivityCounter) {
						return socialActivityCounter.getClassNameId();
					}
				},
				new BiConsumer<SocialActivityCounter, Long>() {
					@Override
					public void accept(
						SocialActivityCounter socialActivityCounter,
						Long classNameId) {
						socialActivityCounter.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<SocialActivityCounter, Long>() {
					@Override
					public Long apply(
						SocialActivityCounter socialActivityCounter) {
						return socialActivityCounter.getClassPK();
					}
				},
				new BiConsumer<SocialActivityCounter, Long>() {
					@Override
					public void accept(
						SocialActivityCounter socialActivityCounter,
						Long classPK) {
						socialActivityCounter.setClassPK(classPK);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<SocialActivityCounter, String>() {
					@Override
					public String apply(
						SocialActivityCounter socialActivityCounter) {
						return socialActivityCounter.getName();
					}
				},
				new BiConsumer<SocialActivityCounter, String>() {
					@Override
					public void accept(
						SocialActivityCounter socialActivityCounter, String name) {
						socialActivityCounter.setName(name);
					}
				});
		}
	}

	public static class OwnerTypeAccessor extends ModelPropertyAccessor {
		public OwnerTypeAccessor() {
			super(new Function<SocialActivityCounter, Integer>() {
					@Override
					public Integer apply(
						SocialActivityCounter socialActivityCounter) {
						return socialActivityCounter.getOwnerType();
					}
				},
				new BiConsumer<SocialActivityCounter, Integer>() {
					@Override
					public void accept(
						SocialActivityCounter socialActivityCounter,
						Integer ownerType) {
						socialActivityCounter.setOwnerType(ownerType);
					}
				});
		}
	}

	public static class CurrentValueAccessor extends ModelPropertyAccessor {
		public CurrentValueAccessor() {
			super(new Function<SocialActivityCounter, Integer>() {
					@Override
					public Integer apply(
						SocialActivityCounter socialActivityCounter) {
						return socialActivityCounter.getCurrentValue();
					}
				},
				new BiConsumer<SocialActivityCounter, Integer>() {
					@Override
					public void accept(
						SocialActivityCounter socialActivityCounter,
						Integer currentValue) {
						socialActivityCounter.setCurrentValue(currentValue);
					}
				});
		}
	}

	public static class TotalValueAccessor extends ModelPropertyAccessor {
		public TotalValueAccessor() {
			super(new Function<SocialActivityCounter, Integer>() {
					@Override
					public Integer apply(
						SocialActivityCounter socialActivityCounter) {
						return socialActivityCounter.getTotalValue();
					}
				},
				new BiConsumer<SocialActivityCounter, Integer>() {
					@Override
					public void accept(
						SocialActivityCounter socialActivityCounter,
						Integer totalValue) {
						socialActivityCounter.setTotalValue(totalValue);
					}
				});
		}
	}

	public static class GraceValueAccessor extends ModelPropertyAccessor {
		public GraceValueAccessor() {
			super(new Function<SocialActivityCounter, Integer>() {
					@Override
					public Integer apply(
						SocialActivityCounter socialActivityCounter) {
						return socialActivityCounter.getGraceValue();
					}
				},
				new BiConsumer<SocialActivityCounter, Integer>() {
					@Override
					public void accept(
						SocialActivityCounter socialActivityCounter,
						Integer graceValue) {
						socialActivityCounter.setGraceValue(graceValue);
					}
				});
		}
	}

	public static class StartPeriodAccessor extends ModelPropertyAccessor {
		public StartPeriodAccessor() {
			super(new Function<SocialActivityCounter, Integer>() {
					@Override
					public Integer apply(
						SocialActivityCounter socialActivityCounter) {
						return socialActivityCounter.getStartPeriod();
					}
				},
				new BiConsumer<SocialActivityCounter, Integer>() {
					@Override
					public void accept(
						SocialActivityCounter socialActivityCounter,
						Integer startPeriod) {
						socialActivityCounter.setStartPeriod(startPeriod);
					}
				});
		}
	}

	public static class EndPeriodAccessor extends ModelPropertyAccessor {
		public EndPeriodAccessor() {
			super(new Function<SocialActivityCounter, Integer>() {
					@Override
					public Integer apply(
						SocialActivityCounter socialActivityCounter) {
						return socialActivityCounter.getEndPeriod();
					}
				},
				new BiConsumer<SocialActivityCounter, Integer>() {
					@Override
					public void accept(
						SocialActivityCounter socialActivityCounter,
						Integer endPeriod) {
						socialActivityCounter.setEndPeriod(endPeriod);
					}
				});
		}
	}

	public static class ActiveAccessor extends ModelPropertyAccessor {
		public ActiveAccessor() {
			super(new Function<SocialActivityCounter, Boolean>() {
					@Override
					public Boolean apply(
						SocialActivityCounter socialActivityCounter) {
						return socialActivityCounter.getActive();
					}
				},
				new BiConsumer<SocialActivityCounter, Boolean>() {
					@Override
					public void accept(
						SocialActivityCounter socialActivityCounter,
						Boolean active) {
						socialActivityCounter.setActive(active);
					}
				});
		}
	}

	private SocialActivityCounterModelAccessors() {
	}
}