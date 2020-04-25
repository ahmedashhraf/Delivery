package org.jivesoftware.smackx.bytestreams.socks5.provider;

import java.io.IOException;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.Activate;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.Mode;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.StreamHost;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.StreamHostUsed;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class BytestreamsProvider extends IQProvider<Bytestream> {
    public Bytestream parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
        Bytestream bytestream = new Bytestream();
        String str = "";
        String attributeValue = xmlPullParser.getAttributeValue(str, "sid");
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "mode");
        boolean z = false;
        loop0:
        while (true) {
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (!z) {
                int next = xmlPullParser.next();
                String name = xmlPullParser.getName();
                if (next == 2) {
                    String str5 = "jid";
                    if (name.equals(StreamHost.ELEMENTNAME)) {
                        str3 = xmlPullParser.getAttributeValue(str, str5);
                        str4 = xmlPullParser.getAttributeValue(str, "host");
                        str2 = xmlPullParser.getAttributeValue(str, "port");
                    } else if (name.equals(StreamHostUsed.ELEMENTNAME)) {
                        bytestream.setUsedHost(xmlPullParser.getAttributeValue(str, str5));
                    } else if (name.equals(Activate.ELEMENTNAME)) {
                        bytestream.setToActivate(xmlPullParser.getAttributeValue(str, str5));
                    }
                } else if (next != 3) {
                    continue;
                } else if (name.equals("streamhost")) {
                    if (str2 == null) {
                        bytestream.addStreamHost(str3, str4);
                    } else {
                        bytestream.addStreamHost(str3, str4, Integer.parseInt(str2));
                    }
                } else if (name.equals("query")) {
                    z = true;
                }
            }
            break loop0;
        }
        if (attributeValue2 == null) {
            bytestream.setMode(Mode.tcp);
        } else {
            bytestream.setMode(Mode.fromName(attributeValue2));
        }
        bytestream.setSessionID(attributeValue);
        return bytestream;
    }
}
