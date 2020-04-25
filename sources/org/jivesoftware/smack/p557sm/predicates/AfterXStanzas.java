package org.jivesoftware.smack.p557sm.predicates;

import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.Stanza;

/* renamed from: org.jivesoftware.smack.sm.predicates.AfterXStanzas */
public class AfterXStanzas implements StanzaFilter {
    final int count;
    int currentCount = 0;

    public AfterXStanzas(int i) {
        this.count = i;
    }

    public synchronized boolean accept(Stanza stanza) {
        this.currentCount++;
        if (this.currentCount != this.count) {
            return false;
        }
        resetCounter();
        return true;
    }

    public synchronized void resetCounter() {
        this.currentCount = 0;
    }
}
