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

package com.liferay.portal.dao.orm.custom.sql.internal;

import com.liferay.petra.string.CharPool;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.jdbc.DataAccess;
import com.liferay.portal.kernel.dao.orm.QueryDefinition;
import com.liferay.portal.kernel.dao.orm.WildcardMode;
import com.liferay.portal.kernel.io.unsync.UnsyncBufferedReader;
import com.liferay.portal.kernel.io.unsync.UnsyncStringReader;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.xml.Document;
import com.liferay.portal.kernel.xml.Element;
import com.liferay.portal.kernel.xml.UnsecureSAXReaderUtil;

import java.io.IOException;
import java.io.InputStream;

import java.net.URL;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.wiring.BundleWiring;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.tracker.BundleTracker;

/**
 * @author Brian Wing Shun Chan
 * @author Bruno Farache
 * @author Raymond Augé
 * @see    com.liferay.util.dao.orm.CustomSQL
 */
@Component
public class CustomSQLImpl implements CustomSQL {

	public static final String DB2_FUNCTION_IS_NOT_NULL =
		"CAST(? AS VARCHAR(32672)) IS NOT NULL";

	public static final String DB2_FUNCTION_IS_NULL =
		"CAST(? AS VARCHAR(32672)) IS NULL";

	public static final String INFORMIX_FUNCTION_IS_NOT_NULL =
		"NOT lportal.isnull(?)";

	public static final String INFORMIX_FUNCTION_IS_NULL = "lportal.isnull(?)";

	public static final String MYSQL_FUNCTION_IS_NOT_NULL =
		"IFNULL(?, '1') = '0'";

	public static final String MYSQL_FUNCTION_IS_NULL = "IFNULL(?, '1') = '1'";

	public static final String SYBASE_FUNCTION_IS_NOT_NULL =
		"CONVERT(VARCHAR,?) IS NOT NULL";

	public static final String SYBASE_FUNCTION_IS_NULL =
		"CONVERT(VARCHAR,?) IS NULL";

	@Activate
	public void activate(BundleContext bundleContext) throws SQLException {
		_portal.initCustomSQL();

		Connection con = DataAccess.getConnection();

		String functionIsNull = _portal.getCustomSQLFunctionIsNull();
		String functionIsNotNull = _portal.getCustomSQLFunctionIsNotNull();

		try {
			if (Validator.isNotNull(functionIsNull) &&
				Validator.isNotNull(functionIsNotNull)) {

				_functionIsNull = functionIsNull;
				_functionIsNotNull = functionIsNotNull;

				if (_log.isDebugEnabled()) {
					_log.debug(
						"functionIsNull is manually set to " + functionIsNull);
					_log.debug(
						"functionIsNotNull is manually set to " +
							functionIsNotNull);
				}
			}
			else if (con != null) {
				DatabaseMetaData metaData = con.getMetaData();

				String dbName = GetterUtil.getString(
					metaData.getDatabaseProductName());

				if (_log.isInfoEnabled()) {
					_log.info("Database name " + dbName);
				}

				if (dbName.startsWith("DB2")) {
					_vendorDB2 = true;
					_functionIsNull = DB2_FUNCTION_IS_NULL;
					_functionIsNotNull = DB2_FUNCTION_IS_NOT_NULL;

					if (_log.isInfoEnabled()) {
						_log.info("Detected DB2 with database name " + dbName);
					}
				}
				else if (dbName.startsWith("HSQL")) {
					_vendorHSQL = true;

					if (_log.isInfoEnabled()) {
						_log.info("Detected HSQL with database name " + dbName);
					}
				}
				else if (dbName.startsWith("Informix")) {
					_vendorInformix = true;
					_functionIsNull = INFORMIX_FUNCTION_IS_NULL;
					_functionIsNotNull = INFORMIX_FUNCTION_IS_NOT_NULL;

					if (_log.isInfoEnabled()) {
						_log.info(
							"Detected Informix with database name " + dbName);
					}
				}
				else if (dbName.startsWith("MySQL")) {
					_vendorMySQL = true;
					//_functionIsNull = MYSQL_FUNCTION_IS_NULL;
					//_functionIsNotNull = MYSQL_FUNCTION_IS_NOT_NULL;

					if (_log.isInfoEnabled()) {
						_log.info(
							"Detected MySQL with database name " + dbName);
					}
				}
				else if (dbName.startsWith("Sybase") || dbName.equals("ASE")) {
					_vendorSybase = true;
					_functionIsNull = SYBASE_FUNCTION_IS_NULL;
					_functionIsNotNull = SYBASE_FUNCTION_IS_NOT_NULL;

					if (_log.isInfoEnabled()) {
						_log.info(
							"Detected Sybase with database name " + dbName);
					}
				}
				else if (dbName.startsWith("Oracle")) {
					_vendorOracle = true;

					if (_log.isInfoEnabled()) {
						_log.info(
							"Detected Oracle with database name " + dbName);
					}
				}
				else if (dbName.startsWith("PostgreSQL")) {
					_vendorPostgreSQL = true;

					if (_log.isInfoEnabled()) {
						_log.info(
							"Detected PostgreSQL with database name " + dbName);
					}
				}
				else {
					if (_log.isDebugEnabled()) {
						_log.debug(
							"Unable to detect database with name " + dbName);
					}
				}
			}
		}
		catch (Exception e) {
			_log.error(e, e);
		}
		finally {
			DataAccess.cleanUp(con);
		}

		_bundleTracker = new BundleTracker<ClassLoader>(
			bundleContext, Bundle.ACTIVE, null) {

			@Override
			public ClassLoader addingBundle(
				Bundle bundle, BundleEvent bundleEvent) {

				BundleWiring bundleWiring = bundle.adapt(BundleWiring.class);

				ClassLoader classLoader = bundleWiring.getClassLoader();

				URL sourceURL = classLoader.getResource(
					"custom-sql/default.xml");

				if (sourceURL == null) {
					sourceURL = classLoader.getResource(
						"META-INF/custom-sql/default.xml");
				}

				if (sourceURL == null) {
					return null;
				}

				_customSQLContainerPool.put(
					classLoader,
					new CustomSQLContainer(classLoader, sourceURL));

				return classLoader;
			}

			@Override
			public void removedBundle(
				Bundle bundle, BundleEvent bundleEvent,
				ClassLoader classLoader) {

				_customSQLContainerPool.remove(classLoader);
			}

		};

		_bundleTracker.open();
	}

	@Override
	public String appendCriteria(String sql, String criteria) {
		if (Validator.isNull(criteria)) {
			return sql;
		}

		if (!criteria.startsWith(StringPool.SPACE)) {
			criteria = StringPool.SPACE.concat(criteria);
		}

		if (!criteria.endsWith(StringPool.SPACE)) {
			criteria = criteria.concat(StringPool.SPACE);
		}

		int pos = sql.indexOf(_GROUP_BY_CLAUSE);

		if (pos != -1) {
			return sql.substring(0, pos + 1).concat(criteria).concat(
				sql.substring(pos + 1));
		}

		pos = sql.indexOf(_ORDER_BY_CLAUSE);

		if (pos != -1) {
			return sql.substring(0, pos + 1).concat(criteria).concat(
				sql.substring(pos + 1));
		}

		return sql.concat(criteria);
	}

	@Deactivate
	public void deactive() {
		_bundleTracker.close();
	}

	@Override
	public String get(Class<?> clazz, String id) {
		CustomSQLContainer customSQLContainer = _customSQLContainerPool.get(
			clazz.getClassLoader());

		if (customSQLContainer != null) {
			return customSQLContainer.get(id);
		}

		return null;
	}

	@Override
	public String get(
		Class<?> clazz, String id, QueryDefinition<?> queryDefinition) {

		return get(clazz, id, queryDefinition, StringPool.BLANK);
	}

	@Override
	public String get(
		Class<?> clazz, String id, QueryDefinition<?> queryDefinition,
		String tableName) {

		String sql = get(clazz, id);

		if (!Validator.isBlank(tableName) &&
			!tableName.endsWith(StringPool.PERIOD)) {

			tableName = tableName.concat(StringPool.PERIOD);
		}

		if (queryDefinition.getStatus() == WorkflowConstants.STATUS_ANY) {
			sql = sql.replace(_STATUS_KEYWORD, _STATUS_CONDITION_EMPTY);
		}
		else {
			if (queryDefinition.isExcludeStatus()) {
				sql = sql.replace(
					_STATUS_KEYWORD,
					tableName.concat(_STATUS_CONDITION_INVERSE));
			}
			else {
				sql = sql.replace(
					_STATUS_KEYWORD,
					tableName.concat(_STATUS_CONDITION_DEFAULT));
			}
		}

		if (queryDefinition.getOwnerUserId() > 0) {
			if (queryDefinition.isIncludeOwner()) {
				StringBundler sb = new StringBundler(7);

				sb.append(StringPool.OPEN_PARENTHESIS);
				sb.append(tableName);
				sb.append(_OWNER_USER_ID_CONDITION_DEFAULT);
				sb.append(" AND ");
				sb.append(tableName);
				sb.append(_STATUS_CONDITION_INVERSE);
				sb.append(StringPool.CLOSE_PARENTHESIS);

				sql = sql.replace(_OWNER_USER_ID_KEYWORD, sb.toString());

				sql = sql.replace(_OWNER_USER_ID_AND_OR_CONNECTOR, " OR ");
			}
			else {
				sql = sql.replace(
					_OWNER_USER_ID_KEYWORD,
					tableName.concat(_OWNER_USER_ID_CONDITION_DEFAULT));

				sql = sql.replace(_OWNER_USER_ID_AND_OR_CONNECTOR, " AND ");
			}
		}
		else {
			sql = sql.replace(_OWNER_USER_ID_KEYWORD, StringPool.BLANK);

			sql = sql.replace(
				_OWNER_USER_ID_AND_OR_CONNECTOR, StringPool.BLANK);
		}

		return sql;
	}

	/**
	 * Returns <code>true</code> if Hibernate is connecting to a DB2 database.
	 *
	 * @return <code>true</code> if Hibernate is connecting to a DB2 database
	 */
	public boolean isVendorDB2() {
		return _vendorDB2;
	}

	/**
	 * Returns <code>true</code> if Hibernate is connecting to a Hypersonic
	 * database.
	 *
	 * @return <code>true</code> if Hibernate is connecting to a Hypersonic
	 *         database
	 */
	public boolean isVendorHSQL() {
		return _vendorHSQL;
	}

	/**
	 * Returns <code>true</code> if Hibernate is connecting to an Informix
	 * database.
	 *
	 * @return <code>true</code> if Hibernate is connecting to an Informix
	 *         database
	 */
	public boolean isVendorInformix() {
		return _vendorInformix;
	}

	/**
	 * Returns <code>true</code> if Hibernate is connecting to a MySQL database.
	 *
	 * @return <code>true</code> if Hibernate is connecting to a MySQL database
	 */
	public boolean isVendorMySQL() {
		return _vendorMySQL;
	}

	/**
	 * Returns <code>true</code> if Hibernate is connecting to an Oracle
	 * database. Oracle has a nasty bug where it treats '' as a
	 * <code>NULL</code> value. See
	 * http://thedailywtf.com/forums/thread/26879.aspx for more information on
	 * this nasty bug.
	 *
	 * @return <code>true</code> if Hibernate is connecting to an Oracle
	 *         database
	 */
	public boolean isVendorOracle() {
		return _vendorOracle;
	}

	/**
	 * Returns <code>true</code> if Hibernate is connecting to a PostgreSQL
	 * database.
	 *
	 * @return <code>true</code> if Hibernate is connecting to a PostgreSQL
	 *         database
	 */
	public boolean isVendorPostgreSQL() {
		return _vendorPostgreSQL;
	}

	/**
	 * Returns <code>true</code> if Hibernate is connecting to a Sybase
	 * database.
	 *
	 * @return <code>true</code> if Hibernate is connecting to a Sybase database
	 */
	public boolean isVendorSybase() {
		return _vendorSybase;
	}

	@Override
	public String[] keywords(String keywords) {
		return keywords(keywords, true, WildcardMode.SURROUND);
	}

	@Override
	public String[] keywords(String keywords, boolean lowerCase) {
		return keywords(keywords, lowerCase, WildcardMode.SURROUND);
	}

	@Override
	public String[] keywords(
		String keywords, boolean lowerCase, WildcardMode wildcardMode) {

		if (Validator.isNull(keywords)) {
			return new String[] {null};
		}

		if (_CUSTOM_SQL_AUTO_ESCAPE_WILDCARDS_ENABLED) {
			keywords = _escapeWildCards(keywords);
		}

		if (lowerCase) {
			keywords = StringUtil.toLowerCase(keywords);
		}

		keywords = keywords.trim();

		List<String> keywordsList = new ArrayList<>();

		for (int i = 0; i < keywords.length(); i++) {
			char c = keywords.charAt(i);

			if (c == CharPool.QUOTE) {
				int pos = i + 1;

				i = keywords.indexOf(CharPool.QUOTE, pos);

				if (i == -1) {
					i = keywords.length();
				}

				if (i > pos) {
					String keyword = keywords.substring(pos, i);

					keywordsList.add(insertWildcard(keyword, wildcardMode));
				}
			}
			else {
				while (Character.isWhitespace(c)) {
					i++;

					c = keywords.charAt(i);
				}

				int pos = i;

				while (!Character.isWhitespace(c)) {
					i++;

					if (i == keywords.length()) {
						break;
					}

					c = keywords.charAt(i);
				}

				String keyword = keywords.substring(pos, i);

				keywordsList.add(insertWildcard(keyword, wildcardMode));
			}
		}

		return keywordsList.toArray(new String[keywordsList.size()]);
	}

	@Override
	public String[] keywords(String keywords, WildcardMode wildcardMode) {
		return keywords(keywords, true, wildcardMode);
	}

	@Override
	public String[] keywords(String[] keywordsArray) {
		return keywords(keywordsArray, true);
	}

	@Override
	public String[] keywords(String[] keywordsArray, boolean lowerCase) {
		if (ArrayUtil.isEmpty(keywordsArray)) {
			return new String[] {null};
		}

		if (lowerCase) {
			for (int i = 0; i < keywordsArray.length; i++) {
				keywordsArray[i] = StringUtil.lowerCase(keywordsArray[i]);
			}
		}

		return keywordsArray;
	}

	@Override
	public String removeGroupBy(String sql) {
		int x = sql.indexOf(_GROUP_BY_CLAUSE);

		if (x != -1) {
			int y = sql.indexOf(_ORDER_BY_CLAUSE);

			if (y == -1) {
				sql = sql.substring(0, x);
			}
			else {
				sql = sql.substring(0, x) + sql.substring(y);
			}
		}

		return sql;
	}

	@Override
	public String removeOrderBy(String sql) {
		int pos = sql.indexOf(_ORDER_BY_CLAUSE);

		if (pos != -1) {
			sql = sql.substring(0, pos);
		}

		return sql;
	}

	@Override
	public String replaceAndOperator(String sql, boolean andOperator) {
		String andOrConnector = "OR";
		String andOrNullCheck = "AND ? IS NOT NULL";

		if (andOperator) {
			andOrConnector = "AND";
			andOrNullCheck = "OR ? IS NULL";
		}

		sql = StringUtil.replace(
			sql, new String[] {"[$AND_OR_CONNECTOR$]", "[$AND_OR_NULL_CHECK$]"},
			new String[] {andOrConnector, andOrNullCheck});

		if (_vendorPostgreSQL) {
			sql = StringUtil.replace(
				sql,
				new String[] {
					"Date >= ? AND ? IS NOT NULL",
					"Date <= ? AND ? IS NOT NULL", "Date >= ? OR ? IS NULL",
					"Date <= ? OR ? IS NULL"
				},
				new String[] {
					"Date >= ? AND CAST(? AS TIMESTAMP) IS NOT NULL",
					"Date <= ? AND CAST(? AS TIMESTAMP) IS NOT NULL",
					"Date >= ? OR CAST(? AS TIMESTAMP) IS NULL",
					"Date <= ? OR CAST(? AS TIMESTAMP) IS NULL"
				});
		}

		sql = replaceIsNull(sql);

		return sql;
	}

	@Override
	public String replaceGroupBy(String sql, String groupBy) {
		if (groupBy == null) {
			return sql;
		}

		int x = sql.indexOf(_GROUP_BY_CLAUSE);

		if (x != -1) {
			int y = sql.indexOf(_ORDER_BY_CLAUSE);

			if (y == -1) {
				sql = sql.substring(0, x + _GROUP_BY_CLAUSE.length()).concat(
					groupBy);
			}
			else {
				sql = sql.substring(0, x + _GROUP_BY_CLAUSE.length()).concat(
					groupBy).concat(sql.substring(y));
			}
		}
		else {
			int y = sql.indexOf(_ORDER_BY_CLAUSE);

			if (y == -1) {
				sql = sql.concat(_GROUP_BY_CLAUSE).concat(groupBy);
			}
			else {
				StringBundler sb = new StringBundler(4);

				sb.append(sql.substring(0, y));
				sb.append(_GROUP_BY_CLAUSE);
				sb.append(groupBy);
				sb.append(sql.substring(y));

				sql = sb.toString();
			}
		}

		return sql;
	}

	@Override
	public String replaceIsNull(String sql) {
		if (Validator.isNotNull(_functionIsNull)) {
			sql = StringUtil.replace(
				sql, new String[] {"? IS NULL", "? IS NOT NULL"},
				new String[] {_functionIsNull, _functionIsNotNull});
		}

		return sql;
	}

	@Override
	public String replaceKeywords(
		String sql, String field, boolean last, int[] values) {

		if ((values != null) && (values.length == 1)) {
			return sql;
		}

		StringBundler oldSqlSB = new StringBundler(4);

		oldSqlSB.append(StringPool.OPEN_PARENTHESIS);
		oldSqlSB.append(field);
		oldSqlSB.append(" = ?)");

		if (!last) {
			oldSqlSB.append(" [$AND_OR_CONNECTOR$]");
		}

		if (ArrayUtil.isEmpty(values)) {
			return StringUtil.replace(
				sql, oldSqlSB.toString(), StringPool.BLANK);
		}

		StringBundler newSqlSB = new StringBundler(values.length * 4 + 3);

		newSqlSB.append(StringPool.OPEN_PARENTHESIS);

		for (int i = 0; i < values.length; i++) {
			if (i > 0) {
				newSqlSB.append(" OR ");
			}

			newSqlSB.append(StringPool.OPEN_PARENTHESIS);
			newSqlSB.append(field);
			newSqlSB.append(" = ?)");
		}

		newSqlSB.append(StringPool.CLOSE_PARENTHESIS);

		if (!last) {
			newSqlSB.append(" [$AND_OR_CONNECTOR$]");
		}

		return StringUtil.replace(
			sql, oldSqlSB.toString(), newSqlSB.toString());
	}

	@Override
	public String replaceKeywords(
		String sql, String field, boolean last, long[] values) {

		if ((values != null) && (values.length == 1)) {
			return sql;
		}

		StringBundler oldSqlSB = new StringBundler(4);

		oldSqlSB.append(StringPool.OPEN_PARENTHESIS);
		oldSqlSB.append(field);
		oldSqlSB.append(" = ?)");

		if (!last) {
			oldSqlSB.append(" [$AND_OR_CONNECTOR$]");
		}

		if (ArrayUtil.isEmpty(values)) {
			return StringUtil.replace(
				sql, oldSqlSB.toString(), StringPool.BLANK);
		}

		StringBundler newSqlSB = new StringBundler(values.length * 4 + 3);

		newSqlSB.append(StringPool.OPEN_PARENTHESIS);

		for (int i = 0; i < values.length; i++) {
			if (i > 0) {
				newSqlSB.append(" OR ");
			}

			newSqlSB.append(StringPool.OPEN_PARENTHESIS);
			newSqlSB.append(field);
			newSqlSB.append(" = ?)");
		}

		newSqlSB.append(StringPool.CLOSE_PARENTHESIS);

		if (!last) {
			newSqlSB.append(" [$AND_OR_CONNECTOR$]");
		}

		return StringUtil.replace(
			sql, oldSqlSB.toString(), newSqlSB.toString());
	}

	@Override
	public String replaceKeywords(
		String sql, String field, String operator, boolean last,
		String[] values) {

		if ((values != null) && (values.length <= 1)) {
			return sql;
		}

		StringBundler oldSqlSB = new StringBundler(6);

		oldSqlSB.append(StringPool.OPEN_PARENTHESIS);
		oldSqlSB.append(field);
		oldSqlSB.append(" ");
		oldSqlSB.append(operator);
		oldSqlSB.append(" ? [$AND_OR_NULL_CHECK$])");

		if (!last) {
			oldSqlSB.append(" [$AND_OR_CONNECTOR$]");
		}

		StringBundler newSqlSB = new StringBundler(values.length * 6 + 2);

		newSqlSB.append(StringPool.OPEN_PARENTHESIS);

		for (int i = 0; i < values.length; i++) {
			if (i > 0) {
				newSqlSB.append(" OR ");
			}

			newSqlSB.append(StringPool.OPEN_PARENTHESIS);
			newSqlSB.append(field);
			newSqlSB.append(" ");
			newSqlSB.append(operator);
			newSqlSB.append(" ? [$AND_OR_NULL_CHECK$])");
		}

		newSqlSB.append(StringPool.CLOSE_PARENTHESIS);

		if (!last) {
			newSqlSB.append(" [$AND_OR_CONNECTOR$]");
		}

		return StringUtil.replace(
			sql, oldSqlSB.toString(), newSqlSB.toString());
	}

	@Override
	public String replaceOrderBy(String sql, OrderByComparator<?> obc) {
		if (obc == null) {
			return sql;
		}

		String orderBy = obc.getOrderBy();

		int pos = sql.indexOf(_ORDER_BY_CLAUSE);

		if ((pos != -1) && (pos < sql.length())) {
			sql = sql.substring(0, pos + _ORDER_BY_CLAUSE.length()).concat(
				orderBy);
		}
		else {
			sql = sql.concat(_ORDER_BY_CLAUSE).concat(orderBy);
		}

		return sql;
	}

	protected String insertWildcard(String keyword, WildcardMode wildcardMode) {
		if (wildcardMode == WildcardMode.LEADING) {
			return StringPool.PERCENT.concat(keyword);
		}
		else if (wildcardMode == WildcardMode.SURROUND) {
			return StringUtil.quote(keyword, StringPool.PERCENT);
		}
		else if (wildcardMode == WildcardMode.TRAILING) {
			return keyword.concat(StringPool.PERCENT);
		}
		else {
			throw new IllegalArgumentException(
				"Invalid wildcard mode " + wildcardMode);
		}
	}

	protected String transform(String sql) {
		sql = _portal.transformCustomSQL(sql);

		StringBundler sb = new StringBundler();

		try (UnsyncBufferedReader unsyncBufferedReader =
				new UnsyncBufferedReader(new UnsyncStringReader(sql))) {

			String line = null;

			while ((line = unsyncBufferedReader.readLine()) != null) {
				line = line.trim();

				if (line.startsWith(StringPool.CLOSE_PARENTHESIS)) {
					sb.setIndex(sb.index() - 1);
				}

				sb.append(line);

				if (!line.endsWith(StringPool.OPEN_PARENTHESIS)) {
					sb.append(StringPool.SPACE);
				}
			}
		}
		catch (IOException ioe) {
			return sql;
		}

		return sb.toString();
	}

	private String _escapeWildCards(String keywords) {
		if (!isVendorMySQL() && !isVendorOracle()) {
			return keywords;
		}

		StringBuilder sb = new StringBuilder(keywords);

		for (int i = 0; i < sb.length(); ++i) {
			char c = sb.charAt(i);

			if (c == CharPool.BACK_SLASH) {
				i++;

				continue;
			}

			if ((c == CharPool.UNDERLINE) || (c == CharPool.PERCENT)) {
				sb.insert(i, CharPool.BACK_SLASH);

				i++;

				continue;
			}
		}

		return sb.toString();
	}

	private void _read(
			ClassLoader classLoader, URL sourceURL, Map<String, String> sqls)
		throws Exception {

		try (InputStream is = sourceURL.openStream()) {
			if (_log.isDebugEnabled()) {
				_log.debug("Loading " + sourceURL);
			}

			Document document = UnsecureSAXReaderUtil.read(is);

			Element rootElement = document.getRootElement();

			for (Element sqlElement : rootElement.elements("sql")) {
				String file = sqlElement.attributeValue("file");

				if (Validator.isNotNull(file)) {
					URL fileURL = classLoader.getResource(file);

					_read(classLoader, fileURL, sqls);
				}
				else {
					String id = sqlElement.attributeValue("id");
					String content = transform(sqlElement.getText());

					content = replaceIsNull(content);

					sqls.put(id, content);
				}
			}
		}
	}

	private static final boolean _CUSTOM_SQL_AUTO_ESCAPE_WILDCARDS_ENABLED =
		GetterUtil.getBoolean(
			PropsUtil.get(PropsKeys.CUSTOM_SQL_AUTO_ESCAPE_WILDCARDS_ENABLED));

	private static final String _GROUP_BY_CLAUSE = " GROUP BY ";

	private static final String _ORDER_BY_CLAUSE = " ORDER BY ";

	private static final String _OWNER_USER_ID_AND_OR_CONNECTOR =
		"[$OWNER_USER_ID_AND_OR_CONNECTOR$]";

	private static final String _OWNER_USER_ID_CONDITION_DEFAULT = "userId = ?";

	private static final String _OWNER_USER_ID_KEYWORD = "[$OWNER_USER_ID$]";

	private static final String _STATUS_CONDITION_DEFAULT = "status = ?";

	private static final String _STATUS_CONDITION_EMPTY =
		WorkflowConstants.STATUS_ANY + " = ?";

	private static final String _STATUS_CONDITION_INVERSE = "status != ?";

	private static final String _STATUS_KEYWORD = "[$STATUS$]";

	private static final Log _log = LogFactoryUtil.getLog(CustomSQLImpl.class);

	private BundleTracker<ClassLoader> _bundleTracker;
	private final Map<ClassLoader, CustomSQLContainer> _customSQLContainerPool =
		new ConcurrentHashMap<>();
	private String _functionIsNotNull;
	private String _functionIsNull;

	@Reference(target = ModuleServiceLifecycle.DATABASE_INITIALIZED)
	private ModuleServiceLifecycle _moduleServiceLifecycle;

	@Reference
	private Portal _portal;

	private boolean _vendorDB2;
	private boolean _vendorHSQL;
	private boolean _vendorInformix;
	private boolean _vendorMySQL;
	private boolean _vendorOracle;
	private boolean _vendorPostgreSQL;
	private boolean _vendorSybase;

	private class CustomSQLContainer {

		public String get(String id) {
			ObjectValuePair<Map<String, String>, Exception> objectValuePair =
				_objectValuePair;

			if (objectValuePair == null) {
				Map<String, String> sqlPool = new HashMap<>();
				Exception exception = null;

				try {
					_read(_classLoader, _sourceURL, sqlPool);
				}
				catch (Exception e) {
					exception = e;

					_log.error(e, e);
				}

				objectValuePair = new ObjectValuePair<>(sqlPool, exception);

				_objectValuePair = objectValuePair;
			}

			Exception exception = objectValuePair.getValue();

			if (exception != null) {
				_log.error(exception, exception);
			}

			Map<String, String> sqlPool = objectValuePair.getKey();

			return sqlPool.get(id);
		}

		private CustomSQLContainer(ClassLoader classLoader, URL sourceURL) {
			_classLoader = classLoader;
			_sourceURL = sourceURL;
		}

		private final ClassLoader _classLoader;
		private volatile ObjectValuePair<Map<String, String>, Exception>
			_objectValuePair;
		private final URL _sourceURL;

	}

}