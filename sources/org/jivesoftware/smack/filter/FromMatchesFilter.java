package org.jivesoftware.smack.filter;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.util.Locale;
import org.jivesoftware.smack.packet.Stanza;
import p205i.p486d.p487a.C14055b;

public class FromMatchesFilter implements StanzaFilter {
    private final String address;
    private final boolean matchBareJID;

    public FromMatchesFilter(String str, boolean z) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = str.toLowerCase(Locale.US);
        }
        this.address = str2;
        this.matchBareJID = z;
    }

    public static FromMatchesFilter create(String str) {
        return new FromMatchesFilter(str, "".equals(C14055b.m60648h(str)));
    }

    public static FromMatchesFilter createBare(String str) {
        return new FromMatchesFilter(str == null ? null : C14055b.m60645e(str), true);
    }

    public static FromMatchesFilter createFull(String str) {
        return new FromMatchesFilter(str, false);
    }

    public boolean accept(Stanza stanza) {
        String from = stanza.getFrom();
        if (from == null) {
            return this.address == null;
        }
        String lowerCase = from.toLowerCase(Locale.US);
        if (this.matchBareJID) {
            lowerCase = C14055b.m60645e(lowerCase);
        }
        return lowerCase.equals(this.address);
    }

    public String toString() {
        String str = this.matchBareJID ? "bare" : MessengerShareContentUtility.WEBVIEW_RATIO_FULL;
        StringBuilder sb = new StringBuilder();
        sb.append(FromMatchesFilter.class.getSimpleName());
        sb.append(" (");
        sb.append(str);
        sb.append("): ");
        sb.append(this.address);
        return sb.toString();
    }
}
