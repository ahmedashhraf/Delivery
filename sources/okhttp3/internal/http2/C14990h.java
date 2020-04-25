package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import okhttp3.internal.C14910b;
import p201f.p202a.C5952h;
import p468g.C13866u;
import p470h.C13879a;
import p470h.C13883a0;
import p470h.C13885b0;
import p470h.C13887c;
import p470h.C13894e;
import p470h.C13924z;

/* renamed from: okhttp3.internal.http2.h */
/* compiled from: Http2Stream */
public final class C14990h {

    /* renamed from: m */
    static final /* synthetic */ boolean f43557m = false;

    /* renamed from: a */
    long f43558a = 0;

    /* renamed from: b */
    long f43559b;

    /* renamed from: c */
    final int f43560c;

    /* renamed from: d */
    final C14972f f43561d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Deque<C13866u> f43562e = new ArrayDeque();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C14965a f43563f;

    /* renamed from: g */
    private boolean f43564g;

    /* renamed from: h */
    private final C14992b f43565h;

    /* renamed from: i */
    final C14991a f43566i;

    /* renamed from: j */
    final C14993c f43567j = new C14993c();

    /* renamed from: k */
    final C14993c f43568k = new C14993c();

    /* renamed from: l */
    C14963a f43569l = null;

    /* renamed from: okhttp3.internal.http2.h$a */
    /* compiled from: Http2Stream */
    final class C14991a implements C13924z {

        /* renamed from: P */
        private static final long f43570P = 16384;

        /* renamed from: Q */
        static final /* synthetic */ boolean f43571Q = false;

        /* renamed from: N */
        boolean f43572N;

        /* renamed from: a */
        private final C13887c f43574a = new C13887c();

        /* renamed from: b */
        boolean f43575b;

        C14991a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private void m66458a(boolean z) throws IOException {
            long min;
            synchronized (C14990h.this) {
                C14990h.this.f43568k.mo43813g();
                while (C14990h.this.f43559b <= 0 && !this.f43572N && !this.f43575b && C14990h.this.f43569l == null) {
                    try {
                        C14990h.this.mo46564m();
                    } catch (Throwable th) {
                        C14990h.this.f43568k.mo46567k();
                        throw th;
                    }
                }
                C14990h.this.f43568k.mo46567k();
                C14990h.this.mo46551b();
                min = Math.min(C14990h.this.f43559b, this.f43574a.size());
                C14990h.this.f43559b -= min;
            }
            C14990h.this.f43568k.mo43813g();
            try {
                C14990h.this.f43561d.mo46503a(C14990h.this.f43560c, z && min == this.f43574a.size(), this.f43574a, min);
            } finally {
                C14990h.this.f43568k.mo46567k();
            }
        }

        /* renamed from: b */
        public void mo43815b(C13887c cVar, long j) throws IOException {
            this.f43574a.mo43815b(cVar, j);
            while (this.f43574a.size() >= 16384) {
                m66458a(false);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.f43574a.size() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.f43574a.size() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            m66458a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            r0 = r8.f43573O;
            r0.f43561d.mo46503a(r0.f43560c, true, (p470h.C13887c) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
            r2 = r8.f43573O;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.f43575b = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
            r8.f43573O.f43561d.flush();
            r8.f43573O.mo46544a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f43573O.f43566i.f43572N != false) goto L_0x003a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r8 = this;
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.C14990h.this
                monitor-enter(r0)
                boolean r1 = r8.f43575b     // Catch:{ all -> 0x0050 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.C14990h.this
                okhttp3.internal.http2.h$a r0 = r0.f43566i
                boolean r0 = r0.f43572N
                r1 = 1
                if (r0 != 0) goto L_0x003a
                h.c r0 = r8.f43574a
                long r2 = r0.size()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
            L_0x001f:
                h.c r0 = r8.f43574a
                long r2 = r0.size()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003a
                r8.m66458a(r1)
                goto L_0x001f
            L_0x002d:
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.C14990h.this
                okhttp3.internal.http2.f r2 = r0.f43561d
                int r3 = r0.f43560c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.mo46503a(r3, r4, r5, r6)
            L_0x003a:
                okhttp3.internal.http2.h r2 = okhttp3.internal.http2.C14990h.this
                monitor-enter(r2)
                r8.f43575b = r1     // Catch:{ all -> 0x004d }
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.C14990h.this
                okhttp3.internal.http2.f r0 = r0.f43561d
                r0.flush()
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.C14990h.this
                r0.mo46544a()
                return
            L_0x004d:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                throw r0
            L_0x0050:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                goto L_0x0054
            L_0x0053:
                throw r1
            L_0x0054:
                goto L_0x0053
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C14990h.C14991a.close():void");
        }

        public void flush() throws IOException {
            synchronized (C14990h.this) {
                C14990h.this.mo46551b();
            }
            while (this.f43574a.size() > 0) {
                m66458a(false);
                C14990h.this.f43561d.flush();
            }
        }

        public C13885b0 timeout() {
            return C14990h.this.f43568k;
        }
    }

    /* renamed from: okhttp3.internal.http2.h$b */
    /* compiled from: Http2Stream */
    private final class C14992b implements C13883a0 {

        /* renamed from: R */
        static final /* synthetic */ boolean f43576R = false;

        /* renamed from: N */
        private final long f43577N;

        /* renamed from: O */
        boolean f43578O;

        /* renamed from: P */
        boolean f43579P;

        /* renamed from: a */
        private final C13887c f43581a = new C13887c();

        /* renamed from: b */
        private final C13887c f43582b = new C13887c();

        C14992b(long j) {
            this.f43577N = j;
        }

        /* renamed from: a */
        private void m66460a(long j) {
            C14990h.this.f43561d.mo46505a(j);
        }

        public void close() throws IOException {
            long size;
            ArrayList<C13866u> arrayList;
            C14965a aVar;
            synchronized (C14990h.this) {
                this.f43578O = true;
                size = this.f43582b.size();
                this.f43582b.mo43879d();
                arrayList = null;
                if (C14990h.this.f43562e.isEmpty() || C14990h.this.f43563f == null) {
                    aVar = null;
                } else {
                    arrayList = new ArrayList<>(C14990h.this.f43562e);
                    C14990h.this.f43562e.clear();
                    aVar = C14990h.this.f43563f;
                }
                C14990h.this.notifyAll();
            }
            if (size > 0) {
                m66460a(size);
            }
            C14990h.this.mo46544a();
            if (aVar != null) {
                for (C13866u a : arrayList) {
                    aVar.mo46485a(a);
                }
            }
        }

        public long read(C13887c cVar, long j) throws IOException {
            C14963a aVar;
            long j2;
            C14965a aVar2;
            C13866u uVar;
            long j3 = j;
            if (j3 >= 0) {
                while (true) {
                    synchronized (C14990h.this) {
                        C14990h.this.f43567j.mo43813g();
                        try {
                            aVar = C14990h.this.f43569l != null ? C14990h.this.f43569l : null;
                            if (!this.f43578O) {
                                if (C14990h.this.f43562e.isEmpty() || C14990h.this.f43563f == null) {
                                    if (this.f43582b.size() > 0) {
                                        j2 = this.f43582b.read(cVar, Math.min(j3, this.f43582b.size()));
                                        C14990h.this.f43558a += j2;
                                        if (aVar == null && C14990h.this.f43558a >= ((long) (C14990h.this.f43561d.f43496Y.mo46600c() / 2))) {
                                            C14990h.this.f43561d.mo46498a(C14990h.this.f43560c, C14990h.this.f43558a);
                                            C14990h.this.f43558a = 0;
                                        }
                                    } else {
                                        C13887c cVar2 = cVar;
                                        if (this.f43579P || aVar != null) {
                                            j2 = -1;
                                        } else {
                                            C14990h.this.mo46564m();
                                            C14990h.this.f43567j.mo46567k();
                                        }
                                    }
                                    uVar = null;
                                    aVar2 = null;
                                } else {
                                    uVar = (C13866u) C14990h.this.f43562e.removeFirst();
                                    aVar2 = C14990h.this.f43563f;
                                    C13887c cVar3 = cVar;
                                    j2 = -1;
                                }
                                if (uVar != null && aVar2 != null) {
                                    aVar2.mo46485a(uVar);
                                }
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            C14990h.this.f43567j.mo46567k();
                        }
                    }
                }
                if (j2 != -1) {
                    m66460a(j2);
                    return j2;
                } else if (aVar == null) {
                    return -1;
                } else {
                    throw new StreamResetException(aVar);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j3);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public C13885b0 timeout() {
            return C14990h.this.f43567j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo46566a(C13894e eVar, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (C14990h.this) {
                    z = this.f43579P;
                    z2 = true;
                    z3 = this.f43582b.size() + j > this.f43577N;
                }
                if (z3) {
                    eVar.skip(j);
                    C14990h.this.mo46552b(C14963a.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    eVar.skip(j);
                    return;
                } else {
                    long read = eVar.read(this.f43581a, j);
                    if (read != -1) {
                        j -= read;
                        synchronized (C14990h.this) {
                            if (this.f43582b.size() != 0) {
                                z2 = false;
                            }
                            this.f43582b.mo43842a((C13883a0) this.f43581a);
                            if (z2) {
                                C14990h.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.h$c */
    /* compiled from: Http2Stream */
    class C14993c extends C13879a {
        C14993c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public IOException mo43812b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo43303i() {
            C14990h.this.mo46552b(C14963a.CANCEL);
        }

        /* renamed from: k */
        public void mo46567k() throws IOException {
            if (mo43814h()) {
                throw mo43812b(null);
            }
        }
    }

    C14990h(int i, C14972f fVar, boolean z, boolean z2, @C5952h C13866u uVar) {
        if (fVar != null) {
            this.f43560c = i;
            this.f43561d = fVar;
            this.f43559b = (long) fVar.f43497Z.mo46600c();
            this.f43565h = new C14992b((long) fVar.f43496Y.mo46600c());
            this.f43566i = new C14991a();
            this.f43565h.f43579P = z2;
            this.f43566i.f43572N = z;
            if (uVar != null) {
                this.f43562e.add(uVar);
            }
            if (mo46559h() && uVar != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!mo46559h() && uVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    /* renamed from: c */
    public C14972f mo46553c() {
        return this.f43561d;
    }

    /* renamed from: d */
    public synchronized C14963a mo46555d() {
        return this.f43569l;
    }

    /* renamed from: e */
    public int mo46556e() {
        return this.f43560c;
    }

    /* renamed from: f */
    public C13924z mo46557f() {
        synchronized (this) {
            if (!this.f43564g) {
                if (!mo46559h()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f43566i;
    }

    /* renamed from: g */
    public C13883a0 mo46558g() {
        return this.f43565h;
    }

    /* renamed from: h */
    public boolean mo46559h() {
        if (this.f43561d.f43498a == ((this.f43560c & 1) == 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public synchronized boolean mo46560i() {
        if (this.f43569l != null) {
            return false;
        }
        if ((this.f43565h.f43579P || this.f43565h.f43578O) && ((this.f43566i.f43572N || this.f43566i.f43575b) && this.f43564g)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public C13885b0 mo46561j() {
        return this.f43567j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo46562k() {
        boolean i;
        synchronized (this) {
            this.f43565h.f43579P = true;
            i = mo46560i();
            notifyAll();
        }
        if (!i) {
            this.f43561d.mo46519f(this.f43560c);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: l */
    public synchronized C13866u mo46563l() throws IOException {
        this.f43567j.mo43813g();
        while (this.f43562e.isEmpty() && this.f43569l == null) {
            try {
                mo46564m();
            } catch (Throwable th) {
                this.f43567j.mo46567k();
                throw th;
            }
        }
        this.f43567j.mo46567k();
        if (!this.f43562e.isEmpty()) {
        } else {
            throw new StreamResetException(this.f43569l);
        }
        return (C13866u) this.f43562e.removeFirst();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo46564m() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: n */
    public C13885b0 mo46565n() {
        return this.f43568k;
    }

    /* renamed from: d */
    private boolean m66435d(C14963a aVar) {
        synchronized (this) {
            if (this.f43569l != null) {
                return false;
            }
            if (this.f43565h.f43579P && this.f43566i.f43572N) {
                return false;
            }
            this.f43569l = aVar;
            notifyAll();
            this.f43561d.mo46519f(this.f43560c);
            return true;
        }
    }

    /* renamed from: a */
    public void mo46548a(List<C14964b> list, boolean z) throws IOException {
        boolean z2;
        boolean z3;
        if (list != null) {
            synchronized (this) {
                this.f43564g = true;
                if (!z) {
                    this.f43566i.f43572N = true;
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = false;
                    z3 = false;
                }
            }
            if (!z2) {
                synchronized (this.f43561d) {
                    z2 = this.f43561d.f43495X == 0;
                }
            }
            this.f43561d.mo46504a(this.f43560c, z3, list);
            if (z2) {
                this.f43561d.flush();
                return;
            }
            return;
        }
        throw new NullPointerException("headers == null");
    }

    /* renamed from: b */
    public void mo46552b(C14963a aVar) {
        if (m66435d(aVar)) {
            this.f43561d.mo46513c(this.f43560c, aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized void mo46554c(C14963a aVar) {
        if (this.f43569l == null) {
            this.f43569l = aVar;
            notifyAll();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo46551b() throws IOException {
        C14991a aVar = this.f43566i;
        if (aVar.f43575b) {
            throw new IOException("stream closed");
        } else if (!aVar.f43572N) {
            C14963a aVar2 = this.f43569l;
            if (aVar2 != null) {
                throw new StreamResetException(aVar2);
            }
        } else {
            throw new IOException("stream finished");
        }
    }

    /* renamed from: a */
    public void mo46549a(C14963a aVar) throws IOException {
        if (m66435d(aVar)) {
            this.f43561d.mo46512b(this.f43560c, aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46547a(List<C14964b> list) {
        boolean i;
        synchronized (this) {
            this.f43564g = true;
            this.f43562e.add(C14910b.m66066b(list));
            i = mo46560i();
            notifyAll();
        }
        if (!i) {
            this.f43561d.mo46519f(this.f43560c);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46546a(C13894e eVar, int i) throws IOException {
        this.f43565h.mo46566a(eVar, (long) i);
    }

    /* renamed from: a */
    public synchronized void mo46550a(C14965a aVar) {
        this.f43563f = aVar;
        if (!this.f43562e.isEmpty() && aVar != null) {
            notifyAll();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46544a() throws IOException {
        boolean z;
        boolean i;
        synchronized (this) {
            z = !this.f43565h.f43579P && this.f43565h.f43578O && (this.f43566i.f43572N || this.f43566i.f43575b);
            i = mo46560i();
        }
        if (z) {
            mo46549a(C14963a.CANCEL);
        } else if (!i) {
            this.f43561d.mo46519f(this.f43560c);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46545a(long j) {
        this.f43559b += j;
        if (j > 0) {
            notifyAll();
        }
    }
}
