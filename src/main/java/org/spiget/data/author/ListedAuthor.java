package org.spiget.data.author;

import lombok.*;
import org.spiget.data.resource.SpigetIcon;

/**
 * Represents an author fetched from the resources list
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ListedAuthor {

	protected int        id;
	protected String     name;
	protected SpigetIcon icon;

}
