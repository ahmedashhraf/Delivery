package org.jivesoftware.smackx.forward.provider;

import java.io.IOException;
import java.util.logging.Logger;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smackx.delay.packet.DelayInformation;
import org.jivesoftware.smackx.delay.provider.DelayInformationProvider;
import org.jivesoftware.smackx.forward.packet.Forwarded;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ForwardedProvider extends ExtensionElementProvider<Forwarded> {
    private static final Logger LOGGER = Logger.getLogger(ForwardedProvider.class.getName());

    public Forwarded parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
        Message message = null;
        DelayInformation delayInformation = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3 && xmlPullParser.getDepth() == i) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                char c = 65535;
                int hashCode = name.hashCode();
                if (hashCode != 95467907) {
                    if (hashCode == 954925063 && name.equals("message")) {
                        c = 1;
                    }
                } else if (name.equals(DelayInformation.ELEMENT)) {
                    c = 0;
                }
                if (c == 0) {
                    String str = DelayInformation.NAMESPACE;
                    if (str.equals(namespace)) {
                        delayInformation = DelayInformationProvider.INSTANCE.parse(xmlPullParser, xmlPullParser.getDepth());
                    } else {
                        Logger logger = LOGGER;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Namespace '");
                        sb.append(namespace);
                        sb.append("' does not match expected namespace '");
                        sb.append(str);
                        sb.append("'");
                        logger.warning(sb.toString());
                    }
                } else if (c != 1) {
                    Logger logger2 = LOGGER;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unsupported forwarded packet type: ");
                    sb2.append(name);
                    logger2.warning(sb2.toString());
                } else {
                    message = PacketParserUtils.parseMessage(xmlPullParser);
                }
            }
        }
        if (message != null) {
            return new Forwarded(delayInformation, message);
        }
        throw new SmackException("forwarded extension must contain a packet");
    }
}
