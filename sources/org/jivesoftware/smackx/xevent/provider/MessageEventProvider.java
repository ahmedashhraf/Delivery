package org.jivesoftware.smackx.xevent.provider;

import java.io.IOException;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.xevent.packet.MessageEvent;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class MessageEventProvider extends ExtensionElementProvider<MessageEvent> {
    public MessageEvent parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
        MessageEvent messageEvent = new MessageEvent();
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("id")) {
                    messageEvent.setStanzaId(xmlPullParser.nextText());
                }
                if (xmlPullParser.getName().equals(MessageEvent.COMPOSING)) {
                    messageEvent.setComposing(true);
                }
                if (xmlPullParser.getName().equals("delivered")) {
                    messageEvent.setDelivered(true);
                }
                if (xmlPullParser.getName().equals(MessageEvent.DISPLAYED)) {
                    messageEvent.setDisplayed(true);
                }
                if (xmlPullParser.getName().equals("offline")) {
                    messageEvent.setOffline(true);
                }
            } else if (next == 3 && xmlPullParser.getName().equals("x")) {
                z = true;
            }
        }
        return messageEvent;
    }
}
