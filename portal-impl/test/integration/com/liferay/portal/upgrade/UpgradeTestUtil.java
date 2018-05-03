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

package com.liferay.portal.upgrade;

import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBInspector;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.db.DBType;
import com.liferay.portal.kernel.dao.jdbc.DataAccess;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.InputStream;

import java.sql.SQLException;

/**
 * @author Tom Wang
 */
public class UpgradeTestUtil {

	public static boolean hasColumn(String tableName, String columnName)
		throws Exception {

		return _dbInspector.hasColumn(tableName, columnName);
	}

	public static boolean hasTable(String tableName) throws Exception {
		return _dbInspector.hasTable(tableName);
	}

	public static void populateDB(Class clazz) throws Exception {
		DB db = DBManagerUtil.getDB();

		DBType dbType = db.getDBType();

		InputStream is = clazz.getResourceAsStream(
			"dependencies/portal-tables-" + dbType.getName() + ".sql");

		db.runSQLTemplateString(StringUtil.read(is), false, false);

		is = clazz.getResourceAsStream(
			"dependencies/indexes-" + dbType.getName() + ".sql");

		String sqlContent = StringUtil.read(is);

		StringUtil.replace(
			sqlContent,
			"create index IX_7020130F on SCProductVersion (directDownloadURL);",
			"create index IX_7020130F on SCProductVersion " +
				"(directDownloadURL(255));");

		StringUtil.replace(
			sqlContent,
			"create index IX_89509087 on User_ (companyId, openId);",
			"create index IX_89509087 on User_ (companyId, openId(255));");

		db.runSQLTemplateString(StringUtil.read(is), false, false);
	}

	private static final DBInspector _dbInspector;

	static {
		try {
			_dbInspector = new DBInspector(DataAccess.getConnection());
		}
		catch (SQLException sqle) {
			throw new ExceptionInInitializerError(sqle);
		}
	}

}