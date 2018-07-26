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

package com.liferay.document.library.opener.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.document.library.opener.model.DLOpenerFileEntryReference;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DLOpenerFileEntryReference in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see DLOpenerFileEntryReference
 * @generated
 */
@ProviderType
public class DLOpenerFileEntryReferenceCacheModel implements CacheModel<DLOpenerFileEntryReference>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DLOpenerFileEntryReferenceCacheModel)) {
			return false;
		}

		DLOpenerFileEntryReferenceCacheModel dlOpenerFileEntryReferenceCacheModel =
			(DLOpenerFileEntryReferenceCacheModel)obj;

		if (dlOpenerFileEntryReferenceId == dlOpenerFileEntryReferenceCacheModel.dlOpenerFileEntryReferenceId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, dlOpenerFileEntryReferenceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{dlOpenerFileEntryReferenceId=");
		sb.append(dlOpenerFileEntryReferenceId);
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
		sb.append(", referenceKey=");
		sb.append(referenceKey);
		sb.append(", fileEntryId=");
		sb.append(fileEntryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DLOpenerFileEntryReference toEntityModel() {
		DLOpenerFileEntryReferenceImpl dlOpenerFileEntryReferenceImpl = new DLOpenerFileEntryReferenceImpl();

		dlOpenerFileEntryReferenceImpl.setDlOpenerFileEntryReferenceId(dlOpenerFileEntryReferenceId);
		dlOpenerFileEntryReferenceImpl.setGroupId(groupId);
		dlOpenerFileEntryReferenceImpl.setCompanyId(companyId);
		dlOpenerFileEntryReferenceImpl.setUserId(userId);

		if (userName == null) {
			dlOpenerFileEntryReferenceImpl.setUserName("");
		}
		else {
			dlOpenerFileEntryReferenceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			dlOpenerFileEntryReferenceImpl.setCreateDate(null);
		}
		else {
			dlOpenerFileEntryReferenceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dlOpenerFileEntryReferenceImpl.setModifiedDate(null);
		}
		else {
			dlOpenerFileEntryReferenceImpl.setModifiedDate(new Date(
					modifiedDate));
		}

		if (referenceKey == null) {
			dlOpenerFileEntryReferenceImpl.setReferenceKey("");
		}
		else {
			dlOpenerFileEntryReferenceImpl.setReferenceKey(referenceKey);
		}

		dlOpenerFileEntryReferenceImpl.setFileEntryId(fileEntryId);

		dlOpenerFileEntryReferenceImpl.resetOriginalValues();

		return dlOpenerFileEntryReferenceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dlOpenerFileEntryReferenceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		referenceKey = objectInput.readUTF();

		fileEntryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dlOpenerFileEntryReferenceId);

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

		if (referenceKey == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(referenceKey);
		}

		objectOutput.writeLong(fileEntryId);
	}

	public long dlOpenerFileEntryReferenceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String referenceKey;
	public long fileEntryId;
}