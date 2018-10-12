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
import com.liferay.portal.kernel.model.Region;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RegionModelAccessors {
	public static class RegionIdAccessor extends ModelPropertyAccessor {
		public RegionIdAccessor() {
			super(new Function<Region, Long>() {
					@Override
					public Long apply(Region region) {
						return region.getRegionId();
					}
				},
				new BiConsumer<Region, Long>() {
					@Override
					public void accept(Region region, Long regionId) {
						region.setRegionId(regionId);
					}
				});
		}
	}

	public static class CountryIdAccessor extends ModelPropertyAccessor {
		public CountryIdAccessor() {
			super(new Function<Region, Long>() {
					@Override
					public Long apply(Region region) {
						return region.getCountryId();
					}
				},
				new BiConsumer<Region, Long>() {
					@Override
					public void accept(Region region, Long countryId) {
						region.setCountryId(countryId);
					}
				});
		}
	}

	public static class RegionCodeAccessor extends ModelPropertyAccessor {
		public RegionCodeAccessor() {
			super(new Function<Region, String>() {
					@Override
					public String apply(Region region) {
						return region.getRegionCode();
					}
				},
				new BiConsumer<Region, String>() {
					@Override
					public void accept(Region region, String regionCode) {
						region.setRegionCode(regionCode);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<Region, String>() {
					@Override
					public String apply(Region region) {
						return region.getName();
					}
				},
				new BiConsumer<Region, String>() {
					@Override
					public void accept(Region region, String name) {
						region.setName(name);
					}
				});
		}
	}

	public static class ActiveAccessor extends ModelPropertyAccessor {
		public ActiveAccessor() {
			super(new Function<Region, Boolean>() {
					@Override
					public Boolean apply(Region region) {
						return region.getActive();
					}
				},
				new BiConsumer<Region, Boolean>() {
					@Override
					public void accept(Region region, Boolean active) {
						region.setActive(active);
					}
				});
		}
	}

	private RegionModelAccessors() {
	}
}