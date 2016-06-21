package org.spiget.data.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Contains information about the resource file for the resource's current version
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ResourceFile {

	protected String type;
	protected String size;
	protected String url;

}
