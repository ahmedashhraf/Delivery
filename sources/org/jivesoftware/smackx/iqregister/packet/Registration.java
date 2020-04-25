package org.jivesoftware.smackx.iqregister.packet;

import java.util.Map;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.ExtensionElement;

public class Registration extends C15617IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "jabber:iq:register";
    private final Map<String, String> attributes;
    private final String instructions;

    public static class Feature implements ExtensionElement {
        public static final String ELEMENT = "register";
        public static final Feature INSTANCE = new Feature();
        public static final String NAMESPACE = "http://jabber.org/features/iq-register";

        private Feature() {
        }

        public String getElementName() {
            return ELEMENT;
        }

        public String getNamespace() {
            return NAMESPACE;
        }

        public CharSequence toXML() {
            return "<register xmlns='http://jabber.org/features/iq-register'/>";
        }
    }

    public Registration() {
        this(null);
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.optElement("instructions", this.instructions);
        Map<String, String> map = this.attributes;
        if (map != null && map.size() > 0) {
            for (String str : this.attributes.keySet()) {
                iQChildElementXmlStringBuilder.element(str, (String) this.attributes.get(str));
            }
        }
        return iQChildElementXmlStringBuilder;
    }

    public String getInstructions() {
        return this.instructions;
    }

    public Registration(Map<String, String> map) {
        this(null, map);
    }

    public Registration(String str, Map<String, String> map) {
        super("query", NAMESPACE);
        this.instructions = str;
        this.attributes = map;
    }
}
