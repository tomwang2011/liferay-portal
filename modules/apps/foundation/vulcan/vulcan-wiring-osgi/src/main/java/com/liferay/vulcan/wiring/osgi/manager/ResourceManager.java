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

import com.liferay.vulcan.binary.BinaryFunction;
import com.liferay.vulcan.error.VulcanDeveloperError;
import com.liferay.vulcan.identifier.Identifier;
import com.liferay.vulcan.resource.Resource;
import com.liferay.vulcan.resource.Routes;
import com.liferay.vulcan.result.Try;
import com.liferay.vulcan.wiring.osgi.internal.resource.builder.RepresentorBuilderImpl;
import com.liferay.vulcan.wiring.osgi.internal.resource.builder.RoutesBuilderImpl;
import com.liferay.vulcan.wiring.osgi.model.RelatedCollection;
import com.liferay.vulcan.wiring.osgi.model.RelatedModel;
import com.liferay.vulcan.wiring.osgi.util.GenericUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.Function;

import javax.servlet.http.HttpServletRequest;

import org.osgi.framework.ServiceReference;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides methods to retrieve information provided by the different {@link
 * Resource} instances, such as field functions, types, identifier functions,
 * and so on.
 *
 * @author Alejandro Hernández
 * @author Carlos Sierra Andrés
 * @author Jorge Ferrer
 * @see    Resource
 */
@Component(immediate = true, service = ResourceManager.class)
public class ResourceManager extends BaseManager<Resource> {

	/**
	 * Returns the binary resources linked to a model
	 *
	 * @param  modelClass class name indexing the binary resources
	 * @return the binary resources for the model class
	 */
	public <T> Map<String, BinaryFunction<T>>
		getBinaryFunctions(Class<T> modelClass) {

		return (Map)_binaryFunctions.get(modelClass.getName());
	}

	/**
	 * Returns the model class name, exposed in a certain path.
	 *
	 * @param  path path of the resource for the class name.
	 * @return the class name exposed in the path.
	 */
	public String getClassName(String path) {
		return _classNames.get(path);
	}

	/**
	 * Returns the embedded related models for the model class.
	 *
	 * @param  modelClass the model class of a {@link Resource}.
	 * @return the embedded related models for the model class.
	 * @see    Resource
	 */
	public <T> List<RelatedModel<T, ?>> getEmbeddedRelatedModels(
		Class<T> modelClass) {

		return (List)_embeddedRelatedModels.get(modelClass.getName());
	}

	/**
	 * Returns the field names and functions of the model class.
	 *
	 * <p>
	 * These functions are separated in a map with the field names as keys.
	 * </p>
	 *
	 * @param  modelClass the model class of a {@link Resource}.
	 * @return the field names and functions of the model class.
	 * @see    Resource
	 */
	public <T> Map<String, Function<T, Object>> getFieldFunctions(
		Class<T> modelClass) {

		return (Map)_fieldFunctions.get(modelClass.getName());
	}

	/**
	 * Returns the identifier of the model if present. Returns {@code
	 * Optional#empty()} otherwise.
	 *
	 * @param  modelClass the model class of a {@link Resource}.
	 * @param  model the model instance.
	 * @return the identifier of the model if present; {@code Optional#empty()}
	 *         otherwise.
	 * @see    Resource
	 */
	public <T> Optional<Identifier> getIdentifierOptional(
		Class<T> modelClass, T model) {

		Function<T, Identifier> identifierFunction =
			(Function<T, Identifier>)_identifierFunctions.get(
				modelClass.getName());

		Optional<Function<T, Identifier>> optional = Optional.ofNullable(
			identifierFunction);

		return optional.map(
			function -> function.apply(model)
		).flatMap(
			identifier -> {
				Optional<Resource<T, Identifier>> resourceOptional =
					getResourceOptional(modelClass);

				return resourceOptional.map(
					Resource::getPath
				).map(
					path -> new Identifier() {

						@Override
						public String getId() {
							return identifier.getId();
						}

						@Override
						public String getType() {
							return path;
						}

					}
				);
			}
		);
	}

	/**
	 * Returns the linked related models for the model class.
	 *
	 * @param  modelClass the model class of a {@link Resource}.
	 * @return the linked related models for the model class.
	 */
	public <T> List<RelatedModel<T, ?>> getLinkedRelatedModels(
		Class<T> modelClass) {

		return (List)_linkedRelatedModels.get(modelClass.getName());
	}

	/**
	 * Returns the links for the model class.
	 *
	 * @param  modelClass the model class of a {@link Resource}.
	 * @return the links for the model class.
	 */
	public <T> Map<String, String> getLinks(Class<T> modelClass) {
		return _links.get(modelClass.getName());
	}

	/**
	 * Returns the related collections for the model class.
	 *
	 * @param  modelClass the model class of a {@link Resource}.
	 * @return the related collections for the model class.
	 */
	public <T> List<RelatedCollection<T, ?>> getRelatedCollections(
		Class<T> modelClass) {

		return (List)_relatedCollections.get(modelClass.getName());
	}

	/**
	 * Returns the {@link Resource} of the model class. Returns
	 * <code>Optional#empty()</code> if the {@link Resource} isn't present.
	 *
	 * @param  modelClass the model class.
	 * @return the {@link Resource}, if present; <code>Optional#empty()</code>
	 *         otherwise.
	 */
	public <T, U extends Identifier> Optional<Resource<T, U>>
		getResourceOptional(Class<T> modelClass) {

		return getResourceOptional(modelClass.getName());
	}

	/**
	 * Returns the {@link Resource} of the model class name. Returns
	 * <code>Optional#empty()</code> if the {@link Resource} isn't present.
	 *
	 * @param  modelClassName the model class name.
	 * @return the {@link Resource}, if present; <code>Optional#empty()</code>
	 *         otherwise.
	 */
	public <T, U extends Identifier> Optional<Resource<T, U>>
		getResourceOptional(String modelClassName) {

		return getServiceOptional(modelClassName).map(
			resource -> (Resource<T, U>)resource);
	}

	/**
	 * Returns the routes of the model class for a certain path.
	 *
	 * @param  path the path of a {@link Resource}.
	 * @param  httpServletRequest the actual request.
	 * @return the routes of the model class.
	 */
	public <T> Optional<Routes<T>> getRoutes(
		String path, HttpServletRequest httpServletRequest) {

		Optional<Function<HttpServletRequest, Routes<?>>> optional =
			Optional.ofNullable(_routesFunctions.get(path));

		return optional.map(
			routesFunction -> routesFunction.apply(httpServletRequest)
		).map(
			routes -> (Routes<T>)routes
		);
	}

	/**
	 * Returns the types of the model class.
	 *
	 * @param  modelClass the model class of a {@link Resource}.
	 * @return the types of the model class.
	 */
	public <T> List<String> getTypes(Class<T> modelClass) {
		return _types.get(modelClass.getName());
	}

	@Reference(cardinality = MULTIPLE, policy = DYNAMIC, policyOption = GREEDY)
	protected <T> void setServiceReference(
		ServiceReference<Resource> serviceReference) {

		Class<T> modelClass = addService(serviceReference, Resource.class);

		Optional<Resource> optional = getServiceOptional(modelClass);

		optional.ifPresent(
			resource -> _classNames.put(
				resource.getPath(), modelClass.getName()));

		_addModelClassMaps(modelClass);
	}

	protected <T, U extends Identifier> void unsetServiceReference(
		ServiceReference<Resource> serviceReference) {

		Class<T> modelClass = removeService(serviceReference, Resource.class);

		_removeModelClassMaps(modelClass);

		Optional<Resource<T, U>> optional = getResourceOptional(modelClass);

		optional.ifPresent(firstResource -> _addModelClassMaps(modelClass));
	}

	private <T, U extends Identifier> void _addModelClassMaps(
		Class<T> modelClass) {

		Map<String, Function<?, Object>> fieldFunctions = new HashMap<>();

		_fieldFunctions.put(modelClass.getName(), fieldFunctions);

		List<RelatedModel<?, ?>> embeddedRelatedModels = new ArrayList<>();

		_embeddedRelatedModels.put(modelClass.getName(), embeddedRelatedModels);

		List<RelatedModel<?, ?>> linkedRelatedModels = new ArrayList<>();

		_linkedRelatedModels.put(modelClass.getName(), linkedRelatedModels);

		Map<String, String> links = new HashMap<>();

		_links.put(modelClass.getName(), links);

		List<RelatedCollection<?, ?>> relatedCollections =
			_relatedCollections.computeIfAbsent(
				modelClass.getName(), className -> new ArrayList<>());

		_relatedCollections.put(modelClass.getName(), relatedCollections);

		Map<String, BinaryFunction<T>> binaryFunctions = new HashMap<>();

		_binaryFunctions.put(modelClass.getName(), (Map)binaryFunctions);

		List<String> types = new ArrayList<>();

		_types.put(modelClass.getName(), types);

		Optional<Resource<T, U>> optional = getResourceOptional(modelClass);

		optional.ifPresent(
			resource -> {
				resource.buildRepresentor(
					new RepresentorBuilderImpl(
						modelClass, _identifierFunctions,
						_addRelatedCollectionBiConsumer(modelClass),
						fieldFunctions, embeddedRelatedModels,
						linkedRelatedModels, links, relatedCollections,
						binaryFunctions, types));

				Function<HttpServletRequest, Routes<?>> routesFunction =
					_getRoutesFunction(
						modelClass, _getIdentifierClass(resource), resource,
						binaryFunctions);

				_routesFunctions.put(resource.getPath(), routesFunction);
			});
	}

	private <T> BiConsumer<String, Class<?>>
		_addRelatedCollectionBiConsumer(Class<T> relatedModelClass) {

		return (key, modelClass) -> {
			List<RelatedCollection<?, ?>> relatedCollections =
				_relatedCollections.computeIfAbsent(
					modelClass.getName(), className -> new ArrayList<>());

			relatedCollections.add(
				new RelatedCollection<>(key, relatedModelClass));
		};
	}

	private <T, U extends Identifier> Class<U> _getIdentifierClass(
		Resource<T, U> resource) {

		Class<? extends Resource> resourceClass = resource.getClass();

		Try<Class<U>> classTry = GenericUtil.getGenericClassTry(
			resourceClass, Resource.class, 1);

		return classTry.orElseThrow(
			() -> new VulcanDeveloperError.MustHaveValidGenericType(
				resourceClass));
	}

	private Function<Class<?>, Optional<?>> _getProvideClassFunction(
		HttpServletRequest httpServletRequest) {

		return clazz -> _providerManager.provide(clazz, httpServletRequest);
	}

	private <T, U extends Identifier> Function<HttpServletRequest, Routes<?>>
		_getRoutesFunction(
			Class<T> modelClass, Class<U> identifierClass,
			Resource<T, U> resource,
			Map<String, BinaryFunction<T>> binaryFunctions) {

		return httpServletRequest -> {
			RoutesBuilderImpl<T, U> routesBuilder = new RoutesBuilderImpl<>(
				modelClass, identifierClass,
				_getProvideClassFunction(httpServletRequest),
				_identifierConverterManager::convert);

			routesBuilder.collectionBinary(binaryFunctions);

			return resource.routes(routesBuilder);
		};
	}

	private <T> void _removeModelClassMaps(Class<T> modelClass) {
		_embeddedRelatedModels.remove(modelClass.getName());
		_fieldFunctions.remove(modelClass.getName());
		_identifierFunctions.remove(modelClass.getName());
		_linkedRelatedModels.remove(modelClass.getName());
		_links.remove(modelClass.getName());
		_binaryFunctions.remove(modelClass.getName());
		_types.remove(modelClass.getName());
	}

	private final Map<String, Map<String, BinaryFunction<?>>> _binaryFunctions =
		new ConcurrentHashMap<>();
	private final Map<String, String> _classNames = new ConcurrentHashMap<>();
	private final Map<String, List<RelatedModel<?, ?>>> _embeddedRelatedModels =
		new ConcurrentHashMap<>();
	private final Map<String, Map<String, Function<?, Object>>>
		_fieldFunctions = new ConcurrentHashMap<>();

	@Reference
	private IdentifierConverterManager _identifierConverterManager;

	private final Map<String, Function<?, ? extends Identifier>>
		_identifierFunctions = new ConcurrentHashMap<>();
	private final Map<String, List<RelatedModel<?, ?>>> _linkedRelatedModels =
		new ConcurrentHashMap<>();
	private final Map<String, Map<String, String>> _links =
		new ConcurrentHashMap<>();

	@Reference
	private ProviderManager _providerManager;

	private final Map<String, List<RelatedCollection<?, ?>>>
		_relatedCollections = new ConcurrentHashMap<>();
	private final Map<String, Function<HttpServletRequest, Routes<?>>>
		_routesFunctions = new ConcurrentHashMap<>();
	private final Map<String, List<String>> _types = new ConcurrentHashMap<>();

}