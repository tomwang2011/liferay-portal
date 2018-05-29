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

package com.liferay.log.line.counter;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;


/**
 * @author Tom Wang
 */
public class LineCounterAppender extends AppenderSkeleton {

	@Override
	protected void append(LoggingEvent loggingEvent) {
		_counter.incrementAndGet();

		System.out.println("*Current log line count: " + _counter.get());
	}

	@Override
	public void close() {

	}

	@Override
	public boolean requiresLayout() {
		return false;
	}

	private AtomicInteger _counter = new AtomicInteger();
}