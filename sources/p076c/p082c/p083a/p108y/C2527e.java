package p076c.p082c.p083a.p108y;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p108y.p109i.C2535c;
import p076c.p082c.p083a.p108y.p110j.C2558k;

/* renamed from: c.c.a.y.e */
/* compiled from: RequestFutureTarget */
public class C2527e<T, R> implements C2522a<R>, Runnable {

    /* renamed from: W */
    private static final C2528a f9593W = new C2528a();

    /* renamed from: N */
    private final int f9594N;

    /* renamed from: O */
    private final boolean f9595O;

    /* renamed from: P */
    private final C2528a f9596P;

    /* renamed from: Q */
    private R f9597Q;

    /* renamed from: R */
    private C2525c f9598R;

    /* renamed from: S */
    private boolean f9599S;

    /* renamed from: T */
    private Exception f9600T;

    /* renamed from: U */
    private boolean f9601U;

    /* renamed from: V */
    private boolean f9602V;

    /* renamed from: a */
    private final Handler f9603a;

    /* renamed from: b */
    private final int f9604b;

    /* renamed from: c.c.a.y.e$a */
    /* compiled from: RequestFutureTarget */
    static class C2528a {
        C2528a() {
        }

        /* renamed from: a */
        public void mo10009a(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }

        /* renamed from: a */
        public void mo10008a(Object obj) {
            obj.notifyAll();
        }
    }

    public C2527e(Handler handler, int i, int i2) {
        this(handler, i, i2, true, f9593W);
    }

    /* renamed from: a */
    public void mo9486a(Drawable drawable) {
    }

    /* renamed from: a */
    public void mo9506a(C2558k kVar) {
        kVar.mo9402a(this.f9604b, this.f9594N);
    }

    /* renamed from: b */
    public void mo9488b(Drawable drawable) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f9599S     // Catch:{ all -> 0x001d }
            r1 = 1
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)
            return r1
        L_0x0008:
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x001d }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x001b
            r2.f9599S = r1     // Catch:{ all -> 0x001d }
            if (r3 == 0) goto L_0x0016
            r2.clear()     // Catch:{ all -> 0x001d }
        L_0x0016:
            c.c.a.y.e$a r3 = r2.f9596P     // Catch:{ all -> 0x001d }
            r3.mo10008a(r2)     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r2)
            return r0
        L_0x001d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p082c.p083a.p108y.C2527e.cancel(boolean):boolean");
    }

    public void clear() {
        this.f9603a.post(this);
    }

    public R get() throws InterruptedException, ExecutionException {
        try {
            return m12559a((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public synchronized boolean isCancelled() {
        return this.f9599S;
    }

    public synchronized boolean isDone() {
        return this.f9599S || this.f9601U;
    }

    public void onDestroy() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void run() {
        C2525c cVar = this.f9598R;
        if (cVar != null) {
            cVar.clear();
            cancel(false);
        }
    }

    C2527e(Handler handler, int i, int i2, boolean z, C2528a aVar) {
        this.f9603a = handler;
        this.f9604b = i;
        this.f9594N = i2;
        this.f9595O = z;
        this.f9596P = aVar;
    }

    /* renamed from: a */
    public void mo10001a(C2525c cVar) {
        this.f9598R = cVar;
    }

    /* renamed from: a */
    public C2525c mo10000a() {
        return this.f9598R;
    }

    public R get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return m12559a(Long.valueOf(timeUnit.toMillis(j)));
    }

    /* renamed from: a */
    public synchronized void mo9487a(Exception exc, Drawable drawable) {
        this.f9602V = true;
        this.f9600T = exc;
        this.f9596P.mo10008a(this);
    }

    /* renamed from: a */
    public synchronized void mo9404a(R r, C2535c<? super R> cVar) {
        this.f9601U = true;
        this.f9597Q = r;
        this.f9596P.mo10008a(this);
    }

    /* renamed from: a */
    private synchronized R m12559a(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f9595O) {
            C2216i.m11343a();
        }
        if (this.f9599S) {
            throw new CancellationException();
        } else if (this.f9602V) {
            throw new ExecutionException(this.f9600T);
        } else if (this.f9601U) {
            return this.f9597Q;
        } else {
            if (l == null) {
                this.f9596P.mo10009a(this, 0);
            } else if (l.longValue() > 0) {
                this.f9596P.mo10009a(this, l.longValue());
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f9602V) {
                throw new ExecutionException(this.f9600T);
            } else if (this.f9599S) {
                throw new CancellationException();
            } else if (this.f9601U) {
                return this.f9597Q;
            } else {
                throw new TimeoutException();
            }
        }
    }
}
