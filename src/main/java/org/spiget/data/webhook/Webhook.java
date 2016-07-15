package org.spiget.data.webhook;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Webhook {

	@SerializedName(value = "_id") public String id;
	public                                String url;
	public                                int    failedConnections;
	public Set<String> events = new HashSet<>();

	public boolean applyEvent(String event) {
		return events.contains(event);
	}

}
