package org.jivesoftware.smackx.pubsub;

import org.jivesoftware.smack.packet.ExtensionElement;

public class PayloadItem<E extends ExtensionElement> extends Item {
    private E payload;

    public PayloadItem(E e) {
        if (e != null) {
            this.payload = e;
            return;
        }
        throw new IllegalArgumentException("payload cannot be 'null'");
    }

    public E getPayload() {
        return this.payload;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PayloadItem.class.getName());
        sb.append(" | Content [");
        sb.append(toXML());
        sb.append("]");
        return sb.toString();
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder("<item");
        String str = "'";
        if (getId() != null) {
            sb.append(" id='");
            sb.append(getId());
            sb.append(str);
        }
        if (getNode() != null) {
            sb.append(" node='");
            sb.append(getNode());
            sb.append(str);
        }
        sb.append(">");
        sb.append(this.payload.toXML());
        sb.append("</item>");
        return sb.toString();
    }

    public PayloadItem(String str, E e) {
        super(str);
        if (e != null) {
            this.payload = e;
            return;
        }
        throw new IllegalArgumentException("payload cannot be 'null'");
    }

    public PayloadItem(String str, String str2, E e) {
        super(str, str2);
        if (e != null) {
            this.payload = e;
            return;
        }
        throw new IllegalArgumentException("payload cannot be 'null'");
    }
}
