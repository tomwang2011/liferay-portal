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

package com.liferay.portal.tools.service.builder.test.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.spring.extender.service.ServiceReference;
import com.liferay.portal.tools.service.builder.test.exception.NoSuchLocalizedEntryException;
import com.liferay.portal.tools.service.builder.test.model.LocalizedEntry;
import com.liferay.portal.tools.service.builder.test.model.impl.LocalizedEntryImpl;
import com.liferay.portal.tools.service.builder.test.model.impl.LocalizedEntryModelImpl;
import com.liferay.portal.tools.service.builder.test.service.persistence.LocalizedEntryPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the localized entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LocalizedEntryPersistence
 * @see com.liferay.portal.tools.service.builder.test.service.persistence.LocalizedEntryUtil
 * @generated
 */
@ProviderType
public class LocalizedEntryPersistenceImpl extends BasePersistenceImpl<LocalizedEntry>
	implements LocalizedEntryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LocalizedEntryUtil} to access the localized entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LocalizedEntryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LocalizedEntryModelImpl.ENTITY_CACHE_ENABLED,
			LocalizedEntryModelImpl.FINDER_CACHE_ENABLED,
			LocalizedEntryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LocalizedEntryModelImpl.ENTITY_CACHE_ENABLED,
			LocalizedEntryModelImpl.FINDER_CACHE_ENABLED,
			LocalizedEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LocalizedEntryModelImpl.ENTITY_CACHE_ENABLED,
			LocalizedEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LocalizedEntryPersistenceImpl() {
		setModelClass(LocalizedEntry.class);
	}

	/**
	 * Caches the localized entry in the entity cache if it is enabled.
	 *
	 * @param localizedEntry the localized entry
	 */
	@Override
	public void cacheResult(LocalizedEntry localizedEntry) {
		entityCache.putResult(LocalizedEntryModelImpl.ENTITY_CACHE_ENABLED,
			LocalizedEntryImpl.class, localizedEntry.getPrimaryKey(),
			localizedEntry);

		localizedEntry.resetOriginalValues();
	}

	/**
	 * Caches the localized entries in the entity cache if it is enabled.
	 *
	 * @param localizedEntries the localized entries
	 */
	@Override
	public void cacheResult(List<LocalizedEntry> localizedEntries) {
		for (LocalizedEntry localizedEntry : localizedEntries) {
			if (entityCache.getResult(
						LocalizedEntryModelImpl.ENTITY_CACHE_ENABLED,
						LocalizedEntryImpl.class, localizedEntry.getPrimaryKey()) == null) {
				cacheResult(localizedEntry);
			}
			else {
				localizedEntry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all localized entries.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LocalizedEntryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the localized entry.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LocalizedEntry localizedEntry) {
		entityCache.removeResult(LocalizedEntryModelImpl.ENTITY_CACHE_ENABLED,
			LocalizedEntryImpl.class, localizedEntry.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LocalizedEntry> localizedEntries) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LocalizedEntry localizedEntry : localizedEntries) {
			entityCache.removeResult(LocalizedEntryModelImpl.ENTITY_CACHE_ENABLED,
				LocalizedEntryImpl.class, localizedEntry.getPrimaryKey());
		}
	}

	/**
	 * Creates a new localized entry with the primary key. Does not add the localized entry to the database.
	 *
	 * @param localizedEntryId the primary key for the new localized entry
	 * @return the new localized entry
	 */
	@Override
	public LocalizedEntry create(long localizedEntryId) {
		LocalizedEntry localizedEntry = new LocalizedEntryImpl();

		localizedEntry.setNew(true);
		localizedEntry.setPrimaryKey(localizedEntryId);

		return localizedEntry;
	}

	/**
	 * Removes the localized entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param localizedEntryId the primary key of the localized entry
	 * @return the localized entry that was removed
	 * @throws NoSuchLocalizedEntryException if a localized entry with the primary key could not be found
	 */
	@Override
	public LocalizedEntry remove(long localizedEntryId)
		throws NoSuchLocalizedEntryException {
		return remove((Serializable)localizedEntryId);
	}

	/**
	 * Removes the localized entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the localized entry
	 * @return the localized entry that was removed
	 * @throws NoSuchLocalizedEntryException if a localized entry with the primary key could not be found
	 */
	@Override
	public LocalizedEntry remove(Serializable primaryKey)
		throws NoSuchLocalizedEntryException {
		Session session = null;

		try {
			session = openSession();

			LocalizedEntry localizedEntry = (LocalizedEntry)session.get(LocalizedEntryImpl.class,
					primaryKey);

			if (localizedEntry == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLocalizedEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(localizedEntry);
		}
		catch (NoSuchLocalizedEntryException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected LocalizedEntry removeImpl(LocalizedEntry localizedEntry) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(localizedEntry)) {
				localizedEntry = (LocalizedEntry)session.get(LocalizedEntryImpl.class,
						localizedEntry.getPrimaryKeyObj());
			}

			if (localizedEntry != null) {
				session.delete(localizedEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (localizedEntry != null) {
			clearCache(localizedEntry);
		}

		return localizedEntry;
	}

	@Override
	public LocalizedEntry updateImpl(LocalizedEntry localizedEntry) {
		boolean isNew = localizedEntry.isNew();

		Session session = null;

		try {
			session = openSession();

			if (localizedEntry.isNew()) {
				session.save(localizedEntry);

				localizedEntry.setNew(false);
			}
			else {
				localizedEntry = (LocalizedEntry)session.merge(localizedEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(LocalizedEntryModelImpl.ENTITY_CACHE_ENABLED,
			LocalizedEntryImpl.class, localizedEntry.getPrimaryKey(),
			localizedEntry, false);

		localizedEntry.resetOriginalValues();

		return localizedEntry;
	}

	/**
	 * Returns the localized entry with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the localized entry
	 * @return the localized entry
	 * @throws NoSuchLocalizedEntryException if a localized entry with the primary key could not be found
	 */
	@Override
	public LocalizedEntry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLocalizedEntryException {
		LocalizedEntry localizedEntry = fetchByPrimaryKey(primaryKey);

		if (localizedEntry == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLocalizedEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return localizedEntry;
	}

	/**
	 * Returns the localized entry with the primary key or throws a {@link NoSuchLocalizedEntryException} if it could not be found.
	 *
	 * @param localizedEntryId the primary key of the localized entry
	 * @return the localized entry
	 * @throws NoSuchLocalizedEntryException if a localized entry with the primary key could not be found
	 */
	@Override
	public LocalizedEntry findByPrimaryKey(long localizedEntryId)
		throws NoSuchLocalizedEntryException {
		return findByPrimaryKey((Serializable)localizedEntryId);
	}

	/**
	 * Returns the localized entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the localized entry
	 * @return the localized entry, or <code>null</code> if a localized entry with the primary key could not be found
	 */
	@Override
	public LocalizedEntry fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(LocalizedEntryModelImpl.ENTITY_CACHE_ENABLED,
				LocalizedEntryImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		LocalizedEntry localizedEntry = (LocalizedEntry)serializable;

		if (localizedEntry == null) {
			Session session = null;

			try {
				session = openSession();

				localizedEntry = (LocalizedEntry)session.get(LocalizedEntryImpl.class,
						primaryKey);

				if (localizedEntry != null) {
					cacheResult(localizedEntry);
				}
				else {
					entityCache.putResult(LocalizedEntryModelImpl.ENTITY_CACHE_ENABLED,
						LocalizedEntryImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(LocalizedEntryModelImpl.ENTITY_CACHE_ENABLED,
					LocalizedEntryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return localizedEntry;
	}

	/**
	 * Returns the localized entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param localizedEntryId the primary key of the localized entry
	 * @return the localized entry, or <code>null</code> if a localized entry with the primary key could not be found
	 */
	@Override
	public LocalizedEntry fetchByPrimaryKey(long localizedEntryId) {
		return fetchByPrimaryKey((Serializable)localizedEntryId);
	}

	@Override
	public Map<Serializable, LocalizedEntry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, LocalizedEntry> map = new HashMap<Serializable, LocalizedEntry>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			LocalizedEntry localizedEntry = fetchByPrimaryKey(primaryKey);

			if (localizedEntry != null) {
				map.put(primaryKey, localizedEntry);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(LocalizedEntryModelImpl.ENTITY_CACHE_ENABLED,
					LocalizedEntryImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (LocalizedEntry)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_LOCALIZEDENTRY_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (LocalizedEntry localizedEntry : (List<LocalizedEntry>)q.list()) {
				map.put(localizedEntry.getPrimaryKeyObj(), localizedEntry);

				cacheResult(localizedEntry);

				uncachedPrimaryKeys.remove(localizedEntry.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(LocalizedEntryModelImpl.ENTITY_CACHE_ENABLED,
					LocalizedEntryImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the localized entries.
	 *
	 * @return the localized entries
	 */
	@Override
	public List<LocalizedEntry> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the localized entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LocalizedEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of localized entries
	 * @param end the upper bound of the range of localized entries (not inclusive)
	 * @return the range of localized entries
	 */
	@Override
	public List<LocalizedEntry> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the localized entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LocalizedEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of localized entries
	 * @param end the upper bound of the range of localized entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of localized entries
	 */
	@Override
	public List<LocalizedEntry> findAll(int start, int end,
		OrderByComparator<LocalizedEntry> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the localized entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LocalizedEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of localized entries
	 * @param end the upper bound of the range of localized entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of localized entries
	 */
	@Override
	public List<LocalizedEntry> findAll(int start, int end,
		OrderByComparator<LocalizedEntry> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<LocalizedEntry> list = null;

		if (retrieveFromCache) {
			list = (List<LocalizedEntry>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LOCALIZEDENTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LOCALIZEDENTRY;

				if (pagination) {
					sql = sql.concat(LocalizedEntryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LocalizedEntry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LocalizedEntry>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the localized entries from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LocalizedEntry localizedEntry : findAll()) {
			remove(localizedEntry);
		}
	}

	/**
	 * Returns the number of localized entries.
	 *
	 * @return the number of localized entries
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LOCALIZEDENTRY);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return LocalizedEntryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the localized entry persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(LocalizedEntryImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_LOCALIZEDENTRY = "SELECT localizedEntry FROM LocalizedEntry localizedEntry";
	private static final String _SQL_SELECT_LOCALIZEDENTRY_WHERE_PKS_IN = "SELECT localizedEntry FROM LocalizedEntry localizedEntry WHERE localizedEntryId IN (";
	private static final String _SQL_COUNT_LOCALIZEDENTRY = "SELECT COUNT(localizedEntry) FROM LocalizedEntry localizedEntry";
	private static final String _ORDER_BY_ENTITY_ALIAS = "localizedEntry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LocalizedEntry exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(LocalizedEntryPersistenceImpl.class);
}