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

package com.liferay.journal.model.impl.hibernate;

import com.liferay.journal.model.JournalFeed;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JournalFeedModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<JournalFeed, String>() {
					@Override
					public String apply(JournalFeed journalFeed) {
						return journalFeed.getUuid();
					}
				},
				new BiConsumer<JournalFeed, String>() {
					@Override
					public void accept(JournalFeed journalFeed, String uuid) {
						journalFeed.setUuid(uuid);
					}
				});
		}
	}

	public static class IdAccessor extends ModelPropertyAccessor {
		public IdAccessor() {
			super(new Function<JournalFeed, Long>() {
					@Override
					public Long apply(JournalFeed journalFeed) {
						return journalFeed.getId();
					}
				},
				new BiConsumer<JournalFeed, Long>() {
					@Override
					public void accept(JournalFeed journalFeed, Long id) {
						journalFeed.setId(id);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<JournalFeed, Long>() {
					@Override
					public Long apply(JournalFeed journalFeed) {
						return journalFeed.getGroupId();
					}
				},
				new BiConsumer<JournalFeed, Long>() {
					@Override
					public void accept(JournalFeed journalFeed, Long groupId) {
						journalFeed.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<JournalFeed, Long>() {
					@Override
					public Long apply(JournalFeed journalFeed) {
						return journalFeed.getCompanyId();
					}
				},
				new BiConsumer<JournalFeed, Long>() {
					@Override
					public void accept(JournalFeed journalFeed, Long companyId) {
						journalFeed.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<JournalFeed, Long>() {
					@Override
					public Long apply(JournalFeed journalFeed) {
						return journalFeed.getUserId();
					}
				},
				new BiConsumer<JournalFeed, Long>() {
					@Override
					public void accept(JournalFeed journalFeed, Long userId) {
						journalFeed.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<JournalFeed, String>() {
					@Override
					public String apply(JournalFeed journalFeed) {
						return journalFeed.getUserName();
					}
				},
				new BiConsumer<JournalFeed, String>() {
					@Override
					public void accept(JournalFeed journalFeed, String userName) {
						journalFeed.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<JournalFeed, Date>() {
					@Override
					public Date apply(JournalFeed journalFeed) {
						return journalFeed.getCreateDate();
					}
				},
				new BiConsumer<JournalFeed, Date>() {
					@Override
					public void accept(JournalFeed journalFeed, Date createDate) {
						journalFeed.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<JournalFeed, Date>() {
					@Override
					public Date apply(JournalFeed journalFeed) {
						return journalFeed.getModifiedDate();
					}
				},
				new BiConsumer<JournalFeed, Date>() {
					@Override
					public void accept(JournalFeed journalFeed,
						Date modifiedDate) {
						journalFeed.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class FeedIdAccessor extends ModelPropertyAccessor {
		public FeedIdAccessor() {
			super(new Function<JournalFeed, String>() {
					@Override
					public String apply(JournalFeed journalFeed) {
						return journalFeed.getFeedId();
					}
				},
				new BiConsumer<JournalFeed, String>() {
					@Override
					public void accept(JournalFeed journalFeed, String feedId) {
						journalFeed.setFeedId(feedId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<JournalFeed, String>() {
					@Override
					public String apply(JournalFeed journalFeed) {
						return journalFeed.getName();
					}
				},
				new BiConsumer<JournalFeed, String>() {
					@Override
					public void accept(JournalFeed journalFeed, String name) {
						journalFeed.setName(name);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<JournalFeed, String>() {
					@Override
					public String apply(JournalFeed journalFeed) {
						return journalFeed.getDescription();
					}
				},
				new BiConsumer<JournalFeed, String>() {
					@Override
					public void accept(JournalFeed journalFeed,
						String description) {
						journalFeed.setDescription(description);
					}
				});
		}
	}

	public static class DDMStructureKeyAccessor extends ModelPropertyAccessor {
		public DDMStructureKeyAccessor() {
			super(new Function<JournalFeed, String>() {
					@Override
					public String apply(JournalFeed journalFeed) {
						return journalFeed.getDDMStructureKey();
					}
				},
				new BiConsumer<JournalFeed, String>() {
					@Override
					public void accept(JournalFeed journalFeed,
						String DDMStructureKey) {
						journalFeed.setDDMStructureKey(DDMStructureKey);
					}
				});
		}
	}

	public static class DDMTemplateKeyAccessor extends ModelPropertyAccessor {
		public DDMTemplateKeyAccessor() {
			super(new Function<JournalFeed, String>() {
					@Override
					public String apply(JournalFeed journalFeed) {
						return journalFeed.getDDMTemplateKey();
					}
				},
				new BiConsumer<JournalFeed, String>() {
					@Override
					public void accept(JournalFeed journalFeed,
						String DDMTemplateKey) {
						journalFeed.setDDMTemplateKey(DDMTemplateKey);
					}
				});
		}
	}

	public static class DDMRendererTemplateKeyAccessor
		extends ModelPropertyAccessor {
		public DDMRendererTemplateKeyAccessor() {
			super(new Function<JournalFeed, String>() {
					@Override
					public String apply(JournalFeed journalFeed) {
						return journalFeed.getDDMRendererTemplateKey();
					}
				},
				new BiConsumer<JournalFeed, String>() {
					@Override
					public void accept(JournalFeed journalFeed,
						String DDMRendererTemplateKey) {
						journalFeed.setDDMRendererTemplateKey(DDMRendererTemplateKey);
					}
				});
		}
	}

	public static class DeltaAccessor extends ModelPropertyAccessor {
		public DeltaAccessor() {
			super(new Function<JournalFeed, Integer>() {
					@Override
					public Integer apply(JournalFeed journalFeed) {
						return journalFeed.getDelta();
					}
				},
				new BiConsumer<JournalFeed, Integer>() {
					@Override
					public void accept(JournalFeed journalFeed, Integer delta) {
						journalFeed.setDelta(delta);
					}
				});
		}
	}

	public static class OrderByColAccessor extends ModelPropertyAccessor {
		public OrderByColAccessor() {
			super(new Function<JournalFeed, String>() {
					@Override
					public String apply(JournalFeed journalFeed) {
						return journalFeed.getOrderByCol();
					}
				},
				new BiConsumer<JournalFeed, String>() {
					@Override
					public void accept(JournalFeed journalFeed,
						String orderByCol) {
						journalFeed.setOrderByCol(orderByCol);
					}
				});
		}
	}

	public static class OrderByTypeAccessor extends ModelPropertyAccessor {
		public OrderByTypeAccessor() {
			super(new Function<JournalFeed, String>() {
					@Override
					public String apply(JournalFeed journalFeed) {
						return journalFeed.getOrderByType();
					}
				},
				new BiConsumer<JournalFeed, String>() {
					@Override
					public void accept(JournalFeed journalFeed,
						String orderByType) {
						journalFeed.setOrderByType(orderByType);
					}
				});
		}
	}

	public static class TargetLayoutFriendlyUrlAccessor
		extends ModelPropertyAccessor {
		public TargetLayoutFriendlyUrlAccessor() {
			super(new Function<JournalFeed, String>() {
					@Override
					public String apply(JournalFeed journalFeed) {
						return journalFeed.getTargetLayoutFriendlyUrl();
					}
				},
				new BiConsumer<JournalFeed, String>() {
					@Override
					public void accept(JournalFeed journalFeed,
						String targetLayoutFriendlyUrl) {
						journalFeed.setTargetLayoutFriendlyUrl(targetLayoutFriendlyUrl);
					}
				});
		}
	}

	public static class TargetPortletIdAccessor extends ModelPropertyAccessor {
		public TargetPortletIdAccessor() {
			super(new Function<JournalFeed, String>() {
					@Override
					public String apply(JournalFeed journalFeed) {
						return journalFeed.getTargetPortletId();
					}
				},
				new BiConsumer<JournalFeed, String>() {
					@Override
					public void accept(JournalFeed journalFeed,
						String targetPortletId) {
						journalFeed.setTargetPortletId(targetPortletId);
					}
				});
		}
	}

	public static class ContentFieldAccessor extends ModelPropertyAccessor {
		public ContentFieldAccessor() {
			super(new Function<JournalFeed, String>() {
					@Override
					public String apply(JournalFeed journalFeed) {
						return journalFeed.getContentField();
					}
				},
				new BiConsumer<JournalFeed, String>() {
					@Override
					public void accept(JournalFeed journalFeed,
						String contentField) {
						journalFeed.setContentField(contentField);
					}
				});
		}
	}

	public static class FeedFormatAccessor extends ModelPropertyAccessor {
		public FeedFormatAccessor() {
			super(new Function<JournalFeed, String>() {
					@Override
					public String apply(JournalFeed journalFeed) {
						return journalFeed.getFeedFormat();
					}
				},
				new BiConsumer<JournalFeed, String>() {
					@Override
					public void accept(JournalFeed journalFeed,
						String feedFormat) {
						journalFeed.setFeedFormat(feedFormat);
					}
				});
		}
	}

	public static class FeedVersionAccessor extends ModelPropertyAccessor {
		public FeedVersionAccessor() {
			super(new Function<JournalFeed, Double>() {
					@Override
					public Double apply(JournalFeed journalFeed) {
						return journalFeed.getFeedVersion();
					}
				},
				new BiConsumer<JournalFeed, Double>() {
					@Override
					public void accept(JournalFeed journalFeed,
						Double feedVersion) {
						journalFeed.setFeedVersion(feedVersion);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<JournalFeed, Date>() {
					@Override
					public Date apply(JournalFeed journalFeed) {
						return journalFeed.getLastPublishDate();
					}
				},
				new BiConsumer<JournalFeed, Date>() {
					@Override
					public void accept(JournalFeed journalFeed,
						Date lastPublishDate) {
						journalFeed.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private JournalFeedModelAccessors() {
	}
}