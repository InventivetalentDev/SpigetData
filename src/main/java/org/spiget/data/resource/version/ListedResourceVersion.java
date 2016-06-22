package org.spiget.data.resource.version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.spiget.data.IdReference;

/**
 * Represents a resource version fetched from the resources list
 */
@Data
@EqualsAndHashCode(callSuper = true,doNotUseGetters = true)
@ToString(callSuper = true,doNotUseGetters = true)
public class ListedResourceVersion extends IdReference {

	protected String name;
	protected long   releaseDate;

	public ListedResourceVersion(int id) {
		super(id);
	}

	public ListedResourceVersion(int id, String name) {
		super(id);
		this.name = name;
	}

	public ListedResourceVersion(int id, String name, long releaseDate) {
		this(id, name);
		this.releaseDate = releaseDate;
	}

}
