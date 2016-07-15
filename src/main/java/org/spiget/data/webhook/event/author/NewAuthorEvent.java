package org.spiget.data.webhook.event.author;

import com.google.gson.JsonObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.spiget.data.author.Author;
import org.spiget.data.webhook.event.WebhookEvent;

@Data
@EqualsAndHashCode(callSuper = true)
public class NewAuthorEvent extends WebhookEvent {

	private final Author author;

	public NewAuthorEvent(Author author) {
		super("new-author");
		this.author = author;
	}

	@Override
	public JsonObject dataToJson() {
		return GSON.toJsonTree(this.author).getAsJsonObject();
	}
}
