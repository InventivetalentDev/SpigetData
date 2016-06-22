package org.spiget.data.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Contains a link to the resource's icon and its data as Base64
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class SpigetIcon {

	protected String url;
	protected String data;

}
