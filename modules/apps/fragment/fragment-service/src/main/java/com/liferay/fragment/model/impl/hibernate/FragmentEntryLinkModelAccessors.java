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

import com.liferay.fragment.model.FragmentEntryLink;

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
public class FragmentEntryLinkModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<FragmentEntryLink, String>() {
					@Override
					public String apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getUuid();
					}
				},
				new BiConsumer<FragmentEntryLink, String>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						String uuid) {
						fragmentEntryLink.setUuid(uuid);
					}
				});
		}
	}

	public static class FragmentEntryLinkIdAccessor
		extends ModelPropertyAccessor {
		public FragmentEntryLinkIdAccessor() {
			super(new Function<FragmentEntryLink, Long>() {
					@Override
					public Long apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getFragmentEntryLinkId();
					}
				},
				new BiConsumer<FragmentEntryLink, Long>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						Long fragmentEntryLinkId) {
						fragmentEntryLink.setFragmentEntryLinkId(fragmentEntryLinkId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<FragmentEntryLink, Long>() {
					@Override
					public Long apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getGroupId();
					}
				},
				new BiConsumer<FragmentEntryLink, Long>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						Long groupId) {
						fragmentEntryLink.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<FragmentEntryLink, Long>() {
					@Override
					public Long apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getCompanyId();
					}
				},
				new BiConsumer<FragmentEntryLink, Long>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						Long companyId) {
						fragmentEntryLink.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<FragmentEntryLink, Long>() {
					@Override
					public Long apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getUserId();
					}
				},
				new BiConsumer<FragmentEntryLink, Long>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						Long userId) {
						fragmentEntryLink.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<FragmentEntryLink, String>() {
					@Override
					public String apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getUserName();
					}
				},
				new BiConsumer<FragmentEntryLink, String>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						String userName) {
						fragmentEntryLink.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<FragmentEntryLink, Date>() {
					@Override
					public Date apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getCreateDate();
					}
				},
				new BiConsumer<FragmentEntryLink, Date>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						Date createDate) {
						fragmentEntryLink.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<FragmentEntryLink, Date>() {
					@Override
					public Date apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getModifiedDate();
					}
				},
				new BiConsumer<FragmentEntryLink, Date>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						Date modifiedDate) {
						fragmentEntryLink.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class OriginalFragmentEntryLinkIdAccessor
		extends ModelPropertyAccessor {
		public OriginalFragmentEntryLinkIdAccessor() {
			super(new Function<FragmentEntryLink, Long>() {
					@Override
					public Long apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getOriginalFragmentEntryLinkId();
					}
				},
				new BiConsumer<FragmentEntryLink, Long>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						Long originalFragmentEntryLinkId) {
						fragmentEntryLink.setOriginalFragmentEntryLinkId(originalFragmentEntryLinkId);
					}
				});
		}
	}

	public static class FragmentEntryIdAccessor extends ModelPropertyAccessor {
		public FragmentEntryIdAccessor() {
			super(new Function<FragmentEntryLink, Long>() {
					@Override
					public Long apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getFragmentEntryId();
					}
				},
				new BiConsumer<FragmentEntryLink, Long>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						Long fragmentEntryId) {
						fragmentEntryLink.setFragmentEntryId(fragmentEntryId);
					}
				});
		}
	}

	public static class ClassNameIdAccessor extends ModelPropertyAccessor {
		public ClassNameIdAccessor() {
			super(new Function<FragmentEntryLink, Long>() {
					@Override
					public Long apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getClassNameId();
					}
				},
				new BiConsumer<FragmentEntryLink, Long>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						Long classNameId) {
						fragmentEntryLink.setClassNameId(classNameId);
					}
				});
		}
	}

	public static class ClassPKAccessor extends ModelPropertyAccessor {
		public ClassPKAccessor() {
			super(new Function<FragmentEntryLink, Long>() {
					@Override
					public Long apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getClassPK();
					}
				},
				new BiConsumer<FragmentEntryLink, Long>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						Long classPK) {
						fragmentEntryLink.setClassPK(classPK);
					}
				});
		}
	}

	public static class CssAccessor extends ModelPropertyAccessor {
		public CssAccessor() {
			super(new Function<FragmentEntryLink, String>() {
					@Override
					public String apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getCss();
					}
				},
				new BiConsumer<FragmentEntryLink, String>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						String css) {
						fragmentEntryLink.setCss(css);
					}
				});
		}
	}

	public static class HtmlAccessor extends ModelPropertyAccessor {
		public HtmlAccessor() {
			super(new Function<FragmentEntryLink, String>() {
					@Override
					public String apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getHtml();
					}
				},
				new BiConsumer<FragmentEntryLink, String>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						String html) {
						fragmentEntryLink.setHtml(html);
					}
				});
		}
	}

	public static class JsAccessor extends ModelPropertyAccessor {
		public JsAccessor() {
			super(new Function<FragmentEntryLink, String>() {
					@Override
					public String apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getJs();
					}
				},
				new BiConsumer<FragmentEntryLink, String>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						String js) {
						fragmentEntryLink.setJs(js);
					}
				});
		}
	}

	public static class EditableValuesAccessor extends ModelPropertyAccessor {
		public EditableValuesAccessor() {
			super(new Function<FragmentEntryLink, String>() {
					@Override
					public String apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getEditableValues();
					}
				},
				new BiConsumer<FragmentEntryLink, String>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						String editableValues) {
						fragmentEntryLink.setEditableValues(editableValues);
					}
				});
		}
	}

	public static class PositionAccessor extends ModelPropertyAccessor {
		public PositionAccessor() {
			super(new Function<FragmentEntryLink, Integer>() {
					@Override
					public Integer apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getPosition();
					}
				},
				new BiConsumer<FragmentEntryLink, Integer>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						Integer position) {
						fragmentEntryLink.setPosition(position);
					}
				});
		}
	}

	public static class LastPropagationDateAccessor
		extends ModelPropertyAccessor {
		public LastPropagationDateAccessor() {
			super(new Function<FragmentEntryLink, Date>() {
					@Override
					public Date apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getLastPropagationDate();
					}
				},
				new BiConsumer<FragmentEntryLink, Date>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						Date lastPropagationDate) {
						fragmentEntryLink.setLastPropagationDate(lastPropagationDate);
					}
				});
		}
	}

	public static class NamespaceAccessor extends ModelPropertyAccessor {
		public NamespaceAccessor() {
			super(new Function<FragmentEntryLink, String>() {
					@Override
					public String apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getNamespace();
					}
				},
				new BiConsumer<FragmentEntryLink, String>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						String namespace) {
						fragmentEntryLink.setNamespace(namespace);
					}
				});
		}
	}

	public static class LastPublishDateAccessor extends ModelPropertyAccessor {
		public LastPublishDateAccessor() {
			super(new Function<FragmentEntryLink, Date>() {
					@Override
					public Date apply(FragmentEntryLink fragmentEntryLink) {
						return fragmentEntryLink.getLastPublishDate();
					}
				},
				new BiConsumer<FragmentEntryLink, Date>() {
					@Override
					public void accept(FragmentEntryLink fragmentEntryLink,
						Date lastPublishDate) {
						fragmentEntryLink.setLastPublishDate(lastPublishDate);
					}
				});
		}
	}

	private FragmentEntryLinkModelAccessors() {
	}
}