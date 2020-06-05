package org.spiget.data.resource;

import lombok.*;

/**
 * Contains a link to the resource's icon and its data as Base64
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString(exclude = "data")
public class SpigetIcon {

	protected String url;
	protected String data;

	protected String info;
	protected String hash;

	public SpigetIcon(String url, String data) {
		this.url = url;
		this.data = data;
	}

}
