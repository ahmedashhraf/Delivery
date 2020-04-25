package org.jivesoftware.smackx.xevent;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.MessageTypeFilter;
import org.jivesoftware.smack.filter.NotFilter;
import org.jivesoftware.smack.filter.StanzaExtensionFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.xevent.packet.MessageEvent;

public class MessageEventManager extends Manager {
    private static final Map<XMPPConnection, MessageEventManager> INSTANCES = new WeakHashMap();
    private static final Logger LOGGER = Logger.getLogger(MessageEventManager.class.getName());
    private static final StanzaFilter PACKET_FILTER = new AndFilter(new StanzaExtensionFilter((ExtensionElement) new MessageEvent()), new NotFilter(MessageTypeFilter.ERROR));
    private List<MessageEventNotificationListener> messageEventNotificationListeners = new CopyOnWriteArrayList();
    private List<MessageEventRequestListener> messageEventRequestListeners = new CopyOnWriteArrayList();

    private MessageEventManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        xMPPConnection.addAsyncStanzaListener(new StanzaListener() {
            public void processPacket(Stanza stanza) {
                Message message = (Message) stanza;
                MessageEvent messageEvent = (MessageEvent) message.getExtension("x", MessageEvent.NAMESPACE);
                if (messageEvent.isMessageEventRequest()) {
                    for (String concat : messageEvent.getEventTypes()) {
                        MessageEventManager.this.fireMessageEventRequestListeners(message.getFrom(), message.getStanzaId(), concat.concat("NotificationRequested"));
                    }
                    return;
                }
                for (String concat2 : messageEvent.getEventTypes()) {
                    MessageEventManager.this.fireMessageEventNotificationListeners(message.getFrom(), messageEvent.getStanzaId(), concat2.concat("Notification"));
                }
            }
        }, PACKET_FILTER);
    }

    public static void addNotificationsRequests(Message message, boolean z, boolean z2, boolean z3, boolean z4) {
        MessageEvent messageEvent = new MessageEvent();
        messageEvent.setOffline(z);
        messageEvent.setDelivered(z2);
        messageEvent.setDisplayed(z3);
        messageEvent.setComposing(z4);
        message.addExtension(messageEvent);
    }

    /* access modifiers changed from: private */
    public void fireMessageEventNotificationListeners(String str, String str2, String str3) {
        try {
            Method declaredMethod = MessageEventNotificationListener.class.getDeclaredMethod(str3, new Class[]{String.class, String.class});
            for (MessageEventNotificationListener invoke : this.messageEventNotificationListeners) {
                declaredMethod.invoke(invoke, new Object[]{str, str2});
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error while invoking MessageEventNotificationListener", e);
        }
    }

    /* access modifiers changed from: private */
    public void fireMessageEventRequestListeners(String str, String str2, String str3) {
        try {
            Method declaredMethod = MessageEventRequestListener.class.getDeclaredMethod(str3, new Class[]{String.class, String.class, MessageEventManager.class});
            for (MessageEventRequestListener invoke : this.messageEventRequestListeners) {
                declaredMethod.invoke(invoke, new Object[]{str, str2, this});
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error while invoking MessageEventRequestListener", e);
        }
    }

    public static synchronized MessageEventManager getInstanceFor(XMPPConnection xMPPConnection) {
        MessageEventManager messageEventManager;
        synchronized (MessageEventManager.class) {
            messageEventManager = (MessageEventManager) INSTANCES.get(xMPPConnection);
            if (messageEventManager == null) {
                messageEventManager = new MessageEventManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, messageEventManager);
            }
        }
        return messageEventManager;
    }

    public void addMessageEventNotificationListener(MessageEventNotificationListener messageEventNotificationListener) {
        this.messageEventNotificationListeners.add(messageEventNotificationListener);
    }

    public void addMessageEventRequestListener(MessageEventRequestListener messageEventRequestListener) {
        this.messageEventRequestListeners.add(messageEventRequestListener);
    }

    public void removeMessageEventNotificationListener(MessageEventNotificationListener messageEventNotificationListener) {
        this.messageEventNotificationListeners.remove(messageEventNotificationListener);
    }

    public void removeMessageEventRequestListener(MessageEventRequestListener messageEventRequestListener) {
        this.messageEventRequestListeners.remove(messageEventRequestListener);
    }

    public void sendCancelledNotification(String str, String str2) throws NotConnectedException {
        Message message = new Message(str);
        MessageEvent messageEvent = new MessageEvent();
        messageEvent.setCancelled(true);
        messageEvent.setStanzaId(str2);
        message.addExtension(messageEvent);
        connection().sendStanza(message);
    }

    public void sendComposingNotification(String str, String str2) throws NotConnectedException {
        Message message = new Message(str);
        MessageEvent messageEvent = new MessageEvent();
        messageEvent.setComposing(true);
        messageEvent.setStanzaId(str2);
        message.addExtension(messageEvent);
        connection().sendStanza(message);
    }

    public void sendDeliveredNotification(String str, String str2) throws NotConnectedException {
        Message message = new Message(str);
        MessageEvent messageEvent = new MessageEvent();
        messageEvent.setDelivered(true);
        messageEvent.setStanzaId(str2);
        message.addExtension(messageEvent);
        connection().sendStanza(message);
    }

    public void sendDisplayedNotification(String str, String str2) throws NotConnectedException {
        Message message = new Message(str);
        MessageEvent messageEvent = new MessageEvent();
        messageEvent.setDisplayed(true);
        messageEvent.setStanzaId(str2);
        message.addExtension(messageEvent);
        connection().sendStanza(message);
    }
}
