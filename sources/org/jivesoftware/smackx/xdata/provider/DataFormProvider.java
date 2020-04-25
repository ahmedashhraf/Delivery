package org.jivesoftware.smackx.xdata.provider;

import com.google.android.gms.plus.C5493f;
import java.io.IOException;
import java.util.ArrayList;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.FormField.Option;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import org.jivesoftware.smackx.xdata.packet.DataForm.Item;
import org.jivesoftware.smackx.xdata.packet.DataForm.ReportedData;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class DataFormProvider extends ExtensionElementProvider<DataForm> {
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.jivesoftware.smackx.xdata.FormField parseField(org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r10 = this;
            int r0 = r11.getDepth()
            java.lang.String r1 = ""
            java.lang.String r2 = "var"
            java.lang.String r2 = r11.getAttributeValue(r1, r2)
            java.lang.String r3 = "type"
            java.lang.String r3 = r11.getAttributeValue(r1, r3)
            org.jivesoftware.smackx.xdata.FormField$Type r3 = org.jivesoftware.smackx.xdata.FormField.Type.fromString(r3)
            org.jivesoftware.smackx.xdata.FormField$Type r4 = org.jivesoftware.smackx.xdata.FormField.Type.fixed
            if (r3 != r4) goto L_0x0020
            org.jivesoftware.smackx.xdata.FormField r2 = new org.jivesoftware.smackx.xdata.FormField
            r2.<init>()
            goto L_0x0029
        L_0x0020:
            org.jivesoftware.smackx.xdata.FormField r4 = new org.jivesoftware.smackx.xdata.FormField
            r4.<init>(r2)
            r4.setType(r3)
            r2 = r4
        L_0x0029:
            java.lang.String r3 = "label"
            java.lang.String r1 = r11.getAttributeValue(r1, r3)
            r2.setLabel(r1)
        L_0x0032:
            int r1 = r11.next()
            r3 = 3
            r4 = 2
            if (r1 == r4) goto L_0x0044
            if (r1 == r3) goto L_0x003d
            goto L_0x0032
        L_0x003d:
            int r1 = r11.getDepth()
            if (r1 != r0) goto L_0x0032
            return r2
        L_0x0044:
            java.lang.String r1 = r11.getName()
            java.lang.String r5 = r11.getNamespace()
            r6 = -1
            int r7 = r1.hashCode()
            r8 = 4
            r9 = 1
            switch(r7) {
                case -1421272810: goto L_0x007f;
                case -1010136971: goto L_0x0075;
                case -393139297: goto L_0x006b;
                case 3079825: goto L_0x0061;
                case 111972721: goto L_0x0057;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x0089
        L_0x0057:
            java.lang.String r7 = "value"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0089
            r1 = 1
            goto L_0x008a
        L_0x0061:
            java.lang.String r7 = "desc"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0089
            r1 = 0
            goto L_0x008a
        L_0x006b:
            java.lang.String r7 = "required"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0089
            r1 = 2
            goto L_0x008a
        L_0x0075:
            java.lang.String r7 = "option"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0089
            r1 = 3
            goto L_0x008a
        L_0x007f:
            java.lang.String r7 = "validate"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0089
            r1 = 4
            goto L_0x008a
        L_0x0089:
            r1 = -1
        L_0x008a:
            if (r1 == 0) goto L_0x00ba
            if (r1 == r9) goto L_0x00b1
            if (r1 == r4) goto L_0x00ad
            if (r1 == r3) goto L_0x00a5
            if (r1 == r8) goto L_0x0095
            goto L_0x0032
        L_0x0095:
            java.lang.String r1 = "http://jabber.org/protocol/xdata-validate"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0032
            org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement r1 = org.jivesoftware.smackx.xdatavalidation.provider.DataValidationProvider.parse(r11)
            r2.setValidateElement(r1)
            goto L_0x0032
        L_0x00a5:
            org.jivesoftware.smackx.xdata.FormField$Option r1 = r10.parseOption(r11)
            r2.addOption(r1)
            goto L_0x0032
        L_0x00ad:
            r2.setRequired(r9)
            goto L_0x0032
        L_0x00b1:
            java.lang.String r1 = r11.nextText()
            r2.addValue(r1)
            goto L_0x0032
        L_0x00ba:
            java.lang.String r1 = r11.nextText()
            r2.setDescription(r1)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.xdata.provider.DataFormProvider.parseField(org.xmlpull.v1.XmlPullParser):org.jivesoftware.smackx.xdata.FormField");
    }

    private Item parseItem(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        ArrayList arrayList = new ArrayList();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                char c = 65535;
                if (name.hashCode() == 97427706 && name.equals(FormField.ELEMENT)) {
                    c = 0;
                }
                if (c == 0) {
                    arrayList.add(parseField(xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getDepth() == depth) {
                return new Item(arrayList);
            }
        }
    }

    private Option parseOption(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        String attributeValue = xmlPullParser.getAttributeValue("", C5493f.f15781i);
        Option option = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                char c = 65535;
                if (name.hashCode() == 111972721 && name.equals("value")) {
                    c = 0;
                }
                if (c == 0) {
                    option = new Option(attributeValue, xmlPullParser.nextText());
                }
            } else if (next == 3 && xmlPullParser.getDepth() == depth) {
                return option;
            }
        }
    }

    private ReportedData parseReported(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        ArrayList arrayList = new ArrayList();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                char c = 65535;
                if (name.hashCode() == 97427706 && name.equals(FormField.ELEMENT)) {
                    c = 0;
                }
                if (c == 0) {
                    arrayList.add(parseField(xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getDepth() == depth) {
                return new ReportedData(arrayList);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r0.equals("item") != false) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jivesoftware.smackx.xdata.packet.DataForm parse(org.xmlpull.v1.XmlPullParser r8, int r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, org.jivesoftware.smack.SmackException {
        /*
            r7 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "type"
            java.lang.String r0 = r8.getAttributeValue(r0, r1)
            org.jivesoftware.smackx.xdata.packet.DataForm$Type r0 = org.jivesoftware.smackx.xdata.packet.DataForm.Type.fromString(r0)
            org.jivesoftware.smackx.xdata.packet.DataForm r1 = new org.jivesoftware.smackx.xdata.packet.DataForm
            r1.<init>(r0)
        L_0x0011:
            int r0 = r8.next()
            r2 = 3
            r3 = 2
            if (r0 == r3) goto L_0x0023
            if (r0 == r2) goto L_0x001c
            goto L_0x0011
        L_0x001c:
            int r0 = r8.getDepth()
            if (r0 != r9) goto L_0x0011
            return r1
        L_0x0023:
            java.lang.String r0 = r8.getName()
            java.lang.String r4 = r8.getNamespace()
            r5 = -1
            int r6 = r0.hashCode()
            switch(r6) {
                case -427039533: goto L_0x006f;
                case 3242771: goto L_0x0066;
                case 3433103: goto L_0x005c;
                case 97427706: goto L_0x0052;
                case 107944136: goto L_0x0048;
                case 110371416: goto L_0x003e;
                case 757376421: goto L_0x0034;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x0079
        L_0x0034:
            java.lang.String r2 = "instructions"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0079
            r2 = 0
            goto L_0x007a
        L_0x003e:
            java.lang.String r2 = "title"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0079
            r2 = 1
            goto L_0x007a
        L_0x0048:
            java.lang.String r2 = "query"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0079
            r2 = 5
            goto L_0x007a
        L_0x0052:
            java.lang.String r2 = "field"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0079
            r2 = 2
            goto L_0x007a
        L_0x005c:
            java.lang.String r2 = "page"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0079
            r2 = 6
            goto L_0x007a
        L_0x0066:
            java.lang.String r3 = "item"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0079
            goto L_0x007a
        L_0x006f:
            java.lang.String r2 = "reported"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0079
            r2 = 4
            goto L_0x007a
        L_0x0079:
            r2 = -1
        L_0x007a:
            switch(r2) {
                case 0: goto L_0x00c5;
                case 1: goto L_0x00bc;
                case 2: goto L_0x00b3;
                case 3: goto L_0x00aa;
                case 4: goto L_0x00a1;
                case 5: goto L_0x008e;
                case 6: goto L_0x007e;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x0011
        L_0x007e:
            java.lang.String r0 = "http://jabber.org/protocol/xdata-layout"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0011
            org.jivesoftware.smackx.xdatalayout.packet.DataLayout r0 = org.jivesoftware.smackx.xdatalayout.provider.DataLayoutProvider.parse(r8)
            r1.addExtensionElement(r0)
            goto L_0x0011
        L_0x008e:
            java.lang.String r0 = "jabber:iq:roster"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0011
            org.jivesoftware.smack.roster.provider.RosterPacketProvider r0 = org.jivesoftware.smack.roster.provider.RosterPacketProvider.INSTANCE
            org.jivesoftware.smack.packet.Element r0 = r0.parse(r8)
            r1.addExtensionElement(r0)
            goto L_0x0011
        L_0x00a1:
            org.jivesoftware.smackx.xdata.packet.DataForm$ReportedData r0 = r7.parseReported(r8)
            r1.setReportedData(r0)
            goto L_0x0011
        L_0x00aa:
            org.jivesoftware.smackx.xdata.packet.DataForm$Item r0 = r7.parseItem(r8)
            r1.addItem(r0)
            goto L_0x0011
        L_0x00b3:
            org.jivesoftware.smackx.xdata.FormField r0 = r7.parseField(r8)
            r1.addField(r0)
            goto L_0x0011
        L_0x00bc:
            java.lang.String r0 = r8.nextText()
            r1.setTitle(r0)
            goto L_0x0011
        L_0x00c5:
            java.lang.String r0 = r8.nextText()
            r1.addInstruction(r0)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.xdata.provider.DataFormProvider.parse(org.xmlpull.v1.XmlPullParser, int):org.jivesoftware.smackx.xdata.packet.DataForm");
    }
}
