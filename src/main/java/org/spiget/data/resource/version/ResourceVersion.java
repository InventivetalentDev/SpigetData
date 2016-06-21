package org.spiget.data.resource.version;

import lombok.*;
import org.spiget.data.resource.ResourceRating;

/**
 * Represents a full resource version
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ResourceVersion {

	// Listed
	protected String name;
	protected long   releaseDate;

	// Full
	protected int            downloads;
	protected ResourceRating resourceRating;
	protected String         url;

	public ResourceVersion(ListedResourceVersion base) {
		this.name = base.name;
		this.releaseDate = base.releaseDate;
	}

}
