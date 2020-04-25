package p195e.p196a.p199x0.p463g;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p447u0.C12315d;

/* renamed from: e.a.x0.g.s */
/* compiled from: TrampolineScheduler */
public final class C13707s extends C12282j0 {

    /* renamed from: b */
    private static final C13707s f39655b = new C13707s();

    /* renamed from: e.a.x0.g.s$a */
    /* compiled from: TrampolineScheduler */
    static final class C13708a implements Runnable {

        /* renamed from: N */
        private final long f39656N;

        /* renamed from: a */
        private final Runnable f39657a;

        /* renamed from: b */
        private final C13710c f39658b;

        C13708a(Runnable runnable, C13710c cVar, long j) {
            this.f39657a = runnable;
            this.f39658b = cVar;
            this.f39656N = j;
        }

        public void run() {
            if (!this.f39658b.f39664O) {
                long a = this.f39658b.mo41875a(TimeUnit.MILLISECONDS);
                long j = this.f39656N;
                if (j > a) {
                    try {
                        Thread.sleep(j - a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        C12205a.m54894b((Throwable) e);
                        return;
                    }
                }
                if (!this.f39658b.f39664O) {
                    this.f39657a.run();
                }
            }
        }
    }

    /* renamed from: e.a.x0.g.s$b */
    /* compiled from: TrampolineScheduler */
    static final class C13709b implements Comparable<C13709b> {

        /* renamed from: N */
        final int f39659N;

        /* renamed from: O */
        volatile boolean f39660O;

        /* renamed from: a */
        final Runnable f39661a;

        /* renamed from: b */
        final long f39662b;

        C13709b(Runnable runnable, Long l, int i) {
            this.f39661a = runnable;
            this.f39662b = l.longValue();
            this.f39659N = i;
        }

        /* renamed from: a */
        public int compareTo(C13709b bVar) {
            int a = C12390b.m55559a(this.f39662b, bVar.f39662b);
            return a == 0 ? C12390b.m55557a(this.f39659N, bVar.f39659N) : a;
        }
    }

    /* renamed from: e.a.x0.g.s$c */
    /* compiled from: TrampolineScheduler */
    static final class C13710c extends C12285c implements C12314c {

        /* renamed from: N */
        final AtomicInteger f39663N = new AtomicInteger();

        /* renamed from: O */
        volatile boolean f39664O;

        /* renamed from: a */
        final PriorityBlockingQueue<C13709b> f39665a = new PriorityBlockingQueue<>();

        /* renamed from: b */
        private final AtomicInteger f39666b = new AtomicInteger();

        /* renamed from: e.a.x0.g.s$c$a */
        /* compiled from: TrampolineScheduler */
        final class C13711a implements Runnable {

            /* renamed from: a */
            final C13709b f39667a;

            C13711a(C13709b bVar) {
                this.f39667a = bVar;
            }

            public void run() {
                C13709b bVar = this.f39667a;
                bVar.f39660O = true;
                C13710c.this.f39665a.remove(bVar);
            }
        }

        C13710c() {
        }

        @C5937f
        /* renamed from: a */
        public C12314c mo41876a(@C5937f Runnable runnable) {
            return mo43082a(runnable, mo41875a(TimeUnit.MILLISECONDS));
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39664O;
        }

        public void dispose() {
            this.f39664O = true;
        }

        @C5937f
        /* renamed from: a */
        public C12314c mo41877a(@C5937f Runnable runnable, long j, @C5937f TimeUnit timeUnit) {
            long a = mo41875a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return mo43082a(new C13708a(runnable, this, a), a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C12314c mo43082a(Runnable runnable, long j) {
            if (this.f39664O) {
                return C12348e.INSTANCE;
            }
            C13709b bVar = new C13709b(runnable, Long.valueOf(j), this.f39663N.incrementAndGet());
            this.f39665a.add(bVar);
            if (this.f39666b.getAndIncrement() != 0) {
                return C12315d.m55416a((Runnable) new C13711a(bVar));
            }
            int i = 1;
            while (!this.f39664O) {
                C13709b bVar2 = (C13709b) this.f39665a.poll();
                if (bVar2 == null) {
                    i = this.f39666b.addAndGet(-i);
                    if (i == 0) {
                        return C12348e.INSTANCE;
                    }
                } else if (!bVar2.f39660O) {
                    bVar2.f39661a.run();
                }
            }
            this.f39665a.clear();
            return C12348e.INSTANCE;
        }
    }

    C13707s() {
    }

    /* renamed from: f */
    public static C13707s m58559f() {
        return f39655b;
    }

    @C5937f
    /* renamed from: a */
    public C12285c mo41871a() {
        return new C13710c();
    }

    @C5937f
    /* renamed from: a */
    public C12314c mo42021a(@C5937f Runnable runnable) {
        C12205a.m54881a(runnable).run();
        return C12348e.INSTANCE;
    }

    @C5937f
    /* renamed from: a */
    public C12314c mo42023a(@C5937f Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C12205a.m54881a(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C12205a.m54894b((Throwable) e);
        }
        return C12348e.INSTANCE;
    }
}
