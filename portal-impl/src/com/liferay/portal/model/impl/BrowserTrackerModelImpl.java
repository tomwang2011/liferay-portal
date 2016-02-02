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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.BrowserTracker;
import com.liferay.portal.model.BrowserTrackerModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the BrowserTracker service. Represents a row in the &quot;BrowserTracker&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link BrowserTrackerModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BrowserTrackerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BrowserTrackerImpl
 * @see BrowserTracker
 * @see BrowserTrackerModel
 * @generated
 */
@ProviderType
public class BrowserTrackerModelImpl extends BaseModelImpl<BrowserTracker>
	implements BrowserTrackerModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a browser tracker model instance should use the {@link BrowserTracker} interface instead.
	 */
	public static final String TABLE_NAME = "BrowserTracker";
	public static final Object[][] TABLE_COLUMNS = {
			{ "mvccVersion", Types.BIGINT },
			{ "browserTrackerId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "browserKey", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("mvccVersion", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("browserTrackerId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("browserKey", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table BrowserTracker (mvccVersion LONG default 0 not null,browserTrackerId LONG not null primary key,companyId LONG,userId LONG,browserKey LONG)";
	public static final String TABLE_SQL_DROP = "drop table BrowserTracker";
	public static final String ORDER_BY_JPQL = " ORDER BY browserTracker.browserTrackerId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY BrowserTracker.browserTrackerId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portal.model.BrowserTracker"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portal.model.BrowserTracker"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.column.bitmask.enabled.com.liferay.portal.model.BrowserTracker"),
			true);
	public static final long USERID_COLUMN_BITMASK = 1L;
	public static final long BROWSERTRACKERID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portal.model.BrowserTracker"));

	public BrowserTrackerModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _browserTrackerId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBrowserTrackerId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _browserTrackerId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return BrowserTracker.class;
	}

	@Override
	public String getModelClassName() {
		return BrowserTracker.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("browserTrackerId", getBrowserTrackerId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("browserKey", getBrowserKey());

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

		Long browserTrackerId = (Long)attributes.get("browserTrackerId");

		if (browserTrackerId != null) {
			setBrowserTrackerId(browserTrackerId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long browserKey = (Long)attributes.get("browserKey");

		if (browserKey != null) {
			setBrowserKey(browserKey);
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
	public long getBrowserTrackerId() {
		return _browserTrackerId;
	}

	@Override
	public void setBrowserTrackerId(long browserTrackerId) {
		_browserTrackerId = browserTrackerId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

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

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@Override
	public long getBrowserKey() {
		return _browserKey;
	}

	@Override
	public void setBrowserKey(long browserKey) {
		_browserKey = browserKey;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			BrowserTracker.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public BrowserTracker toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (BrowserTracker)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BrowserTrackerImpl browserTrackerImpl = new BrowserTrackerImpl();

		browserTrackerImpl.setMvccVersion(getMvccVersion());
		browserTrackerImpl.setBrowserTrackerId(getBrowserTrackerId());
		browserTrackerImpl.setCompanyId(getCompanyId());
		browserTrackerImpl.setUserId(getUserId());
		browserTrackerImpl.setBrowserKey(getBrowserKey());

		browserTrackerImpl.resetOriginalValues();

		return browserTrackerImpl;
	}

	@Override
	public int compareTo(BrowserTracker browserTracker) {
		long primaryKey = browserTracker.getPrimaryKey();

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

		if (!(obj instanceof BrowserTracker)) {
			return false;
		}

		BrowserTracker browserTracker = (BrowserTracker)obj;

		long primaryKey = browserTracker.getPrimaryKey();

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
		BrowserTrackerModelImpl browserTrackerModelImpl = this;

		browserTrackerModelImpl._originalUserId = browserTrackerModelImpl._userId;

		browserTrackerModelImpl._setOriginalUserId = false;

		browserTrackerModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<BrowserTracker> toCacheModel() {
		BrowserTrackerCacheModel browserTrackerCacheModel = new BrowserTrackerCacheModel();

		browserTrackerCacheModel.mvccVersion = getMvccVersion();

		browserTrackerCacheModel.browserTrackerId = getBrowserTrackerId();

		browserTrackerCacheModel.companyId = getCompanyId();

		browserTrackerCacheModel.userId = getUserId();

		browserTrackerCacheModel.browserKey = getBrowserKey();

		return browserTrackerCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{mvccVersion=");
		sb.append(getMvccVersion());
		sb.append(", browserTrackerId=");
		sb.append(getBrowserTrackerId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", browserKey=");
		sb.append(getBrowserKey());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.model.BrowserTracker");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>mvccVersion</column-name><column-value><![CDATA[");
		sb.append(getMvccVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>browserTrackerId</column-name><column-value><![CDATA[");
		sb.append(getBrowserTrackerId());
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
			"<column><column-name>browserKey</column-name><column-value><![CDATA[");
		sb.append(getBrowserKey());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = BrowserTracker.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			BrowserTracker.class
		};
	private long _mvccVersion;
	private long _browserTrackerId;
	private long _companyId;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private long _browserKey;
	private long _columnBitmask;
	private BrowserTracker _escapedModel;
}