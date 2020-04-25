package org.jivesoftware.smackx.pep.packet;

import org.jivesoftware.smack.packet.ExtensionElement;

public abstract class PEPItem implements ExtensionElement {

    /* renamed from: id */
    String f45002id;

    public PEPItem(String str) {
        this.f45002id = str;
    }

    public String getElementName() {
        return "item";
    }

    /* access modifiers changed from: 0000 */
    public abstract String getItemDetailsXML();

    public String getNamespace() {
        return "http://jabber.org/protocol/pubsub";
    }

    /* access modifiers changed from: 0000 */
    public abstract String getNode();

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(getElementName());
        sb.append(" id=\"");
        sb.append(this.f45002id);
        sb.append("\">");
        sb.append(getItemDetailsXML());
        sb.append("</");
        sb.append(getElementName());
        sb.append(">");
        return sb.toString();
    }
}
