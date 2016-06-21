package org.spiget.data.resource.version;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ListedResourceVersion {

	protected String name;
	protected long releaseDate;

}
