package org.apache.http.p541f0.p542m;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.C15089a;
import org.apache.commons.logging.C15096h;
import org.apache.http.conn.C15179c;
import org.apache.http.conn.C15181e;
import org.apache.http.conn.C15182f;
import org.apache.http.conn.C15187k;
import org.apache.http.conn.p535o.C15202b;
import org.apache.http.conn.p535o.C15208f;
import org.apache.http.conn.p536p.C15213e;
import org.apache.http.p224d0.C6143a;
import org.apache.http.p224d0.C6146d;
import org.apache.http.p548i0.C15357i;

@C6146d
/* renamed from: org.apache.http.f0.m.l */
/* compiled from: SingleClientConnManager */
public class C15276l implements C15179c {

    /* renamed from: j */
    public static final String f44246j = "Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";

    /* renamed from: a */
    private final C15089a f44247a = C15096h.m66940c(C15276l.class);

    /* renamed from: b */
    protected final C15213e f44248b;

    /* renamed from: c */
    protected final C15181e f44249c;

    /* renamed from: d */
    protected final boolean f44250d;
    @C6143a("this")

    /* renamed from: e */
    protected C15279c f44251e;
    @C6143a("this")

    /* renamed from: f */
    protected C15278b f44252f;
    @C6143a("this")

    /* renamed from: g */
    protected long f44253g;
    @C6143a("this")

    /* renamed from: h */
    protected long f44254h;

    /* renamed from: i */
    protected volatile boolean f44255i;

    /* renamed from: org.apache.http.f0.m.l$a */
    /* compiled from: SingleClientConnManager */
    class C15277a implements C15182f {

        /* renamed from: a */
        final /* synthetic */ C15202b f44256a;

        /* renamed from: b */
        final /* synthetic */ Object f44257b;

        C15277a(C15202b bVar, Object obj) {
            this.f44256a = bVar;
            this.f44257b = obj;
        }

        /* renamed from: a */
        public C15187k mo46997a(long j, TimeUnit timeUnit) {
            return C15276l.this.mo47285b(this.f44256a, this.f44257b);
        }

        /* renamed from: a */
        public void mo46998a() {
        }
    }

    /* renamed from: org.apache.http.f0.m.l$b */
    /* compiled from: SingleClientConnManager */
    protected class C15278b extends C15265c {
        protected C15278b(C15279c cVar, C15202b bVar) {
            super(C15276l.this, cVar);
            mo47018g();
            cVar.f44218c = bVar;
        }
    }

    /* renamed from: org.apache.http.f0.m.l$c */
    /* compiled from: SingleClientConnManager */
    protected class C15279c extends C15264b {
        protected C15279c() {
            super(C15276l.this.f44249c, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo47289c() throws IOException {
            mo47256b();
            if (this.f44217b.isOpen()) {
                this.f44217b.close();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo47290d() throws IOException {
            mo47256b();
            if (this.f44217b.isOpen()) {
                this.f44217b.shutdown();
            }
        }
    }

    public C15276l(C15357i iVar, C15213e eVar) {
        if (eVar != null) {
            this.f44248b = eVar;
            this.f44249c = mo47284a(eVar);
            this.f44251e = new C15279c();
            this.f44252f = null;
            this.f44253g = -1;
            this.f44250d = false;
            this.f44255i = false;
            return;
        }
        throw new IllegalArgumentException("Scheme registry must not be null.");
    }

    /* renamed from: a */
    public C15213e mo46988a() {
        return this.f44248b;
    }

    /* renamed from: b */
    public synchronized C15187k mo47285b(C15202b bVar, Object obj) {
        boolean z;
        if (bVar != null) {
            try {
                mo47286c();
                if (this.f44247a.mo46785d()) {
                    C15089a aVar = this.f44247a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Get connection for route ");
                    sb.append(bVar);
                    aVar.mo46776a(sb.toString());
                }
                if (this.f44252f == null) {
                    mo46991b();
                    boolean z2 = true;
                    boolean z3 = false;
                    if (this.f44251e.f44217b.isOpen()) {
                        C15208f fVar = this.f44251e.f44220e;
                        z = fVar == null || !fVar.mo47071k().equals(bVar);
                    } else {
                        z = false;
                        z3 = true;
                    }
                    if (z) {
                        this.f44251e.mo47290d();
                    } else {
                        z2 = z3;
                    }
                    if (z2) {
                        this.f44251e = new C15279c();
                    }
                    this.f44252f = new C15278b(this.f44251e, bVar);
                } else {
                    throw new IllegalStateException(f44246j);
                }
            } catch (IOException e) {
                this.f44247a.mo46777a("Problem shutting down connection.", e);
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Route may not be null.");
        }
        return this.f44252f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo47286c() throws IllegalStateException {
        if (this.f44255i) {
            throw new IllegalStateException("Manager is shut down.");
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: d */
    public synchronized void mo47287d() {
        if (this.f44252f != null) {
            this.f44252f.mo47247c();
            try {
                this.f44251e.mo47290d();
            } catch (IOException e) {
                this.f44247a.mo46777a("Problem while shutting down connection.", e);
            }
        } else {
            return;
        }
        return;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    public synchronized void shutdown() {
        this.f44255i = true;
        if (this.f44252f != null) {
            this.f44252f.mo47247c();
        }
        try {
            if (this.f44251e != null) {
                this.f44251e.mo47290d();
            }
        } catch (IOException e) {
            try {
                this.f44247a.mo46777a("Problem while shutting down manager.", e);
            } catch (Throwable th) {
                this.f44251e = null;
                throw th;
            }
        }
        this.f44251e = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15181e mo47284a(C15213e eVar) {
        return new C15267e(eVar);
    }

    /* renamed from: a */
    public final C15182f mo46987a(C15202b bVar, Object obj) {
        return new C15277a(bVar, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ae, code lost:
        return;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x0097=Splitter:B:42:0x0097, B:30:0x0069=Splitter:B:30:0x0069} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo46990a(org.apache.http.conn.C15187k r9, long r10, java.util.concurrent.TimeUnit r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.mo47286c()     // Catch:{ all -> 0x00d3 }
            boolean r0 = r9 instanceof org.apache.http.p541f0.p542m.C15276l.C15278b     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x00cb
            org.apache.commons.logging.a r0 = r8.f44247a     // Catch:{ all -> 0x00d3 }
            boolean r0 = r0.mo46785d()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x0026
            org.apache.commons.logging.a r0 = r8.f44247a     // Catch:{ all -> 0x00d3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d3 }
            r1.<init>()     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = "Releasing connection "
            r1.append(r2)     // Catch:{ all -> 0x00d3 }
            r1.append(r9)     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00d3 }
            r0.mo46776a(r1)     // Catch:{ all -> 0x00d3 }
        L_0x0026:
            org.apache.http.f0.m.l$b r9 = (org.apache.http.p541f0.p542m.C15276l.C15278b) r9     // Catch:{ all -> 0x00d3 }
            org.apache.http.f0.m.b r0 = r9.f44221Q     // Catch:{ all -> 0x00d3 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r8)
            return
        L_0x002e:
            org.apache.http.conn.c r0 = r9.mo47248j()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x003f
            if (r0 != r8) goto L_0x0037
            goto L_0x003f
        L_0x0037:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d3 }
            java.lang.String r10 = "Connection not obtained from this manager."
            r9.<init>(r10)     // Catch:{ all -> 0x00d3 }
            throw r9     // Catch:{ all -> 0x00d3 }
        L_0x003f:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 0
            r4 = 0
            boolean r5 = r9.isOpen()     // Catch:{ IOException -> 0x0087 }
            if (r5 == 0) goto L_0x0069
            boolean r5 = r8.f44250d     // Catch:{ IOException -> 0x0087 }
            if (r5 != 0) goto L_0x0057
            boolean r5 = r9.mo47016e()     // Catch:{ IOException -> 0x0087 }
            if (r5 != 0) goto L_0x0069
        L_0x0057:
            org.apache.commons.logging.a r5 = r8.f44247a     // Catch:{ IOException -> 0x0087 }
            boolean r5 = r5.mo46785d()     // Catch:{ IOException -> 0x0087 }
            if (r5 == 0) goto L_0x0066
            org.apache.commons.logging.a r5 = r8.f44247a     // Catch:{ IOException -> 0x0087 }
            java.lang.String r6 = "Released connection open but not reusable."
            r5.mo46776a(r6)     // Catch:{ IOException -> 0x0087 }
        L_0x0066:
            r9.shutdown()     // Catch:{ IOException -> 0x0087 }
        L_0x0069:
            r9.mo47247c()     // Catch:{ all -> 0x00d3 }
            r8.f44252f = r4     // Catch:{ all -> 0x00d3 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d3 }
            r8.f44253g = r4     // Catch:{ all -> 0x00d3 }
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x0082
            long r9 = r12.toMillis(r10)     // Catch:{ all -> 0x00d3 }
            long r11 = r8.f44253g     // Catch:{ all -> 0x00d3 }
        L_0x007e:
            long r9 = r9 + r11
            r8.f44254h = r9     // Catch:{ all -> 0x00d3 }
            goto L_0x00ad
        L_0x0082:
            r8.f44254h = r0     // Catch:{ all -> 0x00d3 }
            goto L_0x00ad
        L_0x0085:
            r5 = move-exception
            goto L_0x00af
        L_0x0087:
            r5 = move-exception
            org.apache.commons.logging.a r6 = r8.f44247a     // Catch:{ all -> 0x0085 }
            boolean r6 = r6.mo46785d()     // Catch:{ all -> 0x0085 }
            if (r6 == 0) goto L_0x0097
            org.apache.commons.logging.a r6 = r8.f44247a     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = "Exception shutting down released connection."
            r6.mo46777a(r7, r5)     // Catch:{ all -> 0x0085 }
        L_0x0097:
            r9.mo47247c()     // Catch:{ all -> 0x00d3 }
            r8.f44252f = r4     // Catch:{ all -> 0x00d3 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d3 }
            r8.f44253g = r4     // Catch:{ all -> 0x00d3 }
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x0082
            long r9 = r12.toMillis(r10)     // Catch:{ all -> 0x00d3 }
            long r11 = r8.f44253g     // Catch:{ all -> 0x00d3 }
            goto L_0x007e
        L_0x00ad:
            monitor-exit(r8)
            return
        L_0x00af:
            r9.mo47247c()     // Catch:{ all -> 0x00d3 }
            r8.f44252f = r4     // Catch:{ all -> 0x00d3 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d3 }
            r8.f44253g = r6     // Catch:{ all -> 0x00d3 }
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c8
            long r9 = r12.toMillis(r10)     // Catch:{ all -> 0x00d3 }
            long r11 = r8.f44253g     // Catch:{ all -> 0x00d3 }
            long r9 = r9 + r11
            r8.f44254h = r9     // Catch:{ all -> 0x00d3 }
            goto L_0x00ca
        L_0x00c8:
            r8.f44254h = r0     // Catch:{ all -> 0x00d3 }
        L_0x00ca:
            throw r5     // Catch:{ all -> 0x00d3 }
        L_0x00cb:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d3 }
            java.lang.String r10 = "Connection class mismatch, connection not obtained from this manager."
            r9.<init>(r10)     // Catch:{ all -> 0x00d3 }
            throw r9     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x00d7
        L_0x00d6:
            throw r9
        L_0x00d7:
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.p541f0.p542m.C15276l.mo46990a(org.apache.http.conn.k, long, java.util.concurrent.TimeUnit):void");
    }

    /* renamed from: b */
    public synchronized void mo46991b() {
        if (System.currentTimeMillis() >= this.f44254h) {
            mo46989a(0, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public synchronized void mo46989a(long j, TimeUnit timeUnit) {
        mo47286c();
        if (timeUnit == null) {
            throw new IllegalArgumentException("Time unit must not be null.");
        } else if (this.f44252f == null && this.f44251e.f44217b.isOpen()) {
            if (this.f44253g <= System.currentTimeMillis() - timeUnit.toMillis(j)) {
                try {
                    this.f44251e.mo47289c();
                } catch (IOException e) {
                    this.f44247a.mo46777a("Problem closing idle connection.", e);
                }
            }
        }
        return;
    }
}
