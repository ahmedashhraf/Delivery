package p195e.p196a;

import java.util.concurrent.TimeUnit;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p199x0.p463g.C13684i;
import p195e.p196a.p199x0.p463g.C13696q;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p441d1.C12227a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.j0 */
/* compiled from: Scheduler */
public abstract class C12282j0 {

    /* renamed from: a */
    static final long f35468a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: e.a.j0$a */
    /* compiled from: Scheduler */
    static final class C12283a implements C12314c, Runnable, C12227a {

        /* renamed from: N */
        Thread f35469N;

        /* renamed from: a */
        final Runnable f35470a;

        /* renamed from: b */
        final C12285c f35471b;

        C12283a(Runnable runnable, C12285c cVar) {
            this.f35470a = runnable;
            this.f35471b = cVar;
        }

        /* renamed from: a */
        public Runnable mo41865a() {
            return this.f35470a;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35471b.mo41878d();
        }

        public void dispose() {
            if (this.f35469N == Thread.currentThread()) {
                C12285c cVar = this.f35471b;
                if (cVar instanceof C13684i) {
                    ((C13684i) cVar).mo43063a();
                    return;
                }
            }
            this.f35471b.dispose();
        }

        public void run() {
            this.f35469N = Thread.currentThread();
            try {
                this.f35470a.run();
            } finally {
                dispose();
                this.f35469N = null;
            }
        }
    }

    /* renamed from: e.a.j0$b */
    /* compiled from: Scheduler */
    static class C12284b implements C12314c, Runnable, C12227a {
        @C5937f

        /* renamed from: N */
        volatile boolean f35472N;

        /* renamed from: a */
        final Runnable f35473a;
        @C5937f

        /* renamed from: b */
        final C12285c f35474b;

        C12284b(@C5937f Runnable runnable, @C5937f C12285c cVar) {
            this.f35473a = runnable;
            this.f35474b = cVar;
        }

        /* renamed from: a */
        public Runnable mo41865a() {
            return this.f35473a;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35472N;
        }

        public void dispose() {
            this.f35472N = true;
            this.f35474b.dispose();
        }

        public void run() {
            if (!this.f35472N) {
                try {
                    this.f35473a.run();
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f35474b.dispose();
                    throw C13754k.m58724c(th);
                }
            }
        }
    }

    /* renamed from: e.a.j0$c */
    /* compiled from: Scheduler */
    public static abstract class C12285c implements C12314c {

        /* renamed from: e.a.j0$c$a */
        /* compiled from: Scheduler */
        final class C12286a implements Runnable, C12227a {

            /* renamed from: N */
            final long f35475N;

            /* renamed from: O */
            long f35476O;

            /* renamed from: P */
            long f35477P;

            /* renamed from: Q */
            long f35478Q;
            @C5937f

            /* renamed from: a */
            final Runnable f35480a;
            @C5937f

            /* renamed from: b */
            final C12350g f35481b;

            C12286a(long j, @C5937f Runnable runnable, long j2, @C5937f C12350g gVar, long j3) {
                this.f35480a = runnable;
                this.f35481b = gVar;
                this.f35475N = j3;
                this.f35477P = j2;
                this.f35478Q = j;
            }

            /* renamed from: a */
            public Runnable mo41865a() {
                return this.f35480a;
            }

            public void run() {
                long j;
                this.f35480a.run();
                if (!this.f35481b.mo41878d()) {
                    long a = C12285c.this.mo41875a(TimeUnit.NANOSECONDS);
                    long j2 = C12282j0.f35468a;
                    long j3 = a + j2;
                    long j4 = this.f35477P;
                    if (j3 >= j4) {
                        long j5 = this.f35475N;
                        if (a < j4 + j5 + j2) {
                            long j6 = this.f35478Q;
                            long j7 = this.f35476O + 1;
                            this.f35476O = j7;
                            j = j6 + (j7 * j5);
                            this.f35477P = a;
                            this.f35481b.mo42109a(C12285c.this.mo41877a(this, j - a, TimeUnit.NANOSECONDS));
                        }
                    }
                    long j8 = this.f35475N;
                    long j9 = a + j8;
                    long j10 = this.f35476O + 1;
                    this.f35476O = j10;
                    this.f35478Q = j9 - (j8 * j10);
                    j = j9;
                    this.f35477P = a;
                    this.f35481b.mo42109a(C12285c.this.mo41877a(this, j - a, TimeUnit.NANOSECONDS));
                }
            }
        }

        @C5937f
        /* renamed from: a */
        public C12314c mo41876a(@C5937f Runnable runnable) {
            return mo41877a(runnable, 0, TimeUnit.NANOSECONDS);
        }

        @C5937f
        /* renamed from: a */
        public abstract C12314c mo41877a(@C5937f Runnable runnable, long j, @C5937f TimeUnit timeUnit);

        @C5937f
        /* renamed from: a */
        public C12314c mo42028a(@C5937f Runnable runnable, long j, long j2, @C5937f TimeUnit timeUnit) {
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            C12350g gVar = new C12350g();
            C12350g gVar2 = new C12350g(gVar);
            Runnable a = C12205a.m54881a(runnable);
            long nanos = timeUnit2.toNanos(j2);
            long a2 = mo41875a(TimeUnit.NANOSECONDS);
            C12350g gVar3 = gVar;
            C12286a aVar = r0;
            C12286a aVar2 = new C12286a(a2 + timeUnit2.toNanos(j3), a, a2, gVar2, nanos);
            C12314c a3 = mo41877a(aVar, j3, timeUnit2);
            if (a3 == C12348e.INSTANCE) {
                return a3;
            }
            gVar3.mo42109a(a3);
            return gVar2;
        }

        /* renamed from: a */
        public long mo41875a(@C5937f TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: e */
    public static long m55340e() {
        return f35468a;
    }

    /* renamed from: a */
    public long mo41870a(@C5937f TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @C5937f
    /* renamed from: a */
    public abstract C12285c mo41871a();

    /* renamed from: b */
    public void mo42024b() {
    }

    /* renamed from: c */
    public void mo42025c() {
    }

    @C5937f
    /* renamed from: a */
    public C12314c mo42021a(@C5937f Runnable runnable) {
        return mo42023a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    @C5937f
    /* renamed from: a */
    public C12314c mo42023a(@C5937f Runnable runnable, long j, @C5937f TimeUnit timeUnit) {
        C12285c a = mo41871a();
        C12283a aVar = new C12283a(C12205a.m54881a(runnable), a);
        a.mo41877a(aVar, j, timeUnit);
        return aVar;
    }

    @C5937f
    /* renamed from: a */
    public C12314c mo42022a(@C5937f Runnable runnable, long j, long j2, @C5937f TimeUnit timeUnit) {
        C12285c a = mo41871a();
        C12284b bVar = new C12284b(C12205a.m54881a(runnable), a);
        C12314c a2 = a.mo42028a(bVar, j, j2, timeUnit);
        return a2 == C12348e.INSTANCE ? a2 : bVar;
    }

    @C5937f
    /* renamed from: a */
    public <S extends C12282j0 & C12314c> S mo42020a(@C5937f C12339o<C5929l<C5929l<C5925c>>, C5925c> oVar) {
        return new C13696q(oVar, this);
    }
}
