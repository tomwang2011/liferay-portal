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

package com.liferay.portal.workflow.kaleo.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.workflow.kaleo.model.KaleoTransition;
import com.liferay.portal.workflow.kaleo.model.KaleoTransitionModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the KaleoTransition service. Represents a row in the &quot;KaleoTransition&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link KaleoTransitionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link KaleoTransitionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTransitionImpl
 * @see KaleoTransition
 * @see KaleoTransitionModel
 * @generated
 */
@ProviderType
public class KaleoTransitionModelImpl extends BaseModelImpl<KaleoTransition>
	implements KaleoTransitionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a kaleo transition model instance should use the {@link KaleoTransition} interface instead.
	 */
	public static final String TABLE_NAME = "KaleoTransition";
	public static final Object[][] TABLE_COLUMNS = {
			{ "kaleoTransitionId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "kaleoDefinitionVersionId", Types.BIGINT },
			{ "kaleoNodeId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "sourceKaleoNodeId", Types.BIGINT },
			{ "sourceKaleoNodeName", Types.VARCHAR },
			{ "targetKaleoNodeId", Types.BIGINT },
			{ "targetKaleoNodeName", Types.VARCHAR },
			{ "defaultTransition", Types.BOOLEAN }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("kaleoTransitionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("kaleoDefinitionVersionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("kaleoNodeId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sourceKaleoNodeId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("sourceKaleoNodeName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("targetKaleoNodeId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("targetKaleoNodeName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("defaultTransition", Types.BOOLEAN);
	}

	public static final String TABLE_SQL_CREATE = "create table KaleoTransition (kaleoTransitionId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(200) null,createDate DATE null,modifiedDate DATE null,kaleoDefinitionVersionId LONG,kaleoNodeId LONG,name VARCHAR(200) null,description STRING null,sourceKaleoNodeId LONG,sourceKaleoNodeName VARCHAR(200) null,targetKaleoNodeId LONG,targetKaleoNodeName VARCHAR(200) null,defaultTransition BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table KaleoTransition";
	public static final String ORDER_BY_JPQL = " ORDER BY kaleoTransition.kaleoTransitionId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY KaleoTransition.kaleoTransitionId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.workflow.kaleo.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.portal.workflow.kaleo.model.KaleoTransition"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.workflow.kaleo.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.portal.workflow.kaleo.model.KaleoTransition"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.portal.workflow.kaleo.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.portal.workflow.kaleo.model.KaleoTransition"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long DEFAULTTRANSITION_COLUMN_BITMASK = 2L;
	public static final long KALEODEFINITIONVERSIONID_COLUMN_BITMASK = 4L;
	public static final long KALEONODEID_COLUMN_BITMASK = 8L;
	public static final long NAME_COLUMN_BITMASK = 16L;
	public static final long KALEOTRANSITIONID_COLUMN_BITMASK = 32L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.workflow.kaleo.service.util.ServiceProps.get(
				"lock.expiration.time.com.liferay.portal.workflow.kaleo.model.KaleoTransition"));

	public KaleoTransitionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _kaleoTransitionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setKaleoTransitionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _kaleoTransitionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return KaleoTransition.class;
	}

	@Override
	public String getModelClassName() {
		return KaleoTransition.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("kaleoTransitionId", getKaleoTransitionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("kaleoDefinitionVersionId", getKaleoDefinitionVersionId());
		attributes.put("kaleoNodeId", getKaleoNodeId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("sourceKaleoNodeId", getSourceKaleoNodeId());
		attributes.put("sourceKaleoNodeName", getSourceKaleoNodeName());
		attributes.put("targetKaleoNodeId", getTargetKaleoNodeId());
		attributes.put("targetKaleoNodeName", getTargetKaleoNodeName());
		attributes.put("defaultTransition", getDefaultTransition());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long kaleoTransitionId = (Long)attributes.get("kaleoTransitionId");

		if (kaleoTransitionId != null) {
			setKaleoTransitionId(kaleoTransitionId);
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

		Long kaleoDefinitionVersionId = (Long)attributes.get(
				"kaleoDefinitionVersionId");

		if (kaleoDefinitionVersionId != null) {
			setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
		}

		Long kaleoNodeId = (Long)attributes.get("kaleoNodeId");

		if (kaleoNodeId != null) {
			setKaleoNodeId(kaleoNodeId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long sourceKaleoNodeId = (Long)attributes.get("sourceKaleoNodeId");

		if (sourceKaleoNodeId != null) {
			setSourceKaleoNodeId(sourceKaleoNodeId);
		}

		String sourceKaleoNodeName = (String)attributes.get(
				"sourceKaleoNodeName");

		if (sourceKaleoNodeName != null) {
			setSourceKaleoNodeName(sourceKaleoNodeName);
		}

		Long targetKaleoNodeId = (Long)attributes.get("targetKaleoNodeId");

		if (targetKaleoNodeId != null) {
			setTargetKaleoNodeId(targetKaleoNodeId);
		}

		String targetKaleoNodeName = (String)attributes.get(
				"targetKaleoNodeName");

		if (targetKaleoNodeName != null) {
			setTargetKaleoNodeName(targetKaleoNodeName);
		}

		Boolean defaultTransition = (Boolean)attributes.get("defaultTransition");

		if (defaultTransition != null) {
			setDefaultTransition(defaultTransition);
		}
	}

	@Override
	public long getKaleoTransitionId() {
		return _kaleoTransitionId;
	}

	@Override
	public void setKaleoTransitionId(long kaleoTransitionId) {
		_columnBitmask = -1L;

		_kaleoTransitionId = kaleoTransitionId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

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

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

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

	@Override
	public long getKaleoDefinitionVersionId() {
		return _kaleoDefinitionVersionId;
	}

	@Override
	public void setKaleoDefinitionVersionId(long kaleoDefinitionVersionId) {
		_columnBitmask |= KALEODEFINITIONVERSIONID_COLUMN_BITMASK;

		if (!_setOriginalKaleoDefinitionVersionId) {
			_setOriginalKaleoDefinitionVersionId = true;

			_originalKaleoDefinitionVersionId = _kaleoDefinitionVersionId;
		}

		_kaleoDefinitionVersionId = kaleoDefinitionVersionId;
	}

	public long getOriginalKaleoDefinitionVersionId() {
		return _originalKaleoDefinitionVersionId;
	}

	@Override
	public long getKaleoNodeId() {
		return _kaleoNodeId;
	}

	@Override
	public void setKaleoNodeId(long kaleoNodeId) {
		_columnBitmask |= KALEONODEID_COLUMN_BITMASK;

		if (!_setOriginalKaleoNodeId) {
			_setOriginalKaleoNodeId = true;

			_originalKaleoNodeId = _kaleoNodeId;
		}

		_kaleoNodeId = kaleoNodeId;
	}

	public long getOriginalKaleoNodeId() {
		return _originalKaleoNodeId;
	}

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
		_columnBitmask |= NAME_COLUMN_BITMASK;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return "";
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public long getSourceKaleoNodeId() {
		return _sourceKaleoNodeId;
	}

	@Override
	public void setSourceKaleoNodeId(long sourceKaleoNodeId) {
		_sourceKaleoNodeId = sourceKaleoNodeId;
	}

	@Override
	public String getSourceKaleoNodeName() {
		if (_sourceKaleoNodeName == null) {
			return "";
		}
		else {
			return _sourceKaleoNodeName;
		}
	}

	@Override
	public void setSourceKaleoNodeName(String sourceKaleoNodeName) {
		_sourceKaleoNodeName = sourceKaleoNodeName;
	}

	@Override
	public long getTargetKaleoNodeId() {
		return _targetKaleoNodeId;
	}

	@Override
	public void setTargetKaleoNodeId(long targetKaleoNodeId) {
		_targetKaleoNodeId = targetKaleoNodeId;
	}

	@Override
	public String getTargetKaleoNodeName() {
		if (_targetKaleoNodeName == null) {
			return "";
		}
		else {
			return _targetKaleoNodeName;
		}
	}

	@Override
	public void setTargetKaleoNodeName(String targetKaleoNodeName) {
		_targetKaleoNodeName = targetKaleoNodeName;
	}

	@Override
	public boolean getDefaultTransition() {
		return _defaultTransition;
	}

	@Override
	public boolean isDefaultTransition() {
		return _defaultTransition;
	}

	@Override
	public void setDefaultTransition(boolean defaultTransition) {
		_columnBitmask |= DEFAULTTRANSITION_COLUMN_BITMASK;

		if (!_setOriginalDefaultTransition) {
			_setOriginalDefaultTransition = true;

			_originalDefaultTransition = _defaultTransition;
		}

		_defaultTransition = defaultTransition;
	}

	public boolean getOriginalDefaultTransition() {
		return _originalDefaultTransition;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			KaleoTransition.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public KaleoTransition toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (KaleoTransition)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		KaleoTransitionImpl kaleoTransitionImpl = new KaleoTransitionImpl();

		kaleoTransitionImpl.setKaleoTransitionId(getKaleoTransitionId());
		kaleoTransitionImpl.setGroupId(getGroupId());
		kaleoTransitionImpl.setCompanyId(getCompanyId());
		kaleoTransitionImpl.setUserId(getUserId());
		kaleoTransitionImpl.setUserName(getUserName());
		kaleoTransitionImpl.setCreateDate(getCreateDate());
		kaleoTransitionImpl.setModifiedDate(getModifiedDate());
		kaleoTransitionImpl.setKaleoDefinitionVersionId(getKaleoDefinitionVersionId());
		kaleoTransitionImpl.setKaleoNodeId(getKaleoNodeId());
		kaleoTransitionImpl.setName(getName());
		kaleoTransitionImpl.setDescription(getDescription());
		kaleoTransitionImpl.setSourceKaleoNodeId(getSourceKaleoNodeId());
		kaleoTransitionImpl.setSourceKaleoNodeName(getSourceKaleoNodeName());
		kaleoTransitionImpl.setTargetKaleoNodeId(getTargetKaleoNodeId());
		kaleoTransitionImpl.setTargetKaleoNodeName(getTargetKaleoNodeName());
		kaleoTransitionImpl.setDefaultTransition(getDefaultTransition());

		kaleoTransitionImpl.resetOriginalValues();

		return kaleoTransitionImpl;
	}

	@Override
	public int compareTo(KaleoTransition kaleoTransition) {
		int value = 0;

		if (getKaleoTransitionId() < kaleoTransition.getKaleoTransitionId()) {
			value = -1;
		}
		else if (getKaleoTransitionId() > kaleoTransition.getKaleoTransitionId()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof KaleoTransition)) {
			return false;
		}

		KaleoTransition kaleoTransition = (KaleoTransition)obj;

		long primaryKey = kaleoTransition.getPrimaryKey();

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
		KaleoTransitionModelImpl kaleoTransitionModelImpl = this;

		kaleoTransitionModelImpl._originalCompanyId = kaleoTransitionModelImpl._companyId;

		kaleoTransitionModelImpl._setOriginalCompanyId = false;

		kaleoTransitionModelImpl._setModifiedDate = false;

		kaleoTransitionModelImpl._originalKaleoDefinitionVersionId = kaleoTransitionModelImpl._kaleoDefinitionVersionId;

		kaleoTransitionModelImpl._setOriginalKaleoDefinitionVersionId = false;

		kaleoTransitionModelImpl._originalKaleoNodeId = kaleoTransitionModelImpl._kaleoNodeId;

		kaleoTransitionModelImpl._setOriginalKaleoNodeId = false;

		kaleoTransitionModelImpl._originalName = kaleoTransitionModelImpl._name;

		kaleoTransitionModelImpl._originalDefaultTransition = kaleoTransitionModelImpl._defaultTransition;

		kaleoTransitionModelImpl._setOriginalDefaultTransition = false;

		kaleoTransitionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<KaleoTransition> toCacheModel() {
		KaleoTransitionCacheModel kaleoTransitionCacheModel = new KaleoTransitionCacheModel();

		kaleoTransitionCacheModel.kaleoTransitionId = getKaleoTransitionId();

		kaleoTransitionCacheModel.groupId = getGroupId();

		kaleoTransitionCacheModel.companyId = getCompanyId();

		kaleoTransitionCacheModel.userId = getUserId();

		kaleoTransitionCacheModel.userName = getUserName();

		String userName = kaleoTransitionCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			kaleoTransitionCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			kaleoTransitionCacheModel.createDate = createDate.getTime();
		}
		else {
			kaleoTransitionCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			kaleoTransitionCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			kaleoTransitionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		kaleoTransitionCacheModel.kaleoDefinitionVersionId = getKaleoDefinitionVersionId();

		kaleoTransitionCacheModel.kaleoNodeId = getKaleoNodeId();

		kaleoTransitionCacheModel.name = getName();

		String name = kaleoTransitionCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			kaleoTransitionCacheModel.name = null;
		}

		kaleoTransitionCacheModel.description = getDescription();

		String description = kaleoTransitionCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			kaleoTransitionCacheModel.description = null;
		}

		kaleoTransitionCacheModel.sourceKaleoNodeId = getSourceKaleoNodeId();

		kaleoTransitionCacheModel.sourceKaleoNodeName = getSourceKaleoNodeName();

		String sourceKaleoNodeName = kaleoTransitionCacheModel.sourceKaleoNodeName;

		if ((sourceKaleoNodeName != null) &&
				(sourceKaleoNodeName.length() == 0)) {
			kaleoTransitionCacheModel.sourceKaleoNodeName = null;
		}

		kaleoTransitionCacheModel.targetKaleoNodeId = getTargetKaleoNodeId();

		kaleoTransitionCacheModel.targetKaleoNodeName = getTargetKaleoNodeName();

		String targetKaleoNodeName = kaleoTransitionCacheModel.targetKaleoNodeName;

		if ((targetKaleoNodeName != null) &&
				(targetKaleoNodeName.length() == 0)) {
			kaleoTransitionCacheModel.targetKaleoNodeName = null;
		}

		kaleoTransitionCacheModel.defaultTransition = getDefaultTransition();

		return kaleoTransitionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{kaleoTransitionId=");
		sb.append(getKaleoTransitionId());
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
		sb.append(", kaleoDefinitionVersionId=");
		sb.append(getKaleoDefinitionVersionId());
		sb.append(", kaleoNodeId=");
		sb.append(getKaleoNodeId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", sourceKaleoNodeId=");
		sb.append(getSourceKaleoNodeId());
		sb.append(", sourceKaleoNodeName=");
		sb.append(getSourceKaleoNodeName());
		sb.append(", targetKaleoNodeId=");
		sb.append(getTargetKaleoNodeId());
		sb.append(", targetKaleoNodeName=");
		sb.append(getTargetKaleoNodeName());
		sb.append(", defaultTransition=");
		sb.append(getDefaultTransition());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.workflow.kaleo.model.KaleoTransition");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>kaleoTransitionId</column-name><column-value><![CDATA[");
		sb.append(getKaleoTransitionId());
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
			"<column><column-name>kaleoDefinitionVersionId</column-name><column-value><![CDATA[");
		sb.append(getKaleoDefinitionVersionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoNodeId</column-name><column-value><![CDATA[");
		sb.append(getKaleoNodeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sourceKaleoNodeId</column-name><column-value><![CDATA[");
		sb.append(getSourceKaleoNodeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sourceKaleoNodeName</column-name><column-value><![CDATA[");
		sb.append(getSourceKaleoNodeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>targetKaleoNodeId</column-name><column-value><![CDATA[");
		sb.append(getTargetKaleoNodeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>targetKaleoNodeName</column-name><column-value><![CDATA[");
		sb.append(getTargetKaleoNodeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>defaultTransition</column-name><column-value><![CDATA[");
		sb.append(getDefaultTransition());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = KaleoTransition.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			KaleoTransition.class
		};
	private long _kaleoTransitionId;
	private long _groupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _kaleoDefinitionVersionId;
	private long _originalKaleoDefinitionVersionId;
	private boolean _setOriginalKaleoDefinitionVersionId;
	private long _kaleoNodeId;
	private long _originalKaleoNodeId;
	private boolean _setOriginalKaleoNodeId;
	private String _name;
	private String _originalName;
	private String _description;
	private long _sourceKaleoNodeId;
	private String _sourceKaleoNodeName;
	private long _targetKaleoNodeId;
	private String _targetKaleoNodeName;
	private boolean _defaultTransition;
	private boolean _originalDefaultTransition;
	private boolean _setOriginalDefaultTransition;
	private long _columnBitmask;
	private KaleoTransition _escapedModel;
}