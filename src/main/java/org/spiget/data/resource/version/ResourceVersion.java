package org.spiget.data.resource.version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.spiget.data.resource.Rating;

/**
 * Represents a full resource version
 */
@Data
@EqualsAndHashCode(callSuper = true,
				   doNotUseGetters = true)
@ToString(callSuper = true,
		  doNotUseGetters = true)
public class ResourceVersion extends ListedResourceVersion {

	// Listed
	//	protected String name;
	//	protected long   releaseDate;

	// Full
	protected int    downloads;
	protected Rating rating;
	protected String url;

	public ResourceVersion(String name) {
		super(name);
	}

	public ResourceVersion(String name, long releaseDate) {
		super(name, releaseDate);
	}

	public ResourceVersion(ListedResourceVersion base) {
		super(base.name, base.releaseDate);
	}

}
