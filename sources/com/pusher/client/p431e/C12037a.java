package com.pusher.client.p431e;

import com.google.gson.C8775f;
import com.pusher.client.C11995c;
import com.pusher.client.C12036d;
import com.pusher.client.channel.C11997b;
import com.pusher.client.connection.C12018b;
import com.pusher.client.connection.C12019c;
import com.pusher.client.connection.ConnectionState;
import java.util.Map;

/* renamed from: com.pusher.client.e.a */
/* compiled from: ExampleApp */
public class C12037a implements C12018b, C11997b {

    /* renamed from: a */
    private final C11995c f34693a;

    /* renamed from: b */
    private final String f34694b;

    /* renamed from: c */
    private final String f34695c;

    /* renamed from: d */
    private final long f34696d = System.currentTimeMillis();

    public C12037a(String[] strArr) {
        String str = strArr.length > 0 ? strArr[0] : "161717a55e65825bacf1";
        this.f34694b = strArr.length > 1 ? strArr[1] : "my-channel";
        this.f34695c = strArr.length > 2 ? strArr[2] : "my-event";
        this.f34693a = new C11995c(str, new C12036d().mo41167a(true));
        this.f34693a.mo41084a(this, new ConnectionState[0]);
        this.f34693a.mo41080a(this.f34694b, (C11997b) this, this.f34695c);
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m54314a(String[] strArr) {
        new C12037a(strArr);
    }

    /* renamed from: a */
    public void mo37818a(C12019c cVar) {
        System.out.println(String.format("[%d] Connection state changed from [%s] to [%s]", new Object[]{Long.valueOf(m54313a()), cVar.mo41139b(), cVar.mo41138a()}));
    }

    /* renamed from: a */
    public void mo37819a(String str, String str2, Exception exc) {
        System.out.println(String.format("[%d] An error was received with message [%s], code [%s], exception [%s]", new Object[]{Long.valueOf(m54313a()), str, str2, exc}));
    }

    /* renamed from: a */
    public void mo37682a(String str, String str2, String str3) {
        System.out.println(String.format("[%d] Received event [%s] on channel [%s] with data [%s]", new Object[]{Long.valueOf(m54313a()), str2, str, str3}));
        System.out.println((Map) new C8775f().mo32314a(str3, Map.class));
    }

    /* renamed from: a */
    public void mo37813a(String str) {
        System.out.println(String.format("[%d] Subscription to channel [%s] succeeded", new Object[]{Long.valueOf(m54313a()), str}));
    }

    /* renamed from: a */
    private long m54313a() {
        return System.currentTimeMillis() - this.f34696d;
    }
}
