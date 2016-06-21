package org.spiget.data.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.spiget.data.author.ListedAuthor;
import org.spiget.data.category.ListedCategory;
import org.spiget.data.resource.version.ListedResourceVersion;

@Data
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
	protected long                  releaseDate;
	protected long                  updateDate;
	protected int                   downloads;

}
