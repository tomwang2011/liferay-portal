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

package com.liferay.layout.page.template.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.layout.page.template.model.LayoutPageTemplateEntry;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LayoutPageTemplateEntry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see LayoutPageTemplateEntry
 * @generated
 */
@ProviderType
public class LayoutPageTemplateEntryCacheModel implements CacheModel<LayoutPageTemplateEntry>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LayoutPageTemplateEntryCacheModel)) {
			return false;
		}

		LayoutPageTemplateEntryCacheModel layoutPageTemplateEntryCacheModel = (LayoutPageTemplateEntryCacheModel)obj;

		if (layoutPageTemplateEntryId == layoutPageTemplateEntryCacheModel.layoutPageTemplateEntryId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, layoutPageTemplateEntryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", layoutPageTemplateEntryId=");
		sb.append(layoutPageTemplateEntryId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", layoutPageTemplateCollectionId=");
		sb.append(layoutPageTemplateCollectionId);
		sb.append(", classNameId=");
		sb.append(classNameId);
		sb.append(", classTypeId=");
		sb.append(classTypeId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", type=");
		sb.append(type);
		sb.append(", previewFileEntryId=");
		sb.append(previewFileEntryId);
		sb.append(", defaultTemplate=");
		sb.append(defaultTemplate);
		sb.append(", layoutPrototypeId=");
		sb.append(layoutPrototypeId);
		sb.append(", lastPublishDate=");
		sb.append(lastPublishDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LayoutPageTemplateEntry toEntityModel() {
		LayoutPageTemplateEntryImpl layoutPageTemplateEntryImpl = new LayoutPageTemplateEntryImpl();

		if (uuid == null) {
			layoutPageTemplateEntryImpl.setUuid("");
		}
		else {
			layoutPageTemplateEntryImpl.setUuid(uuid);
		}

		layoutPageTemplateEntryImpl.setLayoutPageTemplateEntryId(layoutPageTemplateEntryId);
		layoutPageTemplateEntryImpl.setGroupId(groupId);
		layoutPageTemplateEntryImpl.setCompanyId(companyId);
		layoutPageTemplateEntryImpl.setUserId(userId);

		if (userName == null) {
			layoutPageTemplateEntryImpl.setUserName("");
		}
		else {
			layoutPageTemplateEntryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			layoutPageTemplateEntryImpl.setCreateDate(null);
		}
		else {
			layoutPageTemplateEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			layoutPageTemplateEntryImpl.setModifiedDate(null);
		}
		else {
			layoutPageTemplateEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		layoutPageTemplateEntryImpl.setLayoutPageTemplateCollectionId(layoutPageTemplateCollectionId);
		layoutPageTemplateEntryImpl.setClassNameId(classNameId);
		layoutPageTemplateEntryImpl.setClassTypeId(classTypeId);

		if (name == null) {
			layoutPageTemplateEntryImpl.setName("");
		}
		else {
			layoutPageTemplateEntryImpl.setName(name);
		}

		layoutPageTemplateEntryImpl.setType(type);
		layoutPageTemplateEntryImpl.setPreviewFileEntryId(previewFileEntryId);
		layoutPageTemplateEntryImpl.setDefaultTemplate(defaultTemplate);
		layoutPageTemplateEntryImpl.setLayoutPrototypeId(layoutPrototypeId);

		if (lastPublishDate == Long.MIN_VALUE) {
			layoutPageTemplateEntryImpl.setLastPublishDate(null);
		}
		else {
			layoutPageTemplateEntryImpl.setLastPublishDate(new Date(
					lastPublishDate));
		}

		layoutPageTemplateEntryImpl.setStatus(status);
		layoutPageTemplateEntryImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			layoutPageTemplateEntryImpl.setStatusByUserName("");
		}
		else {
			layoutPageTemplateEntryImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			layoutPageTemplateEntryImpl.setStatusDate(null);
		}
		else {
			layoutPageTemplateEntryImpl.setStatusDate(new Date(statusDate));
		}

		layoutPageTemplateEntryImpl.resetOriginalValues();

		return layoutPageTemplateEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		layoutPageTemplateEntryId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		layoutPageTemplateCollectionId = objectInput.readLong();

		classNameId = objectInput.readLong();

		classTypeId = objectInput.readLong();
		name = objectInput.readUTF();

		type = objectInput.readInt();

		previewFileEntryId = objectInput.readLong();

		defaultTemplate = objectInput.readBoolean();

		layoutPrototypeId = objectInput.readLong();
		lastPublishDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(layoutPageTemplateEntryId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(layoutPageTemplateCollectionId);

		objectOutput.writeLong(classNameId);

		objectOutput.writeLong(classTypeId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeInt(type);

		objectOutput.writeLong(previewFileEntryId);

		objectOutput.writeBoolean(defaultTemplate);

		objectOutput.writeLong(layoutPrototypeId);
		objectOutput.writeLong(lastPublishDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public String uuid;
	public long layoutPageTemplateEntryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long layoutPageTemplateCollectionId;
	public long classNameId;
	public long classTypeId;
	public String name;
	public int type;
	public long previewFileEntryId;
	public boolean defaultTemplate;
	public long layoutPrototypeId;
	public long lastPublishDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
}