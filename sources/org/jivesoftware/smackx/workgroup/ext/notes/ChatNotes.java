package org.jivesoftware.smackx.workgroup.ext.notes;

import java.io.IOException;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.provider.IQProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ChatNotes extends C15617IQ {
    public static final String ELEMENT_NAME = "chat-notes";
    public static final String NAMESPACE = "http://jivesoftware.com/protocol/workgroup";
    private String notes;
    private String sessionID;

    public static class Provider extends IQProvider<ChatNotes> {
        public ChatNotes parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            ChatNotes chatNotes = new ChatNotes();
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (xmlPullParser.getName().equals("sessionID")) {
                        chatNotes.setSessionID(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals("text")) {
                        chatNotes.setNotes(xmlPullParser.nextText().replaceAll("\\\\n", "\n"));
                    }
                } else if (next == 3 && xmlPullParser.getName().equals(ChatNotes.ELEMENT_NAME)) {
                    z = true;
                }
            }
            return chatNotes;
        }
    }

    public ChatNotes() {
        super(ELEMENT_NAME, "http://jivesoftware.com/protocol/workgroup");
    }

    public static final String replace(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        if (str3 == null) {
            return str;
        }
        int indexOf = str.indexOf(str2, 0);
        if (indexOf >= 0) {
            char[] charArray = str.toCharArray();
            char[] charArray2 = str3.toCharArray();
            int length = str2.length();
            StringBuilder sb = new StringBuilder(charArray.length);
            sb.append(charArray, 0, indexOf);
            sb.append(charArray2);
            int i = indexOf + length;
            while (true) {
                int indexOf2 = str.indexOf(str2, i);
                if (indexOf2 <= 0) {
                    break;
                }
                sb.append(charArray, i, indexOf2 - i);
                sb.append(charArray2);
                i = indexOf2 + length;
            }
            sb.append(charArray, i, charArray.length - i);
            str = sb.toString();
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.append((CharSequence) "<sessionID>").append((CharSequence) getSessionID()).append((CharSequence) "</sessionID>");
        if (getNotes() != null) {
            iQChildElementXmlStringBuilder.element("notes", getNotes());
        }
        return iQChildElementXmlStringBuilder;
    }

    public String getNotes() {
        return this.notes;
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public void setNotes(String str) {
        this.notes = str;
    }

    public void setSessionID(String str) {
        this.sessionID = str;
    }
}
