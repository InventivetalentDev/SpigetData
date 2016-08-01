package org.spiget.data.webhook.event.resource;

import com.google.gson.JsonObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.spiget.data.resource.Resource;
import org.spiget.data.webhook.event.WebhookEvent;

@Data
@EqualsAndHashCode(callSuper = true)
public class ResourceUpdateEvent extends WebhookEvent {

	private final Resource resource;
	private final String   newVersion;

	public ResourceUpdateEvent(Resource resource, String newVersion) {
		super("resource-update");
		this.resource = resource;
		this.newVersion = newVersion;
	}

	@Override
	public JsonObject dataToJson() {
		JsonObject jsonObject = GSON.toJsonTree(this.resource).getAsJsonObject();
		jsonObject.addProperty("newVersion", newVersion);
		return jsonObject;
	}

}
