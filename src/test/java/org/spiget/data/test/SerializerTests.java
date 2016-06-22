package org.spiget.data.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Test;
import org.spiget.data.author.Author;
import org.spiget.data.author.ListedAuthor;
import org.spiget.data.category.Category;
import org.spiget.data.category.ListedCategory;
import org.spiget.data.resource.ListedResource;
import org.spiget.data.resource.Resource;
import org.spiget.data.resource.version.ListedResourceVersion;

import java.util.Arrays;

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

	// Test whether gson properly serializes a ListedVersion variable assigned with a Resource object
	@Test
	public void extendedResourceSerializeTest() {
		ListedResource listedResource = new ListedResource(12345, "listed resource");
		listedResource.setAuthor(new ListedAuthor(6643, "inventivetalent"));
		listedResource.setCategory(new ListedCategory(22, "Mechanics"));
		listedResource.setVersion(new ListedResourceVersion("1.0"));
		assertEquals(12345, listedResource.getId());
		assertEquals("listed resource", listedResource.getName());

		listedResource = new Resource(listedResource);
		((Resource) listedResource).setDescription("a very cool description");
		((Resource) listedResource).setTestedVersions(Arrays.asList("1.7", "1.10", "1.21"));
		assertEquals("a very cool description", ((Resource) listedResource).getDescription());
		assertEquals(Arrays.asList("1.7", "1.10", "1.21"), ((Resource) listedResource).getTestedVersions());

		String jsonString = gson.toJson(listedResource);
		JsonObject jsonObject = new JsonParser().parse(jsonString).getAsJsonObject();

		assertEquals(12345, jsonObject.get("_id").getAsInt());
		assertEquals("listed resource", jsonObject.get("name").getAsString());
		assertEquals("a very cool description", jsonObject.get("description").getAsString());
		assertEquals("1.7", jsonObject.get("testedVersions").getAsJsonArray().get(0).getAsString());
	}

}
