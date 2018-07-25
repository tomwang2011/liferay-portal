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

package com.liferay.portal.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.OrgLabor;
import com.liferay.portal.kernel.model.OrgLaborModel;
import com.liferay.portal.kernel.model.OrgLaborSoap;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the OrgLabor service. Represents a row in the &quot;OrgLabor&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link OrgLaborModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OrgLaborImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OrgLaborImpl
 * @see OrgLabor
 * @see OrgLaborModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class OrgLaborModelImpl extends BaseModelImpl<OrgLabor>
	implements OrgLaborModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a org labor model instance should use the {@link OrgLabor} interface instead.
	 */
	public static final String TABLE_NAME = "OrgLabor";
	public static final Object[][] TABLE_COLUMNS = {
			{ "mvccVersion", Types.BIGINT },
			{ "orgLaborId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "organizationId", Types.BIGINT },
			{ "typeId", Types.BIGINT },
			{ "sunOpen", Types.INTEGER },
			{ "sunClose", Types.INTEGER },
			{ "monOpen", Types.INTEGER },
			{ "monClose", Types.INTEGER },
			{ "tueOpen", Types.INTEGER },
			{ "tueClose", Types.INTEGER },
			{ "wedOpen", Types.INTEGER },
			{ "wedClose", Types.INTEGER },
			{ "thuOpen", Types.INTEGER },
			{ "thuClose", Types.INTEGER },
			{ "friOpen", Types.INTEGER },
			{ "friClose", Types.INTEGER },
			{ "satOpen", Types.INTEGER },
			{ "satClose", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("mvccVersion", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("orgLaborId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("organizationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("typeId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("sunOpen", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("sunClose", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("monOpen", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("monClose", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("tueOpen", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("tueClose", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("wedOpen", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("wedClose", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("thuOpen", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("thuClose", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("friOpen", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("friClose", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("satOpen", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("satClose", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table OrgLabor (mvccVersion LONG default 0 not null,orgLaborId LONG not null primary key,companyId LONG,organizationId LONG,typeId LONG,sunOpen INTEGER,sunClose INTEGER,monOpen INTEGER,monClose INTEGER,tueOpen INTEGER,tueClose INTEGER,wedOpen INTEGER,wedClose INTEGER,thuOpen INTEGER,thuClose INTEGER,friOpen INTEGER,friClose INTEGER,satOpen INTEGER,satClose INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table OrgLabor";
	public static final String ORDER_BY_JPQL = " ORDER BY orgLabor.organizationId ASC, orgLabor.typeId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY OrgLabor.organizationId ASC, OrgLabor.typeId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portal.kernel.model.OrgLabor"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portal.kernel.model.OrgLabor"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.column.bitmask.enabled.com.liferay.portal.kernel.model.OrgLabor"),
			true);
	public static final long ORGANIZATIONID_COLUMN_BITMASK = 1L;
	public static final long TYPEID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static OrgLabor toModel(OrgLaborSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		OrgLabor model = new OrgLaborImpl();

		model.setMvccVersion(soapModel.getMvccVersion());
		model.setOrgLaborId(soapModel.getOrgLaborId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setOrganizationId(soapModel.getOrganizationId());
		model.setTypeId(soapModel.getTypeId());
		model.setSunOpen(soapModel.getSunOpen());
		model.setSunClose(soapModel.getSunClose());
		model.setMonOpen(soapModel.getMonOpen());
		model.setMonClose(soapModel.getMonClose());
		model.setTueOpen(soapModel.getTueOpen());
		model.setTueClose(soapModel.getTueClose());
		model.setWedOpen(soapModel.getWedOpen());
		model.setWedClose(soapModel.getWedClose());
		model.setThuOpen(soapModel.getThuOpen());
		model.setThuClose(soapModel.getThuClose());
		model.setFriOpen(soapModel.getFriOpen());
		model.setFriClose(soapModel.getFriClose());
		model.setSatOpen(soapModel.getSatOpen());
		model.setSatClose(soapModel.getSatClose());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<OrgLabor> toModels(OrgLaborSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<OrgLabor> models = new ArrayList<OrgLabor>(soapModels.length);

		for (OrgLaborSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portal.kernel.model.OrgLabor"));

	public OrgLaborModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _orgLaborId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOrgLaborId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _orgLaborId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return OrgLabor.class;
	}

	@Override
	public String getModelClassName() {
		return OrgLabor.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("orgLaborId", getOrgLaborId());
		attributes.put("companyId", getCompanyId());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("typeId", getTypeId());
		attributes.put("sunOpen", getSunOpen());
		attributes.put("sunClose", getSunClose());
		attributes.put("monOpen", getMonOpen());
		attributes.put("monClose", getMonClose());
		attributes.put("tueOpen", getTueOpen());
		attributes.put("tueClose", getTueClose());
		attributes.put("wedOpen", getWedOpen());
		attributes.put("wedClose", getWedClose());
		attributes.put("thuOpen", getThuOpen());
		attributes.put("thuClose", getThuClose());
		attributes.put("friOpen", getFriOpen());
		attributes.put("friClose", getFriClose());
		attributes.put("satOpen", getSatOpen());
		attributes.put("satClose", getSatClose());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long mvccVersion = (Long)attributes.get("mvccVersion");

		if (mvccVersion != null) {
			setMvccVersion(mvccVersion);
		}

		Long orgLaborId = (Long)attributes.get("orgLaborId");

		if (orgLaborId != null) {
			setOrgLaborId(orgLaborId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long typeId = (Long)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}

		Integer sunOpen = (Integer)attributes.get("sunOpen");

		if (sunOpen != null) {
			setSunOpen(sunOpen);
		}

		Integer sunClose = (Integer)attributes.get("sunClose");

		if (sunClose != null) {
			setSunClose(sunClose);
		}

		Integer monOpen = (Integer)attributes.get("monOpen");

		if (monOpen != null) {
			setMonOpen(monOpen);
		}

		Integer monClose = (Integer)attributes.get("monClose");

		if (monClose != null) {
			setMonClose(monClose);
		}

		Integer tueOpen = (Integer)attributes.get("tueOpen");

		if (tueOpen != null) {
			setTueOpen(tueOpen);
		}

		Integer tueClose = (Integer)attributes.get("tueClose");

		if (tueClose != null) {
			setTueClose(tueClose);
		}

		Integer wedOpen = (Integer)attributes.get("wedOpen");

		if (wedOpen != null) {
			setWedOpen(wedOpen);
		}

		Integer wedClose = (Integer)attributes.get("wedClose");

		if (wedClose != null) {
			setWedClose(wedClose);
		}

		Integer thuOpen = (Integer)attributes.get("thuOpen");

		if (thuOpen != null) {
			setThuOpen(thuOpen);
		}

		Integer thuClose = (Integer)attributes.get("thuClose");

		if (thuClose != null) {
			setThuClose(thuClose);
		}

		Integer friOpen = (Integer)attributes.get("friOpen");

		if (friOpen != null) {
			setFriOpen(friOpen);
		}

		Integer friClose = (Integer)attributes.get("friClose");

		if (friClose != null) {
			setFriClose(friClose);
		}

		Integer satOpen = (Integer)attributes.get("satOpen");

		if (satOpen != null) {
			setSatOpen(satOpen);
		}

		Integer satClose = (Integer)attributes.get("satClose");

		if (satClose != null) {
			setSatClose(satClose);
		}
	}

	@JSON
	@Override
	public long getMvccVersion() {
		return _mvccVersion;
	}

	@Override
	public void setMvccVersion(long mvccVersion) {
		_mvccVersion = mvccVersion;
	}

	@JSON
	@Override
	public long getOrgLaborId() {
		return _orgLaborId;
	}

	@Override
	public void setOrgLaborId(long orgLaborId) {
		_orgLaborId = orgLaborId;
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
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		_columnBitmask = -1L;

		if (!_setOriginalOrganizationId) {
			_setOriginalOrganizationId = true;

			_originalOrganizationId = _organizationId;
		}

		_organizationId = organizationId;
	}

	public long getOriginalOrganizationId() {
		return _originalOrganizationId;
	}

	@JSON
	@Override
	public long getTypeId() {
		return _typeId;
	}

	@Override
	public void setTypeId(long typeId) {
		_columnBitmask = -1L;

		_typeId = typeId;
	}

	@JSON
	@Override
	public int getSunOpen() {
		return _sunOpen;
	}

	@Override
	public void setSunOpen(int sunOpen) {
		_sunOpen = sunOpen;
	}

	@JSON
	@Override
	public int getSunClose() {
		return _sunClose;
	}

	@Override
	public void setSunClose(int sunClose) {
		_sunClose = sunClose;
	}

	@JSON
	@Override
	public int getMonOpen() {
		return _monOpen;
	}

	@Override
	public void setMonOpen(int monOpen) {
		_monOpen = monOpen;
	}

	@JSON
	@Override
	public int getMonClose() {
		return _monClose;
	}

	@Override
	public void setMonClose(int monClose) {
		_monClose = monClose;
	}

	@JSON
	@Override
	public int getTueOpen() {
		return _tueOpen;
	}

	@Override
	public void setTueOpen(int tueOpen) {
		_tueOpen = tueOpen;
	}

	@JSON
	@Override
	public int getTueClose() {
		return _tueClose;
	}

	@Override
	public void setTueClose(int tueClose) {
		_tueClose = tueClose;
	}

	@JSON
	@Override
	public int getWedOpen() {
		return _wedOpen;
	}

	@Override
	public void setWedOpen(int wedOpen) {
		_wedOpen = wedOpen;
	}

	@JSON
	@Override
	public int getWedClose() {
		return _wedClose;
	}

	@Override
	public void setWedClose(int wedClose) {
		_wedClose = wedClose;
	}

	@JSON
	@Override
	public int getThuOpen() {
		return _thuOpen;
	}

	@Override
	public void setThuOpen(int thuOpen) {
		_thuOpen = thuOpen;
	}

	@JSON
	@Override
	public int getThuClose() {
		return _thuClose;
	}

	@Override
	public void setThuClose(int thuClose) {
		_thuClose = thuClose;
	}

	@JSON
	@Override
	public int getFriOpen() {
		return _friOpen;
	}

	@Override
	public void setFriOpen(int friOpen) {
		_friOpen = friOpen;
	}

	@JSON
	@Override
	public int getFriClose() {
		return _friClose;
	}

	@Override
	public void setFriClose(int friClose) {
		_friClose = friClose;
	}

	@JSON
	@Override
	public int getSatOpen() {
		return _satOpen;
	}

	@Override
	public void setSatOpen(int satOpen) {
		_satOpen = satOpen;
	}

	@JSON
	@Override
	public int getSatClose() {
		return _satClose;
	}

	@Override
	public void setSatClose(int satClose) {
		_satClose = satClose;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			OrgLabor.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public OrgLabor toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (OrgLabor)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		OrgLaborImpl orgLaborImpl = new OrgLaborImpl();

		orgLaborImpl.setMvccVersion(getMvccVersion());
		orgLaborImpl.setOrgLaborId(getOrgLaborId());
		orgLaborImpl.setCompanyId(getCompanyId());
		orgLaborImpl.setOrganizationId(getOrganizationId());
		orgLaborImpl.setTypeId(getTypeId());
		orgLaborImpl.setSunOpen(getSunOpen());
		orgLaborImpl.setSunClose(getSunClose());
		orgLaborImpl.setMonOpen(getMonOpen());
		orgLaborImpl.setMonClose(getMonClose());
		orgLaborImpl.setTueOpen(getTueOpen());
		orgLaborImpl.setTueClose(getTueClose());
		orgLaborImpl.setWedOpen(getWedOpen());
		orgLaborImpl.setWedClose(getWedClose());
		orgLaborImpl.setThuOpen(getThuOpen());
		orgLaborImpl.setThuClose(getThuClose());
		orgLaborImpl.setFriOpen(getFriOpen());
		orgLaborImpl.setFriClose(getFriClose());
		orgLaborImpl.setSatOpen(getSatOpen());
		orgLaborImpl.setSatClose(getSatClose());

		orgLaborImpl.resetOriginalValues();

		return orgLaborImpl;
	}

	@Override
	public int compareTo(OrgLabor orgLabor) {
		int value = 0;

		if (getOrganizationId() < orgLabor.getOrganizationId()) {
			value = -1;
		}
		else if (getOrganizationId() > orgLabor.getOrganizationId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (getTypeId() < orgLabor.getTypeId()) {
			value = -1;
		}
		else if (getTypeId() > orgLabor.getTypeId()) {
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

		if (!(obj instanceof OrgLabor)) {
			return false;
		}

		OrgLabor orgLabor = (OrgLabor)obj;

		long primaryKey = orgLabor.getPrimaryKey();

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
		OrgLaborModelImpl orgLaborModelImpl = this;

		orgLaborModelImpl._originalOrganizationId = orgLaborModelImpl._organizationId;

		orgLaborModelImpl._setOriginalOrganizationId = false;

		orgLaborModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<OrgLabor> toCacheModel() {
		OrgLaborCacheModel orgLaborCacheModel = new OrgLaborCacheModel();

		orgLaborCacheModel.mvccVersion = getMvccVersion();

		orgLaborCacheModel.orgLaborId = getOrgLaborId();

		orgLaborCacheModel.companyId = getCompanyId();

		orgLaborCacheModel.organizationId = getOrganizationId();

		orgLaborCacheModel.typeId = getTypeId();

		orgLaborCacheModel.sunOpen = getSunOpen();

		orgLaborCacheModel.sunClose = getSunClose();

		orgLaborCacheModel.monOpen = getMonOpen();

		orgLaborCacheModel.monClose = getMonClose();

		orgLaborCacheModel.tueOpen = getTueOpen();

		orgLaborCacheModel.tueClose = getTueClose();

		orgLaborCacheModel.wedOpen = getWedOpen();

		orgLaborCacheModel.wedClose = getWedClose();

		orgLaborCacheModel.thuOpen = getThuOpen();

		orgLaborCacheModel.thuClose = getThuClose();

		orgLaborCacheModel.friOpen = getFriOpen();

		orgLaborCacheModel.friClose = getFriClose();

		orgLaborCacheModel.satOpen = getSatOpen();

		orgLaborCacheModel.satClose = getSatClose();

		return orgLaborCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{mvccVersion=");
		sb.append(getMvccVersion());
		sb.append(", orgLaborId=");
		sb.append(getOrgLaborId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append(", typeId=");
		sb.append(getTypeId());
		sb.append(", sunOpen=");
		sb.append(getSunOpen());
		sb.append(", sunClose=");
		sb.append(getSunClose());
		sb.append(", monOpen=");
		sb.append(getMonOpen());
		sb.append(", monClose=");
		sb.append(getMonClose());
		sb.append(", tueOpen=");
		sb.append(getTueOpen());
		sb.append(", tueClose=");
		sb.append(getTueClose());
		sb.append(", wedOpen=");
		sb.append(getWedOpen());
		sb.append(", wedClose=");
		sb.append(getWedClose());
		sb.append(", thuOpen=");
		sb.append(getThuOpen());
		sb.append(", thuClose=");
		sb.append(getThuClose());
		sb.append(", friOpen=");
		sb.append(getFriOpen());
		sb.append(", friClose=");
		sb.append(getFriClose());
		sb.append(", satOpen=");
		sb.append(getSatOpen());
		sb.append(", satClose=");
		sb.append(getSatClose());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.kernel.model.OrgLabor");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>mvccVersion</column-name><column-value><![CDATA[");
		sb.append(getMvccVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orgLaborId</column-name><column-value><![CDATA[");
		sb.append(getOrgLaborId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>typeId</column-name><column-value><![CDATA[");
		sb.append(getTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sunOpen</column-name><column-value><![CDATA[");
		sb.append(getSunOpen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sunClose</column-name><column-value><![CDATA[");
		sb.append(getSunClose());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>monOpen</column-name><column-value><![CDATA[");
		sb.append(getMonOpen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>monClose</column-name><column-value><![CDATA[");
		sb.append(getMonClose());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tueOpen</column-name><column-value><![CDATA[");
		sb.append(getTueOpen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tueClose</column-name><column-value><![CDATA[");
		sb.append(getTueClose());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wedOpen</column-name><column-value><![CDATA[");
		sb.append(getWedOpen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wedClose</column-name><column-value><![CDATA[");
		sb.append(getWedClose());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuOpen</column-name><column-value><![CDATA[");
		sb.append(getThuOpen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thuClose</column-name><column-value><![CDATA[");
		sb.append(getThuClose());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>friOpen</column-name><column-value><![CDATA[");
		sb.append(getFriOpen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>friClose</column-name><column-value><![CDATA[");
		sb.append(getFriClose());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>satOpen</column-name><column-value><![CDATA[");
		sb.append(getSatOpen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>satClose</column-name><column-value><![CDATA[");
		sb.append(getSatClose());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = OrgLabor.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			OrgLabor.class, ModelWrapper.class
		};
	private long _mvccVersion;
	private long _orgLaborId;
	private long _companyId;
	private long _organizationId;
	private long _originalOrganizationId;
	private boolean _setOriginalOrganizationId;
	private long _typeId;
	private int _sunOpen;
	private int _sunClose;
	private int _monOpen;
	private int _monClose;
	private int _tueOpen;
	private int _tueClose;
	private int _wedOpen;
	private int _wedClose;
	private int _thuOpen;
	private int _thuClose;
	private int _friOpen;
	private int _friClose;
	private int _satOpen;
	private int _satClose;
	private long _columnBitmask;
	private OrgLabor _escapedModel;
}