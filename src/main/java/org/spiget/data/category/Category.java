package org.spiget.data.category;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a full category
 */
@Data
@EqualsAndHashCode(callSuper = true,
				   doNotUseGetters = true)
@ToString(callSuper = true,
		  doNotUseGetters = true)
public class Category extends ListedCategory {

	public static final Category NULL = new Category(-1, "");

	public Category(int id) {
		super(id);
	}

	public Category(int id, String name) {
		super(id, name);
	}

	public Category(@NotNull ListedCategory base) {
		super(base.id, base.name);
	}

}
