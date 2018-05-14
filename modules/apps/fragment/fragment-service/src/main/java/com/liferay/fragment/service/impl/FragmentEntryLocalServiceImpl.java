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

package com.liferay.fragment.service.impl;

import com.liferay.fragment.exception.DuplicateFragmentEntryKeyException;
import com.liferay.fragment.exception.FragmentEntryContentException;
import com.liferay.fragment.exception.FragmentEntryNameException;
import com.liferay.fragment.exception.RequiredFragmentEntryException;
import com.liferay.fragment.model.FragmentEntry;
import com.liferay.fragment.processor.FragmentEntryProcessorRegistry;
import com.liferay.fragment.service.base.FragmentEntryLocalServiceBaseImpl;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.ModelHintsUtil;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.TempFileEntryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 * @author Jürgen Kappler
 */
public class FragmentEntryLocalServiceImpl
	extends FragmentEntryLocalServiceBaseImpl {

	@Override
	public FragmentEntry addFragmentEntry(
			long userId, long groupId, long fragmentCollectionId, String name,
			int status, ServiceContext serviceContext)
		throws PortalException {

		return addFragmentEntry(
			userId, groupId, fragmentCollectionId, StringPool.BLANK, name,
			status, serviceContext);
	}

	@Override
	public FragmentEntry addFragmentEntry(
			long userId, long groupId, long fragmentCollectionId,
			String fragmentEntryKey, String name, int status,
			ServiceContext serviceContext)
		throws PortalException {

		// Fragment entry

		User user = userLocalService.getUser(userId);

		if (Validator.isNull(fragmentEntryKey)) {
			fragmentEntryKey = String.valueOf(counterLocalService.increment());
		}
		else {
			fragmentEntryKey = _getFragmentEntryKey(fragmentEntryKey);
		}

		validate(name);
		validateFragmentEntryKey(groupId, fragmentEntryKey);

		long fragmentEntryId = counterLocalService.increment();

		FragmentEntry fragmentEntry = fragmentEntryPersistence.create(
			fragmentEntryId);

		fragmentEntry.setGroupId(groupId);
		fragmentEntry.setCompanyId(user.getCompanyId());
		fragmentEntry.setUserId(user.getUserId());
		fragmentEntry.setUserName(user.getFullName());
		fragmentEntry.setCreateDate(serviceContext.getCreateDate(new Date()));
		fragmentEntry.setModifiedDate(
			serviceContext.getModifiedDate(new Date()));
		fragmentEntry.setFragmentCollectionId(fragmentCollectionId);
		fragmentEntry.setFragmentEntryKey(fragmentEntryKey);
		fragmentEntry.setName(name);
		fragmentEntry.setStatus(status);
		fragmentEntry.setStatusByUserId(userId);
		fragmentEntry.setStatusByUserName(user.getFullName());
		fragmentEntry.setStatusDate(new Date());

		fragmentEntryPersistence.update(fragmentEntry);

		// Resources

		resourceLocalService.addModelResources(fragmentEntry, serviceContext);

		return fragmentEntry;
	}

	@Override
	public FragmentEntry addFragmentEntry(
			long userId, long groupId, long fragmentCollectionId, String name,
			String css, String html, String js, int status,
			ServiceContext serviceContext)
		throws PortalException {

		return addFragmentEntry(
			userId, groupId, fragmentCollectionId, StringPool.BLANK, name, css,
			html, js, status, serviceContext);
	}

	@Override
	public FragmentEntry addFragmentEntry(
			long userId, long groupId, long fragmentCollectionId,
			String fragmentEntryKey, String name, String css, String html,
			String js, int status, ServiceContext serviceContext)
		throws PortalException {

		// Fragment entry

		User user = userLocalService.getUser(userId);

		if (Validator.isNull(fragmentEntryKey)) {
			fragmentEntryKey = String.valueOf(counterLocalService.increment());
		}
		else {
			fragmentEntryKey = _getFragmentEntryKey(fragmentEntryKey);
		}

		validate(name);
		validateFragmentEntryKey(groupId, fragmentEntryKey);

		if (WorkflowConstants.STATUS_APPROVED == status) {
			validateContent(html);

			html = _parseHTMLContent(html);
		}

		long fragmentEntryId = counterLocalService.increment();

		FragmentEntry fragmentEntry = fragmentEntryPersistence.create(
			fragmentEntryId);

		fragmentEntry.setGroupId(groupId);
		fragmentEntry.setCompanyId(user.getCompanyId());
		fragmentEntry.setUserId(user.getUserId());
		fragmentEntry.setUserName(user.getFullName());
		fragmentEntry.setCreateDate(serviceContext.getCreateDate(new Date()));
		fragmentEntry.setModifiedDate(
			serviceContext.getModifiedDate(new Date()));
		fragmentEntry.setFragmentCollectionId(fragmentCollectionId);
		fragmentEntry.setFragmentEntryKey(fragmentEntryKey);
		fragmentEntry.setName(name);
		fragmentEntry.setCss(css);
		fragmentEntry.setHtml(html);
		fragmentEntry.setJs(js);
		fragmentEntry.setStatus(status);
		fragmentEntry.setStatusByUserId(userId);
		fragmentEntry.setStatusByUserName(user.getFullName());
		fragmentEntry.setStatusDate(new Date());

		fragmentEntryPersistence.update(fragmentEntry);

		// Resources

		resourceLocalService.addModelResources(fragmentEntry, serviceContext);

		return fragmentEntry;
	}

	@Override
	public FragmentEntry deleteFragmentEntry(FragmentEntry fragmentEntry)
		throws PortalException {

		// Fragment entry

		long fragmentEntryLinkCount = fragmentEntryLinkPersistence.countByG_F(
			fragmentEntry.getGroupId(), fragmentEntry.getFragmentEntryId());

		if (fragmentEntryLinkCount > 0) {
			throw new RequiredFragmentEntryException();
		}

		fragmentEntryPersistence.remove(fragmentEntry);

		// Resources

		resourceLocalService.deleteResource(
			fragmentEntry.getCompanyId(), FragmentEntry.class.getName(),
			ResourceConstants.SCOPE_INDIVIDUAL,
			fragmentEntry.getFragmentEntryId());

		return fragmentEntry;
	}

	@Override
	public FragmentEntry deleteFragmentEntry(long fragmentEntryId)
		throws PortalException {

		FragmentEntry fragmentEntry = getFragmentEntry(fragmentEntryId);

		return deleteFragmentEntry(fragmentEntry);
	}

	@Override
	public FragmentEntry fetchFragmentEntry(long fragmentEntryId) {
		return fragmentEntryPersistence.fetchByPrimaryKey(fragmentEntryId);
	}

	@Override
	public FragmentEntry fetchFragmentEntry(
		long groupId, String fragmentEntryKey) {

		return fragmentEntryPersistence.fetchByG_FEK(
			groupId, _getFragmentEntryKey(fragmentEntryKey));
	}

	@Override
	public List<FragmentEntry> getFragmentEntries(long fragmentCollectionId) {
		return fragmentEntryPersistence.findByFragmentCollectionId(
			fragmentCollectionId);
	}

	@Override
	public List<FragmentEntry> getFragmentEntries(
		long fragmentCollectionId, int start, int end) {

		return fragmentEntryPersistence.findByFragmentCollectionId(
			fragmentCollectionId, start, end);
	}

	@Override
	public List<FragmentEntry> getFragmentEntries(
		long groupId, long fragmentCollectionId, int status) {

		return fragmentEntryPersistence.findByG_FCI_S(
			groupId, fragmentCollectionId, status);
	}

	@Override
	public List<FragmentEntry> getFragmentEntries(
		long groupId, long fragmentCollectionId, int start, int end,
		OrderByComparator<FragmentEntry> orderByComparator) {

		return fragmentEntryPersistence.findByG_FCI(
			groupId, fragmentCollectionId, start, end, orderByComparator);
	}

	@Override
	public List<FragmentEntry> getFragmentEntries(
		long groupId, long fragmentCollectionId, String name, int start,
		int end, OrderByComparator<FragmentEntry> orderByComparator) {

		if (Validator.isNull(name)) {
			return fragmentEntryPersistence.findByG_FCI(
				groupId, fragmentCollectionId, start, end, orderByComparator);
		}

		return fragmentEntryPersistence.findByG_FCI_LikeN(
			groupId, fragmentCollectionId, name, start, end, orderByComparator);
	}

	@Override
	public int getFragmentEntriesCount(long fragmentCollectionId) {
		return fragmentEntryPersistence.countByFragmentCollectionId(
			fragmentCollectionId);
	}

	@Override
	public String[] getTempFileNames(
			long userId, long groupId, String folderName)
		throws PortalException {

		return TempFileEntryUtil.getTempFileNames(groupId, userId, folderName);
	}

	@Override
	public FragmentEntry updateFragmentEntry(
			long userId, long fragmentEntryId, String name, String css,
			String html, String js, int status, ServiceContext serviceContext)
		throws PortalException {

		FragmentEntry fragmentEntry = fragmentEntryPersistence.findByPrimaryKey(
			fragmentEntryId);

		validate(name);

		if (WorkflowConstants.STATUS_APPROVED == status) {
			validateContent(html);

			html = _parseHTMLContent(html);
		}

		User user = userLocalService.getUser(userId);

		fragmentEntry.setModifiedDate(new Date());
		fragmentEntry.setName(name);
		fragmentEntry.setCss(css);
		fragmentEntry.setHtml(html);
		fragmentEntry.setJs(js);
		fragmentEntry.setStatus(status);
		fragmentEntry.setStatusByUserId(userId);
		fragmentEntry.setStatusByUserName(user.getFullName());
		fragmentEntry.setStatusDate(new Date());

		fragmentEntryPersistence.update(fragmentEntry);

		return fragmentEntry;
	}

	@Override
	public FragmentEntry updateFragmentEntry(long fragmentEntryId, String name)
		throws PortalException {

		FragmentEntry fragmentEntry = fragmentEntryPersistence.findByPrimaryKey(
			fragmentEntryId);

		if (Objects.equals(fragmentEntry.getName(), name)) {
			return fragmentEntry;
		}

		validate(name);

		fragmentEntry.setName(name);

		return fragmentEntryPersistence.update(fragmentEntry);
	}

	protected void validate(String name) throws PortalException {
		if (Validator.isNull(name)) {
			throw new FragmentEntryNameException("Name must not be null");
		}

		int nameMaxLength = ModelHintsUtil.getMaxLength(
			FragmentEntry.class.getName(), "name");

		if (name.length() > nameMaxLength) {
			throw new FragmentEntryNameException(
				"Maximum length of name exceeded");
		}
	}

	protected void validateContent(String html) throws PortalException {
		_fragmentEntryProcessorRegistry.validateFragmentEntryHTML(html);
	}

	protected void validateFragmentEntryKey(
			long groupId, String fragmentEntryKey)
		throws PortalException {

		fragmentEntryKey = _getFragmentEntryKey(fragmentEntryKey);

		FragmentEntry fragmentEntry = fragmentEntryPersistence.fetchByG_FEK(
			groupId, fragmentEntryKey);

		if (fragmentEntry != null) {
			throw new DuplicateFragmentEntryKeyException();
		}
	}

	private String _getContent(FragmentEntry fragmentEntry) {
		StringBundler sb = new StringBundler(7);

		sb.append("<html><head><style>");
		sb.append(fragmentEntry.getCss());
		sb.append("</style><script>");
		sb.append(fragmentEntry.getJs());
		sb.append("</script></head><body>");
		sb.append(fragmentEntry.getHtml());
		sb.append("</body></html>");

		return sb.toString();
	}

	private String _getFragmentEntryKey(String fragmentEntryKey) {
		if (fragmentEntryKey != null) {
			fragmentEntryKey = fragmentEntryKey.trim();

			return StringUtil.toUpperCase(fragmentEntryKey);
		}

		return StringPool.BLANK;
	}

	private String _parseHTMLContent(String html)
		throws FragmentEntryContentException {

		Document document = Jsoup.parseBodyFragment(html);

		Document.OutputSettings outputSettings = new Document.OutputSettings();

		outputSettings.prettyPrint(false);

		document.outputSettings(outputSettings);

		Element bodyElement = document.body();

		String bodyHtml = bodyElement.html();

		if (Validator.isNull(bodyHtml)) {
			throw new FragmentEntryContentException();
		}

		return bodyHtml;
	}

	@ServiceReference(type = FragmentEntryProcessorRegistry.class)
	private FragmentEntryProcessorRegistry _fragmentEntryProcessorRegistry;

}