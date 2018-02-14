package org.spiget.data.resource.update;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.spiget.data.IdReference;

@Data
@EqualsAndHashCode(callSuper = true,
				   doNotUseGetters = true)
@ToString(callSuper = true,
		  doNotUseGetters = true)
public class ResourceUpdate extends IdReference {

	protected String title;
	protected String description;
	protected long   date;
	protected int    likes;
	protected int    resource;

	public ResourceUpdate(int id) {
		super(id);
	}

	public ResourceUpdate(int id, String title, String description, long date) {
		super(id);
		this.title = title;
		this.description = description;
		this.date = date;
	}

}
