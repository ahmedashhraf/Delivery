package org.jivesoftware.smackx.workgroup.packet;

import java.io.IOException;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class UserID implements ExtensionElement {
    public static final String ELEMENT_NAME = "user";
    public static final String NAMESPACE = "http://jivesoftware.com/protocol/workgroup";
    private String userID;

    public static class Provider extends ExtensionElementProvider<UserID> {
        public UserID parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            String attributeValue = xmlPullParser.getAttributeValue("", "id");
            xmlPullParser.next();
            return new UserID(attributeValue);
        }
    }

    public UserID(String str) {
        this.userID = str;
    }

    public String getElementName() {
        return "user";
    }

    public String getNamespace() {
        return "http://jivesoftware.com/protocol/workgroup";
    }

    public String getUserID() {
        return this.userID;
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append("user");
        sb.append(" xmlns=\"");
        sb.append("http://jivesoftware.com/protocol/workgroup");
        sb.append("\" ");
        sb.append("id=\"");
        sb.append(getUserID());
        sb.append("\"/>");
        return sb.toString();
    }
}
