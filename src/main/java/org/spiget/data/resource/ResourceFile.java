package org.spiget.data.resource;

import lombok.*;

/**
 * Contains information about the resource file for the resource's current version
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class ResourceFile {

	protected String type;
	protected float  size;
	protected String sizeUnit;
	protected String url;
	protected String externalUrl;

}
