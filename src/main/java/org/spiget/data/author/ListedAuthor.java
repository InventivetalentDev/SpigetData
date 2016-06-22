package org.spiget.data.author;

import lombok.*;

/**
 * Represents an author fetched from the resources list
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ListedAuthor {

	protected int    id;
	protected String name;

}
