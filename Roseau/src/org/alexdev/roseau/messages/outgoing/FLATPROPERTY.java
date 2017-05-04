package org.alexdev.roseau.messages.outgoing;

import org.alexdev.roseau.messages.OutgoingMessageComposer;
import org.alexdev.roseau.server.messages.Response;

public class FLATPROPERTY extends OutgoingMessageComposer {

	private String property;
	private String data;
	
	public FLATPROPERTY(String property, String data) {
		this.property = property;
		this.data = data;
	}

	@Override
	public void write() {
		response.init("FLATPROPERTY");
		response.appendNewArgument(this.property);
		response.appendPartArgument(this.data);

	}

}
