package org.jivesoftware.smackx.xevent;

import org.jivesoftware.smack.SmackException.NotConnectedException;

public interface MessageEventRequestListener {
    void composingNotificationRequested(String str, String str2, MessageEventManager messageEventManager);

    void deliveredNotificationRequested(String str, String str2, MessageEventManager messageEventManager) throws NotConnectedException;

    void displayedNotificationRequested(String str, String str2, MessageEventManager messageEventManager);

    void offlineNotificationRequested(String str, String str2, MessageEventManager messageEventManager);
}
