package org.jivesoftware.smack.compress.packet;

import org.jivesoftware.smack.packet.FullStreamElement;

public class Compressed extends FullStreamElement {
    public static final String ELEMENT = "compressed";
    public static final Compressed INSTANCE = new Compressed();
    public static final String NAMESPACE = "http://jabber.org/protocol/compress";

    private Compressed() {
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getNamespace() {
        return "http://jabber.org/protocol/compress";
    }

    public String toXML() {
        return "<compressed xmlns='http://jabber.org/protocol/compress'/>";
    }
}
