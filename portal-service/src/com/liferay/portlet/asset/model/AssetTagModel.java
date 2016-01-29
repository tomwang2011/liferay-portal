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

package com.liferay.portlet.asset.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ShardedModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the AssetTag service. Represents a row in the &quot;AssetTag&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.asset.model.impl.AssetTagModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.asset.model.impl.AssetTagImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetTag
 * @see com.liferay.portlet.asset.model.impl.AssetTagImpl
 * @see com.liferay.portlet.asset.model.impl.AssetTagModelImpl
 * @generated
 */
@ProviderType
public interface AssetTagModel extends BaseModel<AssetTag>, ShardedModel,
	StagedGroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a asset tag model instance should use the {@link AssetTag} interface instead.
	 */

	/**
	 * Returns the primary key of this asset tag.
	 *
	 * @return the primary key of this asset tag
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this asset tag.
	 *
	 * @param primaryKey the primary key of this asset tag
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this asset tag.
	 *
	 * @return the uuid of this asset tag
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this asset tag.
	 *
	 * @param uuid the uuid of this asset tag
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the tag ID of this asset tag.
	 *
	 * @return the tag ID of this asset tag
	 */
	public long getTagId();

	/**
	 * Sets the tag ID of this asset tag.
	 *
	 * @param tagId the tag ID of this asset tag
	 */
	public void setTagId(long tagId);

	/**
	 * Returns the group ID of this asset tag.
	 *
	 * @return the group ID of this asset tag
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this asset tag.
	 *
	 * @param groupId the group ID of this asset tag
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this asset tag.
	 *
	 * @return the company ID of this asset tag
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this asset tag.
	 *
	 * @param companyId the company ID of this asset tag
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this asset tag.
	 *
	 * @return the user ID of this asset tag
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this asset tag.
	 *
	 * @param userId the user ID of this asset tag
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this asset tag.
	 *
	 * @return the user uuid of this asset tag
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this asset tag.
	 *
	 * @param userUuid the user uuid of this asset tag
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this asset tag.
	 *
	 * @return the user name of this asset tag
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this asset tag.
	 *
	 * @param userName the user name of this asset tag
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this asset tag.
	 *
	 * @return the create date of this asset tag
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this asset tag.
	 *
	 * @param createDate the create date of this asset tag
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this asset tag.
	 *
	 * @return the modified date of this asset tag
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this asset tag.
	 *
	 * @param modifiedDate the modified date of this asset tag
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this asset tag.
	 *
	 * @return the name of this asset tag
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this asset tag.
	 *
	 * @param name the name of this asset tag
	 */
	public void setName(String name);

	/**
	 * Returns the asset count of this asset tag.
	 *
	 * @return the asset count of this asset tag
	 */
	public int getAssetCount();

	/**
	 * Sets the asset count of this asset tag.
	 *
	 * @param assetCount the asset count of this asset tag
	 */
	public void setAssetCount(int assetCount);

	/**
	 * Returns the last publish date of this asset tag.
	 *
	 * @return the last publish date of this asset tag
	 */
	@Override
	public Date getLastPublishDate();

	/**
	 * Sets the last publish date of this asset tag.
	 *
	 * @param lastPublishDate the last publish date of this asset tag
	 */
	@Override
	public void setLastPublishDate(Date lastPublishDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.liferay.portlet.asset.model.AssetTag assetTag);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.portlet.asset.model.AssetTag> toCacheModel();

	@Override
	public com.liferay.portlet.asset.model.AssetTag toEscapedModel();

	@Override
	public com.liferay.portlet.asset.model.AssetTag toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}