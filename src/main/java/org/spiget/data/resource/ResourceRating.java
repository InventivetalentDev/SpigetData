package org.spiget.data.resource;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Contains information about a resource rating
 */
@Data
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class ResourceRating {

	protected int   count;
	protected float average;

}
