package org.jivesoftware.smackx.pubsub;

import androidx.core.app.C0770p;
import java.util.Arrays;
import java.util.List;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smackx.pubsub.packet.PubSubNamespace;

public class EventElement implements EmbeddedPacketExtension {
    private NodeExtension ext;
    private EventElementType type;

    public EventElement(EventElementType eventElementType, NodeExtension nodeExtension) {
        this.type = eventElementType;
        this.ext = nodeExtension;
    }

    public String getElementName() {
        return C0770p.f3524g0;
    }

    public NodeExtension getEvent() {
        return this.ext;
    }

    public EventElementType getEventType() {
        return this.type;
    }

    public List<ExtensionElement> getExtensions() {
        return Arrays.asList(new ExtensionElement[]{getEvent()});
    }

    public String getNamespace() {
        return PubSubNamespace.EVENT.getXmlns();
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<event xmlns='");
        sb.append(PubSubNamespace.EVENT.getXmlns());
        sb.append("'>");
        StringBuilder sb2 = new StringBuilder(sb.toString());
        sb2.append(this.ext.toXML());
        sb2.append("</event>");
        return sb2.toString();
    }
}
