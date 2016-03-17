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

package com.liferay.poshi.runner.util;

/**
 * Provides utility methods related to data validation and format checking.
 *
 * @author Brian Wing Shun Chan
 * @author Alysa Carver
 */
public class Validator {

	/**
	 * Returns <code>true</code> if the booleans are equal.
	 *
	 * @param  boolean1 the first boolean
	 * @param  boolean2 the second boolean
	 * @return <code>true</code> if the booleans are equal; <code>false</code>
	 *         otherwise
	 */
	public static boolean equals(boolean boolean1, boolean boolean2) {
		return (boolean1 == boolean2);
	}

	/**
	 * Returns <code>true</code> if the bytes are equal.
	 *
	 * @param  byte1 the first byte
	 * @param  byte2 the second byte
	 * @return <code>true</code> if the bytes are equal; <code>false</code>
	 *         otherwise
	 */
	public static boolean equals(byte byte1, byte byte2) {
		return (byte1 == byte2);
	}

	/**
	 * Returns <code>true</code> if the characters are equal.
	 *
	 * @param  char1 the first character
	 * @param  char2 the second character
	 * @return <code>true</code> if the characters are equal; <code>false</code>
	 *         otherwise
	 */
	public static boolean equals(char char1, char char2) {
		return (char1 == char2);
	}

	/**
	 * Returns <code>true</code> if the doubles are equal.
	 *
	 * @param  double1 the first double
	 * @param  double2 the second double
	 * @return <code>true</code> if the doubles are equal; <code>false</code>
	 *         otherwise
	 */
	public static boolean equals(double double1, double double2) {
		return (Double.compare(double1, double2) == 0);
	}

	/**
	 * Returns <code>true</code> if the floats are equal.
	 *
	 * @param  float1 the first float
	 * @param  float2 the second float
	 * @return <code>true</code> if the floats are equal; <code>false</code>
	 *         otherwise
	 */
	public static boolean equals(float float1, float float2) {
		return (Float.compare(float1, float2) == 0);
	}

	/**
	 * Returns <code>true</code> if the integers are equal.
	 *
	 * @param  int1 the first integer
	 * @param  int2 the second integer
	 * @return <code>true</code> if the integers are equal; <code>false</code>
	 *         otherwise
	 */
	public static boolean equals(int int1, int int2) {
		return (int1 == int2);
	}

	/**
	 * Returns <code>true</code> if the long integers are equal.
	 *
	 * @param  long1 the first long integer
	 * @param  long2 the second long integer
	 * @return <code>true</code> if the long integers are equal;
	 *         <code>false</code> otherwise
	 */
	public static boolean equals(long long1, long long2) {
		return (long1 == long2);
	}

	/**
	 * Returns <code>true</code> if the objects are either equal, the same
	 * instance, or both <code>null</code>.
	 *
	 * @param  obj1 the first object
	 * @param  obj2 the second object
	 * @return <code>true</code> if the objects are either equal, the same
	 *         instance, or both <code>null</code>; <code>false</code> otherwise
	 */
	public static boolean equals(Object obj1, Object obj2) {
		if (obj1 == obj2) {
			return true;
		}
		else if ((obj1 == null) || (obj2 == null)) {
			return false;
		}
		else {
			return obj1.equals(obj2);
		}
	}

	/**
	 * Returns <code>true</code> if the short integers are equal.
	 *
	 * @param  short1 the first short integer
	 * @param  short2 the second short integer
	 * @return <code>true</code> if the short integers are equal;
	 *         <code>false</code> otherwise
	 */
	public static boolean equals(short short1, short short2) {
		return (short1 == short2);
	}

	public static boolean isBlank(String s) {
		if (s == null) {
			return true;
		}

		return (s.length() == 0);
	}

	/**
	 * Returns <code>true</code> if the character is an upper or lower case
	 * English letter.
	 *
	 * @param  c the character to check
	 * @return <code>true</code> if the character is an upper or lower case
	 *         English letter; <code>false</code> otherwise
	 */
	public static boolean isChar(char c) {
		int x = c;

		return (((x >= _CHAR_LC_BEGIN) && (x <= _CHAR_LC_END)) ||
			((x >= _CHAR_UC_BEGIN) && (x <= _CHAR_UC_END)));
	}

	/**
	 * Returns <code>true</code> if the character is a digit between 0 and 9
	 * (inclusive).
	 *
	 * @param  c the character to check
	 * @return <code>true</code> if the character is a digit between 0 and 9
	 *         (inclusive); <code>false</code> otherwise
	 */
	public static boolean isDigit(char c) {
		int x = c;

		return ((x >= _DIGIT_BEGIN) && (x <= _DIGIT_END));
	}

	/**
	 * Returns <code>true</code> if the string consists of only digits between 0
	 * and 9 (inclusive).
	 *
	 * @param  s the string to check
	 * @return <code>true</code> if the string consists of only digits between 0
	 *         and 9 (inclusive); <code>false</code> otherwise
	 */
	public static boolean isDigit(String s) {
		if (isNull(s)) {
			return false;
		}

		for (char c : s.toCharArray()) {
			if (!isDigit(c)) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Returns <code>true</code> if the object is not <code>null</code>, using
	 * the rules from {@link #isNotNull(Long)} or {@link #isNotNull(String)} if
	 * the object is one of these types.
	 *
	 * @param  obj the object to check
	 * @return <code>true</code> if the object is not <code>null</code>;
	 *         <code>false</code> otherwise
	 */
	public static boolean isNotNull(Object obj) {
		return !isNull(obj);
	}

	/**
	 * Returns <code>true</code> if the string is not <code>null</code>, meaning
	 * it is not a <code>null</code> reference, nothing but spaces, or the
	 * string "<code>null</code>", with zero or more leading or trailing spaces.
	 *
	 * @param  s the string to check
	 * @return <code>true</code> if the string is not <code>null</code>;
	 *         <code>false</code> otherwise
	 */
	public static boolean isNotNull(String s) {
		return !isNull(s);
	}

	/**
	 * Returns <code>true</code> if the object is <code>null</code>, using the
	 * rules from {@link #isNull(Long)} or {@link #isNull(String)} if the object
	 * is one of these types.
	 *
	 * @param  obj the object to check
	 * @return <code>true</code> if the object is <code>null</code>;
	 *         <code>false</code> otherwise
	 */
	public static boolean isNull(Object obj) {
		if (obj instanceof Long) {
			return isNull(obj);
		}
		else if (obj instanceof String) {
			return isNull((String)obj);
		}
		return (obj == null);
	}

	/**
	 * Returns <code>true</code> if the string is <code>null</code>, meaning it
	 * is a <code>null</code> reference, nothing but spaces, or the string
	 * "<code>null</code>", with zero or more leading or trailing spaces.
	 *
	 * @param  s the string to check
	 * @return <code>true</code> if the string is <code>null</code>;
	 *         <code>false</code> otherwise
	 */
	public static boolean isNull(String s) {
		if (s == null) {
			return true;
		}

		int counter = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == CharPool.SPACE) {
				continue;
			}
			else if (counter > 3) {
				return false;
			}

			if (counter == 0) {
				if (c != CharPool.LOWER_CASE_N) {
					return false;
				}
			}
			else if (counter == 1) {
				if (c != CharPool.LOWER_CASE_U) {
					return false;
				}
			}
			else if ((counter == 2) || (counter == 3)) {
				if (c != CharPool.LOWER_CASE_L) {
					return false;
				}
			}

			counter++;
		}

		return ((counter == 0) || (counter == 4));
	}

	private static final int _CHAR_LC_BEGIN = 97;

	private static final int _CHAR_LC_END = 122;

	private static final int _CHAR_UC_BEGIN = 65;

	private static final int _CHAR_UC_END = 90;

	private static final int _DIGIT_BEGIN = 48;

	private static final int _DIGIT_END = 57;

}