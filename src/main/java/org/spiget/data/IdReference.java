package org.spiget.data;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class IdReference {

	@Getter @SerializedName(value = "_id") public final int id;

}
