package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.Callable;
import p195e.p196a.C12280i0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.C5928k0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12395d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12326b;

/* renamed from: e.a.x0.e.e.t */
/* compiled from: ObservableCollectSingle */
public final class C13420t<T, U> extends C5928k0<U> implements C12395d<U> {

    /* renamed from: N */
    final C12326b<? super U, ? super T> f38822N;

    /* renamed from: a */
    final C5926g0<T> f38823a;

    /* renamed from: b */
    final Callable<? extends U> f38824b;

    /* renamed from: e.a.x0.e.e.t$a */
    /* compiled from: ObservableCollectSingle */
    static final class C13421a<T, U> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        final U f38825N;

        /* renamed from: O */
        C12314c f38826O;

        /* renamed from: P */
        boolean f38827P;

        /* renamed from: a */
        final C12292n0<? super U> f38828a;

        /* renamed from: b */
        final C12326b<? super U, ? super T> f38829b;

        C13421a(C12292n0<? super U> n0Var, U u, C12326b<? super U, ? super T> bVar) {
            this.f38828a = n0Var;
            this.f38829b = bVar;
            this.f38825N = u;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38826O, cVar)) {
                this.f38826O = cVar;
                this.f38828a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38826O.mo41878d();
        }

        public void dispose() {
            this.f38826O.dispose();
        }

        public void onComplete() {
            if (!this.f38827P) {
                this.f38827P = true;
                this.f38828a.onSuccess(this.f38825N);
            }
        }

        public void onError(Throwable th) {
            if (this.f38827P) {
                C12205a.m54894b(th);
                return;
            }
            this.f38827P = true;
            this.f38828a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38827P) {
                try {
                    this.f38829b.mo42088a(this.f38825N, t);
                } catch (Throwable th) {
                    this.f38826O.dispose();
                    onError(th);
                }
            }
        }
    }

    public C13420t(C5926g0<T> g0Var, Callable<? extends U> callable, C12326b<? super U, ? super T> bVar) {
        this.f38823a = g0Var;
        this.f38824b = callable;
        this.f38822N = bVar;
    }

    /* renamed from: a */
    public C5923b0<U> mo42141a() {
        return C12205a.m54862a((C5923b0<T>) new C13411s<T>(this.f38823a, this.f38824b, this.f38822N));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super U> n0Var) {
        try {
            this.f38823a.mo23893a(new C13421a(n0Var, C12390b.m55563a(this.f38824b.call(), "The initialSupplier returned a null value"), this.f38822N));
        } catch (Throwable th) {
            C12348e.m55477a(th, n0Var);
        }
    }
}
