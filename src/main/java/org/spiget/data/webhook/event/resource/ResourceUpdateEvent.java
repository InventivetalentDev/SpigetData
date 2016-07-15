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

	public ResourceUpdateEvent(Resource resource) {
		super("resource-update");
		this.resource = resource;
	}

	@Override
	public JsonObject dataToJson() {
		return GSON.toJsonTree(this.resource).getAsJsonObject();
	}

}
