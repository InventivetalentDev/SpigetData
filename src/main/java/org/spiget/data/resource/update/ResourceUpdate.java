package org.spiget.data.resource.update;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ResourceUpdate {

	protected int    id;
	protected String title;
	protected String description;
	protected long   date;

}
