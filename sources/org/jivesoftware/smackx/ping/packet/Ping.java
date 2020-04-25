package org.jivesoftware.smackx.ping.packet;

import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.SimpleIQ;

public class Ping extends SimpleIQ {
    public static final String ELEMENT = "ping";
    public static final String NAMESPACE = "urn:xmpp:ping";

    public Ping() {
        super(ELEMENT, NAMESPACE);
    }

    public C15617IQ getPong() {
        return C15617IQ.createResultIQ(this);
    }

    public Ping(String str) {
        this();
        setTo(str);
        setType(Type.get);
    }
}
