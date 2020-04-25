package org.jivesoftware.smackx.xroster.provider;

import java.io.IOException;
import java.util.ArrayList;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.roster.packet.RosterPacket.Item;
import org.jivesoftware.smackx.xroster.RemoteRosterEntry;
import org.jivesoftware.smackx.xroster.packet.RosterExchange;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class RosterExchangeProvider extends ExtensionElementProvider<RosterExchange> {
    public RosterExchange parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
        RosterExchange rosterExchange = new RosterExchange();
        String str = "";
        boolean z = false;
        ArrayList arrayList = new ArrayList();
        String str2 = str;
        String str3 = str2;
        while (!z) {
            int next = xmlPullParser.next();
            String str4 = "item";
            if (next == 2) {
                if (xmlPullParser.getName().equals(str4)) {
                    arrayList = new ArrayList();
                    str2 = xmlPullParser.getAttributeValue(str, "jid");
                    str3 = xmlPullParser.getAttributeValue(str, "name");
                }
                if (xmlPullParser.getName().equals(Item.GROUP)) {
                    arrayList.add(xmlPullParser.nextText());
                }
            } else if (next == 3) {
                if (xmlPullParser.getName().equals(str4)) {
                    rosterExchange.addRosterEntry(new RemoteRosterEntry(str2, str3, (String[]) arrayList.toArray(new String[arrayList.size()])));
                }
                if (xmlPullParser.getName().equals("x")) {
                    z = true;
                }
            }
        }
        return rosterExchange;
    }
}
