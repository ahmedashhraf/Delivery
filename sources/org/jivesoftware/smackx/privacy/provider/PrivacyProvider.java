package org.jivesoftware.smackx.privacy.provider;

import java.io.IOException;
import java.util.ArrayList;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.privacy.packet.Privacy;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p212io.branch.referral.C6009d;

public class PrivacyProvider extends IQProvider<Privacy> {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.jivesoftware.smackx.privacy.packet.PrivacyItem parseItem(org.xmlpull.v1.XmlPullParser r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, org.jivesoftware.smack.SmackException {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "action"
            java.lang.String r1 = r9.getAttributeValue(r0, r1)
            java.lang.String r2 = "order"
            java.lang.Long r2 = org.jivesoftware.smack.util.ParserUtils.getLongAttribute(r9, r2)
            long r7 = r2.longValue()
            java.lang.String r2 = "type"
            java.lang.String r2 = r9.getAttributeValue(r0, r2)
            int r3 = r1.hashCode()
            r4 = 3079692(0x2efe0c, float:4.315568E-39)
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L_0x0033
            r4 = 92906313(0x589a349, float:1.29434E-35)
            if (r3 == r4) goto L_0x0029
            goto L_0x003d
        L_0x0029:
            java.lang.String r3 = "allow"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x003d
            r3 = 0
            goto L_0x003e
        L_0x0033:
            java.lang.String r3 = "deny"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x003d
            r3 = 1
            goto L_0x003e
        L_0x003d:
            r3 = -1
        L_0x003e:
            if (r3 == 0) goto L_0x0060
            if (r3 != r6) goto L_0x0044
            r6 = 0
            goto L_0x0060
        L_0x0044:
            org.jivesoftware.smack.SmackException r9 = new org.jivesoftware.smack.SmackException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unkown action value '"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x0060:
            if (r2 == 0) goto L_0x0073
            java.lang.String r1 = "value"
            java.lang.String r5 = r9.getAttributeValue(r0, r1)
            org.jivesoftware.smackx.privacy.packet.PrivacyItem r0 = new org.jivesoftware.smackx.privacy.packet.PrivacyItem
            org.jivesoftware.smackx.privacy.packet.PrivacyItem$Type r4 = org.jivesoftware.smackx.privacy.packet.PrivacyItem.Type.valueOf(r2)
            r3 = r0
            r3.<init>(r4, r5, r6, r7)
            goto L_0x0078
        L_0x0073:
            org.jivesoftware.smackx.privacy.packet.PrivacyItem r0 = new org.jivesoftware.smackx.privacy.packet.PrivacyItem
            r0.<init>(r6, r7)
        L_0x0078:
            parseItemChildElements(r9, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.privacy.provider.PrivacyProvider.parseItem(org.xmlpull.v1.XmlPullParser):org.jivesoftware.smackx.privacy.packet.PrivacyItem");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void parseItemChildElements(org.xmlpull.v1.XmlPullParser r8, org.jivesoftware.smackx.privacy.packet.PrivacyItem r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r8.getDepth()
        L_0x0004:
            int r1 = r8.next()
            r2 = 3
            r3 = 2
            if (r1 == r3) goto L_0x0016
            if (r1 == r2) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            int r1 = r8.getDepth()
            if (r1 != r0) goto L_0x0004
            return
        L_0x0016:
            java.lang.String r1 = r8.getName()
            r4 = -1
            int r5 = r1.hashCode()
            r6 = -1240091849(0xffffffffb615b337, float:-2.2307047E-6)
            r7 = 1
            if (r5 == r6) goto L_0x0052
            r6 = 3368(0xd28, float:4.72E-42)
            if (r5 == r6) goto L_0x0048
            r6 = 211864444(0xca0cb7c, float:2.477437E-31)
            if (r5 == r6) goto L_0x003e
            r6 = 954925063(0x38eb0007, float:1.1205678E-4)
            if (r5 == r6) goto L_0x0034
            goto L_0x005c
        L_0x0034:
            java.lang.String r5 = "message"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x005c
            r1 = 1
            goto L_0x005d
        L_0x003e:
            java.lang.String r5 = "presence-out"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x005c
            r1 = 3
            goto L_0x005d
        L_0x0048:
            java.lang.String r5 = "iq"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x005c
            r1 = 0
            goto L_0x005d
        L_0x0052:
            java.lang.String r5 = "presence-in"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x005c
            r1 = 2
            goto L_0x005d
        L_0x005c:
            r1 = -1
        L_0x005d:
            if (r1 == 0) goto L_0x0072
            if (r1 == r7) goto L_0x006e
            if (r1 == r3) goto L_0x006a
            if (r1 == r2) goto L_0x0066
            goto L_0x0004
        L_0x0066:
            r9.setFilterPresenceOut(r7)
            goto L_0x0004
        L_0x006a:
            r9.setFilterPresenceIn(r7)
            goto L_0x0004
        L_0x006e:
            r9.setFilterMessage(r7)
            goto L_0x0004
        L_0x0072:
            r9.setFilterIQ(r7)
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.privacy.provider.PrivacyProvider.parseItemChildElements(org.xmlpull.v1.XmlPullParser, org.jivesoftware.smackx.privacy.packet.PrivacyItem):void");
    }

    private static void parseList(XmlPullParser xmlPullParser, Privacy privacy) throws XmlPullParserException, IOException, SmackException {
        String attributeValue = xmlPullParser.getAttributeValue("", "name");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("item")) {
                    arrayList.add(parseItem(xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("list")) {
                z = true;
            }
        }
        privacy.setPrivacyList(attributeValue, arrayList);
    }

    public Privacy parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
        Privacy privacy = new Privacy();
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String str = "name";
                String str2 = "";
                if (xmlPullParser.getName().equals("active")) {
                    String attributeValue = xmlPullParser.getAttributeValue(str2, str);
                    if (attributeValue == null) {
                        privacy.setDeclineActiveList(true);
                    } else {
                        privacy.setActiveName(attributeValue);
                    }
                } else if (xmlPullParser.getName().equals(C6009d.f17209I)) {
                    String attributeValue2 = xmlPullParser.getAttributeValue(str2, str);
                    if (attributeValue2 == null) {
                        privacy.setDeclineDefaultList(true);
                    } else {
                        privacy.setDefaultName(attributeValue2);
                    }
                } else if (xmlPullParser.getName().equals("list")) {
                    parseList(xmlPullParser, privacy);
                }
            } else if (next == 3 && xmlPullParser.getName().equals("query")) {
                z = true;
            }
        }
        return privacy;
    }
}
