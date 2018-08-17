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

package com.liferay.apio.architect.impl.routes;

import com.liferay.apio.architect.alias.form.FormBuilderFunction;
import com.liferay.apio.architect.alias.routes.permission.HasAddingPermissionFunction;
import com.liferay.apio.architect.alias.routes.permission.HasNestedAddingPermissionFunction;
import com.liferay.apio.architect.alias.routes.permission.HasRemovePermissionFunction;
import com.liferay.apio.architect.alias.routes.permission.HasUpdatePermissionFunction;
import com.liferay.apio.architect.credentials.Credentials;
import com.liferay.apio.architect.form.Body;
import com.liferay.apio.architect.impl.alias.ProvideFunction;
import com.liferay.apio.architect.impl.pagination.PaginationImpl;
import com.liferay.apio.architect.pagination.Pagination;
import com.liferay.apio.architect.uri.Path;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import javax.ws.rs.NotFoundException;

/**
 * Provides utilities for testing routes classes.
 *
 * @author Alejandro Hernández
 */
public class RoutesTestUtil {

	/**
	 * A {@code FormBuilderFunction} that creates a {@code Map<String, Object>}
	 * {@code Form}.
	 */
	public static final FormBuilderFunction<Map<String, Object>>
		FORM_BUILDER_FUNCTION = builder -> builder.title(
			__ -> ""
		).description(
			__ -> ""
		).constructor(
			HashMap::new
		).addRequiredString(
			"key", (map, value) -> map.put("key", value)
		).build();

	/**
	 * A collection permission function that always returns {@code true}.
	 */
	public static final HasAddingPermissionFunction
		HAS_ADDING_PERMISSION_FUNCTION = __ -> true;

	/**
	 * An item permission function that always returns {@code true}.
	 */
	public static final HasRemovePermissionFunction<Long>
		HAS_REMOVE_PERMISSION_FUNCTION = (credentials, aLong) -> true;

	/**
	 * An item permission function that always returns {@code true}.
	 */
	public static final HasUpdatePermissionFunction<Long>
		HAS_UPDATE_PERMISSION_FUNCTION = (credentials, aLong) -> true;

	/**
	 * An identifier function that provides identifiers for {@code String}
	 * models
	 */
	public static final Function<String, Long> IDENTIFIER_FUNCTION = __ -> 42L;

	/**
	 * An identifier to {@link Path} function that returns an {@link Optional}
	 * containing a {@code Path("name", "id")}.
	 */
	public static final Function<Long, Optional<Path>>
		IDENTIFIER_TO_PATH_FUNCTION = __ -> Optional.of(new Path("name", "id"));

	/**
	 * A mock {@code Pagination} object.
	 */
	public static final Pagination PAGINATION = new PaginationImpl(4, 2);

	/**
	 * A function that provides instances of {@code String}, {@code Long},
	 * {@code Integer}, {@code Boolean}, {@code Float}, {@code Pagination}, and
	 * {@code Credentials}.
	 */
	public static final Function<Class<?>, ?> PROVIDE_FUNCTION = aClass -> {
		if (aClass.equals(String.class)) {
			return "Apio";
		}
		else if (aClass.equals(Long.class)) {
			return 42L;
		}
		else if (aClass.equals(Integer.class)) {
			return 2017;
		}
		else if (aClass.equals(Boolean.class)) {
			return true;
		}
		else if (aClass.equals(Float.class)) {
			return 0.1F;
		}
		else if (aClass.equals(Pagination.class)) {
			return PAGINATION;
		}
		else if (aClass.equals(Credentials.class)) {
			return (Credentials)() -> "auth";
		}
		else {
			throw new NotFoundException();
		}
	};

	/**
	 * A {@code ProvideFunction} that provides instances of {@code String},
	 * {@code Long}, {@code Integer}, {@code Boolean}, {@code Float}, and {@code
	 * Pagination}.
	 */
	public static final ProvideFunction REQUEST_PROVIDE_FUNCTION =
		__ -> PROVIDE_FUNCTION;

	/**
	 * Returns a nested collection permission function that always returns
	 * {@code true}.
	 */
	public static <S> HasNestedAddingPermissionFunction<S>
		hasNestedAddingPermissionFunction() {

		return (credentials, s) -> true;
	}

	/**
	 * Returns the value of the {@code "key"} field from the {@link Body}, or
	 * fails.
	 *
	 * @param  body the body from which to extract the value
	 * @return the key's value
	 */
	public static String keyValueFrom(Body body) {
		Optional<String> optional = body.getValueOptional("key");

		return optional.orElseThrow(
			() -> new AssertionError("Body does not contain field: \"key\""));
	}

}