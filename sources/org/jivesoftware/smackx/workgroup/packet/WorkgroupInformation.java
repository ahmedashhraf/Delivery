package org.jivesoftware.smackx.workgroup.packet;

import java.io.IOException;
import kotlin.p217i1.C14662d0;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class WorkgroupInformation implements ExtensionElement {
    public static final String ELEMENT_NAME = "workgroup";
    public static final String NAMESPACE = "http://jabber.org/protocol/workgroup";
    private String workgroupJID;

    public static class Provider extends ExtensionElementProvider<WorkgroupInformation> {
        public WorkgroupInformation parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            String attributeValue = xmlPullParser.getAttributeValue("", "jid");
            xmlPullParser.next();
            return new WorkgroupInformation(attributeValue);
        }
    }

    public WorkgroupInformation(String str) {
        this.workgroupJID = str;
    }

    public String getElementName() {
        return ELEMENT_NAME;
    }

    public String getNamespace() {
        return "http://jabber.org/protocol/workgroup";
    }

    public String getWorkgroupJID() {
        return this.workgroupJID;
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append(C14662d0.f42853d);
        sb.append(ELEMENT_NAME);
        sb.append(" jid=\"");
        sb.append(getWorkgroupJID());
        sb.append("\"");
        sb.append(" xmlns=\"");
        sb.append("http://jabber.org/protocol/workgroup");
        sb.append("\" />");
        return sb.toString();
    }
}
