package org.jivesoftware.smackx.workgroup.packet;

import java.io.IOException;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class SessionID implements ExtensionElement {
    public static final String ELEMENT_NAME = "session";
    public static final String NAMESPACE = "http://jivesoftware.com/protocol/workgroup";
    private String sessionID;

    public static class Provider extends ExtensionElementProvider<SessionID> {
        public SessionID parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            String attributeValue = xmlPullParser.getAttributeValue("", "id");
            xmlPullParser.next();
            return new SessionID(attributeValue);
        }
    }

    public SessionID(String str) {
        this.sessionID = str;
    }

    public String getElementName() {
        return "session";
    }

    public String getNamespace() {
        return "http://jivesoftware.com/protocol/workgroup";
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append("session");
        sb.append(" xmlns=\"");
        sb.append("http://jivesoftware.com/protocol/workgroup");
        sb.append("\" ");
        sb.append("id=\"");
        sb.append(getSessionID());
        sb.append("\"/>");
        return sb.toString();
    }
}
