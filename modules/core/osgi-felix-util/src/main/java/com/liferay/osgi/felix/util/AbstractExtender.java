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

package com.liferay.osgi.felix.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;

/**
 * @author Shuyang Zhou
 */
public abstract class AbstractExtender
	extends org.apache.felix.utils.extender.AbstractExtender {

	public AbstractExtender() {
		setSynchronous(false);
	}

	@Override
	public void bundleChanged(BundleEvent event) {
		synchronized (this) {
			if (_stopped) {
				return;
			}

			if (event.getType() == BundleEvent.STOPPING) {
				BundleContext bundleContext = getBundleContext();

				Bundle bundle = event.getBundle();

				if (bundleContext == bundle.getBundleContext()) {
					bundleContext.removeBundleListener(this);

					_stopped = true;
				}
			}

			super.bundleChanged(event);
		}
	}

	@Override
	public final void setSynchronous(boolean synchronous) {
		super.setSynchronous(synchronous);
	}

	@Override
	protected ExecutorService createExecutor() {
		Class<? extends AbstractExtender> clazz = getClass();

		String name = clazz.getSimpleName() + "-";

		Runtime runtime = Runtime.getRuntime();

		return new ThreadPoolExecutor(
			0, runtime.availableProcessors(), 10, TimeUnit.SECONDS,
			new SynchronousQueue<>(),
			new ThreadFactory() {

				@Override
				public Thread newThread(Runnable runnable) {
					Thread thread = new Thread(
						runnable, name + _counter.getAndIncrement());

					thread.setDaemon(true);

					return thread;
				}

				private final AtomicInteger _counter = new AtomicInteger(1);

			},
			new ThreadPoolExecutor.CallerRunsPolicy()) {

			@Override
			public Future<?> submit(Runnable runnable) {
				Future<?> future = super.submit(runnable);

				_futures.add(future);

				return future;
			}

		};
	}

	@Override
	protected void doStart() throws Exception {
		super.doStart();

		_waitForTasks();
	}

	@Override
	protected void doStop() throws Exception {
		_waitForTasks();

		super.doStop();
	}

	private void _waitForTasks() throws Exception {
		Future<?> future = null;

		while ((future = _futures.poll()) != null) {
			future.get();
		}
	}

	private Queue<Future<?>> _futures = new ConcurrentLinkedQueue<>();
	private boolean _stopped;

}