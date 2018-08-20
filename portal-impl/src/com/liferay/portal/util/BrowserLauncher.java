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

package com.liferay.portal.util;

import com.liferay.petra.process.ConsumerOutputProcessor;
import com.liferay.petra.process.ProcessUtil;
import com.liferay.petra.string.CharPool;
import com.liferay.portal.kernel.util.OSDetector;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

import java.math.BigDecimal;

import java.net.HttpURLConnection;
import java.net.URL;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class BrowserLauncher implements Runnable {

	@Override
	public void run() {
		try {
			URL url = new URL(PropsValues.BROWSER_LAUNCHER_URL);

			HttpURLConnection urlc = (HttpURLConnection)url.openConnection();

			urlc.setConnectTimeout(0);
			urlc.setReadTimeout(0);
			urlc.setRequestMethod("HEAD");

			int responseCode = urlc.getResponseCode();

			if (responseCode == HttpURLConnection.HTTP_OK) {
				_analyzeGCLog();

				try {
					launchBrowser();
				}
				catch (Exception e2) {
				}
			}
		}
		catch (Exception e1) {
		}
	}

	protected void launchBrowser() throws Exception {
		if (OSDetector.isApple()) {
			launchBrowserApple(null);
		}
		else if (OSDetector.isWindows()) {
			launchBrowserWindows(null);
		}
		else {
			launchBrowserUnix(null);
		}
	}

	protected void launchBrowserApple(Runtime runtime) throws Exception {
		ProcessUtil.execute(
			ConsumerOutputProcessor.INSTANCE, "open",
			PropsValues.BROWSER_LAUNCHER_URL);
	}

	protected void launchBrowserUnix(Runtime runtime) throws Exception {
		StringBundler sb = new StringBundler(_BROWSERS.length * 5 - 1);

		for (int i = 0; i < _BROWSERS.length; i++) {
			if (i != 0) {
				sb.append(" || ");
			}

			sb.append(_BROWSERS[i]);
			sb.append(" \"");
			sb.append(PropsValues.BROWSER_LAUNCHER_URL);
			sb.append("\" ");
		}

		ProcessUtil.execute(
			ConsumerOutputProcessor.INSTANCE, "sh", "-c", sb.toString());
	}

	protected void launchBrowserWindows(Runtime runtime) throws Exception {
		ProcessUtil.execute(
			ConsumerOutputProcessor.INSTANCE, "cmd.exe", "/c", "start",
			PropsValues.BROWSER_LAUNCHER_URL);
	}

	private void _analyzeGCLog() throws Exception {
		System.gc();

		RuntimeMXBean runtimeMxBean = ManagementFactory.getRuntimeMXBean();

		List<String> arguments = runtimeMxBean.getInputArguments();

		String gcLogFilePath = null;

		for (String argument : arguments) {
			if (argument.startsWith("-Xloggc:")) {
				gcLogFilePath = argument.substring(8);
			}
		}

		if (gcLogFilePath == null) {
			System.out.println("##########Unable to find -Xloggc: arg");

			return;
		}

		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);

			String gcLog = new String(
				Files.readAllBytes(Paths.get(gcLogFilePath)));

			if (!gcLog.contains("Full GC (System.gc())")) {
				continue;
			}

			long totalSize = 0;
			BigDecimal totalTime = new BigDecimal(0);

			for (String line : StringUtil.splitLines(gcLog)) {
				if (!line.contains("GC (")) {
					continue;
				}

				int index = line.indexOf("K->");

				int startIndex = line.lastIndexOf(CharPool.SPACE, index);

				long startSize = Long.parseLong(
					line.substring(startIndex + 1, index));

				index += 3;

				int endIndex = line.indexOf(CharPool.UPPER_CASE_K, index);

				long endSize = Long.parseLong(line.substring(index, endIndex));

				totalSize += (startSize - endSize);

				if (!line.contains("GC (System.gc())")) {
					index = line.lastIndexOf(" secs]");

					startIndex = line.lastIndexOf(CharPool.SPACE, index - 1);

					totalTime = totalTime.add(
						new BigDecimal(line.substring(startIndex + 1, index)));
				}

				if (line.contains("[Full GC (")) {
					if (line.contains("[Full GC (System.gc())")) {
						break;
					}
					else {
						System.out.println(
							"#####Bad heap setting, " + "found Full GC : " +
								line);
					}
				}
			}

			System.out.println(
				"#####Total GCed size : " + totalSize + "K" +
					", total GC time : " + totalTime + "s");

			return;
		}

		System.out.println("########Timeout on waiting System.gc()");
	}

	/**
	 * Order matters. See LPS-48525.
	 */
	private static final String[] _BROWSERS =
		{"xdg-open", "firefox", "mozilla", "konqueror", "opera"};

}