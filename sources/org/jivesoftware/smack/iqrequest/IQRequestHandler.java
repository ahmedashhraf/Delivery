package org.jivesoftware.smack.iqrequest;

import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;

public interface IQRequestHandler {

    public enum Mode {
        sync,
        async
    }

    String getElement();

    Mode getMode();

    String getNamespace();

    Type getType();

    C15617IQ handleIQRequest(C15617IQ iq);
}
