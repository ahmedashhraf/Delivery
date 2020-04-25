package p195e.p196a.p199x0.p463g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p450a.C12349f;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p463g.C13691o.C13692a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.g.b */
/* compiled from: ComputationScheduler */
public final class C13665b extends C12282j0 implements C13691o {

    /* renamed from: O */
    static final C13667b f39540O = new C13667b(0, f39542Q);

    /* renamed from: P */
    private static final String f39541P = "RxComputationThreadPool";

    /* renamed from: Q */
    static final C13686k f39542Q = new C13686k(f39541P, Math.max(1, Math.min(10, Integer.getInteger(f39546U, 5).intValue())), true);

    /* renamed from: R */
    static final String f39543R = "rx2.computation-threads";

    /* renamed from: S */
    static final int f39544S = m58471a(Runtime.getRuntime().availableProcessors(), Integer.getInteger(f39543R, 0).intValue());

    /* renamed from: T */
    static final C13668c f39545T = new C13668c(new C13686k("RxComputationShutdown"));

    /* renamed from: U */
    private static final String f39546U = "rx2.computation-priority";

    /* renamed from: N */
    final AtomicReference<C13667b> f39547N;

    /* renamed from: b */
    final ThreadFactory f39548b;

    /* renamed from: e.a.x0.g.b$a */
    /* compiled from: ComputationScheduler */
    static final class C13666a extends C12285c {

        /* renamed from: N */
        private final C12349f f39549N = new C12349f();

        /* renamed from: O */
        private final C13668c f39550O;

        /* renamed from: P */
        volatile boolean f39551P;

        /* renamed from: a */
        private final C12349f f39552a = new C12349f();

        /* renamed from: b */
        private final C12313b f39553b = new C12313b();

        C13666a(C13668c cVar) {
            this.f39550O = cVar;
            this.f39549N.mo42072b(this.f39552a);
            this.f39549N.mo42072b(this.f39553b);
        }

        @C5937f
        /* renamed from: a */
        public C12314c mo41876a(@C5937f Runnable runnable) {
            if (this.f39551P) {
                return C12348e.INSTANCE;
            }
            return this.f39550O.mo43062a(runnable, 0, TimeUnit.MILLISECONDS, this.f39552a);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39551P;
        }

        public void dispose() {
            if (!this.f39551P) {
                this.f39551P = true;
                this.f39549N.dispose();
            }
        }

        @C5937f
        /* renamed from: a */
        public C12314c mo41877a(@C5937f Runnable runnable, long j, @C5937f TimeUnit timeUnit) {
            if (this.f39551P) {
                return C12348e.INSTANCE;
            }
            return this.f39550O.mo43062a(runnable, j, timeUnit, this.f39553b);
        }
    }

    /* renamed from: e.a.x0.g.b$b */
    /* compiled from: ComputationScheduler */
    static final class C13667b implements C13691o {

        /* renamed from: N */
        long f39554N;

        /* renamed from: a */
        final int f39555a;

        /* renamed from: b */
        final C13668c[] f39556b;

        C13667b(int i, ThreadFactory threadFactory) {
            this.f39555a = i;
            this.f39556b = new C13668c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f39556b[i2] = new C13668c(threadFactory);
            }
        }

        /* renamed from: a */
        public C13668c mo43038a() {
            int i = this.f39555a;
            if (i == 0) {
                return C13665b.f39545T;
            }
            C13668c[] cVarArr = this.f39556b;
            long j = this.f39554N;
            this.f39554N = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        /* renamed from: b */
        public void mo43039b() {
            for (C13668c dispose : this.f39556b) {
                dispose.dispose();
            }
        }

        /* renamed from: a */
        public void mo43037a(int i, C13692a aVar) {
            int i2 = this.f39555a;
            if (i2 == 0) {
                for (int i3 = 0; i3 < i; i3++) {
                    aVar.mo42982a(i3, C13665b.f39545T);
                }
                return;
            }
            int i4 = ((int) this.f39554N) % i2;
            for (int i5 = 0; i5 < i; i5++) {
                aVar.mo42982a(i5, new C13666a(this.f39556b[i4]));
                i4++;
                if (i4 == i2) {
                    i4 = 0;
                }
            }
            this.f39554N = (long) i4;
        }
    }

    /* renamed from: e.a.x0.g.b$c */
    /* compiled from: ComputationScheduler */
    static final class C13668c extends C13684i {
        C13668c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        f39545T.dispose();
        f39540O.mo43039b();
    }

    public C13665b() {
        this(f39542Q);
    }

    /* renamed from: a */
    static int m58471a(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    @C5937f
    /* renamed from: a */
    public C12285c mo41871a() {
        return new C13666a(((C13667b) this.f39547N.get()).mo43038a());
    }

    /* renamed from: b */
    public void mo42024b() {
        C13667b bVar;
        C13667b bVar2;
        do {
            bVar = (C13667b) this.f39547N.get();
            bVar2 = f39540O;
            if (bVar == bVar2) {
                return;
            }
        } while (!this.f39547N.compareAndSet(bVar, bVar2));
        bVar.mo43039b();
    }

    /* renamed from: c */
    public void mo42025c() {
        C13667b bVar = new C13667b(f39544S, this.f39548b);
        if (!this.f39547N.compareAndSet(f39540O, bVar)) {
            bVar.mo43039b();
        }
    }

    public C13665b(ThreadFactory threadFactory) {
        this.f39548b = threadFactory;
        this.f39547N = new AtomicReference<>(f39540O);
        mo42025c();
    }

    /* renamed from: a */
    public void mo43037a(int i, C13692a aVar) {
        C12390b.m55558a(i, "number > 0 required");
        ((C13667b) this.f39547N.get()).mo43037a(i, aVar);
    }

    @C5937f
    /* renamed from: a */
    public C12314c mo42023a(@C5937f Runnable runnable, long j, TimeUnit timeUnit) {
        return ((C13667b) this.f39547N.get()).mo43038a().mo43065b(runnable, j, timeUnit);
    }

    @C5937f
    /* renamed from: a */
    public C12314c mo42022a(@C5937f Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((C13667b) this.f39547N.get()).mo43038a().mo43064b(runnable, j, j2, timeUnit);
    }
}
