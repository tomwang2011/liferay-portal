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
import com.liferay.portal.kernel.model.OrgLabor;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OrgLaborModelAccessors {
	public static class OrgLaborIdAccessor extends ModelPropertyAccessor {
		public OrgLaborIdAccessor() {
			super(new Function<OrgLabor, Long>() {
					@Override
					public Long apply(OrgLabor orgLabor) {
						return orgLabor.getOrgLaborId();
					}
				},
				new BiConsumer<OrgLabor, Long>() {
					@Override
					public void accept(OrgLabor orgLabor, Long orgLaborId) {
						orgLabor.setOrgLaborId(orgLaborId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<OrgLabor, Long>() {
					@Override
					public Long apply(OrgLabor orgLabor) {
						return orgLabor.getCompanyId();
					}
				},
				new BiConsumer<OrgLabor, Long>() {
					@Override
					public void accept(OrgLabor orgLabor, Long companyId) {
						orgLabor.setCompanyId(companyId);
					}
				});
		}
	}

	public static class OrganizationIdAccessor extends ModelPropertyAccessor {
		public OrganizationIdAccessor() {
			super(new Function<OrgLabor, Long>() {
					@Override
					public Long apply(OrgLabor orgLabor) {
						return orgLabor.getOrganizationId();
					}
				},
				new BiConsumer<OrgLabor, Long>() {
					@Override
					public void accept(OrgLabor orgLabor, Long organizationId) {
						orgLabor.setOrganizationId(organizationId);
					}
				});
		}
	}

	public static class TypeIdAccessor extends ModelPropertyAccessor {
		public TypeIdAccessor() {
			super(new Function<OrgLabor, Long>() {
					@Override
					public Long apply(OrgLabor orgLabor) {
						return orgLabor.getTypeId();
					}
				},
				new BiConsumer<OrgLabor, Long>() {
					@Override
					public void accept(OrgLabor orgLabor, Long typeId) {
						orgLabor.setTypeId(typeId);
					}
				});
		}
	}

	public static class SunOpenAccessor extends ModelPropertyAccessor {
		public SunOpenAccessor() {
			super(new Function<OrgLabor, Integer>() {
					@Override
					public Integer apply(OrgLabor orgLabor) {
						return orgLabor.getSunOpen();
					}
				},
				new BiConsumer<OrgLabor, Integer>() {
					@Override
					public void accept(OrgLabor orgLabor, Integer sunOpen) {
						orgLabor.setSunOpen(sunOpen);
					}
				});
		}
	}

	public static class SunCloseAccessor extends ModelPropertyAccessor {
		public SunCloseAccessor() {
			super(new Function<OrgLabor, Integer>() {
					@Override
					public Integer apply(OrgLabor orgLabor) {
						return orgLabor.getSunClose();
					}
				},
				new BiConsumer<OrgLabor, Integer>() {
					@Override
					public void accept(OrgLabor orgLabor, Integer sunClose) {
						orgLabor.setSunClose(sunClose);
					}
				});
		}
	}

	public static class MonOpenAccessor extends ModelPropertyAccessor {
		public MonOpenAccessor() {
			super(new Function<OrgLabor, Integer>() {
					@Override
					public Integer apply(OrgLabor orgLabor) {
						return orgLabor.getMonOpen();
					}
				},
				new BiConsumer<OrgLabor, Integer>() {
					@Override
					public void accept(OrgLabor orgLabor, Integer monOpen) {
						orgLabor.setMonOpen(monOpen);
					}
				});
		}
	}

	public static class MonCloseAccessor extends ModelPropertyAccessor {
		public MonCloseAccessor() {
			super(new Function<OrgLabor, Integer>() {
					@Override
					public Integer apply(OrgLabor orgLabor) {
						return orgLabor.getMonClose();
					}
				},
				new BiConsumer<OrgLabor, Integer>() {
					@Override
					public void accept(OrgLabor orgLabor, Integer monClose) {
						orgLabor.setMonClose(monClose);
					}
				});
		}
	}

	public static class TueOpenAccessor extends ModelPropertyAccessor {
		public TueOpenAccessor() {
			super(new Function<OrgLabor, Integer>() {
					@Override
					public Integer apply(OrgLabor orgLabor) {
						return orgLabor.getTueOpen();
					}
				},
				new BiConsumer<OrgLabor, Integer>() {
					@Override
					public void accept(OrgLabor orgLabor, Integer tueOpen) {
						orgLabor.setTueOpen(tueOpen);
					}
				});
		}
	}

	public static class TueCloseAccessor extends ModelPropertyAccessor {
		public TueCloseAccessor() {
			super(new Function<OrgLabor, Integer>() {
					@Override
					public Integer apply(OrgLabor orgLabor) {
						return orgLabor.getTueClose();
					}
				},
				new BiConsumer<OrgLabor, Integer>() {
					@Override
					public void accept(OrgLabor orgLabor, Integer tueClose) {
						orgLabor.setTueClose(tueClose);
					}
				});
		}
	}

	public static class WedOpenAccessor extends ModelPropertyAccessor {
		public WedOpenAccessor() {
			super(new Function<OrgLabor, Integer>() {
					@Override
					public Integer apply(OrgLabor orgLabor) {
						return orgLabor.getWedOpen();
					}
				},
				new BiConsumer<OrgLabor, Integer>() {
					@Override
					public void accept(OrgLabor orgLabor, Integer wedOpen) {
						orgLabor.setWedOpen(wedOpen);
					}
				});
		}
	}

	public static class WedCloseAccessor extends ModelPropertyAccessor {
		public WedCloseAccessor() {
			super(new Function<OrgLabor, Integer>() {
					@Override
					public Integer apply(OrgLabor orgLabor) {
						return orgLabor.getWedClose();
					}
				},
				new BiConsumer<OrgLabor, Integer>() {
					@Override
					public void accept(OrgLabor orgLabor, Integer wedClose) {
						orgLabor.setWedClose(wedClose);
					}
				});
		}
	}

	public static class ThuOpenAccessor extends ModelPropertyAccessor {
		public ThuOpenAccessor() {
			super(new Function<OrgLabor, Integer>() {
					@Override
					public Integer apply(OrgLabor orgLabor) {
						return orgLabor.getThuOpen();
					}
				},
				new BiConsumer<OrgLabor, Integer>() {
					@Override
					public void accept(OrgLabor orgLabor, Integer thuOpen) {
						orgLabor.setThuOpen(thuOpen);
					}
				});
		}
	}

	public static class ThuCloseAccessor extends ModelPropertyAccessor {
		public ThuCloseAccessor() {
			super(new Function<OrgLabor, Integer>() {
					@Override
					public Integer apply(OrgLabor orgLabor) {
						return orgLabor.getThuClose();
					}
				},
				new BiConsumer<OrgLabor, Integer>() {
					@Override
					public void accept(OrgLabor orgLabor, Integer thuClose) {
						orgLabor.setThuClose(thuClose);
					}
				});
		}
	}

	public static class FriOpenAccessor extends ModelPropertyAccessor {
		public FriOpenAccessor() {
			super(new Function<OrgLabor, Integer>() {
					@Override
					public Integer apply(OrgLabor orgLabor) {
						return orgLabor.getFriOpen();
					}
				},
				new BiConsumer<OrgLabor, Integer>() {
					@Override
					public void accept(OrgLabor orgLabor, Integer friOpen) {
						orgLabor.setFriOpen(friOpen);
					}
				});
		}
	}

	public static class FriCloseAccessor extends ModelPropertyAccessor {
		public FriCloseAccessor() {
			super(new Function<OrgLabor, Integer>() {
					@Override
					public Integer apply(OrgLabor orgLabor) {
						return orgLabor.getFriClose();
					}
				},
				new BiConsumer<OrgLabor, Integer>() {
					@Override
					public void accept(OrgLabor orgLabor, Integer friClose) {
						orgLabor.setFriClose(friClose);
					}
				});
		}
	}

	public static class SatOpenAccessor extends ModelPropertyAccessor {
		public SatOpenAccessor() {
			super(new Function<OrgLabor, Integer>() {
					@Override
					public Integer apply(OrgLabor orgLabor) {
						return orgLabor.getSatOpen();
					}
				},
				new BiConsumer<OrgLabor, Integer>() {
					@Override
					public void accept(OrgLabor orgLabor, Integer satOpen) {
						orgLabor.setSatOpen(satOpen);
					}
				});
		}
	}

	public static class SatCloseAccessor extends ModelPropertyAccessor {
		public SatCloseAccessor() {
			super(new Function<OrgLabor, Integer>() {
					@Override
					public Integer apply(OrgLabor orgLabor) {
						return orgLabor.getSatClose();
					}
				},
				new BiConsumer<OrgLabor, Integer>() {
					@Override
					public void accept(OrgLabor orgLabor, Integer satClose) {
						orgLabor.setSatClose(satClose);
					}
				});
		}
	}

	private OrgLaborModelAccessors() {
	}
}