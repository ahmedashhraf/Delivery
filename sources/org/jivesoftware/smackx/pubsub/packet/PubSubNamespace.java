package org.jivesoftware.smackx.pubsub.packet;

import androidx.core.app.C0770p;
import java.util.Locale;

public enum PubSubNamespace {
    BASIC(null),
    ERROR("errors"),
    EVENT(C0770p.f3524g0),
    OWNER("owner");
    
    private String fragment;

    private PubSubNamespace(String str) {
        this.fragment = str;
    }

    public static PubSubNamespace valueOfFromXmlns(String str) {
        if (str.lastIndexOf(35) != -1) {
            return valueOf(str.substring(str.lastIndexOf(35) + 1).toUpperCase(Locale.US));
        }
        return BASIC;
    }

    public String getFragment() {
        return this.fragment;
    }

    public String getXmlns() {
        String str = "http://jabber.org/protocol/pubsub";
        if (this.fragment == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('#');
        sb.append(this.fragment);
        return sb.toString();
    }
}
