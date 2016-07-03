package org.spiget.data.category;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.spiget.data.IdReference;

/**
 * Represents a category fetched from the resources list
 */
@Data
@EqualsAndHashCode(callSuper = true,
				   doNotUseGetters = true)
@ToString(callSuper = true,
		  doNotUseGetters = true)
public class ListedCategory extends IdReference {

	protected String name;

	public ListedCategory(int id) {
		super(id);
	}

	public ListedCategory(int id, String name) {
		super(id);
		this.name = name;
	}

}
