package org.jivesoftware.smack.filter;

import java.util.Locale;
import org.jivesoftware.smack.packet.Stanza;

public class ToFilter implements StanzaFilter {

    /* renamed from: to */
    private final String f44976to;

    public ToFilter(String str) {
        this.f44976to = str.toLowerCase(Locale.US);
    }

    public boolean accept(Stanza stanza) {
        String to = stanza.getTo();
        if (to == null) {
            return false;
        }
        return to.toLowerCase(Locale.US).equals(this.f44976to);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ToFilter.class.getSimpleName());
        sb.append(": to=");
        sb.append(this.f44976to);
        return sb.toString();
    }
}
