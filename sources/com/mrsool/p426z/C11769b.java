package com.mrsool.p426z;

import com.mrsool.utils.C5880q;
import org.jivesoftware.smackx.xevent.MessageEventNotificationListener;

/* renamed from: com.mrsool.z.b */
/* compiled from: MessageEventNotification */
public class C11769b implements MessageEventNotificationListener {

    /* renamed from: a */
    private static final String f34028a = "b";

    /* renamed from: b */
    private static C11769b f34029b = new C11769b();

    /* renamed from: a */
    public static C11769b m52915a() {
        return f34029b;
    }

    public void cancelledNotification(String str, String str2) {
    }

    public void composingNotification(String str, String str2) {
    }

    public void deliveredNotification(String str, String str2) {
    }

    public void displayedNotification(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("displayedNotification() ***** from[");
        sb.append(str);
        sb.append("], packetID[");
        sb.append(str2);
        sb.append("]");
        C5880q.m25751b(sb.toString());
        m52916a(str, str2);
    }

    public void offlineNotification(String str, String str2) {
    }

    /* renamed from: a */
    private synchronized void m52916a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("fromJid:");
        sb.append(str);
        sb.append("::packetId");
        sb.append(str2);
        C5880q.m25751b(sb.toString());
    }
}
