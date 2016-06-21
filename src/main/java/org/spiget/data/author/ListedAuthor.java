package org.spiget.data.author;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Represents an author fetched from the resources list
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ListedAuthor {

	protected int    id;
	protected String name;

}
