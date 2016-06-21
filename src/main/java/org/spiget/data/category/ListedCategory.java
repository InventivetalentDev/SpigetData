package org.spiget.data.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Represents a category fetched from the resources list
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ListedCategory {

	protected int id;
	protected String name;

}
