package org.jivesoftware.smackx.pubsub;

import kotlin.p217i1.C14662d0;
import org.jivesoftware.smack.packet.ExtensionElement;

public class NodeExtension implements ExtensionElement {
    private final PubSubElementType element;
    private final String node;

    public NodeExtension(PubSubElementType pubSubElementType, String str) {
        this.element = pubSubElementType;
        this.node = str;
    }

    public String getElementName() {
        return this.element.getElementName();
    }

    public String getNamespace() {
        return this.element.getNamespace().getXmlns();
    }

    public String getNode() {
        return this.node;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(" - content [");
        sb.append(toXML());
        sb.append("]");
        return sb.toString();
    }

    public CharSequence toXML() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(C14662d0.f42853d);
        sb.append(getElementName());
        if (this.node == null) {
            str = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" node='");
            sb2.append(this.node);
            sb2.append('\'');
            str = sb2.toString();
        }
        sb.append(str);
        sb.append("/>");
        return sb.toString();
    }

    public NodeExtension(PubSubElementType pubSubElementType) {
        this(pubSubElementType, null);
    }
}
