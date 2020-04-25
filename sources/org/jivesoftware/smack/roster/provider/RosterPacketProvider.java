package org.jivesoftware.smack.roster.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.roster.packet.RosterPacket;

public class RosterPacketProvider extends IQProvider<RosterPacket> {
    public static final RosterPacketProvider INSTANCE = new RosterPacketProvider();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (r2.equals(r5) != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        if (r2.equals(r5) != false) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jivesoftware.smack.roster.packet.RosterPacket parse(org.xmlpull.v1.XmlPullParser r10, int r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, org.jivesoftware.smack.SmackException {
        /*
            r9 = this;
            org.jivesoftware.smack.roster.packet.RosterPacket r11 = new org.jivesoftware.smack.roster.packet.RosterPacket
            r11.<init>()
            java.lang.String r0 = ""
            java.lang.String r1 = "ver"
            java.lang.String r1 = r10.getAttributeValue(r0, r1)
            r11.setVersion(r1)
            r1 = 0
        L_0x0011:
            int r2 = r10.next()
            r3 = 2
            r4 = 0
            java.lang.String r5 = "item"
            r6 = 3242771(0x317b13, float:4.54409E-39)
            r7 = -1
            r8 = 1
            if (r2 == r3) goto L_0x0050
            r3 = 3
            if (r2 == r3) goto L_0x0024
            goto L_0x0011
        L_0x0024:
            java.lang.String r2 = r10.getName()
            int r3 = r2.hashCode()
            if (r3 == r6) goto L_0x003e
            r4 = 107944136(0x66f18c8, float:4.496911E-35)
            if (r3 == r4) goto L_0x0034
            goto L_0x0045
        L_0x0034:
            java.lang.String r3 = "query"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0045
            r4 = 1
            goto L_0x0046
        L_0x003e:
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r4 = -1
        L_0x0046:
            if (r4 == 0) goto L_0x004c
            if (r4 == r8) goto L_0x004b
            goto L_0x0011
        L_0x004b:
            return r11
        L_0x004c:
            r11.addRosterItem(r1)
            goto L_0x0011
        L_0x0050:
            java.lang.String r2 = r10.getName()
            int r3 = r2.hashCode()
            if (r3 == r6) goto L_0x006a
            r4 = 98629247(0x5e0f67f, float:2.1155407E-35)
            if (r3 == r4) goto L_0x0060
            goto L_0x0071
        L_0x0060:
            java.lang.String r3 = "group"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r4 = 1
            goto L_0x0072
        L_0x006a:
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r4 = -1
        L_0x0072:
            if (r4 == 0) goto L_0x008b
            if (r4 == r8) goto L_0x0077
            goto L_0x0011
        L_0x0077:
            java.lang.String r2 = r10.nextText()
            if (r2 == 0) goto L_0x0011
            java.lang.String r3 = r2.trim()
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x0011
            r1.addGroupName(r2)
            goto L_0x0011
        L_0x008b:
            java.lang.String r1 = "jid"
            java.lang.String r1 = r10.getAttributeValue(r0, r1)
            java.lang.String r2 = "name"
            java.lang.String r2 = r10.getAttributeValue(r0, r2)
            org.jivesoftware.smack.roster.packet.RosterPacket$Item r3 = new org.jivesoftware.smack.roster.packet.RosterPacket$Item
            r3.<init>(r1, r2)
            java.lang.String r1 = "ask"
            java.lang.String r1 = r10.getAttributeValue(r0, r1)
            org.jivesoftware.smack.roster.packet.RosterPacket$ItemStatus r1 = org.jivesoftware.smack.roster.packet.RosterPacket.ItemStatus.fromString(r1)
            r3.setItemStatus(r1)
            java.lang.String r1 = "subscription"
            java.lang.String r1 = r10.getAttributeValue(r0, r1)
            if (r1 == 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            java.lang.String r1 = "none"
        L_0x00b4:
            org.jivesoftware.smack.roster.packet.RosterPacket$ItemType r1 = org.jivesoftware.smack.roster.packet.RosterPacket.ItemType.valueOf(r1)
            r3.setItemType(r1)
            r1 = r3
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.roster.provider.RosterPacketProvider.parse(org.xmlpull.v1.XmlPullParser, int):org.jivesoftware.smack.roster.packet.RosterPacket");
    }
}
