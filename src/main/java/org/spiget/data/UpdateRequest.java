package org.spiget.data;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(doNotUseGetters = true)
public class UpdateRequest {

	protected int     requestedId;
	protected long    requested;
	protected boolean versions;
	protected boolean updates;
	protected boolean reviews;
	protected boolean delete;

}
