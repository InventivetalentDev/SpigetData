package org.spiget.data.resource;

import lombok.*;
import org.spiget.data.author.Author;
import org.spiget.data.category.Category;
import org.spiget.data.resource.version.ResourceVersion;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a full resource
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Resource {

	public static final Resource NULL = new Resource(-1, "", Author.NULL, Category.NULL);

	// Listed
	protected int             id;
	protected String          name;
	protected String          tag;
	protected ResourceVersion version;
	protected Author          author;
	protected Category        category;
	protected ResourceRating  resourceRating;
	protected SpigetIcon      icon;
	protected long            releaseDate;
	protected long            updateDate;
	protected int             downloads;

	// Full
	protected String description;
	protected String contributors;
	protected List<String> testedVersions = new ArrayList<String>();

	public Resource(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Resource(int id, String name, Author author, Category category) {
		this(id, name);
		this.author = author;
		this.category = category;
	}

	public Resource(ListedResource base) {
		this.id = base.id;
		this.name = base.name;
		this.tag = base.tag;
		this.version = new ResourceVersion(base.version);
		this.author = new Author(base.author);
		this.category = new Category(base.category);
		this.resourceRating = base.resourceRating;
		this.releaseDate = base.releaseDate;
		this.updateDate = base.updateDate;
		this.downloads = base.downloads;
	}

}
