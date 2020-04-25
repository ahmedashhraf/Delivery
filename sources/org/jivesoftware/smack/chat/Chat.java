package org.jivesoftware.smack.chat;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jivesoftware.smack.PacketCollector;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Message.Type;
import org.jivesoftware.smack.util.StringUtils;

public class Chat {
    private ChatManager chatManager;
    private final Set<ChatMessageListener> listeners = new CopyOnWriteArraySet();
    private String participant;
    private String threadID;

    Chat(ChatManager chatManager2, String str, String str2) {
        if (!StringUtils.isEmpty(str2)) {
            this.chatManager = chatManager2;
            this.participant = str;
            this.threadID = str2;
            return;
        }
        throw new IllegalArgumentException("Thread ID must not be null");
    }

    public void addMessageListener(ChatMessageListener chatMessageListener) {
        if (chatMessageListener != null) {
            this.listeners.add(chatMessageListener);
        }
    }

    public void close() {
        this.chatManager.closeChat(this);
        this.listeners.clear();
    }

    public PacketCollector createCollector() {
        return this.chatManager.createPacketCollector(this);
    }

    /* access modifiers changed from: 0000 */
    public void deliver(Message message) {
        message.setThread(this.threadID);
        for (ChatMessageListener processMessage : this.listeners) {
            processMessage.processMessage(this, message);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Chat) {
            Chat chat = (Chat) obj;
            if (this.threadID.equals(chat.getThreadID()) && this.participant.equals(chat.getParticipant())) {
                return true;
            }
        }
        return false;
    }

    public Set<ChatMessageListener> getListeners() {
        return Collections.unmodifiableSet(this.listeners);
    }

    public String getParticipant() {
        return this.participant;
    }

    public String getThreadID() {
        return this.threadID;
    }

    public int hashCode() {
        return ((this.threadID.hashCode() + 31) * 31) + this.participant.hashCode();
    }

    public void removeMessageListener(ChatMessageListener chatMessageListener) {
        this.listeners.remove(chatMessageListener);
    }

    public void sendMessage(String str) throws NotConnectedException {
        Message message = new Message();
        message.setBody(str);
        sendMessage(message);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Chat [(participant=");
        sb.append(this.participant);
        sb.append("), (thread=");
        sb.append(this.threadID);
        sb.append(")]");
        return sb.toString();
    }

    public void sendMessage(Message message) throws NotConnectedException {
        message.setTo(this.participant);
        message.setType(Type.chat);
        message.setThread(this.threadID);
        this.chatManager.sendMessage(this, message);
    }
}
