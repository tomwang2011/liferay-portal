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
import java.lang.reflect.Field;

/**
 * @author Tom Wang
 */
public class SampleClass implements Serializable {

	public static final SampleClass INSTANCE = new SampleInnerClass();

	public static void doNothing() {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				_test();
			}

		};

		runnable.run();
	}

	public SampleClass() {
		_test = true;
	}

	public SampleClass(boolean test) {
		_test = test;
	}

	public boolean isTest() {
		if (_staticTest) {
			return _test;
		}

		return false;
	}

	/**
	 * @deprecated As of 1.0.0, with no direct replacement
	 */
	@Deprecated
	public void setTest(boolean test) {
		_test = test;
	}

	protected static class SampleInnerClass extends SampleClass {

		@Override
		public boolean equals(Object object) {
			return false;
		}

		@Override
		public int hashCode() {
			return 0;
		}

	}

	private static String _test() {
		return null;
	}

	public static boolean _staticTest;

	static {
		_staticTest = true;
	}

	public static void main(String[] args) throws Exception {
		SampleClass._staticTest = true;

		Field field = SampleInnerClass.class.getField("_staticTest");

		field.setAccessible(true);

		System.out.println(field.get(null));
	}
	private boolean _test;

}