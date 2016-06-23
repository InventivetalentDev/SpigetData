package org.spiget.data.resource;

import lombok.*;
import org.spiget.data.author.Author;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class ResourceReview {

	protected Author         author;// Not necessarily an author, but a reference to the member who posted this review
	protected ResourceRating rating;
	protected String         message;
	protected String         version;
	protected long           date;
	protected Author         responseAuthor;
	protected String         responseMessage;

}
