package org.jivesoftware.smack.p557sm.predicates;

import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.Stanza;

/* renamed from: org.jivesoftware.smack.sm.predicates.ForEveryStanza */
public class ForEveryStanza implements StanzaFilter {
    public static final ForEveryStanza INSTANCE = new ForEveryStanza();

    private ForEveryStanza() {
    }

    public boolean accept(Stanza stanza) {
        return true;
    }
}
