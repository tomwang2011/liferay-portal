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

package com.liferay.service.access.policy.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.LocalizedModel;
import com.liferay.portal.model.ShardedModel;
import com.liferay.portal.model.StagedAuditedModel;
import com.liferay.portal.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the SAPEntry service. Represents a row in the &quot;SAPEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.service.access.policy.model.impl.SAPEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.service.access.policy.model.impl.SAPEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SAPEntry
 * @see com.liferay.service.access.policy.model.impl.SAPEntryImpl
 * @see com.liferay.service.access.policy.model.impl.SAPEntryModelImpl
 * @generated
 */
@ProviderType
public interface SAPEntryModel extends BaseModel<SAPEntry>, LocalizedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a s a p entry model instance should use the {@link SAPEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this s a p entry.
	 *
	 * @return the primary key of this s a p entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this s a p entry.
	 *
	 * @param primaryKey the primary key of this s a p entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this s a p entry.
	 *
	 * @return the uuid of this s a p entry
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this s a p entry.
	 *
	 * @param uuid the uuid of this s a p entry
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the sap entry ID of this s a p entry.
	 *
	 * @return the sap entry ID of this s a p entry
	 */
	public long getSapEntryId();

	/**
	 * Sets the sap entry ID of this s a p entry.
	 *
	 * @param sapEntryId the sap entry ID of this s a p entry
	 */
	public void setSapEntryId(long sapEntryId);

	/**
	 * Returns the company ID of this s a p entry.
	 *
	 * @return the company ID of this s a p entry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this s a p entry.
	 *
	 * @param companyId the company ID of this s a p entry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this s a p entry.
	 *
	 * @return the user ID of this s a p entry
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this s a p entry.
	 *
	 * @param userId the user ID of this s a p entry
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this s a p entry.
	 *
	 * @return the user uuid of this s a p entry
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this s a p entry.
	 *
	 * @param userUuid the user uuid of this s a p entry
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this s a p entry.
	 *
	 * @return the user name of this s a p entry
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this s a p entry.
	 *
	 * @param userName the user name of this s a p entry
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this s a p entry.
	 *
	 * @return the create date of this s a p entry
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this s a p entry.
	 *
	 * @param createDate the create date of this s a p entry
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this s a p entry.
	 *
	 * @return the modified date of this s a p entry
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this s a p entry.
	 *
	 * @param modifiedDate the modified date of this s a p entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the allowed service signatures of this s a p entry.
	 *
	 * @return the allowed service signatures of this s a p entry
	 */
	@AutoEscape
	public String getAllowedServiceSignatures();

	/**
	 * Sets the allowed service signatures of this s a p entry.
	 *
	 * @param allowedServiceSignatures the allowed service signatures of this s a p entry
	 */
	public void setAllowedServiceSignatures(String allowedServiceSignatures);

	/**
	 * Returns the default s a p entry of this s a p entry.
	 *
	 * @return the default s a p entry of this s a p entry
	 */
	public boolean getDefaultSAPEntry();

	/**
	 * Returns <code>true</code> if this s a p entry is default s a p entry.
	 *
	 * @return <code>true</code> if this s a p entry is default s a p entry; <code>false</code> otherwise
	 */
	public boolean isDefaultSAPEntry();

	/**
	 * Sets whether this s a p entry is default s a p entry.
	 *
	 * @param defaultSAPEntry the default s a p entry of this s a p entry
	 */
	public void setDefaultSAPEntry(boolean defaultSAPEntry);

	/**
	 * Returns the enabled of this s a p entry.
	 *
	 * @return the enabled of this s a p entry
	 */
	public boolean getEnabled();

	/**
	 * Returns <code>true</code> if this s a p entry is enabled.
	 *
	 * @return <code>true</code> if this s a p entry is enabled; <code>false</code> otherwise
	 */
	public boolean isEnabled();

	/**
	 * Sets whether this s a p entry is enabled.
	 *
	 * @param enabled the enabled of this s a p entry
	 */
	public void setEnabled(boolean enabled);

	/**
	 * Returns the name of this s a p entry.
	 *
	 * @return the name of this s a p entry
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this s a p entry.
	 *
	 * @param name the name of this s a p entry
	 */
	public void setName(String name);

	/**
	 * Returns the title of this s a p entry.
	 *
	 * @return the title of this s a p entry
	 */
	public String getTitle();

	/**
	 * Returns the localized title of this s a p entry in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized title of this s a p entry
	 */
	@AutoEscape
	public String getTitle(Locale locale);

	/**
	 * Returns the localized title of this s a p entry in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this s a p entry. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getTitle(Locale locale, boolean useDefault);

	/**
	 * Returns the localized title of this s a p entry in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized title of this s a p entry
	 */
	@AutoEscape
	public String getTitle(String languageId);

	/**
	 * Returns the localized title of this s a p entry in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this s a p entry
	 */
	@AutoEscape
	public String getTitle(String languageId, boolean useDefault);

	@AutoEscape
	public String getTitleCurrentLanguageId();

	@AutoEscape
	public String getTitleCurrentValue();

	/**
	 * Returns a map of the locales and localized titles of this s a p entry.
	 *
	 * @return the locales and localized titles of this s a p entry
	 */
	public Map<Locale, String> getTitleMap();

	/**
	 * Sets the title of this s a p entry.
	 *
	 * @param title the title of this s a p entry
	 */
	public void setTitle(String title);

	/**
	 * Sets the localized title of this s a p entry in the language.
	 *
	 * @param title the localized title of this s a p entry
	 * @param locale the locale of the language
	 */
	public void setTitle(String title, Locale locale);

	/**
	 * Sets the localized title of this s a p entry in the language, and sets the default locale.
	 *
	 * @param title the localized title of this s a p entry
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setTitle(String title, Locale locale, Locale defaultLocale);

	public void setTitleCurrentLanguageId(String languageId);

	/**
	 * Sets the localized titles of this s a p entry from the map of locales and localized titles.
	 *
	 * @param titleMap the locales and localized titles of this s a p entry
	 */
	public void setTitleMap(Map<Locale, String> titleMap);

	/**
	 * Sets the localized titles of this s a p entry from the map of locales and localized titles, and sets the default locale.
	 *
	 * @param titleMap the locales and localized titles of this s a p entry
	 * @param defaultLocale the default locale
	 */
	public void setTitleMap(Map<Locale, String> titleMap, Locale defaultLocale);

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
	public String[] getAvailableLanguageIds();

	@Override
	public String getDefaultLanguageId();

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException;

	@Override
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException;

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.liferay.service.access.policy.model.SAPEntry sapEntry);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.service.access.policy.model.SAPEntry> toCacheModel();

	@Override
	public com.liferay.service.access.policy.model.SAPEntry toEscapedModel();

	@Override
	public com.liferay.service.access.policy.model.SAPEntry toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}