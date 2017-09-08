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

package com.liferay.vulcan.wiring.osgi.manager;

import static org.osgi.service.component.annotations.ReferenceCardinality.MULTIPLE;
import static org.osgi.service.component.annotations.ReferencePolicy.DYNAMIC;
import static org.osgi.service.component.annotations.ReferencePolicyOption.GREEDY;

import com.liferay.vulcan.identifier.Identifier;
import com.liferay.vulcan.identifier.RootIdentifier;
import com.liferay.vulcan.identifier.converter.IdentifierConverter;

import java.util.Optional;

import org.osgi.framework.ServiceReference;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides methods to convert generic {@code Identifier} to domain
 * implementations.
 *
 * @author Alejandro Hernández
 */
@Component(immediate = true, service = IdentifierConverterManager.class)
public class IdentifierConverterManager
	extends BaseManager<IdentifierConverter> {

	/**
	 * Converts a generic identifier to its equivalent of type T if a valid
	 * {@link IdentifierConverter} can be found. Returns
	 * <code>Optional#empty()</code> otherwise.
	 *
	 * @param  clazz the type class to be converted to.
	 * @return the converted identifier, if a valid {@link IdentifierConverter}
	 *         is present; <code>Optional#empty()</code> otherwise.
	 */
	public <T extends Identifier> Optional<T> convert(
		Class<T> clazz, Identifier identifier) {

		if (Identifier.class == clazz) {
			return Optional.of((T)identifier);
		}

		if (RootIdentifier.class == clazz) {
			return Optional.of((T)identifier);
		}

		Optional<IdentifierConverter> optional = getServiceOptional(clazz);

		return optional.map(
			identifierConverter -> (IdentifierConverter<T>)identifierConverter
		).map(
			identifierConverter -> identifierConverter.convert(identifier)
		);
	}

	@Reference(cardinality = MULTIPLE, policy = DYNAMIC, policyOption = GREEDY)
	protected void setServiceReference(
		ServiceReference<IdentifierConverter> serviceReference) {

		addService(serviceReference, IdentifierConverter.class);
	}

	protected void unsetServiceReference(
		ServiceReference<IdentifierConverter> serviceReference) {

		removeService(serviceReference, IdentifierConverter.class);
	}

}