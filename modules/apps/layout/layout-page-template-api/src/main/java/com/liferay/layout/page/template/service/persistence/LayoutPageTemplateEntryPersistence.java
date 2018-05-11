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

package com.liferay.layout.page.template.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.layout.page.template.exception.NoSuchPageTemplateEntryException;
import com.liferay.layout.page.template.model.LayoutPageTemplateEntry;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the layout page template entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.layout.page.template.service.persistence.impl.LayoutPageTemplateEntryPersistenceImpl
 * @see LayoutPageTemplateEntryUtil
 * @generated
 */
@ProviderType
public interface LayoutPageTemplateEntryPersistence extends BasePersistence<LayoutPageTemplateEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LayoutPageTemplateEntryUtil} to access the layout page template entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the layout page template entries where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByGroupId(long groupId);

	/**
	* Returns a range of all the layout page template entries where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByGroupId(long groupId,
		int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set where groupId = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] findByGroupId_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns all the layout page template entries that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByGroupId(
		long groupId);

	/**
	* Returns a range of all the layout page template entries that the user has permission to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByGroupId(
		long groupId, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries that the user has permissions to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set of layout page template entries that the user has permission to view where groupId = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] filterFindByGroupId_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Removes all the layout page template entries where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of layout page template entries where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching layout page template entries
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns the number of layout page template entries that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching layout page template entries that the user has permission to view
	*/
	public int filterCountByGroupId(long groupId);

	/**
	* Returns all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @return the matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_L(long groupId,
		long layoutPageTemplateCollectionId);

	/**
	* Returns a range of all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_L(long groupId,
		long layoutPageTemplateCollectionId, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_L(long groupId,
		long layoutPageTemplateCollectionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_L(long groupId,
		long layoutPageTemplateCollectionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_L_First(long groupId,
		long layoutPageTemplateCollectionId,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_L_First(long groupId,
		long layoutPageTemplateCollectionId,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_L_Last(long groupId,
		long layoutPageTemplateCollectionId,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_L_Last(long groupId,
		long layoutPageTemplateCollectionId,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] findByG_L_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId,
		long layoutPageTemplateCollectionId,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns all the layout page template entries that the user has permission to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @return the matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_L(
		long groupId, long layoutPageTemplateCollectionId);

	/**
	* Returns a range of all the layout page template entries that the user has permission to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_L(
		long groupId, long layoutPageTemplateCollectionId, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries that the user has permissions to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_L(
		long groupId, long layoutPageTemplateCollectionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set of layout page template entries that the user has permission to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] filterFindByG_L_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId,
		long layoutPageTemplateCollectionId,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Removes all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	*/
	public void removeByG_L(long groupId, long layoutPageTemplateCollectionId);

	/**
	* Returns the number of layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @return the number of matching layout page template entries
	*/
	public int countByG_L(long groupId, long layoutPageTemplateCollectionId);

	/**
	* Returns the number of layout page template entries that the user has permission to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @return the number of matching layout page template entries that the user has permission to view
	*/
	public int filterCountByG_L(long groupId,
		long layoutPageTemplateCollectionId);

	/**
	* Returns the layout page template entry where groupId = &#63; and name = &#63; or throws a {@link NoSuchPageTemplateEntryException} if it could not be found.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_N(long groupId, String name)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the layout page template entry where groupId = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_N(long groupId, String name);

	/**
	* Returns the layout page template entry where groupId = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param name the name
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_N(long groupId, String name,
		boolean retrieveFromCache);

	/**
	* Removes the layout page template entry where groupId = &#63; and name = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the layout page template entry that was removed
	*/
	public LayoutPageTemplateEntry removeByG_N(long groupId, String name)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the number of layout page template entries where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching layout page template entries
	*/
	public int countByG_N(long groupId, String name);

	/**
	* Returns all the layout page template entries where groupId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @return the matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_T(long groupId,
		int type);

	/**
	* Returns a range of all the layout page template entries where groupId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_T(long groupId,
		int type, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_T(long groupId,
		int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_T(long groupId,
		int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_T_First(long groupId, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_T_First(long groupId, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_T_Last(long groupId, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_T_Last(long groupId, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set where groupId = &#63; and type = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] findByG_T_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns all the layout page template entries that the user has permission to view where groupId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @return the matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_T(
		long groupId, int type);

	/**
	* Returns a range of all the layout page template entries that the user has permission to view where groupId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_T(
		long groupId, int type, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries that the user has permissions to view where groupId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_T(
		long groupId, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set of layout page template entries that the user has permission to view where groupId = &#63; and type = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] filterFindByG_T_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Removes all the layout page template entries where groupId = &#63; and type = &#63; from the database.
	*
	* @param groupId the group ID
	* @param type the type
	*/
	public void removeByG_T(long groupId, int type);

	/**
	* Returns the number of layout page template entries where groupId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @return the number of matching layout page template entries
	*/
	public int countByG_T(long groupId, int type);

	/**
	* Returns the number of layout page template entries that the user has permission to view where groupId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @return the number of matching layout page template entries that the user has permission to view
	*/
	public int filterCountByG_T(long groupId, int type);

	/**
	* Returns all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @return the matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_L_LikeN(
		long groupId, long layoutPageTemplateCollectionId, String name);

	/**
	* Returns a range of all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_L_LikeN(
		long groupId, long layoutPageTemplateCollectionId, String name,
		int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_L_LikeN(
		long groupId, long layoutPageTemplateCollectionId, String name,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_L_LikeN(
		long groupId, long layoutPageTemplateCollectionId, String name,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_L_LikeN_First(long groupId,
		long layoutPageTemplateCollectionId, String name,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_L_LikeN_First(long groupId,
		long layoutPageTemplateCollectionId, String name,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_L_LikeN_Last(long groupId,
		long layoutPageTemplateCollectionId, String name,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_L_LikeN_Last(long groupId,
		long layoutPageTemplateCollectionId, String name,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] findByG_L_LikeN_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId,
		long layoutPageTemplateCollectionId, String name,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns all the layout page template entries that the user has permission to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @return the matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_L_LikeN(
		long groupId, long layoutPageTemplateCollectionId, String name);

	/**
	* Returns a range of all the layout page template entries that the user has permission to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_L_LikeN(
		long groupId, long layoutPageTemplateCollectionId, String name,
		int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries that the user has permissions to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_L_LikeN(
		long groupId, long layoutPageTemplateCollectionId, String name,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set of layout page template entries that the user has permission to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] filterFindByG_L_LikeN_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId,
		long layoutPageTemplateCollectionId, String name,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Removes all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63; from the database.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	*/
	public void removeByG_L_LikeN(long groupId,
		long layoutPageTemplateCollectionId, String name);

	/**
	* Returns the number of layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @return the number of matching layout page template entries
	*/
	public int countByG_L_LikeN(long groupId,
		long layoutPageTemplateCollectionId, String name);

	/**
	* Returns the number of layout page template entries that the user has permission to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @return the number of matching layout page template entries that the user has permission to view
	*/
	public int filterCountByG_L_LikeN(long groupId,
		long layoutPageTemplateCollectionId, String name);

	/**
	* Returns all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param status the status
	* @return the matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_L_S(long groupId,
		long layoutPageTemplateCollectionId, int status);

	/**
	* Returns a range of all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_L_S(long groupId,
		long layoutPageTemplateCollectionId, int status, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_L_S(long groupId,
		long layoutPageTemplateCollectionId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_L_S(long groupId,
		long layoutPageTemplateCollectionId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_L_S_First(long groupId,
		long layoutPageTemplateCollectionId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_L_S_First(long groupId,
		long layoutPageTemplateCollectionId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_L_S_Last(long groupId,
		long layoutPageTemplateCollectionId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_L_S_Last(long groupId,
		long layoutPageTemplateCollectionId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and status = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] findByG_L_S_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId,
		long layoutPageTemplateCollectionId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns all the layout page template entries that the user has permission to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param status the status
	* @return the matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_L_S(
		long groupId, long layoutPageTemplateCollectionId, int status);

	/**
	* Returns a range of all the layout page template entries that the user has permission to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_L_S(
		long groupId, long layoutPageTemplateCollectionId, int status,
		int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries that the user has permissions to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_L_S(
		long groupId, long layoutPageTemplateCollectionId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set of layout page template entries that the user has permission to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and status = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] filterFindByG_L_S_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId,
		long layoutPageTemplateCollectionId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Removes all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param status the status
	*/
	public void removeByG_L_S(long groupId,
		long layoutPageTemplateCollectionId, int status);

	/**
	* Returns the number of layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param status the status
	* @return the number of matching layout page template entries
	*/
	public int countByG_L_S(long groupId, long layoutPageTemplateCollectionId,
		int status);

	/**
	* Returns the number of layout page template entries that the user has permission to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param status the status
	* @return the number of matching layout page template entries that the user has permission to view
	*/
	public int filterCountByG_L_S(long groupId,
		long layoutPageTemplateCollectionId, int status);

	/**
	* Returns all the layout page template entries where groupId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @return the matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_T_LikeN(
		long groupId, String name, int type);

	/**
	* Returns a range of all the layout page template entries where groupId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_T_LikeN(
		long groupId, String name, int type, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_T_LikeN(
		long groupId, String name, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_T_LikeN(
		long groupId, String name, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_T_LikeN_First(long groupId,
		String name, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_T_LikeN_First(long groupId,
		String name, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_T_LikeN_Last(long groupId,
		String name, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_T_LikeN_Last(long groupId,
		String name, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set where groupId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] findByG_T_LikeN_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, String name, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns all the layout page template entries that the user has permission to view where groupId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @return the matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_T_LikeN(
		long groupId, String name, int type);

	/**
	* Returns a range of all the layout page template entries that the user has permission to view where groupId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_T_LikeN(
		long groupId, String name, int type, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries that the user has permissions to view where groupId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_T_LikeN(
		long groupId, String name, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set of layout page template entries that the user has permission to view where groupId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] filterFindByG_T_LikeN_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, String name, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Removes all the layout page template entries where groupId = &#63; and name LIKE &#63; and type = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	*/
	public void removeByG_T_LikeN(long groupId, String name, int type);

	/**
	* Returns the number of layout page template entries where groupId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @return the number of matching layout page template entries
	*/
	public int countByG_T_LikeN(long groupId, String name, int type);

	/**
	* Returns the number of layout page template entries that the user has permission to view where groupId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @return the number of matching layout page template entries that the user has permission to view
	*/
	public int filterCountByG_T_LikeN(long groupId, String name, int type);

	/**
	* Returns all the layout page template entries where groupId = &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param status the status
	* @return the matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_T_S(long groupId,
		int type, int status);

	/**
	* Returns a range of all the layout page template entries where groupId = &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_T_S(long groupId,
		int type, int status, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_T_S(long groupId,
		int type, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_T_S(long groupId,
		int type, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_T_S_First(long groupId, int type,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_T_S_First(long groupId, int type,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_T_S_Last(long groupId, int type,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_T_S_Last(long groupId, int type,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set where groupId = &#63; and type = &#63; and status = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] findByG_T_S_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, int type, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns all the layout page template entries that the user has permission to view where groupId = &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param status the status
	* @return the matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_T_S(
		long groupId, int type, int status);

	/**
	* Returns a range of all the layout page template entries that the user has permission to view where groupId = &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_T_S(
		long groupId, int type, int status, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries that the user has permissions to view where groupId = &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_T_S(
		long groupId, int type, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set of layout page template entries that the user has permission to view where groupId = &#63; and type = &#63; and status = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] filterFindByG_T_S_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, int type, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Removes all the layout page template entries where groupId = &#63; and type = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param type the type
	* @param status the status
	*/
	public void removeByG_T_S(long groupId, int type, int status);

	/**
	* Returns the number of layout page template entries where groupId = &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param status the status
	* @return the number of matching layout page template entries
	*/
	public int countByG_T_S(long groupId, int type, int status);

	/**
	* Returns the number of layout page template entries that the user has permission to view where groupId = &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param status the status
	* @return the number of matching layout page template entries that the user has permission to view
	*/
	public int filterCountByG_T_S(long groupId, int type, int status);

	/**
	* Returns all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param status the status
	* @return the matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_L_LikeN_S(
		long groupId, long layoutPageTemplateCollectionId, String name,
		int status);

	/**
	* Returns a range of all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_L_LikeN_S(
		long groupId, long layoutPageTemplateCollectionId, String name,
		int status, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_L_LikeN_S(
		long groupId, long layoutPageTemplateCollectionId, String name,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_L_LikeN_S(
		long groupId, long layoutPageTemplateCollectionId, String name,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_L_LikeN_S_First(long groupId,
		long layoutPageTemplateCollectionId, String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_L_LikeN_S_First(long groupId,
		long layoutPageTemplateCollectionId, String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_L_LikeN_S_Last(long groupId,
		long layoutPageTemplateCollectionId, String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_L_LikeN_S_Last(long groupId,
		long layoutPageTemplateCollectionId, String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63; and status = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] findByG_L_LikeN_S_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId,
		long layoutPageTemplateCollectionId, String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns all the layout page template entries that the user has permission to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param status the status
	* @return the matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_L_LikeN_S(
		long groupId, long layoutPageTemplateCollectionId, String name,
		int status);

	/**
	* Returns a range of all the layout page template entries that the user has permission to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_L_LikeN_S(
		long groupId, long layoutPageTemplateCollectionId, String name,
		int status, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries that the user has permissions to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_L_LikeN_S(
		long groupId, long layoutPageTemplateCollectionId, String name,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set of layout page template entries that the user has permission to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63; and status = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] filterFindByG_L_LikeN_S_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId,
		long layoutPageTemplateCollectionId, String name, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Removes all the layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param status the status
	*/
	public void removeByG_L_LikeN_S(long groupId,
		long layoutPageTemplateCollectionId, String name, int status);

	/**
	* Returns the number of layout page template entries where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param status the status
	* @return the number of matching layout page template entries
	*/
	public int countByG_L_LikeN_S(long groupId,
		long layoutPageTemplateCollectionId, String name, int status);

	/**
	* Returns the number of layout page template entries that the user has permission to view where groupId = &#63; and layoutPageTemplateCollectionId = &#63; and name LIKE &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param layoutPageTemplateCollectionId the layout page template collection ID
	* @param name the name
	* @param status the status
	* @return the number of matching layout page template entries that the user has permission to view
	*/
	public int filterCountByG_L_LikeN_S(long groupId,
		long layoutPageTemplateCollectionId, String name, int status);

	/**
	* Returns all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @return the matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_T(long groupId,
		long classNameId, long classTypeId, int type);

	/**
	* Returns a range of all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_T(long groupId,
		long classNameId, long classTypeId, int type, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_T(long groupId,
		long classNameId, long classTypeId, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_T(long groupId,
		long classNameId, long classTypeId, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_C_C_T_First(long groupId,
		long classNameId, long classTypeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_C_C_T_First(long groupId,
		long classNameId, long classTypeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_C_C_T_Last(long groupId,
		long classNameId, long classTypeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_C_C_T_Last(long groupId,
		long classNameId, long classTypeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] findByG_C_C_T_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, long classNameId,
		long classTypeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns all the layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @return the matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_C_C_T(
		long groupId, long classNameId, long classTypeId, int type);

	/**
	* Returns a range of all the layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_C_C_T(
		long groupId, long classNameId, long classTypeId, int type, int start,
		int end);

	/**
	* Returns an ordered range of all the layout page template entries that the user has permissions to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_C_C_T(
		long groupId, long classNameId, long classTypeId, int type, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set of layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] filterFindByG_C_C_T_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, long classNameId,
		long classTypeId, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Removes all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63; from the database.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	*/
	public void removeByG_C_C_T(long groupId, long classNameId,
		long classTypeId, int type);

	/**
	* Returns the number of layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @return the number of matching layout page template entries
	*/
	public int countByG_C_C_T(long groupId, long classNameId, long classTypeId,
		int type);

	/**
	* Returns the number of layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @return the number of matching layout page template entries that the user has permission to view
	*/
	public int filterCountByG_C_C_T(long groupId, long classNameId,
		long classTypeId, int type);

	/**
	* Returns all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @return the matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_D(long groupId,
		long classNameId, long classTypeId, boolean defaultTemplate);

	/**
	* Returns a range of all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_D(long groupId,
		long classNameId, long classTypeId, boolean defaultTemplate, int start,
		int end);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_D(long groupId,
		long classNameId, long classTypeId, boolean defaultTemplate, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_D(long groupId,
		long classNameId, long classTypeId, boolean defaultTemplate, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_C_C_D_First(long groupId,
		long classNameId, long classTypeId, boolean defaultTemplate,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_C_C_D_First(long groupId,
		long classNameId, long classTypeId, boolean defaultTemplate,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_C_C_D_Last(long groupId,
		long classNameId, long classTypeId, boolean defaultTemplate,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_C_C_D_Last(long groupId,
		long classNameId, long classTypeId, boolean defaultTemplate,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] findByG_C_C_D_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, long classNameId,
		long classTypeId, boolean defaultTemplate,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns all the layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @return the matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_C_C_D(
		long groupId, long classNameId, long classTypeId,
		boolean defaultTemplate);

	/**
	* Returns a range of all the layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_C_C_D(
		long groupId, long classNameId, long classTypeId,
		boolean defaultTemplate, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries that the user has permissions to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_C_C_D(
		long groupId, long classNameId, long classTypeId,
		boolean defaultTemplate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set of layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] filterFindByG_C_C_D_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, long classNameId,
		long classTypeId, boolean defaultTemplate,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Removes all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63; from the database.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	*/
	public void removeByG_C_C_D(long groupId, long classNameId,
		long classTypeId, boolean defaultTemplate);

	/**
	* Returns the number of layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @return the number of matching layout page template entries
	*/
	public int countByG_C_C_D(long groupId, long classNameId, long classTypeId,
		boolean defaultTemplate);

	/**
	* Returns the number of layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @return the number of matching layout page template entries that the user has permission to view
	*/
	public int filterCountByG_C_C_D(long groupId, long classNameId,
		long classTypeId, boolean defaultTemplate);

	/**
	* Returns all the layout page template entries where groupId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @return the matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_T_LikeN_S(
		long groupId, String name, int type, int status);

	/**
	* Returns a range of all the layout page template entries where groupId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_T_LikeN_S(
		long groupId, String name, int type, int status, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_T_LikeN_S(
		long groupId, String name, int type, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_T_LikeN_S(
		long groupId, String name, int type, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_T_LikeN_S_First(long groupId,
		String name, int type, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_T_LikeN_S_First(long groupId,
		String name, int type, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_T_LikeN_S_Last(long groupId,
		String name, int type, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_T_LikeN_S_Last(long groupId,
		String name, int type, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set where groupId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] findByG_T_LikeN_S_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, String name, int type,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns all the layout page template entries that the user has permission to view where groupId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @return the matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_T_LikeN_S(
		long groupId, String name, int type, int status);

	/**
	* Returns a range of all the layout page template entries that the user has permission to view where groupId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_T_LikeN_S(
		long groupId, String name, int type, int status, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries that the user has permissions to view where groupId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_T_LikeN_S(
		long groupId, String name, int type, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set of layout page template entries that the user has permission to view where groupId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] filterFindByG_T_LikeN_S_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, String name, int type,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Removes all the layout page template entries where groupId = &#63; and name LIKE &#63; and type = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param status the status
	*/
	public void removeByG_T_LikeN_S(long groupId, String name, int type,
		int status);

	/**
	* Returns the number of layout page template entries where groupId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @return the number of matching layout page template entries
	*/
	public int countByG_T_LikeN_S(long groupId, String name, int type,
		int status);

	/**
	* Returns the number of layout page template entries that the user has permission to view where groupId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @return the number of matching layout page template entries that the user has permission to view
	*/
	public int filterCountByG_T_LikeN_S(long groupId, String name, int type,
		int status);

	/**
	* Returns all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @return the matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_LikeN_T(
		long groupId, long classNameId, long classTypeId, String name, int type);

	/**
	* Returns a range of all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_LikeN_T(
		long groupId, long classNameId, long classTypeId, String name,
		int type, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_LikeN_T(
		long groupId, long classNameId, long classTypeId, String name,
		int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_LikeN_T(
		long groupId, long classNameId, long classTypeId, String name,
		int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_C_C_LikeN_T_First(long groupId,
		long classNameId, long classTypeId, String name, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_C_C_LikeN_T_First(long groupId,
		long classNameId, long classTypeId, String name, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_C_C_LikeN_T_Last(long groupId,
		long classNameId, long classTypeId, String name, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_C_C_LikeN_T_Last(long groupId,
		long classNameId, long classTypeId, String name, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] findByG_C_C_LikeN_T_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, long classNameId,
		long classTypeId, String name, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns all the layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @return the matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_C_C_LikeN_T(
		long groupId, long classNameId, long classTypeId, String name, int type);

	/**
	* Returns a range of all the layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_C_C_LikeN_T(
		long groupId, long classNameId, long classTypeId, String name,
		int type, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries that the user has permissions to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_C_C_LikeN_T(
		long groupId, long classNameId, long classTypeId, String name,
		int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set of layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] filterFindByG_C_C_LikeN_T_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, long classNameId,
		long classTypeId, String name, int type,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Removes all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63; from the database.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	*/
	public void removeByG_C_C_LikeN_T(long groupId, long classNameId,
		long classTypeId, String name, int type);

	/**
	* Returns the number of layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @return the number of matching layout page template entries
	*/
	public int countByG_C_C_LikeN_T(long groupId, long classNameId,
		long classTypeId, String name, int type);

	/**
	* Returns the number of layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @return the number of matching layout page template entries that the user has permission to view
	*/
	public int filterCountByG_C_C_LikeN_T(long groupId, long classNameId,
		long classTypeId, String name, int type);

	/**
	* Returns all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param status the status
	* @return the matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_T_S(
		long groupId, long classNameId, long classTypeId, int type, int status);

	/**
	* Returns a range of all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_T_S(
		long groupId, long classNameId, long classTypeId, int type, int status,
		int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_T_S(
		long groupId, long classNameId, long classTypeId, int type, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_T_S(
		long groupId, long classNameId, long classTypeId, int type, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_C_C_T_S_First(long groupId,
		long classNameId, long classTypeId, int type, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_C_C_T_S_First(long groupId,
		long classNameId, long classTypeId, int type, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_C_C_T_S_Last(long groupId,
		long classNameId, long classTypeId, int type, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_C_C_T_S_Last(long groupId,
		long classNameId, long classTypeId, int type, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63; and status = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] findByG_C_C_T_S_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, long classNameId,
		long classTypeId, int type, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns all the layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param status the status
	* @return the matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_C_C_T_S(
		long groupId, long classNameId, long classTypeId, int type, int status);

	/**
	* Returns a range of all the layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_C_C_T_S(
		long groupId, long classNameId, long classTypeId, int type, int status,
		int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries that the user has permissions to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_C_C_T_S(
		long groupId, long classNameId, long classTypeId, int type, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set of layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63; and status = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] filterFindByG_C_C_T_S_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, long classNameId,
		long classTypeId, int type, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Removes all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param status the status
	*/
	public void removeByG_C_C_T_S(long groupId, long classNameId,
		long classTypeId, int type, int status);

	/**
	* Returns the number of layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param status the status
	* @return the number of matching layout page template entries
	*/
	public int countByG_C_C_T_S(long groupId, long classNameId,
		long classTypeId, int type, int status);

	/**
	* Returns the number of layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param type the type
	* @param status the status
	* @return the number of matching layout page template entries that the user has permission to view
	*/
	public int filterCountByG_C_C_T_S(long groupId, long classNameId,
		long classTypeId, int type, int status);

	/**
	* Returns all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param status the status
	* @return the matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_D_S(
		long groupId, long classNameId, long classTypeId,
		boolean defaultTemplate, int status);

	/**
	* Returns a range of all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_D_S(
		long groupId, long classNameId, long classTypeId,
		boolean defaultTemplate, int status, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_D_S(
		long groupId, long classNameId, long classTypeId,
		boolean defaultTemplate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_D_S(
		long groupId, long classNameId, long classTypeId,
		boolean defaultTemplate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_C_C_D_S_First(long groupId,
		long classNameId, long classTypeId, boolean defaultTemplate,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_C_C_D_S_First(long groupId,
		long classNameId, long classTypeId, boolean defaultTemplate,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_C_C_D_S_Last(long groupId,
		long classNameId, long classTypeId, boolean defaultTemplate,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_C_C_D_S_Last(long groupId,
		long classNameId, long classTypeId, boolean defaultTemplate,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63; and status = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] findByG_C_C_D_S_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, long classNameId,
		long classTypeId, boolean defaultTemplate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns all the layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param status the status
	* @return the matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_C_C_D_S(
		long groupId, long classNameId, long classTypeId,
		boolean defaultTemplate, int status);

	/**
	* Returns a range of all the layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_C_C_D_S(
		long groupId, long classNameId, long classTypeId,
		boolean defaultTemplate, int status, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries that the user has permissions to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_C_C_D_S(
		long groupId, long classNameId, long classTypeId,
		boolean defaultTemplate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set of layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63; and status = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] filterFindByG_C_C_D_S_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, long classNameId,
		long classTypeId, boolean defaultTemplate, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Removes all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param status the status
	*/
	public void removeByG_C_C_D_S(long groupId, long classNameId,
		long classTypeId, boolean defaultTemplate, int status);

	/**
	* Returns the number of layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param status the status
	* @return the number of matching layout page template entries
	*/
	public int countByG_C_C_D_S(long groupId, long classNameId,
		long classTypeId, boolean defaultTemplate, int status);

	/**
	* Returns the number of layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and defaultTemplate = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param defaultTemplate the default template
	* @param status the status
	* @return the number of matching layout page template entries that the user has permission to view
	*/
	public int filterCountByG_C_C_D_S(long groupId, long classNameId,
		long classTypeId, boolean defaultTemplate, int status);

	/**
	* Returns all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @return the matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_LikeN_T_S(
		long groupId, long classNameId, long classTypeId, String name,
		int type, int status);

	/**
	* Returns a range of all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_LikeN_T_S(
		long groupId, long classNameId, long classTypeId, String name,
		int type, int status, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_LikeN_T_S(
		long groupId, long classNameId, long classTypeId, String name,
		int type, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns an ordered range of all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findByG_C_C_LikeN_T_S(
		long groupId, long classNameId, long classTypeId, String name,
		int type, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_C_C_LikeN_T_S_First(long groupId,
		long classNameId, long classTypeId, String name, int type, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the first layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_C_C_LikeN_T_S_First(long groupId,
		long classNameId, long classTypeId, String name, int type, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry
	* @throws NoSuchPageTemplateEntryException if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry findByG_C_C_LikeN_T_S_Last(long groupId,
		long classNameId, long classTypeId, String name, int type, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns the last layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout page template entry, or <code>null</code> if a matching layout page template entry could not be found
	*/
	public LayoutPageTemplateEntry fetchByG_C_C_LikeN_T_S_Last(long groupId,
		long classNameId, long classTypeId, String name, int type, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] findByG_C_C_LikeN_T_S_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, long classNameId,
		long classTypeId, String name, int type, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Returns all the layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @return the matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_C_C_LikeN_T_S(
		long groupId, long classNameId, long classTypeId, String name,
		int type, int status);

	/**
	* Returns a range of all the layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_C_C_LikeN_T_S(
		long groupId, long classNameId, long classTypeId, String name,
		int type, int status, int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries that the user has permissions to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout page template entries that the user has permission to view
	*/
	public java.util.List<LayoutPageTemplateEntry> filterFindByG_C_C_LikeN_T_S(
		long groupId, long classNameId, long classTypeId, String name,
		int type, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns the layout page template entries before and after the current layout page template entry in the ordered set of layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param layoutPageTemplateEntryId the primary key of the current layout page template entry
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry[] filterFindByG_C_C_LikeN_T_S_PrevAndNext(
		long layoutPageTemplateEntryId, long groupId, long classNameId,
		long classTypeId, String name, int type, int status,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator)
		throws NoSuchPageTemplateEntryException;

	/**
	* Removes all the layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param status the status
	*/
	public void removeByG_C_C_LikeN_T_S(long groupId, long classNameId,
		long classTypeId, String name, int type, int status);

	/**
	* Returns the number of layout page template entries where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @return the number of matching layout page template entries
	*/
	public int countByG_C_C_LikeN_T_S(long groupId, long classNameId,
		long classTypeId, String name, int type, int status);

	/**
	* Returns the number of layout page template entries that the user has permission to view where groupId = &#63; and classNameId = &#63; and classTypeId = &#63; and name LIKE &#63; and type = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classTypeId the class type ID
	* @param name the name
	* @param type the type
	* @param status the status
	* @return the number of matching layout page template entries that the user has permission to view
	*/
	public int filterCountByG_C_C_LikeN_T_S(long groupId, long classNameId,
		long classTypeId, String name, int type, int status);

	/**
	* Caches the layout page template entry in the entity cache if it is enabled.
	*
	* @param layoutPageTemplateEntry the layout page template entry
	*/
	public void cacheResult(LayoutPageTemplateEntry layoutPageTemplateEntry);

	/**
	* Caches the layout page template entries in the entity cache if it is enabled.
	*
	* @param layoutPageTemplateEntries the layout page template entries
	*/
	public void cacheResult(
		java.util.List<LayoutPageTemplateEntry> layoutPageTemplateEntries);

	/**
	* Creates a new layout page template entry with the primary key. Does not add the layout page template entry to the database.
	*
	* @param layoutPageTemplateEntryId the primary key for the new layout page template entry
	* @return the new layout page template entry
	*/
	public LayoutPageTemplateEntry create(long layoutPageTemplateEntryId);

	/**
	* Removes the layout page template entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param layoutPageTemplateEntryId the primary key of the layout page template entry
	* @return the layout page template entry that was removed
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry remove(long layoutPageTemplateEntryId)
		throws NoSuchPageTemplateEntryException;

	public LayoutPageTemplateEntry updateImpl(
		LayoutPageTemplateEntry layoutPageTemplateEntry);

	/**
	* Returns the layout page template entry with the primary key or throws a {@link NoSuchPageTemplateEntryException} if it could not be found.
	*
	* @param layoutPageTemplateEntryId the primary key of the layout page template entry
	* @return the layout page template entry
	* @throws NoSuchPageTemplateEntryException if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry findByPrimaryKey(
		long layoutPageTemplateEntryId) throws NoSuchPageTemplateEntryException;

	/**
	* Returns the layout page template entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param layoutPageTemplateEntryId the primary key of the layout page template entry
	* @return the layout page template entry, or <code>null</code> if a layout page template entry with the primary key could not be found
	*/
	public LayoutPageTemplateEntry fetchByPrimaryKey(
		long layoutPageTemplateEntryId);

	@Override
	public java.util.Map<java.io.Serializable, LayoutPageTemplateEntry> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the layout page template entries.
	*
	* @return the layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findAll();

	/**
	* Returns a range of all the layout page template entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @return the range of layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findAll(int start, int end);

	/**
	* Returns an ordered range of all the layout page template entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator);

	/**
	* Returns an ordered range of all the layout page template entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LayoutPageTemplateEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of layout page template entries
	* @param end the upper bound of the range of layout page template entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of layout page template entries
	*/
	public java.util.List<LayoutPageTemplateEntry> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LayoutPageTemplateEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the layout page template entries from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of layout page template entries.
	*
	* @return the number of layout page template entries
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}