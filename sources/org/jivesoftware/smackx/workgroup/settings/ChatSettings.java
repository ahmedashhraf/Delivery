package org.jivesoftware.smackx.workgroup.settings;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.provider.IQProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ChatSettings extends C15617IQ {
    public static final int BOT_SETTINGS = 2;
    public static final String ELEMENT_NAME = "chat-settings";
    public static final int IMAGE_SETTINGS = 0;
    public static final String NAMESPACE = "http://jivesoftware.com/protocol/workgroup";
    public static final int TEXT_SETTINGS = 1;
    private String key;
    private List<ChatSetting> settings;
    private int type;

    public static class InternalProvider extends IQProvider<ChatSettings> {
        private ChatSetting parseChatSetting(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            String str = null;
            boolean z = false;
            String str2 = null;
            int i = 0;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if ("key".equals(xmlPullParser.getName())) {
                        str = xmlPullParser.nextText();
                    }
                }
                if (next == 2) {
                    if ("value".equals(xmlPullParser.getName())) {
                        str2 = xmlPullParser.nextText();
                    }
                }
                if (next == 2) {
                    if ("type".equals(xmlPullParser.getName())) {
                        i = Integer.parseInt(xmlPullParser.nextText());
                    }
                }
                if (next == 3) {
                    if ("chat-setting".equals(xmlPullParser.getName())) {
                        z = true;
                    }
                }
            }
            return new ChatSetting(str, str2, i);
        }

        public ChatSettings parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            if (xmlPullParser.getEventType() == 2) {
                ChatSettings chatSettings = new ChatSettings();
                boolean z = false;
                while (!z) {
                    int next = xmlPullParser.next();
                    if (next == 2) {
                        if ("chat-setting".equals(xmlPullParser.getName())) {
                            chatSettings.addSetting(parseChatSetting(xmlPullParser));
                        }
                    }
                    if (next == 3) {
                        if (ChatSettings.ELEMENT_NAME.equals(xmlPullParser.getName())) {
                            z = true;
                        }
                    }
                }
                return chatSettings;
            }
            throw new IllegalStateException("Parser not in proper position, or bad XML.");
        }
    }

    public ChatSettings() {
        super(ELEMENT_NAME, "http://jivesoftware.com/protocol/workgroup");
        this.type = -1;
        this.settings = new ArrayList();
    }

    public void addSetting(ChatSetting chatSetting) {
        this.settings.add(chatSetting);
    }

    public ChatSetting getChatSetting(String str) {
        Collection<ChatSetting> settings2 = getSettings();
        if (settings2 != null) {
            for (ChatSetting chatSetting : settings2) {
                if (chatSetting.getKey().equals(str)) {
                    return chatSetting;
                }
            }
        }
        return null;
    }

    public ChatSetting getFirstEntry() {
        if (this.settings.size() > 0) {
            return (ChatSetting) this.settings.get(0);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        String str = "\"";
        if (this.key != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(" key=\"");
            sb.append(this.key);
            sb.append(str);
            iQChildElementXmlStringBuilder.append((CharSequence) sb.toString());
        }
        if (this.type != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" type=\"");
            sb2.append(this.type);
            sb2.append(str);
            iQChildElementXmlStringBuilder.append((CharSequence) sb2.toString());
        }
        iQChildElementXmlStringBuilder.setEmptyElement();
        return iQChildElementXmlStringBuilder;
    }

    public Collection<ChatSetting> getSettings() {
        return this.settings;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public ChatSettings(String str) {
        this();
        setKey(str);
    }
}
