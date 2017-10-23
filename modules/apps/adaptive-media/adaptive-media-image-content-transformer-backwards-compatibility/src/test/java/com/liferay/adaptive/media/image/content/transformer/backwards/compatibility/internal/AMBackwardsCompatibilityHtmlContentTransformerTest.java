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

package com.liferay.adaptive.media.image.content.transformer.backwards.compatibility.internal;

import com.liferay.adaptive.media.content.transformer.constants.ContentTransformerContentTypes;
import com.liferay.adaptive.media.image.html.AMImageHTMLTagFactory;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.StringUtil;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.mockito.Mockito;

/**
 * @author Adolfo Pérez
 */
public class AMBackwardsCompatibilityHtmlContentTransformerTest {

	@Before
	public void setUp() throws Exception {
		Mockito.when(
			_amImageHTMLTagFactory.create(
				Mockito.anyString(), Mockito.any(FileEntry.class))
		).thenReturn(
			"[REPLACED]"
		);

		_contentTransformer.setAMImageHTMLTagFactory(_amImageHTMLTagFactory);

		Mockito.when(
			_dlAppLocalService.getFileEntryByUuidAndGroupId(
				Mockito.anyString(), Mockito.anyLong())
		).thenReturn(
			_fileEntry
		);

		_contentTransformer.setDLAppLocalService(_dlAppLocalService);
	}

	@Test
	public void testContentTransformerContentTypeIsHTML() throws Exception {
		Assert.assertEquals(
			ContentTransformerContentTypes.HTML,
			_contentTransformer.getContentTransformerContentType());
	}

	@Test
	public void testReplacesImageTagsWithDoubleQuotes() throws Exception {
		Assert.assertEquals(
			_CONTENT_PREFIX + "[REPLACED]" + _CONTENT_SUFFIX,
			_contentTransformer.transform(
				_CONTENT_WITH_IMAGE_AND_DOUBLE_QUOTES));
	}

	@Test
	public void testReplacesImageTagsWithLegacyContent() throws Exception {
		Assert.assertEquals(
			_CONTENT_PREFIX + "[REPLACED]" + _CONTENT_SUFFIX,
			_contentTransformer.transform(
				_LEGACY_CONTENT_WITH_IMAGE_AND_SINGLE_QUOTES));
	}

	@Test
	public void testReplacesImageTagsWithSingleQuotes() throws Exception {
		Assert.assertEquals(
			_CONTENT_PREFIX + "[REPLACED]" + _CONTENT_SUFFIX,
			_contentTransformer.transform(
				_CONTENT_WITH_IMAGE_AND_SINGLE_QUOTES));
	}

	@Test
	public void testReturnsBlankForBlankContent() throws Exception {
		Assert.assertEquals(
			StringPool.BLANK, _contentTransformer.transform(StringPool.BLANK));
	}

	@Test
	public void testReturnsNullForNullContent() throws Exception {
		Assert.assertNull(_contentTransformer.transform(null));
	}

	@Test
	public void testReturnsTheSameHTMLIfNoImagesArePresent() throws Exception {
		String content = StringUtil.randomString();

		Assert.assertEquals(content, _contentTransformer.transform(content));
	}

	@Test
	public void testSupportsImageTagsWithNewLineCharacters() throws Exception {
		Assert.assertEquals(
			_CONTENT_PREFIX + "[REPLACED]" + _CONTENT_SUFFIX,
			_contentTransformer.transform(_CONTENT_WITH_IMAGE_AND_NEWLINES));
	}

	private static final String _CONTENT_PREFIX = "<p>Prefix";

	private static final String _CONTENT_SUFFIX = "Suffix</p>";

	private static final String _CONTENT_WITH_IMAGE_AND_DOUBLE_QUOTES =
		_CONTENT_PREFIX + "<img src=\"/documents/20138/0/sample.jpg" +
			"/1710bfe2-2b7c-1f69-f8b7-23ff6bd5dd4b?t=1506075653544\" />" +
				_CONTENT_SUFFIX;

	private static final String _CONTENT_WITH_IMAGE_AND_NEWLINES =
		_CONTENT_PREFIX + "<img\nsrc=\"/documents/20138/0/sample.jpg" +
			"/1710bfe2-2b7c-1f69-f8b7-23ff6bd5dd4b?t=1506075653544\"\n />" +
				_CONTENT_SUFFIX;

	private static final String _CONTENT_WITH_IMAGE_AND_SINGLE_QUOTES =
		_CONTENT_PREFIX + "<img src='/documents/20138/0/sample.jpg" +
			"/1710bfe2-2b7c-1f69-f8b7-23ff6bd5dd4b?t=1506075653544' />" +
				_CONTENT_SUFFIX;

	private static final String _LEGACY_CONTENT_WITH_IMAGE_AND_SINGLE_QUOTES =
		_CONTENT_PREFIX + "<img src='/documents/20138/0/sample.jpg?t=" +
			"1506075653544' />" + _CONTENT_SUFFIX;

	private final AMImageHTMLTagFactory _amImageHTMLTagFactory = Mockito.mock(
		AMImageHTMLTagFactory.class);
	private final AMBackwardsCompatibilityHtmlContentTransformer
		_contentTransformer =
			new AMBackwardsCompatibilityHtmlContentTransformer();
	private final DLAppLocalService _dlAppLocalService = Mockito.mock(
		DLAppLocalService.class);
	private final FileEntry _fileEntry = Mockito.mock(FileEntry.class);

}