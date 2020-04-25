package org.jivesoftware.smackx.chatstates.packet;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.chatstates.ChatState;
import org.xmlpull.v1.XmlPullParser;

public class ChatStateExtension implements ExtensionElement {
    public static final String NAMESPACE = "http://jabber.org/protocol/chatstates";
    private final ChatState state;

    public static class Provider extends ExtensionElementProvider<ChatStateExtension> {
        public ChatStateExtension parse(XmlPullParser xmlPullParser, int i) {
            ChatState chatState;
            try {
                chatState = ChatState.valueOf(xmlPullParser.getName());
            } catch (Exception unused) {
                chatState = ChatState.active;
            }
            return new ChatStateExtension(chatState);
        }
    }

    public ChatStateExtension(ChatState chatState) {
        this.state = chatState;
    }

    public ChatState getChatState() {
        return this.state;
    }

    public String getElementName() {
        return this.state.name();
    }

    public String getNamespace() {
        return "http://jabber.org/protocol/chatstates";
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.closeEmptyElement();
        return xmlStringBuilder;
    }
}
