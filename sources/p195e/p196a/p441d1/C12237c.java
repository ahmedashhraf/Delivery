package p195e.p196a.p441d1;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p447u0.C12315d;

/* renamed from: e.a.d1.c */
/* compiled from: TestScheduler */
public final class C12237c extends C12282j0 {

    /* renamed from: N */
    long f35340N;

    /* renamed from: O */
    volatile long f35341O;

    /* renamed from: b */
    final Queue<C12240b> f35342b = new PriorityBlockingQueue(11);

    /* renamed from: e.a.d1.c$a */
    /* compiled from: TestScheduler */
    final class C12238a extends C12285c {

        /* renamed from: a */
        volatile boolean f35343a;

        /* renamed from: e.a.d1.c$a$a */
        /* compiled from: TestScheduler */
        final class C12239a implements Runnable {

            /* renamed from: a */
            final C12240b f35345a;

            C12239a(C12240b bVar) {
                this.f35345a = bVar;
            }

            public void run() {
                C12237c.this.f35342b.remove(this.f35345a);
            }
        }

        C12238a() {
        }

        @C5937f
        /* renamed from: a */
        public C12314c mo41877a(@C5937f Runnable runnable, long j, @C5937f TimeUnit timeUnit) {
            if (this.f35343a) {
                return C12348e.INSTANCE;
            }
            long nanos = C12237c.this.f35341O + timeUnit.toNanos(j);
            C12237c cVar = C12237c.this;
            long j2 = cVar.f35340N;
            cVar.f35340N = 1 + j2;
            C12240b bVar = new C12240b(this, nanos, runnable, j2);
            C12237c.this.f35342b.add(bVar);
            return C12315d.m55416a((Runnable) new C12239a(bVar));
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35343a;
        }

        public void dispose() {
            this.f35343a = true;
        }

        @C5937f
        /* renamed from: a */
        public C12314c mo41876a(@C5937f Runnable runnable) {
            if (this.f35343a) {
                return C12348e.INSTANCE;
            }
            C12237c cVar = C12237c.this;
            long j = cVar.f35340N;
            cVar.f35340N = 1 + j;
            C12240b bVar = new C12240b(this, 0, runnable, j);
            C12237c.this.f35342b.add(bVar);
            return C12315d.m55416a((Runnable) new C12239a(bVar));
        }

        /* renamed from: a */
        public long mo41875a(@C5937f TimeUnit timeUnit) {
            return C12237c.this.mo41870a(timeUnit);
        }
    }

    /* renamed from: e.a.d1.c$b */
    /* compiled from: TestScheduler */
    static final class C12240b implements Comparable<C12240b> {

        /* renamed from: N */
        final C12238a f35347N;

        /* renamed from: O */
        final long f35348O;

        /* renamed from: a */
        final long f35349a;

        /* renamed from: b */
        final Runnable f35350b;

        C12240b(C12238a aVar, long j, Runnable runnable, long j2) {
            this.f35349a = j;
            this.f35350b = runnable;
            this.f35347N = aVar;
            this.f35348O = j2;
        }

        /* renamed from: a */
        public int compareTo(C12240b bVar) {
            long j = this.f35349a;
            long j2 = bVar.f35349a;
            if (j == j2) {
                return C12390b.m55559a(this.f35348O, bVar.f35348O);
            }
            return C12390b.m55559a(j, j2);
        }

        public String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", new Object[]{Long.valueOf(this.f35349a), this.f35350b.toString()});
        }
    }

    public C12237c() {
    }

    /* renamed from: a */
    public long mo41870a(@C5937f TimeUnit timeUnit) {
        return timeUnit.convert(this.f35341O, TimeUnit.NANOSECONDS);
    }

    /* renamed from: b */
    public void mo41873b(long j, TimeUnit timeUnit) {
        m55100a(timeUnit.toNanos(j));
    }

    /* renamed from: f */
    public void mo41874f() {
        m55100a(this.f35341O);
    }

    /* renamed from: a */
    public void mo41872a(long j, TimeUnit timeUnit) {
        mo41873b(this.f35341O + timeUnit.toNanos(j), TimeUnit.NANOSECONDS);
    }

    public C12237c(long j, TimeUnit timeUnit) {
        this.f35341O = timeUnit.toNanos(j);
    }

    /* renamed from: a */
    private void m55100a(long j) {
        while (true) {
            C12240b bVar = (C12240b) this.f35342b.peek();
            if (bVar == null) {
                break;
            }
            long j2 = bVar.f35349a;
            if (j2 > j) {
                break;
            }
            if (j2 == 0) {
                j2 = this.f35341O;
            }
            this.f35341O = j2;
            this.f35342b.remove(bVar);
            if (!bVar.f35347N.f35343a) {
                bVar.f35350b.run();
            }
        }
        this.f35341O = j;
    }

    @C5937f
    /* renamed from: a */
    public C12285c mo41871a() {
        return new C12238a();
    }
}
