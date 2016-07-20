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

	protected int    downloads;
	protected Rating rating;

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
