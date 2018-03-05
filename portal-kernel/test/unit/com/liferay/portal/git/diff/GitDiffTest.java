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

package com.liferay.portal.git.diff;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Tom Wang
 */
public class GitDiffTest {
	@Test
	public void testGitDiff() throws Exception {
		final Path portalPath = Paths.get(System.getProperty("user.dir"));

		ProcessBuilder processBuilder = new ProcessBuilder("git", "diff");

		processBuilder.directory(portalPath.toFile());

		Process process = processBuilder.start();

		process.waitFor();

		BufferedReader bufferedReader = new BufferedReader(
			new InputStreamReader(process.getInputStream()));

		String line = bufferedReader.readLine();

		while(line != null) {
			Assert.fail("Uncommited modifications during build detected");
		}
	}
}
