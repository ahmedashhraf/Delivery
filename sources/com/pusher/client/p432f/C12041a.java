package com.pusher.client.p432f;

import com.pusher.client.C11993a;
import com.pusher.client.C12036d;
import com.pusher.client.channel.p428i.C12004a;
import com.pusher.client.channel.p428i.C12007b;
import com.pusher.client.channel.p428i.C12012d;
import com.pusher.client.channel.p428i.C12016e;
import com.pusher.client.connection.p429d.C12020a;
import com.pusher.client.connection.p430e.C12021a;
import com.pusher.client.connection.p430e.C12022b;
import com.pusher.client.connection.p430e.C12035c;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import javax.net.ssl.SSLException;

/* renamed from: com.pusher.client.f.a */
/* compiled from: Factory */
public class C12041a {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Object f34705e = new Object();

    /* renamed from: a */
    private C12020a f34706a;

    /* renamed from: b */
    private C12007b f34707b;

    /* renamed from: c */
    private ExecutorService f34708c;

    /* renamed from: d */
    private ScheduledExecutorService f34709d;

    /* renamed from: com.pusher.client.f.a$a */
    /* compiled from: Factory */
    class C12042a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f34710a;

        C12042a(Runnable runnable) {
            this.f34710a = runnable;
        }

        public void run() {
            synchronized (C12041a.f34705e) {
                this.f34710a.run();
            }
        }
    }

    /* renamed from: com.pusher.client.f.a$b */
    /* compiled from: Factory */
    private static class C12043b implements ThreadFactory {

        /* renamed from: a */
        private final String f34712a;

        public C12043b(String str) {
            this.f34712a = str;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            StringBuilder sb = new StringBuilder();
            sb.append("pusher-java-client ");
            sb.append(this.f34712a);
            thread.setName(sb.toString());
            return thread;
        }
    }

    /* renamed from: a */
    public synchronized C12020a mo41180a(String str, C12036d dVar) {
        if (this.f34706a == null) {
            try {
                C12022b bVar = new C12022b(dVar.mo41168a(str), dVar.mo41162a(), dVar.mo41173c(), dVar.mo41175d(), this);
                this.f34706a = bVar;
            } catch (URISyntaxException e) {
                throw new IllegalArgumentException("Failed to initialise connection", e);
            }
        }
        return this.f34706a;
    }

    /* renamed from: b */
    public synchronized ScheduledExecutorService mo41184b() {
        if (this.f34709d == null) {
            this.f34709d = Executors.newSingleThreadScheduledExecutor(new C12043b("timers"));
        }
        return this.f34709d;
    }

    /* renamed from: c */
    public synchronized void mo41185c() {
        if (this.f34708c != null) {
            this.f34708c.shutdown();
            this.f34708c = null;
        }
        if (this.f34709d != null) {
            this.f34709d.shutdown();
            this.f34709d = null;
        }
    }

    /* renamed from: b */
    public C12016e mo41183b(C12020a aVar, String str, C11993a aVar2) {
        return new C12016e(aVar, str, aVar2, this);
    }

    /* renamed from: a */
    public C12021a mo41181a(URI uri, Proxy proxy, C12035c cVar) throws SSLException {
        return new C12021a(uri, proxy, cVar);
    }

    /* renamed from: a */
    public C12004a mo41177a(String str) {
        return new C12004a(str, this);
    }

    /* renamed from: a */
    public C12012d mo41179a(C12020a aVar, String str, C11993a aVar2) {
        return new C12012d(aVar, str, aVar2, this);
    }

    /* renamed from: a */
    public synchronized C12007b mo41178a() {
        if (this.f34707b == null) {
            this.f34707b = new C12007b(this);
        }
        return this.f34707b;
    }

    /* renamed from: a */
    public synchronized void mo41182a(Runnable runnable) {
        if (this.f34708c == null) {
            this.f34708c = Executors.newSingleThreadExecutor(new C12043b("eventQueue"));
        }
        this.f34708c.execute(new C12042a(runnable));
    }
}
