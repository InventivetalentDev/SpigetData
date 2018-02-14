package org.spiget.data.resource.version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.spiget.data.IdReference;

/**
 * Represents a resource version fetched from the resources list
 */
@Data
@EqualsAndHashCode(doNotUseGetters = true,
				   callSuper = true)
@ToString(doNotUseGetters = true,
		  callSuper = true)
public class ListedResourceVersion extends IdReference/* The ID isn't really used in this class, it's mainly for ResourceVersion */ {

	protected String name;
	protected long   releaseDate;
	protected int    resource;

	public ListedResourceVersion(int id) {
		super(id);
	}

	public ListedResourceVersion(int id, String name) {
		super(id);
		this.name = name;
	}

	public ListedResourceVersion(int id, String name, long releaseDate) {
		super(id);
		this.name = name;
		this.releaseDate = releaseDate;
	}

}
