package org.jivesoftware.smackx.workgroup.packet;

import java.io.IOException;
import java.util.ArrayList;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class TranscriptProvider extends IQProvider<Transcript> {
    public Transcript parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
        String attributeValue = xmlPullParser.getAttributeValue("", "sessionID");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("message")) {
                    arrayList.add(PacketParserUtils.parseMessage(xmlPullParser));
                } else if (xmlPullParser.getName().equals(Presence.ELEMENT)) {
                    arrayList.add(PacketParserUtils.parsePresence(xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("transcript")) {
                z = true;
            }
        }
        return new Transcript(attributeValue, arrayList);
    }
}
