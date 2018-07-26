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
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;
import com.liferay.portal.tools.service.builder.test.exception.NoSuchLocalizedEntryLocalizationException;
import com.liferay.portal.tools.service.builder.test.model.LocalizedEntryLocalization;
import com.liferay.portal.tools.service.builder.test.model.impl.LocalizedEntryLocalizationImpl;
import com.liferay.portal.tools.service.builder.test.model.impl.LocalizedEntryLocalizationModelImpl;
import com.liferay.portal.tools.service.builder.test.service.persistence.LocalizedEntryLocalizationPersistence;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the localized entry localization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LocalizedEntryLocalizationPersistence
 * @see com.liferay.portal.tools.service.builder.test.service.persistence.LocalizedEntryLocalizationUtil
 * @generated
 */
@ProviderType
public class LocalizedEntryLocalizationPersistenceImpl
	extends BasePersistenceImpl<LocalizedEntryLocalization>
	implements LocalizedEntryLocalizationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LocalizedEntryLocalizationUtil} to access the localized entry localization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LocalizedEntryLocalizationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LocalizedEntryLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			LocalizedEntryLocalizationModelImpl.FINDER_CACHE_ENABLED,
			LocalizedEntryLocalizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LocalizedEntryLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			LocalizedEntryLocalizationModelImpl.FINDER_CACHE_ENABLED,
			LocalizedEntryLocalizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LocalizedEntryLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			LocalizedEntryLocalizationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCALIZEDENTRYID =
		new FinderPath(LocalizedEntryLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			LocalizedEntryLocalizationModelImpl.FINDER_CACHE_ENABLED,
			LocalizedEntryLocalizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLocalizedEntryId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCALIZEDENTRYID =
		new FinderPath(LocalizedEntryLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			LocalizedEntryLocalizationModelImpl.FINDER_CACHE_ENABLED,
			LocalizedEntryLocalizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByLocalizedEntryId", new String[] { Long.class.getName() },
			LocalizedEntryLocalizationModelImpl.LOCALIZEDENTRYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOCALIZEDENTRYID = new FinderPath(LocalizedEntryLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			LocalizedEntryLocalizationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByLocalizedEntryId", new String[] { Long.class.getName() });

	/**
	 * Returns all the localized entry localizations where localizedEntryId = &#63;.
	 *
	 * @param localizedEntryId the localized entry ID
	 * @return the matching localized entry localizations
	 */
	@Override
	public List<LocalizedEntryLocalization> findByLocalizedEntryId(
		long localizedEntryId) {
		return findByLocalizedEntryId(localizedEntryId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the localized entry localizations where localizedEntryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LocalizedEntryLocalizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param localizedEntryId the localized entry ID
	 * @param start the lower bound of the range of localized entry localizations
	 * @param end the upper bound of the range of localized entry localizations (not inclusive)
	 * @return the range of matching localized entry localizations
	 */
	@Override
	public List<LocalizedEntryLocalization> findByLocalizedEntryId(
		long localizedEntryId, int start, int end) {
		return findByLocalizedEntryId(localizedEntryId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the localized entry localizations where localizedEntryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LocalizedEntryLocalizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param localizedEntryId the localized entry ID
	 * @param start the lower bound of the range of localized entry localizations
	 * @param end the upper bound of the range of localized entry localizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching localized entry localizations
	 */
	@Override
	public List<LocalizedEntryLocalization> findByLocalizedEntryId(
		long localizedEntryId, int start, int end,
		OrderByComparator<LocalizedEntryLocalization> orderByComparator) {
		return findByLocalizedEntryId(localizedEntryId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the localized entry localizations where localizedEntryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LocalizedEntryLocalizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param localizedEntryId the localized entry ID
	 * @param start the lower bound of the range of localized entry localizations
	 * @param end the upper bound of the range of localized entry localizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching localized entry localizations
	 */
	@Override
	public List<LocalizedEntryLocalization> findByLocalizedEntryId(
		long localizedEntryId, int start, int end,
		OrderByComparator<LocalizedEntryLocalization> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCALIZEDENTRYID;
			finderArgs = new Object[] { localizedEntryId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCALIZEDENTRYID;
			finderArgs = new Object[] {
					localizedEntryId,
					
					start, end, orderByComparator
				};
		}

		List<LocalizedEntryLocalization> list = null;

		if (retrieveFromCache) {
			list = (List<LocalizedEntryLocalization>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LocalizedEntryLocalization localizedEntryLocalization : list) {
					if ((localizedEntryId != localizedEntryLocalization.getLocalizedEntryId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_LOCALIZEDENTRYLOCALIZATION_WHERE);

			query.append(_FINDER_COLUMN_LOCALIZEDENTRYID_LOCALIZEDENTRYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LocalizedEntryLocalizationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(localizedEntryId);

				if (!pagination) {
					list = (List<LocalizedEntryLocalization>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LocalizedEntryLocalization>)QueryUtil.list(q,
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
	 * Returns the first localized entry localization in the ordered set where localizedEntryId = &#63;.
	 *
	 * @param localizedEntryId the localized entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching localized entry localization
	 * @throws NoSuchLocalizedEntryLocalizationException if a matching localized entry localization could not be found
	 */
	@Override
	public LocalizedEntryLocalization findByLocalizedEntryId_First(
		long localizedEntryId,
		OrderByComparator<LocalizedEntryLocalization> orderByComparator)
		throws NoSuchLocalizedEntryLocalizationException {
		LocalizedEntryLocalization localizedEntryLocalization = fetchByLocalizedEntryId_First(localizedEntryId,
				orderByComparator);

		if (localizedEntryLocalization != null) {
			return localizedEntryLocalization;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("localizedEntryId=");
		msg.append(localizedEntryId);

		msg.append("}");

		throw new NoSuchLocalizedEntryLocalizationException(msg.toString());
	}

	/**
	 * Returns the first localized entry localization in the ordered set where localizedEntryId = &#63;.
	 *
	 * @param localizedEntryId the localized entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching localized entry localization, or <code>null</code> if a matching localized entry localization could not be found
	 */
	@Override
	public LocalizedEntryLocalization fetchByLocalizedEntryId_First(
		long localizedEntryId,
		OrderByComparator<LocalizedEntryLocalization> orderByComparator) {
		List<LocalizedEntryLocalization> list = findByLocalizedEntryId(localizedEntryId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last localized entry localization in the ordered set where localizedEntryId = &#63;.
	 *
	 * @param localizedEntryId the localized entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching localized entry localization
	 * @throws NoSuchLocalizedEntryLocalizationException if a matching localized entry localization could not be found
	 */
	@Override
	public LocalizedEntryLocalization findByLocalizedEntryId_Last(
		long localizedEntryId,
		OrderByComparator<LocalizedEntryLocalization> orderByComparator)
		throws NoSuchLocalizedEntryLocalizationException {
		LocalizedEntryLocalization localizedEntryLocalization = fetchByLocalizedEntryId_Last(localizedEntryId,
				orderByComparator);

		if (localizedEntryLocalization != null) {
			return localizedEntryLocalization;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("localizedEntryId=");
		msg.append(localizedEntryId);

		msg.append("}");

		throw new NoSuchLocalizedEntryLocalizationException(msg.toString());
	}

	/**
	 * Returns the last localized entry localization in the ordered set where localizedEntryId = &#63;.
	 *
	 * @param localizedEntryId the localized entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching localized entry localization, or <code>null</code> if a matching localized entry localization could not be found
	 */
	@Override
	public LocalizedEntryLocalization fetchByLocalizedEntryId_Last(
		long localizedEntryId,
		OrderByComparator<LocalizedEntryLocalization> orderByComparator) {
		int count = countByLocalizedEntryId(localizedEntryId);

		if (count == 0) {
			return null;
		}

		List<LocalizedEntryLocalization> list = findByLocalizedEntryId(localizedEntryId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the localized entry localizations before and after the current localized entry localization in the ordered set where localizedEntryId = &#63;.
	 *
	 * @param localizedEntryLocalizationId the primary key of the current localized entry localization
	 * @param localizedEntryId the localized entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next localized entry localization
	 * @throws NoSuchLocalizedEntryLocalizationException if a localized entry localization with the primary key could not be found
	 */
	@Override
	public LocalizedEntryLocalization[] findByLocalizedEntryId_PrevAndNext(
		long localizedEntryLocalizationId, long localizedEntryId,
		OrderByComparator<LocalizedEntryLocalization> orderByComparator)
		throws NoSuchLocalizedEntryLocalizationException {
		LocalizedEntryLocalization localizedEntryLocalization = findByPrimaryKey(localizedEntryLocalizationId);

		Session session = null;

		try {
			session = openSession();

			LocalizedEntryLocalization[] array = new LocalizedEntryLocalizationImpl[3];

			array[0] = getByLocalizedEntryId_PrevAndNext(session,
					localizedEntryLocalization, localizedEntryId,
					orderByComparator, true);

			array[1] = localizedEntryLocalization;

			array[2] = getByLocalizedEntryId_PrevAndNext(session,
					localizedEntryLocalization, localizedEntryId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LocalizedEntryLocalization getByLocalizedEntryId_PrevAndNext(
		Session session, LocalizedEntryLocalization localizedEntryLocalization,
		long localizedEntryId,
		OrderByComparator<LocalizedEntryLocalization> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LOCALIZEDENTRYLOCALIZATION_WHERE);

		query.append(_FINDER_COLUMN_LOCALIZEDENTRYID_LOCALIZEDENTRYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(LocalizedEntryLocalizationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(localizedEntryId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(localizedEntryLocalization);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LocalizedEntryLocalization> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the localized entry localizations where localizedEntryId = &#63; from the database.
	 *
	 * @param localizedEntryId the localized entry ID
	 */
	@Override
	public void removeByLocalizedEntryId(long localizedEntryId) {
		for (LocalizedEntryLocalization localizedEntryLocalization : findByLocalizedEntryId(
				localizedEntryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(localizedEntryLocalization);
		}
	}

	/**
	 * Returns the number of localized entry localizations where localizedEntryId = &#63;.
	 *
	 * @param localizedEntryId the localized entry ID
	 * @return the number of matching localized entry localizations
	 */
	@Override
	public int countByLocalizedEntryId(long localizedEntryId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOCALIZEDENTRYID;

		Object[] finderArgs = new Object[] { localizedEntryId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LOCALIZEDENTRYLOCALIZATION_WHERE);

			query.append(_FINDER_COLUMN_LOCALIZEDENTRYID_LOCALIZEDENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(localizedEntryId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_LOCALIZEDENTRYID_LOCALIZEDENTRYID_2 =
		"localizedEntryLocalization.localizedEntryId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_LOCALIZEDENTRYID_LANGUAGEID =
		new FinderPath(LocalizedEntryLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			LocalizedEntryLocalizationModelImpl.FINDER_CACHE_ENABLED,
			LocalizedEntryLocalizationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByLocalizedEntryId_LanguageId",
			new String[] { Long.class.getName(), String.class.getName() },
			LocalizedEntryLocalizationModelImpl.LOCALIZEDENTRYID_COLUMN_BITMASK |
			LocalizedEntryLocalizationModelImpl.LANGUAGEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOCALIZEDENTRYID_LANGUAGEID =
		new FinderPath(LocalizedEntryLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			LocalizedEntryLocalizationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByLocalizedEntryId_LanguageId",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the localized entry localization where localizedEntryId = &#63; and languageId = &#63; or throws a {@link NoSuchLocalizedEntryLocalizationException} if it could not be found.
	 *
	 * @param localizedEntryId the localized entry ID
	 * @param languageId the language ID
	 * @return the matching localized entry localization
	 * @throws NoSuchLocalizedEntryLocalizationException if a matching localized entry localization could not be found
	 */
	@Override
	public LocalizedEntryLocalization findByLocalizedEntryId_LanguageId(
		long localizedEntryId, String languageId)
		throws NoSuchLocalizedEntryLocalizationException {
		LocalizedEntryLocalization localizedEntryLocalization = fetchByLocalizedEntryId_LanguageId(localizedEntryId,
				languageId);

		if (localizedEntryLocalization == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("localizedEntryId=");
			msg.append(localizedEntryId);

			msg.append(", languageId=");
			msg.append(languageId);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchLocalizedEntryLocalizationException(msg.toString());
		}

		return localizedEntryLocalization;
	}

	/**
	 * Returns the localized entry localization where localizedEntryId = &#63; and languageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param localizedEntryId the localized entry ID
	 * @param languageId the language ID
	 * @return the matching localized entry localization, or <code>null</code> if a matching localized entry localization could not be found
	 */
	@Override
	public LocalizedEntryLocalization fetchByLocalizedEntryId_LanguageId(
		long localizedEntryId, String languageId) {
		return fetchByLocalizedEntryId_LanguageId(localizedEntryId, languageId,
			true);
	}

	/**
	 * Returns the localized entry localization where localizedEntryId = &#63; and languageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param localizedEntryId the localized entry ID
	 * @param languageId the language ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching localized entry localization, or <code>null</code> if a matching localized entry localization could not be found
	 */
	@Override
	public LocalizedEntryLocalization fetchByLocalizedEntryId_LanguageId(
		long localizedEntryId, String languageId, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { localizedEntryId, languageId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_LOCALIZEDENTRYID_LANGUAGEID,
					finderArgs, this);
		}

		if (result instanceof LocalizedEntryLocalization) {
			LocalizedEntryLocalization localizedEntryLocalization = (LocalizedEntryLocalization)result;

			if ((localizedEntryId != localizedEntryLocalization.getLocalizedEntryId()) ||
					!Objects.equals(languageId,
						localizedEntryLocalization.getLanguageId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_LOCALIZEDENTRYLOCALIZATION_WHERE);

			query.append(_FINDER_COLUMN_LOCALIZEDENTRYID_LANGUAGEID_LOCALIZEDENTRYID_2);

			boolean bindLanguageId = false;

			if (languageId == null) {
				query.append(_FINDER_COLUMN_LOCALIZEDENTRYID_LANGUAGEID_LANGUAGEID_1);
			}
			else if (languageId.equals("")) {
				query.append(_FINDER_COLUMN_LOCALIZEDENTRYID_LANGUAGEID_LANGUAGEID_3);
			}
			else {
				bindLanguageId = true;

				query.append(_FINDER_COLUMN_LOCALIZEDENTRYID_LANGUAGEID_LANGUAGEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(localizedEntryId);

				if (bindLanguageId) {
					qPos.add(languageId);
				}

				List<LocalizedEntryLocalization> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_LOCALIZEDENTRYID_LANGUAGEID,
						finderArgs, list);
				}
				else {
					LocalizedEntryLocalization localizedEntryLocalization = list.get(0);

					result = localizedEntryLocalization;

					cacheResult(localizedEntryLocalization);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_LOCALIZEDENTRYID_LANGUAGEID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (LocalizedEntryLocalization)result;
		}
	}

	/**
	 * Removes the localized entry localization where localizedEntryId = &#63; and languageId = &#63; from the database.
	 *
	 * @param localizedEntryId the localized entry ID
	 * @param languageId the language ID
	 * @return the localized entry localization that was removed
	 */
	@Override
	public LocalizedEntryLocalization removeByLocalizedEntryId_LanguageId(
		long localizedEntryId, String languageId)
		throws NoSuchLocalizedEntryLocalizationException {
		LocalizedEntryLocalization localizedEntryLocalization = findByLocalizedEntryId_LanguageId(localizedEntryId,
				languageId);

		return remove(localizedEntryLocalization);
	}

	/**
	 * Returns the number of localized entry localizations where localizedEntryId = &#63; and languageId = &#63;.
	 *
	 * @param localizedEntryId the localized entry ID
	 * @param languageId the language ID
	 * @return the number of matching localized entry localizations
	 */
	@Override
	public int countByLocalizedEntryId_LanguageId(long localizedEntryId,
		String languageId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOCALIZEDENTRYID_LANGUAGEID;

		Object[] finderArgs = new Object[] { localizedEntryId, languageId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LOCALIZEDENTRYLOCALIZATION_WHERE);

			query.append(_FINDER_COLUMN_LOCALIZEDENTRYID_LANGUAGEID_LOCALIZEDENTRYID_2);

			boolean bindLanguageId = false;

			if (languageId == null) {
				query.append(_FINDER_COLUMN_LOCALIZEDENTRYID_LANGUAGEID_LANGUAGEID_1);
			}
			else if (languageId.equals("")) {
				query.append(_FINDER_COLUMN_LOCALIZEDENTRYID_LANGUAGEID_LANGUAGEID_3);
			}
			else {
				bindLanguageId = true;

				query.append(_FINDER_COLUMN_LOCALIZEDENTRYID_LANGUAGEID_LANGUAGEID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(localizedEntryId);

				if (bindLanguageId) {
					qPos.add(languageId);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_LOCALIZEDENTRYID_LANGUAGEID_LOCALIZEDENTRYID_2 =
		"localizedEntryLocalization.localizedEntryId = ? AND ";
	private static final String _FINDER_COLUMN_LOCALIZEDENTRYID_LANGUAGEID_LANGUAGEID_1 =
		"localizedEntryLocalization.languageId IS NULL";
	private static final String _FINDER_COLUMN_LOCALIZEDENTRYID_LANGUAGEID_LANGUAGEID_2 =
		"localizedEntryLocalization.languageId = ?";
	private static final String _FINDER_COLUMN_LOCALIZEDENTRYID_LANGUAGEID_LANGUAGEID_3 =
		"(localizedEntryLocalization.languageId IS NULL OR localizedEntryLocalization.languageId = '')";

	public LocalizedEntryLocalizationPersistenceImpl() {
		setModelClass(LocalizedEntryLocalization.class);
	}

	/**
	 * Caches the localized entry localization in the entity cache if it is enabled.
	 *
	 * @param localizedEntryLocalization the localized entry localization
	 */
	@Override
	public void cacheResult(
		LocalizedEntryLocalization localizedEntryLocalization) {
		entityCache.putResult(LocalizedEntryLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			LocalizedEntryLocalizationImpl.class,
			localizedEntryLocalization.getPrimaryKey(),
			localizedEntryLocalization);

		finderCache.putResult(FINDER_PATH_FETCH_BY_LOCALIZEDENTRYID_LANGUAGEID,
			new Object[] {
				localizedEntryLocalization.getLocalizedEntryId(),
				localizedEntryLocalization.getLanguageId()
			}, localizedEntryLocalization);

		localizedEntryLocalization.resetOriginalValues();
	}

	/**
	 * Caches the localized entry localizations in the entity cache if it is enabled.
	 *
	 * @param localizedEntryLocalizations the localized entry localizations
	 */
	@Override
	public void cacheResult(
		List<LocalizedEntryLocalization> localizedEntryLocalizations) {
		for (LocalizedEntryLocalization localizedEntryLocalization : localizedEntryLocalizations) {
			if (entityCache.getResult(
						LocalizedEntryLocalizationModelImpl.ENTITY_CACHE_ENABLED,
						LocalizedEntryLocalizationImpl.class,
						localizedEntryLocalization.getPrimaryKey()) == null) {
				cacheResult(localizedEntryLocalization);
			}
			else {
				localizedEntryLocalization.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all localized entry localizations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LocalizedEntryLocalizationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the localized entry localization.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		LocalizedEntryLocalization localizedEntryLocalization) {
		entityCache.removeResult(LocalizedEntryLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			LocalizedEntryLocalizationImpl.class,
			localizedEntryLocalization.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((LocalizedEntryLocalizationModelImpl)localizedEntryLocalization,
			true);
	}

	@Override
	public void clearCache(
		List<LocalizedEntryLocalization> localizedEntryLocalizations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LocalizedEntryLocalization localizedEntryLocalization : localizedEntryLocalizations) {
			entityCache.removeResult(LocalizedEntryLocalizationModelImpl.ENTITY_CACHE_ENABLED,
				LocalizedEntryLocalizationImpl.class,
				localizedEntryLocalization.getPrimaryKey());

			clearUniqueFindersCache((LocalizedEntryLocalizationModelImpl)localizedEntryLocalization,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		LocalizedEntryLocalizationModelImpl localizedEntryLocalizationModelImpl) {
		Object[] args = new Object[] {
				localizedEntryLocalizationModelImpl.getLocalizedEntryId(),
				localizedEntryLocalizationModelImpl.getLanguageId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_LOCALIZEDENTRYID_LANGUAGEID,
			args, Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_LOCALIZEDENTRYID_LANGUAGEID,
			args, localizedEntryLocalizationModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		LocalizedEntryLocalizationModelImpl localizedEntryLocalizationModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					localizedEntryLocalizationModelImpl.getLocalizedEntryId(),
					localizedEntryLocalizationModelImpl.getLanguageId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_LOCALIZEDENTRYID_LANGUAGEID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_LOCALIZEDENTRYID_LANGUAGEID,
				args);
		}

		if ((localizedEntryLocalizationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_LOCALIZEDENTRYID_LANGUAGEID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					localizedEntryLocalizationModelImpl.getOriginalLocalizedEntryId(),
					localizedEntryLocalizationModelImpl.getOriginalLanguageId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_LOCALIZEDENTRYID_LANGUAGEID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_LOCALIZEDENTRYID_LANGUAGEID,
				args);
		}
	}

	/**
	 * Creates a new localized entry localization with the primary key. Does not add the localized entry localization to the database.
	 *
	 * @param localizedEntryLocalizationId the primary key for the new localized entry localization
	 * @return the new localized entry localization
	 */
	@Override
	public LocalizedEntryLocalization create(long localizedEntryLocalizationId) {
		LocalizedEntryLocalization localizedEntryLocalization = new LocalizedEntryLocalizationImpl();

		localizedEntryLocalization.setNew(true);
		localizedEntryLocalization.setPrimaryKey(localizedEntryLocalizationId);

		return localizedEntryLocalization;
	}

	/**
	 * Removes the localized entry localization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param localizedEntryLocalizationId the primary key of the localized entry localization
	 * @return the localized entry localization that was removed
	 * @throws NoSuchLocalizedEntryLocalizationException if a localized entry localization with the primary key could not be found
	 */
	@Override
	public LocalizedEntryLocalization remove(long localizedEntryLocalizationId)
		throws NoSuchLocalizedEntryLocalizationException {
		return remove((Serializable)localizedEntryLocalizationId);
	}

	/**
	 * Removes the localized entry localization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the localized entry localization
	 * @return the localized entry localization that was removed
	 * @throws NoSuchLocalizedEntryLocalizationException if a localized entry localization with the primary key could not be found
	 */
	@Override
	public LocalizedEntryLocalization remove(Serializable primaryKey)
		throws NoSuchLocalizedEntryLocalizationException {
		Session session = null;

		try {
			session = openSession();

			LocalizedEntryLocalization localizedEntryLocalization = (LocalizedEntryLocalization)session.get(LocalizedEntryLocalizationImpl.class,
					primaryKey);

			if (localizedEntryLocalization == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLocalizedEntryLocalizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(localizedEntryLocalization);
		}
		catch (NoSuchLocalizedEntryLocalizationException nsee) {
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
	protected LocalizedEntryLocalization removeImpl(
		LocalizedEntryLocalization localizedEntryLocalization) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(localizedEntryLocalization)) {
				localizedEntryLocalization = (LocalizedEntryLocalization)session.get(LocalizedEntryLocalizationImpl.class,
						localizedEntryLocalization.getPrimaryKeyObj());
			}

			if (localizedEntryLocalization != null) {
				session.delete(localizedEntryLocalization);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (localizedEntryLocalization != null) {
			clearCache(localizedEntryLocalization);
		}

		return localizedEntryLocalization;
	}

	@Override
	public LocalizedEntryLocalization updateImpl(
		LocalizedEntryLocalization localizedEntryLocalization) {
		boolean isNew = localizedEntryLocalization.isNew();

		if (!(localizedEntryLocalization instanceof LocalizedEntryLocalizationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(localizedEntryLocalization.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(localizedEntryLocalization);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in localizedEntryLocalization proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom LocalizedEntryLocalization implementation " +
				localizedEntryLocalization.getClass());
		}

		LocalizedEntryLocalizationModelImpl localizedEntryLocalizationModelImpl = (LocalizedEntryLocalizationModelImpl)localizedEntryLocalization;

		Session session = null;

		try {
			session = openSession();

			if (localizedEntryLocalization.isNew()) {
				session.save(localizedEntryLocalization);

				localizedEntryLocalization.setNew(false);
			}
			else {
				localizedEntryLocalization = (LocalizedEntryLocalization)session.merge(localizedEntryLocalization);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!LocalizedEntryLocalizationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					localizedEntryLocalizationModelImpl.getLocalizedEntryId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_LOCALIZEDENTRYID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCALIZEDENTRYID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((localizedEntryLocalizationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCALIZEDENTRYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						localizedEntryLocalizationModelImpl.getOriginalLocalizedEntryId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOCALIZEDENTRYID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCALIZEDENTRYID,
					args);

				args = new Object[] {
						localizedEntryLocalizationModelImpl.getLocalizedEntryId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOCALIZEDENTRYID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCALIZEDENTRYID,
					args);
			}
		}

		entityCache.putResult(LocalizedEntryLocalizationModelImpl.ENTITY_CACHE_ENABLED,
			LocalizedEntryLocalizationImpl.class,
			localizedEntryLocalization.getPrimaryKey(),
			localizedEntryLocalization, false);

		clearUniqueFindersCache(localizedEntryLocalizationModelImpl, false);
		cacheUniqueFindersCache(localizedEntryLocalizationModelImpl);

		localizedEntryLocalization.resetOriginalValues();

		return localizedEntryLocalization;
	}

	/**
	 * Returns the localized entry localization with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the localized entry localization
	 * @return the localized entry localization
	 * @throws NoSuchLocalizedEntryLocalizationException if a localized entry localization with the primary key could not be found
	 */
	@Override
	public LocalizedEntryLocalization findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLocalizedEntryLocalizationException {
		LocalizedEntryLocalization localizedEntryLocalization = fetchByPrimaryKey(primaryKey);

		if (localizedEntryLocalization == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLocalizedEntryLocalizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return localizedEntryLocalization;
	}

	/**
	 * Returns the localized entry localization with the primary key or throws a {@link NoSuchLocalizedEntryLocalizationException} if it could not be found.
	 *
	 * @param localizedEntryLocalizationId the primary key of the localized entry localization
	 * @return the localized entry localization
	 * @throws NoSuchLocalizedEntryLocalizationException if a localized entry localization with the primary key could not be found
	 */
	@Override
	public LocalizedEntryLocalization findByPrimaryKey(
		long localizedEntryLocalizationId)
		throws NoSuchLocalizedEntryLocalizationException {
		return findByPrimaryKey((Serializable)localizedEntryLocalizationId);
	}

	/**
	 * Returns the localized entry localization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the localized entry localization
	 * @return the localized entry localization, or <code>null</code> if a localized entry localization with the primary key could not be found
	 */
	@Override
	public LocalizedEntryLocalization fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(LocalizedEntryLocalizationModelImpl.ENTITY_CACHE_ENABLED,
				LocalizedEntryLocalizationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		LocalizedEntryLocalization localizedEntryLocalization = (LocalizedEntryLocalization)serializable;

		if (localizedEntryLocalization == null) {
			Session session = null;

			try {
				session = openSession();

				localizedEntryLocalization = (LocalizedEntryLocalization)session.get(LocalizedEntryLocalizationImpl.class,
						primaryKey);

				if (localizedEntryLocalization != null) {
					cacheResult(localizedEntryLocalization);
				}
				else {
					entityCache.putResult(LocalizedEntryLocalizationModelImpl.ENTITY_CACHE_ENABLED,
						LocalizedEntryLocalizationImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(LocalizedEntryLocalizationModelImpl.ENTITY_CACHE_ENABLED,
					LocalizedEntryLocalizationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return localizedEntryLocalization;
	}

	/**
	 * Returns the localized entry localization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param localizedEntryLocalizationId the primary key of the localized entry localization
	 * @return the localized entry localization, or <code>null</code> if a localized entry localization with the primary key could not be found
	 */
	@Override
	public LocalizedEntryLocalization fetchByPrimaryKey(
		long localizedEntryLocalizationId) {
		return fetchByPrimaryKey((Serializable)localizedEntryLocalizationId);
	}

	@Override
	public Map<Serializable, LocalizedEntryLocalization> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, LocalizedEntryLocalization> map = new HashMap<Serializable, LocalizedEntryLocalization>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			LocalizedEntryLocalization localizedEntryLocalization = fetchByPrimaryKey(primaryKey);

			if (localizedEntryLocalization != null) {
				map.put(primaryKey, localizedEntryLocalization);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(LocalizedEntryLocalizationModelImpl.ENTITY_CACHE_ENABLED,
					LocalizedEntryLocalizationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (LocalizedEntryLocalization)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_LOCALIZEDENTRYLOCALIZATION_WHERE_PKS_IN);

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

			for (LocalizedEntryLocalization localizedEntryLocalization : (List<LocalizedEntryLocalization>)q.list()) {
				map.put(localizedEntryLocalization.getPrimaryKeyObj(),
					localizedEntryLocalization);

				cacheResult(localizedEntryLocalization);

				uncachedPrimaryKeys.remove(localizedEntryLocalization.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(LocalizedEntryLocalizationModelImpl.ENTITY_CACHE_ENABLED,
					LocalizedEntryLocalizationImpl.class, primaryKey, nullModel);
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
	 * Returns all the localized entry localizations.
	 *
	 * @return the localized entry localizations
	 */
	@Override
	public List<LocalizedEntryLocalization> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the localized entry localizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LocalizedEntryLocalizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of localized entry localizations
	 * @param end the upper bound of the range of localized entry localizations (not inclusive)
	 * @return the range of localized entry localizations
	 */
	@Override
	public List<LocalizedEntryLocalization> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the localized entry localizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LocalizedEntryLocalizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of localized entry localizations
	 * @param end the upper bound of the range of localized entry localizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of localized entry localizations
	 */
	@Override
	public List<LocalizedEntryLocalization> findAll(int start, int end,
		OrderByComparator<LocalizedEntryLocalization> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the localized entry localizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LocalizedEntryLocalizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of localized entry localizations
	 * @param end the upper bound of the range of localized entry localizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of localized entry localizations
	 */
	@Override
	public List<LocalizedEntryLocalization> findAll(int start, int end,
		OrderByComparator<LocalizedEntryLocalization> orderByComparator,
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

		List<LocalizedEntryLocalization> list = null;

		if (retrieveFromCache) {
			list = (List<LocalizedEntryLocalization>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LOCALIZEDENTRYLOCALIZATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LOCALIZEDENTRYLOCALIZATION;

				if (pagination) {
					sql = sql.concat(LocalizedEntryLocalizationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LocalizedEntryLocalization>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LocalizedEntryLocalization>)QueryUtil.list(q,
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
	 * Removes all the localized entry localizations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LocalizedEntryLocalization localizedEntryLocalization : findAll()) {
			remove(localizedEntryLocalization);
		}
	}

	/**
	 * Returns the number of localized entry localizations.
	 *
	 * @return the number of localized entry localizations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LOCALIZEDENTRYLOCALIZATION);

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
		return LocalizedEntryLocalizationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the localized entry localization persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(LocalizedEntryLocalizationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_LOCALIZEDENTRYLOCALIZATION = "SELECT localizedEntryLocalization FROM LocalizedEntryLocalization localizedEntryLocalization";
	private static final String _SQL_SELECT_LOCALIZEDENTRYLOCALIZATION_WHERE_PKS_IN =
		"SELECT localizedEntryLocalization FROM LocalizedEntryLocalization localizedEntryLocalization WHERE localizedEntryLocalizationId IN (";
	private static final String _SQL_SELECT_LOCALIZEDENTRYLOCALIZATION_WHERE = "SELECT localizedEntryLocalization FROM LocalizedEntryLocalization localizedEntryLocalization WHERE ";
	private static final String _SQL_COUNT_LOCALIZEDENTRYLOCALIZATION = "SELECT COUNT(localizedEntryLocalization) FROM LocalizedEntryLocalization localizedEntryLocalization";
	private static final String _SQL_COUNT_LOCALIZEDENTRYLOCALIZATION_WHERE = "SELECT COUNT(localizedEntryLocalization) FROM LocalizedEntryLocalization localizedEntryLocalization WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "localizedEntryLocalization.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LocalizedEntryLocalization exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LocalizedEntryLocalization exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(LocalizedEntryLocalizationPersistenceImpl.class);
}