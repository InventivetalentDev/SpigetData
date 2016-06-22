package org.spiget.data.resource.version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Represents a resource version fetched from the resources list
 */
@Data
@EqualsAndHashCode(callSuper = true,
				   doNotUseGetters = true)
@ToString(callSuper = true,
		  doNotUseGetters = true)
public class ListedResourceVersion {

	protected String name;
	protected long   releaseDate;

	public ListedResourceVersion(String name) {
		this.name = name;
	}

	public ListedResourceVersion(String name, long releaseDate) {
		this.releaseDate = releaseDate;
	}

}
