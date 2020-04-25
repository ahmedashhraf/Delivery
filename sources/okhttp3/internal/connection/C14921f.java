package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import okhttp3.internal.C14910b;
import okhttp3.internal.Internal;
import okhttp3.internal.connection.C14919e.C14920a;
import okhttp3.internal.http2.C14963a;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.p516g.C14944c;
import p468g.C13798a;
import p468g.C13821e;
import p468g.C13832g0;
import p468g.C13839j;
import p468g.C13841k;
import p468g.C13859r;
import p468g.C13870w.C13871a;
import p468g.C13876z;

/* renamed from: okhttp3.internal.connection.f */
/* compiled from: StreamAllocation */
public final class C14921f {

    /* renamed from: o */
    static final /* synthetic */ boolean f43215o = false;

    /* renamed from: a */
    public final C13798a f43216a;

    /* renamed from: b */
    private C14920a f43217b;

    /* renamed from: c */
    private C13832g0 f43218c;

    /* renamed from: d */
    private final C13841k f43219d;

    /* renamed from: e */
    public final C13821e f43220e;

    /* renamed from: f */
    public final C13859r f43221f;

    /* renamed from: g */
    private final Object f43222g;

    /* renamed from: h */
    private final C14919e f43223h;

    /* renamed from: i */
    private int f43224i;

    /* renamed from: j */
    private C14916c f43225j;

    /* renamed from: k */
    private boolean f43226k;

    /* renamed from: l */
    private boolean f43227l;

    /* renamed from: m */
    private boolean f43228m;

    /* renamed from: n */
    private C14944c f43229n;

    /* renamed from: okhttp3.internal.connection.f$a */
    /* compiled from: StreamAllocation */
    public static final class C14922a extends WeakReference<C14921f> {

        /* renamed from: a */
        public final Object f43230a;

        C14922a(C14921f fVar, Object obj) {
            super(fVar);
            this.f43230a = obj;
        }
    }

    public C14921f(C13841k kVar, C13798a aVar, C13821e eVar, C13859r rVar, Object obj) {
        this.f43219d = kVar;
        this.f43216a = aVar;
        this.f43220e = eVar;
        this.f43221f = rVar;
        this.f43223h = new C14919e(aVar, m66124i(), eVar, rVar);
        this.f43222g = obj;
    }

    /* renamed from: h */
    private Socket m66123h() {
        C14916c cVar = this.f43225j;
        if (cVar == null || !cVar.f43197k) {
            return null;
        }
        return m66119a(false, false, true);
    }

    /* renamed from: i */
    private C14918d m66124i() {
        return Internal.instance.routeDatabase(this.f43219d);
    }

    /* renamed from: a */
    public C14944c mo46397a(C13876z zVar, C13871a aVar, boolean z) {
        try {
            C14944c a = m66121a(aVar.mo43705d(), aVar.mo43697a(), aVar.mo43700b(), zVar.mo43749t(), zVar.mo43755z(), z).mo46375a(zVar, aVar, this);
            synchronized (this.f43219d) {
                this.f43229n = a;
            }
            return a;
        } catch (IOException e) {
            throw new RouteException(e);
        }
    }

    /* renamed from: b */
    public C14944c mo46402b() {
        C14944c cVar;
        synchronized (this.f43219d) {
            cVar = this.f43229n;
        }
        return cVar;
    }

    /* renamed from: c */
    public synchronized C14916c mo46403c() {
        return this.f43225j;
    }

    /* renamed from: d */
    public boolean mo46404d() {
        if (this.f43218c == null) {
            C14920a aVar = this.f43217b;
            if ((aVar == null || !aVar.mo46394b()) && !this.f43223h.mo46391a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public void mo46405e() {
        C14916c cVar;
        Socket a;
        synchronized (this.f43219d) {
            cVar = this.f43225j;
            a = m66119a(true, false, false);
            if (this.f43225j != null) {
                cVar = null;
            }
        }
        C14910b.m66058a(a);
        if (cVar != null) {
            this.f43221f.mo43587b(this.f43220e, (C13839j) cVar);
        }
    }

    /* renamed from: f */
    public void mo46406f() {
        C14916c cVar;
        Socket a;
        synchronized (this.f43219d) {
            cVar = this.f43225j;
            a = m66119a(false, true, false);
            if (this.f43225j != null) {
                cVar = null;
            }
        }
        C14910b.m66058a(a);
        if (cVar != null) {
            Internal.instance.timeoutExit(this.f43220e, null);
            this.f43221f.mo43587b(this.f43220e, (C13839j) cVar);
            this.f43221f.mo43573a(this.f43220e);
        }
    }

    /* renamed from: g */
    public C13832g0 mo46407g() {
        return this.f43218c;
    }

    public String toString() {
        C14916c c = mo46403c();
        return c != null ? c.toString() : this.f43216a.toString();
    }

    /* renamed from: b */
    private void m66122b(C14916c cVar) {
        int size = cVar.f43200n.size();
        for (int i = 0; i < size; i++) {
            if (((Reference) cVar.f43200n.get(i)).get() == this) {
                cVar.f43200n.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.mo46382a(r9) != false) goto L_0x0018;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.internal.connection.C14916c m66121a(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            okhttp3.internal.connection.c r0 = r3.m66120a(r4, r5, r6, r7, r8)
            g.k r1 = r3.f43219d
            monitor-enter(r1)
            int r2 = r0.f43198l     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            boolean r1 = r0.mo46382a(r9)
            if (r1 != 0) goto L_0x0018
            r3.mo46405e()
            goto L_0x0000
        L_0x0018:
            return r0
        L_0x0019:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001d
        L_0x001c:
            throw r4
        L_0x001d:
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C14921f.m66121a(int, int, int, int, boolean, boolean):okhttp3.internal.connection.c");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0079 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00cb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.internal.connection.C14916c m66120a(int r19, int r20, int r21, int r22, boolean r23) throws java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            g.k r2 = r1.f43219d
            monitor-enter(r2)
            boolean r0 = r1.f43227l     // Catch:{ all -> 0x013c }
            if (r0 != 0) goto L_0x0134
            okhttp3.internal.g.c r0 = r1.f43229n     // Catch:{ all -> 0x013c }
            if (r0 != 0) goto L_0x012c
            boolean r0 = r1.f43228m     // Catch:{ all -> 0x013c }
            if (r0 != 0) goto L_0x0124
            okhttp3.internal.connection.c r0 = r1.f43225j     // Catch:{ all -> 0x013c }
            java.net.Socket r3 = r18.m66123h()     // Catch:{ all -> 0x013c }
            okhttp3.internal.connection.c r4 = r1.f43225j     // Catch:{ all -> 0x013c }
            r5 = 0
            if (r4 == 0) goto L_0x0020
            okhttp3.internal.connection.c r0 = r1.f43225j     // Catch:{ all -> 0x013c }
            r4 = r5
            goto L_0x0022
        L_0x0020:
            r4 = r0
            r0 = r5
        L_0x0022:
            boolean r6 = r1.f43226k     // Catch:{ all -> 0x013c }
            if (r6 != 0) goto L_0x0027
            r4 = r5
        L_0x0027:
            r6 = 1
            r7 = 0
            if (r0 != 0) goto L_0x0043
            okhttp3.internal.Internal r8 = okhttp3.internal.Internal.instance     // Catch:{ all -> 0x013c }
            g.k r9 = r1.f43219d     // Catch:{ all -> 0x013c }
            g.a r10 = r1.f43216a     // Catch:{ all -> 0x013c }
            r8.get(r9, r10, r1, r5)     // Catch:{ all -> 0x013c }
            okhttp3.internal.connection.c r8 = r1.f43225j     // Catch:{ all -> 0x013c }
            if (r8 == 0) goto L_0x003e
            okhttp3.internal.connection.c r0 = r1.f43225j     // Catch:{ all -> 0x013c }
            r8 = r0
            r9 = r5
            r0 = 1
            goto L_0x0046
        L_0x003e:
            g.g0 r8 = r1.f43218c     // Catch:{ all -> 0x013c }
            r9 = r8
            r8 = r0
            goto L_0x0045
        L_0x0043:
            r8 = r0
            r9 = r5
        L_0x0045:
            r0 = 0
        L_0x0046:
            monitor-exit(r2)     // Catch:{ all -> 0x013c }
            okhttp3.internal.C14910b.m66058a(r3)
            if (r4 == 0) goto L_0x0053
            g.r r2 = r1.f43221f
            g.e r3 = r1.f43220e
            r2.mo43587b(r3, r4)
        L_0x0053:
            if (r0 == 0) goto L_0x005c
            g.r r2 = r1.f43221f
            g.e r3 = r1.f43220e
            r2.mo43577a(r3, r8)
        L_0x005c:
            if (r8 == 0) goto L_0x005f
            return r8
        L_0x005f:
            if (r9 != 0) goto L_0x0075
            okhttp3.internal.connection.e$a r2 = r1.f43217b
            if (r2 == 0) goto L_0x006b
            boolean r2 = r2.mo46394b()
            if (r2 != 0) goto L_0x0075
        L_0x006b:
            okhttp3.internal.connection.e r2 = r1.f43223h
            okhttp3.internal.connection.e$a r2 = r2.mo46392b()
            r1.f43217b = r2
            r2 = 1
            goto L_0x0076
        L_0x0075:
            r2 = 0
        L_0x0076:
            g.k r3 = r1.f43219d
            monitor-enter(r3)
            boolean r4 = r1.f43228m     // Catch:{ all -> 0x0121 }
            if (r4 != 0) goto L_0x0119
            if (r2 == 0) goto L_0x00a8
            okhttp3.internal.connection.e$a r2 = r1.f43217b     // Catch:{ all -> 0x0121 }
            java.util.List r2 = r2.mo46393a()     // Catch:{ all -> 0x0121 }
            int r4 = r2.size()     // Catch:{ all -> 0x0121 }
            r10 = 0
        L_0x008a:
            if (r10 >= r4) goto L_0x00a8
            java.lang.Object r11 = r2.get(r10)     // Catch:{ all -> 0x0121 }
            g.g0 r11 = (p468g.C13832g0) r11     // Catch:{ all -> 0x0121 }
            okhttp3.internal.Internal r12 = okhttp3.internal.Internal.instance     // Catch:{ all -> 0x0121 }
            g.k r13 = r1.f43219d     // Catch:{ all -> 0x0121 }
            g.a r14 = r1.f43216a     // Catch:{ all -> 0x0121 }
            r12.get(r13, r14, r1, r11)     // Catch:{ all -> 0x0121 }
            okhttp3.internal.connection.c r12 = r1.f43225j     // Catch:{ all -> 0x0121 }
            if (r12 == 0) goto L_0x00a5
            okhttp3.internal.connection.c r8 = r1.f43225j     // Catch:{ all -> 0x0121 }
            r1.f43218c = r11     // Catch:{ all -> 0x0121 }
            r0 = 1
            goto L_0x00a8
        L_0x00a5:
            int r10 = r10 + 1
            goto L_0x008a
        L_0x00a8:
            if (r0 != 0) goto L_0x00c0
            if (r9 != 0) goto L_0x00b2
            okhttp3.internal.connection.e$a r2 = r1.f43217b     // Catch:{ all -> 0x0121 }
            g.g0 r9 = r2.mo46395c()     // Catch:{ all -> 0x0121 }
        L_0x00b2:
            r1.f43218c = r9     // Catch:{ all -> 0x0121 }
            r1.f43224i = r7     // Catch:{ all -> 0x0121 }
            okhttp3.internal.connection.c r8 = new okhttp3.internal.connection.c     // Catch:{ all -> 0x0121 }
            g.k r2 = r1.f43219d     // Catch:{ all -> 0x0121 }
            r8.<init>(r2, r9)     // Catch:{ all -> 0x0121 }
            r1.mo46400a(r8, r7)     // Catch:{ all -> 0x0121 }
        L_0x00c0:
            monitor-exit(r3)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00cb
            g.r r0 = r1.f43221f
            g.e r2 = r1.f43220e
            r0.mo43577a(r2, r8)
            return r8
        L_0x00cb:
            g.e r0 = r1.f43220e
            g.r r2 = r1.f43221f
            r10 = r8
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r15 = r23
            r16 = r0
            r17 = r2
            r10.mo46377a(r11, r12, r13, r14, r15, r16, r17)
            okhttp3.internal.connection.d r0 = r18.m66124i()
            g.g0 r2 = r8.mo43494b()
            r0.mo46387a(r2)
            g.k r2 = r1.f43219d
            monitor-enter(r2)
            r1.f43226k = r6     // Catch:{ all -> 0x0116 }
            okhttp3.internal.Internal r0 = okhttp3.internal.Internal.instance     // Catch:{ all -> 0x0116 }
            g.k r3 = r1.f43219d     // Catch:{ all -> 0x0116 }
            r0.put(r3, r8)     // Catch:{ all -> 0x0116 }
            boolean r0 = r8.mo46384f()     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x010a
            okhttp3.internal.Internal r0 = okhttp3.internal.Internal.instance     // Catch:{ all -> 0x0116 }
            g.k r3 = r1.f43219d     // Catch:{ all -> 0x0116 }
            g.a r4 = r1.f43216a     // Catch:{ all -> 0x0116 }
            java.net.Socket r5 = r0.deduplicate(r3, r4, r1)     // Catch:{ all -> 0x0116 }
            okhttp3.internal.connection.c r8 = r1.f43225j     // Catch:{ all -> 0x0116 }
        L_0x010a:
            monitor-exit(r2)     // Catch:{ all -> 0x0116 }
            okhttp3.internal.C14910b.m66058a(r5)
            g.r r0 = r1.f43221f
            g.e r2 = r1.f43220e
            r0.mo43577a(r2, r8)
            return r8
        L_0x0116:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0116 }
            throw r0
        L_0x0119:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch:{ all -> 0x0121 }
            throw r0     // Catch:{ all -> 0x0121 }
        L_0x0121:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0121 }
            throw r0
        L_0x0124:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x013c }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x013c }
            throw r0     // Catch:{ all -> 0x013c }
        L_0x012c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x013c }
            java.lang.String r3 = "codec != null"
            r0.<init>(r3)     // Catch:{ all -> 0x013c }
            throw r0     // Catch:{ all -> 0x013c }
        L_0x0134:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x013c }
            java.lang.String r3 = "released"
            r0.<init>(r3)     // Catch:{ all -> 0x013c }
            throw r0     // Catch:{ all -> 0x013c }
        L_0x013c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x013c }
            goto L_0x0140
        L_0x013f:
            throw r0
        L_0x0140:
            goto L_0x013f
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C14921f.m66120a(int, int, int, int, boolean):okhttp3.internal.connection.c");
    }

    /* renamed from: a */
    public void mo46401a(boolean z, C14944c cVar, long j, IOException iOException) {
        C14916c cVar2;
        Socket a;
        boolean z2;
        this.f43221f.mo43586b(this.f43220e, j);
        synchronized (this.f43219d) {
            if (cVar != null) {
                if (cVar == this.f43229n) {
                    if (!z) {
                        this.f43225j.f43198l++;
                    }
                    cVar2 = this.f43225j;
                    a = m66119a(z, false, true);
                    if (this.f43225j != null) {
                        cVar2 = null;
                    }
                    z2 = this.f43227l;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("expected ");
            sb.append(this.f43229n);
            sb.append(" but was ");
            sb.append(cVar);
            throw new IllegalStateException(sb.toString());
        }
        C14910b.m66058a(a);
        if (cVar2 != null) {
            this.f43221f.mo43587b(this.f43220e, (C13839j) cVar2);
        }
        if (iOException != null) {
            this.f43221f.mo43579a(this.f43220e, Internal.instance.timeoutExit(this.f43220e, iOException));
        } else if (z2) {
            Internal.instance.timeoutExit(this.f43220e, null);
            this.f43221f.mo43573a(this.f43220e);
        }
    }

    /* renamed from: a */
    private Socket m66119a(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.f43229n = null;
        }
        if (z2) {
            this.f43227l = true;
        }
        C14916c cVar = this.f43225j;
        if (cVar != null) {
            if (z) {
                cVar.f43197k = true;
            }
            if (this.f43229n == null && (this.f43227l || this.f43225j.f43197k)) {
                m66122b(this.f43225j);
                if (this.f43225j.f43200n.isEmpty()) {
                    this.f43225j.f43201o = System.nanoTime();
                    if (Internal.instance.connectionBecameIdle(this.f43219d, this.f43225j)) {
                        socket = this.f43225j.mo43496d();
                        this.f43225j = null;
                        return socket;
                    }
                }
                socket = null;
                this.f43225j = null;
                return socket;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo46398a() {
        C14944c cVar;
        C14916c cVar2;
        synchronized (this.f43219d) {
            this.f43228m = true;
            cVar = this.f43229n;
            cVar2 = this.f43225j;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (cVar2 != null) {
            cVar2.mo46383e();
        }
    }

    /* renamed from: a */
    public void mo46399a(IOException iOException) {
        boolean z;
        C14916c cVar;
        Socket a;
        synchronized (this.f43219d) {
            if (iOException instanceof StreamResetException) {
                C14963a aVar = ((StreamResetException) iOException).f43400a;
                if (aVar == C14963a.REFUSED_STREAM) {
                    this.f43224i++;
                    if (this.f43224i > 1) {
                        this.f43218c = null;
                    }
                    z = false;
                    cVar = this.f43225j;
                    a = m66119a(z, false, true);
                    if (this.f43225j != null || !this.f43226k) {
                        cVar = null;
                    }
                } else {
                    if (aVar != C14963a.CANCEL) {
                        this.f43218c = null;
                    }
                    z = false;
                    cVar = this.f43225j;
                    a = m66119a(z, false, true);
                    cVar = null;
                }
            } else {
                if (this.f43225j != null && (!this.f43225j.mo46384f() || (iOException instanceof ConnectionShutdownException))) {
                    if (this.f43225j.f43198l == 0) {
                        if (!(this.f43218c == null || iOException == null)) {
                            this.f43223h.mo46390a(this.f43218c, iOException);
                        }
                        this.f43218c = null;
                    }
                }
                z = false;
                cVar = this.f43225j;
                a = m66119a(z, false, true);
                cVar = null;
            }
            z = true;
            cVar = this.f43225j;
            a = m66119a(z, false, true);
            cVar = null;
        }
        C14910b.m66058a(a);
        if (cVar != null) {
            this.f43221f.mo43587b(this.f43220e, (C13839j) cVar);
        }
    }

    /* renamed from: a */
    public void mo46400a(C14916c cVar, boolean z) {
        if (this.f43225j == null) {
            this.f43225j = cVar;
            this.f43226k = z;
            cVar.f43200n.add(new C14922a(this, this.f43222g));
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public Socket mo46396a(C14916c cVar) {
        if (this.f43229n == null && this.f43225j.f43200n.size() == 1) {
            Reference reference = (Reference) this.f43225j.f43200n.get(0);
            Socket a = m66119a(true, false, false);
            this.f43225j = cVar;
            cVar.f43200n.add(reference);
            return a;
        }
        throw new IllegalStateException();
    }
}
