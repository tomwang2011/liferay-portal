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

package com.liferay.portlet.blogs.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ShardedModel;
import com.liferay.portal.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the BlogsStatsUser service. Represents a row in the &quot;BlogsStatsUser&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.blogs.model.impl.BlogsStatsUserModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.blogs.model.impl.BlogsStatsUserImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BlogsStatsUser
 * @see com.liferay.portlet.blogs.model.impl.BlogsStatsUserImpl
 * @see com.liferay.portlet.blogs.model.impl.BlogsStatsUserModelImpl
 * @generated
 */
@ProviderType
public interface BlogsStatsUserModel extends BaseModel<BlogsStatsUser>,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a blogs stats user model instance should use the {@link BlogsStatsUser} interface instead.
	 */

	/**
	 * Returns the primary key of this blogs stats user.
	 *
	 * @return the primary key of this blogs stats user
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this blogs stats user.
	 *
	 * @param primaryKey the primary key of this blogs stats user
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the stats user ID of this blogs stats user.
	 *
	 * @return the stats user ID of this blogs stats user
	 */
	public long getStatsUserId();

	/**
	 * Sets the stats user ID of this blogs stats user.
	 *
	 * @param statsUserId the stats user ID of this blogs stats user
	 */
	public void setStatsUserId(long statsUserId);

	/**
	 * Returns the stats user uuid of this blogs stats user.
	 *
	 * @return the stats user uuid of this blogs stats user
	 */
	public String getStatsUserUuid();

	/**
	 * Sets the stats user uuid of this blogs stats user.
	 *
	 * @param statsUserUuid the stats user uuid of this blogs stats user
	 */
	public void setStatsUserUuid(String statsUserUuid);

	/**
	 * Returns the group ID of this blogs stats user.
	 *
	 * @return the group ID of this blogs stats user
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this blogs stats user.
	 *
	 * @param groupId the group ID of this blogs stats user
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this blogs stats user.
	 *
	 * @return the company ID of this blogs stats user
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this blogs stats user.
	 *
	 * @param companyId the company ID of this blogs stats user
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this blogs stats user.
	 *
	 * @return the user ID of this blogs stats user
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this blogs stats user.
	 *
	 * @param userId the user ID of this blogs stats user
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this blogs stats user.
	 *
	 * @return the user uuid of this blogs stats user
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this blogs stats user.
	 *
	 * @param userUuid the user uuid of this blogs stats user
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the entry count of this blogs stats user.
	 *
	 * @return the entry count of this blogs stats user
	 */
	public int getEntryCount();

	/**
	 * Sets the entry count of this blogs stats user.
	 *
	 * @param entryCount the entry count of this blogs stats user
	 */
	public void setEntryCount(int entryCount);

	/**
	 * Returns the last post date of this blogs stats user.
	 *
	 * @return the last post date of this blogs stats user
	 */
	public Date getLastPostDate();

	/**
	 * Sets the last post date of this blogs stats user.
	 *
	 * @param lastPostDate the last post date of this blogs stats user
	 */
	public void setLastPostDate(Date lastPostDate);

	/**
	 * Returns the ratings total entries of this blogs stats user.
	 *
	 * @return the ratings total entries of this blogs stats user
	 */
	public int getRatingsTotalEntries();

	/**
	 * Sets the ratings total entries of this blogs stats user.
	 *
	 * @param ratingsTotalEntries the ratings total entries of this blogs stats user
	 */
	public void setRatingsTotalEntries(int ratingsTotalEntries);

	/**
	 * Returns the ratings total score of this blogs stats user.
	 *
	 * @return the ratings total score of this blogs stats user
	 */
	public double getRatingsTotalScore();

	/**
	 * Sets the ratings total score of this blogs stats user.
	 *
	 * @param ratingsTotalScore the ratings total score of this blogs stats user
	 */
	public void setRatingsTotalScore(double ratingsTotalScore);

	/**
	 * Returns the ratings average score of this blogs stats user.
	 *
	 * @return the ratings average score of this blogs stats user
	 */
	public double getRatingsAverageScore();

	/**
	 * Sets the ratings average score of this blogs stats user.
	 *
	 * @param ratingsAverageScore the ratings average score of this blogs stats user
	 */
	public void setRatingsAverageScore(double ratingsAverageScore);

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
		com.liferay.portlet.blogs.model.BlogsStatsUser blogsStatsUser);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.portlet.blogs.model.BlogsStatsUser> toCacheModel();

	@Override
	public com.liferay.portlet.blogs.model.BlogsStatsUser toEscapedModel();

	@Override
	public com.liferay.portlet.blogs.model.BlogsStatsUser toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}