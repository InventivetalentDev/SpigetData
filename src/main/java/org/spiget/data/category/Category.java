package org.spiget.data.category;

import lombok.*;

/**
 * Represents a full category
 */
@Data
@EqualsAndHashCode(callSuper = true,doNotUseGetters = true)
@ToString(callSuper = true,doNotUseGetters = true)
public class Category extends ListedCategory {

	public static final Category NULL = new Category(-1, "");

	// Listed
	//	protected int    id;
	//	protected String name;

	public Category(int id, String name) {
		super(id, name);
	}

	public Category(ListedCategory base) {
		super(base.id, base.name);
	}

}
