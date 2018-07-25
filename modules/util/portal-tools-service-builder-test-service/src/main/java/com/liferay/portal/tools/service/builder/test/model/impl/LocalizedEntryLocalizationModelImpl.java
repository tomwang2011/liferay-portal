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

package com.liferay.portal.tools.service.builder.test.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.tools.service.builder.test.model.LocalizedEntryLocalization;
import com.liferay.portal.tools.service.builder.test.model.LocalizedEntryLocalizationModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LocalizedEntryLocalization service. Represents a row in the &quot;LocalizedEntryLocalization&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link LocalizedEntryLocalizationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LocalizedEntryLocalizationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LocalizedEntryLocalizationImpl
 * @see LocalizedEntryLocalization
 * @see LocalizedEntryLocalizationModel
 * @generated
 */
@ProviderType
public class LocalizedEntryLocalizationModelImpl extends BaseModelImpl<LocalizedEntryLocalization>
	implements LocalizedEntryLocalizationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a localized entry localization model instance should use the {@link LocalizedEntryLocalization} interface instead.
	 */
	public static final String TABLE_NAME = "LocalizedEntryLocalization";
	public static final Object[][] TABLE_COLUMNS = {
			{ "mvccVersion", Types.BIGINT },
			{ "localizedEntryLocalizationId", Types.BIGINT },
			{ "localizedEntryId", Types.BIGINT },
			{ "languageId", Types.VARCHAR },
			{ "title", Types.VARCHAR },
			{ "content", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("mvccVersion", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("localizedEntryLocalizationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("localizedEntryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("languageId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("title", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("content", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table LocalizedEntryLocalization (mvccVersion LONG default 0 not null,localizedEntryLocalizationId LONG not null primary key,localizedEntryId LONG,languageId VARCHAR(75) null,title VARCHAR(75) null,content VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table LocalizedEntryLocalization";
	public static final String ORDER_BY_JPQL = " ORDER BY localizedEntryLocalization.localizedEntryLocalizationId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY LocalizedEntryLocalization.localizedEntryLocalizationId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.tools.service.builder.test.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.portal.tools.service.builder.test.model.LocalizedEntryLocalization"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.tools.service.builder.test.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.portal.tools.service.builder.test.model.LocalizedEntryLocalization"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.portal.tools.service.builder.test.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.portal.tools.service.builder.test.model.LocalizedEntryLocalization"),
			true);
	public static final long LANGUAGEID_COLUMN_BITMASK = 1L;
	public static final long LOCALIZEDENTRYID_COLUMN_BITMASK = 2L;
	public static final long LOCALIZEDENTRYLOCALIZATIONID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.tools.service.builder.test.service.util.ServiceProps.get(
				"lock.expiration.time.com.liferay.portal.tools.service.builder.test.model.LocalizedEntryLocalization"));

	public LocalizedEntryLocalizationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _localizedEntryLocalizationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLocalizedEntryLocalizationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _localizedEntryLocalizationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return LocalizedEntryLocalization.class;
	}

	@Override
	public String getModelClassName() {
		return LocalizedEntryLocalization.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("localizedEntryLocalizationId",
			getLocalizedEntryLocalizationId());
		attributes.put("localizedEntryId", getLocalizedEntryId());
		attributes.put("languageId", getLanguageId());
		attributes.put("title", getTitle());
		attributes.put("content", getContent());

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

		Long localizedEntryLocalizationId = (Long)attributes.get(
				"localizedEntryLocalizationId");

		if (localizedEntryLocalizationId != null) {
			setLocalizedEntryLocalizationId(localizedEntryLocalizationId);
		}

		Long localizedEntryId = (Long)attributes.get("localizedEntryId");

		if (localizedEntryId != null) {
			setLocalizedEntryId(localizedEntryId);
		}

		String languageId = (String)attributes.get("languageId");

		if (languageId != null) {
			setLanguageId(languageId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}
	}

	@Override
	public long getMvccVersion() {
		return _mvccVersion;
	}

	@Override
	public void setMvccVersion(long mvccVersion) {
		_mvccVersion = mvccVersion;
	}

	@Override
	public long getLocalizedEntryLocalizationId() {
		return _localizedEntryLocalizationId;
	}

	@Override
	public void setLocalizedEntryLocalizationId(
		long localizedEntryLocalizationId) {
		_localizedEntryLocalizationId = localizedEntryLocalizationId;
	}

	@Override
	public long getLocalizedEntryId() {
		return _localizedEntryId;
	}

	@Override
	public void setLocalizedEntryId(long localizedEntryId) {
		_columnBitmask |= LOCALIZEDENTRYID_COLUMN_BITMASK;

		if (!_setOriginalLocalizedEntryId) {
			_setOriginalLocalizedEntryId = true;

			_originalLocalizedEntryId = _localizedEntryId;
		}

		_localizedEntryId = localizedEntryId;
	}

	public long getOriginalLocalizedEntryId() {
		return _originalLocalizedEntryId;
	}

	@Override
	public String getLanguageId() {
		if (_languageId == null) {
			return "";
		}
		else {
			return _languageId;
		}
	}

	@Override
	public void setLanguageId(String languageId) {
		_columnBitmask |= LANGUAGEID_COLUMN_BITMASK;

		if (_originalLanguageId == null) {
			_originalLanguageId = _languageId;
		}

		_languageId = languageId;
	}

	public String getOriginalLanguageId() {
		return GetterUtil.getString(_originalLanguageId);
	}

	@Override
	public String getTitle() {
		if (_title == null) {
			return "";
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@Override
	public String getContent() {
		if (_content == null) {
			return "";
		}
		else {
			return _content;
		}
	}

	@Override
	public void setContent(String content) {
		_content = content;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			LocalizedEntryLocalization.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LocalizedEntryLocalization toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LocalizedEntryLocalization)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LocalizedEntryLocalizationImpl localizedEntryLocalizationImpl = new LocalizedEntryLocalizationImpl();

		localizedEntryLocalizationImpl.setMvccVersion(getMvccVersion());
		localizedEntryLocalizationImpl.setLocalizedEntryLocalizationId(getLocalizedEntryLocalizationId());
		localizedEntryLocalizationImpl.setLocalizedEntryId(getLocalizedEntryId());
		localizedEntryLocalizationImpl.setLanguageId(getLanguageId());
		localizedEntryLocalizationImpl.setTitle(getTitle());
		localizedEntryLocalizationImpl.setContent(getContent());

		localizedEntryLocalizationImpl.resetOriginalValues();

		return localizedEntryLocalizationImpl;
	}

	@Override
	public int compareTo(LocalizedEntryLocalization localizedEntryLocalization) {
		long primaryKey = localizedEntryLocalization.getPrimaryKey();

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

		if (!(obj instanceof LocalizedEntryLocalization)) {
			return false;
		}

		LocalizedEntryLocalization localizedEntryLocalization = (LocalizedEntryLocalization)obj;

		long primaryKey = localizedEntryLocalization.getPrimaryKey();

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
		LocalizedEntryLocalizationModelImpl localizedEntryLocalizationModelImpl = this;

		localizedEntryLocalizationModelImpl._originalLocalizedEntryId = localizedEntryLocalizationModelImpl._localizedEntryId;

		localizedEntryLocalizationModelImpl._setOriginalLocalizedEntryId = false;

		localizedEntryLocalizationModelImpl._originalLanguageId = localizedEntryLocalizationModelImpl._languageId;

		localizedEntryLocalizationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LocalizedEntryLocalization> toCacheModel() {
		LocalizedEntryLocalizationCacheModel localizedEntryLocalizationCacheModel =
			new LocalizedEntryLocalizationCacheModel();

		localizedEntryLocalizationCacheModel.mvccVersion = getMvccVersion();

		localizedEntryLocalizationCacheModel.localizedEntryLocalizationId = getLocalizedEntryLocalizationId();

		localizedEntryLocalizationCacheModel.localizedEntryId = getLocalizedEntryId();

		localizedEntryLocalizationCacheModel.languageId = getLanguageId();

		String languageId = localizedEntryLocalizationCacheModel.languageId;

		if ((languageId != null) && (languageId.length() == 0)) {
			localizedEntryLocalizationCacheModel.languageId = null;
		}

		localizedEntryLocalizationCacheModel.title = getTitle();

		String title = localizedEntryLocalizationCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			localizedEntryLocalizationCacheModel.title = null;
		}

		localizedEntryLocalizationCacheModel.content = getContent();

		String content = localizedEntryLocalizationCacheModel.content;

		if ((content != null) && (content.length() == 0)) {
			localizedEntryLocalizationCacheModel.content = null;
		}

		return localizedEntryLocalizationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{mvccVersion=");
		sb.append(getMvccVersion());
		sb.append(", localizedEntryLocalizationId=");
		sb.append(getLocalizedEntryLocalizationId());
		sb.append(", localizedEntryId=");
		sb.append(getLocalizedEntryId());
		sb.append(", languageId=");
		sb.append(getLanguageId());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", content=");
		sb.append(getContent());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append(
			"com.liferay.portal.tools.service.builder.test.model.LocalizedEntryLocalization");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>mvccVersion</column-name><column-value><![CDATA[");
		sb.append(getMvccVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>localizedEntryLocalizationId</column-name><column-value><![CDATA[");
		sb.append(getLocalizedEntryLocalizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>localizedEntryId</column-name><column-value><![CDATA[");
		sb.append(getLocalizedEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>languageId</column-name><column-value><![CDATA[");
		sb.append(getLanguageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = LocalizedEntryLocalization.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			LocalizedEntryLocalization.class, ModelWrapper.class
		};
	private long _mvccVersion;
	private long _localizedEntryLocalizationId;
	private long _localizedEntryId;
	private long _originalLocalizedEntryId;
	private boolean _setOriginalLocalizedEntryId;
	private String _languageId;
	private String _originalLanguageId;
	private String _title;
	private String _content;
	private long _columnBitmask;
	private LocalizedEntryLocalization _escapedModel;
}