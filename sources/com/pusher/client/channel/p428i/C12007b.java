package com.pusher.client.channel.p428i;

import com.google.gson.C8775f;
import com.pusher.client.AuthorizationFailureException;
import com.pusher.client.channel.C11996a;
import com.pusher.client.channel.C11997b;
import com.pusher.client.channel.C11998c;
import com.pusher.client.channel.C12000e;
import com.pusher.client.channel.C12001f;
import com.pusher.client.channel.ChannelState;
import com.pusher.client.connection.C12018b;
import com.pusher.client.connection.C12019c;
import com.pusher.client.connection.ConnectionState;
import com.pusher.client.connection.p429d.C12020a;
import com.pusher.client.p432f.C12041a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.pusher.client.channel.i.b */
/* compiled from: ChannelManager */
public class C12007b implements C12018b {

    /* renamed from: d */
    private static final C8775f f34601d = new C8775f();

    /* renamed from: a */
    private final Map<String, C12011c> f34602a = new ConcurrentHashMap();

    /* renamed from: b */
    private final C12041a f34603b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C12020a f34604c;

    /* renamed from: com.pusher.client.channel.i.b$a */
    /* compiled from: ChannelManager */
    class C12008a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12011c f34605a;

        C12008a(C12011c cVar) {
            this.f34605a = cVar;
        }

        public void run() {
            if (C12007b.this.f34604c.getState() == ConnectionState.CONNECTED) {
                try {
                    C12007b.this.f34604c.mo41143a(this.f34605a.mo41116m());
                    this.f34605a.mo41111a(ChannelState.SUBSCRIBE_SENT);
                } catch (AuthorizationFailureException e) {
                    C12007b.this.m54212a(this.f34605a, (Exception) e);
                }
            }
        }
    }

    /* renamed from: com.pusher.client.channel.i.b$b */
    /* compiled from: ChannelManager */
    class C12009b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12011c f34607a;

        C12009b(C12011c cVar) {
            this.f34607a = cVar;
        }

        public void run() {
            C12007b.this.f34604c.mo41143a(this.f34607a.mo41118o());
            this.f34607a.mo41111a(ChannelState.UNSUBSCRIBED);
        }
    }

    /* renamed from: com.pusher.client.channel.i.b$c */
    /* compiled from: ChannelManager */
    class C12010c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12011c f34610a;

        /* renamed from: b */
        final /* synthetic */ Exception f34611b;

        C12010c(C12011c cVar, Exception exc) {
            this.f34610a = cVar;
            this.f34611b = exc;
        }

        public void run() {
            ((C12001f) this.f34610a.mo41117n()).mo41103a(this.f34611b.getMessage(), this.f34611b);
        }
    }

    public C12007b(C12041a aVar) {
        this.f34603b = aVar;
    }

    /* renamed from: e */
    private C12011c m54215e(String str) {
        return (C12011c) this.f34602a.get(str);
    }

    /* renamed from: a */
    public void mo37819a(String str, String str2, Exception exc) {
    }

    /* renamed from: b */
    public C11998c mo41126b(String str) throws IllegalArgumentException {
        if (str.startsWith("presence-")) {
            return (C11998c) m54215e(str);
        }
        throw new IllegalArgumentException("Presence channels must begin with 'presence-'");
    }

    /* renamed from: c */
    public C12000e mo41127c(String str) throws IllegalArgumentException {
        if (str.startsWith("private-")) {
            return (C12000e) m54215e(str);
        }
        throw new IllegalArgumentException("Private channels must begin with 'private-'");
    }

    /* renamed from: d */
    public void mo41128d(String str) {
        if (str != null) {
            C12011c cVar = (C12011c) this.f34602a.remove(str);
            if (cVar != null && this.f34604c.getState() == ConnectionState.CONNECTED) {
                m54213b(cVar);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot unsubscribe from null channel");
    }

    /* renamed from: a */
    public C11996a mo41122a(String str) {
        if (str.startsWith("private-")) {
            throw new IllegalArgumentException("Please use the getPrivateChannel method");
        } else if (!str.startsWith("presence-")) {
            return m54215e(str);
        } else {
            throw new IllegalArgumentException("Please use the getPresenceChannel method");
        }
    }

    /* renamed from: b */
    private void m54213b(C12011c cVar) {
        this.f34603b.mo41182a((Runnable) new C12009b(cVar));
    }

    /* renamed from: b */
    private void m54214b(C12011c cVar, C11997b bVar, String... strArr) {
        if (cVar == null) {
            throw new IllegalArgumentException("Cannot subscribe to a null channel");
        } else if (!this.f34602a.containsKey(cVar.getName())) {
            for (String b : strArr) {
                cVar.mo41095b(b, bVar);
            }
            cVar.mo41112a(bVar);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Already subscribed to a channel with name ");
            sb.append(cVar.getName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo41124a(C12020a aVar) {
        if (aVar != null) {
            C12020a aVar2 = this.f34604c;
            if (aVar2 != null) {
                aVar2.mo41135b(ConnectionState.CONNECTED, this);
            }
            this.f34604c = aVar;
            aVar.mo41133a(ConnectionState.CONNECTED, this);
            return;
        }
        throw new IllegalArgumentException("Cannot construct ChannelManager with a null connection");
    }

    /* renamed from: a */
    public void mo41123a(C12011c cVar, C11997b bVar, String... strArr) {
        m54214b(cVar, bVar, strArr);
        this.f34602a.put(cVar.getName(), cVar);
        m54211a(cVar);
    }

    /* renamed from: a */
    public void mo41125a(String str, String str2) {
        Object obj = ((Map) f34601d.mo32314a(str2, Map.class)).get("channel");
        if (obj != null) {
            C12011c cVar = (C12011c) this.f34602a.get((String) obj);
            if (cVar != null) {
                cVar.mo41113a(str, str2);
            }
        }
    }

    /* renamed from: a */
    public void mo37818a(C12019c cVar) {
        if (cVar.mo41138a() == ConnectionState.CONNECTED) {
            for (C12011c a : this.f34602a.values()) {
                m54211a(a);
            }
        }
    }

    /* renamed from: a */
    private void m54211a(C12011c cVar) {
        this.f34603b.mo41182a((Runnable) new C12008a(cVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m54212a(C12011c cVar, Exception exc) {
        this.f34602a.remove(cVar.getName());
        cVar.mo41111a(ChannelState.FAILED);
        if (cVar.mo41117n() != null) {
            this.f34603b.mo41182a((Runnable) new C12010c(cVar, exc));
        }
    }
}
