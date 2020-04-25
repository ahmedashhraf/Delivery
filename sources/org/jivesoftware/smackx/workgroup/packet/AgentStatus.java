package org.jivesoftware.smackx.workgroup.packet;

import com.mrsool.utils.C11644i;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class AgentStatus implements ExtensionElement {
    public static final String ELEMENT_NAME = "agent-status";
    public static final String NAMESPACE = "http://jabber.org/protocol/workgroup";
    /* access modifiers changed from: private */
    public static final SimpleDateFormat UTC_FORMAT = new SimpleDateFormat("yyyyMMdd'T'HH:mm:ss");
    /* access modifiers changed from: private */
    public List<ChatInfo> currentChats = new ArrayList();
    /* access modifiers changed from: private */
    public int maxChats = -1;
    /* access modifiers changed from: private */
    public String workgroupJID;

    public static class ChatInfo {
        private Date date;
        private String email;
        private String question;
        private String sessionID;
        private String userID;
        private String username;

        public ChatInfo(String str, String str2, Date date2, String str3, String str4, String str5) {
            this.sessionID = str;
            this.userID = str2;
            this.date = date2;
            this.email = str3;
            this.username = str4;
            this.question = str5;
        }

        public Date getDate() {
            return this.date;
        }

        public String getEmail() {
            return this.email;
        }

        public String getQuestion() {
            return this.question;
        }

        public String getSessionID() {
            return this.sessionID;
        }

        public String getUserID() {
            return this.userID;
        }

        public String getUsername() {
            return this.username;
        }

        public String toXML() {
            StringBuilder sb = new StringBuilder();
            sb.append("<chat ");
            String str = "\"";
            if (this.sessionID != null) {
                sb.append(" sessionID=\"");
                sb.append(this.sessionID);
                sb.append(str);
            }
            if (this.userID != null) {
                sb.append(" userID=\"");
                sb.append(this.userID);
                sb.append(str);
            }
            if (this.date != null) {
                sb.append(" startTime=\"");
                sb.append(AgentStatus.UTC_FORMAT.format(this.date));
                sb.append(str);
            }
            if (this.email != null) {
                sb.append(" email=\"");
                sb.append(this.email);
                sb.append(str);
            }
            if (this.username != null) {
                sb.append(" username=\"");
                sb.append(this.username);
                sb.append(str);
            }
            if (this.question != null) {
                sb.append(" question=\"");
                sb.append(this.question);
                sb.append(str);
            }
            sb.append("/>");
            return sb.toString();
        }
    }

    public static class Provider extends ExtensionElementProvider<AgentStatus> {
        private ChatInfo parseChatInfo(XmlPullParser xmlPullParser) {
            Date date;
            String str = "";
            String attributeValue = xmlPullParser.getAttributeValue(str, "sessionID");
            String attributeValue2 = xmlPullParser.getAttributeValue(str, "userID");
            try {
                date = AgentStatus.UTC_FORMAT.parse(xmlPullParser.getAttributeValue(str, "startTime"));
            } catch (ParseException unused) {
                date = null;
            }
            ChatInfo chatInfo = new ChatInfo(attributeValue, attributeValue2, date, xmlPullParser.getAttributeValue(str, "email"), xmlPullParser.getAttributeValue(str, "username"), xmlPullParser.getAttributeValue(str, "question"));
            return chatInfo;
        }

        public AgentStatus parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            AgentStatus agentStatus = new AgentStatus();
            agentStatus.workgroupJID = xmlPullParser.getAttributeValue("", "jid");
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (C11644i.f33274c6.equals(xmlPullParser.getName())) {
                        agentStatus.currentChats.add(parseChatInfo(xmlPullParser));
                    } else {
                        if ("max-chats".equals(xmlPullParser.getName())) {
                            agentStatus.maxChats = Integer.parseInt(xmlPullParser.nextText());
                        }
                    }
                } else if (next == 3) {
                    if (AgentStatus.ELEMENT_NAME.equals(xmlPullParser.getName())) {
                        z = true;
                    }
                }
            }
            return agentStatus;
        }
    }

    static {
        UTC_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT+0"));
    }

    AgentStatus() {
    }

    public List<ChatInfo> getCurrentChats() {
        return Collections.unmodifiableList(this.currentChats);
    }

    public String getElementName() {
        return ELEMENT_NAME;
    }

    public int getMaxChats() {
        return this.maxChats;
    }

    public String getNamespace() {
        return "http://jabber.org/protocol/workgroup";
    }

    public String getWorkgroupJID() {
        return this.workgroupJID;
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(ELEMENT_NAME);
        sb.append(" xmlns=\"");
        sb.append("http://jabber.org/protocol/workgroup");
        String str = "\"";
        sb.append(str);
        if (this.workgroupJID != null) {
            sb.append(" jid=\"");
            sb.append(this.workgroupJID);
            sb.append(str);
        }
        sb.append(">");
        if (this.maxChats != -1) {
            sb.append("<max-chats>");
            sb.append(this.maxChats);
            sb.append("</max-chats>");
        }
        if (!this.currentChats.isEmpty()) {
            sb.append("<current-chats xmlns= \"http://jivesoftware.com/protocol/workgroup\">");
            for (ChatInfo xml : this.currentChats) {
                sb.append(xml.toXML());
            }
            sb.append("</current-chats>");
        }
        sb.append("</");
        sb.append(getElementName());
        sb.append("> ");
        return sb.toString();
    }
}
