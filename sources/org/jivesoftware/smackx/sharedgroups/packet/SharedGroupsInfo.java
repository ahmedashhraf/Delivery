package org.jivesoftware.smackx.sharedgroups.packet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.roster.packet.RosterPacket.Item;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class SharedGroupsInfo extends C15617IQ {
    public static final String ELEMENT = "sharedgroup";
    public static final String NAMESPACE = "http://www.jivesoftware.org/protocol/sharedgroup";
    private List<String> groups = new ArrayList();

    public static class Provider extends IQProvider<SharedGroupsInfo> {
        public SharedGroupsInfo parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            SharedGroupsInfo sharedGroupsInfo = new SharedGroupsInfo();
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2 && xmlPullParser.getName().equals(Item.GROUP)) {
                    sharedGroupsInfo.getGroups().add(xmlPullParser.nextText());
                } else if (next == 3 && xmlPullParser.getName().equals(SharedGroupsInfo.ELEMENT)) {
                    z = true;
                }
            }
            return sharedGroupsInfo;
        }
    }

    public SharedGroupsInfo() {
        super(ELEMENT, NAMESPACE);
    }

    public List<String> getGroups() {
        return this.groups;
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        for (String element : this.groups) {
            iQChildElementXmlStringBuilder.element(Item.GROUP, element);
        }
        return iQChildElementXmlStringBuilder;
    }
}
