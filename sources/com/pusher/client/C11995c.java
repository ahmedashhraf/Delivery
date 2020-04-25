package com.pusher.client;

import com.pusher.client.channel.C11996a;
import com.pusher.client.channel.C11997b;
import com.pusher.client.channel.C11998c;
import com.pusher.client.channel.C11999d;
import com.pusher.client.channel.C12000e;
import com.pusher.client.channel.C12001f;
import com.pusher.client.channel.p428i.C12004a;
import com.pusher.client.channel.p428i.C12007b;
import com.pusher.client.channel.p428i.C12011c;
import com.pusher.client.channel.p428i.C12012d;
import com.pusher.client.channel.p428i.C12016e;
import com.pusher.client.connection.C12017a;
import com.pusher.client.connection.C12018b;
import com.pusher.client.connection.ConnectionState;
import com.pusher.client.connection.p429d.C12020a;
import com.pusher.client.p432f.C12041a;

/* renamed from: com.pusher.client.c */
/* compiled from: Pusher */
public class C11995c implements C11994b {

    /* renamed from: a */
    private final C12036d f34580a;

    /* renamed from: b */
    private final C12020a f34581b;

    /* renamed from: c */
    private final C12007b f34582c;

    /* renamed from: d */
    private final C12041a f34583d;

    public C11995c(String str) {
        this(str, new C12036d());
    }

    /* renamed from: a */
    public void mo41084a(C12018b bVar, ConnectionState... connectionStateArr) {
        if (bVar != null) {
            if (connectionStateArr.length == 0) {
                connectionStateArr = new ConnectionState[]{ConnectionState.ALL};
            }
            for (ConnectionState a : connectionStateArr) {
                this.f34581b.mo41133a(a, bVar);
            }
        } else if (connectionStateArr.length > 0) {
            throw new IllegalArgumentException("Cannot bind to connection states with a null connection event listener");
        }
        this.f34581b.mo41134b();
    }

    /* renamed from: b */
    public void mo41086b() {
        mo41084a(null, new ConnectionState[0]);
    }

    /* renamed from: c */
    public C12017a mo41088c() {
        return this.f34581b;
    }

    /* renamed from: d */
    public void mo41089d(String str) {
        this.f34582c.mo41128d(str);
    }

    /* renamed from: e */
    public C11998c mo41090e(String str) {
        return mo41081a(str, (C11999d) null, new String[0]);
    }

    /* renamed from: f */
    public C12000e mo41091f(String str) {
        return mo41082a(str, (C12001f) null, new String[0]);
    }

    /* renamed from: g */
    public C11998c mo41092g(String str) {
        return this.f34582c.mo41126b(str);
    }

    public C11995c(String str, C12036d dVar) {
        this(str, dVar, new C12041a());
    }

    /* renamed from: d */
    private void m54165d() {
        if (this.f34580a.mo41169b() == null) {
            throw new IllegalStateException("Cannot subscribe to a private or presence channel because no Authorizer has been set. Call PusherOptions.setAuthorizer() before connecting to Pusher");
        }
    }

    /* renamed from: b */
    public C11996a mo41085b(String str) {
        return mo41080a(str, (C11997b) null, new String[0]);
    }

    /* renamed from: c */
    public C12000e mo41087c(String str) {
        return this.f34582c.mo41127c(str);
    }

    C11995c(String str, C12036d dVar, C12041a aVar) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("API Key cannot be null or empty");
        } else if (dVar != null) {
            this.f34580a = dVar;
            this.f34583d = aVar;
            this.f34581b = aVar.mo41180a(str, this.f34580a);
            this.f34582c = aVar.mo41178a();
            this.f34582c.mo41124a(this.f34581b);
        } else {
            throw new IllegalArgumentException("PusherOptions cannot be null");
        }
    }

    /* renamed from: a */
    public void mo41083a() {
        if (this.f34581b.getState() == ConnectionState.CONNECTED) {
            this.f34581b.mo41142a();
        }
    }

    /* renamed from: a */
    public C11996a mo41080a(String str, C11997b bVar, String... strArr) {
        C12004a a = this.f34583d.mo41177a(str);
        this.f34582c.mo41123a((C12011c) a, bVar, strArr);
        return a;
    }

    /* renamed from: a */
    public C12000e mo41082a(String str, C12001f fVar, String... strArr) {
        m54165d();
        C12016e b = this.f34583d.mo41183b(this.f34581b, str, this.f34580a.mo41169b());
        this.f34582c.mo41123a((C12011c) b, (C11997b) fVar, strArr);
        return b;
    }

    /* renamed from: a */
    public C11998c mo41081a(String str, C11999d dVar, String... strArr) {
        m54165d();
        C12012d a = this.f34583d.mo41179a(this.f34581b, str, this.f34580a.mo41169b());
        this.f34582c.mo41123a((C12011c) a, (C11997b) dVar, strArr);
        return a;
    }

    /* renamed from: a */
    public C11996a mo41079a(String str) {
        return this.f34582c.mo41122a(str);
    }
}
