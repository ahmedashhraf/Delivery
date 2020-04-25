package org.jivesoftware.smackx.workgroup.packet;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.provider.IQProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class AgentStatusRequest extends C15617IQ {
    public static final String ELEMENT_NAME = "agent-status-request";
    public static final String NAMESPACE = "http://jabber.org/protocol/workgroup";
    /* access modifiers changed from: private */
    public Set<Item> agents = new HashSet();

    public static class Item {
        private String jid;
        private String name;
        private String type;

        public Item(String str, String str2, String str3) {
            this.jid = str;
            this.type = str2;
            this.name = str3;
        }

        public String getJID() {
            return this.jid;
        }

        public String getName() {
            return this.name;
        }

        public String getType() {
            return this.type;
        }
    }

    public static class Provider extends IQProvider<AgentStatusRequest> {
        private Item parseAgent(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            String str = "";
            String attributeValue = xmlPullParser.getAttributeValue(str, "jid");
            String attributeValue2 = xmlPullParser.getAttributeValue(str, "type");
            boolean z = false;
            String str2 = null;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if ("name".equals(xmlPullParser.getName())) {
                        str2 = xmlPullParser.nextText();
                    }
                }
                if (next == 3) {
                    if ("agent".equals(xmlPullParser.getName())) {
                        z = true;
                    }
                }
            }
            return new Item(attributeValue, attributeValue2, str2);
        }

        public AgentStatusRequest parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            AgentStatusRequest agentStatusRequest = new AgentStatusRequest();
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if ("agent".equals(xmlPullParser.getName())) {
                        agentStatusRequest.agents.add(parseAgent(xmlPullParser));
                    }
                }
                if (next == 3) {
                    if (AgentStatusRequest.ELEMENT_NAME.equals(xmlPullParser.getName())) {
                        z = true;
                    }
                }
            }
            return agentStatusRequest;
        }
    }

    public AgentStatusRequest() {
        super(ELEMENT_NAME, "http://jabber.org/protocol/workgroup");
    }

    public int getAgentCount() {
        return this.agents.size();
    }

    public Set<Item> getAgents() {
        return Collections.unmodifiableSet(this.agents);
    }

    public String getElementName() {
        return ELEMENT_NAME;
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        synchronized (this.agents) {
            for (Item item : this.agents) {
                iQChildElementXmlStringBuilder.append((CharSequence) "<agent jid=\"").append((CharSequence) item.getJID()).append((CharSequence) "\">");
                if (item.getName() != null) {
                    iQChildElementXmlStringBuilder.append((CharSequence) "<name xmlns=\"http://jivesoftware.com/protocol/workgroup\">");
                    iQChildElementXmlStringBuilder.append((CharSequence) item.getName());
                    iQChildElementXmlStringBuilder.append((CharSequence) "</name>");
                }
                iQChildElementXmlStringBuilder.append((CharSequence) "</agent>");
            }
        }
        return iQChildElementXmlStringBuilder;
    }

    public String getNamespace() {
        return "http://jabber.org/protocol/workgroup";
    }
}
