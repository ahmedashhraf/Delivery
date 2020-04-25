package org.jivesoftware.smackx.iqversion.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.iqversion.packet.Version;

public class VersionProvider extends IQProvider<Version> {
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jivesoftware.smackx.iqversion.packet.Version parse(org.xmlpull.v1.XmlPullParser r10, int r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L_0x0003:
            int r3 = r10.next()
            r4 = 2
            if (r3 == r4) goto L_0x0032
            r4 = 3
            if (r3 == r4) goto L_0x000e
            goto L_0x0003
        L_0x000e:
            int r3 = r10.getDepth()
            if (r3 != r11) goto L_0x0003
            java.lang.String r3 = r10.getName()
            java.lang.String r4 = "query"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0003
            if (r0 != 0) goto L_0x002c
            if (r1 != 0) goto L_0x002c
            if (r2 != 0) goto L_0x002c
            org.jivesoftware.smackx.iqversion.packet.Version r10 = new org.jivesoftware.smackx.iqversion.packet.Version
            r10.<init>()
            return r10
        L_0x002c:
            org.jivesoftware.smackx.iqversion.packet.Version r10 = new org.jivesoftware.smackx.iqversion.packet.Version
            r10.<init>(r0, r1, r2)
            return r10
        L_0x0032:
            java.lang.String r3 = r10.getName()
            r5 = -1
            int r6 = r3.hashCode()
            r7 = 3556(0xde4, float:4.983E-42)
            r8 = 1
            if (r6 == r7) goto L_0x005f
            r7 = 3373707(0x337a8b, float:4.72757E-39)
            if (r6 == r7) goto L_0x0055
            r7 = 351608024(0x14f51cd8, float:2.4750055E-26)
            if (r6 == r7) goto L_0x004b
            goto L_0x0069
        L_0x004b:
            java.lang.String r6 = "version"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0069
            r3 = 1
            goto L_0x006a
        L_0x0055:
            java.lang.String r6 = "name"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0069
            r3 = 0
            goto L_0x006a
        L_0x005f:
            java.lang.String r6 = "os"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0069
            r3 = 2
            goto L_0x006a
        L_0x0069:
            r3 = -1
        L_0x006a:
            if (r3 == 0) goto L_0x007b
            if (r3 == r8) goto L_0x0076
            if (r3 == r4) goto L_0x0071
            goto L_0x0003
        L_0x0071:
            java.lang.String r2 = r10.nextText()
            goto L_0x0003
        L_0x0076:
            java.lang.String r1 = r10.nextText()
            goto L_0x0003
        L_0x007b:
            java.lang.String r0 = r10.nextText()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.iqversion.provider.VersionProvider.parse(org.xmlpull.v1.XmlPullParser, int):org.jivesoftware.smackx.iqversion.packet.Version");
    }
}
