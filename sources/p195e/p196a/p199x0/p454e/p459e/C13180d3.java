package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C12321v;
import p195e.p196a.C5926g0;
import p195e.p196a.C5931s;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.d3 */
/* compiled from: ObservableSingleMaybe */
public final class C13180d3<T> extends C5931s<T> {

    /* renamed from: a */
    final C5926g0<T> f38012a;

    /* renamed from: e.a.x0.e.e.d3$a */
    /* compiled from: ObservableSingleMaybe */
    static final class C13181a<T> implements C12280i0<T>, C12314c {

        /* renamed from: N */
        T f38013N;

        /* renamed from: O */
        boolean f38014O;

        /* renamed from: a */
        final C12321v<? super T> f38015a;

        /* renamed from: b */
        C12314c f38016b;

        C13181a(C12321v<? super T> vVar) {
            this.f38015a = vVar;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55464a(this.f38016b, cVar)) {
                this.f38016b = cVar;
                this.f38015a.mo41931a(this);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38016b.mo41878d();
        }

        public void dispose() {
            this.f38016b.dispose();
        }

        public void onComplete() {
            if (!this.f38014O) {
                this.f38014O = true;
                T t = this.f38013N;
                this.f38013N = null;
                if (t == null) {
                    this.f38015a.onComplete();
                } else {
                    this.f38015a.onSuccess(t);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f38014O) {
                C12205a.m54894b(th);
                return;
            }
            this.f38014O = true;
            this.f38015a.onError(th);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38014O) {
                if (this.f38013N != null) {
                    this.f38014O = true;
                    this.f38016b.dispose();
                    this.f38015a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f38013N = t;
            }
        }
    }

    public C13180d3(C5926g0<T> g0Var) {
        this.f38012a = g0Var;
    }

    /* renamed from: b */
    public void mo24653b(C12321v<? super T> vVar) {
        this.f38012a.mo23893a(new C13181a(vVar));
    }
}
