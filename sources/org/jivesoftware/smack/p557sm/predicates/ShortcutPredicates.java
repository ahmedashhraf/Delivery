package org.jivesoftware.smack.p557sm.predicates;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.Stanza;

/* renamed from: org.jivesoftware.smack.sm.predicates.ShortcutPredicates */
public class ShortcutPredicates implements StanzaFilter {
    private final Set<StanzaFilter> predicates = new LinkedHashSet();

    public ShortcutPredicates() {
    }

    public boolean accept(Stanza stanza) {
        for (StanzaFilter accept : this.predicates) {
            if (accept.accept(stanza)) {
                return true;
            }
        }
        return false;
    }

    public boolean addPredicate(StanzaFilter stanzaFilter) {
        return this.predicates.add(stanzaFilter);
    }

    public boolean removePredicate(StanzaFilter stanzaFilter) {
        return this.predicates.remove(stanzaFilter);
    }

    public ShortcutPredicates(Collection<? extends StanzaFilter> collection) {
        this.predicates.addAll(collection);
    }
}
