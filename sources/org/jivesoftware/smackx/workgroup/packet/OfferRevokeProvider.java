package org.jivesoftware.smackx.workgroup.packet;

import java.io.IOException;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.provider.IQProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class OfferRevokeProvider extends IQProvider<C15617IQ> {

    public class OfferRevokePacket extends C15617IQ {
        public static final String ELEMENT = "offer-revoke";
        public static final String NAMESPACE = "http://jabber.org/protocol/workgroup";
        private String reason;
        private String sessionID;
        private String userID;
        private String userJID;

        public OfferRevokePacket(String str, String str2, String str3, String str4) {
            super(ELEMENT, "http://jabber.org/protocol/workgroup");
            this.userJID = str;
            this.userID = str2;
            this.reason = str3;
            this.sessionID = str4;
        }

        /* access modifiers changed from: protected */
        public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
            iQChildElementXmlStringBuilder.append((CharSequence) " jid=\"").append((CharSequence) this.userID).append((CharSequence) "\">");
            if (this.reason != null) {
                iQChildElementXmlStringBuilder.append((CharSequence) "<reason>").append((CharSequence) this.reason).append((CharSequence) "</reason>");
            }
            String str = this.sessionID;
            if (str != null) {
                iQChildElementXmlStringBuilder.append((CharSequence) new SessionID(str).toXML());
            }
            String str2 = this.userID;
            if (str2 != null) {
                iQChildElementXmlStringBuilder.append((CharSequence) new UserID(str2).toXML());
            }
            return iQChildElementXmlStringBuilder;
        }

        public String getReason() {
            return this.reason;
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
    }

    public OfferRevokePacket parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
        String str = "";
        String attributeValue = xmlPullParser.getAttributeValue(str, "jid");
        boolean z = false;
        String str2 = null;
        String str3 = null;
        String str4 = attributeValue;
        while (!z) {
            int next = xmlPullParser.next();
            if (next != 2 || !xmlPullParser.getName().equals("reason")) {
                String str5 = "id";
                if (next == 2 && xmlPullParser.getName().equals("session")) {
                    str3 = xmlPullParser.getAttributeValue(str, str5);
                } else if (next == 2 && xmlPullParser.getName().equals("user")) {
                    str4 = xmlPullParser.getAttributeValue(str, str5);
                } else if (next == 3 && xmlPullParser.getName().equals(OfferRevokePacket.ELEMENT)) {
                    z = true;
                }
            } else {
                str2 = xmlPullParser.nextText();
            }
        }
        OfferRevokePacket offerRevokePacket = new OfferRevokePacket(attributeValue, str4, str2, str3);
        return offerRevokePacket;
    }
}
