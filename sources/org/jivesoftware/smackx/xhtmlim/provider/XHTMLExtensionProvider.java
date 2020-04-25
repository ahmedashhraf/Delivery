package org.jivesoftware.smackx.xhtmlim.provider;

import java.io.IOException;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smackx.xhtmlim.packet.XHTMLExtension;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class XHTMLExtensionProvider extends ExtensionElementProvider<XHTMLExtension> {
    public XHTMLExtension parse(XmlPullParser xmlPullParser, int i) throws IOException, XmlPullParserException {
        XHTMLExtension xHTMLExtension = new XHTMLExtension();
        while (true) {
            int eventType = xmlPullParser.getEventType();
            String name = xmlPullParser.getName();
            if (eventType == 2) {
                if (name.equals("body")) {
                    xHTMLExtension.addBody(PacketParserUtils.parseElement(xmlPullParser));
                }
            } else if (eventType == 3 && xmlPullParser.getDepth() == i) {
                return xHTMLExtension;
            }
            xmlPullParser.next();
        }
    }
}
