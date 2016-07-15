package org.spiget.data.webhook.event;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import lombok.Data;

@Data
public abstract class WebhookEvent {

	protected static final Gson GSON = new Gson();

	public String name;

	public WebhookEvent(String name) {
		this.name = name;
	}

	public JsonObject toJson() {
		JsonObject json = new JsonObject();
		json.addProperty("event", this.name);
		json.addProperty("timestamp", System.currentTimeMillis());
		json.add("data", dataToJson());
		return json;
	}

	public abstract JsonObject dataToJson();

}
