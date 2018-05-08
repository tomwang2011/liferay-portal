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

package com.liferay.fragment.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.fragment.model.FragmentEntry;
import com.liferay.fragment.model.FragmentEntryModel;
import com.liferay.fragment.model.FragmentEntrySoap;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the FragmentEntry service. Represents a row in the &quot;FragmentEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link FragmentEntryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FragmentEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FragmentEntryImpl
 * @see FragmentEntry
 * @see FragmentEntryModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class FragmentEntryModelImpl extends BaseModelImpl<FragmentEntry>
	implements FragmentEntryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a fragment entry model instance should use the {@link FragmentEntry} interface instead.
	 */
	public static final String TABLE_NAME = "FragmentEntry";
	public static final Object[][] TABLE_COLUMNS = {
			{ "fragmentEntryId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "fragmentCollectionId", Types.BIGINT },
			{ "fragmentEntryKey", Types.VARCHAR },
			{ "name", Types.VARCHAR },
			{ "css", Types.VARCHAR },
			{ "html", Types.VARCHAR },
			{ "js", Types.VARCHAR },
			{ "htmlPreviewEntryId", Types.BIGINT },
			{ "status", Types.INTEGER },
			{ "statusByUserId", Types.BIGINT },
			{ "statusByUserName", Types.VARCHAR },
			{ "statusDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("fragmentEntryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("fragmentCollectionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("fragmentEntryKey", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("css", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("html", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("js", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("htmlPreviewEntryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("statusByUserId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("statusByUserName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("statusDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table FragmentEntry (fragmentEntryId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,fragmentCollectionId LONG,fragmentEntryKey VARCHAR(75) null,name VARCHAR(75) null,css STRING null,html STRING null,js STRING null,htmlPreviewEntryId LONG,status INTEGER,statusByUserId LONG,statusByUserName VARCHAR(75) null,statusDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table FragmentEntry";
	public static final String ORDER_BY_JPQL = " ORDER BY fragmentEntry.name ASC";
	public static final String ORDER_BY_SQL = " ORDER BY FragmentEntry.name ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.fragment.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.fragment.model.FragmentEntry"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.fragment.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.fragment.model.FragmentEntry"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.fragment.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.fragment.model.FragmentEntry"),
			true);
	public static final long FRAGMENTCOLLECTIONID_COLUMN_BITMASK = 1L;
	public static final long FRAGMENTENTRYKEY_COLUMN_BITMASK = 2L;
	public static final long GROUPID_COLUMN_BITMASK = 4L;
	public static final long NAME_COLUMN_BITMASK = 8L;
	public static final long STATUS_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static FragmentEntry toModel(FragmentEntrySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		FragmentEntry model = new FragmentEntryImpl();

		model.setFragmentEntryId(soapModel.getFragmentEntryId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setFragmentCollectionId(soapModel.getFragmentCollectionId());
		model.setFragmentEntryKey(soapModel.getFragmentEntryKey());
		model.setName(soapModel.getName());
		model.setCss(soapModel.getCss());
		model.setHtml(soapModel.getHtml());
		model.setJs(soapModel.getJs());
		model.setHtmlPreviewEntryId(soapModel.getHtmlPreviewEntryId());
		model.setStatus(soapModel.getStatus());
		model.setStatusByUserId(soapModel.getStatusByUserId());
		model.setStatusByUserName(soapModel.getStatusByUserName());
		model.setStatusDate(soapModel.getStatusDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<FragmentEntry> toModels(FragmentEntrySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<FragmentEntry> models = new ArrayList<FragmentEntry>(soapModels.length);

		for (FragmentEntrySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.fragment.service.util.ServiceProps.get(
				"lock.expiration.time.com.liferay.fragment.model.FragmentEntry"));

	public FragmentEntryModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _fragmentEntryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFragmentEntryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _fragmentEntryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return FragmentEntry.class;
	}

	@Override
	public String getModelClassName() {
		return FragmentEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fragmentEntryId", getFragmentEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("fragmentCollectionId", getFragmentCollectionId());
		attributes.put("fragmentEntryKey", getFragmentEntryKey());
		attributes.put("name", getName());
		attributes.put("css", getCss());
		attributes.put("html", getHtml());
		attributes.put("js", getJs());
		attributes.put("htmlPreviewEntryId", getHtmlPreviewEntryId());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fragmentEntryId = (Long)attributes.get("fragmentEntryId");

		if (fragmentEntryId != null) {
			setFragmentEntryId(fragmentEntryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long fragmentCollectionId = (Long)attributes.get("fragmentCollectionId");

		if (fragmentCollectionId != null) {
			setFragmentCollectionId(fragmentCollectionId);
		}

		String fragmentEntryKey = (String)attributes.get("fragmentEntryKey");

		if (fragmentEntryKey != null) {
			setFragmentEntryKey(fragmentEntryKey);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String css = (String)attributes.get("css");

		if (css != null) {
			setCss(css);
		}

		String html = (String)attributes.get("html");

		if (html != null) {
			setHtml(html);
		}

		String js = (String)attributes.get("js");

		if (js != null) {
			setJs(js);
		}

		Long htmlPreviewEntryId = (Long)attributes.get("htmlPreviewEntryId");

		if (htmlPreviewEntryId != null) {
			setHtmlPreviewEntryId(htmlPreviewEntryId);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	@JSON
	@Override
	public long getFragmentEntryId() {
		return _fragmentEntryId;
	}

	@Override
	public void setFragmentEntryId(long fragmentEntryId) {
		_fragmentEntryId = fragmentEntryId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getFragmentCollectionId() {
		return _fragmentCollectionId;
	}

	@Override
	public void setFragmentCollectionId(long fragmentCollectionId) {
		_columnBitmask |= FRAGMENTCOLLECTIONID_COLUMN_BITMASK;

		if (!_setOriginalFragmentCollectionId) {
			_setOriginalFragmentCollectionId = true;

			_originalFragmentCollectionId = _fragmentCollectionId;
		}

		_fragmentCollectionId = fragmentCollectionId;
	}

	public long getOriginalFragmentCollectionId() {
		return _originalFragmentCollectionId;
	}

	@JSON
	@Override
	public String getFragmentEntryKey() {
		if (_fragmentEntryKey == null) {
			return "";
		}
		else {
			return _fragmentEntryKey;
		}
	}

	@Override
	public void setFragmentEntryKey(String fragmentEntryKey) {
		_columnBitmask |= FRAGMENTENTRYKEY_COLUMN_BITMASK;

		if (_originalFragmentEntryKey == null) {
			_originalFragmentEntryKey = _fragmentEntryKey;
		}

		_fragmentEntryKey = fragmentEntryKey;
	}

	public String getOriginalFragmentEntryKey() {
		return GetterUtil.getString(_originalFragmentEntryKey);
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask = -1L;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	@JSON
	@Override
	public String getCss() {
		if (_css == null) {
			return "";
		}
		else {
			return _css;
		}
	}

	@Override
	public void setCss(String css) {
		_css = css;
	}

	@JSON
	@Override
	public String getHtml() {
		if (_html == null) {
			return "";
		}
		else {
			return _html;
		}
	}

	@Override
	public void setHtml(String html) {
		_html = html;
	}

	@JSON
	@Override
	public String getJs() {
		if (_js == null) {
			return "";
		}
		else {
			return _js;
		}
	}

	@Override
	public void setJs(String js) {
		_js = js;
	}

	@JSON
	@Override
	public long getHtmlPreviewEntryId() {
		return _htmlPreviewEntryId;
	}

	@Override
	public void setHtmlPreviewEntryId(long htmlPreviewEntryId) {
		_htmlPreviewEntryId = htmlPreviewEntryId;
	}

	@JSON
	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	@JSON
	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	@Override
	public String getStatusByUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getStatusByUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
	}

	@JSON
	@Override
	public String getStatusByUserName() {
		if (_statusByUserName == null) {
			return "";
		}
		else {
			return _statusByUserName;
		}
	}

	@Override
	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	@JSON
	@Override
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	@Override
	public boolean isApproved() {
		if (getStatus() == WorkflowConstants.STATUS_APPROVED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDenied() {
		if (getStatus() == WorkflowConstants.STATUS_DENIED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDraft() {
		if (getStatus() == WorkflowConstants.STATUS_DRAFT) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isExpired() {
		if (getStatus() == WorkflowConstants.STATUS_EXPIRED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isInactive() {
		if (getStatus() == WorkflowConstants.STATUS_INACTIVE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isIncomplete() {
		if (getStatus() == WorkflowConstants.STATUS_INCOMPLETE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isPending() {
		if (getStatus() == WorkflowConstants.STATUS_PENDING) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isScheduled() {
		if (getStatus() == WorkflowConstants.STATUS_SCHEDULED) {
			return true;
		}
		else {
			return false;
		}
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			FragmentEntry.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public FragmentEntry toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (FragmentEntry)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		FragmentEntryImpl fragmentEntryImpl = new FragmentEntryImpl();

		fragmentEntryImpl.setFragmentEntryId(getFragmentEntryId());
		fragmentEntryImpl.setGroupId(getGroupId());
		fragmentEntryImpl.setCompanyId(getCompanyId());
		fragmentEntryImpl.setUserId(getUserId());
		fragmentEntryImpl.setUserName(getUserName());
		fragmentEntryImpl.setCreateDate(getCreateDate());
		fragmentEntryImpl.setModifiedDate(getModifiedDate());
		fragmentEntryImpl.setFragmentCollectionId(getFragmentCollectionId());
		fragmentEntryImpl.setFragmentEntryKey(getFragmentEntryKey());
		fragmentEntryImpl.setName(getName());
		fragmentEntryImpl.setCss(getCss());
		fragmentEntryImpl.setHtml(getHtml());
		fragmentEntryImpl.setJs(getJs());
		fragmentEntryImpl.setHtmlPreviewEntryId(getHtmlPreviewEntryId());
		fragmentEntryImpl.setStatus(getStatus());
		fragmentEntryImpl.setStatusByUserId(getStatusByUserId());
		fragmentEntryImpl.setStatusByUserName(getStatusByUserName());
		fragmentEntryImpl.setStatusDate(getStatusDate());

		fragmentEntryImpl.resetOriginalValues();

		return fragmentEntryImpl;
	}

	@Override
	public int compareTo(FragmentEntry fragmentEntry) {
		int value = 0;

		value = getName().compareTo(fragmentEntry.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FragmentEntry)) {
			return false;
		}

		FragmentEntry fragmentEntry = (FragmentEntry)obj;

		long primaryKey = fragmentEntry.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		FragmentEntryModelImpl fragmentEntryModelImpl = this;

		fragmentEntryModelImpl._originalGroupId = fragmentEntryModelImpl._groupId;

		fragmentEntryModelImpl._setOriginalGroupId = false;

		fragmentEntryModelImpl._setModifiedDate = false;

		fragmentEntryModelImpl._originalFragmentCollectionId = fragmentEntryModelImpl._fragmentCollectionId;

		fragmentEntryModelImpl._setOriginalFragmentCollectionId = false;

		fragmentEntryModelImpl._originalFragmentEntryKey = fragmentEntryModelImpl._fragmentEntryKey;

		fragmentEntryModelImpl._originalName = fragmentEntryModelImpl._name;

		fragmentEntryModelImpl._originalStatus = fragmentEntryModelImpl._status;

		fragmentEntryModelImpl._setOriginalStatus = false;

		fragmentEntryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<FragmentEntry> toCacheModel() {
		FragmentEntryCacheModel fragmentEntryCacheModel = new FragmentEntryCacheModel();

		fragmentEntryCacheModel.fragmentEntryId = getFragmentEntryId();

		fragmentEntryCacheModel.groupId = getGroupId();

		fragmentEntryCacheModel.companyId = getCompanyId();

		fragmentEntryCacheModel.userId = getUserId();

		fragmentEntryCacheModel.userName = getUserName();

		String userName = fragmentEntryCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			fragmentEntryCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			fragmentEntryCacheModel.createDate = createDate.getTime();
		}
		else {
			fragmentEntryCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			fragmentEntryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			fragmentEntryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		fragmentEntryCacheModel.fragmentCollectionId = getFragmentCollectionId();

		fragmentEntryCacheModel.fragmentEntryKey = getFragmentEntryKey();

		String fragmentEntryKey = fragmentEntryCacheModel.fragmentEntryKey;

		if ((fragmentEntryKey != null) && (fragmentEntryKey.length() == 0)) {
			fragmentEntryCacheModel.fragmentEntryKey = null;
		}

		fragmentEntryCacheModel.name = getName();

		String name = fragmentEntryCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			fragmentEntryCacheModel.name = null;
		}

		fragmentEntryCacheModel.css = getCss();

		String css = fragmentEntryCacheModel.css;

		if ((css != null) && (css.length() == 0)) {
			fragmentEntryCacheModel.css = null;
		}

		fragmentEntryCacheModel.html = getHtml();

		String html = fragmentEntryCacheModel.html;

		if ((html != null) && (html.length() == 0)) {
			fragmentEntryCacheModel.html = null;
		}

		fragmentEntryCacheModel.js = getJs();

		String js = fragmentEntryCacheModel.js;

		if ((js != null) && (js.length() == 0)) {
			fragmentEntryCacheModel.js = null;
		}

		fragmentEntryCacheModel.htmlPreviewEntryId = getHtmlPreviewEntryId();

		fragmentEntryCacheModel.status = getStatus();

		fragmentEntryCacheModel.statusByUserId = getStatusByUserId();

		fragmentEntryCacheModel.statusByUserName = getStatusByUserName();

		String statusByUserName = fragmentEntryCacheModel.statusByUserName;

		if ((statusByUserName != null) && (statusByUserName.length() == 0)) {
			fragmentEntryCacheModel.statusByUserName = null;
		}

		Date statusDate = getStatusDate();

		if (statusDate != null) {
			fragmentEntryCacheModel.statusDate = statusDate.getTime();
		}
		else {
			fragmentEntryCacheModel.statusDate = Long.MIN_VALUE;
		}

		return fragmentEntryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{fragmentEntryId=");
		sb.append(getFragmentEntryId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", fragmentCollectionId=");
		sb.append(getFragmentCollectionId());
		sb.append(", fragmentEntryKey=");
		sb.append(getFragmentEntryKey());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", css=");
		sb.append(getCss());
		sb.append(", html=");
		sb.append(getHtml());
		sb.append(", js=");
		sb.append(getJs());
		sb.append(", htmlPreviewEntryId=");
		sb.append(getHtmlPreviewEntryId());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", statusByUserId=");
		sb.append(getStatusByUserId());
		sb.append(", statusByUserName=");
		sb.append(getStatusByUserName());
		sb.append(", statusDate=");
		sb.append(getStatusDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("com.liferay.fragment.model.FragmentEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>fragmentEntryId</column-name><column-value><![CDATA[");
		sb.append(getFragmentEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fragmentCollectionId</column-name><column-value><![CDATA[");
		sb.append(getFragmentCollectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fragmentEntryKey</column-name><column-value><![CDATA[");
		sb.append(getFragmentEntryKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>css</column-name><column-value><![CDATA[");
		sb.append(getCss());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>html</column-name><column-value><![CDATA[");
		sb.append(getHtml());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>js</column-name><column-value><![CDATA[");
		sb.append(getJs());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>htmlPreviewEntryId</column-name><column-value><![CDATA[");
		sb.append(getHtmlPreviewEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserId</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserName</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDate</column-name><column-value><![CDATA[");
		sb.append(getStatusDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = FragmentEntry.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			FragmentEntry.class
		};
	private long _fragmentEntryId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _fragmentCollectionId;
	private long _originalFragmentCollectionId;
	private boolean _setOriginalFragmentCollectionId;
	private String _fragmentEntryKey;
	private String _originalFragmentEntryKey;
	private String _name;
	private String _originalName;
	private String _css;
	private String _html;
	private String _js;
	private long _htmlPreviewEntryId;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private long _columnBitmask;
	private FragmentEntry _escapedModel;
}