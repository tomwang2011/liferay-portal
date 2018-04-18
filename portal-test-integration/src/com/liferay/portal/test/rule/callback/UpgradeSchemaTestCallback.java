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

package com.liferay.portal.test.rule.callback;

import com.liferay.mail.util.SendmailHook;
import com.liferay.petra.process.LoggingOutputProcessor;
import com.liferay.petra.process.ProcessUtil;
import com.liferay.petra.process.local.LocalProcessExecutor;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.db.DBType;
import com.liferay.portal.kernel.dao.jdbc.DataAccess;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.test.ReflectionTestUtil;
import com.liferay.portal.kernel.test.rule.callback.BaseTestCallback;
import com.liferay.portal.kernel.util.InfrastructureUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.xml.SAXReaderUtil;
import com.liferay.portal.kernel.xml.UnsecureSAXReaderUtil;
import com.liferay.portal.util.PropsUtil;
import com.liferay.portal.xml.SAXReaderImpl;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.sql.Connection;
import java.sql.Wrapper;
import java.util.concurrent.Future;

import com.zaxxer.hikari.HikariDataSource;
import jodd.io.FileUtil;

import org.junit.runner.Description;
import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;

import javax.sql.DataSource;

/**
 * @author Tom Wang
 */
public class UpgradeSchemaTestCallback extends BaseTestCallback<Void, Void> {

	public static final UpgradeSchemaTestCallback INSTANCE =
		new UpgradeSchemaTestCallback();

	@Override
	public Void beforeClass(Description description) throws Exception {
		DB db = DBManagerUtil.getDB();

		DBType dbType = db.getDBType();

		if (dbType == DBType.HYPERSONIC) {
			File file = new File(
				PropsUtil.get("liferay.home") + "/data/hypersonic");

			if (file.isDirectory()) {
				FileUtil.deleteDir(file);
			}
		}
		else {
			String dbName = dbType.getName();

			if (dbName.equals(DBType.MARIADB.getName())) {
				dbName = DBType.MYSQL.getName();
			}

			InputStream is =
				UpgradeSchemaTestCallback.class.getResourceAsStream(
					"dependencies/init-" + dbName + ".sql");

			LazyConnectionDataSourceProxy lazyConnectionDataSourceProxy = (LazyConnectionDataSourceProxy) DataAccess.getConnection();

			DataSource dataSource =
				ReflectionTestUtil.getFieldValue(
					lazyConnectionDataSourceProxy, "targetDataSource");

			Connection connection1 = dataSource.getConnection();

			DataAccess.cleanUp(connection1);

			try {
				Future<?> future = ProcessUtil.execute(
					new LoggingOutputProcessor(
						(stdErr, line) -> {
							if (stdErr) {
								_log.error(line);
							}
							else if (_log.isInfoEnabled()) {
								_log.info(line);
							}
						}),
					"psql", "-c", "\"drop database\"");

				future.get();
			}
			catch (Exception e) {
				_log.error(e, e);
			}

			db.runSQLTemplateString(StringUtil.read(is), false, false);
		}

		SAXReaderUtil saxReaderUtil = new SAXReaderUtil();

		SAXReaderImpl secureSAXReader = new SAXReaderImpl();

		secureSAXReader.setSecure(true);

		saxReaderUtil.setSAXReader(secureSAXReader);

		UnsecureSAXReaderUtil unsecureSAXReaderUtil =
			new UnsecureSAXReaderUtil();

		unsecureSAXReaderUtil.setSAXReader(new SAXReaderImpl());

		return null;
	}

	private UpgradeSchemaTestCallback() {
	}

	private static final Log _log = LogFactoryUtil.getLog(
		UpgradeSchemaTestCallback.class);

}