package org.jivesoftware.smackx.pubsub;

import com.fasterxml.jackson.core.p162w.C3868i;
import org.jivesoftware.smack.packet.ExtensionElement;

public class Affiliation implements ExtensionElement {
    public static final String ELEMENT = "affiliation";
    protected String node;
    protected Type type;

    public enum Type {
        member,
        none,
        outcast,
        owner,
        publisher
    }

    public Affiliation(String str, Type type2) {
        this.node = str;
        this.type = type2;
    }

    private void appendAttribute(StringBuilder sb, String str, String str2) {
        sb.append(C3868i.f12248b);
        sb.append(str);
        sb.append("='");
        sb.append(str2);
        sb.append("'");
    }

    public String getElementName() {
        return "affiliation";
    }

    public String getNamespace() {
        return null;
    }

    public String getNodeId() {
        return this.node;
    }

    public Type getType() {
        return this.type;
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(getElementName());
        appendAttribute(sb, "node", this.node);
        appendAttribute(sb, "affiliation", this.type.toString());
        sb.append("/>");
        return sb.toString();
    }
}
