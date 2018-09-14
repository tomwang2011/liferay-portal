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

package com.liferay.sharing.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistry;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;
import com.liferay.sharing.constants.SharingEntryActionKey;
import com.liferay.sharing.exception.InvalidSharingEntryActionKeyException;
import com.liferay.sharing.exception.InvalidSharingEntryExpirationDateException;
import com.liferay.sharing.exception.InvalidSharingEntryUserException;
import com.liferay.sharing.model.SharingEntry;
import com.liferay.sharing.service.base.SharingEntryLocalServiceBaseImpl;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Sergio González
 */
public class SharingEntryLocalServiceImpl
	extends SharingEntryLocalServiceBaseImpl {

	@Override
	public SharingEntry addOrUpdateSharingEntry(
			long fromUserId, long toUserId, long classNameId, long classPK,
			long groupId, boolean shareable,
			Collection<SharingEntryActionKey> sharingEntryActionKeys,
			Date expirationDate, ServiceContext serviceContext)
		throws PortalException {

		SharingEntry sharingEntry = sharingEntryPersistence.fetchByFU_TU_C_C(
			fromUserId, toUserId, classNameId, classPK);

		if (sharingEntry == null) {
			return sharingEntryLocalService.addSharingEntry(
				fromUserId, toUserId, classNameId, classPK, groupId, shareable,
				sharingEntryActionKeys, expirationDate, serviceContext);
		}

		return sharingEntryLocalService.updateSharingEntry(
			sharingEntry.getSharingEntryId(), sharingEntryActionKeys, shareable,
			expirationDate, serviceContext);
	}

	@Override
	public SharingEntry addSharingEntry(
			long fromUserId, long toUserId, long classNameId, long classPK,
			long groupId, boolean shareable,
			Collection<SharingEntryActionKey> sharingEntryActionKeys,
			Date expirationDate, ServiceContext serviceContext)
		throws PortalException {

		_validateSharingEntryActionKeys(sharingEntryActionKeys);

		_validateUsers(fromUserId, toUserId);

		_validateExpirationDate(expirationDate);

		long sharingEntryId = counterLocalService.increment();

		SharingEntry sharingEntry = sharingEntryPersistence.create(
			sharingEntryId);

		sharingEntry.setUuid(serviceContext.getUuid());

		Group group = _groupLocalService.getGroup(groupId);

		sharingEntry.setCompanyId(group.getCompanyId());

		sharingEntry.setGroupId(groupId);
		sharingEntry.setFromUserId(fromUserId);
		sharingEntry.setToUserId(toUserId);
		sharingEntry.setClassNameId(classNameId);
		sharingEntry.setClassPK(classPK);
		sharingEntry.setShareable(shareable);
		sharingEntry.setExpirationDate(expirationDate);

		Stream<SharingEntryActionKey> sharingEntryActionKeyStream =
			sharingEntryActionKeys.stream();

		sharingEntryActionKeyStream.map(
			SharingEntryActionKey::getBitwiseValue
		).reduce(
			(bitwiseValue1, bitwiseValue2) -> bitwiseValue1 | bitwiseValue2
		).ifPresent(
			actionIds -> sharingEntry.setActionIds(actionIds)
		);

		SharingEntry newSharingEntry = sharingEntryPersistence.update(
			sharingEntry);

		String className = _portal.getClassName(classNameId);

		Indexer<Object> indexer = _indexerRegistry.getIndexer(className);

		if (indexer != null) {
			indexer.reindex(className, classPK);
		}

		return newSharingEntry;
	}

	@Override
	public int countFromUserSharingEntries(long fromUserId) {
		return sharingEntryPersistence.countByFromUserId(fromUserId);
	}

	@Override
	public int countFromUserSharingEntries(
		long fromUserId, long classNameId, long classPK) {

		return sharingEntryPersistence.countByFU_C_C(
			fromUserId, classNameId, classPK);
	}

	@Override
	public int countToUserSharingEntries(long toUserId) {
		return sharingEntryPersistence.countByToUserId(toUserId);
	}

	@Override
	public void deleteExpiredEntries() {
		sharingEntryPersistence.removeByExpirationDate(DateUtil.newDate());
	}

	@Override
	public void deleteGroupSharingEntries(long groupId) {
		List<SharingEntry> sharingEntries =
			sharingEntryPersistence.findByGroupId(groupId);

		for (SharingEntry sharingEntry : sharingEntries) {
			_deleteSharingEntry(sharingEntry);
		}
	}

	@Override
	public void deleteSharingEntries(long classNameId, long classPK) {
		List<SharingEntry> sharingEntries = sharingEntryPersistence.findByC_C(
			classNameId, classPK);

		for (SharingEntry sharingEntry : sharingEntries) {
			_deleteSharingEntry(sharingEntry);
		}
	}

	@Override
	public SharingEntry deleteSharingEntry(
			long fromUserId, long toUserId, long classNameId, long classPK)
		throws PortalException {

		SharingEntry sharingEntry = sharingEntryPersistence.findByFU_TU_C_C(
			fromUserId, toUserId, classNameId, classPK);

		return _deleteSharingEntry(sharingEntry);
	}

	@Override
	public void deleteToUserSharingEntries(long toUserId) {
		List<SharingEntry> sharingEntries =
			sharingEntryPersistence.findByToUserId(toUserId);

		for (SharingEntry sharingEntry : sharingEntries) {
			_deleteSharingEntry(sharingEntry);
		}
	}

	@Override
	public List<SharingEntry> getFromUserSharingEntries(long fromUserId) {
		return sharingEntryPersistence.findByFromUserId(fromUserId);
	}

	@Override
	public List<SharingEntry> getFromUserSharingEntries(
		long fromUserId, long classNameId, long classPK) {

		return sharingEntryPersistence.findByFU_C_C(
			fromUserId, classNameId, classPK);
	}

	@Override
	public List<SharingEntry> getFromUserSharingEntries(
		long fromUserId, long classNameId, long classPK, int start, int end) {

		return sharingEntryPersistence.findByFU_C_C(
			fromUserId, classNameId, classPK, start, end);
	}

	@Override
	public List<SharingEntry> getGroupSharingEntries(long groupId) {
		return sharingEntryPersistence.findByGroupId(groupId);
	}

	@Override
	public List<SharingEntry> getSharingEntries(
		long classNameId, long classPK) {

		return sharingEntryPersistence.findByC_C(classNameId, classPK);
	}

	@Override
	public List<SharingEntry> getSharingEntries(
		long toUserId, long classNameId, long classPK) {

		return sharingEntryPersistence.findByTU_C_C(
			toUserId, classNameId, classPK);
	}

	@Override
	public List<SharingEntry> getToUserSharingEntries(long toUserId) {
		return sharingEntryPersistence.findByToUserId(toUserId);
	}

	@Override
	public List<SharingEntry> getToUserSharingEntries(
		long toUserId, long classNameId) {

		return sharingEntryPersistence.findByTU_C(toUserId, classNameId);
	}

	@Override
	public boolean hasShareableSharingPermission(
		long toUserId, long classNameId, long classPK,
		SharingEntryActionKey sharingEntryActionKey) {

		List<SharingEntry> sharingEntries =
			sharingEntryPersistence.findByTU_C_C(
				toUserId, classNameId, classPK);

		for (SharingEntry sharingEntry : sharingEntries) {
			if (!sharingEntry.isShareable()) {
				continue;
			}

			if (hasSharingPermission(sharingEntry, sharingEntryActionKey)) {
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean hasSharingPermission(
		long toUserId, long classNameId, long classPK,
		SharingEntryActionKey sharingEntryActionKey) {

		List<SharingEntry> sharingEntries =
			sharingEntryPersistence.findByTU_C_C(
				toUserId, classNameId, classPK);

		for (SharingEntry sharingEntry : sharingEntries) {
			if (hasSharingPermission(sharingEntry, sharingEntryActionKey)) {
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean hasSharingPermission(
		SharingEntry sharingEntry,
		SharingEntryActionKey sharingEntryActionKey) {

		long actionIds = sharingEntry.getActionIds();

		if ((actionIds & sharingEntryActionKey.getBitwiseValue()) != 0) {
			return true;
		}

		return false;
	}

	@Override
	public SharingEntry updateSharingEntry(
			long sharingEntryId,
			Collection<SharingEntryActionKey> sharingEntryActionKeys,
			boolean shareable, Date expirationDate,
			ServiceContext serviceContext)
		throws PortalException {

		SharingEntry sharingEntry = sharingEntryPersistence.findByPrimaryKey(
			sharingEntryId);

		_validateSharingEntryActionKeys(sharingEntryActionKeys);

		_validateExpirationDate(expirationDate);

		sharingEntry.setShareable(shareable);
		sharingEntry.setExpirationDate(expirationDate);

		Stream<SharingEntryActionKey> sharingEntryActionKeyStream =
			sharingEntryActionKeys.stream();

		sharingEntryActionKeyStream.map(
			SharingEntryActionKey::getBitwiseValue
		).reduce(
			(bitwiseValue1, bitwiseValue2) -> bitwiseValue1 | bitwiseValue2
		).ifPresent(
			actionIds -> sharingEntry.setActionIds(actionIds)
		);

		return sharingEntryPersistence.update(sharingEntry);
	}

	private SharingEntry _deleteSharingEntry(SharingEntry sharingEntry) {
		String className = sharingEntry.getClassName();
		long classPK = sharingEntry.getClassPK();

		SharingEntry deletedSharingEntry = sharingEntryPersistence.remove(
			sharingEntry);

		Indexer<Object> indexer = _indexerRegistry.getIndexer(className);

		if (indexer != null) {
			try {
				indexer.reindex(className, classPK);
			}
			catch (SearchException se) {
				if (_log.isWarnEnabled()) {
					_log.warn(
						StringBundler.concat(
							"Unable to index sharing entry for class name ",
							className, " and primary key ",
							String.valueOf(classPK)),
						se);
				}
			}
		}

		return deletedSharingEntry;
	}

	private void _validateExpirationDate(Date expirationDate)
		throws InvalidSharingEntryExpirationDateException {

		if ((expirationDate != null) &&
			expirationDate.before(DateUtil.newDate())) {

			throw new InvalidSharingEntryExpirationDateException(
				"Expiration date is in the past");
		}
	}

	private void _validateSharingEntryActionKeys(
			Collection<SharingEntryActionKey> sharedEntryActionKeys)
		throws InvalidSharingEntryActionKeyException {

		if (sharedEntryActionKeys.isEmpty()) {
			throw new InvalidSharingEntryActionKeyException(
				"Shared entry action keys is empty");
		}

		for (SharingEntryActionKey curSharingEntryActionKey :
				sharedEntryActionKeys) {

			if (curSharingEntryActionKey == null) {
				throw new InvalidSharingEntryActionKeyException(
					"Shared entry action keys contains a null value");
			}
		}

		if (!sharedEntryActionKeys.contains(SharingEntryActionKey.VIEW)) {
			throw new InvalidSharingEntryActionKeyException(
				"Shared entry action keys must contain VIEW shared entry " +
					"action key");
		}
	}

	private void _validateUsers(long fromUserId, long toUserId)
		throws InvalidSharingEntryUserException {

		if (fromUserId == toUserId) {
			throw new InvalidSharingEntryUserException(
				"From user cannot be the same as to user");
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		SharingEntryLocalServiceImpl.class);

	@ServiceReference(type = GroupLocalService.class)
	private GroupLocalService _groupLocalService;

	@ServiceReference(type = IndexerRegistry.class)
	private IndexerRegistry _indexerRegistry;

	@ServiceReference(type = Portal.class)
	private Portal _portal;

}