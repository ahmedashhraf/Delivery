package okhttp3.internal.p515f;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okhttp3.internal.C14910b;
import p470h.C13883a0;
import p470h.C13885b0;
import p470h.C13887c;
import p470h.C13896f;

/* renamed from: okhttp3.internal.f.b */
/* compiled from: Relay */
final class C14939b {

    /* renamed from: k */
    private static final int f43310k = 1;

    /* renamed from: l */
    private static final int f43311l = 2;

    /* renamed from: m */
    static final C13896f f43312m = C13896f.m59655e("OkHttp cache v1\n");

    /* renamed from: n */
    static final C13896f f43313n = C13896f.m59655e("OkHttp DIRTY :(\n");

    /* renamed from: o */
    private static final long f43314o = 32;

    /* renamed from: a */
    RandomAccessFile f43315a;

    /* renamed from: b */
    Thread f43316b;

    /* renamed from: c */
    C13883a0 f43317c;

    /* renamed from: d */
    final C13887c f43318d = new C13887c();

    /* renamed from: e */
    long f43319e;

    /* renamed from: f */
    boolean f43320f;

    /* renamed from: g */
    private final C13896f f43321g;

    /* renamed from: h */
    final C13887c f43322h = new C13887c();

    /* renamed from: i */
    final long f43323i;

    /* renamed from: j */
    int f43324j;

    /* renamed from: okhttp3.internal.f.b$a */
    /* compiled from: Relay */
    class C14940a implements C13883a0 {

        /* renamed from: N */
        private long f43325N;

        /* renamed from: a */
        private final C13885b0 f43327a = new C13885b0();

        /* renamed from: b */
        private C14938a f43328b = new C14938a(C14939b.this.f43315a.getChannel());

        C14940a() {
        }

        public void close() throws IOException {
            if (this.f43328b != null) {
                Closeable closeable = null;
                this.f43328b = null;
                synchronized (C14939b.this) {
                    C14939b.this.f43324j--;
                    if (C14939b.this.f43324j == 0) {
                        RandomAccessFile randomAccessFile = C14939b.this.f43315a;
                        C14939b.this.f43315a = null;
                        closeable = randomAccessFile;
                    }
                }
                if (closeable != null) {
                    C14910b.m66055a(closeable);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
            r5 = r7 - r1.f43326O.f43322h.size();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
            if (r1.f43325N >= r5) goto L_0x011b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
            r5 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
            r2 = java.lang.Math.min(r2, r7 - r1.f43325N);
            r1.f43326O.f43322h.mo43846a(r22, r1.f43325N - r5, r2);
            r1.f43325N += r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0136, code lost:
            return r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long read(p470h.C13887c r22, long r23) throws java.io.IOException {
            /*
                r21 = this;
                r1 = r21
                r2 = r23
                okhttp3.internal.f.a r0 = r1.f43328b
                if (r0 == 0) goto L_0x013a
                okhttp3.internal.f.b r4 = okhttp3.internal.p515f.C14939b.this
                monitor-enter(r4)
            L_0x000b:
                long r5 = r1.f43325N     // Catch:{ all -> 0x0137 }
                okhttp3.internal.f.b r0 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0137 }
                long r7 = r0.f43319e     // Catch:{ all -> 0x0137 }
                r0 = 2
                r9 = -1
                int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r11 != 0) goto L_0x0039
                okhttp3.internal.f.b r5 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0137 }
                boolean r5 = r5.f43320f     // Catch:{ all -> 0x0137 }
                if (r5 == 0) goto L_0x0020
                monitor-exit(r4)     // Catch:{ all -> 0x0137 }
                return r9
            L_0x0020:
                okhttp3.internal.f.b r5 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0137 }
                java.lang.Thread r5 = r5.f43316b     // Catch:{ all -> 0x0137 }
                if (r5 == 0) goto L_0x002e
                h.b0 r0 = r1.f43327a     // Catch:{ all -> 0x0137 }
                okhttp3.internal.f.b r5 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0137 }
                r0.mo43826a(r5)     // Catch:{ all -> 0x0137 }
                goto L_0x000b
            L_0x002e:
                okhttp3.internal.f.b r5 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0137 }
                java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0137 }
                r5.f43316b = r6     // Catch:{ all -> 0x0137 }
                r5 = 1
                monitor-exit(r4)     // Catch:{ all -> 0x0137 }
                goto L_0x004b
            L_0x0039:
                okhttp3.internal.f.b r5 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0137 }
                h.c r5 = r5.f43322h     // Catch:{ all -> 0x0137 }
                long r5 = r5.size()     // Catch:{ all -> 0x0137 }
                long r5 = r7 - r5
                long r11 = r1.f43325N     // Catch:{ all -> 0x0137 }
                int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r13 >= 0) goto L_0x011b
                monitor-exit(r4)     // Catch:{ all -> 0x0137 }
                r5 = 2
            L_0x004b:
                r11 = 32
                if (r5 != r0) goto L_0x0069
                long r4 = r1.f43325N
                long r7 = r7 - r4
                long r2 = java.lang.Math.min(r2, r7)
                okhttp3.internal.f.a r13 = r1.f43328b
                long r4 = r1.f43325N
                long r14 = r4 + r11
                r16 = r22
                r17 = r2
                r13.mo46449a(r14, r16, r17)
                long r4 = r1.f43325N
                long r4 = r4 + r2
                r1.f43325N = r4
                return r2
            L_0x0069:
                r4 = 0
                okhttp3.internal.f.b r0 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0109 }
                h.a0 r0 = r0.f43317c     // Catch:{ all -> 0x0109 }
                okhttp3.internal.f.b r5 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0109 }
                h.c r5 = r5.f43318d     // Catch:{ all -> 0x0109 }
                okhttp3.internal.f.b r6 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0109 }
                long r13 = r6.f43323i     // Catch:{ all -> 0x0109 }
                long r5 = r0.read(r5, r13)     // Catch:{ all -> 0x0109 }
                int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r0 != 0) goto L_0x0094
                okhttp3.internal.f.b r0 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0109 }
                r0.mo46451a(r7)     // Catch:{ all -> 0x0109 }
                okhttp3.internal.f.b r2 = okhttp3.internal.p515f.C14939b.this
                monitor-enter(r2)
                okhttp3.internal.f.b r0 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0091 }
                r0.f43316b = r4     // Catch:{ all -> 0x0091 }
                okhttp3.internal.f.b r0 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0091 }
                r0.notifyAll()     // Catch:{ all -> 0x0091 }
                monitor-exit(r2)     // Catch:{ all -> 0x0091 }
                return r9
            L_0x0091:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0091 }
                throw r0
            L_0x0094:
                long r2 = java.lang.Math.min(r5, r2)     // Catch:{ all -> 0x0109 }
                okhttp3.internal.f.b r0 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0109 }
                h.c r13 = r0.f43318d     // Catch:{ all -> 0x0109 }
                r15 = 0
                r14 = r22
                r17 = r2
                r13.mo43846a(r14, r15, r17)     // Catch:{ all -> 0x0109 }
                long r9 = r1.f43325N     // Catch:{ all -> 0x0109 }
                long r9 = r9 + r2
                r1.f43325N = r9     // Catch:{ all -> 0x0109 }
                okhttp3.internal.f.a r15 = r1.f43328b     // Catch:{ all -> 0x0109 }
                long r16 = r7 + r11
                okhttp3.internal.f.b r0 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0109 }
                h.c r0 = r0.f43318d     // Catch:{ all -> 0x0109 }
                h.c r18 = r0.clone()     // Catch:{ all -> 0x0109 }
                r19 = r5
                r15.mo46450b(r16, r18, r19)     // Catch:{ all -> 0x0109 }
                okhttp3.internal.f.b r7 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0109 }
                monitor-enter(r7)     // Catch:{ all -> 0x0109 }
                okhttp3.internal.f.b r0 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0106 }
                h.c r0 = r0.f43322h     // Catch:{ all -> 0x0106 }
                okhttp3.internal.f.b r8 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0106 }
                h.c r8 = r8.f43318d     // Catch:{ all -> 0x0106 }
                r0.mo43815b(r8, r5)     // Catch:{ all -> 0x0106 }
                okhttp3.internal.f.b r0 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0106 }
                h.c r0 = r0.f43322h     // Catch:{ all -> 0x0106 }
                long r8 = r0.size()     // Catch:{ all -> 0x0106 }
                okhttp3.internal.f.b r0 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0106 }
                long r10 = r0.f43323i     // Catch:{ all -> 0x0106 }
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 <= 0) goto L_0x00ed
                okhttp3.internal.f.b r0 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0106 }
                h.c r0 = r0.f43322h     // Catch:{ all -> 0x0106 }
                okhttp3.internal.f.b r8 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0106 }
                h.c r8 = r8.f43322h     // Catch:{ all -> 0x0106 }
                long r8 = r8.size()     // Catch:{ all -> 0x0106 }
                okhttp3.internal.f.b r10 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0106 }
                long r10 = r10.f43323i     // Catch:{ all -> 0x0106 }
                long r8 = r8 - r10
                r0.skip(r8)     // Catch:{ all -> 0x0106 }
            L_0x00ed:
                okhttp3.internal.f.b r0 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0106 }
                long r8 = r0.f43319e     // Catch:{ all -> 0x0106 }
                long r8 = r8 + r5
                r0.f43319e = r8     // Catch:{ all -> 0x0106 }
                monitor-exit(r7)     // Catch:{ all -> 0x0106 }
                okhttp3.internal.f.b r5 = okhttp3.internal.p515f.C14939b.this
                monitor-enter(r5)
                okhttp3.internal.f.b r0 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0103 }
                r0.f43316b = r4     // Catch:{ all -> 0x0103 }
                okhttp3.internal.f.b r0 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0103 }
                r0.notifyAll()     // Catch:{ all -> 0x0103 }
                monitor-exit(r5)     // Catch:{ all -> 0x0103 }
                return r2
            L_0x0103:
                r0 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0103 }
                throw r0
            L_0x0106:
                r0 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0106 }
                throw r0     // Catch:{ all -> 0x0109 }
            L_0x0109:
                r0 = move-exception
                okhttp3.internal.f.b r2 = okhttp3.internal.p515f.C14939b.this
                monitor-enter(r2)
                okhttp3.internal.f.b r3 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0118 }
                r3.f43316b = r4     // Catch:{ all -> 0x0118 }
                okhttp3.internal.f.b r3 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0118 }
                r3.notifyAll()     // Catch:{ all -> 0x0118 }
                monitor-exit(r2)     // Catch:{ all -> 0x0118 }
                throw r0
            L_0x0118:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0118 }
                throw r0
            L_0x011b:
                long r9 = r1.f43325N     // Catch:{ all -> 0x0137 }
                long r7 = r7 - r9
                long r2 = java.lang.Math.min(r2, r7)     // Catch:{ all -> 0x0137 }
                okhttp3.internal.f.b r0 = okhttp3.internal.p515f.C14939b.this     // Catch:{ all -> 0x0137 }
                h.c r9 = r0.f43322h     // Catch:{ all -> 0x0137 }
                long r7 = r1.f43325N     // Catch:{ all -> 0x0137 }
                long r11 = r7 - r5
                r10 = r22
                r13 = r2
                r9.mo43846a(r10, r11, r13)     // Catch:{ all -> 0x0137 }
                long r5 = r1.f43325N     // Catch:{ all -> 0x0137 }
                long r5 = r5 + r2
                r1.f43325N = r5     // Catch:{ all -> 0x0137 }
                monitor-exit(r4)     // Catch:{ all -> 0x0137 }
                return r2
            L_0x0137:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0137 }
                throw r0
            L_0x013a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "closed"
                r0.<init>(r2)
                goto L_0x0143
            L_0x0142:
                throw r0
            L_0x0143:
                goto L_0x0142
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p515f.C14939b.C14940a.read(h.c, long):long");
        }

        public C13885b0 timeout() {
            return this.f43327a;
        }
    }

    private C14939b(RandomAccessFile randomAccessFile, C13883a0 a0Var, long j, C13896f fVar, long j2) {
        this.f43315a = randomAccessFile;
        this.f43317c = a0Var;
        this.f43320f = a0Var == null;
        this.f43319e = j;
        this.f43321g = fVar;
        this.f43323i = j2;
    }

    /* renamed from: a */
    public static C14939b m66203a(File file, C13883a0 a0Var, C13896f fVar, long j) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        C14939b bVar = new C14939b(randomAccessFile, a0Var, 0, fVar, j);
        randomAccessFile.setLength(0);
        bVar.m66204a(f43313n, -1, -1);
        return bVar;
    }

    /* renamed from: b */
    private void m66205b(long j) throws IOException {
        C13887c cVar = new C13887c();
        cVar.m59514a(this.f43321g);
        new C14938a(this.f43315a.getChannel()).mo46450b(32 + j, cVar, (long) this.f43321g.mo43985r());
    }

    /* renamed from: c */
    public C13883a0 mo46454c() {
        synchronized (this) {
            if (this.f43315a == null) {
                return null;
            }
            this.f43324j++;
            return new C14940a();
        }
    }

    /* renamed from: a */
    public static C14939b m66202a(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        C14938a aVar = new C14938a(randomAccessFile.getChannel());
        C13887c cVar = new C13887c();
        aVar.mo46449a(0, cVar, 32);
        if (cVar.mo43891h((long) f43312m.mo43985r()).equals(f43312m)) {
            long readLong = cVar.readLong();
            long readLong2 = cVar.readLong();
            C13887c cVar2 = new C13887c();
            aVar.mo46449a(readLong + 32, cVar2, readLong2);
            C14939b bVar = new C14939b(randomAccessFile, null, readLong, cVar2.mo43919t(), 0);
            return bVar;
        }
        throw new IOException("unreadable cache file");
    }

    /* renamed from: b */
    public C13896f mo46453b() {
        return this.f43321g;
    }

    /* renamed from: a */
    private void m66204a(C13896f fVar, long j, long j2) throws IOException {
        C13887c cVar = new C13887c();
        cVar.m59514a(fVar);
        cVar.writeLong(j);
        cVar.writeLong(j2);
        if (cVar.size() == 32) {
            new C14938a(this.f43315a.getChannel()).mo46450b(0, cVar, 32);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46451a(long j) throws IOException {
        m66205b(j);
        this.f43315a.getChannel().force(false);
        m66204a(f43312m, j, (long) this.f43321g.mo43985r());
        this.f43315a.getChannel().force(false);
        synchronized (this) {
            this.f43320f = true;
        }
        C14910b.m66055a((Closeable) this.f43317c);
        this.f43317c = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo46452a() {
        return this.f43315a == null;
    }
}
