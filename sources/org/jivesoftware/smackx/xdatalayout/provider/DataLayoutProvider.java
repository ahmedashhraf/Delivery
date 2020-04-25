package org.jivesoftware.smackx.xdatalayout.provider;

import com.google.android.gms.plus.C5493f;
import java.io.IOException;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smackx.xdatalayout.packet.DataLayout;
import org.jivesoftware.smackx.xdatalayout.packet.DataLayout.Fieldref;
import org.jivesoftware.smackx.xdatalayout.packet.DataLayout.Section;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class DataLayoutProvider {
    public static DataLayout parse(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, SmackException {
        DataLayout dataLayout = new DataLayout(xmlPullParser.getAttributeValue("", C5493f.f15781i));
        parseLayout(dataLayout.getPageLayout(), xmlPullParser);
        return dataLayout;
    }

    private static Fieldref parseFieldref(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        Fieldref fieldref = new Fieldref(xmlPullParser.getAttributeValue("", "var"));
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getDepth() == depth) {
                return fieldref;
            }
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void parseLayout(java.util.List<org.jivesoftware.smackx.xdatalayout.packet.DataLayout.DataFormLayoutElement> r7, org.xmlpull.v1.XmlPullParser r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
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
            r6 = 1
            switch(r5) {
                case -928989863: goto L_0x0042;
                case -241484064: goto L_0x0038;
                case 3556653: goto L_0x002e;
                case 1970241253: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x004c
        L_0x0024:
            java.lang.String r5 = "section"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x002e:
            java.lang.String r5 = "text"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x004c
            r1 = 0
            goto L_0x004d
        L_0x0038:
            java.lang.String r5 = "reportedref"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x004c
            r1 = 3
            goto L_0x004d
        L_0x0042:
            java.lang.String r5 = "fieldref"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x004c
            r1 = 2
            goto L_0x004d
        L_0x004c:
            r1 = -1
        L_0x004d:
            if (r1 == 0) goto L_0x006f
            if (r1 == r6) goto L_0x0067
            if (r1 == r3) goto L_0x005f
            if (r1 == r2) goto L_0x0056
            goto L_0x0004
        L_0x0056:
            org.jivesoftware.smackx.xdatalayout.packet.DataLayout$Reportedref r1 = new org.jivesoftware.smackx.xdatalayout.packet.DataLayout$Reportedref
            r1.<init>()
            r7.add(r1)
            goto L_0x0004
        L_0x005f:
            org.jivesoftware.smackx.xdatalayout.packet.DataLayout$Fieldref r1 = parseFieldref(r8)
            r7.add(r1)
            goto L_0x0004
        L_0x0067:
            org.jivesoftware.smackx.xdatalayout.packet.DataLayout$Section r1 = parseSection(r8)
            r7.add(r1)
            goto L_0x0004
        L_0x006f:
            org.jivesoftware.smackx.xdatalayout.packet.DataLayout$Text r1 = new org.jivesoftware.smackx.xdatalayout.packet.DataLayout$Text
            java.lang.String r2 = r8.nextText()
            r1.<init>(r2)
            r7.add(r1)
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.xdatalayout.provider.DataLayoutProvider.parseLayout(java.util.List, org.xmlpull.v1.XmlPullParser):void");
    }

    private static Section parseSection(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Section section = new Section(xmlPullParser.getAttributeValue("", C5493f.f15781i));
        parseLayout(section.getSectionLayout(), xmlPullParser);
        return section;
    }
}
