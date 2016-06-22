package org.spiget.data.resource;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.spiget.data.IdReference;
import org.spiget.data.author.ListedAuthor;
import org.spiget.data.category.ListedCategory;
import org.spiget.data.resource.version.ListedResourceVersion;

/**
 * Represents a resource fetched from the resources list
 */
@Data
@EqualsAndHashCode(callSuper = true,doNotUseGetters = true)
@ToString(callSuper = true,doNotUseGetters = true)
public class ListedResource extends IdReference {

	protected String                name;
	protected String                tag;
	protected ListedResourceVersion version;
	protected ListedAuthor          author;
	protected ListedCategory        category;
	protected ResourceRating        resourceRating;
	protected SpigetIcon            icon;
	protected long                  releaseDate;
	protected long                  updateDate;
	protected int                   downloads;

	public ListedResource(int id, String name) {
		super(id);
		this.name = name;
	}


}
