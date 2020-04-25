package org.jivesoftware.smackx.workgroup.settings;

import java.io.IOException;
import org.jivesoftware.smack.packet.SimpleIQ;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.workgroup.util.ModelUtil;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class SearchSettings extends SimpleIQ {
    public static final String ELEMENT_NAME = "search-settings";
    public static final String NAMESPACE = "http://jivesoftware.com/protocol/workgroup";
    private String forumsLocation;
    private String kbLocation;

    public static class InternalProvider extends IQProvider<SearchSettings> {
        public SearchSettings parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            SearchSettings searchSettings = new SearchSettings();
            String str = null;
            boolean z = false;
            String str2 = null;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if ("forums".equals(xmlPullParser.getName())) {
                        str = xmlPullParser.nextText();
                    }
                }
                if (next == 2) {
                    if ("kb".equals(xmlPullParser.getName())) {
                        str2 = xmlPullParser.nextText();
                    }
                }
                if (next == 3) {
                    if (SearchSettings.ELEMENT_NAME.equals(xmlPullParser.getName())) {
                        z = true;
                    }
                }
            }
            searchSettings.setForumsLocation(str);
            searchSettings.setKbLocation(str2);
            return searchSettings;
        }
    }

    public SearchSettings() {
        super(ELEMENT_NAME, "http://jivesoftware.com/protocol/workgroup");
    }

    public String getForumsLocation() {
        return this.forumsLocation;
    }

    public String getKbLocation() {
        return this.kbLocation;
    }

    public boolean hasForums() {
        return ModelUtil.hasLength(getForumsLocation());
    }

    public boolean hasKB() {
        return ModelUtil.hasLength(getKbLocation());
    }

    public boolean isSearchEnabled() {
        return ModelUtil.hasLength(getForumsLocation()) && ModelUtil.hasLength(getKbLocation());
    }

    public void setForumsLocation(String str) {
        this.forumsLocation = str;
    }

    public void setKbLocation(String str) {
        this.kbLocation = str;
    }
}
