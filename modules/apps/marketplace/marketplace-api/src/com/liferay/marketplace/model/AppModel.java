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

package com.liferay.marketplace.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedAuditedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the App service. Represents a row in the &quot;App&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.marketplace.model.impl.AppModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.marketplace.model.impl.AppImpl}.
 * </p>
 *
 * @author Ryan Park
 * @see App
 * @see com.liferay.marketplace.model.impl.AppImpl
 * @see com.liferay.marketplace.model.impl.AppModelImpl
 * @generated
 */
@ProviderType
public interface AppModel extends BaseModel<App>, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a app model instance should use the {@link App} interface instead.
	 */

	/**
	 * Returns the primary key of this app.
	 *
	 * @return the primary key of this app
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this app.
	 *
	 * @param primaryKey the primary key of this app
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this app.
	 *
	 * @return the uuid of this app
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this app.
	 *
	 * @param uuid the uuid of this app
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the app ID of this app.
	 *
	 * @return the app ID of this app
	 */
	public long getAppId();

	/**
	 * Sets the app ID of this app.
	 *
	 * @param appId the app ID of this app
	 */
	public void setAppId(long appId);

	/**
	 * Returns the company ID of this app.
	 *
	 * @return the company ID of this app
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this app.
	 *
	 * @param companyId the company ID of this app
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this app.
	 *
	 * @return the user ID of this app
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this app.
	 *
	 * @param userId the user ID of this app
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this app.
	 *
	 * @return the user uuid of this app
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this app.
	 *
	 * @param userUuid the user uuid of this app
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this app.
	 *
	 * @return the user name of this app
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this app.
	 *
	 * @param userName the user name of this app
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this app.
	 *
	 * @return the create date of this app
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this app.
	 *
	 * @param createDate the create date of this app
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this app.
	 *
	 * @return the modified date of this app
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this app.
	 *
	 * @param modifiedDate the modified date of this app
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the remote app ID of this app.
	 *
	 * @return the remote app ID of this app
	 */
	public long getRemoteAppId();

	/**
	 * Sets the remote app ID of this app.
	 *
	 * @param remoteAppId the remote app ID of this app
	 */
	public void setRemoteAppId(long remoteAppId);

	/**
	 * Returns the title of this app.
	 *
	 * @return the title of this app
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this app.
	 *
	 * @param title the title of this app
	 */
	public void setTitle(String title);

	/**
	 * Returns the description of this app.
	 *
	 * @return the description of this app
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this app.
	 *
	 * @param description the description of this app
	 */
	public void setDescription(String description);

	/**
	 * Returns the category of this app.
	 *
	 * @return the category of this app
	 */
	@AutoEscape
	public String getCategory();

	/**
	 * Sets the category of this app.
	 *
	 * @param category the category of this app
	 */
	public void setCategory(String category);

	/**
	 * Returns the icon u r l of this app.
	 *
	 * @return the icon u r l of this app
	 */
	@AutoEscape
	public String getIconURL();

	/**
	 * Sets the icon u r l of this app.
	 *
	 * @param iconURL the icon u r l of this app
	 */
	public void setIconURL(String iconURL);

	/**
	 * Returns the version of this app.
	 *
	 * @return the version of this app
	 */
	@AutoEscape
	public String getVersion();

	/**
	 * Sets the version of this app.
	 *
	 * @param version the version of this app
	 */
	public void setVersion(String version);

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
	public int compareTo(com.liferay.marketplace.model.App app);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.marketplace.model.App> toCacheModel();

	@Override
	public com.liferay.marketplace.model.App toEscapedModel();

	@Override
	public com.liferay.marketplace.model.App toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}