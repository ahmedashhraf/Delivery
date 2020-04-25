package p195e.p196a.p199x0.p463g;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.g.r */
/* compiled from: SingleScheduler */
public final class C13705r extends C12282j0 {

    /* renamed from: O */
    private static final String f39646O = "rx2.single-priority";

    /* renamed from: P */
    private static final String f39647P = "RxSingleScheduler";

    /* renamed from: Q */
    static final C13686k f39648Q = new C13686k(f39647P, Math.max(1, Math.min(10, Integer.getInteger(f39646O, 5).intValue())), true);

    /* renamed from: R */
    static final ScheduledExecutorService f39649R = Executors.newScheduledThreadPool(0);

    /* renamed from: N */
    final AtomicReference<ScheduledExecutorService> f39650N;

    /* renamed from: b */
    final ThreadFactory f39651b;

    /* renamed from: e.a.x0.g.r$a */
    /* compiled from: SingleScheduler */
    static final class C13706a extends C12285c {

        /* renamed from: N */
        volatile boolean f39652N;

        /* renamed from: a */
        final ScheduledExecutorService f39653a;

        /* renamed from: b */
        final C12313b f39654b = new C12313b();

        C13706a(ScheduledExecutorService scheduledExecutorService) {
            this.f39653a = scheduledExecutorService;
        }

        @C5937f
        /* renamed from: a */
        public C12314c mo41877a(@C5937f Runnable runnable, long j, @C5937f TimeUnit timeUnit) {
            Future future;
            if (this.f39652N) {
                return C12348e.INSTANCE;
            }
            C13690n nVar = new C13690n(C12205a.m54881a(runnable), this.f39654b);
            this.f39654b.mo42072b(nVar);
            if (j <= 0) {
                try {
                    future = this.f39653a.submit(nVar);
                } catch (RejectedExecutionException e) {
                    dispose();
                    C12205a.m54894b((Throwable) e);
                    return C12348e.INSTANCE;
                }
            } else {
                future = this.f39653a.schedule(nVar, j, timeUnit);
            }
            nVar.mo43070a(future);
            return nVar;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39652N;
        }

        public void dispose() {
            if (!this.f39652N) {
                this.f39652N = true;
                this.f39654b.dispose();
            }
        }
    }

    static {
        f39649R.shutdown();
    }

    public C13705r() {
        this(f39648Q);
    }

    /* renamed from: a */
    static ScheduledExecutorService m58551a(ThreadFactory threadFactory) {
        return C13693p.m58532a(threadFactory);
    }

    /* renamed from: b */
    public void mo42024b() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f39650N.get();
        ScheduledExecutorService scheduledExecutorService2 = f39649R;
        if (scheduledExecutorService != scheduledExecutorService2) {
            ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.f39650N.getAndSet(scheduledExecutorService2);
            if (scheduledExecutorService3 != f39649R) {
                scheduledExecutorService3.shutdownNow();
            }
        }
    }

    /* renamed from: c */
    public void mo42025c() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = (ScheduledExecutorService) this.f39650N.get();
            if (scheduledExecutorService != f39649R) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = m58551a(this.f39651b);
            }
        } while (!this.f39650N.compareAndSet(scheduledExecutorService, scheduledExecutorService2));
    }

    public C13705r(ThreadFactory threadFactory) {
        this.f39650N = new AtomicReference<>();
        this.f39651b = threadFactory;
        this.f39650N.lazySet(m58551a(threadFactory));
    }

    @C5937f
    /* renamed from: a */
    public C12285c mo41871a() {
        return new C13706a((ScheduledExecutorService) this.f39650N.get());
    }

    @C5937f
    /* renamed from: a */
    public C12314c mo42023a(@C5937f Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C13689m mVar = new C13689m(C12205a.m54881a(runnable));
        if (j <= 0) {
            try {
                future = ((ScheduledExecutorService) this.f39650N.get()).submit(mVar);
            } catch (RejectedExecutionException e) {
                C12205a.m54894b((Throwable) e);
                return C12348e.INSTANCE;
            }
        } else {
            future = ((ScheduledExecutorService) this.f39650N.get()).schedule(mVar, j, timeUnit);
        }
        mVar.mo43036a(future);
        return mVar;
    }

    @C5937f
    /* renamed from: a */
    public C12314c mo42022a(@C5937f Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable a = C12205a.m54881a(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f39650N.get();
            C13678f fVar = new C13678f(a, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(fVar);
                } catch (RejectedExecutionException e) {
                    C12205a.m54894b((Throwable) e);
                    return C12348e.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(fVar, j, timeUnit);
            }
            fVar.mo43050a(future);
            return fVar;
        }
        C13688l lVar = new C13688l(a);
        try {
            lVar.mo43036a(((ScheduledExecutorService) this.f39650N.get()).scheduleAtFixedRate(lVar, j, j2, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e2) {
            C12205a.m54894b((Throwable) e2);
            return C12348e.INSTANCE;
        }
    }
}
