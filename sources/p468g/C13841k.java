package p468g;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.C14910b;
import okhttp3.internal.connection.C14916c;
import okhttp3.internal.connection.C14918d;
import okhttp3.internal.connection.C14921f;
import okhttp3.internal.connection.C14921f.C14922a;
import okhttp3.internal.p519j.C15011f;
import p201f.p202a.C5952h;

/* renamed from: g.k */
/* compiled from: ConnectionPool */
public final class C13841k {

    /* renamed from: g */
    private static final Executor f40133g;

    /* renamed from: h */
    static final /* synthetic */ boolean f40134h = false;

    /* renamed from: a */
    private final int f40135a;

    /* renamed from: b */
    private final long f40136b;

    /* renamed from: c */
    private final Runnable f40137c;

    /* renamed from: d */
    private final Deque<C14916c> f40138d;

    /* renamed from: e */
    final C14918d f40139e;

    /* renamed from: f */
    boolean f40140f;

    /* renamed from: g.k$a */
    /* compiled from: ConnectionPool */
    class C13842a implements Runnable {
        C13842a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
            L_0x0000:
                g.k r0 = p468g.C13841k.this
                long r1 = java.lang.System.nanoTime()
                long r0 = r0.mo43504a(r1)
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x0011
                return
            L_0x0011:
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x0000
                r2 = 1000000(0xf4240, double:4.940656E-318)
                long r4 = r0 / r2
                long r2 = r2 * r4
                long r0 = r0 - r2
                g.k r2 = p468g.C13841k.this
                monitor-enter(r2)
                g.k r3 = p468g.C13841k.this     // Catch:{ InterruptedException -> 0x002b }
                int r1 = (int) r0     // Catch:{ InterruptedException -> 0x002b }
                r3.wait(r4, r1)     // Catch:{ InterruptedException -> 0x002b }
                goto L_0x002b
            L_0x0029:
                r0 = move-exception
                goto L_0x002d
            L_0x002b:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                goto L_0x0000
            L_0x002d:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                goto L_0x0030
            L_0x002f:
                throw r0
            L_0x0030:
                goto L_0x002f
            */
            throw new UnsupportedOperationException("Method not decompiled: p468g.C13841k.C13842a.run():void");
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C14910b.m66052a("OkHttp ConnectionPool", true));
        f40133g = threadPoolExecutor;
    }

    public C13841k() {
        this(5, 5, TimeUnit.MINUTES);
    }

    /* renamed from: a */
    public synchronized int mo43503a() {
        return this.f40138d.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo43509b(C14916c cVar) {
        if (!this.f40140f) {
            this.f40140f = true;
            f40133g.execute(this.f40137c);
        }
        this.f40138d.add(cVar);
    }

    /* renamed from: c */
    public synchronized int mo43510c() {
        int i;
        i = 0;
        for (C14916c cVar : this.f40138d) {
            if (cVar.f43200n.isEmpty()) {
                i++;
            }
        }
        return i;
    }

    public C13841k(int i, long j, TimeUnit timeUnit) {
        this.f40137c = new C13842a();
        this.f40138d = new ArrayDeque();
        this.f40139e = new C14918d();
        this.f40135a = i;
        this.f40136b = timeUnit.toNanos(j);
        if (j <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("keepAliveDuration <= 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    @C5952h
    /* renamed from: a */
    public C14916c mo43506a(C13798a aVar, C14921f fVar, C13832g0 g0Var) {
        for (C14916c cVar : this.f40138d) {
            if (cVar.mo46380a(aVar, g0Var)) {
                fVar.mo46400a(cVar, true);
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    @C5952h
    /* renamed from: a */
    public Socket mo43505a(C13798a aVar, C14921f fVar) {
        for (C14916c cVar : this.f40138d) {
            if (cVar.mo46380a(aVar, null) && cVar.mo46384f() && cVar != fVar.mo46403c()) {
                return fVar.mo46396a(cVar);
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo43508b() {
        ArrayList<C14916c> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator it = this.f40138d.iterator();
            while (it.hasNext()) {
                C14916c cVar = (C14916c) it.next();
                if (cVar.f43200n.isEmpty()) {
                    cVar.f43197k = true;
                    arrayList.add(cVar);
                    it.remove();
                }
            }
        }
        for (C14916c d : arrayList) {
            C14910b.m66058a(d.mo43496d());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo43507a(C14916c cVar) {
        if (cVar.f43197k || this.f40135a == 0) {
            this.f40138d.remove(cVar);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public long mo43504a(long j) {
        synchronized (this) {
            long j2 = Long.MIN_VALUE;
            C14916c cVar = null;
            int i = 0;
            int i2 = 0;
            for (C14916c cVar2 : this.f40138d) {
                if (m59112a(cVar2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - cVar2.f43201o;
                    if (j3 > j2) {
                        cVar = cVar2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.f40136b) {
                if (i <= this.f40135a) {
                    if (i > 0) {
                        long j4 = this.f40136b - j2;
                        return j4;
                    } else if (i2 > 0) {
                        long j5 = this.f40136b;
                        return j5;
                    } else {
                        this.f40140f = false;
                        return -1;
                    }
                }
            }
            this.f40138d.remove(cVar);
            C14910b.m66058a(cVar.mo43496d());
            return 0;
        }
    }

    /* renamed from: a */
    private int m59112a(C14916c cVar, long j) {
        List<Reference<C14921f>> list = cVar.f43200n;
        int i = 0;
        while (i < list.size()) {
            Reference reference = (Reference) list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C14922a aVar = (C14922a) reference;
                StringBuilder sb = new StringBuilder();
                sb.append("A connection to ");
                sb.append(cVar.mo43494b().mo43466a().mo43286k());
                sb.append(" was leaked. Did you forget to close a response body?");
                C15011f.m66571d().mo46616a(sb.toString(), aVar.f43230a);
                list.remove(i);
                cVar.f43197k = true;
                if (list.isEmpty()) {
                    cVar.f43201o = j - this.f40136b;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
