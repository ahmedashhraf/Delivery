package p195e.p196a.p199x0.p463g;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p199x0.p462f.C13660a;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p441d1.C12227a;
import p195e.p196a.p441d1.C12228b;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.g.d */
/* compiled from: ExecutorScheduler */
public final class C13670d extends C12282j0 {

    /* renamed from: N */
    static final C12282j0 f39558N = C12228b.m55097e();
    @C5937f

    /* renamed from: b */
    final Executor f39559b;

    /* renamed from: e.a.x0.g.d$a */
    /* compiled from: ExecutorScheduler */
    final class C13671a implements Runnable {

        /* renamed from: a */
        private final C13672b f39560a;

        C13671a(C13672b bVar) {
            this.f39560a = bVar;
        }

        public void run() {
            C13672b bVar = this.f39560a;
            bVar.f39563b.mo42109a(C13670d.this.mo42021a(bVar));
        }
    }

    /* renamed from: e.a.x0.g.d$b */
    /* compiled from: ExecutorScheduler */
    static final class C13672b extends AtomicReference<Runnable> implements Runnable, C12314c, C12227a {
        private static final long serialVersionUID = -4101336210206799084L;

        /* renamed from: a */
        final C12350g f39562a = new C12350g();

        /* renamed from: b */
        final C12350g f39563b = new C12350g();

        C13672b(Runnable runnable) {
            super(runnable);
        }

        /* renamed from: a */
        public Runnable mo41865a() {
            Runnable runnable = (Runnable) get();
            return runnable != null ? runnable : C12351a.f35502b;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get() == null;
        }

        public void dispose() {
            if (getAndSet(null) != null) {
                this.f39562a.dispose();
                this.f39563b.dispose();
            }
        }

        public void run() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    this.f39562a.lazySet(C12347d.DISPOSED);
                    this.f39563b.lazySet(C12347d.DISPOSED);
                }
            }
        }
    }

    /* renamed from: e.a.x0.g.d$c */
    /* compiled from: ExecutorScheduler */
    public static final class C13673c extends C12285c implements Runnable {

        /* renamed from: N */
        volatile boolean f39564N;

        /* renamed from: O */
        final AtomicInteger f39565O = new AtomicInteger();

        /* renamed from: P */
        final C12313b f39566P = new C12313b();

        /* renamed from: a */
        final Executor f39567a;

        /* renamed from: b */
        final C13660a<Runnable> f39568b;

        /* renamed from: e.a.x0.g.d$c$a */
        /* compiled from: ExecutorScheduler */
        static final class C13674a extends AtomicBoolean implements Runnable, C12314c {
            private static final long serialVersionUID = -2421395018820541164L;

            /* renamed from: a */
            final Runnable f39569a;

            C13674a(Runnable runnable) {
                this.f39569a = runnable;
            }

            /* renamed from: d */
            public boolean mo41878d() {
                return get();
            }

            public void dispose() {
                lazySet(true);
            }

            public void run() {
                if (!get()) {
                    try {
                        this.f39569a.run();
                    } finally {
                        lazySet(true);
                    }
                }
            }
        }

        /* renamed from: e.a.x0.g.d$c$b */
        /* compiled from: ExecutorScheduler */
        final class C13675b implements Runnable {

            /* renamed from: a */
            private final C12350g f39571a;

            /* renamed from: b */
            private final Runnable f39572b;

            C13675b(C12350g gVar, Runnable runnable) {
                this.f39571a = gVar;
                this.f39572b = runnable;
            }

            public void run() {
                this.f39571a.mo42109a(C13673c.this.mo41876a(this.f39572b));
            }
        }

        public C13673c(Executor executor) {
            this.f39567a = executor;
            this.f39568b = new C13660a<>();
        }

        @C5937f
        /* renamed from: a */
        public C12314c mo41876a(@C5937f Runnable runnable) {
            if (this.f39564N) {
                return C12348e.INSTANCE;
            }
            C13674a aVar = new C13674a(C12205a.m54881a(runnable));
            this.f39568b.offer(aVar);
            if (this.f39565O.getAndIncrement() == 0) {
                try {
                    this.f39567a.execute(this);
                } catch (RejectedExecutionException e) {
                    this.f39564N = true;
                    this.f39568b.clear();
                    C12205a.m54894b((Throwable) e);
                    return C12348e.INSTANCE;
                }
            }
            return aVar;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39564N;
        }

        public void dispose() {
            if (!this.f39564N) {
                this.f39564N = true;
                this.f39566P.dispose();
                if (this.f39565O.getAndIncrement() == 0) {
                    this.f39568b.clear();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            r1 = r3.f39565O.addAndGet(-r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            if (r1 != 0) goto L_0x0003;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r3.f39564N == false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0.clear();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                e.a.x0.f.a<java.lang.Runnable> r0 = r3.f39568b
                r1 = 1
            L_0x0003:
                boolean r2 = r3.f39564N
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            L_0x000b:
                java.lang.Object r2 = r0.poll()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                if (r2 != 0) goto L_0x0025
                boolean r2 = r3.f39564N
                if (r2 == 0) goto L_0x001b
                r0.clear()
                return
            L_0x001b:
                java.util.concurrent.atomic.AtomicInteger r2 = r3.f39565O
                int r1 = -r1
                int r1 = r2.addAndGet(r1)
                if (r1 != 0) goto L_0x0003
                return
            L_0x0025:
                r2.run()
                boolean r2 = r3.f39564N
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p463g.C13670d.C13673c.run():void");
        }

        @C5937f
        /* renamed from: a */
        public C12314c mo41877a(@C5937f Runnable runnable, long j, @C5937f TimeUnit timeUnit) {
            if (j <= 0) {
                return mo41876a(runnable);
            }
            if (this.f39564N) {
                return C12348e.INSTANCE;
            }
            C12350g gVar = new C12350g();
            C12350g gVar2 = new C12350g(gVar);
            C13690n nVar = new C13690n(new C13675b(gVar2, C12205a.m54881a(runnable)), this.f39566P);
            this.f39566P.mo42072b(nVar);
            Executor executor = this.f39567a;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    nVar.mo43070a(((ScheduledExecutorService) executor).schedule(nVar, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.f39564N = true;
                    C12205a.m54894b((Throwable) e);
                    return C12348e.INSTANCE;
                }
            } else {
                nVar.mo43070a(new C13669c(C13670d.f39558N.mo42023a(nVar, j, timeUnit)));
            }
            gVar.mo42109a(nVar);
            return gVar2;
        }
    }

    public C13670d(@C5937f Executor executor) {
        this.f39559b = executor;
    }

    @C5937f
    /* renamed from: a */
    public C12285c mo41871a() {
        return new C13673c(this.f39559b);
    }

    @C5937f
    /* renamed from: a */
    public C12314c mo42021a(@C5937f Runnable runnable) {
        Runnable a = C12205a.m54881a(runnable);
        try {
            if (this.f39559b instanceof ExecutorService) {
                C13689m mVar = new C13689m(a);
                mVar.mo43036a(((ExecutorService) this.f39559b).submit(mVar));
                return mVar;
            }
            C13674a aVar = new C13674a(a);
            this.f39559b.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e) {
            C12205a.m54894b((Throwable) e);
            return C12348e.INSTANCE;
        }
    }

    @C5937f
    /* renamed from: a */
    public C12314c mo42023a(@C5937f Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable a = C12205a.m54881a(runnable);
        if (this.f39559b instanceof ScheduledExecutorService) {
            try {
                C13689m mVar = new C13689m(a);
                mVar.mo43036a(((ScheduledExecutorService) this.f39559b).schedule(mVar, j, timeUnit));
                return mVar;
            } catch (RejectedExecutionException e) {
                C12205a.m54894b((Throwable) e);
                return C12348e.INSTANCE;
            }
        } else {
            C13672b bVar = new C13672b(a);
            bVar.f39562a.mo42109a(f39558N.mo42023a(new C13671a(bVar), j, timeUnit));
            return bVar;
        }
    }

    @C5937f
    /* renamed from: a */
    public C12314c mo42022a(@C5937f Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.f39559b instanceof ScheduledExecutorService)) {
            return super.mo42022a(runnable, j, j2, timeUnit);
        }
        try {
            C13688l lVar = new C13688l(C12205a.m54881a(runnable));
            lVar.mo43036a(((ScheduledExecutorService) this.f39559b).scheduleAtFixedRate(lVar, j, j2, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e) {
            C12205a.m54894b((Throwable) e);
            return C12348e.INSTANCE;
        }
    }
}
