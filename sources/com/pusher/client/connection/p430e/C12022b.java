package com.pusher.client.connection.p430e;

import androidx.core.app.C0770p;
import com.google.gson.C8775f;
import com.pusher.client.connection.C12018b;
import com.pusher.client.connection.C12019c;
import com.pusher.client.connection.ConnectionState;
import com.pusher.client.connection.p429d.C12020a;
import com.pusher.client.p432f.C12041a;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import p076c.p284e.p285a.p288l.C6764h;
import p205i.p489f.C14066c;
import p205i.p489f.C14067d;

/* renamed from: com.pusher.client.connection.e.b */
/* compiled from: WebSocketConnection */
public class C12022b implements C12020a, C12035c {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C14066c f34634j = C14067d.m60727a(C12022b.class);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C8775f f34635k = new C8775f();

    /* renamed from: l */
    private static final String f34636l = "pusher:";

    /* renamed from: m */
    private static final String f34637m = "{\"event\": \"pusher:ping\"}";

    /* renamed from: n */
    private static final int f34638n = 6;

    /* renamed from: o */
    private static final int f34639o = 30;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12041a f34640a;

    /* renamed from: b */
    private final C12032j f34641b;

    /* renamed from: c */
    private final Map<ConnectionState, Set<C12018b>> f34642c = new ConcurrentHashMap();

    /* renamed from: d */
    private final URI f34643d;

    /* renamed from: e */
    private final Proxy f34644e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile ConnectionState f34645f = ConnectionState.DISCONNECTED;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C12021a f34646g;

    /* renamed from: h */
    private String f34647h;

    /* renamed from: i */
    private int f34648i;

    /* renamed from: com.pusher.client.connection.e.b$a */
    /* compiled from: WebSocketConnection */
    class C12023a implements Runnable {
        C12023a() {
        }

        public void run() {
            if (C12022b.this.f34645f == ConnectionState.DISCONNECTED) {
                C12022b.this.m54279g();
            }
        }
    }

    /* renamed from: com.pusher.client.connection.e.b$b */
    /* compiled from: WebSocketConnection */
    class C12024b implements Runnable {
        C12024b() {
        }

        public void run() {
            if (C12022b.this.f34645f == ConnectionState.CONNECTED) {
                C12022b.this.m54264a(ConnectionState.DISCONNECTING);
                C12022b.this.f34646g.close();
            }
        }
    }

    /* renamed from: com.pusher.client.connection.e.b$c */
    /* compiled from: WebSocketConnection */
    class C12025c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f34651a;

        C12025c(String str) {
            this.f34651a = str;
        }

        public void run() {
            try {
                if (C12022b.this.f34645f == ConnectionState.CONNECTED) {
                    C12022b.this.f34646g.mo26932a(this.f34651a);
                    return;
                }
                C12022b bVar = C12022b.this;
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot send a message while in ");
                sb.append(C12022b.this.f34645f);
                sb.append(" state");
                bVar.m54269a(sb.toString(), (String) null, (Exception) null);
            } catch (Exception e) {
                C12022b bVar2 = C12022b.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("An exception occurred while sending message [");
                sb2.append(this.f34651a);
                sb2.append("]");
                bVar2.m54269a(sb2.toString(), (String) null, e);
            }
        }
    }

    /* renamed from: com.pusher.client.connection.e.b$d */
    /* compiled from: WebSocketConnection */
    class C12026d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12018b f34654a;

        /* renamed from: b */
        final /* synthetic */ C12019c f34655b;

        C12026d(C12018b bVar, C12019c cVar) {
            this.f34654a = bVar;
            this.f34655b = cVar;
        }

        public void run() {
            this.f34654a.mo37818a(this.f34655b);
        }
    }

    /* renamed from: com.pusher.client.connection.e.b$e */
    /* compiled from: WebSocketConnection */
    class C12027e implements Runnable {

        /* renamed from: N */
        final /* synthetic */ String f34656N;

        /* renamed from: O */
        final /* synthetic */ Exception f34657O;

        /* renamed from: a */
        final /* synthetic */ C12018b f34659a;

        /* renamed from: b */
        final /* synthetic */ String f34660b;

        C12027e(C12018b bVar, String str, String str2, Exception exc) {
            this.f34659a = bVar;
            this.f34660b = str;
            this.f34656N = str2;
            this.f34657O = exc;
        }

        public void run() {
            this.f34659a.mo37819a(this.f34660b, this.f34656N, this.f34657O);
        }
    }

    /* renamed from: com.pusher.client.connection.e.b$f */
    /* compiled from: WebSocketConnection */
    class C12028f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f34661a;

        C12028f(String str) {
            this.f34661a = str;
        }

        public void run() {
            C12022b.this.m54268a((String) ((Map) C12022b.f34635k.mo32314a(this.f34661a, Map.class)).get(C0770p.f3524g0), this.f34661a);
        }
    }

    /* renamed from: com.pusher.client.connection.e.b$g */
    /* compiled from: WebSocketConnection */
    class C12029g implements Runnable {
        C12029g() {
        }

        public void run() {
            C12022b.this.f34646g.mo41144o();
            C12022b.this.m54279g();
        }
    }

    /* renamed from: com.pusher.client.connection.e.b$h */
    /* compiled from: WebSocketConnection */
    class C12030h implements Runnable {
        C12030h() {
        }

        public void run() {
            C12022b.this.m54264a(ConnectionState.DISCONNECTED);
            C12022b.this.f34640a.mo41185c();
        }
    }

    /* renamed from: com.pusher.client.connection.e.b$i */
    /* compiled from: WebSocketConnection */
    class C12031i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Exception f34665a;

        C12031i(Exception exc) {
            this.f34665a = exc;
        }

        public void run() {
            C12022b.this.m54269a("An exception was thrown by the websocket", (String) null, this.f34665a);
        }
    }

    /* renamed from: com.pusher.client.connection.e.b$j */
    /* compiled from: WebSocketConnection */
    private class C12032j {

        /* renamed from: a */
        private final long f34667a;

        /* renamed from: b */
        private final long f34668b;

        /* renamed from: c */
        private Future<?> f34669c;

        /* renamed from: d */
        private Future<?> f34670d;

        /* renamed from: com.pusher.client.connection.e.b$j$a */
        /* compiled from: WebSocketConnection */
        class C12033a implements Runnable {
            C12033a() {
            }

            public void run() {
                C12022b.f34634j.debug("Sending ping");
                C12022b.this.mo41143a(C12022b.f34637m);
                C12032j.this.m54291c();
            }
        }

        /* renamed from: com.pusher.client.connection.e.b$j$b */
        /* compiled from: WebSocketConnection */
        class C12034b implements Runnable {
            C12034b() {
            }

            public void run() {
                C12022b.f34634j.debug("Timed out awaiting pong from server - disconnecting");
                C12022b.this.f34646g.mo41144o();
                C12022b.this.mo41142a();
                C12022b.this.mo41145a(-1, "Pong timeout", false);
            }
        }

        C12032j(long j, long j2) {
            this.f34667a = j;
            this.f34668b = j2;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public synchronized void m54291c() {
            if (this.f34670d != null) {
                this.f34670d.cancel(false);
            }
            this.f34670d = C12022b.this.f34640a.mo41184b().schedule(new C12034b(), this.f34668b, TimeUnit.MILLISECONDS);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public synchronized void mo41159b() {
            if (this.f34669c != null) {
                this.f34669c.cancel(false);
            }
            if (this.f34670d != null) {
                this.f34670d.cancel(false);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized void mo41158a() {
            if (this.f34670d != null) {
                this.f34670d.cancel(true);
            }
            if (this.f34669c != null) {
                this.f34669c.cancel(false);
            }
            this.f34669c = C12022b.this.f34640a.mo41184b().schedule(new C12033a(), this.f34667a, TimeUnit.MILLISECONDS);
        }
    }

    public C12022b(String str, long j, long j2, Proxy proxy, C12041a aVar) throws URISyntaxException {
        this.f34648i = 0;
        this.f34643d = new URI(str);
        C12032j jVar = new C12032j(j, j2);
        this.f34641b = jVar;
        this.f34644e = proxy;
        this.f34640a = aVar;
        for (ConnectionState put : ConnectionState.values()) {
            this.f34642c.put(put, Collections.newSetFromMap(new ConcurrentHashMap()));
        }
    }

    /* renamed from: f */
    private void m54278f() {
        this.f34641b.mo41159b();
        this.f34640a.mo41182a((Runnable) new C12030h());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m54279g() {
        try {
            this.f34646g = this.f34640a.mo41181a(this.f34643d, this.f34644e, (C12035c) this);
            m54264a(ConnectionState.CONNECTING);
            this.f34646g.mo26988k();
        } catch (SSLException e) {
            m54269a("Error connecting over SSL", (String) null, (Exception) e);
        }
    }

    /* renamed from: h */
    private void m54280h() {
        this.f34648i++;
        m54264a(ConnectionState.RECONNECTING);
        int i = this.f34648i;
        this.f34640a.mo41184b().schedule(new C12029g(), (long) Math.min(30, i * i), TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public void mo41146a(C6764h hVar) {
    }

    public ConnectionState getState() {
        return this.f34645f;
    }

    public void onError(Exception exc) {
        this.f34640a.mo41182a((Runnable) new C12031i(exc));
    }

    /* renamed from: b */
    public void mo41134b() {
        this.f34640a.mo41182a((Runnable) new C12023a());
    }

    /* renamed from: c */
    public String mo41136c() {
        return this.f34647h;
    }

    /* renamed from: c */
    private void m54273c(String str) {
        this.f34647h = (String) ((Map) f34635k.mo32314a((String) ((Map) f34635k.mo32314a(str, Map.class)).get("data"), Map.class)).get("socket_id");
        ConnectionState connectionState = this.f34645f;
        ConnectionState connectionState2 = ConnectionState.CONNECTED;
        if (connectionState != connectionState2) {
            m54264a(connectionState2);
        }
        this.f34648i = 0;
    }

    /* renamed from: d */
    private void m54276d(String str) {
        Map map;
        Object obj = ((Map) f34635k.mo32314a(str, Map.class)).get("data");
        if (obj instanceof String) {
            map = (Map) f34635k.mo32314a((String) obj, Map.class);
        } else {
            map = (Map) obj;
        }
        String str2 = (String) map.get("message");
        Object obj2 = map.get(XHTMLText.CODE);
        m54269a(str2, obj2 != null ? String.valueOf(Math.round(((Double) obj2).doubleValue())) : null, (Exception) null);
    }

    /* renamed from: b */
    public boolean mo41135b(ConnectionState connectionState, C12018b bVar) {
        return ((Set) this.f34642c.get(connectionState)).remove(bVar);
    }

    /* renamed from: b */
    private void m54271b(String str, String str2) {
        if (str.equals("pusher:connection_established")) {
            m54273c(str2);
        } else if (str.equals("pusher:error")) {
            m54276d(str2);
        }
    }

    /* renamed from: a */
    public void mo41142a() {
        this.f34640a.mo41182a((Runnable) new C12024b());
    }

    /* renamed from: a */
    public void mo41133a(ConnectionState connectionState, C12018b bVar) {
        ((Set) this.f34642c.get(connectionState)).add(bVar);
    }

    /* renamed from: a */
    public void mo41143a(String str) {
        this.f34640a.mo41182a((Runnable) new C12025c(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m54264a(ConnectionState connectionState) {
        C14066c cVar = f34634j;
        StringBuilder sb = new StringBuilder();
        sb.append("State transition requested, current [");
        sb.append(this.f34645f);
        sb.append("], new [");
        sb.append(connectionState);
        sb.append("]");
        cVar.debug(sb.toString());
        C12019c cVar2 = new C12019c(this.f34645f, connectionState);
        this.f34645f = connectionState;
        HashSet<C12018b> hashSet = new HashSet<>();
        hashSet.addAll((Collection) this.f34642c.get(ConnectionState.ALL));
        hashSet.addAll((Collection) this.f34642c.get(connectionState));
        for (C12018b dVar : hashSet) {
            this.f34640a.mo41182a((Runnable) new C12026d(dVar, cVar2));
        }
    }

    /* renamed from: b */
    public void mo41147b(String str) {
        this.f34641b.mo41158a();
        this.f34640a.mo41182a((Runnable) new C12028f(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m54268a(String str, String str2) {
        if (str.startsWith(f34636l)) {
            m54271b(str, str2);
        } else {
            this.f34640a.mo41178a().mo41125a(str, str2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m54269a(String str, String str2, Exception exc) {
        HashSet<C12018b> hashSet = new HashSet<>();
        for (Set addAll : this.f34642c.values()) {
            hashSet.addAll(addAll);
        }
        for (C12018b bVar : hashSet) {
            C12041a aVar = this.f34640a;
            C12027e eVar = new C12027e(bVar, str, str2, exc);
            aVar.mo41182a((Runnable) eVar);
        }
    }

    /* renamed from: a */
    public void mo41145a(int i, String str, boolean z) {
        if (this.f34645f == ConnectionState.DISCONNECTED || this.f34645f == ConnectionState.RECONNECTING) {
            C14066c cVar = f34634j;
            StringBuilder sb = new StringBuilder();
            sb.append("Received close from underlying socket when already disconnected.Close code [");
            sb.append(i);
            sb.append("], Reason [");
            sb.append(str);
            sb.append("], Remote [");
            sb.append(z);
            sb.append("]");
            cVar.mo44439b(sb.toString());
        } else if (this.f34645f == ConnectionState.CONNECTED || this.f34645f == ConnectionState.CONNECTING) {
            if (this.f34648i < 6) {
                m54280h();
            } else {
                m54264a(ConnectionState.DISCONNECTING);
                m54278f();
            }
        } else {
            if (this.f34645f == ConnectionState.DISCONNECTING) {
                m54278f();
            }
        }
    }
}
