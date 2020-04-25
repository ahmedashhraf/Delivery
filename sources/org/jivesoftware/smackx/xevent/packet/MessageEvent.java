package org.jivesoftware.smackx.xevent.packet;

import java.util.ArrayList;
import java.util.List;
import org.jivesoftware.smack.packet.ExtensionElement;

public class MessageEvent implements ExtensionElement {
    public static final String CANCELLED = "cancelled";
    public static final String COMPOSING = "composing";
    public static final String DELIVERED = "delivered";
    public static final String DISPLAYED = "displayed";
    public static final String ELEMENT = "x";
    public static final String NAMESPACE = "jabber:x:event";
    public static final String OFFLINE = "offline";
    private boolean cancelled = true;
    private boolean composing = false;
    private boolean delivered = false;
    private boolean displayed = false;
    private boolean offline = false;
    private String packetID = null;

    public String getElementName() {
        return "x";
    }

    public List<String> getEventTypes() {
        ArrayList arrayList = new ArrayList();
        if (isDelivered()) {
            arrayList.add("delivered");
        }
        if (!isMessageEventRequest() && isCancelled()) {
            arrayList.add("cancelled");
        }
        if (isComposing()) {
            arrayList.add(COMPOSING);
        }
        if (isDisplayed()) {
            arrayList.add(DISPLAYED);
        }
        if (isOffline()) {
            arrayList.add("offline");
        }
        return arrayList;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public String getStanzaId() {
        return this.packetID;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public boolean isComposing() {
        return this.composing;
    }

    public boolean isDelivered() {
        return this.delivered;
    }

    public boolean isDisplayed() {
        return this.displayed;
    }

    public boolean isMessageEventRequest() {
        return this.packetID == null;
    }

    public boolean isOffline() {
        return this.offline;
    }

    public void setCancelled(boolean z) {
        this.cancelled = z;
    }

    public void setComposing(boolean z) {
        this.composing = z;
        setCancelled(false);
    }

    public void setDelivered(boolean z) {
        this.delivered = z;
        setCancelled(false);
    }

    public void setDisplayed(boolean z) {
        this.displayed = z;
        setCancelled(false);
    }

    public void setOffline(boolean z) {
        this.offline = z;
        setCancelled(false);
    }

    public void setStanzaId(String str) {
        this.packetID = str;
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        String str = "<";
        sb.append(str);
        sb.append(getElementName());
        sb.append(" xmlns=\"");
        sb.append(getNamespace());
        sb.append("\">");
        String str2 = "/>";
        if (isOffline()) {
            sb.append(str);
            sb.append("offline");
            sb.append(str2);
        }
        if (isDelivered()) {
            sb.append(str);
            sb.append("delivered");
            sb.append(str2);
        }
        if (isDisplayed()) {
            sb.append(str);
            sb.append(DISPLAYED);
            sb.append(str2);
        }
        if (isComposing()) {
            sb.append(str);
            sb.append(COMPOSING);
            sb.append(str2);
        }
        if (getStanzaId() != null) {
            sb.append("<id>");
            sb.append(getStanzaId());
            sb.append("</id>");
        }
        sb.append("</");
        sb.append(getElementName());
        sb.append(">");
        return sb.toString();
    }
}
