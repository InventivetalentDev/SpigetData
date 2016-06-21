package org.spiget.data.category;

import lombok.*;

/**
 * Represents a full category
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Category {

	public static final Category NULL = new Category() {{
		this.id = -1;
		this.name = "";
	}};

	// Listed
	protected int    id;
	protected String name;

	public Category(ListedCategory base) {
		this.id = base.id;
		this.name = base.name;
	}

}
