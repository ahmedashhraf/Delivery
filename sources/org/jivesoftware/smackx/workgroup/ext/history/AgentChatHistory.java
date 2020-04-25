package org.jivesoftware.smackx.workgroup.ext.history;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.provider.IQProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class AgentChatHistory extends C15617IQ {
    public static final String ELEMENT_NAME = "chat-sessions";
    public static final String NAMESPACE = "http://jivesoftware.com/protocol/workgroup";
    private List<AgentChatSession> agentChatSessions;
    private String agentJID;
    private int maxSessions;
    private long startDate;

    public static class InternalProvider extends IQProvider<AgentChatHistory> {
        private AgentChatSession parseChatSetting(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z = false;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            long j = 0;
            Date date = null;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if ("date".equals(xmlPullParser.getName())) {
                        date = new Date(Long.valueOf(xmlPullParser.nextText()).longValue());
                    }
                }
                if (next == 2) {
                    if ("duration".equals(xmlPullParser.getName())) {
                        j = Long.valueOf(xmlPullParser.nextText()).longValue();
                    }
                }
                if (next == 2) {
                    if ("visitorsName".equals(xmlPullParser.getName())) {
                        str = xmlPullParser.nextText();
                    }
                }
                if (next == 2) {
                    if ("visitorsEmail".equals(xmlPullParser.getName())) {
                        str2 = xmlPullParser.nextText();
                    }
                }
                if (next == 2) {
                    if ("sessionID".equals(xmlPullParser.getName())) {
                        str3 = xmlPullParser.nextText();
                    }
                }
                if (next == 2) {
                    if ("question".equals(xmlPullParser.getName())) {
                        str4 = xmlPullParser.nextText();
                    }
                }
                if (next == 3) {
                    if ("chat-session".equals(xmlPullParser.getName())) {
                        z = true;
                    }
                }
            }
            AgentChatSession agentChatSession = new AgentChatSession(date, j, str, str2, str3, str4);
            return agentChatSession;
        }

        public AgentChatHistory parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            if (xmlPullParser.getEventType() == 2) {
                AgentChatHistory agentChatHistory = new AgentChatHistory();
                boolean z = false;
                while (!z) {
                    int next = xmlPullParser.next();
                    if (next == 2) {
                        if ("chat-session".equals(xmlPullParser.getName())) {
                            agentChatHistory.addChatSession(parseChatSetting(xmlPullParser));
                        }
                    }
                    if (next == 3) {
                        if (AgentChatHistory.ELEMENT_NAME.equals(xmlPullParser.getName())) {
                            z = true;
                        }
                    }
                }
                return agentChatHistory;
            }
            throw new IllegalStateException("Parser not in proper position, or bad XML.");
        }
    }

    public AgentChatHistory(String str, int i, Date date) {
        this();
        this.agentJID = str;
        this.maxSessions = i;
        this.startDate = date.getTime();
    }

    public void addChatSession(AgentChatSession agentChatSession) {
        this.agentChatSessions.add(agentChatSession);
    }

    public Collection<AgentChatSession> getAgentChatSessions() {
        return this.agentChatSessions;
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        StringBuilder sb = new StringBuilder();
        sb.append(" agentJID=\"");
        sb.append(this.agentJID);
        String str = "\"";
        sb.append(str);
        iQChildElementXmlStringBuilder.append((CharSequence) sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" maxSessions=\"");
        sb2.append(this.maxSessions);
        sb2.append(str);
        iQChildElementXmlStringBuilder.append((CharSequence) sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(" startDate=\"");
        sb3.append(this.startDate);
        sb3.append(str);
        iQChildElementXmlStringBuilder.append((CharSequence) sb3.toString());
        iQChildElementXmlStringBuilder.setEmptyElement();
        return iQChildElementXmlStringBuilder;
    }

    public AgentChatHistory(String str, int i) {
        this();
        this.agentJID = str;
        this.maxSessions = i;
        this.startDate = 0;
    }

    public AgentChatHistory() {
        super(ELEMENT_NAME, "http://jivesoftware.com/protocol/workgroup");
        this.agentChatSessions = new ArrayList();
    }
}
