package org.jivesoftware.smack.filter;

import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Stanza;

public final class StanzaTypeFilter implements StanzaFilter {

    /* renamed from: IQ */
    public static final StanzaTypeFilter f44975IQ = new StanzaTypeFilter(C15617IQ.class);
    public static final StanzaTypeFilter MESSAGE = new StanzaTypeFilter(Message.class);
    public static final StanzaTypeFilter PRESENCE = new StanzaTypeFilter(Presence.class);
    private final Class<? extends Stanza> packetType;

    public StanzaTypeFilter(Class<? extends Stanza> cls) {
        this.packetType = cls;
    }

    public boolean accept(Stanza stanza) {
        return this.packetType.isInstance(stanza);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StanzaTypeFilter.class.getSimpleName());
        sb.append(": ");
        sb.append(this.packetType.getName());
        return sb.toString();
    }
}
