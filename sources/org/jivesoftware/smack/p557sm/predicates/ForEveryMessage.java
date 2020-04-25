package org.jivesoftware.smack.p557sm.predicates;

import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;

/* renamed from: org.jivesoftware.smack.sm.predicates.ForEveryMessage */
public class ForEveryMessage implements StanzaFilter {
    public static final ForEveryMessage INSTANCE = new ForEveryMessage();

    private ForEveryMessage() {
    }

    public boolean accept(Stanza stanza) {
        return stanza instanceof Message;
    }
}
