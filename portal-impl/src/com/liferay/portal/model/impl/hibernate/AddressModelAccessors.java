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
import com.liferay.portal.kernel.model.Address;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddressModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<Address, String>() {
					@Override
					public String apply(Address address) {
						return address.getUuid();
					}
				},
				new BiConsumer<Address, String>() {
					@Override
					public void accept(Address address, String uuid) {
						address.setUuid(uuid);
					}
				});
		}
	}

	public static class AddressIdAccessor extends ModelPropertyAccessor {
		public AddressIdAccessor() {
			super(new Function<Address, Long>() {
					@Override
					public Long apply(Address address) {
						return address.getAddressId();
					}
				},
				new BiConsumer<Address, Long>() {
					@Override
					public void accept(Address address, Long addressId) {
						address.setAddressId(addressId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Address, Long>() {
					@Override
					public Long apply(Address address) {
						return address.getCompanyId();
					}
				},
				new BiConsumer<Address, Long>() {
					@Override
					public void accept(Address address, Long companyId) {
						address.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<Address, Long>() {
					@Override
					public Long apply(Address address) {
						return address.getUserId();
					}
				},
				new BiConsumer<Address, Long>() {
					@Override
					public void accept(Address address, Long userId) {
						address.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<Address, String>() {
					@Override
					public String apply(Address address) {
						return address.getUserName();
					}
				},
				new BiConsumer<Address, String>() {
					@Override
					public void accept(Address address, String userName) {
						address.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Address, Date>() {
					@Override
					public Date apply(Address address) {
						return address.getCreateDate();
					}
				},
				new BiConsumer<Address, Date>() {
					@Override
					public void accept(Address address, Date createDate) {
						address.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<Address, Date>() {
					@Override
					public Date apply(Address address) {
						return address.getModifiedDate();
					}
				},
				new BiConsumer<Address, Date>() {
					@Override
					public void accept(Address address, Date modifiedDate) {
						address.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<Address, Long>() {
					@Override
					public Long apply(Address address) {
						return address.getClassNameId();
					}
				},
				new BiConsumer<Address, Long>() {
					@Override
					public void accept(Address address, Long classNameId) {
						address.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<Address, Long>() {
					@Override
					public Long apply(Address address) {
						return address.getClassPK();
					}
				},
				new BiConsumer<Address, Long>() {
					@Override
					public void accept(Address address, Long classPK) {
						address.setClassPK(classPK);
					}
				});
		}
	}

	public static class Street1Accessor extends ModelPropertyAccessor {
		public Street1Accessor() {
			super(new Function<Address, String>() {
					@Override
					public String apply(Address address) {
						return address.getStreet1();
					}
				},
				new BiConsumer<Address, String>() {
					@Override
					public void accept(Address address, String street1) {
						address.setStreet1(street1);
					}
				});
		}
	}

	public static class Street2Accessor extends ModelPropertyAccessor {
		public Street2Accessor() {
			super(new Function<Address, String>() {
					@Override
					public String apply(Address address) {
						return address.getStreet2();
					}
				},
				new BiConsumer<Address, String>() {
					@Override
					public void accept(Address address, String street2) {
						address.setStreet2(street2);
					}
				});
		}
	}

	public static class Street3Accessor extends ModelPropertyAccessor {
		public Street3Accessor() {
			super(new Function<Address, String>() {
					@Override
					public String apply(Address address) {
						return address.getStreet3();
					}
				},
				new BiConsumer<Address, String>() {
					@Override
					public void accept(Address address, String street3) {
						address.setStreet3(street3);
					}
				});
		}
	}

	public static class CityAccessor extends ModelPropertyAccessor {
		public CityAccessor() {
			super(new Function<Address, String>() {
					@Override
					public String apply(Address address) {
						return address.getCity();
					}
				},
				new BiConsumer<Address, String>() {
					@Override
					public void accept(Address address, String city) {
						address.setCity(city);
					}
				});
		}
	}

	public static class ZipAccessor extends ModelPropertyAccessor {
		public ZipAccessor() {
			super(new Function<Address, String>() {
					@Override
					public String apply(Address address) {
						return address.getZip();
					}
				},
				new BiConsumer<Address, String>() {
					@Override
					public void accept(Address address, String zip) {
						address.setZip(zip);
					}
				});
		}
	}

	public static class RegionIdAccessor extends ModelPropertyAccessor {
		public RegionIdAccessor() {
			super(new Function<Address, Long>() {
					@Override
					public Long apply(Address address) {
						return address.getRegionId();
					}
				},
				new BiConsumer<Address, Long>() {
					@Override
					public void accept(Address address, Long regionId) {
						address.setRegionId(regionId);
					}
				});
		}
	}

	public static class CountryIdAccessor extends ModelPropertyAccessor {
		public CountryIdAccessor() {
			super(new Function<Address, Long>() {
					@Override
					public Long apply(Address address) {
						return address.getCountryId();
					}
				},
				new BiConsumer<Address, Long>() {
					@Override
					public void accept(Address address, Long countryId) {
						address.setCountryId(countryId);
					}
				});
		}
	}

	public static class TypeIdAccessor extends ModelPropertyAccessor {
		public TypeIdAccessor() {
			super(new Function<Address, Long>() {
					@Override
					public Long apply(Address address) {
						return address.getTypeId();
					}
				},
				new BiConsumer<Address, Long>() {
					@Override
					public void accept(Address address, Long typeId) {
						address.setTypeId(typeId);
					}
				});
		}
	}

	public static class MailingAccessor extends ModelPropertyAccessor {
		public MailingAccessor() {
			super(new Function<Address, Boolean>() {
					@Override
					public Boolean apply(Address address) {
						return address.getMailing();
					}
				},
				new BiConsumer<Address, Boolean>() {
					@Override
					public void accept(Address address, Boolean mailing) {
						address.setMailing(mailing);
					}
				});
		}
	}

	public static class PrimaryAccessor extends ModelPropertyAccessor {
		public PrimaryAccessor() {
			super(new Function<Address, Boolean>() {
					@Override
					public Boolean apply(Address address) {
						return address.getPrimary();
					}
				},
				new BiConsumer<Address, Boolean>() {
					@Override
					public void accept(Address address, Boolean primary) {
						address.setPrimary(primary);
					}
				});
		}
	}

	private AddressModelAccessors() {
	}
}