package org.jivesoftware.smackx.pubsub;

public class Item extends NodeExtension {

    /* renamed from: id */
    private String f45003id;

    public Item() {
        super(PubSubElementType.ITEM);
    }

    public String getId() {
        return this.f45003id;
    }

    public String getNamespace() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(" | Content [");
        sb.append(toXML());
        sb.append("]");
        return sb.toString();
    }

    public Item(String str) {
        super(PubSubElementType.ITEM);
        this.f45003id = str;
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder("<item");
        String str = "'";
        if (this.f45003id != null) {
            sb.append(" id='");
            sb.append(this.f45003id);
            sb.append(str);
        }
        if (getNode() != null) {
            sb.append(" node='");
            sb.append(getNode());
            sb.append(str);
        }
        sb.append("/>");
        return sb.toString();
    }

    public Item(String str, String str2) {
        super(PubSubElementType.ITEM_EVENT, str2);
        this.f45003id = str;
    }
}
