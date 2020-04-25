package org.jivesoftware.smackx.workgroup.settings;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.workgroup.util.ModelUtil;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class GenericSettings extends C15617IQ {
    public static final String ELEMENT_NAME = "generic-metadata";
    public static final String NAMESPACE = "http://jivesoftware.com/protocol/workgroup";
    private Map<String, String> map = new HashMap();
    private String query;

    public static class InternalProvider extends IQProvider<GenericSettings> {
        public GenericSettings parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            GenericSettings genericSettings = new GenericSettings();
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if ("entry".equals(xmlPullParser.getName())) {
                        xmlPullParser.next();
                        String nextText = xmlPullParser.nextText();
                        xmlPullParser.next();
                        genericSettings.getMap().put(nextText, xmlPullParser.nextText());
                    }
                }
                if (next == 3) {
                    if (GenericSettings.ELEMENT_NAME.equals(xmlPullParser.getName())) {
                        z = true;
                    }
                }
            }
            return genericSettings;
        }
    }

    public GenericSettings() {
        super(ELEMENT_NAME, "http://jivesoftware.com/protocol/workgroup");
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.append((CharSequence) ">");
        if (ModelUtil.hasLength(getQuery())) {
            StringBuilder sb = new StringBuilder();
            sb.append("<query>");
            sb.append(getQuery());
            sb.append("</query>");
            iQChildElementXmlStringBuilder.append((CharSequence) sb.toString());
        }
        return iQChildElementXmlStringBuilder;
    }

    public Map<String, String> getMap() {
        return this.map;
    }

    public String getQuery() {
        return this.query;
    }

    public void setMap(Map<String, String> map2) {
        this.map = map2;
    }

    public void setQuery(String str) {
        this.query = str;
    }
}
