package org.spiget.data.author;

import lombok.*;

/**
 * Represents a full author
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Author {

	public static final Author NULL = new Author(-1, "");

	// Listed
	protected int    id;
	protected String name;

//	public Author(int id, String name) {
//		this.id = id;
//		this.name = name;
//	}

	public Author(ListedAuthor base) {
		this.id = base.id;
		this.name = base.name;
	}

}
