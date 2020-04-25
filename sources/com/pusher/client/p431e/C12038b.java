package com.pusher.client.p431e;

import com.pusher.client.C11993a;
import com.pusher.client.C11995c;
import com.pusher.client.C12036d;
import com.pusher.client.channel.C11998c;
import com.pusher.client.channel.C11999d;
import com.pusher.client.channel.C12003h;
import com.pusher.client.connection.C12018b;
import com.pusher.client.connection.C12019c;
import com.pusher.client.connection.ConnectionState;
import com.pusher.client.p432f.C12044b;
import java.util.Set;

/* renamed from: com.pusher.client.e.b */
/* compiled from: PresenceChannelExampleApp */
public class C12038b implements C12018b, C11999d {

    /* renamed from: a */
    private final C11995c f34697a;

    /* renamed from: b */
    private final String f34698b;

    /* renamed from: c */
    private final String f34699c;

    /* renamed from: d */
    private final C11998c f34700d;

    public C12038b(String[] strArr) {
        String str = strArr.length > 0 ? strArr[0] : "a87fe72c6f36272aa4b1";
        this.f34698b = strArr.length > 1 ? strArr[1] : "presence-my-channel";
        this.f34699c = strArr.length > 2 ? strArr[2] : "my-event";
        this.f34697a = new C11995c(str, new C12036d().mo41165a((C11993a) new C12044b("http://www.leggetter.co.uk/pusher/pusher-examples/php/authentication/src/presence_auth.php")).mo41167a(true));
        this.f34697a.mo41084a(this, new ConnectionState[0]);
        this.f34700d = this.f34697a.mo41081a(this.f34698b, (C11999d) this, this.f34699c);
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m54320a(String[] strArr) {
        new C12038b(strArr);
    }

    /* renamed from: b */
    public void mo41101b(String str, C12003h hVar) {
        System.out.println(String.format("A new user has joined channel [%s]: %s", new Object[]{str, hVar.toString()}));
        m54319a();
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
    public void mo41100a(String str, Set<C12003h> set) {
        System.out.println("Received user information");
        m54319a();
    }

    /* renamed from: a */
    public void mo41099a(String str, C12003h hVar) {
        System.out.println(String.format("A user has left channel [%s]: %s", new Object[]{str, hVar}));
        m54319a();
    }

    /* renamed from: a */
    public void mo37682a(String str, String str2, String str3) {
        System.out.println(String.format("Received event [%s] on channel [%s] with data [%s]", new Object[]{str2, str, str3}));
    }

    /* renamed from: a */
    public void mo37813a(String str) {
        System.out.println(String.format("Subscription to channel [%s] succeeded", new Object[]{this.f34700d.getName()}));
    }

    /* renamed from: a */
    public void mo41103a(String str, Exception exc) {
        System.out.println(String.format("Authentication failure due to [%s], exception was [%s]", new Object[]{str, exc}));
    }

    /* renamed from: a */
    private void m54319a() {
        StringBuilder sb = new StringBuilder("Users now subscribed to the channel:");
        for (C12003h hVar : this.f34700d.mo41098c()) {
            sb.append("\n\t");
            sb.append(hVar.toString());
            if (hVar.equals(this.f34700d.mo41097b())) {
                sb.append(" (me)");
            }
        }
        System.out.println(sb.toString());
    }
}
