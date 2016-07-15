package org.spiget.data.webhook.event.author;

import com.google.gson.JsonObject;
import lombok.Data;
import org.spiget.data.author.Author;
import org.spiget.data.webhook.event.WebhookEvent;

@Data
public class NewAuthor extends WebhookEvent {
	
	private final Author author;

	public NewAuthor(Author author) {
		super("new-author");
		this.author = author;
	}

	@Override
	public JsonObject dataToJson() {
		return GSON.toJsonTree(this.author).getAsJsonObject();
	}
}
