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

package com.liferay.portlet.messageboards.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.model.ShardedModel;
import com.liferay.portal.model.StagedAuditedModel;
import com.liferay.portal.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the MBMailingList service. Represents a row in the &quot;MBMailingList&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.messageboards.model.impl.MBMailingListModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.messageboards.model.impl.MBMailingListImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MBMailingList
 * @see com.liferay.portlet.messageboards.model.impl.MBMailingListImpl
 * @see com.liferay.portlet.messageboards.model.impl.MBMailingListModelImpl
 * @generated
 */
@ProviderType
public interface MBMailingListModel extends BaseModel<MBMailingList>,
	GroupedModel, ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a message boards mailing list model instance should use the {@link MBMailingList} interface instead.
	 */

	/**
	 * Returns the primary key of this message boards mailing list.
	 *
	 * @return the primary key of this message boards mailing list
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this message boards mailing list.
	 *
	 * @param primaryKey the primary key of this message boards mailing list
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this message boards mailing list.
	 *
	 * @return the uuid of this message boards mailing list
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this message boards mailing list.
	 *
	 * @param uuid the uuid of this message boards mailing list
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the mailing list ID of this message boards mailing list.
	 *
	 * @return the mailing list ID of this message boards mailing list
	 */
	public long getMailingListId();

	/**
	 * Sets the mailing list ID of this message boards mailing list.
	 *
	 * @param mailingListId the mailing list ID of this message boards mailing list
	 */
	public void setMailingListId(long mailingListId);

	/**
	 * Returns the group ID of this message boards mailing list.
	 *
	 * @return the group ID of this message boards mailing list
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this message boards mailing list.
	 *
	 * @param groupId the group ID of this message boards mailing list
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this message boards mailing list.
	 *
	 * @return the company ID of this message boards mailing list
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this message boards mailing list.
	 *
	 * @param companyId the company ID of this message boards mailing list
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this message boards mailing list.
	 *
	 * @return the user ID of this message boards mailing list
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this message boards mailing list.
	 *
	 * @param userId the user ID of this message boards mailing list
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this message boards mailing list.
	 *
	 * @return the user uuid of this message boards mailing list
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this message boards mailing list.
	 *
	 * @param userUuid the user uuid of this message boards mailing list
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this message boards mailing list.
	 *
	 * @return the user name of this message boards mailing list
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this message boards mailing list.
	 *
	 * @param userName the user name of this message boards mailing list
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this message boards mailing list.
	 *
	 * @return the create date of this message boards mailing list
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this message boards mailing list.
	 *
	 * @param createDate the create date of this message boards mailing list
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this message boards mailing list.
	 *
	 * @return the modified date of this message boards mailing list
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this message boards mailing list.
	 *
	 * @param modifiedDate the modified date of this message boards mailing list
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the category ID of this message boards mailing list.
	 *
	 * @return the category ID of this message boards mailing list
	 */
	public long getCategoryId();

	/**
	 * Sets the category ID of this message boards mailing list.
	 *
	 * @param categoryId the category ID of this message boards mailing list
	 */
	public void setCategoryId(long categoryId);

	/**
	 * Returns the email address of this message boards mailing list.
	 *
	 * @return the email address of this message boards mailing list
	 */
	@AutoEscape
	public String getEmailAddress();

	/**
	 * Sets the email address of this message boards mailing list.
	 *
	 * @param emailAddress the email address of this message boards mailing list
	 */
	public void setEmailAddress(String emailAddress);

	/**
	 * Returns the in protocol of this message boards mailing list.
	 *
	 * @return the in protocol of this message boards mailing list
	 */
	@AutoEscape
	public String getInProtocol();

	/**
	 * Sets the in protocol of this message boards mailing list.
	 *
	 * @param inProtocol the in protocol of this message boards mailing list
	 */
	public void setInProtocol(String inProtocol);

	/**
	 * Returns the in server name of this message boards mailing list.
	 *
	 * @return the in server name of this message boards mailing list
	 */
	@AutoEscape
	public String getInServerName();

	/**
	 * Sets the in server name of this message boards mailing list.
	 *
	 * @param inServerName the in server name of this message boards mailing list
	 */
	public void setInServerName(String inServerName);

	/**
	 * Returns the in server port of this message boards mailing list.
	 *
	 * @return the in server port of this message boards mailing list
	 */
	public int getInServerPort();

	/**
	 * Sets the in server port of this message boards mailing list.
	 *
	 * @param inServerPort the in server port of this message boards mailing list
	 */
	public void setInServerPort(int inServerPort);

	/**
	 * Returns the in use s s l of this message boards mailing list.
	 *
	 * @return the in use s s l of this message boards mailing list
	 */
	public boolean getInUseSSL();

	/**
	 * Returns <code>true</code> if this message boards mailing list is in use s s l.
	 *
	 * @return <code>true</code> if this message boards mailing list is in use s s l; <code>false</code> otherwise
	 */
	public boolean isInUseSSL();

	/**
	 * Sets whether this message boards mailing list is in use s s l.
	 *
	 * @param inUseSSL the in use s s l of this message boards mailing list
	 */
	public void setInUseSSL(boolean inUseSSL);

	/**
	 * Returns the in user name of this message boards mailing list.
	 *
	 * @return the in user name of this message boards mailing list
	 */
	@AutoEscape
	public String getInUserName();

	/**
	 * Sets the in user name of this message boards mailing list.
	 *
	 * @param inUserName the in user name of this message boards mailing list
	 */
	public void setInUserName(String inUserName);

	/**
	 * Returns the in password of this message boards mailing list.
	 *
	 * @return the in password of this message boards mailing list
	 */
	@AutoEscape
	public String getInPassword();

	/**
	 * Sets the in password of this message boards mailing list.
	 *
	 * @param inPassword the in password of this message boards mailing list
	 */
	public void setInPassword(String inPassword);

	/**
	 * Returns the in read interval of this message boards mailing list.
	 *
	 * @return the in read interval of this message boards mailing list
	 */
	public int getInReadInterval();

	/**
	 * Sets the in read interval of this message boards mailing list.
	 *
	 * @param inReadInterval the in read interval of this message boards mailing list
	 */
	public void setInReadInterval(int inReadInterval);

	/**
	 * Returns the out email address of this message boards mailing list.
	 *
	 * @return the out email address of this message boards mailing list
	 */
	@AutoEscape
	public String getOutEmailAddress();

	/**
	 * Sets the out email address of this message boards mailing list.
	 *
	 * @param outEmailAddress the out email address of this message boards mailing list
	 */
	public void setOutEmailAddress(String outEmailAddress);

	/**
	 * Returns the out custom of this message boards mailing list.
	 *
	 * @return the out custom of this message boards mailing list
	 */
	public boolean getOutCustom();

	/**
	 * Returns <code>true</code> if this message boards mailing list is out custom.
	 *
	 * @return <code>true</code> if this message boards mailing list is out custom; <code>false</code> otherwise
	 */
	public boolean isOutCustom();

	/**
	 * Sets whether this message boards mailing list is out custom.
	 *
	 * @param outCustom the out custom of this message boards mailing list
	 */
	public void setOutCustom(boolean outCustom);

	/**
	 * Returns the out server name of this message boards mailing list.
	 *
	 * @return the out server name of this message boards mailing list
	 */
	@AutoEscape
	public String getOutServerName();

	/**
	 * Sets the out server name of this message boards mailing list.
	 *
	 * @param outServerName the out server name of this message boards mailing list
	 */
	public void setOutServerName(String outServerName);

	/**
	 * Returns the out server port of this message boards mailing list.
	 *
	 * @return the out server port of this message boards mailing list
	 */
	public int getOutServerPort();

	/**
	 * Sets the out server port of this message boards mailing list.
	 *
	 * @param outServerPort the out server port of this message boards mailing list
	 */
	public void setOutServerPort(int outServerPort);

	/**
	 * Returns the out use s s l of this message boards mailing list.
	 *
	 * @return the out use s s l of this message boards mailing list
	 */
	public boolean getOutUseSSL();

	/**
	 * Returns <code>true</code> if this message boards mailing list is out use s s l.
	 *
	 * @return <code>true</code> if this message boards mailing list is out use s s l; <code>false</code> otherwise
	 */
	public boolean isOutUseSSL();

	/**
	 * Sets whether this message boards mailing list is out use s s l.
	 *
	 * @param outUseSSL the out use s s l of this message boards mailing list
	 */
	public void setOutUseSSL(boolean outUseSSL);

	/**
	 * Returns the out user name of this message boards mailing list.
	 *
	 * @return the out user name of this message boards mailing list
	 */
	@AutoEscape
	public String getOutUserName();

	/**
	 * Sets the out user name of this message boards mailing list.
	 *
	 * @param outUserName the out user name of this message boards mailing list
	 */
	public void setOutUserName(String outUserName);

	/**
	 * Returns the out password of this message boards mailing list.
	 *
	 * @return the out password of this message boards mailing list
	 */
	@AutoEscape
	public String getOutPassword();

	/**
	 * Sets the out password of this message boards mailing list.
	 *
	 * @param outPassword the out password of this message boards mailing list
	 */
	public void setOutPassword(String outPassword);

	/**
	 * Returns the allow anonymous of this message boards mailing list.
	 *
	 * @return the allow anonymous of this message boards mailing list
	 */
	public boolean getAllowAnonymous();

	/**
	 * Returns <code>true</code> if this message boards mailing list is allow anonymous.
	 *
	 * @return <code>true</code> if this message boards mailing list is allow anonymous; <code>false</code> otherwise
	 */
	public boolean isAllowAnonymous();

	/**
	 * Sets whether this message boards mailing list is allow anonymous.
	 *
	 * @param allowAnonymous the allow anonymous of this message boards mailing list
	 */
	public void setAllowAnonymous(boolean allowAnonymous);

	/**
	 * Returns the active of this message boards mailing list.
	 *
	 * @return the active of this message boards mailing list
	 */
	public boolean getActive();

	/**
	 * Returns <code>true</code> if this message boards mailing list is active.
	 *
	 * @return <code>true</code> if this message boards mailing list is active; <code>false</code> otherwise
	 */
	public boolean isActive();

	/**
	 * Sets whether this message boards mailing list is active.
	 *
	 * @param active the active of this message boards mailing list
	 */
	public void setActive(boolean active);

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
	public int compareTo(
		com.liferay.portlet.messageboards.model.MBMailingList mbMailingList);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.portlet.messageboards.model.MBMailingList> toCacheModel();

	@Override
	public com.liferay.portlet.messageboards.model.MBMailingList toEscapedModel();

	@Override
	public com.liferay.portlet.messageboards.model.MBMailingList toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}