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

package com.liferay.asset.auto.tagger.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.asset.auto.tagger.model.AssetAutoTaggerEntry;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssetAutoTaggerEntry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AssetAutoTaggerEntry
 * @generated
 */
@ProviderType
public class AssetAutoTaggerEntryCacheModel implements CacheModel<AssetAutoTaggerEntry>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetAutoTaggerEntryCacheModel)) {
			return false;
		}

		AssetAutoTaggerEntryCacheModel assetAutoTaggerEntryCacheModel = (AssetAutoTaggerEntryCacheModel)obj;

		if (assetAutoTaggerEntryId == assetAutoTaggerEntryCacheModel.assetAutoTaggerEntryId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, assetAutoTaggerEntryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{assetAutoTaggerEntryId=");
		sb.append(assetAutoTaggerEntryId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", assetEntryId=");
		sb.append(assetEntryId);
		sb.append(", assetTagId=");
		sb.append(assetTagId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AssetAutoTaggerEntry toEntityModel() {
		AssetAutoTaggerEntryImpl assetAutoTaggerEntryImpl = new AssetAutoTaggerEntryImpl();

		assetAutoTaggerEntryImpl.setAssetAutoTaggerEntryId(assetAutoTaggerEntryId);
		assetAutoTaggerEntryImpl.setGroupId(groupId);
		assetAutoTaggerEntryImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			assetAutoTaggerEntryImpl.setCreateDate(null);
		}
		else {
			assetAutoTaggerEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			assetAutoTaggerEntryImpl.setModifiedDate(null);
		}
		else {
			assetAutoTaggerEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		assetAutoTaggerEntryImpl.setAssetEntryId(assetEntryId);
		assetAutoTaggerEntryImpl.setAssetTagId(assetTagId);

		assetAutoTaggerEntryImpl.resetOriginalValues();

		return assetAutoTaggerEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		assetAutoTaggerEntryId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		assetEntryId = objectInput.readLong();

		assetTagId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(assetAutoTaggerEntryId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(assetEntryId);

		objectOutput.writeLong(assetTagId);
	}

	public long assetAutoTaggerEntryId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long assetEntryId;
	public long assetTagId;
}