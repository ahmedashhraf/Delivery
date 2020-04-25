package org.jivesoftware.smackx.iqlast.packet;

import java.io.IOException;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.provider.IQProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class LastActivity extends C15617IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "jabber:iq:last";
    public long lastActivity;
    public String message;

    public static class Provider extends IQProvider<LastActivity> {
        public LastActivity parse(XmlPullParser xmlPullParser, int i) throws SmackException, XmlPullParserException {
            LastActivity lastActivity = new LastActivity();
            String attributeValue = xmlPullParser.getAttributeValue("", "seconds");
            if (attributeValue != null) {
                try {
                    lastActivity.setLastActivity(Long.parseLong(attributeValue));
                } catch (NumberFormatException e) {
                    throw new SmackException("Could not parse last activity number", e);
                }
            }
            try {
                lastActivity.setMessage(xmlPullParser.nextText());
                return lastActivity;
            } catch (IOException e2) {
                throw new SmackException((Throwable) e2);
            }
        }
    }

    public LastActivity() {
        super("query", NAMESPACE);
        this.lastActivity = -1;
        setType(Type.get);
    }

    /* access modifiers changed from: private */
    public void setMessage(String str) {
        this.message = str;
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.optLongAttribute("seconds", Long.valueOf(this.lastActivity));
        iQChildElementXmlStringBuilder.setEmptyElement();
        return iQChildElementXmlStringBuilder;
    }

    public long getIdleTime() {
        return this.lastActivity;
    }

    public String getStatusMessage() {
        return this.message;
    }

    public void setLastActivity(long j) {
        this.lastActivity = j;
    }

    public LastActivity(String str) {
        this();
        setTo(str);
    }
}
