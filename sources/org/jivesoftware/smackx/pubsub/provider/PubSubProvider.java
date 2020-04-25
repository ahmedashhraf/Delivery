package org.jivesoftware.smackx.pubsub.provider;

import java.io.IOException;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smackx.pubsub.packet.PubSub;
import org.jivesoftware.smackx.pubsub.packet.PubSubNamespace;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class PubSubProvider extends IQProvider<PubSub> {
    public PubSub parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
        PubSub pubSub = new PubSub(PubSubNamespace.valueOfFromXmlns(xmlPullParser.getNamespace()));
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                PacketParserUtils.addExtensionElement((Stanza) pubSub, xmlPullParser);
            } else if (next == 3 && xmlPullParser.getDepth() == i) {
                return pubSub;
            }
        }
    }
}
