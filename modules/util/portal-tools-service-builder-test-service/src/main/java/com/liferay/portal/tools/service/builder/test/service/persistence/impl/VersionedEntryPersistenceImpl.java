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
import com.liferay.portal.tools.service.builder.test.exception.NoSuchVersionedEntryException;
import com.liferay.portal.tools.service.builder.test.model.VersionedEntry;
import com.liferay.portal.tools.service.builder.test.model.impl.VersionedEntryImpl;
import com.liferay.portal.tools.service.builder.test.model.impl.VersionedEntryModelImpl;
import com.liferay.portal.tools.service.builder.test.service.persistence.VersionedEntryPersistence;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the versioned entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VersionedEntryPersistence
 * @see com.liferay.portal.tools.service.builder.test.service.persistence.VersionedEntryUtil
 * @generated
 */
@ProviderType
public class VersionedEntryPersistenceImpl extends BasePersistenceImpl<VersionedEntry>
	implements VersionedEntryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VersionedEntryUtil} to access the versioned entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VersionedEntryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VersionedEntryModelImpl.ENTITY_CACHE_ENABLED,
			VersionedEntryModelImpl.FINDER_CACHE_ENABLED,
			VersionedEntryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VersionedEntryModelImpl.ENTITY_CACHE_ENABLED,
			VersionedEntryModelImpl.FINDER_CACHE_ENABLED,
			VersionedEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VersionedEntryModelImpl.ENTITY_CACHE_ENABLED,
			VersionedEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(VersionedEntryModelImpl.ENTITY_CACHE_ENABLED,
			VersionedEntryModelImpl.FINDER_CACHE_ENABLED,
			VersionedEntryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(VersionedEntryModelImpl.ENTITY_CACHE_ENABLED,
			VersionedEntryModelImpl.FINDER_CACHE_ENABLED,
			VersionedEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			VersionedEntryModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VersionedEntryModelImpl.ENTITY_CACHE_ENABLED,
			VersionedEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the versioned entries where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching versioned entries
	 */
	@Override
	public List<VersionedEntry> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the versioned entries where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VersionedEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of versioned entries
	 * @param end the upper bound of the range of versioned entries (not inclusive)
	 * @return the range of matching versioned entries
	 */
	@Override
	public List<VersionedEntry> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the versioned entries where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VersionedEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of versioned entries
	 * @param end the upper bound of the range of versioned entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching versioned entries
	 */
	@Override
	public List<VersionedEntry> findByGroupId(long groupId, int start, int end,
		OrderByComparator<VersionedEntry> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the versioned entries where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VersionedEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of versioned entries
	 * @param end the upper bound of the range of versioned entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching versioned entries
	 */
	@Override
	public List<VersionedEntry> findByGroupId(long groupId, int start, int end,
		OrderByComparator<VersionedEntry> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<VersionedEntry> list = null;

		if (retrieveFromCache) {
			list = (List<VersionedEntry>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VersionedEntry versionedEntry : list) {
					if ((groupId != versionedEntry.getGroupId())) {
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

			query.append(_SQL_SELECT_VERSIONEDENTRY_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VersionedEntryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<VersionedEntry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VersionedEntry>)QueryUtil.list(q,
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
	 * Returns the first versioned entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching versioned entry
	 * @throws NoSuchVersionedEntryException if a matching versioned entry could not be found
	 */
	@Override
	public VersionedEntry findByGroupId_First(long groupId,
		OrderByComparator<VersionedEntry> orderByComparator)
		throws NoSuchVersionedEntryException {
		VersionedEntry versionedEntry = fetchByGroupId_First(groupId,
				orderByComparator);

		if (versionedEntry != null) {
			return versionedEntry;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchVersionedEntryException(msg.toString());
	}

	/**
	 * Returns the first versioned entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching versioned entry, or <code>null</code> if a matching versioned entry could not be found
	 */
	@Override
	public VersionedEntry fetchByGroupId_First(long groupId,
		OrderByComparator<VersionedEntry> orderByComparator) {
		List<VersionedEntry> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last versioned entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching versioned entry
	 * @throws NoSuchVersionedEntryException if a matching versioned entry could not be found
	 */
	@Override
	public VersionedEntry findByGroupId_Last(long groupId,
		OrderByComparator<VersionedEntry> orderByComparator)
		throws NoSuchVersionedEntryException {
		VersionedEntry versionedEntry = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (versionedEntry != null) {
			return versionedEntry;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchVersionedEntryException(msg.toString());
	}

	/**
	 * Returns the last versioned entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching versioned entry, or <code>null</code> if a matching versioned entry could not be found
	 */
	@Override
	public VersionedEntry fetchByGroupId_Last(long groupId,
		OrderByComparator<VersionedEntry> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<VersionedEntry> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the versioned entries before and after the current versioned entry in the ordered set where groupId = &#63;.
	 *
	 * @param versionedEntryId the primary key of the current versioned entry
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next versioned entry
	 * @throws NoSuchVersionedEntryException if a versioned entry with the primary key could not be found
	 */
	@Override
	public VersionedEntry[] findByGroupId_PrevAndNext(long versionedEntryId,
		long groupId, OrderByComparator<VersionedEntry> orderByComparator)
		throws NoSuchVersionedEntryException {
		VersionedEntry versionedEntry = findByPrimaryKey(versionedEntryId);

		Session session = null;

		try {
			session = openSession();

			VersionedEntry[] array = new VersionedEntryImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, versionedEntry,
					groupId, orderByComparator, true);

			array[1] = versionedEntry;

			array[2] = getByGroupId_PrevAndNext(session, versionedEntry,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VersionedEntry getByGroupId_PrevAndNext(Session session,
		VersionedEntry versionedEntry, long groupId,
		OrderByComparator<VersionedEntry> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VERSIONEDENTRY_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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
			query.append(VersionedEntryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(versionedEntry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VersionedEntry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the versioned entries where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (VersionedEntry versionedEntry : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(versionedEntry);
		}
	}

	/**
	 * Returns the number of versioned entries where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching versioned entries
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VERSIONEDENTRY_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "versionedEntry.groupId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_HEADID = new FinderPath(VersionedEntryModelImpl.ENTITY_CACHE_ENABLED,
			VersionedEntryModelImpl.FINDER_CACHE_ENABLED,
			VersionedEntryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByHeadId", new String[] { Long.class.getName() },
			VersionedEntryModelImpl.HEADID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HEADID = new FinderPath(VersionedEntryModelImpl.ENTITY_CACHE_ENABLED,
			VersionedEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHeadId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the versioned entry where headId = &#63; or throws a {@link NoSuchVersionedEntryException} if it could not be found.
	 *
	 * @param headId the head ID
	 * @return the matching versioned entry
	 * @throws NoSuchVersionedEntryException if a matching versioned entry could not be found
	 */
	@Override
	public VersionedEntry findByHeadId(long headId)
		throws NoSuchVersionedEntryException {
		VersionedEntry versionedEntry = fetchByHeadId(headId);

		if (versionedEntry == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("headId=");
			msg.append(headId);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVersionedEntryException(msg.toString());
		}

		return versionedEntry;
	}

	/**
	 * Returns the versioned entry where headId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param headId the head ID
	 * @return the matching versioned entry, or <code>null</code> if a matching versioned entry could not be found
	 */
	@Override
	public VersionedEntry fetchByHeadId(long headId) {
		return fetchByHeadId(headId, true);
	}

	/**
	 * Returns the versioned entry where headId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param headId the head ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching versioned entry, or <code>null</code> if a matching versioned entry could not be found
	 */
	@Override
	public VersionedEntry fetchByHeadId(long headId, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { headId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_HEADID,
					finderArgs, this);
		}

		if (result instanceof VersionedEntry) {
			VersionedEntry versionedEntry = (VersionedEntry)result;

			if ((headId != versionedEntry.getHeadId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VERSIONEDENTRY_WHERE);

			query.append(_FINDER_COLUMN_HEADID_HEADID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(headId);

				List<VersionedEntry> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_HEADID,
						finderArgs, list);
				}
				else {
					VersionedEntry versionedEntry = list.get(0);

					result = versionedEntry;

					cacheResult(versionedEntry);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_HEADID, finderArgs);

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
			return (VersionedEntry)result;
		}
	}

	/**
	 * Removes the versioned entry where headId = &#63; from the database.
	 *
	 * @param headId the head ID
	 * @return the versioned entry that was removed
	 */
	@Override
	public VersionedEntry removeByHeadId(long headId)
		throws NoSuchVersionedEntryException {
		VersionedEntry versionedEntry = findByHeadId(headId);

		return remove(versionedEntry);
	}

	/**
	 * Returns the number of versioned entries where headId = &#63;.
	 *
	 * @param headId the head ID
	 * @return the number of matching versioned entries
	 */
	@Override
	public int countByHeadId(long headId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HEADID;

		Object[] finderArgs = new Object[] { headId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VERSIONEDENTRY_WHERE);

			query.append(_FINDER_COLUMN_HEADID_HEADID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(headId);

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

	private static final String _FINDER_COLUMN_HEADID_HEADID_2 = "versionedEntry.headId = ?";

	public VersionedEntryPersistenceImpl() {
		setModelClass(VersionedEntry.class);
	}

	/**
	 * Caches the versioned entry in the entity cache if it is enabled.
	 *
	 * @param versionedEntry the versioned entry
	 */
	@Override
	public void cacheResult(VersionedEntry versionedEntry) {
		entityCache.putResult(VersionedEntryModelImpl.ENTITY_CACHE_ENABLED,
			VersionedEntryImpl.class, versionedEntry.getPrimaryKey(),
			versionedEntry);

		finderCache.putResult(FINDER_PATH_FETCH_BY_HEADID,
			new Object[] { versionedEntry.getHeadId() }, versionedEntry);

		versionedEntry.resetOriginalValues();
	}

	/**
	 * Caches the versioned entries in the entity cache if it is enabled.
	 *
	 * @param versionedEntries the versioned entries
	 */
	@Override
	public void cacheResult(List<VersionedEntry> versionedEntries) {
		for (VersionedEntry versionedEntry : versionedEntries) {
			if (entityCache.getResult(
						VersionedEntryModelImpl.ENTITY_CACHE_ENABLED,
						VersionedEntryImpl.class, versionedEntry.getPrimaryKey()) == null) {
				cacheResult(versionedEntry);
			}
			else {
				versionedEntry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all versioned entries.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VersionedEntryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the versioned entry.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VersionedEntry versionedEntry) {
		entityCache.removeResult(VersionedEntryModelImpl.ENTITY_CACHE_ENABLED,
			VersionedEntryImpl.class, versionedEntry.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VersionedEntryModelImpl)versionedEntry, true);
	}

	@Override
	public void clearCache(List<VersionedEntry> versionedEntries) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VersionedEntry versionedEntry : versionedEntries) {
			entityCache.removeResult(VersionedEntryModelImpl.ENTITY_CACHE_ENABLED,
				VersionedEntryImpl.class, versionedEntry.getPrimaryKey());

			clearUniqueFindersCache((VersionedEntryModelImpl)versionedEntry,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		VersionedEntryModelImpl versionedEntryModelImpl) {
		Object[] args = new Object[] { versionedEntryModelImpl.getHeadId() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_HEADID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_HEADID, args,
			versionedEntryModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VersionedEntryModelImpl versionedEntryModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] { versionedEntryModelImpl.getHeadId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_HEADID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_HEADID, args);
		}

		if ((versionedEntryModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_HEADID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					versionedEntryModelImpl.getOriginalHeadId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_HEADID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_HEADID, args);
		}
	}

	/**
	 * Creates a new versioned entry with the primary key. Does not add the versioned entry to the database.
	 *
	 * @param versionedEntryId the primary key for the new versioned entry
	 * @return the new versioned entry
	 */
	@Override
	public VersionedEntry create(long versionedEntryId) {
		VersionedEntry versionedEntry = new VersionedEntryImpl();

		versionedEntry.setNew(true);
		versionedEntry.setPrimaryKey(versionedEntryId);

		return versionedEntry;
	}

	/**
	 * Removes the versioned entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param versionedEntryId the primary key of the versioned entry
	 * @return the versioned entry that was removed
	 * @throws NoSuchVersionedEntryException if a versioned entry with the primary key could not be found
	 */
	@Override
	public VersionedEntry remove(long versionedEntryId)
		throws NoSuchVersionedEntryException {
		return remove((Serializable)versionedEntryId);
	}

	/**
	 * Removes the versioned entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the versioned entry
	 * @return the versioned entry that was removed
	 * @throws NoSuchVersionedEntryException if a versioned entry with the primary key could not be found
	 */
	@Override
	public VersionedEntry remove(Serializable primaryKey)
		throws NoSuchVersionedEntryException {
		Session session = null;

		try {
			session = openSession();

			VersionedEntry versionedEntry = (VersionedEntry)session.get(VersionedEntryImpl.class,
					primaryKey);

			if (versionedEntry == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVersionedEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(versionedEntry);
		}
		catch (NoSuchVersionedEntryException nsee) {
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
	protected VersionedEntry removeImpl(VersionedEntry versionedEntry) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(versionedEntry)) {
				versionedEntry = (VersionedEntry)session.get(VersionedEntryImpl.class,
						versionedEntry.getPrimaryKeyObj());
			}

			if (versionedEntry != null) {
				session.delete(versionedEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (versionedEntry != null) {
			clearCache(versionedEntry);
		}

		return versionedEntry;
	}

	@Override
	public VersionedEntry updateImpl(VersionedEntry versionedEntry) {
		boolean isNew = versionedEntry.isNew();

		if (!(versionedEntry instanceof VersionedEntryModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(versionedEntry.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(versionedEntry);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in versionedEntry proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom VersionedEntry implementation " +
				versionedEntry.getClass());
		}

		VersionedEntryModelImpl versionedEntryModelImpl = (VersionedEntryModelImpl)versionedEntry;

		Session session = null;

		try {
			session = openSession();

			if (versionedEntry.isNew()) {
				session.save(versionedEntry);

				versionedEntry.setNew(false);
			}
			else {
				versionedEntry = (VersionedEntry)session.merge(versionedEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!VersionedEntryModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { versionedEntryModelImpl.getGroupId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((versionedEntryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						versionedEntryModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { versionedEntryModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}
		}

		entityCache.putResult(VersionedEntryModelImpl.ENTITY_CACHE_ENABLED,
			VersionedEntryImpl.class, versionedEntry.getPrimaryKey(),
			versionedEntry, false);

		clearUniqueFindersCache(versionedEntryModelImpl, false);
		cacheUniqueFindersCache(versionedEntryModelImpl);

		versionedEntry.resetOriginalValues();

		return versionedEntry;
	}

	/**
	 * Returns the versioned entry with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the versioned entry
	 * @return the versioned entry
	 * @throws NoSuchVersionedEntryException if a versioned entry with the primary key could not be found
	 */
	@Override
	public VersionedEntry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVersionedEntryException {
		VersionedEntry versionedEntry = fetchByPrimaryKey(primaryKey);

		if (versionedEntry == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVersionedEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return versionedEntry;
	}

	/**
	 * Returns the versioned entry with the primary key or throws a {@link NoSuchVersionedEntryException} if it could not be found.
	 *
	 * @param versionedEntryId the primary key of the versioned entry
	 * @return the versioned entry
	 * @throws NoSuchVersionedEntryException if a versioned entry with the primary key could not be found
	 */
	@Override
	public VersionedEntry findByPrimaryKey(long versionedEntryId)
		throws NoSuchVersionedEntryException {
		return findByPrimaryKey((Serializable)versionedEntryId);
	}

	/**
	 * Returns the versioned entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the versioned entry
	 * @return the versioned entry, or <code>null</code> if a versioned entry with the primary key could not be found
	 */
	@Override
	public VersionedEntry fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VersionedEntryModelImpl.ENTITY_CACHE_ENABLED,
				VersionedEntryImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VersionedEntry versionedEntry = (VersionedEntry)serializable;

		if (versionedEntry == null) {
			Session session = null;

			try {
				session = openSession();

				versionedEntry = (VersionedEntry)session.get(VersionedEntryImpl.class,
						primaryKey);

				if (versionedEntry != null) {
					cacheResult(versionedEntry);
				}
				else {
					entityCache.putResult(VersionedEntryModelImpl.ENTITY_CACHE_ENABLED,
						VersionedEntryImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VersionedEntryModelImpl.ENTITY_CACHE_ENABLED,
					VersionedEntryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return versionedEntry;
	}

	/**
	 * Returns the versioned entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param versionedEntryId the primary key of the versioned entry
	 * @return the versioned entry, or <code>null</code> if a versioned entry with the primary key could not be found
	 */
	@Override
	public VersionedEntry fetchByPrimaryKey(long versionedEntryId) {
		return fetchByPrimaryKey((Serializable)versionedEntryId);
	}

	@Override
	public Map<Serializable, VersionedEntry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VersionedEntry> map = new HashMap<Serializable, VersionedEntry>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VersionedEntry versionedEntry = fetchByPrimaryKey(primaryKey);

			if (versionedEntry != null) {
				map.put(primaryKey, versionedEntry);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VersionedEntryModelImpl.ENTITY_CACHE_ENABLED,
					VersionedEntryImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VersionedEntry)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VERSIONEDENTRY_WHERE_PKS_IN);

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

			for (VersionedEntry versionedEntry : (List<VersionedEntry>)q.list()) {
				map.put(versionedEntry.getPrimaryKeyObj(), versionedEntry);

				cacheResult(versionedEntry);

				uncachedPrimaryKeys.remove(versionedEntry.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VersionedEntryModelImpl.ENTITY_CACHE_ENABLED,
					VersionedEntryImpl.class, primaryKey, nullModel);
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
	 * Returns all the versioned entries.
	 *
	 * @return the versioned entries
	 */
	@Override
	public List<VersionedEntry> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the versioned entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VersionedEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of versioned entries
	 * @param end the upper bound of the range of versioned entries (not inclusive)
	 * @return the range of versioned entries
	 */
	@Override
	public List<VersionedEntry> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the versioned entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VersionedEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of versioned entries
	 * @param end the upper bound of the range of versioned entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of versioned entries
	 */
	@Override
	public List<VersionedEntry> findAll(int start, int end,
		OrderByComparator<VersionedEntry> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the versioned entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VersionedEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of versioned entries
	 * @param end the upper bound of the range of versioned entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of versioned entries
	 */
	@Override
	public List<VersionedEntry> findAll(int start, int end,
		OrderByComparator<VersionedEntry> orderByComparator,
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

		List<VersionedEntry> list = null;

		if (retrieveFromCache) {
			list = (List<VersionedEntry>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VERSIONEDENTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VERSIONEDENTRY;

				if (pagination) {
					sql = sql.concat(VersionedEntryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VersionedEntry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VersionedEntry>)QueryUtil.list(q,
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
	 * Removes all the versioned entries from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VersionedEntry versionedEntry : findAll()) {
			remove(versionedEntry);
		}
	}

	/**
	 * Returns the number of versioned entries.
	 *
	 * @return the number of versioned entries
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VERSIONEDENTRY);

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
		return VersionedEntryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the versioned entry persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VersionedEntryImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VERSIONEDENTRY = "SELECT versionedEntry FROM VersionedEntry versionedEntry";
	private static final String _SQL_SELECT_VERSIONEDENTRY_WHERE_PKS_IN = "SELECT versionedEntry FROM VersionedEntry versionedEntry WHERE versionedEntryId IN (";
	private static final String _SQL_SELECT_VERSIONEDENTRY_WHERE = "SELECT versionedEntry FROM VersionedEntry versionedEntry WHERE ";
	private static final String _SQL_COUNT_VERSIONEDENTRY = "SELECT COUNT(versionedEntry) FROM VersionedEntry versionedEntry";
	private static final String _SQL_COUNT_VERSIONEDENTRY_WHERE = "SELECT COUNT(versionedEntry) FROM VersionedEntry versionedEntry WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "versionedEntry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VersionedEntry exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VersionedEntry exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VersionedEntryPersistenceImpl.class);
}