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

package com.liferay.portal.tools.service.builder.test.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;
import com.liferay.portal.tools.service.builder.test.model.BigDecimalEntry;

import java.math.BigDecimal;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BigDecimalEntryModelAccessors {
	public static class BigDecimalEntryIdAccessor extends ModelPropertyAccessor {
		public BigDecimalEntryIdAccessor() {
			super(new Function<BigDecimalEntry, Long>() {
					@Override
					public Long apply(BigDecimalEntry bigDecimalEntry) {
						return bigDecimalEntry.getBigDecimalEntryId();
					}
				},
				new BiConsumer<BigDecimalEntry, Long>() {
					@Override
					public void accept(BigDecimalEntry bigDecimalEntry,
						Long bigDecimalEntryId) {
						bigDecimalEntry.setBigDecimalEntryId(bigDecimalEntryId);
					}
				});
		}
	}

	public static class BigDecimalValueAccessor extends ModelPropertyAccessor {
		public BigDecimalValueAccessor() {
			super(new Function<BigDecimalEntry, BigDecimal>() {
					@Override
					public BigDecimal apply(BigDecimalEntry bigDecimalEntry) {
						return bigDecimalEntry.getBigDecimalValue();
					}
				},
				new BiConsumer<BigDecimalEntry, BigDecimal>() {
					@Override
					public void accept(BigDecimalEntry bigDecimalEntry,
						BigDecimal bigDecimalValue) {
						bigDecimalEntry.setBigDecimalValue(bigDecimalValue);
					}
				});
		}
	}

	private BigDecimalEntryModelAccessors() {
	}
}