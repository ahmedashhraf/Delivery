package org.jivesoftware.smackx.delay.provider;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.delay.packet.DelayInformation;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public abstract class AbstractDelayInformationProvider extends ExtensionElementProvider<DelayInformation> {
    /* access modifiers changed from: protected */
    public abstract Date parseDate(String str) throws ParseException;

    public final DelayInformation parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
        String str = "";
        String attributeValue = xmlPullParser.getAttributeValue(str, "stamp");
        String attributeValue2 = xmlPullParser.getAttributeValue(str, PrivacyItem.SUBSCRIPTION_FROM);
        if (!xmlPullParser.isEmptyElementTag()) {
            int next = xmlPullParser.next();
            if (next != 3) {
                if (next == 4) {
                    str = xmlPullParser.getText();
                    xmlPullParser.next();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected event: ");
                    sb.append(next);
                    throw new IllegalStateException(sb.toString());
                }
            }
        } else {
            xmlPullParser.next();
            str = null;
        }
        try {
            return new DelayInformation(parseDate(attributeValue), attributeValue2, str);
        } catch (ParseException e) {
            throw new SmackException((Throwable) e);
        }
    }
}
