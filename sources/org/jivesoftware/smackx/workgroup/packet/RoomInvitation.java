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

public class RoomInvitation implements ExtensionElement {
    public static final String ELEMENT_NAME = "invite";
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

    public static class Provider extends ExtensionElementProvider<RoomInvitation> {
        public RoomInvitation parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            RoomInvitation roomInvitation = new RoomInvitation();
            String str = "";
            roomInvitation.type = Type.valueOf(xmlPullParser.getAttributeValue(str, "type"));
            boolean z = false;
            while (!z) {
                xmlPullParser.next();
                String name = xmlPullParser.getName();
                if (xmlPullParser.getEventType() == 2) {
                    if ("session".equals(name)) {
                        roomInvitation.sessionID = xmlPullParser.getAttributeValue(str, "id");
                    } else if ("invitee".equals(name)) {
                        roomInvitation.invitee = xmlPullParser.nextText();
                    } else if ("inviter".equals(name)) {
                        roomInvitation.inviter = xmlPullParser.nextText();
                    } else if ("reason".equals(name)) {
                        roomInvitation.reason = xmlPullParser.nextText();
                    } else if ("room".equals(name)) {
                        roomInvitation.room = xmlPullParser.nextText();
                    }
                } else if (xmlPullParser.getEventType() == 3 && "invite".equals(name)) {
                    z = true;
                }
            }
            return roomInvitation;
        }
    }

    public static class RoomInvitationIQ extends C15617IQ {
        private final RoomInvitation roomInvitation;

        public RoomInvitationIQ(RoomInvitation roomInvitation2) {
            super("invite", "http://jabber.org/protocol/workgroup");
            this.roomInvitation = roomInvitation2;
        }

        /* access modifiers changed from: protected */
        public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
            return this.roomInvitation.getIQChildElementBuilder(iQChildElementXmlStringBuilder);
        }
    }

    public enum Type {
        user,
        queue,
        workgroup
    }

    public String getElementName() {
        return "invite";
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

    public RoomInvitation(Type type2, String str, String str2, String str3) {
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

    private RoomInvitation() {
    }
}
