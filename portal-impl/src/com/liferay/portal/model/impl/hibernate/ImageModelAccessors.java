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
import com.liferay.portal.kernel.model.Image;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Model property accessors to be used by hibernate.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ImageModelAccessors {
	public static class ImageIdAccessor extends ModelPropertyAccessor {
		public ImageIdAccessor() {
			super(new Function<Image, Long>() {
					@Override
					public Long apply(Image image) {
						return image.getImageId();
					}
				},
				new BiConsumer<Image, Long>() {
					@Override
					public void accept(Image image, Long imageId) {
						image.setImageId(imageId);
					}
				});
		}
	}

	public static class CompanyIdAccessor extends ModelPropertyAccessor {
		public CompanyIdAccessor() {
			super(new Function<Image, Long>() {
					@Override
					public Long apply(Image image) {
						return image.getCompanyId();
					}
				},
				new BiConsumer<Image, Long>() {
					@Override
					public void accept(Image image, Long companyId) {
						image.setCompanyId(companyId);
					}
				});
		}
	}

	public static class ModifiedDateAccessor extends ModelPropertyAccessor {
		public ModifiedDateAccessor() {
			super(new Function<Image, Date>() {
					@Override
					public Date apply(Image image) {
						return image.getModifiedDate();
					}
				},
				new BiConsumer<Image, Date>() {
					@Override
					public void accept(Image image, Date modifiedDate) {
						image.setModifiedDate(modifiedDate);
					}
				});
		}
	}

	public static class TypeAccessor extends ModelPropertyAccessor {
		public TypeAccessor() {
			super(new Function<Image, String>() {
					@Override
					public String apply(Image image) {
						return image.getType();
					}
				},
				new BiConsumer<Image, String>() {
					@Override
					public void accept(Image image, String type) {
						image.setType(type);
					}
				});
		}
	}

	public static class HeightAccessor extends ModelPropertyAccessor {
		public HeightAccessor() {
			super(new Function<Image, Integer>() {
					@Override
					public Integer apply(Image image) {
						return image.getHeight();
					}
				},
				new BiConsumer<Image, Integer>() {
					@Override
					public void accept(Image image, Integer height) {
						image.setHeight(height);
					}
				});
		}
	}

	public static class WidthAccessor extends ModelPropertyAccessor {
		public WidthAccessor() {
			super(new Function<Image, Integer>() {
					@Override
					public Integer apply(Image image) {
						return image.getWidth();
					}
				},
				new BiConsumer<Image, Integer>() {
					@Override
					public void accept(Image image, Integer width) {
						image.setWidth(width);
					}
				});
		}
	}

	public static class SizeAccessor extends ModelPropertyAccessor {
		public SizeAccessor() {
			super(new Function<Image, Integer>() {
					@Override
					public Integer apply(Image image) {
						return image.getSize();
					}
				},
				new BiConsumer<Image, Integer>() {
					@Override
					public void accept(Image image, Integer size) {
						image.setSize(size);
					}
				});
		}
	}

	private ImageModelAccessors() {
	}
}