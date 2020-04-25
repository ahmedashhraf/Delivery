package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5926g0;
import p195e.p196a.C5928k0;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12327c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.l2 */
/* compiled from: ObservableReduceSeedSingle */
public final class C13301l2<T, R> extends C5928k0<R> {

    /* renamed from: N */
    final C12327c<R, ? super T, R> f38438N;

    /* renamed from: a */
    final C5926g0<T> f38439a;

    /* renamed from: b */
    final R f38440b;

    /* renamed from: e.a.x0.e.e.l2$a */
    /* compiled from: ObservableReduceSeedSingle */
    static final class C13302a<T, R> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        R f38441N;

        /* renamed from: O */
        C12314c f38442O;

        /* renamed from: a */
        final C12292n0<? super R> f38443a;

        /* renamed from: b */
        final C12327c<R, ? super T, R> f38444b;

        C13302a(C12292n0<? super R> n0Var, C12327c<R, ? super T, R> cVar, R r) {
            this.f38443a = n0Var;
            this.f38441N = r;
            this.f38444b = cVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38442O, cVar)) {
                this.f38442O = cVar;
                this.f38443a.mo41974a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38442O.mo41878d();
        }

        public void dispose() {
            this.f38442O.dispose();
        }

        public void onComplete() {
            R r = this.f38441N;
            if (r != null) {
                this.f38441N = null;
                this.f38443a.onSuccess(r);
            }
        }

        public void onError(Throwable th) {
            if (this.f38441N != null) {
                this.f38441N = null;
                this.f38443a.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            R r = this.f38441N;
            if (r != null) {
                try {
                    this.f38441N = C12390b.m55563a(this.f38444b.mo35569a(r, t), "The reducer returned a null value");
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    this.f38442O.dispose();
                    onError(th);
                }
            }
        }
    }

    public C13301l2(C5926g0<T> g0Var, R r, C12327c<R, ? super T, R> cVar) {
        this.f38439a = g0Var;
        this.f38440b = r;
        this.f38438N = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super R> n0Var) {
        this.f38439a.mo23893a(new C13302a(n0Var, this.f38438N, this.f38440b));
    }
}
