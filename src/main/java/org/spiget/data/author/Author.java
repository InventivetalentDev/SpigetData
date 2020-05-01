package org.spiget.data.author;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;
import org.spiget.data.resource.SpigetIcon;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a full author
 */
@Data
@EqualsAndHashCode(callSuper = true,
				   doNotUseGetters = true)
@ToString(callSuper = true,
		  doNotUseGetters = true)
public class Author extends ListedAuthor {

	public static final Author NULL = new Author(-1, "");

	protected Map<String, String> identities = new HashMap<>();

	public Author(int id) {
		super(id);
	}

	public Author(int id, String name) {
		super(id, name);
	}

	public Author(int id, String name, SpigetIcon icon) {
		super(id, name, icon);
	}

	public Author(@NotNull ListedAuthor base) {
		super(base.id, base.name, base.icon);
	}

	public String getIdentity(String key) {
		return this.identities.get(key);
	}

}
