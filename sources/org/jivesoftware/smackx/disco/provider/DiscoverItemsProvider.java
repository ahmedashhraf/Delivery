package org.jivesoftware.smackx.disco.provider;

import java.io.IOException;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.jivesoftware.smackx.disco.packet.DiscoverItems.Item;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class DiscoverItemsProvider extends IQProvider<DiscoverItems> {
    public DiscoverItems parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
        DiscoverItems discoverItems = new DiscoverItems();
        String str = "node";
        String str2 = "";
        discoverItems.setNode(xmlPullParser.getAttributeValue(str2, str));
        boolean z = false;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        while (!z) {
            int next = xmlPullParser.next();
            String str7 = "item";
            if (next == 2 && str7.equals(xmlPullParser.getName())) {
                str3 = xmlPullParser.getAttributeValue(str2, "jid");
                str4 = xmlPullParser.getAttributeValue(str2, "name");
                str5 = xmlPullParser.getAttributeValue(str2, str);
                str6 = xmlPullParser.getAttributeValue(str2, "action");
            } else if (next == 3 && str7.equals(xmlPullParser.getName())) {
                Item item = new Item(str3);
                item.setName(str4);
                item.setNode(str5);
                item.setAction(str6);
                discoverItems.addItem(item);
            } else if (next == 3) {
                if ("query".equals(xmlPullParser.getName())) {
                    z = true;
                }
            }
        }
        return discoverItems;
    }
}
