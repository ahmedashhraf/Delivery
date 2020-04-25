package org.apache.http.p541f0.p542m.p543n;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.logging.C15089a;
import org.apache.commons.logging.C15096h;
import org.apache.http.conn.C15189m;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.p535o.C15202b;
import org.apache.http.p224d0.C6143a;
import org.apache.http.p224d0.C6146d;
import org.apache.http.p541f0.p542m.C15270h;

@C6146d
/* renamed from: org.apache.http.f0.m.n.a */
/* compiled from: AbstractConnPool */
public abstract class C15281a implements C15288g {

    /* renamed from: a */
    private final C15089a f44262a = C15096h.m66940c(getClass());

    /* renamed from: b */
    protected final Lock f44263b = new ReentrantLock(false);
    @C6143a("poolLock")

    /* renamed from: c */
    protected Set<C15282b> f44264c = new HashSet();
    @C6143a("poolLock")

    /* renamed from: d */
    protected C15270h f44265d = new C15270h();
    @C6143a("poolLock")

    /* renamed from: e */
    protected int f44266e;

    /* renamed from: f */
    protected volatile boolean f44267f;
    @Deprecated

    /* renamed from: g */
    protected Set<C15283c> f44268g;
    @Deprecated

    /* renamed from: h */
    protected ReferenceQueue<Object> f44269h;

    protected C15281a() {
    }

    /* renamed from: a */
    public final C15282b mo47302a(C15202b bVar, Object obj, long j, TimeUnit timeUnit) throws ConnectionPoolTimeoutException, InterruptedException {
        return mo47303a(bVar, obj).mo47331a(j, timeUnit);
    }

    /* renamed from: a */
    public abstract C15287f mo47303a(C15202b bVar, Object obj);

    @Deprecated
    /* renamed from: a */
    public void mo47306a(Reference<?> reference) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public abstract void mo47308a(C15202b bVar);

    /* renamed from: a */
    public abstract void mo47309a(C15282b bVar, boolean z, long j, TimeUnit timeUnit);

    /* renamed from: b */
    public abstract void mo47310b();

    @Deprecated
    /* renamed from: c */
    public void mo47311c() throws IllegalStateException {
    }

    /* renamed from: d */
    public void mo47312d() {
        this.f44263b.lock();
        try {
            if (!this.f44267f) {
                Iterator it = this.f44264c.iterator();
                while (it.hasNext()) {
                    C15282b bVar = (C15282b) it.next();
                    it.remove();
                    mo47307a(bVar.mo47313c());
                }
                this.f44265d.mo47264b();
                this.f44267f = true;
                this.f44263b.unlock();
            }
        } finally {
            this.f44263b.unlock();
        }
    }

    /* renamed from: a */
    public void mo47305a(long j, TimeUnit timeUnit) {
        if (timeUnit != null) {
            this.f44263b.lock();
            try {
                this.f44265d.mo47261a(timeUnit.toMillis(j));
            } finally {
                this.f44263b.unlock();
            }
        } else {
            throw new IllegalArgumentException("Time unit must not be null.");
        }
    }

    /* renamed from: a */
    public void mo47304a() {
        this.f44263b.lock();
        try {
            this.f44265d.mo47260a();
        } finally {
            this.f44263b.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47307a(C15189m mVar) {
        if (mVar != null) {
            try {
                mVar.close();
            } catch (IOException e) {
                this.f44262a.mo46777a("I/O error closing connection", e);
            }
        }
    }
}
