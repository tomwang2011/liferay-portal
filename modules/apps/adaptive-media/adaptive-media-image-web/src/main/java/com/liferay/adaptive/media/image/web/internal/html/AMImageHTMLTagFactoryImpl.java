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

package com.liferay.adaptive.media.image.web.internal.html;

import com.liferay.adaptive.media.image.html.AMImageHTMLTagFactory;
import com.liferay.adaptive.media.image.media.query.Condition;
import com.liferay.adaptive.media.image.media.query.MediaQuery;
import com.liferay.adaptive.media.image.media.query.MediaQueryProvider;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.StringBundler;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Alejandro Tardín
 */
@Component(service = AMImageHTMLTagFactory.class)
public class AMImageHTMLTagFactoryImpl implements AMImageHTMLTagFactory {

	@Override
	public String create(String originalImgTag, FileEntry fileEntry)
		throws PortalException {

		List<String> sourceElements = _getSourceElements(fileEntry);

		if (sourceElements.isEmpty()) {
			return originalImgTag;
		}

		StringBundler sb = new StringBundler(3 + sourceElements.size());

		sb.append("<picture data-fileEntryId=\"");
		sb.append(fileEntry.getFileEntryId());
		sb.append("\">");

		sourceElements.forEach(sb::append);

		Matcher matcher = _pattern.matcher(originalImgTag);

		sb.append(matcher.replaceAll(""));

		sb.append("</picture>");

		return sb.toString();
	}

	@Reference(unbind = "-")
	protected void setMediaQueryProvider(
		MediaQueryProvider mediaQueryProvider) {

		_mediaQueryProvider = mediaQueryProvider;
	}

	private Optional<String> _getMediaQueryString(MediaQuery mediaQuery) {
		List<Condition> conditions = mediaQuery.getConditions();

		if (conditions.isEmpty()) {
			return Optional.empty();
		}

		String[] conditionStrings = new String[conditions.size()];

		for (int i = 0; i < conditionStrings.length; i++) {
			Condition condition = conditions.get(i);

			StringBundler sb = new StringBundler(5);

			sb.append(StringPool.OPEN_PARENTHESIS);
			sb.append(condition.getAttribute());
			sb.append(StringPool.COLON);
			sb.append(condition.getValue());
			sb.append(StringPool.CLOSE_PARENTHESIS);

			conditionStrings[i] = sb.toString();
		}

		return Optional.of(String.join(" and ", conditionStrings));
	}

	private String _getSourceElement(MediaQuery mediaQuery) {
		StringBundler sb = new StringBundler(8);

		Optional<String> mediaQueryStringOptional = _getMediaQueryString(
			mediaQuery);

		mediaQueryStringOptional.ifPresent(
			mediaQueryString -> {
				sb.append("<source ");
				sb.append("media=\"");
				sb.append(mediaQueryString);
				sb.append("\" ");
				sb.append("srcset=\"");
				sb.append(mediaQuery.getSrc());
				sb.append("\"");
				sb.append("/>");

			});

		return sb.toString();
	}

	private List<String> _getSourceElements(FileEntry fileEntry)
		throws PortalException {

		List<MediaQuery> mediaQueries = _mediaQueryProvider.getMediaQueries(
			fileEntry);

		Stream<MediaQuery> mediaQueryStream = mediaQueries.stream();

		return mediaQueryStream.map(
			this::_getSourceElement
		).collect(
			Collectors.toList()
		);
	}

	private static final Pattern _pattern = Pattern.compile(
		"\\s*data-fileEntryId=\"(\\d+)\"", Pattern.CASE_INSENSITIVE);

	private MediaQueryProvider _mediaQueryProvider;

}