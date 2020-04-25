package org.jivesoftware.smackx.p558si.provider;

import com.facebook.common.util.UriUtil;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.p558si.packet.StreamInitiation;
import org.jivesoftware.smackx.p558si.packet.StreamInitiation.File;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import org.jivesoftware.smackx.xdata.provider.DataFormProvider;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement.RangeValidateElement;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p205i.p486d.p487a.C14051a;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

/* renamed from: org.jivesoftware.smackx.si.provider.StreamInitiationProvider */
public class StreamInitiationProvider extends IQProvider<StreamInitiation> {
    private static final Logger LOGGER = Logger.getLogger(StreamInitiationProvider.class.getName());

    public StreamInitiation parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
        String str;
        long j;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String str2 = "";
        String attributeValue = xmlPullParser2.getAttributeValue(str2, "id");
        String attributeValue2 = xmlPullParser2.getAttributeValue(str2, "mime-type");
        StreamInitiation streamInitiation = new StreamInitiation();
        DataFormProvider dataFormProvider = new DataFormProvider();
        DataForm dataForm = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            int next = xmlPullParser.next();
            String name = xmlPullParser.getName();
            boolean z3 = z;
            String namespace = xmlPullParser.getNamespace();
            DataForm dataForm2 = dataForm;
            String str8 = attributeValue2;
            String str9 = UriUtil.LOCAL_FILE_SCHEME;
            if (next == 2) {
                if (name.equals(str9)) {
                    str4 = xmlPullParser2.getAttributeValue(str2, "name");
                    str3 = xmlPullParser2.getAttributeValue(str2, "size");
                    str5 = xmlPullParser2.getAttributeValue(str2, C14330v.f42316c0);
                    str6 = xmlPullParser2.getAttributeValue(str2, "date");
                } else if (name.equals("desc")) {
                    str7 = xmlPullParser.nextText();
                } else if (name.equals(RangeValidateElement.METHOD)) {
                    z = z3;
                    dataForm = dataForm2;
                    attributeValue2 = str8;
                    z2 = true;
                } else if (name.equals("x") && namespace.equals("jabber:x:data")) {
                    dataForm = (DataForm) dataFormProvider.parse(xmlPullParser2);
                    z = z3;
                    attributeValue2 = str8;
                }
                z = z3;
                dataForm = dataForm2;
                attributeValue2 = str8;
            } else if (next == 3) {
                if (name.equals(StreamInitiation.ELEMENT)) {
                    dataForm = dataForm2;
                    attributeValue2 = str8;
                    z = true;
                } else if (name.equals(str9)) {
                    if (str3 == null || str3.trim().length() == 0) {
                        str = str2;
                        j = 0;
                    } else {
                        try {
                            str = str2;
                            j = Long.parseLong(str3);
                        } catch (NumberFormatException e) {
                            NumberFormatException numberFormatException = e;
                            Logger logger = LOGGER;
                            Level level = Level.SEVERE;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to parse file size from ");
                            str = str2;
                            j = 0;
                            sb.append(0);
                            logger.log(level, sb.toString(), numberFormatException);
                        }
                    }
                    Date date = new Date();
                    if (str6 != null) {
                        try {
                            date = C14051a.m60631e(str6);
                        } catch (ParseException unused) {
                        }
                    }
                    File file = new File(str4, j);
                    file.setHash(str5);
                    file.setDate(date);
                    file.setDesc(str7);
                    file.setRanged(z2);
                    streamInitiation.setFile(file);
                    xmlPullParser2 = xmlPullParser;
                    str2 = str;
                    z = z3;
                    dataForm = dataForm2;
                    attributeValue2 = str8;
                }
            }
            str = str2;
            xmlPullParser2 = xmlPullParser;
            str2 = str;
            z = z3;
            dataForm = dataForm2;
            attributeValue2 = str8;
        }
        String str10 = attributeValue2;
        DataForm dataForm3 = dataForm;
        streamInitiation.setSessionID(attributeValue);
        streamInitiation.setMimeType(str10);
        streamInitiation.setFeatureNegotiationForm(dataForm3);
        return streamInitiation;
    }
}
