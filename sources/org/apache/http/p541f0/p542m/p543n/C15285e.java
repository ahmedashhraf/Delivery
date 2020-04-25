package org.apache.http.p541f0.p542m.p543n;

import com.fasterxml.jackson.core.p162w.C3868i;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import org.apache.commons.logging.C15089a;
import org.apache.commons.logging.C15096h;
import org.apache.http.C15323h;
import org.apache.http.conn.C15181e;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.p534n.C15194e;
import org.apache.http.conn.p535o.C15202b;
import org.apache.http.p548i0.C15357i;

/* renamed from: org.apache.http.f0.m.n.e */
/* compiled from: ConnPoolByRoute */
public class C15285e extends C15281a {

    /* renamed from: i */
    private final C15089a f44271i = C15096h.m66940c(C15285e.class);

    /* renamed from: j */
    private final C15357i f44272j;

    /* renamed from: k */
    protected final C15181e f44273k;

    /* renamed from: l */
    protected final Queue<C15282b> f44274l;

    /* renamed from: m */
    protected final Queue<C15293k> f44275m;

    /* renamed from: n */
    protected final Map<C15202b, C15290i> f44276n;

    /* renamed from: org.apache.http.f0.m.n.e$a */
    /* compiled from: ConnPoolByRoute */
    class C15286a implements C15287f {

        /* renamed from: a */
        final /* synthetic */ C15294l f44277a;

        /* renamed from: b */
        final /* synthetic */ C15202b f44278b;

        /* renamed from: c */
        final /* synthetic */ Object f44279c;

        C15286a(C15294l lVar, C15202b bVar, Object obj) {
            this.f44277a = lVar;
            this.f44278b = bVar;
            this.f44279c = obj;
        }

        /* renamed from: a */
        public void mo47332a() {
            C15285e.this.f44263b.lock();
            try {
                this.f44277a.mo47361a();
            } finally {
                C15285e.this.f44263b.unlock();
            }
        }

        /* renamed from: a */
        public C15282b mo47331a(long j, TimeUnit timeUnit) throws InterruptedException, ConnectionPoolTimeoutException {
            return C15285e.this.mo47318a(this.f44278b, this.f44279c, j, timeUnit, this.f44277a);
        }
    }

    public C15285e(C15181e eVar, C15357i iVar) {
        if (eVar != null) {
            this.f44273k = eVar;
            this.f44272j = iVar;
            this.f44274l = mo47327e();
            this.f44275m = mo47329g();
            this.f44276n = mo47328f();
            return;
        }
        throw new IllegalArgumentException("Connection operator may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15293k mo47322a(Condition condition, C15290i iVar) {
        return new C15293k(condition, iVar);
    }

    /* renamed from: b */
    public int mo47325b(C15202b bVar) {
        this.f44263b.lock();
        int i = 0;
        try {
            C15290i a = mo47321a(bVar, false);
            if (a != null) {
                i = a.mo47343c();
            }
            return i;
        } finally {
            this.f44263b.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C15290i mo47326c(C15202b bVar) {
        return new C15290i(bVar, C15194e.m67358a(this.f44272j).mo47034a(bVar));
    }

    /* renamed from: d */
    public void mo47312d() {
        this.f44263b.lock();
        try {
            super.mo47312d();
            Iterator it = this.f44274l.iterator();
            while (it.hasNext()) {
                C15282b bVar = (C15282b) it.next();
                it.remove();
                if (this.f44271i.mo46785d()) {
                    C15089a aVar = this.f44271i;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Closing connection [");
                    sb.append(bVar.mo47314d());
                    sb.append("][");
                    sb.append(bVar.mo47250a());
                    sb.append("]");
                    aVar.mo46776a(sb.toString());
                }
                mo47307a(bVar.mo47313c());
            }
            Iterator it2 = this.f44275m.iterator();
            while (it2.hasNext()) {
                C15293k kVar = (C15293k) it2.next();
                it2.remove();
                kVar.mo47360e();
            }
            this.f44276n.clear();
        } finally {
            this.f44263b.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Queue<C15282b> mo47327e() {
        return new LinkedList();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Map<C15202b, C15290i> mo47328f() {
        return new HashMap();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Queue<C15293k> mo47329g() {
        return new LinkedList();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo47330h() {
        try {
            this.f44263b.lock();
            C15282b bVar = (C15282b) this.f44274l.remove();
            if (bVar != null) {
                mo47323a(bVar);
            } else if (this.f44271i.mo46785d()) {
                this.f44271i.mo46776a("No free connection to delete.");
            }
        } finally {
            this.f44263b.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15290i mo47321a(C15202b bVar, boolean z) {
        this.f44263b.lock();
        try {
            C15290i iVar = (C15290i) this.f44276n.get(bVar);
            if (iVar == null && z) {
                iVar = mo47326c(bVar);
                this.f44276n.put(bVar, iVar);
            }
            return iVar;
        } finally {
            this.f44263b.unlock();
        }
    }

    /* renamed from: b */
    public void mo47310b() {
        this.f44263b.lock();
        try {
            Iterator it = this.f44274l.iterator();
            while (it.hasNext()) {
                C15282b bVar = (C15282b) it.next();
                if (!bVar.mo47313c().isOpen()) {
                    it.remove();
                    mo47323a(bVar);
                }
            }
        } finally {
            this.f44263b.unlock();
        }
    }

    /* renamed from: a */
    public C15287f mo47303a(C15202b bVar, Object obj) {
        return new C15286a(new C15294l(), bVar, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15282b mo47318a(C15202b bVar, Object obj, long j, TimeUnit timeUnit, C15294l lVar) throws ConnectionPoolTimeoutException, InterruptedException {
        C15290i a;
        C15293k kVar;
        C15202b bVar2 = bVar;
        Object obj2 = obj;
        long j2 = j;
        int b = C15194e.m67362b(this.f44272j);
        C15282b bVar3 = null;
        Date date = j2 > 0 ? new Date(System.currentTimeMillis() + timeUnit.toMillis(j2)) : null;
        this.f44263b.lock();
        try {
            a = mo47321a(bVar2, true);
            kVar = null;
            while (true) {
                if (bVar3 != null) {
                    break;
                } else if (!this.f44267f) {
                    String str = " out of ";
                    if (this.f44271i.mo46785d()) {
                        C15089a aVar = this.f44271i;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Total connections kept alive: ");
                        sb.append(this.f44274l.size());
                        aVar.mo46776a(sb.toString());
                        C15089a aVar2 = this.f44271i;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Total issued connections: ");
                        sb2.append(this.f44264c.size());
                        aVar2.mo46776a(sb2.toString());
                        C15089a aVar3 = this.f44271i;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Total allocated connection: ");
                        sb3.append(this.f44266e);
                        sb3.append(str);
                        sb3.append(b);
                        aVar3.mo46776a(sb3.toString());
                    }
                    bVar3 = mo47319a(a, obj2);
                    if (bVar3 != null) {
                        break;
                    }
                    boolean z = a.mo47340b() > 0;
                    String str2 = "]";
                    String str3 = "][";
                    if (this.f44271i.mo46785d()) {
                        C15089a aVar4 = this.f44271i;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Available capacity: ");
                        sb4.append(a.mo47340b());
                        sb4.append(str);
                        sb4.append(a.mo47345d());
                        sb4.append(" [");
                        sb4.append(bVar2);
                        sb4.append(str3);
                        sb4.append(obj2);
                        sb4.append(str2);
                        aVar4.mo46776a(sb4.toString());
                    }
                    if (z && this.f44266e < b) {
                        bVar3 = mo47320a(a, this.f44273k);
                    } else if (!z || this.f44274l.isEmpty()) {
                        if (this.f44271i.mo46785d()) {
                            C15089a aVar5 = this.f44271i;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Need to wait for connection [");
                            sb5.append(bVar2);
                            sb5.append(str3);
                            sb5.append(obj2);
                            sb5.append(str2);
                            aVar5.mo46776a(sb5.toString());
                        }
                        if (kVar == null) {
                            kVar = mo47322a(this.f44263b.newCondition(), a);
                            lVar.mo47362a(kVar);
                        } else {
                            C15294l lVar2 = lVar;
                        }
                        a.mo47339a(kVar);
                        this.f44275m.add(kVar);
                        boolean a2 = kVar.mo47356a(date);
                        a.mo47341b(kVar);
                        this.f44275m.remove(kVar);
                        if (!a2 && date != null) {
                            if (date.getTime() <= System.currentTimeMillis()) {
                                throw new ConnectionPoolTimeoutException("Timeout waiting for connection");
                            }
                        }
                    } else {
                        mo47330h();
                        bVar3 = mo47320a(a, this.f44273k);
                    }
                    C15294l lVar3 = lVar;
                } else {
                    throw new IllegalStateException("Connection pool shut down.");
                }
            }
            this.f44263b.unlock();
            return bVar3;
        } catch (Throwable th) {
            this.f44263b.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo47309a(C15282b bVar, boolean z, long j, TimeUnit timeUnit) {
        C15202b d = bVar.mo47314d();
        String str = "]";
        String str2 = "][";
        if (this.f44271i.mo46785d()) {
            C15089a aVar = this.f44271i;
            StringBuilder sb = new StringBuilder();
            sb.append("Releasing connection [");
            sb.append(d);
            sb.append(str2);
            sb.append(bVar.mo47250a());
            sb.append(str);
            aVar.mo46776a(sb.toString());
        }
        this.f44263b.lock();
        try {
            if (this.f44267f) {
                mo47307a(bVar.mo47313c());
                return;
            }
            this.f44264c.remove(bVar);
            C15290i a = mo47321a(d, true);
            if (z) {
                if (this.f44271i.mo46785d()) {
                    C15089a aVar2 = this.f44271i;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Pooling connection [");
                    sb2.append(d);
                    sb2.append(str2);
                    sb2.append(bVar.mo47250a());
                    sb2.append(str);
                    sb2.append("; keep alive for ");
                    sb2.append(j);
                    sb2.append(C3868i.f12248b);
                    sb2.append(timeUnit.toString());
                    aVar2.mo46776a(sb2.toString());
                }
                a.mo47344c(bVar);
                this.f44274l.add(bVar);
                this.f44265d.mo47262a(bVar.mo47313c(), j, timeUnit);
            } else {
                a.mo47337a();
                this.f44266e--;
            }
            mo47324a(a);
            this.f44263b.unlock();
        } finally {
            this.f44263b.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15282b mo47319a(C15290i iVar, Object obj) {
        this.f44263b.lock();
        boolean z = false;
        C15282b bVar = null;
        while (!z) {
            try {
                bVar = iVar.mo47336a(obj);
                String str = "]";
                String str2 = "][";
                if (bVar != null) {
                    if (this.f44271i.mo46785d()) {
                        C15089a aVar = this.f44271i;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Getting free connection [");
                        sb.append(iVar.mo47346e());
                        sb.append(str2);
                        sb.append(obj);
                        sb.append(str);
                        aVar.mo46776a(sb.toString());
                    }
                    this.f44274l.remove(bVar);
                    if (!this.f44265d.mo47263a((C15323h) bVar.mo47313c())) {
                        if (this.f44271i.mo46785d()) {
                            C15089a aVar2 = this.f44271i;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Closing expired free connection [");
                            sb2.append(iVar.mo47346e());
                            sb2.append(str2);
                            sb2.append(obj);
                            sb2.append(str);
                            aVar2.mo46776a(sb2.toString());
                        }
                        mo47307a(bVar.mo47313c());
                        iVar.mo47337a();
                        this.f44266e--;
                    } else {
                        this.f44264c.add(bVar);
                    }
                } else if (this.f44271i.mo46785d()) {
                    C15089a aVar3 = this.f44271i;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("No free connections [");
                    sb3.append(iVar.mo47346e());
                    sb3.append(str2);
                    sb3.append(obj);
                    sb3.append(str);
                    aVar3.mo46776a(sb3.toString());
                }
                z = true;
            } catch (Throwable th) {
                this.f44263b.unlock();
                throw th;
            }
        }
        this.f44263b.unlock();
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15282b mo47320a(C15290i iVar, C15181e eVar) {
        if (this.f44271i.mo46785d()) {
            C15089a aVar = this.f44271i;
            StringBuilder sb = new StringBuilder();
            sb.append("Creating new connection [");
            sb.append(iVar.mo47346e());
            sb.append("]");
            aVar.mo46776a(sb.toString());
        }
        C15282b bVar = new C15282b(eVar, iVar.mo47346e());
        this.f44263b.lock();
        try {
            iVar.mo47338a(bVar);
            this.f44266e++;
            this.f44264c.add(bVar);
            return bVar;
        } finally {
            this.f44263b.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47323a(C15282b bVar) {
        C15202b d = bVar.mo47314d();
        if (this.f44271i.mo46785d()) {
            C15089a aVar = this.f44271i;
            StringBuilder sb = new StringBuilder();
            sb.append("Deleting connection [");
            sb.append(d);
            sb.append("][");
            sb.append(bVar.mo47250a());
            sb.append("]");
            aVar.mo46776a(sb.toString());
        }
        this.f44263b.lock();
        try {
            mo47307a(bVar.mo47313c());
            C15290i a = mo47321a(d, true);
            a.mo47342b(bVar);
            this.f44266e--;
            if (a.mo47348g()) {
                this.f44276n.remove(d);
            }
            this.f44265d.mo47263a((C15323h) bVar.mo47313c());
        } finally {
            this.f44263b.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47308a(C15202b bVar) {
        this.f44263b.lock();
        try {
            C15290i a = mo47321a(bVar, true);
            a.mo47337a();
            if (a.mo47348g()) {
                this.f44276n.remove(bVar);
            }
            this.f44266e--;
            mo47324a(a);
        } finally {
            this.f44263b.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b A[Catch:{ all -> 0x0074 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo47324a(org.apache.http.p541f0.p542m.p543n.C15290i r4) {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.f44263b
            r0.lock()
            if (r4 == 0) goto L_0x0039
            boolean r0 = r4.mo47347f()     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0039
            org.apache.commons.logging.a r0 = r3.f44271i     // Catch:{ all -> 0x0074 }
            boolean r0 = r0.mo46785d()     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0034
            org.apache.commons.logging.a r0 = r3.f44271i     // Catch:{ all -> 0x0074 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
            r1.<init>()     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "Notifying thread waiting on pool ["
            r1.append(r2)     // Catch:{ all -> 0x0074 }
            org.apache.http.conn.o.b r2 = r4.mo47346e()     // Catch:{ all -> 0x0074 }
            r1.append(r2)     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "]"
            r1.append(r2)     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
            r0.mo46776a(r1)     // Catch:{ all -> 0x0074 }
        L_0x0034:
            org.apache.http.f0.m.n.k r4 = r4.mo47349h()     // Catch:{ all -> 0x0074 }
            goto L_0x0069
        L_0x0039:
            java.util.Queue<org.apache.http.f0.m.n.k> r4 = r3.f44275m     // Catch:{ all -> 0x0074 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0074 }
            if (r4 != 0) goto L_0x0059
            org.apache.commons.logging.a r4 = r3.f44271i     // Catch:{ all -> 0x0074 }
            boolean r4 = r4.mo46785d()     // Catch:{ all -> 0x0074 }
            if (r4 == 0) goto L_0x0050
            org.apache.commons.logging.a r4 = r3.f44271i     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = "Notifying thread waiting on any pool"
            r4.mo46776a(r0)     // Catch:{ all -> 0x0074 }
        L_0x0050:
            java.util.Queue<org.apache.http.f0.m.n.k> r4 = r3.f44275m     // Catch:{ all -> 0x0074 }
            java.lang.Object r4 = r4.remove()     // Catch:{ all -> 0x0074 }
            org.apache.http.f0.m.n.k r4 = (org.apache.http.p541f0.p542m.p543n.C15293k) r4     // Catch:{ all -> 0x0074 }
            goto L_0x0069
        L_0x0059:
            org.apache.commons.logging.a r4 = r3.f44271i     // Catch:{ all -> 0x0074 }
            boolean r4 = r4.mo46785d()     // Catch:{ all -> 0x0074 }
            if (r4 == 0) goto L_0x0068
            org.apache.commons.logging.a r4 = r3.f44271i     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = "Notifying no-one, there are no waiting threads"
            r4.mo46776a(r0)     // Catch:{ all -> 0x0074 }
        L_0x0068:
            r4 = 0
        L_0x0069:
            if (r4 == 0) goto L_0x006e
            r4.mo47360e()     // Catch:{ all -> 0x0074 }
        L_0x006e:
            java.util.concurrent.locks.Lock r4 = r3.f44263b
            r4.unlock()
            return
        L_0x0074:
            r4 = move-exception
            java.util.concurrent.locks.Lock r0 = r3.f44263b
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.p541f0.p542m.p543n.C15285e.mo47324a(org.apache.http.f0.m.n.i):void");
    }
}
