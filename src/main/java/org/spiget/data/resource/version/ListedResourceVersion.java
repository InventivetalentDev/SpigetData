package org.spiget.data.resource.version;

import lombok.*;

/**
 * Represents a resource version fetched from the resources list
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ListedResourceVersion {

	protected String name;
	protected long   releaseDate;

}
