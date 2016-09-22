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

package com.liferay.portal.dao.orm.hibernate.event;

import com.liferay.portal.kernel.io.unsync.UnsyncPrintWriter;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.MVCCModel;
import com.liferay.portal.kernel.util.StringBundler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import org.hibernate.HibernateException;
import org.hibernate.StaleObjectStateException;
import org.hibernate.event.MergeEvent;
import org.hibernate.event.def.DefaultMergeEventListener;

/**
 * @author Tom Wang
 */
public class CIMergeEventListener extends DefaultMergeEventListener {
	public static final CIMergeEventListener INSTANCE =
		new CIMergeEventListener();

	public CIMergeEventListener() {
		try {
			_tempFile = File.createTempFile("mvcc-log", null);

			_tempFile.deleteOnExit();
		}
		catch (IOException ioe) {
			throw new UncheckedIOException(ioe);
		}
	}

	@Override
	public void onMerge(MergeEvent event) throws HibernateException {
		try {
			super.onMerge(event);

			_logEvent(event);
		}
		catch (StaleObjectStateException sose) {
			_findStaleObjectStateExceptionCause(event);
		}
	}

	private void _logEvent(MergeEvent event) {
		Object object = event.getEntity();

		if (!(object instanceof MVCCModel)) {
			return;
		}

		MVCCModel mvccModel = (MVCCModel)object;

		long version = mvccModel.getMvccVersion();

		BaseModel<?> baseModel = (BaseModel<?>)object;

		Serializable primaryKey = baseModel.getPrimaryKeyObj();

		String entityName = event.getEntityName();

		try (UnsyncPrintWriter unsyncPrintWriter = new UnsyncPrintWriter(
				new FileOutputStream(_tempFile, true))) {

			unsyncPrintWriter.write("{entityName=");
			unsyncPrintWriter.write(entityName);
			unsyncPrintWriter.write(", primaryKey=");
			unsyncPrintWriter.write(primaryKey.toString());
			unsyncPrintWriter.write(", mvccVersion=");
			unsyncPrintWriter.write(String.valueOf(version));
			unsyncPrintWriter.write("}\n");

			Exception exception = new Exception();

			exception.printStackTrace(unsyncPrintWriter);
		}
		catch (IOException ioe) {
			throw new UncheckedIOException(ioe);
		}
	}

	private void _findStaleObjectStateExceptionCause(MergeEvent event) {
		Object object = event.getEntity();

		if (!(object instanceof MVCCModel)) {
			return;
		}

		MVCCModel mvccModel = (MVCCModel)object;

		long version = mvccModel.getMvccVersion();

		BaseModel<?> baseModel = (BaseModel<?>)object;

		Serializable primaryKey = baseModel.getPrimaryKeyObj();

		String entityName = event.getEntityName();

		StringBundler sb = new StringBundler(7);

		sb.append("{entityName=");
		sb.append(entityName);
		sb.append(", primaryKey=");
		sb.append(primaryKey.toString());
		sb.append(", mvccVersion=");
		sb.append(version);
		sb.append("}");

		try {
			_extractConflictVersionLog(sb.toString());
		}
		catch (IOException ioe) {
			throw new UncheckedIOException(ioe);
		}
	}

	private void _extractConflictVersionLog(String search) throws IOException {
		try (InputStreamReader inputStreamReader = new InputStreamReader(
				Files.newInputStream(_tempFile.toPath()));
			BufferedReader bufferedReader = new BufferedReader(
				inputStreamReader)) {

			String line = null;

			while ((line = bufferedReader.readLine()) != null) {
				if (line.equals(search)) {
					StringBundler sb = new StringBundler(64);

					sb.append("Conflict MVCC at: \n");

					sb.append(search);
					sb.append('\n');

					while ((line = bufferedReader.readLine()) != null) {
						if (line.startsWith("{entityName=")) {
							throw new RuntimeException(sb.toString());
						}

						sb.append(line);
						sb.append('\n');
					}
				}
			}
		}
	}

	private File _tempFile;

}
