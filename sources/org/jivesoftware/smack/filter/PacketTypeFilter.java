package org.jivesoftware.smack.filter;

import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Stanza;

@Deprecated
public class PacketTypeFilter implements StanzaFilter {
    public static final PacketTypeFilter MESSAGE = new PacketTypeFilter(Message.class);
    public static final PacketTypeFilter PRESENCE = new PacketTypeFilter(Presence.class);
    private final Class<? extends Stanza> packetType;

    public PacketTypeFilter(Class<? extends Stanza> cls) {
        this.packetType = cls;
    }

    public boolean accept(Stanza stanza) {
        return this.packetType.isInstance(stanza);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PacketTypeFilter.class.getSimpleName());
        sb.append(": ");
        sb.append(this.packetType.getName());
        return sb.toString();
    }
}
