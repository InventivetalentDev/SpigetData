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
	private final int updateId;

	@Deprecated
	public ResourceUpdateEvent(Resource resource, String newVersion) {
		super("resource-update");
		this.resource = resource;
		this.newVersion = newVersion;
		this.updateId = -1;
	}

	public ResourceUpdateEvent(Resource resource, String newVersion, int updateId) {
		super("resource-update");
		this.resource = resource;
		this.newVersion = newVersion;
		this.updateId = updateId;
	}

	@Override
	public JsonObject dataToJson() {
		JsonObject jsonObject = GSON.toJsonTree(this.resource).getAsJsonObject();
		jsonObject.addProperty("newVersion", newVersion);
		jsonObject.addProperty("updateId", updateId);
		return jsonObject;
	}

}
