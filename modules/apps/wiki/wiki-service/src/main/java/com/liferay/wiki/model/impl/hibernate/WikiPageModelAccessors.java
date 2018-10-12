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

import com.liferay.wiki.model.WikiPage;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WikiPageModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<WikiPage, String>() {
					@Override
					public String apply(WikiPage wikiPage) {
						return wikiPage.getUuid();
					}
				},
				new BiConsumer<WikiPage, String>() {
					@Override
					public void accept(WikiPage wikiPage, String uuid) {
						wikiPage.setUuid(uuid);
					}
				});
		}
	}

	public static class PageIdAccessor extends ModelPropertyAccessor {
		public PageIdAccessor() {
			super(new Function<WikiPage, Long>() {
					@Override
					public Long apply(WikiPage wikiPage) {
						return wikiPage.getPageId();
					}
				},
				new BiConsumer<WikiPage, Long>() {
					@Override
					public void accept(WikiPage wikiPage, Long pageId) {
						wikiPage.setPageId(pageId);
					}
				});
		}
	}

	public static class ResourcePrimKeyAccessor extends ModelPropertyAccessor {
		public ResourcePrimKeyAccessor() {
			super(new Function<WikiPage, Long>() {
					@Override
					public Long apply(WikiPage wikiPage) {
						return wikiPage.getResourcePrimKey();
					}
				},
				new BiConsumer<WikiPage, Long>() {
					@Override
					public void accept(WikiPage wikiPage, Long resourcePrimKey) {
						wikiPage.setResourcePrimKey(resourcePrimKey);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<WikiPage, Long>() {
					@Override
					public Long apply(WikiPage wikiPage) {
						return wikiPage.getGroupId();
					}
				},
				new BiConsumer<WikiPage, Long>() {
					@Override
					public void accept(WikiPage wikiPage, Long groupId) {
						wikiPage.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<WikiPage, Long>() {
					@Override
					public Long apply(WikiPage wikiPage) {
						return wikiPage.getCompanyId();
					}
				},
				new BiConsumer<WikiPage, Long>() {
					@Override
					public void accept(WikiPage wikiPage, Long companyId) {
						wikiPage.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<WikiPage, Long>() {
					@Override
					public Long apply(WikiPage wikiPage) {
						return wikiPage.getUserId();
					}
				},
				new BiConsumer<WikiPage, Long>() {
					@Override
					public void accept(WikiPage wikiPage, Long userId) {
						wikiPage.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<WikiPage, String>() {
					@Override
					public String apply(WikiPage wikiPage) {
						return wikiPage.getUserName();
					}
				},
				new BiConsumer<WikiPage, String>() {
					@Override
					public void accept(WikiPage wikiPage, String userName) {
						wikiPage.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<WikiPage, Date>() {
					@Override
					public Date apply(WikiPage wikiPage) {
						return wikiPage.getCreateDate();
					}
				},
				new BiConsumer<WikiPage, Date>() {
					@Override
					public void accept(WikiPage wikiPage, Date createDate) {
						wikiPage.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<WikiPage, Date>() {
					@Override
					public Date apply(WikiPage wikiPage) {
						return wikiPage.getModifiedDate();
					}
				},
				new BiConsumer<WikiPage, Date>() {
					@Override
					public void accept(WikiPage wikiPage, Date modifiedDate) {
						wikiPage.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class NodeIdAccessor extends ModelPropertyAccessor {
		public NodeIdAccessor() {
			super(new Function<WikiPage, Long>() {
					@Override
					public Long apply(WikiPage wikiPage) {
						return wikiPage.getNodeId();
					}
				},
				new BiConsumer<WikiPage, Long>() {
					@Override
					public void accept(WikiPage wikiPage, Long nodeId) {
						wikiPage.setNodeId(nodeId);
					}
				});
		}
	}

	public static class TitleAccessor extends ModelPropertyAccessor {
		public TitleAccessor() {
			super(new Function<WikiPage, String>() {
					@Override
					public String apply(WikiPage wikiPage) {
						return wikiPage.getTitle();
					}
				},
				new BiConsumer<WikiPage, String>() {
					@Override
					public void accept(WikiPage wikiPage, String title) {
						wikiPage.setTitle(title);
					}
				});
		}
	}

	public static class VersionAccessor extends ModelPropertyAccessor {
		public VersionAccessor() {
			super(new Function<WikiPage, Double>() {
					@Override
					public Double apply(WikiPage wikiPage) {
						return wikiPage.getVersion();
					}
				},
				new BiConsumer<WikiPage, Double>() {
					@Override
					public void accept(WikiPage wikiPage, Double version) {
						wikiPage.setVersion(version);
					}
				});
		}
	}

	public static class MinorEditAccessor extends ModelPropertyAccessor {
		public MinorEditAccessor() {
			super(new Function<WikiPage, Boolean>() {
					@Override
					public Boolean apply(WikiPage wikiPage) {
						return wikiPage.getMinorEdit();
					}
				},
				new BiConsumer<WikiPage, Boolean>() {
					@Override
					public void accept(WikiPage wikiPage, Boolean minorEdit) {
						wikiPage.setMinorEdit(minorEdit);
					}
				});
		}
	}

	public static class ContentAccessor extends ModelPropertyAccessor {
		public ContentAccessor() {
			super(new Function<WikiPage, String>() {
					@Override
					public String apply(WikiPage wikiPage) {
						return wikiPage.getContent();
					}
				},
				new BiConsumer<WikiPage, String>() {
					@Override
					public void accept(WikiPage wikiPage, String content) {
						wikiPage.setContent(content);
					}
				});
		}
	}

	public static class SummaryAccessor extends ModelPropertyAccessor {
		public SummaryAccessor() {
			super(new Function<WikiPage, String>() {
					@Override
					public String apply(WikiPage wikiPage) {
						return wikiPage.getSummary();
					}
				},
				new BiConsumer<WikiPage, String>() {
					@Override
					public void accept(WikiPage wikiPage, String summary) {
						wikiPage.setSummary(summary);
					}
				});
		}
	}

	public static class FormatAccessor extends ModelPropertyAccessor {
		public FormatAccessor() {
			super(new Function<WikiPage, String>() {
					@Override
					public String apply(WikiPage wikiPage) {
						return wikiPage.getFormat();
					}
				},
				new BiConsumer<WikiPage, String>() {
					@Override
					public void accept(WikiPage wikiPage, String format) {
						wikiPage.setFormat(format);
					}
				});
		}
	}

	public static class HeadAccessor extends ModelPropertyAccessor {
		public HeadAccessor() {
			super(new Function<WikiPage, Boolean>() {
					@Override
					public Boolean apply(WikiPage wikiPage) {
						return wikiPage.getHead();
					}
				},
				new BiConsumer<WikiPage, Boolean>() {
					@Override
					public void accept(WikiPage wikiPage, Boolean head) {
						wikiPage.setHead(head);
					}
				});
		}
	}

	public static class ParentTitleAccessor extends ModelPropertyAccessor {
		public ParentTitleAccessor() {
			super(new Function<WikiPage, String>() {
					@Override
					public String apply(WikiPage wikiPage) {
						return wikiPage.getParentTitle();
					}
				},
				new BiConsumer<WikiPage, String>() {
					@Override
					public void accept(WikiPage wikiPage, String parentTitle) {
						wikiPage.setParentTitle(parentTitle);
					}
				});
		}
	}

	public static class RedirectTitleAccessor extends ModelPropertyAccessor {
		public RedirectTitleAccessor() {
			super(new Function<WikiPage, String>() {
					@Override
					public String apply(WikiPage wikiPage) {
						return wikiPage.getRedirectTitle();
					}
				},
				new BiConsumer<WikiPage, String>() {
					@Override
					public void accept(WikiPage wikiPage, String redirectTitle) {
						wikiPage.setRedirectTitle(redirectTitle);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<WikiPage, Date>() {
					@Override
					public Date apply(WikiPage wikiPage) {
						return wikiPage.getLastPublishDate();
					}
				},
				new BiConsumer<WikiPage, Date>() {
					@Override
					public void accept(WikiPage wikiPage, Date lastPublishDate) {
						wikiPage.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<WikiPage, Integer>() {
					@Override
					public Integer apply(WikiPage wikiPage) {
						return wikiPage.getStatus();
					}
				},
				new BiConsumer<WikiPage, Integer>() {
					@Override
					public void accept(WikiPage wikiPage, Integer status) {
						wikiPage.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<WikiPage, Long>() {
					@Override
					public Long apply(WikiPage wikiPage) {
						return wikiPage.getStatusByUserId();
					}
				},
				new BiConsumer<WikiPage, Long>() {
					@Override
					public void accept(WikiPage wikiPage, Long statusByUserId) {
						wikiPage.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<WikiPage, String>() {
					@Override
					public String apply(WikiPage wikiPage) {
						return wikiPage.getStatusByUserName();
					}
				},
				new BiConsumer<WikiPage, String>() {
					@Override
					public void accept(WikiPage wikiPage,
						String statusByUserName) {
						wikiPage.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<WikiPage, Date>() {
					@Override
					public Date apply(WikiPage wikiPage) {
						return wikiPage.getStatusDate();
					}
				},
				new BiConsumer<WikiPage, Date>() {
					@Override
					public void accept(WikiPage wikiPage, Date statusDate) {
						wikiPage.setStatusDate(statusDate);
					}
				});
		}
	}

	private WikiPageModelAccessors() {
	}
}