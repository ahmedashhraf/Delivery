package org.jivesoftware.smackx.workgroup.settings;

import java.io.IOException;
import org.jivesoftware.smack.packet.SimpleIQ;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.workgroup.util.ModelUtil;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class OfflineSettings extends SimpleIQ {
    public static final String ELEMENT_NAME = "offline-settings";
    public static final String NAMESPACE = "http://jivesoftware.com/protocol/workgroup";
    private String emailAddress;
    private String offlineText;
    private String redirectURL;
    private String subject;

    public static class InternalProvider extends IQProvider<OfflineSettings> {
        public OfflineSettings parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            OfflineSettings offlineSettings = new OfflineSettings();
            String str = null;
            boolean z = false;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if ("redirectPage".equals(xmlPullParser.getName())) {
                        str2 = xmlPullParser.nextText();
                    }
                }
                if (next == 2) {
                    if ("subject".equals(xmlPullParser.getName())) {
                        str3 = xmlPullParser.nextText();
                    }
                }
                if (next == 2) {
                    if ("offlineText".equals(xmlPullParser.getName())) {
                        str4 = xmlPullParser.nextText();
                    }
                }
                if (next == 2) {
                    if ("emailAddress".equals(xmlPullParser.getName())) {
                        str = xmlPullParser.nextText();
                    }
                }
                if (next == 3) {
                    if (OfflineSettings.ELEMENT_NAME.equals(xmlPullParser.getName())) {
                        z = true;
                    }
                }
            }
            offlineSettings.setEmailAddress(str);
            offlineSettings.setRedirectURL(str2);
            offlineSettings.setSubject(str3);
            offlineSettings.setOfflineText(str4);
            return offlineSettings;
        }
    }

    public OfflineSettings() {
        super(ELEMENT_NAME, "http://jivesoftware.com/protocol/workgroup");
    }

    public String getEmailAddress() {
        if (!ModelUtil.hasLength(this.emailAddress)) {
            return "";
        }
        return this.emailAddress;
    }

    public String getOfflineText() {
        if (!ModelUtil.hasLength(this.offlineText)) {
            return "";
        }
        return this.offlineText;
    }

    public String getRedirectURL() {
        if (!ModelUtil.hasLength(this.redirectURL)) {
            return "";
        }
        return this.redirectURL;
    }

    public String getSubject() {
        if (!ModelUtil.hasLength(this.subject)) {
            return "";
        }
        return this.subject;
    }

    public boolean isConfigured() {
        return ModelUtil.hasLength(getEmailAddress()) && ModelUtil.hasLength(getSubject()) && ModelUtil.hasLength(getOfflineText());
    }

    public boolean redirects() {
        return ModelUtil.hasLength(getRedirectURL());
    }

    public void setEmailAddress(String str) {
        this.emailAddress = str;
    }

    public void setOfflineText(String str) {
        this.offlineText = str;
    }

    public void setRedirectURL(String str) {
        this.redirectURL = str;
    }

    public void setSubject(String str) {
        this.subject = str;
    }
}
