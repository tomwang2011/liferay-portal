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

package com.liferay.dynamic.data.mapping.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.dynamic.data.mapping.exception.StorageException;
import com.liferay.dynamic.data.mapping.model.DDMFormInstanceRecord;
import com.liferay.dynamic.data.mapping.storage.DDMFormValues;

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.model.SystemEventConstants;
import com.liferay.portal.kernel.search.BaseModelSearchResult;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.systemevent.SystemEvent;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for DDMFormInstanceRecord. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see DDMFormInstanceRecordLocalServiceUtil
 * @see com.liferay.dynamic.data.mapping.service.base.DDMFormInstanceRecordLocalServiceBaseImpl
 * @see com.liferay.dynamic.data.mapping.service.impl.DDMFormInstanceRecordLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DDMFormInstanceRecordLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DDMFormInstanceRecordLocalServiceUtil} to access the ddm form instance record local service. Add custom service methods to {@link com.liferay.dynamic.data.mapping.service.impl.DDMFormInstanceRecordLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the ddm form instance record to the database. Also notifies the appropriate model listeners.
	*
	* @param ddmFormInstanceRecord the ddm form instance record
	* @return the ddm form instance record that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public DDMFormInstanceRecord addDDMFormInstanceRecord(
		DDMFormInstanceRecord ddmFormInstanceRecord);

	@Indexable(type = IndexableType.REINDEX)
	public DDMFormInstanceRecord addFormInstanceRecord(long userId,
		long groupId, long ddmFormInstanceId, DDMFormValues ddmFormValues,
		ServiceContext serviceContext) throws PortalException;

	/**
	* Creates a new ddm form instance record with the primary key. Does not add the ddm form instance record to the database.
	*
	* @param formInstanceRecordId the primary key for the new ddm form instance record
	* @return the new ddm form instance record
	*/
	@Transactional(enabled = false)
	public DDMFormInstanceRecord createDDMFormInstanceRecord(
		long formInstanceRecordId);

	/**
	* Deletes the ddm form instance record from the database. Also notifies the appropriate model listeners.
	*
	* @param ddmFormInstanceRecord the ddm form instance record
	* @return the ddm form instance record that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public DDMFormInstanceRecord deleteDDMFormInstanceRecord(
		DDMFormInstanceRecord ddmFormInstanceRecord);

	/**
	* Deletes the ddm form instance record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param formInstanceRecordId the primary key of the ddm form instance record
	* @return the ddm form instance record that was removed
	* @throws PortalException if a ddm form instance record with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public DDMFormInstanceRecord deleteDDMFormInstanceRecord(
		long formInstanceRecordId) throws PortalException;

	@Indexable(type = IndexableType.DELETE)
	@SystemEvent(action = SystemEventConstants.ACTION_SKIP, type = SystemEventConstants.TYPE_DELETE)
	public DDMFormInstanceRecord deleteFormInstanceRecord(
		DDMFormInstanceRecord ddmFormInstanceRecord) throws PortalException;

	public void deleteFormInstanceRecord(long ddmFormInstanceRecordId)
		throws PortalException;

	public void deleteFormInstanceRecords(long ddmFormInstanceId)
		throws PortalException;

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	public DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.dynamic.data.mapping.model.impl.DDMFormInstanceRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.dynamic.data.mapping.model.impl.DDMFormInstanceRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DDMFormInstanceRecord fetchDDMFormInstanceRecord(
		long formInstanceRecordId);

	/**
	* Returns the ddm form instance record matching the UUID and group.
	*
	* @param uuid the ddm form instance record's UUID
	* @param groupId the primary key of the group
	* @return the matching ddm form instance record, or <code>null</code> if a matching ddm form instance record could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DDMFormInstanceRecord fetchDDMFormInstanceRecordByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DDMFormInstanceRecord fetchFormInstanceRecord(
		long ddmFormInstanceRecordId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	* Returns the ddm form instance record with the primary key.
	*
	* @param formInstanceRecordId the primary key of the ddm form instance record
	* @return the ddm form instance record
	* @throws PortalException if a ddm form instance record with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DDMFormInstanceRecord getDDMFormInstanceRecord(
		long formInstanceRecordId) throws PortalException;

	/**
	* Returns the ddm form instance record matching the UUID and group.
	*
	* @param uuid the ddm form instance record's UUID
	* @param groupId the primary key of the group
	* @return the matching ddm form instance record
	* @throws PortalException if a matching ddm form instance record could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DDMFormInstanceRecord getDDMFormInstanceRecordByUuidAndGroupId(
		String uuid, long groupId) throws PortalException;

	/**
	* Returns a range of all the ddm form instance records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.dynamic.data.mapping.model.impl.DDMFormInstanceRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ddm form instance records
	* @param end the upper bound of the range of ddm form instance records (not inclusive)
	* @return the range of ddm form instance records
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DDMFormInstanceRecord> getDDMFormInstanceRecords(int start,
		int end);

	/**
	* Returns all the ddm form instance records matching the UUID and company.
	*
	* @param uuid the UUID of the ddm form instance records
	* @param companyId the primary key of the company
	* @return the matching ddm form instance records, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DDMFormInstanceRecord> getDDMFormInstanceRecordsByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	* Returns a range of ddm form instance records matching the UUID and company.
	*
	* @param uuid the UUID of the ddm form instance records
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of ddm form instance records
	* @param end the upper bound of the range of ddm form instance records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching ddm form instance records, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DDMFormInstanceRecord> getDDMFormInstanceRecordsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DDMFormInstanceRecord> orderByComparator);

	/**
	* Returns the number of ddm form instance records.
	*
	* @return the number of ddm form instance records
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDDMFormInstanceRecordsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DDMFormValues getDDMFormValues(long ddmStorageId)
		throws StorageException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DDMFormInstanceRecord getFormInstanceRecord(
		long ddmFormInstanceRecordId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DDMFormInstanceRecord> getFormInstanceRecords(
		long ddmFormInstanceId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DDMFormInstanceRecord> getFormInstanceRecords(
		long ddmFormInstanceId, int status, int start, int end,
		OrderByComparator<DDMFormInstanceRecord> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DDMFormInstanceRecord> getFormInstanceRecords(
		long ddmFormInstanceId, long userId, int start, int end,
		OrderByComparator<DDMFormInstanceRecord> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getFormInstanceRecordsCount(long ddmFormInstanceId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getFormInstanceRecordsCount(long ddmFormInstanceId, int status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getFormInstanceRecordsCount(long ddmFormInstanceId, long userId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	public void revertFormInstanceRecord(long userId,
		long ddmFormInstanceRecordId, String version,
		ServiceContext serviceContext) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public BaseModelSearchResult<DDMFormInstanceRecord> searchFormInstanceRecords(
		SearchContext searchContext);

	/**
	* Updates the ddm form instance record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ddmFormInstanceRecord the ddm form instance record
	* @return the ddm form instance record that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public DDMFormInstanceRecord updateDDMFormInstanceRecord(
		DDMFormInstanceRecord ddmFormInstanceRecord);

	@Indexable(type = IndexableType.REINDEX)
	public DDMFormInstanceRecord updateFormInstanceRecord(long userId,
		long ddmFormInstanceRecordId, boolean majorVersion,
		DDMFormValues ddmFormValues, ServiceContext serviceContext)
		throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public DDMFormInstanceRecord updateStatus(long userId,
		long recordVersionId, int status, ServiceContext serviceContext)
		throws PortalException;
}