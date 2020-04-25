package org.jivesoftware.smack.p557sm.predicates;

import org.jivesoftware.smack.filter.StanzaFilter;

/* renamed from: org.jivesoftware.smack.sm.predicates.Predicate */
public class Predicate {
    public static AfterXStanzas after5Stanzas() {
        return new AfterXStanzas(5);
    }

    public static StanzaFilter forMessagesOrAfter5Stanzas() {
        return new ForMatchingPredicateOrAfterXStanzas(ForEveryMessage.INSTANCE, 5);
    }
}
