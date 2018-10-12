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

package com.liferay.portal.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;
import com.liferay.portal.kernel.model.ClusterGroup;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ClusterGroupModelAccessors {
	public static class ClusterGroupIdAccessor extends ModelPropertyAccessor {
		public ClusterGroupIdAccessor() {
			super(new Function<ClusterGroup, Long>() {
					@Override
					public Long apply(ClusterGroup clusterGroup) {
						return clusterGroup.getClusterGroupId();
					}
				},
				new BiConsumer<ClusterGroup, Long>() {
					@Override
					public void accept(ClusterGroup clusterGroup,
						Long clusterGroupId) {
						clusterGroup.setClusterGroupId(clusterGroupId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<ClusterGroup, String>() {
					@Override
					public String apply(ClusterGroup clusterGroup) {
						return clusterGroup.getName();
					}
				},
				new BiConsumer<ClusterGroup, String>() {
					@Override
					public void accept(ClusterGroup clusterGroup, String name) {
						clusterGroup.setName(name);
					}
				});
		}
	}

	public static class ClusterNodeIdsAccessor extends ModelPropertyAccessor {
		public ClusterNodeIdsAccessor() {
			super(new Function<ClusterGroup, String>() {
					@Override
					public String apply(ClusterGroup clusterGroup) {
						return clusterGroup.getClusterNodeIds();
					}
				},
				new BiConsumer<ClusterGroup, String>() {
					@Override
					public void accept(ClusterGroup clusterGroup,
						String clusterNodeIds) {
						clusterGroup.setClusterNodeIds(clusterNodeIds);
					}
				});
		}
	}

	public static class WholeClusterAccessor extends ModelPropertyAccessor {
		public WholeClusterAccessor() {
			super(new Function<ClusterGroup, Boolean>() {
					@Override
					public Boolean apply(ClusterGroup clusterGroup) {
						return clusterGroup.getWholeCluster();
					}
				},
				new BiConsumer<ClusterGroup, Boolean>() {
					@Override
					public void accept(ClusterGroup clusterGroup,
						Boolean wholeCluster) {
						clusterGroup.setWholeCluster(wholeCluster);
					}
				});
		}
	}

	private ClusterGroupModelAccessors() {
	}
}