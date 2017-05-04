package org.alexdev.roseau.messages.outgoing;

import org.alexdev.roseau.messages.OutgoingMessageComposer;
import org.alexdev.roseau.server.messages.Response;

public class REMOVEWALLITEM extends OutgoingMessageComposer {

	private int id;

	public REMOVEWALLITEM(int i) {
		this.id = i;
	}

	@Override
	public void write() {
		response.init("REMOVEITEM");
		response.appendNewArgument(String.valueOf(this.id));
	}

}
