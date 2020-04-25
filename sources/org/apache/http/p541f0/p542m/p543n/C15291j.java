package org.apache.http.p541f0.p542m.p543n;

import com.fasterxml.jackson.core.p162w.C3868i;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.C15089a;
import org.apache.commons.logging.C15096h;
import org.apache.http.conn.C15179c;
import org.apache.http.conn.C15181e;
import org.apache.http.conn.C15182f;
import org.apache.http.conn.C15187k;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.p535o.C15202b;
import org.apache.http.conn.p536p.C15213e;
import org.apache.http.p541f0.p542m.C15267e;
import org.apache.http.p548i0.C15357i;

/* renamed from: org.apache.http.f0.m.n.j */
/* compiled from: ThreadSafeClientConnManager */
public class C15291j implements C15179c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C15089a f44290a = C15096h.m66940c(C15291j.class);

    /* renamed from: b */
    protected final C15213e f44291b;

    /* renamed from: c */
    protected final C15281a f44292c;

    /* renamed from: d */
    protected final C15181e f44293d;

    /* renamed from: org.apache.http.f0.m.n.j$a */
    /* compiled from: ThreadSafeClientConnManager */
    class C15292a implements C15182f {

        /* renamed from: a */
        final /* synthetic */ C15287f f44294a;

        /* renamed from: b */
        final /* synthetic */ C15202b f44295b;

        C15292a(C15287f fVar, C15202b bVar) {
            this.f44294a = fVar;
            this.f44295b = bVar;
        }

        /* renamed from: a */
        public void mo46998a() {
            this.f44294a.mo47332a();
        }

        /* renamed from: a */
        public C15187k mo46997a(long j, TimeUnit timeUnit) throws InterruptedException, ConnectionPoolTimeoutException {
            if (this.f44295b != null) {
                if (C15291j.this.f44290a.mo46785d()) {
                    C15089a a = C15291j.this.f44290a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("ThreadSafeClientConnManager.getConnection: ");
                    sb.append(this.f44295b);
                    sb.append(", timeout = ");
                    sb.append(j);
                    a.mo46776a(sb.toString());
                }
                return new C15284d(C15291j.this, this.f44294a.mo47331a(j, timeUnit));
            }
            throw new IllegalArgumentException("Route may not be null.");
        }
    }

    public C15291j(C15357i iVar, C15213e eVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else if (eVar != null) {
            this.f44291b = eVar;
            this.f44293d = mo47351a(eVar);
            this.f44292c = mo47352a(iVar);
        } else {
            throw new IllegalArgumentException("Scheme registry may not be null");
        }
    }

    /* renamed from: b */
    public void mo46991b() {
        this.f44290a.mo46776a("Closing expired connections");
        this.f44292c.mo47304a();
        this.f44292c.mo47310b();
    }

    /* renamed from: c */
    public int mo47353c() {
        this.f44292c.f44263b.lock();
        C15281a aVar = this.f44292c;
        int i = aVar.f44266e;
        aVar.f44263b.unlock();
        return i;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    public void shutdown() {
        this.f44290a.mo46776a("Shutting down");
        this.f44292c.mo47312d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15281a mo47352a(C15357i iVar) {
        return new C15285e(this.f44293d, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15181e mo47351a(C15213e eVar) {
        return new C15267e(eVar);
    }

    /* renamed from: a */
    public C15213e mo46988a() {
        return this.f44291b;
    }

    /* renamed from: a */
    public C15182f mo46987a(C15202b bVar, Object obj) {
        return new C15292a(this.f44292c.mo47303a(bVar, obj), bVar);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x0070=Splitter:B:34:0x0070, B:20:0x0036=Splitter:B:20:0x0036} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo46990a(org.apache.http.conn.C15187k r8, long r9, java.util.concurrent.TimeUnit r11) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof org.apache.http.p541f0.p542m.p543n.C15284d
            if (r0 == 0) goto L_0x00c0
            org.apache.http.f0.m.n.d r8 = (org.apache.http.p541f0.p542m.p543n.C15284d) r8
            org.apache.http.f0.m.b r0 = r8.mo47317m()
            if (r0 == 0) goto L_0x001b
            org.apache.http.conn.c r0 = r8.mo47248j()
            if (r0 != r7) goto L_0x0013
            goto L_0x001b
        L_0x0013:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Connection not obtained from this manager."
            r8.<init>(r9)
            throw r8
        L_0x001b:
            monitor-enter(r8)
            org.apache.http.f0.m.b r0 = r8.mo47317m()     // Catch:{ all -> 0x00bd }
            r2 = r0
            org.apache.http.f0.m.n.b r2 = (org.apache.http.p541f0.p542m.p543n.C15282b) r2     // Catch:{ all -> 0x00bd }
            if (r2 != 0) goto L_0x0027
            monitor-exit(r8)     // Catch:{ all -> 0x00bd }
            return
        L_0x0027:
            boolean r0 = r8.isOpen()     // Catch:{ IOException -> 0x0060 }
            if (r0 == 0) goto L_0x0036
            boolean r0 = r8.mo47016e()     // Catch:{ IOException -> 0x0060 }
            if (r0 != 0) goto L_0x0036
            r8.shutdown()     // Catch:{ IOException -> 0x0060 }
        L_0x0036:
            boolean r3 = r8.mo47016e()     // Catch:{ all -> 0x00bd }
            org.apache.commons.logging.a r0 = r7.f44290a     // Catch:{ all -> 0x00bd }
            boolean r0 = r0.mo46785d()     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0053
            if (r3 == 0) goto L_0x004c
            org.apache.commons.logging.a r0 = r7.f44290a     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = "Released connection is reusable."
            r0.mo46776a(r1)     // Catch:{ all -> 0x00bd }
            goto L_0x0053
        L_0x004c:
            org.apache.commons.logging.a r0 = r7.f44290a     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = "Released connection is not reusable."
            r0.mo46776a(r1)     // Catch:{ all -> 0x00bd }
        L_0x0053:
            r8.mo47247c()     // Catch:{ all -> 0x00bd }
            org.apache.http.f0.m.n.a r1 = r7.f44292c     // Catch:{ all -> 0x00bd }
        L_0x0058:
            r4 = r9
            r6 = r11
            r1.mo47309a(r2, r3, r4, r6)     // Catch:{ all -> 0x00bd }
            goto L_0x0093
        L_0x005e:
            r0 = move-exception
            goto L_0x0095
        L_0x0060:
            r0 = move-exception
            org.apache.commons.logging.a r1 = r7.f44290a     // Catch:{ all -> 0x005e }
            boolean r1 = r1.mo46785d()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0070
            org.apache.commons.logging.a r1 = r7.f44290a     // Catch:{ all -> 0x005e }
            java.lang.String r3 = "Exception shutting down released connection."
            r1.mo46777a(r3, r0)     // Catch:{ all -> 0x005e }
        L_0x0070:
            boolean r3 = r8.mo47016e()     // Catch:{ all -> 0x00bd }
            org.apache.commons.logging.a r0 = r7.f44290a     // Catch:{ all -> 0x00bd }
            boolean r0 = r0.mo46785d()     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x008d
            if (r3 == 0) goto L_0x0086
            org.apache.commons.logging.a r0 = r7.f44290a     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = "Released connection is reusable."
            r0.mo46776a(r1)     // Catch:{ all -> 0x00bd }
            goto L_0x008d
        L_0x0086:
            org.apache.commons.logging.a r0 = r7.f44290a     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = "Released connection is not reusable."
            r0.mo46776a(r1)     // Catch:{ all -> 0x00bd }
        L_0x008d:
            r8.mo47247c()     // Catch:{ all -> 0x00bd }
            org.apache.http.f0.m.n.a r1 = r7.f44292c     // Catch:{ all -> 0x00bd }
            goto L_0x0058
        L_0x0093:
            monitor-exit(r8)     // Catch:{ all -> 0x00bd }
            return
        L_0x0095:
            boolean r3 = r8.mo47016e()     // Catch:{ all -> 0x00bd }
            org.apache.commons.logging.a r1 = r7.f44290a     // Catch:{ all -> 0x00bd }
            boolean r1 = r1.mo46785d()     // Catch:{ all -> 0x00bd }
            if (r1 == 0) goto L_0x00b2
            if (r3 == 0) goto L_0x00ab
            org.apache.commons.logging.a r1 = r7.f44290a     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = "Released connection is reusable."
            r1.mo46776a(r4)     // Catch:{ all -> 0x00bd }
            goto L_0x00b2
        L_0x00ab:
            org.apache.commons.logging.a r1 = r7.f44290a     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = "Released connection is not reusable."
            r1.mo46776a(r4)     // Catch:{ all -> 0x00bd }
        L_0x00b2:
            r8.mo47247c()     // Catch:{ all -> 0x00bd }
            org.apache.http.f0.m.n.a r1 = r7.f44292c     // Catch:{ all -> 0x00bd }
            r4 = r9
            r6 = r11
            r1.mo47309a(r2, r3, r4, r6)     // Catch:{ all -> 0x00bd }
            throw r0     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00bd }
            throw r9
        L_0x00c0:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Connection class mismatch, connection not obtained from this manager."
            r8.<init>(r9)
            goto L_0x00c9
        L_0x00c8:
            throw r8
        L_0x00c9:
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.p541f0.p542m.p543n.C15291j.mo46990a(org.apache.http.conn.k, long, java.util.concurrent.TimeUnit):void");
    }

    /* renamed from: a */
    public int mo47350a(C15202b bVar) {
        return ((C15285e) this.f44292c).mo47325b(bVar);
    }

    /* renamed from: a */
    public void mo46989a(long j, TimeUnit timeUnit) {
        if (this.f44290a.mo46785d()) {
            C15089a aVar = this.f44290a;
            StringBuilder sb = new StringBuilder();
            sb.append("Closing connections idle for ");
            sb.append(j);
            sb.append(C3868i.f12248b);
            sb.append(timeUnit);
            aVar.mo46776a(sb.toString());
        }
        this.f44292c.mo47305a(j, timeUnit);
        this.f44292c.mo47310b();
    }
}
