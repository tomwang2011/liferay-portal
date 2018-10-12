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

package com.liferay.portal.workflow.kaleo.model.impl.hibernate;

import com.liferay.portal.dao.orm.hibernate.ModelPropertyAccessor;
import com.liferay.portal.workflow.kaleo.model.KaleoNode;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KaleoNodeModelAccessors {
	public static class KaleoNodeIdAccessor extends ModelPropertyAccessor {
		public KaleoNodeIdAccessor() {
			super(new Function<KaleoNode, Long>() {
					@Override
					public Long apply(KaleoNode kaleoNode) {
						return kaleoNode.getKaleoNodeId();
					}
				},
				new BiConsumer<KaleoNode, Long>() {
					@Override
					public void accept(KaleoNode kaleoNode, Long kaleoNodeId) {
						kaleoNode.setKaleoNodeId(kaleoNodeId);
					}
				});
		}
	}

	public static class GroupIdAccessor extends ModelPropertyAccessor {
		public GroupIdAccessor() {
			super(new Function<KaleoNode, Long>() {
					@Override
					public Long apply(KaleoNode kaleoNode) {
						return kaleoNode.getGroupId();
					}
				},
				new BiConsumer<KaleoNode, Long>() {
					@Override
					public void accept(KaleoNode kaleoNode, Long groupId) {
						kaleoNode.setGroupId(groupId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<KaleoNode, Long>() {
					@Override
					public Long apply(KaleoNode kaleoNode) {
						return kaleoNode.getCompanyId();
					}
				},
				new BiConsumer<KaleoNode, Long>() {
					@Override
					public void accept(KaleoNode kaleoNode, Long companyId) {
						kaleoNode.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<KaleoNode, Long>() {
					@Override
					public Long apply(KaleoNode kaleoNode) {
						return kaleoNode.getUserId();
					}
				},
				new BiConsumer<KaleoNode, Long>() {
					@Override
					public void accept(KaleoNode kaleoNode, Long userId) {
						kaleoNode.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<KaleoNode, String>() {
					@Override
					public String apply(KaleoNode kaleoNode) {
						return kaleoNode.getUserName();
					}
				},
				new BiConsumer<KaleoNode, String>() {
					@Override
					public void accept(KaleoNode kaleoNode, String userName) {
						kaleoNode.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<KaleoNode, Date>() {
					@Override
					public Date apply(KaleoNode kaleoNode) {
						return kaleoNode.getCreateDate();
					}
				},
				new BiConsumer<KaleoNode, Date>() {
					@Override
					public void accept(KaleoNode kaleoNode, Date createDate) {
						kaleoNode.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<KaleoNode, Date>() {
					@Override
					public Date apply(KaleoNode kaleoNode) {
						return kaleoNode.getModifiedDate();
					}
				},
				new BiConsumer<KaleoNode, Date>() {
					@Override
					public void accept(KaleoNode kaleoNode, Date modifiedDate) {
						kaleoNode.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class KaleoDefinitionVersionIdAccessor
		extends ModelPropertyAccessor {
		public KaleoDefinitionVersionIdAccessor() {
			super(new Function<KaleoNode, Long>() {
					@Override
					public Long apply(KaleoNode kaleoNode) {
						return kaleoNode.getKaleoDefinitionVersionId();
					}
				},
				new BiConsumer<KaleoNode, Long>() {
					@Override
					public void accept(KaleoNode kaleoNode,
						Long kaleoDefinitionVersionId) {
						kaleoNode.setKaleoDefinitionVersionId(kaleoDefinitionVersionId);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<KaleoNode, String>() {
					@Override
					public String apply(KaleoNode kaleoNode) {
						return kaleoNode.getName();
					}
				},
				new BiConsumer<KaleoNode, String>() {
					@Override
					public void accept(KaleoNode kaleoNode, String name) {
						kaleoNode.setName(name);
					}
				});
		}
	}

	public static class MetadataAccessor extends ModelPropertyAccessor {
		public MetadataAccessor() {
			super(new Function<KaleoNode, String>() {
					@Override
					public String apply(KaleoNode kaleoNode) {
						return kaleoNode.getMetadata();
					}
				},
				new BiConsumer<KaleoNode, String>() {
					@Override
					public void accept(KaleoNode kaleoNode, String metadata) {
						kaleoNode.setMetadata(metadata);
					}
				});
		}
	}

	public static class DescriptionAccessor extends ModelPropertyAccessor {
		public DescriptionAccessor() {
			super(new Function<KaleoNode, String>() {
					@Override
					public String apply(KaleoNode kaleoNode) {
						return kaleoNode.getDescription();
					}
				},
				new BiConsumer<KaleoNode, String>() {
					@Override
					public void accept(KaleoNode kaleoNode, String description) {
						kaleoNode.setDescription(description);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<KaleoNode, String>() {
					@Override
					public String apply(KaleoNode kaleoNode) {
						return kaleoNode.getType();
					}
				},
				new BiConsumer<KaleoNode, String>() {
					@Override
					public void accept(KaleoNode kaleoNode, String type) {
						kaleoNode.setType(type);
					}
				});
		}
	}

	public static class InitialAccessor extends ModelPropertyAccessor {
		public InitialAccessor() {
			super(new Function<KaleoNode, Boolean>() {
					@Override
					public Boolean apply(KaleoNode kaleoNode) {
						return kaleoNode.getInitial();
					}
				},
				new BiConsumer<KaleoNode, Boolean>() {
					@Override
					public void accept(KaleoNode kaleoNode, Boolean initial) {
						kaleoNode.setInitial(initial);
					}
				});
		}
	}

	public static class TerminalAccessor extends ModelPropertyAccessor {
		public TerminalAccessor() {
			super(new Function<KaleoNode, Boolean>() {
					@Override
					public Boolean apply(KaleoNode kaleoNode) {
						return kaleoNode.getTerminal();
					}
				},
				new BiConsumer<KaleoNode, Boolean>() {
					@Override
					public void accept(KaleoNode kaleoNode, Boolean terminal) {
						kaleoNode.setTerminal(terminal);
					}
				});
		}
	}

	private KaleoNodeModelAccessors() {
	}
}