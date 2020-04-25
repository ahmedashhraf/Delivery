package org.jivesoftware.smack.chat;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.PacketCollector;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.FlexibleStanzaTypeFilter;
import org.jivesoftware.smack.filter.FromMatchesFilter;
import org.jivesoftware.smack.filter.MessageTypeFilter;
import org.jivesoftware.smack.filter.OrFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.ThreadFilter;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Message.Type;
import org.jivesoftware.smack.packet.Stanza;
import p205i.p486d.p487a.C14055b;

public class ChatManager extends Manager {
    private static final Map<XMPPConnection, ChatManager> INSTANCES = new WeakHashMap();
    private static boolean defaultIsNormalInclude = true;
    private static MatchMode defaultMatchMode = MatchMode.BARE_JID;
    private Map<String, Chat> baseJidChats = new ConcurrentHashMap();
    private Set<ChatManagerListener> chatManagerListeners = new CopyOnWriteArraySet();
    private Map<MessageListener, StanzaFilter> interceptors = new WeakHashMap();
    private Map<String, Chat> jidChats = new ConcurrentHashMap();
    private MatchMode matchMode = defaultMatchMode;
    /* access modifiers changed from: private */
    public boolean normalIncluded = defaultIsNormalInclude;
    private final StanzaFilter packetFilter = new OrFilter(MessageTypeFilter.CHAT, new FlexibleStanzaTypeFilter<Message>() {
        /* access modifiers changed from: protected */
        public boolean acceptSpecific(Message message) {
            return ChatManager.this.normalIncluded && message.getType() == Type.normal;
        }
    });
    private Map<String, Chat> threadChats = new ConcurrentHashMap();

    public enum MatchMode {
        NONE,
        SUPPLIED_JID,
        BARE_JID
    }

    private ChatManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        xMPPConnection.addSyncStanzaListener(new StanzaListener() {
            public void processPacket(Stanza stanza) {
                Chat chat;
                Message message = (Message) stanza;
                if (message.getThread() == null) {
                    chat = ChatManager.this.getUserChat(message.getFrom());
                } else {
                    chat = ChatManager.this.getThreadChat(message.getThread());
                }
                if (chat == null) {
                    chat = ChatManager.this.createChat(message);
                }
                if (chat != null) {
                    ChatManager.this.deliverMessage(chat, message);
                }
            }
        }, this.packetFilter);
        INSTANCES.put(xMPPConnection, this);
    }

    /* access modifiers changed from: private */
    public void deliverMessage(Chat chat, Message message) {
        chat.deliver(message);
    }

    public static synchronized ChatManager getInstanceFor(XMPPConnection xMPPConnection) {
        ChatManager chatManager;
        synchronized (ChatManager.class) {
            chatManager = (ChatManager) INSTANCES.get(xMPPConnection);
            if (chatManager == null) {
                chatManager = new ChatManager(xMPPConnection);
            }
        }
        return chatManager;
    }

    /* access modifiers changed from: private */
    public Chat getUserChat(String str) {
        if (this.matchMode == MatchMode.NONE || str == null) {
            return null;
        }
        Chat chat = (Chat) this.jidChats.get(str);
        if (chat == null && this.matchMode == MatchMode.BARE_JID) {
            chat = (Chat) this.baseJidChats.get(C14055b.m60645e(str));
        }
        return chat;
    }

    private static String nextID() {
        return UUID.randomUUID().toString();
    }

    public static void setDefaultIsNormalIncluded(boolean z) {
        defaultIsNormalInclude = z;
    }

    public static void setDefaultMatchMode(MatchMode matchMode2) {
        defaultMatchMode = matchMode2;
    }

    public void addChatListener(ChatManagerListener chatManagerListener) {
        this.chatManagerListeners.add(chatManagerListener);
    }

    public void addOutgoingMessageInterceptor(MessageListener messageListener) {
        addOutgoingMessageInterceptor(messageListener, null);
    }

    /* access modifiers changed from: 0000 */
    public void closeChat(Chat chat) {
        this.threadChats.remove(chat.getThreadID());
        String participant = chat.getParticipant();
        this.jidChats.remove(participant);
        this.baseJidChats.remove(C14055b.m60645e(participant));
    }

    public Chat createChat(String str) {
        return createChat(str, null);
    }

    /* access modifiers changed from: 0000 */
    public PacketCollector createPacketCollector(Chat chat) {
        return connection().createPacketCollector((StanzaFilter) new AndFilter(new ThreadFilter(chat.getThreadID()), FromMatchesFilter.create(chat.getParticipant())));
    }

    public Set<ChatManagerListener> getChatListeners() {
        return Collections.unmodifiableSet(this.chatManagerListeners);
    }

    public MatchMode getMatchMode() {
        return this.matchMode;
    }

    public Chat getThreadChat(String str) {
        return (Chat) this.threadChats.get(str);
    }

    public boolean isNormalIncluded() {
        return this.normalIncluded;
    }

    public void removeChatListener(ChatManagerListener chatManagerListener) {
        this.chatManagerListeners.remove(chatManagerListener);
    }

    /* access modifiers changed from: 0000 */
    public void sendMessage(Chat chat, Message message) throws NotConnectedException {
        for (Entry entry : this.interceptors.entrySet()) {
            StanzaFilter stanzaFilter = (StanzaFilter) entry.getValue();
            if (stanzaFilter != null && stanzaFilter.accept(message)) {
                ((MessageListener) entry.getKey()).processMessage(message);
            }
        }
        if (message.getFrom() == null) {
            message.setFrom(connection().getUser());
        }
        connection().sendStanza(message);
    }

    public void setMatchMode(MatchMode matchMode2) {
        this.matchMode = matchMode2;
    }

    public void setNormalIncluded(boolean z) {
        this.normalIncluded = z;
    }

    public void addOutgoingMessageInterceptor(MessageListener messageListener, StanzaFilter stanzaFilter) {
        if (messageListener != null) {
            this.interceptors.put(messageListener, stanzaFilter);
        }
    }

    public Chat createChat(String str, ChatMessageListener chatMessageListener) {
        return createChat(str, (String) null, chatMessageListener);
    }

    public Chat createChat(String str, String str2, ChatMessageListener chatMessageListener) {
        if (str2 == null) {
            str2 = nextID();
        }
        if (((Chat) this.threadChats.get(str2)) == null) {
            Chat createChat = createChat(str, str2, true);
            createChat.addMessageListener(chatMessageListener);
            return createChat;
        }
        throw new IllegalArgumentException("ThreadID is already used");
    }

    private Chat createChat(String str, String str2, boolean z) {
        Chat chat = new Chat(this, str, str2);
        this.threadChats.put(str2, chat);
        this.jidChats.put(str, chat);
        this.baseJidChats.put(C14055b.m60645e(str), chat);
        for (ChatManagerListener chatCreated : this.chatManagerListeners) {
            chatCreated.chatCreated(chat, z);
        }
        return chat;
    }

    /* access modifiers changed from: private */
    public Chat createChat(Message message) {
        String from = message.getFrom();
        if (from == null) {
            return null;
        }
        String thread = message.getThread();
        if (thread == null) {
            thread = nextID();
        }
        return createChat(from, thread, false);
    }
}
