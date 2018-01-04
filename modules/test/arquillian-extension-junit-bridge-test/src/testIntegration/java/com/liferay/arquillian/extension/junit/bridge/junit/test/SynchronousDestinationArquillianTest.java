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

package com.liferay.arquillian.extension.junit.bridge.junit.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.messaging.Destination;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.MessageBus;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.messaging.SynchronousDestination;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.Sync;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * @author Alexander Chow
 */
@RunWith(Arquillian.class)
@Sync
public class SynchronousDestinationArquillianTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new LiferayIntegrationTestRule();

	@Test
	public void testSynchronousDestination() throws Exception {
		MessageBus messageBus = MessageBusUtil.getMessageBus();

		String[] destinationNames = {
			DestinationNames.DOCUMENT_LIBRARY_AUDIO_PROCESSOR,
			DestinationNames.DOCUMENT_LIBRARY_IMAGE_PROCESSOR,
			DestinationNames.DOCUMENT_LIBRARY_PDF_PROCESSOR,
			DestinationNames.DOCUMENT_LIBRARY_RAW_METADATA_PROCESSOR,
			DestinationNames.DOCUMENT_LIBRARY_VIDEO_PROCESSOR};

		for (String name : destinationNames) {
			Destination destination = messageBus.getDestination(name);

			if (!(destination instanceof SynchronousDestination)) {
				Assert.fail(name + " is not a SynchronousDestination.");
			}
		}


	}

}