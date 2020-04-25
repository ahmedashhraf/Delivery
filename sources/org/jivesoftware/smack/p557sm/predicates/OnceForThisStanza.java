package org.jivesoftware.smack.p557sm.predicates;

import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.util.StringUtils;

/* renamed from: org.jivesoftware.smack.sm.predicates.OnceForThisStanza */
public class OnceForThisStanza implements StanzaFilter {
    private final XMPPTCPConnection connection;

    /* renamed from: id */
    private final String f44991id;

    private OnceForThisStanza(XMPPTCPConnection xMPPTCPConnection, Stanza stanza) {
        this.connection = xMPPTCPConnection;
        this.f44991id = stanza.getStanzaId();
        if (StringUtils.isNullOrEmpty(this.f44991id)) {
            throw new IllegalArgumentException("Stanza ID must be set");
        }
    }

    public static void setup(XMPPTCPConnection xMPPTCPConnection, Stanza stanza) {
        xMPPTCPConnection.addRequestAckPredicate(new OnceForThisStanza(xMPPTCPConnection, stanza));
    }

    public boolean accept(Stanza stanza) {
        String stanzaId = stanza.getStanzaId();
        if (StringUtils.isNullOrEmpty(stanzaId) || !this.f44991id.equals(stanzaId)) {
            return false;
        }
        this.connection.removeRequestAckPredicate(this);
        return true;
    }
}
