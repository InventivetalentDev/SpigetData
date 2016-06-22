package org.spiget.data.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import org.junit.Test;
import org.spiget.data.author.Author;
import org.spiget.data.category.Category;
import org.spiget.data.resource.Resource;

import static org.junit.Assert.assertEquals;

public class SerializerTests {

	final Gson gson = new GsonBuilder().serializeNulls().create();

	@Test
	public void resourceSerializeTest() {
		Resource resource = new Resource(1234, "My awesome resource");
		resource.setAuthor(new Author(6643, "inventivetalent"));
		resource.setCategory(new Category(1, "stuff"));
		JsonObject json = gson.toJsonTree(resource).getAsJsonObject();
		System.out.println(json);

		assertEquals(1234, json.get("_id").getAsInt());
		assertEquals("My awesome resource", json.get("name").getAsString());
	}

}
