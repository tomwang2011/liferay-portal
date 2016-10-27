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

package com.liferay.bytecode.transformer;

import java.io.Serializable;

/**
 * @author Tom Wang
 * @deprecated As of 1.0.0, with no direct replacement
 */
@Deprecated
public class ExpectedSampleClass implements Serializable {

	public static final ExpectedSampleClass INSTANCE = new SampleInnerClass();

	public static void doNothing() {
		throw new UnsupportedOperationException();
	}

	public ExpectedSampleClass() {
	}

	public ExpectedSampleClass(boolean test) {
	}

	public boolean isTest() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @deprecated As of 1.0.0, with no direct replacement
	 */
	@Deprecated
	public void setTest(boolean test) {
	}

	protected static class SampleInnerClass extends ExpectedSampleClass {

		@Override
		public boolean equals(Object object) {
			throw new UnsupportedOperationException();
		}

		@Override
		public int hashCode() {
			throw new UnsupportedOperationException();
		}

	}

}