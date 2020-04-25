package org.jivesoftware.smackx.bytestreams.ibb.provider;

import java.io.IOException;
import java.util.Locale;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager.StanzaType;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Open;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class OpenIQProvider extends IQProvider<Open> {
    public Open parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
        StanzaType stanzaType;
        String str = "";
        String attributeValue = xmlPullParser.getAttributeValue(str, "sid");
        int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(str, "block-size"));
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "stanza");
        if (attributeValue2 == null) {
            stanzaType = StanzaType.IQ;
        } else {
            stanzaType = StanzaType.valueOf(attributeValue2.toUpperCase(Locale.US));
        }
        xmlPullParser.next();
        return new Open(attributeValue, parseInt, stanzaType);
    }
}
