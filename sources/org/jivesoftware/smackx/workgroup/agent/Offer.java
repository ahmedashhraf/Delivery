package org.jivesoftware.smackx.workgroup.agent;

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.C15617IQ.Type;

public class Offer {
    private boolean accepted = false;
    private XMPPConnection connection;
    private OfferContent content;
    private Date expiresDate;
    private Map<String, List<String>> metaData;
    private boolean rejected = false;
    private AgentSession session;
    private String sessionID;
    private String userID;
    private String userJID;
    private String workgroupName;

    private class AcceptPacket extends C15617IQ {
        AcceptPacket(String str) {
            super("offer-accept", "http://jabber.org/protocol/workgroup");
            setTo(str);
            setType(Type.set);
        }

        /* access modifiers changed from: protected */
        public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
            iQChildElementXmlStringBuilder.attribute("id", Offer.this.getSessionID());
            iQChildElementXmlStringBuilder.setEmptyElement();
            return iQChildElementXmlStringBuilder;
        }
    }

    private class RejectPacket extends C15617IQ {
        RejectPacket(String str) {
            super("offer-reject", "http://jabber.org/protocol/workgroup");
            setTo(str);
            setType(Type.set);
        }

        /* access modifiers changed from: protected */
        public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
            iQChildElementXmlStringBuilder.attribute("id", Offer.this.getSessionID());
            iQChildElementXmlStringBuilder.setEmptyElement();
            return iQChildElementXmlStringBuilder;
        }
    }

    Offer(XMPPConnection xMPPConnection, AgentSession agentSession, String str, String str2, String str3, Date date, String str4, Map<String, List<String>> map, OfferContent offerContent) {
        this.connection = xMPPConnection;
        this.session = agentSession;
        this.userID = str;
        this.userJID = str2;
        this.workgroupName = str3;
        this.expiresDate = date;
        this.sessionID = str4;
        this.metaData = map;
        this.content = offerContent;
    }

    public void accept() throws NotConnectedException {
        this.connection.sendStanza(new AcceptPacket(this.session.getWorkgroupJID()));
        this.accepted = true;
    }

    public OfferContent getContent() {
        return this.content;
    }

    public Date getExpiresDate() {
        return this.expiresDate;
    }

    public Map<String, List<String>> getMetaData() {
        return this.metaData;
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public String getUserID() {
        return this.userID;
    }

    public String getUserJID() {
        return this.userJID;
    }

    public String getWorkgroupName() {
        return this.workgroupName;
    }

    public boolean isAccepted() {
        return this.accepted;
    }

    public boolean isRejected() {
        return this.rejected;
    }

    public void reject() throws NotConnectedException {
        this.connection.sendStanza(new RejectPacket(this.session.getWorkgroupJID()));
        this.rejected = true;
    }
}
