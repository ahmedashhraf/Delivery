package p195e.p196a.p199x0.p454e.p461g;

import java.util.concurrent.TimeUnit;
import p195e.p196a.C12282j0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.g.f */
/* compiled from: SingleDelay */
public final class C13580f<T> extends C5928k0<T> {

    /* renamed from: N */
    final TimeUnit f39330N;

    /* renamed from: O */
    final C12282j0 f39331O;

    /* renamed from: P */
    final boolean f39332P;

    /* renamed from: a */
    final C5930q0<? extends T> f39333a;

    /* renamed from: b */
    final long f39334b;

    /* renamed from: e.a.x0.e.g.f$a */
    /* compiled from: SingleDelay */
    final class C13581a implements C12292n0<T> {

        /* renamed from: a */
        private final C12350g f39336a;

        /* renamed from: b */
        final C12292n0<? super T> f39337b;

        /* renamed from: e.a.x0.e.g.f$a$a */
        /* compiled from: SingleDelay */
        final class C13582a implements Runnable {

            /* renamed from: a */
            private final Throwable f39338a;

            C13582a(Throwable th) {
                this.f39338a = th;
            }

            public void run() {
                C13581a.this.f39337b.onError(this.f39338a);
            }
        }

        /* renamed from: e.a.x0.e.g.f$a$b */
        /* compiled from: SingleDelay */
        final class C13583b implements Runnable {

            /* renamed from: a */
            private final T f39340a;

            C13583b(T t) {
                this.f39340a = t;
            }

            public void run() {
                C13581a.this.f39337b.onSuccess(this.f39340a);
            }
        }

        C13581a(C12350g gVar, C12292n0<? super T> n0Var) {
            this.f39336a = gVar;
            this.f39337b = n0Var;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            this.f39336a.mo42109a(cVar);
        }

        public void onError(Throwable th) {
            C12350g gVar = this.f39336a;
            C12282j0 j0Var = C13580f.this.f39331O;
            C13582a aVar = new C13582a(th);
            C13580f fVar = C13580f.this;
            gVar.mo42109a(j0Var.mo42023a(aVar, fVar.f39332P ? fVar.f39334b : 0, C13580f.this.f39330N));
        }

        public void onSuccess(T t) {
            C12350g gVar = this.f39336a;
            C12282j0 j0Var = C13580f.this.f39331O;
            C13583b bVar = new C13583b(t);
            C13580f fVar = C13580f.this;
            gVar.mo42109a(j0Var.mo42023a(bVar, fVar.f39334b, fVar.f39330N));
        }
    }

    public C13580f(C5930q0<? extends T> q0Var, long j, TimeUnit timeUnit, C12282j0 j0Var, boolean z) {
        this.f39333a = q0Var;
        this.f39334b = j;
        this.f39330N = timeUnit;
        this.f39331O = j0Var;
        this.f39332P = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super T> n0Var) {
        C12350g gVar = new C12350g();
        n0Var.mo41974a(gVar);
        this.f39333a.mo24192a(new C13581a(gVar, n0Var));
    }
}
