package org.jivesoftware.smackx.muc.provider;

import java.io.IOException;
import org.jivesoftware.smackx.muc.MUCAffiliation;
import org.jivesoftware.smackx.muc.MUCRole;
import org.jivesoftware.smackx.muc.packet.Destroy;
import org.jivesoftware.smackx.muc.packet.MUCItem;
import org.jivesoftware.smackx.nick.packet.Nick;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class MUCParserUtils {
    public static Destroy parseDestroy(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Destroy destroy = new Destroy();
        destroy.setJid(xmlPullParser.getAttributeValue("", "jid"));
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("reason")) {
                    destroy.setReason(xmlPullParser.nextText());
                }
            } else if (next == 3 && xmlPullParser.getName().equals(Destroy.ELEMENT)) {
                z = true;
            }
        }
        return destroy;
    }

    public static MUCItem parseItem(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        String str = "";
        MUCAffiliation fromString = MUCAffiliation.fromString(xmlPullParser.getAttributeValue(str, "affiliation"));
        String attributeValue = xmlPullParser.getAttributeValue(str, Nick.ELEMENT_NAME);
        MUCRole fromString2 = MUCRole.fromString(xmlPullParser.getAttributeValue(str, "role"));
        String str2 = "jid";
        String attributeValue2 = xmlPullParser.getAttributeValue(str, str2);
        String str3 = null;
        String str4 = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                char c = 65535;
                int hashCode = name.hashCode();
                if (hashCode != -934964668) {
                    if (hashCode == 92645877 && name.equals("actor")) {
                        c = 0;
                    }
                } else if (name.equals("reason")) {
                    c = 1;
                }
                if (c == 0) {
                    str3 = xmlPullParser.getAttributeValue(str, str2);
                } else if (c == 1) {
                    str4 = xmlPullParser.nextText();
                }
            } else if (next == 3 && xmlPullParser.getDepth() == depth) {
                MUCItem mUCItem = new MUCItem(fromString, fromString2, str3, str4, attributeValue2, attributeValue);
                return mUCItem;
            }
        }
    }
}
