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

package com.liferay.portal.lpkg;

import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncStringReader;
import com.liferay.portal.kernel.util.StreamUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import org.junit.Assert;

import org.osgi.framework.Version;

/**
 * @author Matthew Tambara
 */
public class LPKGVersionChangeTestCase {

	protected void testStaticVersionChange(
			int majorDelta, int minorDelta, int microDelta, Path lpkgPath)
		throws IOException {

		Path tempPath = Files.createTempDirectory(null);

		try (ZipFile zipFile = new ZipFile(lpkgPath.toFile())) {
			Enumeration<? extends ZipEntry> zipEntries = zipFile.entries();

			while (zipEntries.hasMoreElements()) {
				ZipEntry zipEntry = zipEntries.nextElement();

				Files.copy(
					zipFile.getInputStream(zipEntry),
					tempPath.resolve(zipEntry.getName()),
					StandardCopyOption.REPLACE_EXISTING);
			}
		}

		try (ZipOutputStream zipOutputStream = new ZipOutputStream(
				new FileOutputStream(lpkgPath.toFile()))) {

			DirectoryStream<Path> directoryStream = Files.newDirectoryStream(
				tempPath);

			for (Path jarPath : directoryStream) {
				File jarFile = jarPath.toFile();

				String jarName = String.valueOf(jarPath.getFileName());

				if (jarName.startsWith("com.liferay")) {
					try (FileSystem fileSystem = FileSystems.newFileSystem(
							jarPath, null)) {

						Path manifestPath = fileSystem.getPath(
							"META-INF/MANIFEST.MF");

						try (InputStream inputStream = Files.newInputStream(
								manifestPath);
							UnsyncByteArrayOutputStream outputStream =
								new UnsyncByteArrayOutputStream()) {

							Manifest manifest = new Manifest(inputStream);

							Attributes attributes =
								manifest.getMainAttributes();

							String versionString = (String)attributes.getValue(
								"Bundle-Version");

							String previousVersion = versionString;

							Version version = new Version(versionString);

							version = new Version(
								version.getMajor() + majorDelta,
								version.getMinor() + minorDelta,
								version.getMicro() + microDelta);

							versionString = version.toString();

							jarPath = jarPath.resolveSibling(
								StringUtil.replace(
									jarName, previousVersion, versionString));

							attributes.putValue(
								"Bundle-Version", versionString);

							manifest.write(outputStream);

							Files.write(
								manifestPath, outputStream.toByteArray(),
								StandardOpenOption.TRUNCATE_EXISTING,
								StandardOpenOption.WRITE);
						}
					}
				}

				zipOutputStream.putNextEntry(
					new ZipEntry(String.valueOf(tempPath.relativize(jarPath))));

				try (OutputStream outputStream = StreamUtil.uncloseable(
						zipOutputStream)) {

					StreamUtil.transfer(
						new FileInputStream(jarFile), outputStream);
				}

				zipOutputStream.closeEntry();
			}
		}
	}

	protected void testVersionChange(
			int majorDelta, int minorDelta, int microDelta)
		throws IOException {

		String liferayHome = System.getProperty("liferay.home");

		Assert.assertNotNull(
			"Missing system property \"liferay.home\"", liferayHome);

		try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(
				Paths.get(liferayHome, "/osgi/marketplace"))) {

			for (Path lpkgPath : directoryStream) {
				String lpkgPathString = lpkgPath.toString();

				if (lpkgPathString.contains("override")) {
					continue;
				}

				try (FileSystem fileSystem = FileSystems.newFileSystem(
						lpkgPath, null)) {

					Path path = fileSystem.getPath(
						"liferay-marketplace.properties");

					String propertiesString = new String(
						Files.readAllBytes(path), StandardCharsets.UTF_8);

					Properties properties = new Properties();

					properties.load(new UnsyncStringReader(propertiesString));

					String versionString = properties.getProperty("version");

					Version version = new Version(versionString);

					version = new Version(
						version.getMajor() + majorDelta,
						version.getMinor() + minorDelta,
						version.getMicro() + microDelta);

					propertiesString = StringUtil.replace(
						propertiesString, "version=".concat(versionString),
						"version=".concat(version.toString()));

					Files.write(
						path, Arrays.asList(propertiesString),
						StandardCharsets.UTF_8,
						StandardOpenOption.TRUNCATE_EXISTING,
						StandardOpenOption.WRITE);
				}

				if (lpkgPathString.contains("Static.lpkg")) {
					testStaticVersionChange(
						majorDelta, minorDelta, microDelta, lpkgPath);
				}
			}
		}
	}

}