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

package com.liferay.portlet.social.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.AttachedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ShardedModel;
import com.liferay.portal.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the SocialActivityCounter service. Represents a row in the &quot;SocialActivityCounter&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.social.model.impl.SocialActivityCounterModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.social.model.impl.SocialActivityCounterImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SocialActivityCounter
 * @see com.liferay.portlet.social.model.impl.SocialActivityCounterImpl
 * @see com.liferay.portlet.social.model.impl.SocialActivityCounterModelImpl
 * @generated
 */
@ProviderType
public interface SocialActivityCounterModel extends AttachedModel,
	BaseModel<SocialActivityCounter>, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a social activity counter model instance should use the {@link SocialActivityCounter} interface instead.
	 */

	/**
	 * Returns the primary key of this social activity counter.
	 *
	 * @return the primary key of this social activity counter
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this social activity counter.
	 *
	 * @param primaryKey the primary key of this social activity counter
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the activity counter ID of this social activity counter.
	 *
	 * @return the activity counter ID of this social activity counter
	 */
	public long getActivityCounterId();

	/**
	 * Sets the activity counter ID of this social activity counter.
	 *
	 * @param activityCounterId the activity counter ID of this social activity counter
	 */
	public void setActivityCounterId(long activityCounterId);

	/**
	 * Returns the group ID of this social activity counter.
	 *
	 * @return the group ID of this social activity counter
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this social activity counter.
	 *
	 * @param groupId the group ID of this social activity counter
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this social activity counter.
	 *
	 * @return the company ID of this social activity counter
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this social activity counter.
	 *
	 * @param companyId the company ID of this social activity counter
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the fully qualified class name of this social activity counter.
	 *
	 * @return the fully qualified class name of this social activity counter
	 */
	@Override
	public String getClassName();

	public void setClassName(String className);

	/**
	 * Returns the class name ID of this social activity counter.
	 *
	 * @return the class name ID of this social activity counter
	 */
	@Override
	public long getClassNameId();

	/**
	 * Sets the class name ID of this social activity counter.
	 *
	 * @param classNameId the class name ID of this social activity counter
	 */
	@Override
	public void setClassNameId(long classNameId);

	/**
	 * Returns the class p k of this social activity counter.
	 *
	 * @return the class p k of this social activity counter
	 */
	@Override
	public long getClassPK();

	/**
	 * Sets the class p k of this social activity counter.
	 *
	 * @param classPK the class p k of this social activity counter
	 */
	@Override
	public void setClassPK(long classPK);

	/**
	 * Returns the name of this social activity counter.
	 *
	 * @return the name of this social activity counter
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this social activity counter.
	 *
	 * @param name the name of this social activity counter
	 */
	public void setName(String name);

	/**
	 * Returns the owner type of this social activity counter.
	 *
	 * @return the owner type of this social activity counter
	 */
	public int getOwnerType();

	/**
	 * Sets the owner type of this social activity counter.
	 *
	 * @param ownerType the owner type of this social activity counter
	 */
	public void setOwnerType(int ownerType);

	/**
	 * Returns the current value of this social activity counter.
	 *
	 * @return the current value of this social activity counter
	 */
	public int getCurrentValue();

	/**
	 * Sets the current value of this social activity counter.
	 *
	 * @param currentValue the current value of this social activity counter
	 */
	public void setCurrentValue(int currentValue);

	/**
	 * Returns the total value of this social activity counter.
	 *
	 * @return the total value of this social activity counter
	 */
	public int getTotalValue();

	/**
	 * Sets the total value of this social activity counter.
	 *
	 * @param totalValue the total value of this social activity counter
	 */
	public void setTotalValue(int totalValue);

	/**
	 * Returns the grace value of this social activity counter.
	 *
	 * @return the grace value of this social activity counter
	 */
	public int getGraceValue();

	/**
	 * Sets the grace value of this social activity counter.
	 *
	 * @param graceValue the grace value of this social activity counter
	 */
	public void setGraceValue(int graceValue);

	/**
	 * Returns the start period of this social activity counter.
	 *
	 * @return the start period of this social activity counter
	 */
	public int getStartPeriod();

	/**
	 * Sets the start period of this social activity counter.
	 *
	 * @param startPeriod the start period of this social activity counter
	 */
	public void setStartPeriod(int startPeriod);

	/**
	 * Returns the end period of this social activity counter.
	 *
	 * @return the end period of this social activity counter
	 */
	public int getEndPeriod();

	/**
	 * Sets the end period of this social activity counter.
	 *
	 * @param endPeriod the end period of this social activity counter
	 */
	public void setEndPeriod(int endPeriod);

	/**
	 * Returns the active of this social activity counter.
	 *
	 * @return the active of this social activity counter
	 */
	public boolean getActive();

	/**
	 * Returns <code>true</code> if this social activity counter is active.
	 *
	 * @return <code>true</code> if this social activity counter is active; <code>false</code> otherwise
	 */
	public boolean isActive();

	/**
	 * Sets whether this social activity counter is active.
	 *
	 * @param active the active of this social activity counter
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
		com.liferay.portlet.social.model.SocialActivityCounter socialActivityCounter);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.portlet.social.model.SocialActivityCounter> toCacheModel();

	@Override
	public com.liferay.portlet.social.model.SocialActivityCounter toEscapedModel();

	@Override
	public com.liferay.portlet.social.model.SocialActivityCounter toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}