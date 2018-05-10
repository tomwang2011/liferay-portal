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
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ClusterGroup;
import com.liferay.portal.kernel.model.ClusterGroupModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ClusterGroup service. Represents a row in the &quot;ClusterGroup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ClusterGroupModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ClusterGroupImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClusterGroupImpl
 * @see ClusterGroup
 * @see ClusterGroupModel
 * @generated
 */
@ProviderType
public class ClusterGroupModelImpl extends BaseModelImpl<ClusterGroup>
	implements ClusterGroupModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cluster group model instance should use the {@link ClusterGroup} interface instead.
	 */
	public static final String TABLE_NAME = "ClusterGroup";
	public static final Object[][] TABLE_COLUMNS = {
			{ "mvccVersion", Types.BIGINT },
			{ "clusterGroupId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "clusterNodeIds", Types.VARCHAR },
			{ "wholeCluster", Types.BOOLEAN }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("mvccVersion", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("clusterGroupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("clusterNodeIds", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("wholeCluster", Types.BOOLEAN);
	}

	public static final String TABLE_SQL_CREATE = "create table ClusterGroup (mvccVersion LONG default 0 not null,clusterGroupId LONG not null primary key,name VARCHAR(75) null,clusterNodeIds VARCHAR(75) null,wholeCluster BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table ClusterGroup";
	public static final String ORDER_BY_JPQL = " ORDER BY clusterGroup.clusterGroupId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY ClusterGroup.clusterGroupId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portal.kernel.model.ClusterGroup"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portal.kernel.model.ClusterGroup"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portal.kernel.model.ClusterGroup"));

	public ClusterGroupModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _clusterGroupId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setClusterGroupId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _clusterGroupId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ClusterGroup.class;
	}

	@Override
	public String getModelClassName() {
		return ClusterGroup.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("clusterGroupId", getClusterGroupId());
		attributes.put("name", getName());
		attributes.put("clusterNodeIds", getClusterNodeIds());
		attributes.put("wholeCluster", isWholeCluster());

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

		Long clusterGroupId = (Long)attributes.get("clusterGroupId");

		if (clusterGroupId != null) {
			setClusterGroupId(clusterGroupId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String clusterNodeIds = (String)attributes.get("clusterNodeIds");

		if (clusterNodeIds != null) {
			setClusterNodeIds(clusterNodeIds);
		}

		Boolean wholeCluster = (Boolean)attributes.get("wholeCluster");

		if (wholeCluster != null) {
			setWholeCluster(wholeCluster);
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
	public long getClusterGroupId() {
		return _clusterGroupId;
	}

	@Override
	public void setClusterGroupId(long clusterGroupId) {
		_clusterGroupId = clusterGroupId;
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
		_name = name;
	}

	@Override
	public String getClusterNodeIds() {
		if (_clusterNodeIds == null) {
			return "";
		}
		else {
			return _clusterNodeIds;
		}
	}

	@Override
	public void setClusterNodeIds(String clusterNodeIds) {
		_clusterNodeIds = clusterNodeIds;
	}

	@Override
	public boolean getWholeCluster() {
		return _wholeCluster;
	}

	@Override
	public boolean isWholeCluster() {
		return _wholeCluster;
	}

	@Override
	public void setWholeCluster(boolean wholeCluster) {
		_wholeCluster = wholeCluster;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			ClusterGroup.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ClusterGroup toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ClusterGroup)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ClusterGroupImpl clusterGroupImpl = new ClusterGroupImpl();

		clusterGroupImpl.setMvccVersion(getMvccVersion());
		clusterGroupImpl.setClusterGroupId(getClusterGroupId());
		clusterGroupImpl.setName(getName());
		clusterGroupImpl.setClusterNodeIds(getClusterNodeIds());
		clusterGroupImpl.setWholeCluster(isWholeCluster());

		clusterGroupImpl.resetOriginalValues();

		return clusterGroupImpl;
	}

	@Override
	public int compareTo(ClusterGroup clusterGroup) {
		long primaryKey = clusterGroup.getPrimaryKey();

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

		if (!(obj instanceof ClusterGroup)) {
			return false;
		}

		ClusterGroup clusterGroup = (ClusterGroup)obj;

		long primaryKey = clusterGroup.getPrimaryKey();

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
	}

	@Override
	public CacheModel<ClusterGroup> toCacheModel() {
		ClusterGroupCacheModel clusterGroupCacheModel = new ClusterGroupCacheModel();

		clusterGroupCacheModel.mvccVersion = getMvccVersion();

		clusterGroupCacheModel.clusterGroupId = getClusterGroupId();

		clusterGroupCacheModel.name = getName();

		String name = clusterGroupCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			clusterGroupCacheModel.name = null;
		}

		clusterGroupCacheModel.clusterNodeIds = getClusterNodeIds();

		String clusterNodeIds = clusterGroupCacheModel.clusterNodeIds;

		if ((clusterNodeIds != null) && (clusterNodeIds.length() == 0)) {
			clusterGroupCacheModel.clusterNodeIds = null;
		}

		clusterGroupCacheModel.wholeCluster = isWholeCluster();

		return clusterGroupCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{mvccVersion=");
		sb.append(getMvccVersion());
		sb.append(", clusterGroupId=");
		sb.append(getClusterGroupId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", clusterNodeIds=");
		sb.append(getClusterNodeIds());
		sb.append(", wholeCluster=");
		sb.append(isWholeCluster());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.kernel.model.ClusterGroup");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>mvccVersion</column-name><column-value><![CDATA[");
		sb.append(getMvccVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>clusterGroupId</column-name><column-value><![CDATA[");
		sb.append(getClusterGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>clusterNodeIds</column-name><column-value><![CDATA[");
		sb.append(getClusterNodeIds());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wholeCluster</column-name><column-value><![CDATA[");
		sb.append(isWholeCluster());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = ClusterGroup.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			ClusterGroup.class
		};
	private long _mvccVersion;
	private long _clusterGroupId;
	private String _name;
	private String _clusterNodeIds;
	private boolean _wholeCluster;
	private ClusterGroup _escapedModel;
}