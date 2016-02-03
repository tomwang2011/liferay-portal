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

package com.liferay.dynamic.data.lists.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.dynamic.data.lists.model.DDLRecordSet;
import com.liferay.dynamic.data.lists.model.DDLRecordSetModel;
import com.liferay.dynamic.data.lists.model.DDLRecordSetSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.User;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.exportimport.lar.StagedModelType;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * The base model implementation for the DDLRecordSet service. Represents a row in the &quot;DDLRecordSet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link DDLRecordSetModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DDLRecordSetImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DDLRecordSetImpl
 * @see DDLRecordSet
 * @see DDLRecordSetModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class DDLRecordSetModelImpl extends BaseModelImpl<DDLRecordSet>
	implements DDLRecordSetModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a d d l record set model instance should use the {@link DDLRecordSet} interface instead.
	 */
	public static final String TABLE_NAME = "DDLRecordSet";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "recordSetId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "DDMStructureId", Types.BIGINT },
			{ "recordSetKey", Types.VARCHAR },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "minDisplayRows", Types.INTEGER },
			{ "scope", Types.INTEGER },
			{ "settings_", Types.CLOB },
			{ "lastPublishDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("recordSetId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("DDMStructureId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("recordSetKey", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("minDisplayRows", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("scope", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("settings_", Types.CLOB);
		TABLE_COLUMNS_MAP.put("lastPublishDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table DDLRecordSet (uuid_ VARCHAR(75) null,recordSetId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,DDMStructureId LONG,recordSetKey VARCHAR(75) null,name STRING null,description STRING null,minDisplayRows INTEGER,scope INTEGER,settings_ TEXT null,lastPublishDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table DDLRecordSet";
	public static final String ORDER_BY_JPQL = " ORDER BY ddlRecordSet.recordSetId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DDLRecordSet.recordSetId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.dynamic.data.lists.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.dynamic.data.lists.model.DDLRecordSet"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.dynamic.data.lists.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.dynamic.data.lists.model.DDLRecordSet"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.dynamic.data.lists.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.dynamic.data.lists.model.DDLRecordSet"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long RECORDSETKEY_COLUMN_BITMASK = 4L;
	public static final long UUID_COLUMN_BITMASK = 8L;
	public static final long RECORDSETID_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DDLRecordSet toModel(DDLRecordSetSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DDLRecordSet model = new DDLRecordSetImpl();

		model.setUuid(soapModel.getUuid());
		model.setRecordSetId(soapModel.getRecordSetId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setDDMStructureId(soapModel.getDDMStructureId());
		model.setRecordSetKey(soapModel.getRecordSetKey());
		model.setName(soapModel.getName());
		model.setDescription(soapModel.getDescription());
		model.setMinDisplayRows(soapModel.getMinDisplayRows());
		model.setScope(soapModel.getScope());
		model.setSettings(soapModel.getSettings());
		model.setLastPublishDate(soapModel.getLastPublishDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DDLRecordSet> toModels(DDLRecordSetSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DDLRecordSet> models = new ArrayList<DDLRecordSet>(soapModels.length);

		for (DDLRecordSetSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.dynamic.data.lists.service.util.ServiceProps.get(
				"lock.expiration.time.com.liferay.dynamic.data.lists.model.DDLRecordSet"));

	public DDLRecordSetModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _recordSetId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRecordSetId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _recordSetId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DDLRecordSet.class;
	}

	@Override
	public String getModelClassName() {
		return DDLRecordSet.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("recordSetId", getRecordSetId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("DDMStructureId", getDDMStructureId());
		attributes.put("recordSetKey", getRecordSetKey());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("minDisplayRows", getMinDisplayRows());
		attributes.put("scope", getScope());
		attributes.put("settings", getSettings());
		attributes.put("lastPublishDate", getLastPublishDate());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long recordSetId = (Long)attributes.get("recordSetId");

		if (recordSetId != null) {
			setRecordSetId(recordSetId);
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

		Long DDMStructureId = (Long)attributes.get("DDMStructureId");

		if (DDMStructureId != null) {
			setDDMStructureId(DDMStructureId);
		}

		String recordSetKey = (String)attributes.get("recordSetKey");

		if (recordSetKey != null) {
			setRecordSetKey(recordSetKey);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Integer minDisplayRows = (Integer)attributes.get("minDisplayRows");

		if (minDisplayRows != null) {
			setMinDisplayRows(minDisplayRows);
		}

		Integer scope = (Integer)attributes.get("scope");

		if (scope != null) {
			setScope(scope);
		}

		String settings = (String)attributes.get("settings");

		if (settings != null) {
			setSettings(settings);
		}

		Date lastPublishDate = (Date)attributes.get("lastPublishDate");

		if (lastPublishDate != null) {
			setLastPublishDate(lastPublishDate);
		}
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getRecordSetId() {
		return _recordSetId;
	}

	@Override
	public void setRecordSetId(long recordSetId) {
		_recordSetId = recordSetId;
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
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
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
	public long getDDMStructureId() {
		return _DDMStructureId;
	}

	@Override
	public void setDDMStructureId(long DDMStructureId) {
		_DDMStructureId = DDMStructureId;
	}

	@JSON
	@Override
	public String getRecordSetKey() {
		if (_recordSetKey == null) {
			return StringPool.BLANK;
		}
		else {
			return _recordSetKey;
		}
	}

	@Override
	public void setRecordSetKey(String recordSetKey) {
		_columnBitmask |= RECORDSETKEY_COLUMN_BITMASK;

		if (_originalRecordSetKey == null) {
			_originalRecordSetKey = _recordSetKey;
		}

		_recordSetKey = recordSetKey;
	}

	public String getOriginalRecordSetKey() {
		return GetterUtil.getString(_originalRecordSetKey);
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public String getName(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getName(languageId);
	}

	@Override
	public String getName(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getName(languageId, useDefault);
	}

	@Override
	public String getName(String languageId) {
		return LocalizationUtil.getLocalization(getName(), languageId);
	}

	@Override
	public String getName(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(getName(), languageId,
			useDefault);
	}

	@Override
	public String getNameCurrentLanguageId() {
		return _nameCurrentLanguageId;
	}

	@JSON
	@Override
	public String getNameCurrentValue() {
		Locale locale = getLocale(_nameCurrentLanguageId);

		return getName(locale);
	}

	@Override
	public Map<Locale, String> getNameMap() {
		return LocalizationUtil.getLocalizationMap(getName());
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public void setName(String name, Locale locale) {
		setName(name, locale, LocaleUtil.getSiteDefault());
	}

	@Override
	public void setName(String name, Locale locale, Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(name)) {
			setName(LocalizationUtil.updateLocalization(getName(), "Name",
					name, languageId, defaultLanguageId));
		}
		else {
			setName(LocalizationUtil.removeLocalization(getName(), "Name",
					languageId));
		}
	}

	@Override
	public void setNameCurrentLanguageId(String languageId) {
		_nameCurrentLanguageId = languageId;
	}

	@Override
	public void setNameMap(Map<Locale, String> nameMap) {
		setNameMap(nameMap, LocaleUtil.getSiteDefault());
	}

	@Override
	public void setNameMap(Map<Locale, String> nameMap, Locale defaultLocale) {
		if (nameMap == null) {
			return;
		}

		setName(LocalizationUtil.updateLocalization(nameMap, getName(), "Name",
				LocaleUtil.toLanguageId(defaultLocale)));
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public String getDescription(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getDescription(languageId);
	}

	@Override
	public String getDescription(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getDescription(languageId, useDefault);
	}

	@Override
	public String getDescription(String languageId) {
		return LocalizationUtil.getLocalization(getDescription(), languageId);
	}

	@Override
	public String getDescription(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(getDescription(), languageId,
			useDefault);
	}

	@Override
	public String getDescriptionCurrentLanguageId() {
		return _descriptionCurrentLanguageId;
	}

	@JSON
	@Override
	public String getDescriptionCurrentValue() {
		Locale locale = getLocale(_descriptionCurrentLanguageId);

		return getDescription(locale);
	}

	@Override
	public Map<Locale, String> getDescriptionMap() {
		return LocalizationUtil.getLocalizationMap(getDescription());
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public void setDescription(String description, Locale locale) {
		setDescription(description, locale, LocaleUtil.getSiteDefault());
	}

	@Override
	public void setDescription(String description, Locale locale,
		Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(description)) {
			setDescription(LocalizationUtil.updateLocalization(
					getDescription(), "Description", description, languageId,
					defaultLanguageId));
		}
		else {
			setDescription(LocalizationUtil.removeLocalization(
					getDescription(), "Description", languageId));
		}
	}

	@Override
	public void setDescriptionCurrentLanguageId(String languageId) {
		_descriptionCurrentLanguageId = languageId;
	}

	@Override
	public void setDescriptionMap(Map<Locale, String> descriptionMap) {
		setDescriptionMap(descriptionMap, LocaleUtil.getSiteDefault());
	}

	@Override
	public void setDescriptionMap(Map<Locale, String> descriptionMap,
		Locale defaultLocale) {
		if (descriptionMap == null) {
			return;
		}

		setDescription(LocalizationUtil.updateLocalization(descriptionMap,
				getDescription(), "Description",
				LocaleUtil.toLanguageId(defaultLocale)));
	}

	@JSON
	@Override
	public int getMinDisplayRows() {
		return _minDisplayRows;
	}

	@Override
	public void setMinDisplayRows(int minDisplayRows) {
		_minDisplayRows = minDisplayRows;
	}

	@JSON
	@Override
	public int getScope() {
		return _scope;
	}

	@Override
	public void setScope(int scope) {
		_scope = scope;
	}

	@JSON
	@Override
	public String getSettings() {
		if (_settings == null) {
			return StringPool.BLANK;
		}
		else {
			return _settings;
		}
	}

	@Override
	public void setSettings(String settings) {
		_settings = settings;
	}

	@JSON
	@Override
	public Date getLastPublishDate() {
		return _lastPublishDate;
	}

	@Override
	public void setLastPublishDate(Date lastPublishDate) {
		_lastPublishDate = lastPublishDate;
	}

	public com.liferay.dynamic.data.mapping.storage.DDMFormValues getDDMFormValues() {
		return null;
	}

	public void setDDMFormValues(
		com.liferay.dynamic.data.mapping.storage.DDMFormValues ddmFormValues) {
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				DDLRecordSet.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			DDLRecordSet.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public String[] getAvailableLanguageIds() {
		Set<String> availableLanguageIds = new TreeSet<String>();

		Map<Locale, String> nameMap = getNameMap();

		for (Map.Entry<Locale, String> entry : nameMap.entrySet()) {
			Locale locale = entry.getKey();
			String value = entry.getValue();

			if (Validator.isNotNull(value)) {
				availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
			}
		}

		Map<Locale, String> descriptionMap = getDescriptionMap();

		for (Map.Entry<Locale, String> entry : descriptionMap.entrySet()) {
			Locale locale = entry.getKey();
			String value = entry.getValue();

			if (Validator.isNotNull(value)) {
				availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
			}
		}

		return availableLanguageIds.toArray(new String[availableLanguageIds.size()]);
	}

	@Override
	public String getDefaultLanguageId() {
		String xml = getName();

		if (xml == null) {
			return StringPool.BLANK;
		}

		Locale defaultLocale = LocaleUtil.getSiteDefault();

		return LocalizationUtil.getDefaultLanguageId(xml, defaultLocale);
	}

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException {
		Locale defaultLocale = LocaleUtil.fromLanguageId(getDefaultLanguageId());

		Locale[] availableLocales = LocaleUtil.fromLanguageIds(getAvailableLanguageIds());

		Locale defaultImportLocale = LocalizationUtil.getDefaultImportLocale(DDLRecordSet.class.getName(),
				getPrimaryKey(), defaultLocale, availableLocales);

		prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	@SuppressWarnings("unused")
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException {
		Locale defaultLocale = LocaleUtil.getSiteDefault();

		String modelDefaultLanguageId = getDefaultLanguageId();

		String name = getName(defaultLocale);

		if (Validator.isNull(name)) {
			setName(getName(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setName(getName(defaultLocale), defaultLocale, defaultLocale);
		}

		String description = getDescription(defaultLocale);

		if (Validator.isNull(description)) {
			setDescription(getDescription(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setDescription(getDescription(defaultLocale), defaultLocale,
				defaultLocale);
		}
	}

	@Override
	public DDLRecordSet toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DDLRecordSet)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DDLRecordSetImpl ddlRecordSetImpl = new DDLRecordSetImpl();

		ddlRecordSetImpl.setUuid(getUuid());
		ddlRecordSetImpl.setRecordSetId(getRecordSetId());
		ddlRecordSetImpl.setGroupId(getGroupId());
		ddlRecordSetImpl.setCompanyId(getCompanyId());
		ddlRecordSetImpl.setUserId(getUserId());
		ddlRecordSetImpl.setUserName(getUserName());
		ddlRecordSetImpl.setCreateDate(getCreateDate());
		ddlRecordSetImpl.setModifiedDate(getModifiedDate());
		ddlRecordSetImpl.setDDMStructureId(getDDMStructureId());
		ddlRecordSetImpl.setRecordSetKey(getRecordSetKey());
		ddlRecordSetImpl.setName(getName());
		ddlRecordSetImpl.setDescription(getDescription());
		ddlRecordSetImpl.setMinDisplayRows(getMinDisplayRows());
		ddlRecordSetImpl.setScope(getScope());
		ddlRecordSetImpl.setSettings(getSettings());
		ddlRecordSetImpl.setLastPublishDate(getLastPublishDate());

		ddlRecordSetImpl.resetOriginalValues();

		return ddlRecordSetImpl;
	}

	@Override
	public int compareTo(DDLRecordSet ddlRecordSet) {
		long primaryKey = ddlRecordSet.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DDLRecordSet)) {
			return false;
		}

		DDLRecordSet ddlRecordSet = (DDLRecordSet)obj;

		long primaryKey = ddlRecordSet.getPrimaryKey();

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
		DDLRecordSetModelImpl ddlRecordSetModelImpl = this;

		ddlRecordSetModelImpl._originalUuid = ddlRecordSetModelImpl._uuid;

		ddlRecordSetModelImpl._originalGroupId = ddlRecordSetModelImpl._groupId;

		ddlRecordSetModelImpl._setOriginalGroupId = false;

		ddlRecordSetModelImpl._originalCompanyId = ddlRecordSetModelImpl._companyId;

		ddlRecordSetModelImpl._setOriginalCompanyId = false;

		ddlRecordSetModelImpl._setModifiedDate = false;

		ddlRecordSetModelImpl._originalRecordSetKey = ddlRecordSetModelImpl._recordSetKey;

		setDDMFormValues(null);

		ddlRecordSetModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DDLRecordSet> toCacheModel() {
		DDLRecordSetCacheModel ddlRecordSetCacheModel = new DDLRecordSetCacheModel();

		ddlRecordSetCacheModel.uuid = getUuid();

		String uuid = ddlRecordSetCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			ddlRecordSetCacheModel.uuid = null;
		}

		ddlRecordSetCacheModel.recordSetId = getRecordSetId();

		ddlRecordSetCacheModel.groupId = getGroupId();

		ddlRecordSetCacheModel.companyId = getCompanyId();

		ddlRecordSetCacheModel.userId = getUserId();

		ddlRecordSetCacheModel.userName = getUserName();

		String userName = ddlRecordSetCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			ddlRecordSetCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			ddlRecordSetCacheModel.createDate = createDate.getTime();
		}
		else {
			ddlRecordSetCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			ddlRecordSetCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			ddlRecordSetCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		ddlRecordSetCacheModel.DDMStructureId = getDDMStructureId();

		ddlRecordSetCacheModel.recordSetKey = getRecordSetKey();

		String recordSetKey = ddlRecordSetCacheModel.recordSetKey;

		if ((recordSetKey != null) && (recordSetKey.length() == 0)) {
			ddlRecordSetCacheModel.recordSetKey = null;
		}

		ddlRecordSetCacheModel.name = getName();

		String name = ddlRecordSetCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			ddlRecordSetCacheModel.name = null;
		}

		ddlRecordSetCacheModel.description = getDescription();

		String description = ddlRecordSetCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			ddlRecordSetCacheModel.description = null;
		}

		ddlRecordSetCacheModel.minDisplayRows = getMinDisplayRows();

		ddlRecordSetCacheModel.scope = getScope();

		ddlRecordSetCacheModel.settings = getSettings();

		String settings = ddlRecordSetCacheModel.settings;

		if ((settings != null) && (settings.length() == 0)) {
			ddlRecordSetCacheModel.settings = null;
		}

		Date lastPublishDate = getLastPublishDate();

		if (lastPublishDate != null) {
			ddlRecordSetCacheModel.lastPublishDate = lastPublishDate.getTime();
		}
		else {
			ddlRecordSetCacheModel.lastPublishDate = Long.MIN_VALUE;
		}

		ddlRecordSetCacheModel._ddmFormValues = getDDMFormValues();

		return ddlRecordSetCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", recordSetId=");
		sb.append(getRecordSetId());
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
		sb.append(", DDMStructureId=");
		sb.append(getDDMStructureId());
		sb.append(", recordSetKey=");
		sb.append(getRecordSetKey());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", minDisplayRows=");
		sb.append(getMinDisplayRows());
		sb.append(", scope=");
		sb.append(getScope());
		sb.append(", settings=");
		sb.append(getSettings());
		sb.append(", lastPublishDate=");
		sb.append(getLastPublishDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.liferay.dynamic.data.lists.model.DDLRecordSet");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recordSetId</column-name><column-value><![CDATA[");
		sb.append(getRecordSetId());
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
			"<column><column-name>DDMStructureId</column-name><column-value><![CDATA[");
		sb.append(getDDMStructureId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recordSetKey</column-name><column-value><![CDATA[");
		sb.append(getRecordSetKey());
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
			"<column><column-name>minDisplayRows</column-name><column-value><![CDATA[");
		sb.append(getMinDisplayRows());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scope</column-name><column-value><![CDATA[");
		sb.append(getScope());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>settings</column-name><column-value><![CDATA[");
		sb.append(getSettings());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastPublishDate</column-name><column-value><![CDATA[");
		sb.append(getLastPublishDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = DDLRecordSet.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			DDLRecordSet.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _recordSetId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _DDMStructureId;
	private String _recordSetKey;
	private String _originalRecordSetKey;
	private String _name;
	private String _nameCurrentLanguageId;
	private String _description;
	private String _descriptionCurrentLanguageId;
	private int _minDisplayRows;
	private int _scope;
	private String _settings;
	private Date _lastPublishDate;
	private long _columnBitmask;
	private DDLRecordSet _escapedModel;
}