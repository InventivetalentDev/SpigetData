package org.spiget.data.resource;

import lombok.*;
import org.spiget.data.author.ListedAuthor;
import org.spiget.data.category.ListedCategory;
import org.spiget.data.resource.version.ListedResourceVersion;

/**
 * Represents a resource fetched from the resources list
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ListedResource {

	protected int                   id;
	protected String                name;
	protected String                tag;
	protected ListedResourceVersion version;
	protected ListedAuthor          author;
	protected ListedCategory        category;
	protected ResourceRating        resourceRating;
	protected ResourceIcon          icon;
	protected long                  releaseDate;
	protected long                  updateDate;
	protected int                   downloads;

}
