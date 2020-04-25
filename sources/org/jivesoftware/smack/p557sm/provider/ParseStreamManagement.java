package org.jivesoftware.smack.p557sm.provider;

import java.io.IOException;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.AckAnswer;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.AckRequest;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Enabled;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Failed;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Resume;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Resumed;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: org.jivesoftware.smack.sm.provider.ParseStreamManagement */
public class ParseStreamManagement {
    public static AckAnswer ackAnswer(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ParserUtils.assertAtStartTag(xmlPullParser);
        long longValue = ParserUtils.getLongAttribute(xmlPullParser, XHTMLText.f45021H).longValue();
        xmlPullParser.next();
        ParserUtils.assertAtEndTag(xmlPullParser);
        return new AckAnswer(longValue);
    }

    public static AckRequest ackRequest(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ParserUtils.assertAtStartTag(xmlPullParser);
        xmlPullParser.next();
        ParserUtils.assertAtEndTag(xmlPullParser);
        return AckRequest.INSTANCE;
    }

    public static Enabled enabled(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ParserUtils.assertAtStartTag(xmlPullParser);
        boolean booleanAttribute = ParserUtils.getBooleanAttribute(xmlPullParser, Resume.ELEMENT, false);
        String str = "";
        String attributeValue = xmlPullParser.getAttributeValue(str, "id");
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "location");
        int integerAttribute = ParserUtils.getIntegerAttribute(xmlPullParser, "max", -1);
        xmlPullParser.next();
        ParserUtils.assertAtEndTag(xmlPullParser);
        return new Enabled(attributeValue, booleanAttribute, attributeValue2, integerAttribute);
    }

    public static Failed failed(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ParserUtils.assertAtStartTag(xmlPullParser);
        Condition condition = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (XMPPError.NAMESPACE.equals(xmlPullParser.getNamespace())) {
                    condition = Condition.fromString(name);
                }
            } else if (next != 3) {
                continue;
            } else {
                if (Failed.ELEMENT.equals(xmlPullParser.getName())) {
                    ParserUtils.assertAtEndTag(xmlPullParser);
                    return new Failed(condition);
                }
            }
        }
    }

    public static Resumed resumed(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ParserUtils.assertAtStartTag(xmlPullParser);
        long longValue = ParserUtils.getLongAttribute(xmlPullParser, XHTMLText.f45021H).longValue();
        String attributeValue = xmlPullParser.getAttributeValue("", "previd");
        xmlPullParser.next();
        ParserUtils.assertAtEndTag(xmlPullParser);
        return new Resumed(longValue, attributeValue);
    }
}
