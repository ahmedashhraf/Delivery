package org.jivesoftware.smackx.pubsub;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smackx.pubsub.packet.PubSubNamespace;

public class RetractItem implements ExtensionElement {

    /* renamed from: id */
    private String f45009id;

    public RetractItem(String str) {
        if (str != null) {
            this.f45009id = str;
            return;
        }
        throw new IllegalArgumentException("itemId must not be 'null'");
    }

    public String getElementName() {
        return "retract";
    }

    public String getId() {
        return this.f45009id;
    }

    public String getNamespace() {
        return PubSubNamespace.EVENT.getXmlns();
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<retract id='");
        sb.append(this.f45009id);
        sb.append("'/>");
        return sb.toString();
    }
}
