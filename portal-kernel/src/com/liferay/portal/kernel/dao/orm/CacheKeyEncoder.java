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

package com.liferay.portal.kernel.dao.orm;

import com.liferay.portal.kernel.cache.key.CacheKeyGenerator;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

/**
 * @author Preston Crary
 */
public class CacheKeyEncoder {

	public CacheKeyEncoder(
		CacheKeyGenerator cacheKeyGenerator, String localCacheKeyPrefix,
		String cacheKeyPrefix, Object[] arguments) {

		_cacheKeyGenerator = cacheKeyGenerator;
		_localCacheKeyPrefix = localCacheKeyPrefix;
		_cacheKeyPrefix = cacheKeyPrefix;

		_keys = new String[arguments.length * 2 + 1];

		int i = 1;

		for (Object argument : arguments) {
			_keys[i++] = StringPool.PERIOD;
			_keys[i++] = StringUtil.toHexString(argument);
		}
	}

	public Serializable encodeCacheKey() {
		_keys[0] = _cacheKeyPrefix;

		return _cacheKeyGenerator.getCacheKey(_keys);
	}

	public Serializable encodeLocalCacheKey() {
		_keys[0] = _localCacheKeyPrefix;

		return _cacheKeyGenerator.getCacheKey(_keys);
	}

	private final CacheKeyGenerator _cacheKeyGenerator;
	private final String _cacheKeyPrefix;
	private final String[] _keys;
	private final String _localCacheKeyPrefix;

}