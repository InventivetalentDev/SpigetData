package org.spiget.data.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Contains information about a resource rating
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ResourceRating {

	protected int count;
	protected float average;

}
