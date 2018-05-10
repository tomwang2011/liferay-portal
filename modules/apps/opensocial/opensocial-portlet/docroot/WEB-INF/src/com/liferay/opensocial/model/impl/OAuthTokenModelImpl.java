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

package com.liferay.opensocial.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.opensocial.model.OAuthToken;
import com.liferay.opensocial.model.OAuthTokenModel;

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

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the OAuthToken service. Represents a row in the &quot;OpenSocial_OAuthToken&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link OAuthTokenModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OAuthTokenImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OAuthTokenImpl
 * @see OAuthToken
 * @see OAuthTokenModel
 * @generated
 */
@ProviderType
public class OAuthTokenModelImpl extends BaseModelImpl<OAuthToken>
	implements OAuthTokenModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a o auth token model instance should use the {@link OAuthToken} interface instead.
	 */
	public static final String TABLE_NAME = "OpenSocial_OAuthToken";
	public static final Object[][] TABLE_COLUMNS = {
			{ "oAuthTokenId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "gadgetKey", Types.VARCHAR },
			{ "serviceName", Types.VARCHAR },
			{ "moduleId", Types.BIGINT },
			{ "accessToken", Types.VARCHAR },
			{ "tokenName", Types.VARCHAR },
			{ "tokenSecret", Types.VARCHAR },
			{ "sessionHandle", Types.VARCHAR },
			{ "expiration", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("oAuthTokenId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("gadgetKey", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("serviceName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("moduleId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("accessToken", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("tokenName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("tokenSecret", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sessionHandle", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("expiration", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table OpenSocial_OAuthToken (oAuthTokenId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,gadgetKey VARCHAR(75) null,serviceName VARCHAR(75) null,moduleId LONG,accessToken VARCHAR(75) null,tokenName VARCHAR(75) null,tokenSecret VARCHAR(75) null,sessionHandle VARCHAR(75) null,expiration LONG)";
	public static final String TABLE_SQL_DROP = "drop table OpenSocial_OAuthToken";
	public static final String ORDER_BY_JPQL = " ORDER BY oAuthToken.oAuthTokenId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY OpenSocial_OAuthToken.oAuthTokenId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.opensocial.model.OAuthToken"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.opensocial.model.OAuthToken"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.opensocial.model.OAuthToken"),
			true);
	public static final long GADGETKEY_COLUMN_BITMASK = 1L;
	public static final long MODULEID_COLUMN_BITMASK = 2L;
	public static final long SERVICENAME_COLUMN_BITMASK = 4L;
	public static final long TOKENNAME_COLUMN_BITMASK = 8L;
	public static final long USERID_COLUMN_BITMASK = 16L;
	public static final long OAUTHTOKENID_COLUMN_BITMASK = 32L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.opensocial.model.OAuthToken"));

	public OAuthTokenModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _oAuthTokenId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOAuthTokenId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _oAuthTokenId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return OAuthToken.class;
	}

	@Override
	public String getModelClassName() {
		return OAuthToken.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("oAuthTokenId", getOAuthTokenId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("gadgetKey", getGadgetKey());
		attributes.put("serviceName", getServiceName());
		attributes.put("moduleId", getModuleId());
		attributes.put("accessToken", getAccessToken());
		attributes.put("tokenName", getTokenName());
		attributes.put("tokenSecret", getTokenSecret());
		attributes.put("sessionHandle", getSessionHandle());
		attributes.put("expiration", getExpiration());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long oAuthTokenId = (Long)attributes.get("oAuthTokenId");

		if (oAuthTokenId != null) {
			setOAuthTokenId(oAuthTokenId);
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

		String gadgetKey = (String)attributes.get("gadgetKey");

		if (gadgetKey != null) {
			setGadgetKey(gadgetKey);
		}

		String serviceName = (String)attributes.get("serviceName");

		if (serviceName != null) {
			setServiceName(serviceName);
		}

		Long moduleId = (Long)attributes.get("moduleId");

		if (moduleId != null) {
			setModuleId(moduleId);
		}

		String accessToken = (String)attributes.get("accessToken");

		if (accessToken != null) {
			setAccessToken(accessToken);
		}

		String tokenName = (String)attributes.get("tokenName");

		if (tokenName != null) {
			setTokenName(tokenName);
		}

		String tokenSecret = (String)attributes.get("tokenSecret");

		if (tokenSecret != null) {
			setTokenSecret(tokenSecret);
		}

		String sessionHandle = (String)attributes.get("sessionHandle");

		if (sessionHandle != null) {
			setSessionHandle(sessionHandle);
		}

		Long expiration = (Long)attributes.get("expiration");

		if (expiration != null) {
			setExpiration(expiration);
		}
	}

	@Override
	public long getOAuthTokenId() {
		return _oAuthTokenId;
	}

	@Override
	public void setOAuthTokenId(long oAuthTokenId) {
		_oAuthTokenId = oAuthTokenId;
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
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	public long getOriginalUserId() {
		return _originalUserId;
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
	public String getGadgetKey() {
		if (_gadgetKey == null) {
			return "";
		}
		else {
			return _gadgetKey;
		}
	}

	@Override
	public void setGadgetKey(String gadgetKey) {
		_columnBitmask |= GADGETKEY_COLUMN_BITMASK;

		if (_originalGadgetKey == null) {
			_originalGadgetKey = _gadgetKey;
		}

		_gadgetKey = gadgetKey;
	}

	public String getOriginalGadgetKey() {
		return GetterUtil.getString(_originalGadgetKey);
	}

	@Override
	public String getServiceName() {
		if (_serviceName == null) {
			return "";
		}
		else {
			return _serviceName;
		}
	}

	@Override
	public void setServiceName(String serviceName) {
		_columnBitmask |= SERVICENAME_COLUMN_BITMASK;

		if (_originalServiceName == null) {
			_originalServiceName = _serviceName;
		}

		_serviceName = serviceName;
	}

	public String getOriginalServiceName() {
		return GetterUtil.getString(_originalServiceName);
	}

	@Override
	public long getModuleId() {
		return _moduleId;
	}

	@Override
	public void setModuleId(long moduleId) {
		_columnBitmask |= MODULEID_COLUMN_BITMASK;

		if (!_setOriginalModuleId) {
			_setOriginalModuleId = true;

			_originalModuleId = _moduleId;
		}

		_moduleId = moduleId;
	}

	public long getOriginalModuleId() {
		return _originalModuleId;
	}

	@Override
	public String getAccessToken() {
		if (_accessToken == null) {
			return "";
		}
		else {
			return _accessToken;
		}
	}

	@Override
	public void setAccessToken(String accessToken) {
		_accessToken = accessToken;
	}

	@Override
	public String getTokenName() {
		if (_tokenName == null) {
			return "";
		}
		else {
			return _tokenName;
		}
	}

	@Override
	public void setTokenName(String tokenName) {
		_columnBitmask |= TOKENNAME_COLUMN_BITMASK;

		if (_originalTokenName == null) {
			_originalTokenName = _tokenName;
		}

		_tokenName = tokenName;
	}

	public String getOriginalTokenName() {
		return GetterUtil.getString(_originalTokenName);
	}

	@Override
	public String getTokenSecret() {
		if (_tokenSecret == null) {
			return "";
		}
		else {
			return _tokenSecret;
		}
	}

	@Override
	public void setTokenSecret(String tokenSecret) {
		_tokenSecret = tokenSecret;
	}

	@Override
	public String getSessionHandle() {
		if (_sessionHandle == null) {
			return "";
		}
		else {
			return _sessionHandle;
		}
	}

	@Override
	public void setSessionHandle(String sessionHandle) {
		_sessionHandle = sessionHandle;
	}

	@Override
	public long getExpiration() {
		return _expiration;
	}

	@Override
	public void setExpiration(long expiration) {
		_expiration = expiration;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			OAuthToken.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public OAuthToken toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (OAuthToken)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		OAuthTokenImpl oAuthTokenImpl = new OAuthTokenImpl();

		oAuthTokenImpl.setOAuthTokenId(getOAuthTokenId());
		oAuthTokenImpl.setCompanyId(getCompanyId());
		oAuthTokenImpl.setUserId(getUserId());
		oAuthTokenImpl.setUserName(getUserName());
		oAuthTokenImpl.setCreateDate(getCreateDate());
		oAuthTokenImpl.setModifiedDate(getModifiedDate());
		oAuthTokenImpl.setGadgetKey(getGadgetKey());
		oAuthTokenImpl.setServiceName(getServiceName());
		oAuthTokenImpl.setModuleId(getModuleId());
		oAuthTokenImpl.setAccessToken(getAccessToken());
		oAuthTokenImpl.setTokenName(getTokenName());
		oAuthTokenImpl.setTokenSecret(getTokenSecret());
		oAuthTokenImpl.setSessionHandle(getSessionHandle());
		oAuthTokenImpl.setExpiration(getExpiration());

		oAuthTokenImpl.resetOriginalValues();

		return oAuthTokenImpl;
	}

	@Override
	public int compareTo(OAuthToken oAuthToken) {
		long primaryKey = oAuthToken.getPrimaryKey();

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

		if (!(obj instanceof OAuthToken)) {
			return false;
		}

		OAuthToken oAuthToken = (OAuthToken)obj;

		long primaryKey = oAuthToken.getPrimaryKey();

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
		OAuthTokenModelImpl oAuthTokenModelImpl = this;

		oAuthTokenModelImpl._originalUserId = oAuthTokenModelImpl._userId;

		oAuthTokenModelImpl._setOriginalUserId = false;

		oAuthTokenModelImpl._setModifiedDate = false;

		oAuthTokenModelImpl._originalGadgetKey = oAuthTokenModelImpl._gadgetKey;

		oAuthTokenModelImpl._originalServiceName = oAuthTokenModelImpl._serviceName;

		oAuthTokenModelImpl._originalModuleId = oAuthTokenModelImpl._moduleId;

		oAuthTokenModelImpl._setOriginalModuleId = false;

		oAuthTokenModelImpl._originalTokenName = oAuthTokenModelImpl._tokenName;

		oAuthTokenModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<OAuthToken> toCacheModel() {
		OAuthTokenCacheModel oAuthTokenCacheModel = new OAuthTokenCacheModel();

		oAuthTokenCacheModel.oAuthTokenId = getOAuthTokenId();

		oAuthTokenCacheModel.companyId = getCompanyId();

		oAuthTokenCacheModel.userId = getUserId();

		oAuthTokenCacheModel.userName = getUserName();

		String userName = oAuthTokenCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			oAuthTokenCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			oAuthTokenCacheModel.createDate = createDate.getTime();
		}
		else {
			oAuthTokenCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			oAuthTokenCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			oAuthTokenCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		oAuthTokenCacheModel.gadgetKey = getGadgetKey();

		String gadgetKey = oAuthTokenCacheModel.gadgetKey;

		if ((gadgetKey != null) && (gadgetKey.length() == 0)) {
			oAuthTokenCacheModel.gadgetKey = null;
		}

		oAuthTokenCacheModel.serviceName = getServiceName();

		String serviceName = oAuthTokenCacheModel.serviceName;

		if ((serviceName != null) && (serviceName.length() == 0)) {
			oAuthTokenCacheModel.serviceName = null;
		}

		oAuthTokenCacheModel.moduleId = getModuleId();

		oAuthTokenCacheModel.accessToken = getAccessToken();

		String accessToken = oAuthTokenCacheModel.accessToken;

		if ((accessToken != null) && (accessToken.length() == 0)) {
			oAuthTokenCacheModel.accessToken = null;
		}

		oAuthTokenCacheModel.tokenName = getTokenName();

		String tokenName = oAuthTokenCacheModel.tokenName;

		if ((tokenName != null) && (tokenName.length() == 0)) {
			oAuthTokenCacheModel.tokenName = null;
		}

		oAuthTokenCacheModel.tokenSecret = getTokenSecret();

		String tokenSecret = oAuthTokenCacheModel.tokenSecret;

		if ((tokenSecret != null) && (tokenSecret.length() == 0)) {
			oAuthTokenCacheModel.tokenSecret = null;
		}

		oAuthTokenCacheModel.sessionHandle = getSessionHandle();

		String sessionHandle = oAuthTokenCacheModel.sessionHandle;

		if ((sessionHandle != null) && (sessionHandle.length() == 0)) {
			oAuthTokenCacheModel.sessionHandle = null;
		}

		oAuthTokenCacheModel.expiration = getExpiration();

		return oAuthTokenCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{oAuthTokenId=");
		sb.append(getOAuthTokenId());
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
		sb.append(", gadgetKey=");
		sb.append(getGadgetKey());
		sb.append(", serviceName=");
		sb.append(getServiceName());
		sb.append(", moduleId=");
		sb.append(getModuleId());
		sb.append(", accessToken=");
		sb.append(getAccessToken());
		sb.append(", tokenName=");
		sb.append(getTokenName());
		sb.append(", tokenSecret=");
		sb.append(getTokenSecret());
		sb.append(", sessionHandle=");
		sb.append(getSessionHandle());
		sb.append(", expiration=");
		sb.append(getExpiration());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.liferay.opensocial.model.OAuthToken");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>oAuthTokenId</column-name><column-value><![CDATA[");
		sb.append(getOAuthTokenId());
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
			"<column><column-name>gadgetKey</column-name><column-value><![CDATA[");
		sb.append(getGadgetKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceName</column-name><column-value><![CDATA[");
		sb.append(getServiceName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>moduleId</column-name><column-value><![CDATA[");
		sb.append(getModuleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accessToken</column-name><column-value><![CDATA[");
		sb.append(getAccessToken());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tokenName</column-name><column-value><![CDATA[");
		sb.append(getTokenName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tokenSecret</column-name><column-value><![CDATA[");
		sb.append(getTokenSecret());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sessionHandle</column-name><column-value><![CDATA[");
		sb.append(getSessionHandle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expiration</column-name><column-value><![CDATA[");
		sb.append(getExpiration());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = OAuthToken.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			OAuthToken.class
		};
	private long _oAuthTokenId;
	private long _companyId;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _gadgetKey;
	private String _originalGadgetKey;
	private String _serviceName;
	private String _originalServiceName;
	private long _moduleId;
	private long _originalModuleId;
	private boolean _setOriginalModuleId;
	private String _accessToken;
	private String _tokenName;
	private String _originalTokenName;
	private String _tokenSecret;
	private String _sessionHandle;
	private long _expiration;
	private long _columnBitmask;
	private OAuthToken _escapedModel;
}