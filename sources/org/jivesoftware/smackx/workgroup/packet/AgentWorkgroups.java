package org.jivesoftware.smackx.workgroup.packet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.provider.IQProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class AgentWorkgroups extends C15617IQ {
    private String agentJID;
    private List<String> workgroups;

    public static class Provider extends IQProvider<AgentWorkgroups> {
        public AgentWorkgroups parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            String str = "jid";
            String str2 = "";
            String attributeValue = xmlPullParser.getAttributeValue(str2, str);
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (xmlPullParser.getName().equals(WorkgroupInformation.ELEMENT_NAME)) {
                        arrayList.add(xmlPullParser.getAttributeValue(str2, str));
                    }
                } else if (next == 3 && xmlPullParser.getName().equals("workgroups")) {
                    z = true;
                }
            }
            return new AgentWorkgroups(attributeValue, arrayList);
        }
    }

    private AgentWorkgroups() {
        super("workgroups", "http://jabber.org/protocol/workgroup");
    }

    public String getAgentJID() {
        return this.agentJID;
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.attribute("jid", this.agentJID).rightAngleBracket();
        for (String str : this.workgroups) {
            StringBuilder sb = new StringBuilder();
            sb.append("<workgroup jid=\"");
            sb.append(str);
            sb.append("\"/>");
            iQChildElementXmlStringBuilder.append((CharSequence) sb.toString());
        }
        return iQChildElementXmlStringBuilder;
    }

    public List<String> getWorkgroups() {
        return Collections.unmodifiableList(this.workgroups);
    }

    public AgentWorkgroups(String str) {
        this();
        this.agentJID = str;
        this.workgroups = new ArrayList();
    }

    public AgentWorkgroups(String str, List<String> list) {
        this();
        this.agentJID = str;
        this.workgroups = list;
    }
}
