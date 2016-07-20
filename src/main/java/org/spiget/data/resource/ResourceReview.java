package org.spiget.data.resource;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.spiget.data.IdReference;
import org.spiget.data.author.ListedAuthor;

@Data
@EqualsAndHashCode(doNotUseGetters = true,
				   callSuper = true)
@ToString(doNotUseGetters = true,
		  callSuper = true)
public class ResourceReview extends IdReference {

	protected ListedAuthor author;// Not necessarily an author, but a reference to the member who posted this review
	protected Rating       rating;
	protected String       message;
	protected String       version;
	protected long         date;
	protected String       responseMessage;

}
