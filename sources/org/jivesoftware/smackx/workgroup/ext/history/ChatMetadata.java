package org.jivesoftware.smackx.workgroup.ext.history;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.workgroup.MetaData;
import org.jivesoftware.smackx.workgroup.util.MetaDataUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ChatMetadata extends C15617IQ {
    public static final String ELEMENT_NAME = "chat-metadata";
    public static final String NAMESPACE = "http://jivesoftware.com/protocol/workgroup";
    private Map<String, List<String>> map = new HashMap();
    private String sessionID;

    public static class Provider extends IQProvider<ChatMetadata> {
        public ChatMetadata parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            ChatMetadata chatMetadata = new ChatMetadata();
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (xmlPullParser.getName().equals("sessionID")) {
                        chatMetadata.setSessionID(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals(MetaData.ELEMENT_NAME)) {
                        chatMetadata.setMetadata(MetaDataUtils.parseMetaData(xmlPullParser));
                    }
                } else if (next == 3 && xmlPullParser.getName().equals(ChatMetadata.ELEMENT_NAME)) {
                    z = true;
                }
            }
            return chatMetadata;
        }
    }

    public ChatMetadata() {
        super(ELEMENT_NAME, "http://jivesoftware.com/protocol/workgroup");
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.append((CharSequence) "<sessionID>").append((CharSequence) getSessionID()).append((CharSequence) "</sessionID>");
        return iQChildElementXmlStringBuilder;
    }

    public Map<String, List<String>> getMetadata() {
        return this.map;
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public void setMetadata(Map<String, List<String>> map2) {
        this.map = map2;
    }

    public void setSessionID(String str) {
        this.sessionID = str;
    }
}
