package org.jivesoftware.smackx.caps.provider;

import java.io.IOException;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.roster.packet.RosterVer;
import org.jivesoftware.smackx.caps.packet.CapsExtension;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

public class CapsExtensionProvider extends ExtensionElementProvider<CapsExtension> {
    public CapsExtension parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
        if (xmlPullParser.getEventType() == 2) {
            String str = "c";
            if (xmlPullParser.getName().equalsIgnoreCase(str)) {
                String attributeValue = xmlPullParser.getAttributeValue(null, C14330v.f42316c0);
                String attributeValue2 = xmlPullParser.getAttributeValue(null, RosterVer.ELEMENT);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "node");
                xmlPullParser.next();
                if (xmlPullParser.getEventType() != 3 || !xmlPullParser.getName().equalsIgnoreCase(str)) {
                    throw new SmackException("Malformed nested Caps element");
                } else if (attributeValue != null && attributeValue2 != null && attributeValue3 != null) {
                    return new CapsExtension(attributeValue3, attributeValue2, attributeValue);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Caps elment with missing attributes. Attributes: hash=");
                    sb.append(attributeValue);
                    sb.append(" version=");
                    sb.append(attributeValue2);
                    sb.append(" node=");
                    sb.append(attributeValue3);
                    throw new SmackException(sb.toString());
                }
            }
        }
        throw new SmackException("Malformed Caps element");
    }
}
