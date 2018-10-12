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

package com.liferay.wiki.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import com.liferay.wiki.model.WikiNode;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WikiNodeModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<WikiNode, String>() {
					@Override
					public String apply(WikiNode wikiNode) {
						return wikiNode.getUuid();
					}
				},
				new BiConsumer<WikiNode, String>() {
					@Override
					public void accept(WikiNode wikiNode, String uuid) {
						wikiNode.setUuid(uuid);
					}
				});
		}
	}

	public static class NodeIdAccessor extends ModelPropertyAccessor {
		public NodeIdAccessor() {
			super(new Function<WikiNode, Long>() {
					@Override
					public Long apply(WikiNode wikiNode) {
						return wikiNode.getNodeId();
					}
				},
				new BiConsumer<WikiNode, Long>() {
					@Override
					public void accept(WikiNode wikiNode, Long nodeId) {
						wikiNode.setNodeId(nodeId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<WikiNode, Long>() {
					@Override
					public Long apply(WikiNode wikiNode) {
						return wikiNode.getGroupId();
					}
				},
				new BiConsumer<WikiNode, Long>() {
					@Override
					public void accept(WikiNode wikiNode, Long groupId) {
						wikiNode.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<WikiNode, Long>() {
					@Override
					public Long apply(WikiNode wikiNode) {
						return wikiNode.getCompanyId();
					}
				},
				new BiConsumer<WikiNode, Long>() {
					@Override
					public void accept(WikiNode wikiNode, Long companyId) {
						wikiNode.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<WikiNode, Long>() {
					@Override
					public Long apply(WikiNode wikiNode) {
						return wikiNode.getUserId();
					}
				},
				new BiConsumer<WikiNode, Long>() {
					@Override
					public void accept(WikiNode wikiNode, Long userId) {
						wikiNode.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<WikiNode, String>() {
					@Override
					public String apply(WikiNode wikiNode) {
						return wikiNode.getUserName();
					}
				},
				new BiConsumer<WikiNode, String>() {
					@Override
					public void accept(WikiNode wikiNode, String userName) {
						wikiNode.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<WikiNode, Date>() {
					@Override
					public Date apply(WikiNode wikiNode) {
						return wikiNode.getCreateDate();
					}
				},
				new BiConsumer<WikiNode, Date>() {
					@Override
					public void accept(WikiNode wikiNode, Date createDate) {
						wikiNode.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<WikiNode, Date>() {
					@Override
					public Date apply(WikiNode wikiNode) {
						return wikiNode.getModifiedDate();
					}
				},
				new BiConsumer<WikiNode, Date>() {
					@Override
					public void accept(WikiNode wikiNode, Date modifiedDate) {
						wikiNode.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<WikiNode, String>() {
					@Override
					public String apply(WikiNode wikiNode) {
						return wikiNode.getName();
					}
				},
				new BiConsumer<WikiNode, String>() {
					@Override
					public void accept(WikiNode wikiNode, String name) {
						wikiNode.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<WikiNode, String>() {
					@Override
					public String apply(WikiNode wikiNode) {
						return wikiNode.getDescription();
					}
				},
				new BiConsumer<WikiNode, String>() {
					@Override
					public void accept(WikiNode wikiNode, String description) {
						wikiNode.setDescription(description);
					}
				});
		}
	}

	public static class LastPostDateAccessor extends ModelPropertyAccessor {
		public LastPostDateAccessor() {
			super(new Function<WikiNode, Date>() {
					@Override
					public Date apply(WikiNode wikiNode) {
						return wikiNode.getLastPostDate();
					}
				},
				new BiConsumer<WikiNode, Date>() {
					@Override
					public void accept(WikiNode wikiNode, Date lastPostDate) {
						wikiNode.setLastPostDate(lastPostDate);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<WikiNode, Date>() {
					@Override
					public Date apply(WikiNode wikiNode) {
						return wikiNode.getLastPublishDate();
					}
				},
				new BiConsumer<WikiNode, Date>() {
					@Override
					public void accept(WikiNode wikiNode, Date lastPublishDate) {
						wikiNode.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<WikiNode, Integer>() {
					@Override
					public Integer apply(WikiNode wikiNode) {
						return wikiNode.getStatus();
					}
				},
				new BiConsumer<WikiNode, Integer>() {
					@Override
					public void accept(WikiNode wikiNode, Integer status) {
						wikiNode.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<WikiNode, Long>() {
					@Override
					public Long apply(WikiNode wikiNode) {
						return wikiNode.getStatusByUserId();
					}
				},
				new BiConsumer<WikiNode, Long>() {
					@Override
					public void accept(WikiNode wikiNode, Long statusByUserId) {
						wikiNode.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<WikiNode, String>() {
					@Override
					public String apply(WikiNode wikiNode) {
						return wikiNode.getStatusByUserName();
					}
				},
				new BiConsumer<WikiNode, String>() {
					@Override
					public void accept(WikiNode wikiNode,
						String statusByUserName) {
						wikiNode.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<WikiNode, Date>() {
					@Override
					public Date apply(WikiNode wikiNode) {
						return wikiNode.getStatusDate();
					}
				},
				new BiConsumer<WikiNode, Date>() {
					@Override
					public void accept(WikiNode wikiNode, Date statusDate) {
						wikiNode.setStatusDate(statusDate);
					}
				});
		}
	}

	private WikiNodeModelAccessors() {
	}
}