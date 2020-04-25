package org.jivesoftware.smackx.nick.packet;

import java.io.IOException;
import kotlin.p217i1.C14662d0;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class Nick implements ExtensionElement {
    public static final String ELEMENT_NAME = "nick";
    public static final String NAMESPACE = "http://jabber.org/protocol/nick";
    private String name = null;

    public static class Provider extends ExtensionElementProvider<Nick> {
        public Nick parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            xmlPullParser.next();
            String text = xmlPullParser.getText();
            while (xmlPullParser.getEventType() != 3) {
                xmlPullParser.next();
            }
            return new Nick(text);
        }
    }

    public Nick(String str) {
        this.name = str;
    }

    public String getElementName() {
        return ELEMENT_NAME;
    }

    public String getName() {
        return this.name;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        String str = ELEMENT_NAME;
        sb.append(str);
        sb.append(" xmlns=\"");
        sb.append(NAMESPACE);
        sb.append("\">");
        sb.append(getName());
        sb.append("</");
        sb.append(str);
        sb.append(C14662d0.f42854e);
        return sb.toString();
    }
}
