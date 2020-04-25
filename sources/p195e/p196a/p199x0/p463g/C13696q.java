package p195e.p196a.p199x0.p463g;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C5925c;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p440c1.C12211c;
import p195e.p196a.p440c1.C12223g;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p447u0.C12315d;
import p195e.p196a.p449w0.C12339o;

@C5936e
/* renamed from: e.a.x0.g.q */
/* compiled from: SchedulerWhen */
public class C13696q extends C12282j0 implements C12314c {

    /* renamed from: P */
    static final C12314c f39629P = new C13704g();

    /* renamed from: Q */
    static final C12314c f39630Q = C12315d.m55413a();

    /* renamed from: N */
    private final C12211c<C5929l<C5925c>> f39631N = C12223g.m55070b0().mo41816Y();

    /* renamed from: O */
    private C12314c f39632O;

    /* renamed from: b */
    private final C12282j0 f39633b;

    /* renamed from: e.a.x0.g.q$a */
    /* compiled from: SchedulerWhen */
    static final class C13697a implements C12339o<C13703f, C5925c> {

        /* renamed from: a */
        final C12285c f39634a;

        /* renamed from: e.a.x0.g.q$a$a */
        /* compiled from: SchedulerWhen */
        final class C13698a extends C5925c {

            /* renamed from: a */
            final C13703f f39635a;

            C13698a(C13703f fVar) {
                this.f39635a = fVar;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void mo24134b(C12268f fVar) {
                fVar.mo41921a(this.f39635a);
                this.f39635a.mo43078a(C13697a.this.f39634a, fVar);
            }
        }

        C13697a(C12285c cVar) {
            this.f39634a = cVar;
        }

        /* renamed from: a */
        public C5925c apply(C13703f fVar) {
            return new C13698a(fVar);
        }
    }

    /* renamed from: e.a.x0.g.q$b */
    /* compiled from: SchedulerWhen */
    static class C13699b extends C13703f {

        /* renamed from: N */
        private final TimeUnit f39637N;

        /* renamed from: a */
        private final Runnable f39638a;

        /* renamed from: b */
        private final long f39639b;

        C13699b(Runnable runnable, long j, TimeUnit timeUnit) {
            this.f39638a = runnable;
            this.f39639b = j;
            this.f39637N = timeUnit;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C12314c mo43076b(C12285c cVar, C12268f fVar) {
            return cVar.mo41877a(new C13701d(this.f39638a, fVar), this.f39639b, this.f39637N);
        }
    }

    /* renamed from: e.a.x0.g.q$c */
    /* compiled from: SchedulerWhen */
    static class C13700c extends C13703f {

        /* renamed from: a */
        private final Runnable f39640a;

        C13700c(Runnable runnable) {
            this.f39640a = runnable;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C12314c mo43076b(C12285c cVar, C12268f fVar) {
            return cVar.mo41876a((Runnable) new C13701d(this.f39640a, fVar));
        }
    }

    /* renamed from: e.a.x0.g.q$d */
    /* compiled from: SchedulerWhen */
    static class C13701d implements Runnable {

        /* renamed from: a */
        final C12268f f39641a;

        /* renamed from: b */
        final Runnable f39642b;

        C13701d(Runnable runnable, C12268f fVar) {
            this.f39642b = runnable;
            this.f39641a = fVar;
        }

        public void run() {
            try {
                this.f39642b.run();
            } finally {
                this.f39641a.onComplete();
            }
        }
    }

    /* renamed from: e.a.x0.g.q$e */
    /* compiled from: SchedulerWhen */
    static final class C13702e extends C12285c {

        /* renamed from: N */
        private final C12285c f39643N;

        /* renamed from: a */
        private final AtomicBoolean f39644a = new AtomicBoolean();

        /* renamed from: b */
        private final C12211c<C13703f> f39645b;

        C13702e(C12211c<C13703f> cVar, C12285c cVar2) {
            this.f39645b = cVar;
            this.f39643N = cVar2;
        }

        @C5937f
        /* renamed from: a */
        public C12314c mo41877a(@C5937f Runnable runnable, long j, @C5937f TimeUnit timeUnit) {
            C13699b bVar = new C13699b(runnable, j, timeUnit);
            this.f39645b.mo41789a(bVar);
            return bVar;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39644a.get();
        }

        public void dispose() {
            if (this.f39644a.compareAndSet(false, true)) {
                this.f39645b.onComplete();
                this.f39643N.dispose();
            }
        }

        @C5937f
        /* renamed from: a */
        public C12314c mo41876a(@C5937f Runnable runnable) {
            C13700c cVar = new C13700c(runnable);
            this.f39645b.mo41789a(cVar);
            return cVar;
        }
    }

    /* renamed from: e.a.x0.g.q$f */
    /* compiled from: SchedulerWhen */
    static abstract class C13703f extends AtomicReference<C12314c> implements C12314c {
        C13703f() {
            super(C13696q.f39629P);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo43078a(C12285c cVar, C12268f fVar) {
            C12314c cVar2 = (C12314c) get();
            if (cVar2 != C13696q.f39630Q && cVar2 == C13696q.f39629P) {
                C12314c b = mo43076b(cVar, fVar);
                if (!compareAndSet(C13696q.f39629P, b)) {
                    b.dispose();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract C12314c mo43076b(C12285c cVar, C12268f fVar);

        /* renamed from: d */
        public boolean mo41878d() {
            return ((C12314c) get()).mo41878d();
        }

        public void dispose() {
            C12314c cVar;
            C12314c cVar2 = C13696q.f39630Q;
            do {
                cVar = (C12314c) get();
                if (cVar == C13696q.f39630Q) {
                    return;
                }
            } while (!compareAndSet(cVar, cVar2));
            if (cVar != C13696q.f39629P) {
                cVar.dispose();
            }
        }
    }

    /* renamed from: e.a.x0.g.q$g */
    /* compiled from: SchedulerWhen */
    static final class C13704g implements C12314c {
        C13704g() {
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return false;
        }

        public void dispose() {
        }
    }

    public C13696q(C12339o<C5929l<C5929l<C5925c>>, C5925c> oVar, C12282j0 j0Var) {
        this.f39633b = j0Var;
        try {
            this.f39632O = ((C5925c) oVar.apply(this.f39631N)).mo24157l();
        } catch (Throwable th) {
            throw C13754k.m58724c(th);
        }
    }

    @C5937f
    /* renamed from: a */
    public C12285c mo41871a() {
        C12285c a = this.f39633b.mo41871a();
        C12211c Y = C12223g.m55070b0().mo41816Y();
        C5929l u = Y.mo24598u((C12339o<? super T, ? extends R>) new C13697a<Object,Object>(a));
        C13702e eVar = new C13702e(Y, a);
        this.f39631N.mo41789a(u);
        return eVar;
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return this.f39632O.mo41878d();
    }

    public void dispose() {
        this.f39632O.dispose();
    }
}
