package org.jivesoftware.smackx.disco.provider;

import java.io.IOException;
import org.apache.http.p549j0.C15430e;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo.Identity;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class DiscoverInfoProvider extends IQProvider<DiscoverInfo> {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public DiscoverInfo parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
        DiscoverInfo discoverInfo = new DiscoverInfo();
        String str = "";
        discoverInfo.setNode(xmlPullParser.getAttributeValue(str, "node"));
        boolean z = false;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        while (!z) {
            int next = xmlPullParser.next();
            String str7 = "feature";
            String str8 = C15430e.f44592s;
            if (next == 2) {
                if (xmlPullParser.getName().equals(str8)) {
                    str2 = xmlPullParser.getAttributeValue(str, "category");
                    String attributeValue = xmlPullParser.getAttributeValue(str, "name");
                    String attributeValue2 = xmlPullParser.getAttributeValue(str, "type");
                    str5 = xmlPullParser.getAttributeValue(xmlPullParser.getNamespace("xml"), "lang");
                    String str9 = attributeValue2;
                    str4 = attributeValue;
                    str3 = str9;
                } else if (xmlPullParser.getName().equals(str7)) {
                    str6 = xmlPullParser.getAttributeValue(str, "var");
                } else {
                    PacketParserUtils.addExtensionElement((Stanza) discoverInfo, xmlPullParser);
                }
            } else if (next == 3) {
                if (xmlPullParser.getName().equals(str8)) {
                    discoverInfo.addIdentity(new Identity(str2, str3, str4, str5));
                }
                if (xmlPullParser.getName().equals(str7)) {
                    discoverInfo.addFeature(str6);
                }
                if (xmlPullParser.getName().equals("query")) {
                    z = true;
                }
            }
        }
        return discoverInfo;
    }
}
