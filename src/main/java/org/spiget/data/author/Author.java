package org.spiget.data.author;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.spiget.data.resource.SpigetIcon;

/**
 * Represents a full author
 */
@Data
@EqualsAndHashCode(callSuper = true,doNotUseGetters = true)
@ToString(callSuper = true,doNotUseGetters = true)
public class Author extends ListedAuthor {

	public static final Author NULL = new Author(-1, "");

	// Listed
	//	protected String     name;
	//	protected SpigetIcon icon;

	public Author(int id, String name) {
		super(id, name);
	}

	public Author(int id, String name, SpigetIcon icon) {
		super(id, name, icon);
	}

	public Author(ListedAuthor base) {
		super(base.id, base.name, base.icon);
	}

}
