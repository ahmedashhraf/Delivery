package p195e.p196a.p199x0.p463g;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p450a.C12346c;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.g.i */
/* compiled from: NewThreadWorker */
public class C13684i extends C12285c implements C12314c {

    /* renamed from: a */
    private final ScheduledExecutorService f39608a;

    /* renamed from: b */
    volatile boolean f39609b;

    public C13684i(ThreadFactory threadFactory) {
        this.f39608a = C13693p.m58532a(threadFactory);
    }

    @C5937f
    /* renamed from: a */
    public C12314c mo41876a(@C5937f Runnable runnable) {
        return mo41877a(runnable, 0, null);
    }

    /* renamed from: b */
    public C12314c mo43065b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C13689m mVar = new C13689m(C12205a.m54881a(runnable));
        if (j <= 0) {
            try {
                future = this.f39608a.submit(mVar);
            } catch (RejectedExecutionException e) {
                C12205a.m54894b((Throwable) e);
                return C12348e.INSTANCE;
            }
        } else {
            future = this.f39608a.schedule(mVar, j, timeUnit);
        }
        mVar.mo43036a(future);
        return mVar;
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return this.f39609b;
    }

    public void dispose() {
        if (!this.f39609b) {
            this.f39609b = true;
            this.f39608a.shutdownNow();
        }
    }

    @C5937f
    /* renamed from: a */
    public C12314c mo41877a(@C5937f Runnable runnable, long j, @C5937f TimeUnit timeUnit) {
        if (this.f39609b) {
            return C12348e.INSTANCE;
        }
        return mo43062a(runnable, j, timeUnit, null);
    }

    @C5937f
    /* renamed from: a */
    public C13690n mo43062a(Runnable runnable, long j, @C5937f TimeUnit timeUnit, @C5938g C12346c cVar) {
        Future future;
        C13690n nVar = new C13690n(C12205a.m54881a(runnable), cVar);
        if (cVar != null && !cVar.mo42072b(nVar)) {
            return nVar;
        }
        if (j <= 0) {
            try {
                future = this.f39608a.submit(nVar);
            } catch (RejectedExecutionException e) {
                if (cVar != null) {
                    cVar.mo42069a(nVar);
                }
                C12205a.m54894b((Throwable) e);
            }
        } else {
            future = this.f39608a.schedule(nVar, j, timeUnit);
        }
        nVar.mo43070a(future);
        return nVar;
    }

    /* renamed from: b */
    public C12314c mo43064b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable a = C12205a.m54881a(runnable);
        if (j2 <= 0) {
            C13678f fVar = new C13678f(a, this.f39608a);
            if (j <= 0) {
                try {
                    future = this.f39608a.submit(fVar);
                } catch (RejectedExecutionException e) {
                    C12205a.m54894b((Throwable) e);
                    return C12348e.INSTANCE;
                }
            } else {
                future = this.f39608a.schedule(fVar, j, timeUnit);
            }
            fVar.mo43050a(future);
            return fVar;
        }
        C13688l lVar = new C13688l(a);
        try {
            lVar.mo43036a(this.f39608a.scheduleAtFixedRate(lVar, j, j2, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e2) {
            C12205a.m54894b((Throwable) e2);
            return C12348e.INSTANCE;
        }
    }

    /* renamed from: a */
    public void mo43063a() {
        if (!this.f39609b) {
            this.f39609b = true;
            this.f39608a.shutdown();
        }
    }
}
