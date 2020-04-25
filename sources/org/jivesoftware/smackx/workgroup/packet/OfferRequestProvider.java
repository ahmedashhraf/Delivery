package org.jivesoftware.smackx.workgroup.packet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.p217i1.C14662d0;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smackx.workgroup.MetaData;
import org.jivesoftware.smackx.workgroup.agent.InvitationRequest;
import org.jivesoftware.smackx.workgroup.agent.OfferContent;
import org.jivesoftware.smackx.workgroup.agent.TransferRequest;
import org.jivesoftware.smackx.workgroup.agent.UserRequest;
import org.jivesoftware.smackx.workgroup.util.MetaDataUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class OfferRequestProvider extends IQProvider<C15617IQ> {

    public static class OfferRequestPacket extends C15617IQ {
        public static final String ELEMENT = "offer";
        public static final String NAMESPACE = "http://jabber.org/protocol/workgroup";
        private OfferContent content;
        private Map<String, List<String>> metaData;
        private String sessionID;
        private int timeout;
        private String userID;
        private String userJID;

        public OfferRequestPacket(String str, String str2, int i, Map<String, List<String>> map, String str3, OfferContent offerContent) {
            super("offer", "http://jabber.org/protocol/workgroup");
            this.userJID = str;
            this.userID = str2;
            this.timeout = i;
            this.metaData = map;
            this.sessionID = str3;
            this.content = offerContent;
        }

        public OfferContent getContent() {
            return this.content;
        }

        /* access modifiers changed from: protected */
        public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
            iQChildElementXmlStringBuilder.append((CharSequence) " jid=\"").append((CharSequence) this.userJID).append((CharSequence) "\">");
            iQChildElementXmlStringBuilder.append((CharSequence) "<timeout>").append((CharSequence) Integer.toString(this.timeout)).append((CharSequence) "</timeout>");
            String str = "\"/>";
            String str2 = "http://jivesoftware.com/protocol/workgroup";
            String str3 = "\" xmlns=\"";
            if (this.sessionID != null) {
                iQChildElementXmlStringBuilder.append((char) C14662d0.f42853d).append((CharSequence) "session");
                iQChildElementXmlStringBuilder.append((CharSequence) " session=\"");
                iQChildElementXmlStringBuilder.append((CharSequence) getSessionID()).append((CharSequence) str3);
                iQChildElementXmlStringBuilder.append((CharSequence) str2).append((CharSequence) str);
            }
            Map<String, List<String>> map = this.metaData;
            if (map != null) {
                iQChildElementXmlStringBuilder.append((CharSequence) MetaDataUtils.serializeMetaData(map));
            }
            if (this.userID != null) {
                iQChildElementXmlStringBuilder.append((char) C14662d0.f42853d).append((CharSequence) "user");
                iQChildElementXmlStringBuilder.append((CharSequence) " id=\"");
                iQChildElementXmlStringBuilder.append((CharSequence) this.userID).append((CharSequence) str3);
                iQChildElementXmlStringBuilder.append((CharSequence) str2).append((CharSequence) str);
            }
            return iQChildElementXmlStringBuilder;
        }

        public Map<String, List<String>> getMetaData() {
            return this.metaData;
        }

        public String getSessionID() {
            return this.sessionID;
        }

        public int getTimeout() {
            return this.timeout;
        }

        public String getUserID() {
            return this.userID;
        }

        public String getUserJID() {
            return this.userJID;
        }
    }

    public OfferRequestPacket parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
        xmlPullParser.getEventType();
        Map hashMap = new HashMap();
        String str = "";
        String attributeValue = xmlPullParser.getAttributeValue(str, "jid");
        boolean z = false;
        Map map = hashMap;
        String str2 = null;
        OfferContent offerContent = null;
        String str3 = attributeValue;
        int i2 = -1;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("timeout".equals(name)) {
                    i2 = Integer.parseInt(xmlPullParser.nextText());
                } else if (MetaData.ELEMENT_NAME.equals(name)) {
                    map = MetaDataUtils.parseMetaData(xmlPullParser);
                } else {
                    String str4 = "id";
                    if ("session".equals(name)) {
                        str2 = xmlPullParser.getAttributeValue(str, str4);
                    } else if ("user".equals(name)) {
                        str3 = xmlPullParser.getAttributeValue(str, str4);
                    } else if ("user-request".equals(name)) {
                        offerContent = UserRequest.getInstance();
                    } else {
                        String str5 = "invite";
                        String str6 = "http://jabber.org/protocol/workgroup";
                        if (str5.equals(name)) {
                            RoomInvitation roomInvitation = (RoomInvitation) PacketParserUtils.parsePacketExtension(str5, str6, xmlPullParser);
                            offerContent = new InvitationRequest(roomInvitation.getInviter(), roomInvitation.getRoom(), roomInvitation.getReason());
                        } else {
                            String str7 = RoomTransfer.ELEMENT_NAME;
                            if (str7.equals(name)) {
                                RoomTransfer roomTransfer = (RoomTransfer) PacketParserUtils.parsePacketExtension(str7, str6, xmlPullParser);
                                offerContent = new TransferRequest(roomTransfer.getInviter(), roomTransfer.getRoom(), roomTransfer.getReason());
                            }
                        }
                    }
                }
            } else if (next == 3) {
                if ("offer".equals(xmlPullParser.getName())) {
                    z = true;
                }
            }
        }
        OfferRequestPacket offerRequestPacket = new OfferRequestPacket(attributeValue, str3, i2, map, str2, offerContent);
        offerRequestPacket.setType(Type.set);
        return offerRequestPacket;
    }
}
