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
import com.liferay.portal.tools.service.builder.test.exception.NoSuchLVEntryException;
import com.liferay.portal.tools.service.builder.test.model.LVEntry;
import com.liferay.portal.tools.service.builder.test.model.impl.LVEntryImpl;
import com.liferay.portal.tools.service.builder.test.model.impl.LVEntryModelImpl;
import com.liferay.portal.tools.service.builder.test.service.persistence.LVEntryPersistence;

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
 * The persistence implementation for the lv entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LVEntryPersistence
 * @see com.liferay.portal.tools.service.builder.test.service.persistence.LVEntryUtil
 * @generated
 */
@ProviderType
public class LVEntryPersistenceImpl extends BasePersistenceImpl<LVEntry>
	implements LVEntryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LVEntryUtil} to access the lv entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LVEntryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LVEntryModelImpl.ENTITY_CACHE_ENABLED,
			LVEntryModelImpl.FINDER_CACHE_ENABLED, LVEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LVEntryModelImpl.ENTITY_CACHE_ENABLED,
			LVEntryModelImpl.FINDER_CACHE_ENABLED, LVEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LVEntryModelImpl.ENTITY_CACHE_ENABLED,
			LVEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(LVEntryModelImpl.ENTITY_CACHE_ENABLED,
			LVEntryModelImpl.FINDER_CACHE_ENABLED, LVEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(LVEntryModelImpl.ENTITY_CACHE_ENABLED,
			LVEntryModelImpl.FINDER_CACHE_ENABLED, LVEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			LVEntryModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(LVEntryModelImpl.ENTITY_CACHE_ENABLED,
			LVEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the lv entries where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching lv entries
	 */
	@Override
	public List<LVEntry> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lv entries where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LVEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of lv entries
	 * @param end the upper bound of the range of lv entries (not inclusive)
	 * @return the range of matching lv entries
	 */
	@Override
	public List<LVEntry> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lv entries where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LVEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of lv entries
	 * @param end the upper bound of the range of lv entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lv entries
	 */
	@Override
	public List<LVEntry> findByGroupId(long groupId, int start, int end,
		OrderByComparator<LVEntry> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the lv entries where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LVEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of lv entries
	 * @param end the upper bound of the range of lv entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching lv entries
	 */
	@Override
	public List<LVEntry> findByGroupId(long groupId, int start, int end,
		OrderByComparator<LVEntry> orderByComparator, boolean retrieveFromCache) {
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

		List<LVEntry> list = null;

		if (retrieveFromCache) {
			list = (List<LVEntry>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (LVEntry lvEntry : list) {
					if ((groupId != lvEntry.getGroupId())) {
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

			query.append(_SQL_SELECT_LVENTRY_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LVEntryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<LVEntry>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LVEntry>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first lv entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lv entry
	 * @throws NoSuchLVEntryException if a matching lv entry could not be found
	 */
	@Override
	public LVEntry findByGroupId_First(long groupId,
		OrderByComparator<LVEntry> orderByComparator)
		throws NoSuchLVEntryException {
		LVEntry lvEntry = fetchByGroupId_First(groupId, orderByComparator);

		if (lvEntry != null) {
			return lvEntry;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchLVEntryException(msg.toString());
	}

	/**
	 * Returns the first lv entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lv entry, or <code>null</code> if a matching lv entry could not be found
	 */
	@Override
	public LVEntry fetchByGroupId_First(long groupId,
		OrderByComparator<LVEntry> orderByComparator) {
		List<LVEntry> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lv entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lv entry
	 * @throws NoSuchLVEntryException if a matching lv entry could not be found
	 */
	@Override
	public LVEntry findByGroupId_Last(long groupId,
		OrderByComparator<LVEntry> orderByComparator)
		throws NoSuchLVEntryException {
		LVEntry lvEntry = fetchByGroupId_Last(groupId, orderByComparator);

		if (lvEntry != null) {
			return lvEntry;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchLVEntryException(msg.toString());
	}

	/**
	 * Returns the last lv entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lv entry, or <code>null</code> if a matching lv entry could not be found
	 */
	@Override
	public LVEntry fetchByGroupId_Last(long groupId,
		OrderByComparator<LVEntry> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<LVEntry> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lv entries before and after the current lv entry in the ordered set where groupId = &#63;.
	 *
	 * @param lvEntryId the primary key of the current lv entry
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lv entry
	 * @throws NoSuchLVEntryException if a lv entry with the primary key could not be found
	 */
	@Override
	public LVEntry[] findByGroupId_PrevAndNext(long lvEntryId, long groupId,
		OrderByComparator<LVEntry> orderByComparator)
		throws NoSuchLVEntryException {
		LVEntry lvEntry = findByPrimaryKey(lvEntryId);

		Session session = null;

		try {
			session = openSession();

			LVEntry[] array = new LVEntryImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, lvEntry, groupId,
					orderByComparator, true);

			array[1] = lvEntry;

			array[2] = getByGroupId_PrevAndNext(session, lvEntry, groupId,
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

	protected LVEntry getByGroupId_PrevAndNext(Session session,
		LVEntry lvEntry, long groupId,
		OrderByComparator<LVEntry> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LVENTRY_WHERE);

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
			query.append(LVEntryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lvEntry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LVEntry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lv entries where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (LVEntry lvEntry : findByGroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(lvEntry);
		}
	}

	/**
	 * Returns the number of lv entries where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching lv entries
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LVENTRY_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "lvEntry.groupId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_HEADID = new FinderPath(LVEntryModelImpl.ENTITY_CACHE_ENABLED,
			LVEntryModelImpl.FINDER_CACHE_ENABLED, LVEntryImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByHeadId",
			new String[] { Long.class.getName() },
			LVEntryModelImpl.HEADID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HEADID = new FinderPath(LVEntryModelImpl.ENTITY_CACHE_ENABLED,
			LVEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHeadId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the lv entry where headId = &#63; or throws a {@link NoSuchLVEntryException} if it could not be found.
	 *
	 * @param headId the head ID
	 * @return the matching lv entry
	 * @throws NoSuchLVEntryException if a matching lv entry could not be found
	 */
	@Override
	public LVEntry findByHeadId(long headId) throws NoSuchLVEntryException {
		LVEntry lvEntry = fetchByHeadId(headId);

		if (lvEntry == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("headId=");
			msg.append(headId);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchLVEntryException(msg.toString());
		}

		return lvEntry;
	}

	/**
	 * Returns the lv entry where headId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param headId the head ID
	 * @return the matching lv entry, or <code>null</code> if a matching lv entry could not be found
	 */
	@Override
	public LVEntry fetchByHeadId(long headId) {
		return fetchByHeadId(headId, true);
	}

	/**
	 * Returns the lv entry where headId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param headId the head ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching lv entry, or <code>null</code> if a matching lv entry could not be found
	 */
	@Override
	public LVEntry fetchByHeadId(long headId, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { headId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_HEADID,
					finderArgs, this);
		}

		if (result instanceof LVEntry) {
			LVEntry lvEntry = (LVEntry)result;

			if ((headId != lvEntry.getHeadId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_LVENTRY_WHERE);

			query.append(_FINDER_COLUMN_HEADID_HEADID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(headId);

				List<LVEntry> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_HEADID,
						finderArgs, list);
				}
				else {
					LVEntry lvEntry = list.get(0);

					result = lvEntry;

					cacheResult(lvEntry);
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
			return (LVEntry)result;
		}
	}

	/**
	 * Removes the lv entry where headId = &#63; from the database.
	 *
	 * @param headId the head ID
	 * @return the lv entry that was removed
	 */
	@Override
	public LVEntry removeByHeadId(long headId) throws NoSuchLVEntryException {
		LVEntry lvEntry = findByHeadId(headId);

		return remove(lvEntry);
	}

	/**
	 * Returns the number of lv entries where headId = &#63;.
	 *
	 * @param headId the head ID
	 * @return the number of matching lv entries
	 */
	@Override
	public int countByHeadId(long headId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HEADID;

		Object[] finderArgs = new Object[] { headId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LVENTRY_WHERE);

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

	private static final String _FINDER_COLUMN_HEADID_HEADID_2 = "lvEntry.headId = ?";

	public LVEntryPersistenceImpl() {
		setModelClass(LVEntry.class);
	}

	/**
	 * Caches the lv entry in the entity cache if it is enabled.
	 *
	 * @param lvEntry the lv entry
	 */
	@Override
	public void cacheResult(LVEntry lvEntry) {
		entityCache.putResult(LVEntryModelImpl.ENTITY_CACHE_ENABLED,
			LVEntryImpl.class, lvEntry.getPrimaryKey(), lvEntry);

		finderCache.putResult(FINDER_PATH_FETCH_BY_HEADID,
			new Object[] { lvEntry.getHeadId() }, lvEntry);

		lvEntry.resetOriginalValues();
	}

	/**
	 * Caches the lv entries in the entity cache if it is enabled.
	 *
	 * @param lvEntries the lv entries
	 */
	@Override
	public void cacheResult(List<LVEntry> lvEntries) {
		for (LVEntry lvEntry : lvEntries) {
			if (entityCache.getResult(LVEntryModelImpl.ENTITY_CACHE_ENABLED,
						LVEntryImpl.class, lvEntry.getPrimaryKey()) == null) {
				cacheResult(lvEntry);
			}
			else {
				lvEntry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all lv entries.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LVEntryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the lv entry.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LVEntry lvEntry) {
		entityCache.removeResult(LVEntryModelImpl.ENTITY_CACHE_ENABLED,
			LVEntryImpl.class, lvEntry.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((LVEntryModelImpl)lvEntry, true);
	}

	@Override
	public void clearCache(List<LVEntry> lvEntries) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LVEntry lvEntry : lvEntries) {
			entityCache.removeResult(LVEntryModelImpl.ENTITY_CACHE_ENABLED,
				LVEntryImpl.class, lvEntry.getPrimaryKey());

			clearUniqueFindersCache((LVEntryModelImpl)lvEntry, true);
		}
	}

	protected void cacheUniqueFindersCache(LVEntryModelImpl lvEntryModelImpl) {
		Object[] args = new Object[] { lvEntryModelImpl.getHeadId() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_HEADID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_HEADID, args,
			lvEntryModelImpl, false);
	}

	protected void clearUniqueFindersCache(LVEntryModelImpl lvEntryModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] { lvEntryModelImpl.getHeadId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_HEADID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_HEADID, args);
		}

		if ((lvEntryModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_HEADID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] { lvEntryModelImpl.getOriginalHeadId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_HEADID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_HEADID, args);
		}
	}

	/**
	 * Creates a new lv entry with the primary key. Does not add the lv entry to the database.
	 *
	 * @param lvEntryId the primary key for the new lv entry
	 * @return the new lv entry
	 */
	@Override
	public LVEntry create(long lvEntryId) {
		LVEntry lvEntry = new LVEntryImpl();

		lvEntry.setNew(true);
		lvEntry.setPrimaryKey(lvEntryId);

		return lvEntry;
	}

	/**
	 * Removes the lv entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lvEntryId the primary key of the lv entry
	 * @return the lv entry that was removed
	 * @throws NoSuchLVEntryException if a lv entry with the primary key could not be found
	 */
	@Override
	public LVEntry remove(long lvEntryId) throws NoSuchLVEntryException {
		return remove((Serializable)lvEntryId);
	}

	/**
	 * Removes the lv entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the lv entry
	 * @return the lv entry that was removed
	 * @throws NoSuchLVEntryException if a lv entry with the primary key could not be found
	 */
	@Override
	public LVEntry remove(Serializable primaryKey)
		throws NoSuchLVEntryException {
		Session session = null;

		try {
			session = openSession();

			LVEntry lvEntry = (LVEntry)session.get(LVEntryImpl.class, primaryKey);

			if (lvEntry == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLVEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lvEntry);
		}
		catch (NoSuchLVEntryException nsee) {
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
	protected LVEntry removeImpl(LVEntry lvEntry) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lvEntry)) {
				lvEntry = (LVEntry)session.get(LVEntryImpl.class,
						lvEntry.getPrimaryKeyObj());
			}

			if (lvEntry != null) {
				session.delete(lvEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (lvEntry != null) {
			clearCache(lvEntry);
		}

		return lvEntry;
	}

	@Override
	public LVEntry updateImpl(LVEntry lvEntry) {
		boolean isNew = lvEntry.isNew();

		if (!(lvEntry instanceof LVEntryModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(lvEntry.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(lvEntry);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in lvEntry proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom LVEntry implementation " +
				lvEntry.getClass());
		}

		LVEntryModelImpl lvEntryModelImpl = (LVEntryModelImpl)lvEntry;

		Session session = null;

		try {
			session = openSession();

			if (lvEntry.isNew()) {
				session.save(lvEntry);

				lvEntry.setNew(false);
			}
			else {
				lvEntry = (LVEntry)session.merge(lvEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!LVEntryModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { lvEntryModelImpl.getGroupId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((lvEntryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lvEntryModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { lvEntryModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}
		}

		entityCache.putResult(LVEntryModelImpl.ENTITY_CACHE_ENABLED,
			LVEntryImpl.class, lvEntry.getPrimaryKey(), lvEntry, false);

		clearUniqueFindersCache(lvEntryModelImpl, false);
		cacheUniqueFindersCache(lvEntryModelImpl);

		lvEntry.resetOriginalValues();

		return lvEntry;
	}

	/**
	 * Returns the lv entry with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the lv entry
	 * @return the lv entry
	 * @throws NoSuchLVEntryException if a lv entry with the primary key could not be found
	 */
	@Override
	public LVEntry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLVEntryException {
		LVEntry lvEntry = fetchByPrimaryKey(primaryKey);

		if (lvEntry == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLVEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return lvEntry;
	}

	/**
	 * Returns the lv entry with the primary key or throws a {@link NoSuchLVEntryException} if it could not be found.
	 *
	 * @param lvEntryId the primary key of the lv entry
	 * @return the lv entry
	 * @throws NoSuchLVEntryException if a lv entry with the primary key could not be found
	 */
	@Override
	public LVEntry findByPrimaryKey(long lvEntryId)
		throws NoSuchLVEntryException {
		return findByPrimaryKey((Serializable)lvEntryId);
	}

	/**
	 * Returns the lv entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the lv entry
	 * @return the lv entry, or <code>null</code> if a lv entry with the primary key could not be found
	 */
	@Override
	public LVEntry fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(LVEntryModelImpl.ENTITY_CACHE_ENABLED,
				LVEntryImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		LVEntry lvEntry = (LVEntry)serializable;

		if (lvEntry == null) {
			Session session = null;

			try {
				session = openSession();

				lvEntry = (LVEntry)session.get(LVEntryImpl.class, primaryKey);

				if (lvEntry != null) {
					cacheResult(lvEntry);
				}
				else {
					entityCache.putResult(LVEntryModelImpl.ENTITY_CACHE_ENABLED,
						LVEntryImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(LVEntryModelImpl.ENTITY_CACHE_ENABLED,
					LVEntryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return lvEntry;
	}

	/**
	 * Returns the lv entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param lvEntryId the primary key of the lv entry
	 * @return the lv entry, or <code>null</code> if a lv entry with the primary key could not be found
	 */
	@Override
	public LVEntry fetchByPrimaryKey(long lvEntryId) {
		return fetchByPrimaryKey((Serializable)lvEntryId);
	}

	@Override
	public Map<Serializable, LVEntry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, LVEntry> map = new HashMap<Serializable, LVEntry>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			LVEntry lvEntry = fetchByPrimaryKey(primaryKey);

			if (lvEntry != null) {
				map.put(primaryKey, lvEntry);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(LVEntryModelImpl.ENTITY_CACHE_ENABLED,
					LVEntryImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (LVEntry)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_LVENTRY_WHERE_PKS_IN);

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

			for (LVEntry lvEntry : (List<LVEntry>)q.list()) {
				map.put(lvEntry.getPrimaryKeyObj(), lvEntry);

				cacheResult(lvEntry);

				uncachedPrimaryKeys.remove(lvEntry.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(LVEntryModelImpl.ENTITY_CACHE_ENABLED,
					LVEntryImpl.class, primaryKey, nullModel);
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
	 * Returns all the lv entries.
	 *
	 * @return the lv entries
	 */
	@Override
	public List<LVEntry> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lv entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LVEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lv entries
	 * @param end the upper bound of the range of lv entries (not inclusive)
	 * @return the range of lv entries
	 */
	@Override
	public List<LVEntry> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the lv entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LVEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lv entries
	 * @param end the upper bound of the range of lv entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lv entries
	 */
	@Override
	public List<LVEntry> findAll(int start, int end,
		OrderByComparator<LVEntry> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the lv entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LVEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lv entries
	 * @param end the upper bound of the range of lv entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of lv entries
	 */
	@Override
	public List<LVEntry> findAll(int start, int end,
		OrderByComparator<LVEntry> orderByComparator, boolean retrieveFromCache) {
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

		List<LVEntry> list = null;

		if (retrieveFromCache) {
			list = (List<LVEntry>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LVENTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LVENTRY;

				if (pagination) {
					sql = sql.concat(LVEntryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LVEntry>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LVEntry>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the lv entries from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LVEntry lvEntry : findAll()) {
			remove(lvEntry);
		}
	}

	/**
	 * Returns the number of lv entries.
	 *
	 * @return the number of lv entries
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LVENTRY);

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
		return LVEntryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the lv entry persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(LVEntryImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_LVENTRY = "SELECT lvEntry FROM LVEntry lvEntry";
	private static final String _SQL_SELECT_LVENTRY_WHERE_PKS_IN = "SELECT lvEntry FROM LVEntry lvEntry WHERE lvEntryId IN (";
	private static final String _SQL_SELECT_LVENTRY_WHERE = "SELECT lvEntry FROM LVEntry lvEntry WHERE ";
	private static final String _SQL_COUNT_LVENTRY = "SELECT COUNT(lvEntry) FROM LVEntry lvEntry";
	private static final String _SQL_COUNT_LVENTRY_WHERE = "SELECT COUNT(lvEntry) FROM LVEntry lvEntry WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lvEntry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LVEntry exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LVEntry exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(LVEntryPersistenceImpl.class);
}