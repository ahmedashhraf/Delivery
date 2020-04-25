package org.jivesoftware.smackx.rsm.provider;

import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.rsm.packet.RSMSet;

public class RSMSetProvider extends ExtensionElementProvider<RSMSet> {
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jivesoftware.smackx.rsm.packet.RSMSet parse(org.xmlpull.v1.XmlPullParser r16, int r17) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r15 = this;
            r0 = 0
            r1 = -1
            r3 = r0
            r4 = r3
            r7 = r4
            r9 = r7
            r5 = -1
            r6 = -1
            r8 = -1
            r10 = -1
        L_0x000a:
            int r0 = r16.next()
            r2 = 3
            r11 = 2
            if (r0 == r11) goto L_0x0027
            if (r0 == r2) goto L_0x0018
            r12 = r17
            goto L_0x007f
        L_0x0018:
            int r0 = r16.getDepth()
            r12 = r17
            if (r0 != r12) goto L_0x007f
            org.jivesoftware.smackx.rsm.packet.RSMSet r0 = new org.jivesoftware.smackx.rsm.packet.RSMSet
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0027:
            r12 = r17
            java.lang.String r0 = r16.getName()
            int r13 = r0.hashCode()
            java.lang.String r14 = "index"
            switch(r13) {
                case -1392885889: goto L_0x0071;
                case 107876: goto L_0x0067;
                case 3314326: goto L_0x005d;
                case 92734940: goto L_0x0053;
                case 94851343: goto L_0x0049;
                case 97440432: goto L_0x003f;
                case 100346066: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x007b
        L_0x0037:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x007b
            r0 = 4
            goto L_0x007c
        L_0x003f:
            java.lang.String r11 = "first"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x007b
            r0 = 3
            goto L_0x007c
        L_0x0049:
            java.lang.String r2 = "count"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007b
            r0 = 2
            goto L_0x007c
        L_0x0053:
            java.lang.String r2 = "after"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007b
            r0 = 0
            goto L_0x007c
        L_0x005d:
            java.lang.String r2 = "last"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007b
            r0 = 5
            goto L_0x007c
        L_0x0067:
            java.lang.String r2 = "max"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007b
            r0 = 6
            goto L_0x007c
        L_0x0071:
            java.lang.String r2 = "before"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007b
            r0 = 1
            goto L_0x007c
        L_0x007b:
            r0 = -1
        L_0x007c:
            switch(r0) {
                case 0: goto L_0x00ad;
                case 1: goto L_0x00a5;
                case 2: goto L_0x009d;
                case 3: goto L_0x0091;
                case 4: goto L_0x008c;
                case 5: goto L_0x0087;
                case 6: goto L_0x0082;
                default: goto L_0x007f;
            }
        L_0x007f:
            r0 = r16
            goto L_0x000a
        L_0x0082:
            int r8 = org.jivesoftware.smack.util.ParserUtils.getIntegerFromNextText(r16)
            goto L_0x007f
        L_0x0087:
            java.lang.String r7 = r16.nextText()
            goto L_0x007f
        L_0x008c:
            int r6 = org.jivesoftware.smack.util.ParserUtils.getIntegerFromNextText(r16)
            goto L_0x007f
        L_0x0091:
            r0 = r16
            int r10 = org.jivesoftware.smack.util.ParserUtils.getIntegerAttribute(r0, r14, r1)
            java.lang.String r9 = r16.nextText()
            goto L_0x000a
        L_0x009d:
            r0 = r16
            int r5 = org.jivesoftware.smack.util.ParserUtils.getIntegerFromNextText(r16)
            goto L_0x000a
        L_0x00a5:
            r0 = r16
            java.lang.String r4 = r16.nextText()
            goto L_0x000a
        L_0x00ad:
            r0 = r16
            java.lang.String r3 = r16.nextText()
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.rsm.provider.RSMSetProvider.parse(org.xmlpull.v1.XmlPullParser, int):org.jivesoftware.smackx.rsm.packet.RSMSet");
    }
}
