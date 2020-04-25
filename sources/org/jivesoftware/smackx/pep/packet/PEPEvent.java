package org.jivesoftware.smackx.pep.packet;

import androidx.core.app.C0770p;
import org.jivesoftware.smack.packet.ExtensionElement;

public class PEPEvent implements ExtensionElement {
    PEPItem item;

    public PEPEvent() {
    }

    public void addPEPItem(PEPItem pEPItem) {
        this.item = pEPItem;
    }

    public String getElementName() {
        return C0770p.f3524g0;
    }

    public String getNamespace() {
        return "http://jabber.org/protocol/pubsub";
    }

    public PEPEvent(PEPItem pEPItem) {
        this.item = pEPItem;
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(getElementName());
        sb.append(" xmlns=\"");
        sb.append(getNamespace());
        sb.append("\">");
        sb.append(this.item.toXML());
        sb.append("</");
        sb.append(getElementName());
        sb.append(">");
        return sb.toString();
    }
}
