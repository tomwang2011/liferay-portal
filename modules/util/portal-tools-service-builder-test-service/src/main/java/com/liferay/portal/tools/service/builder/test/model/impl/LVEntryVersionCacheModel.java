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

package com.liferay.portal.tools.service.builder.test.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.tools.service.builder.test.model.LVEntryVersion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LVEntryVersion in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see LVEntryVersion
 * @generated
 */
@ProviderType
public class LVEntryVersionCacheModel implements CacheModel<LVEntryVersion>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LVEntryVersionCacheModel)) {
			return false;
		}

		LVEntryVersionCacheModel lvEntryVersionCacheModel = (LVEntryVersionCacheModel)obj;

		if (lvEntryVersionId == lvEntryVersionCacheModel.lvEntryVersionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, lvEntryVersionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{lvEntryVersionId=");
		sb.append(lvEntryVersionId);
		sb.append(", version=");
		sb.append(version);
		sb.append(", defaultLanguageId=");
		sb.append(defaultLanguageId);
		sb.append(", lvEntryId=");
		sb.append(lvEntryId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LVEntryVersion toEntityModel() {
		LVEntryVersionImpl lvEntryVersionImpl = new LVEntryVersionImpl();

		lvEntryVersionImpl.setLvEntryVersionId(lvEntryVersionId);
		lvEntryVersionImpl.setVersion(version);

		if (defaultLanguageId == null) {
			lvEntryVersionImpl.setDefaultLanguageId("");
		}
		else {
			lvEntryVersionImpl.setDefaultLanguageId(defaultLanguageId);
		}

		lvEntryVersionImpl.setLvEntryId(lvEntryId);
		lvEntryVersionImpl.setGroupId(groupId);

		lvEntryVersionImpl.resetOriginalValues();

		return lvEntryVersionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		lvEntryVersionId = objectInput.readLong();

		version = objectInput.readInt();
		defaultLanguageId = objectInput.readUTF();

		lvEntryId = objectInput.readLong();

		groupId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(lvEntryVersionId);

		objectOutput.writeInt(version);

		if (defaultLanguageId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(defaultLanguageId);
		}

		objectOutput.writeLong(lvEntryId);

		objectOutput.writeLong(groupId);
	}

	public long lvEntryVersionId;
	public int version;
	public String defaultLanguageId;
	public long lvEntryId;
	public long groupId;
}