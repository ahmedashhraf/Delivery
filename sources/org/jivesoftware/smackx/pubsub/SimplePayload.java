package org.jivesoftware.smackx.pubsub;

import org.jivesoftware.smack.packet.ExtensionElement;

public class SimplePayload implements ExtensionElement {
    private final String elemName;

    /* renamed from: ns */
    private final String f45010ns;
    private final CharSequence payload;

    public SimplePayload(String str, String str2, CharSequence charSequence) {
        this.elemName = str;
        this.payload = charSequence;
        this.f45010ns = str2;
    }

    public String getElementName() {
        return this.elemName;
    }

    public String getNamespace() {
        return this.f45010ns;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SimplePayload.class.getName());
        sb.append("payload [");
        sb.append(toXML());
        sb.append("]");
        return sb.toString();
    }

    public CharSequence toXML() {
        return this.payload;
    }
}
