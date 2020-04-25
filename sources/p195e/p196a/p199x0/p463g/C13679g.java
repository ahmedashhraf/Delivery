package p195e.p196a.p199x0.p463g;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.g.g */
/* compiled from: IoScheduler */
public final class C13679g extends C12282j0 {

    /* renamed from: O */
    private static final String f39582O = "RxCachedThreadScheduler";

    /* renamed from: P */
    static final C13686k f39583P;

    /* renamed from: Q */
    private static final String f39584Q = "RxCachedWorkerPoolEvictor";

    /* renamed from: R */
    static final C13686k f39585R;

    /* renamed from: S */
    private static final long f39586S = 60;

    /* renamed from: T */
    private static final TimeUnit f39587T = TimeUnit.SECONDS;

    /* renamed from: U */
    static final C13682c f39588U = new C13682c(new C13686k("RxCachedThreadSchedulerShutdown"));

    /* renamed from: V */
    private static final String f39589V = "rx2.io-priority";

    /* renamed from: W */
    static final C13680a f39590W = new C13680a(0, null, f39583P);

    /* renamed from: N */
    final AtomicReference<C13680a> f39591N;

    /* renamed from: b */
    final ThreadFactory f39592b;

    /* renamed from: e.a.x0.g.g$a */
    /* compiled from: IoScheduler */
    static final class C13680a implements Runnable {

        /* renamed from: N */
        final C12313b f39593N;

        /* renamed from: O */
        private final ScheduledExecutorService f39594O;

        /* renamed from: P */
        private final Future<?> f39595P;

        /* renamed from: Q */
        private final ThreadFactory f39596Q;

        /* renamed from: a */
        private final long f39597a;

        /* renamed from: b */
        private final ConcurrentLinkedQueue<C13682c> f39598b;

        C13680a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            Future<?> future;
            this.f39597a = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f39598b = new ConcurrentLinkedQueue<>();
            this.f39593N = new C12313b();
            this.f39596Q = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C13679g.f39585R);
                long j2 = this.f39597a;
                future = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                future = null;
            }
            this.f39594O = scheduledExecutorService;
            this.f39595P = future;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo43055a(C13682c cVar) {
            cVar.mo43060a(mo43057c() + this.f39597a);
            this.f39598b.offer(cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C13682c mo43056b() {
            if (this.f39593N.mo41878d()) {
                return C13679g.f39588U;
            }
            while (!this.f39598b.isEmpty()) {
                C13682c cVar = (C13682c) this.f39598b.poll();
                if (cVar != null) {
                    return cVar;
                }
            }
            C13682c cVar2 = new C13682c(this.f39596Q);
            this.f39593N.mo42072b(cVar2);
            return cVar2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public long mo43057c() {
            return System.nanoTime();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo43058d() {
            this.f39593N.dispose();
            Future<?> future = this.f39595P;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f39594O;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        public void run() {
            mo43054a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo43054a() {
            if (!this.f39598b.isEmpty()) {
                long c = mo43057c();
                Iterator it = this.f39598b.iterator();
                while (it.hasNext()) {
                    C13682c cVar = (C13682c) it.next();
                    if (cVar.mo43061b() > c) {
                        return;
                    }
                    if (this.f39598b.remove(cVar)) {
                        this.f39593N.mo42069a((C12314c) cVar);
                    }
                }
            }
        }
    }

    /* renamed from: e.a.x0.g.g$b */
    /* compiled from: IoScheduler */
    static final class C13681b extends C12285c {

        /* renamed from: N */
        private final C13682c f39599N;

        /* renamed from: O */
        final AtomicBoolean f39600O = new AtomicBoolean();

        /* renamed from: a */
        private final C12313b f39601a;

        /* renamed from: b */
        private final C13680a f39602b;

        C13681b(C13680a aVar) {
            this.f39602b = aVar;
            this.f39601a = new C12313b();
            this.f39599N = aVar.mo43056b();
        }

        @C5937f
        /* renamed from: a */
        public C12314c mo41877a(@C5937f Runnable runnable, long j, @C5937f TimeUnit timeUnit) {
            if (this.f39601a.mo41878d()) {
                return C12348e.INSTANCE;
            }
            return this.f39599N.mo43062a(runnable, j, timeUnit, this.f39601a);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39600O.get();
        }

        public void dispose() {
            if (this.f39600O.compareAndSet(false, true)) {
                this.f39601a.dispose();
                this.f39602b.mo43055a(this.f39599N);
            }
        }
    }

    /* renamed from: e.a.x0.g.g$c */
    /* compiled from: IoScheduler */
    static final class C13682c extends C13684i {

        /* renamed from: N */
        private long f39603N = 0;

        C13682c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: a */
        public void mo43060a(long j) {
            this.f39603N = j;
        }

        /* renamed from: b */
        public long mo43061b() {
            return this.f39603N;
        }
    }

    static {
        f39588U.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger(f39589V, 5).intValue()));
        f39583P = new C13686k(f39582O, max);
        f39585R = new C13686k(f39584Q, max);
        f39590W.mo43058d();
    }

    public C13679g() {
        this(f39583P);
    }

    @C5937f
    /* renamed from: a */
    public C12285c mo41871a() {
        return new C13681b((C13680a) this.f39591N.get());
    }

    /* renamed from: b */
    public void mo42024b() {
        C13680a aVar;
        C13680a aVar2;
        do {
            aVar = (C13680a) this.f39591N.get();
            aVar2 = f39590W;
            if (aVar == aVar2) {
                return;
            }
        } while (!this.f39591N.compareAndSet(aVar, aVar2));
        aVar.mo43058d();
    }

    /* renamed from: c */
    public void mo42025c() {
        C13680a aVar = new C13680a(f39586S, f39587T, this.f39592b);
        if (!this.f39591N.compareAndSet(f39590W, aVar)) {
            aVar.mo43058d();
        }
    }

    /* renamed from: f */
    public int mo43053f() {
        return ((C13680a) this.f39591N.get()).f39593N.mo42071b();
    }

    public C13679g(ThreadFactory threadFactory) {
        this.f39592b = threadFactory;
        this.f39591N = new AtomicReference<>(f39590W);
        mo42025c();
    }
}
