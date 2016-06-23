package org.spiget.data.resource;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.spiget.data.IdReference;
import org.spiget.data.author.Author;

@Data
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class ResourceReview extends IdReference {

	protected Author author;// Not necessarily an author, but a reference to the member who posted this review
	protected Rating rating;
	protected String message;
	protected String version;
	protected long   date;
	protected Author responseAuthor;
	protected String responseMessage;

	public ResourceReview(int id) {
		super(id);
	}

}
