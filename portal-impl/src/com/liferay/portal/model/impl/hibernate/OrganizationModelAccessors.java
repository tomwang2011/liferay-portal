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
import com.liferay.portal.kernel.model.Organization;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OrganizationModelAccessors {
	public static class UuidAccessor extends ModelPropertyAccessor {
		public UuidAccessor() {
			super(new Function<Organization, String>() {
					@Override
					public String apply(Organization organization) {
						return organization.getUuid();
					}
				},
				new BiConsumer<Organization, String>() {
					@Override
					public void accept(Organization organization, String uuid) {
						organization.setUuid(uuid);
					}
				});
		}
	}

	public static class ExternalReferenceCodeAccessor
		extends ModelPropertyAccessor {
		public ExternalReferenceCodeAccessor() {
			super(new Function<Organization, String>() {
					@Override
					public String apply(Organization organization) {
						return organization.getExternalReferenceCode();
					}
				},
				new BiConsumer<Organization, String>() {
					@Override
					public void accept(Organization organization,
						String externalReferenceCode) {
						organization.setExternalReferenceCode(externalReferenceCode);
					}
				});
		}
	}

	public static class OrganizationIdAccessor extends ModelPropertyAccessor {
		public OrganizationIdAccessor() {
			super(new Function<Organization, Long>() {
					@Override
					public Long apply(Organization organization) {
						return organization.getOrganizationId();
					}
				},
				new BiConsumer<Organization, Long>() {
					@Override
					public void accept(Organization organization,
						Long organizationId) {
						organization.setOrganizationId(organizationId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Organization, Long>() {
					@Override
					public Long apply(Organization organization) {
						return organization.getCompanyId();
					}
				},
				new BiConsumer<Organization, Long>() {
					@Override
					public void accept(Organization organization, Long companyId) {
						organization.setCompanyId(companyId);
					}
				});
		}
	}

	public static class UserIdAccessor extends ModelPropertyAccessor {
		public UserIdAccessor() {
			super(new Function<Organization, Long>() {
					@Override
					public Long apply(Organization organization) {
						return organization.getUserId();
					}
				},
				new BiConsumer<Organization, Long>() {
					@Override
					public void accept(Organization organization, Long userId) {
						organization.setUserId(userId);
					}
				});
		}
	}

	public static class UserNameAccessor extends ModelPropertyAccessor {
		public UserNameAccessor() {
			super(new Function<Organization, String>() {
					@Override
					public String apply(Organization organization) {
						return organization.getUserName();
					}
				},
				new BiConsumer<Organization, String>() {
					@Override
					public void accept(Organization organization,
						String userName) {
						organization.setUserName(userName);
					}
				});
		}
	}

	public static class CreateDateAccessor extends ModelPropertyAccessor {
		public CreateDateAccessor() {
			super(new Function<Organization, Date>() {
					@Override
					public Date apply(Organization organization) {
						return organization.getCreateDate();
					}
				},
				new BiConsumer<Organization, Date>() {
					@Override
					public void accept(Organization organization,
						Date createDate) {
						organization.setCreateDate(createDate);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<Organization, Date>() {
					@Override
					public Date apply(Organization organization) {
						return organization.getModifiedDate();
					}
				},
				new BiConsumer<Organization, Date>() {
					@Override
					public void accept(Organization organization,
						Date modifiedDate) {
						organization.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class ParentOrganizationIdAccessor
		extends ModelPropertyAccessor {
		public ParentOrganizationIdAccessor() {
			super(new Function<Organization, Long>() {
					@Override
					public Long apply(Organization organization) {
						return organization.getParentOrganizationId();
					}
				},
				new BiConsumer<Organization, Long>() {
					@Override
					public void accept(Organization organization,
						Long parentOrganizationId) {
						organization.setParentOrganizationId(parentOrganizationId);
					}
				});
		}
	}

	public static class TreePathAccessor extends ModelPropertyAccessor {
		public TreePathAccessor() {
			super(new Function<Organization, String>() {
					@Override
					public String apply(Organization organization) {
						return organization.getTreePath();
					}
				},
				new BiConsumer<Organization, String>() {
					@Override
					public void accept(Organization organization,
						String treePath) {
						organization.setTreePath(treePath);
					}
				});
		}
	}

	public static class NameAccessor extends ModelPropertyAccessor {
		public NameAccessor() {
			super(new Function<Organization, String>() {
					@Override
					public String apply(Organization organization) {
						return organization.getName();
					}
				},
				new BiConsumer<Organization, String>() {
					@Override
					public void accept(Organization organization, String name) {
						organization.setName(name);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<Organization, String>() {
					@Override
					public String apply(Organization organization) {
						return organization.getType();
					}
				},
				new BiConsumer<Organization, String>() {
					@Override
					public void accept(Organization organization, String type) {
						organization.setType(type);
					}
				});
		}
	}

	public static class RecursableAccessor extends ModelPropertyAccessor {
		public RecursableAccessor() {
			super(new Function<Organization, Boolean>() {
					@Override
					public Boolean apply(Organization organization) {
						return organization.getRecursable();
					}
				},
				new BiConsumer<Organization, Boolean>() {
					@Override
					public void accept(Organization organization,
						Boolean recursable) {
						organization.setRecursable(recursable);
					}
				});
		}
	}

	public static class RegionIdAccessor extends ModelPropertyAccessor {
		public RegionIdAccessor() {
			super(new Function<Organization, Long>() {
					@Override
					public Long apply(Organization organization) {
						return organization.getRegionId();
					}
				},
				new BiConsumer<Organization, Long>() {
					@Override
					public void accept(Organization organization, Long regionId) {
						organization.setRegionId(regionId);
					}
				});
		}
	}

	public static class CountryIdAccessor extends ModelPropertyAccessor {
		public CountryIdAccessor() {
			super(new Function<Organization, Long>() {
					@Override
					public Long apply(Organization organization) {
						return organization.getCountryId();
					}
				},
				new BiConsumer<Organization, Long>() {
					@Override
					public void accept(Organization organization, Long countryId) {
						organization.setCountryId(countryId);
					}
				});
		}
	}

	public static class StatusIdAccessor extends ModelPropertyAccessor {
		public StatusIdAccessor() {
			super(new Function<Organization, Long>() {
					@Override
					public Long apply(Organization organization) {
						return organization.getStatusId();
					}
				},
				new BiConsumer<Organization, Long>() {
					@Override
					public void accept(Organization organization, Long statusId) {
						organization.setStatusId(statusId);
					}
				});
		}
	}

	public static class CommentsAccessor extends ModelPropertyAccessor {
		public CommentsAccessor() {
			super(new Function<Organization, String>() {
					@Override
					public String apply(Organization organization) {
						return organization.getComments();
					}
				},
				new BiConsumer<Organization, String>() {
					@Override
					public void accept(Organization organization,
						String comments) {
						organization.setComments(comments);
					}
				});
		}
	}

	public static class LogoIdAccessor extends ModelPropertyAccessor {
		public LogoIdAccessor() {
			super(new Function<Organization, Long>() {
					@Override
					public Long apply(Organization organization) {
						return organization.getLogoId();
					}
				},
				new BiConsumer<Organization, Long>() {
					@Override
					public void accept(Organization organization, Long logoId) {
						organization.setLogoId(logoId);
					}
				});
		}
	}

	private OrganizationModelAccessors() {
	}
}