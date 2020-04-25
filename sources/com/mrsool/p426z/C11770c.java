package com.mrsool.p426z;

import com.mrsool.utils.C5880q;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.receipts.ReceiptReceivedListener;

/* renamed from: com.mrsool.z.c */
/* compiled from: ReceiptReceiver */
public class C11770c implements ReceiptReceivedListener {

    /* renamed from: a */
    private static final String f34030a = "c";

    /* renamed from: b */
    private static C11770c f34031b = new C11770c();

    /* renamed from: a */
    public static C11770c m52917a() {
        return f34031b;
    }

    public void onReceiptReceived(String str, String str2, String str3, Stanza stanza) {
        StringBuilder sb = new StringBuilder();
        sb.append("fromJid:");
        sb.append(str);
        sb.append("and ID:");
        sb.append(str3);
        C5880q.m25751b(sb.toString());
        m52918a(str, str3);
    }

    /* renamed from: a */
    private synchronized void m52918a(String str, String str2) {
    }
}
