package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.Callable;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12327c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.z2 */
/* compiled from: ObservableScanSeed */
public final class C13506z2<T, R> extends C13131a<T, R> {

    /* renamed from: N */
    final Callable<R> f39116N;

    /* renamed from: b */
    final C12327c<R, ? super T, R> f39117b;

    /* renamed from: e.a.x0.e.e.z2$a */
    /* compiled from: ObservableScanSeed */
    static final class C13507a<T, R> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        R f39118N;

        /* renamed from: O */
        C12314c f39119O;

        /* renamed from: P */
        boolean f39120P;

        /* renamed from: a */
        final C12280i0<? super R> f39121a;

        /* renamed from: b */
        final C12327c<R, ? super T, R> f39122b;

        C13507a(C12280i0<? super R> i0Var, C12327c<R, ? super T, R> cVar, R r) {
            this.f39121a = i0Var;
            this.f39122b = cVar;
            this.f39118N = r;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f39119O, cVar)) {
                this.f39119O = cVar;
                this.f39121a.mo34123a((C12314c) this);
                this.f39121a.mo33453a(this.f39118N);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f39119O.mo41878d();
        }

        public void dispose() {
            this.f39119O.dispose();
        }

        public void onComplete() {
            if (!this.f39120P) {
                this.f39120P = true;
                this.f39121a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f39120P) {
                C12205a.m54894b(th);
                return;
            }
            this.f39120P = true;
            this.f39121a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f39120P) {
                try {
                    R a = C12390b.m55563a(this.f39122b.mo35569a(this.f39118N, t), "The accumulator returned a null value");
                    this.f39118N = a;
                    this.f39121a.mo33453a(a);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f39119O.dispose();
                    onError(th);
                }
            }
        }
    }

    public C13506z2(C5926g0<T> g0Var, Callable<R> callable, C12327c<R, ? super T, R> cVar) {
        super(g0Var);
        this.f39117b = cVar;
        this.f39116N = callable;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        try {
            this.f37851a.mo23893a(new C13507a(i0Var, this.f39117b, C12390b.m55563a(this.f39116N.call(), "The seed supplied is null")));
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55476a(th, i0Var);
        }
    }
}
