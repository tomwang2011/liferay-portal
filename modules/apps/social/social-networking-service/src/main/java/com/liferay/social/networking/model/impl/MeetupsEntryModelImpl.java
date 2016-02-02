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

package com.liferay.social.networking.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.User;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;

import com.liferay.social.networking.model.MeetupsEntry;
import com.liferay.social.networking.model.MeetupsEntryModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the MeetupsEntry service. Represents a row in the &quot;MeetupsEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link MeetupsEntryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MeetupsEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MeetupsEntryImpl
 * @see MeetupsEntry
 * @see MeetupsEntryModel
 * @generated
 */
@ProviderType
public class MeetupsEntryModelImpl extends BaseModelImpl<MeetupsEntry>
	implements MeetupsEntryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a meetups entry model instance should use the {@link MeetupsEntry} interface instead.
	 */
	public static final String TABLE_NAME = "MeetupsEntry";
	public static final Object[][] TABLE_COLUMNS = {
			{ "meetupsEntryId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "title", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "startDate", Types.TIMESTAMP },
			{ "endDate", Types.TIMESTAMP },
			{ "totalAttendees", Types.INTEGER },
			{ "maxAttendees", Types.INTEGER },
			{ "price", Types.DOUBLE },
			{ "thumbnailId", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("meetupsEntryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("title", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("startDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("endDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("totalAttendees", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("maxAttendees", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("price", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("thumbnailId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table MeetupsEntry (meetupsEntryId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,title VARCHAR(75) null,description VARCHAR(75) null,startDate DATE null,endDate DATE null,totalAttendees INTEGER,maxAttendees INTEGER,price DOUBLE,thumbnailId LONG)";
	public static final String TABLE_SQL_DROP = "drop table MeetupsEntry";
	public static final String ORDER_BY_JPQL = " ORDER BY meetupsEntry.startDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY MeetupsEntry.startDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.social.networking.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.social.networking.model.MeetupsEntry"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.social.networking.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.social.networking.model.MeetupsEntry"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.social.networking.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.social.networking.model.MeetupsEntry"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long USERID_COLUMN_BITMASK = 2L;
	public static final long STARTDATE_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.social.networking.service.util.ServiceProps.get(
				"lock.expiration.time.com.liferay.social.networking.model.MeetupsEntry"));

	public MeetupsEntryModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _meetupsEntryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMeetupsEntryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _meetupsEntryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return MeetupsEntry.class;
	}

	@Override
	public String getModelClassName() {
		return MeetupsEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("meetupsEntryId", getMeetupsEntryId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("totalAttendees", getTotalAttendees());
		attributes.put("maxAttendees", getMaxAttendees());
		attributes.put("price", getPrice());
		attributes.put("thumbnailId", getThumbnailId());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long meetupsEntryId = (Long)attributes.get("meetupsEntryId");

		if (meetupsEntryId != null) {
			setMeetupsEntryId(meetupsEntryId);
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

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		Integer totalAttendees = (Integer)attributes.get("totalAttendees");

		if (totalAttendees != null) {
			setTotalAttendees(totalAttendees);
		}

		Integer maxAttendees = (Integer)attributes.get("maxAttendees");

		if (maxAttendees != null) {
			setMaxAttendees(maxAttendees);
		}

		Double price = (Double)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		Long thumbnailId = (Long)attributes.get("thumbnailId");

		if (thumbnailId != null) {
			setThumbnailId(thumbnailId);
		}
	}

	@Override
	public long getMeetupsEntryId() {
		return _meetupsEntryId;
	}

	@Override
	public void setMeetupsEntryId(long meetupsEntryId) {
		_meetupsEntryId = meetupsEntryId;
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
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
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
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
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
	public Date getStartDate() {
		return _startDate;
	}

	@Override
	public void setStartDate(Date startDate) {
		_columnBitmask = -1L;

		_startDate = startDate;
	}

	@Override
	public Date getEndDate() {
		return _endDate;
	}

	@Override
	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	@Override
	public int getTotalAttendees() {
		return _totalAttendees;
	}

	@Override
	public void setTotalAttendees(int totalAttendees) {
		_totalAttendees = totalAttendees;
	}

	@Override
	public int getMaxAttendees() {
		return _maxAttendees;
	}

	@Override
	public void setMaxAttendees(int maxAttendees) {
		_maxAttendees = maxAttendees;
	}

	@Override
	public double getPrice() {
		return _price;
	}

	@Override
	public void setPrice(double price) {
		_price = price;
	}

	@Override
	public long getThumbnailId() {
		return _thumbnailId;
	}

	@Override
	public void setThumbnailId(long thumbnailId) {
		_thumbnailId = thumbnailId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			MeetupsEntry.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public MeetupsEntry toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (MeetupsEntry)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		MeetupsEntryImpl meetupsEntryImpl = new MeetupsEntryImpl();

		meetupsEntryImpl.setMeetupsEntryId(getMeetupsEntryId());
		meetupsEntryImpl.setCompanyId(getCompanyId());
		meetupsEntryImpl.setUserId(getUserId());
		meetupsEntryImpl.setUserName(getUserName());
		meetupsEntryImpl.setCreateDate(getCreateDate());
		meetupsEntryImpl.setModifiedDate(getModifiedDate());
		meetupsEntryImpl.setTitle(getTitle());
		meetupsEntryImpl.setDescription(getDescription());
		meetupsEntryImpl.setStartDate(getStartDate());
		meetupsEntryImpl.setEndDate(getEndDate());
		meetupsEntryImpl.setTotalAttendees(getTotalAttendees());
		meetupsEntryImpl.setMaxAttendees(getMaxAttendees());
		meetupsEntryImpl.setPrice(getPrice());
		meetupsEntryImpl.setThumbnailId(getThumbnailId());

		meetupsEntryImpl.resetOriginalValues();

		return meetupsEntryImpl;
	}

	@Override
	public int compareTo(MeetupsEntry meetupsEntry) {
		int value = 0;

		value = DateUtil.compareTo(getStartDate(), meetupsEntry.getStartDate());

		value = value * -1;

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

		if (!(obj instanceof MeetupsEntry)) {
			return false;
		}

		MeetupsEntry meetupsEntry = (MeetupsEntry)obj;

		long primaryKey = meetupsEntry.getPrimaryKey();

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
		MeetupsEntryModelImpl meetupsEntryModelImpl = this;

		meetupsEntryModelImpl._originalCompanyId = meetupsEntryModelImpl._companyId;

		meetupsEntryModelImpl._setOriginalCompanyId = false;

		meetupsEntryModelImpl._originalUserId = meetupsEntryModelImpl._userId;

		meetupsEntryModelImpl._setOriginalUserId = false;

		meetupsEntryModelImpl._setModifiedDate = false;

		meetupsEntryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<MeetupsEntry> toCacheModel() {
		MeetupsEntryCacheModel meetupsEntryCacheModel = new MeetupsEntryCacheModel();

		meetupsEntryCacheModel.meetupsEntryId = getMeetupsEntryId();

		meetupsEntryCacheModel.companyId = getCompanyId();

		meetupsEntryCacheModel.userId = getUserId();

		meetupsEntryCacheModel.userName = getUserName();

		String userName = meetupsEntryCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			meetupsEntryCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			meetupsEntryCacheModel.createDate = createDate.getTime();
		}
		else {
			meetupsEntryCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			meetupsEntryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			meetupsEntryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		meetupsEntryCacheModel.title = getTitle();

		String title = meetupsEntryCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			meetupsEntryCacheModel.title = null;
		}

		meetupsEntryCacheModel.description = getDescription();

		String description = meetupsEntryCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			meetupsEntryCacheModel.description = null;
		}

		Date startDate = getStartDate();

		if (startDate != null) {
			meetupsEntryCacheModel.startDate = startDate.getTime();
		}
		else {
			meetupsEntryCacheModel.startDate = Long.MIN_VALUE;
		}

		Date endDate = getEndDate();

		if (endDate != null) {
			meetupsEntryCacheModel.endDate = endDate.getTime();
		}
		else {
			meetupsEntryCacheModel.endDate = Long.MIN_VALUE;
		}

		meetupsEntryCacheModel.totalAttendees = getTotalAttendees();

		meetupsEntryCacheModel.maxAttendees = getMaxAttendees();

		meetupsEntryCacheModel.price = getPrice();

		meetupsEntryCacheModel.thumbnailId = getThumbnailId();

		return meetupsEntryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{meetupsEntryId=");
		sb.append(getMeetupsEntryId());
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
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", startDate=");
		sb.append(getStartDate());
		sb.append(", endDate=");
		sb.append(getEndDate());
		sb.append(", totalAttendees=");
		sb.append(getTotalAttendees());
		sb.append(", maxAttendees=");
		sb.append(getMaxAttendees());
		sb.append(", price=");
		sb.append(getPrice());
		sb.append(", thumbnailId=");
		sb.append(getThumbnailId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.liferay.social.networking.model.MeetupsEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>meetupsEntryId</column-name><column-value><![CDATA[");
		sb.append(getMeetupsEntryId());
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
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startDate</column-name><column-value><![CDATA[");
		sb.append(getStartDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endDate</column-name><column-value><![CDATA[");
		sb.append(getEndDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalAttendees</column-name><column-value><![CDATA[");
		sb.append(getTotalAttendees());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maxAttendees</column-name><column-value><![CDATA[");
		sb.append(getMaxAttendees());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>price</column-name><column-value><![CDATA[");
		sb.append(getPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thumbnailId</column-name><column-value><![CDATA[");
		sb.append(getThumbnailId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = MeetupsEntry.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			MeetupsEntry.class
		};
	private long _meetupsEntryId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _title;
	private String _description;
	private Date _startDate;
	private Date _endDate;
	private int _totalAttendees;
	private int _maxAttendees;
	private double _price;
	private long _thumbnailId;
	private long _columnBitmask;
	private MeetupsEntry _escapedModel;
}