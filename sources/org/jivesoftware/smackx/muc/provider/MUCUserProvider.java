package org.jivesoftware.smackx.muc.provider;

import java.io.IOException;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.muc.packet.MUCUser;
import org.jivesoftware.smackx.muc.packet.MUCUser.Decline;
import org.jivesoftware.smackx.muc.packet.MUCUser.Invite;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class MUCUserProvider extends ExtensionElementProvider<MUCUser> {
    private static Decline parseDecline(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Decline decline = new Decline();
        String str = "";
        decline.setFrom(xmlPullParser.getAttributeValue(str, PrivacyItem.SUBSCRIPTION_FROM));
        decline.setTo(xmlPullParser.getAttributeValue(str, "to"));
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("reason")) {
                    decline.setReason(xmlPullParser.nextText());
                }
            } else if (next == 3 && xmlPullParser.getName().equals("decline")) {
                z = true;
            }
        }
        return decline;
    }

    private static Invite parseInvite(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Invite invite = new Invite();
        String str = "";
        invite.setFrom(xmlPullParser.getAttributeValue(str, PrivacyItem.SUBSCRIPTION_FROM));
        invite.setTo(xmlPullParser.getAttributeValue(str, "to"));
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("reason")) {
                    invite.setReason(xmlPullParser.nextText());
                }
            } else if (next == 3 && xmlPullParser.getName().equals("invite")) {
                z = true;
            }
        }
        return invite;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jivesoftware.smackx.muc.packet.MUCUser parse(org.xmlpull.v1.XmlPullParser r10, int r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r9 = this;
            org.jivesoftware.smackx.muc.packet.MUCUser r0 = new org.jivesoftware.smackx.muc.packet.MUCUser
            r0.<init>()
        L_0x0005:
            int r1 = r10.next()
            r2 = 3
            r3 = 2
            if (r1 == r3) goto L_0x0017
            if (r1 == r2) goto L_0x0010
            goto L_0x0005
        L_0x0010:
            int r1 = r10.getDepth()
            if (r1 != r11) goto L_0x0005
            return r0
        L_0x0017:
            java.lang.String r1 = r10.getName()
            r4 = -1
            int r5 = r1.hashCode()
            r6 = 5
            r7 = 4
            r8 = 1
            switch(r5) {
                case -1183699191: goto L_0x0059;
                case -892481550: goto L_0x004f;
                case 3242771: goto L_0x0045;
                case 1216985755: goto L_0x003b;
                case 1542349558: goto L_0x0031;
                case 1557372922: goto L_0x0027;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0063
        L_0x0027:
            java.lang.String r5 = "destroy"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0063
            r1 = 5
            goto L_0x0064
        L_0x0031:
            java.lang.String r5 = "decline"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0063
            r1 = 4
            goto L_0x0064
        L_0x003b:
            java.lang.String r5 = "password"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0063
            r1 = 2
            goto L_0x0064
        L_0x0045:
            java.lang.String r5 = "item"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0063
            r1 = 1
            goto L_0x0064
        L_0x004f:
            java.lang.String r5 = "status"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0063
            r1 = 3
            goto L_0x0064
        L_0x0059:
            java.lang.String r5 = "invite"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0063
            r1 = 0
            goto L_0x0064
        L_0x0063:
            r1 = -1
        L_0x0064:
            if (r1 == 0) goto L_0x00a4
            if (r1 == r8) goto L_0x009b
            if (r1 == r3) goto L_0x0092
            if (r1 == r2) goto L_0x0081
            if (r1 == r7) goto L_0x0079
            if (r1 == r6) goto L_0x0071
            goto L_0x0005
        L_0x0071:
            org.jivesoftware.smackx.muc.packet.Destroy r1 = org.jivesoftware.smackx.muc.provider.MUCParserUtils.parseDestroy(r10)
            r0.setDestroy(r1)
            goto L_0x0005
        L_0x0079:
            org.jivesoftware.smackx.muc.packet.MUCUser$Decline r1 = parseDecline(r10)
            r0.setDecline(r1)
            goto L_0x0005
        L_0x0081:
            java.lang.String r1 = ""
            java.lang.String r2 = "code"
            java.lang.String r1 = r10.getAttributeValue(r1, r2)
            org.jivesoftware.smackx.muc.packet.MUCUser$Status r1 = org.jivesoftware.smackx.muc.packet.MUCUser.Status.create(r1)
            r0.addStatusCode(r1)
            goto L_0x0005
        L_0x0092:
            java.lang.String r1 = r10.nextText()
            r0.setPassword(r1)
            goto L_0x0005
        L_0x009b:
            org.jivesoftware.smackx.muc.packet.MUCItem r1 = org.jivesoftware.smackx.muc.provider.MUCParserUtils.parseItem(r10)
            r0.setItem(r1)
            goto L_0x0005
        L_0x00a4:
            org.jivesoftware.smackx.muc.packet.MUCUser$Invite r1 = parseInvite(r10)
            r0.setInvite(r1)
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.muc.provider.MUCUserProvider.parse(org.xmlpull.v1.XmlPullParser, int):org.jivesoftware.smackx.muc.packet.MUCUser");
    }
}
