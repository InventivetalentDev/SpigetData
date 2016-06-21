package org.spiget.data.author;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Author {

	public static final Author NULL = new Author() {{
		this.id = -1;
		this.name = "";
	}};

	// Listed
	protected int    id;
	protected String name;

	public Author(ListedAuthor base) {
		this.id = base.id;
		this.name = base.name;
	}

}
