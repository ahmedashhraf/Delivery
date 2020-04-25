package org.jivesoftware.smackx.pubsub;

import java.util.List;
import org.jivesoftware.smack.packet.ExtensionElement;

public class ItemsExtension extends NodeExtension implements EmbeddedPacketExtension {
    protected List<? extends ExtensionElement> items;
    protected Boolean notify;
    protected ItemsElementType type;

    public enum ItemsElementType {
        items(PubSubElementType.ITEMS, "max_items"),
        retract(PubSubElementType.RETRACT, "notify");
        
        private String att;
        private PubSubElementType elem;

        private ItemsElementType(PubSubElementType pubSubElementType, String str) {
            this.elem = pubSubElementType;
            this.att = str;
        }

        public String getElementAttribute() {
            return this.att;
        }

        public PubSubElementType getNodeElement() {
            return this.elem;
        }
    }

    public ItemsExtension(ItemsElementType itemsElementType, String str, List<? extends ExtensionElement> list) {
        super(itemsElementType.getNodeElement(), str);
        this.type = itemsElementType;
        this.items = list;
    }

    public List<ExtensionElement> getExtensions() {
        return getItems();
    }

    public List<? extends ExtensionElement> getItems() {
        return this.items;
    }

    public ItemsElementType getItemsElementType() {
        return this.type;
    }

    public boolean getNotify() {
        return this.notify.booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ItemsExtension.class.getName());
        sb.append("Content [");
        sb.append(toXML());
        sb.append("]");
        return sb.toString();
    }

    public CharSequence toXML() {
        List<? extends ExtensionElement> list = this.items;
        if (list == null || list.size() == 0) {
            return super.toXML();
        }
        StringBuilder sb = new StringBuilder("<");
        sb.append(getElementName());
        sb.append(" node='");
        sb.append(getNode());
        String str = "'>";
        if (this.notify != null) {
            sb.append("' ");
            sb.append(this.type.getElementAttribute());
            sb.append("='");
            sb.append(this.notify.equals(Boolean.TRUE) ? 1 : 0);
            sb.append(str);
        } else {
            sb.append(str);
            for (ExtensionElement xml : this.items) {
                sb.append(xml.toXML());
            }
        }
        sb.append("</");
        sb.append(getElementName());
        sb.append(">");
        return sb.toString();
    }

    public ItemsExtension(String str, List<? extends ExtensionElement> list, boolean z) {
        super(ItemsElementType.retract.getNodeElement(), str);
        this.type = ItemsElementType.retract;
        this.items = list;
        this.notify = Boolean.valueOf(z);
    }
}
