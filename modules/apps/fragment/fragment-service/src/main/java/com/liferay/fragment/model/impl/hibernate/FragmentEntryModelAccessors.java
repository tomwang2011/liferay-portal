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

package com.liferay.fragment.model.impl.hibernate;

import com.liferay.fragment.model.FragmentEntry;

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
public class FragmentEntryModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<FragmentEntry, String>() {
					@Override
					public String apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getUuid();
					}
				},
				new BiConsumer<FragmentEntry, String>() {
					@Override
					public void accept(FragmentEntry fragmentEntry, String uuid) {
						fragmentEntry.setUuid(uuid);
					}
				});
		}
	}

	public static class FragmentEntryIdAccessor extends ModelPropertyAccessor {
		public FragmentEntryIdAccessor() {
			super(new Function<FragmentEntry, Long>() {
					@Override
					public Long apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getFragmentEntryId();
					}
				},
				new BiConsumer<FragmentEntry, Long>() {
					@Override
					public void accept(FragmentEntry fragmentEntry,
						Long fragmentEntryId) {
						fragmentEntry.setFragmentEntryId(fragmentEntryId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<FragmentEntry, Long>() {
					@Override
					public Long apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getGroupId();
					}
				},
				new BiConsumer<FragmentEntry, Long>() {
					@Override
					public void accept(FragmentEntry fragmentEntry, Long groupId) {
						fragmentEntry.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<FragmentEntry, Long>() {
					@Override
					public Long apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getCompanyId();
					}
				},
				new BiConsumer<FragmentEntry, Long>() {
					@Override
					public void accept(FragmentEntry fragmentEntry,
						Long companyId) {
						fragmentEntry.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<FragmentEntry, Long>() {
					@Override
					public Long apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getUserId();
					}
				},
				new BiConsumer<FragmentEntry, Long>() {
					@Override
					public void accept(FragmentEntry fragmentEntry, Long userId) {
						fragmentEntry.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<FragmentEntry, String>() {
					@Override
					public String apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getUserName();
					}
				},
				new BiConsumer<FragmentEntry, String>() {
					@Override
					public void accept(FragmentEntry fragmentEntry,
						String userName) {
						fragmentEntry.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<FragmentEntry, Date>() {
					@Override
					public Date apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getCreateDate();
					}
				},
				new BiConsumer<FragmentEntry, Date>() {
					@Override
					public void accept(FragmentEntry fragmentEntry,
						Date createDate) {
						fragmentEntry.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<FragmentEntry, Date>() {
					@Override
					public Date apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getModifiedDate();
					}
				},
				new BiConsumer<FragmentEntry, Date>() {
					@Override
					public void accept(FragmentEntry fragmentEntry,
						Date modifiedDate) {
						fragmentEntry.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class FragmentCollectionIdAccessor
		extends ModelPropertyAccessor {
		public FragmentCollectionIdAccessor() {
			super(new Function<FragmentEntry, Long>() {
					@Override
					public Long apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getFragmentCollectionId();
					}
				},
				new BiConsumer<FragmentEntry, Long>() {
					@Override
					public void accept(FragmentEntry fragmentEntry,
						Long fragmentCollectionId) {
						fragmentEntry.setFragmentCollectionId(fragmentCollectionId);
					}
				});
		}
	}

	public static class FragmentEntryKeyAccessor extends ModelPropertyAccessor {
		public FragmentEntryKeyAccessor() {
			super(new Function<FragmentEntry, String>() {
					@Override
					public String apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getFragmentEntryKey();
					}
				},
				new BiConsumer<FragmentEntry, String>() {
					@Override
					public void accept(FragmentEntry fragmentEntry,
						String fragmentEntryKey) {
						fragmentEntry.setFragmentEntryKey(fragmentEntryKey);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<FragmentEntry, String>() {
					@Override
					public String apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getName();
					}
				},
				new BiConsumer<FragmentEntry, String>() {
					@Override
					public void accept(FragmentEntry fragmentEntry, String name) {
						fragmentEntry.setName(name);
					}
				});
		}
	}

	public static class CssAccessor extends ModelPropertyAccessor {
		public CssAccessor() {
			super(new Function<FragmentEntry, String>() {
					@Override
					public String apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getCss();
					}
				},
				new BiConsumer<FragmentEntry, String>() {
					@Override
					public void accept(FragmentEntry fragmentEntry, String css) {
						fragmentEntry.setCss(css);
					}
				});
		}
	}

	public static class HtmlAccessor extends ModelPropertyAccessor {
		public HtmlAccessor() {
			super(new Function<FragmentEntry, String>() {
					@Override
					public String apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getHtml();
					}
				},
				new BiConsumer<FragmentEntry, String>() {
					@Override
					public void accept(FragmentEntry fragmentEntry, String html) {
						fragmentEntry.setHtml(html);
					}
				});
		}
	}

	public static class JsAccessor extends ModelPropertyAccessor {
		public JsAccessor() {
			super(new Function<FragmentEntry, String>() {
					@Override
					public String apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getJs();
					}
				},
				new BiConsumer<FragmentEntry, String>() {
					@Override
					public void accept(FragmentEntry fragmentEntry, String js) {
						fragmentEntry.setJs(js);
					}
				});
		}
	}

	public static class PreviewFileEntryIdAccessor extends ModelPropertyAccessor {
		public PreviewFileEntryIdAccessor() {
			super(new Function<FragmentEntry, Long>() {
					@Override
					public Long apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getPreviewFileEntryId();
					}
				},
				new BiConsumer<FragmentEntry, Long>() {
					@Override
					public void accept(FragmentEntry fragmentEntry,
						Long previewFileEntryId) {
						fragmentEntry.setPreviewFileEntryId(previewFileEntryId);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<FragmentEntry, Date>() {
					@Override
					public Date apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getLastPublishDate();
					}
				},
				new BiConsumer<FragmentEntry, Date>() {
					@Override
					public void accept(FragmentEntry fragmentEntry,
						Date lastPublishDate) {
						fragmentEntry.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	public static class StatusAccessor extends ModelPropertyAccessor {
		public StatusAccessor() {
			super(new Function<FragmentEntry, Integer>() {
					@Override
					public Integer apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getStatus();
					}
				},
				new BiConsumer<FragmentEntry, Integer>() {
					@Override
					public void accept(FragmentEntry fragmentEntry,
						Integer status) {
						fragmentEntry.setStatus(status);
					}
				});
		}
	}

	public static class StatusByUserIdAccessor extends ModelPropertyAccessor {
		public StatusByUserIdAccessor() {
			super(new Function<FragmentEntry, Long>() {
					@Override
					public Long apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getStatusByUserId();
					}
				},
				new BiConsumer<FragmentEntry, Long>() {
					@Override
					public void accept(FragmentEntry fragmentEntry,
						Long statusByUserId) {
						fragmentEntry.setStatusByUserId(statusByUserId);
					}
				});
		}
	}

	public static class StatusByUserNameAccessor extends ModelPropertyAccessor {
		public StatusByUserNameAccessor() {
			super(new Function<FragmentEntry, String>() {
					@Override
					public String apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getStatusByUserName();
					}
				},
				new BiConsumer<FragmentEntry, String>() {
					@Override
					public void accept(FragmentEntry fragmentEntry,
						String statusByUserName) {
						fragmentEntry.setStatusByUserName(statusByUserName);
					}
				});
		}
	}

	public static class StatusDateAccessor extends ModelPropertyAccessor {
		public StatusDateAccessor() {
			super(new Function<FragmentEntry, Date>() {
					@Override
					public Date apply(FragmentEntry fragmentEntry) {
						return fragmentEntry.getStatusDate();
					}
				},
				new BiConsumer<FragmentEntry, Date>() {
					@Override
					public void accept(FragmentEntry fragmentEntry,
						Date statusDate) {
						fragmentEntry.setStatusDate(statusDate);
					}
				});
		}
	}

	private FragmentEntryModelAccessors() {
	}
}