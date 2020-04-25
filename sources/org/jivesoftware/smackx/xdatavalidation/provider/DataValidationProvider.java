package org.jivesoftware.smackx.xdatavalidation.provider;

import java.util.logging.Logger;

public class DataValidationProvider {
    private static final Logger LOGGER = Logger.getLogger(DataValidationProvider.class.getName());

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement parse(org.xmlpull.v1.XmlPullParser r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r12.getDepth()
            java.lang.String r1 = ""
            java.lang.String r2 = "datatype"
            java.lang.String r2 = r12.getAttributeValue(r1, r2)
            r3 = 0
            r4 = r3
        L_0x000e:
            int r5 = r12.next()
            r6 = 3
            r7 = 2
            if (r5 == r7) goto L_0x002a
            if (r5 == r6) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            int r5 = r12.getDepth()
            if (r5 != r0) goto L_0x000e
            if (r3 != 0) goto L_0x0026
            org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement$BasicValidateElement r3 = new org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement$BasicValidateElement
            r3.<init>(r2)
        L_0x0026:
            r3.setListRange(r4)
            return r3
        L_0x002a:
            java.lang.String r5 = r12.getName()
            r8 = -1
            int r9 = r5.hashCode()
            r10 = 4
            r11 = 1
            switch(r9) {
                case -725250226: goto L_0x0061;
                case 3417674: goto L_0x0057;
                case 93508654: goto L_0x004d;
                case 108280125: goto L_0x0043;
                case 108392519: goto L_0x0039;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x006b
        L_0x0039:
            java.lang.String r9 = "regex"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x006b
            r5 = 3
            goto L_0x006c
        L_0x0043:
            java.lang.String r9 = "range"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x006b
            r5 = 2
            goto L_0x006c
        L_0x004d:
            java.lang.String r9 = "basic"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x006b
            r5 = 1
            goto L_0x006c
        L_0x0057:
            java.lang.String r9 = "open"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x006b
            r5 = 0
            goto L_0x006c
        L_0x0061:
            java.lang.String r9 = "list-range"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x006b
            r5 = 4
            goto L_0x006c
        L_0x006b:
            r5 = -1
        L_0x006c:
            if (r5 == 0) goto L_0x00b9
            if (r5 == r11) goto L_0x00b2
            java.lang.String r8 = "max"
            java.lang.String r9 = "min"
            if (r5 == r7) goto L_0x00a3
            if (r5 == r6) goto L_0x0098
            if (r5 == r10) goto L_0x007b
            goto L_0x000e
        L_0x007b:
            java.lang.Long r5 = org.jivesoftware.smack.util.ParserUtils.getLongAttribute(r12, r9)
            java.lang.Long r6 = org.jivesoftware.smack.util.ParserUtils.getLongAttribute(r12, r8)
            if (r5 != 0) goto L_0x0091
            if (r6 == 0) goto L_0x0088
            goto L_0x0091
        L_0x0088:
            java.util.logging.Logger r5 = LOGGER
            java.lang.String r6 = "Ignoring list-range element without min or max attribute"
            r5.fine(r6)
            goto L_0x000e
        L_0x0091:
            org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement$ListRange r4 = new org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement$ListRange
            r4.<init>(r5, r6)
            goto L_0x000e
        L_0x0098:
            org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement$RegexValidateElement r3 = new org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement$RegexValidateElement
            java.lang.String r5 = r12.nextText()
            r3.<init>(r2, r5)
            goto L_0x000e
        L_0x00a3:
            org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement$RangeValidateElement r3 = new org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement$RangeValidateElement
            java.lang.String r5 = r12.getAttributeValue(r1, r9)
            java.lang.String r6 = r12.getAttributeValue(r1, r8)
            r3.<init>(r2, r5, r6)
            goto L_0x000e
        L_0x00b2:
            org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement$BasicValidateElement r3 = new org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement$BasicValidateElement
            r3.<init>(r2)
            goto L_0x000e
        L_0x00b9:
            org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement$OpenValidateElement r3 = new org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement$OpenValidateElement
            r3.<init>(r2)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.xdatavalidation.provider.DataValidationProvider.parse(org.xmlpull.v1.XmlPullParser):org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement");
    }
}
