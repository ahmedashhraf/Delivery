package p470h;

import android.support.p003v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p201f.p202a.C5952h;

/* renamed from: h.a */
/* compiled from: AsyncTimeout */
public class C13879a extends C13885b0 {

    /* renamed from: h */
    private static final int f40320h = 65536;

    /* renamed from: i */
    private static final long f40321i = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: j */
    private static final long f40322j = TimeUnit.MILLISECONDS.toNanos(f40321i);
    @C5952h

    /* renamed from: k */
    static C13879a f40323k;

    /* renamed from: e */
    private boolean f40324e;
    @C5952h

    /* renamed from: f */
    private C13879a f40325f;

    /* renamed from: g */
    private long f40326g;

    /* renamed from: h.a$a */
    /* compiled from: AsyncTimeout */
    class C13880a implements C13924z {

        /* renamed from: a */
        final /* synthetic */ C13924z f40327a;

        C13880a(C13924z zVar) {
            this.f40327a = zVar;
        }

        /* renamed from: b */
        public void mo43815b(C13887c cVar, long j) throws IOException {
            C13893d0.m59606a(cVar.f40340b, 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C13921w wVar = cVar.f40339a;
                    while (true) {
                        if (j2 >= PlaybackStateCompat.f479n0) {
                            break;
                        }
                        j2 += (long) (wVar.f40428c - wVar.f40427b);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        wVar = wVar.f40431f;
                    }
                    C13879a.this.mo43813g();
                    try {
                        this.f40327a.mo43815b(cVar, j2);
                        j -= j2;
                        C13879a.this.mo43811a(true);
                    } catch (IOException e) {
                        throw C13879a.this.mo43810a(e);
                    } catch (Throwable th) {
                        C13879a.this.mo43811a(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }

        public void close() throws IOException {
            C13879a.this.mo43813g();
            try {
                this.f40327a.close();
                C13879a.this.mo43811a(true);
            } catch (IOException e) {
                throw C13879a.this.mo43810a(e);
            } catch (Throwable th) {
                C13879a.this.mo43811a(false);
                throw th;
            }
        }

        public void flush() throws IOException {
            C13879a.this.mo43813g();
            try {
                this.f40327a.flush();
                C13879a.this.mo43811a(true);
            } catch (IOException e) {
                throw C13879a.this.mo43810a(e);
            } catch (Throwable th) {
                C13879a.this.mo43811a(false);
                throw th;
            }
        }

        public C13885b0 timeout() {
            return C13879a.this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AsyncTimeout.sink(");
            sb.append(this.f40327a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: h.a$b */
    /* compiled from: AsyncTimeout */
    class C13881b implements C13883a0 {

        /* renamed from: a */
        final /* synthetic */ C13883a0 f40329a;

        C13881b(C13883a0 a0Var) {
            this.f40329a = a0Var;
        }

        public void close() throws IOException {
            C13879a.this.mo43813g();
            try {
                this.f40329a.close();
                C13879a.this.mo43811a(true);
            } catch (IOException e) {
                throw C13879a.this.mo43810a(e);
            } catch (Throwable th) {
                C13879a.this.mo43811a(false);
                throw th;
            }
        }

        public long read(C13887c cVar, long j) throws IOException {
            C13879a.this.mo43813g();
            try {
                long read = this.f40329a.read(cVar, j);
                C13879a.this.mo43811a(true);
                return read;
            } catch (IOException e) {
                throw C13879a.this.mo43810a(e);
            } catch (Throwable th) {
                C13879a.this.mo43811a(false);
                throw th;
            }
        }

        public C13885b0 timeout() {
            return C13879a.this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AsyncTimeout.source(");
            sb.append(this.f40329a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: h.a$c */
    /* compiled from: AsyncTimeout */
    private static final class C13882c extends Thread {
        C13882c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.mo43303i();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<h.a> r0 = p470h.C13879a.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                h.a r1 = p470h.C13879a.m59457j()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                h.a r2 = p470h.C13879a.f40323k     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                p470h.C13879a.f40323k = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.mo43303i()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x001d
            L_0x001c:
                throw r1
            L_0x001d:
                goto L_0x001c
            */
            throw new UnsupportedOperationException("Method not decompiled: p470h.C13879a.C13882c.run():void");
        }
    }

    /* renamed from: a */
    private static synchronized void m59454a(C13879a aVar, long j, boolean z) {
        Class<C13879a> cls = C13879a.class;
        synchronized (cls) {
            if (f40323k == null) {
                f40323k = new C13879a();
                new C13882c().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                aVar.f40326g = Math.min(j, aVar.mo43829c() - nanoTime) + nanoTime;
            } else if (j != 0) {
                aVar.f40326g = j + nanoTime;
            } else if (z) {
                aVar.f40326g = aVar.mo43829c();
            } else {
                throw new AssertionError();
            }
            long b = aVar.m59456b(nanoTime);
            C13879a aVar2 = f40323k;
            while (true) {
                if (aVar2.f40325f == null) {
                    break;
                } else if (b < aVar2.f40325f.m59456b(nanoTime)) {
                    break;
                } else {
                    aVar2 = aVar2.f40325f;
                }
            }
            aVar.f40325f = aVar2.f40325f;
            aVar2.f40325f = aVar;
            if (aVar2 == f40323k) {
                cls.notify();
            }
        }
    }

    /* renamed from: b */
    private long m59456b(long j) {
        return this.f40326g - j;
    }

    @C5952h
    /* renamed from: j */
    static C13879a m59457j() throws InterruptedException {
        Class<C13879a> cls = C13879a.class;
        C13879a aVar = f40323k.f40325f;
        C13879a aVar2 = null;
        if (aVar == null) {
            long nanoTime = System.nanoTime();
            cls.wait(f40321i);
            if (f40323k.f40325f == null && System.nanoTime() - nanoTime >= f40322j) {
                aVar2 = f40323k;
            }
            return aVar2;
        }
        long b = aVar.m59456b(System.nanoTime());
        if (b > 0) {
            long j = b / 1000000;
            cls.wait(j, (int) (b - (1000000 * j)));
            return null;
        }
        f40323k.f40325f = aVar.f40325f;
        aVar.f40325f = null;
        return aVar;
    }

    /* renamed from: g */
    public final void mo43813g() {
        if (!this.f40324e) {
            long f = mo43832f();
            boolean d = mo43830d();
            if (f != 0 || d) {
                this.f40324e = true;
                m59454a(this, f, d);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* renamed from: h */
    public final boolean mo43814h() {
        if (!this.f40324e) {
            return false;
        }
        this.f40324e = false;
        return m59455a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo43303i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IOException mo43812b(@C5952h IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: a */
    private static synchronized boolean m59455a(C13879a aVar) {
        synchronized (C13879a.class) {
            for (C13879a aVar2 = f40323k; aVar2 != null; aVar2 = aVar2.f40325f) {
                if (aVar2.f40325f == aVar) {
                    aVar2.f40325f = aVar.f40325f;
                    aVar.f40325f = null;
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public final C13924z mo43809a(C13924z zVar) {
        return new C13880a(zVar);
    }

    /* renamed from: a */
    public final C13883a0 mo43808a(C13883a0 a0Var) {
        return new C13881b(a0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43811a(boolean z) throws IOException {
        if (mo43814h() && z) {
            throw mo43812b((IOException) null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final IOException mo43810a(IOException iOException) throws IOException {
        if (!mo43814h()) {
            return iOException;
        }
        return mo43812b(iOException);
    }
}
