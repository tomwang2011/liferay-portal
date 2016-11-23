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

package com.liferay.portal.dao.orm.hibernate;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.MVCCModel;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.test.rule.NewEnv;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import org.hibernate.StaleObjectStateException;
import org.hibernate.event.MergeEvent;
import org.hibernate.event.MergeEventListener;
import org.hibernate.event.def.DefaultMergeEventListener;
import org.junit.Assert;
import org.junit.Test;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Preston Crary
 */
public class CIMergeEventListenerTest {

	@NewEnv(type = NewEnv.Type.CLASSLOADER)
	@Test
	public void testFailedMergeEventStaleObjectState() {
		_setCIEnvironment();

		TestMVCCModel testMVCCModel = new TestMVCCModel(
			1, RandomTestUtil.randomString());

		try {
			_mergeEventListener.onMerge(
				new TestMergeEvent(
					"Test", testMVCCModel, new NullPointerException("Test")));

			Assert.fail();
		}
		catch (NullPointerException npe) {
			Assert.assertEquals("Test", npe.getMessage());
		}

		try {
			_mergeEventListener.onMerge(
				new TestMergeEvent("Test", testMVCCModel));
		}
		catch (StaleObjectStateException sose) {
			Assert.assertEquals("stuff", sose.getMessage());
		}
	}

	@Test
	public void testFailedMergeEventStaleObjectStateNonCI() {
	}

	@NewEnv(type = NewEnv.Type.CLASSLOADER)
	@Test
	public void testFailedMergeEventOtherHibernateException() {
		_setCIEnvironment();
	}

	private void _setCIEnvironment() {
		ProcessBuilder processBuilder = new ProcessBuilder();

		// ...
	}

	private static class TestMergeEvent extends MergeEvent {

		@Override
		public Object getOriginal() {
			throw _runtimeException;
		}

		@Override
		public Object getEntity() {
			return _mvccModel;
		}

		@Override
		public String getEntityName() {
			return _entityName;
		}

		private TestMergeEvent(String entityName, MVCCModel mvccModel) {
			this(entityName, mvccModel, null);
		}

		private TestMergeEvent(
			String entityName, MVCCModel mvccModel,
			RuntimeException runtimeException) {

			super(mvccModel, null);

			_entityName = entityName;

			if (runtimeException == null) {
				_runtimeException = new StaleObjectStateException(null, null);
			}
			else {
				_runtimeException = runtimeException;
			}

			_mvccModel = mvccModel;
		}

		private final RuntimeException _runtimeException;
		private final String _entityName;
		private final MVCCModel _mvccModel;

	}

	private static class TestMVCCModel
		implements BaseModel<TestMVCCModel>, MVCCModel {

		@Override
		public long getMvccVersion() {
			return _mvccVersion;
		}

		@Override
		public void setMvccVersion(long mvccVersion) {
			_mvccVersion = mvccVersion;
		}

		@Override
		public Class<?> getModelClass() {
			throw new UnsupportedOperationException();
		}

		@Override
		public String getModelClassName() {
			throw new UnsupportedOperationException();
		}

		@Override
		public Object clone() {
			throw new UnsupportedOperationException();
		}

		@Override
		public ExpandoBridge getExpandoBridge() {
			throw new UnsupportedOperationException();
		}

		@Override
		public Map<String, Object> getModelAttributes() {
			throw new UnsupportedOperationException();
		}

		@Override
		public Serializable getPrimaryKeyObj() {
			return _primaryKey;
		}

		@Override
		public boolean isCachedModel() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean isEntityCacheEnabled() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean isEscapedModel() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean isFinderCacheEnabled() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean isNew() {
			throw new UnsupportedOperationException();
		}

		@Override
		public void resetOriginalValues() {
			throw new UnsupportedOperationException();
		}

		@Override
		public void setCachedModel(boolean cachedModel) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void setExpandoBridgeAttributes(BaseModel<?> baseModel) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void setModelAttributes(Map<String, Object> attributes) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void setNew(boolean n) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void setPrimaryKeyObj(Serializable primaryKeyObj) {
			_primaryKey = (String)primaryKeyObj;
		}

		@Override
		public CacheModel<TestMVCCModel> toCacheModel() {
			throw new UnsupportedOperationException();
		}

		@Override
		public TestMVCCModel toEscapedModel() {
			throw new UnsupportedOperationException();
		}

		@Override
		public TestMVCCModel toUnescapedModel() {
			throw new UnsupportedOperationException();
		}

		@Override
		public String toXmlString() {
			throw new UnsupportedOperationException();
		}

		@Override
		public int compareTo(TestMVCCModel o) {
			throw new UnsupportedOperationException();
		}

		private TestMVCCModel(long mvccVersion, String primaryKey) {
			_mvccVersion = mvccVersion;
			_primaryKey = primaryKey;
		}

		private long _mvccVersion;
		private String _primaryKey;

	}

	private static final MergeEventListener _mergeEventListener =
		new DefaultMergeEventListener();

}