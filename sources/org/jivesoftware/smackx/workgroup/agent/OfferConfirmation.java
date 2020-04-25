package org.jivesoftware.smackx.workgroup.agent;

import java.io.IOException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.SimpleIQ;
import org.jivesoftware.smack.provider.IQProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class OfferConfirmation extends SimpleIQ {
    private long sessionID;
    private String userJID;

    private class NotifyServicePacket extends C15617IQ {
        String roomName;

        NotifyServicePacket(String str, String str2) {
            super("offer-confirmation", "http://jabber.org/protocol/workgroup");
            setTo(str);
            setType(Type.result);
            this.roomName = str2;
        }

        /* access modifiers changed from: protected */
        public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
            iQChildElementXmlStringBuilder.attribute("roomname", this.roomName);
            iQChildElementXmlStringBuilder.setEmptyElement();
            return iQChildElementXmlStringBuilder;
        }
    }

    public static class Provider extends IQProvider<OfferConfirmation> {
        public OfferConfirmation parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            OfferConfirmation offerConfirmation = new OfferConfirmation();
            boolean z = false;
            while (!z) {
                xmlPullParser.next();
                String name = xmlPullParser.getName();
                if (xmlPullParser.getEventType() == 2 && "user-jid".equals(name)) {
                    try {
                        offerConfirmation.setUserJID(xmlPullParser.nextText());
                    } catch (NumberFormatException unused) {
                    }
                } else if (xmlPullParser.getEventType() == 2 && "session-id".equals(name)) {
                    offerConfirmation.setSessionID(Long.valueOf(xmlPullParser.nextText()).longValue());
                } else if (xmlPullParser.getEventType() == 3 && "offer-confirmation".equals(name)) {
                    z = true;
                }
            }
            return offerConfirmation;
        }
    }

    public OfferConfirmation() {
        super("offer-confirmation", "http://jabber.org/protocol/workgroup");
    }

    public long getSessionID() {
        return this.sessionID;
    }

    public String getUserJID() {
        return this.userJID;
    }

    public void notifyService(XMPPConnection xMPPConnection, String str, String str2) throws NotConnectedException {
        xMPPConnection.sendStanza(new NotifyServicePacket(str, str2));
    }

    public void setSessionID(long j) {
        this.sessionID = j;
    }

    public void setUserJID(String str) {
        this.userJID = str;
    }
}
