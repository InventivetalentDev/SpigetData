package org.spiget.data.resource;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;
import org.spiget.data.author.Author;
import org.spiget.data.category.Category;
import org.spiget.data.resource.update.ResourceUpdate;
import org.spiget.data.resource.version.ResourceVersion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a full resource
 */
@Data
@EqualsAndHashCode(callSuper = true,
				   doNotUseGetters = true)
@ToString(callSuper = true,
		  doNotUseGetters = true)
public class Resource extends ListedResource {

	public static final Resource NULL = new Resource(-1, "", Author.NULL, Category.NULL);

	protected boolean      external;
	protected ResourceFile file;
	protected String       description;
	protected String       contributors;
	protected int          likes;
	protected String       sourceCodeLink;
	protected String       donationLink;
	protected String       supportedLanguages;
	protected List<String>          testedVersions = new ArrayList<>();
	protected List<ResourceVersion> versions       = new ArrayList<>();
	protected List<ResourceUpdate>  updates        = new ArrayList<>();
	protected List<ResourceReview>  reviews        = new ArrayList<>();
	protected Map<String, String>   links          = new HashMap<>();

	public Resource(int id) {
		super(id);
	}

	public Resource(int id, String name) {
		super(id, name);
	}

	public Resource(int id, String name, Author author, Category category) {
		this(id, name);
		this.author = author;
		this.category = category;
	}

	public Resource(@NotNull ListedResource base) {
		super(base.id, base.name);
		this.name = base.name;
		this.tag = base.tag;
		this.version = new ResourceVersion(base.version);
		this.author = new Author(base.author);
		this.category = new Category(base.category);
		this.rating = base.rating;
		this.icon = base.icon;
		this.releaseDate = base.releaseDate;
		this.updateDate = base.updateDate;
		this.downloads = base.downloads;
		this.premium = base.premium;
		this.price = base.price;
		this.currency = base.currency;
	}

}
