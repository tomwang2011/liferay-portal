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

package com.liferay.source.formatter.checks;

import com.liferay.petra.string.CharPool;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.source.formatter.checks.util.BNDSourceUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Hugo Huijser
 */
public class BNDExportsCheck extends BaseFileCheck {

	@Override
	public boolean isModulesCheck() {
		return true;
	}

	public void setAllowedExportPackageDirName(
		String allowedExportPackageDirName) {

		_allowedExportPackageDirNames.add(allowedExportPackageDirName);
	}

	@Override
	protected String doProcess(
		String fileName, String absolutePath, String content) {

		if (!fileName.endsWith("/bnd.bnd") ||
			absolutePath.contains("/third-party/")) {

			return content;
		}

		if (!absolutePath.contains("/testIntegration/")) {
			_checkExports(
				fileName, content, _exportContentsPattern, "-exportcontents");
			_checkExports(fileName, content, _exportsPattern, "Export-Package");
		}

		if (absolutePath.contains("/modules/apps/")) {
			_checkExportPackage(fileName, absolutePath, content);
		}

		return content;
	}

	private void _checkExportPackage(
		String fileName, String absolutePath, String content) {

		for (String allowedExportPackageDirName :
				_allowedExportPackageDirNames) {

			if (absolutePath.contains(allowedExportPackageDirName)) {
				return;
			}
		}

		if (fileName.endsWith("/test-bnd.bnd") ||
			absolutePath.contains("-api/") ||
			absolutePath.contains("-taglib/") ||
			absolutePath.contains("-test-util/") ||
			!content.contains("Export-Package")) {

			return;
		}

		int x = absolutePath.lastIndexOf(StringPool.SLASH);

		int y = absolutePath.lastIndexOf(StringPool.SLASH, x - 1);

		addMessage(
			fileName,
			"Exporting packages not allowed in module '" +
				absolutePath.substring(y + 1, x) + "'",
			"bnd_exports.markdown");
	}

	private void _checkExports(
		String fileName, String content, Pattern pattern,
		String definitionKey) {

		String bundleSymbolicName = BNDSourceUtil.getDefinitionValue(
			content, "Bundle-SymbolicName");

		if ((bundleSymbolicName == null) ||
			bundleSymbolicName.endsWith(".compat")) {

			return;
		}

		Matcher matcher = _apiOrServiceBundleSymbolicNamePattern.matcher(
			bundleSymbolicName);

		bundleSymbolicName = matcher.replaceAll(StringPool.BLANK);

		matcher = pattern.matcher(content);

		if (!matcher.find()) {
			return;
		}

		String[] lines = StringUtil.splitLines(matcher.group(2));

		for (int i = 0; i < lines.length; i++) {
			String line = StringUtil.removeChar(
				StringUtil.trim(lines[i]), CharPool.BACK_SLASH);

			if (Validator.isNull(line) || !line.startsWith("com.liferay.") ||
				line.startsWith(bundleSymbolicName)) {

				continue;
			}

			StringBundler sb = new StringBundler(6);

			sb.append(definitionKey);
			sb.append(" '");
			sb.append(line);
			sb.append("' should match Bundle-SymbolicName '");
			sb.append(bundleSymbolicName);
			sb.append("'");

			addMessage(
				fileName, sb.toString(),
				getLineCount(content, matcher.start(2)) + i);
		}
	}

	private final List<String> _allowedExportPackageDirNames =
		new ArrayList<>();
	private final Pattern _apiOrServiceBundleSymbolicNamePattern =
		Pattern.compile("\\.(api|service)$");
	private final Pattern _exportContentsPattern = Pattern.compile(
		"\n-exportcontents:(\\\\\n| )((.*?)(\n[^\t]|\\Z))",
		Pattern.DOTALL | Pattern.MULTILINE);
	private final Pattern _exportsPattern = Pattern.compile(
		"\nExport-Package:(\\\\\n| )((.*?)(\n[^\t]|\\Z))",
		Pattern.DOTALL | Pattern.MULTILINE);

}