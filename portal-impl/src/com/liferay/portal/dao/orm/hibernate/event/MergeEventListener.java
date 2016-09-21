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
public class MergeEventListener extends DefaultMergeEventListener {
	public static final MergeEventListener INSTANCE =
		new MergeEventListener();

	public void MergeEventListener() {
//		if (System.getenv("JENKINS_HOME") == null) {
//			_enabled = false;
//		}
//		else {
			_enabled = true;

			try {
				_tempFile = File.createTempFile("mvcc-log", null);

				_tempFile.deleteOnExit();
			}
			catch (IOException ioe) {
				throw new UncheckedIOException(ioe);
			}
//		}
	}

	@Override
	public void onMerge(MergeEvent event) throws HibernateException {
		try {
			if (_enabled) {
				_logEvent(event);
			}

			super.onMerge(event);
		}
		catch (StaleObjectStateException sose) {
			if (!_enabled) {
				throw sose;
			}

			throw new HibernateException(
				_findStaleObjectStateExceptionCause(event));
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

			unsyncPrintWriter.write(entityName);
			unsyncPrintWriter.write('-');
			unsyncPrintWriter.write(primaryKey.toString());
			unsyncPrintWriter.write('-');
			unsyncPrintWriter.write("mvccVersion=");
			unsyncPrintWriter.write(String.valueOf(version));
			unsyncPrintWriter.write('\n');

			Exception exception = new Exception();

			exception.printStackTrace(unsyncPrintWriter);
		}
		catch (IOException ioe) {
			throw new UncheckedIOException(ioe);
		}
	}

	private String _findStaleObjectStateExceptionCause(MergeEvent event) {
		Object object = event.getEntity();

		if (!(object instanceof MVCCModel)) {
			return null;
		}

		MVCCModel mvccModel = (MVCCModel)object;

		long version = mvccModel.getMvccVersion();

		try {
			return _extractConflictVersionLog(version);
		}
		catch (IOException ioe) {
			throw new UncheckedIOException(ioe);
		}
	}

	private String _extractConflictVersionLog(long version) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(
			Files.newInputStream(_tempFile.toPath()));

		BufferedReader bufferedReader = new BufferedReader(
			inputStreamReader);

		String line = null;

		StringBuilder sb = new StringBuilder();

		while ((line = bufferedReader.readLine()) != null) {
			if (line.contains("mvccVersion=" + version)) {
				sb.append(line);

				while ((line = bufferedReader.readLine()) != null) {
					if (!line.contains("mvccVersion")) {
						sb.append(line);
					}
					else {
						break;
					}
				}
			}
			break;
		}

		return sb.toString();
	}

	private boolean _enabled;
	private File _tempFile;

}
