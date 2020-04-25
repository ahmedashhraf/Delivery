package org.jivesoftware.smack.filter;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.StringUtils;

@Deprecated
public class PacketExtensionFilter implements StanzaFilter {
    private final String elementName;
    private final String namespace;

    public PacketExtensionFilter(String str, String str2) {
        StringUtils.requireNotNullOrEmpty(str2, "namespace must not be null or empty");
        this.elementName = str;
        this.namespace = str2;
    }

    public boolean accept(Stanza stanza) {
        return stanza.hasExtension(this.elementName, this.namespace);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PacketExtensionFilter.class.getSimpleName());
        sb.append(": element=");
        sb.append(this.elementName);
        sb.append(" namespace=");
        sb.append(this.namespace);
        return sb.toString();
    }

    public PacketExtensionFilter(String str) {
        this(null, str);
    }

    public PacketExtensionFilter(ExtensionElement extensionElement) {
        this(extensionElement.getElementName(), extensionElement.getNamespace());
    }
}
