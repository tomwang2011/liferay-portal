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

package com.liferay.changeset.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.changeset.exception.NoSuchEntryException;
import com.liferay.changeset.model.ChangesetEntry;
import com.liferay.changeset.model.impl.ChangesetEntryImpl;
import com.liferay.changeset.model.impl.ChangesetEntryModelImpl;
import com.liferay.changeset.service.persistence.ChangesetEntryPersistence;

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
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the changeset entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ChangesetEntryPersistence
 * @see com.liferay.changeset.service.persistence.ChangesetEntryUtil
 * @generated
 */
@ProviderType
public class ChangesetEntryPersistenceImpl extends BasePersistenceImpl<ChangesetEntry>
	implements ChangesetEntryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ChangesetEntryUtil} to access the changeset entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ChangesetEntryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED,
			ChangesetEntryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED,
			ChangesetEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED,
			ChangesetEntryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED,
			ChangesetEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			ChangesetEntryModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the changeset entries where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the changeset entries where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ChangesetEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of changeset entries
	 * @param end the upper bound of the range of changeset entries (not inclusive)
	 * @return the range of matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the changeset entries where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ChangesetEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of changeset entries
	 * @param end the upper bound of the range of changeset entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByGroupId(long groupId, int start, int end,
		OrderByComparator<ChangesetEntry> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the changeset entries where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ChangesetEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of changeset entries
	 * @param end the upper bound of the range of changeset entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByGroupId(long groupId, int start, int end,
		OrderByComparator<ChangesetEntry> orderByComparator,
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

		List<ChangesetEntry> list = null;

		if (retrieveFromCache) {
			list = (List<ChangesetEntry>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ChangesetEntry changesetEntry : list) {
					if ((groupId != changesetEntry.getGroupId())) {
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

			query.append(_SQL_SELECT_CHANGESETENTRY_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ChangesetEntryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<ChangesetEntry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ChangesetEntry>)QueryUtil.list(q,
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
	 * Returns the first changeset entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching changeset entry
	 * @throws NoSuchEntryException if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry findByGroupId_First(long groupId,
		OrderByComparator<ChangesetEntry> orderByComparator)
		throws NoSuchEntryException {
		ChangesetEntry changesetEntry = fetchByGroupId_First(groupId,
				orderByComparator);

		if (changesetEntry != null) {
			return changesetEntry;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchEntryException(msg.toString());
	}

	/**
	 * Returns the first changeset entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching changeset entry, or <code>null</code> if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry fetchByGroupId_First(long groupId,
		OrderByComparator<ChangesetEntry> orderByComparator) {
		List<ChangesetEntry> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last changeset entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching changeset entry
	 * @throws NoSuchEntryException if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry findByGroupId_Last(long groupId,
		OrderByComparator<ChangesetEntry> orderByComparator)
		throws NoSuchEntryException {
		ChangesetEntry changesetEntry = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (changesetEntry != null) {
			return changesetEntry;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchEntryException(msg.toString());
	}

	/**
	 * Returns the last changeset entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching changeset entry, or <code>null</code> if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry fetchByGroupId_Last(long groupId,
		OrderByComparator<ChangesetEntry> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<ChangesetEntry> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the changeset entries before and after the current changeset entry in the ordered set where groupId = &#63;.
	 *
	 * @param changesetEntryId the primary key of the current changeset entry
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next changeset entry
	 * @throws NoSuchEntryException if a changeset entry with the primary key could not be found
	 */
	@Override
	public ChangesetEntry[] findByGroupId_PrevAndNext(long changesetEntryId,
		long groupId, OrderByComparator<ChangesetEntry> orderByComparator)
		throws NoSuchEntryException {
		ChangesetEntry changesetEntry = findByPrimaryKey(changesetEntryId);

		Session session = null;

		try {
			session = openSession();

			ChangesetEntry[] array = new ChangesetEntryImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, changesetEntry,
					groupId, orderByComparator, true);

			array[1] = changesetEntry;

			array[2] = getByGroupId_PrevAndNext(session, changesetEntry,
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

	protected ChangesetEntry getByGroupId_PrevAndNext(Session session,
		ChangesetEntry changesetEntry, long groupId,
		OrderByComparator<ChangesetEntry> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CHANGESETENTRY_WHERE);

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
			query.append(ChangesetEntryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(changesetEntry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ChangesetEntry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the changeset entries where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (ChangesetEntry changesetEntry : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(changesetEntry);
		}
	}

	/**
	 * Returns the number of changeset entries where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching changeset entries
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CHANGESETENTRY_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "changesetEntry.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED,
			ChangesetEntryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED,
			ChangesetEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			ChangesetEntryModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the changeset entries where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByCompanyId(long companyId) {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the changeset entries where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ChangesetEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of changeset entries
	 * @param end the upper bound of the range of changeset entries (not inclusive)
	 * @return the range of matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByCompanyId(long companyId, int start,
		int end) {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the changeset entries where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ChangesetEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of changeset entries
	 * @param end the upper bound of the range of changeset entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByCompanyId(long companyId, int start,
		int end, OrderByComparator<ChangesetEntry> orderByComparator) {
		return findByCompanyId(companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the changeset entries where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ChangesetEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of changeset entries
	 * @param end the upper bound of the range of changeset entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByCompanyId(long companyId, int start,
		int end, OrderByComparator<ChangesetEntry> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId, start, end, orderByComparator };
		}

		List<ChangesetEntry> list = null;

		if (retrieveFromCache) {
			list = (List<ChangesetEntry>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ChangesetEntry changesetEntry : list) {
					if ((companyId != changesetEntry.getCompanyId())) {
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

			query.append(_SQL_SELECT_CHANGESETENTRY_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ChangesetEntryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<ChangesetEntry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ChangesetEntry>)QueryUtil.list(q,
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
	 * Returns the first changeset entry in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching changeset entry
	 * @throws NoSuchEntryException if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry findByCompanyId_First(long companyId,
		OrderByComparator<ChangesetEntry> orderByComparator)
		throws NoSuchEntryException {
		ChangesetEntry changesetEntry = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (changesetEntry != null) {
			return changesetEntry;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchEntryException(msg.toString());
	}

	/**
	 * Returns the first changeset entry in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching changeset entry, or <code>null</code> if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry fetchByCompanyId_First(long companyId,
		OrderByComparator<ChangesetEntry> orderByComparator) {
		List<ChangesetEntry> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last changeset entry in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching changeset entry
	 * @throws NoSuchEntryException if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry findByCompanyId_Last(long companyId,
		OrderByComparator<ChangesetEntry> orderByComparator)
		throws NoSuchEntryException {
		ChangesetEntry changesetEntry = fetchByCompanyId_Last(companyId,
				orderByComparator);

		if (changesetEntry != null) {
			return changesetEntry;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchEntryException(msg.toString());
	}

	/**
	 * Returns the last changeset entry in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching changeset entry, or <code>null</code> if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry fetchByCompanyId_Last(long companyId,
		OrderByComparator<ChangesetEntry> orderByComparator) {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<ChangesetEntry> list = findByCompanyId(companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the changeset entries before and after the current changeset entry in the ordered set where companyId = &#63;.
	 *
	 * @param changesetEntryId the primary key of the current changeset entry
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next changeset entry
	 * @throws NoSuchEntryException if a changeset entry with the primary key could not be found
	 */
	@Override
	public ChangesetEntry[] findByCompanyId_PrevAndNext(long changesetEntryId,
		long companyId, OrderByComparator<ChangesetEntry> orderByComparator)
		throws NoSuchEntryException {
		ChangesetEntry changesetEntry = findByPrimaryKey(changesetEntryId);

		Session session = null;

		try {
			session = openSession();

			ChangesetEntry[] array = new ChangesetEntryImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, changesetEntry,
					companyId, orderByComparator, true);

			array[1] = changesetEntry;

			array[2] = getByCompanyId_PrevAndNext(session, changesetEntry,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ChangesetEntry getByCompanyId_PrevAndNext(Session session,
		ChangesetEntry changesetEntry, long companyId,
		OrderByComparator<ChangesetEntry> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CHANGESETENTRY_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

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
			query.append(ChangesetEntryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(changesetEntry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ChangesetEntry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the changeset entries where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	@Override
	public void removeByCompanyId(long companyId) {
		for (ChangesetEntry changesetEntry : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(changesetEntry);
		}
	}

	/**
	 * Returns the number of changeset entries where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching changeset entries
	 */
	@Override
	public int countByCompanyId(long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CHANGESETENTRY_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "changesetEntry.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CHANGESETCOLLECTIONID =
		new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED,
			ChangesetEntryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByChangesetCollectionId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANGESETCOLLECTIONID =
		new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED,
			ChangesetEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByChangesetCollectionId",
			new String[] { Long.class.getName() },
			ChangesetEntryModelImpl.CHANGESETCOLLECTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CHANGESETCOLLECTIONID = new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByChangesetCollectionId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the changeset entries where changesetCollectionId = &#63;.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @return the matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByChangesetCollectionId(
		long changesetCollectionId) {
		return findByChangesetCollectionId(changesetCollectionId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the changeset entries where changesetCollectionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ChangesetEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param start the lower bound of the range of changeset entries
	 * @param end the upper bound of the range of changeset entries (not inclusive)
	 * @return the range of matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByChangesetCollectionId(
		long changesetCollectionId, int start, int end) {
		return findByChangesetCollectionId(changesetCollectionId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the changeset entries where changesetCollectionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ChangesetEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param start the lower bound of the range of changeset entries
	 * @param end the upper bound of the range of changeset entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByChangesetCollectionId(
		long changesetCollectionId, int start, int end,
		OrderByComparator<ChangesetEntry> orderByComparator) {
		return findByChangesetCollectionId(changesetCollectionId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the changeset entries where changesetCollectionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ChangesetEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param start the lower bound of the range of changeset entries
	 * @param end the upper bound of the range of changeset entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByChangesetCollectionId(
		long changesetCollectionId, int start, int end,
		OrderByComparator<ChangesetEntry> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANGESETCOLLECTIONID;
			finderArgs = new Object[] { changesetCollectionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CHANGESETCOLLECTIONID;
			finderArgs = new Object[] {
					changesetCollectionId,
					
					start, end, orderByComparator
				};
		}

		List<ChangesetEntry> list = null;

		if (retrieveFromCache) {
			list = (List<ChangesetEntry>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ChangesetEntry changesetEntry : list) {
					if ((changesetCollectionId != changesetEntry.getChangesetCollectionId())) {
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

			query.append(_SQL_SELECT_CHANGESETENTRY_WHERE);

			query.append(_FINDER_COLUMN_CHANGESETCOLLECTIONID_CHANGESETCOLLECTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ChangesetEntryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(changesetCollectionId);

				if (!pagination) {
					list = (List<ChangesetEntry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ChangesetEntry>)QueryUtil.list(q,
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
	 * Returns the first changeset entry in the ordered set where changesetCollectionId = &#63;.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching changeset entry
	 * @throws NoSuchEntryException if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry findByChangesetCollectionId_First(
		long changesetCollectionId,
		OrderByComparator<ChangesetEntry> orderByComparator)
		throws NoSuchEntryException {
		ChangesetEntry changesetEntry = fetchByChangesetCollectionId_First(changesetCollectionId,
				orderByComparator);

		if (changesetEntry != null) {
			return changesetEntry;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("changesetCollectionId=");
		msg.append(changesetCollectionId);

		msg.append("}");

		throw new NoSuchEntryException(msg.toString());
	}

	/**
	 * Returns the first changeset entry in the ordered set where changesetCollectionId = &#63;.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching changeset entry, or <code>null</code> if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry fetchByChangesetCollectionId_First(
		long changesetCollectionId,
		OrderByComparator<ChangesetEntry> orderByComparator) {
		List<ChangesetEntry> list = findByChangesetCollectionId(changesetCollectionId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last changeset entry in the ordered set where changesetCollectionId = &#63;.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching changeset entry
	 * @throws NoSuchEntryException if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry findByChangesetCollectionId_Last(
		long changesetCollectionId,
		OrderByComparator<ChangesetEntry> orderByComparator)
		throws NoSuchEntryException {
		ChangesetEntry changesetEntry = fetchByChangesetCollectionId_Last(changesetCollectionId,
				orderByComparator);

		if (changesetEntry != null) {
			return changesetEntry;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("changesetCollectionId=");
		msg.append(changesetCollectionId);

		msg.append("}");

		throw new NoSuchEntryException(msg.toString());
	}

	/**
	 * Returns the last changeset entry in the ordered set where changesetCollectionId = &#63;.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching changeset entry, or <code>null</code> if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry fetchByChangesetCollectionId_Last(
		long changesetCollectionId,
		OrderByComparator<ChangesetEntry> orderByComparator) {
		int count = countByChangesetCollectionId(changesetCollectionId);

		if (count == 0) {
			return null;
		}

		List<ChangesetEntry> list = findByChangesetCollectionId(changesetCollectionId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the changeset entries before and after the current changeset entry in the ordered set where changesetCollectionId = &#63;.
	 *
	 * @param changesetEntryId the primary key of the current changeset entry
	 * @param changesetCollectionId the changeset collection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next changeset entry
	 * @throws NoSuchEntryException if a changeset entry with the primary key could not be found
	 */
	@Override
	public ChangesetEntry[] findByChangesetCollectionId_PrevAndNext(
		long changesetEntryId, long changesetCollectionId,
		OrderByComparator<ChangesetEntry> orderByComparator)
		throws NoSuchEntryException {
		ChangesetEntry changesetEntry = findByPrimaryKey(changesetEntryId);

		Session session = null;

		try {
			session = openSession();

			ChangesetEntry[] array = new ChangesetEntryImpl[3];

			array[0] = getByChangesetCollectionId_PrevAndNext(session,
					changesetEntry, changesetCollectionId, orderByComparator,
					true);

			array[1] = changesetEntry;

			array[2] = getByChangesetCollectionId_PrevAndNext(session,
					changesetEntry, changesetCollectionId, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ChangesetEntry getByChangesetCollectionId_PrevAndNext(
		Session session, ChangesetEntry changesetEntry,
		long changesetCollectionId,
		OrderByComparator<ChangesetEntry> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CHANGESETENTRY_WHERE);

		query.append(_FINDER_COLUMN_CHANGESETCOLLECTIONID_CHANGESETCOLLECTIONID_2);

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
			query.append(ChangesetEntryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(changesetCollectionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(changesetEntry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ChangesetEntry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the changeset entries where changesetCollectionId = &#63; from the database.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 */
	@Override
	public void removeByChangesetCollectionId(long changesetCollectionId) {
		for (ChangesetEntry changesetEntry : findByChangesetCollectionId(
				changesetCollectionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(changesetEntry);
		}
	}

	/**
	 * Returns the number of changeset entries where changesetCollectionId = &#63;.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @return the number of matching changeset entries
	 */
	@Override
	public int countByChangesetCollectionId(long changesetCollectionId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CHANGESETCOLLECTIONID;

		Object[] finderArgs = new Object[] { changesetCollectionId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CHANGESETENTRY_WHERE);

			query.append(_FINDER_COLUMN_CHANGESETCOLLECTIONID_CHANGESETCOLLECTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(changesetCollectionId);

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

	private static final String _FINDER_COLUMN_CHANGESETCOLLECTIONID_CHANGESETCOLLECTIONID_2 =
		"changesetEntry.changesetCollectionId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_C = new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED,
			ChangesetEntryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_C",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_C = new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED,
			ChangesetEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_C",
			new String[] { Long.class.getName(), Long.class.getName() },
			ChangesetEntryModelImpl.GROUPID_COLUMN_BITMASK |
			ChangesetEntryModelImpl.CLASSNAMEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_C = new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_C",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the changeset entries where groupId = &#63; and classNameId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param classNameId the class name ID
	 * @return the matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByG_C(long groupId, long classNameId) {
		return findByG_C(groupId, classNameId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the changeset entries where groupId = &#63; and classNameId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ChangesetEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param classNameId the class name ID
	 * @param start the lower bound of the range of changeset entries
	 * @param end the upper bound of the range of changeset entries (not inclusive)
	 * @return the range of matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByG_C(long groupId, long classNameId,
		int start, int end) {
		return findByG_C(groupId, classNameId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the changeset entries where groupId = &#63; and classNameId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ChangesetEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param classNameId the class name ID
	 * @param start the lower bound of the range of changeset entries
	 * @param end the upper bound of the range of changeset entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByG_C(long groupId, long classNameId,
		int start, int end, OrderByComparator<ChangesetEntry> orderByComparator) {
		return findByG_C(groupId, classNameId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the changeset entries where groupId = &#63; and classNameId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ChangesetEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param classNameId the class name ID
	 * @param start the lower bound of the range of changeset entries
	 * @param end the upper bound of the range of changeset entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByG_C(long groupId, long classNameId,
		int start, int end,
		OrderByComparator<ChangesetEntry> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_C;
			finderArgs = new Object[] { groupId, classNameId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_C;
			finderArgs = new Object[] {
					groupId, classNameId,
					
					start, end, orderByComparator
				};
		}

		List<ChangesetEntry> list = null;

		if (retrieveFromCache) {
			list = (List<ChangesetEntry>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ChangesetEntry changesetEntry : list) {
					if ((groupId != changesetEntry.getGroupId()) ||
							(classNameId != changesetEntry.getClassNameId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_CHANGESETENTRY_WHERE);

			query.append(_FINDER_COLUMN_G_C_GROUPID_2);

			query.append(_FINDER_COLUMN_G_C_CLASSNAMEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ChangesetEntryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(classNameId);

				if (!pagination) {
					list = (List<ChangesetEntry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ChangesetEntry>)QueryUtil.list(q,
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
	 * Returns the first changeset entry in the ordered set where groupId = &#63; and classNameId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param classNameId the class name ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching changeset entry
	 * @throws NoSuchEntryException if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry findByG_C_First(long groupId, long classNameId,
		OrderByComparator<ChangesetEntry> orderByComparator)
		throws NoSuchEntryException {
		ChangesetEntry changesetEntry = fetchByG_C_First(groupId, classNameId,
				orderByComparator);

		if (changesetEntry != null) {
			return changesetEntry;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", classNameId=");
		msg.append(classNameId);

		msg.append("}");

		throw new NoSuchEntryException(msg.toString());
	}

	/**
	 * Returns the first changeset entry in the ordered set where groupId = &#63; and classNameId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param classNameId the class name ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching changeset entry, or <code>null</code> if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry fetchByG_C_First(long groupId, long classNameId,
		OrderByComparator<ChangesetEntry> orderByComparator) {
		List<ChangesetEntry> list = findByG_C(groupId, classNameId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last changeset entry in the ordered set where groupId = &#63; and classNameId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param classNameId the class name ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching changeset entry
	 * @throws NoSuchEntryException if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry findByG_C_Last(long groupId, long classNameId,
		OrderByComparator<ChangesetEntry> orderByComparator)
		throws NoSuchEntryException {
		ChangesetEntry changesetEntry = fetchByG_C_Last(groupId, classNameId,
				orderByComparator);

		if (changesetEntry != null) {
			return changesetEntry;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", classNameId=");
		msg.append(classNameId);

		msg.append("}");

		throw new NoSuchEntryException(msg.toString());
	}

	/**
	 * Returns the last changeset entry in the ordered set where groupId = &#63; and classNameId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param classNameId the class name ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching changeset entry, or <code>null</code> if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry fetchByG_C_Last(long groupId, long classNameId,
		OrderByComparator<ChangesetEntry> orderByComparator) {
		int count = countByG_C(groupId, classNameId);

		if (count == 0) {
			return null;
		}

		List<ChangesetEntry> list = findByG_C(groupId, classNameId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the changeset entries before and after the current changeset entry in the ordered set where groupId = &#63; and classNameId = &#63;.
	 *
	 * @param changesetEntryId the primary key of the current changeset entry
	 * @param groupId the group ID
	 * @param classNameId the class name ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next changeset entry
	 * @throws NoSuchEntryException if a changeset entry with the primary key could not be found
	 */
	@Override
	public ChangesetEntry[] findByG_C_PrevAndNext(long changesetEntryId,
		long groupId, long classNameId,
		OrderByComparator<ChangesetEntry> orderByComparator)
		throws NoSuchEntryException {
		ChangesetEntry changesetEntry = findByPrimaryKey(changesetEntryId);

		Session session = null;

		try {
			session = openSession();

			ChangesetEntry[] array = new ChangesetEntryImpl[3];

			array[0] = getByG_C_PrevAndNext(session, changesetEntry, groupId,
					classNameId, orderByComparator, true);

			array[1] = changesetEntry;

			array[2] = getByG_C_PrevAndNext(session, changesetEntry, groupId,
					classNameId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ChangesetEntry getByG_C_PrevAndNext(Session session,
		ChangesetEntry changesetEntry, long groupId, long classNameId,
		OrderByComparator<ChangesetEntry> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CHANGESETENTRY_WHERE);

		query.append(_FINDER_COLUMN_G_C_GROUPID_2);

		query.append(_FINDER_COLUMN_G_C_CLASSNAMEID_2);

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
			query.append(ChangesetEntryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(classNameId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(changesetEntry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ChangesetEntry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the changeset entries where groupId = &#63; and classNameId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param classNameId the class name ID
	 */
	@Override
	public void removeByG_C(long groupId, long classNameId) {
		for (ChangesetEntry changesetEntry : findByG_C(groupId, classNameId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(changesetEntry);
		}
	}

	/**
	 * Returns the number of changeset entries where groupId = &#63; and classNameId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param classNameId the class name ID
	 * @return the number of matching changeset entries
	 */
	@Override
	public int countByG_C(long groupId, long classNameId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_C;

		Object[] finderArgs = new Object[] { groupId, classNameId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CHANGESETENTRY_WHERE);

			query.append(_FINDER_COLUMN_G_C_GROUPID_2);

			query.append(_FINDER_COLUMN_G_C_CLASSNAMEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(classNameId);

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

	private static final String _FINDER_COLUMN_G_C_GROUPID_2 = "changesetEntry.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_C_CLASSNAMEID_2 = "changesetEntry.classNameId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_C = new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED,
			ChangesetEntryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_C",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C = new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED,
			ChangesetEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_C",
			new String[] { Long.class.getName(), Long.class.getName() },
			ChangesetEntryModelImpl.CHANGESETCOLLECTIONID_COLUMN_BITMASK |
			ChangesetEntryModelImpl.CLASSNAMEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_C = new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_C",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the changeset entries where changesetCollectionId = &#63; and classNameId = &#63;.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param classNameId the class name ID
	 * @return the matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByC_C(long changesetCollectionId,
		long classNameId) {
		return findByC_C(changesetCollectionId, classNameId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the changeset entries where changesetCollectionId = &#63; and classNameId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ChangesetEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param classNameId the class name ID
	 * @param start the lower bound of the range of changeset entries
	 * @param end the upper bound of the range of changeset entries (not inclusive)
	 * @return the range of matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByC_C(long changesetCollectionId,
		long classNameId, int start, int end) {
		return findByC_C(changesetCollectionId, classNameId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the changeset entries where changesetCollectionId = &#63; and classNameId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ChangesetEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param classNameId the class name ID
	 * @param start the lower bound of the range of changeset entries
	 * @param end the upper bound of the range of changeset entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByC_C(long changesetCollectionId,
		long classNameId, int start, int end,
		OrderByComparator<ChangesetEntry> orderByComparator) {
		return findByC_C(changesetCollectionId, classNameId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the changeset entries where changesetCollectionId = &#63; and classNameId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ChangesetEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param classNameId the class name ID
	 * @param start the lower bound of the range of changeset entries
	 * @param end the upper bound of the range of changeset entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching changeset entries
	 */
	@Override
	public List<ChangesetEntry> findByC_C(long changesetCollectionId,
		long classNameId, int start, int end,
		OrderByComparator<ChangesetEntry> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C;
			finderArgs = new Object[] { changesetCollectionId, classNameId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_C;
			finderArgs = new Object[] {
					changesetCollectionId, classNameId,
					
					start, end, orderByComparator
				};
		}

		List<ChangesetEntry> list = null;

		if (retrieveFromCache) {
			list = (List<ChangesetEntry>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ChangesetEntry changesetEntry : list) {
					if ((changesetCollectionId != changesetEntry.getChangesetCollectionId()) ||
							(classNameId != changesetEntry.getClassNameId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_CHANGESETENTRY_WHERE);

			query.append(_FINDER_COLUMN_C_C_CHANGESETCOLLECTIONID_2);

			query.append(_FINDER_COLUMN_C_C_CLASSNAMEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ChangesetEntryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(changesetCollectionId);

				qPos.add(classNameId);

				if (!pagination) {
					list = (List<ChangesetEntry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ChangesetEntry>)QueryUtil.list(q,
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
	 * Returns the first changeset entry in the ordered set where changesetCollectionId = &#63; and classNameId = &#63;.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param classNameId the class name ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching changeset entry
	 * @throws NoSuchEntryException if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry findByC_C_First(long changesetCollectionId,
		long classNameId, OrderByComparator<ChangesetEntry> orderByComparator)
		throws NoSuchEntryException {
		ChangesetEntry changesetEntry = fetchByC_C_First(changesetCollectionId,
				classNameId, orderByComparator);

		if (changesetEntry != null) {
			return changesetEntry;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("changesetCollectionId=");
		msg.append(changesetCollectionId);

		msg.append(", classNameId=");
		msg.append(classNameId);

		msg.append("}");

		throw new NoSuchEntryException(msg.toString());
	}

	/**
	 * Returns the first changeset entry in the ordered set where changesetCollectionId = &#63; and classNameId = &#63;.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param classNameId the class name ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching changeset entry, or <code>null</code> if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry fetchByC_C_First(long changesetCollectionId,
		long classNameId, OrderByComparator<ChangesetEntry> orderByComparator) {
		List<ChangesetEntry> list = findByC_C(changesetCollectionId,
				classNameId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last changeset entry in the ordered set where changesetCollectionId = &#63; and classNameId = &#63;.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param classNameId the class name ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching changeset entry
	 * @throws NoSuchEntryException if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry findByC_C_Last(long changesetCollectionId,
		long classNameId, OrderByComparator<ChangesetEntry> orderByComparator)
		throws NoSuchEntryException {
		ChangesetEntry changesetEntry = fetchByC_C_Last(changesetCollectionId,
				classNameId, orderByComparator);

		if (changesetEntry != null) {
			return changesetEntry;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("changesetCollectionId=");
		msg.append(changesetCollectionId);

		msg.append(", classNameId=");
		msg.append(classNameId);

		msg.append("}");

		throw new NoSuchEntryException(msg.toString());
	}

	/**
	 * Returns the last changeset entry in the ordered set where changesetCollectionId = &#63; and classNameId = &#63;.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param classNameId the class name ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching changeset entry, or <code>null</code> if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry fetchByC_C_Last(long changesetCollectionId,
		long classNameId, OrderByComparator<ChangesetEntry> orderByComparator) {
		int count = countByC_C(changesetCollectionId, classNameId);

		if (count == 0) {
			return null;
		}

		List<ChangesetEntry> list = findByC_C(changesetCollectionId,
				classNameId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the changeset entries before and after the current changeset entry in the ordered set where changesetCollectionId = &#63; and classNameId = &#63;.
	 *
	 * @param changesetEntryId the primary key of the current changeset entry
	 * @param changesetCollectionId the changeset collection ID
	 * @param classNameId the class name ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next changeset entry
	 * @throws NoSuchEntryException if a changeset entry with the primary key could not be found
	 */
	@Override
	public ChangesetEntry[] findByC_C_PrevAndNext(long changesetEntryId,
		long changesetCollectionId, long classNameId,
		OrderByComparator<ChangesetEntry> orderByComparator)
		throws NoSuchEntryException {
		ChangesetEntry changesetEntry = findByPrimaryKey(changesetEntryId);

		Session session = null;

		try {
			session = openSession();

			ChangesetEntry[] array = new ChangesetEntryImpl[3];

			array[0] = getByC_C_PrevAndNext(session, changesetEntry,
					changesetCollectionId, classNameId, orderByComparator, true);

			array[1] = changesetEntry;

			array[2] = getByC_C_PrevAndNext(session, changesetEntry,
					changesetCollectionId, classNameId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ChangesetEntry getByC_C_PrevAndNext(Session session,
		ChangesetEntry changesetEntry, long changesetCollectionId,
		long classNameId, OrderByComparator<ChangesetEntry> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CHANGESETENTRY_WHERE);

		query.append(_FINDER_COLUMN_C_C_CHANGESETCOLLECTIONID_2);

		query.append(_FINDER_COLUMN_C_C_CLASSNAMEID_2);

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
			query.append(ChangesetEntryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(changesetCollectionId);

		qPos.add(classNameId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(changesetEntry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ChangesetEntry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the changeset entries where changesetCollectionId = &#63; and classNameId = &#63; from the database.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param classNameId the class name ID
	 */
	@Override
	public void removeByC_C(long changesetCollectionId, long classNameId) {
		for (ChangesetEntry changesetEntry : findByC_C(changesetCollectionId,
				classNameId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(changesetEntry);
		}
	}

	/**
	 * Returns the number of changeset entries where changesetCollectionId = &#63; and classNameId = &#63;.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param classNameId the class name ID
	 * @return the number of matching changeset entries
	 */
	@Override
	public int countByC_C(long changesetCollectionId, long classNameId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_C;

		Object[] finderArgs = new Object[] { changesetCollectionId, classNameId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CHANGESETENTRY_WHERE);

			query.append(_FINDER_COLUMN_C_C_CHANGESETCOLLECTIONID_2);

			query.append(_FINDER_COLUMN_C_C_CLASSNAMEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(changesetCollectionId);

				qPos.add(classNameId);

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

	private static final String _FINDER_COLUMN_C_C_CHANGESETCOLLECTIONID_2 = "changesetEntry.changesetCollectionId = ? AND ";
	private static final String _FINDER_COLUMN_C_C_CLASSNAMEID_2 = "changesetEntry.classNameId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_C_C = new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED,
			ChangesetEntryImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByC_C_C",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			ChangesetEntryModelImpl.CHANGESETCOLLECTIONID_COLUMN_BITMASK |
			ChangesetEntryModelImpl.CLASSNAMEID_COLUMN_BITMASK |
			ChangesetEntryModelImpl.CLASSPK_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_C_C = new FinderPath(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_C_C",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns the changeset entry where changesetCollectionId = &#63; and classNameId = &#63; and classPK = &#63; or throws a {@link NoSuchEntryException} if it could not be found.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @return the matching changeset entry
	 * @throws NoSuchEntryException if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry findByC_C_C(long changesetCollectionId,
		long classNameId, long classPK) throws NoSuchEntryException {
		ChangesetEntry changesetEntry = fetchByC_C_C(changesetCollectionId,
				classNameId, classPK);

		if (changesetEntry == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("changesetCollectionId=");
			msg.append(changesetCollectionId);

			msg.append(", classNameId=");
			msg.append(classNameId);

			msg.append(", classPK=");
			msg.append(classPK);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchEntryException(msg.toString());
		}

		return changesetEntry;
	}

	/**
	 * Returns the changeset entry where changesetCollectionId = &#63; and classNameId = &#63; and classPK = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @return the matching changeset entry, or <code>null</code> if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry fetchByC_C_C(long changesetCollectionId,
		long classNameId, long classPK) {
		return fetchByC_C_C(changesetCollectionId, classNameId, classPK, true);
	}

	/**
	 * Returns the changeset entry where changesetCollectionId = &#63; and classNameId = &#63; and classPK = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching changeset entry, or <code>null</code> if a matching changeset entry could not be found
	 */
	@Override
	public ChangesetEntry fetchByC_C_C(long changesetCollectionId,
		long classNameId, long classPK, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] {
				changesetCollectionId, classNameId, classPK
			};

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_C_C_C,
					finderArgs, this);
		}

		if (result instanceof ChangesetEntry) {
			ChangesetEntry changesetEntry = (ChangesetEntry)result;

			if ((changesetCollectionId != changesetEntry.getChangesetCollectionId()) ||
					(classNameId != changesetEntry.getClassNameId()) ||
					(classPK != changesetEntry.getClassPK())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_CHANGESETENTRY_WHERE);

			query.append(_FINDER_COLUMN_C_C_C_CHANGESETCOLLECTIONID_2);

			query.append(_FINDER_COLUMN_C_C_C_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_C_C_C_CLASSPK_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(changesetCollectionId);

				qPos.add(classNameId);

				qPos.add(classPK);

				List<ChangesetEntry> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_C_C_C,
						finderArgs, list);
				}
				else {
					ChangesetEntry changesetEntry = list.get(0);

					result = changesetEntry;

					cacheResult(changesetEntry);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_C_C_C, finderArgs);

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
			return (ChangesetEntry)result;
		}
	}

	/**
	 * Removes the changeset entry where changesetCollectionId = &#63; and classNameId = &#63; and classPK = &#63; from the database.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @return the changeset entry that was removed
	 */
	@Override
	public ChangesetEntry removeByC_C_C(long changesetCollectionId,
		long classNameId, long classPK) throws NoSuchEntryException {
		ChangesetEntry changesetEntry = findByC_C_C(changesetCollectionId,
				classNameId, classPK);

		return remove(changesetEntry);
	}

	/**
	 * Returns the number of changeset entries where changesetCollectionId = &#63; and classNameId = &#63; and classPK = &#63;.
	 *
	 * @param changesetCollectionId the changeset collection ID
	 * @param classNameId the class name ID
	 * @param classPK the class pk
	 * @return the number of matching changeset entries
	 */
	@Override
	public int countByC_C_C(long changesetCollectionId, long classNameId,
		long classPK) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_C_C;

		Object[] finderArgs = new Object[] {
				changesetCollectionId, classNameId, classPK
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_CHANGESETENTRY_WHERE);

			query.append(_FINDER_COLUMN_C_C_C_CHANGESETCOLLECTIONID_2);

			query.append(_FINDER_COLUMN_C_C_C_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_C_C_C_CLASSPK_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(changesetCollectionId);

				qPos.add(classNameId);

				qPos.add(classPK);

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

	private static final String _FINDER_COLUMN_C_C_C_CHANGESETCOLLECTIONID_2 = "changesetEntry.changesetCollectionId = ? AND ";
	private static final String _FINDER_COLUMN_C_C_C_CLASSNAMEID_2 = "changesetEntry.classNameId = ? AND ";
	private static final String _FINDER_COLUMN_C_C_C_CLASSPK_2 = "changesetEntry.classPK = ?";

	public ChangesetEntryPersistenceImpl() {
		setModelClass(ChangesetEntry.class);
	}

	/**
	 * Caches the changeset entry in the entity cache if it is enabled.
	 *
	 * @param changesetEntry the changeset entry
	 */
	@Override
	public void cacheResult(ChangesetEntry changesetEntry) {
		entityCache.putResult(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryImpl.class, changesetEntry.getPrimaryKey(),
			changesetEntry);

		finderCache.putResult(FINDER_PATH_FETCH_BY_C_C_C,
			new Object[] {
				changesetEntry.getChangesetCollectionId(),
				changesetEntry.getClassNameId(), changesetEntry.getClassPK()
			}, changesetEntry);

		changesetEntry.resetOriginalValues();
	}

	/**
	 * Caches the changeset entries in the entity cache if it is enabled.
	 *
	 * @param changesetEntries the changeset entries
	 */
	@Override
	public void cacheResult(List<ChangesetEntry> changesetEntries) {
		for (ChangesetEntry changesetEntry : changesetEntries) {
			if (entityCache.getResult(
						ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
						ChangesetEntryImpl.class, changesetEntry.getPrimaryKey()) == null) {
				cacheResult(changesetEntry);
			}
			else {
				changesetEntry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all changeset entries.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ChangesetEntryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the changeset entry.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ChangesetEntry changesetEntry) {
		entityCache.removeResult(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryImpl.class, changesetEntry.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((ChangesetEntryModelImpl)changesetEntry, true);
	}

	@Override
	public void clearCache(List<ChangesetEntry> changesetEntries) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ChangesetEntry changesetEntry : changesetEntries) {
			entityCache.removeResult(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
				ChangesetEntryImpl.class, changesetEntry.getPrimaryKey());

			clearUniqueFindersCache((ChangesetEntryModelImpl)changesetEntry,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		ChangesetEntryModelImpl changesetEntryModelImpl) {
		Object[] args = new Object[] {
				changesetEntryModelImpl.getChangesetCollectionId(),
				changesetEntryModelImpl.getClassNameId(),
				changesetEntryModelImpl.getClassPK()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_C_C_C, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_C_C_C, args,
			changesetEntryModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		ChangesetEntryModelImpl changesetEntryModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					changesetEntryModelImpl.getChangesetCollectionId(),
					changesetEntryModelImpl.getClassNameId(),
					changesetEntryModelImpl.getClassPK()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_C_C_C, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_C_C_C, args);
		}

		if ((changesetEntryModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C_C_C.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					changesetEntryModelImpl.getOriginalChangesetCollectionId(),
					changesetEntryModelImpl.getOriginalClassNameId(),
					changesetEntryModelImpl.getOriginalClassPK()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_C_C_C, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_C_C_C, args);
		}
	}

	/**
	 * Creates a new changeset entry with the primary key. Does not add the changeset entry to the database.
	 *
	 * @param changesetEntryId the primary key for the new changeset entry
	 * @return the new changeset entry
	 */
	@Override
	public ChangesetEntry create(long changesetEntryId) {
		ChangesetEntry changesetEntry = new ChangesetEntryImpl();

		changesetEntry.setNew(true);
		changesetEntry.setPrimaryKey(changesetEntryId);

		changesetEntry.setCompanyId(companyProvider.getCompanyId());

		return changesetEntry;
	}

	/**
	 * Removes the changeset entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param changesetEntryId the primary key of the changeset entry
	 * @return the changeset entry that was removed
	 * @throws NoSuchEntryException if a changeset entry with the primary key could not be found
	 */
	@Override
	public ChangesetEntry remove(long changesetEntryId)
		throws NoSuchEntryException {
		return remove((Serializable)changesetEntryId);
	}

	/**
	 * Removes the changeset entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the changeset entry
	 * @return the changeset entry that was removed
	 * @throws NoSuchEntryException if a changeset entry with the primary key could not be found
	 */
	@Override
	public ChangesetEntry remove(Serializable primaryKey)
		throws NoSuchEntryException {
		Session session = null;

		try {
			session = openSession();

			ChangesetEntry changesetEntry = (ChangesetEntry)session.get(ChangesetEntryImpl.class,
					primaryKey);

			if (changesetEntry == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(changesetEntry);
		}
		catch (NoSuchEntryException nsee) {
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
	protected ChangesetEntry removeImpl(ChangesetEntry changesetEntry) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(changesetEntry)) {
				changesetEntry = (ChangesetEntry)session.get(ChangesetEntryImpl.class,
						changesetEntry.getPrimaryKeyObj());
			}

			if (changesetEntry != null) {
				session.delete(changesetEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (changesetEntry != null) {
			clearCache(changesetEntry);
		}

		return changesetEntry;
	}

	@Override
	public ChangesetEntry updateImpl(ChangesetEntry changesetEntry) {
		boolean isNew = changesetEntry.isNew();

		if (!(changesetEntry instanceof ChangesetEntryModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(changesetEntry.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(changesetEntry);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in changesetEntry proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ChangesetEntry implementation " +
				changesetEntry.getClass());
		}

		ChangesetEntryModelImpl changesetEntryModelImpl = (ChangesetEntryModelImpl)changesetEntry;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (changesetEntry.getCreateDate() == null)) {
			if (serviceContext == null) {
				changesetEntry.setCreateDate(now);
			}
			else {
				changesetEntry.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!changesetEntryModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				changesetEntry.setModifiedDate(now);
			}
			else {
				changesetEntry.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (changesetEntry.isNew()) {
				session.save(changesetEntry);

				changesetEntry.setNew(false);
			}
			else {
				changesetEntry = (ChangesetEntry)session.merge(changesetEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ChangesetEntryModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { changesetEntryModelImpl.getGroupId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
				args);

			args = new Object[] { changesetEntryModelImpl.getCompanyId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPANYID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
				args);

			args = new Object[] {
					changesetEntryModelImpl.getChangesetCollectionId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CHANGESETCOLLECTIONID,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANGESETCOLLECTIONID,
				args);

			args = new Object[] {
					changesetEntryModelImpl.getGroupId(),
					changesetEntryModelImpl.getClassNameId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_C,
				args);

			args = new Object[] {
					changesetEntryModelImpl.getChangesetCollectionId(),
					changesetEntryModelImpl.getClassNameId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_C_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((changesetEntryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						changesetEntryModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { changesetEntryModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((changesetEntryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						changesetEntryModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPANYID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { changesetEntryModelImpl.getCompanyId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPANYID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}

			if ((changesetEntryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANGESETCOLLECTIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						changesetEntryModelImpl.getOriginalChangesetCollectionId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CHANGESETCOLLECTIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANGESETCOLLECTIONID,
					args);

				args = new Object[] {
						changesetEntryModelImpl.getChangesetCollectionId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CHANGESETCOLLECTIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANGESETCOLLECTIONID,
					args);
			}

			if ((changesetEntryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						changesetEntryModelImpl.getOriginalGroupId(),
						changesetEntryModelImpl.getOriginalClassNameId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_C,
					args);

				args = new Object[] {
						changesetEntryModelImpl.getGroupId(),
						changesetEntryModelImpl.getClassNameId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_C,
					args);
			}

			if ((changesetEntryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						changesetEntryModelImpl.getOriginalChangesetCollectionId(),
						changesetEntryModelImpl.getOriginalClassNameId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_C_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C,
					args);

				args = new Object[] {
						changesetEntryModelImpl.getChangesetCollectionId(),
						changesetEntryModelImpl.getClassNameId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_C_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C,
					args);
			}
		}

		entityCache.putResult(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
			ChangesetEntryImpl.class, changesetEntry.getPrimaryKey(),
			changesetEntry, false);

		clearUniqueFindersCache(changesetEntryModelImpl, false);
		cacheUniqueFindersCache(changesetEntryModelImpl);

		changesetEntry.resetOriginalValues();

		return changesetEntry;
	}

	/**
	 * Returns the changeset entry with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the changeset entry
	 * @return the changeset entry
	 * @throws NoSuchEntryException if a changeset entry with the primary key could not be found
	 */
	@Override
	public ChangesetEntry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEntryException {
		ChangesetEntry changesetEntry = fetchByPrimaryKey(primaryKey);

		if (changesetEntry == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return changesetEntry;
	}

	/**
	 * Returns the changeset entry with the primary key or throws a {@link NoSuchEntryException} if it could not be found.
	 *
	 * @param changesetEntryId the primary key of the changeset entry
	 * @return the changeset entry
	 * @throws NoSuchEntryException if a changeset entry with the primary key could not be found
	 */
	@Override
	public ChangesetEntry findByPrimaryKey(long changesetEntryId)
		throws NoSuchEntryException {
		return findByPrimaryKey((Serializable)changesetEntryId);
	}

	/**
	 * Returns the changeset entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the changeset entry
	 * @return the changeset entry, or <code>null</code> if a changeset entry with the primary key could not be found
	 */
	@Override
	public ChangesetEntry fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
				ChangesetEntryImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ChangesetEntry changesetEntry = (ChangesetEntry)serializable;

		if (changesetEntry == null) {
			Session session = null;

			try {
				session = openSession();

				changesetEntry = (ChangesetEntry)session.get(ChangesetEntryImpl.class,
						primaryKey);

				if (changesetEntry != null) {
					cacheResult(changesetEntry);
				}
				else {
					entityCache.putResult(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
						ChangesetEntryImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
					ChangesetEntryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return changesetEntry;
	}

	/**
	 * Returns the changeset entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param changesetEntryId the primary key of the changeset entry
	 * @return the changeset entry, or <code>null</code> if a changeset entry with the primary key could not be found
	 */
	@Override
	public ChangesetEntry fetchByPrimaryKey(long changesetEntryId) {
		return fetchByPrimaryKey((Serializable)changesetEntryId);
	}

	@Override
	public Map<Serializable, ChangesetEntry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ChangesetEntry> map = new HashMap<Serializable, ChangesetEntry>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ChangesetEntry changesetEntry = fetchByPrimaryKey(primaryKey);

			if (changesetEntry != null) {
				map.put(primaryKey, changesetEntry);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
					ChangesetEntryImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ChangesetEntry)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CHANGESETENTRY_WHERE_PKS_IN);

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

			for (ChangesetEntry changesetEntry : (List<ChangesetEntry>)q.list()) {
				map.put(changesetEntry.getPrimaryKeyObj(), changesetEntry);

				cacheResult(changesetEntry);

				uncachedPrimaryKeys.remove(changesetEntry.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ChangesetEntryModelImpl.ENTITY_CACHE_ENABLED,
					ChangesetEntryImpl.class, primaryKey, nullModel);
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
	 * Returns all the changeset entries.
	 *
	 * @return the changeset entries
	 */
	@Override
	public List<ChangesetEntry> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the changeset entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ChangesetEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of changeset entries
	 * @param end the upper bound of the range of changeset entries (not inclusive)
	 * @return the range of changeset entries
	 */
	@Override
	public List<ChangesetEntry> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the changeset entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ChangesetEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of changeset entries
	 * @param end the upper bound of the range of changeset entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of changeset entries
	 */
	@Override
	public List<ChangesetEntry> findAll(int start, int end,
		OrderByComparator<ChangesetEntry> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the changeset entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ChangesetEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of changeset entries
	 * @param end the upper bound of the range of changeset entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of changeset entries
	 */
	@Override
	public List<ChangesetEntry> findAll(int start, int end,
		OrderByComparator<ChangesetEntry> orderByComparator,
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

		List<ChangesetEntry> list = null;

		if (retrieveFromCache) {
			list = (List<ChangesetEntry>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CHANGESETENTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CHANGESETENTRY;

				if (pagination) {
					sql = sql.concat(ChangesetEntryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ChangesetEntry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ChangesetEntry>)QueryUtil.list(q,
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
	 * Removes all the changeset entries from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ChangesetEntry changesetEntry : findAll()) {
			remove(changesetEntry);
		}
	}

	/**
	 * Returns the number of changeset entries.
	 *
	 * @return the number of changeset entries
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CHANGESETENTRY);

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
		return ChangesetEntryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the changeset entry persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ChangesetEntryImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CHANGESETENTRY = "SELECT changesetEntry FROM ChangesetEntry changesetEntry";
	private static final String _SQL_SELECT_CHANGESETENTRY_WHERE_PKS_IN = "SELECT changesetEntry FROM ChangesetEntry changesetEntry WHERE changesetEntryId IN (";
	private static final String _SQL_SELECT_CHANGESETENTRY_WHERE = "SELECT changesetEntry FROM ChangesetEntry changesetEntry WHERE ";
	private static final String _SQL_COUNT_CHANGESETENTRY = "SELECT COUNT(changesetEntry) FROM ChangesetEntry changesetEntry";
	private static final String _SQL_COUNT_CHANGESETENTRY_WHERE = "SELECT COUNT(changesetEntry) FROM ChangesetEntry changesetEntry WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "changesetEntry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ChangesetEntry exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ChangesetEntry exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ChangesetEntryPersistenceImpl.class);
}