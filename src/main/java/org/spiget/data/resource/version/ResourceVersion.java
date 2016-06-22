package org.spiget.data.resource.version;

import lombok.*;
import org.spiget.data.resource.ResourceRating;

/**
 * Represents a full resource version
 */
@Data
@EqualsAndHashCode(callSuper = true,doNotUseGetters = true)
@ToString(callSuper = true,doNotUseGetters = true)
public class ResourceVersion extends ListedResourceVersion {

	// Listed
	//	protected String name;
	//	protected long   releaseDate;

	// Full
	protected int            downloads;
	protected ResourceRating resourceRating;
	protected String         url;

	public ResourceVersion(int id, String name) {
		super(id, name);
	}

	public ResourceVersion(int id, String name, long releaseDate) {
		super(id, name, releaseDate);
	}

	public ResourceVersion(ListedResourceVersion base) {
		super(base.id, base.name, base.releaseDate);
	}

}
