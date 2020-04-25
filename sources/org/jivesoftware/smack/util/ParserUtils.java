package org.jivesoftware.smack.util;

import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ParserUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static void assertAtEndTag(XmlPullParser xmlPullParser) throws XmlPullParserException {
    }

    public static void assertAtStartTag(XmlPullParser xmlPullParser) throws XmlPullParserException {
    }

    public static void forwardToEndTagOfDepth(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || xmlPullParser.getDepth() != i) {
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    public static Boolean getBooleanAttribute(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("", str);
        if (attributeValue == null) {
            return null;
        }
        String lowerCase = attributeValue.toLowerCase(Locale.US);
        if (lowerCase.equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE) || lowerCase.equals(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
            return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
    }

    public static Integer getIntegerAttribute(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("", str);
        if (attributeValue == null) {
            return null;
        }
        return Integer.valueOf(attributeValue);
    }

    public static int getIntegerFromNextText(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return Integer.valueOf(xmlPullParser.nextText()).intValue();
    }

    public static Long getLongAttribute(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("", str);
        if (attributeValue == null) {
            return null;
        }
        return Long.valueOf(attributeValue);
    }

    public static int getIntegerAttribute(XmlPullParser xmlPullParser, String str, int i) {
        Integer integerAttribute = getIntegerAttribute(xmlPullParser, str);
        if (integerAttribute == null) {
            return i;
        }
        return integerAttribute.intValue();
    }

    public static long getLongAttribute(XmlPullParser xmlPullParser, String str, long j) {
        Long longAttribute = getLongAttribute(xmlPullParser, str);
        if (longAttribute == null) {
            return j;
        }
        return longAttribute.longValue();
    }

    public static boolean getBooleanAttribute(XmlPullParser xmlPullParser, String str, boolean z) {
        Boolean booleanAttribute = getBooleanAttribute(xmlPullParser, str);
        if (booleanAttribute == null) {
            return z;
        }
        return booleanAttribute.booleanValue();
    }
}
