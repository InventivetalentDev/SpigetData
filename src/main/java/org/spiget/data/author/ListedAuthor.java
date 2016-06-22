package org.spiget.data.author;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.spiget.data.IdReference;
import org.spiget.data.resource.SpigetIcon;

/**
 * Represents an author fetched from the resources list
 */
@Data
@EqualsAndHashCode(callSuper = true,doNotUseGetters = true)
@ToString(callSuper = true,doNotUseGetters = true)
public class ListedAuthor extends IdReference {

	protected String     name;
	protected SpigetIcon icon;

	public ListedAuthor(int id, String name) {
		super(id);
		this.name = name;
	}

	public ListedAuthor(int id, String name, SpigetIcon icon) {
		this(id, name);
		this.icon = icon;
	}

}
