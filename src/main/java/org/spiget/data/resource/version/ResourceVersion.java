package org.spiget.data.resource.version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;
import org.spiget.data.Util;
import org.spiget.data.resource.Rating;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * Represents a full resource version
 */
@Data
@EqualsAndHashCode(callSuper = true,
                   doNotUseGetters = true)
@ToString(callSuper = true,
          doNotUseGetters = true)
public class ResourceVersion extends ListedResourceVersion {

	protected UUID 	 uuid;
    protected int    downloads;
    protected Rating rating;

    public ResourceVersion(int id, String name) {
        super(id, name);
    }

    public ResourceVersion(int id, String name, long releaseDate) {
        super(id, name, releaseDate);
    }

    public ResourceVersion(@NotNull ListedResourceVersion base) {
        super(base.id, base.name, base.releaseDate);
    }

    public static UUID makeUuid(int resourceId, int authorId, String versionName, int updateCount, Date date) {
        String versionNameNumber = versionName.replaceAll("[^\\d]", "");
        Calendar calendar = Calendar.getInstance();
        if (date != null) { calendar.setTime(date); }
        String dateString = calendar.get(Calendar.YEAR) + "" + Util.pad((calendar.get(Calendar.MONTH) + 1), 2) + Util.pad(calendar.get(Calendar.DAY_OF_MONTH), 2);
        String stringA = "16" + authorId + "" + resourceId + "" + Util.trim(Util.pad(versionNameNumber, 5), 5);
        String stringB = "16" + resourceId + "" + dateString + "" + Util.trim(Util.pad(updateCount, 2),3);
        return new UUID(Long.parseLong(stringA), Long.parseLong(stringB));
    }

}
