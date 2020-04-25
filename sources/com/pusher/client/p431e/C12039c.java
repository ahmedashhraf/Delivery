package com.pusher.client.p431e;

import com.pusher.client.C11993a;
import com.pusher.client.C11995c;
import com.pusher.client.C12036d;
import com.pusher.client.channel.C12000e;
import com.pusher.client.channel.C12001f;
import com.pusher.client.connection.C12018b;
import com.pusher.client.connection.C12019c;
import com.pusher.client.connection.ConnectionState;
import com.pusher.client.p432f.C12044b;

/* renamed from: com.pusher.client.e.c */
/* compiled from: PrivateChannelExampleApp */
public class C12039c implements C12018b, C12001f {

    /* renamed from: a */
    private final C11995c f34701a;

    /* renamed from: b */
    private final String f34702b;

    /* renamed from: c */
    private final String f34703c;

    /* renamed from: d */
    private final C12000e f34704d;

    public C12039c(String[] strArr) {
        String str = strArr.length > 0 ? strArr[0] : "a87fe72c6f36272aa4b1";
        this.f34702b = strArr.length > 1 ? strArr[1] : "private-my-channel";
        this.f34703c = strArr.length > 2 ? strArr[2] : "my-event";
        this.f34701a = new C11995c(str, new C12036d().mo41165a((C11993a) new C12044b("http://www.leggetter.co.uk/pusher/pusher-examples/php/authentication/src/private_auth.php")));
        this.f34701a.mo41084a(this, new ConnectionState[0]);
        this.f34704d = this.f34701a.mo41082a(this.f34702b, (C12001f) this, this.f34703c);
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m54329a(String[] strArr) {
        new C12039c(strArr);
    }

    /* renamed from: a */
    public void mo37818a(C12019c cVar) {
        System.out.println(String.format("Connection state changed from [%s] to [%s]", new Object[]{cVar.mo41139b(), cVar.mo41138a()}));
    }

    /* renamed from: a */
    public void mo37819a(String str, String str2, Exception exc) {
        System.out.println(String.format("An error was received with message [%s], code [%s], exception [%s]", new Object[]{str, str2, exc}));
    }

    /* renamed from: a */
    public void mo37682a(String str, String str2, String str3) {
        System.out.println(String.format("Received event [%s] on channel [%s] with data [%s]", new Object[]{str2, str, str3}));
    }

    /* renamed from: a */
    public void mo37813a(String str) {
        System.out.println(String.format("Subscription to channel [%s] succeeded", new Object[]{this.f34704d.getName()}));
        this.f34704d.mo41102b("client-myEvent", "{\"myName\":\"Bob\"}");
    }

    /* renamed from: a */
    public void mo41103a(String str, Exception exc) {
        System.out.println(String.format("Authentication failure due to [%s], exception was [%s]", new Object[]{str, exc}));
    }
}
