package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.TimeUnit;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p467z0.C13795m;

/* renamed from: e.a.x0.e.e.g0 */
/* compiled from: ObservableDelay */
public final class C13215g0<T> extends C13131a<T, T> {

    /* renamed from: N */
    final TimeUnit f38139N;

    /* renamed from: O */
    final C12282j0 f38140O;

    /* renamed from: P */
    final boolean f38141P;

    /* renamed from: b */
    final long f38142b;

    /* renamed from: e.a.x0.e.e.g0$a */
    /* compiled from: ObservableDelay */
    static final class C13216a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        final TimeUnit f38143N;

        /* renamed from: O */
        final C12285c f38144O;

        /* renamed from: P */
        final boolean f38145P;

        /* renamed from: Q */
        C12314c f38146Q;

        /* renamed from: a */
        final C12280i0<? super T> f38147a;

        /* renamed from: b */
        final long f38148b;

        /* renamed from: e.a.x0.e.e.g0$a$a */
        /* compiled from: ObservableDelay */
        final class C13217a implements Runnable {
            C13217a() {
            }

            public void run() {
                try {
                    C13216a.this.f38147a.onComplete();
                } finally {
                    C13216a.this.f38144O.dispose();
                }
            }
        }

        /* renamed from: e.a.x0.e.e.g0$a$b */
        /* compiled from: ObservableDelay */
        final class C13218b implements Runnable {

            /* renamed from: a */
            private final Throwable f38150a;

            C13218b(Throwable th) {
                this.f38150a = th;
            }

            public void run() {
                try {
                    C13216a.this.f38147a.onError(this.f38150a);
                } finally {
                    C13216a.this.f38144O.dispose();
                }
            }
        }

        /* renamed from: e.a.x0.e.e.g0$a$c */
        /* compiled from: ObservableDelay */
        final class C13219c implements Runnable {

            /* renamed from: a */
            private final T f38152a;

            C13219c(T t) {
                this.f38152a = t;
            }

            public void run() {
                C13216a.this.f38147a.mo33453a(this.f38152a);
            }
        }

        C13216a(C12280i0<? super T> i0Var, long j, TimeUnit timeUnit, C12285c cVar, boolean z) {
            this.f38147a = i0Var;
            this.f38148b = j;
            this.f38143N = timeUnit;
            this.f38144O = cVar;
            this.f38145P = z;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38146Q, cVar)) {
                this.f38146Q = cVar;
                this.f38147a.mo34123a((C12314c) this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38144O.mo41878d();
        }

        public void dispose() {
            this.f38146Q.dispose();
            this.f38144O.dispose();
        }

        public void onComplete() {
            this.f38144O.mo41877a(new C13217a(), this.f38148b, this.f38143N);
        }

        public void onError(Throwable th) {
            this.f38144O.mo41877a(new C13218b(th), this.f38145P ? this.f38148b : 0, this.f38143N);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f38144O.mo41877a(new C13219c(t), this.f38148b, this.f38143N);
        }
    }

    public C13215g0(C5926g0<T> g0Var, long j, TimeUnit timeUnit, C12282j0 j0Var, boolean z) {
        super(g0Var);
        this.f38142b = j;
        this.f38139N = timeUnit;
        this.f38140O = j0Var;
        this.f38141P = z;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        C12280i0<? super T> i0Var2;
        if (this.f38141P) {
            i0Var2 = i0Var;
        } else {
            i0Var2 = new C13795m<>(i0Var);
        }
        C12285c a = this.f38140O.mo41871a();
        C5926g0<T> g0Var = this.f37851a;
        C13216a aVar = new C13216a(i0Var2, this.f38142b, this.f38139N, a, this.f38141P);
        g0Var.mo23893a(aVar);
    }
}
