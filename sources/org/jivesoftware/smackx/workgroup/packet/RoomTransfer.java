package org.jivesoftware.smackx.workgroup.packet;

import java.io.IOException;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class RoomTransfer implements ExtensionElement {
    public static final String ELEMENT_NAME = "transfer";
    public static final String NAMESPACE = "http://jabber.org/protocol/workgroup";
    /* access modifiers changed from: private */
    public String invitee;
    /* access modifiers changed from: private */
    public String inviter;
    /* access modifiers changed from: private */
    public String reason;
    /* access modifiers changed from: private */
    public String room;
    /* access modifiers changed from: private */
    public String sessionID;
    /* access modifiers changed from: private */
    public Type type;

    public static class Provider extends ExtensionElementProvider<RoomTransfer> {
        public RoomTransfer parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            RoomTransfer roomTransfer = new RoomTransfer();
            String str = "";
            roomTransfer.type = Type.valueOf(xmlPullParser.getAttributeValue(str, "type"));
            boolean z = false;
            while (!z) {
                xmlPullParser.next();
                String name = xmlPullParser.getName();
                if (xmlPullParser.getEventType() == 2) {
                    if ("session".equals(name)) {
                        roomTransfer.sessionID = xmlPullParser.getAttributeValue(str, "id");
                    } else if ("invitee".equals(name)) {
                        roomTransfer.invitee = xmlPullParser.nextText();
                    } else if ("inviter".equals(name)) {
                        roomTransfer.inviter = xmlPullParser.nextText();
                    } else if ("reason".equals(name)) {
                        roomTransfer.reason = xmlPullParser.nextText();
                    } else if ("room".equals(name)) {
                        roomTransfer.room = xmlPullParser.nextText();
                    }
                } else if (xmlPullParser.getEventType() == 3 && RoomTransfer.ELEMENT_NAME.equals(name)) {
                    z = true;
                }
            }
            return roomTransfer;
        }
    }

    public static class RoomTransferIQ extends C15617IQ {
        private final RoomTransfer roomTransfer;

        public RoomTransferIQ(RoomTransfer roomTransfer2) {
            super(RoomTransfer.ELEMENT_NAME, "http://jabber.org/protocol/workgroup");
            this.roomTransfer = roomTransfer2;
        }

        /* access modifiers changed from: protected */
        public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
            return this.roomTransfer.getIQChildElementBuilder(iQChildElementXmlStringBuilder);
        }
    }

    public enum Type {
        user,
        queue,
        workgroup
    }

    public String getElementName() {
        return ELEMENT_NAME;
    }

    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.append((CharSequence) "\" type=\"").append((CharSequence) this.type.name()).append((CharSequence) "\">");
        iQChildElementXmlStringBuilder.append((CharSequence) "<session xmlns=\"http://jivesoftware.com/protocol/workgroup\" id=\"").append((CharSequence) this.sessionID).append((CharSequence) "\"></session>");
        if (this.invitee != null) {
            iQChildElementXmlStringBuilder.append((CharSequence) "<invitee>").append((CharSequence) this.invitee).append((CharSequence) "</invitee>");
        }
        if (this.inviter != null) {
            iQChildElementXmlStringBuilder.append((CharSequence) "<inviter>").append((CharSequence) this.inviter).append((CharSequence) "</inviter>");
        }
        if (this.reason != null) {
            iQChildElementXmlStringBuilder.append((CharSequence) "<reason>").append((CharSequence) this.reason).append((CharSequence) "</reason>");
        }
        return iQChildElementXmlStringBuilder;
    }

    public String getInviter() {
        return this.inviter;
    }

    public String getNamespace() {
        return "http://jabber.org/protocol/workgroup";
    }

    public String getReason() {
        return this.reason;
    }

    public String getRoom() {
        return this.room;
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public RoomTransfer(Type type2, String str, String str2, String str3) {
        this.type = type2;
        this.invitee = str;
        this.sessionID = str2;
        this.reason = str3;
    }

    public XmlStringBuilder toXML() {
        IQChildElementXmlStringBuilder iQChildElementBuilder = getIQChildElementBuilder(new IQChildElementXmlStringBuilder((ExtensionElement) this));
        iQChildElementBuilder.closeElement((NamedElement) this);
        return iQChildElementBuilder;
    }

    private RoomTransfer() {
    }
}
