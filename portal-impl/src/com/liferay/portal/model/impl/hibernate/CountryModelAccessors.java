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
import com.liferay.portal.kernel.model.Country;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CountryModelAccessors {
	public static class CountryIdAccessor extends ModelPropertyAccessor {
		public CountryIdAccessor() {
			super(new Function<Country, Long>() {
					@Override
					public Long apply(Country country) {
						return country.getCountryId();
					}
				},
				new BiConsumer<Country, Long>() {
					@Override
					public void accept(Country country, Long countryId) {
						country.setCountryId(countryId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<Country, String>() {
					@Override
					public String apply(Country country) {
						return country.getName();
					}
				},
				new BiConsumer<Country, String>() {
					@Override
					public void accept(Country country, String name) {
						country.setName(name);
					}
				});
		}
	}

	public static class A2Accessor extends ModelPropertyAccessor {
		public A2Accessor() {
			super(new Function<Country, String>() {
					@Override
					public String apply(Country country) {
						return country.getA2();
					}
				},
				new BiConsumer<Country, String>() {
					@Override
					public void accept(Country country, String a2) {
						country.setA2(a2);
					}
				});
		}
	}

	public static class A3Accessor extends ModelPropertyAccessor {
		public A3Accessor() {
			super(new Function<Country, String>() {
					@Override
					public String apply(Country country) {
						return country.getA3();
					}
				},
				new BiConsumer<Country, String>() {
					@Override
					public void accept(Country country, String a3) {
						country.setA3(a3);
					}
				});
		}
	}

	public static class NumberAccessor extends ModelPropertyAccessor {
		public NumberAccessor() {
			super(new Function<Country, String>() {
					@Override
					public String apply(Country country) {
						return country.getNumber();
					}
				},
				new BiConsumer<Country, String>() {
					@Override
					public void accept(Country country, String number) {
						country.setNumber(number);
					}
				});
		}
	}

	public static class IddAccessor extends ModelPropertyAccessor {
		public IddAccessor() {
			super(new Function<Country, String>() {
					@Override
					public String apply(Country country) {
						return country.getIdd();
					}
				},
				new BiConsumer<Country, String>() {
					@Override
					public void accept(Country country, String idd) {
						country.setIdd(idd);
					}
				});
		}
	}

	public static class ZipRequiredAccessor extends ModelPropertyAccessor {
		public ZipRequiredAccessor() {
			super(new Function<Country, Boolean>() {
					@Override
					public Boolean apply(Country country) {
						return country.getZipRequired();
					}
				},
				new BiConsumer<Country, Boolean>() {
					@Override
					public void accept(Country country, Boolean zipRequired) {
						country.setZipRequired(zipRequired);
					}
				});
		}
	}

	public static class ActiveAccessor extends ModelPropertyAccessor {
		public ActiveAccessor() {
			super(new Function<Country, Boolean>() {
					@Override
					public Boolean apply(Country country) {
						return country.getActive();
					}
				},
				new BiConsumer<Country, Boolean>() {
					@Override
					public void accept(Country country, Boolean active) {
						country.setActive(active);
					}
				});
		}
	}

	private CountryModelAccessors() {
	}
}