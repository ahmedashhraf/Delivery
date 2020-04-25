package org.jivesoftware.smackx.vcardtemp.provider;

import com.facebook.share.internal.ShareConstants;
import java.io.IOException;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.vcardtemp.packet.VCard;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class VCardProvider extends IQProvider<VCard> {
    private static final String[] ADR;
    private static final String[] TEL;

    static {
        String str = "PREF";
        ADR = new String[]{"POSTAL", "PARCEL", "DOM", "INTL", str, "POBOX", "EXTADR", "STREET", "LOCALITY", "REGION", "PCODE", "CTRY", "FF"};
        TEL = new String[]{"VOICE", "FAX", "PAGER", "MSG", "CELL", ShareConstants.VIDEO_URL, "BBS", "MODEM", "ISDN", "PCS", str};
    }

    private static void parseAddress(XmlPullParser xmlPullParser, VCard vCard) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        boolean z = true;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("HOME".equals(name)) {
                    z = false;
                } else {
                    for (String equals : ADR) {
                        if (equals.equals(name)) {
                            if (z) {
                                vCard.setAddressFieldWork(name, xmlPullParser.nextText());
                            } else {
                                vCard.setAddressFieldHome(name, xmlPullParser.nextText());
                            }
                        }
                    }
                }
            } else if (next == 3 && xmlPullParser.getDepth() == depth) {
                return;
            }
        }
    }

    private static void parseEmail(XmlPullParser xmlPullParser, VCard vCard) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        boolean z = false;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                char c = 65535;
                int hashCode = name.hashCode();
                if (hashCode != -1782700506) {
                    if (hashCode == 2670353 && name.equals("WORK")) {
                        c = 0;
                    }
                } else if (name.equals("USERID")) {
                    c = 1;
                }
                if (c == 0) {
                    z = true;
                } else if (c == 1) {
                    if (z) {
                        vCard.setEmailWork(xmlPullParser.nextText());
                    } else {
                        vCard.setEmailHome(xmlPullParser.nextText());
                    }
                }
            } else if (next == 3 && xmlPullParser.getDepth() == depth) {
                return;
            }
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void parseName(org.xmlpull.v1.XmlPullParser r8, org.jivesoftware.smackx.vcardtemp.packet.VCard r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
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
            r6 = 4
            r7 = 1
            switch(r5) {
                case -2021012075: goto L_0x004d;
                case -1926781294: goto L_0x0043;
                case -1838093487: goto L_0x0039;
                case 67829597: goto L_0x002f;
                case 2066435940: goto L_0x0025;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x0057
        L_0x0025:
            java.lang.String r5 = "FAMILY"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0057
            r1 = 0
            goto L_0x0058
        L_0x002f:
            java.lang.String r5 = "GIVEN"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0057
            r1 = 1
            goto L_0x0058
        L_0x0039:
            java.lang.String r5 = "SUFFIX"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0057
            r1 = 4
            goto L_0x0058
        L_0x0043:
            java.lang.String r5 = "PREFIX"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0057
            r1 = 3
            goto L_0x0058
        L_0x004d:
            java.lang.String r5 = "MIDDLE"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0057
            r1 = 2
            goto L_0x0058
        L_0x0057:
            r1 = -1
        L_0x0058:
            if (r1 == 0) goto L_0x0083
            if (r1 == r7) goto L_0x007b
            if (r1 == r3) goto L_0x0073
            if (r1 == r2) goto L_0x006b
            if (r1 == r6) goto L_0x0063
            goto L_0x0004
        L_0x0063:
            java.lang.String r1 = r8.nextText()
            r9.setSuffix(r1)
            goto L_0x0004
        L_0x006b:
            java.lang.String r1 = r8.nextText()
            r9.setPrefix(r1)
            goto L_0x0004
        L_0x0073:
            java.lang.String r1 = r8.nextText()
            r9.setMiddleName(r1)
            goto L_0x0004
        L_0x007b:
            java.lang.String r1 = r8.nextText()
            r9.setFirstName(r1)
            goto L_0x0004
        L_0x0083:
            java.lang.String r1 = r8.nextText()
            r9.setLastName(r1)
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.vcardtemp.provider.VCardProvider.parseName(org.xmlpull.v1.XmlPullParser, org.jivesoftware.smackx.vcardtemp.packet.VCard):void");
    }

    private static void parseOrg(XmlPullParser xmlPullParser, VCard vCard) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                char c = 65535;
                int hashCode = name.hashCode();
                if (hashCode != -486104241) {
                    if (hashCode == -485883320 && name.equals("ORGUNIT")) {
                        c = 1;
                    }
                } else if (name.equals("ORGNAME")) {
                    c = 0;
                }
                if (c == 0) {
                    vCard.setOrganization(xmlPullParser.nextText());
                } else if (c == 1) {
                    vCard.setOrganizationUnit(xmlPullParser.nextText());
                }
            } else if (next == 3 && xmlPullParser.getDepth() == depth) {
                return;
            }
        }
    }

    private static void parsePhoto(XmlPullParser xmlPullParser, VCard vCard) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        String str = null;
        String str2 = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3 && xmlPullParser.getDepth() == depth) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                char c = 65535;
                int hashCode = name.hashCode();
                if (hashCode != 2590522) {
                    if (hashCode == 1959349434 && name.equals("BINVAL")) {
                        c = 0;
                    }
                } else if (name.equals("TYPE")) {
                    c = 1;
                }
                if (c == 0) {
                    str = xmlPullParser.nextText();
                } else if (c == 1) {
                    str2 = xmlPullParser.nextText();
                }
            }
        }
        if (str != null && str2 != null) {
            vCard.setAvatar(str, str2);
        }
    }

    private static void parseTel(XmlPullParser xmlPullParser, VCard vCard) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        boolean z = true;
        String str = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("HOME".equals(name)) {
                    z = false;
                } else if (str == null || !"NUMBER".equals(name)) {
                    for (String equals : TEL) {
                        if (equals.equals(name)) {
                            str = name;
                        }
                    }
                } else if (z) {
                    vCard.setPhoneWork(str, xmlPullParser.nextText());
                } else {
                    vCard.setPhoneHome(str, xmlPullParser.nextText());
                }
            } else if (next == 3 && xmlPullParser.getDepth() == depth) {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r1.equals("EMAIL") != false) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jivesoftware.smackx.vcardtemp.packet.VCard parse(org.xmlpull.v1.XmlPullParser r8, int r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, org.jivesoftware.smack.SmackException {
        /*
            r7 = this;
            org.jivesoftware.smackx.vcardtemp.packet.VCard r0 = new org.jivesoftware.smackx.vcardtemp.packet.VCard
            r0.<init>()
            r1 = 0
        L_0x0006:
            int r2 = r8.next()
            r3 = 4
            r4 = 3
            r5 = 2
            if (r2 == r5) goto L_0x002b
            if (r2 == r4) goto L_0x0024
            if (r2 == r3) goto L_0x0014
            goto L_0x0006
        L_0x0014:
            int r2 = r9 + 1
            int r3 = r8.getDepth()
            if (r2 != r3) goto L_0x0006
            java.lang.String r2 = r8.getText()
            r0.setField(r1, r2)
            goto L_0x0006
        L_0x0024:
            int r2 = r8.getDepth()
            if (r2 != r9) goto L_0x0006
            return r0
        L_0x002b:
            java.lang.String r1 = r8.getName()
            r2 = -1
            int r6 = r1.hashCode()
            switch(r6) {
                case -370243905: goto L_0x007d;
                case 78: goto L_0x0073;
                case 64655: goto L_0x0069;
                case 78532: goto L_0x005f;
                case 82939: goto L_0x0055;
                case 66081660: goto L_0x004c;
                case 76105234: goto L_0x0042;
                case 853317742: goto L_0x0038;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x0087
        L_0x0038:
            java.lang.String r3 = "NICKNAME"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0087
            r3 = 5
            goto L_0x0088
        L_0x0042:
            java.lang.String r3 = "PHOTO"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0087
            r3 = 7
            goto L_0x0088
        L_0x004c:
            java.lang.String r4 = "EMAIL"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0087
            goto L_0x0088
        L_0x0055:
            java.lang.String r3 = "TEL"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0087
            r3 = 2
            goto L_0x0088
        L_0x005f:
            java.lang.String r3 = "ORG"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0087
            r3 = 1
            goto L_0x0088
        L_0x0069:
            java.lang.String r3 = "ADR"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0087
            r3 = 3
            goto L_0x0088
        L_0x0073:
            java.lang.String r3 = "N"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0087
            r3 = 0
            goto L_0x0088
        L_0x007d:
            java.lang.String r3 = "JABBERID"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0087
            r3 = 6
            goto L_0x0088
        L_0x0087:
            r3 = -1
        L_0x0088:
            switch(r3) {
                case 0: goto L_0x00b8;
                case 1: goto L_0x00b3;
                case 2: goto L_0x00ae;
                case 3: goto L_0x00a9;
                case 4: goto L_0x00a4;
                case 5: goto L_0x009b;
                case 6: goto L_0x0092;
                case 7: goto L_0x008d;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x0006
        L_0x008d:
            parsePhoto(r8, r0)
            goto L_0x0006
        L_0x0092:
            java.lang.String r2 = r8.nextText()
            r0.setJabberId(r2)
            goto L_0x0006
        L_0x009b:
            java.lang.String r2 = r8.nextText()
            r0.setNickName(r2)
            goto L_0x0006
        L_0x00a4:
            parseEmail(r8, r0)
            goto L_0x0006
        L_0x00a9:
            parseAddress(r8, r0)
            goto L_0x0006
        L_0x00ae:
            parseTel(r8, r0)
            goto L_0x0006
        L_0x00b3:
            parseOrg(r8, r0)
            goto L_0x0006
        L_0x00b8:
            parseName(r8, r0)
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.vcardtemp.provider.VCardProvider.parse(org.xmlpull.v1.XmlPullParser, int):org.jivesoftware.smackx.vcardtemp.packet.VCard");
    }
}
