package org.jivesoftware.smackx.workgroup.packet;

import java.io.IOException;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.provider.IQProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class AgentInfo extends C15617IQ {
    public static final String ELEMENT_NAME = "agent-info";
    public static final String NAMESPACE = "http://jivesoftware.com/protocol/workgroup";
    private String jid;
    private String name;

    public static class Provider extends IQProvider<AgentInfo> {
        public AgentInfo parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            AgentInfo agentInfo = new AgentInfo();
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (xmlPullParser.getName().equals("jid")) {
                        agentInfo.setJid(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals("name")) {
                        agentInfo.setName(xmlPullParser.nextText());
                    }
                } else if (next == 3 && xmlPullParser.getName().equals(AgentInfo.ELEMENT_NAME)) {
                    z = true;
                }
            }
            return agentInfo;
        }
    }

    public AgentInfo() {
        super(ELEMENT_NAME, "http://jivesoftware.com/protocol/workgroup");
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        if (this.jid != null) {
            iQChildElementXmlStringBuilder.append((CharSequence) "<jid>").append((CharSequence) getJid()).append((CharSequence) "</jid>");
        }
        if (this.name != null) {
            iQChildElementXmlStringBuilder.append((CharSequence) "<name>").append((CharSequence) getName()).append((CharSequence) "</name>");
        }
        return iQChildElementXmlStringBuilder;
    }

    public String getJid() {
        return this.jid;
    }

    public String getName() {
        return this.name;
    }

    public void setJid(String str) {
        this.jid = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
