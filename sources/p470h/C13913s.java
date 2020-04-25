package p470h;

import com.mrsool.utils.C11644i;
import java.io.IOException;
import p201f.p202a.C5952h;

/* renamed from: h.s */
/* compiled from: Pipe */
public final class C13913s {

    /* renamed from: a */
    final long f40401a;

    /* renamed from: b */
    final C13887c f40402b = new C13887c();

    /* renamed from: c */
    boolean f40403c;

    /* renamed from: d */
    boolean f40404d;

    /* renamed from: e */
    private final C13924z f40405e = new C13914a();

    /* renamed from: f */
    private final C13883a0 f40406f = new C13915b();
    /* access modifiers changed from: private */
    @C5952h

    /* renamed from: g */
    public C13924z f40407g;

    /* renamed from: h.s$a */
    /* compiled from: Pipe */
    final class C13914a implements C13924z {

        /* renamed from: a */
        final C13916t f40408a = new C13916t();

        C13914a() {
        }

        /* renamed from: b */
        public void mo43815b(C13887c cVar, long j) throws IOException {
            C13924z zVar;
            synchronized (C13913s.this.f40402b) {
                if (!C13913s.this.f40403c) {
                    while (true) {
                        if (j <= 0) {
                            zVar = null;
                            break;
                        } else if (C13913s.this.f40407g != null) {
                            zVar = C13913s.this.f40407g;
                            break;
                        } else if (!C13913s.this.f40404d) {
                            long size = C13913s.this.f40401a - C13913s.this.f40402b.size();
                            if (size == 0) {
                                this.f40408a.mo43826a((Object) C13913s.this.f40402b);
                            } else {
                                long min = Math.min(size, j);
                                C13913s.this.f40402b.mo43815b(cVar, min);
                                j -= min;
                                C13913s.this.f40402b.notifyAll();
                            }
                        } else {
                            throw new IOException("source is closed");
                        }
                    }
                } else {
                    throw new IllegalStateException(C11644i.f33433v3);
                }
            }
            if (zVar != null) {
                this.f40408a.mo44010a(zVar.timeout());
                try {
                    zVar.mo43815b(cVar, j);
                } finally {
                    this.f40408a.mo44011g();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
            if (r1 == null) goto L_0x0062;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
            r6.f40408a.mo44010a(r1.timeout());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
            r6.f40408a.mo44011g();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r6 = this;
                h.s r0 = p470h.C13913s.this
                h.c r0 = r0.f40402b
                monitor-enter(r0)
                h.s r1 = p470h.C13913s.this     // Catch:{ all -> 0x0063 }
                boolean r1 = r1.f40403c     // Catch:{ all -> 0x0063 }
                if (r1 == 0) goto L_0x000d
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                return
            L_0x000d:
                h.s r1 = p470h.C13913s.this     // Catch:{ all -> 0x0063 }
                h.z r1 = r1.f40407g     // Catch:{ all -> 0x0063 }
                if (r1 == 0) goto L_0x001c
                h.s r1 = p470h.C13913s.this     // Catch:{ all -> 0x0063 }
                h.z r1 = r1.f40407g     // Catch:{ all -> 0x0063 }
                goto L_0x0046
            L_0x001c:
                h.s r1 = p470h.C13913s.this     // Catch:{ all -> 0x0063 }
                boolean r1 = r1.f40404d     // Catch:{ all -> 0x0063 }
                if (r1 == 0) goto L_0x0039
                h.s r1 = p470h.C13913s.this     // Catch:{ all -> 0x0063 }
                h.c r1 = r1.f40402b     // Catch:{ all -> 0x0063 }
                long r1 = r1.size()     // Catch:{ all -> 0x0063 }
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 > 0) goto L_0x0031
                goto L_0x0039
            L_0x0031:
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0063 }
                java.lang.String r2 = "source is closed"
                r1.<init>(r2)     // Catch:{ all -> 0x0063 }
                throw r1     // Catch:{ all -> 0x0063 }
            L_0x0039:
                h.s r1 = p470h.C13913s.this     // Catch:{ all -> 0x0063 }
                r2 = 1
                r1.f40403c = r2     // Catch:{ all -> 0x0063 }
                h.s r1 = p470h.C13913s.this     // Catch:{ all -> 0x0063 }
                h.c r1 = r1.f40402b     // Catch:{ all -> 0x0063 }
                r1.notifyAll()     // Catch:{ all -> 0x0063 }
                r1 = 0
            L_0x0046:
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                if (r1 == 0) goto L_0x0062
                h.t r0 = r6.f40408a
                h.b0 r2 = r1.timeout()
                r0.mo44010a(r2)
                r1.close()     // Catch:{ all -> 0x005b }
                h.t r0 = r6.f40408a
                r0.mo44011g()
                goto L_0x0062
            L_0x005b:
                r0 = move-exception
                h.t r1 = r6.f40408a
                r1.mo44011g()
                throw r0
            L_0x0062:
                return
            L_0x0063:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p470h.C13913s.C13914a.close():void");
        }

        public void flush() throws IOException {
            C13924z zVar;
            synchronized (C13913s.this.f40402b) {
                if (C13913s.this.f40403c) {
                    throw new IllegalStateException(C11644i.f33433v3);
                } else if (C13913s.this.f40407g != null) {
                    zVar = C13913s.this.f40407g;
                } else {
                    if (C13913s.this.f40404d) {
                        if (C13913s.this.f40402b.size() > 0) {
                            throw new IOException("source is closed");
                        }
                    }
                    zVar = null;
                }
            }
            if (zVar != null) {
                this.f40408a.mo44010a(zVar.timeout());
                try {
                    zVar.flush();
                } finally {
                    this.f40408a.mo44011g();
                }
            }
        }

        public C13885b0 timeout() {
            return this.f40408a;
        }
    }

    /* renamed from: h.s$b */
    /* compiled from: Pipe */
    final class C13915b implements C13883a0 {

        /* renamed from: a */
        final C13885b0 f40410a = new C13885b0();

        C13915b() {
        }

        public void close() throws IOException {
            synchronized (C13913s.this.f40402b) {
                C13913s.this.f40404d = true;
                C13913s.this.f40402b.notifyAll();
            }
        }

        public long read(C13887c cVar, long j) throws IOException {
            synchronized (C13913s.this.f40402b) {
                if (!C13913s.this.f40404d) {
                    while (C13913s.this.f40402b.size() == 0) {
                        if (C13913s.this.f40403c) {
                            return -1;
                        }
                        this.f40410a.mo43826a((Object) C13913s.this.f40402b);
                    }
                    long read = C13913s.this.f40402b.read(cVar, j);
                    C13913s.this.f40402b.notifyAll();
                    return read;
                }
                throw new IllegalStateException(C11644i.f33433v3);
            }
        }

        public C13885b0 timeout() {
            return this.f40410a;
        }
    }

    public C13913s(long j) {
        if (j >= 1) {
            this.f40401a = j;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("maxBufferSize < 1: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final C13883a0 mo44009b() {
        return this.f40406f;
    }

    /* renamed from: a */
    public final C13924z mo44007a() {
        return this.f40405e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r8.mo43815b(r3, r3.f40340b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r1 == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r8.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        monitor-enter(r7.f40402b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r7.f40404d = true;
        r7.f40402b.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        throw r8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44008a(p470h.C13924z r8) throws java.io.IOException {
        /*
            r7 = this;
        L_0x0000:
            h.c r0 = r7.f40402b
            monitor-enter(r0)
            h.z r1 = r7.f40407g     // Catch:{ all -> 0x0053 }
            if (r1 != 0) goto L_0x004b
            h.c r1 = r7.f40402b     // Catch:{ all -> 0x0053 }
            boolean r1 = r1.mo43904p()     // Catch:{ all -> 0x0053 }
            r2 = 1
            if (r1 == 0) goto L_0x0016
            r7.f40404d = r2     // Catch:{ all -> 0x0053 }
            r7.f40407g = r8     // Catch:{ all -> 0x0053 }
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return
        L_0x0016:
            boolean r1 = r7.f40403c     // Catch:{ all -> 0x0053 }
            h.c r3 = new h.c     // Catch:{ all -> 0x0053 }
            r3.<init>()     // Catch:{ all -> 0x0053 }
            h.c r4 = r7.f40402b     // Catch:{ all -> 0x0053 }
            h.c r5 = r7.f40402b     // Catch:{ all -> 0x0053 }
            long r5 = r5.f40340b     // Catch:{ all -> 0x0053 }
            r3.mo43815b(r4, r5)     // Catch:{ all -> 0x0053 }
            h.c r4 = r7.f40402b     // Catch:{ all -> 0x0053 }
            r4.notifyAll()     // Catch:{ all -> 0x0053 }
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            long r4 = r3.f40340b     // Catch:{ all -> 0x003b }
            r8.mo43815b(r3, r4)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0037
            r8.close()     // Catch:{ all -> 0x003b }
            goto L_0x0000
        L_0x0037:
            r8.flush()     // Catch:{ all -> 0x003b }
            goto L_0x0000
        L_0x003b:
            r8 = move-exception
            h.c r1 = r7.f40402b
            monitor-enter(r1)
            r7.f40404d = r2     // Catch:{ all -> 0x0048 }
            h.c r0 = r7.f40402b     // Catch:{ all -> 0x0048 }
            r0.notifyAll()     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            throw r8
        L_0x0048:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            throw r8
        L_0x004b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "sink already folded"
            r8.<init>(r1)     // Catch:{ all -> 0x0053 }
            throw r8     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            goto L_0x0057
        L_0x0056:
            throw r8
        L_0x0057:
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: p470h.C13913s.mo44008a(h.z):void");
    }
}
